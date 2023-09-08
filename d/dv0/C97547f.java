package dv0;

/* renamed from: dv0.f */
public class C97547f implements C75460n {
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03c9 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo105806a(java.lang.String r37, te3.C77926f9 r38, com.tencent.p014mm.storage.C72963f4 r39) {
        /*
            r36 = this;
            r0 = r38
            r1 = r39
            java.lang.String r2 = "MicroMsg.BackupItemImg"
            r3 = 0
            if (r0 == 0) goto L_0x043f
            te3.rv3 r4 = r0.f227337h
            if (r4 != 0) goto L_0x000f
            goto L_0x043f
        L_0x000f:
            java.lang.String r4 = r4.f141175d
            java.lang.String r5 = ""
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r5)
            r6 = 6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            long r7 = r0.f227348v
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6[r3] = r7
            r15 = 1
            r6[r15] = r4
            te3.qv3 r7 = r0.f227345s
            if (r7 != 0) goto L_0x002b
            r7 = 0
            goto L_0x002d
        L_0x002b:
            int r7 = r7.f140572d
        L_0x002d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14 = 2
            r6[r14] = r7
            int r7 = r0.f227347u
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13 = 3
            r6[r13] = r7
            java.util.LinkedList<te3.sv3> r7 = r0.f227344r
            if (r7 != 0) goto L_0x0043
            r7 = r5
            goto L_0x0047
        L_0x0043:
            java.lang.String r7 = r7.toString()
        L_0x0047:
            r12 = 4
            r6[r12] = r7
            r7 = 5
            java.util.LinkedList<te3.rv3> r8 = r0.f227343q
            if (r8 != 0) goto L_0x0051
            r8 = r5
            goto L_0x0055
        L_0x0051:
            java.lang.String r8 = r8.toString()
        L_0x0055:
            r6[r7] = r8
            java.lang.String r7 = "recover, msgId:%d, content:%s, backupItemImg buf:%d, BufferType:%d, MediaType%s, ids:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r7, r6)
            if (r4 == 0) goto L_0x0062
            r1.mo108732L2(r4)
        L_0x0062:
            hv0.e r6 = hv0.C98544e.m128035f()
            hv0.c r6 = r6.mo137901e()
            com.tencent.mm.modelimage.m r10 = r6.mo137896d()
            int r6 = r39.mo108769t2()
            r11 = 0
            r8 = 0
            if (r6 != r15) goto L_0x00a2
            long r6 = r39.getMsgId()
            int r16 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r16 == 0) goto L_0x008c
            java.lang.String r6 = r39.mo108768t()
            long r14 = r39.getMsgId()
            com.tencent.mm.modelimage.k r6 = r10.mo127200vP(r6, r14)
            goto L_0x008d
        L_0x008c:
            r6 = r11
        L_0x008d:
            if (r6 == 0) goto L_0x0095
            long r14 = r6.f267374a
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00ae
        L_0x0095:
            java.lang.String r6 = r39.mo108768t()
            long r14 = r39.mo108774y2()
            com.tencent.mm.modelimage.k r6 = r10.mo127168NQ(r6, r14)
            goto L_0x00ae
        L_0x00a2:
            java.lang.String r6 = r39.mo108768t()
            long r14 = r39.mo108774y2()
            com.tencent.mm.modelimage.k r6 = r10.mo127168NQ(r6, r14)
        L_0x00ae:
            java.lang.String r7 = "msg"
            java.util.Map r7 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r4, r7, r11)
            if (r7 == 0) goto L_0x00e9
            java.lang.String r14 = ".msg.img.$hdlength"
            java.lang.Object r7 = r7.get(r14)
            java.lang.String r7 = (java.lang.String) r7
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r7, r8)
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c9
            r7 = 1
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            java.util.LinkedList<te3.sv3> r12 = r0.f227344r
            java.util.Iterator r12 = r12.iterator()
        L_0x00d0:
            boolean r18 = r12.hasNext()
            if (r18 == 0) goto L_0x00e6
            java.lang.Object r18 = r12.next()
            r8 = r18
            te3.sv3 r8 = (te3.C77996sv3) r8
            int r8 = r8.f228225d
            if (r8 != r13) goto L_0x00e3
            r7 = 1
        L_0x00e3:
            r8 = 0
            goto L_0x00d0
        L_0x00e6:
            r21 = r14
            goto L_0x00ec
        L_0x00e9:
            r7 = 0
            r21 = 0
        L_0x00ec:
            java.lang.String r8 = yu0.C102913k.m136059x(r0, r13, r11)
            java.lang.String r15 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r8, (java.lang.String) r5)
            int r8 = r0.f227347u
            if (r8 != r13) goto L_0x0109
            te3.qv3 r8 = r0.f227345s
            if (r8 == 0) goto L_0x0109
            java.lang.String r8 = yu0.C102913k.m136050o(r15)
            te3.qv3 r9 = r0.f227345s
            pe3.b r9 = r9.f140574f
            byte[] r9 = r9.f257327a
            yu0.C102913k.m136037b(r8, r15, r9)
        L_0x0109:
            r8 = 2
            java.lang.String r9 = yu0.C102913k.m136059x(r0, r8, r11)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r5)
            int r12 = r0.f227347u
            if (r12 != r8) goto L_0x0128
            te3.qv3 r8 = r0.f227345s
            if (r8 == 0) goto L_0x0127
            java.lang.String r8 = yu0.C102913k.m136050o(r9)
            te3.qv3 r12 = r0.f227345s
            pe3.b r12 = r12.f140574f
            byte[] r12 = r12.f257327a
            yu0.C102913k.m136037b(r8, r9, r12)
        L_0x0127:
            r8 = 2
        L_0x0128:
            java.lang.Object[] r12 = new java.lang.Object[r8]
            r12[r3] = r15
            r8 = 1
            r12[r8] = r9
            java.lang.String r14 = "hdName:%s, imgName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r14, r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r12 == 0) goto L_0x0141
            java.lang.String r9 = "imgName is null, imgName = hdName"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r9)
            r14 = r15
            goto L_0x0142
        L_0x0141:
            r14 = r9
        L_0x0142:
            byte[] r9 = yu0.C102913k.m136061z(r0, r8)
            if (r9 != 0) goto L_0x023e
            java.lang.String r8 = "getThumbBuf is null and read from mediapath"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = yu0.C102913k.m136050o(r14)
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r29 = r14
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r9.append(r13)
            java.lang.String r13 = " "
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            byte[] r9 = r9.getBytes()
            java.lang.String r9 = p823sg.C90193h.m112878f(r9)
            java.lang.String r13 = yu0.C102913k.m136050o(r9)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r9)
            java.lang.String r14 = r14.toString()
            android.net.Uri r13 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r12 = r13.getPath()
            if (r12 == 0) goto L_0x01b9
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r3, r3)
            java.lang.String r3 = r13.getPath()
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x01b9
            android.net.Uri$Builder r3 = r13.buildUpon()
            android.net.Uri$Builder r3 = r3.path(r12)
            android.net.Uri r13 = r3.build()
        L_0x01b9:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r13, r11)
            boolean r12 = r3.mo177810a()
            if (r12 != 0) goto L_0x01c7
            r11 = 0
            goto L_0x01cf
        L_0x01c7:
            com.tencent.mm.vfs.FileSystem$c r12 = r3.f348991a
            java.lang.String r11 = r3.f348992b
            boolean r11 = r12.mo119948x(r11)
        L_0x01cf:
            if (r11 != 0) goto L_0x01e5
            com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r11.mo177799l(r13, r3)
            boolean r11 = r3.mo177810a()
            if (r11 != 0) goto L_0x01de
            goto L_0x01e5
        L_0x01de:
            com.tencent.mm.vfs.FileSystem$c r11 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            r11.mo119937g(r3)
        L_0x01e5:
            int r3 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.isLongPicture((java.lang.String) r14)
            if (r3 <= 0) goto L_0x01ff
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG
            r11 = 90
            boolean r3 = com.tencent.p014mm.sdk.platformtools.LongBitmapHandler.createLongPictureThumbNail(r8, r9, r11, r14, r3)
            if (r3 != 0) goto L_0x01fc
            java.lang.String r0 = "createLongPictureThumbNail failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r0 = -1
            return r0
        L_0x01fc:
            r3 = -1
        L_0x01fd:
            r8 = 0
            goto L_0x022e
        L_0x01ff:
            r24 = 120(0x78, float:1.68E-43)
            r25 = 120(0x78, float:1.68E-43)
            android.graphics.Bitmap$CompressFormat r26 = android.graphics.Bitmap.CompressFormat.JPEG
            r27 = 90
            r23 = r8
            r28 = r14
            boolean r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createThumbNail(r23, r24, r25, r26, r27, r28)
            if (r3 != 0) goto L_0x0218
            java.lang.String r0 = "createThumbNail failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            r3 = -1
            return r3
        L_0x0218:
            r3 = -1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "insert: thumbName = "
            r8.append(r11)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r8)
            goto L_0x01fd
        L_0x022e:
            byte[] r9 = com.tencent.p014mm.vfs.C86013q1.m106433O(r14, r8, r3)
            if (r9 != 0) goto L_0x023a
            java.lang.String r0 = "img buf is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            return r3
        L_0x023a:
            r23 = r9
            r14 = 1
            goto L_0x0253
        L_0x023e:
            r29 = r14
            r3 = -1
            r8 = 0
            r14 = 1
            java.lang.Object[] r11 = new java.lang.Object[r14]
            int r12 = r9.length
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11[r8] = r12
            java.lang.String r8 = "getThumbBuf len:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r8, r11)
            r23 = r9
        L_0x0253:
            java.lang.String r13 = r10.mo127174TY(r15, r5, r5, r14)
            r12 = r29
            java.lang.String r5 = r10.mo127174TY(r12, r5, r5, r14)
            long r8 = r6.f267374a
            r19 = 0
            int r11 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r11 != 0) goto L_0x03ca
            r11 = 2
            int r9 = yu0.C102913k.m136060y(r0, r11)
            if (r7 == 0) goto L_0x0313
            r8 = 3
            int r16 = yu0.C102913k.m136060y(r0, r8)
            java.lang.String r7 = r39.mo108768t()
            r18 = 2
            r29 = r12
            long r11 = r0.f227348v
            r25 = 1
            com.tencent.mm.pointers.PString r26 = new com.tencent.mm.pointers.PString
            r26.<init>()
            com.tencent.mm.pointers.PInt r27 = new com.tencent.mm.pointers.PInt
            r27.<init>()
            com.tencent.mm.pointers.PInt r28 = new com.tencent.mm.pointers.PInt
            r28.<init>()
            r6 = r10
            r30 = 3
            r8 = r23
            r3 = r9
            r9 = r18
            r24 = r10
            r18 = 2
            r10 = r11
            r17 = r29
            r29 = -1
            r12 = r25
            r31 = r13
            r13 = r15
            r32 = r17
            r17 = 1
            r14 = r16
            r33 = r15
            r15 = r4
            r16 = r26
            r17 = r27
            r18 = r28
            long r6 = r6.Jt0(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
            r15 = r32
            r8 = r33
            boolean r9 = r8.equals(r15)
            if (r9 == 0) goto L_0x02c7
            r14 = r31
            r13 = 3
            boolean r9 = yu0.C102913k.m136034F(r0, r13, r14)
            goto L_0x02ce
        L_0x02c7:
            r14 = r31
            r13 = 3
            boolean r9 = yu0.C102913k.m136033E(r0, r13, r14)
        L_0x02ce:
            if (r9 != 0) goto L_0x0310
            long r9 = (long) r3
            int r11 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r11 != 0) goto L_0x0303
            boolean r8 = r8.equals(r15)
            if (r8 == 0) goto L_0x02e0
            boolean r8 = yu0.C102913k.m136034F(r0, r13, r5)
            goto L_0x02e4
        L_0x02e0:
            boolean r8 = yu0.C102913k.m136033E(r0, r13, r5)
        L_0x02e4:
            if (r8 == 0) goto L_0x02f6
            r12 = 1
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r9 = 0
            r8[r9] = r5
            java.lang.String r10 = "writeItem, try take img for hd img success:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r8)
            r10 = r6
            r21 = 0
            goto L_0x0320
        L_0x02f6:
            r9 = 0
            r12 = 1
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r9] = r5
            java.lang.String r10 = "writeItem, try take img for hd img failed:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r10, r8)
            goto L_0x0311
        L_0x0303:
            r9 = 0
            r12 = 1
            java.lang.Object[] r8 = new java.lang.Object[r12]
            r8[r9] = r14
            java.lang.String r9 = "writeItem BACKUPITEM_IMAGE_HD failed:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r9, r8)
            goto L_0x0311
        L_0x0310:
            r12 = 1
        L_0x0311:
            r10 = r6
            goto L_0x031e
        L_0x0313:
            r3 = r9
            r24 = r10
            r15 = r12
            r14 = r13
            r12 = 1
            r13 = 3
            r29 = -1
            r10 = r19
        L_0x031e:
            r21 = 1
        L_0x0320:
            if (r3 > 0) goto L_0x0326
            int r3 = yu0.C102913k.m136060y(r0, r13)
        L_0x0326:
            com.tencent.mm.pointers.PString r9 = new com.tencent.mm.pointers.PString
            r9.<init>()
            com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
            r8.<init>()
            com.tencent.mm.pointers.PInt r7 = new com.tencent.mm.pointers.PInt
            r7.<init>()
            java.lang.String r16 = r39.mo108768t()
            r17 = 2
            long r12 = r0.f227348v
            r18 = 0
            r6 = r24
            r37 = r7
            r7 = r16
            r22 = r8
            r8 = r23
            r23 = r9
            r9 = r17
            r34 = r10
            r10 = r12
            r13 = 1
            r12 = r18
            r24 = 3
            r13 = r15
            r25 = r14
            r14 = r3
            r15 = r4
            r16 = r23
            r17 = r22
            r18 = r37
            long r3 = r6.Jt0(r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18)
            if (r21 == 0) goto L_0x037c
            r7 = 2
            boolean r0 = yu0.C102913k.m136033E(r0, r7, r5)
            if (r0 != 0) goto L_0x037a
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r8 = 0
            r6[r8] = r25
            java.lang.String r8 = "writeItem BACKUPITEM_IMAGE failed:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r8, r6)
            goto L_0x037e
        L_0x037a:
            r0 = 1
            goto L_0x037e
        L_0x037c:
            r0 = 1
            r7 = 2
        L_0x037e:
            int r6 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r6 <= 0) goto L_0x03c9
            r6 = r23
            java.lang.String r6 = r6.value
            r1.mo108739S2(r6)
            r6 = r22
            int r6 = r6.value
            r1.mo108752f3(r6)
            r6 = r37
            int r6 = r6.value
            r1.mo108751e3(r6)
            r8 = r34
            int r6 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r6 <= 0) goto L_0x03f8
            hv0.e r6 = hv0.C98544e.m128035f()
            hv0.c r6 = r6.mo137901e()
            com.tencent.mm.modelimage.m r6 = r6.mo137896d()
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            com.tencent.mm.modelimage.k r6 = r6.mo127194nP(r10)
            int r10 = (int) r8
            r6.mo127151v(r10)
            hv0.e r10 = hv0.C98544e.m128035f()
            hv0.c r10 = r10.mo137901e()
            com.tencent.mm.modelimage.m r10 = r10.mo137896d()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r10.Dx0(r3, r6)
            goto L_0x03f8
        L_0x03c9:
            return r29
        L_0x03ca:
            r25 = r13
            r0 = 1
            r7 = 2
            r24 = 3
            java.lang.String r3 = r6.f267380g
            if (r3 == 0) goto L_0x03e0
            java.lang.String r4 = "THUMBNAIL_DIRPATH://"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L_0x03e0
            r1.mo108739S2(r3)
            goto L_0x03f6
        L_0x03e0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "THUMBNAIL://"
            r3.append(r4)
            long r8 = r6.f267374a
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            r1.mo108739S2(r3)
        L_0x03f6:
            r8 = r19
        L_0x03f8:
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x03ff
            r13 = r25
            goto L_0x0400
        L_0x03ff:
            r13 = r5
        L_0x0400:
            java.lang.Class<xp.b> r3 = p753xp.C102704b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            xp.b r3 = (p753xp.C102704b) r3
            int r4 = r39.getType()
            r5 = 0
            wp.b r3 = r3.mo138751as(r13, r4, r5, r5)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r3.f301760a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            boolean r5 = r3.f301761b
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r0] = r5
            boolean r0 = r3.f301762c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4[r7] = r0
            long r5 = r3.f301763d
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4[r24] = r0
            java.lang.String r0 = "BackUp image dup check, ret:%s, hitCache:%s, copyRes:%s, replaceRes:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
            hv0.C98543d.m128033d(r39)
            r0 = 0
            return r0
        L_0x043f:
            r0 = 0
            java.lang.String r1 = "recover bakitem/Content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.C97547f.mo105806a(java.lang.String, te3.f9, com.tencent.mm.storage.f4):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x03a9 A[Catch:{ Exception -> 0x03f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03bd A[Catch:{ Exception -> 0x03f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03db A[Catch:{ Exception -> 0x03f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0411 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0412  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0248 A[Catch:{ Exception -> 0x03f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0272 A[Catch:{ Exception -> 0x03f5 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo105807b(te3.C77926f9 r24, boolean r25, com.tencent.p014mm.storage.C72963f4 r26, java.lang.String r27, java.util.LinkedList<pv0.C100968x> r28, boolean r29) {
        /*
            r23 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "msg"
            r0.append(r1)
            java.lang.String r2 = r26.getContent()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            long r3 = r26.getMsgId()
            r0.append(r3)
            r0.append(r2)
            long r2 = r26.mo108774y2()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.BackupItemImg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            java.lang.String r0 = r26.getContent()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r3 = 0
            if (r0 == 0) goto L_0x003e
            r0 = 0
            goto L_0x0047
        L_0x003e:
            java.lang.String r0 = r26.getContent()
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
        L_0x0047:
            int r4 = r26.mo108769t2()
            r5 = 0
            r7 = 1
            if (r4 != r7) goto L_0x0087
            hv0.e r4 = hv0.C98544e.m128035f()
            hv0.c r4 = r4.mo137901e()
            com.tencent.mm.modelimage.m r4 = r4.mo137896d()
            java.lang.String r8 = r26.mo108768t()
            long r9 = r26.getMsgId()
            com.tencent.mm.modelimage.k r4 = r4.mo127200vP(r8, r9)
            long r8 = r4.f267374a
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x009f
            hv0.e r4 = hv0.C98544e.m128035f()
            hv0.c r4 = r4.mo137901e()
            com.tencent.mm.modelimage.m r4 = r4.mo137896d()
            java.lang.String r8 = r26.mo108768t()
            long r9 = r26.mo108774y2()
            com.tencent.mm.modelimage.k r4 = r4.mo127168NQ(r8, r9)
            goto L_0x009f
        L_0x0087:
            hv0.e r4 = hv0.C98544e.m128035f()
            hv0.c r4 = r4.mo137901e()
            com.tencent.mm.modelimage.m r4 = r4.mo137896d()
            java.lang.String r8 = r26.mo108768t()
            long r9 = r26.mo108774y2()
            com.tencent.mm.modelimage.k r4 = r4.mo127168NQ(r8, r9)
        L_0x009f:
            hv0.e r8 = hv0.C98544e.m128035f()
            hv0.c r8 = r8.mo137901e()
            com.tencent.mm.modelimage.m r8 = r8.mo137896d()
            java.lang.String r9 = r26.mo108765s2()
            java.lang.String r11 = r8.v10(r9, r7)
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)
            if (r8 == 0) goto L_0x00d1
            dv0.k$a r8 = new dv0.k$a
            r14 = 1
            r18 = 0
            java.lang.String r16 = "_thumb"
            r10 = r8
            r12 = r24
            r13 = r28
            r15 = r25
            r17 = r29
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            int r8 = dv0.C97551k.m125702a(r8)
            int r0 = r0 + r8
        L_0x00d1:
            int r8 = r26.mo108769t2()
            r9 = 0
            java.lang.String r10 = ""
            if (r8 != r7) goto L_0x016d
            hv0.e r8 = hv0.C98544e.m128035f()
            hv0.c r8 = r8.mo137901e()
            com.tencent.mm.modelimage.m r8 = r8.mo137896d()
            java.lang.String r11 = r4.f267378e
            java.lang.String r13 = r8.mo127174TY(r11, r10, r10, r7)
            boolean r8 = r4.mo127145p()
            if (r8 == 0) goto L_0x0145
            hv0.e r8 = hv0.C98544e.m128035f()
            hv0.c r8 = r8.mo137901e()
            com.tencent.mm.modelimage.m r8 = r8.mo137896d()
            int r4 = r4.f267390q
            com.tencent.mm.modelimage.k r4 = r8.mo127173TO(r4)
            hv0.e r8 = hv0.C98544e.m128035f()
            hv0.c r8 = r8.mo137901e()
            com.tencent.mm.modelimage.m r8 = r8.mo137896d()
            java.lang.String r11 = r4.f267378e
            java.lang.String r8 = r8.mo127174TY(r11, r10, r10, r7)
            com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r11 == 0) goto L_0x013a
            dv0.k$a r3 = new dv0.k$a
            r18 = 3
            r22 = 0
            java.lang.String r20 = "_hd"
            r14 = r3
            r15 = r8
            r16 = r24
            r17 = r28
            r19 = r25
            r21 = r29
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            int r3 = dv0.C97551k.m125702a(r3)
            int r0 = r0 + r3
            goto L_0x0146
        L_0x013a:
            java.lang.Object[] r11 = new java.lang.Object[r7]
            r11[r3] = r8
            java.lang.String r3 = "packet img.hasHdImg but hdbigImgPath has no file, hdbigImgPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r11)
            goto L_0x0146
        L_0x0145:
            r8 = r10
        L_0x0146:
            com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r3 != 0) goto L_0x022b
            boolean r3 = r13.equals(r8)
            if (r3 != 0) goto L_0x022b
            dv0.k$a r3 = new dv0.k$a
            r16 = 2
            r19 = 0
            r12 = r3
            r14 = r24
            r15 = r28
            r17 = r25
            r18 = r29
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            int r3 = dv0.C97551k.m125702a(r3)
            goto L_0x022a
        L_0x016d:
            boolean r8 = r4.mo127146q()
            if (r8 == 0) goto L_0x022b
            hv0.e r8 = hv0.C98544e.m128035f()
            hv0.c r8 = r8.mo137901e()
            com.tencent.mm.modelimage.m r8 = r8.mo137896d()
            java.lang.String r11 = r4.f267378e
            java.lang.String r13 = r8.mo127174TY(r11, r10, r10, r7)
            boolean r8 = r4.mo127145p()
            if (r8 == 0) goto L_0x019e
            hv0.e r8 = hv0.C98544e.m128035f()
            hv0.c r8 = r8.mo137901e()
            com.tencent.mm.modelimage.m r8 = r8.mo137896d()
            int r11 = r4.f267390q
            com.tencent.mm.modelimage.k r8 = r8.mo127173TO(r11)
            goto L_0x019f
        L_0x019e:
            r8 = r9
        L_0x019f:
            if (r8 == 0) goto L_0x01fe
            int r11 = r8.f267381h
            if (r11 != r7) goto L_0x01fe
            boolean r11 = r8.equals(r4)
            if (r11 != 0) goto L_0x01fe
            int r11 = r8.f267377d
            if (r11 <= 0) goto L_0x01fe
            int r12 = r8.f267376c
            if (r12 != r11) goto L_0x01fe
            hv0.e r11 = hv0.C98544e.m128035f()
            hv0.c r11 = r11.mo137901e()
            com.tencent.mm.modelimage.m r11 = r11.mo137896d()
            java.lang.String r8 = r8.f267378e
            java.lang.String r8 = r11.mo127174TY(r8, r10, r10, r7)
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r3] = r8
            long r14 = com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r14)
            r11[r7] = r3
            java.lang.String r3 = "packet hdPath:%s, fileLen[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r11)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r8)
            if (r3 == 0) goto L_0x01ff
            dv0.k$a r3 = new dv0.k$a
            r18 = 3
            r22 = 0
            java.lang.String r20 = "_hd"
            r14 = r3
            r15 = r8
            r16 = r24
            r17 = r28
            r19 = r25
            r21 = r29
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            int r3 = dv0.C97551k.m125702a(r3)
            int r0 = r0 + r3
            com.tencent.p014mm.vfs.C86013q1.m106451l(r8)
            goto L_0x01ff
        L_0x01fe:
            r8 = r10
        L_0x01ff:
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r13)
            if (r3 == 0) goto L_0x022b
            com.tencent.p014mm.vfs.C86013q1.m106451l(r13)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r3 != 0) goto L_0x022b
            boolean r3 = r13.equals(r8)
            if (r3 != 0) goto L_0x022b
            dv0.k$a r3 = new dv0.k$a
            r16 = 2
            r19 = 0
            r12 = r3
            r14 = r24
            r15 = r28
            r17 = r25
            r18 = r29
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            int r3 = dv0.C97551k.m125702a(r3)
        L_0x022a:
            int r0 = r0 + r3
        L_0x022b:
            r3 = r0
            java.lang.String r0 = "img"
            java.io.StringWriter r8 = new java.io.StringWriter
            r8.<init>()
            org.xmlpull.v1.XmlPullParserFactory r11 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ Exception -> 0x03f5 }
            org.xmlpull.v1.XmlSerializer r11 = r11.newSerializer()     // Catch:{ Exception -> 0x03f5 }
            r11.setOutput(r8)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r12 = r26.mo108768t()     // Catch:{ Exception -> 0x03f5 }
            boolean r12 = hv0.C98543d.m128034e(r12)     // Catch:{ Exception -> 0x03f5 }
            if (r12 == 0) goto L_0x0264
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f5 }
            r12.<init>()     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r13 = r26.getContent()     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r13 = eb0.C75604z3.m90847s(r13)     // Catch:{ Exception -> 0x03f5 }
            r12.append(r13)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r13 = ":\n"
            r12.append(r13)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x03f5 }
            r8.write(r12)     // Catch:{ Exception -> 0x03f5 }
        L_0x0264:
            r11.startTag(r9, r1)     // Catch:{ Exception -> 0x03f5 }
            r11.startTag(r9, r0)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r12 = r4.f267393t     // Catch:{ Exception -> 0x03f5 }
            java.util.Map r12 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r12, r1, r9)     // Catch:{ Exception -> 0x03f5 }
            if (r12 == 0) goto L_0x03db
            java.lang.String r13 = ".msg.img.$aeskey"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x027f
            java.lang.String r13 = "aeskey"
            r11.attribute(r9, r13, r10)     // Catch:{ Exception -> 0x03f5 }
        L_0x027f:
            java.lang.String r13 = ".msg.img.$encryver"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x028c
            java.lang.String r13 = "encryver"
            r11.attribute(r9, r13, r10)     // Catch:{ Exception -> 0x03f5 }
        L_0x028c:
            java.lang.String r13 = ".msg.img.$cdnthumbaeskey"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x0299
            java.lang.String r13 = "cdnthumbaeskey"
            r11.attribute(r9, r13, r10)     // Catch:{ Exception -> 0x03f5 }
        L_0x0299:
            java.lang.String r13 = ".msg.img.$cdnthumburl"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x02a6
            java.lang.String r13 = "cdnthumburl"
            r11.attribute(r9, r13, r10)     // Catch:{ Exception -> 0x03f5 }
        L_0x02a6:
            java.lang.String r13 = ".msg.img.$cdnthumblength"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x02b5
            java.lang.String r13 = "cdnthumblength"
            java.lang.String r14 = "10240"
            r11.attribute(r9, r13, r14)     // Catch:{ Exception -> 0x03f5 }
        L_0x02b5:
            java.lang.String r13 = ".msg.img.$cdnthumbheight"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r14 = "0"
            if (r13 != 0) goto L_0x02c4
            java.lang.String r13 = "cdnthumbheight"
            r11.attribute(r9, r13, r14)     // Catch:{ Exception -> 0x03f5 }
        L_0x02c4:
            java.lang.String r13 = ".msg.img.$cdnthumbwidth"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x02d1
            java.lang.String r13 = "cdnthumbwidth"
            r11.attribute(r9, r13, r14)     // Catch:{ Exception -> 0x03f5 }
        L_0x02d1:
            java.lang.String r13 = ".msg.img.$cdnmidheight"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x02de
            java.lang.String r13 = "cdnmidheight"
            r11.attribute(r9, r13, r14)     // Catch:{ Exception -> 0x03f5 }
        L_0x02de:
            java.lang.String r13 = ".msg.img.$cdnmidwidth"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x02eb
            java.lang.String r13 = "cdnmidwidth"
            r11.attribute(r9, r13, r14)     // Catch:{ Exception -> 0x03f5 }
        L_0x02eb:
            java.lang.String r13 = ".msg.img.$cdnhdheight"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x02f8
            java.lang.String r13 = "cdnhdheight"
            r11.attribute(r9, r13, r14)     // Catch:{ Exception -> 0x03f5 }
        L_0x02f8:
            java.lang.String r13 = ".msg.img.$cdnhdwidth"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x0305
            java.lang.String r13 = "cdnhdwidth"
            r11.attribute(r9, r13, r14)     // Catch:{ Exception -> 0x03f5 }
        L_0x0305:
            java.lang.String r13 = ".msg.img.$cdnmidimgurl"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            if (r13 != 0) goto L_0x0312
            java.lang.String r13 = "cdnmidimgurl"
            r11.attribute(r9, r13, r10)     // Catch:{ Exception -> 0x03f5 }
        L_0x0312:
            java.lang.String r13 = ".msg.img.$length"
            java.lang.Object r13 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x03f5 }
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r13, r5)     // Catch:{ Exception -> 0x03f5 }
            int r15 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x034d
            java.lang.String r13 = "length"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f5 }
            r14.<init>()     // Catch:{ Exception -> 0x03f5 }
            r14.append(r10)     // Catch:{ Exception -> 0x03f5 }
            hv0.e r15 = hv0.C98544e.m128035f()     // Catch:{ Exception -> 0x03f5 }
            hv0.c r15 = r15.mo137901e()     // Catch:{ Exception -> 0x03f5 }
            com.tencent.mm.modelimage.m r15 = r15.mo137896d()     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r5 = r4.f267378e     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r5 = r15.mo127174TY(r5, r10, r10, r7)     // Catch:{ Exception -> 0x03f5 }
            long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r5)     // Catch:{ Exception -> 0x03f5 }
            r14.append(r5)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r5 = r14.toString()     // Catch:{ Exception -> 0x03f5 }
            r11.attribute(r9, r13, r5)     // Catch:{ Exception -> 0x03f5 }
        L_0x034d:
            int r5 = r26.mo108769t2()     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r6 = ".msg.img.$hdlength"
            java.lang.String r13 = ".msg.img.$cdnbigimgurl"
            if (r5 != r7) goto L_0x035f
            int r4 = r4.f267381h     // Catch:{ Exception -> 0x03f5 }
            if (r4 != r7) goto L_0x035c
            goto L_0x035f
        L_0x035c:
            r25 = r8
            goto L_0x039b
        L_0x035f:
            java.lang.String r4 = "cdnbigimgurl"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f5 }
            r5.<init>()     // Catch:{ Exception -> 0x03f5 }
            r5.append(r10)     // Catch:{ Exception -> 0x03f5 }
            java.lang.Object r14 = r12.get(r13)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x03f5 }
            r5.append(r14)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x03f5 }
            r11.attribute(r9, r4, r5)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r4 = "hdlength"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f5 }
            r5.<init>()     // Catch:{ Exception -> 0x03f5 }
            r5.append(r10)     // Catch:{ Exception -> 0x03f5 }
            java.lang.Object r14 = r12.get(r6)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x03f5 }
            r25 = r8
            r7 = 0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r14, r7)     // Catch:{ Exception -> 0x03f5 }
            r5.append(r7)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x03f5 }
            r11.attribute(r9, r4, r5)     // Catch:{ Exception -> 0x03f5 }
        L_0x039b:
            r12.remove(r13)     // Catch:{ Exception -> 0x03f5 }
            r12.remove(r6)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r4 = ".msg.img.$md5"
            java.lang.Object r4 = r12.get(r4)     // Catch:{ Exception -> 0x03f5 }
            if (r4 != 0) goto L_0x03af
            java.lang.String r4 = "md5"
            r11.attribute(r9, r4, r10)     // Catch:{ Exception -> 0x03f5 }
        L_0x03af:
            java.util.Set r4 = r12.keySet()     // Catch:{ Exception -> 0x03f5 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x03f5 }
        L_0x03b7:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x03f5 }
            if (r5 == 0) goto L_0x03dd
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r6 = ".msg.img.$"
            boolean r6 = r5.startsWith(r6)     // Catch:{ Exception -> 0x03f5 }
            if (r6 == 0) goto L_0x03b7
            r6 = 10
            java.lang.String r6 = r5.substring(r6)     // Catch:{ Exception -> 0x03f5 }
            java.lang.Object r5 = r12.get(r5)     // Catch:{ Exception -> 0x03f5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x03f5 }
            r11.attribute(r9, r6, r5)     // Catch:{ Exception -> 0x03f5 }
            goto L_0x03b7
        L_0x03db:
            r25 = r8
        L_0x03dd:
            r11.endTag(r9, r0)     // Catch:{ Exception -> 0x03f5 }
            r11.endTag(r9, r1)     // Catch:{ Exception -> 0x03f5 }
            r11.endDocument()     // Catch:{ Exception -> 0x03f5 }
            r25.flush()     // Catch:{ Exception -> 0x03f5 }
            r25.close()     // Catch:{ Exception -> 0x03f5 }
            java.lang.StringBuffer r0 = r25.getBuffer()
            java.lang.String r9 = r0.toString()
            goto L_0x040f
        L_0x03f5:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "packetImg xml error: "
            r1.append(r4)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x040f:
            if (r9 != 0) goto L_0x0412
            return r3
        L_0x0412:
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            r0.f141175d = r9
            r1 = 1
            r0.f141176e = r1
            r1 = r24
            r1.f227337h = r0
            int r0 = r9.length()
            int r3 = r3 + r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.C97547f.mo105807b(te3.f9, boolean, com.tencent.mm.storage.f4, java.lang.String, java.util.LinkedList, boolean):int");
    }
}
