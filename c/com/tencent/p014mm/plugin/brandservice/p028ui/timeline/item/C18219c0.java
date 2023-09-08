package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import by0.C16825a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C30766q;
import com.tencent.p014mm.storage.C30775s;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rb0.C48009v0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c0 */
public final class C18219c0 extends C18366u2 {

    /* renamed from: d */
    public final Context f50361d;

    /* renamed from: e */
    public final C18508z2 f50362e;

    /* renamed from: f */
    public final C13601g f50363f = C36568h.m40985a(new C18223d(this));

    /* renamed from: g */
    public final C13601g f50364g = C36568h.m40985a(new C18220a(this));

    /* renamed from: h */
    public final C13601g f50365h = C36568h.m40985a(new C18222c(this));

    /* renamed from: i */
    public final C13601g f50366i = C36568h.m40985a(new C18221b(this));

    /* renamed from: j */
    public boolean f50367j;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c0$a */
    public static final class C18220a extends C87413o implements C32224a<BizTLRecCardCanvasView> {

        /* renamed from: d */
        public final /* synthetic */ C18219c0 f50368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18220a(C18219c0 c0Var) {
            super(0);
            this.f50368d = c0Var;
        }

        public Object invoke() {
            return (BizTLRecCardCanvasView) this.f50368d.mo22836i().findViewById(C0966R.C0970id.ieu);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c0$b */
    public static final class C18221b extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C18219c0 f50369d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18221b(C18219c0 c0Var) {
            super(0);
            this.f50369d = c0Var;
        }

        public Object invoke() {
            View findViewById = this.f50369d.mo22836i().findViewById(C0966R.C0970id.ae6);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c0$c */
    public static final class C18222c extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C18219c0 f50370d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18222c(C18219c0 c0Var) {
            super(0);
            this.f50370d = c0Var;
        }

        public Object invoke() {
            View findViewById = this.f50370d.mo22836i().findViewById(C0966R.C0970id.adt);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
            return (LinearLayout) findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.c0$d */
    public static final class C18223d extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C18219c0 f50371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18223d(C18219c0 c0Var) {
            super(0);
            this.f50371d = c0Var;
        }

        public Object invoke() {
            View inflate = View.inflate(this.f50371d.f50361d, C0966R.C0971layout.f6609jm, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            return (ViewGroup) inflate;
        }
    }

    public C18219c0(Context context, C18508z2 z2Var) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z2Var, "adapter");
        this.f50361d = context;
        this.f50362e = z2Var;
    }

    /* renamed from: a */
    public void mo22815a(C19623o0 o0Var, int i, View view, View view2) {
        C87412m.m108594g(o0Var, "info");
        C87412m.m108594g(view, "convertView");
        C87412m.m108594g(view2, "parent");
        C19627t tVar = C19627t.f55586a;
        String y2 = o0Var.mo25775y2();
        C87412m.m108593f(y2, "info.traceId");
        String a = tVar.mo25827a(y2);
        Log.m105924i("MicroMsg.BizTLRecCanvas", "filling#" + a + " aId = " + o0Var.mo25764n2() + " msgId=" + o0Var.field_msgId + " pathType = " + o0Var.mo25770t2());
        mo22835h().setBizTimeLineInfo(o0Var);
        BizTLRecCardCanvasView h = mo22835h();
        long j = o0Var.field_msgId;
        String t2 = o0Var.mo25770t2();
        String t25 = t2 == null || C112551y.m153811k(t2) ? "ad" : o0Var.mo25770t2();
        C87412m.m108593f(t25, "if(info.pathType.isNullO…) \"ad\" else info.pathType");
        String o2 = o0Var.mo25765o2();
        C87412m.m108593f(o2, "info.adData");
        h.mo118070b(j, a, t25, o2);
        this.f50362e.mo23152j(i, o0Var, (LinearLayout) ((C36570n) this.f50365h).getValue(), (LinearLayout) ((C36570n) this.f50366i).getValue());
        if (!(o0Var.mo25767q2() == C48009v0.Jx0().mo25791TO() || (o0Var.field_status == 4 && o0Var.field_hasShow == 1))) {
            o0Var.field_status = 4;
            o0Var.field_hasShow = 1;
            ((C119157j) C119157j.f356862d).mo183875f(new C18233d0(o0Var));
        }
        C16825a.f45444a.mo17868f(o0Var, this);
        if (!C19627t.f55604s && !this.f50367j) {
            this.f50367j = true;
            C30766q vx02 = C48009v0.vx0();
            vx02.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C30775s(o0Var, vx02));
        }
    }

    /* renamed from: c */
    public Object mo22832c(C15601d<? super View> dVar) {
        return mo22835h();
    }

    /* renamed from: e */
    public boolean mo22833e() {
        return mo22835h().mo118071c();
    }

    /* renamed from: f */
    public void mo22834f(int i) {
        mo22835h().setVideoStatus(i);
    }

    /* renamed from: h */
    public final BizTLRecCardCanvasView mo22835h() {
        Object value = ((C36570n) this.f50364g).getValue();
        C87412m.m108593f(value, "<get-canvasView>(...)");
        return (BizTLRecCardCanvasView) value;
    }

    /* renamed from: i */
    public final ViewGroup mo22836i() {
        return (ViewGroup) ((C36570n) this.f50363f).getValue();
    }
}
