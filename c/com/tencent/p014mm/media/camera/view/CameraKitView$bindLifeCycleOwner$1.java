package com.tencent.p014mm.media.camera.view;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import f80.C107490e;
import f80.C107491f;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/media/camera/view/CameraKitView$bindLifeCycleOwner$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-camera_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.media.camera.view.CameraKitView$bindLifeCycleOwner$1 */
public final class CameraKitView$bindLifeCycleOwner$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ CameraKitView f310716d;

    /* renamed from: e */
    public final /* synthetic */ C0125s f310717e;

    public CameraKitView$bindLifeCycleOwner$1(CameraKitView cameraKitView, C0125s sVar) {
        this.f310716d = cameraKitView;
        this.f310717e = sVar;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        C107490e o = this.f310716d.getCameraKitModel();
        C107491f fVar = C107491f.Destroyed;
        o.getClass();
        o.f321600b = fVar;
        this.f310717e.getLifecycle().removeObserver(this);
    }
}
