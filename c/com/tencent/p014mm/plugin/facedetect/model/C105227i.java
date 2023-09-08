package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.facedetect.C85185b;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.facedetect.model.i */
public enum C105227i {
    INSTANCE;
    

    /* renamed from: f */
    public static MMHandler f312610f;

    /* renamed from: d */
    public FaceDetectProcessService f312612d;

    /* access modifiers changed from: public */
    static {
        f312610f = new MMHandler("face_process");
    }

    /* renamed from: a */
    public int mo149594a() {
        FaceProNative faceProNative = this.f312612d.f345985i.f345972a;
        if (faceProNative != null) {
            return faceProNative.engineGetCurrMotion();
        }
        Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
        return -1;
    }

    /* renamed from: b */
    public boolean mo149595b(boolean z) {
        Log.m105925i("MicroMsg.FaceDetectManager", "alvinluo: face detect isCheckDynCfg: %b", Boolean.valueOf(z));
        boolean hasSystemFeature = MMApplicationContext.getContext().getPackageManager().hasSystemFeature("android.hardware.camera.front");
        boolean c = C85191v.m105064c(true);
        boolean vx02 = C85185b.vx0();
        boolean z2 = !C85875k4.m106210y() || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_face_flash_enable_pad, true);
        if (z) {
            boolean z3 = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BioSigFaceEntry"), 0) == 1;
            Log.m105925i("MicroMsg.FaceDetectManager", "hy: face config support: %b, hardware support: %b, isModelFileValid: %b, isPluginFaceEnabled: %b", Boolean.valueOf(z3), Boolean.valueOf(hasSystemFeature), Boolean.valueOf(c), Boolean.valueOf(vx02));
            return z3 && hasSystemFeature && c && vx02 && z2;
        }
        Log.m105925i("MicroMsg.FaceDetectManager", "hy: hardware support: %b, isModelFileValid: %b, isPluginFaceEnabled: %b", Boolean.valueOf(hasSystemFeature), Boolean.valueOf(c), Boolean.valueOf(vx02));
        return c && hasSystemFeature && vx02 && z2;
    }
}
