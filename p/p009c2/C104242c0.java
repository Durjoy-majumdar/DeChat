package p009c2;

import android.content.Context;
import android.view.View;
import c14.C54614c;
import c14.C54624g;
import c14.C54625h;
import c14.C54629k;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import p735w1.C38006x;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: c2.c0 */
public final class C104242c0 implements C104273u {

    /* renamed from: a */
    public final View f308550a;

    /* renamed from: b */
    public final C104263n f308551b;

    /* renamed from: c */
    public boolean f308552c;

    /* renamed from: d */
    public C32226l<? super List<? extends C104247d>, C13598b0> f308553d = C0413f0.f1021d;

    /* renamed from: e */
    public C32226l<? super C104260k, C13598b0> f308554e = C104252g0.f308581d;

    /* renamed from: f */
    public C28482z f308555f = new C28482z("", C38006x.f100498b, (C38006x) null, 4, (C8480h) null);

    /* renamed from: g */
    public C104261l f308556g = C104261l.f308593f;

    /* renamed from: h */
    public C104274v f308557h;

    /* renamed from: i */
    public final C13601g f308558i = C36568h.m40986b(C13602i.NONE, new C104248d0(this));

    /* renamed from: j */
    public final C54625h<C104243a> f308559j = C54629k.m61479a(Integer.MAX_VALUE, (C54624g) null, (C32226l) null, 6, (Object) null);

