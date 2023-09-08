package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.graphics.RectF;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.model.C105227i;
import com.tencent.p014mm.plugin.facedetect.model.C115423k;
import com.tencent.p014mm.plugin.facedetect.p045ui.FaceDetectUI;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectDecorView;
import com.tencent.p014mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.facedetect.ui.a */
public class C115433a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceDetectUI f346015d;

    public C115433a(FaceDetectUI faceDetectUI) {
        this.f346015d = faceDetectUI;
    }

    public void run() {
        Log.m105924i("MicroMsg.FaceDetectUI", "alvinluo dismiss cover and start capture");
        FaceDetectUI.C115432e eVar = this.f346015d.f345995h;
        synchronized (eVar) {
            eVar.f346013a = true;
        }
        FaceDetectUI.C115432e eVar2 = this.f346015d.f345995h;
        synchronized (eVar2) {
            Log.m105925i("MicroMsg.FaceDetectUI", "toString: %s", eVar2.toString());
            if (eVar2.f346013a) {
                FaceDetectUI.this.f346000p.setVisibility(0);
            }
        }
        FaceDetectUI faceDetectUI = this.f346015d;
        if (C115423k.f345973d == null) {
            faceDetectUI.getClass();
            C115423k.f345973d = new C115423k();
        }
        C115423k kVar = C115423k.f345973d;
        faceDetectUI.f345994g = kVar;
        kVar.f345974a = 0;
        int[] iArr = null;
        kVar.f345975b = null;
        kVar.f345976c = -1;
        FaceProNative faceProNative = C105227i.INSTANCE.f312612d.f345985i.f345972a;
        if (faceProNative == null) {
            Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: get all motion not init");
        } else {
            iArr = faceProNative.engineGetAllMotions();
        }
        kVar.f345975b = iArr;
        kVar.f345976c = iArr == null ? 0 : iArr.length;
        faceDetectUI.f345997j = true;
        FaceDetectView faceDetectView = faceDetectUI.f346001q;
        RectF rectF = new RectF((float) faceDetectUI.f346002r.getLeft(), (float) faceDetectUI.f346002r.getTop(), (float) faceDetectUI.f346002r.getRight(), (float) faceDetectUI.f346002r.getBottom());
        FaceDetectDecorView faceDetectDecorView = faceDetectView.f346023e;
        faceDetectDecorView.getClass();
        Object[] objArr = new Object[2];
        objArr[0] = rectF.toString();
        RectF rectF2 = faceDetectDecorView.f197973g;
        objArr[1] = rectF2 == null ? "null" : rectF2.toString();
        Log.m105925i("MicroMsg.FaceDetectDecorView", "hy: trigger showCover cover: %s, old: %s", objArr);
        faceDetectDecorView.f197971e = true;
        RectF rectF3 = faceDetectDecorView.f197973g;
        if (rectF3 == null || !rectF3.equals(rectF)) {
            faceDetectDecorView.f197973g = rectF;
            Log.m105925i("MicroMsg.FaceDetectDecorView", "alvinluo invalidate %s", rectF.toString());
            faceDetectDecorView.invalidate();
        }
        faceDetectUI.mo175318K7();
    }
}
