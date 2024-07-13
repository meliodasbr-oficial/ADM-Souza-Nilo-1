package com.admsouzanilo.ui.Materials;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.admsouzanilo.databinding.FragmentMaterialsBinding;

public class MaterialsFragment extends Fragment {

    private FragmentMaterialsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MaterialsViewModel materialsViewModel =
                new ViewModelProvider(this).get(MaterialsViewModel.class);

        binding = FragmentMaterialsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMaterials;
        materialsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}