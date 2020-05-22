package com.joe.cathaysecdemo_joe_0521.ui.quotation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joe.cathaysecdemo_joe_0521.R;
import com.joe.cathaysecdemo_joe_0521.bean.BondItem;

import java.util.ArrayList;

/**
 * author: Joe Cheng
 */
public class BondAdapter extends RecyclerView.Adapter<BondAdapter.BondViewHolder>{
    Context context;
    ArrayList<BondItem> alBonds;
    public BondAdapter(Context context, ArrayList<BondItem> alBonds) {
        this.context = context;
        this.alBonds = alBonds;
    }

    @NonNull
    @Override
    public BondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BondViewHolder(LayoutInflater.from(context).inflate(R.layout.view_bond_item, null));
    }

    @Override
    public void onBindViewHolder(@NonNull BondViewHolder holder, int position) {
        BondItem bondItem = alBonds.get(position);
        if(bondItem != null)
        {
            holder.tvTitle.setText(bondItem.getBondName() + "  " + bondItem.getRatio() + "  " +bondItem.getYear());
            holder.tvSalePrice.setText(bondItem.getRefSalePrice());
            holder.tvRatio.setText(bondItem.getRatio());
            holder.tvDueYear.setText(bondItem.getDueYear());
        }
    }

    @Override
    public int getItemCount() {
        if(alBonds.size() > 0)
        {
            return alBonds.size();
        }
        return 0;
    }

    public class BondViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvSalePrice, tvRatio, tvDueYear;
        public BondViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.bond_name);
            tvSalePrice = itemView.findViewById(R.id.ref_sale_price);
            tvRatio = itemView.findViewById(R.id.tv_ref_ratio);
            tvDueYear = itemView.findViewById(R.id.tv_ref_due_year);
        }
    }
}
