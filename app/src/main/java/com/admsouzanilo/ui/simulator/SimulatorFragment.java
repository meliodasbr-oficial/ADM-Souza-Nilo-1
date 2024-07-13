package com.admsouzanilo.ui.simulator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.admsouzanilo.databinding.FragmentSimulatorBinding;

public class SimulatorFragment extends Fragment {

    private FragmentSimulatorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SimulatorViewModel simulatorViewModel =
                new ViewModelProvider(this).get(SimulatorViewModel.class);

        binding = FragmentSimulatorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSimulator;
        simulatorViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}