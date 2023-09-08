package kj1;

import a14.C0000n0;
import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import android.widget.TextView;
import cl1.C0691u1;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.plugin.finder.view.LoadingSwitchBtn;
import com.tencent.p014mm.sdk.coroutines.SafeResume;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C7335d;
import di3.C86312j;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kj1.C10125e1;
import lj1.C10535c;
import nk1.C61791o;
import ok1.C62042e;
import p564iq.C87790d;
import qo3.C101218e0;
import rx3.C13598b0;
import te3.C50415mk1;
import te3.C51503u71;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.y */
public final class C10267y extends C10535c {

    /* renamed from: h */
    public final String f31314h;

    /* renamed from: kj1.y$a */
    public static final class C10268a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C10267y f31315d;

        /* renamed from: e */
        public final /* synthetic */ C10125e1 f31316e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10268a(C10267y yVar, C10125e1 e1Var) {
            super(0);
            this.f31315d = yVar;
            this.f31316e = e1Var;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f31315d.mo10805j() ? ((C54991o) this.f31316e.mo10534b(C54991o.class)).mo75963I3() : C62042e.f176370a.mo87067b1(this.f31316e.f30982b));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.AnchorRewardOption$addItem$1$2", mo125469f = "AnchorRewardOption.kt", mo125470l = {184}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.y$b */
    public static final class C10269b extends C91594j implements C32227p<Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31317d;

        /* renamed from: e */
        public Object f31318e;

        /* renamed from: f */
        public int f31319f;

        /* renamed from: g */
        public /* synthetic */ boolean f31320g;

        /* renamed from: h */
        public final /* synthetic */ C10267y f31321h;

        /* renamed from: i */
        public final /* synthetic */ C10125e1 f31322i;

        /* renamed from: kj1.y$b$a */
        public static final class C10270a implements C101218e0.C12907m {

            /* renamed from: a */
            public final /* synthetic */ C101218e0 f31323a;

            public C10270a(C101218e0 e0Var) {
                this.f31323a = e0Var;
            }

            /* renamed from: a */
            public final void mo2001a() {
                this.f31323a.mo140680z();
            }
        }

        /* renamed from: kj1.y$b$b */
        public static final class C10271b extends C87413o implements C32227p<Boolean, C50415mk1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f31324d;

            /* renamed from: e */
            public final /* synthetic */ C10125e1 f31325e;

            /* renamed from: f */
            public final /* synthetic */ C10267y f31326f;

            /* renamed from: g */
            public final /* synthetic */ SafeResume<Boolean> f31327g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C10271b(boolean z, C10125e1 e1Var, C10267y yVar, SafeResume<Boolean> safeResume) {
                super(2);
                this.f31324d = z;
                this.f31325e = e1Var;
                this.f31326f = yVar;
                this.f31327g = safeResume;
            }

