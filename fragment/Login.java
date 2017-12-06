package app.com.triptree.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.com.triptree.R;
import app.com.triptree.widgets.CustomButton;
import app.com.triptree.widgets.CustomEdittext;
import app.com.triptree.widgets.CustomTextView;

/**
 * Created by sky on 5/12/17.
 */

public class Login extends Fragment implements View.OnClickListener {
    private View mRootView;
    private CustomTextView txt_SignUp, txt_Forgot_Password;
    private CustomButton btn_Submit;
    private CustomEdittext et_Email, et_Password;
    private CustomTextView txt_Email, txt_Password, txt_Login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.loginfragment, container, false);
        initialize();

        return mRootView;
    }

    private void initialize() {
        String textSignUp = "<font color=#8D8D8D>Don't have an account?</font> <font color=#0AC578>Sign up now</font>";
        txt_SignUp = mRootView.findViewById(R.id.txt_signup);
        txt_Forgot_Password = mRootView.findViewById(R.id.txt_forgot_pass);
        btn_Submit = mRootView.findViewById(R.id.btn_submit_login);
        et_Email = mRootView.findViewById(R.id.et_email_login);
        et_Password = mRootView.findViewById(R.id.et_password_login);
        //et_Password.setHint(Html.fromHtml("\u25CF\u25CF\u25CF\u25CF\u25CF\u25CF"));
        txt_Email = mRootView.findViewById(R.id.txt_email_login);
        txt_Password = mRootView.findViewById(R.id.txt_login_password);
        txt_Login = mRootView.findViewById(R.id.txt_login_header);

        txt_Email.setTypeface(txt_Email.getTypeface(), Typeface.BOLD);
        txt_Password.setTypeface(txt_Email.getTypeface(), Typeface.BOLD);
        txt_Login.setTypeface(txt_Email.getTypeface(), Typeface.BOLD);
        txt_SignUp.setText(Html.fromHtml(textSignUp));
        txt_Forgot_Password.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txt_forgot_pass: {
                FragmentTransaction ft = getFragmentManager().beginTransaction();

                ft.replace(R.id.login_fragment, new ForgotPassword());
                ft.addToBackStack(null);
                ft.commit();
            }
            default:
                break;
        }
    }
}
