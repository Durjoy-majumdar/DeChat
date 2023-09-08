package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.a */
public final class C82406a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ List<C13604l<String, String>> f241479d;

    /* renamed from: e */
    public final /* synthetic */ String f241480e;

    /* renamed from: f */
    public final /* synthetic */ QualitySessionRuntime f241481f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82406a(List<C13604l<String, String>> list, String str, QualitySessionRuntime qualitySessionRuntime) {
        super(0);
        this.f241479d = list;
        this.f241480e = str;
        this.f241481f = qualitySessionRuntime;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r16 = this;
            r1 = r16
            java.util.List<rx3.l<java.lang.String, java.lang.String>> r0 = r1.f241479d
            java.lang.String r2 = r1.f241480e
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r3 = r1.f241481f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r5 = r0.hasNext()
            java.lang.String r8 = "MicroMsg.AppBrand.AppBrandFileOccupationReporter"
            r9 = 3
            r10 = 2
            r11 = 0
            r12 = 1
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r5 = r0.next()
            rx3.l r5 = (rx3.C13604l) r5
            B r13 = r5.f38556e
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L_0x0032
            boolean r14 = z04.C112551y.m153811k(r13)
            if (r14 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r14 = 0
            goto L_0x0033
        L_0x0032:
            r14 = 1
        L_0x0033:
            r15 = 0
            if (r14 == 0) goto L_0x0043
            java.lang.Object[] r6 = new java.lang.Object[r12]
            A r5 = r5.f38555d
            r6[r11] = r5
            java.lang.String r5 = "reportOccupation: prefix = [%s] got a null path"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r5, r6)
            goto L_0x009f
        L_0x0043:
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct r8 = new com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct
            r8.<init>()
            r6 = 0
            r8.f236566j = r6
            java.lang.String r6 = "AppId"
            java.lang.String r6 = r8.mo86045b(r6, r2, r12)
            r8.f236560d = r6
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r6 = com.tencent.p014mm.plugin.appbrand.C81682d.m100225e(r2)
            if (r6 == 0) goto L_0x0062
            com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r6 = r6.f261072r
            int r6 = r6.pkgVersion
            long r6 = (long) r6
            r8.f236561e = r6
            goto L_0x0067
        L_0x0062:
            int r6 = r3.f245837i
            long r6 = (long) r6
            r8.f236561e = r6
        L_0x0067:
            int r6 = r3.f245834f
            if (r6 == r12) goto L_0x0076
            if (r6 == r10) goto L_0x0073
            if (r6 == r9) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a r15 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct.C80750a.demo
            goto L_0x0078
        L_0x0073:
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a r15 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct.C80750a.debug
            goto L_0x0078
        L_0x0076:
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct$a r15 = com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct.C80750a.release
        L_0x0078:
            r8.f236562f = r15
            int r6 = r3.f245835g
            long r6 = (long) r6
            r8.f236563g = r6
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            r6.<init>((java.lang.String) r13)
            long r6 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r6)
            double r6 = (double) r6
            r9 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r6 = r6 / r9
            long r6 = iy3.C60641c.m70922c(r6)
            r8.f236564h = r6
            A r5 = r5.f38555d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "DirPrefix"
            java.lang.String r5 = r8.mo86045b(r6, r5, r12)
            r8.f236565i = r5
            r15 = r8
        L_0x009f:
            if (r15 == 0) goto L_0x0011
            r4.add(r15)
            goto L_0x0011
        L_0x00a6:
            java.util.Iterator r2 = r4.iterator()
        L_0x00aa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = r2.next()
            com.tencent.mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct r0 = (com.tencent.p014mm.autogen.mmdata.rpt.WeAppFileSystemTempFileLastOccupationStatStruct) r0
            java.lang.String r3 = "tmp"
            java.lang.String r4 = "usr"
            java.lang.String r5 = "opendata"
            java.lang.String r6 = "ad"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4, r5, r6}
            java.util.List r4 = sx3.C110821n.m150958e(r4)
            java.lang.String r5 = r0.f236565i
            boolean r4 = r4.contains(r5)
            if (r4 != 0) goto L_0x00de
            java.lang.Object[] r3 = new java.lang.Object[r12]
            java.lang.String r0 = r0.f236565i
            r3[r11] = r0
            java.lang.String r0 = "reportOccupation: no need report prefix = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r0, r3)
            goto L_0x00aa
        L_0x00de:
            java.lang.String r4 = r0.f236565i
            boolean r3 = gy3.C87412m.m108589b(r4, r3)
            if (r3 == 0) goto L_0x0131
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0117 }
            int r4 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1.f241503f     // Catch:{ Exception -> 0x0117 }
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager.f238909a     // Catch:{ Exception -> 0x0117 }
            r3.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0117 }
            long r3 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99869c(r3)     // Catch:{ Exception -> 0x0117 }
            double r3 = (double) r3
            r5 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r3 = r3 / r5
            long r3 = iy3.C60641c.m70922c(r3)     // Catch:{ Exception -> 0x0115 }
            r0.f236567k = r3     // Catch:{ Exception -> 0x0115 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0115 }
            r3.<init>()     // Catch:{ Exception -> 0x0115 }
            java.lang.String r4 = "reportOccupation total temp folder size: "
            r3.append(r4)     // Catch:{ Exception -> 0x0115 }
            long r13 = r0.f236567k     // Catch:{ Exception -> 0x0115 }
            r3.append(r13)     // Catch:{ Exception -> 0x0115 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0115 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)     // Catch:{ Exception -> 0x0115 }
            goto L_0x0133
        L_0x0115:
            r0 = move-exception
            goto L_0x011a
        L_0x0117:
            r0 = move-exception
            r5 = 4652218415073722368(0x4090000000000000, double:1024.0)
        L_0x011a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "reportOccupation total temp folder get exception:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)
            goto L_0x00aa
        L_0x0131:
            r5 = 4652218415073722368(0x4090000000000000, double:1024.0)
        L_0x0133:
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r0.f236560d
            r3[r11] = r4
            java.lang.String r4 = r0.f236565i
            r3[r12] = r4
            long r13 = r0.f236564h
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r3[r10] = r4
            long r13 = r0.f236567k
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r3[r9] = r4
            java.lang.String r4 = "reportOccupation: (appId,prefix,occupation,total) = [%s,%s,%d,%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r4, r3)
            r0.mo86054n()
            goto L_0x00aa
        L_0x0159:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.file.C82406a.invoke():java.lang.Object");
    }
}
