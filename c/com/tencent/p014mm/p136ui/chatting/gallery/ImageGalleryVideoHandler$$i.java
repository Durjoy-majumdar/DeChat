package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$i */
public class ImageGalleryVideoHandler$$i implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ ImageGalleryVideoHandler f284604d;

    public ImageGalleryVideoHandler$$i(ImageGalleryVideoHandler imageGalleryVideoHandler) {
        this.f284604d = imageGalleryVideoHandler;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r1.f284995a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTimerExpired() {
        /*
            r23 = this;
            r0 = r23
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler r1 = r0.f284604d
            com.tencent.mm.ui.chatting.gallery.t1 r1 = r1.f284582o
            java.lang.String r2 = r1.f285000f
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r3 = 3
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x0019
            int r1 = r1.f284995a
            if (r1 == r4) goto L_0x0017
            if (r1 != r3) goto L_0x0019
        L_0x0017:
            r1 = 1
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x001d
            return r5
        L_0x001d:
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler r1 = r0.f284604d
            com.tencent.mm.ui.chatting.gallery.h r1 = r1.f284638d
            com.tencent.mm.ui.chatting.gallery.m1 r1 = r1.mo135934v()
            if (r1 != 0) goto L_0x0028
            return r5
        L_0x0028:
            android.widget.RelativeLayout r2 = r1.f284845l
            if (r2 != 0) goto L_0x002d
            return r5
        L_0x002d:
            r1.mo135970f()
            android.widget.RelativeLayout r2 = r1.f284845l
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0039
            return r5
        L_0x0039:
            r1.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r2 = r1.f284849p
            boolean r2 = r2.isPlaying()
            if (r2 == 0) goto L_0x022c
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler r2 = r0.f284604d
            int r6 = r2.f284588u
            r1.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r7 = r1.f284849p
            int r7 = r7.getCurrentPosition()
            r2.f284588u = r7
            r8 = 0
            r10 = 4
            r11 = 2
            java.lang.String r12 = "MicroMsg.Imagegallery.handler.video"
            if (r6 == r7) goto L_0x01a8
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r2.f284590w = r6
            r1.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r6 = r1.f284849p
            long r6 = r6.getLastSurfaceUpdateTime()
            java.lang.String r13 = ""
            r14 = 13836(0x360c, float:1.9388E-41)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x00d8
            long r8 = r2.f284589v
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x00d8
            r2.f284589v = r6
            int r6 = r2.f284591x
            if (r6 == r11) goto L_0x0089
            if (r6 == r3) goto L_0x0086
            if (r6 == r10) goto L_0x0083
            goto L_0x00d4
        L_0x0083:
            r7 = 23
            goto L_0x008b
        L_0x0086:
            r7 = 22
            goto L_0x008b
        L_0x0089:
            r7 = 21
        L_0x008b:
            java.lang.Object[] r8 = new java.lang.Object[r10]
            int r9 = r2.hashCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r8[r4] = r9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r11] = r6
            java.lang.String r6 = r2.f284593z
            r8[r3] = r6
            java.lang.String r6 = "%d rpt rptRepairEffect idKey %d errorTime %d filename %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r6, r8)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 354(0x162, double:1.75E-321)
            long r7 = (long) r7
            r20 = 1
            r22 = 0
            r15 = r6
            r18 = r7
            r15.idkeyStat(r16, r18, r20, r22)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r7 = 301(0x12d, float:4.22E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r5] = r7
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r3[r4] = r7
            r3[r11] = r13
            r6.mo160131h(r14, r3)
        L_0x00d4:
            r2.f284591x = r5
            goto L_0x022c
        L_0x00d8:
            int r6 = r2.f284591x
            r7 = -1
            if (r6 == r7) goto L_0x022c
            int r6 = r6 + r4
            r2.f284591x = r6
            java.lang.Object[] r8 = new java.lang.Object[r11]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r5] = r6
            int r6 = r2.f284592y
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r4] = r6
            java.lang.String r6 = "media play is playing[%d], but surface is not update!! repair time[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r6, r8)
            int r6 = r2.f284592y
            if (r6 < r11) goto L_0x00ff
            com.tencent.mm.ui.chatting.gallery.t1 r6 = r2.f284582o
            r6.mo136038h()
        L_0x00ff:
            int r6 = r2.f284591x
            if (r6 == 0) goto L_0x022c
            if (r6 == r4) goto L_0x022c
            java.lang.String r8 = "surface not update, it try seek time[%d] to repair."
            if (r6 == r11) goto L_0x018f
            if (r6 == r3) goto L_0x0171
            if (r6 == r10) goto L_0x0153
            java.lang.String r6 = "rpt surface not update!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r6)
            java.lang.Object[] r6 = new java.lang.Object[r11]
            int r8 = r2.hashCode()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6[r5] = r8
            java.lang.String r8 = r2.f284593z
            r6[r4] = r8
            java.lang.String r8 = "%d rpt rptSurfaceNotUpdate %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r8, r6)
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r6 = 300(0x12c, float:4.2E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r5] = r6
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r3[r4] = r6
            r3[r11] = r13
            r15.mo160131h(r14, r3)
            r16 = 354(0x162, double:1.75E-321)
            r18 = 20
            r20 = 1
            r22 = 0
            r15.idkeyStat(r16, r18, r20, r22)
            r2.f284591x = r7
            goto L_0x022c
        L_0x0153:
            int r3 = r2.f284588u
            int r3 = r3 + -4000
            int r3 = r3 / 1000
            if (r3 >= 0) goto L_0x015c
            r3 = 0
        L_0x015c:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r5] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r8, r6)
            r2.mo135837N(r3, r4)
            int r3 = r2.f284592y
            int r3 = r3 + r4
            r2.f284592y = r3
            goto L_0x022b
        L_0x0171:
            int r3 = r2.f284588u
            int r3 = r3 + -2000
            int r3 = r3 / 1000
            if (r3 >= 0) goto L_0x017a
            r3 = 0
        L_0x017a:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r5] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r8, r6)
            r2.mo135837N(r3, r4)
            int r3 = r2.f284592y
            int r3 = r3 + r4
            r2.f284592y = r3
            goto L_0x022b
        L_0x018f:
            int r3 = r2.f284588u
            int r3 = r3 / 1000
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r5] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r8, r6)
            r2.mo135837N(r3, r4)
            int r3 = r2.f284592y
            int r3 = r3 + r4
            r2.f284592y = r3
            goto L_0x022b
        L_0x01a8:
            java.lang.Object[] r7 = new java.lang.Object[r10]
            long r13 = r2.f284590w
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r7[r5] = r10
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r7[r4] = r10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r11] = r6
            int r6 = r2.f284588u
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r3] = r6
            java.lang.String r3 = "check time[%d, %d], play time[%d, %d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r7)
            long r6 = r2.f284590w
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x022c
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r6)
            r10 = 1500(0x5dc, double:7.41E-321)
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 < 0) goto L_0x022c
            java.lang.String r3 = "play time not update! request all video data to play. "
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r3)
            com.tencent.mm.ui.chatting.gallery.h r3 = r2.f284638d
            com.tencent.mm.ui.chatting.gallery.m1 r3 = r3.mo135934v()
            com.tencent.mm.pluginsdk.ui.tools.r0 r3 = r3.f284849p
            int r3 = r3.getCurrentPosition()
            r2.mo135827D()
            java.lang.String r4 = r2.f284593z
            boolean r6 = r2.f284584q
            hd0.C98429r0.m127832w(r4, r3, r6)
            com.tencent.mm.ui.chatting.gallery.h r3 = r2.f284638d
            com.tencent.mm.ui.chatting.gallery.m1 r3 = r3.mo135934v()
            com.tencent.mm.pluginsdk.ui.tools.r0 r3 = r3.f284849p
            r3.stop()
            com.tencent.mm.ui.chatting.gallery.t1 r3 = r2.f284582o
            r3.mo136038h()
            java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$k> r3 = r2.f284579i
            java.lang.String r4 = r2.f284593z
            java.lang.Object r3 = r3.get(r4)
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler$$k r3 = (com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler$$k) r3
            if (r3 == 0) goto L_0x022b
            com.tencent.mm.storage.f4 r4 = r3.f284606a
            if (r4 != 0) goto L_0x021c
            goto L_0x022b
        L_0x021c:
            hd0.n0 r4 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r4)
            com.tencent.mm.storage.f4 r6 = r3.f284606a
            int r3 = r3.f284607b
            boolean r7 = r2.f284584q
            r2.mo135834K(r6, r4, r3, r7)
            r2.f284590w = r8
        L_0x022b:
            r4 = 0
        L_0x022c:
            if (r4 == 0) goto L_0x0242
            r1.mo135970f()
            com.tencent.mm.pluginsdk.ui.tools.r0 r1 = r1.f284849p
            int r1 = r1.getCurrentPosition()
            int r1 = r1 / 1000
            com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoHandler r2 = r0.f284604d
            com.tencent.mm.ui.chatting.gallery.t1 r2 = r2.f284582o
            boolean r1 = r2.mo136034d(r1)
            return r1
        L_0x0242:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryVideoHandler$$i.onTimerExpired():boolean");
    }
}
