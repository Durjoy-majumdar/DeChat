package p284zb;

import com.tencent.p014mm.libmmwebrtc.MMWebRTCBinding;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zb.i$$j */
public class i$$j implements C83174m.C83175a {

    /* renamed from: d */
    public final /* synthetic */ C91640i f262612d;

    public i$$j(C91640i iVar) {
        this.f262612d = iVar;
    }

    public void onDestroy() {
        Log.m105924i("Luggage.BaseAppBrandServiceLogic", "hy: bindings triggered destroy");
        MMWebRTCBinding mMWebRTCBinding = this.f262612d.f262601g;
        if (mMWebRTCBinding != null) {
            mMWebRTCBinding.destroy();
        }
        this.f262612d.f262600f.f262485b.mo112428b();
        this.f262612d.f262600f.f262484a.notifyDestroy();
    }
}
