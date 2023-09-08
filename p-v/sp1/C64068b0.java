package sp1;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C64370fp1;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: sp1.b0 */
public final class C64068b0 {

    /* renamed from: a */
    public final Context f181625a;

    /* renamed from: b */
    public final String f181626b = "FinderLiveShopShowBoxView";

    /* renamed from: c */
    public C64059b f181627c;

    /* renamed from: d */
    public final C13601g f181628d = C36568h.m40985a(C64069a.f181632d);

    /* renamed from: e */
    public final C13601g f181629e = C36568h.m40985a(C64072d.f181635d);

    /* renamed from: f */
    public final C13601g f181630f = C36568h.m40985a(C64070b.f181633d);

    /* renamed from: g */
    public final C13601g f181631g = C36568h.m40985a(C64071c.f181634d);

    /* renamed from: sp1.b0$a */
    public static final class C64069a extends C87413o implements C32224a<LinkedList<TextView>> {

        /* renamed from: d */
        public static final C64069a f181632d = new C64069a();

        public C64069a() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    /* renamed from: sp1.b0$b */
    public static final class C64070b extends C87413o implements C32224a<LinkedList<TextView>> {

        /* renamed from: d */
        public static final C64070b f181633d = new C64070b();

        public C64070b() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    /* renamed from: sp1.b0$c */
    public static final class C64071c extends C87413o implements C32224a<LinkedList<TextView>> {

        /* renamed from: d */
        public static final C64071c f181634d = new C64071c();

        public C64071c() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    /* renamed from: sp1.b0$d */
    public static final class C64072d extends C87413o implements C32224a<LinkedList<TextView>> {

        /* renamed from: d */
        public static final C64072d f181635d = new C64072d();

        public C64072d() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopShowBoxView", mo125469f = "FinderLiveShopShowBoxView.kt", mo125470l = {81}, mo125471m = "showBox")
    /* renamed from: sp1.b0$e */
    public static final class C64073e extends C66704d {

        /* renamed from: d */
        public Object f181636d;

        /* renamed from: e */
        public Object f181637e;

        /* renamed from: f */
        public Object f181638f;

        /* renamed from: g */
        public Object f181639g;

        /* renamed from: h */
        public Object f181640h;

        /* renamed from: i */
        public Object f181641i;

        /* renamed from: j */
        public Object f181642j;

        /* renamed from: n */
        public Object f181643n;

        /* renamed from: o */
        public Object f181644o;

        /* renamed from: p */
        public boolean f181645p;

        /* renamed from: q */
        public int f181646q;

        /* renamed from: r */
        public /* synthetic */ Object f181647r;

        /* renamed from: s */
        public final /* synthetic */ C64068b0 f181648s;

        /* renamed from: t */
        public int f181649t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64073e(C64068b0 b0Var, C15601d<? super C64073e> dVar) {
            super(dVar);
            this.f181648s = b0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f181647r = obj;
            this.f181649t |= Integer.MIN_VALUE;
            return this.f181648s.mo88820c((String) null, (C64370fp1) null, false, (ViewGroup) null, 0, (C32224a<C13598b0>) null, this);
        }
    }

