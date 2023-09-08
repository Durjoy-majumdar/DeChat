package ca3;

import com.tencent.p014mm.plugin.webview.model.C43721l;

/* renamed from: ca3.o */
public final class C16909o implements C43721l {

    /* renamed from: a */
    public final /* synthetic */ C16886m f45725a;

    public C16909o(C16886m mVar) {
        this.f45725a = mVar;
    }

    /* JADX WARNING: type inference failed for: r12v9, types: [in0.d] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18000a(int r11, android.os.Bundle r12) {
        /*
            r10 = this;
            r0 = 2
            if (r11 != r0) goto L_0x00be
            r11 = 0
            r1 = 0
            if (r12 == 0) goto L_0x0012
            java.lang.String r2 = "videoInfoForMp"
            byte[] r2 = r12.getByteArray(r2)     // Catch:{ Exception -> 0x000f }
            goto L_0x0013
        L_0x000f:
            r11 = move-exception
            goto L_0x00b1
        L_0x0012:
            r2 = r11
        L_0x0013:
            if (r2 == 0) goto L_0x00be
            te3.zo1 r3 = new te3.zo1     // Catch:{ Exception -> 0x000f }
            r3.<init>()     // Catch:{ Exception -> 0x000f }
            r3.parseFrom(r2)     // Catch:{ Exception -> 0x000f }
            java.lang.String r2 = "playbackTime"
            r4 = 0
            float r12 = r12.getFloat(r2, r4)     // Catch:{ Exception -> 0x000f }
            ca3.m r2 = r10.f45725a     // Catch:{ Exception -> 0x000f }
            java.lang.String r2 = r2.mo17980x()     // Catch:{ Exception -> 0x000f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x000f }
            r4.<init>()     // Catch:{ Exception -> 0x000f }
            java.lang.String r5 = "onExitFinderFullscreen mLocalFeedId: "
            r4.append(r5)     // Catch:{ Exception -> 0x000f }
            ca3.m r5 = r10.f45725a     // Catch:{ Exception -> 0x000f }
            java.lang.String r5 = r5.f45649B     // Catch:{ Exception -> 0x000f }
            r4.append(r5)     // Catch:{ Exception -> 0x000f }
            java.lang.String r5 = ", feedKey: %s, playBackTime: %s, cacheSize: %s, totalSize: %s, playBackTime: %sisMoovReady: %s, state: %s"
            r4.append(r5)     // Catch:{ Exception -> 0x000f }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x000f }
            r5 = 7
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x000f }
            java.lang.String r6 = r3.f186756A     // Catch:{ Exception -> 0x000f }
            r5[r1] = r6     // Catch:{ Exception -> 0x000f }
            int r6 = r3.f186774w     // Catch:{ Exception -> 0x000f }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x000f }
            r7 = 1
            r5[r7] = r6     // Catch:{ Exception -> 0x000f }
            long r8 = r3.f186769r     // Catch:{ Exception -> 0x000f }
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x000f }
            r5[r0] = r6     // Catch:{ Exception -> 0x000f }
            r6 = 3
            long r8 = r3.f186770s     // Catch:{ Exception -> 0x000f }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x000f }
            r5[r6] = r8     // Catch:{ Exception -> 0x000f }
            r6 = 4
            boolean r8 = r3.f186757B     // Catch:{ Exception -> 0x000f }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x000f }
            r5[r6] = r8     // Catch:{ Exception -> 0x000f }
            r6 = 5
            int r8 = r3.f186772u     // Catch:{ Exception -> 0x000f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x000f }
            r5[r6] = r8     // Catch:{ Exception -> 0x000f }
            r6 = 6
            java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch:{ Exception -> 0x000f }
            r5[r6] = r12     // Catch:{ Exception -> 0x000f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r5)     // Catch:{ Exception -> 0x000f }
            ca3.m r12 = r10.f45725a     // Catch:{ Exception -> 0x000f }
            java.lang.String r12 = r12.f45649B     // Catch:{ Exception -> 0x000f }
            if (r12 == 0) goto L_0x008f
            int r12 = r12.length()     // Catch:{ Exception -> 0x000f }
            if (r12 != 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 != 0) goto L_0x00be
            ca3.m r12 = r10.f45725a     // Catch:{ Exception -> 0x000f }
            java.lang.String r12 = r12.f45649B     // Catch:{ Exception -> 0x000f }
            java.lang.String r2 = r3.f186756A     // Catch:{ Exception -> 0x000f }
            boolean r12 = z04.C112551y.m153810j(r12, r2, r1, r0, r11)     // Catch:{ Exception -> 0x000f }
            if (r12 == 0) goto L_0x00be
            ca3.m r12 = r10.f45725a     // Catch:{ Exception -> 0x000f }
            r12.getClass()     // Catch:{ Exception -> 0x000f }
            in0.d r12 = r12.f45684n     // Catch:{ Exception -> 0x000f }
            boolean r0 = r12 instanceof com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g     // Catch:{ Exception -> 0x000f }
            if (r0 == 0) goto L_0x00ab
            r11 = r12
            com.tencent.mm.plugin.appbrand.video.player.thumb.g r11 = (com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18059g) r11     // Catch:{ Exception -> 0x000f }
        L_0x00ab:
            if (r11 == 0) goto L_0x00be
            r11.mo22590y(r3)     // Catch:{ Exception -> 0x000f }
            goto L_0x00be
        L_0x00b1:
            ca3.m r12 = r10.f45725a
            java.lang.String r12 = r12.mo17980x()
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "onExitFinderFullscreen exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r11, r1, r0)
        L_0x00be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca3.C16909o.mo18000a(int, android.os.Bundle):void");
    }
}
