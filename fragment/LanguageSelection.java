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

public class LanguageSelection extends Fragment implements View.OnClickListener {
    private View mRootView;
    private CustomButton btnEnglish, btnDenmark;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.language_select, container, false);
        initialize();

        return mRootView;
    }

    private void initialize() {
        btnEnglish = mRootView.findViewById(R.id.btn_English_select);
        btnDenmark = mRootView.findViewById(R.id.btn_Denmark_select);
        btnEnglish.setOnClickListener(this);
        btnDenmark.setOnClickListener(this);
        btnEnglish.setTypeface(btnEnglish.getTypeface(), Typeface.BOLD);
        btnDenmark.setTypeface(btnDenmark.getTypeface(), Typeface.BOLD);

    }


//


    @Override
    public void onClick(View view) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        switch (view.getId()) {
            case R.id.btn_English_select: {


                ft.replace(R.id.login_fragment, new LoginSignUp());

                break;
            }
            case R.id.btn_Denmark_select: {

                ft.replace(R.id.login_fragment, new LoginSignUp());
                break;
            }
            default:
                break;
        }
        ft.addToBackStack(null);
        ft.commit();
    }
}



