package com.tencent.p014mm.matrix;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;

/* renamed from: com.tencent.mm.matrix.c$$c */
public class c$$c implements Runnable {
    public c$$c(C80981c cVar) {
    }

    public void run() {
        try {
            Log.m105924i("MatrixDelegate", "Save AccInfo To MMKV");
            int i = 0;
            StringBuilder sb = new StringBuilder("");
            for (AccessibilityServiceInfo id : ((AccessibilityManager) MMApplicationContext.getContext().getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1)) {
                String id4 = id.getId();
                if (!sb.toString().contains(id4)) {
                    sb.append(id4);
                    sb.append(";");
                    i++;
                    continue;
                }
                if (i > 3) {
                    break;
                }
            }
            MultiProcessMMKV.getDefault().encode("Matrix-AccInfo", sb.toString());
        } catch (Throwable th) {
            Log.m105920e("MatrixDelegate", "get accessibilityInfo error : " + th.getMessage());
        }
    }
}
