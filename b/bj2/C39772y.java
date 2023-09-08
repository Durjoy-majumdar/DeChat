package bj2;

import android.widget.TextView;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.RepairerDBSelectDemoUI;
import fy3.C32224a;
import gy3.C45983e0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bj2.y */
public final class C39772y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f106728d;

    /* renamed from: e */
    public final /* synthetic */ RepairerDBSelectDemoUI f106729e;

    /* renamed from: bj2.y$a */
    public static final class C0296a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RepairerDBSelectDemoUI f862d;

        /* renamed from: e */
        public final /* synthetic */ C45983e0 f863e;

        /* renamed from: f */
        public final /* synthetic */ StringBuilder f864f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0296a(RepairerDBSelectDemoUI repairerDBSelectDemoUI, C45983e0 e0Var, StringBuilder sb) {
            super(0);
            this.f862d = repairerDBSelectDemoUI;
            this.f863e = e0Var;
            this.f864f = sb;
        }

        public Object invoke() {
            TextView textView = this.f862d.f20445f;
            if (textView != null) {
                textView.setText("Cost: " + this.f863e.f124000d + " ms");
            }
            TextView textView2 = this.f862d.f20444e;
            if (textView2 != null) {
                textView2.setText(this.f864f);
            }
            return C13598b0.f38549a;
        }
    }

    public C39772y(String str, RepairerDBSelectDemoUI repairerDBSelectDemoUI) {
        this.f106728d = str;
        this.f106729e = repairerDBSelectDemoUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cc, code lost:
        if (r5 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ea, code lost:
        if (r5 == null) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ed, code lost:
        o40.C61926c.m72668M(new bj2.C39772y.C0296a(r13.f106729e, r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            gy3.e0 r1 = new gy3.e0
            r1.<init>()
            long r2 = java.lang.System.currentTimeMillis()
            r1.f124000d = r2
            f40.o r2 = f40.C86709a0.m107535s()
            zh3.f r2 = r2.f251811i
            com.tencent.wcdb.database.SQLiteDatabase r2 = r2.mo125615f()
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r7 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r8 = r13.f106728d     // Catch:{ RuntimeException -> 0x00d4 }
            com.tencent.wcdb.Cursor r5 = r2.rawQueryWithFactory(r7, r8, r5, r5)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String[] r2 = r5.getColumnNames()     // Catch:{ RuntimeException -> 0x00d4 }
            if (r2 == 0) goto L_0x002e
            int r7 = r2.length     // Catch:{ RuntimeException -> 0x00d4 }
            goto L_0x002f
        L_0x002e:
            r7 = 0
        L_0x002f:
            com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI r8 = r13.f106729e     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r8 = r8.f20443d     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00d4 }
            r9.<init>()     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r10 = "Executing SQL from shell: "
            r9.append(r10)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r10 = r13.f106728d     // Catch:{ RuntimeException -> 0x00d4 }
            r9.append(r10)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r9 = r9.toString()     // Catch:{ RuntimeException -> 0x00d4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r8 = " | "
            java.lang.String r9 = " > "
            if (r7 <= 0) goto L_0x006d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00d4 }
            r10.<init>()     // Catch:{ RuntimeException -> 0x00d4 }
            r10.append(r9)     // Catch:{ RuntimeException -> 0x00d4 }
            gy3.C87412m.m108591d(r2)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r2 = android.text.TextUtils.join(r8, r2)     // Catch:{ RuntimeException -> 0x00d4 }
            r10.append(r2)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r2 = r10.toString()     // Catch:{ RuntimeException -> 0x00d4 }
            r0.append(r2)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r2 = "\n\n"
            r0.append(r2)     // Catch:{ RuntimeException -> 0x00d4 }
        L_0x006d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00d4 }
            r10 = 1024(0x400, float:1.435E-42)
            r2.<init>(r10)     // Catch:{ RuntimeException -> 0x00d4 }
        L_0x0074:
            boolean r10 = r5.moveToNext()     // Catch:{ RuntimeException -> 0x00d4 }
            if (r10 == 0) goto L_0x00ae
            r2.setLength(r6)     // Catch:{ RuntimeException -> 0x00d4 }
            r2.append(r9)     // Catch:{ RuntimeException -> 0x00d4 }
            r10 = 0
        L_0x0081:
            if (r10 >= r7) goto L_0x00a5
            int r11 = r5.getType(r10)     // Catch:{ RuntimeException -> 0x00d4 }
            if (r11 == 0) goto L_0x009a
            r12 = 4
            if (r11 == r12) goto L_0x0094
            java.lang.String r11 = r5.getString(r10)     // Catch:{ RuntimeException -> 0x00d4 }
            r2.append(r11)     // Catch:{ RuntimeException -> 0x00d4 }
            goto L_0x009f
        L_0x0094:
            java.lang.String r11 = "(blob)"
            r2.append(r11)     // Catch:{ RuntimeException -> 0x00d4 }
            goto L_0x009f
        L_0x009a:
            java.lang.String r11 = "(null)"
            r2.append(r11)     // Catch:{ RuntimeException -> 0x00d4 }
        L_0x009f:
            r2.append(r8)     // Catch:{ RuntimeException -> 0x00d4 }
            int r10 = r10 + 1
            goto L_0x0081
        L_0x00a5:
            r0.append(r2)     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r10 = "\n"
            r0.append(r10)     // Catch:{ RuntimeException -> 0x00d4 }
            goto L_0x0074
        L_0x00ae:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x00d4 }
            long r9 = r1.f124000d     // Catch:{ RuntimeException -> 0x00d4 }
            long r7 = r7 - r9
            r1.f124000d = r7     // Catch:{ RuntimeException -> 0x00d4 }
            com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI r2 = r13.f106729e     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r2 = r2.f20443d     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r9 = "Finish executing SQL in %d ms: %s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ RuntimeException -> 0x00d4 }
            r10[r6] = r7     // Catch:{ RuntimeException -> 0x00d4 }
            java.lang.String r7 = r13.f106728d     // Catch:{ RuntimeException -> 0x00d4 }
            r10[r4] = r7     // Catch:{ RuntimeException -> 0x00d4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r10)     // Catch:{ RuntimeException -> 0x00d4 }
            if (r5 == 0) goto L_0x00ed
        L_0x00ce:
            r5.close()
            goto L_0x00ed
        L_0x00d2:
            r0 = move-exception
            goto L_0x00f8
        L_0x00d4:
            r2 = move-exception
            com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI r7 = r13.f106729e     // Catch:{ all -> 0x00d2 }
            java.lang.String r7 = r7.f20443d     // Catch:{ all -> 0x00d2 }
            java.lang.String r8 = "Failed to execute SQL '%s': %s"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00d2 }
            java.lang.String r9 = r13.f106728d     // Catch:{ all -> 0x00d2 }
            r3[r6] = r9     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00d2 }
            r3[r4] = r2     // Catch:{ all -> 0x00d2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r8, r3)     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x00ed
            goto L_0x00ce
        L_0x00ed:
            bj2.y$a r2 = new bj2.y$a
            com.tencent.mm.plugin.repairer.ui.demo.RepairerDBSelectDemoUI r3 = r13.f106729e
            r2.<init>(r3, r1, r0)
            o40.C61926c.m72668M(r2)
            return
        L_0x00f8:
            if (r5 == 0) goto L_0x00fd
            r5.close()
        L_0x00fd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bj2.C39772y.run():void");
    }
}
