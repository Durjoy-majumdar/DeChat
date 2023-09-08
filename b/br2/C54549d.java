package br2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C49063cy0;
import te3.C52005xq0;

/* renamed from: br2.d */
public final class C54549d implements C32226l<C89132b.C89134c<C52005xq0>, C13598b0> {

    /* renamed from: d */
    public final WeakReference<AdLivingStreamContainer> f152916d;

    public C54549d(WeakReference<AdLivingStreamContainer> weakReference) {
        C87412m.m108594g(weakReference, "containerRef");
        this.f152916d = weakReference;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        C87412m.m108594g(cVar, "result");
        try {
            AdLivingStreamContainer adLivingStreamContainer = this.f152916d.get();
            if (adLivingStreamContainer == null) {
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
                return b0Var;
            }
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C49063cy0 cy02 = ((C52005xq0) cVar.f256796d).f144855j1;
                if ((((int) (cy02 != null ? cy02.f132020e : 0)) & 1) != 1) {
                    adLivingStreamContainer.setMNeedExitAdRoomReq(false);
                }
                adLivingStreamContainer.setMFinderJoinLiveResp((C52005xq0) cVar.f256796d);
            }
            String a = AdLivingStreamContainer.m66069a(adLivingStreamContainer);
            StringBuilder sb = new StringBuilder();
            sb.append("do joinLiveRequest callback, result errType is ");
            sb.append(cVar.f256793a);
            sb.append(", errCode is ");
            sb.append(cVar.f256794b);
            sb.append(", preview_joinlive_flag is ");
            C49063cy0 cy03 = ((C52005xq0) cVar.f256796d).f144855j1;
            sb.append(cy03 != null ? Long.valueOf(cy03.f132020e) : null);
            sb.append(", mNeedExitAdRoomReq is ");
            sb.append(adLivingStreamContainer.getMNeedExitAdRoomReq());
            Log.m105924i(a, sb.toString());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
            return b0Var2;
        } catch (Throwable unused) {
        }
    }
}
