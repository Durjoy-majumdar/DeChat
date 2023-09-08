package bi3;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C72976h2;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p749xh.C78821o1;

/* renamed from: bi3.c */
public final class C67247c {

    /* renamed from: a */
    public static final C67248a f193088a = new C67248a((C8480h) null);

    /* renamed from: bi3.c$a */
    public static final class C67248a {
        public C67248a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
            cy3.C58003b.m67160a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
            throw r2;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.List<java.lang.String> mo91400a() {
            /*
                r4 = this;
                com.tencent.mm.sdk.storage.sql.SingleTable r0 = p749xh.C78821o1.f231207K
                com.tencent.mm.sdk.storage.sql.Column r1 = p749xh.C78821o1.f231208L
                java.util.List r1 = sx3.C26236u.m33719b(r1)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r1)
                com.tencent.mm.sdk.storage.sql.Column r1 = p749xh.C78821o1.f231211P
                java.lang.String r2 = "message_fold"
                com.tencent.mm.sdk.storage.sql.SingleCondition r1 = r1.equal((java.lang.String) r2)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.where(r1)
                com.tencent.mm.sdk.storage.sql.SelectSql r0 = r0.build()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                f40.o r2 = f40.C86709a0.m107535s()
                zh3.f r2 = r2.f251811i
                if (r2 == 0) goto L_0x0054
                java.lang.String r3 = r0.toSql()
                java.lang.String[] r0 = r0.getParams()
                android.database.Cursor r0 = r2.rawQuery(r3, r0)
                if (r0 == 0) goto L_0x0054
                r2 = 0
            L_0x0038:
                boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x004d }
                if (r3 == 0) goto L_0x0047
                r3 = 0
                java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x004d }
                r1.add(r3)     // Catch:{ all -> 0x004d }
                goto L_0x0038
            L_0x0047:
                rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x004d }
                cy3.C58003b.m67160a(r0, r2)
                goto L_0x0054
            L_0x004d:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x004f }
            L_0x004f:
                r2 = move-exception
                cy3.C58003b.m67160a(r0, r1)
                throw r2
            L_0x0054:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: bi3.C67247c.C67248a.mo91400a():java.util.List");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
            cy3.C58003b.m67160a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
            throw r2;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo91401b() {
            /*
                r10 = this;
                com.tencent.mm.sdk.storage.sql.FunctionColumn r8 = new com.tencent.mm.sdk.storage.sql.FunctionColumn
                com.tencent.mm.sdk.storage.sql.SingleTable r9 = p749xh.C78821o1.f231207K
                java.lang.String r3 = r9.getName()
                java.lang.String r1 = "username"
                java.lang.String r2 = "string"
                r4 = 0
                java.lang.String r5 = "count"
                r6 = 8
                r7 = 0
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                java.util.List r0 = sx3.C26236u.m33719b(r8)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r9.select((java.util.List<? extends com.tencent.p014mm.sdk.storage.sql.ISqlColumn>) r0)
                com.tencent.mm.sdk.storage.sql.Column r1 = p749xh.C78821o1.f231211P
                java.lang.String r2 = "message_fold"
                com.tencent.mm.sdk.storage.sql.SingleCondition r1 = r1.equal((java.lang.String) r2)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r0 = r0.where(r1)
                com.tencent.mm.sdk.storage.sql.SelectSql r0 = r0.build()
                f40.o r1 = f40.C86709a0.m107535s()
                zh3.f r1 = r1.f251811i
                r2 = 0
                if (r1 == 0) goto L_0x0063
                java.lang.String r3 = r0.toSql()
                java.lang.String[] r0 = r0.getParams()
                android.database.Cursor r0 = r1.rawQuery(r3, r0)
                if (r0 == 0) goto L_0x0063
                r1 = 0
                boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x005c }
                if (r3 == 0) goto L_0x0056
                int r2 = r0.getInt(r2)     // Catch:{ all -> 0x005c }
                cy3.C58003b.m67160a(r0, r1)
                return r2
            L_0x0056:
                rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x005c }
                cy3.C58003b.m67160a(r0, r1)
                goto L_0x0063
            L_0x005c:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x005e }
            L_0x005e:
                r2 = move-exception
                cy3.C58003b.m67160a(r0, r1)
                throw r2
            L_0x0063:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: bi3.C67247c.C67248a.mo91401b():int");
        }

        /* renamed from: c */
        public final List<C72976h2> mo91402c(List<? extends Column> list, List<String> list2) {
            C87412m.m108594g(list, "columns");
            C87412m.m108594g(list2, "usernameList");
            SelectSql build = C78821o1.f231207K.select((List<? extends ISqlColumn>) list).where(C78821o1.f231208L.inString(list2)).build();
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (C72976h2 h2Var : build.multiQuery(C86709a0.m107535s().f251811i, C72976h2.class)) {
                String username = h2Var.getUsername();
                C87412m.m108593f(username, "conversation.username");
                hashMap.put(username, h2Var);
            }
            for (String str : list2) {
                C72976h2 h2Var2 = (C72976h2) hashMap.get(str);
                if (h2Var2 != null) {
                    arrayList.add(h2Var2);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public final int mo91403d(String str, String str2, int i) {
            C87412m.m108594g(str, "username");
            SingleTable singleTable = C78821o1.f231207K;
            ContentValues contentValues = new ContentValues();
            contentValues.put(C78821o1.f231211P.getName(), str2);
            contentValues.put(C78821o1.f231212Q.getName(), Integer.valueOf(i));
            int run = singleTable.update(contentValues).where(C78821o1.f231208L.equal(str)).build().run(C86709a0.m107535s().f251811i);
            C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
            if ((Ku instanceof MStorageEx) && run > 0) {
                Ku.doNotify(3, (MStorageEx) Ku, str);
            }
            return run;
        }

        /* renamed from: e */
        public final int mo91404e(List<String> list, String str) {
            C87412m.m108594g(list, "userNames");
            C87412m.m108594g(str, "parentRef");
            SingleTable singleTable = C78821o1.f231207K;
            ContentValues contentValues = new ContentValues();
            contentValues.put(C78821o1.f231211P.getName(), str);
            int run = singleTable.update(contentValues).where(C78821o1.f231208L.inString(list)).build().run(C86709a0.m107535s().f251811i);
            C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
            if ((Ku instanceof MStorageEx) && run > 0) {
                for (String doNotify : list) {
                    Ku.doNotify(8, (MStorageEx) Ku, doNotify);
                }
            }
            return run;
        }
    }
}