    /* renamed from: c2.c0$a */
    public enum C104243a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard
    }

    /* renamed from: c2.c0$b */
    public static final class C104244b extends C87413o implements C32226l<List<? extends C104247d>, C13598b0> {

        /* renamed from: d */
        public static final C104244b f308565d = new C104244b();

        public C104244b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((List) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c2.c0$c */
    public static final class C104245c extends C87413o implements C32226l<C104260k, C13598b0> {

        /* renamed from: d */
        public static final C104245c f308566d = new C104245c();

        public C104245c() {
            super(1);
        }

        public /* synthetic */ Object invoke(Object obj) {
            int i = ((C104260k) obj).f308592a;
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.compose.ui.text.input.TextInputServiceAndroid", mo125469f = "TextInputServiceAndroid.android.kt", mo125470l = {189}, mo125471m = "textInputCommandEventLoop")
    /* renamed from: c2.c0$d */
    public static final class C104246d extends C66704d {

        /* renamed from: d */
        public Object f308567d;

        /* renamed from: e */
        public Object f308568e;

        /* renamed from: f */
        public /* synthetic */ Object f308569f;

        /* renamed from: g */
        public final /* synthetic */ C104242c0 f308570g;

        /* renamed from: h */
        public int f308571h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104246d(C104242c0 c0Var, C15601d<? super C104246d> dVar) {
            super(dVar);
            this.f308570g = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f308569f = obj;
            this.f308571h |= Integer.MIN_VALUE;
            return this.f308570g.mo145866f(this);
        }
    }

    public C104242c0(View view) {
        C87412m.m108594g(view, "view");
        Context context = view.getContext();
        C87412m.m108593f(context, "view.context");
        C104264o oVar = new C104264o(context);
        this.f308550a = view;
        this.f308551b = oVar;
    }

    /* renamed from: a */
    public void mo145861a() {
        this.f308552c = false;
        this.f308553d = C104244b.f308565d;
        this.f308554e = C104245c.f308566d;
        ((C54614c) this.f308559j).mo75539t(C104243a.StopInput);
    }

    /* renamed from: b */
    public void mo145862b() {
        ((C54614c) this.f308559j).mo75539t(C104243a.HideKeyboard);
    }

    /* renamed from: c */
    public void mo145863c(C28482z zVar, C28482z zVar2) {
        C87412m.m108594g(zVar2, "newValue");
        boolean z = true;
        boolean z2 = false;
        boolean z3 = !C38006x.m41693a(this.f308555f.f78286b, zVar2.f78286b) || !C87412m.m108589b(this.f308555f.f78287c, zVar2.f78287c);
        this.f308555f = zVar2;
        C104274v vVar = this.f308557h;
        if (vVar != null) {
            vVar.f308610d = zVar2;
        }
        if (!C87412m.m108589b(zVar, zVar2)) {
            if (zVar != null) {
                if (C87412m.m108589b(zVar.f78285a.f100413d, zVar2.f78285a.f100413d) && (!C38006x.m41693a(zVar.f78286b, zVar2.f78286b) || C87412m.m108589b(zVar.f78287c, zVar2.f78287c))) {
                    z = false;
                }
                z2 = z;
            }
            if (z2) {
                this.f308551b.mo145895e(this.f308550a);
                return;
            }
            C104274v vVar2 = this.f308557h;
            if (vVar2 != null) {
                C28482z zVar3 = this.f308555f;
                C104263n nVar = this.f308551b;
                View view = this.f308550a;
                C87412m.m108594g(zVar3, "state");
                C87412m.m108594g(nVar, "inputMethodManager");
                C87412m.m108594g(view, "view");
                if (vVar2.f308614h) {
                    vVar2.f308610d = zVar3;
                    if (vVar2.f308612f) {
                        nVar.mo145893c(view, vVar2.f308611e, C104266p.m139163a(zVar3));
                    }
                    C38006x xVar = zVar3.f78287c;
                    int f = xVar != null ? C38006x.m41698f(xVar.f100500a) : -1;
                    C38006x xVar2 = zVar3.f78287c;
                    nVar.mo145892b(view, C38006x.m41698f(zVar3.f78286b), C38006x.m41697e(zVar3.f78286b), f, xVar2 != null ? C38006x.m41697e(xVar2.f100500a) : -1);
                }
            }
        } else if (z3) {
            C104263n nVar2 = this.f308551b;
            View view2 = this.f308550a;
            int f2 = C38006x.m41698f(zVar2.f78286b);
            int e = C38006x.m41697e(zVar2.f78286b);
            C38006x xVar3 = this.f308555f.f78287c;
            int f3 = xVar3 != null ? C38006x.m41698f(xVar3.f100500a) : -1;
            C38006x xVar4 = this.f308555f.f78287c;
            nVar2.mo145892b(view2, f2, e, f3, xVar4 != null ? C38006x.m41697e(xVar4.f100500a) : -1);
        }
    }

    /* renamed from: d */
    public void mo145864d(C28482z zVar, C104261l lVar, C32226l<? super List<? extends C104247d>, C13598b0> lVar2, C32226l<? super C104260k, C13598b0> lVar3) {
        C87412m.m108594g(zVar, "value");
        C87412m.m108594g(lVar, "imeOptions");
        C87412m.m108594g(lVar2, "onEditCommand");
        C87412m.m108594g(lVar3, "onImeActionPerformed");
        this.f308552c = true;
        this.f308555f = zVar;
        this.f308556g = lVar;
        this.f308553d = lVar2;
        this.f308554e = lVar3;
        ((C54614c) this.f308559j).mo75539t(C104243a.StartInput);
    }

    /* renamed from: e */
    public void mo145865e() {
        ((C54614c) this.f308559j).mo75539t(C104243a.ShowKeyboard);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo145866f(wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p009c2.C104242c0.C104246d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            c2.c0$d r0 = (p009c2.C104242c0.C104246d) r0
            int r1 = r0.f308571h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f308571h = r1
            goto L_0x0018
        L_0x0013:
            c2.c0$d r0 = new c2.c0$d
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f308569f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f308571h
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r2 = r0.f308568e
            c14.j r2 = (c14.C54628j) r2
            java.lang.Object r4 = r0.f308567d
            c2.c0 r4 = (p009c2.C104242c0) r4
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0054
        L_0x002f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r10)
            c14.h<c2.c0$a> r10 = r9.f308559j
            c14.a r10 = (c14.C54602a) r10
            r10.getClass()
            c14.a$a r2 = new c14.a$a
            r2.<init>(r10)
            r4 = r9
        L_0x0047:
            r0.f308567d = r4
            r0.f308568e = r2
            r0.f308571h = r3
            java.lang.Object r10 = r2.mo75523a(r0)
            if (r10 != r1) goto L_0x0054
            return r1
        L_0x0054:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x010c
            java.lang.Object r10 = r2.next()
            c2.c0$a r10 = (p009c2.C104242c0.C104243a) r10
            android.view.View r5 = r4.f308550a
            boolean r5 = r5.isFocused()
            if (r5 != 0) goto L_0x0078
        L_0x006a:
            c14.h<c2.c0$a> r10 = r4.f308559j
            c14.a r10 = (c14.C54602a) r10
            java.lang.Object r10 = r10.mo75518u()
            boolean r10 = r10 instanceof c14.C54630l.C54632b
            r10 = r10 ^ r3
            if (r10 != 0) goto L_0x006a
            goto L_0x0047
        L_0x0078:
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
        L_0x0082:
            if (r10 == 0) goto L_0x00c9
            int r7 = r10.ordinal()
            if (r7 == 0) goto L_0x00b2
            if (r7 == r3) goto L_0x00ab
            r8 = 2
            if (r7 == r8) goto L_0x0093
            r8 = 3
            if (r7 == r8) goto L_0x0093
            goto L_0x00b8
        L_0x0093:
            T r7 = r5.f27484d
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 != 0) goto L_0x00b8
            c2.c0$a r7 = p009c2.C104242c0.C104243a.ShowKeyboard
            if (r10 != r7) goto L_0x00a3
            r10 = 1
            goto L_0x00a4
        L_0x00a3:
            r10 = 0
        L_0x00a4:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6.f27484d = r10
            goto L_0x00b8
        L_0x00ab:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r5.f27484d = r10
            r6.f27484d = r10
            goto L_0x00b8
        L_0x00b2:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r5.f27484d = r10
            r6.f27484d = r10
        L_0x00b8:
            c14.h<c2.c0$a> r10 = r4.f308559j
            c14.a r10 = (c14.C54602a) r10
            java.lang.Object r10 = r10.mo75518u()
            boolean r7 = r10 instanceof c14.C54630l.C54632b
            if (r7 != 0) goto L_0x00c5
            goto L_0x00c6
        L_0x00c5:
            r10 = 0
        L_0x00c6:
            c2.c0$a r10 = (p009c2.C104242c0.C104243a) r10
            goto L_0x0082
        L_0x00c9:
            T r10 = r5.f27484d
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r10 = gy3.C87412m.m108589b(r10, r7)
            if (r10 == 0) goto L_0x00da
            c2.n r10 = r4.f308551b
            android.view.View r7 = r4.f308550a
            r10.mo145895e(r7)
        L_0x00da:
            T r10 = r6.f27484d
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x00f9
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00ee
            c2.n r10 = r4.f308551b
            android.view.View r6 = r4.f308550a
            r10.mo145891a(r6)
            goto L_0x00f9
        L_0x00ee:
            c2.n r10 = r4.f308551b
            android.view.View r6 = r4.f308550a
            android.os.IBinder r6 = r6.getWindowToken()
            r10.mo145894d(r6)
        L_0x00f9:
            T r10 = r5.f27484d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r10 = gy3.C87412m.m108589b(r10, r5)
            if (r10 == 0) goto L_0x0047
            c2.n r10 = r4.f308551b
            android.view.View r5 = r4.f308550a
            r10.mo145895e(r5)
            goto L_0x0047
        L_0x010c:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p009c2.C104242c0.mo145866f(wx3.d):java.lang.Object");
    }
}
