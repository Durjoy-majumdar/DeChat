package cn3;

import a14.C0000n0;
import a14.C53934p0;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bi3.C0289a;
import c14.C54624g;
import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.IStateActionResult;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58017a1;
import d14.C58085t0;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kv1.C61173o;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99681n;
import nv1.C100218a;
import nv1.C100219b;
import om3.C77020b;
import p278yh.C79115l;
import pm3.C77115b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sm3.C77735c;
import sx3.C36907w;
import sx3.C64197v;
import tm3.C64958n;
import tm3.C78062l;
import tm3.C78063m;
import tm3.C78064o;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yb2.C15946a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: cn3.h */
public final class C67421h extends C15946a {

    /* renamed from: d */
    public final C13601g f193337d = C36568h.m40985a(C67424b.f193345d);

    /* renamed from: e */
    public ArrayList<C99664b> f193338e = new ArrayList<>();

    /* renamed from: f */
    public final C13601g f193339f = C36568h.m40985a(new C67426d(this));

    /* renamed from: cn3.h$a */
    public final class C67422a implements C61173o {

        /* renamed from: d */
        public final C58085t0<C10656l> f193340d;

        /* renamed from: e */
        public final /* synthetic */ C67421h f193341e;

        @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.conversation.recent.RecentConversationSearchUIC$FTSResultListener$onFTSSearchEnd$2$1", mo125469f = "RecentConversationSearchUIC.kt", mo125470l = {209}, mo125471m = "invokeSuspend")
        /* renamed from: cn3.h$a$a */
        public static final class C67423a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f193342d;

            /* renamed from: e */
            public final /* synthetic */ C67422a f193343e;

