package androidx.compose.p002ui.platform;

import android.view.View;
import gy3.C87412m;
import p1108f3.C107453d;
import p246u1.C111078m;
import p246u1.C111079n;
import p246u1.C111087s;
import p246u1.C111090t;
import p658q1.C110301j;
import p849e3.C107166a;

/* renamed from: androidx.compose.ui.platform.l */
public final class C103644l extends C107166a {

    /* renamed from: e */
    public final /* synthetic */ C110301j f306117e;

    /* renamed from: f */
    public final /* synthetic */ AndroidComposeView f306118f;

    /* renamed from: g */
    public final /* synthetic */ AndroidComposeView f306119g;

    public C103644l(C110301j jVar, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f306117e = jVar;
        this.f306118f = androidComposeView;
        this.f306119g = androidComposeView2;
    }

    public void onInitializeAccessibilityNodeInfo(View view, C107453d dVar) {
        C87412m.m108594g(view, "host");
        C87412m.m108594g(dVar, "info");
        super.onInitializeAccessibilityNodeInfo(view, dVar);
        C111078m d = C111090t.m151491d(this.f306117e);
        C87412m.m108591d(d);
        d.mo162827c();
        ((C111079n) d.f329962e).getId();
        C110301j a = C111090t.m151488a(d.f329961d.f329972h, C111087s.C111089b.f332644d);
        C111087s sVar = null;
        C111078m d2 = a != null ? C111090t.m151491d(a) : null;
        if (d2 != null) {
            sVar = new C111087s(d2, false);
        }
        C87412m.m108591d(sVar);
        int i = sVar.f332641f;
        if (i == this.f306118f.getSemanticsOwner().mo162843a().f332641f) {
            i = -1;
        }
        AndroidComposeView androidComposeView = this.f306119g;
        dVar.f321474b = i;
        dVar.f321473a.setParent(androidComposeView, i);
    }
}
