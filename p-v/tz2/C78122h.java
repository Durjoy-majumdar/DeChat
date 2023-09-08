package tz2;

import uz2.C78317u1;

/* renamed from: tz2.h */
public final class C78122h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C78317u1 f228931d;

    public C78122h(C78317u1 u1Var) {
        this.f228931d = u1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00fb, code lost:
        if ((r1 == null || z04.C112551y.m153811k(r1)) == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018b, code lost:
        if ((r2 == null || z04.C112551y.m153811k(r2)) == false) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "commit postInfo:"
            r1.append(r2)
            uz2.u1 r2 = r0.f228931d
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "TextStatusPostInfo[useDefaultBackground:"
            r4.append(r5)
            boolean r5 = r2.f229450f
            r4.append(r5)
            java.lang.String r5 = ",uploadFilePath:"
            r4.append(r5)
            java.lang.String r5 = r2.f229451g
            r4.append(r5)
            java.lang.String r5 = ",thumbPath:"
            r4.append(r5)
            java.lang.String r5 = r2.f229452h
            r4.append(r5)
            java.lang.String r5 = ",excludeUserNames:"
            r4.append(r5)
            java.util.LinkedList<java.lang.String> r5 = r2.f229449e
            r4.append(r5)
            java.lang.String r5 = ",textStatusExtInfo:["
            r4.append(r5)
            uz2.u r5 = r2.f229448d
            java.lang.String r6 = "textStatusExtInfo"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r5 = b03.C67129e.m79387b(r5)
            r4.append(r5)
            java.lang.String r5 = " mod_status_option:"
            r4.append(r5)
            long r5 = r2.f229461t
            r4.append(r5)
            java.lang.String r2 = "]]"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.TextStatus.UploadPackHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            uz2.u1 r1 = r0.f228931d
            long r1 = r1.f229455n
            r4 = 0
            r5 = 1
            r6 = 0
            java.lang.String r8 = "username()"
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x010d
            az2.e r10 = az2.C39674e.f106452d
            java.lang.String r11 = su0.C13781a.m13082a()
            gy3.C87412m.m108593f(r11, r8)
            uz2.u1 r1 = r0.f228931d
            java.lang.String r12 = r1.f229459r
            java.lang.String r1 = "postInfo.text_status_id"
            gy3.C87412m.m108593f(r12, r1)
            uz2.u1 r1 = r0.f228931d
            uz2.u r13 = r1.f229448d
            java.lang.String r1 = "postInfo.textStatusExtInfo"
            gy3.C87412m.m108593f(r13, r1)
            r14 = 3
            uz2.u1 r1 = r0.f228931d
            java.lang.String r15 = r1.f229460s
            r16 = 0
            r18 = 32
            r19 = 0
            long r1 = az2.C39674e.m42303X0(r10, r11, r12, r13, r14, r15, r16, r18, r19)
            uz2.u1 r6 = r0.f228931d
            long r6 = r6.f229461t
            r9 = 1
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x00d0
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity$b r6 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.f206867L1
            rx3.g<com.tencent.mm.sdk.platformtools.MultiProcessMMKV> r6 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.f206868M1
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.String r7 = "<get-mmkvLastStatusRowId>(...)"
            gy3.C87412m.m108593f(r6, r7)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r6 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r6
            java.lang.String r7 = com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity.f206869N1
            java.lang.String r9 = java.lang.String.valueOf(r1)
            r6.putString(r7, r9)
        L_0x00d0:
            uz2.u1 r6 = r0.f228931d
            r6.f229455n = r1
            boolean r1 = r6.f229450f
            if (r1 == 0) goto L_0x00d9
            goto L_0x00fd
        L_0x00d9:
            uz2.u r1 = r6.f229448d
            java.lang.String r1 = r1.f147241j
            if (r1 == 0) goto L_0x00e8
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x00e6
            goto L_0x00e8
        L_0x00e6:
            r1 = 0
            goto L_0x00e9
        L_0x00e8:
            r1 = 1
        L_0x00e9:
            if (r1 != 0) goto L_0x00ff
            uz2.u r1 = r6.f229448d
            java.lang.String r1 = r1.f147239h
            if (r1 == 0) goto L_0x00fa
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r1 = 0
            goto L_0x00fb
        L_0x00fa:
            r1 = 1
        L_0x00fb:
            if (r1 != 0) goto L_0x00ff
        L_0x00fd:
            r1 = 1
            goto L_0x0100
        L_0x00ff:
            r1 = 0
        L_0x0100:
            if (r1 == 0) goto L_0x0106
            uz2.u1 r1 = r0.f228931d
            r1.f229456o = r5
        L_0x0106:
            tz2.g r1 = tz2.C78120g.f228929a
            uz2.u1 r2 = r0.f228931d
            r1.mo108103c(r2)
        L_0x010d:
            b03.f r1 = b03.C39696f.f106501a
            java.lang.String r2 = su0.C13781a.m13082a()
            gy3.C87412m.m108593f(r2, r8)
            java.lang.String r6 = "thumb"
            java.lang.String r2 = r1.mo62321d(r6, r2)
            java.lang.String r6 = su0.C13781a.m13082a()
            gy3.C87412m.m108593f(r6, r8)
            java.lang.String r7 = "image"
            java.lang.String r6 = r1.mo62321d(r7, r6)
            java.lang.String r7 = su0.C13781a.m13082a()
            gy3.C87412m.m108593f(r7, r8)
            java.lang.String r1 = r1.mo62320c(r7)
            uz2.u1 r7 = r0.f228931d
            java.lang.String r7 = r7.f229452h
            boolean r7 = android.text.TextUtils.equals(r7, r2)
            if (r7 != 0) goto L_0x0142
            com.tencent.p014mm.vfs.C86013q1.m106447h(r2)
        L_0x0142:
            uz2.u1 r2 = r0.f228931d
            java.lang.String r2 = r2.f229451g
            boolean r2 = android.text.TextUtils.equals(r2, r6)
            if (r2 != 0) goto L_0x014f
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
        L_0x014f:
            uz2.u1 r2 = r0.f228931d
            java.lang.String r2 = r2.f229451g
            boolean r2 = android.text.TextUtils.equals(r2, r1)
            if (r2 != 0) goto L_0x015c
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
        L_0x015c:
            tz2.i r1 = tz2.C78123i.f228932a
            uz2.u1 r2 = r0.f228931d
            gy3.C87412m.m108594g(r2, r3)
            boolean r3 = r2.f229450f
            if (r3 == 0) goto L_0x0169
        L_0x0167:
            r2 = 1
            goto L_0x018f
        L_0x0169:
            uz2.u r3 = r2.f229448d
            java.lang.String r3 = r3.f147241j
            if (r3 == 0) goto L_0x0178
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            r3 = 0
            goto L_0x0179
        L_0x0178:
            r3 = 1
        L_0x0179:
            if (r3 != 0) goto L_0x018e
            uz2.u r2 = r2.f229448d
            java.lang.String r2 = r2.f147239h
            if (r2 == 0) goto L_0x018a
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0188
            goto L_0x018a
        L_0x0188:
            r2 = 0
            goto L_0x018b
        L_0x018a:
            r2 = 1
        L_0x018b:
            if (r2 != 0) goto L_0x018e
            goto L_0x0167
        L_0x018e:
            r2 = 0
        L_0x018f:
            if (r2 == 0) goto L_0x01ab
            uz2.u1 r2 = r0.f228931d
            boolean r3 = r2.f229450f
            if (r3 != 0) goto L_0x019a
            tz2.C78123i.m94326a(r1, r2)
        L_0x019a:
            tz2.b r1 = new tz2.b
            uz2.u1 r2 = r0.f228931d
            r1.<init>(r2)
            tz2.a r2 = new tz2.a
            r2.<init>(r1)
            o40.C61926c.m72668M(r2)
            goto L_0x0273
        L_0x01ab:
            uz2.u1 r2 = r0.f228931d
            tz2.C78123i.m94326a(r1, r2)
            tz2.k r1 = new tz2.k
            uz2.u1 r2 = r0.f228931d
            r1.<init>(r2)
            long r2 = java.lang.System.currentTimeMillis()
            tz2.j r6 = new tz2.j
            r6.<init>(r2, r1)
            uz2.u1 r1 = r1.f228935a
            uz2.u r2 = r1.f229448d
            if (r2 == 0) goto L_0x01c9
            int r2 = r2.f147237f
            goto L_0x01ca
        L_0x01c9:
            r2 = 1
        L_0x01ca:
            java.lang.String r3 = r1.f229451g
            java.lang.String r1 = r1.f229452h
            java.lang.Class<qo.l> r7 = p663qo.C101213l.class
            if (r3 == 0) goto L_0x01db
            boolean r8 = z04.C112551y.m153811k(r3)
            if (r8 == 0) goto L_0x01d9
            goto L_0x01db
        L_0x01d9:
            r8 = 0
            goto L_0x01dc
        L_0x01db:
            r8 = 1
        L_0x01dc:
            if (r8 != 0) goto L_0x0273
            if (r1 == 0) goto L_0x01e6
            boolean r8 = z04.C112551y.m153811k(r1)
            if (r8 == 0) goto L_0x01e7
        L_0x01e6:
            r4 = 1
        L_0x01e7:
            if (r4 == 0) goto L_0x01eb
            goto L_0x0273
        L_0x01eb:
            tz2.d r4 = new tz2.d
            r4.<init>(r6)
            r6 = 256(0x100, float:3.59E-43)
            java.lang.String r8 = ""
            java.lang.String r9 = "MicroMsg.TextStatus.TextStatusUploader"
            r10 = 2
            if (r2 != r10) goto L_0x0238
            java.lang.String r2 = "isVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r2)
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r9 = "task_TextStatusUploader_1"
            r2.f287660d = r9
            r2.f287662f = r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r2.field_mediaId = r4
            r2.field_fullpath = r3
            r2.field_thumbpath = r1
            r2.field_talker = r8
            r2.field_needStorage = r5
            r1 = 20302(0x4f4e, float:2.8449E-41)
            r2.field_fileType = r1
            r2.field_appType = r6
            r1 = 8
            r2.f287655L = r1
            r2.field_bzScene = r10
            r1 = 600(0x258, float:8.41E-43)
            r2.f287673t = r1
            r1 = 1200(0x4b0, float:1.682E-42)
            r2.f287674u = r1
            r2.field_priority = r10
            di3.d r1 = di3.C86312j.m106911c(r7)
            qo.l r1 = (p663qo.C101213l) r1
            r1.if0(r2)
            goto L_0x0273
        L_0x0238:
            java.lang.String r2 = "uploadImage"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r2)
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r9 = "task_TextStatusUploader_2"
            r2.f287660d = r9
            r2.f287662f = r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r2.field_mediaId = r4
            r2.field_fullpath = r3
            r2.field_thumbpath = r1
            r2.field_talker = r8
            r2.field_needStorage = r5
            r1 = 20304(0x4f50, float:2.8452E-41)
            r2.field_fileType = r1
            r2.field_appType = r6
            r2.field_bzScene = r10
            r1 = 60
            r2.f287673t = r1
            r1 = 300(0x12c, float:4.2E-43)
            r2.f287674u = r1
            r2.field_priority = r10
            di3.d r1 = di3.C86312j.m106911c(r7)
            qo.l r1 = (p663qo.C101213l) r1
            r1.if0(r2)
        L_0x0273:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tz2.C78122h.run():void");
    }
}
