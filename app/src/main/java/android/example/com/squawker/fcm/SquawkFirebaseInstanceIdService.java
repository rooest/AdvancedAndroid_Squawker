package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static String TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();


    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "onTokenRefresh: " + token);

    }

}
