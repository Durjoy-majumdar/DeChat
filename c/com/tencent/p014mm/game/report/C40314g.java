package com.tencent.p014mm.game.report;

import android.content.Context;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import u10.C52415a;
import u10.C52416b;
import y10.C15928a;

/* renamed from: com.tencent.mm.game.report.g */
public class C40314g {
    /* renamed from: a */
    public static String m43482a(String str, String str2, String str3, Map map) {
        if (Util.isNullOrNil(str) && Util.isNullOrNil(str2) && Util.isNullOrNil(str3) && map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!Util.isNullOrNil(str)) {
                jSONObject.put("function_type", str);
            }
            if (!Util.isNullOrNil(str2)) {
                jSONObject.put("function_value", str2);
            }
            if (!Util.isNullOrNil(str3)) {
                jSONObject.put("ext_data", str3);
            }
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    try {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    } catch (Exception unused) {
                        return "";
                    }
                }
            }
        } catch (JSONException unused2) {
        }
        return C15928a.m14857d(jSONObject.toString());
    }

    /* renamed from: b */
    public static String m43483b(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception unused) {
                return "";
            }
        }
        return C15928a.m14857d(jSONObject.toString());
    }

    /* renamed from: c */
    public static void m43484c(Context context, int i, int i2, int i3, int i4, int i5, String str) {
        m43485d(context, i, i2, i3, i4, 0, (String) null, i5, 0, (String) null, (String) null, str);
    }

    /* renamed from: d */
    public static void m43485d(Context context, int i, int i2, int i3, int i4, int i5, String str, int i6, int i7, String str2, String str3, String str4) {
        m43486e(context, i, i2, i3, i4, i5, str, i6, i7, str2, str3, str4, 0, 0, 0);
    }

    /* renamed from: e */
    public static void m43486e(Context context, int i, int i2, int i3, int i4, int i5, String str, int i6, int i7, String str2, String str3, String str4, long j, long j2, long j3) {
        String str5 = str3;
        C52416b a = C52416b.m58673a(12909, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str, Integer.valueOf(i6), Integer.valueOf(i7), str2, Integer.valueOf(Util.getInt(str5, 0)), Integer.valueOf(C15928a.m14854a(context)), str4, "", "", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), C41864d.m45385b().getString("session_id"), Long.valueOf(C41864d.m45385b().getLong("client_timestamp")));
        Log.m105919d("REPORT_12909", "gamelog.report, null, report, scene:%d, area:%d, pos:%d, action:%d, gameId:%s, msgId:%s, noticeId:%s, extern:%s,sessionId:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, str2, str5, str4, C41864d.m45385b().getString("session_id"));
        ((C40304b) C52415a.m58668a()).getClass();
        C40311f.m43479a(a);
    }

    /* renamed from: f */
    public static void m43487f(Context context, int i, int i2, int i3, int i4, String str, int i5, String str2) {
        m43485d(context, i, i2, i3, i4, 0, str, i5, 0, (String) null, (String) null, str2);
    }

    /* renamed from: g */
    public static void m43488g(Context context, int i, int i2, int i3, int i4, String str, int i5, String str2, String str3) {
        m43485d(context, i, i2, i3, i4, 0, str, i5, 0, (String) null, str2, str3);
    }
}
