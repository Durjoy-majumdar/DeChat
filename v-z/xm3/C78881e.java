package xm3;

import a11.C39479c;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C78047a;
import tm3.C78051b;
import tm3.C78055d;
import tm3.C78060i;
import tm3.C78069w;
import yb2.C15946a;

/* renamed from: xm3.e */
public final class C78881e extends C15946a {

    /* renamed from: d */
    public String f231732d = "";

    /* renamed from: e */
    public String f231733e = "";

    /* renamed from: f */
    public C44661m1 f231734f;

    /* renamed from: g */
    public boolean f231735g;

    /* renamed from: h */
    public final C13601g f231736h = C36568h.m40985a(new C78884c(this));

    /* renamed from: xm3.e$a */
    public static final class C78882a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78881e f231737d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<View> f231738e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78882a(C78881e eVar, C8479f0<View> f0Var) {
            super(1);
            this.f231737d = eVar;
            this.f231738e = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0204, code lost:
            if (r3 != false) goto L_0x0206;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r14) {
            /*
                r13 = this;
                tm3.w r14 = (tm3.C78069w) r14
                tm3.a0$a r0 = tm3.C78048a0.C78049a.Success
                java.lang.String r1 = "state"
                gy3.C87412m.m108594g(r14, r1)
                xm3.e r1 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r14.getAction()
                r3 = 0
                r4 = 0
                if (r2 == 0) goto L_0x00ea
                boolean r5 = r2 instanceof tm3.C64961s
                if (r5 == 0) goto L_0x00ea
                tm3.s r2 = (tm3.C64961s) r2
                androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
                java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r2, r5)
                r6 = r2
                com.tencent.mm.ui.MMActivity r6 = (com.tencent.p014mm.p136ui.MMActivity) r6
                android.content.res.Resources r2 = r1.getResources()
                r5 = 2131099650(0x7f060002, float:1.781166E38)
                int r2 = r2.getColor(r5)
                r6.setActionbarColor(r2)
                android.content.res.Resources r2 = r1.getResources()
                int r2 = r2.getColor(r5)
                r6.setNavigationbarColor(r2)
                androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
                r5 = 2131165337(0x7f070099, float:1.7944888E38)
                int r11 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r2, r5)
                r2 = 23
                boolean r2 = p206nj.C11171e.m11046c(r2)
                if (r2 == 0) goto L_0x007f
                com.tencent.mm.ui.MMActivityController r2 = r6.getController()
                androidx.appcompat.app.AppCompatActivity r7 = r1.getActivity()
                r8 = 2131756222(0x7f1004be, float:1.9143345E38)
                android.content.res.Resources r5 = r1.getResources()
                r9 = 2131099800(0x7f060098, float:1.7811963E38)
                int r9 = r5.getColor(r9)
                android.content.res.Resources r5 = r1.getResources()
                r10 = 2131099656(0x7f060008, float:1.7811671E38)
                int r10 = r5.getColor(r10)
                float r5 = (float) r11
                r12 = 1056964608(0x3f000000, float:0.5)
                float r12 = r12 * r5
                android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89767d(r7, r8, r9, r10, r11, r12)
                r2.mo177052J0(r5)
            L_0x007f:
                r7 = 1
                r2 = 2131821539(0x7f1103e3, float:1.9275824E38)
                java.lang.String r8 = r1.getString(r2)
                xm3.b r9 = new xm3.b
                r9.<init>(r1)
                r10 = 0
                com.tencent.mm.ui.MMActivityController$r r11 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
                r6.addTextOptionMenu(r7, r8, r9, r10, r11)
                r1.mo108894i3(r14)
                yh.l r2 = r1.mo108893g3()
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView r2 = r2.mo109044b()
                r2.setVisibility(r3)
                yh.l r2 = r1.mo108893g3()
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView r2 = r2.mo109044b()
                r5 = 2131312632(0x7f093ff8, float:1.8243638E38)
                android.view.View r2 = r2.findViewById(r5)
                if (r2 != 0) goto L_0x00b2
                goto L_0x00b5
            L_0x00b2:
                r2.setBackground(r4)
            L_0x00b5:
                yh.l r2 = r1.mo108893g3()
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView r2 = r2.mo109044b()
                r5 = 2131309866(0x7f09352a, float:1.8238028E38)
                android.view.View r2 = r2.findViewById(r5)
                if (r2 == 0) goto L_0x00cc
                r5 = 2131233436(0x7f080a9c, float:1.808301E38)
                r2.setBackgroundResource(r5)
            L_0x00cc:
                java.util.LinkedList<java.lang.String> r2 = r14.f228826n
                java.util.Iterator r2 = r2.iterator()
            L_0x00d2:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x00ea
                java.lang.Object r5 = r2.next()
                java.lang.String r5 = (java.lang.String) r5
                yh.l r6 = r1.mo108893g3()
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView r6 = r6.mo109044b()
                r6.mo100244d(r5)
                goto L_0x00d2
            L_0x00ea:
                xm3.e r1 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r14.getAction()
                r5 = 2131165359(0x7f0700af, float:1.7944933E38)
                r6 = 1
                if (r2 == 0) goto L_0x0192
                boolean r7 = r2 instanceof tm3.C78071z
                if (r7 == 0) goto L_0x0192
                tm3.z r2 = (tm3.C78071z) r2
                com.tencent.mm.sdk.statecenter.IStateActionResult r7 = r2.getResult()
                if (r7 == 0) goto L_0x010f
                boolean r8 = r7 instanceof tm3.C78048a0
                if (r8 == 0) goto L_0x010f
                tm3.a0 r7 = (tm3.C78048a0) r7
                tm3.a0$a r7 = r7.f228787b
                if (r7 != r0) goto L_0x010f
                r1.mo108894i3(r14)
            L_0x010f:
                com.tencent.mm.sdk.statecenter.IStateActionResult r7 = r2.getResult()
                if (r7 == 0) goto L_0x0192
                boolean r8 = r7 instanceof tm3.C78048a0
                if (r8 == 0) goto L_0x0192
                tm3.a0 r7 = (tm3.C78048a0) r7
                tm3.a0$a r7 = r7.f228787b
                if (r7 != r0) goto L_0x0192
                java.util.LinkedList<java.lang.String> r0 = r14.f228826n
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0130
                androidx.appcompat.app.AppCompatActivity r0 = r1.getActivity()
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r5)
                goto L_0x0145
            L_0x0130:
                java.util.LinkedList<java.lang.String> r0 = r14.f228826n
                int r0 = r0.size()
                if (r0 != r6) goto L_0x0144
                androidx.appcompat.app.AppCompatActivity r0 = r1.getActivity()
                r7 = 2131165367(0x7f0700b7, float:1.794495E38)
                int r0 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r0, r7)
                goto L_0x0145
            L_0x0144:
                r0 = 0
            L_0x0145:
                if (r0 <= 0) goto L_0x015b
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r7 = r1.mo14598d3()
                if (r7 == 0) goto L_0x015b
                com.tencent.mm.sdk.statecenter.UIStateCenter r7 = r7.getStateCenter()
                if (r7 == 0) goto L_0x015b
                tm3.i r8 = new tm3.i
                r8.<init>(r0)
                r7.dispatch(r8)
            L_0x015b:
                yh.l r0 = r1.mo108893g3()
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r0.mo109044b()
                om3.b r7 = r2.f228837a
                java.lang.String r7 = r7.f225007f
                r0.mo100244d(r7)
                om3.b r0 = r2.f228837a
                r0.getClass()
                om3.b r0 = r2.f228837a
                pm3.b r2 = r0.f225009h
                boolean r0 = r2.mo105663e(r0)
                if (r0 == 0) goto L_0x0192
                yh.l r0 = r1.mo108893g3()
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r0.mo109044b()
                r0.mo100242c()
                yh.l r0 = r1.mo108893g3()
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView r0 = r0.mo109044b()
                r0.clearFocus()
                r1.mo14600f3()
            L_0x0192:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01a3
                boolean r2 = r1 instanceof tm3.C78052b0
                if (r2 == 0) goto L_0x01a3
                tm3.b0 r1 = (tm3.C78052b0) r1
                r0.mo108894i3(r14)
            L_0x01a3:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01b4
                boolean r2 = r1 instanceof tm3.C78067u
                if (r2 == 0) goto L_0x01b4
                tm3.u r1 = (tm3.C78067u) r1
                r0.mo108894i3(r14)
            L_0x01b4:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01c5
                boolean r2 = r1 instanceof tm3.C78068v
                if (r2 == 0) goto L_0x01c5
                tm3.v r1 = (tm3.C78068v) r1
                r0.mo108894i3(r14)
            L_0x01c5:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01d6
                boolean r2 = r1 instanceof tm3.C78066t
                if (r2 == 0) goto L_0x01d6
                tm3.t r1 = (tm3.C78066t) r1
                r0.mo108894i3(r14)
            L_0x01d6:
                xm3.e r0 = r13.f231737d
                gy3.f0<android.view.View> r1 = r13.f231738e
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r14.getAction()
                if (r2 == 0) goto L_0x021b
                boolean r7 = r2 instanceof tm3.C78056e
                if (r7 == 0) goto L_0x021b
                tm3.e r2 = (tm3.C78056e) r2
                com.tencent.mm.storage.m1 r7 = r0.f231734f
                if (r7 == 0) goto L_0x021b
                java.lang.String r8 = eb0.C75592q0.m90789s()
                boolean r8 = r7.mo69796x2(r8)
                if (r8 != r6) goto L_0x01f6
                r8 = 1
                goto L_0x01f7
            L_0x01f6:
                r8 = 0
            L_0x01f7:
                if (r8 != 0) goto L_0x0206
                java.lang.String r8 = eb0.C75592q0.m90789s()
                boolean r7 = r7.mo69793u2(r8)
                if (r7 != r6) goto L_0x0204
                r3 = 1
            L_0x0204:
                if (r3 == 0) goto L_0x021b
            L_0x0206:
                com.tencent.mm.sdk.coroutines.LifecycleScope r6 = r0.mo14597c3()
                if (r6 == 0) goto L_0x021b
                a14.h0 r0 = a14.C53872d1.f151117a
                a14.k2 r7 = f14.C58901s.f168555a
                r8 = 0
                xm3.d r9 = new xm3.d
                r9.<init>(r1, r2, r4)
                r10 = 2
                r11 = 0
                a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            L_0x021b:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x022c
                boolean r2 = r1 instanceof tm3.C78055d
                if (r2 == 0) goto L_0x022c
                tm3.d r1 = (tm3.C78055d) r1
                r0.mo108894i3(r14)
            L_0x022c:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x023d
                boolean r2 = r1 instanceof tm3.C78061j
                if (r2 == 0) goto L_0x023d
                tm3.j r1 = (tm3.C78061j) r1
                r0.getClass()
            L_0x023d:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x024e
                boolean r2 = r1 instanceof tm3.C64958n
                if (r2 == 0) goto L_0x024e
                tm3.n r1 = (tm3.C64958n) r1
                r0.getClass()
            L_0x024e:
                xm3.e r0 = r13.f231737d
                gy3.f0<android.view.View> r1 = r13.f231738e
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r14.getAction()
                if (r2 == 0) goto L_0x029c
                boolean r3 = r2 instanceof tm3.C78055d
                if (r3 == 0) goto L_0x029c
                tm3.d r2 = (tm3.C78055d) r2
                yh.l r2 = r0.mo108893g3()
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.mo109049g()
                java.lang.String r3 = "uiBinding.selectContactRv"
                gy3.C87412m.m108593f(r2, r3)
                com.tencent.mm.plugin.mvvmlist.MvvmList r2 = zb2.C79317n.m96015a(r2)
                if (r2 == 0) goto L_0x027a
                xm3.c r4 = new xm3.c
                r4.<init>(r14)
                r2.mo129614r(r4)
            L_0x027a:
                T r1 = r1.f27484d
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L_0x029c
                yh.l r0 = r0.mo108893g3()
                com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.mo109049g()
                gy3.C87412m.m108593f(r0, r3)
                zb2.m r6 = zb2.C79317n.m96016b(r0)
                if (r6 == 0) goto L_0x029c
                int r0 = r1.hashCode()
                long r7 = (long) r0
                r9 = 0
                r10 = 2
                r11 = 0
                jq3.C60898l.m71332k6(r6, r7, r9, r10, r11)
            L_0x029c:
                xm3.e r0 = r13.f231737d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x02ce
                boolean r2 = r1 instanceof tm3.C78052b0
                if (r2 == 0) goto L_0x02ce
                tm3.b0 r1 = (tm3.C78052b0) r1
                java.util.LinkedList<java.lang.String> r14 = r14.f228826n
                int r14 = r14.size()
                if (r14 != 0) goto L_0x02ce
                androidx.appcompat.app.AppCompatActivity r14 = r0.getActivity()
                int r14 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r14, r5)
                com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity r0 = r0.mo14598d3()
                if (r0 == 0) goto L_0x02ce
                com.tencent.mm.sdk.statecenter.UIStateCenter r0 = r0.getStateCenter()
                if (r0 == 0) goto L_0x02ce
                tm3.i r1 = new tm3.i
                r1.<init>(r14)
                r0.dispatch(r1)
            L_0x02ce:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: xm3.C78881e.C78882a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: xm3.e$b */
    public static final class C78883b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public static final C78883b f231739d = new C78883b();

        public C78883b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            if (((C78055d) wVar.checkAction(C78055d.class)) != null) {
                wVar.f228821f |= 64;
            }
            if (((C78047a) wVar.checkAction(C78047a.class)) != null) {
                wVar.f228821f &= -65;
                wVar.f228826n.clear();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xm3.e$c */
    public static final class C78884c extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78881e f231740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78884c(C78881e eVar) {
            super(0);
            this.f231740d = eVar;
        }

        public Object invoke() {
            return new C79115l(this.f231740d.getRootView());
        }
    }

    /* renamed from: xm3.e$d */
    public static final class C78885d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C78881e f231741d;

        public C78885d(C78881e eVar) {
            this.f231741d = eVar;
        }

        public final void run() {
            UIStateCenter stateCenter;
            UIStateCenter stateCenter2;
            C78881e eVar = this.f231741d;
            BaseMvvmActivity d3 = eVar.mo14598d3();
            if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
                stateCenter2.dispatch(new C78047a());
            }
            int c = C74942w4.m89786c(eVar.getActivity(), C0966R.dimen.f3758d_);
            BaseMvvmActivity d35 = eVar.mo14598d3();
            if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
                stateCenter.dispatch(new C78060i(c));
            }
        }
    }

    /* renamed from: xm3.e$e */
    public static final class C78886e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C78881e f231742d;

        public C78886e(C78881e eVar) {
            this.f231742d = eVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            UIStateCenter stateCenter;
            BaseMvvmActivity d3 = this.f231742d.mo14598d3();
            if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
                return false;
            }
            stateCenter.dispatch(new C78051b());
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78881e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final C79115l mo108893g3() {
        return (C79115l) ((C36570n) this.f231736h).getValue();
    }

    /* renamed from: i3 */
    public final void mo108894i3(C78069w wVar) {
        C87412m.m108594g(wVar, "state");
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        Log.m105924i("MicroMsg.AtSomeOneTopMenuUIC", "updateMenu: " + wVar.f228826n.size());
        wVar.f228826n.size();
        wVar.f228826n.contains(this.f231733e);
        mMActivity.setBackBtnVisible(false);
        mMActivity.getController().mo177092q0(getResources().getString(C0966R.string.f7926wf), new C78885d(this));
        mMActivity.updateOptionMenuStyle(1, MMActivityController.C73075r.GREEN);
        mMActivity.updateOptionMenuListener(1, new C78886e(this), (View.OnLongClickListener) null);
        if (wVar.f228826n.size() > 0) {
            mMActivity.updateOptionMenuText(1, getString(C0966R.string.f8014z_) + '(' + wVar.f228826n.size() + ')');
        } else {
            mMActivity.updateOptionMenuText(1, getString(C0966R.string.f8014z_));
        }
        if (wVar.f228826n.size() > wVar.f228824i) {
            mMActivity.enableOptionMenu(1, true);
            this.f231735g = false;
            return;
        }
        mMActivity.enableOptionMenu(1, false);
        this.f231735g = true;
    }

    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return this.f231735g;
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        UIStateCenter stateCenter2;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("msgQuoteName");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f231733e = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("chatroomName");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f231732d = str;
        this.f231734f = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f231732d);
        C8479f0 f0Var = new C8479f0();
        BaseMvvmActivity d3 = mo14598d3();
        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
            stateCenter2.observe((C0125s) getActivity(), new C78882a(this, f0Var));
        }
        BaseMvvmActivity d35 = mo14598d3();
        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
            stateCenter.process((C0125s) getActivity(), C78883b.f231739d);
        }
    }
}
