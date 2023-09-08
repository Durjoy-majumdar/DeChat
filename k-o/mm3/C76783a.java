package mm3;

import a14.C0000n0;
import a14.C53934p0;
import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import androidx.appcompat.app.AppCompatActivity;
import bi3.C0289a;
import c14.C54624g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45252f;
import d14.C58017a1;
import d14.C58085t0;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import he0.C76158j;
import i40.C46166d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import lv1.C99671h;
import lv1.C99672i;
import om3.C77020b;
import pm3.C77113a;
import pm3.C77117c;
import pm3.C77118d;
import rm3.C77540a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import tm3.C78069w;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: mm3.a */
public final class C76783a extends C53996a<C77020b> {

    /* renamed from: d */
    public final AppCompatActivity f224591d;

    /* renamed from: e */
    public final String f224592e;

    /* renamed from: f */
    public final List<String> f224593f;

    /* renamed from: g */
    public final C13601g f224594g = C36568h.m40985a(C76784a.f224597d);

    /* renamed from: h */
    public C44661m1 f224595h;

    /* renamed from: i */
    public List<String> f224596i;

    @C91590f(mo125468c = "com.tencent.mm.ui.mvvm.datasource.chatroommember.AtSomeOneChatRoomMemberDataSource$getData$2", mo125469f = "AtSomeOneChatRoomMemberDataSource.kt", mo125470l = {95}, mo125471m = "invokeSuspend")
    /* renamed from: mm3.a$b */
    public static final class C61499b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174837d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C39534d<C77020b>> f174838e;

        /* renamed from: f */
        public final /* synthetic */ C39534d<C77020b> f174839f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61499b(C58085t0<C39534d<C77020b>> t0Var, C39534d<C77020b> dVar, C15601d<? super C61499b> dVar2) {
            super(2, dVar2);
            this.f174838e = t0Var;
            this.f174839f = dVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61499b(this.f174838e, this.f174839f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61499b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f174837d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C39534d<C77020b>> t0Var = this.f174838e;
                C39534d<C77020b> dVar = this.f174839f;
                this.f174837d = 1;
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

    /* renamed from: mm3.a$a */
    public static final class C76784a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C76784a f224597d = new C76784a();

        public C76784a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C76783a(AppCompatActivity appCompatActivity, String str, List<String> list) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str, "chatroom");
        C87412m.m108594g(list, "showMemberList");
        this.f224591d = appCompatActivity;
        this.f224592e = str;
        this.f224593f = list;
    }

