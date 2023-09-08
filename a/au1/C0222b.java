package au1;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.mmdata.rpt.FaceDetectInterfaceCalledResultStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FaceFlashCommonReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FaceFlashLogOpenStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FaceFlashLogPayStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: au1.b */
public class C0222b {

    /* renamed from: a */
    public static FaceFlashLogOpenStruct f748a = null;

    /* renamed from: b */
    public static long f749b = 0;

    /* renamed from: c */
    public static FaceFlashLogPayStruct f750c = null;

    /* renamed from: d */
    public static FaceDetectInterfaceCalledResultStruct f751d = null;

    /* renamed from: e */
    public static JSONArray f752e = null;

    /* renamed from: f */
    public static JSONArray f753f = null;

    /* renamed from: g */
    public static String f754g = "";

    /* renamed from: a */
    public static void m162a(boolean z) {
        Log.m105925i("MicroMsg.FaceFlashManagerReport", "doReport14560 success:%s", Boolean.valueOf(z));
        m165d().f9672h = z ? 1 : 0;
        m165d().f9673i = System.currentTimeMillis() - m165d().f9668d;
        m165d().f9678n = System.currentTimeMillis();
        m165d().mo86054n();
        f751d = null;
    }

    /* renamed from: b */
    public static FaceFlashLogOpenStruct m163b() {
        if (f748a == null) {
            FaceFlashLogOpenStruct faceFlashLogOpenStruct = new FaceFlashLogOpenStruct();
            f748a = faceFlashLogOpenStruct;
            faceFlashLogOpenStruct.f9700p = f749b;
            f748a.f9687C = C85875k4.m106210y() ? 2 : 1;
        }
        return f748a;
    }

    /* renamed from: c */
    public static FaceFlashLogPayStruct m164c() {
        if (f750c == null) {
            f750c = new FaceFlashLogPayStruct();
        }
        return f750c;
    }

    /* renamed from: d */
    public static FaceDetectInterfaceCalledResultStruct m165d() {
        if (f751d == null) {
            f751d = new FaceDetectInterfaceCalledResultStruct();
        }
        return f751d;
    }

    /* renamed from: e */
    public static void m166e(int i, String str) {
        FaceFlashCommonReportStruct faceFlashCommonReportStruct = new FaceFlashCommonReportStruct();
        faceFlashCommonReportStruct.f9681d = 2;
        faceFlashCommonReportStruct.f9682e = 0;
        faceFlashCommonReportStruct.f9683f = i;
        faceFlashCommonReportStruct.f9684g = faceFlashCommonReportStruct.mo86045b("ErrorMsg", str, true);
        faceFlashCommonReportStruct.mo86054n();
    }

    /* renamed from: f */
    public static void m167f(int i) {
        FaceFlashLogOpenStruct b = m163b();
        b.f9688d = (long) i;
        JSONArray jSONArray = f753f;
        if (jSONArray != null) {
            b.f9698n = b.mo86045b("AndroidStateRecord", jSONArray.toString().replace(',', ';'), true);
        }
        JSONArray jSONArray2 = f752e;
        if (jSONArray2 != null) {
            b.f9685A = b.mo86045b("SdkStatusStr", jSONArray2.toString().replace(',', ';'), true);
        }
        b.f9697m = b.mo86045b("StateRecord", f754g, true);
        if (!TextUtils.isEmpty(f754g)) {
            try {
                String[] split = f754g.split("-");
                if (split.length > 0) {
                    b.f9690f = (long) Integer.parseInt(split[split.length - 1]);
                }
            } catch (Exception unused) {
            }
        }
        f749b = f748a.f9700p;
        b.mo86054n();
        f748a = null;
        f754g = "";
        f753f = null;
        f752e = null;
    }

    /* renamed from: g */
    public static void m168g(String str) {
        m163b().f9708x = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject(str);
            m167f(jSONObject.optInt("err_code", jSONObject.optInt(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0)));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "parse face fail result error.%s", str);
        }
    }

    /* renamed from: h */
    public static void m169h(int i) {
        FaceFlashLogPayStruct c = m164c();
        c.f9711d = (long) i;
        JSONArray jSONArray = f753f;
        if (jSONArray != null) {
            c.f9722o = c.mo86045b("AndroidStateRecord", jSONArray.toString().replace(',', ';'), true);
        }
        c.f9721n = c.mo86045b("StateRecord", f754g, true);
        if (!TextUtils.isEmpty(f754g)) {
            try {
                String[] split = f754g.split("-");
                if (split.length > 0) {
                    c.f9713f = (long) Integer.parseInt(split[split.length - 1]);
                }
            } catch (Exception unused) {
            }
        }
        c.mo86054n();
        f750c = null;
        f754g = "";
        f753f = null;
    }

    /* renamed from: i */
    public static void m170i(String str, int i) {
        try {
            m169h(new JSONObject(str).optInt(TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, i));
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.FaceFlashManagerError", e, "parse face fail result error.%s", str);
        }
    }

    /* renamed from: j */
    public static void m171j(int i, int i2, String str) {
        FaceFlashCommonReportStruct faceFlashCommonReportStruct = new FaceFlashCommonReportStruct();
        faceFlashCommonReportStruct.f9681d = 1;
        faceFlashCommonReportStruct.f9682e = i;
        faceFlashCommonReportStruct.f9683f = i2;
        faceFlashCommonReportStruct.f9684g = faceFlashCommonReportStruct.mo86045b("ErrorMsg", str, true);
        faceFlashCommonReportStruct.mo86054n();
    }

    /* renamed from: k */
    public static void m172k(String str) {
        m173l(str, 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m173l(java.lang.String r6, java.lang.Object r7) {
        /*
            java.lang.Class<au1.b> r0 = au1.C0222b.class
            monitor-enter(r0)
            org.json.JSONArray r1 = f753f     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x000e
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            f753f = r1     // Catch:{ all -> 0x003f }
        L_0x000e:
            java.lang.String r1 = "MicroMsg.FaceFlashManagerReport"
            java.lang.String r2 = "updateFaceFlashState key:%s value:%s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x003f }
            r4 = 0
            r3[r4] = r6     // Catch:{ all -> 0x003f }
            r5 = 1
            r3[r5] = r7     // Catch:{ all -> 0x003f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x003f }
            org.json.JSONArray r1 = f753f     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003f }
            int r1 = r1.length()     // Catch:{ all -> 0x003f }
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 > r2) goto L_0x002e
            r4 = 1
        L_0x002e:
            if (r4 == 0) goto L_0x003d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            r1.put(r6, r7)     // Catch:{ JSONException -> 0x0038 }
        L_0x0038:
            org.json.JSONArray r6 = f753f     // Catch:{ all -> 0x003f }
            r6.put(r1)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)
            return
        L_0x003f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au1.C0222b.m173l(java.lang.String, java.lang.Object):void");
    }

    /* renamed from: m */
    public static void m174m(String str) {
        JSONArray jSONArray = f753f;
        if (jSONArray == null || !jSONArray.toString().contains(str)) {
            m172k(str);
        }
    }

    /* renamed from: n */
    public static void m175n(int i) {
        if (TextUtils.isEmpty(f754g)) {
            f754g += String.valueOf(i);
            return;
        }
        f754g += "-" + i;
    }
}
