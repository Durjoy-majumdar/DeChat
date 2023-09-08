package p516f9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.firebase.FirebaseApp;
import com.tencent.xweb.file.XVFSFile;
import java.util.List;

/* renamed from: f9.e */
public final class C116817e {

    /* renamed from: a */
    public final Context f350165a;

    /* renamed from: b */
    public String f350166b;

    /* renamed from: c */
    public String f350167c;

    /* renamed from: d */
    public int f350168d;

    /* renamed from: e */
    public int f350169e = 0;

    public C116817e(Context context) {
        this.f350165a = context;
    }

    /* renamed from: a */
    public static String m164804a(FirebaseApp firebaseApp) {
        firebaseApp.mo169379d();
        String str = firebaseApp.f339196c.f338575e;
        if (str != null) {
            return str;
        }
        firebaseApp.mo169379d();
        String str2 = firebaseApp.f339196c.f338572b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(XVFSFile.PATH_SEPARATOR);
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: b */
    public final synchronized void mo180810b() {
        PackageInfo c = mo180811c(this.f350165a.getPackageName());
        if (c != null) {
            this.f350166b = Integer.toString(c.versionCode);
            this.f350167c = c.versionName;
        }
    }

    /* renamed from: c */
    public final PackageInfo mo180811c(String str) {
        try {
            return this.f350165a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            new StringBuilder(String.valueOf(e).length() + 23);
            return null;
        }
    }

    /* renamed from: d */
    public final synchronized int mo180812d() {
        int i = this.f350169e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f350165a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f350169e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (PlatformVersion.isAtLeastO()) {
                this.f350169e = 2;
            } else {
                this.f350169e = 1;
            }
            return this.f350169e;
        }
        this.f350169e = 2;
        return 2;
    }

    /* renamed from: e */
    public final synchronized String mo180813e() {
        if (this.f350166b == null) {
            mo180810b();
        }
        return this.f350166b;
    }
}
