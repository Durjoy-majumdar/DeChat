package sb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import java.util.concurrent.atomic.AtomicLong;
import p749xh.C53343o0;
import sf0.C77691f;

/* renamed from: sb0.d */
public class C48335d extends MAutoStorage<C53343o0> {

    /* renamed from: f */
    public static final String[] f129415f = {MAutoStorage.getCreateSQLs(C48334c.f129412S, "BizChatInfo")};

    /* renamed from: g */
    public static final AtomicLong f129416g = new AtomicLong(-1);

    /* renamed from: d */
    public ISQLiteDatabase f129417d;

    /* renamed from: e */
    public final MStorageEvent<C48337b, C48337b.C48339b> f129418e = new C48336a(this);

    /* renamed from: sb0.d$a */
    public class C48336a extends MStorageEvent<C48337b, C48337b.C48339b> {
        public C48336a(C48335d dVar) {
        }

        public void processEvent(Object obj, Object obj2) {
            ((C48337b) obj).mo69970a((C48337b.C48339b) obj2);
        }
    }

    /* renamed from: sb0.d$b */
    public interface C48337b {

        /* renamed from: sb0.d$b$a */
        public enum C48338a {
            INSTERT,
            DELETE,
            UPDATE
        }

        /* renamed from: sb0.d$b$b */
        public static class C48339b {

            /* renamed from: a */
            public C48338a f129423a;

            /* renamed from: b */
            public long f129424b;

            /* renamed from: c */
            public C48334c f129425c;
        }

