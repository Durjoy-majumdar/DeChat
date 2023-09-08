package nm3;

import a14.C0000n0;
import ac2.C39534d;
import ac2.C53996a;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import bi3.C54461b;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58085t0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import om3.C77020b;
import p749xh.C78821o1;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

/* renamed from: nm3.c */
public final class C76938c extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f224839d;

    /* renamed from: e */
    public final C13601g f224840e = C36568h.m40985a(C76939a.f224843d);

    /* renamed from: f */
    public final ArrayList<String> f224841f = new ArrayList<>();

    /* renamed from: g */
    public HashSet<String> f224842g = new HashSet<>();

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.datasource.conversation.RecentConversationDataSource$getData$2", mo125469f = "RecentConversationDataSource.kt", mo125470l = {114}, mo125471m = "invokeSuspend")
    /* renamed from: nm3.c$b */
    public static final class C61813b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f175751d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f175752e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f175753f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61813b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C61813b> dVar2) {
            super(2, dVar2);
            this.f175752e = t0Var;
            this.f175753f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61813b(this.f175752e, this.f175753f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61813b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f175751d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f175752e;
                C39534d<C77020b> dVar = this.f175753f;
                this.f175751d = 1;
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

    /* renamed from: nm3.c$c */
    public static final class C61814c extends C87413o implements C32226l<C72996z1, String> {

        /* renamed from: d */
        public static final C61814c f175754d = new C61814c();

        public C61814c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C72996z1 z1Var = (C72996z1) obj;
            C87412m.m108594g(z1Var, LocaleUtil.ITALIAN);
            String username = z1Var.getUsername();
            return username == null ? "" : username;
        }
    }

    /* renamed from: nm3.c$a */
    public static final class C76939a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C76939a f224843d = new C76939a();

        public C76939a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C76938c(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f224839d = appCompatActivity;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0110  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d14.C45252f<ac2.C39534d<om3.C77020b>> mo70650e(com.tencent.p014mm.sdk.coroutines.LifecycleScope r29, ac2.C53998c<om3.C77020b> r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.String r3 = "scope"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "request"
            gy3.C87412m.m108594g(r2, r3)
            ac2.d r3 = new ac2.d
            r3.<init>(r2)
            r4 = 0
            r5 = 0
            r6 = 7
            d14.t0 r6 = d14.C58017a1.m67173b(r4, r4, r5, r6, r5)
            int r7 = r2.f151264a
            int r2 = r2.f151265b
            java.util.ArrayList<java.lang.String> r8 = r0.f224841f
            int r8 = r8.size()
            r9 = 1
            if (r7 >= r8) goto L_0x0128
            java.util.ArrayList<java.lang.String> r8 = r0.f224841f
            int r8 = r8.size()
            int r2 = r2 + r7
            if (r8 <= r2) goto L_0x0035
            r3.f106150a = r9
            goto L_0x003b
        L_0x0035:
            java.util.ArrayList<java.lang.String> r2 = r0.f224841f
            int r2 = r2.size()
        L_0x003b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0040:
            if (r7 >= r2) goto L_0x004e
            java.util.ArrayList<java.lang.String> r10 = r0.f224841f
            java.lang.Object r10 = r10.get(r7)
            r8.add(r10)
            int r7 = r7 + 1
            goto L_0x0040
        L_0x004e:
            bi3.c$a r2 = bi3.C67247c.f193088a
            r7 = 3
            com.tencent.mm.sdk.storage.sql.Column[] r7 = new com.tencent.p014mm.sdk.storage.sql.Column[r7]
            com.tencent.mm.sdk.storage.sql.Column r10 = p749xh.C78821o1.f231208L
            r7[r4] = r10
            com.tencent.mm.sdk.storage.sql.Column r10 = p749xh.C78821o1.f231209M
            r7[r9] = r10
            r10 = 2
            com.tencent.mm.sdk.storage.sql.Column r11 = p749xh.C78821o1.f231210N
            r7[r10] = r11
            java.util.List r7 = sx3.C64197v.m75537f(r7)
            java.util.List r2 = r2.mo91402c(r7, r8)
            bi3.a$a r7 = bi3.C0289a.f857a
            java.util.List r7 = r7.mo338c(r8)
            nm3.c$c r8 = nm3.C76938c.C61814c.f175754d
            java.util.Map r7 = com.tencent.p014mm.sdk.p134kt.CommonKt.toMap(r7, r8)
            java.util.Iterator r2 = r2.iterator()
            r8 = 0
        L_0x0079:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x0128
            java.lang.Object r10 = r2.next()
            int r11 = r8 + 1
            if (r8 < 0) goto L_0x0124
            com.tencent.mm.storage.h2 r10 = (com.tencent.p014mm.storage.C72976h2) r10
            java.lang.String r8 = r10.getUsername()
            java.lang.Object r8 = r7.get(r8)
            com.tencent.mm.storage.z1 r8 = (com.tencent.p014mm.storage.C72996z1) r8
            if (r8 != 0) goto L_0x009e
            com.tencent.mm.storage.z1 r8 = new com.tencent.mm.storage.z1
            java.lang.String r12 = r10.getUsername()
            r8.<init>(r12)
        L_0x009e:
            r16 = r8
            sm3.c r8 = new sm3.c
            long r18 = r10.mo108821o2()
            long r20 = r10.mo108828u2()
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 60
            r27 = 0
            r17 = r8
            r17.<init>(r18, r20, r22, r23, r24, r25, r26, r27)
            r12 = 30
            java.lang.String r13 = r16.getUsername()
            java.lang.String r14 = "contact.username"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r13 = 45
            r14.append(r13)
            r14.append(r12)
            r14.append(r13)
            r14.append(r4)
            java.lang.String r15 = r14.toString()
            java.util.Set<java.lang.String> r12 = eb0.C45628s0.f123410p
            if (r12 == 0) goto L_0x00f2
            java.lang.String r10 = r10.getUsername()
            java.util.HashSet r12 = (java.util.HashSet) r12
            boolean r10 = r12.contains(r10)
            if (r10 != r9) goto L_0x00f2
            r10 = 1
            goto L_0x00f3
        L_0x00f2:
            r10 = 0
        L_0x00f3:
            if (r10 == 0) goto L_0x0110
            androidx.appcompat.app.AppCompatActivity r14 = r0.f224839d
            java.lang.String r10 = "activity"
            gy3.C87412m.m108594g(r14, r10)
            java.lang.String r10 = "id"
            gy3.C87412m.m108594g(r15, r10)
            sm3.c$a r13 = sm3.C77735c.f226536g
            r17 = 30
            r18 = r8
            om3.b r8 = r13.mo107872a(r14, r15, r16, r17, r18)
            r8.f225020v = r9
            r8.f225021w = r9
            goto L_0x011c
        L_0x0110:
            sm3.c$a r13 = sm3.C77735c.f226536g
            androidx.appcompat.app.AppCompatActivity r14 = r0.f224839d
            r17 = 30
            r18 = r8
            om3.b r8 = r13.mo107872a(r14, r15, r16, r17, r18)
        L_0x011c:
            java.util.ArrayList<T> r10 = r3.f106151b
            r10.add(r8)
            r8 = r11
            goto L_0x0079
        L_0x0124:
            sx3.C64197v.m75542k()
            throw r5
        L_0x0128:
            nm3.c$b r2 = new nm3.c$b
            r2.<init>(r6, r3, r5)
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r1, r5, r2, r9, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nm3.C76938c.mo70650e(com.tencent.mm.sdk.coroutines.LifecycleScope, ac2.c):d14.f");
    }

    /* renamed from: d */
    public int mo70649d() {
        return 0;
    }

    public void onCreate() {
        this.f224841f.clear();
        SelectSql.Builder select = C78821o1.f231207K.select((List<? extends ISqlColumn>) C26236u.m33719b(C78821o1.f231208L));
        Column column = C78821o1.f231211P;
        List<String> multiString = select.where(column.isNullOrEmpty().mo81855or(column.equal("message_fold"))).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(new C54461b())).build().multiString(((C46166d) ((C36570n) this.f224840e).getValue()).getDB());
        Iterator<String> it = multiString.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (C112550d0.m153803w(next, "@", false, 2, (Object) null)) {
                if (C72996z1.m85820U5(next) || C72996z1.m85843n5(next)) {
                    this.f224841f.add(next);
                }
                it.remove();
            }
        }
        for (String str : C0289a.f857a.mo337b(multiString)) {
            if (!this.f224842g.contains(str)) {
                this.f224841f.add(str);
            }
        }
        Log.m105924i("MicroMsg.SelectContactDataSource", "onCreate blockList=" + this.f224842g + " contactListSize=" + this.f224841f.size());
    }
}
