package n90;

import java.util.concurrent.Callable;

/* renamed from: n90.d */
public final class C11143d<V> implements Callable {

    /* renamed from: d */
    public static final C11143d<V> f32919d = new C11143d<>();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r28 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            ej.c r1 = p149ej.C107276c.f320945a
            java.lang.String r2 = p149ej.C107276c.f320950f
            java.lang.String r3 = "camera2SupportLevelsCache"
            r4 = 0
            if (r2 != 0) goto L_0x0032
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r2 = r2.getString(r3, r4)
            if (r2 != 0) goto L_0x0025
            r1.mo157748a()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r2 = p149ej.C107276c.f320950f
            r1.putString(r3, r2)
            goto L_0x0042
        L_0x0025:
            boolean r3 = p149ej.C107276c.f320947c
            if (r3 == 0) goto L_0x002c
            p149ej.C107276c.f320950f = r2
            goto L_0x0044
        L_0x002c:
            r1.mo157748a()
            java.lang.String r2 = p149ej.C107276c.f320950f
            goto L_0x0044
        L_0x0032:
            int r2 = p149ej.C107276c.f320949e
            if (r2 != 0) goto L_0x0042
            r1.mo157748a()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r2 = p149ej.C107276c.f320950f
            r1.putString(r3, r2)
        L_0x0042:
            java.lang.String r2 = p149ej.C107276c.f320950f
        L_0x0044:
            r1 = 2
            java.lang.String r3 = "MicroMsg.Camera2ProcessIDKeyStat"
            r12 = 3
            r13 = 1
            r14 = 0
            if (r2 == 0) goto L_0x015f
            java.lang.String r5 = "+"
            java.lang.String[] r6 = new java.lang.String[]{r5}
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r2
            java.util.List r5 = z04.C112550d0.m153785U(r5, r6, r7, r8, r9, r10)
            java.util.Iterator r5 = r5.iterator()
            r6 = r4
            r7 = r6
            r10 = r7
            r8 = 0
            r9 = 0
            r15 = 0
        L_0x0065:
            boolean r16 = r5.hasNext()
            if (r16 == 0) goto L_0x0165
            java.lang.Object r16 = r5.next()
            r17 = r16
            java.lang.String r17 = (java.lang.String) r17
            java.lang.String r16 = "-"
            java.lang.String[] r18 = new java.lang.String[]{r16}
            r19 = 0
            r20 = 0
            r21 = 6
            r22 = 0
            java.util.List r16 = z04.C112550d0.m153785U(r17, r18, r19, r20, r21, r22)
            int r4 = r16.size()
            if (r4 < r12) goto L_0x008d
            r4 = 1
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r4 == 0) goto L_0x0093
            r4 = r16
            goto L_0x0094
        L_0x0093:
            r4 = 0
        L_0x0094:
            if (r4 == 0) goto L_0x015a
            java.lang.Object r16 = r4.get(r14)
            java.lang.String r16 = (java.lang.String) r16
            java.lang.Object r18 = r4.get(r13)
            r14 = r18
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r4 = r4.get(r1)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r18 = z04.C66731x.m78731e(r14)
            if (r18 == 0) goto L_0x0114
            int r11 = r18.intValue()
            if (r11 == 0) goto L_0x0104
            if (r11 == r13) goto L_0x00f3
            if (r11 == r1) goto L_0x00e2
            if (r11 == r12) goto L_0x00d1
            r12 = 4
            if (r11 == r12) goto L_0x00c0
            goto L_0x0114
        L_0x00c0:
            java.lang.String r11 = "markCamera2SupportEXTERNAL"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 23
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x0114
        L_0x00d1:
            java.lang.String r11 = "markCamera2SupportLEVEL3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 22
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x0114
        L_0x00e2:
            java.lang.String r11 = "markCamera2SupportLEGACY"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 21
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x0114
        L_0x00f3:
            java.lang.String r11 = "markCamera2SupportFULL"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 20
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x0114
        L_0x0104:
            java.lang.String r11 = "markCamera2SupportLIMITED"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r11)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 19
            r26 = 1
            r21.mo175913w(r22, r24, r26)
        L_0x0114:
            java.lang.Integer r11 = z04.C66731x.m78731e(r4)
            if (r11 == 0) goto L_0x012e
            int r11 = r11.intValue()
            if (r11 == 0) goto L_0x0129
            if (r11 == r13) goto L_0x0123
            goto L_0x012e
        L_0x0123:
            if (r7 != 0) goto L_0x0126
            r7 = r14
        L_0x0126:
            int r9 = r9 + 1
            goto L_0x012e
        L_0x0129:
            if (r6 != 0) goto L_0x012c
            r6 = r14
        L_0x012c:
            int r8 = r8 + 1
        L_0x012e:
            boolean r11 = gy3.C87412m.m108589b(r10, r14)
            if (r11 != 0) goto L_0x0147
            if (r10 == 0) goto L_0x0147
            java.lang.String r10 = "markSupportLevelDiffCameras"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r10)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 30
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            r15 = 1
        L_0x0147:
            java.lang.Integer r10 = z04.C66731x.m78731e(r16)
            if (r10 == 0) goto L_0x0159
            int r10 = r10.intValue()
            n90.c$a r11 = new n90.c$a
            r11.<init>(r10, r4, r14)
            r0.add(r11)
        L_0x0159:
            r10 = r14
        L_0x015a:
            r4 = 0
            r12 = 3
            r14 = 0
            goto L_0x0065
        L_0x015f:
            r2 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r15 = 0
        L_0x0165:
            ej.c r0 = p149ej.C107276c.f320945a
            int r4 = p149ej.C107276c.f320949e
            java.lang.String r5 = "camera2NumberInfoCache"
            r10 = -1
            if (r4 != r10) goto L_0x019a
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            int r4 = r4.getInt(r5, r10)
            if (r4 != r10) goto L_0x0185
            r0.mo157749b()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            int r4 = p149ej.C107276c.f320949e
            r0.putInt(r5, r4)
            goto L_0x01a8
        L_0x0185:
            boolean r5 = p149ej.C107276c.f320947c
            if (r5 == 0) goto L_0x0194
            if (r4 != 0) goto L_0x0191
            r0.mo157749b()
            int r4 = p149ej.C107276c.f320949e
            goto L_0x01aa
        L_0x0191:
            p149ej.C107276c.f320949e = r4
            goto L_0x01aa
        L_0x0194:
            r0.mo157749b()
            int r4 = p149ej.C107276c.f320949e
            goto L_0x01aa
        L_0x019a:
            if (r4 != 0) goto L_0x01a8
            r0.mo157749b()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            int r4 = p149ej.C107276c.f320949e
            r0.putInt(r5, r4)
        L_0x01a8:
            int r4 = p149ej.C107276c.f320949e
        L_0x01aa:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            int r4 = r0.intValue()
            if (r4 == r10) goto L_0x01b6
            r4 = 1
            goto L_0x01b7
        L_0x01b6:
            r4 = 0
        L_0x01b7:
            if (r4 == 0) goto L_0x01bb
            r4 = r0
            goto L_0x01bc
        L_0x01bb:
            r4 = 0
        L_0x01bc:
            if (r4 == 0) goto L_0x020c
            int r0 = r4.intValue()
            if (r0 == 0) goto L_0x01fb
            if (r0 == r13) goto L_0x01ea
            if (r0 == r1) goto L_0x01d9
            java.lang.String r4 = "markCameraNumberMoreThanTwo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 29
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x020d
        L_0x01d9:
            java.lang.String r4 = "markCameraNumberHasTwo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 28
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x020d
        L_0x01ea:
            java.lang.String r4 = "markCameraNumberHasOne "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 27
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x020d
        L_0x01fb:
            java.lang.String r4 = "markCameraNumberAllBeenRemove "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 1099(0x44b, double:5.43E-321)
            r24 = 26
            r26 = 1
            r21.mo175913w(r22, r24, r26)
            goto L_0x020d
        L_0x020c:
            r0 = -1
        L_0x020d:
            if (r0 == r10) goto L_0x027c
            if (r2 == 0) goto L_0x027c
            if (r6 == 0) goto L_0x027c
            if (r7 == 0) goto L_0x027c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "markReportCamera2Info "
            r4.append(r5)
            r4.append(r0)
            r5 = 44
            r4.append(r5)
            r4.append(r2)
            r4.append(r5)
            r4.append(r15)
            r4.append(r5)
            r4.append(r6)
            r4.append(r5)
            r4.append(r7)
            r4.append(r5)
            r4.append(r8)
            r4.append(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 0
            r4[r5] = r0
            r4[r13] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r4[r1] = r0
            r0 = 3
            r4[r0] = r6
            r0 = 4
            r4[r0] = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1 = 5
            r4[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1 = 6
            r4[r1] = r0
            r0 = 22109(0x565d, float:3.0981E-41)
            r3.mo160131h(r0, r4)
        L_0x027c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n90.C11143d.call():java.lang.Object");
    }
}
