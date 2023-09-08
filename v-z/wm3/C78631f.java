package wm3;

import a11.C39479c;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.AtUserSelectionStruct;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C75592q0;
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
import tm3.C78047a;
import tm3.C78051b;
import tm3.C78055d;
import tm3.C78060i;
import tm3.C78069w;
import yb2.C15946a;

/* renamed from: wm3.f */
public final class C78631f extends C15946a {

    /* renamed from: d */
    public int f230312d;

    /* renamed from: e */
    public int f230313e;

    /* renamed from: f */
    public int f230314f;

    /* renamed from: g */
    public int f230315g;

    /* renamed from: h */
    public String f230316h = "";

    /* renamed from: i */
    public String f230317i = "";

    /* renamed from: j */
    public C44661m1 f230318j;

    /* renamed from: n */
    public boolean f230319n;

    /* renamed from: o */
    public final C13601g f230320o = C36568h.m40985a(new C78634c(this));

    /* renamed from: wm3.f$a */
    public static final class C78632a extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78631f f230321d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<View> f230322e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78632a(C78631f fVar, C8479f0<View> f0Var) {
            super(1);
            this.f230321d = fVar;
            this.f230322e = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0187, code lost:
            if (r5 != false) goto L_0x0189;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r14) {
            /*
                r13 = this;
                tm3.w r14 = (tm3.C78069w) r14
                java.lang.String r0 = "state"
                gy3.C87412m.m108594g(r14, r0)
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x00ab
                boolean r2 = r1 instanceof tm3.C64961s
                if (r2 == 0) goto L_0x00ab
                tm3.s r1 = (tm3.C64961s) r1
                androidx.appcompat.app.AppCompatActivity r1 = r0.getActivity()
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r1, r2)
                r3 = r1
                com.tencent.mm.ui.MMActivity r3 = (com.tencent.p014mm.p136ui.MMActivity) r3
                android.content.res.Resources r1 = r0.getResources()
                r2 = 2131099650(0x7f060002, float:1.781166E38)
                int r1 = r1.getColor(r2)
                r3.setActionbarColor(r1)
                android.content.res.Resources r1 = r0.getResources()
                int r1 = r1.getColor(r2)
                r3.setNavigationbarColor(r1)
                androidx.appcompat.app.AppCompatActivity r1 = r0.getActivity()
                r2 = 2131165337(0x7f070099, float:1.7944888E38)
                int r8 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r1, r2)
                r1 = 23
                boolean r1 = p206nj.C11171e.m11046c(r1)
                if (r1 == 0) goto L_0x007b
                com.tencent.mm.ui.MMActivityController r1 = r3.getController()
                androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
                r5 = 2131756222(0x7f1004be, float:1.9143345E38)
                android.content.res.Resources r2 = r0.getResources()
                r6 = 2131099800(0x7f060098, float:1.7811963E38)
                int r6 = r2.getColor(r6)
                android.content.res.Resources r2 = r0.getResources()
                r7 = 2131099656(0x7f060008, float:1.7811671E38)
                int r7 = r2.getColor(r7)
                float r2 = (float) r8
                r9 = 1056964608(0x3f000000, float:0.5)
                float r9 = r9 * r2
                android.graphics.drawable.Drawable r2 = com.tencent.p014mm.p136ui.C74933u4.m89767d(r4, r5, r6, r7, r8, r9)
                r1.mo177052J0(r2)
            L_0x007b:
                boolean r1 = r14.mo108033b()
                if (r1 == 0) goto L_0x0098
                r4 = 1
                r1 = 2131821539(0x7f1103e3, float:1.9275824E38)
                java.lang.String r5 = r0.getString(r1)
                wm3.a r6 = new wm3.a
                r6.<init>(r0)
                r7 = 0
                com.tencent.mm.ui.MMActivityController$r r8 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.GREEN
                r3.addTextOptionMenu(r4, r5, r6, r7, r8)
                r0.mo108609i3(r14)
                goto L_0x00ab
            L_0x0098:
                r4 = 1
                r1 = 2131821601(0x7f110421, float:1.927595E38)
                java.lang.String r5 = r0.getString(r1)
                wm3.b r6 = new wm3.b
                r6.<init>(r0)
                r7 = 0
                com.tencent.mm.ui.MMActivityController$r r8 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.TRANSPARENT
                r3.addTextOptionMenu(r4, r5, r6, r7, r8)
            L_0x00ab:
                boolean r0 = r14.mo108033b()
                if (r0 == 0) goto L_0x0119
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x00d4
                boolean r2 = r1 instanceof tm3.C78071z
                if (r2 == 0) goto L_0x00d4
                tm3.z r1 = (tm3.C78071z) r1
                com.tencent.mm.sdk.statecenter.IStateActionResult r1 = r1.getResult()
                if (r1 == 0) goto L_0x00d4
                boolean r2 = r1 instanceof tm3.C78048a0
                if (r2 == 0) goto L_0x00d4
                tm3.a0 r1 = (tm3.C78048a0) r1
                tm3.a0$a r1 = r1.f228787b
                tm3.a0$a r2 = tm3.C78048a0.C78049a.Success
                if (r1 != r2) goto L_0x00d4
                r0.mo108609i3(r14)
            L_0x00d4:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x00e5
                boolean r2 = r1 instanceof tm3.C78052b0
                if (r2 == 0) goto L_0x00e5
                tm3.b0 r1 = (tm3.C78052b0) r1
                r0.mo108609i3(r14)
            L_0x00e5:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x00f6
                boolean r2 = r1 instanceof tm3.C78067u
                if (r2 == 0) goto L_0x00f6
                tm3.u r1 = (tm3.C78067u) r1
                r0.mo108609i3(r14)
            L_0x00f6:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x0107
                boolean r2 = r1 instanceof tm3.C78068v
                if (r2 == 0) goto L_0x0107
                tm3.v r1 = (tm3.C78068v) r1
                r0.mo108609i3(r14)
            L_0x0107:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x0156
                boolean r2 = r1 instanceof tm3.C78066t
                if (r2 == 0) goto L_0x0156
                tm3.t r1 = (tm3.C78066t) r1
                r0.mo108609i3(r14)
                goto L_0x0156
            L_0x0119:
                java.lang.Class<tm3.p> r0 = tm3.C78065p.class
                com.tencent.mm.sdk.statecenter.IStateAction r0 = r14.checkAction(r0)
                tm3.p r0 = (tm3.C78065p) r0
                if (r0 == 0) goto L_0x0129
                wm3.f r0 = r13.f230321d
                r1 = 2
                r0.mo108608g3(r1)
            L_0x0129:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x0156
                boolean r2 = r1 instanceof tm3.C78070y
                if (r2 == 0) goto L_0x0156
                tm3.y r1 = (tm3.C78070y) r1
                r2 = 7
                r0.mo108608g3(r2)
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r1 = r1.f228836a
                java.lang.String r3 = "KSelectUserList"
                r2.putExtra(r3, r1)
                androidx.appcompat.app.AppCompatActivity r1 = r0.getActivity()
                r3 = -1
                r1.setResult(r3, r2)
                androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
                r0.finish()
            L_0x0156:
                wm3.f r3 = r13.f230321d
                gy3.f0<android.view.View> r2 = r13.f230322e
                com.tencent.mm.sdk.statecenter.IStateAction r0 = r14.getAction()
                r6 = 1
                if (r0 == 0) goto L_0x01a1
                boolean r1 = r0 instanceof tm3.C78056e
                if (r1 == 0) goto L_0x01a1
                r4 = r0
                tm3.e r4 = (tm3.C78056e) r4
                com.tencent.mm.storage.m1 r0 = r3.f230318j
                if (r0 == 0) goto L_0x01a1
                java.lang.String r1 = eb0.C75592q0.m90789s()
                boolean r1 = r0.mo69796x2(r1)
                r5 = 0
                if (r1 != r6) goto L_0x0179
                r1 = 1
                goto L_0x017a
            L_0x0179:
                r1 = 0
            L_0x017a:
                if (r1 != 0) goto L_0x0189
                java.lang.String r1 = eb0.C75592q0.m90789s()
                boolean r0 = r0.mo69793u2(r1)
                if (r0 != r6) goto L_0x0187
                r5 = 1
            L_0x0187:
                if (r5 == 0) goto L_0x01a1
            L_0x0189:
                com.tencent.mm.sdk.coroutines.LifecycleScope r7 = r3.mo14597c3()
                if (r7 == 0) goto L_0x01a1
                a14.h0 r0 = a14.C53872d1.f151117a
                a14.k2 r8 = f14.C58901s.f168555a
                r9 = 0
                wm3.e r10 = new wm3.e
                r5 = 0
                r0 = r10
                r1 = r14
                r0.<init>(r1, r2, r3, r4, r5)
                r11 = 2
                r12 = 0
                a14.C53895h.m60466d(r7, r8, r9, r10, r11, r12)
            L_0x01a1:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01b2
                boolean r2 = r1 instanceof tm3.C78055d
                if (r2 == 0) goto L_0x01b2
                tm3.d r1 = (tm3.C78055d) r1
                r0.mo108609i3(r14)
            L_0x01b2:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01c3
                boolean r2 = r1 instanceof tm3.C78047a
                if (r2 == 0) goto L_0x01c3
                tm3.a r1 = (tm3.C78047a) r1
                r0.mo108609i3(r14)
            L_0x01c3:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01d5
                boolean r2 = r1 instanceof tm3.C78061j
                if (r2 == 0) goto L_0x01d5
                tm3.j r1 = (tm3.C78061j) r1
                int r1 = r1.f228803a
                r0.f230312d = r1
            L_0x01d5:
                wm3.f r0 = r13.f230321d
                com.tencent.mm.sdk.statecenter.IStateAction r1 = r14.getAction()
                if (r1 == 0) goto L_0x01e5
                boolean r2 = r1 instanceof tm3.C64958n
                if (r2 == 0) goto L_0x01e5
                tm3.n r1 = (tm3.C64958n) r1
                r0.f230313e = r6
            L_0x01e5:
                wm3.f r0 = r13.f230321d
                gy3.f0<android.view.View> r1 = r13.f230322e
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r14.getAction()
                java.lang.String r3 = "uiBinding.selectContactRv"
                if (r2 == 0) goto L_0x023f
                boolean r4 = r2 instanceof tm3.C78055d
                if (r4 == 0) goto L_0x023f
                tm3.d r2 = (tm3.C78055d) r2
                rx3.g r2 = r0.f230320o
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                yh.l r2 = (p278yh.C79115l) r2
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.mo109049g()
                gy3.C87412m.m108593f(r2, r3)
                com.tencent.mm.plugin.mvvmlist.MvvmList r2 = zb2.C79317n.m96015a(r2)
                if (r2 == 0) goto L_0x0217
                wm3.c r4 = new wm3.c
                r4.<init>(r14)
                r2.mo129614r(r4)
            L_0x0217:
                T r1 = r1.f27484d
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L_0x023f
                rx3.g r0 = r0.f230320o
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                yh.l r0 = (p278yh.C79115l) r0
                com.tencent.mm.view.recyclerview.WxRecyclerView r0 = r0.mo109049g()
                gy3.C87412m.m108593f(r0, r3)
                zb2.m r4 = zb2.C79317n.m96016b(r0)
                if (r4 == 0) goto L_0x023f
                int r0 = r1.hashCode()
                long r5 = (long) r0
                r7 = 0
                r8 = 2
                r9 = 0
                jq3.C60898l.m71332k6(r4, r5, r7, r8, r9)
            L_0x023f:
                wm3.f r0 = r13.f230321d
                gy3.f0<android.view.View> r1 = r13.f230322e
                com.tencent.mm.sdk.statecenter.IStateAction r2 = r14.getAction()
                if (r2 == 0) goto L_0x0296
                boolean r4 = r2 instanceof tm3.C78047a
                if (r4 == 0) goto L_0x0296
                tm3.a r2 = (tm3.C78047a) r2
                rx3.g r2 = r0.f230320o
                rx3.n r2 = (rx3.C36570n) r2
                java.lang.Object r2 = r2.getValue()
                yh.l r2 = (p278yh.C79115l) r2
                com.tencent.mm.view.recyclerview.WxRecyclerView r2 = r2.mo109049g()
                gy3.C87412m.m108593f(r2, r3)
                com.tencent.mm.plugin.mvvmlist.MvvmList r2 = zb2.C79317n.m96015a(r2)
                if (r2 == 0) goto L_0x026e
                wm3.d r4 = new wm3.d
                r4.<init>(r14)
                r2.mo129614r(r4)
            L_0x026e:
                T r14 = r1.f27484d
                r5 = r14
                android.view.View r5 = (android.view.View) r5
                if (r5 == 0) goto L_0x0296
                rx3.g r14 = r0.f230320o
                rx3.n r14 = (rx3.C36570n) r14
                java.lang.Object r14 = r14.getValue()
                yh.l r14 = (p278yh.C79115l) r14
                com.tencent.mm.view.recyclerview.WxRecyclerView r14 = r14.mo109049g()
                gy3.C87412m.m108593f(r14, r3)
                zb2.m r4 = zb2.C79317n.m96016b(r14)
                if (r4 == 0) goto L_0x0296
                int r6 = r5.hashCode()
                r7 = 0
                r8 = 4
                r9 = 0
                jq3.C60898l.m71329W5(r4, r5, r6, r7, r8, r9)
            L_0x0296:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: wm3.C78631f.C78632a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: wm3.f$b */
    public static final class C78633b extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public static final C78633b f230323d = new C78633b();

        public C78633b() {
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

    /* renamed from: wm3.f$c */
    public static final class C78634c extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78631f f230324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78634c(C78631f fVar) {
            super(0);
            this.f230324d = fVar;
        }

        public Object invoke() {
            return new C79115l(this.f230324d.getRootView());
        }
    }

    /* renamed from: wm3.f$d */
    public static final class C78635d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C78631f f230325d;

        public C78635d(C78631f fVar) {
            this.f230325d = fVar;
        }

        public final void run() {
            UIStateCenter stateCenter;
            UIStateCenter stateCenter2;
            C78631f fVar = this.f230325d;
            fVar.mo108608g3(6);
            BaseMvvmActivity d3 = fVar.mo14598d3();
            if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
                stateCenter2.dispatch(new C78047a());
            }
            int c = C74942w4.m89786c(fVar.getActivity(), C0966R.dimen.f3758d_);
            BaseMvvmActivity d35 = fVar.mo14598d3();
            if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
                stateCenter.dispatch(new C78060i(c));
            }
        }
    }

    /* renamed from: wm3.f$e */
    public static final class C78636e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C78631f f230326d;

        public C78636e(C78631f fVar) {
            this.f230326d = fVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            UIStateCenter stateCenter;
            C78631f fVar = this.f230326d;
            fVar.mo108608g3(5);
            BaseMvvmActivity d3 = fVar.mo14598d3();
            if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
                return false;
            }
            stateCenter.dispatch(new C78051b());
            return false;
        }
    }

    /* renamed from: wm3.f$f */
    public static final class C78637f implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ C78631f f230327d;

        public C78637f(C78631f fVar) {
            this.f230327d = fVar;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            UIStateCenter stateCenter;
            C78631f fVar = this.f230327d;
            fVar.mo108608g3(4);
            BaseMvvmActivity d3 = fVar.mo14598d3();
            if (d3 == null || (stateCenter = d3.getStateCenter()) == null) {
                return false;
            }
            stateCenter.dispatch(new C78055d());
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78631f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public final void mo108608g3(int i) {
        AtUserSelectionStruct atUserSelectionStruct = new AtUserSelectionStruct();
        long j = 1;
        long j2 = !Util.isNullOrNil(this.f230317i) ? 1 : 2;
        C44661m1 m1Var = this.f230318j;
        boolean z = false;
        if (!(m1Var != null && m1Var.mo69796x2(C75592q0.m90789s()))) {
            C44661m1 m1Var2 = this.f230318j;
            if (m1Var2 != null && m1Var2.mo69793u2(C75592q0.m90789s())) {
                z = true;
            }
            j = z ? 2 : 3;
        }
        atUserSelectionStruct.f194134e = j;
        atUserSelectionStruct.f194136g = (long) i;
        atUserSelectionStruct.f194133d = atUserSelectionStruct.mo86045b("ChatName", this.f230316h, true);
        C44661m1 m1Var3 = this.f230318j;
        atUserSelectionStruct.f194135f = m1Var3 != null ? (long) m1Var3.field_memberCount : 0;
        atUserSelectionStruct.f194138i = (long) this.f230313e;
        atUserSelectionStruct.f194137h = (long) this.f230312d;
        atUserSelectionStruct.f194139j = j2;
        atUserSelectionStruct.f194140k = (long) this.f230314f;
        atUserSelectionStruct.f194141l = (long) this.f230315g;
        atUserSelectionStruct.mo86054n();
        atUserSelectionStruct.mo86056r();
    }

    /* renamed from: i3 */
    public final void mo108609i3(C78069w wVar) {
        C87412m.m108594g(wVar, "state");
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        Log.m105924i("MicroMsg.AtSomeOneTopMenuUIC", "updateMenu: " + wVar.f228826n.size());
        this.f230314f = wVar.f228826n.size();
        if (wVar.f228826n.contains(this.f230317i)) {
            this.f230315g = 1;
        }
        if (wVar.mo108033b()) {
            mMActivity.setBackBtnVisible(false);
            mMActivity.getController().mo177092q0(getResources().getString(C0966R.string.f7926wf), new C78635d(this));
            mMActivity.updateOptionMenuStyle(1, MMActivityController.C73075r.GREEN);
            mMActivity.updateOptionMenuListener(1, new C78636e(this), (View.OnLongClickListener) null);
            if (wVar.f228826n.size() > 0) {
                mMActivity.updateOptionMenuText(1, getString(C0966R.string.f8014z_) + '(' + wVar.f228826n.size() + ')');
            } else {
                mMActivity.updateOptionMenuText(1, getString(C0966R.string.f8014z_));
            }
            if (wVar.f228826n.size() > wVar.f228824i) {
                mMActivity.enableOptionMenu(1, true);
                this.f230319n = false;
                return;
            }
            mMActivity.enableOptionMenu(1, false);
            this.f230319n = true;
            return;
        }
        this.f230319n = false;
        mMActivity.setBackBtnVisible(true);
        mMActivity.updateOptionMenuStyle(1, MMActivityController.C73075r.TRANSPARENT);
        mMActivity.updateOptionMenuListener(1, new C78637f(this), (View.OnLongClickListener) null);
        mMActivity.updateOptionMenuText(1, getString(C0966R.string.a0r));
        mMActivity.enableOptionMenu(1, true);
    }

    public boolean onClickDialogSpaceOnHalfScreenMode() {
        mo108608g3(3);
        return this.f230319n;
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
        this.f230317i = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("chatroomName");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f230316h = str;
        this.f230318j = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(this.f230316h);
        C8479f0 f0Var = new C8479f0();
        BaseMvvmActivity d3 = mo14598d3();
        if (!(d3 == null || (stateCenter2 = d3.getStateCenter()) == null)) {
            stateCenter2.observe((C0125s) getActivity(), new C78632a(this, f0Var));
        }
        BaseMvvmActivity d35 = mo14598d3();
        if (d35 != null && (stateCenter = d35.getStateCenter()) != null) {
            stateCenter.process((C0125s) getActivity(), C78633b.f230323d);
        }
    }
}
