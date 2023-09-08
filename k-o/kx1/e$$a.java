package kx1;

import java.util.ArrayList;

public final /* synthetic */ class e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f125917d;

    /* renamed from: e */
    public final /* synthetic */ int f125918e;

    public /* synthetic */ e$$a(ArrayList arrayList, int i) {
        this.f125917d = arrayList;
        this.f125918e = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.f125917d
            int r2 = r0.f125918e
            java.util.Iterator r1 = r1.iterator()
        L_0x000a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0176
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            kx1.f r4 = new kx1.f
            r4.<init>()
            java.lang.String r5 = "filePath"
            gy3.C87412m.m108594g(r3, r5)
            int r5 = r3.length()
            r10 = 1
            r11 = 0
            if (r5 != 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            if (r5 == 0) goto L_0x0030
            r12 = 0
            goto L_0x0169
        L_0x0030:
            kx1.b r5 = new kx1.b
            r5.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "gameimgupload"
            r4.append(r6)
            r6 = 95
            r4.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = eb0.C75592q0.m90789s()
            r6.append(r7)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r6)
            r4.append(r6)
            java.lang.String r13 = r4.toString()
            gi.g r14 = new gi.g
            r14.<init>()
            java.lang.String r4 = "task_GameChatRoomMediaUploader"
            r14.f287660d = r4
            r14.f287662f = r5
            r14.field_mediaId = r13
            r14.field_fullpath = r3
            int r4 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongPicture((java.lang.String) r3)
            int r5 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r3)
            r15 = 90
            int r6 = r2 * 90
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = yw1.C53591c.f150602d
            r6.append(r7)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r6.append(r7)
            java.lang.String r9 = r6.toString()
            if (r4 <= 0) goto L_0x00a3
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.createLongPictureBitmap(r3, r4, r5)
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.drawBackgroundInNeed(r4, r3, r11)
            r12 = r9
            goto L_0x00b3
        L_0x00a3:
            r5 = 120(0x78, float:1.68E-43)
            r6 = 120(0x78, float:1.68E-43)
            r7 = 1
            r8 = 0
            r16 = 0
            r4 = r3
            r12 = r9
            r9 = r16
            android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbBitmap(r4, r5, r6, r7, r8, r9)
        L_0x00b3:
            if (r4 != 0) goto L_0x00b9
            android.graphics.Bitmap r4 = com.tencent.p014mm.graphics.MMBitmapFactory.m98734c(r3)
        L_0x00b9:
            java.lang.String r5 = "MicroMsg.ChatRoomMediaUploader"
            if (r4 == 0) goto L_0x00f5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "thumb bitmap size:"
            r6.append(r7)
            int r7 = r4.getByteCount()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r4, r15, r6, r12, r11)     // Catch:{ Exception -> 0x00f4 }
            com.tencent.mm.autogen.events.PreSendImgDataEvent r6 = new com.tencent.mm.autogen.events.PreSendImgDataEvent     // Catch:{ Exception -> 0x00f4 }
            r6.<init>()     // Catch:{ Exception -> 0x00f4 }
            com.tencent.mm.autogen.events.PreSendImgDataEvent$a r7 = r6.f107697d     // Catch:{ Exception -> 0x00f4 }
            r7.f107699b = r3     // Catch:{ Exception -> 0x00f4 }
            r7.f107700c = r12     // Catch:{ Exception -> 0x00f4 }
            int r3 = r4.getWidth()     // Catch:{ Exception -> 0x00f4 }
            r7.f107701d = r3     // Catch:{ Exception -> 0x00f4 }
            com.tencent.mm.autogen.events.PreSendImgDataEvent$a r3 = r6.f107697d     // Catch:{ Exception -> 0x00f4 }
            int r4 = r4.getHeight()     // Catch:{ Exception -> 0x00f4 }
            r3.f107702e = r4     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00f6
        L_0x00f4:
        L_0x00f5:
            r6 = 0
        L_0x00f6:
            if (r6 != 0) goto L_0x00ff
            java.lang.String r3 = "generate thumb img fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x00ff:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "uploadImage, thumbPath:"
            r3.append(r4)
            if (r6 == 0) goto L_0x0112
            com.tencent.mm.autogen.events.PreSendImgDataEvent$a r4 = r6.f107697d
            if (r4 == 0) goto L_0x0112
            java.lang.String r4 = r4.f107700c
            goto L_0x0113
        L_0x0112:
            r4 = 0
        L_0x0113:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            if (r6 == 0) goto L_0x0126
            com.tencent.mm.autogen.events.PreSendImgDataEvent$a r3 = r6.f107697d
            if (r3 == 0) goto L_0x0126
            java.lang.String r12 = r3.f107700c
            goto L_0x0127
        L_0x0126:
            r12 = 0
        L_0x0127:
            r14.field_thumbpath = r12
            r14.field_needStorage = r11
            r14.field_needCompressImage = r11
            r14.field_isStreamMedia = r11
            r14.field_force_aeskeycdn = r10
            r14.field_trysafecdn = r10
            r3 = 2
            r14.field_fileType = r3
            r4 = 215(0xd7, float:3.01E-43)
            r14.field_appType = r4
            r14.field_priority = r3
            java.lang.Class<qo.l> r3 = p663qo.C101213l.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            qo.l r3 = (p663qo.C101213l) r3
            r3.if0(r14)
            if (r6 == 0) goto L_0x0150
            com.tencent.mm.autogen.events.PreSendImgDataEvent$a r3 = r6.f107697d
            r3.f107698a = r13
            r6.publish()
        L_0x0150:
            yw1.c$e r12 = new yw1.c$e
            yw1.c$f r3 = yw1.C53591c.C53597f.LOADING
            if (r6 == 0) goto L_0x015d
            com.tencent.mm.autogen.events.PreSendImgDataEvent$a r4 = r6.f107697d
            if (r4 == 0) goto L_0x015d
            int r4 = r4.f107701d
            goto L_0x015e
        L_0x015d:
            r4 = 0
        L_0x015e:
            if (r6 == 0) goto L_0x0166
            com.tencent.mm.autogen.events.PreSendImgDataEvent$a r5 = r6.f107697d
            if (r5 == 0) goto L_0x0166
            int r11 = r5.f107702e
        L_0x0166:
            r12.<init>(r3, r13, r4, r11)
        L_0x0169:
            if (r12 == 0) goto L_0x000a
            java.util.Map<java.lang.String, yw1.c$e> r3 = kx1.C46793e.f125915a
            java.lang.String r4 = r12.f150621a
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r4, r12)
            goto L_0x000a
        L_0x0176:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kx1.e$$a.run():void");
    }
}
