package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import d81.C45288e;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.i */
public class C93365i {
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7 A[SYNTHETIC, Splitter:B:45:0x00a7] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b7 A[SYNTHETIC, Splitter:B:51:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5 A[SYNTHETIC, Splitter:B:58:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d5 A[SYNTHETIC, Splitter:B:64:0x00d5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m117884a(java.lang.String r10, long r11) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.exdevice.ExDeviceUtil"
            r2 = 0
            if (r10 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "/"
            int r4 = r10.lastIndexOf(r3)
            r5 = 0
            java.lang.String r4 = r10.substring(r5, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "image_hd_"
            r6.append(r7)
            int r7 = r10.hashCode()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r3)
            r7.append(r6)
            java.lang.String r3 = r7.toString()
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x0094, all -> 0x0090 }
            r4.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x0094, all -> 0x0090 }
            r6 = 0
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x004b
            com.tencent.mm.vfs.s1 r11 = new com.tencent.mm.vfs.s1     // Catch:{ IOException -> 0x0094, all -> 0x0090 }
            r11.<init>((com.tencent.p014mm.vfs.C86009m1) r4)     // Catch:{ IOException -> 0x0094, all -> 0x0090 }
            goto L_0x0051
        L_0x004b:
            zc0.b r6 = new zc0.b     // Catch:{ IOException -> 0x0094, all -> 0x0090 }
            r6.<init>(r4, r11)     // Catch:{ IOException -> 0x0094, all -> 0x0090 }
            r11 = r6
        L_0x0051:
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r10)     // Catch:{ IOException -> 0x008c, all -> 0x0088 }
            r12 = 1024(0x400, float:1.435E-42)
            byte[] r12 = new byte[r12]     // Catch:{ IOException -> 0x0082, all -> 0x007c }
        L_0x0059:
            int r4 = r10.read(r12)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            r6 = -1
            if (r4 == r6) goto L_0x0064
            r11.write(r12)     // Catch:{ IOException -> 0x0082, all -> 0x007c }
            goto L_0x0059
        L_0x0064:
            r11.flush()     // Catch:{ IOException -> 0x0075 }
            r11.close()     // Catch:{ IOException -> 0x0075 }
            r10.close()     // Catch:{ IOException -> 0x006e }
            return r3
        L_0x006e:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
            return r2
        L_0x0075:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
            return r2
        L_0x007c:
            r12 = move-exception
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L_0x00c3
        L_0x0082:
            r12 = move-exception
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
            goto L_0x0097
        L_0x0088:
            r10 = move-exception
            r12 = r11
            r11 = r2
            goto L_0x00c3
        L_0x008c:
            r10 = move-exception
            r12 = r11
            r11 = r2
            goto L_0x0097
        L_0x0090:
            r10 = move-exception
            r11 = r2
            r12 = r11
            goto L_0x00c3
        L_0x0094:
            r10 = move-exception
            r11 = r2
            r12 = r11
        L_0x0097:
            java.lang.String r3 = "enc image error %s"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00c2 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00c2 }
            r4[r5] = r10     // Catch:{ all -> 0x00c2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r4)     // Catch:{ all -> 0x00c2 }
            if (r12 == 0) goto L_0x00b5
            r12.flush()     // Catch:{ IOException -> 0x00ae }
            r12.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b5
        L_0x00ae:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
            return r2
        L_0x00b5:
            if (r11 == 0) goto L_0x00c1
            r11.close()     // Catch:{ IOException -> 0x00bb }
            goto L_0x00c1
        L_0x00bb:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
        L_0x00c1:
            return r2
        L_0x00c2:
            r10 = move-exception
        L_0x00c3:
            if (r12 == 0) goto L_0x00d3
            r12.flush()     // Catch:{ IOException -> 0x00cc }
            r12.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00d3
        L_0x00cc:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
            return r2
        L_0x00d3:
            if (r11 == 0) goto L_0x00e0
            r11.close()     // Catch:{ IOException -> 0x00d9 }
            goto L_0x00e0
        L_0x00d9:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r10, r0, r11)
            return r2
        L_0x00e0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93365i.m117884a(java.lang.String, long):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010d, code lost:
        if ((!r5.mo177810a() ? false : r5.f348991a.mo119948x(r5.f348992b)) != false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0208  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m117885b(te3.C101766ct2 r25, p1081gi.C98124g r26, long r27) {
        /*
            r0 = r25
            r1 = r26
            r2 = r27
            java.lang.Class<ym.l> r4 = p763ym.C79138l.class
            java.lang.Class<gt.l> r5 = p158gt.C76053l.class
            java.lang.Class<rz.s> r6 = p682rz.C101488s.class
            java.lang.Class<f62.k0> r7 = f62.C75700k0.class
            java.lang.Class<gt.k> r8 = p158gt.C98201k.class
            k40.a r9 = f40.C86709a0.m107533q(r7)
            f62.k0 r9 = (f62.C75700k0) r9
            g62.l r9 = r9.mo96095LE()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            com.tencent.mm.storage.f4 r9 = r9.b00(r2)
            long r10 = r9.getMsgId()
            r12 = 0
            r14 = 0
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 != 0) goto L_0x002c
            return r14
        L_0x002c:
            int r10 = r9.getType()
            java.lang.String r11 = r9.getContent()
            boolean r15 = r9.mo101020w3()
            java.lang.String r14 = ""
            java.lang.String r13 = "MicroMsg.exdevice.ExDeviceUtil"
            r12 = 1
            if (r15 == 0) goto L_0x0073
            r9 = 0
            com.tencent.mm.message.l$b r11 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r11, r9)
            if (r11 == 0) goto L_0x006f
            int r9 = r11.f195582i
            r15 = 6
            if (r9 == r15) goto L_0x004e
            r15 = 2
            if (r9 != r15) goto L_0x006f
        L_0x004e:
            java.lang.Class<ym.s> r9 = p763ym.C53543s.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ym.s r9 = (p763ym.C53543s) r9
            ym.i r9 = r9.mo74024KZ()
            java.lang.String r11 = r11.f195606o
            com.tencent.mm.pluginsdk.model.app.e r9 = (com.tencent.p014mm.pluginsdk.model.app.C72684e) r9
            com.tencent.mm.pluginsdk.model.app.d r9 = r9.mo100154qq(r11)
            if (r9 == 0) goto L_0x006a
            java.lang.String r9 = r9.field_fileFullPath
            r18 = r5
            goto L_0x0148
        L_0x006a:
            java.lang.String r9 = "getFilePath attInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r9)
        L_0x006f:
            r18 = r5
            goto L_0x0147
        L_0x0073:
            r11 = 3
            if (r10 != r11) goto L_0x013c
            di3.d r11 = di3.C86312j.m106911c(r8)
            gt.k r11 = (p158gt.C98201k) r11
            gt.m r11 = r11.mo137277xi()
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            com.tencent.mm.modelimage.k r9 = r11.mo127198uP(r9)
            if (r9 == 0) goto L_0x0137
            di3.d r11 = di3.C86312j.m106911c(r8)
            gt.k r11 = (p158gt.C98201k) r11
            gt.m r11 = r11.mo137277xi()
            java.lang.String r15 = r9.f267378e
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            java.lang.String r11 = r11.mo127174TY(r15, r14, r14, r12)
            boolean r15 = r9.mo127145p()
            if (r15 == 0) goto L_0x0112
            di3.d r15 = di3.C86312j.m106911c(r5)
            gt.l r15 = (p158gt.C76053l) r15
            com.tencent.mm.modelimage.k r15 = r15.mo106261jD(r9)
            if (r15 == 0) goto L_0x0112
            di3.d r18 = di3.C86312j.m106911c(r8)
            gt.k r18 = (p158gt.C98201k) r18
            gt.m r18 = r18.mo137277xi()
            java.lang.String r12 = r15.f267378e
            r20 = r11
            r11 = r18
            com.tencent.mm.modelimage.m r11 = (com.tencent.p014mm.modelimage.C92839m) r11
            r18 = r5
            r5 = 1
            java.lang.String r11 = r11.mo127174TY(r12, r14, r14, r5)
            boolean r5 = r15.mo127146q()
            if (r5 == 0) goto L_0x0115
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r5 != 0) goto L_0x0115
            android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r12 = r5.getPath()
            if (r12 == 0) goto L_0x00f6
            r15 = 0
            java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r15, r15)
            java.lang.String r15 = r5.getPath()
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x00f6
            android.net.Uri$Builder r5 = r5.buildUpon()
            android.net.Uri$Builder r5 = r5.path(r12)
            android.net.Uri r5 = r5.build()
        L_0x00f6:
            com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r15 = 0
            com.tencent.mm.vfs.f0$h r5 = r12.mo177799l(r5, r15)
            boolean r12 = r5.mo177810a()
            if (r12 != 0) goto L_0x0105
            r5 = 0
            goto L_0x010d
        L_0x0105:
            com.tencent.mm.vfs.FileSystem$c r12 = r5.f348991a
            java.lang.String r5 = r5.f348992b
            boolean r5 = r12.mo119948x(r5)
        L_0x010d:
            if (r5 == 0) goto L_0x0115
        L_0x010f:
            r20 = r11
            goto L_0x0115
        L_0x0112:
            r18 = r5
            goto L_0x010f
        L_0x0115:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r5 == 0) goto L_0x0133
            di3.d r5 = di3.C86312j.m106911c(r8)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            java.lang.String r11 = r9.f267380g
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            java.lang.String r5 = r5.mo127161CZ(r11)
            r24 = r9
            r9 = r5
            r5 = r24
            goto L_0x015f
        L_0x0133:
            r5 = r9
            r9 = r20
            goto L_0x015f
        L_0x0137:
            r18 = r5
            r5 = r9
            r9 = r14
            goto L_0x015f
        L_0x013c:
            r18 = r5
            r5 = 62
            if (r10 == r5) goto L_0x014a
            r5 = 43
            if (r10 != r5) goto L_0x0147
            goto L_0x014a
        L_0x0147:
            r9 = r14
        L_0x0148:
            r5 = 0
            goto L_0x015f
        L_0x014a:
            di3.d r5 = di3.C86312j.m106911c(r6)
            rz.s r5 = (p682rz.C101488s) r5
            rz.t r5 = r5.Kj0()
            java.lang.String r9 = r9.mo108765s2()
            hd0.o0 r5 = (hd0.C98410o0) r5
            java.lang.String r9 = r5.mo137728q(r9)
            goto L_0x0148
        L_0x015f:
            if (r9 == 0) goto L_0x01df
            int r12 = r9.length()
            if (r12 <= 0) goto L_0x01df
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
            java.lang.String r15 = r12.getPath()
            if (r15 == 0) goto L_0x018c
            r11 = 0
            java.lang.String r15 = com.tencent.p014mm.vfs.C116299g2.m163855k(r15, r11, r11)
            java.lang.String r11 = r12.getPath()
            boolean r11 = r11.equals(r15)
            if (r11 != 0) goto L_0x018c
            android.net.Uri$Builder r11 = r12.buildUpon()
            android.net.Uri$Builder r11 = r11.path(r15)
            android.net.Uri r12 = r11.build()
        L_0x018c:
            java.lang.String r11 = r12.getPath()
            java.lang.String r15 = "/"
            int r15 = r11.lastIndexOf(r15)
            if (r15 >= 0) goto L_0x0199
            goto L_0x01a1
        L_0x0199:
            r19 = 1
            int r15 = r15 + 1
            java.lang.String r11 = r11.substring(r15)
        L_0x01a1:
            com.tencent.mm.vfs.f0 r15 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r21 = r6
            r6 = 0
            com.tencent.mm.vfs.f0$h r12 = r15.mo177799l(r12, r6)
            boolean r6 = r12.mo177810a()
            if (r6 != 0) goto L_0x01b1
            goto L_0x01bb
        L_0x01b1:
            com.tencent.mm.vfs.FileSystem$c r6 = r12.f348991a
            java.lang.String r12 = r12.f348992b
            com.tencent.mm.vfs.b0 r6 = r6.mo119945q(r12)
            if (r6 != 0) goto L_0x01bf
        L_0x01bb:
            r12 = r14
            r14 = 0
            goto L_0x01c2
        L_0x01bf:
            r12 = r14
            long r14 = r6.f250473c
        L_0x01c2:
            int r6 = (int) r14
            java.lang.String r14 = "."
            int r15 = r11.lastIndexOf(r14)
            r22 = r6
            r6 = -1
            if (r15 == r6) goto L_0x01db
            int r6 = r11.lastIndexOf(r14)
            r14 = 1
            int r6 = r6 + r14
            java.lang.String r6 = r11.substring(r6)
            r14 = r22
            goto L_0x01e6
        L_0x01db:
            r14 = r22
            r6 = 0
            goto L_0x01e6
        L_0x01df:
            r21 = r6
            r12 = r14
            r6 = -1
            r6 = 0
            r11 = 0
            r14 = -1
        L_0x01e6:
            k40.a r15 = f40.C86709a0.m107533q(r7)
            f62.k0 r15 = (f62.C75700k0) r15
            g62.l r15 = r15.mo96095LE()
            com.tencent.mm.storage.g4 r15 = (com.tencent.p014mm.storage.C72972g4) r15
            com.tencent.mm.storage.f4 r15 = r15.b00(r2)
            long r22 = r15.getMsgId()
            r16 = 0
            int r20 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r20 != 0) goto L_0x0208
            java.lang.String r0 = "msgInfo or msgInfo.getMsgId() = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            r0 = 0
            return r0
        L_0x0208:
            boolean r16 = r15.mo101020w3()
            java.lang.String r3 = "gen from record"
            r2 = 5
            if (r16 == 0) goto L_0x038b
            java.lang.String r5 = r15.getContent()
            r7 = 0
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r5, r7)
            if (r5 != 0) goto L_0x0223
            java.lang.String r0 = "get content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r0 = 0
            return r0
        L_0x0223:
            int r7 = r5.f195582i
            r8 = 3
            if (r7 == r8) goto L_0x033e
            r8 = 76
            if (r7 != r8) goto L_0x022e
            goto L_0x033e
        L_0x022e:
            r8 = 6
            if (r7 != r8) goto L_0x0307
            te3.bt2 r4 = new te3.bt2
            r4.<init>()
            java.lang.String r7 = r5.f195570f
            r4.f297984e = r7
            java.lang.String r7 = r5.f195602n
            r4.f297983d = r7
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x0246
            r4.f297983d = r6
        L_0x0246:
            z71.d r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Cx0(r27)
            if (r6 == 0) goto L_0x028f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            java.lang.String r3 = r6.field_fileid
            r4.f297987h = r3
            java.lang.String r3 = r6.field_aeskey
            r4.f297988i = r3
            java.lang.String r3 = r6.field_md5
            r4.f297986g = r3
            int r3 = r6.field_size
            r4.f297985f = r3
            int r3 = r6.field_cdnType
            r4.f297990n = r3
            r3 = 1
            r4.f297991o = r3
            te3.ch2 r7 = new te3.ch2
            r7.<init>()
            r7.f298028d = r3
            java.lang.String r3 = r6.field_fileUrl
            r7.f298029e = r3
            if (r1 == 0) goto L_0x029f
            byte[] r3 = r1.field_aes_enc_key
            r6 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r6)
            r7.f298030f = r3
            byte[] r3 = r1.field_aes_nounce
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r6)
            r7.f298031g = r3
            byte[] r1 = r1.field_aes_tag
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r6)
            r7.f298032h = r1
            r4.f297992p = r7
            goto L_0x029f
        L_0x028f:
            java.lang.String r1 = r5.f195500J
            r4.f297987h = r1
            java.lang.String r1 = r5.f195524R
            r4.f297988i = r1
            java.lang.String r1 = r5.f195622s
            r4.f297986g = r1
            int r1 = r5.f195594l
            r4.f297985f = r1
        L_0x029f:
            int r1 = r4.f297985f
            if (r1 != 0) goto L_0x02a5
            r4.f297985f = r14
        L_0x02a5:
            java.lang.String r1 = r4.f297986g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x02bb
            if (r9 == 0) goto L_0x02bb
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x02bb
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r9)
            r4.f297986g = r1
        L_0x02bb:
            int r1 = r4.f297990n
            if (r1 != 0) goto L_0x02cf
            int r1 = r5.f195626t
            if (r1 != 0) goto L_0x02cc
            int r1 = r5.f195594l
            r3 = 26214400(0x1900000, float:5.2897246E-38)
            if (r1 <= r3) goto L_0x02ca
            goto L_0x02cc
        L_0x02ca:
            r1 = 5
            goto L_0x02cd
        L_0x02cc:
            r1 = 7
        L_0x02cd:
            r4.f297990n = r1
        L_0x02cf:
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r4.f297987h
            r5 = 0
            r1[r5] = r3
            java.lang.String r3 = r4.f297988i
            r5 = 1
            r1[r5] = r3
            int r3 = r4.f297990n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r1[r5] = r3
            java.lang.String r3 = r4.f297986g
            r5 = 3
            r1[r5] = r3
            int r3 = r4.f297985f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 4
            r1[r5] = r3
            java.lang.String r3 = r4.f297984e
            r1[r2] = r3
            java.lang.String r2 = r4.f297983d
            r3 = 6
            r1[r3] = r2
            java.lang.String r2 = "fileMsg fileId %s aesKey %s cdn %d md5 %s fileSize %d name %s type %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            r0.f298053h = r4
            r0.f298049d = r5
            r0 = 1
            return r0
        L_0x0307:
            if (r7 != r2) goto L_0x0642
            te3.gt2 r1 = new te3.gt2
            r1.<init>()
            java.lang.String r3 = r5.f195586j
            r1.f298304d = r3
            java.lang.String r3 = r5.f195570f
            r1.f298305e = r3
            java.lang.String r3 = r5.f195574g
            r1.f298306f = r3
            java.lang.String r3 = r5.f195484F
            r1.f298307g = r3
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = r5.f195562d
            di3.d r4 = di3.C86312j.m106911c(r4)
            ym.l r4 = (p763ym.C79138l) r4
            int r5 = r5.f195480E
            com.tencent.mm.pluginsdk.model.app.j r3 = r4.mo74003UV(r3, r5)
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = r3.field_appName
            r1.f298307g = r3
        L_0x0338:
            r0.f298054i = r1
            r0.f298049d = r2
            r0 = 1
            return r0
        L_0x033e:
            te3.ft2 r1 = new te3.ft2
            r1.<init>()
            java.lang.String r2 = r5.f195570f
            r1.f298260d = r2
            java.lang.String r2 = r5.f195574g
            r1.f298261e = r2
            java.lang.String r2 = r5.f195586j
            r1.f298263g = r2
            java.lang.String r2 = r5.f195590k
            r1.f298264h = r2
            java.lang.String r2 = r5.f195530T
            r1.f298265i = r2
            java.lang.String r2 = r5.f195533U
            r1.f298266j = r2
            java.lang.String r2 = r5.f195484F
            r1.f298267n = r2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0379
            java.lang.String r2 = r5.f195562d
            di3.d r3 = di3.C86312j.m106911c(r4)
            ym.l r3 = (p763ym.C79138l) r3
            int r4 = r5.f195480E
            com.tencent.mm.pluginsdk.model.app.j r2 = r3.mo74003UV(r2, r4)
            if (r2 == 0) goto L_0x0379
            java.lang.String r2 = r2.field_appName
            r1.f298267n = r2
        L_0x0379:
            java.lang.String r2 = r5.f195503K
            r1.f298268o = r2
            int r2 = r5.f195506L
            r1.f298269p = r2
            java.lang.String r2 = r5.f195527S
            r1.f298270q = r2
            r0.f298050e = r1
            r1 = 1
            r0.f298049d = r1
            return r1
        L_0x038b:
            java.lang.String r4 = "msg"
            r2 = 3
            if (r10 != r2) goto L_0x0506
            if (r5 != 0) goto L_0x0395
            r2 = 0
            return r2
        L_0x0395:
            te3.dt2 r2 = new te3.dt2
            r2.<init>()
            r2.f298129e = r11
            r2.f298128d = r6
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x03a8
            java.lang.String r6 = ".jpg"
            r2.f298128d = r6
        L_0x03a8:
            z71.d r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Cx0(r27)
            if (r6 == 0) goto L_0x0400
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            java.lang.String r3 = r6.field_fileid
            r2.f298132h = r3
            java.lang.String r3 = r6.field_aeskey
            r2.f298133i = r3
            java.lang.String r3 = r6.field_md5
            r2.f298131g = r3
            int r3 = r6.field_size
            r2.f298130f = r3
            int r3 = r6.field_cdnType
            r2.f298136o = r3
            if (r3 != 0) goto L_0x03d3
            int r3 = r5.f267381h
            r4 = 1
            if (r3 == r4) goto L_0x03d0
            r3 = 2
            r2.f298136o = r3
            goto L_0x03d4
        L_0x03d0:
            r2.f298136o = r4
            goto L_0x03d4
        L_0x03d3:
            r4 = 1
        L_0x03d4:
            r2.f298137p = r4
            te3.ch2 r3 = new te3.ch2
            r3.<init>()
            r3.f298028d = r4
            java.lang.String r4 = r6.field_fileUrl
            r3.f298029e = r4
            if (r1 == 0) goto L_0x04d2
            byte[] r4 = r1.field_aes_enc_key
            r5 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            r3.f298030f = r4
            byte[] r4 = r1.field_aes_nounce
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            r3.f298031g = r4
            byte[] r1 = r1.field_aes_tag
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)
            r3.f298032h = r1
            r2.f298138q = r3
            goto L_0x04d2
        L_0x0400:
            java.lang.String r1 = r5.f267393t
            r3 = 0
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r4, r3)
            if (r1 == 0) goto L_0x049f
            java.lang.String r3 = ".msg.img.$cdnmidimgurl"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.f298132h = r3
            r3 = 2
            r2.f298136o = r3
            java.lang.String r3 = ".msg.img.$cdnbigimgurl"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0495
            boolean r4 = r5.mo127145p()
            if (r4 == 0) goto L_0x0495
            di3.d r4 = di3.C86312j.m106911c(r18)
            gt.l r4 = (p158gt.C76053l) r4
            com.tencent.mm.modelimage.k r4 = r4.mo106261jD(r5)
            if (r4 == 0) goto L_0x0495
            di3.d r6 = di3.C86312j.m106911c(r8)
            gt.k r6 = (p158gt.C98201k) r6
            gt.m r6 = r6.mo137277xi()
            java.lang.String r7 = r4.f267378e
            com.tencent.mm.modelimage.m r6 = (com.tencent.p014mm.modelimage.C92839m) r6
            r8 = r12
            r10 = 1
            java.lang.String r6 = r6.mo127174TY(r7, r8, r8, r10)
            boolean r4 = r4.mo127146q()
            if (r4 == 0) goto L_0x0495
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r4 != 0) goto L_0x0495
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)
            java.lang.String r6 = r4.getPath()
            if (r6 == 0) goto L_0x0477
            r7 = 0
            java.lang.String r6 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r7, r7)
            java.lang.String r7 = r4.getPath()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0477
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r6)
            android.net.Uri r4 = r4.build()
        L_0x0477:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r7 = 0
            com.tencent.mm.vfs.f0$h r4 = r6.mo177799l(r4, r7)
            boolean r6 = r4.mo177810a()
            if (r6 != 0) goto L_0x0486
            r4 = 0
            goto L_0x048e
        L_0x0486:
            com.tencent.mm.vfs.FileSystem$c r6 = r4.f348991a
            java.lang.String r4 = r4.f348992b
            boolean r4 = r6.mo119948x(r4)
        L_0x048e:
            if (r4 == 0) goto L_0x0495
            r2.f298132h = r3
            r3 = 1
            r2.f298136o = r3
        L_0x0495:
            java.lang.String r3 = ".msg.img.$md5"
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r2.f298131g = r3
        L_0x049f:
            java.lang.String r3 = r5.mo127133d()
            r2.f298133i = r3
            java.lang.String r3 = r2.f298131g
            if (r3 != 0) goto L_0x04b7
            if (r9 == 0) goto L_0x04b7
            int r3 = r9.length()
            if (r3 <= 0) goto L_0x04b7
            java.lang.String r3 = com.tencent.p014mm.vfs.C86013q1.m106456q(r9)
            r2.f298131g = r3
        L_0x04b7:
            r2.f298130f = r14
            if (r14 != 0) goto L_0x04d2
            java.lang.String r3 = ".msg.img.$length"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x04d2
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x04cc }
            r2.f298130f = r1     // Catch:{ NumberFormatException -> 0x04cc }
            goto L_0x04d2
        L_0x04cc:
            java.lang.String r1 = "wrong size"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r1)
        L_0x04d2:
            r0.f298052g = r2
            r1 = 3
            r0.f298049d = r1
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r2.f298132h
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = r2.f298133i
            r4 = 1
            r0[r4] = r3
            int r3 = r2.f298136o
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r0[r4] = r3
            java.lang.String r3 = r2.f298131g
            r0[r1] = r3
            int r1 = r2.f298130f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 4
            r0[r3] = r1
            java.lang.String r1 = r2.f298128d
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = "imageMsg url %s aesKey %s cdn %d md5 %s size %d type %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            r0 = 1
            return r0
        L_0x0506:
            r2 = 48
            if (r10 != r2) goto L_0x0541
            k40.a r1 = f40.C86709a0.m107533q(r7)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.l r1 = r1.mo96095LE()
            java.lang.String r2 = r15.getContent()
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4$e r1 = r1.Tx0(r2)
            te3.et2 r2 = new te3.et2
            r2.<init>()
            double r3 = r1.f212704b
            float r3 = (float) r3
            r2.f298203d = r3
            double r3 = r1.f212705c
            float r3 = (float) r3
            r2.f298204e = r3
            int r3 = r1.f212706d
            float r3 = (float) r3
            r2.f298205f = r3
            java.lang.String r3 = r1.f212707e
            r2.f298206g = r3
            java.lang.String r1 = r1.f212708f
            r2.f298207h = r1
            r0.f298051f = r2
            r1 = 2
            r0.f298049d = r1
            r0 = 1
            return r0
        L_0x0541:
            r2 = 43
            if (r10 != r2) goto L_0x0642
            te3.ht2 r2 = new te3.ht2
            r2.<init>()
            di3.d r5 = di3.C86312j.m106911c(r21)
            rz.s r5 = (p682rz.C101488s) r5
            rz.t r5 = r5.Kj0()
            java.lang.String r7 = r15.mo108765s2()
            hd0.o0 r5 = (hd0.C98410o0) r5
            hd0.n0 r5 = r5.mo137720f(r7)
            java.lang.String r7 = r5.mo137705i()
            r8 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r7, r4, r8)
            if (r4 != 0) goto L_0x0570
            java.lang.String r0 = "cdntra parse video recv xml failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            r0 = 0
            return r0
        L_0x0570:
            java.lang.String r7 = ".msg.videomsg.$md5"
            java.lang.Object r7 = r4.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r8 = r4.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = ".msg.videomsg.$aeskey"
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            r2.f298358h = r11
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r10 == 0) goto L_0x0596
            java.lang.String r10 = r5.mo137700d()
            r2.f298358h = r10
        L_0x0596:
            r2.f298354d = r6
            z71.d r6 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Cx0(r27)
            if (r6 == 0) goto L_0x05e1
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            java.lang.String r3 = r6.field_fileid
            r2.f298359i = r3
            java.lang.String r3 = r6.field_aeskey
            r2.f298360j = r3
            java.lang.String r3 = r6.field_md5
            r2.f298356f = r3
            int r3 = r6.field_size
            r2.f298355e = r3
            int r3 = r6.field_cdnType
            r2.f298361n = r3
            r3 = 1
            r2.f298362o = r3
            te3.ch2 r4 = new te3.ch2
            r4.<init>()
            r4.f298028d = r3
            java.lang.String r3 = r6.field_fileUrl
            r4.f298029e = r3
            if (r1 == 0) goto L_0x05eb
            byte[] r3 = r1.field_aes_enc_key
            r5 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r5)
            r4.f298030f = r3
            byte[] r3 = r1.field_aes_nounce
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r5)
            r4.f298031g = r3
            byte[] r1 = r1.field_aes_tag
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)
            r4.f298032h = r1
            r2.f298363p = r4
            goto L_0x05eb
        L_0x05e1:
            r2.f298359i = r8
            r2.f298360j = r4
            r2.f298356f = r7
            int r1 = r5.f288559f
            r2.f298355e = r1
        L_0x05eb:
            java.lang.String r1 = r2.f298356f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0601
            if (r9 == 0) goto L_0x0601
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0601
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106456q(r9)
            r2.f298356f = r1
        L_0x0601:
            r1 = 4
            r2.f298361n = r1
            r0.f298055j = r2
            r3 = 6
            r0.f298049d = r3
            r0 = 8
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = r2.f298359i
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = r2.f298360j
            r4 = 1
            r0[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = 2
            r0[r4] = r3
            java.lang.String r3 = r2.f298354d
            r4 = 3
            r0[r4] = r3
            int r3 = r2.f298355e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            java.lang.String r1 = r2.f298356f
            r3 = 5
            r0[r3] = r1
            java.lang.String r1 = r2.f298358h
            r3 = 6
            r0[r3] = r1
            java.lang.String r1 = r2.f298354d
            r2 = 7
            r0[r2] = r1
            java.lang.String r1 = "videoMsg url %s aesKey %s cdn %d Type %s Size %d Md5 %s Name %s type %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            r0 = 1
            return r0
        L_0x0642:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93365i.m117885b(te3.ct2, gi.g, long):boolean");
    }

    /* renamed from: c */
    public static String m117886c(C53753b bVar) {
        if (bVar == null) {
            return "";
        }
        String str = null;
        if (!Util.isNullOrNil(bVar.f150113y)) {
            str = bVar.f150113y;
        } else if (!Util.isNullOrNil(bVar.f150085B)) {
            str = bVar.f150085B;
        } else {
            long j = bVar.field_mac;
            if (j != 0) {
                str = C45288e.m50135f(j);
            } else if (!Util.isNullOrNil(bVar.field_deviceID)) {
                str = bVar.field_deviceID;
            }
        }
        return Util.nullAsNil(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ad, code lost:
        if (r10 != null) goto L_0x00af;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097 A[SYNTHETIC, Splitter:B:49:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3 A[SYNTHETIC, Splitter:B:54:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b6 A[SYNTHETIC, Splitter:B:63:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c2 A[SYNTHETIC, Splitter:B:68:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ce  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m117887d(java.lang.String r10) {
        /*
            java.lang.String r0 = ""
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            java.lang.String r3 = "MicroMsg.exdevice.ExDeviceUtil"
            java.lang.String r4 = "url %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r1)
            r1 = 0
            com.tencent.mm.network.b0 r10 = com.tencent.p014mm.network.C81035d.m98963d(r10, r1)     // Catch:{ Exception -> 0x008c, all -> 0x0086 }
            java.lang.String r4 = "GET"
            r10.mo112930l(r4)     // Catch:{ Exception -> 0x0083, all -> 0x007e }
            r4 = 25000(0x61a8, float:3.5032E-41)
            r10.mo112919d(r4)     // Catch:{ Exception -> 0x0083, all -> 0x007e }
            r10.mo112923g(r4)     // Catch:{ Exception -> 0x0083, all -> 0x007e }
            java.io.InputStream r4 = r10.getInputStream()     // Catch:{ Exception -> 0x0083, all -> 0x007e }
            int r5 = r10.mo112916a()     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x0069
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            r5.<init>()     // Catch:{ Exception -> 0x007b, all -> 0x0076 }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0067 }
        L_0x0037:
            int r7 = r4.read(r6)     // Catch:{ Exception -> 0x0067 }
            r8 = -1
            if (r7 == r8) goto L_0x0042
            r5.write(r6, r2, r7)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0037
        L_0x0042:
            r5.close()     // Catch:{ Exception -> 0x0067 }
            r4.close()     // Catch:{ Exception -> 0x0067 }
            r10.disconnect()     // Catch:{ Exception -> 0x0067 }
            byte[] r1 = r5.toByteArray()     // Catch:{ Exception -> 0x0067 }
            r5.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0059
        L_0x0053:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r0, r6)
        L_0x0059:
            r4.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x0063
        L_0x005d:
            r4 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r0, r2)
        L_0x0063:
            r10.disconnect()
            return r1
        L_0x0067:
            r6 = move-exception
            goto L_0x0090
        L_0x0069:
            if (r4 == 0) goto L_0x00af
            r4.close()     // Catch:{ IOException -> 0x006f }
            goto L_0x00af
        L_0x006f:
            r4 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r0, r2)
            goto L_0x00af
        L_0x0076:
            r5 = move-exception
            r9 = r5
            r5 = r1
            r1 = r9
            goto L_0x00b4
        L_0x007b:
            r6 = move-exception
            r5 = r1
            goto L_0x0090
        L_0x007e:
            r4 = move-exception
            r5 = r1
            r1 = r4
            r4 = r5
            goto L_0x00b4
        L_0x0083:
            r6 = move-exception
            r4 = r1
            goto L_0x008f
        L_0x0086:
            r10 = move-exception
            r4 = r1
            r5 = r4
            r1 = r10
            r10 = r5
            goto L_0x00b4
        L_0x008c:
            r6 = move-exception
            r10 = r1
            r4 = r10
        L_0x008f:
            r5 = r4
        L_0x0090:
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b3 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r0, r7)     // Catch:{ all -> 0x00b3 }
            if (r5 == 0) goto L_0x00a1
            r5.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00a1
        L_0x009b:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r0, r6)
        L_0x00a1:
            if (r4 == 0) goto L_0x00ad
            r4.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00ad
        L_0x00a7:
            r4 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r0, r2)
        L_0x00ad:
            if (r10 == 0) goto L_0x00b2
        L_0x00af:
            r10.disconnect()
        L_0x00b2:
            return r1
        L_0x00b3:
            r1 = move-exception
        L_0x00b4:
            if (r5 == 0) goto L_0x00c0
            r5.close()     // Catch:{ IOException -> 0x00ba }
            goto L_0x00c0
        L_0x00ba:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r5, r0, r6)
        L_0x00c0:
            if (r4 == 0) goto L_0x00cc
            r4.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00cc
        L_0x00c6:
            r4 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r0, r2)
        L_0x00cc:
            if (r10 == 0) goto L_0x00d1
            r10.disconnect()
        L_0x00d1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.model.C93365i.m117887d(java.lang.String):byte[]");
    }

    /* renamed from: e */
    public static Boolean m117888e(C72963f4 f4Var) {
        return (f4Var == null || f4Var.getMsgId() == 0) ? Boolean.FALSE : Boolean.valueOf(f4Var.mo100961A3());
    }

    /* renamed from: f */
    public static Boolean m117889f(C72963f4 f4Var) {
        C68070l.C68072b u;
        if (f4Var == null || f4Var.getMsgId() == 0) {
            return Boolean.FALSE;
        }
        boolean z = false;
        String content = f4Var.getContent();
        if (f4Var.mo101020w3() && (u = C68070l.C68072b.m80422u(content, (String) null)) != null && u.f195582i == 6) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: g */
    public static Boolean m117890g(C72963f4 f4Var) {
        if (f4Var == null || f4Var.getMsgId() == 0) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (f4Var.getType() == 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    public static Boolean m117891h(C72963f4 f4Var) {
        if (f4Var == null || f4Var.getMsgId() == 0) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (f4Var.getType() == 62) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: i */
    public static Boolean m117892i(C72963f4 f4Var) {
        if (f4Var == null || f4Var.getMsgId() == 0) {
            return Boolean.FALSE;
        }
        boolean z = false;
        if (f4Var.getType() == 43) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: j */
    public static void m117893j(String str, int i) {
        ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new ExDeviceSendDataToNetworkDeviceStateEvent();
        ExDeviceSendDataToNetworkDeviceStateEvent.C92487a aVar = exDeviceSendDataToNetworkDeviceStateEvent.f264737d;
        aVar.f264741c = str;
        if (i >= 100) {
            aVar.f264739a = "send_data_sucess";
        } else {
            aVar.f264739a = "send_data_sending";
        }
        aVar.f264740b = i;
        exDeviceSendDataToNetworkDeviceStateEvent.publish();
    }

    /* renamed from: k */
    public static void m117894k(String str, String str2) {
        ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new ExDeviceSendDataToNetworkDeviceStateEvent();
        ExDeviceSendDataToNetworkDeviceStateEvent.C92487a aVar = exDeviceSendDataToNetworkDeviceStateEvent.f264737d;
        aVar.f264739a = str2;
        aVar.f264741c = str;
        exDeviceSendDataToNetworkDeviceStateEvent.publish();
    }

    /* renamed from: l */
    public static void m117895l(String str, String str2, byte[] bArr) {
        ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new ExDeviceSendDataToNetworkDeviceStateEvent();
        ExDeviceSendDataToNetworkDeviceStateEvent.C92487a aVar = exDeviceSendDataToNetworkDeviceStateEvent.f264737d;
        aVar.f264739a = str2;
        aVar.f264741c = str;
        aVar.f264742d = bArr;
        exDeviceSendDataToNetworkDeviceStateEvent.publish();
    }

    /* renamed from: m */
    public static void m117896m(String str, String str2, byte[] bArr, byte[] bArr2) {
        ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = new ExDeviceSendDataToNetworkDeviceStateEvent();
        ExDeviceSendDataToNetworkDeviceStateEvent.C92487a aVar = exDeviceSendDataToNetworkDeviceStateEvent.f264737d;
        aVar.f264739a = str2;
        aVar.f264741c = str;
        aVar.f264743e = bArr2;
        aVar.f264742d = bArr;
        exDeviceSendDataToNetworkDeviceStateEvent.publish();
    }
}
