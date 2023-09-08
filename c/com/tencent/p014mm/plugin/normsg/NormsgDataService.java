package com.tencent.p014mm.plugin.normsg;

import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.util.HotpotService;
import tc2.C118418g;

/* renamed from: com.tencent.mm.plugin.normsg.NormsgDataService */
public final class NormsgDataService extends HotpotService {

    /* renamed from: f */
    public static final /* synthetic */ int f248476f = 0;

    /* renamed from: b */
    public void mo118517b(int i, Bundle bundle, Bundle bundle2) {
        String str;
        C118418g gVar = C118418g.INSTANCE;
        boolean z = false;
        if (i == 1) {
            String string = bundle.getString("package_name");
            try {
                PackageManager packageManager = getApplicationContext().getPackageManager();
                str = packageManager.getApplicationInfo(string, 0).loadLabel(packageManager).toString();
            } catch (Throwable unused) {
                str = "";
            }
            bundle2.putString("result", str);
            return;
        }
        int i2 = 2;
        if (i == 2) {
            try {
                z = gVar.mo175809ZX();
            } catch (Throwable unused2) {
            }
            bundle2.putBoolean("result", z);
        } else if (i == 3) {
            try {
                i2 = gVar.mo175832rM();
            } catch (Throwable unused3) {
            }
            bundle2.putInt("result", i2);
        } else {
            Log.m105929w("MicroMsg.NormsgDS", "unknown op: %s", Integer.valueOf(i));
        }
    }

    public void onCreate() {
        super.onCreate();
    }
}
