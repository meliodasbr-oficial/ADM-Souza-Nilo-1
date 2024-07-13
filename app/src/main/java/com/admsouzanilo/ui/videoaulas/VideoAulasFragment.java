package com.admsouzanilo.ui.videoaulas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.admsouzanilo.databinding.FragmentVideoaulasBinding;

public class VideoAulasFragment extends Fragment {

    private FragmentVideoaulasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VideoAulasViewModel slideshowViewModel =
                new ViewModelProvider(this).get(VideoAulasViewModel.class);

        binding = FragmentVideoaulasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textVideoaulas;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}