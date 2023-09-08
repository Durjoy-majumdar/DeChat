package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import q00.C110264g;
import q00.C62571i;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C64197v;
import sx3.C90364q0;

/* renamed from: ac3.e1 */
public final class C103352e1 {

    /* renamed from: a */
    public static final C103352e1 f304762a = new C103352e1();

    /* renamed from: b */
    public static final List<String> f304763b = C64197v.m75537f("MODEL_FACE_ALIGNMENT", "MODEL_FACE_DETECT", "MODEL_FACE_OCCULASIONSEG", "MODEL_FACE_OCCULASIONSEG_TINY", "MODEL_HAND", "MODEL_PORTRAITSEGMENT", "MODEL_PORTRAITSEGMENT_MINI", "MODEL_FACE3D_XBIN", "MODEL_LUA_SCRIPT", "MODEL_BODY_POSE");

    /* renamed from: c */
    public static final List<String> f304764c = C64197v.m75537f("MODEL_FACE_ALIGNMENT", "MODEL_FACE_DETECT", "MODEL_FACE_OCCULASIONSEG", "MODEL_PORTRAITSEGMENT", "MODEL_FACE3D_XBIN", "MODEL_FACE3D_PARAMS", "MODEL_LUA_SCRIPT");

    /* renamed from: d */
    public static final Map<String, Integer> f304765d;

    /* renamed from: e */
    public static final LinkedHashMap<Integer, String> f304766e;

    /* renamed from: f */
    public static final List<Integer> f304767f = C110818d0.m150953y0(f304765d.values());

