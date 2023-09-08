package p545h9;

import android.content.SharedPreferences;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

/* renamed from: h9.a */
public class C32739a {

    /* renamed from: b */
    public static C32739a f89115b;

    /* renamed from: a */
    public final FirebaseInstanceId f89116a;

    static {
        Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    public C32739a(FirebaseInstanceId firebaseInstanceId) {
        this.f89116a = firebaseInstanceId;
    }

    /* renamed from: a */
    public void mo58787a(boolean z) {
        FirebaseInstanceId firebaseInstanceId = this.f89116a;
        synchronized (firebaseInstanceId) {
            FirebaseApp firebaseApp = firebaseInstanceId.f339218a;
            firebaseApp.mo169379d();
            SharedPreferences.Editor edit = firebaseApp.f339194a.getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (!firebaseInstanceId.f339223f && z) {
                firebaseInstanceId.mo169416h();
            }
            firebaseInstanceId.f339223f = z;
        }
    }
}
