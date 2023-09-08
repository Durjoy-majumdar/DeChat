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
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
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
import sm3.C77734b;
import sx3.C26236u;
import sx3.C64186f0;
import sx3.C64197v;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: nm3.b */
public final class C76936b extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f224835d;

    /* renamed from: e */
    public final C13601g f224836e = C36568h.m40985a(C76937a.f224838d);

    /* renamed from: f */
    public final ArrayList<String> f224837f = new ArrayList<>();

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.datasource.conversation.OpenImKeFuDataSource$getData$2", mo125469f = "OpenImKeFuDataSource.kt", mo125470l = {102}, mo125471m = "invokeSuspend")
    /* renamed from: nm3.b$b */
    public static final class C61811b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f175747d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f175748e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f175749f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61811b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C61811b> dVar2) {
            super(2, dVar2);
            this.f175748e = t0Var;
            this.f175749f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61811b(this.f175748e, this.f175749f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61811b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175747d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f175748e;
                C39534d<C77020b> dVar = this.f175749f;
                this.f175747d = 1;
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

    /* renamed from: nm3.b$c */
    public static final class C61812c extends C87413o implements C32226l<C72996z1, String> {

        /* renamed from: d */
        public static final C61812c f175750d = new C61812c();

        public C61812c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C72996z1 z1Var = (C72996z1) obj;
            C87412m.m108594g(z1Var, LocaleUtil.ITALIAN);
            String username = z1Var.getUsername();
            return username == null ? "" : username;
        }
    }

    /* renamed from: nm3.b$a */
    public static final class C76937a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C76937a f224838d = new C76937a();

        public C76937a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C76936b(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f224835d = appCompatActivity;
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
        if (i < this.f224837f.size()) {
            int i3 = i2 + i;
            if (this.f224837f.size() > i3) {
                dVar.f106150a = true;
            } else {
                i3 = this.f224837f.size();
            }
            ArrayList arrayList = new ArrayList();
            while (i < i3) {
                arrayList.add(this.f224837f.get(i));
                i++;
            }
            List<C72976h2> c = C67247c.f193088a.mo91402c(C64186f0.f181907d, arrayList);
            Map<K, T> map = CommonKt.toMap(C0289a.f857a.mo338c(arrayList), C61812c.f175750d);
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
                    C77734b bVar = new C77734b(h2Var.mo108821o2(), h2Var.mo108828u2());
                    String username = h2Var.getUsername();
                    C87412m.m108593f(username, "conversation.username");
                    String str2 = username + '-' + 30 + '-' + 0;
                    AppCompatActivity appCompatActivity = this.f224835d;
                    C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108594g(str2, "id");
                    C77118d b2 = C77113a.f225222a.mo107429b(appCompatActivity, (C99672i) null, z1Var, (C99681n) null, (C44661m1) null);
                    String username2 = z1Var.getUsername();
                    C87412m.m108593f(username2, "contact.username");
                    CharSequence charSequence = b2.f225226a;
                    String str3 = charSequence == null ? "" : charSequence;
                    String str4 = str2;
                    String str5 = "";
                    C77020b bVar2 = new C77020b(str4, 30, username2, str3, bVar);
                    bVar2.mo107341b(b2.f225227b);
                    C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
                    if (jVar == null || (str = jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2())) == null) {
                        str = str5;
                    }
                    bVar2.f225010i = str;
                    if (!Util.isNullOrNil((CharSequence) str) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append('@');
                        sb.append(bVar2.f225010i);
                        bVar2.f225010i = sb.toString();
                    }
                    bVar2.f225012n = false;
                    bVar2.f225013o = str5;
                    bVar2.f225014p = 0;
                    AppCompatActivity appCompatActivity2 = this.f224835d;
                    if (!(!(appCompatActivity2 instanceof BaseMvvmActivity) || (stateCenter = ((BaseMvvmActivity) appCompatActivity2).getStateCenter()) == null || (wVar = (C78069w) stateCenter.getState()) == null)) {
                        bVar2.f225018t = wVar.mo108033b();
                        bVar2.f225017s = wVar.mo108034c(bVar2.f225007f);
                        bVar2.f225016r = wVar.mo108032a(bVar2.f225007f);
                    }
                    dVar.f106151b.add(bVar2);
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
        LifecycleScope.launchDefault$default(lifecycleScope2, r2, new C61811b(t0Var2, dVar, r2), 1, r2);
        return t0Var2;
    }

    public void onCreate() {
        this.f224837f.clear();
        SingleTable singleTable = C78821o1.f231207K;
        Column column = C78821o1.f231208L;
        for (String add : singleTable.select((List<? extends ISqlColumn>) C26236u.m33719b(column)).where(column.like("'%@kefu.openim'")).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(new C54461b())).build().multiString(((C46166d) ((C36570n) this.f224836e).getValue()).getDB())) {
            this.f224837f.add(add);
        }
        Log.m105924i("MicroMsg.OpenImKeFuDataSource", "onCreate  contactListSize=" + this.f224837f.size());
    }
}
