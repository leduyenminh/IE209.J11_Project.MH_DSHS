package com.example.leduyenminh.mh_dshs;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class dshs_fragment extends Fragment {
    View view;
    private RecyclerView myrecyclerview;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lsthocsinh = new ArrayList<>();
        //lsthocsinh.add(new hocsinh("","","","","","","",0,0,0,0));
        lsthocsinh.add(new hocsinh("10001","Phạm Thành An","10a1","Nam","P.Linh Đông, Q.Thủ Đức, TPHCM", "12-03-1997","anpt@gmai.com",R.drawable.if_male3_403019,R.drawable.masculine,R.drawable.calendar,R.drawable.placeholder));
        lsthocsinh.add(new hocsinh("10002","Lại Văn Cử","10a2","Nam","P.Linh Trung, Q.Thủ Đức, TPHCM", "20-03-1997","laivancu@gmail.com",R.drawable.if_male3_403019,R.drawable.masculine,R.drawable.calendar,R.drawable.placeholder));
        lsthocsinh.add(new hocsinh("10003","Nguyễn Như Quỳnh","10a3","Nữ","P.Bình Chiểu, Q.Thủ Đức, TPHCM", "12-09-1997","quynhnn@gmai.com",R.drawable.if_female1_403023,R.drawable.femenine,R.drawable.calendar,R.drawable.placeholder));
        lsthocsinh.add(new hocsinh("10004","Phạm Thành An","10a4","Nam","P.Linh Đông, Q.Thủ Đức, TPHCM", "12-03-1997","phamta@gmai.com",R.drawable.if_male3_403019,R.drawable.masculine,R.drawable.calendar,R.drawable.placeholder));
        lsthocsinh.add(new hocsinh("10005","Lại Văn Cử","10a5","Nam","P.Linh Trung, Q.Thủ Đức, TPHCM", "20-03-1997","laivancu@gmail.com",R.drawable.if_male3_403019,R.drawable.masculine,R.drawable.calendar,R.drawable.placeholder));
        lsthocsinh.add(new hocsinh("10006","Nguyễn Như Quỳnh","10a6","Nữ","P.Bình Chiểu, Q.Thủ Đức, TPHCM", "12-09-1997","laivancu@gmail.com",R.drawable.if_female1_403023,R.drawable.femenine,R.drawable.calendar,R.drawable.placeholder));

    }

    private List<hocsinh> lsthocsinh;
    public dshs_fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //String[] NAMES={"a", "b", "c", "d"};



        view = inflater.inflate(R.layout.dshs_fragment, container, false);
        myrecyclerview = (RecyclerView)view.findViewById(R.id.dshs_recyclerview);
       RecyclerViewAdapter recyclerViewAdapter =  new RecyclerViewAdapter(getContext(),lsthocsinh);
       myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       myrecyclerview.setAdapter(recyclerViewAdapter);
        //ViewPager viewPager = (ViewPager) view.findViewById(R.id.container);
      // ArrayAdapter<String>  listViewAdapter = new ArrayAdapter<String>(
            //  getActivity(),android.R.layout.simple_list_item_1);

        return view;
    }


}
