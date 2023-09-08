package com.tencent.p014mm.plugin.exdevice.model;

/* renamed from: com.tencent.mm.plugin.exdevice.model.e */
public final class C93363e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C93356d f269419d;

    /* renamed from: e */
    public final /* synthetic */ C93366l1 f269420e;

    public C93363e(C93356d dVar, C93366l1 l1Var) {
        this.f269419d = dVar;
        this.f269420e = l1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0693  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            com.tencent.mm.plugin.exdevice.model.d r1 = r0.f269419d
            int r2 = r1.f269404e
            java.lang.String r3 = "send_data_failed"
            java.lang.String r4 = "deviceInfo.deviceID"
            java.lang.String r5 = "ExDeviceSendIotLogic"
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 == r8) goto L_0x0038
            if (r2 == r7) goto L_0x0023
            if (r2 == r6) goto L_0x001a
            goto L_0x06ed
        L_0x001a:
            com.tencent.mm.plugin.exdevice.model.l1 r1 = r0.f269420e
            java.lang.String r1 = r1.f269424d
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r1, r3)
            goto L_0x06ed
        L_0x0023:
            te3.ct2 r2 = r1.f269406g
            com.tencent.mm.plugin.exdevice.model.l1 r3 = r0.f269420e
            if (r2 == 0) goto L_0x0030
            ob0.n r4 = r1.f269411l
            r1.mo128147a(r2, r3, r4)
            goto L_0x06ed
        L_0x0030:
            java.lang.String r1 = "no cdn msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x06ed
        L_0x0038:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r1 = r1.f269405f
            com.tencent.mm.plugin.exdevice.model.l1 r2 = r0.f269420e
            java.lang.String r2 = r2.f269424d
            gy3.C87412m.m108593f(r2, r4)
            com.tencent.mm.plugin.exdevice.model.l1 r3 = r0.f269420e
            r1.put(r2, r3)
            goto L_0x06ed
        L_0x0048:
            com.tencent.mm.plugin.exdevice.model.l1 r2 = r0.f269420e
            r1.getClass()
            java.lang.String r9 = "deviceInfo"
            gy3.C87412m.m108594g(r2, r9)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            int r10 = r1.f269404e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 0
            r9[r11] = r10
            java.lang.String r10 = "upload state %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            int r9 = r1.f269404e
            if (r9 != 0) goto L_0x06ed
            r1.f269404e = r8
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r9 = r1.f269405f
            java.lang.String r10 = r2.f269424d
            gy3.C87412m.m108593f(r10, r4)
            r9.put(r10, r2)
            java.lang.Class<rz.s> r2 = p682rz.C101488s.class
            java.lang.Class<gt.k> r4 = p158gt.C98201k.class
            java.lang.Class<qo.l> r9 = p663qo.C101213l.class
            java.lang.String r10 = "doFileUpload."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            r10 = 0
            r1.f269402c = r10
            java.lang.Class<f62.k0> r12 = f62.C75700k0.class
            k40.a r12 = f40.C86709a0.m107533q(r12)
            f62.k0 r12 = (f62.C75700k0) r12
            g62.l r12 = r12.mo96095LE()
            long r13 = r1.f269400a
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
            com.tencent.mm.storage.f4 r12 = r12.b00(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "ExDeviceSendIotLogic type: "
            r13.append(r14)
            int r14 = r12.getType()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            java.lang.Boolean r13 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117890g(r12)
            java.lang.String r14 = "isImg(msgInfo)"
            gy3.C87412m.m108593f(r13, r14)
            boolean r13 = r13.booleanValue()
            java.lang.String r14 = " not exist."
            java.lang.String r15 = "cdntra genClientId failed not use cdn"
            java.lang.String r6 = ""
            r10 = 32
            if (r13 == 0) goto L_0x02b6
            di3.d r2 = di3.C86312j.m106911c(r4)
            gt.k r2 = (p158gt.C98201k) r2
            gt.m r2 = r2.mo137277xi()
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
            com.tencent.mm.modelimage.k r2 = r2.mo127198uP(r12)
            java.lang.String r13 = "getService(IImageFeature…orage().getByMsg(msgInfo)"
            gy3.C87412m.m108593f(r2, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r7)
            r1.f269403d = r13
            di3.d r13 = di3.C86312j.m106911c(r4)
            gt.k r13 = (p158gt.C98201k) r13
            gt.m r13 = r13.mo137277xi()
            java.lang.String r11 = r2.f267378e
            com.tencent.mm.modelimage.m r13 = (com.tencent.p014mm.modelimage.C92839m) r13
            java.lang.String r11 = r13.mo127174TY(r11, r6, r6, r8)
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1
            r13.<init>((java.lang.String) r11)
            java.lang.String r13 = r13.mo119971i()
            java.lang.String r7 = "VFSFile(fullpath).absolutePath"
            gy3.C87412m.m108593f(r13, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "fullpath: "
            r7.append(r8)
            r7.append(r11)
            r7.append(r10)
            java.lang.String r8 = r2.f267378e
            r7.append(r8)
            r7.append(r10)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            boolean r7 = r2.mo127145p()
            if (r7 == 0) goto L_0x019b
            java.lang.Class<gt.l> r7 = p158gt.C76053l.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt.l r7 = (p158gt.C76053l) r7
            com.tencent.mm.modelimage.k r7 = r7.mo106261jD(r2)
            if (r7 == 0) goto L_0x019b
            di3.d r8 = di3.C86312j.m106911c(r4)
            gt.k r8 = (p158gt.C98201k) r8
            gt.m r8 = r8.mo137277xi()
            java.lang.String r13 = r7.f267378e
            com.tencent.mm.modelimage.m r8 = (com.tencent.p014mm.modelimage.C92839m) r8
            r10 = 1
            java.lang.String r8 = r8.mo127174TY(r13, r6, r6, r10)
            boolean r7 = r7.mo127146q()
            if (r7 == 0) goto L_0x019b
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r7 != 0) goto L_0x019b
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)
            java.lang.String r10 = r7.getPath()
            if (r10 == 0) goto L_0x017a
            r13 = 0
            java.lang.String r10 = com.tencent.p014mm.vfs.C116299g2.m163855k(r10, r13, r13)
            java.lang.String r13 = r7.getPath()
            boolean r13 = r13.equals(r10)
            if (r13 != 0) goto L_0x017a
            android.net.Uri$Builder r7 = r7.buildUpon()
            android.net.Uri$Builder r7 = r7.path(r10)
            android.net.Uri r7 = r7.build()
        L_0x017a:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r7 = r10.mo177799l(r7, r13)
            boolean r10 = r7.mo177810a()
            if (r10 != 0) goto L_0x0189
            r7 = 0
            goto L_0x0191
        L_0x0189:
            com.tencent.mm.vfs.FileSystem$c r10 = r7.f348991a
            java.lang.String r7 = r7.f348992b
            boolean r7 = r10.mo119948x(r7)
        L_0x0191:
            if (r7 == 0) goto L_0x019b
            r7 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r1.f269403d = r10
            r11 = r8
        L_0x019b:
            di3.d r4 = di3.C86312j.m106911c(r4)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            java.lang.String r7 = r2.f267380g
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            r8 = 1
            java.lang.String r4 = r4.mo127174TY(r7, r6, r6, r8)
            long r7 = r2.f267374a
            android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r13 = r10.getPath()
            if (r13 == 0) goto L_0x01d5
            r0 = 0
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r0, r0)
            java.lang.String r0 = r10.getPath()
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x01d5
            android.net.Uri$Builder r0 = r10.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r13)
            android.net.Uri r10 = r0.build()
        L_0x01d5:
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r13 = 0
            com.tencent.mm.vfs.f0$h r0 = r0.mo177799l(r10, r13)
            boolean r10 = r0.mo177810a()
            if (r10 != 0) goto L_0x01e4
            r0 = 0
            goto L_0x01ec
        L_0x01e4:
            com.tencent.mm.vfs.FileSystem$c r10 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            boolean r0 = r10.mo119948x(r0)
        L_0x01ec:
            if (r0 != 0) goto L_0x0204
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r17 = r3
            goto L_0x0483
        L_0x0204:
            long r13 = com.tencent.p014mm.vfs.C86013q1.m106451l(r11)
            int r0 = r1.f269401b
            r10 = r3
            r16 = r4
            long r3 = (long) r0
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0216
            r17 = r10
            goto L_0x04cc
        L_0x0216:
            di3.d r0 = di3.C86312j.m106911c(r9)
            qo.l r0 = (p663qo.C101213l) r0
            r3 = 1
            boolean r0 = r0.dm0(r3)
            if (r0 != 0) goto L_0x024c
            java.lang.String r0 = r2.f267393t
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x024c
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            di3.d r4 = di3.C86312j.m106911c(r9)
            qo.l r4 = (p663qo.C101213l) r4
            boolean r4 = r4.dm0(r3)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r6 = 0
            r0[r6] = r4
            java.lang.String r2 = r2.f267393t
            r0[r3] = r2
            java.lang.String r2 = "cdntra not use cdn flag:%b getCdnInfo:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r2, r0)
            r17 = r10
            goto L_0x0680
        L_0x024c:
            long r3 = r12.getCreateTime()
            java.lang.String r0 = r12.mo108768t()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r6)
            r18 = r9
            r17 = r10
            long r9 = r12.getMsgId()
            r13.append(r9)
            r9 = 95
            r13.append(r9)
            r13.append(r7)
            java.lang.String r7 = r13.toString()
            java.lang.String r8 = "upimg"
            java.lang.String r0 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r8, r3, r0, r7)
            r1.f269402c = r0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0287
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r15)
            goto L_0x0680
        L_0x0287:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "cdntra checkUseCdn id:"
            r0.append(r3)
            long r2 = r2.f267375b
            r0.append(r2)
            java.lang.String r2 = " file["
            r0.append(r2)
            r0.append(r11)
            java.lang.String r2 = "] thumb["
            r0.append(r2)
            r2 = r16
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            goto L_0x0514
        L_0x02b6:
            r17 = r3
            r18 = r9
            java.lang.Boolean r0 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117889f(r12)
            java.lang.String r3 = "isFile(msgInfo)"
            gy3.C87412m.m108593f(r0, r3)
            boolean r0 = r0.booleanValue()
            r3 = 5
            r4 = 4
            if (r0 == 0) goto L_0x0407
            java.lang.String r0 = r12.getContent()
            r7 = 0
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r7)
            java.lang.String r8 = "parse(msgInfo.content)"
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r8 = r12.getContent()
            java.lang.String r9 = "msgInfo.content"
            gy3.C87412m.m108593f(r8, r9)
            com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r7)
            java.lang.String r7 = "parse(msgContent)"
            gy3.C87412m.m108593f(r8, r7)
            java.lang.Class<ym.s> r7 = p763ym.C53543s.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ym.s r7 = (p763ym.C53543s) r7
            ym.i r7 = r7.mo74024KZ()
            java.lang.String r8 = r8.f195606o
            com.tencent.mm.pluginsdk.model.app.e r7 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r7
            com.tencent.mm.pluginsdk.model.app.d r7 = r7.mo100154qq(r8)
            int r8 = r0.f195626t
            if (r8 != 0) goto L_0x0313
            int r0 = r0.f195594l
            r8 = 26214400(0x1900000, float:5.2897246E-38)
            if (r0 <= r8) goto L_0x030e
            goto L_0x0313
        L_0x030e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L_0x0319
        L_0x0313:
            r0 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = r3
        L_0x0319:
            r1.f269403d = r0
            if (r7 == 0) goto L_0x0400
            java.lang.String r0 = r7.field_fileFullPath
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r8 = r3.getPath()
            if (r8 == 0) goto L_0x0344
            r9 = 0
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r9, r9)
            java.lang.String r9 = r3.getPath()
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x0344
            android.net.Uri$Builder r3 = r3.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r8)
            android.net.Uri r3 = r3.build()
        L_0x0344:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r9 = 0
            com.tencent.mm.vfs.f0$h r3 = r8.mo177799l(r3, r9)
            boolean r8 = r3.mo177810a()
            if (r8 != 0) goto L_0x0353
            r3 = 0
            goto L_0x035b
        L_0x0353:
            com.tencent.mm.vfs.FileSystem$c r8 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            boolean r3 = r8.mo119948x(r3)
        L_0x035b:
            if (r3 != 0) goto L_0x0376
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file "
            r2.append(r3)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0483
        L_0x0376:
            di3.d r3 = di3.C86312j.m106911c(r18)
            qo.l r3 = (p663qo.C101213l) r3
            boolean r3 = r3.dm0(r4)
            if (r3 != 0) goto L_0x03aa
            int r3 = r7.field_isUseCdn
            r8 = 1
            if (r3 == r8) goto L_0x03aa
            r3 = 2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            di3.d r2 = di3.C86312j.m106911c(r18)
            qo.l r2 = (p663qo.C101213l) r2
            boolean r2 = r2.dm0(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            int r2 = r7.field_isUseCdn
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r8] = r2
            java.lang.String r2 = "cdntra not use cdn flag:%b getCdnInfo:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r2, r0)
            goto L_0x0680
        L_0x03aa:
            java.lang.String r3 = r7.field_fileFullPath
            long r3 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)
            int r8 = r1.f269401b
            long r8 = (long) r8
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x03b9
            goto L_0x04cc
        L_0x03b9:
            long r8 = r12.getCreateTime()
            java.lang.String r10 = r12.mo108768t()
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.s r2 = (p682rz.C101488s) r2
            java.lang.String r11 = r12.mo101010p2()
            java.lang.String r2 = r2.yr0(r11)
            java.lang.String r11 = "upfile"
            java.lang.String r2 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r11, r8, r10, r2)
            r1.f269402c = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x03e3
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r15)
            goto L_0x0680
        L_0x03e3:
            r2 = 3
            java.lang.Object[] r8 = new java.lang.Object[r2]
            long r9 = r7.field_msgInfoId
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r7 = 0
            r8[r7] = r2
            r2 = 1
            r8[r2] = r0
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
            r3 = 2
            r8[r3] = r2
            java.lang.String r2 = "cdntra checkUseCdn id:%d file[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r8)
            goto L_0x0511
        L_0x0400:
            java.lang.String r0 = "getFilePath attInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            goto L_0x0680
        L_0x0407:
            java.lang.Boolean r0 = com.tencent.p014mm.plugin.exdevice.model.C93365i.m117892i(r12)
            java.lang.String r7 = "isVideo(msgInfo)"
            gy3.C87412m.m108593f(r0, r7)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0513
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.f269403d = r0
            di3.d r0 = di3.C86312j.m106911c(r2)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            java.lang.String r7 = r12.mo108765s2()
            hd0.o0 r0 = (hd0.C98410o0) r0
            java.lang.String r0 = r0.mo137728q(r7)
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.s r2 = (p682rz.C101488s) r2
            rz.t r2 = r2.Kj0()
            java.lang.String r7 = r12.mo108765s2()
            hd0.o0 r2 = (hd0.C98410o0) r2
            java.lang.String r2 = r2.mo137729r(r7)
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r8 = r7.getPath()
            if (r8 == 0) goto L_0x046a
            r9 = 0
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r9, r9)
            java.lang.String r9 = r7.getPath()
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x046a
            android.net.Uri$Builder r7 = r7.buildUpon()
            android.net.Uri$Builder r7 = r7.path(r8)
            android.net.Uri r7 = r7.build()
        L_0x046a:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r9 = 0
            com.tencent.mm.vfs.f0$h r7 = r8.mo177799l(r7, r9)
            boolean r8 = r7.mo177810a()
            if (r8 != 0) goto L_0x0479
            r7 = 0
            goto L_0x0481
        L_0x0479:
            com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a
            java.lang.String r7 = r7.f348992b
            boolean r7 = r8.mo119948x(r7)
        L_0x0481:
            if (r7 != 0) goto L_0x0486
        L_0x0483:
            r11 = -1
            goto L_0x0691
        L_0x0486:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = " fullpath "
            r7.append(r8)
            r7.append(r0)
            java.lang.String r8 = " thumbPath "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r7)
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            r11 = 5242880(0x500000, float:7.34684E-39)
            long r13 = (long) r11
            int r11 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r11 < 0) goto L_0x04c5
            r11 = 2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r3 = 0
            r0[r3] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r3 = 1
            r0[r3] = r2
            java.lang.String r2 = "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r2, r0)
            goto L_0x0680
        L_0x04c5:
            int r11 = r1.f269401b
            long r13 = (long) r11
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x04cf
        L_0x04cc:
            r11 = -3
            goto L_0x0691
        L_0x04cf:
            long r13 = r12.getCreateTime()
            java.lang.String r11 = r12.mo108768t()
            java.lang.String r4 = "upvideo"
            java.lang.String r4 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r13, r11, r6)
            r1.f269402c = r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x04eb
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r15)
            goto L_0x0680
        L_0x04eb:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r13 = r12.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r11 = 0
            r3[r11] = r4
            r4 = 1
            r3[r4] = r0
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r9 = 2
            r3[r9] = r4
            r4 = 3
            r3[r4] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r4 = 4
            r3[r4] = r2
            java.lang.String r2 = "cdntra checkUseCdn id:%d file[%s][%d] thumb[%s][%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r3)
        L_0x0511:
            r11 = r0
            goto L_0x0514
        L_0x0513:
            r11 = r6
        L_0x0514:
            java.lang.String r0 = r1.f269402c
            if (r0 != 0) goto L_0x0520
            java.lang.String r0 = "not support file Type"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            goto L_0x0680
        L_0x0520:
            java.lang.String r0 = "MicroMsg.exdevice.CryptoUtils"
            java.io.InputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106423E(r11)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r3 = "openRead(filePath)"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ FileNotFoundException -> 0x05f9 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x05f9 }
            int r4 = r2.read()     // Catch:{ FileNotFoundException -> 0x05f9 }
        L_0x0535:
            r7 = -1
            if (r4 == r7) goto L_0x0540
            r3.write(r4)     // Catch:{ FileNotFoundException -> 0x05f9 }
            int r4 = r2.read()     // Catch:{ FileNotFoundException -> 0x05f9 }
            goto L_0x0535
        L_0x0540:
            byte[] r2 = r3.toByteArray()     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r3 = "byteArrayOutputStream.toByteArray()"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            r3 = 12
            byte[] r3 = com.tencent.p014mm.jni.utils.UtilsJni.cryptGenRandom(r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            d81.C97445b.f286024b = r3     // Catch:{ FileNotFoundException -> 0x05f9 }
            r3 = 32
            byte[] r3 = com.tencent.p014mm.jni.utils.UtilsJni.cryptGenRandom(r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            d81.C97445b.f286023a = r3     // Catch:{ FileNotFoundException -> 0x05f9 }
            byte[] r4 = d81.C97445b.f286024b     // Catch:{ FileNotFoundException -> 0x05f9 }
            r7 = 0
            byte[][] r2 = com.tencent.p014mm.jni.utils.UtilsJni.AesGcmEncryptWithNonce(r3, r4, r7, r2)     // Catch:{ FileNotFoundException -> 0x05f9 }
            r3 = 1
            r4 = r2[r3]     // Catch:{ FileNotFoundException -> 0x05f9 }
            d81.C97445b.f286025c = r4     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106458s(r11)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x05f9 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x05f9 }
            r4.append(r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r3 = "/enc_"
            r4.append(r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            android.net.Uri r3 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r7 = r3.getPath()     // Catch:{ FileNotFoundException -> 0x05f9 }
            if (r7 == 0) goto L_0x059b
            r8 = 0
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r8, r8)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r8 = r3.getPath()     // Catch:{ FileNotFoundException -> 0x05f9 }
            boolean r8 = r8.equals(r7)     // Catch:{ FileNotFoundException -> 0x05f9 }
            if (r8 != 0) goto L_0x059b
            android.net.Uri$Builder r3 = r3.buildUpon()     // Catch:{ FileNotFoundException -> 0x05f9 }
            android.net.Uri$Builder r3 = r3.path(r7)     // Catch:{ FileNotFoundException -> 0x05f9 }
            android.net.Uri r3 = r3.build()     // Catch:{ FileNotFoundException -> 0x05f9 }
        L_0x059b:
            java.lang.String r3 = r3.getPath()     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r7 = "/"
            int r7 = r3.lastIndexOf(r7)     // Catch:{ FileNotFoundException -> 0x05f9 }
            if (r7 >= 0) goto L_0x05a8
            goto L_0x05ae
        L_0x05a8:
            r8 = 1
            int r7 = r7 + r8
            java.lang.String r3 = r3.substring(r7)     // Catch:{ FileNotFoundException -> 0x05f9 }
        L_0x05ae:
            r4.append(r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r3 = r4.toString()     // Catch:{ FileNotFoundException -> 0x05f9 }
            r4 = 0
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106429K(r3, r4)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r4 = "openWrite(encryptFile)"
            gy3.C87412m.m108593f(r7, r4)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x05f9 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r8 = "encryptFile: "
            r4.append(r8)     // Catch:{ FileNotFoundException -> 0x05f9 }
            r4.append(r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x05f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)     // Catch:{ FileNotFoundException -> 0x05f9 }
            r4 = 0
            r2 = r2[r4]     // Catch:{ FileNotFoundException -> 0x05f9 }
            r7.write(r2)     // Catch:{ FileNotFoundException -> 0x05f9 }
            r7.flush()     // Catch:{ FileNotFoundException -> 0x05f9 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x05f9 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r4 = "encrypt end, file len: "
            r2.append(r4)     // Catch:{ FileNotFoundException -> 0x05f9 }
            long r7 = com.tencent.p014mm.vfs.C86013q1.m106451l(r3)     // Catch:{ FileNotFoundException -> 0x05f9 }
            r2.append(r7)     // Catch:{ FileNotFoundException -> 0x05f9 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x05f9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r2)     // Catch:{ FileNotFoundException -> 0x05f9 }
            goto L_0x05fb
        L_0x05f9:
            r3 = r6
        L_0x05fb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "encryptFilePath: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ", encryptThumbFilePath: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r0)
            gi.g r0 = new gi.g
            r0.<init>()
            java.lang.String r2 = "task_ExdeviceSendDataToNetworkDevice"
            r0.f287660d = r2
            gi.g$a r2 = r1.f269412m
            r0.f287662f = r2
            java.lang.String r2 = r1.f269402c
            r0.field_mediaId = r2
            r0.field_fullpath = r3
            r0.field_thumbpath = r6
            byte[] r2 = d81.C97445b.f286023a
            r0.field_aes_enc_key = r2
            byte[] r2 = d81.C97445b.f286024b
            r0.field_aes_nounce = r2
            byte[] r2 = d81.C97445b.f286025c
            r0.field_aes_tag = r2
            r2 = 0
            r0.field_aes_aad = r2
            r2 = 20303(0x4f4f, float:2.845E-41)
            r0.field_fileType = r2
            java.lang.String r2 = r12.mo108768t()
            r0.field_talker = r2
            r2 = 1
            r0.field_priority = r2
            r2 = 0
            r0.field_needStorage = r2
            r0.field_isStreamMedia = r2
            r2 = 202(0xca, float:2.83E-43)
            r0.field_appType = r2
            r2 = 2
            r0.field_bzScene = r2
            boolean r2 = com.tencent.p014mm.modelcdntran.C1297x.m1388c()
            if (r2 == 0) goto L_0x0662
            int r2 = r0.field_fileType
            r3 = 7
            if (r2 != r3) goto L_0x0662
            r2 = 1
            goto L_0x0663
        L_0x0662:
            r2 = 0
        L_0x0663:
            r0.field_use_multithread = r2
            di3.d r2 = di3.C86312j.m106911c(r18)
            qo.l r2 = (p663qo.C101213l) r2
            boolean r2 = r2.if0(r0)
            if (r2 != 0) goto L_0x0682
            r2 = 1
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r2 = r1.f269402c
            r3 = 0
            r0[r3] = r2
            java.lang.String r2 = "cdntra addSendTask failed. clientid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r2, r0)
            r1.f269402c = r6
        L_0x0680:
            r11 = -2
            goto L_0x0691
        L_0x0682:
            r3 = 0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, gi.g> r2 = r1.f269409j
            java.lang.String r4 = r1.f269402c
            gy3.C87412m.m108591d(r4)
            r2.put(r4, r0)
            r0 = 1
            r1.f269407h = r0
            r11 = 0
        L_0x0691:
            if (r11 == 0) goto L_0x06ed
            r0 = 3
            r1.f269404e = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r0 = r1.f269405f
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x06a0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x06e8
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "send cdn failed "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " ret "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            r3 = -3
            if (r11 == r3) goto L_0x06de
            r4 = -1
            if (r11 == r4) goto L_0x06d5
            r6 = r17
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r2, r6)
            goto L_0x06a0
        L_0x06d5:
            r6 = r17
            java.lang.String r7 = "send_data_outdate"
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r2, r7)
            goto L_0x06a0
        L_0x06de:
            r6 = r17
            r4 = -1
            java.lang.String r7 = "send_data_too_large"
            com.tencent.p014mm.plugin.exdevice.model.C93365i.m117894k(r2, r7)
            goto L_0x06a0
        L_0x06e8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.exdevice.model.l1> r0 = r1.f269405f
            r0.clear()
        L_0x06ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93363e.run():void");
    }
}
