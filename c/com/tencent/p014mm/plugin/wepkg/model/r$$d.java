package com.tencent.p014mm.plugin.wepkg.model;

import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;

/* renamed from: com.tencent.mm.plugin.wepkg.model.r$$d */
public class r$$d implements C80883e<IPCString, IPCBoolean> {
    private r$$d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0146, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0147, code lost:
        r6 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014c, code lost:
        r12 = null;
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x00aa] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(java.lang.Object r19, com.tencent.p014mm.ipcinvoker.C1256g r20) {
        /*
            r18 = this;
            r1 = r20
            r0 = r19
            com.tencent.mm.ipcinvoker.type.IPCString r0 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r0
            java.lang.Class<tt.e> r2 = p244tt.C14088e.class
            java.lang.String r3 = "MicroMsg.Wepkg.WepkgUpdater"
            java.lang.String r4 = "updateLiteApp in mm process"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            java.lang.String r0 = r0.f10315d
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r0 = com.tencent.p014mm.plugin.wepkg.model.C44509m.m48884e(r0)
            r4 = 0
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "updateLiteApp, wepkgVersion is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r0.<init>(r4)
            r1.mo894a(r0)
            goto L_0x01e9
        L_0x0027:
            java.lang.String r5 = r0.f120654g
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 == 0) goto L_0x003e
            java.lang.String r0 = "pkgPath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r0.<init>(r4)
            r1.mo894a(r0)
            goto L_0x01e9
        L_0x003e:
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            java.lang.String r0 = r0.f120654g
            r5.<init>((java.lang.String) r0)
            boolean r0 = r5.mo119967g()
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "file not exists"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r0.<init>(r4)
            r1.mo894a(r0)
            goto L_0x01e9
        L_0x005a:
            com.tencent.mm.plugin.wepkg.model.j r3 = new com.tencent.mm.plugin.wepkg.model.j
            r3.<init>(r5)
            boolean r0 = r3.f120692b
            if (r0 == 0) goto L_0x01e1
            java.util.LinkedList<te3.oe0> r0 = r3.f120696f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            java.lang.String r5 = "MicroMsg.Wepkg.WePkgReader"
            if (r0 != 0) goto L_0x0170
            int r0 = r3.f120694d
            r7 = 4
            if (r0 >= r7) goto L_0x0074
            goto L_0x0170
        L_0x0074:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.LinkedList<te3.oe0> r0 = r3.f120696f
            java.util.Iterator r8 = r0.iterator()
        L_0x007f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x016e
            java.lang.Object r0 = r8.next()
            te3.oe0 r0 = (te3.C50667oe0) r0
            te3.xr1 r9 = r0.f139108i
            if (r9 == 0) goto L_0x007f
            java.lang.String r9 = r9.f144894f
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x007f
            com.tencent.mm.plugin.wepkg.model.g r9 = new com.tencent.mm.plugin.wepkg.model.g
            r9.<init>()
            te3.xr1 r10 = r0.f139108i
            java.lang.String r11 = r10.f144892d
            r9.f120684a = r11
            java.lang.String r11 = r10.f144895g
            r9.f120685b = r11
            java.lang.String r10 = r10.f144896h
            r9.f120686c = r10
            pb3.b r10 = new pb3.b     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            com.tencent.mm.vfs.m1 r12 = r3.f120691a     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            int r11 = r3.f120694d     // Catch:{ Exception -> 0x014f, all -> 0x014b }
            long r13 = (long) r11
            r17 = r7
            long r6 = r0.f139104e     // Catch:{ Exception -> 0x0146, all -> 0x014b }
            long r13 = r13 + r6
            int r0 = r0.f139105f     // Catch:{ Exception -> 0x0146, all -> 0x014b }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0146, all -> 0x014b }
            r11 = r10
            r15 = r6
            r11.<init>(r12, r13, r15)     // Catch:{ Exception -> 0x0146, all -> 0x014b }
            java.lang.String r0 = r9.f120684a     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            java.lang.String r0 = com.tencent.p014mm.plugin.wepkg.model.C6642f.m6926a(r0)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            if (r6 != 0) goto L_0x00cd
            com.tencent.p014mm.vfs.C86013q1.m106461v(r0)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
        L_0x00cd:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            r6.<init>()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            r6.append(r0)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            java.lang.String r7 = r9.f120686c     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            r6.append(r7)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            java.lang.String r11 = r7.getPath()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            if (r11 == 0) goto L_0x0102
            java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r4, r4)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            java.lang.String r12 = r7.getPath()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            boolean r12 = r12.equals(r11)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            if (r12 != 0) goto L_0x0102
            android.net.Uri$Builder r7 = r7.buildUpon()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            android.net.Uri$Builder r7 = r7.path(r11)     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            android.net.Uri r7 = r7.build()     // Catch:{ Exception -> 0x0140, all -> 0x013c }
        L_0x0102:
            com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0140, all -> 0x013c }
            r12 = 0
            com.tencent.mm.vfs.f0$h r11 = r11.mo177799l(r7, r12)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106425G(r7, r11, r4)     // Catch:{ Exception -> 0x0138, all -> 0x0136 }
            r11 = 4096(0x1000, float:5.74E-42)
            byte[] r13 = new byte[r11]     // Catch:{ Exception -> 0x0132 }
        L_0x0111:
            int r14 = r10.read(r13, r4, r11)     // Catch:{ Exception -> 0x0132 }
            r15 = -1
            if (r14 == r15) goto L_0x011c
            r7.write(r13, r4, r14)     // Catch:{ Exception -> 0x0132 }
            goto L_0x0111
        L_0x011c:
            r7.flush()     // Catch:{ Exception -> 0x0132 }
            di3.d r11 = di3.C86312j.m106911c(r2)     // Catch:{ Exception -> 0x0132 }
            tt.e r11 = (p244tt.C14088e) r11     // Catch:{ Exception -> 0x0132 }
            r11.j00(r6, r0)     // Catch:{ Exception -> 0x0132 }
            r9.f120687d = r0     // Catch:{ Exception -> 0x0132 }
            r6 = r17
            r6.add(r9)     // Catch:{ Exception -> 0x0130 }
            goto L_0x015b
        L_0x0130:
            r0 = move-exception
            goto L_0x0154
        L_0x0132:
            r0 = move-exception
            r6 = r17
            goto L_0x0154
        L_0x0136:
            r0 = move-exception
            goto L_0x013e
        L_0x0138:
            r0 = move-exception
            r6 = r17
            goto L_0x0144
        L_0x013c:
            r0 = move-exception
            r12 = 0
        L_0x013e:
            r6 = r10
            goto L_0x0167
        L_0x0140:
            r0 = move-exception
            r6 = r17
            r12 = 0
        L_0x0144:
            r7 = r12
            goto L_0x0154
        L_0x0146:
            r0 = move-exception
            r6 = r17
        L_0x0149:
            r12 = 0
            goto L_0x0152
        L_0x014b:
            r0 = move-exception
            r12 = 0
            r6 = r12
            goto L_0x0167
        L_0x014f:
            r0 = move-exception
            r6 = r7
            goto L_0x0149
        L_0x0152:
            r7 = r12
            r10 = r7
        L_0x0154:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0164 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)     // Catch:{ all -> 0x0164 }
        L_0x015b:
            rd3.C48020a.m53388e(r10)
            rd3.C48020a.m53388e(r7)
            r7 = r6
            goto L_0x007f
        L_0x0164:
            r0 = move-exception
            r6 = r10
            r12 = r7
        L_0x0167:
            rd3.C48020a.m53388e(r6)
            rd3.C48020a.m53388e(r12)
            throw r0
        L_0x016e:
            r6 = r7
            goto L_0x0177
        L_0x0170:
            r12 = 0
            java.lang.String r0 = "mFileIndexList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r6 = r12
        L_0x0177:
            java.util.Iterator r0 = r6.iterator()
        L_0x017b:
            boolean r3 = r0.hasNext()
            r5 = 1
            if (r3 == 0) goto L_0x01d8
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.wepkg.model.g r3 = (com.tencent.p014mm.plugin.wepkg.model.C44497g) r3
            di3.d r6 = di3.C86312j.m106911c(r2)
            tt.e r6 = (p244tt.C14088e) r6
            java.lang.String r7 = r3.f120684a
            com.tencent.liteapp.storage.WxaLiteAppInfo r6 = r6.mo13509NR(r7)
            if (r6 == 0) goto L_0x01af
            java.lang.String r6 = r6.f339297n
            if (r6 == 0) goto L_0x01af
            java.lang.String r7 = r3.f120686c
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01af
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r3.f120686c
            r5[r4] = r6
            java.lang.String r6 = "MicroMsg.GameCenterLiteAppManager"
            java.lang.String r7 = "updateLiteAppInfo, patchId is same : "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r5)
        L_0x01af:
            com.tencent.liteapp.storage.WxaLiteAppInfo r5 = new com.tencent.liteapp.storage.WxaLiteAppInfo
            r5.<init>()
            java.lang.String r6 = r3.f120684a
            r5.f339290d = r6
            java.lang.String r6 = r3.f120686c
            r5.f339297n = r6
            java.lang.String r6 = r3.f120687d
            r5.f339295i = r6
            java.lang.String r3 = r3.f120685b
            r5.f339294h = r3
            java.lang.String r3 = "release"
            r5.f339296j = r3
            long r6 = java.lang.System.currentTimeMillis()
            r5.f339301r = r6
            di3.d r3 = di3.C86312j.m106911c(r2)
            tt.e r3 = (p244tt.C14088e) r3
            r3.t70(r5)
            goto L_0x017b
        L_0x01d8:
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r0.<init>(r5)
            r1.mo894a(r0)
            goto L_0x01e9
        L_0x01e1:
            com.tencent.mm.ipcinvoker.type.IPCBoolean r0 = new com.tencent.mm.ipcinvoker.type.IPCBoolean
            r0.<init>(r4)
            r1.mo894a(r0)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wepkg.model.r$$d.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
    }
}
