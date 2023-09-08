package qy1;

import android.content.Context;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONObject;

@Deprecated
/* renamed from: qy1.a */
public class C12934a {
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002b */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12379a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            r0.put(r4, r5)     // Catch:{ Exception -> 0x000a }
            goto L_0x0015
        L_0x000a:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r5 = "MicroMsg.GameReportUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0050
            java.lang.String r4 = r0.toString()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r0 = ""
            if (r5 == 0) goto L_0x0025
            r3 = r4
            goto L_0x0050
        L_0x0025:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x002b }
            r5.<init>(r3)     // Catch:{ Exception -> 0x002b }
            r1 = r5
        L_0x002b:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004f }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x004f }
            if (r1 == 0) goto L_0x004a
            java.util.Iterator r4 = r1.keys()
        L_0x0036:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004a
            java.lang.Object r5 = r4.next()     // Catch:{  }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{  }
            java.lang.Object r2 = r1.opt(r5)     // Catch:{  }
            r3.put(r5, r2)     // Catch:{  }
            goto L_0x0036
        L_0x004a:
            java.lang.String r3 = r3.toString()
            goto L_0x0050
        L_0x004f:
            r3 = r0
        L_0x0050:
            java.lang.String r3 = m12382d(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.C12934a.m12379a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public static void m12380b(Context context, int i, int i2, int i3, int i4, String str, int i5, String str2) {
        Log.m105924i("MicroMsg.GameReportUtil", "reportExposureInfo : " + i + " , " + i2 + " , " + i3 + " , " + i4 + " , " + 0 + " , " + Util.nullAsNil(str) + " , " + i5 + " , " + 0 + " , " + Util.nullAsNil((String) null) + " , " + Util.nullAsNil((String) null) + " , " + Util.nullAsNil(str2));
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[12];
        objArr[0] = Integer.valueOf(i);
        Integer valueOf = Integer.valueOf(i2);
        int i6 = 1;
        objArr[1] = valueOf;
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Integer.valueOf(i4);
        objArr[4] = 0;
        objArr[5] = str;
        objArr[6] = Integer.valueOf(i5);
        objArr[7] = 0;
        objArr[8] = null;
        objArr[9] = Integer.valueOf(Util.getInt((String) null, 0));
        if (NetStatusUtil.is3G(context)) {
            i6 = 4;
        } else if (NetStatusUtil.is4G(context)) {
            i6 = 5;
        } else {
            int netType = NetStatusUtil.getNetType(context);
            if (netType == -1) {
                i6 = 255;
            } else if (netType != 0) {
                i6 = netType != 5 ? netType != 6 ? 6 : 3 : 2;
            }
        }
        objArr[10] = Integer.valueOf(i6);
        objArr[11] = str2;
        nVar.mo160131h(13384, objArr);
    }

    /* renamed from: c */
    public static String m12381c(Map<String, String> map) {
        if (!(map == null || map.size() == 0)) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.GameReportUtil", e.getMessage());
                    return "";
                }
            }
            try {
                return URLEncoder.encode(jSONObject.toString(), "UTF-8");
            } catch (Exception e2) {
                Log.m105920e("MicroMsg.GameReportUtil", e2.getMessage());
            }
        }
        return "";
    }

    /* renamed from: d */
    public static String m12382d(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception e) {
            Log.m105920e("MicroMsg.GameReportUtil", e.getMessage());
            return "";
        }
    }
}
