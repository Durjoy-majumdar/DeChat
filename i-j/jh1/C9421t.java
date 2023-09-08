package jh1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C55006x0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fh1.C8034e1;
import fh1.C8036f1;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64622p31;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: jh1.t */
public final class C9421t {

    /* renamed from: a */
    public final View f29389a;

    /* renamed from: b */
    public final C8036f1 f29390b;

    /* renamed from: c */
    public final String f29391c = "Finder.MileStoneVoteWidget";

    /* renamed from: d */
    public boolean f29392d;

    /* renamed from: e */
    public final ArrayList<C9433z> f29393e = new ArrayList<>();

    /* renamed from: f */
    public WxRecyclerView f29394f;

    /* renamed from: g */
    public boolean f29395g;

    /* renamed from: h */
    public C32229r<? super RecyclerView.C16613e<C60905o>, ? super View, ? super Integer, ? super C60905o, C13598b0> f29396h;

    /* renamed from: i */
    public C32228q<? super C55006x0.C0697b, ? super Boolean, ? super Boolean, C13598b0> f29397i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneVoteWidget", mo125469f = "MileStoneVoteWidget.kt", mo125470l = {44}, mo125471m = "refreshVoteContent")
    /* renamed from: jh1.t$a */
    public static final class C9422a extends C66704d {

        /* renamed from: d */
        public Object f29398d;

        /* renamed from: e */
        public Object f29399e;

        /* renamed from: f */
        public boolean f29400f;

        /* renamed from: g */
        public /* synthetic */ Object f29401g;

        /* renamed from: h */
        public final /* synthetic */ C9421t f29402h;

        /* renamed from: i */
        public int f29403i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9422a(C9421t tVar, C15601d<? super C9422a> dVar) {
            super(dVar);
            this.f29402h = tVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f29401g = obj;
            this.f29403i |= Integer.MIN_VALUE;
            return this.f29402h.mo10140c((String) null, false, this);
        }
    }

    /* renamed from: jh1.t$b */
    public static final class C9423b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f29404d;

        /* renamed from: e */
        public final /* synthetic */ C9421t f29405e;

        /* renamed from: f */
        public final /* synthetic */ String f29406f;

