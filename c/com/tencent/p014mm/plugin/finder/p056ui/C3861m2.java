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

/* renamed from: com.tencent.mm.plugin.finder.ui.m2 */
public final class C3861m2 implements C0742j2.C0743a {

    /* renamed from: a */
    public final /* synthetic */ C3866n2 f17405a;

    /* renamed from: com.tencent.mm.plugin.finder.ui.m2$a */
    public static final class C3862a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C3862a f17406d = new C3862a();

        public C3862a() {
            super(0);
        }

        public Object invoke() {
            C5139t.m5183e(5, 18);
            return C13598b0.f38549a;
        }
    }

    public C3861m2(C3866n2 n2Var) {
        this.f17405a = n2Var;
    }

    /* renamed from: a */
    public void mo704a(String str, int i, int i2, String str2) {
        C87412m.m108594g(str, "coverUrl");
        C9247b bVar = this.f17405a.f17411b;
        if (bVar != null) {
            bVar.mo8913b();
        }
        if (i2 != 0) {
            if (i2 != -5000 || Util.isNullOrNil(str2)) {
                str2 = this.f17405a.mo4203b(C0966R.string.et8);
            } else {
                C87412m.m108591d(str2);
            }
            C76912y0.m92767f(this.f17405a.f17410a, str2);
        } else {
            C61926c.m72668M(C3862a.f17406d);
        }
        this.f17405a.getClass();
        FinderFeedUiActionEvent finderFeedUiActionEvent = new FinderFeedUiActionEvent();
        FinderFeedUiActionEvent.C1047a aVar = finderFeedUiActionEvent.f9202d;
        aVar.f9205c = 50001;
        aVar.f9211i = "";
        aVar.f9210h = 0;
        finderFeedUiActionEvent.publish();
    }
}
