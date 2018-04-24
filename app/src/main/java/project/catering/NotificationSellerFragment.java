package project.catering;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hp on 4/16/2018.
 */

public class NotificationSellerFragment extends Fragment {
    public static NotificationSellerFragment newInstance() {
        NotificationSellerFragment fragment = new NotificationSellerFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_notification_seller, container, false);

        return rootView;
    }
}