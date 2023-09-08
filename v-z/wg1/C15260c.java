package wg1;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.os.Bundle;
import cj1.C0639y1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import ig1.C8916d;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import ok1.C62042e;
import p823sg.C90193h;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import z04.C119027c;

/* renamed from: wg1.c */
public final class C15260c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15300h f41502d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15260c(C15300h hVar) {
        super(0);
        this.f41502d = hVar;
    }

    public Object invoke() {
        byte[] bArr;
        if (C62042e.f176370a.mo87027N0()) {
            C58124b.C7172a.m7372a(this.f41502d.f41599g, C58124b.C58125b.FINDER_LIVE_ALLOWANCE_BUBBLE_OPEN_GUIDE, (Bundle) null, 2, (Object) null);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.GIFT_ALLOWANCE, String.valueOf(2), (String) null, 4, (Object) null);
        } else {
            C15256b bVar = this.f41502d.f41602j;
            if (bVar != null) {
                bVar.mo14158s0();
            }
            C53973z1 z1Var = this.f41502d.f41601i;
            boolean z = true;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C15300h hVar = this.f41502d;
            hVar.getClass();
            Class cls = C54991o.class;
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C54991o oVar = (C54991o) finderLiveService.mo77630e(cls);
            if (oVar != null && oVar.f154286Z) {
                C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls);
                if (oVar2 != null) {
                    oVar2.f154286Z = false;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
                hVar.f41599g.statusChange(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
            }
            if (C32444a.f86203u1.mo60266n().intValue() != 1) {
                z = false;
            }
            if (z) {
                C0639y1 y1Var = C0639y1.f1510a;
                C8916d d = y1Var.mo612d("MMFinderLiveGift100001");
                C58124b bVar2 = hVar.f41599g;
                C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_ALLOWANCE_BUBBLE_OPEN_SUCCESS;
                Bundle bundle2 = new Bundle();
                if (!y1Var.mo613e(d != null ? d.field_rewardProductId : null)) {
                    String str = d != null ? d.field_thumbnailFileUrl : null;
                    if (str == null) {
                        str = "";
                    }
                    bundle2.putString("PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL", str);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                bVar2.statusChange(bVar3, bundle2);
                StringBuilder sb = new StringBuilder();
                String s = C75592q0.m90789s();
                if (s != null) {
                    bArr = s.getBytes(C119027c.f356488a);
                    C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
                } else {
                    bArr = null;
                }
                sb.append(C90193h.m112878f(bArr));
                sb.append('_');
                sb.append(UUID.randomUUID());
                C53895h.m60466d(hVar.f41603n, (C66212f) null, (C53934p0) null, new C15263d(hVar, d, sb.toString(), (C15601d<? super C15263d>) null), 3, (Object) null);
            } else {
                C53895h.m60466d(hVar.f41600h, (C66212f) null, (C53934p0) null, new C15267e(hVar, (C15601d<? super C15267e>) null), 3, (Object) null);
            }
            C7335d c2 = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            ((C54116w) c2).iy0(C54067f0.C0072w.ICON_CLICK, "");
        }
        return C13598b0.f38549a;
    }
}
