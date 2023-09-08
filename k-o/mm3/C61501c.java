package mm3;

import a14.C0000n0;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import c14.C54624g;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import lv1.C99671h;
import lv1.C99672i;
import om3.C77020b;
import rm3.C77540a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: mm3.c */
public final class C61501c extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f174843d;

    /* renamed from: e */
    public final String f174844e;

    /* renamed from: f */
    public final List<String> f174845f;

    /* renamed from: g */
    public final C13601g f174846g = C36568h.m40985a(C61502a.f174849d);

    /* renamed from: h */
    public C44661m1 f174847h;

    /* renamed from: i */
    public List<String> f174848i;

    /* renamed from: mm3.c$a */
    public static final class C61502a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C61502a f174849d = new C61502a();

        public C61502a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.datasource.chatroommember.SelectContactChatRoomMemberDataSource$getData$2", mo125469f = "SelectContactChatRoomMemberDataSource.kt", mo125470l = {95}, mo125471m = "invokeSuspend")
    /* renamed from: mm3.c$b */
    public static final class C61503b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174850d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f174851e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f174852f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61503b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C61503b> dVar2) {
            super(2, dVar2);
            this.f174851e = t0Var;
            this.f174852f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61503b(this.f174851e, this.f174852f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61503b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174850d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f174851e;
                C39534d<C77020b> dVar = this.f174852f;
                this.f174850d = 1;
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

    public C61501c(AppCompatActivity appCompatActivity, String str, List<String> list) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "chatroom");
        C87412m.m108594g(list, "showMemberList");
        this.f174843d = appCompatActivity;
        this.f174844e = str;
        this.f174845f = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        int i;
        C44661m1 m1Var;
        LifecycleScope lifecycleScope2 = lifecycleScope;
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope2, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        List<String> list = this.f174848i;
        C44661m1 m1Var2 = this.f174847h;
        if (!(list == null || m1Var2 == null || cVar2.f151264a >= list.size())) {
            int size = list.size();
            int i2 = cVar2.f151264a;
            int i3 = cVar2.f151265b;
            if (size > i2 + i3) {
                dVar.f106150a = true;
                i = i2 + i3;
            } else {
                i = list.size();
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = cVar2.f151264a; i4 < i; i4++) {
                arrayList.add(list.get(i4));
            }
            for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList)) {
                if (((int) z1Var.f108320R1) != 0) {
                    m1Var = m1Var2;
                    C77540a aVar = new C77540a(m1Var2, (C99671h) null, (C99672i) null, 0, 0, (String) null, 62, (C8480h) null);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    dVar.f106151b.add(C77540a.f226063g.mo107705a(this.f174843d, username + '-' + 30 + '-' + 0, z1Var, 30, aVar));
                } else {
                    m1Var = m1Var2;
                }
                m1Var2 = m1Var;
            }
        }
        LifecycleScope.launchDefault$default(lifecycleScope2, (C53934p0) null, new C61503b(b, dVar, (C15601d<? super C61503b>) null), 1, (Object) null);
        return b;
    }

    /* renamed from: d */
    public int mo70649d() {
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a1, code lost:
        cy3.C58003b.m67160a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r10 = this;
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            eb0.m2 r0 = r0.mo62084mr()
            java.lang.String r1 = r10.f174844e
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            com.tencent.mm.storage.m1 r0 = r0.mo69799Lo(r1)
            r10.f174847h = r0
            java.util.List<java.lang.String> r0 = r10.f174845f
            boolean r1 = r0.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00ad
            java.lang.String r0 = r10.f174844e
            java.util.List r0 = eb0.C45612m0.m50695l(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00ac
            java.lang.String r4 = eb0.C75592q0.m90789s()
            r5 = r0
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            r5.remove(r4)
            com.tencent.mm.sdk.storage.sql.SingleTable r4 = p749xh.C53339k1.f149474h1
            com.tencent.mm.sdk.storage.sql.Column r6 = p749xh.C53339k1.f149475i1
            java.util.List r7 = sx3.C26236u.m33719b(r6)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r4 = r4.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r7)
            com.tencent.mm.sdk.storage.sql.SingleCondition r6 = r6.inString(r0)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r4 = r4.where(r6)
            r6 = 2
            com.tencent.mm.sdk.storage.sql.ISqlOrder[] r7 = new com.tencent.p014mm.sdk.storage.sql.ISqlOrder[r6]
            com.tencent.mm.sdk.storage.sql.ColumnOrder r8 = new com.tencent.mm.sdk.storage.sql.ColumnOrder
            java.lang.String r9 = "showHead"
            r8.<init>(r9, r3, r6, r1)
            r7[r3] = r8
            bi3.a$a$a r6 = new bi3.a$a$a
            r6.<init>()
            r7[r2] = r6
            java.util.List r6 = sx3.C64197v.m75537f(r7)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r4 = r4.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r6)
            com.tencent.mm.sdk.storage.sql.SelectSql r4 = r4.build()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            rx3.g r7 = r10.f174846g
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            i40.d r7 = (i40.C46166d) r7
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r7.getDB()
            if (r7 == 0) goto L_0x00a5
            java.lang.String r8 = r4.getSql()
            java.lang.String[] r4 = r4.getParams()
            android.database.Cursor r4 = r7.rawQuery(r8, r4)
            if (r4 == 0) goto L_0x00a5
        L_0x008a:
            boolean r7 = r4.moveToNext()     // Catch:{ all -> 0x009e }
            if (r7 == 0) goto L_0x0098
            java.lang.String r7 = r4.getString(r3)     // Catch:{ all -> 0x009e }
            r6.add(r7)     // Catch:{ all -> 0x009e }
            goto L_0x008a
        L_0x0098:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009e }
            cy3.C58003b.m67160a(r4, r1)
            goto L_0x00a5
        L_0x009e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            cy3.C58003b.m67160a(r4, r0)
            throw r1
        L_0x00a5:
            r5.clear()
            r5.addAll(r6)
            goto L_0x00ad
        L_0x00ac:
            r0 = r1
        L_0x00ad:
            r10.f174848i = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.util.List<java.lang.String> r1 = r10.f174845f
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.SelectContactChatRoomMemberDataSource"
            java.lang.String r2 = "showMemberList: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm3.C61501c.onCreate():void");
    }
}
