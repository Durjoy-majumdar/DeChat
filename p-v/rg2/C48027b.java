package rg2;

import f40.C31896o0;

/* renamed from: rg2.b */
public final class C48027b implements C31896o0.C31897a {
    /* JADX WARNING: Removed duplicated region for block: B:118:0x023e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x024d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0123  */
    /* renamed from: aJ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58416aJ(int r18) {
        /*
            r17 = this;
            sg.g<java.lang.Integer, te3.dp3> r0 = qg2.C101147j0.f296056a
            java.lang.String r0 = "MicroMsg.RecordMsgLogic"
            java.lang.String r1 = "makeSureRecord2FolderExist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = qg2.C101147j0.m132644y()
            r2.append(r3)
            java.lang.String r3 = "record2/"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            boolean r2 = r1.mo119967g()
            r3 = 951(0x3b7, float:1.333E-42)
            if (r2 == 0) goto L_0x004c
            boolean r2 = r1.mo119977o()
            if (r2 != 0) goto L_0x0044
            java.lang.String r2 = "record2Folder is not directory, delete it"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 23
            r2.mo175911u(r3, r4)
            r1.mo119966f()
            goto L_0x004c
        L_0x0044:
            java.lang.String r1 = "record2 exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            goto L_0x027d
        L_0x004c:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r4 = qg2.C101147j0.m132644y()
            r2.<init>((java.lang.String) r4)
            boolean r4 = r2.mo119967g()
            if (r4 != 0) goto L_0x0069
            boolean r4 = r2.mo119987x()
            if (r4 != 0) goto L_0x0069
            java.lang.String r1 = "oldFolder mkdir failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x027d
        L_0x0069:
            boolean r4 = r1.mo119987x()
            if (r4 != 0) goto L_0x0277
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 24
            r4.mo175911u(r3, r5)
            java.lang.String[] r4 = r2.mo119981s()
            r5 = 0
            r6 = 2
            r7 = -1
            r9 = 1
            r10 = 0
            if (r4 == 0) goto L_0x0112
            r11 = 0
        L_0x0083:
            int r12 = r4.length
            if (r11 >= r12) goto L_0x0112
            r12 = r4[r11]
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r12, r7)
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x010a
            com.tencent.mm.vfs.m1 r15 = new com.tencent.mm.vfs.m1
            r15.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r12)
            boolean r12 = r15.mo119967g()
            if (r12 == 0) goto L_0x010a
            boolean r12 = r15.mo119977o()
            if (r12 == 0) goto L_0x010a
            java.lang.String r12 = qg2.C101147j0.m132608A(r13)
            android.net.Uri r3 = r15.f250486d
            if (r3 != 0) goto L_0x00b3
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            android.net.Uri$Builder r3 = r3.path(r12)
            goto L_0x00c0
        L_0x00b3:
            android.net.Uri$Builder r3 = r3.buildUpon()
            boolean r16 = r12.isEmpty()
            if (r16 != 0) goto L_0x00c0
            r3.appendPath(r12)
        L_0x00c0:
            android.net.Uri r16 = r3.build()
            java.lang.String r7 = r16.getPath()
            if (r7 == 0) goto L_0x00e0
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r10, r10)
            java.lang.String r8 = r16.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x00e0
            android.net.Uri$Builder r3 = r3.path(r7)
            android.net.Uri r16 = r3.build()
        L_0x00e0:
            r3 = r16
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r7.mo177799l(r3, r5)
            boolean r7 = r3.mo177810a()
            if (r7 != 0) goto L_0x00f0
            r3 = 0
            goto L_0x00f8
        L_0x00f0:
            com.tencent.mm.vfs.FileSystem$c r7 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            boolean r3 = r7.mo119948x(r3)
        L_0x00f8:
            if (r3 == 0) goto L_0x0115
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Long r7 = java.lang.Long.valueOf(r13)
            r3[r10] = r7
            r3[r9] = r12
            java.lang.String r7 = "weird, subMsgFolder exist:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r7, r3)
        L_0x010a:
            int r11 = r11 + 1
            r3 = 951(0x3b7, float:1.333E-42)
            r7 = -1
            goto L_0x0083
        L_0x0112:
            r15 = r5
            r13 = -1
        L_0x0115:
            if (r15 == 0) goto L_0x027d
            boolean r2 = r15.mo119967g()
            if (r2 == 0) goto L_0x027d
            r2 = -1
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x027d
            java.lang.String r2 = qg2.C101147j0.m132608A(r13)
            android.net.Uri r3 = r15.f250486d
            if (r3 != 0) goto L_0x0135
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            android.net.Uri$Builder r3 = r3.path(r2)
            goto L_0x0142
        L_0x0135:
            android.net.Uri$Builder r3 = r3.buildUpon()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0142
            r3.appendPath(r2)
        L_0x0142:
            android.net.Uri r4 = r3.build()
            java.lang.String r7 = r4.getPath()
            if (r7 == 0) goto L_0x0162
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r10, r10)
            java.lang.String r8 = r4.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0162
            android.net.Uri$Builder r3 = r3.path(r7)
            android.net.Uri r4 = r3.build()
        L_0x0162:
            java.lang.String r3 = java.lang.String.valueOf(r13)
            if (r4 != 0) goto L_0x0172
            android.net.Uri$Builder r4 = new android.net.Uri$Builder
            r4.<init>()
            android.net.Uri$Builder r3 = r4.path(r3)
            goto L_0x0180
        L_0x0172:
            android.net.Uri$Builder r4 = r4.buildUpon()
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x017f
            r4.appendPath(r3)
        L_0x017f:
            r3 = r4
        L_0x0180:
            android.net.Uri r4 = r3.build()
            java.lang.String r7 = r4.getPath()
            if (r7 == 0) goto L_0x01a0
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r10, r10)
            java.lang.String r8 = r4.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x01a0
            android.net.Uri$Builder r3 = r3.path(r7)
            android.net.Uri r4 = r3.build()
        L_0x01a0:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r3 = r3.mo177799l(r4, r5)
            boolean r7 = r3.mo177810a()
            if (r7 != 0) goto L_0x01ae
            r3 = 0
            goto L_0x01b6
        L_0x01ae:
            com.tencent.mm.vfs.FileSystem$c r7 = r3.f348991a
            java.lang.String r3 = r3.f348992b
            boolean r3 = r7.mo119937g(r3)
        L_0x01b6:
            if (r3 != 0) goto L_0x01c0
            java.lang.String r1 = "subMsgFolderFileMkResult err"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x027d
        L_0x01c0:
            com.tencent.mm.vfs.m1[] r3 = r15.mo119984u()
            if (r3 == 0) goto L_0x0252
            int r7 = r3.length
            r8 = 0
        L_0x01c8:
            if (r8 >= r7) goto L_0x0252
            r11 = r3[r8]
            java.lang.String r12 = r11.getName()
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L_0x01d8
            goto L_0x024d
        L_0x01d8:
            java.lang.String r12 = r11.getName()
            if (r4 != 0) goto L_0x01e8
            android.net.Uri$Builder r13 = new android.net.Uri$Builder
            r13.<init>()
            android.net.Uri$Builder r12 = r13.path(r12)
            goto L_0x01f6
        L_0x01e8:
            android.net.Uri$Builder r13 = r4.buildUpon()
            boolean r14 = r12.isEmpty()
            if (r14 != 0) goto L_0x01f5
            r13.appendPath(r12)
        L_0x01f5:
            r12 = r13
        L_0x01f6:
            android.net.Uri r13 = r12.build()
            java.lang.String r14 = r13.getPath()
            if (r14 == 0) goto L_0x0216
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r14, r10, r10)
            java.lang.String r6 = r13.getPath()
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0216
            android.net.Uri$Builder r6 = r12.path(r14)
            android.net.Uri r13 = r6.build()
        L_0x0216:
            com.tencent.mm.vfs.f0$h r6 = r11.mo119989z()
            com.tencent.mm.vfs.f0 r12 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r12 = r12.mo177799l(r13, r5)
            boolean r13 = r6.mo177810a()
            if (r13 == 0) goto L_0x023b
            boolean r13 = r12.mo177810a()
            if (r13 != 0) goto L_0x022d
            goto L_0x023b
        L_0x022d:
            com.tencent.mm.vfs.FileSystem$c r13 = r12.f348991a     // Catch:{ IOException -> 0x023a }
            java.lang.String r12 = r12.f348992b     // Catch:{ IOException -> 0x023a }
            com.tencent.mm.vfs.FileSystem$c r14 = r6.f348991a     // Catch:{ IOException -> 0x023a }
            java.lang.String r6 = r6.f348992b     // Catch:{ IOException -> 0x023a }
            boolean r6 = r13.mo119946t(r12, r14, r6)     // Catch:{ IOException -> 0x023a }
            goto L_0x023c
        L_0x023a:
        L_0x023b:
            r6 = 0
        L_0x023c:
            if (r6 != 0) goto L_0x024d
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.String r2 = r11.mo119971i()
            r1[r10] = r2
            java.lang.String r2 = "moveFile err:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
            goto L_0x027d
        L_0x024d:
            int r8 = r8 + 1
            r6 = 2
            goto L_0x01c8
        L_0x0252:
            java.lang.String r2 = r15.mo119971i()
            boolean r1 = r15.mo119988y(r1)
            if (r1 == 0) goto L_0x0265
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 25
            r5 = 951(0x3b7, float:1.333E-42)
            r3.mo175911u(r5, r4)
        L_0x0265:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3[r10] = r1
            r3[r9] = r2
            java.lang.String r1 = "record2 renameResult:%s before:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r3)
            goto L_0x027d
        L_0x0277:
            java.lang.String r1 = "record2 direct mkdir succ"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x027d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rg2.C48027b.mo58416aJ(int):void");
    }
}
