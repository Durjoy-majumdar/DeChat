package com.tencent.luggage.skyline;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import p176jc.C117320k;
import p176jc.C87929h;
import p176jc.C87933j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/luggage/skyline/SkylineView$mAttachedActivityLifecycleListener$1", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onStop", "luggage-skyline-ext_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class SkylineView$mAttachedActivityLifecycleListener$1 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ SkylineView f235023d;

    public SkylineView$mAttachedActivityLifecycleListener$1(SkylineView skylineView) {
        this.f235023d = skylineView;
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void onStop() {
        Log.m105924i("SkylineView", "id:" + this.f235023d.f235004d + ", attached activity onStop");
        SkylineView skylineView = this.f235023d;
        skylineView.f235012o = true;
        C87929h hVar = skylineView.f235007g;
        C117320k kVar = null;
        if (hVar == null) {
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        } else if (hVar.getMode() != C87933j.Legacy) {
            C87929h hVar2 = this.f235023d.f235007g;
            if (hVar2 != null) {
                hVar2.mo122399e(true);
                C87929h hVar3 = this.f235023d.f235007g;
                if (hVar3 != null) {
                    if (hVar3 instanceof C117320k) {
                        kVar = (C117320k) hVar3;
                    }
                    if (kVar != null) {
                        kVar.f351218c = true;
                        return;
                    }
                    return;
                }
                C87412m.m108603p("mFlutterViewWrapper");
                throw null;
            }
            C87412m.m108603p("mFlutterViewWrapper");
            throw null;
        }
    }
}
