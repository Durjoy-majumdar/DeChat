package com.tencent.p014mm.plugin.finder.p056ui;

import cm1.C0742j2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderFeedUiActionEvent;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import it1.C9247b;
import nj3.C76912y0;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.i2 */
public final class C3839i2 implements C0742j2.C0743a {

    /* renamed from: a */
    public final /* synthetic */ C3866n2 f17376a;

    /* renamed from: b */
    public final /* synthetic */ String f17377b;

    /* renamed from: com.tencent.mm.plugin.finder.ui.i2$a */
    public static final class C3840a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C3840a f17378d = new C3840a();

        public C3840a() {
            super(0);
        }

        public Object invoke() {
            C5139t.m5183e(5, 18);
            return C13598b0.f38549a;
        }
    }

    public C3839i2(C3866n2 n2Var, String str) {
        this.f17376a = n2Var;
        this.f17377b = str;
    }

    /* renamed from: a */
    public void mo704a(String str, int i, int i2, String str2) {
        C87412m.m108594g(str, "coverUrl");
        C9247b bVar = this.f17376a.f17411b;
        if (bVar != null) {
            bVar.mo8913b();
        }
        C3866n2 n2Var = this.f17376a;
        String str3 = this.f17377b;
        if (str3 == null) {
            str3 = "";
        }
        n2Var.getClass();
        FinderFeedUiActionEvent finderFeedUiActionEvent = new FinderFeedUiActionEvent();
        FinderFeedUiActionEvent.C1047a aVar = finderFeedUiActionEvent.f9202d;
        aVar.f9205c = 50000;
        aVar.f9211i = str3;
        aVar.f9210h = i;
        finderFeedUiActionEvent.publish();
        if (i2 != 0) {
            if (i2 != -5000 || Util.isNullOrNil(str2)) {
                str2 = this.f17376a.mo4203b(C0966R.string.et8);
            } else {
                C87412m.m108591d(str2);
            }
            C76912y0.m92767f(this.f17376a.f17410a, str2);
            return;
        }
        C61926c.m72668M(C3840a.f17378d);
        C3866n2 n2Var2 = this.f17376a;
        C76912y0.m92768g(n2Var2.f17410a, n2Var2.mo4203b(C0966R.string.eci));
    }
}
