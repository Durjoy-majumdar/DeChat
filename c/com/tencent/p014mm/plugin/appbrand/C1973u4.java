package com.tencent.p014mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.soter.core.biometric.FaceManager;

/* renamed from: com.tencent.mm.plugin.appbrand.u4 */
public final class C1973u4 extends C2054w4 {
    /* renamed from: D */
    public boolean mo1872D(Intent intent, boolean z) {
        boolean D = super.mo1872D(intent, z);
        boolean z2 = mo1873O(intent) == -1;
        if (z2) {
            Log.m105924i("MiroMsg.WxaManufacturerShortcutEntry", "invalid scene ");
        }
        return !z2 && D;
    }

    /* renamed from: O */
    public int mo1873O(Intent intent) {
        int intExtra = intent.getIntExtra("SCENE", -1);
        if (intExtra == 2) {
            return FaceManager.FACE_ACQUIRED_RIGHT;
        }
        if (intExtra == 1) {
            return FaceManager.FACE_ACQUIRED_LEFT;
        }
        return -1;
    }

    /* renamed from: S */
    public void mo1874S(Context context, Intent intent, boolean z) {
    }
}
