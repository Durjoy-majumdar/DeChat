package com.tencent.p014mm.console;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import f40.C86709a0;

/* renamed from: com.tencent.mm.console.Shell$$f */
public class Shell$$f implements Shell$$s1 {

    /* renamed from: com.tencent.mm.console.Shell$$f$a */
    public class C28904a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f79324d;

        public C28904a(Shell$$f shell$$f, String str) {
            this.f79324d = str;
        }

        public void run() {
            SQLiteDatabase f = C86709a0.m107535s().f251811i.mo125615f();
            Cursor cursor = null;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                cursor = f.rawQueryWithFactory(SQLiteDirectCursor.FACTORY, this.f79324d, (Object[]) null, (String) null);
                String[] columnNames = cursor.getColumnNames();
                int length = columnNames == null ? 0 : columnNames.length;
                Log.m105924i("MicroMsg.Shell", "Executing SQL from shell: " + this.f79324d);
                if (length > 0) {
                    Log.m105924i("MicroMsg.Shell", " > " + TextUtils.join(APLogFileUtil.SEPARATOR_LOG, columnNames));
                }
                StringBuilder sb = new StringBuilder(1024);
                while (cursor.moveToNext()) {
                    sb.setLength(0);
                    sb.append(" > ");
                    for (int i = 0; i < length; i++) {
                        int type = cursor.getType(i);
                        if (type == 0) {
                            sb.append("(null)");
                        } else if (type != 4) {
                            sb.append(cursor.getString(i));
                        } else {
                            sb.append("(blob)");
                        }
                        sb.append(APLogFileUtil.SEPARATOR_LOG);
                    }
                    Log.m105924i("MicroMsg.Shell", sb.toString());
                }
                Log.m105925i("MicroMsg.Shell", "Finish executing SQL in %d ms: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), this.f79324d);
            } catch (RuntimeException e) {
                Log.m105921e("MicroMsg.Shell", "Failed to execute SQL '%s': %s", this.f79324d, e.getMessage());
                if (cursor == null) {
                    return;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
            cursor.close();
        }
    }

    /* renamed from: com.tencent.mm.console.Shell$$f$b */
    public class C28905b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f79325d;

        public C28905b(Shell$$f shell$$f, String str) {
            this.f79325d = str;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x008f */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0080 A[SYNTHETIC, Splitter:B:23:0x0080] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7 A[SYNTHETIC, Splitter:B:33:0x00a7] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b8 A[SYNTHETIC, Splitter:B:40:0x00b8] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "MicroMsg.Shell"
                f40.o r1 = f40.C86709a0.m107535s()
                zh3.f r1 = r1.f251811i
                com.tencent.wcdb.database.SQLiteDatabase r1 = r1.mo125615f()
                r2 = 0
                r3 = 0
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException -> 0x008f, Exception -> 0x0063 }
                java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x008f, Exception -> 0x0063 }
                com.tencent.mm.vfs.t1 r7 = new com.tencent.mm.vfs.t1     // Catch:{ FileNotFoundException -> 0x008f, Exception -> 0x0063 }
                java.lang.String r8 = r10.f79325d     // Catch:{ FileNotFoundException -> 0x008f, Exception -> 0x0063 }
                r7.<init>((java.lang.String) r8)     // Catch:{ FileNotFoundException -> 0x008f, Exception -> 0x0063 }
                r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x008f, Exception -> 0x0063 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                r2.<init>()     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                java.lang.String r7 = "Executing SQL from file: "
                r2.append(r7)     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                java.lang.String r7 = r10.f79325d     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                r2.append(r7)     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
            L_0x0034:
                java.lang.String r2 = r6.readLine()     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                if (r2 == 0) goto L_0x003e
                r1.execSQL(r2)     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                goto L_0x0034
            L_0x003e:
                java.lang.String r2 = "Finish executing SQL in %d ms"
                r7 = 1
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                long r8 = r8 - r4
                java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                r7[r3] = r4     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r7)     // Catch:{ FileNotFoundException -> 0x005f, Exception -> 0x005d }
                r6.close()     // Catch:{ IOException -> 0x0055 }
                goto L_0x0056
            L_0x0055:
            L_0x0056:
                boolean r0 = r1.inTransaction()
                if (r0 == 0) goto L_0x00b5
                goto L_0x00b2
            L_0x005d:
                r2 = move-exception
                goto L_0x0066
            L_0x005f:
                r2 = r6
                goto L_0x008f
            L_0x0061:
                r0 = move-exception
                goto L_0x00b6
            L_0x0063:
                r4 = move-exception
                r6 = r2
                r2 = r4
            L_0x0066:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
                r4.<init>()     // Catch:{ all -> 0x008c }
                java.lang.String r5 = "Failed to execute file: "
                r4.append(r5)     // Catch:{ all -> 0x008c }
                java.lang.String r5 = r10.f79325d     // Catch:{ all -> 0x008c }
                r4.append(r5)     // Catch:{ all -> 0x008c }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008c }
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x008c }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r4, r3)     // Catch:{ all -> 0x008c }
                if (r6 == 0) goto L_0x0085
                r6.close()     // Catch:{ IOException -> 0x0084 }
                goto L_0x0085
            L_0x0084:
            L_0x0085:
                boolean r0 = r1.inTransaction()
                if (r0 == 0) goto L_0x00b5
                goto L_0x00b2
            L_0x008c:
                r0 = move-exception
                r2 = r6
                goto L_0x00b6
            L_0x008f:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
                r3.<init>()     // Catch:{ all -> 0x0061 }
                java.lang.String r4 = "Cannot find file to execute: "
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                java.lang.String r4 = r10.f79325d     // Catch:{ all -> 0x0061 }
                r3.append(r4)     // Catch:{ all -> 0x0061 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0061 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)     // Catch:{ all -> 0x0061 }
                if (r2 == 0) goto L_0x00ac
                r2.close()     // Catch:{ IOException -> 0x00ab }
                goto L_0x00ac
            L_0x00ab:
            L_0x00ac:
                boolean r0 = r1.inTransaction()
                if (r0 == 0) goto L_0x00b5
            L_0x00b2:
                r1.endTransaction()
            L_0x00b5:
                return
            L_0x00b6:
                if (r2 == 0) goto L_0x00bd
                r2.close()     // Catch:{ IOException -> 0x00bc }
                goto L_0x00bd
            L_0x00bc:
            L_0x00bd:
                boolean r2 = r1.inTransaction()
                if (r2 == 0) goto L_0x00c6
                r1.endTransaction()
            L_0x00c6:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.console.Shell$$f.C28905b.run():void");
        }
    }

    /* renamed from: a */
    public void mo56303a(Intent intent) {
        if (MMApplicationContext.isMMProcess()) {
            String stringExtra = intent.getStringExtra("sql");
            String stringExtra2 = intent.getStringExtra("file");
            if (stringExtra != null && stringExtra.length() > 0) {
                C86709a0.m107525e().postToWorker(new C28904a(this, stringExtra));
            } else if (stringExtra2 != null && stringExtra2.length() > 0) {
                C86709a0.m107525e().postToWorker(new C28905b(this, stringExtra2));
            }
        }
    }
}
