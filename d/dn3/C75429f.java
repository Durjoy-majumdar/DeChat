package dn3;

import a14.C0000n0;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45253g;
import d14.C58085t0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.ResultKt;
import lv1.C10656l;
import lv1.C99681n;
import om3.C77020b;
import pm3.C77113a;
import pm3.C77118d;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C36570n;
import sm3.C77737d;
import sx3.C64197v;
import tm3.C64957k;
import tm3.C78064o;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.mvvm.uic.conversation.selectchatroom.SelectChatroomConversationSearchUIC$startSearch$2", mo125469f = "SelectChatroomConversationSearchUIC.kt", mo125470l = {105}, mo125471m = "invokeSuspend")
/* renamed from: dn3.f */
public final class C75429f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f221721d;

    /* renamed from: e */
    public final /* synthetic */ C58085t0<C10656l> f221722e;

    /* renamed from: f */
    public final /* synthetic */ HashMap<Integer, Object> f221723f;

    /* renamed from: g */
    public final /* synthetic */ C75421e f221724g;

    /* renamed from: h */
    public final /* synthetic */ C78064o f221725h;

    /* renamed from: dn3.f$a */
    public static final class C75430a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ HashMap<Integer, Object> f221726d;

        /* renamed from: e */
        public final /* synthetic */ C75421e f221727e;

        /* renamed from: f */
        public final /* synthetic */ C78064o f221728f;

        public C75430a(HashMap<Integer, Object> hashMap, C75421e eVar, C78064o oVar) {
            this.f221726d = hashMap;
            this.f221727e = eVar;
            this.f221728f = oVar;
        }

        public Object emit(Object obj, C15601d dVar) {
            C10656l lVar;
            UIStateCenter stateCenter;
            C78069w wVar;
            C10656l lVar2 = (C10656l) obj;
            int i = 0;
            this.f221726d.put(new Integer(0), lVar2);
            UIStateCenter e3 = this.f221727e.mo14599e3();
            if (e3 != null) {
                C78064o oVar = this.f221728f;
                HashMap<Integer, Object> hashMap = this.f221726d;
                C75421e eVar = this.f221727e;
                eVar.getClass();
                ArrayList arrayList = new ArrayList();
                List<C99681n> list = lVar2.f32076e;
                if (list != null) {
                    int i2 = 0;
                    for (T next : list) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C99681n nVar = (C99681n) next;
                            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(nVar.f292151e);
                            if (z1Var == null || z1Var.mo62932t3()) {
                                lVar = lVar2;
                            } else {
                                C77737d dVar2 = r10;
                                C77737d dVar3 = new C77737d(0, nVar, lVar2.f32075d, i2, 1, (C8480h) null);
                                String username = z1Var.getUsername();
                                C87412m.m108593f(username, "contact.username");
                                String str = username + '-' + 10 + '-' + i;
                                AppCompatActivity activity = eVar.getActivity();
                                String str2 = (String) ((C36570n) eVar.f221709g).getValue();
                                C87412m.m108593f(str2, "selectShowHeadDisplay");
                                String str3 = (String) ((C36570n) eVar.f221710h).getValue();
                                C87412m.m108593f(str3, "chatroomSessionWord");
                                C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                                C87412m.m108594g(str, "id");
                                C77737d dVar4 = dVar2;
                                C77118d b = C77113a.f225222a.mo107429b(activity, dVar4.f226545c, z1Var, dVar4.f226544b, (C44661m1) null);
                                lVar = lVar2;
                                String username2 = z1Var.getUsername();
                                C87412m.m108593f(username2, "contact.username");
                                CharSequence charSequence = b.f225226a;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                                C77020b bVar = new C77020b(str, 10, username2, charSequence, dVar4);
                                bVar.mo107341b(b.f225227b);
                                if (!(!(activity instanceof BaseMvvmActivity) || (stateCenter = ((BaseMvvmActivity) activity).getStateCenter()) == null || (wVar = (C78069w) stateCenter.getState()) == null)) {
                                    bVar.f225018t = wVar.mo108033b();
                                    bVar.f225017s = wVar.mo108034c(bVar.f225007f);
                                    bVar.f225016r = wVar.mo108032a(bVar.f225007f);
                                }
                                if (bVar.f225017s) {
                                    bVar.f225013o = str2;
                                } else {
                                    bVar.f225013o = str3;
                                }
                                bVar.f225014p = activity.getResources().getColor(C0966R.color.f2929c);
                                arrayList.add(bVar);
                            }
                            lVar2 = lVar;
                            i2 = i3;
                            i = 0;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                }
                e3.dispatch(new C64957k(oVar, hashMap, arrayList));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75429f(C58085t0<C10656l> t0Var, HashMap<Integer, Object> hashMap, C75421e eVar, C78064o oVar, C15601d<? super C75429f> dVar) {
        super(2, dVar);
        this.f221722e = t0Var;
        this.f221723f = hashMap;
        this.f221724g = eVar;
        this.f221725h = oVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C75429f(this.f221722e, this.f221723f, this.f221724g, this.f221725h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        ((C75429f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        return C15911a.COROUTINE_SUSPENDED;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f221721d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C58085t0<C10656l> t0Var = this.f221722e;
            C75430a aVar2 = new C75430a(this.f221723f, this.f221724g, this.f221725h);
            this.f221721d = 1;
            if (t0Var.mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        throw new C13600d();
    }
}