            public Object invoke(Object obj, Object obj2) {
                String str;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C50415mk1 mk12 = (C50415mk1) obj2;
                Class cls = C54108o.class;
                C87412m.m108593f(this.f31324d ? this.f31325e.f30985d.getResources().getString(C0966R.string.dol) : this.f31325e.f30985d.getResources().getString(C0966R.string.doe), "if (check) {\n           …                        }");
                int i = 1;
                boolean z = false;
                if (booleanValue) {
                    if (!this.f31324d) {
                        C10267y yVar = this.f31326f;
                        C10125e1 e1Var = this.f31325e;
                        yVar.getClass();
                        Class cls2 = C0691u1.class;
                        C87412m.m108594g(e1Var, "<this>");
                        C51503u71 value = ((C0691u1) e1Var.mo10534b(cls2)).f1637f.getValue();
                        if (value != null && value.f142641d) {
                            z = true;
                        }
                        if (z) {
                            ((C0691u1) e1Var.mo10534b(cls2)).f1640i.postValue(new C0691u1.C0692a());
                        }
                    }
                    C7335d c = C86312j.m106911c(cls);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8606g((C8777j5) c, this.f31324d ? C54067f0.C0064m.GIFT_OPEN : C54067f0.C0064m.GIFT_CLOSE, ((C54108o) C86312j.m106911c(cls)).Ex0(this.f31326f.mo10805j() ? C54067f0.C0062l.LIVING : C54067f0.C0062l.BEFORE), (String) null, 4, (Object) null);
                    if (this.f31325e.f30984c == 1) {
                        if (this.f31326f.mo10805j()) {
                            C7335d c2 = C86312j.m106911c(cls);
                            C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                            C8777j5 j5Var = (C8777j5) c2;
                            C0073g0 g0Var = C0073g0.GIFT_SWITCH;
                            if (this.f31324d) {
                                i = 2;
                            }
                            C8777j5.C8778a.m8605f(j5Var, g0Var, String.valueOf(i), (String) null, 4, (Object) null);
                        } else {
                            C7335d c3 = C86312j.m106911c(cls);
                            C87412m.m108593f(c3, "getService(HellLiveReport::class.java)");
                            C8777j5 j5Var2 = (C8777j5) c3;
                            if (this.f31324d) {
                                i = 2;
                            }
                            C8777j5.C8778a.m8600a(j5Var2, 16, String.valueOf(i), (String) null, 4, (Object) null);
                        }
                    }
                } else if (!(!this.f31324d || mk12 == null || (str = mk12.f138082e) == null)) {
                    if (str.length() <= 0) {
                        i = 0;
                    }
                    if (i == 0) {
                        str = null;
                    }
                    if (str != null) {
                        C10125e1 e1Var2 = this.f31325e;
                        C101218e0 e0Var = new C101218e0(e1Var2.f30985d, 2, 2, true, true);
                        e0Var.mo140677w(MMApplicationContext.getContext().getResources().getString(C0966R.string.f8028zq));
                        e0Var.mo140676v(6);
                        TextView textView = new TextView(e1Var2.f30985d);
                        textView.setPaddingRelative((int) textView.getContext().getResources().getDimension(C0966R.dimen.f3743cv), 0, 0, 0);
                        textView.setText(C0966R.string.dxf);
                        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.f3585yj));
                        textView.setTextSize(17.0f);
                        e0Var.mo140672r(textView);
                        TextView textView2 = new TextView(e1Var2.f30985d);
                        textView2.setText(str);
                        textView2.setTextColor(textView2.getContext().getResources().getColor(C0966R.color.f3585yj));
                        textView2.setTextSize(15.0f);
                        e0Var.mo140663j(textView2);
                        e0Var.f296375F = new C10278z(e0Var);
                        e0Var.mo140655A();
                    }
                }
                this.f31327g.resume(Boolean.valueOf(booleanValue));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10269b(C10267y yVar, C10125e1 e1Var, C15601d<? super C10269b> dVar) {
            super(2, dVar);
            this.f31321h = yVar;
            this.f31322i = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10269b bVar = new C10269b(this.f31321h, this.f31322i, dVar);
            bVar.f31320g = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10269b) create(Boolean.valueOf(((Boolean) obj).booleanValue()), (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0118 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f31319f
                r3 = 1
                if (r2 == 0) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r1 = r0.f31318e
                kj1.e1 r1 = (kj1.C10125e1) r1
                java.lang.Object r1 = r0.f31317d
                kj1.y r1 = (kj1.C10267y) r1
                kotlin.ResultKt.throwOnFailure(r18)
                r2 = r18
                goto L_0x0119
            L_0x001a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0022:
                kotlin.ResultKt.throwOnFailure(r18)
                boolean r2 = r0.f31320g
                kj1.y r4 = r0.f31321h
                r5 = 0
                r6 = 0
                lj1.C10536d.m10457e(r4, r6, r3, r5)
                kj1.y r4 = r0.f31321h
                kj1.e1 r5 = r0.f31322i
                r0.f31317d = r4
                r0.f31318e = r5
                r0.f31320g = r2
                r0.f31319f = r3
                a14.m r7 = new a14.m
                wx3.d r8 = xx3.C66447b.m78392b(r17)
                r7.<init>(r8, r3)
                r7.mo74609p()
                com.tencent.mm.sdk.coroutines.SafeResume r8 = new com.tencent.mm.sdk.coroutines.SafeResume
                r8.<init>(r7)
                boolean r9 = r4.mo10805j()
                if (r9 != 0) goto L_0x0104
                if (r2 == 0) goto L_0x0104
                fj1.b r9 = r5.f30982b
                java.lang.Class<cl1.o> r10 = cl1.C54991o.class
                androidx.lifecycle.i0 r9 = r9.mo71262a(r10)
                cl1.o r9 = (cl1.C54991o) r9
                te3.oh0 r9 = r9.f154282Y0
                if (r9 == 0) goto L_0x00f5
                boolean r10 = r9.f139178d
                if (r10 != 0) goto L_0x00f3
                qo3.e0 r10 = new qo3.e0
                com.tencent.mm.ui.MMActivity r12 = r5.f30985d
                r13 = 2
                r14 = 2
                r15 = 1
                r16 = 1
                r11 = r10
                r11.<init>(r12, r13, r14, r15, r16)
                com.tencent.mm.ui.MMActivity r11 = r5.f30985d
                android.content.res.Resources r11 = r11.getResources()
                r12 = 2131821556(0x7f1103f4, float:1.9275859E38)
                java.lang.String r11 = r11.getString(r12)
                r10.mo140677w(r11)
                r11 = 6
                r10.mo140676v(r11)
                android.widget.TextView r11 = new android.widget.TextView
                com.tencent.mm.ui.MMActivity r12 = r5.f30985d
                r11.<init>(r12)
                android.content.Context r12 = r11.getContext()
                android.content.res.Resources r12 = r12.getResources()
                r13 = 2131165337(0x7f070099, float:1.7944888E38)
                float r12 = r12.getDimension(r13)
                int r12 = (int) r12
                r11.setPaddingRelative(r12, r6, r6, r6)
                r6 = 2131828113(0x7f111d91, float:1.9289158E38)
                r11.setText(r6)
                android.content.Context r6 = r11.getContext()
                android.content.res.Resources r6 = r6.getResources()
                r12 = 2131100935(0x7f060507, float:1.7814265E38)
                int r6 = r6.getColor(r12)
                r11.setTextColor(r6)
                r6 = 1099431936(0x41880000, float:17.0)
                r11.setTextSize(r6)
                r10.mo140672r(r11)
                android.widget.TextView r6 = new android.widget.TextView
                com.tencent.mm.ui.MMActivity r11 = r5.f30985d
                r6.<init>(r11)
                java.lang.String r9 = r9.f139179e
                if (r9 == 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                java.lang.String r9 = ""
            L_0x00ce:
                r6.setText(r9)
                android.content.Context r9 = r6.getContext()
                android.content.res.Resources r9 = r9.getResources()
                int r9 = r9.getColor(r12)
                r6.setTextColor(r9)
                r9 = 1097859072(0x41700000, float:15.0)
                r6.setTextSize(r9)
                r10.mo140663j(r6)
                kj1.y$b$a r6 = new kj1.y$b$a
                r6.<init>(r10)
                r10.f296375F = r6
                r10.mo140655A()
                goto L_0x00f4
            L_0x00f3:
                r3 = 0
            L_0x00f4:
                r6 = r3
            L_0x00f5:
                if (r6 == 0) goto L_0x0104
                java.lang.String r2 = r5.f30980a
                java.lang.String r3 = "needBreak true"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r8.resume(r2)
                goto L_0x0112
            L_0x0104:
                r3 = 128(0x80, float:1.794E-43)
                boolean r6 = r4.mo10805j()
                kj1.y$b$b r9 = new kj1.y$b$b
                r9.<init>(r2, r5, r4, r8)
                r5.mo10537e(r3, r2, r6, r9)
            L_0x0112:
                java.lang.Object r2 = r7.mo74608o()
                if (r2 != r1) goto L_0x0119
                return r1
            L_0x0119:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kj1.C10267y.C10269b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10267y(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31314h = mo10805j() ? "anchorlive.more.morefunction.gift" : "startlive.more.morefunction.gift";
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31314h;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        C58969q b;
        Class cls = C54991o.class;
        C10125e1 e1Var = this.f31809a;
        if (mo10805j()) {
            return !C62042e.f176370a.mo87057Y0(e1Var.f30982b) && ((C54991o) e1Var.mo10534b(cls)).f154243Q1 && ((C54991o) e1Var.mo10534b(cls)).f154253S1 && ((C87790d) C86312j.m106911c(C87790d.class)).isInstalled("xlab");
        }
        C61791o oVar = C61791o.f175673a;
        C10125e1.C10132d dVar = e1Var.f30989h;
        return oVar.mo86720b((dVar == null || (b = dVar.mo10555b()) == null) ? 0 : b.field_liveSwitchFlag);
    }

    /* renamed from: n */
    public void mo10520n(C10125e1 e1Var, C4191v0 v0Var) {
        Class cls = C54108o.class;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(v0Var, "bottomSheet");
        View view = v0Var.f18463f;
        boolean I3 = mo10805j() ? ((C54991o) e1Var.mo10534b(C54991o.class)).mo75963I3() : C62042e.f176370a.mo87067b1(e1Var.f30982b);
        View findViewById = view.findViewById(C0966R.C0970id.ck_);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.mbd);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LoadingSwitchBtn d = e1Var.mo10536d(view, C0966R.C0970id.o47, I3);
        C0000n0 h = mo10803h();
        if (h != null) {
            d.mo4816f(h, new C10268a(this, e1Var), new C10269b(this, e1Var, (C15601d<? super C10269b>) null));
        }
        ((C54108o) C86312j.m106911c(cls)).mo9602Jz(I3 ? C54067f0.C0066n.GIFT_CLOSE : C54067f0.C0066n.GIFT_OPEN, ((C54108o) C86312j.m106911c(cls)).Ex0(mo10805j() ? C54067f0.C0062l.LIVING : C54067f0.C0062l.BEFORE));
    }

    /* renamed from: o */
    public Integer mo10521o() {
        return Integer.valueOf(C0966R.C0970id.oo8);
    }
}
