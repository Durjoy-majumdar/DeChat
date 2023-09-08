package com.google.firebase.iid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.ArrayDeque;
import p516f9.C116833m;
import p516f9.C116835n;

public class FirebaseInstanceIdService extends zzb {
    /* renamed from: b */
    public final Intent mo169422b(Intent intent) {
        return (Intent) ((ArrayDeque) C116833m.m164816a().f350198c).poll();
    }

    /* renamed from: d */
    public final void mo169423d(Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            mo57003e();
            return;
        }
        String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                new StringBuilder(stringExtra.length() + 21 + String.valueOf(intent.getExtras()).length());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                FirebaseInstanceId.m155204a().mo169419m();
            } else if ("SYNC".equals(stringExtra)) {
                FirebaseInstanceId a = FirebaseInstanceId.m155204a();
                a.getClass();
                C116835n nVar = FirebaseInstanceId.f339216h;
                synchronized (nVar) {
                    String concat = "".concat("|T|");
                    SharedPreferences.Editor edit = nVar.f350202a.edit();
                    for (String next : nVar.f350202a.getAll().keySet()) {
                        if (next.startsWith(concat)) {
                            edit.remove(next);
                        }
                    }
                    edit.commit();
                }
                a.mo169411c();
            }
        }
    }

    /* renamed from: e */
    public void mo57003e() {
    }
}
