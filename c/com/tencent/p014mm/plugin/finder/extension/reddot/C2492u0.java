package com.tencent.p014mm.plugin.finder.extension.reddot;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13598b0;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.u0 */
public abstract class C2492u0 implements C0120a0<C2479n0.C2480a> {

    /* renamed from: d */
    public final boolean f13011d;

    public C2492u0(boolean z) {
        this.f13011d = z;
    }

    /* renamed from: a */
    public abstract void mo2472a(C2479n0.C2480a aVar);

    public void onChanged(Object obj) {
        C13598b0 b0Var;
        C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
        String O5 = C66785b.f191882e.mo90662O5();
        Log.m105924i("Finder.RedDotObserver", "isFilterByUsername:" + this.f13011d + " finderUsername:" + O5 + " result :" + aVar + ' ');
        if (aVar != null) {
            if (!this.f13011d) {
                C55718s0 s0Var = aVar.f12910c;
                if (!C2482o.f12983a.contains(Integer.valueOf(s0Var != null ? s0Var.field_ctrInfo.f144670e : 0))) {
                    mo2472a(aVar);
                    b0Var = C13598b0.f38549a;
                }
            }
            if (C87412m.m108589b(aVar.f12911d, O5) || Util.isNullOrNil(aVar.f12911d)) {
                mo2472a(aVar);
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            mo2472a(aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2492u0(boolean z, int i, C8480h hVar) {
        this((i & 1) != 0 ? false : z);
    }
}
