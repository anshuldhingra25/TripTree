package app.com.triptree.fragment;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.com.triptree.R;
import app.com.triptree.widgets.CustomButton;

/**
 * Created by sky on 6/12/17.
 */

public class LoginSignUp extends Fragment implements View.OnClickListener {
    private View mRootView;
    private CustomButton btnSignUp, btnLogIn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.loginsignup, container, false);
        initialize();

        return mRootView;
    }

    private void initialize() {
        btnSignUp = mRootView.findViewById(R.id.btn_signUp);
        btnLogIn = mRootView.findViewById(R.id.btn_logiIn);
        btnSignUp.setOnClickListener(this);
        btnLogIn.setOnClickListener(this);
        btnSignUp.setTypeface(btnSignUp.getTypeface(), Typeface.BOLD);
        btnLogIn.setTypeface(btnLogIn.getTypeface(), Typeface.BOLD);

    }


//


    @Override
    public void onClick(View view) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btn_signUp: {


                ft.replace(R.id.login_fragment, new SignUp());

                break;
            }
            case R.id.btn_logiIn: {

                ft.replace(R.id.login_fragment, new Login());
                break;
            }
            default:
                break;
        }
        ft.addToBackStack(null);
        ft.commit();
    }
}