        public C9423b(View view, C9421t tVar, String str) {
            this.f29404d = view;
            this.f29405e = tVar;
            this.f29406f = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f29404d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C9421t tVar = this.f29405e;
            tVar.f29397i = null;
            C8036f1 f1Var = tVar.f29390b;
            String str = this.f29406f;
            if (str == null) {
                str = "";
            }
            f1Var.getClass();
            String str2 = f1Var.f26739j;
            Log.m105924i(str2, "backToLottery " + str);
            View view4 = f1Var.f26740n;
            if (view4 != null) {
                if (f1Var.f26742p == null) {
                    f1Var.f26742p = new C60834n(view4, f1Var);
                }
                C0000n0 n0Var = f1Var.f26744r;
                if (n0Var != null) {
                    C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C8034e1(f1Var, str, (C15601d<? super C8034e1>) null), 3, (Object) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jh1.t$c */
    public static final class C9424c extends C87413o implements C32228q<C55006x0.C0697b, Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9421t f29407d;

        /* renamed from: e */
        public final /* synthetic */ View f29408e;

        /* renamed from: f */
        public final /* synthetic */ TextView f29409f;

        /* renamed from: g */
        public final /* synthetic */ C64622p31 f29410g;

        /* renamed from: h */
        public final /* synthetic */ TextView f29411h;

        /* renamed from: i */
        public final /* synthetic */ View f29412i;

        /* renamed from: j */
        public final /* synthetic */ String f29413j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9424c(C9421t tVar, View view, TextView textView, C64622p31 p312, TextView textView2, View view2, String str) {
            super(3);
            this.f29407d = tVar;
            this.f29408e = view;
            this.f29409f = textView;
            this.f29410g = p312;
            this.f29411h = textView2;
            this.f29412i = view2;
            this.f29413j = str;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C55006x0.C0697b bVar = (C55006x0.C0697b) obj;
            ((Boolean) obj2).booleanValue();
            ((Boolean) obj3).booleanValue();
            C87412m.m108594g(bVar, "data");
            this.f29407d.mo10139b(bVar, this.f29408e, this.f29409f);
            if (bVar.f1648a != 1) {
                C9421t tVar = this.f29407d;
                String str = this.f29410g.f184746d;
                if (str == null) {
                    str = "";
                }
                TextView textView = this.f29411h;
                C87412m.m108593f(textView, "voteBtn");
                View view = this.f29412i;
                C87412m.m108593f(view, "voteContainer");
                tVar.mo10141d(str, textView, view, this.f29413j, false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: jh1.t$d */
    public static final class C9425d extends C87413o implements C32229r<RecyclerView.C16613e<C60905o>, View, Integer, C60905o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9421t f29414d;

        /* renamed from: e */
        public final /* synthetic */ String f29415e;

        /* renamed from: f */
        public final /* synthetic */ TextView f29416f;

        /* renamed from: g */
        public final /* synthetic */ View f29417g;

        /* renamed from: h */
        public final /* synthetic */ String f29418h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9425d(C9421t tVar, String str, TextView textView, View view, String str2) {
            super(4);
            this.f29414d = tVar;
            this.f29415e = str;
            this.f29416f = textView;
            this.f29417g = view;
            this.f29418h = str2;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            RecyclerView.C16613e eVar = (RecyclerView.C16613e) obj;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g((View) obj2, "view");
            C87412m.m108594g((C60905o) obj4, "holder");
            C9421t tVar = this.f29414d;
            if (!tVar.f29395g) {
                Log.m105924i(tVar.f29391c, "enableChoiceClick false, ignore click");
            } else {
                C9433z zVar = (C9433z) C110818d0.m150917O(tVar.f29393e, intValue);
                if (zVar != null) {
                    boolean z = zVar.f29455e;
                    String str = this.f29414d.f29391c;
                    Log.m105924i(str, "click pos:" + intValue + ", preSelected:" + z);
                    if (z) {
                        zVar.f29455e = false;
                        this.f29414d.mo10141d(this.f29415e, this.f29416f, this.f29417g, this.f29418h, false);
                        this.f29416f.setOnClickListener(C9427u.f29420d);
                    } else {
                        Iterator<C9433z> it = this.f29414d.f29393e.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            } else if (it.next().f29455e) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        if (i >= 0 && i < this.f29414d.f29393e.size()) {
                            String str2 = this.f29414d.f29391c;
                            Log.m105924i(str2, "reset last:" + i);
                            C9433z zVar2 = (C9433z) C110818d0.m150917O(this.f29414d.f29393e, i);
                            if (zVar2 != null) {
                                zVar2.f29455e = false;
                            }
                            eVar.notifyItemChanged(i);
                        }
                        zVar.f29455e = true;
                        this.f29414d.mo10141d(this.f29415e, this.f29416f, this.f29417g, this.f29418h, false);
                        TextView textView = this.f29416f;
                        textView.setOnClickListener(new C9428v(this.f29415e, this.f29414d, zVar, this.f29418h, textView, this.f29417g));
                    }
                    eVar.notifyItemChanged(intValue);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: jh1.t$e */
    public static final class C9426e implements View.OnClickListener {

        /* renamed from: d */
        public static final C9426e f29419d = new C9426e();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget$refreshVoteState$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C9421t(View view, C8036f1 f1Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(f1Var, "controller");
        this.f29389a = view;
        this.f29390b = f1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9119a(jh1.C9421t r22, jh1.C9433z r23, java.lang.String r24, android.widget.TextView r25, java.lang.String r26, android.view.View r27, wx3.C15601d r28) {
        /*
            r0 = r22
            r1 = r23
            r2 = r28
            r22.getClass()
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            boolean r4 = r2 instanceof jh1.C9432y
            if (r4 == 0) goto L_0x001e
            r4 = r2
            jh1.y r4 = (jh1.C9432y) r4
            int r5 = r4.f29453o
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f29453o = r5
            goto L_0x0023
        L_0x001e:
            jh1.y r4 = new jh1.y
            r4.<init>(r0, r2)
        L_0x0023:
            java.lang.Object r2 = r4.f29451j
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f29453o
            r7 = 2
            r8 = 1
            r9 = 0
            r10 = 3
            if (r6 == 0) goto L_0x0080
            if (r6 == r8) goto L_0x005b
            if (r6 == r7) goto L_0x0046
            if (r6 != r10) goto L_0x003e
            java.lang.Object r0 = r4.f29445d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0170
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            java.lang.Object r0 = r4.f29448g
            bi1.e r0 = (bi1.C0287e) r0
            java.lang.Object r1 = r4.f29447f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r4.f29446e
            jh1.z r3 = (jh1.C9433z) r3
            java.lang.Object r6 = r4.f29445d
            jh1.t r6 = (jh1.C9421t) r6
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0135
        L_0x005b:
            java.lang.Object r0 = r4.f29450i
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r1 = r4.f29449h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r4.f29448g
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.Object r6 = r4.f29447f
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r8 = r4.f29446e
            jh1.z r8 = (jh1.C9433z) r8
            java.lang.Object r11 = r4.f29445d
            jh1.t r11 = (jh1.C9421t) r11
            kotlin.ResultKt.throwOnFailure(r2)
            r18 = r0
            r14 = r1
            r17 = r3
            r3 = r6
            r1 = r8
            r0 = r11
            goto L_0x00ff
        L_0x0080:
            kotlin.ResultKt.throwOnFailure(r2)
            ws1.a r2 = new ws1.a
            fh1.f1 r6 = r0.f29390b
            androidx.lifecycle.i0 r6 = r6.business(r3)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r13 = r6.f182392d
            fh1.f1 r6 = r0.f29390b
            androidx.lifecycle.i0 r6 = r6.business(r3)
            cl1.u r6 = (cl1.C55001u) r6
            long r11 = r6.f154416j
            fh1.f1 r6 = r0.f29390b
            androidx.lifecycle.i0 r6 = r6.business(r3)
            cl1.u r6 = (cl1.C55001u) r6
            java.lang.String r6 = r6.f154423t
            te3.yv r15 = r1.f29454d
            int r15 = r15.f145527d
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r15)
            java.util.List r18 = sx3.C26236u.m33719b(r10)
            fh1.f1 r10 = r0.f29390b
            androidx.lifecycle.i0 r3 = r10.business(r3)
            cl1.u r3 = (cl1.C55001u) r3
            byte[] r3 = r3.f154417n
            r10 = r11
            r12 = r2
            r15 = r10
            r17 = r6
            r19 = r24
            r20 = r3
            r12.<init>(r13, r15, r17, r18, r19, r20)
            android.content.Context r13 = r25.getContext()
            java.lang.String r3 = "voteBtn.context"
            gy3.C87412m.m108593f(r13, r3)
            r14 = 0
            r15 = 0
            r17 = 6
            r18 = 0
            it1.C60625c.m70894l(r12, r13, r14, r15, r17, r18)
            r4.f29445d = r0
            r4.f29446e = r1
            r3 = r24
            r4.f29447f = r3
            r6 = r25
            r4.f29448g = r6
            r10 = r26
            r4.f29449h = r10
            r11 = r27
            r4.f29450i = r11
            r4.f29453o = r8
            java.lang.Object r2 = bi1.C0283d.m245c(r2, r9, r4, r8, r9)
            if (r2 != r5) goto L_0x00fa
            goto L_0x0172
        L_0x00fa:
            r17 = r6
            r14 = r10
            r18 = r11
        L_0x00ff:
            bi1.e r2 = (bi1.C0287e) r2
            boolean r6 = r2 instanceof bi1.C0288f
            if (r6 == 0) goto L_0x013c
            wx3.f r6 = r2.f854a
            if (r6 != 0) goto L_0x010d
            wx3.f r6 = r4.getContext()
        L_0x010d:
            jh1.x r8 = new jh1.x
            r12 = 0
            r10 = r8
            r11 = r2
            r13 = r0
            r15 = r1
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            r4.f29445d = r0
            r4.f29446e = r1
            r4.f29447f = r3
            r4.f29448g = r2
            r4.f29449h = r9
            r4.f29450i = r9
            r4.f29453o = r7
            java.lang.Object r6 = a14.C53895h.m60469g(r6, r8, r4)
            if (r6 != r5) goto L_0x012e
            goto L_0x0172
        L_0x012e:
            r6 = r0
            r0 = r2
            r21 = r3
            r3 = r1
            r1 = r21
        L_0x0135:
            r2 = r0
            r0 = r6
            r21 = r3
            r3 = r1
            r1 = r21
        L_0x013c:
            boolean r6 = r2 instanceof bi1.C0281b
            if (r6 == 0) goto L_0x0170
            wx3.f r6 = r2.f854a
            if (r6 != 0) goto L_0x0148
            wx3.f r6 = r4.getContext()
        L_0x0148:
            jh1.w r7 = new jh1.w
            r8 = 0
            r22 = r7
            r23 = r2
            r24 = r8
            r25 = r0
            r26 = r1
            r27 = r3
            r22.<init>(r23, r24, r25, r26, r27)
            r4.f29445d = r2
            r4.f29446e = r9
            r4.f29447f = r9
            r4.f29448g = r9
            r4.f29449h = r9
            r4.f29450i = r9
            r0 = 3
            r4.f29453o = r0
            java.lang.Object r0 = a14.C53895h.m60469g(r6, r7, r4)
            if (r0 != r5) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            rx3.b0 r5 = rx3.C13598b0.f38549a
        L_0x0172:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C9421t.m9119a(jh1.t, jh1.z, java.lang.String, android.widget.TextView, java.lang.String, android.view.View, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v14, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10139b(cl1.C55006x0.C0697b r23, android.view.View r24, android.widget.TextView r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r10 = r24
            r11 = r25
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12 = 0
            if (r1 == 0) goto L_0x015e
            java.util.ArrayList<jh1.z> r3 = r0.f29393e
            java.util.Iterator r3 = r3.iterator()
        L_0x0017:
            boolean r4 = r3.hasNext()
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r3.next()
            r7 = r4
            jh1.z r7 = (jh1.C9433z) r7
            te3.yv r7 = r7.f29454d
            int r7 = r7.f145529f
            if (r7 <= 0) goto L_0x002e
            r7 = 1
            goto L_0x002f
        L_0x002e:
            r7 = 0
        L_0x002f:
            if (r7 == 0) goto L_0x0017
            goto L_0x0033
        L_0x0032:
            r4 = r5
        L_0x0033:
            if (r4 == 0) goto L_0x0037
            r3 = 1
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            int r4 = r1.f1649b
            if (r6 > r4) goto L_0x0042
            r7 = 60
            if (r4 >= r7) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 != 0) goto L_0x0049
            if (r3 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            java.lang.String r4 = r0.f29391c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "refreshVoteCountDownText selfVoted:"
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", showCountDown:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = ", data.localRemainTime:"
            r7.append(r8)
            int r8 = r1.f1649b
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            if (r10 == 0) goto L_0x007d
            r4 = 2131316569(0x7f094f59, float:1.8251623E38)
            android.view.View r4 = r10.findViewById(r4)
            r5 = r4
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x007d:
            r13 = r5
            int r4 = r1.f1649b
            if (r4 > 0) goto L_0x00a2
            if (r3 == 0) goto L_0x00a2
            if (r11 != 0) goto L_0x0087
            goto L_0x008c
        L_0x0087:
            java.lang.String r1 = ""
            r11.setText(r1)
        L_0x008c:
            if (r13 != 0) goto L_0x0090
            goto L_0x01a0
        L_0x0090:
            android.view.View r1 = r0.f29389a
            android.content.Context r1 = r1.getContext()
            r2 = 2131827808(0x7f111c60, float:1.928854E38)
            java.lang.String r1 = r1.getString(r2)
            r13.setText(r1)
            goto L_0x01a0
        L_0x00a2:
            if (r6 == 0) goto L_0x011a
            if (r10 != 0) goto L_0x00a7
            goto L_0x00ea
        L_0x00a7:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r14.mo10233c(r2)
            java.lang.Object[] r3 = r14.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r5 = "refreshCountDownText"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r24
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r14.mo10231a(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r4 = "refreshCountDownText"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r24
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x00ea:
            y50.n0$a r14 = y50.C15936n0.f42815a
            int r15 = r1.f1649b
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 24
            r21 = 0
            java.lang.String r16 = ":"
            java.lang.String r1 = y50.C15936n0.C15937a.m14866a(r14, r15, r16, r17, r18, r19, r20, r21)
            if (r11 != 0) goto L_0x0101
            goto L_0x0104
        L_0x0101:
            r11.setText(r1)
        L_0x0104:
            if (r13 != 0) goto L_0x0108
            goto L_0x01a0
        L_0x0108:
            android.view.View r1 = r0.f29389a
            android.content.Context r1 = r1.getContext()
            r2 = 2131827814(0x7f111c66, float:1.9288551E38)
            java.lang.String r1 = r1.getString(r2)
            r13.setText(r1)
            goto L_0x01a0
        L_0x011a:
            if (r10 != 0) goto L_0x011e
            goto L_0x01a0
        L_0x011e:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r9.mo10233c(r2)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r4 = "refreshCountDownText"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r24
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r3 = "refreshCountDownText"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r24
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01a0
        L_0x015e:
            if (r10 != 0) goto L_0x0161
            goto L_0x01a0
        L_0x0161:
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r9.mo10233c(r2)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r4 = "refreshCountDownText"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r24
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r9.mo10231a(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r10.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r3 = "refreshCountDownText"
            java.lang.String r4 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveMilestoneLotterySlice$MilestoneLotteryInfoWrapper;Landroid/view/View;Landroid/widget/TextView;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r24
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C9421t.mo10139b(cl1.x0$b, android.view.View, android.widget.TextView):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10140c(java.lang.String r22, boolean r23, wx3.C15601d<? super rx3.C13598b0> r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            java.lang.Class<cl1.x0> r3 = cl1.C55006x0.class
            boolean r4 = r2 instanceof jh1.C9421t.C9422a
            if (r4 == 0) goto L_0x001b
            r4 = r2
            jh1.t$a r4 = (jh1.C9421t.C9422a) r4
            int r5 = r4.f29403i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f29403i = r5
            goto L_0x0020
        L_0x001b:
            jh1.t$a r4 = new jh1.t$a
            r4.<init>(r0, r2)
        L_0x0020:
            java.lang.Object r2 = r4.f29401g
            xx3.a r5 = xx3.C15911a.COROUTINE_SUSPENDED
            int r6 = r4.f29403i
            java.lang.String r7 = ""
            r8 = 1
            if (r6 == 0) goto L_0x0045
            if (r6 != r8) goto L_0x003d
            boolean r1 = r4.f29400f
            java.lang.Object r5 = r4.f29399e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.f29398d
            jh1.t r4 = (jh1.C9421t) r4
            kotlin.ResultKt.throwOnFailure(r2)
            r10 = r1
            r1 = r5
            goto L_0x006d
        L_0x003d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r2)
            fh1.f1 r2 = r0.f29390b
            androidx.lifecycle.i0 r2 = r2.business(r3)
            cl1.x0 r2 = (cl1.C55006x0) r2
            if (r1 != 0) goto L_0x0054
            r6 = r7
            goto L_0x0055
        L_0x0054:
            r6 = r1
        L_0x0055:
            android.view.View r9 = r0.f29389a
            android.content.Context r9 = r9.getContext()
            r4.f29398d = r0
            r4.f29399e = r1
            r10 = r23
            r4.f29400f = r10
            r4.f29403i = r8
            java.lang.Object r2 = r2.mo76054f3(r6, r9, r8, r4)
            if (r2 != r5) goto L_0x006c
            return r5
        L_0x006c:
            r4 = r0
        L_0x006d:
            te3.p31 r2 = (te3.C64622p31) r2
            if (r2 != 0) goto L_0x007b
            java.lang.String r1 = r4.f29391c
            java.lang.String r2 = "refreshVoteContent lotteryInfo null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x007b:
            android.view.View r5 = r4.f29389a
            r6 = 2131308856(0x7f093138, float:1.823598E38)
            android.view.View r5 = r5.findViewById(r6)
            android.view.View r6 = r4.f29389a
            r9 = 2131308249(0x7f092ed9, float:1.8234748E38)
            android.view.View r6 = r6.findViewById(r9)
            android.view.View r9 = r4.f29389a
            r11 = 2131316612(0x7f094f84, float:1.825171E38)
            android.view.View r9 = r9.findViewById(r11)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r19 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r19)
            r15.mo10233c(r11)
            java.lang.Object[] r12 = r15.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r14 = "refreshVoteContent"
            java.lang.String r16 = "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r11 = r5
            r8 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r20
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            r15 = 0
            java.lang.Object r8 = r8.mo10231a(r15)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r5.setVisibility(r8)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r13 = "refreshVoteContent"
            java.lang.String r14 = "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r5 = 0
            r15 = r8
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r19)
            r8.mo10233c(r11)
            java.lang.Object[] r12 = r8.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r14 = "refreshVoteContent"
            java.lang.String r15 = "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r6
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r13 = "refreshVoteContent"
            java.lang.String r14 = "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r8.mo10233c(r11)
            java.lang.Object[] r13 = r8.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r15 = "refreshVoteContent"
            java.lang.String r16 = "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r9
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9.setVisibility(r8)
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget"
            java.lang.String r14 = "refreshVoteContent"
            java.lang.String r15 = "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            if (r10 == 0) goto L_0x0168
            fh1.f1 r8 = r4.f29390b
            r10 = 1
            r8.mo9119F3(r6, r9, r10)
        L_0x0168:
            te3.bx2 r6 = r2.f184750h
            r8 = 2131316549(0x7f094f45, float:1.8251583E38)
            android.view.View r8 = r9.findViewById(r8)
            if (r8 == 0) goto L_0x017b
            jh1.t$b r10 = new jh1.t$b
            r10.<init>(r9, r4, r1)
            r8.setOnClickListener(r10)
        L_0x017b:
            r1 = 2131316624(0x7f094f90, float:1.8251735E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0189
            er1.C7919x.m8091a(r1)
        L_0x0189:
            r1 = 2131316577(0x7f094f61, float:1.825164E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r6 == 0) goto L_0x0199
            java.lang.String r8 = r6.f131373h
            if (r8 == 0) goto L_0x0199
            goto L_0x01a6
        L_0x0199:
            android.view.View r8 = r4.f29389a
            android.content.Context r8 = r8.getContext()
            r10 = 2131827905(0x7f111cc1, float:1.9288736E38)
            java.lang.String r8 = r8.getString(r10)
        L_0x01a6:
            r1.setText(r8)
            r1 = 2131316613(0x7f094f85, float:1.8251712E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r8 = "questionTv"
            gy3.C87412m.m108593f(r1, r8)
            er1.C7919x.m8091a(r1)
            if (r6 == 0) goto L_0x01c1
            java.lang.String r8 = r6.f131372g
            if (r8 == 0) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            r8 = r7
        L_0x01c2:
            r1.setText(r8)
            r1 = 2131316548(0x7f094f44, float:1.825158E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8 = 2131316626(0x7f094f92, float:1.8251739E38)
            android.view.View r8 = r9.findViewById(r8)
            r10 = 2131316629(0x7f094f95, float:1.8251745E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x01e3
            er1.C7919x.m8091a(r10)
        L_0x01e3:
            java.lang.String r10 = r4.f29391c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "MileStoneVoteWidget initViews "
            r11.append(r12)
            boolean r12 = r4.f29392d
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            boolean r10 = r4.f29392d
            if (r10 == 0) goto L_0x0200
            goto L_0x0240
        L_0x0200:
            r10 = 1
            r4.f29392d = r10
            r10 = 2131299535(0x7f090ccf, float:1.8217074E38)
            android.view.View r10 = r9.findViewById(r10)
            com.tencent.mm.view.recyclerview.WxRecyclerView r10 = (com.tencent.p014mm.view.recyclerview.WxRecyclerView) r10
            r4.f29394f = r10
            if (r10 == 0) goto L_0x0240
            androidx.recyclerview.widget.LinearLayoutManager r11 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r12 = r10.getContext()
            r11.<init>(r12)
            r10.setLayoutManager(r11)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r11 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneVoteWidget$initViews$1$1 r12 = new com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneVoteWidget$initViews$1$1
            r12.<init>()
            java.util.ArrayList<jh1.z> r13 = r4.f29393e
            r11.<init>(r12, r13, r5)
            jh1.r r5 = new jh1.r
            r5.<init>(r4)
            r11.f173488o = r5
            r10.setAdapter(r11)
            int r5 = r10.getItemDecorationCount()
            if (r5 > 0) goto L_0x0240
            jh1.s r5 = new jh1.s
            r5.<init>(r4)
            r10.mo17085h0(r5)
        L_0x0240:
            if (r6 == 0) goto L_0x024a
            java.lang.String r5 = r6.f131370e
            if (r5 != 0) goto L_0x0247
            goto L_0x024a
        L_0x0247:
            r18 = r5
            goto L_0x024c
        L_0x024a:
            r18 = r7
        L_0x024c:
            java.util.ArrayList<jh1.z> r5 = r4.f29393e
            r5.clear()
            java.util.ArrayList<jh1.z> r5 = r4.f29393e
            if (r6 == 0) goto L_0x0282
            java.util.LinkedList<te3.yv> r6 = r6.f131371f
            if (r6 == 0) goto L_0x0282
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 10
            int r11 = sx3.C36907w.m41090l(r6, r11)
            r10.<init>(r11)
            java.util.Iterator r6 = r6.iterator()
        L_0x0268:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0284
            java.lang.Object r11 = r6.next()
            te3.yv r11 = (te3.C52172yv) r11
            jh1.z r12 = new jh1.z
            java.lang.String r13 = "it"
            gy3.C87412m.m108593f(r11, r13)
            r12.<init>(r11)
            r10.add(r12)
            goto L_0x0268
        L_0x0282:
            sx3.f0 r10 = sx3.C64186f0.f181907d
        L_0x0284:
            r5.addAll(r10)
            java.lang.String r5 = r4.f29391c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "dataList size:"
            r6.append(r10)
            java.util.ArrayList<jh1.z> r10 = r4.f29393e
            int r10 = r10.size()
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.String r5 = r2.f184746d
            if (r5 != 0) goto L_0x02a9
            r12 = r7
            goto L_0x02aa
        L_0x02a9:
            r12 = r5
        L_0x02aa:
            java.lang.String r5 = "voteBtn"
            gy3.C87412m.m108593f(r1, r5)
            java.lang.String r5 = "voteContainer"
            gy3.C87412m.m108593f(r8, r5)
            r16 = 1
            r11 = r4
            r13 = r1
            r14 = r8
            r15 = r18
            r11.mo10141d(r12, r13, r14, r15, r16)
            r5 = 2131316568(0x7f094f58, float:1.8251621E38)
            android.view.View r13 = r9.findViewById(r5)
            r5 = 2131316570(0x7f094f5a, float:1.8251625E38)
            android.view.View r5 = r9.findViewById(r5)
            r14 = r5
            android.widget.TextView r14 = (android.widget.TextView) r14
            fh1.f1 r5 = r4.f29390b
            androidx.lifecycle.i0 r3 = r5.business(r3)
            cl1.x0 r3 = (cl1.C55006x0) r3
            cl1.x0$b r3 = r3.mo76053e3()
            r4.mo10139b(r3, r13, r14)
            jh1.t$c r3 = new jh1.t$c
            r11 = r3
            r12 = r4
            r15 = r2
            r16 = r1
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r4.f29397i = r3
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jh1.C9421t.mo10140c(java.lang.String, boolean, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final void mo10141d(String str, TextView textView, View view, String str2, boolean z) {
        T t;
        T t2;
        WxRecyclerView wxRecyclerView;
        RecyclerView.C16613e adapter;
        boolean z2;
        TextView textView2 = textView;
        View view2 = view;
        Iterator<T> it = this.f29393e.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (((C9433z) t2).f29454d.f145529f > 0) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        boolean z3 = t2 != null;
        Iterator<T> it4 = this.f29393e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next = it4.next();
            if (((C9433z) next).f29455e) {
                t = next;
                break;
            }
        }
        boolean z4 = t != null;
        C55006x0.C0697b e3 = ((C55006x0) this.f29390b.business(C55006x0.class)).mo76053e3();
        boolean z5 = (e3 != null ? e3.f1648a : 1) == 1;
        Log.m105924i(this.f29391c, "refreshVoteState selfVoted:" + z3 + ", hasSelected:" + z4 + ", isRunning:" + z5);
        if (z3) {
            textView2.setVisibility(8);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            long j = 0;
            for (C9433z zVar : this.f29393e) {
                zVar.f29456f = true;
                if (zVar.f29455e && zVar.f29454d.f145530g < 1) {
                    Log.m105924i(this.f29391c, "refreshVoteState " + zVar.f29458h + " modify select_count to 1");
                    zVar.f29454d.f145530g = 1;
                }
                j += (long) zVar.f29454d.f145530g;
            }
            for (C9433z zVar2 : this.f29393e) {
                zVar2.f29457g = j;
            }
            Log.m105924i(this.f29391c, "refreshVoteState totalCount:" + j);
        } else {
            textView2.setVisibility(0);
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneVoteWidget", "refreshVoteState", "(Ljava/lang/String;Landroid/widget/TextView;Landroid/view/View;Ljava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            for (C9433z zVar3 : this.f29393e) {
                zVar3.f29456f = false;
            }
            if (z5) {
                if (z) {
                    C9406j.m9112f(C9406j.f29357a, str, 7, (String) null, (String) null, (Integer) null, 28, (Object) null);
                }
                textView2.setText(this.f29389a.getContext().getString(C0966R.string.ndt));
                if (z4) {
                    textView2.setBackgroundResource(C0966R.C0969drawable.cq8);
                    textView2.setTextColor(this.f29389a.getContext().getResources().getColor(C0966R.color.aoo));
                } else {
                    textView2.setBackgroundResource(C0966R.C0969drawable.cq9);
                    textView2.setTextColor(this.f29389a.getContext().getResources().getColor(C0966R.color.aok));
                }
            } else {
                textView2.setText(this.f29389a.getContext().getString(C0966R.string.ndh));
                textView2.setBackgroundResource(C0966R.C0969drawable.cq9);
                textView2.setTextColor(this.f29389a.getContext().getResources().getColor(C0966R.color.aok));
            }
        }
        Log.m105924i(this.f29391c, "refresh onChoiceClickListener, lotteryId:" + str + ", voteId:" + str2);
        boolean z6 = z3;
        boolean z7 = z5;
        this.f29396h = new C9425d(this, str, textView, view, str2);
        if (z6 || !z7) {
            this.f29395g = false;
            textView2.setOnClickListener(C9426e.f29419d);
        } else {
            this.f29395g = true;
        }
        Log.m105924i(this.f29391c, "refresh enableChoiceClick:" + this.f29395g);
        if (z && (wxRecyclerView = this.f29394f) != null && (adapter = wxRecyclerView.getAdapter()) != null) {
            adapter.notifyDataSetChanged();
        }
    }
}
