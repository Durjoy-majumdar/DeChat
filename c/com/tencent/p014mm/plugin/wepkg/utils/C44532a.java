package com.tencent.p014mm.plugin.wepkg.utils;

import com.tencent.p014mm.game.report.C40304b;
import com.tencent.p014mm.game.report.C40311f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import lb3.C46839a;
import lb3.C46840b;
import org.json.JSONException;
import org.json.JSONObject;
import u10.C52415a;
import u10.C52416b;

/* renamed from: com.tencent.mm.plugin.wepkg.utils.a */
public class C44532a {
    /* renamed from: a */
    public static String m48910a(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length - 1;
        for (int i = 0; i < length; i++) {
            sb.append(String.valueOf(objArr[i]));
            sb.append(',');
        }
        sb.append(String.valueOf(objArr[length]));
        return sb.toString();
    }

    /* renamed from: b */
    public static void m48911b(String str, int i, String str2, long j) {
        C46839a jo = C46840b.m52131Lo().mo72039jo(str);
        if (jo != null) {
            String a = m48910a(str, jo.field_version, 0, Integer.valueOf(i), 0, 0, str2, "", jo.field_oldVersion, 4, Long.valueOf(j), Integer.valueOf(jo.field_pkgSize));
            C52415a a2 = C52415a.m58668a();
            C52416b bVar = new C52416b(14229, a);
            ((C40304b) a2).getClass();
            C40311f.m43479a(bVar);
        }
    }

    /* renamed from: c */
    public static void m48912c(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        String str6 = str2;
        String str7 = str5;
        Log.m105919d("MicroMsg.WePkgReport", "reportWepkgLogicKv, scene = %s, url = %s, pkgId = %s, version = %s, resultCode = %d, costTime = %d, extInfo = %s", str, str6, str3, str4, Long.valueOf(j), Long.valueOf(j2), str7);
        try {
            if (Util.isNullOrNil(str5)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(DownloadInfo.NETTYPE, NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext()));
                str7 = URLEncoder.encode(jSONObject.toString(), "UTF-8");
            } else {
                JSONObject jSONObject2 = new JSONObject(URLDecoder.decode(str7, "UTF-8"));
                jSONObject2.put(DownloadInfo.NETTYPE, NetStatusUtil.getFormatedNetType(MMApplicationContext.getContext()));
                str7 = URLEncoder.encode(jSONObject2.toString(), "UTF-8");
            }
            if (!Util.isNullOrNil(str2)) {
                str6 = URLEncoder.encode(str2, "UTF-8");
            }
        } catch (Exception unused) {
        }
        C115669n.INSTANCE.mo160131h(13980, str, str6, str3, str4, Long.valueOf(j), str7, Long.valueOf(j2));
    }

    /* renamed from: d */
    public static String m48913d(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("subCode", i);
            return URLEncoder.encode(jSONObject.toString(), "UTF-8");
        } catch (UnsupportedEncodingException | JSONException unused) {
            return null;
        }
    }
}