    public C64068b0(Context context) {
        C87412m.m108594g(context, "context");
        this.f181625a = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.TextView mo88818a(int r8) {
        /*
            r7 = this;
            r0 = 2
            r1 = 0
            if (r8 == r0) goto L_0x0030
            r0 = 3
            if (r8 == r0) goto L_0x0025
            r0 = 4
            if (r8 == r0) goto L_0x001a
            r0 = 6
            if (r8 == r0) goto L_0x000f
            r0 = r1
            goto L_0x003a
        L_0x000f:
            rx3.g r0 = r7.f181631g
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            goto L_0x003a
        L_0x001a:
            rx3.g r0 = r7.f181630f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            goto L_0x003a
        L_0x0025:
            rx3.g r0 = r7.f181629e
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            goto L_0x003a
        L_0x0030:
            rx3.g r0 = r7.f181628d
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
        L_0x003a:
            r2 = 33
            java.lang.String r3 = "getTv type:"
            if (r0 != 0) goto L_0x006b
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r7.f181625a
            r0.<init>(r1)
            java.lang.String r1 = r7.f181626b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r8)
            java.lang.String r8 = " invalid,return new tv:"
            r4.append(r8)
            int r8 = r7.hashCode()
            r4.append(r8)
            r4.append(r2)
            java.lang.String r8 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            return r0
        L_0x006b:
            java.util.Iterator r4 = r0.iterator()
        L_0x006f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0088
            java.lang.Object r5 = r4.next()
            r6 = r5
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0084
            r6 = 1
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            if (r6 == 0) goto L_0x006f
            r1 = r5
        L_0x0088:
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r4 = ",cache size:"
            if (r1 == 0) goto L_0x00c1
            java.lang.String r5 = ""
            r1.setText(r5)
            java.lang.String r5 = r7.f181626b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r8)
            java.lang.String r8 = " reuse tv:"
            r6.append(r8)
            int r8 = r1.hashCode()
            r6.append(r8)
            r6.append(r4)
            int r8 = r0.size()
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            goto L_0x00f8
        L_0x00c1:
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r5 = r7.f181625a
            r1.<init>(r5)
            java.lang.String r5 = r7.f181626b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r8)
            java.lang.String r8 = " new tv:"
            r6.append(r8)
            int r8 = r1.hashCode()
            r6.append(r8)
            r6.append(r4)
            int r8 = r0.size()
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            r0.add(r1)
        L_0x00f8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sp1.C64068b0.mo88818a(int):android.widget.TextView");
    }

    /* renamed from: b */
    public final void mo88819b(String str, ViewGroup viewGroup) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(viewGroup, "promoteGroup");
        Log.m105924i(str, "hide,promoteGroup:" + viewGroup + '!');
        viewGroup.removeAllViews();
        C64059b bVar = this.f181627c;
        if (bVar != null) {
            bVar.mo88813a(5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x076d  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x09cb  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo88820c(java.lang.String r35, te3.C64370fp1 r36, boolean r37, android.view.ViewGroup r38, int r39, fy3.C32224a<rx3.C13598b0> r40, wx3.C15601d<? super rx3.C13598b0> r41) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            r2 = r41
            boolean r3 = r2 instanceof sp1.C64068b0.C64073e
            if (r3 == 0) goto L_0x0019
            r3 = r2
            sp1.b0$e r3 = (sp1.C64068b0.C64073e) r3
            int r4 = r3.f181649t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f181649t = r4
            goto L_0x001e
        L_0x0019:
            sp1.b0$e r3 = new sp1.b0$e
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f181647r
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f181649t
            java.lang.String r6 = " parse fail!"
            r10 = 1
            if (r5 == 0) goto L_0x0060
            if (r5 != r10) goto L_0x0058
            int r1 = r3.f181646q
            boolean r5 = r3.f181645p
            java.lang.Object r12 = r3.f181644o
            gy3.d0 r12 = (gy3.C8478d0) r12
            java.lang.Object r13 = r3.f181643n
            te3.z44 r13 = (te3.z44) r13
            java.lang.Object r14 = r3.f181642j
            java.util.Iterator r14 = (java.util.Iterator) r14
            java.lang.Object r15 = r3.f181641i
            gy3.d0 r15 = (gy3.C8478d0) r15
            java.lang.Object r9 = r3.f181640h
            fy3.a r9 = (fy3.C32224a) r9
            java.lang.Object r11 = r3.f181639g
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            java.lang.Object r10 = r3.f181638f
            te3.fp1 r10 = (te3.C64370fp1) r10
            java.lang.Object r8 = r3.f181637e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r3.f181636d
            sp1.b0 r7 = (sp1.C64068b0) r7
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x01c0
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0060:
            kotlin.ResultKt.throwOnFailure(r2)
            r38.removeAllViews()
            sp1.b r2 = r0.f181627c
            if (r2 == 0) goto L_0x006e
            r5 = 4
            r2.mo88813a(r5)
        L_0x006e:
            gy3.d0 r2 = new gy3.d0
            r2.<init>()
            r5 = r39
            r2.f27483d = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "showBox ("
            r5.append(r7)
            java.lang.String r7 = r1.f183177e
            r5.append(r7)
            r7 = 45
            r5.append(r7)
            long r7 = r1.f183176d
            r5.append(r7)
            r7 = 41
            r5.append(r7)
            cl1.h1$a r7 = cl1.C54979h1.f154108p0
            java.util.LinkedList<te3.z44> r8 = r1.f183165J
            java.lang.String r9 = "data.show_box_items"
            gy3.C87412m.m108593f(r8, r9)
            java.lang.String r7 = r7.mo628a(r8)
            r5.append(r7)
            java.lang.String r7 = ", showDiscountSelling:"
            r5.append(r7)
            r7 = r37
            r5.append(r7)
            java.lang.String r8 = ", leftSpace:"
            r5.append(r8)
            int r8 = r2.f27483d
            r5.append(r8)
            java.lang.String r8 = ",promoteGroupWidth:"
            r5.append(r8)
            int r8 = r38.getMeasuredWidth()
            r5.append(r8)
            java.lang.String r8 = ",countdownFinish:"
            r5.append(r8)
            if (r40 == 0) goto L_0x00d2
            int r8 = r40.hashCode()
            goto L_0x00d3
        L_0x00d2:
            r8 = 0
        L_0x00d3:
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r8 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            java.util.LinkedList<te3.z44> r5 = r1.f183165J
            gy3.C87412m.m108593f(r5, r9)
            java.util.Iterator r5 = r5.iterator()
            r13 = r0
            r12 = r2
            r15 = r4
            r11 = r5
            r14 = r6
            r4 = r38
            r5 = r40
            r2 = r1
            r6 = r3
            r3 = r7
            r1 = r8
        L_0x00f5:
            boolean r7 = r11.hasNext()
            if (r7 == 0) goto L_0x09cb
            java.lang.Object r7 = r11.next()
            r10 = r7
            te3.z44 r10 = (te3.z44) r10
            int r7 = r10.f186625d
            java.lang.String r8 = ""
            r9 = 1
            if (r7 == r9) goto L_0x0630
            java.lang.String r9 = "), space:"
            java.lang.String r0 = ",marginRight:"
            r36 = r8
            java.lang.String r8 = "(padding:"
            r37 = r14
            java.lang.String r14 = "promoteGroup"
            r38 = r15
            java.lang.String r15 = "context"
            r39 = r9
            java.lang.String r9 = "tag"
            r40 = r0
            r0 = 2
            r17 = r8
            if (r7 == r0) goto L_0x04b9
            java.lang.String r0 = ",space:"
            r8 = 3
            if (r7 == r8) goto L_0x03c0
            r8 = 4
            if (r7 == r8) goto L_0x0224
            r0 = 6
            if (r7 == r0) goto L_0x013e
            r8 = r37
            r37 = r2
            r22 = r3
            r24 = r5
            r23 = r11
            r7 = r12
            r2 = r13
            goto L_0x03b7
        L_0x013e:
            pe3.b r7 = r10.f186626e
            if (r7 == 0) goto L_0x01ee
            te3.ge2 r8 = new te3.ge2
            r8.<init>()
            byte[] r7 = r7.mo123703f()
            r8.parseFrom(r7)
            int r15 = r12.f27483d
            np1.i0 r7 = np1.C61866i0.f175909a
            android.content.Context r9 = r13.f181625a
            android.widget.TextView r0 = r13.mo88818a(r0)
            java.lang.String r14 = r8.f183317d
            if (r14 != 0) goto L_0x015e
            r14 = r36
        L_0x015e:
            java.lang.String r8 = r8.f183318e
            if (r8 != 0) goto L_0x0165
            r17 = r36
            goto L_0x0167
        L_0x0165:
            r17 = r8
        L_0x0167:
            int r8 = r12.f27483d
            r6.f181636d = r13
            r6.f181637e = r1
            r6.f181638f = r2
            r6.f181639g = r4
            r6.f181640h = r5
            r6.f181641i = r12
            r6.f181642j = r11
            r6.f181643n = r10
            r6.f181644o = r12
            r6.f181645p = r3
            r6.f181646q = r15
            r18 = r8
            r8 = 1
            r6.f181649t = r8
            r8 = r1
            r22 = r3
            r3 = r10
            r10 = r0
            r23 = r11
            r11 = r4
            r0 = r12
            r12 = r14
            r14 = r13
            r13 = r17
            r24 = r5
            r5 = r37
            r37 = r2
            r2 = r14
            r14 = r18
            r25 = r5
            r17 = r15
            r5 = r38
            r15 = r6
            java.lang.Object r7 = r7.mo86791b(r8, r9, r10, r11, r12, r13, r14, r15)
            if (r7 != r5) goto L_0x01a8
            return r5
        L_0x01a8:
            r10 = r37
            r12 = r0
            r15 = r12
            r8 = r1
            r13 = r3
            r11 = r4
            r4 = r5
            r3 = r6
            r1 = r17
            r5 = r22
            r14 = r23
            r9 = r24
            r6 = r25
            r33 = r7
            r7 = r2
            r2 = r33
        L_0x01c0:
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            int r1 = r1 - r0
            r12.f27483d = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add guarantee leftSpace:"
            r0.append(r1)
            int r1 = r15.f27483d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            r1 = r8
            r2 = r10
            r10 = r13
            r12 = r15
            r15 = r4
            r13 = r7
            r4 = r11
            r11 = r14
            r14 = r6
            r6 = r3
            r3 = r5
            r5 = r9
            goto L_0x0207
        L_0x01ee:
            r25 = r37
            r37 = r2
            r22 = r3
            r24 = r5
            r3 = r10
            r23 = r11
            r0 = r12
            r2 = r13
            r5 = r38
            r15 = r5
            r3 = r22
            r5 = r24
            r14 = r25
            r0 = 0
            r2 = r37
        L_0x0207:
            if (r0 != 0) goto L_0x09c7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "guarantee show_box_item:"
            r0.append(r7)
            pe3.b r7 = r10.f186626e
            r0.append(r7)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x09c7
        L_0x0224:
            r25 = r37
            r37 = r2
            r22 = r3
            r24 = r5
            r3 = r10
            r23 = r11
            r7 = r12
            r2 = r13
            r5 = r38
            pe3.b r8 = r3.f186626e
            if (r8 == 0) goto L_0x0394
            te3.rq1 r10 = new te3.rq1
            r10.<init>()
            byte[] r8 = r8.mo123703f()
            r10.parseFrom(r8)
            int r8 = r7.f27483d
            np1.i0 r11 = np1.C61866i0.f175909a
            android.content.Context r12 = r2.f181625a
            r38 = r5
            r13 = 4
            android.widget.TextView r5 = r2.mo88818a(r13)
            java.lang.String r10 = r10.f185232d
            if (r10 != 0) goto L_0x0256
            r10 = r36
        L_0x0256:
            int r13 = r7.f27483d
            r11.getClass()
            gy3.C87412m.m108594g(r1, r9)
            gy3.C87412m.m108594g(r12, r15)
            gy3.C87412m.m108594g(r4, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "addFriendBuyWord "
            r9.append(r11)
            r9.append(r10)
            r9.append(r0)
            r9.append(r13)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            int r0 = r10.length()
            if (r0 != 0) goto L_0x0286
            r0 = 1
            goto L_0x0287
        L_0x0286:
            r0 = 0
        L_0x0287:
            if (r0 != 0) goto L_0x0377
            if (r13 > 0) goto L_0x028d
            goto L_0x0377
        L_0x028d:
            r0 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r0 = kg3.C76577a.m92153d(r12, r0)
            r5.setTextColor(r0)
            r0 = 2131232840(0x7f080848, float:1.80818E38)
            r5.setBackgroundResource(r0)
            r5.setText(r10)
            r0 = 1094713344(0x41400000, float:12.0)
            r9 = 1
            r5.setTextSize(r9, r0)
            r0 = 17
            r5.setGravity(r0)
            r5.setMaxLines(r9)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r5.setEllipsize(r0)
            r0 = 2131166432(0x7f0704e0, float:1.794711E38)
            int r9 = kg3.C76577a.m92155f(r12, r0)
            r10 = 2131166429(0x7f0704dd, float:1.7947103E38)
            int r11 = kg3.C76577a.m92155f(r12, r10)
            int r0 = kg3.C76577a.m92155f(r12, r0)
            int r10 = kg3.C76577a.m92155f(r12, r10)
            r5.setPadding(r9, r11, r0, r10)
            java.lang.CharSequence r0 = r5.getText()
            java.lang.String r0 = r0.toString()
            android.text.TextPaint r9 = r5.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r0, r9)
            float r9 = (float) r13
            int r10 = r5.getPaddingLeft()
            float r10 = (float) r10
            float r10 = r10 + r0
            int r11 = r5.getPaddingRight()
            float r11 = (float) r11
            float r10 = r10 + r11
            rx3.g r11 = np1.C61866i0.f175914f
            r12 = r11
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            float r10 = r10 + r12
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x034c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "friendBuyWidth:"
            r9.append(r10)
            r9.append(r0)
            r10 = r17
            r9.append(r10)
            int r0 = r5.getPaddingLeft()
            r9.append(r0)
            r0 = 45
            r9.append(r0)
            int r0 = r5.getPaddingRight()
            r9.append(r0)
            r5 = r40
            r9.append(r5)
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r0 = r11.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r9.append(r0)
            r11 = r39
            r9.append(r11)
            r9.append(r13)
            java.lang.String r0 = ", no space for friendBuy!"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x0377
        L_0x034c:
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r9.<init>(r10, r10)
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r10 = r11.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r11 = 0
            r9.setMargins(r11, r11, r10, r11)
            r4.addView(r5, r9)
            int r0 = (int) r0
            int r10 = r9.leftMargin
            int r0 = r0 + r10
            int r9 = r9.rightMargin
            int r0 = r0 + r9
            int r9 = r5.getPaddingLeft()
            int r0 = r0 + r9
            int r5 = r5.getPaddingRight()
            int r0 = r0 + r5
            goto L_0x0378
        L_0x0377:
            r0 = 0
        L_0x0378:
            int r8 = r8 - r0
            r7.f27483d = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "add friend buy word leftSpace:"
            r0.append(r5)
            int r5 = r7.f27483d
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0397
        L_0x0394:
            r38 = r5
            r0 = 0
        L_0x0397:
            if (r0 != 0) goto L_0x03b5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "friend buy word show_box_item:"
            r0.append(r5)
            pe3.b r3 = r3.f186626e
            r0.append(r3)
            r8 = r25
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x03b7
        L_0x03b5:
            r8 = r25
        L_0x03b7:
            r10 = r37
            r20 = r2
            r17 = r6
            r6 = r8
            goto L_0x09b8
        L_0x03c0:
            r8 = r37
            r37 = r2
            r22 = r3
            r24 = r5
            r3 = r10
            r23 = r11
            r7 = r12
            r2 = r13
            pe3.b r5 = r3.f186626e
            if (r5 == 0) goto L_0x0496
            te3.eo3 r10 = new te3.eo3
            r10.<init>()
            byte[] r5 = r5.mo123703f()
            r10.parseFrom(r5)
            int r5 = r7.f27483d
            np1.i0 r11 = np1.C61866i0.f175909a
            android.content.Context r12 = r2.f181625a
            r13 = 3
            android.widget.TextView r13 = r2.mo88818a(r13)
            java.lang.String r10 = r10.f133041d
            if (r10 != 0) goto L_0x03ee
            r10 = r36
        L_0x03ee:
            r17 = r6
            int r6 = r7.f27483d
            r11.getClass()
            gy3.C87412m.m108594g(r1, r9)
            gy3.C87412m.m108594g(r12, r15)
            gy3.C87412m.m108594g(r4, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "addRecommendWord "
            r9.append(r11)
            r9.append(r10)
            r9.append(r0)
            r9.append(r6)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            int r0 = r10.length()
            if (r0 != 0) goto L_0x0420
            r0 = 1
            goto L_0x0421
        L_0x0420:
            r0 = 0
        L_0x0421:
            if (r0 != 0) goto L_0x0479
            if (r6 > 0) goto L_0x0426
            goto L_0x0479
        L_0x0426:
            r0 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r0 = kg3.C76577a.m92153d(r12, r0)
            r13.setTextColor(r0)
            r13.setText(r10)
            r0 = 1094713344(0x41400000, float:12.0)
            r6 = 1
            r13.setTextSize(r6, r0)
            r13.setMaxLines(r6)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r13.setEllipsize(r0)
            r0 = 17
            r13.setGravity(r0)
            java.lang.CharSequence r0 = r13.getText()
            java.lang.String r0 = r0.toString()
            android.text.TextPaint r6 = r13.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r0, r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r6.<init>(r9, r9)
            rx3.g r9 = np1.C61866i0.f175913e
            rx3.n r9 = (rx3.C36570n) r9
            java.lang.Object r9 = r9.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r10 = 0
            r6.setMargins(r10, r10, r9, r10)
            r4.addView(r13, r6)
            int r0 = (int) r0
            int r9 = r6.leftMargin
            int r0 = r0 + r9
            int r6 = r6.rightMargin
            int r0 = r0 + r6
            goto L_0x047a
        L_0x0479:
            r0 = 0
        L_0x047a:
            int r5 = r5 - r0
            r7.f27483d = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "add recommend word leftSpace:"
            r0.append(r5)
            int r5 = r7.f27483d
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0499
        L_0x0496:
            r17 = r6
            r0 = 0
        L_0x0499:
            if (r0 != 0) goto L_0x04b4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "recommend word show_box_item:"
            r0.append(r5)
            pe3.b r3 = r3.f186626e
            r0.append(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x04b4:
            r20 = r2
            r6 = r8
            goto L_0x0629
        L_0x04b9:
            r8 = r37
            r37 = r2
            r22 = r3
            r24 = r5
            r3 = r10
            r23 = r11
            r7 = r12
            r2 = r13
            r10 = r17
            r11 = r39
            r5 = r40
            r17 = r6
            pe3.b r6 = r3.f186626e
            if (r6 == 0) goto L_0x0607
            te3.p00 r12 = new te3.p00
            r12.<init>()
            byte[] r6 = r6.mo123703f()
            r12.parseFrom(r6)
            int r6 = r7.f27483d
            np1.i0 r13 = np1.C61866i0.f175909a
            r25 = r8
            android.content.Context r8 = r2.f181625a
            android.widget.TextView r0 = r2.mo88818a(r0)
            java.lang.String r12 = r12.f184723d
            if (r12 != 0) goto L_0x04f0
            r12 = r36
        L_0x04f0:
            r20 = r2
            int r2 = r7.f27483d
            r13.getClass()
            gy3.C87412m.m108594g(r1, r9)
            gy3.C87412m.m108594g(r8, r15)
            gy3.C87412m.m108594g(r4, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r14 = "addCouponLabel "
            r9.append(r14)
            r9.append(r12)
            java.lang.String r14 = " space:"
            r9.append(r14)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            int r9 = r12.length()
            if (r9 != 0) goto L_0x0524
            r9 = 1
            goto L_0x0525
        L_0x0524:
            r9 = 0
        L_0x0525:
            if (r9 != 0) goto L_0x05ea
            if (r2 > 0) goto L_0x052b
            goto L_0x05ea
        L_0x052b:
            r9 = 2131100140(0x7f0601ec, float:1.7812653E38)
            int r9 = kg3.C76577a.m92153d(r8, r9)
            r0.setTextColor(r9)
            r9 = 2131232832(0x7f080840, float:1.8081784E38)
            r0.setBackgroundResource(r9)
            r0.setText(r12)
            r9 = 1094713344(0x41400000, float:12.0)
            r12 = 1
            r0.setTextSize(r12, r9)
            r0.setMaxLines(r12)
            android.text.TextUtils$TruncateAt r9 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r9)
            r9 = 17
            r0.setGravity(r9)
            r9 = 2131165280(0x7f070060, float:1.7944773E38)
            int r12 = kg3.C76577a.m92155f(r8, r9)
            int r8 = kg3.C76577a.m92155f(r8, r9)
            r9 = 0
            r0.setPadding(r12, r9, r8, r9)
            java.lang.CharSequence r8 = r0.getText()
            java.lang.String r8 = r8.toString()
            android.text.TextPaint r9 = r0.getPaint()
            float r8 = android.text.Layout.getDesiredWidth(r8, r9)
            float r9 = (float) r2
            int r12 = r0.getPaddingLeft()
            float r12 = (float) r12
            float r12 = r12 + r8
            int r14 = r0.getPaddingRight()
            float r14 = (float) r14
            float r12 = r12 + r14
            int r14 = r13.mo86796h()
            float r14 = (float) r14
            float r12 = r12 + r14
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x05c7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "couponWidth:"
            r9.append(r12)
            r9.append(r8)
            r9.append(r10)
            int r8 = r0.getPaddingLeft()
            r9.append(r8)
            r8 = 45
            r9.append(r8)
            int r0 = r0.getPaddingRight()
            r9.append(r0)
            r9.append(r5)
            int r0 = r13.mo86796h()
            r9.append(r0)
            r9.append(r11)
            r9.append(r2)
            java.lang.String r0 = ", no space for coupon!"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x05ea
        L_0x05c7:
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r2.<init>(r5, r5)
            int r5 = r13.mo86796h()
            r9 = 0
            r2.setMargins(r9, r9, r5, r9)
            r4.addView(r0, r2)
            int r5 = (int) r8
            int r8 = r2.leftMargin
            int r5 = r5 + r8
            int r2 = r2.rightMargin
            int r5 = r5 + r2
            int r2 = r0.getPaddingLeft()
            int r5 = r5 + r2
            int r0 = r0.getPaddingRight()
            int r0 = r0 + r5
            goto L_0x05eb
        L_0x05ea:
            r0 = 0
        L_0x05eb:
            int r6 = r6 - r0
            r7.f27483d = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "add coupon leftSpace:"
            r0.append(r2)
            int r2 = r7.f27483d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x060c
        L_0x0607:
            r20 = r2
            r25 = r8
            r0 = 0
        L_0x060c:
            if (r0 != 0) goto L_0x062d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "coupon show_box_item:"
            r0.append(r2)
            pe3.b r2 = r3.f186626e
            r0.append(r2)
            r6 = r25
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0629:
            r10 = r37
            goto L_0x09b8
        L_0x062d:
            r6 = r25
            goto L_0x0629
        L_0x0630:
            r37 = r2
            r22 = r3
            r24 = r5
            r17 = r6
            r36 = r8
            r3 = r10
            r23 = r11
            r7 = r12
            r20 = r13
            r6 = r14
            r38 = r15
            pe3.b r0 = r3.f186626e
            if (r0 == 0) goto L_0x099a
            te3.xn2 r2 = new te3.xn2
            r2.<init>()
            byte[] r0 = r0.mo123703f()
            r2.parseFrom(r0)
            r0 = r20
            sp1.b r5 = r0.f181627c
            if (r5 != 0) goto L_0x0662
            sp1.b r5 = new sp1.b
            android.content.Context r8 = r0.f181625a
            r5.<init>(r8, r4)
            r0.f181627c = r5
        L_0x0662:
            sp1.b r5 = r0.f181627c
            r8 = -1
            if (r5 == 0) goto L_0x0694
            java.lang.String r9 = "parent"
            gy3.C87412m.m108594g(r4, r9)
            java.lang.String r9 = r5.f181604b
            java.lang.String r10 = "attachToParent 0}"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            android.view.View r9 = r5.mo88815c()
            int r9 = r4.indexOfChild(r9)
            if (r9 != r8) goto L_0x0694
            int r9 = r4.getChildCount()
            if (r9 < 0) goto L_0x068c
            android.view.View r5 = r5.mo88815c()
            r9 = 0
            r4.addView(r5, r9)
            goto L_0x0694
        L_0x068c:
            r9 = 0
            android.view.View r5 = r5.mo88815c()
            r4.addView(r5, r9)
        L_0x0694:
            sp1.b r5 = r0.f181627c
            if (r5 == 0) goto L_0x0883
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r10 = 32
            r9.append(r10)
            r10 = r37
            java.lang.String r11 = r10.f183177e
            r9.append(r11)
            r11 = 45
            r9.append(r11)
            long r12 = r10.f183176d
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            java.lang.String r12 = "tagInfo"
            gy3.C87412m.m108594g(r9, r12)
            long r12 = eb0.C31543z5.m39453c()
            long r14 = r2.f186353e
            double r14 = (double) r14
            r39 = r9
            double r8 = (double) r12
            double r14 = r14 - r8
            r8 = 1000(0x3e8, float:1.401E-42)
            double r8 = (double) r8
            double r14 = r14 / r8
            int r8 = iy3.C60641c.m70920a(r14)
            long r14 = (long) r8
            r18 = 86400(0x15180, double:4.26873E-319)
            r20 = r12
            long r11 = r14 % r18
            int r9 = (int) r11
            r5.f181612j = r9
            long r14 = r14 / r18
            int r9 = (int) r14
            r5.f181613k = r9
            java.lang.String r9 = r5.f181604b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r12 = r39
            r11.append(r12)
            java.lang.String r12 = ",update "
            r11.append(r12)
            org.json.JSONObject r12 = o40.C61937h.m72709h(r2)
            r11.append(r12)
            java.lang.String r12 = ",serverTime:"
            r11.append(r12)
            r12 = r20
            r11.append(r12)
            java.lang.String r12 = ",leftTime:"
            r11.append(r12)
            r11.append(r8)
            r12 = 40
            r11.append(r12)
            int r12 = r5.f181612j
            r11.append(r12)
            java.lang.String r12 = "秒-"
            r11.append(r12)
            int r12 = r5.f181613k
            r11.append(r12)
            java.lang.String r12 = "天),countDownFinish:"
            r11.append(r12)
            if (r24 == 0) goto L_0x072f
            int r12 = r24.hashCode()
            goto L_0x0730
        L_0x072f:
            r12 = 0
        L_0x0730:
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
            android.widget.TextView r9 = r5.mo88814b()
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            if (r9 == 0) goto L_0x0747
            r11 = -2
            r9.width = r11
        L_0x0747:
            long r11 = r2.f186353e
            r13 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x086a
            int r9 = r5.f181612j
            r15 = -1
            int r9 = r9 + r15
            r5.f181612j = r9
            if (r9 <= 0) goto L_0x0758
            goto L_0x0766
        L_0x0758:
            int r15 = r5.f181613k
            if (r15 <= 0) goto L_0x0768
            int r15 = r15 + -1
            r5.f181613k = r15
            r15 = 86400(0x15180, float:1.21072E-40)
            int r9 = r9 + r15
            r5.f181612j = r9
        L_0x0766:
            r9 = 1
            goto L_0x0769
        L_0x0768:
            r9 = 0
        L_0x0769:
            if (r9 != 0) goto L_0x076d
            goto L_0x086a
        L_0x076d:
            java.lang.String r2 = r2.f186354f
            if (r2 != 0) goto L_0x0774
            r8 = r36
            goto L_0x0775
        L_0x0774:
            r8 = r2
        L_0x0775:
            int r2 = r8.length()
            if (r2 != 0) goto L_0x077d
            r2 = 1
            goto L_0x077e
        L_0x077d:
            r2 = 0
        L_0x077e:
            if (r2 != 0) goto L_0x07e3
            if (r22 != 0) goto L_0x0783
            goto L_0x07e3
        L_0x0783:
            rx3.g r2 = r5.f181609g
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r11 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r12)
            java.lang.Object[] r26 = r9.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopDiscountView"
            java.lang.String r28 = "setSellingInfo"
            java.lang.String r29 = "(Ljava/lang/String;Z)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r11 = 0
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.setVisibility(r9)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopDiscountView"
            java.lang.String r27 = "setSellingInfo"
            java.lang.String r28 = "(Ljava/lang/String;Z)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            android.widget.TextView r2 = r5.mo88816d()
            r9 = 0
            r2.setVisibility(r9)
            android.widget.TextView r2 = r5.mo88816d()
            r2.setText(r8)
            r15 = 0
            goto L_0x083a
        L_0x07e3:
            rx3.g r2 = r5.f181609g
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r8.mo10233c(r11)
            java.lang.Object[] r26 = r8.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopDiscountView"
            java.lang.String r28 = "setSellingInfo"
            java.lang.String r29 = "(Ljava/lang/String;Z)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r15 = 0
            java.lang.Object r8 = r8.mo10231a(r15)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r2.setVisibility(r8)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShopDiscountView"
            java.lang.String r27 = "setSellingInfo"
            java.lang.String r28 = "(Ljava/lang/String;Z)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            android.widget.TextView r2 = r5.mo88816d()
            r2.setVisibility(r9)
        L_0x083a:
            y50.n0$a r25 = y50.C15936n0.f42815a
            int r2 = r5.f181612j
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 28
            r32 = 0
            java.lang.String r27 = ":"
            r26 = r2
            java.lang.String r2 = y50.C15936n0.C15937a.m14866a(r25, r26, r27, r28, r29, r30, r31, r32)
            int r8 = r5.f181613k
            r5.mo88817e(r2, r8)
            rx3.g r2 = r5.f181615m
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = (com.tencent.p014mm.sdk.platformtools.MTimerHandler) r2
            r8 = 1000(0x3e8, double:4.94E-321)
            r2.startTimer(r8)
            r2 = r24
            r5.f181611i = r2
            r8 = 1
            goto L_0x0889
        L_0x086a:
            r2 = r24
            r15 = 0
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 <= 0) goto L_0x087e
            int r8 = java.lang.Math.abs(r8)
            r9 = 10
            if (r8 >= r9) goto L_0x087e
            if (r2 == 0) goto L_0x087e
            r2.invoke()
        L_0x087e:
            r8 = 1
            r5.mo88813a(r8)
            goto L_0x0889
        L_0x0883:
            r10 = r37
            r2 = r24
            r8 = 1
            r15 = 0
        L_0x0889:
            int r5 = r7.f27483d
            sp1.b r9 = r0.f181627c
            if (r9 == 0) goto L_0x0979
            android.view.View r11 = r9.mo88815c()
            int r11 = r11.getMeasuredWidth()
            if (r11 <= 0) goto L_0x089f
            r20 = r0
            r24 = r2
            goto L_0x097e
        L_0x089f:
            rx3.g r11 = r9.f181606d
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            android.widget.TextView r11 = (android.widget.TextView) r11
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r11 = r11.toString()
            rx3.g r12 = r9.f181606d
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.text.TextPaint r12 = r12.getPaint()
            float r11 = android.text.Layout.getDesiredWidth(r11, r12)
            rx3.g r12 = r9.f181606d
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            java.lang.String r13 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r12, r13)
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            android.widget.TextView r14 = r9.mo88814b()
            java.lang.CharSequence r14 = r14.getText()
            java.lang.String r14 = r14.toString()
            android.widget.TextView r16 = r9.mo88814b()
            android.text.TextPaint r8 = r16.getPaint()
            float r8 = android.text.Layout.getDesiredWidth(r14, r8)
            android.widget.TextView r14 = r9.mo88814b()
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            gy3.C87412m.m108592e(r14, r13)
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            android.widget.TextView r16 = r9.mo88816d()
            java.lang.CharSequence r16 = r16.getText()
            java.lang.String r15 = r16.toString()
            android.widget.TextView r16 = r9.mo88816d()
            r20 = r0
            android.text.TextPaint r0 = r16.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r15, r0)
            android.widget.TextView r15 = r9.mo88816d()
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            gy3.C87412m.m108592e(r15, r13)
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            r24 = r2
            rx3.g r2 = r9.f181609g
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            gy3.C87412m.m108592e(r2, r13)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r9 = r9.f181612j
            if (r9 <= 0) goto L_0x095e
            int r9 = r12.leftMargin
            float r9 = (float) r9
            float r11 = r11 + r9
            int r9 = r12.rightMargin
            float r9 = (float) r9
            float r11 = r11 + r9
            float r11 = r11 + r8
            int r8 = r14.leftMargin
            float r8 = (float) r8
            float r11 = r11 + r8
            int r8 = r14.rightMargin
            float r8 = (float) r8
            float r11 = r11 + r8
            float r11 = r11 + r0
            int r0 = r15.leftMargin
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r15.rightMargin
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r2.leftMargin
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r2.rightMargin
            goto L_0x0975
        L_0x095e:
            int r8 = r12.leftMargin
            float r8 = (float) r8
            float r11 = r11 + r8
            int r8 = r12.rightMargin
            float r8 = (float) r8
            float r11 = r11 + r8
            float r11 = r11 + r0
            int r0 = r15.leftMargin
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r15.rightMargin
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r2.leftMargin
            float r0 = (float) r0
            float r11 = r11 + r0
            int r0 = r2.rightMargin
        L_0x0975:
            float r0 = (float) r0
            float r11 = r11 + r0
            int r11 = (int) r11
            goto L_0x097e
        L_0x0979:
            r20 = r0
            r24 = r2
            r11 = 0
        L_0x097e:
            int r5 = r5 - r11
            r7.f27483d = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "add discount limit leftSpace:"
            r0.append(r2)
            int r2 = r7.f27483d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x099d
        L_0x099a:
            r10 = r37
            r0 = 0
        L_0x099d:
            if (r0 != 0) goto L_0x09b8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "limit discount show_box_item:"
            r0.append(r2)
            pe3.b r2 = r3.f186626e
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x09b8:
            r15 = r38
            r14 = r6
            r12 = r7
            r2 = r10
            r6 = r17
            r13 = r20
            r3 = r22
            r11 = r23
            r5 = r24
        L_0x09c7:
            r0 = r34
            goto L_0x00f5
        L_0x09cb:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sp1.C64068b0.mo88820c(java.lang.String, te3.fp1, boolean, android.view.ViewGroup, int, fy3.a, wx3.d):java.lang.Object");
    }
}
