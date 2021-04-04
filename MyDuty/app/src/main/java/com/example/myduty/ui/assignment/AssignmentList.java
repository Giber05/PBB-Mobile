package com.example.myduty.ui.assignment;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myduty.R;
import com.example.myduty.ui.assignment.dummy.DummyContent;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class AssignmentList extends Fragment {
    Assignment[] assignments = new Assignment[]{
            new Assignment("Matematika","Integral","02-April-2021",4,"Cepat bereskan"),
            new Assignment("IPA","Adaptasi","22-April-2021",5,"Yu bisa"),
            new Assignment("IPS","Sistem Kasta","22-April-2021",3,"Pengumpulan via Google Classroom"),
            new Assignment("B.Indonesia","Struktur Kalimat","22-April-2021",1,"Yu bisa"),
            new Assignment("PLH","Kebersihan lingkungan","22-April-2021",2,"Yu bisa"),
            new Assignment("PLH","Kebersihan Sekolah","23-April-2021",2,"Yu bisa"),
            new Assignment("Penjas","PencakSilat","25-April-2021",5,"Yu bisa"),
            new Assignment("B.Inggris","Tenses","25-April-2021",4,"Yu bisa"),
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_assignment_list_list, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        AssigmentAdapter adapter = new AssigmentAdapter(assignments);
        recyclerView.setAdapter(adapter);
        // Set the adapter
//        if (view instanceof RecyclerView) {
//            Context context = view.getContext();
//            RecyclerView recyclerView = (RecyclerView) view;
//            if (mColumnCount <= 1) {
//                recyclerView.setLayoutManager(new LinearLayoutManager(context));
//            } else {
//                recyclerView.setLayoutManager(new GridLayoutManager(context, ));
//            }
//            recyclerView.setAdapter(new AssigmentAdapter(DummyContent.ITEMS));
//        }
        return view;
    }
}