            /* renamed from: f */
            public final /* synthetic */ C10656l f193344f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C67423a(C67422a aVar, C10656l lVar, C15601d<? super C67423a> dVar) {
                super(2, dVar);
                this.f193343e = aVar;
                this.f193344f = lVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C67423a(this.f193343e, this.f193344f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C67423a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f193342d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58085t0<C10656l> t0Var = this.f193343e.f193340d;
                    C10656l lVar = this.f193344f;
                    this.f193342d = 1;
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

        public C67422a(C67421h hVar, C78064o oVar, C58085t0 t0Var, int i, boolean z, int i2, C8480h hVar2) {
            C87412m.m108594g(oVar, "request");
            C87412m.m108594g(t0Var, "searchFlow");
            this.f193341e = hVar;
            this.f193340d = t0Var;
        }

        /* renamed from: H0 */
        public void mo293H0(C10656l lVar) {
            LifecycleScope c3;
            if (lVar != null) {
                C67421h hVar = this.f193341e;
                Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "onFTSSearchEnd " + lVar.f32073b.hashCode());
                boolean z = false;
                Iterator<T> it = hVar.f193338e.iterator();
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
                    C67421h hVar2 = this.f193341e;
                    if (lVar.f32074c == 0 && (c3 = hVar2.mo14597c3()) != null) {
                        LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C67423a(this, lVar, (C15601d<? super C67423a>) null), 1, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: cn3.h$b */
    public static final class C67424b extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C67424b f193345d = new C67424b();

        public C67424b() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler(Looper.getMainLooper());
        }
    }

    /* renamed from: cn3.h$c */
    public static final class C67425c extends C87413o implements C32226l<C78069w, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C67421h f193346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67425c(C67421h hVar) {
            super(1);
            this.f193346d = hVar;
        }

        public Object invoke(Object obj) {
            Object obj2;
            C67421h hVar;
            C54624g gVar;
            C78069w wVar = (C78069w) obj;
            C87412m.m108594g(wVar, "state");
            C64958n nVar = (C64958n) wVar.checkAction(C64958n.class);
            if (nVar != null) {
                C67421h hVar2 = this.f193346d;
                if (!C112551y.m153811k(nVar.f187041b)) {
                    IStateActionResult result = nVar.getResult();
                    if (result == null || !(result instanceof C78064o)) {
                        hVar = hVar2;
                    } else {
                        C78064o oVar = (C78064o) result;
                        hVar2.getClass();
                        Class cls = C99260q.class;
                        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "startSearch " + oVar.f228810b);
                        Iterator<C99664b> it = hVar2.f193338e.iterator();
                        while (it.hasNext()) {
                            ((C99260q) C86312j.m106911c(cls)).mo128757ki(it.next());
                        }
                        hVar2.f193338e.clear();
                        HashMap hashMap = new HashMap();
                        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
                        ArrayList arrayList = new ArrayList();
                        C58085t0 b2 = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
                        C76728k kVar = new C76728k();
                        kVar.f224468c = oVar.f228810b;
                        kVar.f224477l = C100219b.f293645d;
                        kVar.f224467b = 16;
                        kVar.f224479n = (MMHandler) ((C36570n) hVar2.f193337d).getValue();
                        kVar.f224472g = new int[]{131072, 131081};
                        C67422a aVar = r8;
                        C76728k kVar2 = kVar;
                        String str = "MicroMsg.SelectContactChatRoomMemberSearchUIC";
                        String str2 = "startSearch ";
                        hVar = hVar2;
                        C67422a aVar2 = new C67422a(hVar2, oVar, b2, 0, false, 12, (C8480h) null);
                        kVar2.f224478m = aVar;
                        kVar2.f224475j.addAll(wVar.f228827o);
                        kVar2.f224481p = true;
                        C99664b Xn0 = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar2);
                        hVar.f193338e.add(Xn0);
                        LifecycleScope c3 = hVar.mo14597c3();
                        if (c3 != null) {
                            gVar = null;
                            LifecycleScope.launchDefault$default(c3, (C53934p0) null, new C67427i(b2, arrayList, hVar, hashMap, b, (C15601d<? super C67427i>) null), 1, (Object) null);
                        } else {
                            gVar = null;
                        }
                        C58085t0 b3 = C58017a1.m67173b(0, 0, gVar, 7, gVar);
                        C76728k kVar3 = new C76728k();
                        kVar3.f224468c = oVar.f228810b;
                        kVar3.f224477l = C100218a.f293644d;
                        kVar3.f224467b = 32;
                        kVar3.f224479n = (MMHandler) ((C36570n) hVar.f193337d).getValue();
                        C67422a aVar3 = r8;
                        C76728k kVar4 = kVar3;
                        C67422a aVar4 = new C67422a(hVar, oVar, b3, 0, false, 12, (C8480h) null);
                        kVar4.f224478m = aVar3;
                        kVar4.f224475j.addAll(wVar.f228827o);
                        kVar4.f224481p = true;
                        C99664b Xn02 = ((C99260q) C86312j.m106911c(cls)).Xn0(2, kVar4);
                        hVar.f193338e.add(Xn02);
                        LifecycleScope c35 = hVar.mo14597c3();
                        if (c35 != null) {
                            LifecycleScope.launchDefault$default(c35, (C53934p0) null, new C67429j(b3, arrayList, hVar, hashMap, b, (C15601d<? super C67429j>) null), 1, (Object) null);
                        }
                        LifecycleScope c36 = hVar.mo14597c3();
                        if (c36 != null) {
                            LifecycleScope.launchDefault$default(c36, (C53934p0) null, new C67431k(b, hVar, oVar, hashMap, (C15601d<? super C67431k>) null), 1, (Object) null);
                        }
                        Log.m105924i(str, str2 + Xn02.hashCode() + ' ' + Xn0.hashCode());
                    }
                    C67421h.m79832i3(hVar).mo109049g().setVisibility(8);
                    C67421h.m79832i3(hVar).mo109047e().setVisibility(0);
                } else {
                    C67421h hVar3 = hVar2;
                    C67421h.m79832i3(hVar3).mo109049g().setVisibility(0);
                    C67421h.m79832i3(hVar3).mo109047e().setVisibility(8);
                    hVar3.mo91617j3();
                    nVar.f187042c.invoke();
                }
            }
            C78062l lVar = (C78062l) wVar.checkAction(C78062l.class);
            if (lVar != null) {
                C67421h hVar4 = this.f193346d;
                if (!C112551y.m153811k(lVar.f228805b)) {
                    C67421h.m79832i3(hVar4).mo109049g().setVisibility(8);
                    C67421h.m79832i3(hVar4).mo109047e().setVisibility(0);
                } else {
                    C67421h.m79832i3(hVar4).mo109049g().setVisibility(0);
                    C67421h.m79832i3(hVar4).mo109047e().setVisibility(8);
                    hVar4.mo91617j3();
                    lVar.f228806c.invoke();
                }
            }
            C67421h hVar5 = this.f193346d;
            IStateAction action = wVar.getAction();
            if (action != null && (action instanceof C78063m)) {
                C78063m mVar = (C78063m) action;
                C77115b bVar = mVar.f228807a.f225009h;
                C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.conversation.RecentConversationListItemExtension");
                C77735c cVar = (C77735c) bVar;
                HashMap<Integer, Object> hashMap2 = wVar.f228830r;
                if (!(hashMap2 == null || (obj2 = hashMap2.get(Integer.valueOf(cVar.f226541e))) == null)) {
                    C10656l lVar2 = obj2 instanceof C10656l ? (C10656l) obj2 : null;
                    if (lVar2 != null) {
                        if (mVar.f228807a.f225019u) {
                            List<C99681n> list = lVar2.f32076e;
                            List<C99681n> subList = list.subList(3, list.size());
                            ArrayList arrayList2 = new ArrayList();
                            int i = 0;
                            for (T next : subList) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    C99681n nVar2 = (C99681n) next;
                                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nVar2.f292151e);
                                    C77735c cVar2 = new C77735c(0, 0, nVar2, lVar2.f32075d, cVar.f226541e, i + 3, 3, (C8480h) null);
                                    String username = z1Var.getUsername();
                                    C87412m.m108593f(username, "contact.username");
                                    int i3 = cVar2.f226541e;
                                    arrayList2.add(C77735c.f226536g.mo107872a(hVar5.getActivity(), username + '-' + 10 + '-' + i3, z1Var, 10, cVar2));
                                    i = i2;
                                } else {
                                    C64197v.m75542k();
                                    throw null;
                                }
                            }
                            MvvmList<C77020b> mvvmList = mVar.f228808b;
                            if (mvvmList != null) {
                                mvvmList.mo129607j(arrayList2, false);
                            }
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            List<C99681n> list2 = lVar2.f32076e;
                            for (C99681n nVar3 : list2.subList(3, list2.size())) {
                                String str3 = nVar3.f292151e;
                                C87412m.m108593f(str3, "it.auxIndex");
                                int i4 = cVar.f226541e;
                                arrayList3.add(str3 + '-' + 10 + '-' + i4);
                            }
                            MvvmList<C77020b> mvvmList2 = mVar.f228808b;
                            if (mvvmList2 != null) {
                                mvvmList2.mo129611o(arrayList3);
                            }
                        }
                        C77020b bVar2 = (C77020b) mVar.f228807a.mo90777Ow();
                        bVar2.f225019u = !bVar2.f225019u;
                        MvvmList<C77020b> mvvmList3 = mVar.f228808b;
                        if (mvvmList3 != null) {
                            MvvmList.m119210t(mvvmList3, bVar2, false, 2, (Object) null);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cn3.h$d */
    public static final class C67426d extends C87413o implements C32224a<C79115l> {

        /* renamed from: d */
        public final /* synthetic */ C67421h f193347d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C67426d(C67421h hVar) {
            super(0);
            this.f193347d = hVar;
        }

        public Object invoke() {
            return new C79115l(this.f193347d.getRootView());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67421h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public static final List m79831g3(C67421h hVar, int i, boolean z, C10656l lVar, String str) {
        int i2 = i;
        C10656l lVar2 = lVar;
        String str2 = str;
        hVar.getClass();
        List<C99681n> subList = (lVar2.f32076e.size() <= 3 || !z) ? lVar2.f32076e : lVar2.f32076e.subList(0, 3);
        ArrayList arrayList = new ArrayList();
        C0289a.C0290a aVar = C0289a.f857a;
        C87412m.m108593f(subList, "showList");
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(subList, 10));
        for (C99681n nVar : subList) {
            arrayList2.add(nVar.f292151e);
        }
        List<C72996z1> c = aVar.mo338c(arrayList2);
        int i3 = 0;
        for (T next : subList) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                C99681n nVar2 = (C99681n) next;
                C72996z1 z1Var = (C72996z1) ((ArrayList) c).get(i3);
                if (!z1Var.mo62932t3()) {
                    int i5 = i3;
                    C77735c cVar = new C77735c(0, 0, nVar2, lVar2.f32075d, i, i3, 3, (C8480h) null);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    C77020b a = C77735c.f226536g.mo107872a(hVar.getActivity(), username + '-' + 10 + '-' + i2, z1Var, 10, cVar);
                    if (i5 == 0) {
                        a.f225012n = true;
                        C87412m.m108594g(str2, "<set-?>");
                        a.f225013o = str2;
                    }
                    arrayList.add(a);
                }
                i3 = i4;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (lVar2.f32076e.size() > 3 && z) {
            C72996z1 z1Var2 = new C72996z1();
            z1Var2.setUsername(i2 + "_collapse");
            C77735c cVar2 = new C77735c(0, 0, (C99681n) null, (C99672i) null, i, Integer.MAX_VALUE, 15, (C8480h) null);
            String username2 = z1Var2.getUsername();
            C87412m.m108593f(username2, "collapseContact.username");
            arrayList.add(C77735c.f226536g.mo107872a(hVar.getActivity(), username2 + '-' + 11 + '-' + i2, z1Var2, 11, cVar2));
        }
        return arrayList;
    }

    /* renamed from: i3 */
    public static final C79115l m79832i3(C67421h hVar) {
        return (C79115l) ((C36570n) hVar.f193339f).getValue();
    }

    /* renamed from: j3 */
    public final void mo91617j3() {
        Log.m105924i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "stopSearch");
        for (C99664b ki : this.f193338e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f193338e.clear();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.observe((C0125s) getActivity(), new C67425c(this));
        }
    }

    public void onDestroy() {
        for (C99664b ki : this.f193338e) {
            ((C99260q) C86312j.m106911c(C99260q.class)).mo128757ki(ki);
        }
        this.f193338e.clear();
    }
}
