package nm3;

import a14.C0000n0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import bi3.C54461b;
import bi3.C67247c;
import c14.C54624g;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import he0.C76158j;
import i40.C46166d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p749xh.C78821o1;
import pm3.C77113a;
import pm3.C77118d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sm3.C77733a;
import sx3.C26236u;
import sx3.C64186f0;
import sx3.C64197v;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: nm3.a */
public final class C76934a extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f224831d;

    /* renamed from: e */
    public final C13601g f224832e = C36568h.m40985a(C76935a.f224834d);

    /* renamed from: f */
    public final ArrayList<String> f224833f = new ArrayList<>();

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.datasource.conversation.ConvBoxDataSource$getData$2", mo125469f = "ConvBoxDataSource.kt", mo125470l = {102}, mo125471m = "invokeSuspend")
    /* renamed from: nm3.a$b */
    public static final class C61809b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f175743d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f175744e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f175745f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61809b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C61809b> dVar2) {
            super(2, dVar2);
            this.f175744e = t0Var;
            this.f175745f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61809b(this.f175744e, this.f175745f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61809b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175743d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f175744e;
                C39534d<C77020b> dVar = this.f175745f;
                this.f175743d = 1;
                if (t0Var.emit(dVar, this) == aVar) {
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

    /* renamed from: nm3.a$c */
    public static final class C61810c extends C87413o implements C32226l<C72996z1, String> {

        /* renamed from: d */
        public static final C61810c f175746d = new C61810c();

        public C61810c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C72996z1 z1Var = (C72996z1) obj;
            C87412m.m108594g(z1Var, LocaleUtil.ITALIAN);
            String username = z1Var.getUsername();
            return username == null ? "" : username;
        }
    }

    /* renamed from: nm3.a$a */
    public static final class C76935a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C76935a f224834d = new C76935a();

        public C76935a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C76934a(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f224831d = appCompatActivity;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [a14.p0, java.lang.Object, wx3.d] */
    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        String str;
        UIStateCenter stateCenter;
        C78069w wVar;
        LifecycleScope lifecycleScope2 = lifecycleScope;
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope2, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        Object obj = null;
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        int i = cVar2.f151264a;
        int i2 = cVar2.f151265b;
        if (i < this.f224833f.size()) {
            int i3 = i2 + i;
            if (this.f224833f.size() > i3) {
                dVar.f106150a = true;
            } else {
                i3 = this.f224833f.size();
            }
            ArrayList arrayList = new ArrayList();
            while (i < i3) {
                arrayList.add(this.f224833f.get(i));
                i++;
            }
            List<C72976h2> c = C67247c.f193088a.mo91402c(C64186f0.f181907d, arrayList);
            Map<K, T> map = CommonKt.toMap(C0289a.f857a.mo338c(arrayList), C61810c.f175746d);
            Iterator it = ((ArrayList) c).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C72976h2 h2Var = (C72976h2) next;
                    C72996z1 z1Var = map.get(h2Var.getUsername());
                    if (z1Var == null) {
                        z1Var = new C72996z1(h2Var.getUsername());
                    }
                    C58085t0 t0Var = b;
                    C77733a aVar = new C77733a(h2Var.mo108821o2(), h2Var.mo108828u2());
                    String username = h2Var.getUsername();
                    C87412m.m108593f(username, "conversation.username");
                    String str2 = username + '-' + 30 + '-' + 0;
                    AppCompatActivity appCompatActivity = this.f224831d;
                    C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108594g(str2, "id");
                    C77118d b2 = C77113a.f225222a.mo107429b(appCompatActivity, (C99672i) null, z1Var, (C99681n) null, (C44661m1) null);
                    String username2 = z1Var.getUsername();
                    C87412m.m108593f(username2, "contact.username");
                    CharSequence charSequence = b2.f225226a;
                    String str3 = charSequence == null ? "" : charSequence;
                    String str4 = str2;
                    String str5 = "";
                    C77020b bVar = new C77020b(str4, 30, username2, str3, aVar);
                    bVar.mo107341b(b2.f225227b);
                    C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
                    if (jVar == null || (str = jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2())) == null) {
                        str = str5;
                    }
                    bVar.f225010i = str;
                    if (!Util.isNullOrNil((CharSequence) str) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append('@');
                        sb.append(bVar.f225010i);
                        bVar.f225010i = sb.toString();
                    }
                    bVar.f225012n = false;
                    bVar.f225013o = str5;
                    bVar.f225014p = 0;
                    AppCompatActivity appCompatActivity2 = this.f224831d;
                    if (!(!(appCompatActivity2 instanceof BaseMvvmActivity) || (stateCenter = ((BaseMvvmActivity) appCompatActivity2).getStateCenter()) == null || (wVar = (C78069w) stateCenter.getState()) == null)) {
                        bVar.f225018t = wVar.mo108033b();
                        bVar.f225017s = wVar.mo108034c(bVar.f225007f);
                        bVar.f225016r = wVar.mo108032a(bVar.f225007f);
                    }
                    dVar.f106151b.add(bVar);
                    i4 = i5;
                    b = t0Var;
                    obj = null;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        ? r2 = obj;
        C58085t0 t0Var2 = b;
        LifecycleScope.launchDefault$default(lifecycleScope2, r2, new C61809b(t0Var2, dVar, r2), 1, r2);
        return t0Var2;
    }

    public void onCreate() {
        this.f224833f.clear();
        for (String add : C78821o1.f231207K.select((List<? extends ISqlColumn>) C26236u.m33719b(C78821o1.f231208L)).where(C78821o1.f231211P.equal("conversationboxservice")).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(new C54461b())).build().multiString(((C46166d) ((C36570n) this.f224832e).getValue()).getDB())) {
            this.f224833f.add(add);
        }
        Log.m105924i("MicroMsg.SelectContactDataSource", "onCreate  contactListSize=" + this.f224833f.size());
    }
}
