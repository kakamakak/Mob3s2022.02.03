package ru.shanin.mob3s20220203.presentation.main;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import ru.shanin.mob3s20220203.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView tv_first_name;
    TextView tv_second_name;
    TextView tv_email;
    TextView tv_photo;
    TextView tv_age;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_first_name = itemView.findViewById(R.id.tv_fname);
        tv_second_name = itemView.findViewById(R.id.tv_sname);
        tv_email = itemView.findViewById(R.id.tv_email);
        tv_photo = itemView.findViewById(R.id.tv_phone);
        tv_age = itemView.findViewById(R.id.tv_age);
    }
}
