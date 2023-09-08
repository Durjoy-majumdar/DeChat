package com.tencent.p014mm.sdk.platformtools;

import a70.C112760b;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0014R\u0014\u0010\u0011\u001a\u00020\u00038\u0002XD¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0002XD¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00038\u0014X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/MMFileSlotManager;", "Lcom/tencent/mm/sdk/platformtools/BaseSlotManager;", "Lcom/tencent/mm/vfs/m1;", "", "", "slotId", "getSlotPath", "slot", "Lrx3/b0;", "clearSlot", "slotKey", "getSlotByKey", "remarkSlot", "", "verifySlot", "key", "containsKey", "TAG", "Ljava/lang/String;", "CLEAR_DELAY", "J", "prefix", "getPrefix", "()Ljava/lang/String;", "name", "slotSeconds", "<init>", "(Ljava/lang/String;J)V", "libcompatible_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.MMFileSlotManager */
public final class MMFileSlotManager extends BaseSlotManager<C86009m1> {
    private final long CLEAR_DELAY;
    /* access modifiers changed from: private */
    public final String TAG;
    private final String prefix;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMFileSlotManager(String str, long j) {
        super(j, 0, 2, (C8480h) null);
        C87412m.m108594g(str, "name");
        this.TAG = "MMFileSlotManager";
        this.CLEAR_DELAY = 1000;
        this.prefix = str + XVFSFile.SEPARATOR_CHAR + j + XVFSFile.SEPARATOR_CHAR;
    }

    private final String getSlotPath(String str, long j) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(C112760b.m154225d());
        sb.append("mmslot/");
        sb.append(str);
        sb.append(XVFSFile.SEPARATOR_CHAR);
        if (j > 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j);
            sb4.append(XVFSFile.SEPARATOR_CHAR);
            str2 = sb4.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ String getSlotPath$default(MMFileSlotManager mMFileSlotManager, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = -1;
        }
        return mMFileSlotManager.getSlotPath(str, j);
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void remarkSlot(String str, long j) {
        C87412m.m108594g(str, "slotKey");
    }

