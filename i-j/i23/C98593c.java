package i23;

import com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import z04.C112550d0;

/* renamed from: i23.c */
public final class C98593c {

    /* renamed from: a */
    public static final C98593c f289086a = new C98593c();

    /* renamed from: b */
    public static final HashMap<String, VideoCompositionPerformanceStruct> f289087b = new HashMap<>();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: f23.b$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: f23.b$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: f23.b$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f23.C97815b.C97820e mo137978a(com.tencent.p014mm.plugin.vlog.model.C106205q0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r6, r0)
            int r0 = r6.f316491b
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x006b
            f23.b$f r0 = new f23.b$f
            r0.<init>()
            sp3.c r1 = r6.f316501l
            float r1 = r1.f331468f
            r0.f286963f = r1
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r1 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            java.lang.String r3 = r6.f316490a
            rw.m$a r1 = r1.mo129931c(r3, r2)
            if (r1 == 0) goto L_0x008a
            int r2 = r1.f180529e
            r0.f286962e = r2
            float r2 = r1.f180527c
            r0.f286961d = r2
            int r2 = r1.f180534j
            r0.f286964g = r2
            int r2 = r1.f180532h
            r0.f286965h = r2
            long r2 = r1.f180528d
            r0.f286968k = r2
            o80.a r2 = new o80.a
            java.lang.String r3 = r6.f316490a
            r2.<init>(r3)
            java.lang.String r3 = r2.mo161326c()
            java.lang.String r4 = ""
            if (r3 != 0) goto L_0x0045
            r3 = r4
        L_0x0045:
            r0.f286966i = r3
            java.lang.String r3 = r2.mo161324a()
            if (r3 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r4 = r3
        L_0x004f:
            r0.f286967j = r4
            java.util.ArrayList<java.lang.Integer> r3 = r0.f286959b
            int r4 = r1.f180525a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            java.util.ArrayList<java.lang.Integer> r3 = r0.f286959b
            int r1 = r1.f180526b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            r2.mo161327e()
            goto L_0x008a
        L_0x006b:
            if (r0 != r2) goto L_0x0089
            f23.b$d r0 = new f23.b$d
            r0.<init>()
            java.util.ArrayList<java.lang.Integer> r1 = r0.f286959b
            int r2 = r6.f316495f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            java.util.ArrayList<java.lang.Integer> r1 = r0.f286959b
            int r2 = r6.f316496g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r0 != 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            int r1 = r6.f316491b
            r0.f286958a = r1
        L_0x0091:
            if (r0 == 0) goto L_0x00a2
            java.util.ArrayList<java.lang.Long> r1 = r0.f286960c
            if (r1 == 0) goto L_0x00a2
            sp3.c r2 = r6.f316501l
            long r2 = r2.f331464b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.add(r2)
        L_0x00a2:
            if (r0 == 0) goto L_0x00b3
            java.util.ArrayList<java.lang.Long> r1 = r0.f286960c
            if (r1 == 0) goto L_0x00b3
            sp3.c r6 = r6.f316501l
            long r2 = r6.f331465c
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            r1.add(r6)
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.C98593c.mo137978a(com.tencent.mm.plugin.vlog.model.q0):f23.b$e");
    }

    /* renamed from: b */
    public final void mo137979b(String str) {
        C87412m.m108594g(str, "key");
        HashMap<String, VideoCompositionPerformanceStruct> hashMap = f289087b;
        VideoCompositionPerformanceStruct videoCompositionPerformanceStruct = hashMap.get(str);
        if (videoCompositionPerformanceStruct != null) {
            videoCompositionPerformanceStruct.mo86054n();
        }
        hashMap.remove(str);
        Log.m105924i("MicroMsg.VideoCompositionPerformance", "do report key:" + str);
    }

    /* renamed from: c */
    public final VideoCompositionPerformanceStruct mo137980c(String str) {
        C87412m.m108594g(str, "key");
        HashMap<String, VideoCompositionPerformanceStruct> hashMap = f289087b;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new VideoCompositionPerformanceStruct());
            VideoCompositionPerformanceStruct videoCompositionPerformanceStruct = hashMap.get(str);
            C87412m.m108591d(videoCompositionPerformanceStruct);
            VideoCompositionPerformanceStruct videoCompositionPerformanceStruct2 = videoCompositionPerformanceStruct;
            videoCompositionPerformanceStruct2.f266480l = videoCompositionPerformanceStruct2.mo86045b("EditId", str, true);
            Log.m105924i("MicroMsg.VideoCompositionPerformance", "getReportStruct: create " + str);
            VideoCompositionPerformanceStruct videoCompositionPerformanceStruct3 = hashMap.get(str);
            C87412m.m108591d(videoCompositionPerformanceStruct3);
            VideoCompositionPerformanceStruct videoCompositionPerformanceStruct4 = videoCompositionPerformanceStruct3;
            List T = C112550d0.m153784T("2.3-1364", new char[]{'-'}, false, 0, 6, (Object) null);
            Log.m105924i("MicroMsg.VideoCompositionPerformance", "renderlibVersion :2.3-1364");
            if (T.size() == 2) {
                videoCompositionPerformanceStruct4.f266472d = ((long) (Float.parseFloat((String) T.get(0)) * ((float) 1000000))) + Util.safeParseLong((String) T.get(1));
            }
        }
        VideoCompositionPerformanceStruct videoCompositionPerformanceStruct5 = hashMap.get(str);
        C87412m.m108591d(videoCompositionPerformanceStruct5);
        return videoCompositionPerformanceStruct5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r0.toString();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137981d(com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "struct"
            gy3.C87412m.m108594g(r5, r0)
            if (r6 == 0) goto L_0x0061
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r0 == 0) goto L_0x0061
            com.tencent.mm.plugin.recordvideo.util.MultiMediaVideoChecker r0 = com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker.f273077a
            r1 = 0
            rw.m$a r6 = r0.mo129931c(r6, r1)
            if (r6 == 0) goto L_0x0061
            com.tencent.mm.plugin.sight.base.a r0 = r6.f180536l
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r0 = z04.C112551y.m153814n(r0, r2, r3, r1)
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.lang.String r1 = "OutputMediaInfo"
            r2 = 1
            java.lang.String r0 = r5.mo86045b(r1, r0, r2)
            r5.f266479k = r0
            float r0 = r6.f180527c
            long r0 = (long) r0
            r5.f266477i = r0
            long r0 = r6.f180528d
            r5.f266483o = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.f180525a
            int r1 = r1 / 100
            r0.append(r1)
            r1 = 120(0x78, float:1.68E-43)
            r0.append(r1)
            int r6 = r6.f180526b
            int r6 = r6 / 100
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "OutputVideoResolution"
            java.lang.String r6 = r5.mo86045b(r0, r6, r2)
            r5.f266478j = r6
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i23.C98593c.mo137981d(com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct, java.lang.String):void");
    }
}
