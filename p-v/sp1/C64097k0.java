package sp1;

import ak1.C54067f0;
import ak1.C54116w;
import android.graphics.Rect;
import android.view.View;
import com.tencent.xweb.util.WXWebReporter;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import np1.C61866i0;
import o40.C61926c;
import sk1.C63965x;
import zp3.C23555k;

/* renamed from: sp1.k0 */
public final class C64097k0 extends C23555k.C23562d {

    /* renamed from: a */
    public final /* synthetic */ C64075c0 f181738a;

    /* renamed from: b */
    public final /* synthetic */ Object f181739b;

    public C64097k0(C64075c0 c0Var, Object obj) {
        this.f181738a = c0Var;
        this.f181739b = obj;
    }

    /* renamed from: b */
    public void mo53b(View view, long j, long j2, boolean z) {
        C87412m.m108594g(view, "view");
        if (z) {
            Rect m = C61926c.m72688m(this.f181738a.f181665i);
            boolean z2 = m.width() > 0 && m.height() > 0;
            if (this.f181738a.f181661e.getLiveRole() == 0 && z2) {
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.Rx0((C54116w) c, C54067f0.C54081r0.CommerceActionBubbleTipShow, (String) null, String.valueOf(((C63965x) this.f181739b).f181347t), (String) null, (String) null, (String) null, 0, 0, C61866i0.f175909a.mo86794e(((C63965x) this.f181739b).f181346s), WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
            }
        }
    }
}