    public boolean verifySlot(String str, long j) {
        C87412m.m108594g(str, "slotKey");
        C86009m1 m1Var = new C86009m1(getSlotPath(str, j));
        return m1Var.mo119967g() && m1Var.mo119980r() > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bb, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11.TAG, r12, "clearSlot", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clearSlot(long r12, com.tencent.p014mm.vfs.C86009m1 r14) {
        /*
            r11 = this;
            java.lang.String r0 = "slot"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = r11.TAG
            java.lang.String r1 = "clearSlot"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
            r0 = 0
            com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$1 r1 = new com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$1     // Catch:{ Exception -> 0x00ba }
            r1.<init>(r12)     // Catch:{ Exception -> 0x00ba }
            java.lang.String[] r12 = r14.mo119982t(r1)     // Catch:{ Exception -> 0x00ba }
            r13 = 0
            if (r12 == 0) goto L_0x0043
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00ba }
            int r2 = r12.length     // Catch:{ Exception -> 0x00ba }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00ba }
            int r2 = r12.length     // Catch:{ Exception -> 0x00ba }
            r3 = 0
        L_0x0021:
            if (r3 >= r2) goto L_0x0044
            r4 = r12[r3]     // Catch:{ Exception -> 0x00ba }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r5.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r6 = r14.mo119976n()     // Catch:{ Exception -> 0x00ba }
            r5.append(r6)     // Catch:{ Exception -> 0x00ba }
            r6 = 47
            r5.append(r6)     // Catch:{ Exception -> 0x00ba }
            r5.append(r4)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x00ba }
            r1.add(r4)     // Catch:{ Exception -> 0x00ba }
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0043:
            r1 = r13
        L_0x0044:
            long r3 = r11.CLEAR_DELAY     // Catch:{ Exception -> 0x00ba }
            java.lang.String r12 = "batch"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r14.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.String r2 = r2.getCanonicalName()     // Catch:{ Exception -> 0x00ba }
            r14.append(r2)     // Catch:{ Exception -> 0x00ba }
            r2 = 95
            r14.append(r2)     // Catch:{ Exception -> 0x00ba }
            r14.append(r12)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r12 = r14.toString()     // Catch:{ Exception -> 0x00ba }
            com.tencent.mm.sdk.platformtools.__BATCH_RUN_OBJ r14 = com.tencent.p014mm.sdk.platformtools.__BATCH_RUN_OBJ.INSTANCE     // Catch:{ Exception -> 0x00ba }
            monitor-enter(r14)     // Catch:{ Exception -> 0x00ba }
            java.util.HashMap r2 = r14.getBatchJobs()     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ all -> 0x00b7 }
            a14.z1 r2 = (a14.C53973z1) r2     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0075
            r5 = 1
            a14.C53973z1.C53974a.m60623a(r2, r13, r5, r13)     // Catch:{ all -> 0x00b7 }
        L_0x0075:
            java.util.HashMap r13 = r14.getBatchData()     // Catch:{ all -> 0x00b7 }
            boolean r2 = r13.containsKey(r12)     // Catch:{ all -> 0x00b7 }
            if (r2 != 0) goto L_0x0087
            java.util.LinkedList r2 = new java.util.LinkedList     // Catch:{ all -> 0x00b7 }
            r2.<init>()     // Catch:{ all -> 0x00b7 }
            r13.put(r12, r2)     // Catch:{ all -> 0x00b7 }
        L_0x0087:
            java.lang.Object r13 = r13.get(r12)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda-1$lambda-0>"
            gy3.C87412m.m108592e(r13, r2)     // Catch:{ all -> 0x00b7 }
            java.util.LinkedList r13 = (java.util.LinkedList) r13     // Catch:{ all -> 0x00b7 }
            r13.add(r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r14)     // Catch:{ Exception -> 0x00ba }
            java.util.HashMap r13 = r14.getBatchJobs()     // Catch:{ Exception -> 0x00ba }
            a14.s1 r14 = a14.C0001s1.f0d     // Catch:{ Exception -> 0x00ba }
            a14.h0 r1 = a14.C53872d1.f151119c     // Catch:{ Exception -> 0x00ba }
            r8 = 0
            com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$lambda-3$$inlined$batchRun$default$1 r9 = new com.tencent.mm.sdk.platformtools.MMFileSlotManager$clearSlot$lambda-3$$inlined$batchRun$default$1     // Catch:{ Exception -> 0x00ba }
            r6 = 0
            r2 = r9
            r5 = r12
            r7 = r11
            r2.<init>(r3, r5, r6, r7)     // Catch:{ Exception -> 0x00ba }
            r2 = 2
            r10 = 0
            r5 = r14
            r6 = r1
            r7 = r8
            r8 = r9
            r9 = r2
            a14.z1 r14 = a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00ba }
            r13.put(r12, r14)     // Catch:{ Exception -> 0x00ba }
            goto L_0x00c4
        L_0x00b7:
            r12 = move-exception
            monitor-exit(r14)     // Catch:{ Exception -> 0x00ba }
            throw r12     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            r12 = move-exception
            java.lang.String r13 = r11.TAG
            java.lang.String r14 = "clearSlot"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r12, r14, r0)
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.MMFileSlotManager.clearSlot(long, com.tencent.mm.vfs.m1):void");
    }

    public boolean containsKey(C86009m1 m1Var, String str) {
        C87412m.m108594g(m1Var, "slot");
        C87412m.m108594g(str, "key");
        C86009m1 m1Var2 = new C86009m1(m1Var.mo119976n() + XVFSFile.SEPARATOR_CHAR + str);
        return m1Var2.mo119967g() && m1Var2.mo119980r() > 0;
    }

    public C86009m1 getSlotByKey(String str, long j) {
        C87412m.m108594g(str, "slotKey");
        C86009m1 m1Var = new C86009m1(getSlotPath(str, j));
        String str2 = this.TAG;
        Log.m105926v(str2, "getSlotByKey path = " + m1Var.mo119976n());
        if (!m1Var.mo119967g()) {
            m1Var.mo119987x();
            String str3 = this.TAG;
            Log.m105926v(str3, "getSlotByKey mkdirs = " + m1Var);
        }
        return m1Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MMFileSlotManager(String str, long j, int i, C8480h hVar) {
        this(str, (i & 2) != 0 ? 900 : j);
    }
}
