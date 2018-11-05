package com.example.leduyenminh.mh_dshs;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<hocsinh> mData;
    Dialog myDialog;
    public RecyclerViewAdapter(Context mContext, List<hocsinh> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        myDialog=new Dialog(mContext);
        myDialog.setContentView(R.layout.thongtinhs_fragment);
        //myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.R.color.transparent));

        view=LayoutInflater.from(mContext).inflate(R.layout.item_dshs,viewGroup,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);




        viewHolder.iv_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img_hs1=(ImageView)myDialog.findViewById(R.id.img_hs1);
                TextView txt_hoten1=(TextView)myDialog.findViewById(R.id.txt_tenhs1);
                Button btn_lop=(Button)myDialog.findViewById(R.id.btn_lop);
                Button btn_ngaysinh=(Button)myDialog.findViewById(R.id.btn_ngaysinh);
                Button btn_gioitinh=(Button)myDialog.findViewById(R.id.btn_gioitinh);
                Button btn_diachi=(Button)myDialog.findViewById(R.id.btn_diachi);
                Button btn_email=(Button)myDialog.findViewById(R.id.btn_email);
                Button btn_xembangdiem=(Button)myDialog.findViewById(R.id.btn_xembangdiem);

                img_hs1.setImageResource(mData.get(viewHolder.getAdapterPosition()).getAvatar());
                txt_hoten1.setText(mData.get(viewHolder.getAdapterPosition()).getHoten());
                btn_lop.setText(mData.get(viewHolder.getAdapterPosition()).getLop());
                btn_gioitinh.setText(mData.get(viewHolder.getAdapterPosition()).getGioitinh());
                btn_diachi.setText(mData.get(viewHolder.getAdapterPosition()).getDiachi());
                btn_email.setText(mData.get(viewHolder.getAdapterPosition()).getEmail());
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_mshs.setText(mData.get(i).getMshs());
        myViewHolder.tv_hoten.setText(mData.get(i).getHoten());
        myViewHolder.tv_ngaysinh.setText(mData.get(i).getNgaysinh());
        myViewHolder.tv_gioitinh.setText(mData.get(i).getGioitinh());
        myViewHolder.tv_diachi.setText(mData.get(i).getDiachi());
        myViewHolder.iv_gioitinh.setImageResource(mData.get(i).getIc_gioitinh());
        myViewHolder.iv_avatar.setImageResource(mData.get(i).getAvatar());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_mshs;
        private TextView tv_hoten;
        private TextView tv_gioitinh;
        private TextView tv_diachi;
        private TextView tv_ngaysinh;


        private ImageView iv_avatar;
        private ImageView iv_gioitinh;
        private ImageView iv_diachi;
        private ImageView iv_ngaysinh;
        private RelativeLayout item_dshs;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            item_dshs=(RelativeLayout)itemView.findViewById(R.id.item_dshs);
            tv_mshs=(TextView)itemView.findViewById(R.id.txt_mshs);
            tv_hoten=(TextView)itemView.findViewById(R.id.txt_tenhs);
            tv_diachi=(TextView)itemView.findViewById(R.id.txt_diachi);
            tv_gioitinh=(TextView)itemView.findViewById(R.id.txt_gioitinh);
            tv_ngaysinh=(TextView)itemView.findViewById(R.id.txt_ngaysinh);
            iv_avatar=(ImageView)itemView.findViewById(R.id.img_hs);
            iv_gioitinh=(ImageView)itemView.findViewById(R.id.img_gioitinh);
            iv_diachi=(ImageView)itemView.findViewById(R.id.img_diachi);
            iv_ngaysinh=(ImageView)itemView.findViewById(R.id.img_ngaysinh);

        }
    }
}
