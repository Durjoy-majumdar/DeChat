package com.tencent.p014mm.matrix;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p156gj.C87203t;

/* renamed from: com.tencent.mm.matrix.i */
public class C28965i implements Runnable {
    public void run() {
        String str = Build.BRAND;
        boolean z = false;
        if ((!str.toLowerCase().contains("lenovo") || !C87203t.m108275k().toLowerCase().contains("tb")) && !str.toLowerCase().contains("royole")) {
            z = true;
        }
        Log.m105924i("MatrixDelegate", "cameraCacheDevice = " + z);
        if (!z) {
            MultiProcessMMKV.getDefault().encode("clicfg_camera_util_use_cache_new", z);
            MultiProcessMMKV.getDefault().encode("clicfg_voip_camera_info_use_cache_new", z);
        }
    }
}
