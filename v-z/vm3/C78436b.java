package vm3;

import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C76728k;
import lv1.C99664b;
import nv1.C100219b;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C52354x;
import tm3.C64961s;
import tm3.C78052b0;
import tm3.C78069w;
import tm3.C78071z;
import yb2.C15946a;
import zb2.C79317n;

/* renamed from: vm3.b */
public final class C78436b extends C15946a {

    /* renamed from: d */
    public final C13601g f229809d = C36568h.m40985a(C78437b.f229813d);

    /* renamed from: e */
    public final C13601g f229810e = C36568h.m40985a(new C78439d(this));

    /* renamed from: f */
    public C99664b f229811f;

    /* renamed from: g */
    public C99664b f229812g;

    /* renamed from: vm3.b$a */
    public final class C14911a implements C61173o {

        /* renamed from: d */
        public final C32226l<List<String>, C13598b0> f40940d;

        /* renamed from: e */
        public final /* synthetic */ C78436b f40941e;

        public C14911a(C78436b bVar, C32226l<? super List<String>, C13598b0> lVar) {
            C87412m.m108594g(lVar, "handler");
            this.f40941e = bVar;
            this.f40940d = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
            r1 = r4.f32076e;
         */
        /* renamed from: H0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo293H0(lv1.C10656l r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onFTSSearchEnd "
                r0.append(r1)
                if (r4 == 0) goto L_0x0019
                java.util.List<lv1.n> r1 = r4.f32076e
                if (r1 == 0) goto L_0x0019
                int r1 = r1.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                goto L_0x001a
            L_0x0019:
                r1 = 0
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "MicroMsg.SelectContactRecommendUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                if (r4 == 0) goto L_0x006f
                vm3.b r0 = r3.f40941e
                lv1.b r1 = r0.f229811f
                lv1.b r2 = r4.f32073b
                boolean r1 = gy3.C87412m.m108589b(r1, r2)
                if (r1 != 0) goto L_0x003e
                lv1.b r0 = r0.f229812g
                lv1.b r1 = r4.f32073b
                boolean r0 = gy3.C87412m.m108589b(r0, r1)
                if (r0 == 0) goto L_0x006f
            L_0x003e:
                int r0 = r4.f32074c
                if (r0 != 0) goto L_0x006f
                fy3.l<java.util.List<java.lang.String>, rx3.b0> r0 = r3.f40940d
                java.util.List<lv1.n> r4 = r4.f32076e
                java.lang.String r1 = "result.resultList"
                gy3.C87412m.m108593f(r4, r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = sx3.C36907w.m41090l(r4, r2)
                r1.<init>(r2)
                java.util.Iterator r4 = r4.iterator()
            L_0x005a:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L_0x006c
                java.lang.Object r2 = r4.next()
                lv1.n r2 = (lv1.C99681n) r2
                java.lang.String r2 = r2.f292151e
                r1.add(r2)
                goto L_0x005a
            L_0x006c:
                r0.invoke(r1)
            L_0x006f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vm3.C78436b.C14911a.mo293H0(lv1.l):void");
        }
    }

    /* renamed from: vm3.b$b */
    public static final class C78437b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C78437b f229813d = new C78437b();

        public C78437b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: vm3.b$c */
    public static final class C78438c extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C78436b f229814d;

        /* renamed from: e */
        public final /* synthetic */ boolean f229815e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78438c(C78436b bVar, boolean z) {
            super(1);
            this.f229814d = bVar;
            this.f229815e = z;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C78436b bVar = this.f229814d;
            boolean z = this.f229815e;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C64961s)) {
                C64961s sVar = (C64961s) action;
                C78436b.m94748i3(bVar, wVar);
                if (z) {
                    C78436b.m94747g3(bVar, wVar);
                }
            }
            C78436b bVar2 = this.f229814d;
            boolean z2 = this.f229815e;
            IStateAction action2 = wVar.getAction();
            if (action2 != null && (action2 instanceof C78071z)) {
                if (((C78071z) action2).f228837a.f225006e == 10) {
                    C78436b.m94748i3(bVar2, wVar);
                }
                if (z2) {
                    C78436b.m94747g3(bVar2, wVar);
                }
            }
            C78436b bVar3 = this.f229814d;
            boolean z3 = this.f229815e;
            IStateAction action3 = wVar.getAction();
            if (action3 != null && (action3 instanceof C78052b0)) {
                C78052b0 b0Var = (C78052b0) action3;
                C78436b.m94748i3(bVar3, wVar);
                if (z3) {
                    C78436b.m94747g3(bVar3, wVar);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: vm3.b$d */
    public static final class C78439d extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C78436b f229816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78439d(C78436b bVar) {
            super(0);
            this.f229816d = bVar;
        }

        public Object invoke() {
            return new C79115l(this.f229816d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78436b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final void m94747g3(C78436b bVar, C78069w wVar) {
        bVar.getClass();
        Class cls = C99260q.class;
        Log.m105924i("MicroMsg.SelectContactRecommendUIC", "startRecommendChatRoom");
        C99664b bVar2 = bVar.f229811f;
        if (bVar2 != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(bVar2);
            bVar.f229811f = null;
        }
        C78441d dVar = new C78441d();
        List<String> b = C52354x.f146330a.mo73369b(wVar.f228826n, wVar.f228825j, false);
        if (!((ArrayList) b).isEmpty()) {
            C76728k kVar = new C76728k();
            ((ArrayList) kVar.f224482q).addAll(b);
            kVar.f224467b = 8;
            kVar.f224477l = C100219b.f293645d;
            kVar.f224479n = (MMHandler) ((C36570n) bVar.f229809d).getValue();
            kVar.f224474i = 3;
            kVar.f224481p = true;
            kVar.f224478m = new C14911a(bVar, new C78440c(bVar, dVar));
            bVar.f229811f = ((C99260q) C86312j.m106911c(cls)).Xn0(11, kVar);
            return;
        }
        WxRecyclerView g = bVar.mo108388j3().mo109049g();
        C87412m.m108593f(g, "uiBinding.selectContactRv");
        MvvmList a = C79317n.m96015a(g);
        if (a != null) {
            a.mo129614r(dVar);
        }
    }

    /* renamed from: i3 */
    public static final void m94748i3(C78436b bVar, C78069w wVar) {
        bVar.getClass();
        Class cls = C99260q.class;
        Log.m105924i("MicroMsg.SelectContactRecommendUIC", "startRecommendContact");
        C99664b bVar2 = bVar.f229812g;
        if (bVar2 != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(bVar2);
            bVar.f229812g = null;
        }
        C78443f fVar = new C78443f();
        List<String> b = C52354x.f146330a.mo73369b(wVar.f228826n, wVar.f228825j, false);
        if (!((ArrayList) b).isEmpty()) {
            C76728k kVar = new C76728k();
            ((ArrayList) kVar.f224482q).addAll(b);
            kVar.f224467b = 13;
            kVar.f224477l = C100219b.f293645d;
            kVar.f224479n = (MMHandler) ((C36570n) bVar.f229809d).getValue();
            kVar.f224474i = 6;
            kVar.f224478m = new C14911a(bVar, new C78442e(bVar, fVar));
            kVar.f224481p = true;
            bVar.f229812g = ((C99260q) C86312j.m106911c(cls)).Xn0(11, kVar);
            return;
        }
        WxRecyclerView g = bVar.mo108388j3().mo109049g();
        C87412m.m108593f(g, "uiBinding.selectContactRv");
        MvvmList a = C79317n.m96015a(g);
        if (a != null) {
            a.mo129614r(fVar);
        }
    }

    /* renamed from: j3 */
    public final C79115l mo108388j3() {
        return (C79115l) ((C36570n) this.f229810e).getValue();
    }

    public void onCreate(Bundle bundle) {
        UIStateCenter stateCenter;
        boolean booleanExtra = getIntent().getBooleanExtra("recommend_chatroom", false);
        BaseMvvmActivity d3 = mo14598d3();
        if (d3 != null && (stateCenter = d3.getStateCenter()) != null) {
            stateCenter.observe((C0125s) getActivity(), new C78438c(this, booleanExtra));
        }
    }

    public void onDestroy() {
        Class cls = C99260q.class;
        C99664b bVar = this.f229811f;
        if (bVar != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(bVar);
            this.f229811f = null;
        }
        C99664b bVar2 = this.f229812g;
        if (bVar2 != null) {
            ((C99260q) C86312j.m106911c(cls)).mo128757ki(bVar2);
            this.f229812g = null;
        }
        super.onDestroy();
    }
}
