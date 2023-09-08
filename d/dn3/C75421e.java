package dn3;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58017a1;
import d14.C58085t0;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.ResultKt;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import nv1.C100218a;
import p278yh.C79115l;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tm3.C64958n;
import tm3.C78062l;
import tm3.C78064o;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yb2.C15946a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: dn3.e */
public final class C75421e extends C15946a {

    /* renamed from: d */
    public final C13601g f221706d = C36568h.m40985a(C75425c.f221717d);

    /* renamed from: e */
    public ArrayList<C99664b> f221707e = new ArrayList<>();

    /* renamed from: f */
    public final C13601g f221708f = C36568h.m40985a(new C75428f(this));

    /* renamed from: g */
    public final C13601g f221709g;

    /* renamed from: h */
    public final C13601g f221710h;

    /* renamed from: dn3.e$a */
    public final class C75422a implements C61173o {

        /* renamed from: d */
        public final C58085t0<C10656l> f221711d;

        /* renamed from: e */
        public final /* synthetic */ C75421e f221712e;

        @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.conversation.selectchatroom.SelectChatroomConversationSearchUIC$FTSResultListener$onFTSSearchEnd$2$1", mo125469f = "SelectChatroomConversationSearchUIC.kt", mo125470l = {152}, mo125471m = "invokeSuspend")
        /* renamed from: dn3.e$a$a */
        public static final class C75423a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f221713d;

            /* renamed from: e */
            public final /* synthetic */ C75422a f221714e;