        /* renamed from: a */
        void mo69970a(C48339b bVar);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105921e("MicroMsg.BizChatInfoStorage", "get max biz chat local id", r2);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:19:0x0059, B:34:0x00a8] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48335d(com.tencent.p014mm.sdk.storage.ISQLiteDatabase r12) {
        /*
            r11 = this;
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r0 = sb0.C48334c.f129412S
            java.lang.String r1 = "BizChatInfo"
            r2 = 0
            r11.<init>(r12, r0, r1, r2)
            sb0.d$a r0 = new sb0.d$a
            r0.<init>(r11)
            r11.f129418e = r0
            r11.f129417d = r12
            java.lang.String r0 = "BizChatInfo"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS bizChatLocalIdIndex ON BizChatInfo ( bizChatLocalId )"
            r12.execSQL(r0, r1)
            java.lang.String r0 = "BizChatInfo"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS bizChatIdIndex ON BizChatInfo ( bizChatServId )"
            r12.execSQL(r0, r1)
            java.lang.String r0 = "BizChatInfo"
            java.lang.String r1 = "CREATE INDEX IF NOT EXISTS brandUserNameIndex ON BizChatInfo ( brandUserName )"
            r12.execSQL(r0, r1)
            java.util.concurrent.atomic.AtomicLong r12 = f129416g
            monitor-enter(r12)
            long r0 = r12.get()     // Catch:{ all -> 0x00a9 }
            r3 = 1
            r4 = 0
            r5 = 2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r11.f129417d     // Catch:{ all -> 0x0044 }
            java.lang.String r7 = "select max(bizChatLocalId) from BizChatInfo"
            android.database.Cursor r2 = r6.rawQuery(r7, r2, r5)     // Catch:{ all -> 0x0044 }
            boolean r6 = r2.moveToFirst()     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x0050
            int r0 = r2.getInt(r4)     // Catch:{ all -> 0x0044 }
            long r0 = (long) r0
            goto L_0x0050
        L_0x0044:
            r6 = move-exception
            java.lang.String r7 = "MicroMsg.BizChatInfoStorage"
            java.lang.String r8 = "query local biz chat id"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a2 }
            r9[r4] = r6     // Catch:{ all -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r9)     // Catch:{ all -> 0x00a2 }
        L_0x0050:
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r6 = -1
            java.lang.String r2 = "BizChatInfo"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2, r5)     // Catch:{ all -> 0x0064 }
            java.lang.String r8 = "max_biz_chat_local_id"
            long r6 = r2.getLong(r8, r6)     // Catch:{ all -> 0x0064 }
            goto L_0x0070
        L_0x0064:
            r2 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a9 }
            r8[r4] = r2     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "MicroMsg.BizChatInfoStorage"
            java.lang.String r9 = "get max biz chat local id"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r9, r8)     // Catch:{ all -> 0x00a9 }
        L_0x0070:
            long r6 = java.lang.Math.max(r0, r6)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicLong r2 = f129416g     // Catch:{ all -> 0x00a9 }
            long r8 = r2.get()     // Catch:{ all -> 0x00a9 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0084
            r2.set(r6)     // Catch:{ all -> 0x00a9 }
            r11.mo73041Yt(r6)     // Catch:{ all -> 0x00a9 }
        L_0x0084:
            java.lang.String r2 = "MicroMsg.BizChatInfoStorage"
            java.lang.String r8 = "loading new BizChat id=%d, last max=%d, db=%s"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x00a9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a9 }
            r9[r4] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x00a9 }
            r9[r3] = r0     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x00a9 }
            r9[r5] = r0     // Catch:{ all -> 0x00a9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r8, r9)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r12)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a2:
            r0 = move-exception
            if (r2 == 0) goto L_0x00a8
            r2.close()     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00a9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sb0.C48335d.<init>(com.tencent.mm.sdk.storage.ISQLiteDatabase):void");
    }

    /* renamed from: Lo */
    public C48334c mo73039Lo(String str) {
        String str2 = "select * " + " from " + "BizChatInfo" + " where " + "bizChatServId" + " = '" + str + "' " + " limit 1";
        Log.m105919d("MicroMsg.BizChatInfoStorage", "getByServId sql %s", str2);
        Cursor rawQuery = rawQuery(str2, new String[0]);
        C48334c cVar = null;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                cVar = new C48334c();
                cVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return cVar;
    }

    /* renamed from: Ow */
    public boolean mo73040Ow(C48334c cVar) {
        if (cVar == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorage", "update wrong argument");
            return false;
        }
        long j = cVar.field_bizChatLocalId;
        if (j < 0) {
            Log.m105920e("MicroMsg.BizChatInfoStorage", "update bizchat localid neg");
            return false;
        }
        C48334c a0 = mo73042a0(j);
        if (Util.isNullOrNil(a0.field_bizChatServId) || a0.field_bizChatServId.equals(cVar.field_bizChatServId)) {
            if (Util.isNullOrNil(cVar.field_chatName)) {
                Log.m105924i("MicroMsg.BizChatInfoStorage", "dealWithChatNamePY null");
            } else {
                cVar.field_chatNamePY = C77691f.m93686a(cVar.field_chatName);
            }
            boolean replace = super.replace(cVar);
            if (replace) {
                C48340e.m53678s(cVar);
                C48337b.C48339b bVar = new C48337b.C48339b();
                bVar.f129424b = cVar.field_bizChatLocalId;
                bVar.f129423a = C48337b.C48338a.UPDATE;
                bVar.f129425c = cVar;
                this.f129418e.event(bVar);
                this.f129418e.doNotify();
            }
            return replace;
        }
        Log.m105920e("MicroMsg.BizChatInfoStorage", "update bizchat servid nequal");
        return false;
    }

    /* renamed from: Yt */
    public final void mo73041Yt(long j) {
        try {
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("BizChatInfo", 2);
            if (j > mmkv.getLong("max_biz_chat_local_id", -1)) {
                mmkv.putLong("max_biz_chat_local_id", j);
            }
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.BizChatInfoStorage", "set max biz chat local id", th);
        }
    }

    /* renamed from: a0 */
    public C48334c mo73042a0(long j) {
        C48334c cVar = new C48334c();
        cVar.field_bizChatLocalId = j;
        super.get(cVar, new String[0]);
        return cVar;
    }

    /* renamed from: jo */
    public boolean mo73043jo(long j) {
        C48334c a0 = mo73042a0(j);
        boolean delete = super.delete(a0, "bizChatLocalId");
        if (delete) {
            C48337b.C48339b bVar = new C48337b.C48339b();
            bVar.f129424b = a0.field_bizChatLocalId;
            bVar.f129423a = C48337b.C48338a.DELETE;
            bVar.f129425c = a0;
            this.f129418e.event(bVar);
            this.f129418e.doNotify();
        }
        return delete;
    }

    /* renamed from: qq */
    public boolean mo73044qq(C48334c cVar) {
        long incrementAndGet;
        if (cVar == null) {
            Log.m105928w("MicroMsg.BizChatInfoStorage", "insert wrong argument");
            return false;
        } else if (Util.isNullOrNil(cVar.field_bizChatServId)) {
            Log.m105920e("MicroMsg.BizChatInfoStorage", "insert bizchat servid null");
            return false;
        } else {
            C48334c Lo = mo73039Lo(cVar.field_bizChatServId);
            if (Lo != null) {
                cVar.field_bizChatLocalId = Lo.field_bizChatLocalId;
                Log.m105920e("MicroMsg.BizChatInfoStorage", "insert bizchat servid exist");
                return true;
            }
            AtomicLong atomicLong = f129416g;
            synchronized (atomicLong) {
                incrementAndGet = atomicLong.incrementAndGet();
                mo73041Yt(incrementAndGet);
                Log.m105925i("MicroMsg.BizChatInfoStorage", "incBizChatLocalId %d, db=%s", Long.valueOf(incrementAndGet), toString());
            }
            cVar.field_bizChatLocalId = incrementAndGet;
            boolean insert = super.insert(cVar);
            if (insert) {
                C48337b.C48339b bVar = new C48337b.C48339b();
                bVar.f129424b = cVar.field_bizChatLocalId;
                bVar.f129423a = C48337b.C48338a.INSTERT;
                bVar.f129425c = cVar;
                this.f129418e.event(bVar);
                this.f129418e.doNotify();
            }
            return insert;
        }
    }
}
