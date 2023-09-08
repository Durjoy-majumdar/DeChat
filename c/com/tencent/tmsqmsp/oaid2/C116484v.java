package com.tencent.tmsqmsp.oaid2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.tencent.tmsqmsp.oaid2.v */
public class C116484v extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C116485w a;
        if (context != null && intent != null) {
            boolean z = false;
            int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
            C116486x.m164283b("shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra)));
            if (intExtra != 1) {
                if (intExtra == 2) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
                    if (stringArrayListExtra != null) {
                        boolean contains = stringArrayListExtra.contains(context.getPackageName());
                        if (contains) {
                            C116485w a2 = C116486x.m164281a().mo179953a(intent.getStringExtra("openIdType"));
                            if (a2 != null) {
                                a2.mo179952b();
                                return;
                            }
                            return;
                        }
                        z = contains;
                    } else {
                        return;
                    }
                } else {
                    z = true;
                }
                if (intExtra == 0 && z) {
                    C116485w a3 = C116486x.m164281a().mo179953a(intent.getStringExtra("openIdType"));
                    if (a3 != null) {
                        a3.mo179952b();
                        return;
                    }
                    return;
                }
            } else if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                z = true;
            }
            if (z && (a = C116486x.m164281a().mo179953a(intent.getStringExtra("openIdType"))) != null) {
                a.mo179952b();
            }
        }
    }
}