    static {
        Map<String, Integer> f = C90364q0.m113147f(new C13604l("MODEL_FACE_ALIGNMENT", 113), new C13604l("MODEL_FACE_DETECT", 114), new C13604l("MODEL_HAND", 115), new C13604l("MODEL_FACE_OCCULASIONSEG", 116), new C13604l("MODEL_PORTRAITSEGMENT", 117), new C13604l("MODEL_FACE3D_XBIN", 118), new C13604l("MODEL_FACE3D_PARAMS", 119), new C13604l("MODEL_FACE_FEATURE", 120), new C13604l("MODEL_CHAT_CLS_MODEL", 121), new C13604l("MODEL_CHAT_CLS_MAP", 122), new C13604l("MODEL_OCR_DET", 123), new C13604l("MODEL_OCR_REC_MODEL", 124), new C13604l("MODEL_OCR_REC_MAP", 125), new C13604l("MODEL_VIDEO_CLIPPING_FEATURE", 126), new C13604l("MODEL_EXPRESSION_HIGHLIGHT", 127), new C13604l("MODEL_PORTRAITSEGMENT_MINI", 128), new C13604l("MODEL_AUDIO_CNN", 130), new C13604l("MODEL_VIDEO_CLASSIFICATION", 131), new C13604l("MODEL_VIDEO_IMG_CLASSIFICATION", 132), new C13604l("MODEL_VIDEO_IMG_FEAT", 133), new C13604l("MODEL_MOBILE_POLICY_DB", 134), new C13604l("MODEL_LUA_SCRIPT", 135), new C13604l("MODEL_PRETRAIN_IMAGE_FEATURE", 136), new C13604l("MODEL_OSD_BACKBONE", 138), new C13604l("MODEL_OSD_HEAD", 139), new C13604l("MODEL_VIDEO_HIGHLIGHT", 140), new C13604l("MODEL_OSD", 147), new C13604l("MODEL_OSD_FEATURES", 148), new C13604l("MODEL_CSC_DET", 153), new C13604l("MODEL_SCAN_CLS", 154), new C13604l("MODEL_BODY_POSE", 149), new C13604l("MODEL_VIO_CONFIG", 152), new C13604l("MODEL_HAND_POSE3D", 161), new C13604l("MODEL_BODY_POSE3D", 162), new C13604l("MODEL_FACE_OCCULASIONSEG_TINY", 157), new C13604l("MODEL_AUDIO_PREPARE", 163), new C13604l("MODEL_AUDIO_TASK_AUDIO_FEAT", 164), new C13604l("MODEL_AUDIO_TASK_FUSION", 165), new C13604l("MODEL_AUDIO_TASK_IMAGE_FEAT", 166));
        f304765d = f;
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry next : f.entrySet()) {
            linkedHashMap.put(Integer.valueOf(((Number) next.getValue()).intValue()), (String) next.getKey());
        }
        f304766e = linkedHashMap;
    }

    /* renamed from: a */
    public static Map m136945a(C103352e1 e1Var, List<String> list, boolean z, C110264g.C47730a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            list = f304763b;
        }
        if ((i & 4) != 0) {
            aVar = C110264g.C47730a.APP_UNSPECIFIED;
        }
        e1Var.getClass();
        Class cls = C62571i.class;
        C87412m.m108594g(list, "keyArray");
        C87412m.m108594g(aVar, "appScene");
        List<T> B0 = C110818d0.m150900B0(list);
        HashMap hashMap = new HashMap();
        String a = ((C62571i) C86312j.m106911c(cls)).mo87567IR().mo11889a("MODEL_FACE3D_PARAMS");
        if (a != null) {
            hashMap.put("MODEL_FACE3D_PARAMS", a);
        }
        Iterator it = ((ArrayList) B0).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String a2 = ((C62571i) C86312j.m106911c(cls)).mo87567IR().mo11889a(str);
            if (a2 != null) {
                hashMap.put(str, a2);
            } else {
                Log.m105928w("MicroMsg.WeVisModelUtil", "getModelMap: " + str + " not exist");
            }
        }
        if (aVar == C110264g.C47730a.APP_VOIP_HIGHRANK || aVar == C110264g.C47730a.APP_VOIP) {
            hashMap.remove("MODEL_HAND");
        }
        if (!(aVar == C110264g.C47730a.APP_LIVEVLOG_HIGHRANK || aVar == C110264g.C47730a.APP_LIVEVLOG)) {
            hashMap.remove("MODEL_FACE_OCCULASIONSEG_TINY");
            hashMap.remove("MODEL_BODY_POSE");
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        cy3.C58003b.m67160a(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        throw r4;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo143215b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.WeVisModelUtil"
            java.lang.String r1 = "filePath"
            gy3.C87412m.m108594g(r9, r1)
            r1 = 0
            r2 = 0
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x005c }
            java.lang.String r5 = "SHA1"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch:{ all -> 0x005c }
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r9)     // Catch:{ all -> 0x005c }
            if (r6 == 0) goto L_0x0064
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x005c }
            java.io.InputStream r9 = com.tencent.p014mm.vfs.C86013q1.m106423E(r9)     // Catch:{ all -> 0x005c }
            int r7 = r9.read(r6)     // Catch:{ all -> 0x0055 }
        L_0x0025:
            if (r7 <= 0) goto L_0x002f
            r5.update(r6, r2, r7)     // Catch:{ all -> 0x0055 }
            int r7 = r9.read(r6)     // Catch:{ all -> 0x0055 }
            goto L_0x0025
        L_0x002f:
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0055 }
            cy3.C58003b.m67160a(r9, r1)     // Catch:{ all -> 0x005c }
            byte[] r9 = r5.digest()     // Catch:{ all -> 0x005c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r5.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r6 = "getSha1: cost "
            r5.append(r6)     // Catch:{ all -> 0x005c }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)     // Catch:{ all -> 0x005c }
            r5.append(r3)     // Catch:{ all -> 0x005c }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x005c }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x005c }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r9)     // Catch:{ all -> 0x005c }
            return r9
        L_0x0055:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r4 = move-exception
            cy3.C58003b.m67160a(r9, r3)     // Catch:{ all -> 0x005c }
            throw r4     // Catch:{ all -> 0x005c }
        L_0x005c:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "getSha1 error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r9, r3, r2)
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ac3.C103352e1.mo143215b(java.lang.String):java.lang.String");
    }
}
