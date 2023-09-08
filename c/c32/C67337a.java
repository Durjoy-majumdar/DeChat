package c32;

import a14.C0000n0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import bi3.C54461b;
import bi3.C67247c;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import d32.C75324a;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he0.C76158j;
import i40.C46166d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import lv1.C99672i;
import lv1.C99681n;
import om3.C77020b;
import p240sx.C77807p;
import p749xh.C78821o1;
import pm3.C77118d;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C64197v;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

/* renamed from: c32.a */
public final class C67337a extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f193181d;

    /* renamed from: e */
    public final C13601g f193182e = C36568h.m40985a(C67338a.f193185d);

    /* renamed from: f */
    public final ArrayList<String> f193183f = new ArrayList<>();

    /* renamed from: g */
    public HashSet<String> f193184g = new HashSet<>();

    @C91590f(mo125468c = "com.tencent.mm.plugin.luckymoney.QuickSendRedPacket.datasource.QSRPRecentConversationDataSource$getData$3", mo125469f = "QSRPRecentConversationDataSource.kt", mo125470l = {123}, mo125471m = "invokeSuspend")
    /* renamed from: c32.a$b */
    public static final class C54653b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f153175d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f153176e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f153177f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54653b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C54653b> dVar2) {
            super(2, dVar2);
            this.f153176e = t0Var;
            this.f153177f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C54653b(this.f153176e, this.f153177f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C54653b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f153175d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f153176e;
                C39534d<C77020b> dVar = this.f153177f;
                this.f153175d = 1;
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

    /* renamed from: c32.a$a */
    public static final class C67338a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C67338a f193185d = new C67338a();

        public C67338a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C67337a(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f193181d = appCompatActivity;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [a14.p0, java.lang.Object, wx3.d] */
    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        String str;
        C67337a aVar = this;
        LifecycleScope lifecycleScope2 = lifecycleScope;
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope2, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        int i = 0;
        Object obj = null;
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        int i2 = cVar2.f151264a;
        int i3 = cVar2.f151265b;
        if (i2 < aVar.f193183f.size()) {
            int i4 = i3 + i2;
            if (aVar.f193183f.size() > i4) {
                dVar.f106150a = true;
            } else {
                i4 = aVar.f193183f.size();
            }
            ArrayList arrayList = new ArrayList();
            while (i2 < i4) {
                arrayList.add(aVar.f193183f.get(i2));
                i2++;
            }
            List<C72976h2> c = C67247c.f193088a.mo91402c(C64197v.m75537f(C78821o1.f231208L, C78821o1.f231209M, C78821o1.f231210N), arrayList);
            List<C72996z1> c2 = C0289a.f857a.mo338c(arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C72996z1 next : c2) {
                String username = next.getUsername();
                C87412m.m108593f(username, "it.username");
                linkedHashMap.put(username, next);
            }
            int i5 = 0;
            for (C72976h2 next2 : c) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    C72976h2 h2Var = next2;
                    C72996z1 z1Var = (C72996z1) linkedHashMap.get(h2Var.getUsername());
                    if (z1Var == null) {
                        z1Var = new C72996z1();
                        z1Var.setUsername(h2Var.getUsername());
                    }
                    C75324a aVar2 = r12;
                    C75324a aVar3 = new C75324a(h2Var.mo108821o2(), h2Var.mo108828u2(), (C99681n) null, (C99672i) null, 0, 0, 60, (C8480h) null);
                    String username2 = z1Var.getUsername();
                    C87412m.m108593f(username2, "contact.username");
                    String str2 = username2 + '-' + 30 + '-' + i;
                    AppCompatActivity appCompatActivity = aVar.f193181d;
                    C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108594g(str2, "id");
                    C77118d Be = ((C77807p) C86312j.m106911c(C77807p.class)).mo107756Be(appCompatActivity, aVar2.f221488d, z1Var, aVar2.f221487c, (C44661m1) null);
                    String username3 = z1Var.getUsername();
                    C87412m.m108593f(username3, "contact.username");
                    CharSequence charSequence = Be.f225226a;
                    String str3 = charSequence == null ? "" : charSequence;
                    String str4 = "";
                    C77020b bVar = r12;
                    C77020b bVar2 = new C77020b(str2, 30, username3, str3, aVar2);
                    bVar.mo107341b(Be.f225227b);
                    C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
                    if (jVar == null || (str = jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2())) == null) {
                        str = str4;
                    }
                    bVar.f225010i = str;
                    if (!Util.isNullOrNil((CharSequence) str) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append('@');
                        sb.append(bVar.f225010i);
                        bVar.f225010i = sb.toString();
                    }
                    bVar.f225012n = false;
                    bVar.f225013o = str4;
                    bVar.f225014p = 0;
                    dVar.f106151b.add(bVar);
                    aVar = this;
                    i5 = i6;
                    i = 0;
                    obj = null;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        ? r0 = obj;
        LifecycleScope.launchDefault$default(lifecycleScope2, r0, new C54653b(b, dVar, r0), 1, r0);
        return b;
    }

    /* renamed from: d */
    public int mo70649d() {
        return 0;
    }

    public void onCreate() {
        this.f193183f.clear();
        SelectSql.Builder select = C78821o1.f231207K.select((List<? extends ISqlColumn>) C26236u.m33719b(C78821o1.f231208L));
        Column column = C78821o1.f231211P;
        List<String> multiString = select.where(column.isNullOrEmpty().mo81855or(column.equal("message_fold"))).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(new C54461b())).build().multiString(((C46166d) ((C36570n) this.f193182e).getValue()).getDB());
        Iterator<String> it = multiString.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (C112550d0.m153803w(next, "@", false, 2, (Object) null)) {
                if (C72996z1.m85820U5(next) || C72996z1.m85843n5(next)) {
                    this.f193183f.add(next);
                }
                it.remove();
            }
        }
        Log.m105924i("MicroMsg.QSRPRecentConversationDataSource", "filter user name contains @, size=" + multiString.size());
        for (String str : C0289a.f857a.mo337b(multiString)) {
            if (!this.f193184g.contains(str)) {
                this.f193183f.add(str);
            }
        }
        Log.m105924i("MicroMsg.QSRPRecentConversationDataSource", "onCreate blockList=" + this.f193184g + " contactListSize=" + this.f193183f.size() + " conversationList=" + this.f193183f);
    }
}
