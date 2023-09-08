package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.l4 */
public final class C18311l4 extends C18206a {

    /* renamed from: c */
    public final Context f50663c;

    /* renamed from: d */
    public final C18366u2[] f50664d;

    /* renamed from: e */
    public final View f50665e;

    /* renamed from: f */
    public final C13601g f50666f = C36568h.m40985a(new C18312a(this));

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.l4$a */
    public static final class C18312a extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C18311l4 f50667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18312a(C18311l4 l4Var) {
            super(0);
            this.f50667d = l4Var;
        }

        public Object invoke() {
            View findViewById = this.f50667d.f50665e.findViewById(C0966R.C0970id.ifn);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.View");
            return findViewById;
        }
    }

    public C18311l4(Context context, C18508z2 z2Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
        this.f50663c = context;
        this.f50664d = new C18366u2[]{new C18401z2(z2Var, context), new C18291i3(z2Var, context), new C18371v2(z2Var, context), new C18225c3(z2Var, context)};
        View inflate = View.inflate(context, C0966R.C0971layout.f6631k8, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…ne_rec_feed_layout, null)");
        this.f50665e = inflate;
    }
}