            /* renamed from: f */
            public final /* synthetic */ C10656l f221715f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C75423a(C75422a aVar, C10656l lVar, C15601d<? super C75423a> dVar) {
                super(2, dVar);
                this.f221714e = aVar;
                this.f221715f = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C75423a(this.f221714e, this.f221715f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C75423a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f221713d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58085t0<C10656l> t0Var = this.f221714e.f221711d;
                    C10656l lVar = this.f221715f;
                    this.f221713d = 1;
                    if (t0Var.emit(lVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C75422a(C75421e eVar, C78064o oVar, C58085t0 t0Var, int i, boolean z, int i2, C8480h hVar) {
            C87412m.m108594g(oVar, "request");
            C87412m.m108594g(t0Var, "searchFlow");
            this.f221712e = eVar;
            this.f221711d = t0Var;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            LifecycleScope c3;
            if (lVar != null) {
                C75421e eVar = this.f221712e;
                Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "onFTSSearchEnd " + lVar.f32073b.hashCode());
                boolean z = false;
                Iterator<T> it = eVar.f221707e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C87412m.m108589b((C99664b) it.next(), lVar.f32073b)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if ((z ? lVar : null) != null) {
                    C75421e eVar2 = this.f221712e;
                    if (lVar.f32074c == 0 && (c3 = eVar2.mo14597c3()) != null) {
                        LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C75423a(this, lVar, (C15601d<? super C75423a>) null), 1, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: dn3.e$b */
    public static final class C75424b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C75421e f221716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75424b(C75421e eVar) {
            super(0);
            this.f221716d = eVar;
        }

        public Object invoke() {
            String stringExtra = this.f221716d.getIntent().getStringExtra("key_chatroomSessionWord");
            if (stringExtra != null) {
                if (!(!C112551y.m153811k(stringExtra))) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    return stringExtra;
                }
            }
            return this.f221716d.getString(C0966R.string.mpm);
        }
    }

    /* renamed from: dn3.e$c */
    public static final class C75425c extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C75425c f221717d = new C75425c();

        public C75425c() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: dn3.e$d */
    public static final class C75426d extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C75421e f221718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75426d(C75421e eVar) {
            super(1);
            this.f221718d = eVar;
        }

        public Object invoke(Object obj) {
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C64958n nVar = (C64958n) wVar.checkAction(C64958n.class);
            if (nVar != null) {
                C75421e eVar = this.f221718d;
                if (!C112551y.m153811k(nVar.f187041b)) {
                    IStateActionResult result = nVar.getResult();
                    if (result != null && (result instanceof C78064o)) {
                        C78064o oVar = (C78064o) result;
                        eVar.getClass();
                        Class cls = C99260q.class;
                        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + oVar.f228810b);
                        Iterator<C99664b> it = eVar.f221707e.iterator();
                        while (it.hasNext()) {
                            ((C99260q) C86312j.m106911c(cls)).mo128757ki(it.next());
                        }
                        eVar.f221707e.clear();
                        HashMap hashMap = new HashMap();
                        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
                        C76728k kVar = new C76728k();
                        kVar.f224468c = oVar.f228810b;
                        kVar.f224477l = C100218a.f293644d;
                        kVar.f224467b = 32;
                        kVar.f224479n = (MMHandler) ((C36570n) eVar.f221706d).getValue();
                        C75422a aVar = r6;
                        C76728k kVar2 = kVar;
                        C75422a aVar2 = new C75422a(eVar, oVar, b, 0, false, 12, (C8480h) null);
                        kVar2.f224478m = aVar;
                        kVar2.f224475j.addAll(wVar.f228827o);
                        kVar2.f224481p = true;
                        C99664b Xn0 = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar2);
                        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + Xn0.hashCode());
                        eVar.f221707e.add(Xn0);
                        LifecycleScope c3 = eVar.mo14597c3();
                        if (c3 != null) {
                            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C75429f(b, hashMap, eVar, oVar, (C15601d<? super C75429f>) null), 1, (Object) null);
                        }
                    }
                    C75421e.m90462g3(eVar).mo109049g().setVisibility(8);
                    C75421e.m90462g3(eVar).mo109047e().setVisibility(0);
                } else {
                    C75421e.m90462g3(eVar).mo109049g().setVisibility(0);
                    C75421e.m90462g3(eVar).mo109047e().setVisibility(8);
                    eVar.mo105771i3();
                    nVar.f187042c.invoke();
                }
            }
            C78062l lVar = (C78062l) wVar.checkAction(C78062l.class);
            if (lVar != null) {
                C75421e eVar2 = this.f221718d;
                if (true ^ C112551y.m153811k(lVar.f228805b)) {
                    C75421e.m90462g3(eVar2).mo109049g().setVisibility(8);
                    C75421e.m90462g3(eVar2).mo109047e().setVisibility(0);
                } else {
                    C75421e.m90462g3(eVar2).mo109049g().setVisibility(0);
                    C75421e.m90462g3(eVar2).mo109047e().setVisibility(8);
                    eVar2.mo105771i3();
                    lVar.f228806c.invoke();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dn3.e$e */
    public static final class C75427e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f221719d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75427e(AppCompatActivity appCompatActivity) {
            super(0);
            this.f221719d = appCompatActivity;
        }

        public Object invoke() {
            return this.f221719d.getResources().getString(C0966R.string.mtw);
        }
    }

    /* renamed from: dn3.e$f */
    public static final class C75428f extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C75421e f221720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C75428f(C75421e eVar) {
            super(0);
            this.f221720d = eVar;
        }

        public Object invoke() {
            return new C79115l(this.f221720d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75421e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f221709g = C36568h.m40985a(new C75427e(appCompatActivity));
        this.f221710h = C36568h.m40985a(new C75424b(this));
    }

    /* renamed from: g3 */
    public static final C79115l m90462g3(C75421e eVar) {
        return (C79115l) ((C36570n) eVar.f221708f).getValue();
    }

    /* renamed from: i3 */
    public final void mo105771i3() {
        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "stopSearch");
        for (C99664b ki : this.f221707e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f221707e.clear();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C75426d(this));
        }
    }

    public void onDestroy() {
        for (C99664b ki : this.f221707e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f221707e.clear();
    }
}
