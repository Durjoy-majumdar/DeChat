package com.tencent.p014mm.sdcard_migrate;

import android.content.Context;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.vfs.C116281f0;
import p910lj.C76701a;
import yc3.C38992a;

/* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand */
public class ExtStorageMigrateTestCommand implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f347864a = 0;

    /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand$a */
    public class C115940a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f347866d;

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand$a$a */
        public class C115941a implements Runnable {
            public C115941a() {
            }

            public void run() {
                C76701a.makeText(C115940a.this.f347866d, (CharSequence) "Done.", 1).show();
            }
        }

        /* renamed from: com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand$a$b */
        public class C115942b implements Runnable {
            public C115942b() {
            }

            public void run() {
                C76701a.makeText(C115940a.this.f347866d, (CharSequence) "Error happened.", 1).show();
            }
        }

        public C115940a(ExtStorageMigrateTestCommand extStorageMigrateTestCommand, Context context) {
            this.f347866d = context;
        }

        public void run() {
            try {
                C116281f0.C116289i.f348994a.mo177790c(0, 0, true);
                MMHandlerThread.postToMainThread(new C115941a());
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.ExtStorageMigrateTestCommand", th, "[-] Error happened.", new Object[0]);
                MMHandlerThread.postToMainThread(new C115942b());
            }
        }
    }

    static {
        C30650a.m39147b(new ExtStorageMigrateTestCommand(), "//extmig");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        r9 = r9[2];
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(final android.content.Context r8, java.lang.String[] r9, java.lang.String r10) {
        /*
            r7 = this;
            r10 = 0
            if (r9 == 0) goto L_0x00c4
            int r0 = r9.length
            r1 = 2
            if (r0 >= r1) goto L_0x0009
            goto L_0x00c4
        L_0x0009:
            r0 = 1
            r2 = r9[r0]
            r2.getClass()
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 3
            switch(r4) {
                case -7490165: goto L_0x003a;
                case 3551: goto L_0x002f;
                case 108404047: goto L_0x0024;
                case 109757538: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0044
        L_0x0019:
            java.lang.String r4 = "start"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0022
            goto L_0x0044
        L_0x0022:
            r3 = 3
            goto L_0x0044
        L_0x0024:
            java.lang.String r4 = "reset"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x002d
            goto L_0x0044
        L_0x002d:
            r3 = 2
            goto L_0x0044
        L_0x002f:
            java.lang.String r4 = "on"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            r3 = 1
            goto L_0x0044
        L_0x003a:
            java.lang.String r4 = "maintain"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            java.lang.String r2 = "extmig_switch_storage"
            switch(r3) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x009f;
                case 2: goto L_0x007d;
                case 3: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            return r10
        L_0x004a:
            int r2 = r9.length
            if (r2 < r5) goto L_0x005b
            r9 = r9[r1]
            if (r9 == 0) goto L_0x005b
            java.lang.String r1 = "fcp"
            boolean r9 = r9.equalsIgnoreCase(r1)
            if (r9 == 0) goto L_0x005b
            r4 = 1
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig r9 = com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateConfig.f347831h
            java.lang.String r2 = r9.f347832d
            java.lang.String r3 = r9.f347833e
            java.util.HashSet r10 = new java.util.HashSet
            java.util.Set<com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig$ExtraPathAction> r9 = r9.f347835g
            r10.<init>(r9)
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r10)
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig r9 = new com.tencent.mm.sdcard_migrate.ExtStorageMigrateConfig
            r6 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand$1 r10 = new com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand$1
            r10.<init>(r7, r8)
            com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateRoutine.startMigration(r8, r9, r10)
            return r0
        L_0x007d:
            java.lang.String r9 = "extmig_status_memo_storage"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r9)
            android.content.SharedPreferences$Editor r9 = r9.clear()
            r9.commit()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)
            android.content.SharedPreferences$Editor r9 = r9.clear()
            r9.commit()
            java.lang.String r9 = "Reset done."
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r9, (int) r0)
            r8.show()
            return r0
        L_0x009f:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r2)
            java.lang.String r10 = "is_routine_enabled"
            r9.encode((java.lang.String) r10, (boolean) r0)
            java.lang.String r9 = "Switch on done."
            android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r9, (int) r0)
            r8.show()
            return r0
        L_0x00b2:
            android.os.CancellationSignal r9 = new android.os.CancellationSignal
            r9.<init>()
            zt3.t r9 = zt3.C119157j.f356862d
            com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand$a r10 = new com.tencent.mm.sdcard_migrate.ExtStorageMigrateTestCommand$a
            r10.<init>(r7, r8)
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183884o(r10)
            return r0
        L_0x00c4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateTestCommand.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }
}
