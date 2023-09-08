package com.tencent.p014mm.plugin.music.player.base;

/* renamed from: com.tencent.mm.plugin.music.player.base.d */
public class C94220d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C94221e f272183d;

    public C94220d(C94221e eVar, int i) {
        this.f272183d = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r0 = r16
            com.tencent.mm.plugin.music.player.base.e r1 = r0.f272183d
            boolean r1 = r1.mo129528d()
            if (r1 == 0) goto L_0x0122
            com.tencent.mm.plugin.music.player.base.e r1 = r0.f272183d
            com.tencent.mm.plugin.music.player.base.i r2 = r1.f272184a
            qc0.m r1 = r1.f272185b
            sa2.e$a r2 = (sa2.C101563e.C101564a) r2
            r2.getClass()
            la2.n r3 = la2.C99364n.m129616h()
            qc0.m r3 = r3.mo138832k()
            if (r3 != 0) goto L_0x0021
            goto L_0x0122
        L_0x0021:
            boolean r1 = r3.mo140555a(r1)
            if (r1 == 0) goto L_0x0122
            sa2.e r1 = sa2.C101563e.this
            com.tencent.mm.plugin.music.player.base.e r1 = r1.f297324r
            if (r1 == 0) goto L_0x0122
            boolean r1 = r1.mo129529e()
            if (r1 == 0) goto L_0x0122
            sa2.e r1 = sa2.C101563e.this
            com.tencent.mm.plugin.music.player.base.e r1 = r1.f297324r
            int r1 = r1.mo129525a()
            sa2.e r3 = sa2.C101563e.this
            com.tencent.mm.plugin.music.player.base.e r3 = r3.f297324r
            int r3 = r3.mo129526b()
            if (r1 <= 0) goto L_0x0122
            if (r3 <= 0) goto L_0x0122
            float r4 = (float) r1
            float r5 = (float) r3
            float r4 = r4 / r5
            sa2.e r5 = sa2.C101563e.this
            ja2.b r5 = r5.f297325s
            if (r5 == 0) goto L_0x010a
            r5.f289992g = r4
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isNetworkConnected(r6)
            boolean r7 = r5.f289995j
            r8 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            if (r7 == 0) goto L_0x00c2
            if (r6 == 0) goto L_0x00c2
            boolean r7 = r5.f289994i
            if (r7 == 0) goto L_0x0074
            ja2.a r7 = r5.f289991f
            long r13 = r7.f289987f
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0071
            goto L_0x00c2
        L_0x0071:
            long r9 = r7.f289985d
            goto L_0x007f
        L_0x0074:
            ja2.a r7 = r5.f289991f
            long r13 = r7.f289983b
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x007d
            goto L_0x00c2
        L_0x007d:
            long r9 = r7.f289982a
        L_0x007f:
            float r7 = (float) r9
            float r9 = (float) r13
            float r7 = r7 / r9
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x0087
            goto L_0x00c2
        L_0x0087:
            float r9 = r7 - r4
            r10 = 1041865114(0x3e19999a, float:0.15)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto L_0x00c2
            if (r6 == 0) goto L_0x00c2
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Float r10 = java.lang.Float.valueOf(r4)
            r13 = 0
            r9[r13] = r10
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r10 = 1
            r9[r10] = r7
            r7 = 2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r9[r7] = r6
            java.lang.String r6 = "MicroMsg.Music.MusicDownloadTask"
            java.lang.String r7 = "playPercent=%.2f downloadPercent=%.2f isConnectNetwork=%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r7, r9)
            boolean r6 = r5.f289995j
            if (r6 != 0) goto L_0x00b8
            r6 = 0
            goto L_0x00c4
        L_0x00b8:
            r6 = 0
            r5.f289995j = r6
            java.lang.String r7 = "music_download_thread"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r5, r7)
            goto L_0x00c4
        L_0x00c2:
            r6 = 0
            r10 = 1
        L_0x00c4:
            sa2.e r5 = sa2.C101563e.this
            ja2.b r5 = r5.f297325s
            if (r5 == 0) goto L_0x010a
            boolean r7 = r5.f289995j
            if (r7 == 0) goto L_0x010a
            boolean r7 = r5.f289994i
            if (r7 == 0) goto L_0x00de
            ja2.a r5 = r5.f289991f
            long r13 = r5.f289987f
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x00db
            goto L_0x00fb
        L_0x00db:
            long r11 = r5.f289985d
            goto L_0x00e9
        L_0x00de:
            ja2.a r5 = r5.f289991f
            long r13 = r5.f289983b
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x00e7
            goto L_0x00fb
        L_0x00e7:
            long r11 = r5.f289982a
        L_0x00e9:
            float r5 = (float) r11
            float r7 = (float) r13
            float r5 = r5 / r7
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 < 0) goto L_0x00f1
            goto L_0x00f9
        L_0x00f1:
            float r5 = r5 - r4
            r4 = 1028443341(0x3d4ccccd, float:0.05)
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00fb
        L_0x00f9:
            r9 = 1
            goto L_0x00fc
        L_0x00fb:
            r9 = 0
        L_0x00fc:
            if (r9 != 0) goto L_0x010a
            java.lang.String r4 = "MicroMsg.Music.MusicPlayer"
            java.lang.String r5 = "download percent not enough can not play"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            sa2.e r4 = sa2.C101563e.this
            r4.mo32210j()
        L_0x010a:
            sa2.e r2 = sa2.C101563e.this
            java.util.LinkedList<com.tencent.mm.plugin.music.player.base.g$a> r2 = r2.f297311p
            java.util.Iterator r2 = r2.iterator()
        L_0x0112:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0122
            java.lang.Object r4 = r2.next()
            com.tencent.mm.plugin.music.player.base.g$a r4 = (com.tencent.p014mm.plugin.music.player.base.C94223g.C94224a) r4
            r4.mo80435a(r1, r3)
            goto L_0x0112
        L_0x0122:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.music.player.base.C94220d.run():void");
    }
}
