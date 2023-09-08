package er1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: er1.s0 */
public final class C58774s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C58774s0 f168275d = new C58774s0();

    public C58774s0() {
        super(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0238 A[LOOP:2: B:64:0x0236->B:65:0x0238, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r16 = this;
            java.lang.Class<lr.b> r0 = p599lr.C61381b.class
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_CLEAN_OLD_FINDER_MEDIA_BOOLEAN
            r3 = 1
            boolean r1 = r1.mo119686g(r2, r3)
            if (r1 == 0) goto L_0x001c
            zt3.t r1 = zt3.C119157j.f356862d
            er1.r0 r2 = er1.C31683r0.f84625d
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183884o(r2)
        L_0x001c:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161638b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[checkClear#before] "
            r5.append(r6)
            er1.j5 r6 = er1.C58741j5.f168184a
            java.lang.String r6 = r6.mo83728b()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.plugin.finder.utils.FinderFolderClearManager r5 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161637a
            r5.getClass()
            java.lang.String r5 = "clearMarkFolder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.lang.Object r4 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161640d
            monitor-enter(r4)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x0248 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleDefault()     // Catch:{ all -> 0x0248 }
            java.lang.String r8 = "FINDER_MARK_DEL_FOLDERS"
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0248 }
            r9.<init>()     // Catch:{ all -> 0x0248 }
            java.util.Set r8 = r7.getStringSet(r8, r9)     // Catch:{ all -> 0x0248 }
            r10 = 0
            if (r8 == 0) goto L_0x0098
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x0248 }
        L_0x0064:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0248 }
            if (r13 == 0) goto L_0x0098
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0248 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0248 }
            java.lang.String r14 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161638b     // Catch:{ all -> 0x0248 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0248 }
            r15.<init>()     // Catch:{ all -> 0x0248 }
            java.lang.String r9 = "clearMarkFolders "
            r15.append(r9)     // Catch:{ all -> 0x0248 }
            r15.append(r13)     // Catch:{ all -> 0x0248 }
            java.lang.String r9 = r15.toString()     // Catch:{ all -> 0x0248 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r9)     // Catch:{ all -> 0x0248 }
            com.tencent.p014mm.vfs.C86013q1.m106446g(r13, r3)     // Catch:{ all -> 0x0248 }
            java.lang.String r9 = er1.C58741j5.f168189f     // Catch:{ all -> 0x0248 }
            boolean r9 = gy3.C87412m.m108589b(r13, r9)     // Catch:{ all -> 0x0248 }
            if (r9 == 0) goto L_0x0064
            wp1.g r9 = wp1.C66167g.f190173a     // Catch:{ all -> 0x0248 }
            r13 = 0
            wp1.C66167g.m78054b(r9, r10, r3, r13)     // Catch:{ all -> 0x0248 }
            goto L_0x0064
        L_0x0098:
            java.lang.String r9 = "FINDER_MARK_DEL_FOLDERS"
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x0248 }
            r12.<init>()     // Catch:{ all -> 0x0248 }
            r7.putStringSet(r9, r12)     // Catch:{ all -> 0x0248 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)     // Catch:{ all -> 0x0248 }
            if (r8 == 0) goto L_0x00bb
            int r7 = r8.size()     // Catch:{ all -> 0x0248 }
            if (r7 <= 0) goto L_0x00bb
            di3.d r7 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0248 }
            lr.b r7 = (p599lr.C61381b) r7     // Catch:{ all -> 0x0248 }
            qo1.j r7 = r7.mo78555oT()     // Catch:{ all -> 0x0248 }
            r7.mo12426a(r5)     // Catch:{ all -> 0x0248 }
        L_0x00bb:
            java.lang.String r7 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161638b     // Catch:{ all -> 0x0248 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0248 }
            r8.<init>()     // Catch:{ all -> 0x0248 }
            java.lang.String r9 = "clearMarkFolder cost:"
            r8.append(r9)     // Catch:{ all -> 0x0248 }
            r8.append(r5)     // Catch:{ all -> 0x0248 }
            java.lang.String r5 = r8.toString()     // Catch:{ all -> 0x0248 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)     // Catch:{ all -> 0x0248 }
            rx3.b0 r5 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0248 }
            monitor-exit(r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            if (r0 == 0) goto L_0x00e5
            qo1.h r0 = r0.E80()
            if (r0 == 0) goto L_0x00e5
            r0.clearMarkFiles()
        L_0x00e5:
            com.tencent.mm.plugin.finder.utils.FinderFolderClearManager r0 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161637a
            r0.getClass()
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.String> r0 = up1.C37521f.f99251O7
            java.lang.Object r4 = r0.mo60266n()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            r5 = 0
            if (r4 <= 0) goto L_0x0100
            r4 = 1
            goto L_0x0101
        L_0x0100:
            r4 = 0
        L_0x0101:
            if (r4 == 0) goto L_0x01a9
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch:{ all -> 0x0115 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0115 }
            java.lang.Object r0 = r0.mo60266n()     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0115 }
            r4.<init>(r0)     // Catch:{ all -> 0x0115 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r4)     // Catch:{ all -> 0x0115 }
            goto L_0x0120
        L_0x0115:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x0120:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            boolean r6 = kotlin.Result.m168120isFailureimpl(r0)
            if (r6 == 0) goto L_0x012c
            r0 = r4
        L_0x012c:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r4 = "interval"
            long r6 = r0.getLong(r4)     // Catch:{ all -> 0x013d }
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x013d }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x013d }
            goto L_0x0148
        L_0x013d:
            r0 = move-exception
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x0148:
            java.lang.Long r4 = java.lang.Long.valueOf(r10)
            boolean r6 = kotlin.Result.m168120isFailureimpl(r0)
            if (r6 == 0) goto L_0x0153
            r0 = r4
        L_0x0153:
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = r0.longValue()
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x017a
            java.lang.String r0 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161638b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "intervalMs["
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = "] < 0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            goto L_0x0205
        L_0x017a:
            long r8 = java.lang.System.currentTimeMillis()
            long r12 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161643g
            long r8 = r8 - r12
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a9
            java.lang.String r0 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161638b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "intervalMs["
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = "] > diff["
            r3.append(r4)
            r3.append(r8)
            r4 = 93
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
            goto L_0x0205
        L_0x01a9:
            java.lang.Object r4 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161640d
            monitor-enter(r4)
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ all -> 0x0245 }
            com.tencent.mm.vfs.u0 r0 = r0.mo177788a()     // Catch:{ all -> 0x0245 }
            android.os.CancellationSignal r6 = new android.os.CancellationSignal     // Catch:{ all -> 0x0245 }
            r6.<init>()     // Catch:{ all -> 0x0245 }
            java.lang.String r7 = "live"
            java.lang.String r8 = "finder"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}     // Catch:{ all -> 0x0245 }
            java.util.List r7 = sx3.C64197v.m75537f(r7)     // Catch:{ all -> 0x0245 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0245 }
        L_0x01c7:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0245 }
            if (r8 == 0) goto L_0x01f6
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0245 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0245 }
            java.lang.String r9 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161638b     // Catch:{ all -> 0x0245 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0245 }
            r12.<init>()     // Catch:{ all -> 0x0245 }
            java.lang.String r13 = "[touchClearVFS] value="
            r12.append(r13)     // Catch:{ all -> 0x0245 }
            r12.append(r8)     // Catch:{ all -> 0x0245 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r12)     // Catch:{ all -> 0x0245 }
            r9 = r0
            com.tencent.mm.vfs.x0 r9 = (com.tencent.p014mm.vfs.C116340x0) r9     // Catch:{ all -> 0x0245 }
            com.tencent.mm.vfs.FileSystem$c r8 = r9.mo177847b(r8)     // Catch:{ all -> 0x0245 }
            if (r8 == 0) goto L_0x01c7
            r8.mo119928a(r6)     // Catch:{ all -> 0x0245 }
            goto L_0x01c7
        L_0x01f6:
            wp1.g r0 = wp1.C66167g.f190173a     // Catch:{ all -> 0x0245 }
            r6 = 0
            wp1.C66167g.m78054b(r0, r10, r3, r6)     // Catch:{ all -> 0x0245 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0245 }
            com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161643g = r6     // Catch:{ all -> 0x0245 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0245 }
            monitor-exit(r4)
        L_0x0205:
            java.lang.String r0 = com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager.f161638b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[checkClear#after] cost="
            r3.append(r4)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r1
            r3.append(r6)
            java.lang.String r1 = "ms "
            r3.append(r1)
            er1.j5 r1 = er1.C58741j5.f168184a
            java.lang.String r1 = r1.mo83728b()
            r3.append(r1)
            r1 = 32
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            er1.q0[] r0 = er1.C58741j5.f168197n
            int r1 = r0.length
        L_0x0236:
            if (r5 >= r1) goto L_0x0242
            r2 = r0[r5]
            java.lang.String r2 = r2.f168261a
            com.tencent.p014mm.vfs.C86013q1.m106461v(r2)
            int r5 = r5 + 1
            goto L_0x0236
        L_0x0242:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x0245:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0248:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58774s0.invoke():java.lang.Object");
    }
}
