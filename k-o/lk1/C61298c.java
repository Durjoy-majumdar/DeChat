package lk1;

import ac2.C39534d;
import ac2.C53996a;
import ac2.C53998c;
import bi3.C0289a;
import c14.C54637q;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.storage.C72996z1;
import cq1.C57974g;
import cq1.C57976i;
import d14.C45252f;
import d14.C58057l;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import i40.C46166d;
import java.util.ArrayList;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: lk1.c */
public final class C61298c extends C53996a<C57974g> {

    /* renamed from: d */
    public final String f174411d;

    /* renamed from: e */
    public final C13601g f174412e = C36568h.m40985a(C61299a.f174414d);

    /* renamed from: f */
    public List<String> f174413f;

    /* renamed from: lk1.c$a */
    public static final class C61299a extends C87413o implements C32224a<C46166d> {

        /* renamed from: d */
        public static final C61299a f174414d = new C61299a();

        public C61299a() {
            super(0);
        }

        public Object invoke() {
            return new C46166d();
        }
    }

    public C61298c(String str) {
        C87412m.m108594g(str, "chatroom");
        this.f174411d = str;
    }

    /* renamed from: b */
    public C45252f<C39534d<C57974g>> mo70650e(LifecycleScope lifecycleScope, C53998c<C57974g> cVar) {
        int i;
        C87412m.m108594g(lifecycleScope, "scope");
        C87412m.m108594g(cVar, "request");
        C39534d dVar = new C39534d(cVar);
        C54637q qVar = new C54637q();
        List<String> list = this.f174413f;
        if (list != null && cVar.f151264a < list.size()) {
            int size = list.size();
            int i2 = cVar.f151264a;
            int i3 = cVar.f151265b;
            if (size > i2 + i3) {
                dVar.f106150a = true;
                i = i2 + i3;
            } else {
                i = list.size();
            }
            ArrayList arrayList = new ArrayList();
            for (int i4 = cVar.f151264a; i4 < i; i4++) {
                arrayList.add(list.get(i4));
            }
            for (C72996z1 z1Var : C0289a.f857a.mo338c(arrayList)) {
                if (((int) z1Var.f108320R1) != 0 && !C72996z1.m85843n5(z1Var.getUsername())) {
                    dVar.f106151b.add(new C57976i(0, z1Var, 3, this.f174411d));
                }
            }
        }
        qVar.mo75539t(dVar);
        return new C58057l(qVar);
    }

    /* renamed from: d */
    public int mo70649d() {
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a1, code lost:
        cy3.C58003b.m67160a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r8 = this;
            java.lang.Class<a11.c> r0 = a11.C39479c.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            a11.c r0 = (a11.C39479c) r0
            eb0.m2 r0 = r0.mo62084mr()
            java.lang.String r1 = r8.f174411d
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            r0.mo69799Lo(r1)
            java.lang.Class<wo.b> r0 = p740wo.C53193b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            wo.b r0 = (p740wo.C53193b) r0
            java.lang.String r1 = r8.f174411d
            java.util.List r0 = r0.mo73727k5(r1)
            r1 = 0
            if (r0 == 0) goto L_0x00ac
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r0.remove(r2)
            com.tencent.mm.sdk.storage.sql.SingleTable r2 = p749xh.C53339k1.f149474h1
            com.tencent.mm.sdk.storage.sql.Column r3 = p749xh.C53339k1.f149475i1
            java.util.List r4 = sx3.C26236u.m33719b(r3)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r4)
            java.lang.String r4 = "FinderLiveAtGroupDataSource"
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.log(r4)
            com.tencent.mm.sdk.storage.sql.SingleCondition r3 = r3.inString(r0)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.where(r3)
            r3 = 2
            com.tencent.mm.sdk.storage.sql.ISqlOrder[] r4 = new com.tencent.p014mm.sdk.storage.sql.ISqlOrder[r3]
            com.tencent.mm.sdk.storage.sql.ColumnOrder r5 = new com.tencent.mm.sdk.storage.sql.ColumnOrder
            java.lang.String r6 = "showHead"
            r7 = 0
            r5.<init>(r6, r7, r3, r1)
            r4[r7] = r5
            bi3.a$a$a r3 = new bi3.a$a$a
            r3.<init>()
            r5 = 1
            r4[r5] = r3
            java.util.List r3 = sx3.C64197v.m75537f(r4)
            com.tencent.mm.sdk.storage.sql.SelectSql$Builder r2 = r2.orderBy((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlOrder>) r3)
            com.tencent.mm.sdk.storage.sql.SelectSql r2 = r2.build()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            rx3.g r4 = r8.f174412e
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            i40.d r4 = (i40.C46166d) r4
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r4.getDB()
            if (r4 == 0) goto L_0x00a5
            java.lang.String r5 = r2.getSql()
            java.lang.String[] r2 = r2.getParams()
            android.database.Cursor r2 = r4.rawQuery(r5, r2)
            if (r2 == 0) goto L_0x00a5
        L_0x008a:
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x0098
            java.lang.String r4 = r2.getString(r7)     // Catch:{ all -> 0x009e }
            r3.add(r4)     // Catch:{ all -> 0x009e }
            goto L_0x008a
        L_0x0098:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009e }
            cy3.C58003b.m67160a(r2, r1)
            goto L_0x00a5
        L_0x009e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            cy3.C58003b.m67160a(r2, r0)
            throw r1
        L_0x00a5:
            r0.clear()
            r0.addAll(r3)
            goto L_0x00ad
        L_0x00ac:
            r0 = r1
        L_0x00ad:
            r8.f174413f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lk1.C61298c.onCreate():void");
    }
}
