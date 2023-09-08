package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.view.View;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.core.C43522y;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44245d;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44251e;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44254f;
import com.tencent.p014mm.sdk.json.JSONUtils;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ea3.C58536w;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo3.C77407n;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import w83.C15053a;
import wc3.C15133e0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2 */
public final class C44111u2 extends C15053a {

    /* renamed from: d */
    public static final C44111u2 f119490d = new C44111u2();

    /* renamed from: e */
    public static final String f119491e = "MicroMsg.JsApiShareCustomContent";

    /* renamed from: f */
    public static final int f119492f = 368;

    /* renamed from: g */
    public static final String f119493g = "shareCustomContent";

    /* renamed from: h */
    public static C44116c f119494h;

    /* renamed from: i */
    public static C44116c f119495i;

    /* renamed from: j */
    public static C44113b f119496j;

    /* renamed from: n */
    public static C44113b f119497n;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2$a */
    public static abstract class C44112a {

        /* renamed from: a */
        public boolean f119498a;

        /* renamed from: b */
        public boolean f119499b;

        public C44112a(String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2$b */
    public static final class C44113b extends C44112a {

        /* renamed from: c */
        public final ArrayList<C44115b> f119500c = new ArrayList<>();

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2$b$a */
        public static final class C44114a extends C87413o implements C32226l<JSONObject, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C44113b f119501d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44114a(C44113b bVar) {
                super(1);
                this.f119501d = bVar;
            }

            public Object invoke(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                C87412m.m108594g(jSONObject, LocaleUtil.ITALIAN);
                String optString = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                C87412m.m108593f(optString, "it.optString(\"title\")");
                int optInt = jSONObject.optInt("id");
                String optString2 = jSONObject.optString("iconData");
                C87412m.m108593f(optString2, "it.optString(\"iconData\")");
                C44115b bVar = new C44115b(optString, optInt, optString2, (Bitmap) null, 8, (C8480h) null);
                byte[] decode = Base64.decode(jSONObject.optString("iconData"), 0);
                C87412m.m108593f(decode, "decode(it.optString(\"iconData\"), Base64.DEFAULT)");
                bVar.f119505d = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                this.f119501d.f119500c.add(bVar);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2$b$b */
        public static final class C44115b {

            /* renamed from: a */
            public final String f119502a;

            /* renamed from: b */
            public final int f119503b;

            /* renamed from: c */
            public final String f119504c;

            /* renamed from: d */
            public Bitmap f119505d;

            public C44115b(String str, int i, String str2, Bitmap bitmap, int i2, C8480h hVar) {
                i = (i2 & 2) != 0 ? 0 : i;
                bitmap = (i2 & 8) != 0 ? null : bitmap;
                C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                C87412m.m108594g(str2, "iconData");
                this.f119502a = str;
                this.f119503b = i;
                this.f119504c = str2;
                this.f119505d = bitmap;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C44115b)) {
                    return false;
                }
                C44115b bVar = (C44115b) obj;
                return C87412m.m108589b(this.f119502a, bVar.f119502a) && this.f119503b == bVar.f119503b && C87412m.m108589b(this.f119504c, bVar.f119504c) && C87412m.m108589b(this.f119505d, bVar.f119505d);
            }

            public int hashCode() {
                int hashCode = ((((this.f119502a.hashCode() * 31) + this.f119503b) * 31) + this.f119504c.hashCode()) * 31;
                Bitmap bitmap = this.f119505d;
                return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
            }

            public String toString() {
                return "ChildItem(title=" + this.f119502a + ", id=" + this.f119503b + ", iconData=" + this.f119504c + ", iconBm=" + this.f119505d + ')';
            }
        }

        public C44113b(String str) {
            super(str);
            try {
                if (!Util.isNullOrNil(str)) {
                    this.f119498a = true;
                }
                JSONArray jSONArray = str != null ? new JSONArray(str) : null;
                if (jSONArray != null) {
                    JSONUtils.forEach(jSONArray, new C44114a(this));
                }
            } catch (JSONException e) {
                this.f119499b = true;
                String str2 = C44111u2.f119491e;
                Log.m105920e(str2, "CustomData: JSONException, e = " + e.getMessage());
            } catch (RuntimeException e2) {
                this.f119499b = true;
                String str3 = C44111u2.f119491e;
                Log.m105920e(str3, "CustomData: RuntimeException, e = " + e2.getMessage());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo68750a() {
            /*
                r4 = this;
                boolean r0 = r4.f119498a
                if (r0 == 0) goto L_0x0031
                boolean r0 = r4.f119499b
                r1 = 0
                if (r0 == 0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.ArrayList<com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2$b$b> r0 = r4.f119500c
                java.util.Iterator r0 = r0.iterator()
            L_0x0010:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0031
                java.lang.Object r2 = r0.next()
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2$b$b r2 = (com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44111u2.C44113b.C44115b) r2
                java.lang.String r3 = r2.f119502a
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0030
                java.lang.String r3 = r2.f119504c
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 != 0) goto L_0x0030
                android.graphics.Bitmap r2 = r2.f119505d
                if (r2 != 0) goto L_0x0010
            L_0x0030:
                return r1
            L_0x0031:
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.C44111u2.C44113b.mo68750a():boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.u2$c */
    public static final class C44116c extends C44112a {

        /* renamed from: c */
        public String f119506c;

        /* renamed from: d */
        public String f119507d;

        /* renamed from: e */
        public String f119508e;

        /* renamed from: f */
        public String f119509f;

        /* renamed from: g */
        public String f119510g;

        public C44116c(String str) {
            super(str);
            try {
                if (!Util.isNullOrNil(str)) {
                    this.f119498a = true;
                }
                JSONObject jSONObject = str != null ? new JSONObject(str) : null;
                if (jSONObject != null) {
                    this.f119506c = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    this.f119507d = jSONObject.optString("link");
                    this.f119508e = jSONObject.optString("desc");
                    this.f119509f = jSONObject.optString("img_url");
                    this.f119510g = jSONObject.optString("appId");
                }
            } catch (JSONException e) {
                String str2 = C44111u2.f119491e;
                Log.m105920e(str2, "FixedShareData: JSONException, e = " + e.getMessage());
                this.f119499b = true;
            } catch (RuntimeException e2) {
                String str3 = C44111u2.f119491e;
                Log.m105920e(str3, "FixedShareData: RuntimeException, e = " + e2.getMessage());
                this.f119499b = true;
            }
        }

        /* renamed from: a */
        public boolean mo68754a() {
            if (this.f119498a) {
                return !this.f119499b && !Util.isNullOrNil(this.f119506c) && !Util.isNullOrNil(this.f119507d) && !Util.isNullOrNil(this.f119509f);
            }
            return true;
        }
    }

    /* renamed from: e */
    public static final HashMap m48408e(C44111u2 u2Var, C44116c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        u2Var.getClass();
        HashMap hashMap = new HashMap();
        String str6 = "";
        if (cVar == null || (str = cVar.f119509f) == null) {
            str = str6;
        }
        hashMap.put("share_report_pre_msg_icon_url", str);
        if (cVar == null || (str2 = cVar.f119508e) == null) {
            str2 = str6;
        }
        hashMap.put("share_report_pre_msg_desc", str2);
        if (cVar == null || (str3 = cVar.f119506c) == null) {
            str3 = str6;
        }
        hashMap.put("share_report_pre_msg_title", str3);
        if (cVar == null || (str4 = cVar.f119507d) == null) {
            str4 = str6;
        }
        hashMap.put("share_report_pre_msg_url", str4);
        if (!(cVar == null || (str5 = cVar.f119510g) == null)) {
            str6 = str5;
        }
        hashMap.put("share_report_pre_msg_appid", str6);
        return hashMap;
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (!(jVar.f38998a instanceof Activity) || !(jVar.f39001d instanceof C48590l)) {
            Log.m105920e(f119491e, "context error!");
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":fail, context error", (Map<String, Object>) null);
            return false;
        }
        String str2 = (String) h1Var.f38983a.get("friend");
        String str3 = (String) h1Var.f38983a.get("timeline");
        f119494h = new C44116c(str2);
        f119495i = new C44116c(str3);
        f119496j = new C44113b((String) h1Var.f38983a.get("menuItems"));
        f119497n = new C44113b((String) h1Var.f38983a.get("opItems"));
        C44116c cVar = f119494h;
        C87412m.m108591d(cVar);
        if (!cVar.f119499b) {
            C44116c cVar2 = f119495i;
            C87412m.m108591d(cVar2);
            if (!cVar2.f119499b) {
                C44113b bVar = f119496j;
                C87412m.m108591d(bVar);
                if (!bVar.f119499b) {
                    C44113b bVar2 = f119497n;
                    C87412m.m108591d(bVar2);
                    if (!bVar2.f119499b) {
                        C44116c cVar3 = f119494h;
                        C87412m.m108591d(cVar3);
                        if (cVar3.f119498a) {
                            C44116c cVar4 = f119494h;
                            C87412m.m108591d(cVar4);
                            if (!cVar4.mo68754a()) {
                                String str4 = f119491e;
                                Log.m105924i(str4, "shareFriendData isNotAvailable, friendStr = " + str2);
                                C13849g gVar2 = jVar.f39001d;
                                String str5 = h1Var.f38990c;
                                gVar2.mo10774a(str5, h1Var.f38996i + ":fail, add share item, but friend data lack", (Map<String, Object>) null);
                                return false;
                            }
                        }
                        C44116c cVar5 = f119494h;
                        C87412m.m108591d(cVar5);
                        if (cVar5.f119498a) {
                            C44116c cVar6 = f119495i;
                            C87412m.m108591d(cVar6);
                            if (!cVar6.mo68754a()) {
                                String str6 = f119491e;
                                Log.m105924i(str6, "timelineTLData isNotAvailable, timelineStr = " + str3);
                                C13849g gVar3 = jVar.f39001d;
                                String str7 = h1Var.f38990c;
                                gVar3.mo10774a(str7, h1Var.f38996i + ":fail, add timeline item, but timeline data lack", (Map<String, Object>) null);
                                return false;
                            }
                        }
                        C44116c cVar7 = f119494h;
                        C87412m.m108591d(cVar7);
                        if (!cVar7.f119498a) {
                            C44116c cVar8 = f119495i;
                            C87412m.m108591d(cVar8);
                            if (!cVar8.f119498a) {
                                Log.m105924i(f119491e, "have to add either share friend or timeline!");
                                C13849g gVar4 = jVar.f39001d;
                                String str8 = h1Var.f38990c;
                                gVar4.mo10774a(str8, h1Var.f38996i + ":fail, have to add either share friend or timeline!", (Map<String, Object>) null);
                                return false;
                            }
                        }
                        C44113b bVar3 = f119496j;
                        C87412m.m108591d(bVar3);
                        if (bVar3.f119498a) {
                            C44113b bVar4 = f119496j;
                            C87412m.m108591d(bVar4);
                            if (!bVar4.mo68750a()) {
                                String str9 = f119491e;
                                Log.m105924i(str9, "menuItemsData isNotAvailable, timelineStr = " + str3);
                                C13849g gVar5 = jVar.f39001d;
                                String str10 = h1Var.f38990c;
                                gVar5.mo10774a(str10, h1Var.f38996i + ":fail, add menuItemsData item, but menuItemsData data lack", (Map<String, Object>) null);
                                return false;
                            }
                        }
                        C44113b bVar5 = f119497n;
                        C87412m.m108591d(bVar5);
                        if (bVar5.f119498a) {
                            C44113b bVar6 = f119497n;
                            C87412m.m108591d(bVar6);
                            if (!bVar6.mo68750a()) {
                                String str11 = f119491e;
                                Log.m105924i(str11, "opItemsData isNotAvailable, timelineStr = " + str3);
                                C13849g gVar6 = jVar.f39001d;
                                String str12 = h1Var.f38990c;
                                gVar6.mo10774a(str12, h1Var.f38996i + ":fail, add opItemsData item, but opItemsData data lack", (Map<String, Object>) null);
                                return false;
                            }
                        }
                        C77407n nVar = new C77407n(jVar.f38998a, 0, false);
                        nVar.f225771i = new C44117v2(jVar);
                        nVar.f225773j = new C44119w2(jVar);
                        Context context = jVar.f38998a;
                        WebViewUI webViewUI = context instanceof WebViewUI ? (WebViewUI) context : null;
                        if (webViewUI == null) {
                            Log.m105920e(f119491e, "webViewUI == null!");
                            C13849g gVar7 = jVar.f39001d;
                            String str13 = h1Var.f38990c;
                            gVar7.mo10774a(str13, h1Var.f38996i + ":fail, webViewUI == null", (Map<String, Object>) null);
                            return false;
                        }
                        C43522y yVar = webViewUI.f118513b1;
                        C87412m.m108593f(yVar, "webViewUI.controller");
                        C58536w wVar = webViewUI.f118465H1.f119135h;
                        C87412m.m108593f(wVar, "webViewUI.menuHelper.recentForwardReporter");
                        C44123x2 x2Var = new C44123x2(jVar);
                        C15133e0 Ct0 = ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0();
                        nVar.f225778n = new C44245d(Ct0, webViewUI, nVar, yVar, wVar, (View) null);
                        nVar.f225789s = new C44251e(Ct0, wVar, x2Var, yVar);
                        nVar.f225791t = new C44254f(Ct0, nVar);
                        nVar.f225782p = new C44124y2(jVar);
                        nVar.f225787r = new C6590z2(jVar);
                        nVar.mo107573q();
                        return true;
                    }
                }
                Log.m105924i(f119491e, "menuItem or opItem, json parse fail");
                C13849g gVar8 = jVar.f39001d;
                String str14 = h1Var.f38990c;
                gVar8.mo10774a(str14, h1Var.f38996i + ":fail, menuItem or opItem, json parse fail!", (Map<String, Object>) null);
                return false;
            }
        }
        Log.m105924i(f119491e, "share friends or timeline, json parse fail");
        C13849g gVar9 = jVar.f39001d;
        String str15 = h1Var.f38990c;
        gVar9.mo10774a(str15, h1Var.f38996i + ":fail, share friends or timeline, json parse fail!", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f119492f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f119493g;
    }
}
