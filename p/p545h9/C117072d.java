package p545h9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import p1175c9.C113253a;

/* renamed from: h9.d */
public final class C117072d {
    /* renamed from: a */
    public static void m165097a(Context context, String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("from");
        if (stringExtra4 == null || !stringExtra4.startsWith("/topics/")) {
            stringExtra4 = null;
        }
        if (stringExtra4 != null) {
            bundle.putString("_nt", stringExtra4);
        }
        try {
            bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
        } catch (NumberFormatException unused) {
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException unused2) {
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(bundle).length());
        }
        C113253a aVar = (C113253a) FirebaseApp.m155197a().get(C113253a.class);
        if (aVar != null) {
            aVar.logEvent(AppMeasurement.FCM_ORIGIN, str, bundle);
        }
    }
}
