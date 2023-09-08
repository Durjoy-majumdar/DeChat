package com.tencent.p014mm.media.camera.lifecycle;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import v70.C111408u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/media/camera/lifecycle/CameraLifecycleProxy;", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/p;", "Lv70/u;", "cameraKitLifecycle", "<init>", "(Lv70/u;)V", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.lifecycle.CameraLifecycleProxy */
public final class CameraLifecycleProxy implements C0125s, C103764p {

    /* renamed from: d */
    public C111408u f310698d;

    /* renamed from: e */
    public final C103766u f310699e = new C103766u(this);

    /* renamed from: com.tencent.mm.media.camera.lifecycle.CameraLifecycleProxy$a */
    public /* synthetic */ class C55263a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f157383a;

        static {
            int[] iArr = new int[C39623j.C39625b.values().length];
            iArr[C39623j.C39625b.ON_DESTROY.ordinal()] = 1;
            iArr[C39623j.C39625b.ON_PAUSE.ordinal()] = 2;
            iArr[C39623j.C39625b.ON_RESUME.ordinal()] = 3;
            f157383a = iArr;
        }
    }

    public CameraLifecycleProxy(C111408u uVar) {
        C87412m.m108594g(uVar, "cameraKitLifecycle");
        this.f310698d = uVar;
    }

    public C39623j getLifecycle() {
        return this.f310699e;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        Log.m105924i("MicroMsg.Camera.CameraLifecycleProxy", "onStateChanged:" + bVar);
        this.f310699e.mo145135c(bVar);
        int i = C55263a.f157383a[bVar.ordinal()];
        if (i == 1) {
            this.f310698d.onDestroy();
        } else if (i == 2) {
            this.f310698d.onPause();
        } else if (i == 3) {
            this.f310698d.onResume();
        }
    }
}
