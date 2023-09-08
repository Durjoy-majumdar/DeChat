package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3603n1;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32226l;
import gy3.C45983e0;
import gy3.C87412m;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.e6 */
public final class C4051e6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C32226l<String, C13598b0> f18152d;

    /* renamed from: e */
    public final /* synthetic */ View f18153e;

    /* renamed from: f */
    public final /* synthetic */ String f18154f;

    /* renamed from: g */
    public final /* synthetic */ boolean f18155g;

    /* renamed from: h */
    public final /* synthetic */ boolean f18156h;

    /* renamed from: i */
    public final /* synthetic */ boolean f18157i;

    /* renamed from: j */
    public final /* synthetic */ String f18158j;

    /* renamed from: n */
    public final /* synthetic */ boolean f18159n;

    /* renamed from: o */
    public final /* synthetic */ C45983e0 f18160o;

    /* renamed from: p */
    public final /* synthetic */ long f18161p;

    /* renamed from: q */
    public final /* synthetic */ String f18162q;

    /* renamed from: r */
    public final /* synthetic */ String f18163r;

    /* renamed from: s */
    public final /* synthetic */ View f18164s;

    /* renamed from: t */
    public final /* synthetic */ TextView f18165t;

    public C4051e6(C32226l<? super String, C13598b0> lVar, View view, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, C45983e0 e0Var, long j, String str3, String str4, View view2, TextView textView) {
        this.f18152d = lVar;
        this.f18153e = view;
        this.f18154f = str;
        this.f18155g = z;
        this.f18156h = z2;
        this.f18157i = z3;
        this.f18158j = str2;
        this.f18159n = z4;
        this.f18160o = e0Var;
        this.f18161p = j;
        this.f18162q = str3;
        this.f18163r = str4;
        this.f18164s = view2;
        this.f18165t = textView;
    }

    public final void onClick(View view) {
        String str;
        Class cls = C3603n1.class;
        Class cls2 = C58417y0.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32226l<String, C13598b0> lVar = this.f18152d;
        if (lVar != null) {
            lVar.invoke(this.f18154f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C8794p5 p5Var = null;
        if (this.f18153e.getContext() instanceof C8794p5) {
            try {
                Context context = this.f18153e.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.IModifyUserResult<com.tencent.mm.protocal.protobuf.FinderModBlackList>");
                p5Var = (C8794p5) context;
            } catch (ClassCastException unused) {
            }
        }
        if (!Util.isNullOrNil(this.f18154f)) {
            long j = this.f18155g ? 14 : 8;
            String nullAsNil = Util.nullAsNil(this.f18154f);
            C87412m.m108593f(nullAsNil, "nullAsNil(fansId)");
            ((C3603n1) C86312j.m106911c(cls)).mo3969Xt(nullAsNil, true, p5Var);
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            Context context2 = this.f18153e.getContext();
            C87412m.m108593f(context2, "contentView.context");
            C58417y0.fy0((C58417y0) c, context2, j, 4, false, 0, 0, (String) null, 120, (Object) null);
        } else if (this.f18156h || this.f18157i) {
            str = "(Landroid/view/View;)V";
            String str2 = this.f18158j;
            C87412m.m108593f(str2, "username");
            ((C3603n1) C86312j.m106911c(cls)).mo3972yZ(str2, true, p5Var);
            C7335d c2 = C86312j.m106911c(cls2);
            C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
            Context context3 = this.f18153e.getContext();
            C87412m.m108593f(context3, "contentView.context");
            C58417y0.fy0((C58417y0) c2, context3, 14, 4, false, 0, 0, (String) null, 120, (Object) null);
            this.f18165t.setVisibility(4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$4", "android/view/View$OnClickListener", "onClick", str);
        } else if (this.f18159n) {
            Context context4 = this.f18153e.getContext();
            C87412m.m108593f(context4, "contentView.context");
            long j2 = this.f18160o.f124000d;
            long j3 = this.f18161p;
            String str3 = this.f18162q;
            C87412m.m108593f(str3, "nonceId");
            String str4 = this.f18163r;
            C87412m.m108593f(str4, "sessionId");
            C77407n nVar = new C77407n(context4, 1, true);
            nVar.mo107568m(context4.getString(C0966R.string.d0b), 17, C76577a.m92151b(context4, 14));
            nVar.f225771i = new C4240z5(context4);
            nVar.f225782p = new C4015a6(true, str4, j2, j3, str3);
            nVar.mo107573q();
            View view2 = this.f18164s;
            if (view2 != null) {
                view2.callOnClick();
            }
        } else {
            Context context5 = this.f18153e.getContext();
            C87412m.m108593f(context5, "contentView.context");
            long j4 = this.f18160o.f124000d;
            Class cls3 = cls2;
            long j5 = this.f18161p;
            String str5 = this.f18162q;
            C87412m.m108593f(str5, "nonceId");
            C77407n nVar2 = new C77407n(context5, 1, true);
            str = "(Landroid/view/View;)V";
            nVar2.mo107568m(context5.getString(C0966R.string.d0b), 17, C76577a.m92151b(context5, 14));
            nVar2.f225771i = new C4240z5(context5);
            nVar2.f225782p = new C4015a6(false, "", j4, j5, str5);
            nVar2.mo107573q();
            View view3 = this.f18164s;
            if (view3 != null) {
                view3.callOnClick();
            }
            long j6 = this.f18155g ? 14 : 11;
            C7335d c3 = C86312j.m106911c(cls3);
            C87412m.m108593f(c3, "getService(FinderReportLogic::class.java)");
            Context context6 = this.f18153e.getContext();
            C87412m.m108593f(context6, "contentView.context");
            C58417y0.fy0((C58417y0) c3, context6, j6, 4, false, 0, 0, (String) null, 120, (Object) null);
            this.f18165t.setVisibility(4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$4", "android/view/View$OnClickListener", "onClick", str);
        }
        str = "(Landroid/view/View;)V";
        this.f18165t.setVisibility(4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$4", "android/view/View$OnClickListener", "onClick", str);
    }
}
