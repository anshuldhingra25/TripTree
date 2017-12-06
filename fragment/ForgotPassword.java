package app.com.triptree.fragment;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;

import app.com.triptree.R;
import app.com.triptree.widgets.CustomButton;
import app.com.triptree.widgets.CustomEdittext;
import app.com.triptree.widgets.CustomTextView;


public class ForgotPassword extends Fragment implements View.OnClickListener {
    private View mRootView;
    private CustomButton btn_Submit_Forgot_Password;
    private CustomEdittext et_Email_Forgot;
    private CustomTextView txt_forgot_top, txt_f_password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.forgotpassword, container, false);
        initialize();

        return mRootView;
    }

    private void initialize() {


        btn_Submit_Forgot_Password = mRootView.findViewById(R.id.btn_submit_forgot);

        et_Email_Forgot = mRootView.findViewById(R.id.et_email_forgotpass);
        txt_forgot_top = mRootView.findViewById(R.id.txt_forgot_top);
        txt_f_password = mRootView.findViewById(R.id.f_password);

        txt_forgot_top.setTypeface(txt_forgot_top.getTypeface(), Typeface.BOLD);
        txt_f_password.setTypeface(txt_f_password.getTypeface(), Typeface.BOLD);
        btn_Submit_Forgot_Password.setOnClickListener(this);

    }

    public void showDialog() {
        final Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.forgotdialog);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        RelativeLayout cancel =  dialog.findViewById(R.id.layoutcancel_dialog);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.cancel();
            }
        });


//

        dialog.show();


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_submit_forgot: {
                showDialog();
            }
            default:
                break;
        }
    }
}