    /* renamed from: b */
    public C45252f<C39534d<C77020b>> mo70650e(LifecycleScope lifecycleScope, C53998c<C77020b> cVar) {
        C44661m1 m1Var;
        UIStateCenter stateCenter;
        C78069w wVar;
        String wo;
        C76783a aVar = this;
        LifecycleScope lifecycleScope2 = lifecycleScope;
        C53998c<C77020b> cVar2 = cVar;
        C87412m.m108594g(lifecycleScope2, "scope");
        C87412m.m108594g(cVar2, "request");
        C39534d dVar = new C39534d(cVar2);
        int i = 0;
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        List<String> list = aVar.f224596i;
        C44661m1 m1Var2 = aVar.f224595h;
        if (!(list == null || m1Var2 == null || cVar2.f151264a >= list.size())) {
            int size = list.size();
            int i2 = cVar2.f151264a + cVar2.f151265b;
            if (size > i2) {
                dVar.f106150a = true;
            } else {
                i2 = list.size();
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = cVar2.f151264a; i3 < i2; i3++) {
                arrayList.add(list.get(i3));
            }
            Iterator it = ((ArrayList) C0289a.f857a.mo338c(arrayList)).iterator();
            while (it.hasNext()) {
                C72996z1 z1Var = (C72996z1) it.next();
                if (((int) z1Var.f108320R1) != 0) {
                    C77540a aVar2 = r8;
                    m1Var = m1Var2;
                    C77540a aVar3 = new C77540a(m1Var2, (C99671h) null, (C99672i) null, 0, 0, (String) null, 62, (C8480h) null);
                    String username = z1Var.getUsername();
                    C87412m.m108593f(username, "contact.username");
                    String str = username + '-' + 30 + '-' + i;
                    AppCompatActivity appCompatActivity = aVar.f224591d;
                    C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    C87412m.m108594g(str, "id");
                    C77113a.C77114a aVar4 = C77113a.f225222a;
                    C77113a.C77114a aVar5 = aVar4;
                    AppCompatActivity appCompatActivity2 = appCompatActivity;
                    C77118d a = aVar4.mo107428a(appCompatActivity, z1Var, aVar2.f226065b, aVar2.f226066c, aVar2.f226064a);
                    String username2 = z1Var.getUsername();
                    C87412m.m108593f(username2, "contact.username");
                    CharSequence charSequence = a.f225226a;
                    String str2 = "";
                    C77020b bVar = new C77020b(str, 30, username2, charSequence == null ? str2 : charSequence, aVar2);
                    bVar.mo107341b(a.f225227b);
                    C76158j jVar = (C76158j) C86312j.m106911c(C76158j.class);
                    if (!(jVar == null || (wo = jVar.mo106373wo(z1Var.mo73980x2(), z1Var.mo73976t2())) == null)) {
                        str2 = wo;
                    }
                    bVar.f225010i = str2;
                    if (!Util.isNullOrNil((CharSequence) str2) && C87412m.m108589b("3552365301", z1Var.mo73980x2())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append('@');
                        sb.append(bVar.f225010i);
                        bVar.f225010i = sb.toString();
                    }
                    if (!(!(appCompatActivity2 instanceof BaseMvvmActivity) || (stateCenter = ((BaseMvvmActivity) appCompatActivity2).getStateCenter()) == null || (wVar = (C78069w) stateCenter.getState()) == null)) {
                        bVar.f225018t = wVar.mo108033b();
                        bVar.f225017s = wVar.mo108034c(bVar.f225007f);
                        bVar.f225016r = wVar.mo108032a(bVar.f225007f);
                    }
                    C77117c c = aVar5.mo107430c(aVar2.f226068e, z1Var, aVar2.f226064a);
                    aVar2.f226068e = c.f225223a;
                    String str3 = c.f225224b;
                    C87412m.m108594g(str3, "<set-?>");
                    aVar2.f226069f = str3;
                    String str4 = c.f225225c;
                    C87412m.m108594g(str4, "<set-?>");
                    bVar.f225013o = str4;
                    bVar.f225014p = appCompatActivity2.getResources().getColor(C0966R.color.f2929c);
                    dVar.f106151b.add(bVar);
                } else {
                    m1Var = m1Var2;
                }
                i = 0;
                aVar = this;
                m1Var2 = m1Var;
            }
        }
        LifecycleScope.launchDefault$default(lifecycleScope2, (C53934p0) null, new C61499b(b, dVar, (C15601d<? super C61499b>) null), 1, (Object) null);
        return b;
    }

    /* renamed from: d */
    public int mo70649d() {
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a0, code lost:
        cy3.C58003b.m67160a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a3, code lost:
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
            java.lang.String r1 = r10.f224592e
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            com.tencent.mm.storage.m1 r0 = r0.mo69799Lo(r1)
            r10.f224595h = r0
            java.util.List<java.lang.String> r0 = r10.f224593f
            boolean r1 = r0.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00ac
            java.lang.String r0 = r10.f224592e
            java.util.List r0 = eb0.C45612m0.m50695l(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00ab
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
            rx3.g r7 = r10.f224594g
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            i40.d r7 = (i40.C46166d) r7
            com.tencent.mm.sdk.storage.ISQLiteDatabase r7 = r7.getDB()
            if (r7 == 0) goto L_0x00a4
            java.lang.String r8 = r4.getSql()
            java.lang.String[] r4 = r4.getParams()
            android.database.Cursor r4 = r7.rawQuery(r8, r4)
            if (r4 == 0) goto L_0x00a4
        L_0x0089:
            boolean r7 = r4.moveToNext()     // Catch:{ all -> 0x009d }
            if (r7 == 0) goto L_0x0097
            java.lang.String r7 = r4.getString(r3)     // Catch:{ all -> 0x009d }
            r6.add(r7)     // Catch:{ all -> 0x009d }
            goto L_0x0089
        L_0x0097:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009d }
            cy3.C58003b.m67160a(r4, r1)
            goto L_0x00a4
        L_0x009d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r1 = move-exception
            cy3.C58003b.m67160a(r4, r0)
            throw r1
        L_0x00a4:
            r5.clear()
            r5.addAll(r6)
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            r10.f224596i = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.util.List<java.lang.String> r1 = r10.f224593f
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.AtSomeOneChatRoomMemberDataSource"
            java.lang.String r2 = "showMemberList: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm3.C76783a.onCreate():void");
    }
}
