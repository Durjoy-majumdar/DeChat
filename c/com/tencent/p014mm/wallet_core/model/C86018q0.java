package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.HashMap;
import junit.framework.Assert;
import zh3.C91753f;

/* renamed from: com.tencent.mm.wallet_core.model.q0 */
public class C86018q0 extends MStorageEx {

    /* renamed from: j */
    public static final String[] f250498j = {"CREATE TABLE IF NOT EXISTS walletcache ( sid TEXT PRIMARY KEY, type INT, value TEXT )"};

    /* renamed from: k */
    public static final Object f250499k = new Object();

    /* renamed from: c */
    public C91753f f250500c;

    /* renamed from: d */
    public C86020b<String> f250501d = new C86020b<>("walletcache", TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, 64);

    /* renamed from: e */
    public HashMap<Integer, C86021c> f250502e = new HashMap<>();

    /* renamed from: f */
    public HashMap<String, C86021c> f250503f = new HashMap<>();

    /* renamed from: g */
    public MMHandler f250504g;

    /* renamed from: h */
    public volatile boolean f250505h;

    /* renamed from: i */
    public final Runnable f250506i = new C86019a();

    /* renamed from: com.tencent.mm.wallet_core.model.q0$a */
    public class C86019a implements Runnable {
        public C86019a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0116  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                com.tencent.mm.wallet_core.model.q0 r0 = com.tencent.p014mm.wallet_core.model.C86018q0.this
                zh3.f r0 = r0.f250500c
                com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()
                if (r0 == 0) goto L_0x0138
                boolean r1 = r0.isOpen()
                if (r1 != 0) goto L_0x0012
                goto L_0x0138
            L_0x0012:
                r1 = 1
                r2 = 0
                r0.acquireReference()     // Catch:{ RuntimeException -> 0x00e3, all -> 0x00de }
                r0.beginTransaction()     // Catch:{ RuntimeException -> 0x00e3, all -> 0x00de }
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ RuntimeException -> 0x00dc, all -> 0x00d9 }
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ RuntimeException -> 0x00dc, all -> 0x00d9 }
                com.tencent.mm.wallet_core.model.q0 r5 = com.tencent.p014mm.wallet_core.model.C86018q0.this     // Catch:{ RuntimeException -> 0x00dc, all -> 0x00d9 }
                monitor-enter(r5)     // Catch:{ RuntimeException -> 0x00dc, all -> 0x00d9 }
                com.tencent.mm.wallet_core.model.q0 r6 = com.tencent.p014mm.wallet_core.model.C86018q0.this     // Catch:{ all -> 0x00d6 }
                java.util.HashMap<java.lang.Integer, com.tencent.mm.wallet_core.model.q0$c> r7 = r6.f250502e     // Catch:{ all -> 0x00d6 }
                java.util.HashMap<java.lang.String, com.tencent.mm.wallet_core.model.q0$c> r8 = r6.f250503f     // Catch:{ all -> 0x00d6 }
                java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x00d6 }
                r9.<init>()     // Catch:{ all -> 0x00d6 }
                r6.f250502e = r9     // Catch:{ all -> 0x00d6 }
                com.tencent.mm.wallet_core.model.q0 r6 = com.tencent.p014mm.wallet_core.model.C86018q0.this     // Catch:{ all -> 0x00d6 }
                java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x00d6 }
                r9.<init>()     // Catch:{ all -> 0x00d6 }
                r6.f250503f = r9     // Catch:{ all -> 0x00d6 }
                com.tencent.mm.wallet_core.model.q0 r6 = com.tencent.p014mm.wallet_core.model.C86018q0.this     // Catch:{ all -> 0x00d6 }
                r6.f250505h = r2     // Catch:{ all -> 0x00d6 }
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                java.util.Set r5 = r7.entrySet()     // Catch:{ RuntimeException -> 0x00dc, all -> 0x00d9 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x00dc, all -> 0x00d9 }
                r6 = 0
            L_0x0046:
                boolean r7 = r5.hasNext()     // Catch:{ RuntimeException -> 0x00d4 }
                r9 = 2
                if (r7 == 0) goto L_0x0081
                java.lang.Object r7 = r5.next()     // Catch:{ RuntimeException -> 0x00d4 }
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.Object r10 = r7.getValue()     // Catch:{ RuntimeException -> 0x00d4 }
                com.tencent.mm.wallet_core.model.q0$c r10 = (com.tencent.p014mm.wallet_core.model.C86018q0.C86021c) r10     // Catch:{ RuntimeException -> 0x00d4 }
                if (r10 != 0) goto L_0x0067
                java.lang.Object r7 = r7.getKey()     // Catch:{ RuntimeException -> 0x00d4 }
                r4[r2] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.String r7 = "DELETE FROM walletcache WHERE id=?;"
                r0.execSQL(r7, r4)     // Catch:{ RuntimeException -> 0x00d4 }
                goto L_0x007e
            L_0x0067:
                java.lang.Object r7 = r7.getKey()     // Catch:{ RuntimeException -> 0x00d4 }
                r3[r2] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                int r7 = r10.f250510a     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ RuntimeException -> 0x00d4 }
                r3[r1] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.String r7 = r10.f250511b     // Catch:{ RuntimeException -> 0x00d4 }
                r3[r9] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.String r7 = "INSERT OR REPLACE INTO walletcache VALUES (?,?,?);"
                r0.execSQL(r7, r3)     // Catch:{ RuntimeException -> 0x00d4 }
            L_0x007e:
                int r6 = r6 + 1
                goto L_0x0046
            L_0x0081:
                java.util.Set r5 = r8.entrySet()     // Catch:{ RuntimeException -> 0x00d4 }
                java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x00d4 }
            L_0x0089:
                boolean r7 = r5.hasNext()     // Catch:{ RuntimeException -> 0x00d4 }
                if (r7 == 0) goto L_0x00c3
                java.lang.Object r7 = r5.next()     // Catch:{ RuntimeException -> 0x00d4 }
                java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.Object r8 = r7.getValue()     // Catch:{ RuntimeException -> 0x00d4 }
                com.tencent.mm.wallet_core.model.q0$c r8 = (com.tencent.p014mm.wallet_core.model.C86018q0.C86021c) r8     // Catch:{ RuntimeException -> 0x00d4 }
                if (r8 != 0) goto L_0x00a9
                java.lang.Object r7 = r7.getKey()     // Catch:{ RuntimeException -> 0x00d4 }
                r4[r2] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.String r7 = "DELETE FROM walletcache WHERE sid=?;"
                r0.execSQL(r7, r4)     // Catch:{ RuntimeException -> 0x00d4 }
                goto L_0x00c0
            L_0x00a9:
                java.lang.Object r7 = r7.getKey()     // Catch:{ RuntimeException -> 0x00d4 }
                r3[r2] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                int r7 = r8.f250510a     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ RuntimeException -> 0x00d4 }
                r3[r1] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.String r7 = r8.f250511b     // Catch:{ RuntimeException -> 0x00d4 }
                r3[r9] = r7     // Catch:{ RuntimeException -> 0x00d4 }
                java.lang.String r7 = "INSERT OR REPLACE INTO walletcache VALUES (?,?,?);"
                r0.execSQL(r7, r3)     // Catch:{ RuntimeException -> 0x00d4 }
            L_0x00c0:
                int r6 = r6 + 1
                goto L_0x0089
            L_0x00c3:
                r0.setTransactionSuccessful()     // Catch:{ RuntimeException -> 0x00d4 }
                r0.endTransaction()
                r0.releaseReference()
                java.lang.String r0 = "MicroMsg.WalletCacheStorage"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                goto L_0x00fe
            L_0x00d4:
                r3 = move-exception
                goto L_0x00e6
            L_0x00d6:
                r3 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                throw r3     // Catch:{ RuntimeException -> 0x00dc, all -> 0x00d9 }
            L_0x00d9:
                r3 = move-exception
                r2 = r3
                goto L_0x00e1
            L_0x00dc:
                r3 = move-exception
                goto L_0x00e5
            L_0x00de:
                r1 = move-exception
                r2 = r1
                r1 = 0
            L_0x00e1:
                r6 = 0
                goto L_0x0114
            L_0x00e3:
                r3 = move-exception
                r1 = 0
            L_0x00e5:
                r6 = 0
            L_0x00e6:
                java.lang.String r4 = "MicroMsg.WalletCacheStorage"
                java.lang.String r5 = "Failed to flush ConfigStorage"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0113 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r5, r2)     // Catch:{ all -> 0x0113 }
                if (r1 == 0) goto L_0x00f4
                r0.endTransaction()
            L_0x00f4:
                r0.releaseReference()
                java.lang.String r0 = "MicroMsg.WalletCacheStorage"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
            L_0x00fe:
                java.lang.String r2 = "Flushed "
                r1.append(r2)
                r1.append(r6)
                java.lang.String r2 = " entries."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                return
            L_0x0113:
                r2 = move-exception
            L_0x0114:
                if (r1 == 0) goto L_0x0119
                r0.endTransaction()
            L_0x0119:
                r0.releaseReference()
                java.lang.String r0 = "MicroMsg.WalletCacheStorage"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Flushed "
                r1.append(r3)
                r1.append(r6)
                java.lang.String r3 = " entries."
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                throw r2
            L_0x0138:
                java.lang.String r0 = "MicroMsg.WalletCacheStorage"
                java.lang.String r1 = "Skip flushing because database has been closed."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.model.C86018q0.C86019a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.q0$b */
    public final class C86020b<K> extends LruCache<K, Object> {

        /* renamed from: a */
        public final String f250508a;

        public C86020b(String str, String str2, int i) {
            super(i);
            this.f250508a = "SELECT * FROM " + str + " WHERE " + str2 + "=?;";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
            switch(r4) {
                case 1: goto L_0x0065;
                case 2: goto L_0x0060;
                case 3: goto L_0x005e;
                case 4: goto L_0x005a;
                case 5: goto L_0x0055;
                case 6: goto L_0x0050;
                default: goto L_0x004f;
            };
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            r4 = java.lang.Double.valueOf(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
            r4 = java.lang.Float.valueOf(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
            r7 = java.lang.Boolean.valueOf(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
            r4 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
            r4 = java.lang.Long.valueOf(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
            r4 = java.lang.Integer.valueOf(r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object create(K r10) {
            /*
                r9 = this;
                java.lang.String r0 = "MicroMsg.WalletCacheStorage"
                r1 = 0
                r2 = 0
                com.tencent.mm.wallet_core.model.q0 r3 = com.tencent.p014mm.wallet_core.model.C86018q0.this     // Catch:{ RuntimeException -> 0x00aa }
                zh3.f r3 = r3.f250500c     // Catch:{ RuntimeException -> 0x00aa }
                java.lang.String r4 = r9.f250508a     // Catch:{ RuntimeException -> 0x00aa }
                r5 = 1
                java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ RuntimeException -> 0x00aa }
                java.lang.String r7 = r10.toString()     // Catch:{ RuntimeException -> 0x00aa }
                r6[r2] = r7     // Catch:{ RuntimeException -> 0x00aa }
                r7 = 2
                android.database.Cursor r3 = r3.rawQuery(r4, r6, r7)     // Catch:{ RuntimeException -> 0x00aa }
                boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x009e }
                java.lang.String r6 = "GET: "
                if (r4 == 0) goto L_0x007d
                int r4 = r3.getInt(r5)     // Catch:{ all -> 0x009e }
                java.lang.String r7 = r3.getString(r7)     // Catch:{ all -> 0x009e }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
                r8.<init>()     // Catch:{ all -> 0x009e }
                r8.append(r6)     // Catch:{ all -> 0x009e }
                java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x009e }
                r8.append(r6)     // Catch:{ all -> 0x009e }
                java.lang.String r6 = " => "
                r8.append(r6)     // Catch:{ all -> 0x009e }
                r8.append(r7)     // Catch:{ all -> 0x009e }
                java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x009e }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)     // Catch:{ all -> 0x009e }
                java.lang.Object r6 = com.tencent.p014mm.wallet_core.model.C86018q0.f250499k     // Catch:{ all -> 0x009e }
                if (r7 != r6) goto L_0x004c
            L_0x004a:
                r4 = r1
                goto L_0x0079
            L_0x004c:
                switch(r4) {
                    case 1: goto L_0x0065;
                    case 2: goto L_0x0060;
                    case 3: goto L_0x005e;
                    case 4: goto L_0x005a;
                    case 5: goto L_0x0055;
                    case 6: goto L_0x0050;
                    default: goto L_0x004f;
                }
            L_0x004f:
                goto L_0x004a
            L_0x0050:
                java.lang.Double r4 = java.lang.Double.valueOf(r7)     // Catch:{ Exception -> 0x006a }
                goto L_0x0079
            L_0x0055:
                java.lang.Float r4 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x006a }
                goto L_0x0079
            L_0x005a:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x006a }
            L_0x005e:
                r4 = r7
                goto L_0x0079
            L_0x0060:
                java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x006a }
                goto L_0x0079
            L_0x0065:
                java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x006a }
                goto L_0x0079
            L_0x006a:
                r4 = move-exception
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x009e }
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)     // Catch:{ all -> 0x009e }
                r5[r2] = r4     // Catch:{ all -> 0x009e }
                java.lang.String r4 = "exception:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r5)     // Catch:{ all -> 0x009e }
                goto L_0x004a
            L_0x0079:
                r3.close()     // Catch:{ RuntimeException -> 0x00aa }
                return r4
            L_0x007d:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
                r4.<init>()     // Catch:{ all -> 0x009e }
                r4.append(r6)     // Catch:{ all -> 0x009e }
                java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x009e }
                r4.append(r5)     // Catch:{ all -> 0x009e }
                java.lang.String r5 = " => (NOT EXIST)"
                r4.append(r5)     // Catch:{ all -> 0x009e }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x009e }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ all -> 0x009e }
                java.lang.Object r4 = com.tencent.p014mm.wallet_core.model.C86018q0.f250499k     // Catch:{ all -> 0x009e }
                r3.close()     // Catch:{ RuntimeException -> 0x00aa }
                return r4
            L_0x009e:
                r4 = move-exception
                if (r3 == 0) goto L_0x00a9
                r3.close()     // Catch:{ all -> 0x00a5 }
                goto L_0x00a9
            L_0x00a5:
                r3 = move-exception
                r4.addSuppressed(r3)     // Catch:{ RuntimeException -> 0x00aa }
            L_0x00a9:
                throw r4     // Catch:{ RuntimeException -> 0x00aa }
            L_0x00aa:
                r3 = move-exception
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Failed to query UserInfo, id: "
                r4.append(r5)
                r4.append(r10)
                java.lang.String r10 = r4.toString()
                java.lang.Object[] r2 = new java.lang.Object[r2]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r10, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.model.C86018q0.C86020b.create(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.model.q0$c */
    public static class C86021c {

        /* renamed from: a */
        public final int f250510a;

        /* renamed from: b */
        public final String f250511b;

        public C86021c(int i, String str) {
            this.f250510a = i;
            this.f250511b = str;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C86021c)) {
                return false;
            }
            C86021c cVar = (C86021c) obj;
            if (this.f250510a != cVar.f250510a) {
                return false;
            }
            String str = this.f250511b;
            return str == null ? cVar.f250511b == null : str.equals(cVar.f250511b);
        }
    }

    public C86018q0(C91753f fVar) {
        this.f250500c = fVar;
        this.f250504g = new MMHandler("WalletCacheStorage");
    }

    /* renamed from: a */
    public void mo119990a(boolean z) {
        synchronized (this) {
            this.f250504g.removeCallbacks(this.f250506i);
            this.f250504g.post(this.f250506i);
            this.f250505h = true;
        }
        Log.m105924i("MicroMsg.WalletCacheStorage", "Posted appendAllToDisk");
    }

    /* renamed from: b */
    public final boolean mo119991b(String str, Object obj, boolean z) {
        if (obj == null && z) {
            return true;
        }
        if (str.equals("INT") && (obj instanceof Integer)) {
            return true;
        }
        if (str.equals("LONG") && (obj instanceof Long)) {
            return true;
        }
        if (str.equals("STRING") && (obj instanceof String)) {
            return true;
        }
        if (str.equals("BOOLEAN") && (obj instanceof Boolean)) {
            return true;
        }
        if (str.equals("FLOAT") && (obj instanceof Float)) {
            return true;
        }
        if (str.equals("DOUBLE") && (obj instanceof Double)) {
            return true;
        }
        if (obj != null && CrashReportFactory.hasDebuger()) {
            Assert.assertTrue("checkType failed, input type and value[" + str + ", " + obj + "] are not match", false);
        }
        if (z) {
            Log.m105921e("MicroMsg.WalletCacheStorage", "checkType failed, input type and value[%s, %s] are not match", str, obj);
        }
        return false;
    }

    /* renamed from: d */
    public Object mo119992d(C72994y1.C72995a aVar, Object obj) {
        if (aVar == null) {
            return obj;
        }
        String name = aVar.name();
        if (Util.isNullOrNil(name)) {
            return obj;
        }
        String[] split = name.split("_");
        String str = split[split.length - 1];
        if (str.equals("SYNC")) {
            str = split[split.length - 2];
        }
        String substring = name.substring(0, name.lastIndexOf(str) + str.length());
        Assert.assertNotNull("db is null", this.f250500c);
        Object obj2 = this.f250501d.get(substring);
        if (obj2 == null || obj2 == f250499k) {
            obj2 = obj;
        }
        return !mo119991b(str, obj2, false) ? obj : obj2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo119993e(com.tencent.p014mm.storage.C72994y1.C72995a r9, java.lang.Object r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r9 = r9.name()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r0 == 0) goto L_0x000e
            return
        L_0x000e:
            java.lang.String r0 = "_"
            java.lang.String[] r0 = r9.split(r0)
            int r1 = r0.length
            r2 = 1
            int r1 = r1 - r2
            r1 = r0[r1]
            java.lang.String r3 = "SYNC"
            boolean r3 = r1.equals(r3)
            r4 = 2
            r5 = 0
            if (r3 == 0) goto L_0x0029
            int r1 = r0.length
            int r1 = r1 - r4
            r1 = r0[r1]
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            boolean r3 = r8.mo119991b(r1, r10, r2)
            if (r3 != 0) goto L_0x0031
            return
        L_0x0031:
            int r3 = r9.lastIndexOf(r1)
            int r1 = r1.length()
            int r3 = r3 + r1
            java.lang.String r9 = r9.substring(r5, r3)
            if (r10 != 0) goto L_0x0042
            java.lang.Object r10 = f250499k
        L_0x0042:
            com.tencent.mm.wallet_core.model.q0$b<java.lang.String> r1 = r8.f250501d
            java.lang.Object r1 = r1.put(r9, r10)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x00cb
            java.lang.Object r1 = f250499k
            r3 = 0
            r5 = 5
            r6 = 4
            if (r10 != r1) goto L_0x0056
            goto L_0x00a4
        L_0x0056:
            boolean r7 = r10 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x005c
            r4 = 1
            goto L_0x0078
        L_0x005c:
            boolean r7 = r10 instanceof java.lang.Long
            if (r7 == 0) goto L_0x0061
            goto L_0x0078
        L_0x0061:
            boolean r4 = r10 instanceof java.lang.String
            if (r4 == 0) goto L_0x0067
            r4 = 3
            goto L_0x0078
        L_0x0067:
            boolean r4 = r10 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x006d
            r4 = 4
            goto L_0x0078
        L_0x006d:
            boolean r4 = r10 instanceof java.lang.Float
            if (r4 == 0) goto L_0x0073
            r4 = 5
            goto L_0x0078
        L_0x0073:
            boolean r4 = r10 instanceof java.lang.Double
            if (r4 == 0) goto L_0x0082
            r4 = 6
        L_0x0078:
            com.tencent.mm.wallet_core.model.q0$c r3 = new com.tencent.mm.wallet_core.model.q0$c
            java.lang.String r7 = r10.toString()
            r3.<init>(r4, r7)
            goto L_0x00a1
        L_0x0082:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "unresolve failed, unknown type="
            r4.append(r7)
            java.lang.Class r7 = r10.getClass()
            java.lang.String r7 = r7.toString()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            java.lang.String r7 = "MicroMsg.WalletCacheStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
        L_0x00a1:
            if (r3 != 0) goto L_0x00a4
            return
        L_0x00a4:
            monitor-enter(r8)
            java.util.HashMap<java.lang.String, com.tencent.mm.wallet_core.model.q0$c> r4 = r8.f250503f     // Catch:{ all -> 0x00c8 }
            r4.put(r9, r3)     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00b0
            r8.mo119990a(r2)     // Catch:{ all -> 0x00c8 }
            goto L_0x00bf
        L_0x00b0:
            boolean r0 = r8.f250505h     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x00bf
            r8.f250505h = r2     // Catch:{ all -> 0x00c8 }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r8.f250504g     // Catch:{ all -> 0x00c8 }
            java.lang.Runnable r2 = r8.f250506i     // Catch:{ all -> 0x00c8 }
            r3 = 30000(0x7530, double:1.4822E-319)
            r0.postDelayed(r2, r3)     // Catch:{ all -> 0x00c8 }
        L_0x00bf:
            monitor-exit(r8)     // Catch:{ all -> 0x00c8 }
            if (r10 != r1) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r5 = 4
        L_0x00c4:
            r8.doNotify(r5, r8, r9)
            goto L_0x00cb
        L_0x00c8:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c8 }
            throw r9
        L_0x00cb:
            java.lang.String r0 = "MicroMsg.WalletCacheStorage"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SET: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = " => "
            r1.append(r9)
            java.lang.Object r9 = f250499k
            if (r10 != r9) goto L_0x00e6
            java.lang.String r9 = "(DELETED)"
            goto L_0x00ea
        L_0x00e6:
            java.lang.String r9 = r10.toString()
        L_0x00ea:
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.wallet_core.model.C86018q0.mo119993e(com.tencent.mm.storage.y1$a, java.lang.Object):void");
    }

    public boolean shouldProcessEvent() {
        C91753f fVar = this.f250500c;
        if (fVar != null && !fVar.isClose()) {
            return true;
        }
        Object[] objArr = new Object[1];
        C91753f fVar2 = this.f250500c;
        objArr[0] = fVar2 == null ? "null" : Boolean.valueOf(fVar2.isClose());
        Log.m105929w("MicroMsg.WalletCacheStorage", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}
