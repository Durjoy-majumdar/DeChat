package ex1;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.stubs.logger.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p749xh.C53345p4;
import px1.C35723a;
import sx3.C64175a0;
import sx3.C64197v;
import zh3.C91753f;

/* renamed from: ex1.f */
public final class C45713f extends MAutoStorage<C45711d> implements C45712e {

    /* renamed from: f */
    public static final String[] f123542f;

    /* renamed from: d */
    public final C91753f f123543d;

    /* renamed from: e */
    public final C35723a<C45711d> f123544e;

    /* renamed from: ex1.f$a */
    public static final class C45714a extends C35723a<C45711d> {
        public C45714a(C91753f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public String mo57905a() {
            return "INSERT OR REPLACE INTO `GameSimpleUserInfo` (`compositionKey`,`userName`,`roomName`,`nickName`,`avatarURL`,`role`,`updateTime`) VALUES (?,?,?,?,?,?,?)";
        }

        /* renamed from: b */
        public void mo57906b(SQLiteStatement sQLiteStatement, Object obj) {
            C45711d dVar = (C45711d) obj;
            C87412m.m108594g(sQLiteStatement, "stmt");
            C87412m.m108594g(dVar, "entity");
            sQLiteStatement.bindString(1, dVar.field_compositionKey);
            sQLiteStatement.bindString(2, dVar.field_userName);
            sQLiteStatement.bindString(3, dVar.field_roomName);
            sQLiteStatement.bindString(4, dVar.field_nickName);
            String str = dVar.field_avatarURL;
            if (str == null) {
                sQLiteStatement.bindNull(5);
            } else {
                sQLiteStatement.bindString(5, str);
            }
            sQLiteStatement.bindLong(6, (long) dVar.field_role);
            sQLiteStatement.bindLong(7, dVar.field_updateTime);
        }
    }

