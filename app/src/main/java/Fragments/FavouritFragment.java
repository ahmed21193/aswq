package Fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.ClientMessagesAdapter;
import Adapter.FavouritAdapter;
import Model.RequestsModel;
import souk.arab.com.soukelarab.R;

public class FavouritFragment extends Fragment {
RecyclerView recycle_clientRequests;
View view;
    ArrayList<RequestsModel> faqModels;
    public FavouritFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_clients_request, container, false);
        recycle_clientRequests =(RecyclerView)view.findViewById(R.id.recycle_clientRequests);
        FavouritAdapter adapter = new FavouritAdapter(getActivity(),faqModels);
        recycle_clientRequests.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycle_clientRequests.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }

}
