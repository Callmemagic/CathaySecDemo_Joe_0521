package com.joe.cathaysecdemo_joe_0521.ui.quotation;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joe.cathaysecdemo_joe_0521.R;
import com.joe.cathaysecdemo_joe_0521.bean.BondItem;
import com.joe.cathaysecdemo_joe_0521.databinding.FragmentBondQuotationBinding;

import java.util.ArrayList;

public class BondQuotationFragment extends Fragment {
    FragmentBondQuotationBinding fragmentBondQuotationBinding;
    Context context;
    ArrayList<BondItem> alBondItem;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        alBondItem = new ArrayList<>();
        alBondItem.add(new BondItem("埃克森美孚","2.995%", "2039年", "101.94", "2.31", "8.85"));
        alBondItem.add(new BondItem("安海斯布希英博","4.75%", "2029年", "101.94", "2.31", "8.85"));
        alBondItem.add(new BondItem("埃克森美孚","2.995%", "2039年", "101.94", "2.31", "8.85"));
        alBondItem.add(new BondItem("埃克森美孚","2.995%", "2039年", "101.94", "2.31", "8.85"));
        alBondItem.add(new BondItem("埃克森美孚","2.995%", "2039年", "101.94", "2.31", "8.85"));
        alBondItem.add(new BondItem("埃克森美孚","2.995%", "2039年", "101.94", "2.31", "8.85"));
        alBondItem.add(new BondItem("埃克森美孚","2.995%", "2039年", "101.94", "2.31", "8.85"));

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentBondQuotationBinding = FragmentBondQuotationBinding.inflate(getLayoutInflater(), container, false);
        fragmentBondQuotationBinding.recyclerViewQuotation.setHasFixedSize(true);
        fragmentBondQuotationBinding.recyclerViewQuotation.setLayoutManager(new LinearLayoutManager(context));

        BondAdapter bondAdapter = new BondAdapter(context, alBondItem);
        fragmentBondQuotationBinding.recyclerViewQuotation.setAdapter(bondAdapter);

        return fragmentBondQuotationBinding.getRoot();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
}