    static {
        ArrayList c = C64197v.m75534c(MAutoStorage.getCreateSQLs(C45711d.f123541z, "GameSimpleUserInfo"));
        String[] strArr = C53345p4.f149770o;
        C87412m.m108593f(strArr, "INDEX_CREATE");
        C64175a0.m75509q(c, strArr);
        Object[] array = c.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f123542f = (String[]) array;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45713f(C91753f fVar) {
        super(fVar, C45711d.f123541z, "GameSimpleUserInfo", C53345p4.f149770o);
        C87412m.m108594g(fVar, "storage");
        this.f123543d = fVar;
        this.f123544e = new C45714a(fVar);
    }

    /* renamed from: Dw */
    public void mo71201Dw(String str) {
        C87412m.m108594g(str, "chatroomName");
        int delete = this.f123543d.delete("GameSimpleUserInfo", "roomName = ?", new String[]{str});
        Log.m106505i("ChatroomMemberPreloadManager.daoImpl", "deleteAll By chatroomName = " + str + "  delete num = " + delete);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        cy3.C58003b.m67160a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0098, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<ex1.C45711d> Mj0(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "keyword"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "chatroomName"
            gy3.C87412m.m108594g(r8, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SELECT * FROM GameSimpleUserInfo WHERE roomName = "
            r2.append(r3)
            java.lang.String r8 = zh3.C91753f.m115264e(r8)
            r2.append(r8)
            java.lang.String r8 = " AND nickName LIKE '%"
            r2.append(r8)
            r2.append(r7)
            java.lang.String r8 = "%' ORDER BY role ASC"
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zh3.f r3 = r6.f123543d
            r4 = 0
            r5 = 2
            android.database.Cursor r8 = r3.rawQuery(r8, r4, r5)
            boolean r3 = r8.moveToFirst()     // Catch:{ all -> 0x0092 }
            if (r3 == 0) goto L_0x0058
        L_0x0043:
            boolean r3 = r8.isAfterLast()     // Catch:{ all -> 0x0092 }
            if (r3 != 0) goto L_0x0058
            ex1.d r3 = new ex1.d     // Catch:{ all -> 0x0092 }
            r3.<init>()     // Catch:{ all -> 0x0092 }
            r3.convertFrom(r8)     // Catch:{ all -> 0x0092 }
            r2.add(r3)     // Catch:{ all -> 0x0092 }
            r8.moveToNext()     // Catch:{ all -> 0x0092 }
            goto L_0x0043
        L_0x0058:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0092 }
            cy3.C58003b.m67160a(r8, r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "query cost time = "
            r8.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r8.append(r3)
            java.lang.String r0 = " keyword = "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = "  result.size = "
            r8.append(r7)
            int r7 = r2.size()
            r8.append(r7)
            r7 = 32
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "ChatroomMemberPreloadManager.daoImpl"
            com.tencent.stubs.logger.Log.m106505i(r8, r7)
            return r2
        L_0x0092:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            cy3.C58003b.m67160a(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.C45713f.Mj0(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: OQ */
    public void mo71203OQ(List<? extends C45711d> list, String str) {
        C87412m.m108594g(list, "users");
        C87412m.m108594g(str, "chatroomName");
        if (list.isEmpty()) {
            Log.m106505i("ChatroomMemberPreloadManager.daoImpl", "insertAll  size = " + list.size());
            return;
        }
        int size = list.size();
        long currentTimeMillis = System.currentTimeMillis();
        long a = this.f123543d.mo125613a();
        try {
            this.f123544e.mo60365c(list);
            this.f123543d.endTransaction(a);
            Log.m106505i("ChatroomMemberPreloadManager.daoImpl", "insertAll insertDataSize = " + size + "  cost time = " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            this.f123543d.endTransaction(a);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        cy3.C58003b.m67160a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053 A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<ex1.C45711d> Rh0(java.lang.String r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "chatroomName"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT * FROM GameSimpleUserInfo WHERE roomName = "
            r0.append(r1)
            java.lang.String r4 = zh3.C91753f.m115264e(r4)
            r0.append(r4)
            java.lang.String r4 = " ORDER BY role ASC LIMIT "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            zh3.f r0 = r3.f123543d
            r1 = 0
            r2 = 2
            android.database.Cursor r4 = r0.rawQuery(r4, r1, r2)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x005a
        L_0x0035:
            boolean r0 = r4.isAfterLast()     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005a
            ex1.d r0 = new ex1.d     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            r0.convertFrom(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = r0.field_nickName     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x0050
            int r2 = r2.length()     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r2 = 0
            goto L_0x0051
        L_0x0050:
            r2 = 1
        L_0x0051:
            if (r2 != 0) goto L_0x0056
            r5.add(r0)     // Catch:{ all -> 0x0060 }
        L_0x0056:
            r4.moveToNext()     // Catch:{ all -> 0x0060 }
            goto L_0x0035
        L_0x005a:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0060 }
            cy3.C58003b.m67160a(r4, r1)
            return r5
        L_0x0060:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            cy3.C58003b.m67160a(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.C45713f.Rh0(java.lang.String, int):java.util.List");
    }

    /* renamed from: Sp */
    public void mo71205Sp(String str, String str2) {
        C87412m.m108594g(str, "chatroomName");
        C87412m.m108594g(str2, "userName");
        int delete = this.f123543d.delete("GameSimpleUserInfo", "roomName = ? and userName=? ", new String[]{str, str2});
        Log.m106505i("ChatroomMemberPreloadManager.daoImpl", "deleteByUserName chatroomName = " + str + "  userName " + str2 + "  result = " + delete);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[Catch:{ all -> 0x002d, all -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037 A[Catch:{ all -> 0x002d, all -> 0x0040 }] */
    /* renamed from: fS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo71206fS(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "chatroomName"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT count(*) FROM GameSimpleUserInfo WHERE roomName = "
            r0.append(r1)
            java.lang.String r5 = zh3.C91753f.m115264e(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            zh3.f r0 = r4.f123543d
            r1 = 0
            r2 = 2
            android.database.Cursor r5 = r0.rawQuery(r5, r1, r2)
            r0 = 1
            r2 = 0
            if (r5 == 0) goto L_0x002f
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x002d }
            if (r3 != r0) goto L_0x002f
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            goto L_0x003f
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0037
            long r2 = r5.getLong(r2)     // Catch:{ all -> 0x002d }
            goto L_0x0039
        L_0x0037:
            r2 = 0
        L_0x0039:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002d }
            cy3.C58003b.m67160a(r5, r1)
            return r2
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.C45713f.mo71206fS(java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009d, code lost:
        cy3.C58003b.m67160a(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00a0, code lost:
        throw r0;
     */
    /* renamed from: iP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<ex1.C45711d> mo71207iP(java.util.List<java.lang.String> r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "userNameList"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "chatroomName"
            gy3.C87412m.m108594g(r8, r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "SELECT * FROM GameSimpleUserInfo WHERE userName IN "
            r2.append(r3)
            java.lang.String r3 = yw1.C53601h.m60125d(r7)
            r2.append(r3)
            java.lang.String r3 = " AND roomName = "
            r2.append(r3)
            java.lang.String r8 = zh3.C91753f.m115264e(r8)
            r2.append(r8)
            java.lang.String r8 = " ORDER BY role ASC"
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            zh3.f r3 = r6.f123543d
            r4 = 0
            r5 = 2
            android.database.Cursor r8 = r3.rawQuery(r8, r4, r5)
            boolean r3 = r8.moveToFirst()     // Catch:{ all -> 0x009a }
            if (r3 == 0) goto L_0x005c
        L_0x0047:
            boolean r3 = r8.isAfterLast()     // Catch:{ all -> 0x009a }
            if (r3 != 0) goto L_0x005c
            ex1.d r3 = new ex1.d     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
            r3.convertFrom(r8)     // Catch:{ all -> 0x009a }
            r2.add(r3)     // Catch:{ all -> 0x009a }
            r8.moveToNext()     // Catch:{ all -> 0x009a }
            goto L_0x0047
        L_0x005c:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x009a }
            cy3.C58003b.m67160a(r8, r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "query cost time = "
            r8.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r8.append(r3)
            java.lang.String r0 = " rawSize = "
            r8.append(r0)
            int r7 = r7.size()
            r8.append(r7)
            java.lang.String r7 = "   result.size = "
            r8.append(r7)
            int r7 = r2.size()
            r8.append(r7)
            r7 = 32
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "ChatroomMemberPreloadManager.daoImpl"
            com.tencent.stubs.logger.Log.m106505i(r8, r7)
            return r2
        L_0x009a:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            cy3.C58003b.m67160a(r8, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.C45713f.mo71207iP(java.util.List, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        cy3.C58003b.m67160a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        throw r1;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<ex1.C45711d> mo71208m(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT * FROM GameSimpleUserInfo WHERE userName = "
            r0.append(r1)
            java.lang.String r5 = zh3.C91753f.m115264e(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            zh3.f r1 = r4.f123543d
            r2 = 0
            r3 = 2
            android.database.Cursor r5 = r1.rawQuery(r5, r2, r3)
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0042
        L_0x002d:
            boolean r1 = r5.isAfterLast()     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0042
            ex1.d r1 = new ex1.d     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
            r1.convertFrom(r5)     // Catch:{ all -> 0x0048 }
            r0.add(r1)     // Catch:{ all -> 0x0048 }
            r5.moveToNext()     // Catch:{ all -> 0x0048 }
            goto L_0x002d
        L_0x0042:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0048 }
            cy3.C58003b.m67160a(r5, r2)
            return r0
        L_0x0048:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.C45713f.mo71208m(java.lang.String):java.util.List");
    }
}
