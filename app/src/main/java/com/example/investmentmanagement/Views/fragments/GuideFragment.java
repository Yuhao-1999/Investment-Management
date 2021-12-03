package com.example.investmentmanagement.Views.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.investmentmanagement.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GuideFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GuideFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private TextView t1,t2,t3,t4;
    private Button button;

    public GuideFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GuideFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GuideFragment newInstance(String param1, String param2) {
        GuideFragment fragment = new GuideFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);




        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_guide, container, false);

        t3=view.findViewById(R.id.link);
        t4=view.findViewById(R.id.description);
        t4.setText("  Why should we invest?\n" +
                "        Investing creates money for future.It's important for new investors to understand the basic of various types of financial products,including stocks,bonds,certificates of deposit and mutual funds.\n" +
                "        1. Set Investment Goals\n" +
                "        2. Invest Early\n" +
                "        3. Make Investments Automatic\n" +
                "        4. Look at Your Finances\n" +
                "        5. Learn About Investing\n" +
                "        6. Set Up Retirement Accounts\n" +
                "        7. Be Wary of Commissions\n" +
                "        8. Diversify Your Investments\n" +
                "        9. Study Your Portfolio\n" +
                "        10. Keep Informed\n" +
                "\n" +
                "What Else Do You Want to Improve About Yourself?");
        button=view.findViewById(R.id.guideButton);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.youtube.com/watch?v=t0iZi5WnoE0");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl("https://www.youtube.com/watch?v=t0iZi5WnoE0");
            }
        });
        return view;
    }

    private void goToUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}