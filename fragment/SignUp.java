package app.com.triptree.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.com.triptree.R;
import app.com.triptree.widgets.CustomButton;
import app.com.triptree.widgets.CustomEdittext;
import app.com.triptree.widgets.CustomTextView;

/**
 * Created by sky on 6/12/17.
 */

public class SignUp extends Fragment implements View.OnClickListener {
    private View mRootView;
    private CustomTextView txt_email_name, txt_signup_header;
    private CustomButton btn_Submit;
    private CustomEdittext et_Email, et_First_Name, et_second_Name;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.signupfragment, container, false);
        initialize();

        return mRootView;
    }

    private void initialize() {
        txt_email_name = mRootView.findViewById(R.id.txt_name_email);
        txt_signup_header = mRootView.findViewById(R.id.txt_signup_header);
        btn_Submit = mRootView.findViewById(R.id.btn_submit_signup);
        et_Email = mRootView.findViewById(R.id.et_email_signup);
        et_First_Name = mRootView.findViewById(R.id.et_fname_signup);
        et_second_Name = mRootView.findViewById(R.id.et_sname_signup);
//        txt_email_name.setTypeface(txt_email_name.getTypeface(), Typeface.BOLD);
        txt_signup_header.setTypeface(txt_signup_header.getTypeface(), Typeface.BOLD);
        btn_Submit.setTypeface(btn_Submit.getTypeface(), Typeface.BOLD);
    }

    @Override
    public void onClick(View view) {

    }
}

