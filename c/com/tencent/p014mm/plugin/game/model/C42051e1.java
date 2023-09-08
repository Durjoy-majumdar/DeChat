package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.ITMQQDownloaderOpenSDK;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam;
import di3.C86312j;
import org.json.JSONObject;
import p531fz.C32234b;

/* renamed from: com.tencent.mm.plugin.game.model.e1 */
public class C42051e1 {

    /* renamed from: a */
    public static C42051e1 f113298a;

    /* renamed from: b */
    public static ITMQQDownloaderOpenSDK f113299b;

    /* renamed from: com.tencent.mm.plugin.game.model.e1$b */
    public static final class C42053b {

        /* renamed from: a */
        public String f113300a;

        /* renamed from: b */
        public String f113301b;

        /* renamed from: c */
        public String f113302c;

        /* renamed from: d */
        public int f113303d;

        /* renamed from: e */
        public String f113304e;

        /* renamed from: f */
        public String f113305f;

        /* renamed from: g */
        public String f113306g;

        /* renamed from: h */
        public String f113307h;

        /* renamed from: i */
        public String f113308i;

        /* renamed from: j */
        public String f113309j;

        public C42053b(C42052a aVar) {
        }

        /* renamed from: a */
        public TMQQDownloaderOpenSDKParam mo66031a(String str) {
            String str2 = str;
            Log.m105925i("MicroMsg.QQDownloaderSDKWrapper", "params is : [%s]", str2);
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.QQDownloaderSDKWrapper", "params is null or nil");
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    this.f113302c = jSONObject.optString(OpenSDKTool4Assistant.EXTRA_TASK_APKID);
                    this.f113304e = jSONObject.optString(OpenSDKTool4Assistant.EXTRA_VIA);
                    this.f113303d = jSONObject.optInt(OpenSDKTool4Assistant.EXTRA_TASK_VERSION);
                    this.f113308i = jSONObject.optString("channelID");
                    this.f113306g = jSONObject.optString("uin");
                    this.f113300a = jSONObject.optString("SNGAppId");
                    this.f113301b = jSONObject.optString(OpenSDKTool4Assistant.EXTRA_TASK_APPID);
                    this.f113307h = jSONObject.optString(OpenSDKTool4Assistant.EXTRA_UINTYPE);
                    this.f113305f = jSONObject.optString(OpenSDKTool4Assistant.EXTRA_TASK_PACKAGENAME);
                    this.f113309j = jSONObject.optString("actionFlag");
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.QQDownloaderSDKWrapper", "parse parms failed:[%s]", e.getMessage());
                }
            }
            return new TMQQDownloaderOpenSDKParam(this.f113300a, this.f113301b, this.f113302c, this.f113303d, this.f113304e, this.f113305f, this.f113306g, this.f113307h, this.f113308i, this.f113309j);
        }
    }

    /* renamed from: a */
    public static C42051e1 m45759a() {
        if (f113298a == null) {
            synchronized (C42051e1.class) {
                if (f113298a == null) {
                    f113298a = new C42051e1();
                }
            }
        }
        return f113298a;
    }

    /* renamed from: b */
    public ITMQQDownloaderOpenSDK mo66030b() {
        if (f113299b == null) {
            ITMQQDownloaderOpenSDK j = ((C32234b) C86312j.m106911c(C32234b.class)).mo58329j();
            f113299b = j;
            j.initQQDownloaderOpenSDK(MMApplicationContext.getContext());
        }
        return f113299b;
    }
}
