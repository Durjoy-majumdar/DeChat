package p516f9;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.C113382a;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: f9.z */
public final class C116847z implements C116814c0 {

    /* renamed from: a */
    public final FirebaseApp f350234a;

    /* renamed from: b */
    public final FirebaseInstanceId f350235b;

    /* renamed from: c */
    public final C116817e f350236c;

    /* renamed from: d */
    public final C113382a f350237d;

    /* renamed from: e */
    public final ScheduledThreadPoolExecutor f350238e = new ScheduledThreadPoolExecutor(1);

    public C116847z(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C116817e eVar) {
        this.f350234a = firebaseApp;
        this.f350235b = firebaseInstanceId;
        this.f350236c = eVar;
        firebaseApp.mo169379d();
        this.f350237d = new C113382a(firebaseApp.f339194a, eVar);
    }

    /* renamed from: a */
    public final String mo180845a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                this.f350235b.mo169419m();
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                new StringBuilder(String.valueOf(bundle).length() + 21);
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: b */
    public final Bundle mo180846b(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        PackageInfo c;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("appid", FirebaseInstanceId.m155205i());
        FirebaseApp firebaseApp = this.f350234a;
        firebaseApp.mo169379d();
        bundle.putString("gmp_app_id", firebaseApp.f339196c.f338572b);
        C116817e eVar = this.f350236c;
        synchronized (eVar) {
            if (eVar.f350168d == 0 && (c = eVar.mo180811c("com.google.android.gms")) != null) {
                eVar.f350168d = c.versionCode;
            }
            i = eVar.f350168d;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f350236c.mo180813e());
        C116817e eVar2 = this.f350236c;
        synchronized (eVar2) {
            if (eVar2.f350167c == null) {
                eVar2.mo180810b();
            }
            str3 = eVar2.f350167c;
        }
        bundle.putString("app_ver_name", str3);
        bundle.putString("cliv", "fiid-12451000");
        return bundle;
    }
}
