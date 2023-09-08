package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.k1 */
public class C82735k1 extends C82268c {
    private static final int CTRL_INDEX = 733;
    public static final String NAME = "compressVideo";

    /* renamed from: g */
    public AtomicBoolean f242053g = new AtomicBoolean(false);

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019c  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r18, org.json.JSONObject r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f242053g
            boolean r4 = r4.get()
            java.lang.String r5 = "MicroMsg.JsApiCompressVideo"
            if (r4 == 0) goto L_0x0021
            java.lang.String r2 = "is compressing now"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            java.lang.String r2 = "fail:is compressing now"
            java.lang.String r2 = r0.mo115109j(r2)
            r1.mo109647a(r3, r2)
            return
        L_0x0021:
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = "fail:component is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            return
        L_0x0029:
            java.lang.String r4 = "fail:invalid data"
            if (r2 != 0) goto L_0x003a
            java.lang.String r2 = "fail:data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = r0.mo115109j(r4)
            r1.mo109647a(r3, r2)
            return
        L_0x003a:
            java.lang.String r6 = "src"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 == 0) goto L_0x0054
            java.lang.String r2 = "fail:data src is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = r0.mo115109j(r4)
            r1.mo109647a(r3, r2)
            return
        L_0x0054:
            java.lang.String r7 = "wxfile://"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x006c
            java.lang.String r2 = "fail:src path not supported"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = "fail:src path not be supported"
            java.lang.String r2 = r0.mo115109j(r2)
            r1.mo109647a(r3, r2)
            return
        L_0x006c:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r7 = r18.getFileSystem()
            if (r7 != 0) goto L_0x0081
            java.lang.String r2 = "fail:runtime fileSystem is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = "fail:internal error"
            java.lang.String r2 = r0.mo115109j(r2)
            r1.mo109647a(r3, r2)
            return
        L_0x0081:
            com.tencent.mm.vfs.m1 r6 = r7.getAbsoluteFile(r6)
            java.lang.String r7 = "fail:file doesn't exist"
            if (r6 != 0) goto L_0x0096
            java.lang.String r2 = "fail:srcFile is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = r0.mo115109j(r7)
            r1.mo109647a(r3, r2)
            return
        L_0x0096:
            java.lang.String r6 = r6.mo119971i()
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r8 != 0) goto L_0x00ad
            java.lang.String r2 = "fail:filePath is null or without exist file"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = r0.mo115109j(r7)
            r1.mo109647a(r3, r2)
            return
        L_0x00ad:
            java.lang.String r7 = "quality"
            boolean r8 = r2.has(r7)
            java.lang.String r9 = "fps"
            java.lang.String r10 = "resolution"
            java.lang.String r11 = "bitrate"
            if (r8 != 0) goto L_0x00dc
            boolean r8 = r2.has(r11)
            if (r8 != 0) goto L_0x00dc
            boolean r8 = r2.has(r9)
            if (r8 != 0) goto L_0x00dc
            boolean r8 = r2.has(r10)
            if (r8 != 0) goto L_0x00dc
            java.lang.String r2 = "no quality config"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = r0.mo115109j(r4)
            r1.mo109647a(r3, r2)
            return
        L_0x00dc:
            boolean r4 = r2.has(r7)
            r8 = 2
            r12 = 0
            r13 = 1
            if (r4 == 0) goto L_0x01da
            java.lang.String r4 = "compress with quality config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            java.lang.String r2 = r2.optString(r7)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r12] = r2
            java.lang.String r7 = "quality: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$b r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.m101485c(r6)
            if (r4 != 0) goto L_0x0101
            r5 = 720(0x2d0, float:1.009E-42)
            goto L_0x0103
        L_0x0101:
            int r5 = r4.f242023e
        L_0x0103:
            if (r4 != 0) goto L_0x0108
            r4 = 540(0x21c, float:7.57E-43)
            goto L_0x010a
        L_0x0108:
            int r4 = r4.f242024f
        L_0x010a:
            r2.getClass()
            int r7 = r2.hashCode()
            r9 = -1078030475(0xffffffffbfbe8f75, float:-1.488753)
            if (r7 == r9) goto L_0x0137
            r9 = 107348(0x1a354, float:1.50427E-40)
            if (r7 == r9) goto L_0x012c
            r9 = 3202466(0x30dda2, float:4.48761E-39)
            if (r7 == r9) goto L_0x0121
            goto L_0x013f
        L_0x0121:
            java.lang.String r7 = "high"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x012a
            goto L_0x013f
        L_0x012a:
            r2 = 2
            goto L_0x0142
        L_0x012c:
            java.lang.String r7 = "low"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0135
            goto L_0x013f
        L_0x0135:
            r2 = 1
            goto L_0x0142
        L_0x0137:
            java.lang.String r7 = "medium"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L_0x0141
        L_0x013f:
            r2 = -1
            goto L_0x0142
        L_0x0141:
            r2 = 0
        L_0x0142:
            if (r2 == 0) goto L_0x019c
            if (r2 == r13) goto L_0x0178
            if (r2 == r8) goto L_0x014b
            r2 = 0
            goto L_0x01c7
        L_0x014b:
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.f2$a
            r7 = 0
            r8 = 0
            float r5 = (float) r5
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            float r5 = r5 * r9
            int r10 = java.lang.Math.round(r5)
            float r4 = (float) r4
            float r4 = r4 * r9
            int r9 = java.lang.Math.round(r4)
            int r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.f242011a
            float r4 = (float) r4
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r5
            int r11 = java.lang.Math.round(r4)
            float r14 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
            r4 = r2
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01c7
        L_0x0178:
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.f2$a
            r7 = 0
            r8 = 0
            float r5 = (float) r5
            r9 = 1050253722(0x3e99999a, float:0.3)
            float r5 = r5 * r9
            int r10 = java.lang.Math.round(r5)
            float r4 = (float) r4
            float r4 = r4 * r9
            int r9 = java.lang.Math.round(r4)
            int r11 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.f242011a
            float r14 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
            r4 = r2
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x01c7
        L_0x019c:
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r2 = new com.tencent.mm.plugin.appbrand.jsapi.media.f2$a
            r7 = 0
            r8 = 0
            float r5 = (float) r5
            r9 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r9
            int r10 = java.lang.Math.round(r5)
            float r4 = (float) r4
            float r4 = r4 * r9
            int r9 = java.lang.Math.round(r4)
            int r4 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.f242011a
            float r4 = (float) r4
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r4 = r4 * r5
            int r11 = java.lang.Math.round(r4)
            float r14 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
            r4 = r2
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x01c7:
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f242053g
            r4.compareAndSet(r12, r13)
            js0.r$a r4 = js0.C88024r.m109571a()
            com.tencent.mm.plugin.appbrand.jsapi.media.j1 r5 = new com.tencent.mm.plugin.appbrand.jsapi.media.j1
            r5.<init>(r0, r2, r1, r3)
            r4.postToWorker(r5)
            goto L_0x02b0
        L_0x01da:
            java.lang.String r4 = "compress with advance config"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r2.optDouble(r10, r14)
            float r4 = (float) r14
            r7 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x01fe
            int r7 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x01fe
            r7 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 * r7
            int r4 = java.lang.Math.round(r4)
            float r4 = (float) r4
            float r4 = r4 * r10
            float r4 = r4 / r7
            goto L_0x0200
        L_0x01fe:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0200:
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$b r7 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.m101485c(r6)
            if (r7 != 0) goto L_0x0215
            java.lang.String r2 = "fail:videoInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            java.lang.String r2 = "fail:can't get info from video file"
            java.lang.String r2 = r0.mo115109j(r2)
            r1.mo109647a(r3, r2)
            return
        L_0x0215:
            int r14 = r7.f242023e
            float r14 = (float) r14
            float r14 = r14 * r4
            int r14 = java.lang.Math.round(r14)
            int r15 = r7.f242024f
            float r15 = (float) r15
            float r15 = r15 * r4
            int r15 = java.lang.Math.round(r15)
            int r8 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.f242011a
            float r13 = (float) r8
            float r13 = r13 * r10
            r16 = 1148846080(0x447a0000, float:1000.0)
            float r13 = r13 / r16
            int r13 = java.lang.Math.round(r13)
            int r11 = r2.optInt(r11, r13)
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x0241
            int r13 = r7.f242025g
            if (r11 >= r13) goto L_0x0241
            goto L_0x0242
        L_0x0241:
            r11 = r8
        L_0x0242:
            float r8 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
            double r12 = (double) r8
            double r8 = r2.optDouble(r9, r12)
            float r2 = (float) r8
            int r8 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x0255
            float r7 = r7.f242026h
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0255
            goto L_0x0257
        L_0x0255:
            float r2 = com.tencent.p014mm.plugin.sight.base.C85457c.f249059d
        L_0x0257:
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r8 = 0
            r7[r8] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r8 = 1
            r7[r8] = r4
            java.lang.Float r4 = java.lang.Float.valueOf(r2)
            r8 = 2
            r7[r8] = r4
            java.lang.String r4 = "ratio: %f, bitrate: %d, fps: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r4, r7)
            if (r14 == 0) goto L_0x028a
            if (r15 != 0) goto L_0x027a
            goto L_0x028a
        L_0x027a:
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r12 = new com.tencent.mm.plugin.appbrand.jsapi.media.f2$a
            r7 = 0
            r8 = 0
            r4 = r12
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r14
            r9 = r15
            r10 = r11
            r11 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x029d
        L_0x028a:
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r12 = new com.tencent.mm.plugin.appbrand.jsapi.media.f2$a
            r7 = 720(0x2d0, float:1.009E-42)
            r8 = 540(0x21c, float:7.57E-43)
            r9 = 0
            r10 = 0
            r4 = r12
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L_0x029d:
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f242053g
            r4 = 0
            r5 = 1
            r2.compareAndSet(r4, r5)
            js0.r$a r2 = js0.C88024r.m109571a()
            com.tencent.mm.plugin.appbrand.jsapi.media.j1 r4 = new com.tencent.mm.plugin.appbrand.jsapi.media.j1
            r4.<init>(r0, r12, r1, r3)
            r2.postToWorker(r4)
        L_0x02b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.C82735k1.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
