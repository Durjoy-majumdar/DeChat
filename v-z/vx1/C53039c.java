package vx1;

import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.stubs.logger.Log;
import com.tencent.wcdb.database.SQLiteStatement;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p749xh.C53340k4;
import px1.C35723a;
import sx3.C64175a0;
import sx3.C64197v;
import zh3.C91753f;

/* renamed from: vx1.c */
public final class C53039c extends MAutoStorage<C53037a> implements C53038b {

    /* renamed from: f */
    public static final String[] f148056f;

    /* renamed from: d */
    public final C91753f f148057d;

    /* renamed from: e */
    public final C35723a<C53037a> f148058e;

    /* renamed from: vx1.c$a */
    public static final class C53040a extends C35723a<C53037a> {

        /* renamed from: d */
        public final /* synthetic */ C53039c f148059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53040a(C53039c cVar, C91753f fVar) {
            super(fVar);
            this.f148059d = cVar;
        }

        /* renamed from: a */
        public String mo57905a() {
            return "INSERT OR REPLACE INTO `GameLocalVideoInfo` (`fileId`,`userId`,`appId`,`appName`,`filePath`,`orgFilePath`,`coverPath`,`extJsonData`,`createTime`,`durationSec`,`title`,`desc`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: b */
        public void mo57906b(SQLiteStatement sQLiteStatement, Object obj) {
            C53037a aVar = (C53037a) obj;
            C87412m.m108594g(sQLiteStatement, "stmt");
            C87412m.m108594g(aVar, "entity");
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 1, aVar.field_fileId);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 2, aVar.field_userId);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 3, aVar.field_appId);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 4, aVar.field_appName);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 5, aVar.field_filePath);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 6, aVar.field_orgFilePath);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 7, aVar.field_coverPath);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 8, aVar.field_extJsonData);
            sQLiteStatement.bindLong(9, aVar.field_createTime);
            sQLiteStatement.bindLong(10, aVar.field_durationSec);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 11, aVar.field_title);
            C53039c.m59362jo(this.f148059d, sQLiteStatement, 12, aVar.field_desc);
        }
    }

    static {
        ArrayList c = C64197v.m75534c(MAutoStorage.getCreateSQLs(C53037a.f148055J, "GameLocalVideoInfo"));
        String[] strArr = C53340k4.f149568t;
        C87412m.m108593f(strArr, "INDEX_CREATE");
        C64175a0.m75509q(c, strArr);
        Object[] array = c.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f148056f = (String[]) array;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53039c(C91753f fVar) {
        super(fVar, C53037a.f148055J, "GameLocalVideoInfo", C53340k4.f149568t);
        C87412m.m108594g(fVar, "storage");
        this.f148057d = fVar;
        this.f148058e = new C53040a(this, fVar);
    }

    /* renamed from: jo */
    public static final void m59362jo(C53039c cVar, SQLiteStatement sQLiteStatement, int i, String str) {
        cVar.getClass();
        if (str == null) {
            sQLiteStatement.bindNull(i);
        } else {
            sQLiteStatement.bindString(i, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011b, code lost:
        cy3.C58003b.m67160a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011e, code lost:
        throw r1;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73746Lo(java.util.List<java.lang.String> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "fileIds"
            gy3.C87412m.m108594g(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 2
            if (r0 != 0) goto L_0x006a
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = sx3.C36907w.m41090l(r7, r2)
            r0.<init>(r2)
            java.util.Iterator r2 = r7.iterator()
        L_0x001b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0032
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            ww1.c r4 = new ww1.c
            r4.<init>()
            r4.f148443d = r3
            r0.add(r4)
            goto L_0x001b
        L_0x0032:
            ww1.d r2 = new ww1.d
            r2.<init>()
            r2.f148446d = r1
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>(r0)
            r2.f148447e = r3
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            r0.f127066a = r2
            ww1.e r3 = new ww1.e
            r3.<init>()
            r0.f127067b = r3
            java.lang.String r3 = "/cgi-bin/mmgame-bin/reportlocalwxagvideo"
            r0.f127068c = r3
            r3 = 25686(0x6456, float:3.5994E-41)
            r0.f127069d = r3
            ob0.c r0 = r0.mo72403a()
            java.lang.Class<com.tencent.mm.ipcinvoker.wx_extension.j> r3 = com.tencent.p014mm.ipcinvoker.wx_extension.C40324j.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            com.tencent.mm.ipcinvoker.wx_extension.j r3 = (com.tencent.p014mm.ipcinvoker.wx_extension.C40324j) r3
            ly1.u0 r4 = new ly1.u0
            r4.<init>(r2)
            r3.mo63014eH(r0, r4)
        L_0x006a:
            boolean r0 = r7.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x0073
            r0 = 1
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            sx3.f0 r0 = sx3.C64186f0.f181907d
            goto L_0x00bb
        L_0x0079:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "SELECT * FROM GameLocalVideoInfo WHERE fileId IN "
            r0.append(r3)
            java.lang.String r3 = yw1.C53601h.m60125d(r7)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            zh3.f r4 = r6.f148057d
            r5 = 0
            android.database.Cursor r0 = r4.rawQuery(r0, r5, r1)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0118 }
            if (r1 == 0) goto L_0x00b5
        L_0x00a0:
            boolean r1 = r0.isAfterLast()     // Catch:{ all -> 0x0118 }
            if (r1 != 0) goto L_0x00b5
            vx1.a r1 = new vx1.a     // Catch:{ all -> 0x0118 }
            r1.<init>()     // Catch:{ all -> 0x0118 }
            r1.convertFrom(r0)     // Catch:{ all -> 0x0118 }
            r3.add(r1)     // Catch:{ all -> 0x0118 }
            r0.moveToNext()     // Catch:{ all -> 0x0118 }
            goto L_0x00a0
        L_0x00b5:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0118 }
            cy3.C58003b.m67160a(r0, r5)
            r0 = r3
        L_0x00bb:
            java.util.Iterator r0 = r0.iterator()
        L_0x00bf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r0.next()
            vx1.a r1 = (vx1.C53037a) r1
            java.lang.String r3 = r1.field_filePath
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)
            java.lang.String r1 = r1.field_coverPath
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
            goto L_0x00bf
        L_0x00d6:
            zh3.f r0 = r6.f148057d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "fileId IN "
            r1.append(r3)
            java.lang.String r3 = yw1.C53601h.m60125d(r7)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r3 = "GameLocalVideoInfo"
            int r0 = r0.delete(r3, r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "deleteByUserId fileIdsSize = "
            r1.append(r2)
            int r7 = r7.size()
            r1.append(r7)
            java.lang.String r7 = "  result = "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "GameLocalVideoInfoDaoImpl"
            com.tencent.stubs.logger.Log.m106505i(r0, r7)
            return
        L_0x0118:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x011a }
        L_0x011a:
            r1 = move-exception
            cy3.C58003b.m67160a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vx1.C53039c.mo73746Lo(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        cy3.C58003b.m67160a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        throw r1;
     */
    /* renamed from: Yt */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<vx1.C53037a> mo73747Yt(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "userId"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT * FROM GameLocalVideoInfo WHERE userId = "
            r0.append(r1)
            java.lang.String r5 = zh3.C91753f.m115264e(r5)
            r0.append(r5)
            java.lang.String r5 = " ORDER BY createTime DESC"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            zh3.f r1 = r4.f148057d
            r2 = 0
            r3 = 2
            android.database.Cursor r5 = r1.rawQuery(r5, r2, r3)
            boolean r1 = r5.moveToFirst()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0047
        L_0x0032:
            boolean r1 = r5.isAfterLast()     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0047
            vx1.a r1 = new vx1.a     // Catch:{ all -> 0x004d }
            r1.<init>()     // Catch:{ all -> 0x004d }
            r1.convertFrom(r5)     // Catch:{ all -> 0x004d }
            r0.add(r1)     // Catch:{ all -> 0x004d }
            r5.moveToNext()     // Catch:{ all -> 0x004d }
            goto L_0x0032
        L_0x0047:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x004d }
            cy3.C58003b.m67160a(r5, r2)
            return r0
        L_0x004d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vx1.C53039c.mo73747Yt(java.lang.String):java.util.List");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: qq */
    public void mo73748qq(List<? extends C53037a> list) {
        C87412m.m108594g(list, "videoFiles");
        if (list.isEmpty()) {
            Log.m106497e("GameLocalVideoInfoDaoImpl", "insertAll not   size = 0");
            return;
        }
        int size = list.size();
        long currentTimeMillis = System.currentTimeMillis();
        long a = this.f148057d.mo125613a();
        try {
            this.f148058e.mo60365c(list);
            this.f148057d.endTransaction(a);
            Log.m106505i("GameLocalVideoInfoDaoImpl", "insertAll videoFiles insertDataSize = " + size + "  cost time = " + (System.currentTimeMillis() - currentTimeMillis));
        } catch (Throwable th) {
            this.f148057d.endTransaction(a);
            throw th;
        }
    }
}
