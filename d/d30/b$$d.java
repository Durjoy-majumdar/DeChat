package d30;

public class b$$d implements Runnable {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: com.tencent.mm.vfs.m1} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v15, types: [com.tencent.mm.vfs.m1] */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v44 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r21 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r0)
            r1 = 0
            if (r0 == 0) goto L_0x05d1
            java.lang.String r0 = z30.C91614b.f262457a
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r3 = r2.getPath()
            r4 = 0
            if (r3 == 0) goto L_0x0032
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r4, r4)
            java.lang.String r5 = r2.getPath()
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0032
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
        L_0x0032:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r5 = r3.mo177799l(r2, r1)
            boolean r6 = r5.mo177810a()
            if (r6 != 0) goto L_0x0040
            r6 = 0
            goto L_0x0048
        L_0x0040:
            com.tencent.mm.vfs.FileSystem$c r6 = r5.f348991a
            java.lang.String r7 = r5.f348992b
            boolean r6 = r6.mo119948x(r7)
        L_0x0048:
            if (r6 != 0) goto L_0x005c
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r5)
            boolean r5 = r2.mo177810a()
            if (r5 != 0) goto L_0x0055
            goto L_0x005c
        L_0x0055:
            com.tencent.mm.vfs.FileSystem$c r5 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            r5.mo119937g(r2)
        L_0x005c:
            z30.b$a r2 = z30.C91614b.m114959a()
            java.lang.String r5 = "Kara.KaraEnv"
            java.lang.String r6 = "/"
            java.lang.String r7 = "clicfg_plugin_kara_so_download_open"
            java.lang.String r8 = "1"
            r9 = 1
            if (r2 != 0) goto L_0x0071
            java.lang.String r0 = "env null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x00c4
        L_0x0071:
            boolean r10 = z30.C91614b.m114960b()
            if (r10 == 0) goto L_0x007d
            java.lang.String r0 = "env ready! just use it!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x00c4
        L_0x007d:
            oa1.d r10 = oa1.C117731d.m166007c()
            java.lang.String r10 = r10.mo182444f(r7, r8, r4, r9)
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r9)
            if (r10 != 0) goto L_0x008d
            r10 = 0
            goto L_0x008e
        L_0x008d:
            r10 = 1
        L_0x008e:
            if (r10 != 0) goto L_0x0097
            java.lang.String r0 = "so can't download"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x00c4
        L_0x0097:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64
            if (r5 == 0) goto L_0x00a0
            java.lang.String r5 = r2.f262464f
            java.lang.String r10 = r2.f262460b
            goto L_0x00a4
        L_0x00a0:
            java.lang.String r5 = r2.f262463e
            java.lang.String r10 = r2.f262462d
        L_0x00a4:
            z30.C91614b.f262458b = r9
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r6)
            java.lang.String r0 = r2.mo125485a()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            z30.a r2 = new z30.a
            r2.<init>(r10)
            n30.C47152a.m52437a(r5, r0, r2)
        L_0x00c4:
            java.lang.String r0 = y30.C91374g.f262062c
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r2 = r0.getPath()
            if (r2 == 0) goto L_0x00ea
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r4, r4)
            java.lang.String r5 = r0.getPath()
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x00ea
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r2)
            android.net.Uri r0 = r0.build()
        L_0x00ea:
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r0, r1)
            boolean r5 = r2.mo177810a()
            if (r5 != 0) goto L_0x00f6
            r5 = 0
            goto L_0x00fe
        L_0x00f6:
            com.tencent.mm.vfs.FileSystem$c r5 = r2.f348991a
            java.lang.String r10 = r2.f348992b
            boolean r5 = r5.mo119948x(r10)
        L_0x00fe:
            if (r5 != 0) goto L_0x0112
            com.tencent.mm.vfs.f0$h r0 = r3.mo177799l(r0, r2)
            boolean r2 = r0.mo177810a()
            if (r2 != 0) goto L_0x010b
            goto L_0x0112
        L_0x010b:
            com.tencent.mm.vfs.FileSystem$c r2 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            r2.mo119937g(r0)
        L_0x0112:
            java.lang.String r0 = y30.C91374g.f262061b
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r5 = r2.getPath()
            if (r5 == 0) goto L_0x0138
            java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r4, r4)
            java.lang.String r10 = r2.getPath()
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x0138
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r5)
            android.net.Uri r2 = r2.build()
        L_0x0138:
            com.tencent.mm.vfs.f0$h r5 = r3.mo177799l(r2, r1)
            boolean r10 = r5.mo177810a()
            if (r10 != 0) goto L_0x0144
            r10 = 0
            goto L_0x014c
        L_0x0144:
            com.tencent.mm.vfs.FileSystem$c r10 = r5.f348991a
            java.lang.String r11 = r5.f348992b
            boolean r10 = r10.mo119948x(r11)
        L_0x014c:
            if (r10 != 0) goto L_0x0160
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r5)
            boolean r3 = r2.mo177810a()
            if (r3 != 0) goto L_0x0159
            goto L_0x0160
        L_0x0159:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            r3.mo119937g(r2)
        L_0x0160:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r0)
            com.tencent.mm.vfs.m1[] r0 = r2.mo119984u()
            int r2 = r0.length
            r3 = 0
        L_0x016b:
            java.lang.String r5 = "Kara.ModelManager"
            if (r3 >= r2) goto L_0x018f
            r10 = r0[r3]
            if (r10 == 0) goto L_0x018c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "printFile:"
            r11.append(r12)
            java.lang.String r10 = r10.getName()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
        L_0x018c:
            int r3 = r3 + 1
            goto L_0x016b
        L_0x018f:
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r2 = "clicfg_plugin_kara_model_center_work"
            java.lang.String r0 = r0.mo182444f(r2, r8, r4, r9)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r9)
            if (r0 != 0) goto L_0x01a1
            r0 = 1
            goto L_0x01a2
        L_0x01a1:
            r0 = 0
        L_0x01a2:
            java.lang.String r2 = "Congratulations！Safe and sound!"
            if (r0 == 0) goto L_0x01da
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = y30.C91374g.f262061b
            r0.<init>((java.lang.String) r3)
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()
            int r3 = r0.length
            r10 = 0
        L_0x01b3:
            if (r10 >= r3) goto L_0x01d7
            r11 = r0[r10]
            if (r11 == 0) goto L_0x01d4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "clean cloud delete:"
            r12.append(r13)
            java.lang.String r13 = r11.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            r11.mo119966f()
        L_0x01d4:
            int r10 = r10 + 1
            goto L_0x01b3
        L_0x01d7:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
        L_0x01da:
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r3 = "clicfg_plugin_kara_clean_all_fewshot_models"
            java.lang.String r10 = "0"
            java.lang.String r0 = r0.mo182444f(r3, r10, r4, r9)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r4)
            if (r0 != 0) goto L_0x01ee
            r0 = 0
            goto L_0x01ef
        L_0x01ee:
            r0 = 1
        L_0x01ef:
            if (r0 == 0) goto L_0x0225
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = y30.C91374g.f262062c
            r0.<init>((java.lang.String) r3)
            com.tencent.mm.vfs.m1[] r0 = r0.mo119984u()
            int r3 = r0.length
            r10 = 0
        L_0x01fe:
            if (r10 >= r3) goto L_0x0222
            r11 = r0[r10]
            if (r11 == 0) goto L_0x021f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "clean few shot delete:"
            r12.append(r13)
            java.lang.String r13 = r11.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            r11.mo119966f()
        L_0x021f:
            int r10 = r10 + 1
            goto L_0x01fe
        L_0x0222:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
        L_0x0225:
            y30.d r0 = new y30.d
            java.lang.String r2 = ".zst"
            r0.<init>(r2)
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            java.lang.String r10 = y30.C91374g.f262061b
            r3.<init>((java.lang.String) r10)
            com.tencent.mm.vfs.m1[] r0 = r3.mo119985v(r0)
            int r3 = r0.length
            r10 = 0
        L_0x0239:
            if (r10 >= r3) goto L_0x02ab
            r11 = r0[r10]
            if (r11 == 0) goto L_0x02a8
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "\\."
            java.lang.String[] r12 = r12.split(r13)
            int r13 = r12.length
            if (r13 <= r9) goto L_0x02a5
            int r13 = r12.length
            int r13 = r13 - r9
            r13 = r12[r13]
            java.lang.String r14 = "zst"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x02a5
            int r13 = r12.length
            int r13 = r13 + -2
            r12 = r12[r13]
            long r12 = java.lang.Long.parseLong(r12)     // Catch:{ Exception -> 0x028a }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x028a }
            long r14 = r14 - r12
            r12 = 259200000(0xf731400, double:1.280618154E-315)
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x02a5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028a }
            r12.<init>()     // Catch:{ Exception -> 0x028a }
            java.lang.String r13 = "clean3daysZst delete:"
            r12.append(r13)     // Catch:{ Exception -> 0x028a }
            java.lang.String r13 = r11.getName()     // Catch:{ Exception -> 0x028a }
            r12.append(r13)     // Catch:{ Exception -> 0x028a }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x028a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)     // Catch:{ Exception -> 0x028a }
            r11.mo119966f()     // Catch:{ Exception -> 0x028a }
            goto L_0x02a5
        L_0x028a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "clean3daysZst catch delete:"
            r12.append(r13)
            java.lang.String r13 = r11.getName()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            r11.mo119966f()
        L_0x02a5:
            r11.mo119966f()
        L_0x02a8:
            int r10 = r10 + 1
            goto L_0x0239
        L_0x02ab:
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r3 = "clicfg_plugin_kara_model_download_open"
            java.lang.String r0 = r0.mo182444f(r3, r8, r4, r9)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r9)
            if (r0 != 0) goto L_0x02bd
            r0 = 0
            goto L_0x02be
        L_0x02bd:
            r0 = 1
        L_0x02be:
            java.lang.String r3 = ""
            java.lang.String r10 = "wechatzstd"
            if (r0 != 0) goto L_0x02cc
            java.lang.String r0 = "download close"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0526
        L_0x02cc:
            java.util.List r0 = y30.C91374g.m114628b(r9)
            if (r0 != 0) goto L_0x02d4
            goto L_0x0526
        L_0x02d4:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02da:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0526
            java.lang.Object r11 = r0.next()
            y30.a r11 = (y30.C91370a) r11
            boolean r12 = r11.mo125344d()
            if (r12 != 0) goto L_0x02fb
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.String r11 = r11.toString()
            r12[r4] = r11
            java.lang.String r11 = "invalid model: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r11, r12)
            goto L_0x03e1
        L_0x02fb:
            java.lang.String r12 = r11.f262053a
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r13 = "MomentVideo"
            if (r12 == 0) goto L_0x031a
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.lang.String r11 = r11.toString()
            r12[r4] = r11
            java.lang.String r11 = "url null: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r11, r12)
            r11 = 602(0x25a, float:8.44E-43)
            d40.C31062a.m39295b(r13, r11)
            goto L_0x03e1
        L_0x031a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = y30.C91374g.f262061b
            r12.append(r14)
            r12.append(r6)
            java.lang.String r15 = r11.mo125341a()
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)
            java.lang.String r15 = r12.getPath()
            if (r15 == 0) goto L_0x0356
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r4, r4)
            java.lang.String r4 = r12.getPath()
            boolean r4 = r4.equals(r15)
            if (r4 != 0) goto L_0x0356
            android.net.Uri$Builder r4 = r12.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r15)
            android.net.Uri r12 = r4.build()
        L_0x0356:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r12, r1)
            boolean r12 = r4.mo177810a()
            if (r12 != 0) goto L_0x0364
            r4 = 0
            goto L_0x036c
        L_0x0364:
            com.tencent.mm.vfs.FileSystem$c r12 = r4.f348991a
            java.lang.String r4 = r4.f348992b
            boolean r4 = r12.mo119948x(r4)
        L_0x036c:
            if (r4 == 0) goto L_0x037d
            java.lang.Object[] r4 = new java.lang.Object[r9]
            java.lang.String r11 = r11.toString()
            r12 = 0
            r4[r12] = r11
            java.lang.String r11 = "model exist: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r4)
            goto L_0x03e1
        L_0x037d:
            y30.f r4 = new y30.f
            r4.<init>(r11)
            com.tencent.mm.vfs.m1 r12 = new com.tencent.mm.vfs.m1
            r12.<init>((java.lang.String) r14)
            com.tencent.mm.vfs.m1[] r4 = r12.mo119985v(r4)
            if (r4 == 0) goto L_0x0395
            int r12 = r4.length
            if (r12 != 0) goto L_0x0391
            goto L_0x0395
        L_0x0391:
            r12 = 0
            r4 = r4[r12]
            goto L_0x0397
        L_0x0395:
            r12 = 0
            r4 = r1
        L_0x0397:
            if (r4 == 0) goto L_0x03e4
            boolean r15 = r4.mo119967g()
            if (r15 == 0) goto L_0x03e4
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r15 = r11.toString()
            r13[r12] = r15
            java.lang.String r12 = "model zstd exist: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r12, r13)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            r12.append(r6)
            java.lang.String r11 = r11.mo125341a()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r4 = r4.mo119976n()
            boolean r4 = n30.C47155b.m52440a(r4, r11)
            if (r4 == 0) goto L_0x03d7
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r12 = 0
            r4[r12] = r11
            java.lang.String r11 = "decompress succ save: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r11, r4)
            goto L_0x03e1
        L_0x03d7:
            r12 = 0
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r4[r12] = r11
            java.lang.String r11 = "decompress fail %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r11, r4)
        L_0x03e1:
            r4 = 0
            goto L_0x02da
        L_0x03e4:
            java.lang.String r4 = r11.f262055c
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x03f0
        L_0x03ec:
            r18 = r0
            goto L_0x0495
        L_0x03f0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r12 = r11.f262055c
            r4.append(r12)
            java.lang.String r12 = "_"
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            y30.e r15 = new y30.e
            r15.<init>(r4)
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1
            r4.<init>((java.lang.String) r14)
            com.tencent.mm.vfs.m1[] r4 = r4.mo119985v(r15)
            int r14 = r4.length
            r15 = 0
        L_0x0413:
            if (r15 >= r14) goto L_0x03ec
            r17 = r4[r15]
            if (r17 == 0) goto L_0x048b
            java.lang.String r1 = r17.getName()
            java.lang.String r9 = r11.mo125341a()
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0428
            goto L_0x048b
        L_0x0428:
            java.lang.String r1 = r17.getName()
            java.lang.String[] r1 = r1.split(r12)
            int r9 = r1.length
            r18 = r0
            r0 = 3
            if (r9 < r0) goto L_0x046f
            r0 = 1
            r1 = r1[r0]
            java.lang.String r0 = "0x"
            java.lang.String r1 = r1.replace(r0, r3)
            r9 = 16
            long r19 = java.lang.Long.parseLong(r1, r9)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            java.lang.String r0 = r1.replace(r0, r3)
            long r0 = java.lang.Long.parseLong(r0, r9)
            int r9 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x048d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cleanOldModel delete:"
            r0.append(r1)
            java.lang.String r1 = r17.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r17.mo119966f()
            goto L_0x048d
        L_0x046f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cleanOldModel catch delete:"
            r0.append(r1)
            java.lang.String r1 = r17.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r17.mo119966f()
            goto L_0x048d
        L_0x048b:
            r18 = r0
        L_0x048d:
            int r15 = r15 + 1
            r0 = r18
            r1 = 0
            r9 = 1
            goto L_0x0413
        L_0x0495:
            boolean r0 = y30.C91374g.f262060a
            if (r0 != 0) goto L_0x049f
            p206nj.C88957l.m111078n(r10)
            r0 = 1
            y30.C91374g.f262060a = r0
        L_0x049f:
            r0 = 601(0x259, float:8.42E-43)
            d40.C31062a.m39295b(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = y30.C91374g.f262061b
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r11.mo125341a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r4 = r1.getPath()
            if (r4 == 0) goto L_0x04e1
            r9 = 0
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r9, r9)
            java.lang.String r9 = r1.getPath()
            boolean r9 = r9.equals(r4)
            if (r9 != 0) goto L_0x04e1
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r4)
            android.net.Uri r1 = r1.build()
        L_0x04e1:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r9 = 0
            com.tencent.mm.vfs.f0$h r1 = r4.mo177799l(r1, r9)
            boolean r4 = r1.mo177810a()
            if (r4 != 0) goto L_0x04f0
            r1 = 0
            goto L_0x04f8
        L_0x04f0:
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            boolean r1 = r4.mo119948x(r1)
        L_0x04f8:
            if (r1 != 0) goto L_0x051f
            java.lang.String r1 = r11.f262053a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r9 = "."
            r4.append(r9)
            long r12 = java.lang.System.currentTimeMillis()
            r4.append(r12)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            y30.c r9 = new y30.c
            r9.<init>(r11, r0)
            n30.C47152a.m52437a(r1, r4, r9)
        L_0x051f:
            r0 = r18
            r1 = 0
            r4 = 0
            r9 = 1
            goto L_0x02da
        L_0x0526:
            boolean r0 = j30.C76385a.m91810b()
            if (r0 != 0) goto L_0x0535
            java.lang.String r0 = "Kara.FewShotLearningEnv"
            java.lang.String r1 = "few shot close"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x05e1
        L_0x0535:
            java.lang.String r0 = v30.C90748b.f260642a
            oa1.d r0 = oa1.C117731d.m166007c()
            r1 = 1
            r2 = 0
            java.lang.String r0 = r0.mo182444f(r7, r8, r2, r1)
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 != 0) goto L_0x0549
            r12 = 0
            goto L_0x054a
        L_0x0549:
            r12 = 1
        L_0x054a:
            java.lang.String r0 = "Kara.XgboostEnv"
            if (r12 != 0) goto L_0x0556
            java.lang.String r1 = "so download close"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x05e1
        L_0x0556:
            java.lang.String r1 = v30.C90748b.f260643b
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 != 0) goto L_0x05e1
            java.lang.String r2 = "env not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            java.lang.String r0 = v30.C90748b.f260642a
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r2 = r0.getPath()
            if (r2 == 0) goto L_0x058a
            r4 = 0
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r4, r4)
            java.lang.String r4 = r0.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x058a
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r2)
            android.net.Uri r0 = r0.build()
        L_0x058a:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r4 = 0
            com.tencent.mm.vfs.f0$h r0 = r2.mo177799l(r0, r4)
            boolean r2 = r0.mo177810a()
            if (r2 != 0) goto L_0x0598
            goto L_0x059f
        L_0x0598:
            com.tencent.mm.vfs.FileSystem$c r2 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            r2.mo119937g(r0)
        L_0x059f:
            p206nj.C88957l.m111078n(r10)
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r2 = "clicfg_plugin_kara_xgboost_64"
            r4 = 1
            java.lang.String r0 = r0.mo182444f(r2, r3, r4, r4)
            oa1.d r2 = oa1.C117731d.m166007c()
            java.lang.String r5 = "clicfg_plugin_kara_xgboost_64_md5"
            java.lang.String r2 = r2.mo182444f(r5, r3, r4, r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = ".zstd"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            v30.a r3 = new v30.a
            r3.<init>(r2)
            n30.C47152a.m52437a(r0, r1, r3)
            goto L_0x05e1
        L_0x05d1:
            zt3.t r0 = zt3.C119157j.f356862d
            java.lang.Runnable r1 = d30.C86168b.f250695d
            r2 = 900000(0xdbba0, double:4.44659E-318)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r4 = 0
            r0.mo183886q(r1, r2, r4)
        L_0x05e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d30.b$$d.run():void");
    }
}
