package g83;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import c00.C0406o;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.plugin.websearch.webview.BaseWebSearchWebView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import ke3.C88144b;
import o40.C61926c;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import rx3.C13598b0;
import te3.C51043r10;
import u73.C101976i0;
import u73.C101988w;
import u73.C52469w0;
import wm0.C91036c;
import z73.C53759a;
import z73.C53761n;

/* renamed from: g83.l */
public abstract class C98093l<T> extends C59387j<T> {

    /* renamed from: e */
    public static final C45901a f287559e = new C45901a((C8480h) null);

    /* renamed from: d */
    public final String f287560d = "MicroMsg.WebSearch.TagSearchJSApi";

    /* renamed from: g83.l$a */
    public static final class C45901a {
        public C45901a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final void m51178a(C45901a aVar, String str, String str2, int i, String str3, int i2, int i3, String str4) {
            aVar.getClass();
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra("convertActivityFromTranslucent", false);
            intent.putExtra("from_scence", i2);
            intent.putExtra("subtype", i3);
            intent.putExtra("key_h5pay_cookie", str4);
            if (!Util.isNullOrNil(str2)) {
                intent.putExtra("prePublishId", str2);
                intent.putExtra("KPublisherId", str2);
            }
            if (i > 0) {
                intent.putExtra("pay_channel", i);
            }
            intent.putExtra("geta8key_scene", 65);
            intent.putExtra("preChatTYPE", 10);
            if (!Util.isNullOrNil(str3)) {
                intent.putExtra("srcUsername", str3);
            }
            C88144b.m109808z(MMApplicationContext.getContext(), intent);
        }

        /* renamed from: b */
        public final void mo71328b(JSONObject jSONObject) {
            C87412m.m108594g(jSONObject, "requestObj");
            String optString = jSONObject.optString("userName", "");
            String optString2 = jSONObject.optString("nickName", "");
            String optString3 = jSONObject.optString("headHDImgUrl", "");
            int optInt = jSONObject.optInt("verifyFlag", 0);
            String optString4 = jSONObject.optString("signature", "");
            C51043r10 r102 = new C51043r10();
            r102.f140656d = jSONObject.optInt("brandFlag", 0);
            r102.f140659g = jSONObject.optString("iconUrl", "");
            r102.f140658f = jSONObject.optString("brandInfo", "");
            r102.f140657e = jSONObject.optString("externalInfo", "");
            String optString5 = jSONObject.optString("searchId", "");
            String optString6 = jSONObject.optString(SearchIntents.EXTRA_QUERY, "");
            int optInt2 = jSONObject.optInt("position", 0);
            String optString7 = jSONObject.optString("extraParams", "");
            C52469w0.m58723a(optString);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", optString);
            intent.putExtra("Contact_Nick", optString2);
            intent.putExtra("Contact_BrandIconURL", optString3);
            intent.putExtra("Contact_Signature", optString4);
            intent.putExtra("Contact_VUser_Info_Flag", optInt);
            intent.putExtra("Contact_Scene", 0);
            try {
                intent.putExtra("Contact_customInfo", r102.toByteArray());
            } catch (IOException unused) {
            }
            Bundle bundle = new Bundle();
            bundle.putString("Contact_Ext_Args_Search_Id", optString5);
            bundle.putString("Contact_Ext_Args_Query_String", optString6);
            bundle.putInt("Contact_Scene", 0);
            bundle.putInt("Contact_Ext_Args_Index", optInt2);
            bundle.putString("Contact_Ext_Extra_Params", optString7);
            intent.putExtra("preChatTYPE", 10);
            intent.putExtra("Contact_Ext_Args", bundle);
            C88144b.m109791i(MMApplicationContext.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: g83.l$b */
    public static final class C98094b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C98093l<T> f287561d;

        /* renamed from: e */
        public final /* synthetic */ String f287562e;

        /* renamed from: f */
        public final /* synthetic */ boolean f287563f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98094b(C98093l<T> lVar, String str, boolean z) {
            super(0);
            this.f287561d = lVar;
            this.f287562e = str;
            this.f287563f = z;
        }

        public Object invoke() {
            C98091e<T> l = this.f287561d.mo137384l();
            if (l != null) {
                String str = this.f287562e;
                C87412m.m108593f(str, SearchIntents.EXTRA_QUERY);
                l.mo90298d3(str, this.f287563f);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98093l(C98091e<T> eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "uiComponent");
    }

    @JavascriptInterface
    public final String getMMWebSearchData(String str) {
        C98092k c;
        String str2 = this.f287560d;
        Log.m105924i(str2, "getSearchDataMore " + str);
        if (str != null) {
            C98091e l = mo137384l();
            if (!(l == null || (c = l.mo9283c()) == null)) {
                JSONObject jSONObject = new JSONObject(str);
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                C87412m.m108593f(keys, "requestObj.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    C87412m.m108593f(next, LocaleUtil.ITALIAN);
                    hashMap.put(next, jSONObject.opt(next));
                }
                C86709a0.m107524d().mo123460f(new C101988w(c.mo137377g(hashMap)));
            }
            String jSONObject2 = mo74341e().toString();
            C87412m.m108593f(jSONObject2, "returnSuccess().toString()");
            return jSONObject2;
        }
        String jSONObject3 = mo74340d().toString();
        C87412m.m108593f(jSONObject3, "returnFail().toString()");
        return jSONObject3;
    }

    @JavascriptInterface
    public String getSearchData(String str) {
        C98092k c;
        String str2 = this.f287560d;
        Log.m105924i(str2, "getSearchData " + str);
        if (str == null) {
            return mo74340d().toString();
        }
        C98091e l = mo137384l();
        if (!(l == null || (c = l.mo9283c()) == null)) {
            c.mo126346h(str);
        }
        return mo74341e().toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[SYNTHETIC, Splitter:B:30:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db A[Catch:{ Exception -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dc A[Catch:{ Exception -> 0x00e8 }] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getSearchSuggestionData(java.lang.String r12) {
        /*
            r11 = this;
            java.lang.String r0 = r11.f287560d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSearchSuggestionData "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            if (r12 == 0) goto L_0x00f1
            g83.e r0 = r11.mo137384l()
            if (r0 == 0) goto L_0x00e8
            g83.k r0 = r0.mo9283c()
            if (r0 == 0) goto L_0x00e8
            java.lang.String r1 = ""
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e8 }
            r2.<init>(r12)     // Catch:{ Exception -> 0x00e8 }
            u73.a0 r12 = new u73.a0     // Catch:{ Exception -> 0x00e8 }
            r12.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = "query"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch:{ Exception -> 0x003f }
            java.lang.String r4 = "UTF-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r4)     // Catch:{ Exception -> 0x003f }
            r12.f300187b = r3     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            java.lang.String r3 = "type"
            r4 = 0
            int r3 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x00e8 }
            r12.f300189d = r3     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = "scene"
            int r3 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x00e8 }
            r12.f300191f = r3     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = "isHomePage"
            int r3 = r2.optInt(r3, r4)     // Catch:{ Exception -> 0x00e8 }
            r12.f300186a = r3     // Catch:{ Exception -> 0x00e8 }
            int r0 = r0.mo71326a()     // Catch:{ Exception -> 0x00e8 }
            r12.f300202q = r0     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r0 = "prefixQuery"
            java.lang.String r0 = r2.optString(r0, r1)     // Catch:{ Exception -> 0x00e8 }
            r3 = 1
            if (r0 == 0) goto L_0x0074
            int r5 = r0.length()     // Catch:{ Exception -> 0x00e8 }
            if (r5 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r5 = 0
            goto L_0x0075
        L_0x0074:
            r5 = 1
        L_0x0075:
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            if (r0 == 0) goto L_0x0081
            java.util.LinkedList<java.lang.String> r3 = r12.f300197l     // Catch:{ Exception -> 0x00e8 }
            r3.add(r0)     // Catch:{ Exception -> 0x00e8 }
        L_0x0081:
            java.lang.String r0 = "requestType"
            int r0 = r2.optInt(r0, r4)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = "extReqParams"
            java.lang.String r3 = r2.optString(r3, r1)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "requestObj.optString(\"extReqParams\", \"\")"
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x00e8 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x00e8 }
            if (r5 != 0) goto L_0x00d3
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x00d3 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x00d3 }
            int r3 = r5.length()     // Catch:{ Exception -> 0x00d3 }
            r6 = 0
        L_0x00a4:
            if (r6 >= r3) goto L_0x00d3
            org.json.JSONObject r7 = r5.getJSONObject(r6)     // Catch:{ Exception -> 0x00d3 }
            te3.hy r8 = new te3.hy     // Catch:{ Exception -> 0x00d3 }
            r8.<init>()     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r9 = "key"
            java.lang.String r9 = r7.optString(r9, r1)     // Catch:{ Exception -> 0x00d3 }
            r8.f134951d = r9     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r9 = "uintValue"
            int r9 = r7.optInt(r9, r4)     // Catch:{ Exception -> 0x00d3 }
            long r9 = (long) r9     // Catch:{ Exception -> 0x00d3 }
            r8.f134952e = r9     // Catch:{ Exception -> 0x00d3 }
            java.lang.String r9 = "textValue"
            java.lang.String r7 = r7.optString(r9, r1)     // Catch:{ Exception -> 0x00d3 }
            r8.f134953f = r7     // Catch:{ Exception -> 0x00d3 }
            java.util.LinkedList<te3.hy> r7 = r12.f300200o     // Catch:{ Exception -> 0x00d3 }
            r7.add(r8)     // Catch:{ Exception -> 0x00d3 }
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00d3:
            java.lang.String r1 = "subtype"
            r2.optInt(r1, r4)     // Catch:{ Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00dc
            goto L_0x00e8
        L_0x00dc:
            u73.x r0 = new u73.x     // Catch:{ Exception -> 0x00e8 }
            r0.<init>(r12)     // Catch:{ Exception -> 0x00e8 }
            ob0.b0 r12 = f40.C86709a0.m107524d()     // Catch:{ Exception -> 0x00e8 }
            r12.mo123460f(r0)     // Catch:{ Exception -> 0x00e8 }
        L_0x00e8:
            org.json.JSONObject r12 = r11.mo74341e()
            java.lang.String r12 = r12.toString()
            return r12
        L_0x00f1:
            org.json.JSONObject r12 = r11.mo74340d()
            java.lang.String r12 = r12.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: g83.C98093l.getSearchSuggestionData(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public String getTeachSearchData(String str) {
        C98092k c;
        String str2 = str;
        Log.m105925i(this.f287560d, "getTeachSearchData = %s", str2);
        if (str2 == null) {
            return mo74340d().toString();
        }
        C98091e l = mo137384l();
        if (!(l == null || (c = l.mo9283c()) == null)) {
            JSONObject jSONObject = new JSONObject(str2);
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            C87412m.m108593f(keys, "requestObj.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                C87412m.m108593f(next, LocaleUtil.ITALIAN);
                hashMap.put(next, jSONObject.opt(next));
            }
            Log.m105925i("MicroMsg.WebSearch.WebSearchQueryData", "RcmGuideSearchWebData, getTeachSearchData: %s", hashMap);
            String str3 = (String) hashMap.get("sessionId");
            String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
            long optLong = ((C0406o) C86312j.m106911c(C0406o.class)).mo448p4("discoverSearchEntry").optLong("guideParam");
            C86709a0.m107524d().mo123460f(new C101976i0(C43471q.m46981e(hashMap, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0), C43471q.m46981e(hashMap, "type", 0), C43471q.m46977a(9), 0, currentLanguage, optLong, (String) hashMap.get("requestId"), str3, (String) hashMap.get("guideInfo"), c.mo137378i()));
        }
        return mo74341e().toString();
    }

    /* renamed from: l */
    public final C98091e<T> mo137384l() {
        C53759a aVar = this.f150904a;
        if (aVar instanceof C98091e) {
            return (C98091e) aVar;
        }
        return null;
    }

    /* renamed from: m */
    public final void mo137385m(boolean z, String str, String str2) {
        BaseWebSearchWebView webView;
        C87412m.m108594g(str, "json");
        C87412m.m108594g(str2, "requestId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("newQuery", z);
            jSONObject.put("json", str);
            jSONObject.put("requestId", str2);
        } catch (Exception unused) {
        }
        C53759a aVar = this.f150904a;
        if (aVar != null && (webView = aVar.getWebView()) != null) {
            C53761n nVar = C53761n.f150905a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "requestObj.toString()");
            nVar.mo74349a(webView, "onMMWebSearchDataReady", jSONObject2);
        }
    }

    /* renamed from: n */
    public final void mo137386n(boolean z, String str, String str2) {
        BaseWebSearchWebView webView;
        C87412m.m108594g(str, "json");
        C87412m.m108594g(str2, "requestId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("newQuery", z);
            jSONObject.put("json", str);
            jSONObject.put("requestId", str2);
        } catch (Exception unused) {
        }
        C53759a aVar = this.f150904a;
        if (aVar != null && (webView = aVar.getWebView()) != null) {
            C53761n nVar = C53761n.f150905a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "requestObj.toString()");
            nVar.mo74349a(webView, "onSearchDataReady", jSONObject2);
        }
    }

    /* renamed from: o */
    public final void mo137387o(String str, String str2) {
        BaseWebSearchWebView webView;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "custom");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SearchIntents.EXTRA_QUERY, str);
            jSONObject.put("custom", str2);
        } catch (Exception unused) {
        }
        C53759a aVar = this.f150904a;
        if (aVar != null && (webView = aVar.getWebView()) != null) {
            C53761n nVar = C53761n.f150905a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "requestObj.toString()");
            nVar.mo74349a(webView, "onSearchInputChange", jSONObject2);
        }
    }

    @JavascriptInterface
    public final String openEmojiDesignerPage(String str) {
        Log.m105925i(this.f287560d, "openEmojiDesignerPage %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("precedingScene", 0);
            int optInt2 = jSONObject.optInt("entranceScene", 0);
            boolean optBoolean = jSONObject.optBoolean("fromPop", true);
            String optString = jSONObject.optString("searchId", "");
            String optString2 = jSONObject.optString("docId", "");
            String optString3 = jSONObject.optString("designerId", "");
            String optString4 = jSONObject.optString("designerName", "");
            String optString5 = jSONObject.optString("designerThumbUrl", "");
            int optInt3 = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            Intent intent = new Intent();
            intent.putExtra("preceding_scence", optInt);
            intent.putExtra("download_entrance_scene", optInt2);
            intent.putExtra("from_popup", optBoolean);
            intent.putExtra("searchID", optString);
            intent.putExtra("docID", optString2);
            intent.putExtra("extra_scence", 27);
            intent.putExtra("id", optString3);
            intent.putExtra("name", optString4);
            intent.putExtra("headurl", optString5);
            intent.putExtra("extra_scence", optInt3);
            C98091e l = mo137384l();
            if (l != null) {
                C88144b.m109791i(l.mo24908k0(), "emoji", ".ui.v2.EmojiStoreV2DesignerUI", intent, (Bundle) null);
                String jSONObject2 = mo74341e().toString();
                C87412m.m108593f(jSONObject2, "returnSuccess().toString()");
                return jSONObject2;
            }
            String jSONObject3 = mo74340d().toString();
            C87412m.m108593f(jSONObject3, "returnFail().toString()");
            return jSONObject3;
        } catch (Exception e) {
            Log.printErrStackTrace(this.f287560d, e, "openEmojiDesignerPage", new Object[0]);
            String jSONObject4 = mo74340d().toString();
            C87412m.m108593f(jSONObject4, "returnFail().toString()");
            return jSONObject4;
        }
    }

    @JavascriptInterface
    public final String openEmojiProductPage(String str) {
        Log.m105925i(this.f287560d, "openEmojiProductPage %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("productId");
            int optInt = jSONObject.optInt("precedingScene", 0);
            int optInt2 = jSONObject.optInt("entranceScene", 0);
            boolean optBoolean = jSONObject.optBoolean("fromPop", true);
            String optString2 = jSONObject.optString("searchId", "");
            String optString3 = jSONObject.optString("docId", "");
            int optInt3 = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            Intent intent = new Intent();
            intent.putExtra("preceding_scence", optInt);
            intent.putExtra("download_entrance_scene", optInt2);
            intent.putExtra("from_popup", optBoolean);
            intent.putExtra("extra_id", optString);
            intent.putExtra("searchID", optString2);
            intent.putExtra("docID", optString3);
            intent.putExtra("extra_scence", optInt3);
            C98091e l = mo137384l();
            if (l == null) {
                return mo74340d().toString();
            }
            C88144b.m109791i(l.mo24908k0(), "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace(this.f287560d, e, "openEmojiProductPage", new Object[0]);
            return mo74340d().toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2 A[Catch:{ Exception -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d7 A[Catch:{ Exception -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f6 A[Catch:{ Exception -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00fb A[Catch:{ Exception -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0106 A[Catch:{ Exception -> 0x0190 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b A[Catch:{ Exception -> 0x0190 }] */
    @android.webkit.JavascriptInterface
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String openWeAppPage(java.lang.String r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "render_data"
            java.lang.String r3 = "relativeURL"
            java.lang.String r4 = ""
            java.lang.String r5 = r1.f287560d
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r0
            java.lang.String r9 = "openWeAppPage %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r7)
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0190 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = "userName"
            java.lang.String r7 = r5.optString(r0, r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r9 = r5.optString(r3, r4)     // Catch:{ Exception -> 0x0190 }
            gy3.C87412m.m108593f(r9, r3)     // Catch:{ Exception -> 0x0190 }
            boolean r0 = z04.C112550d0.m153801u(r9, r2, r8)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x0081
            android.net.Uri r0 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r3 = "widgetData"
            java.lang.String r0 = r0.getQueryParameter(r3)     // Catch:{ Exception -> 0x0079 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0079 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0079 }
            r3.remove(r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = "(widgetData=.*&)|(widgetData=.*$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "compile(pattern)"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = "&"
            java.util.regex.Matcher r0 = r0.matcher(r9)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r2 = r0.replaceAll(r2)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r0 = "nativePattern.matcher(in…).replaceAll(replacement)"
            gy3.C87412m.m108593f(r2, r0)     // Catch:{ Exception -> 0x0079 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0076 }
            r0.<init>()     // Catch:{ Exception -> 0x0076 }
            r0.append(r2)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r9 = "&widgetData="
            r0.append(r9)     // Catch:{ Exception -> 0x0076 }
            r0.append(r3)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0076 }
            goto L_0x0081
        L_0x0076:
            r0 = move-exception
            r9 = r2
            goto L_0x007a
        L_0x0079:
            r0 = move-exception
        L_0x007a:
            java.lang.String r2 = r1.f287560d     // Catch:{ Exception -> 0x0190 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0190 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)     // Catch:{ Exception -> 0x0190 }
        L_0x0081:
            java.lang.String r0 = "appVersion"
            int r0 = r5.optInt(r0, r8)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r2 = "searchId"
            java.lang.String r2 = r5.optString(r2, r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r3 = "docId"
            java.lang.String r3 = r5.optString(r3, r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r10 = "position"
            int r6 = r5.optInt(r10, r6)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r10 = "scene"
            r11 = 1000(0x3e8, float:1.401E-42)
            int r10 = r5.optInt(r10, r11)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r12 = "debugMode"
            int r12 = r5.optInt(r12, r8)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r13 = "cookie"
            java.lang.String r13 = r5.optString(r13, r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r14 = "appId"
            java.lang.String r14 = r5.optString(r14, r4)     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x0190 }
            r15.<init>()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r8 = "cookies"
            r15.put(r8, r13)     // Catch:{ Exception -> 0x00c1 }
            goto L_0x00c2
        L_0x00c1:
        L_0x00c2:
            if (r12 >= 0) goto L_0x00c5
            r12 = 0
        L_0x00c5:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent r8 = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent     // Catch:{ Exception -> 0x0190 }
            r8.<init>()     // Catch:{ Exception -> 0x0190 }
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r13 = r8.f9522d     // Catch:{ Exception -> 0x0190 }
            g83.e r16 = r17.mo137384l()     // Catch:{ Exception -> 0x0190 }
            if (r16 == 0) goto L_0x00d7
            android.content.Context r16 = r16.mo24908k0()     // Catch:{ Exception -> 0x0190 }
            goto L_0x00d9
        L_0x00d7:
            r16 = 0
        L_0x00d9:
            r11 = r16
            r13.f9531f = r11     // Catch:{ Exception -> 0x0190 }
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r11 = r8.f9522d     // Catch:{ Exception -> 0x0190 }
            r11.f9526a = r7     // Catch:{ Exception -> 0x0190 }
            r11.f9527b = r9     // Catch:{ Exception -> 0x0190 }
            r11.f9534i = r0     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = "sos"
            r11.f9547v = r0     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x0190 }
            r11.f9548w = r0     // Catch:{ Exception -> 0x0190 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)     // Catch:{ Exception -> 0x0190 }
            if (r0 == 0) goto L_0x00fb
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r0 = r8.f9522d     // Catch:{ Exception -> 0x0190 }
            r0.f9546u = r7     // Catch:{ Exception -> 0x0190 }
            goto L_0x00ff
        L_0x00fb:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r0 = r8.f9522d     // Catch:{ Exception -> 0x0190 }
            r0.f9546u = r14     // Catch:{ Exception -> 0x0190 }
        L_0x00ff:
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r0 = r8.f9522d     // Catch:{ Exception -> 0x0190 }
            r0.f9528c = r12     // Catch:{ Exception -> 0x0190 }
            r7 = 3
            if (r10 == r7) goto L_0x013b
            r7 = 14
            if (r10 == r7) goto L_0x0136
            r7 = 16
            if (r10 == r7) goto L_0x0131
            r7 = 20
            if (r10 == r7) goto L_0x012c
            r7 = 22
            if (r10 == r7) goto L_0x0136
            r7 = 42
            if (r10 == r7) goto L_0x0127
            r7 = 52
            if (r10 == r7) goto L_0x0127
            r7 = 201(0xc9, float:2.82E-43)
            if (r10 == r7) goto L_0x0136
            r7 = 1000(0x3e8, float:1.401E-42)
            r0.f9529d = r7     // Catch:{ Exception -> 0x0190 }
            goto L_0x013f
        L_0x0127:
            r7 = 1106(0x452, float:1.55E-42)
            r0.f9529d = r7     // Catch:{ Exception -> 0x0190 }
            goto L_0x013f
        L_0x012c:
            r7 = 1053(0x41d, float:1.476E-42)
            r0.f9529d = r7     // Catch:{ Exception -> 0x0190 }
            goto L_0x013f
        L_0x0131:
            r7 = 1042(0x412, float:1.46E-42)
            r0.f9529d = r7     // Catch:{ Exception -> 0x0190 }
            goto L_0x013f
        L_0x0136:
            r7 = 1006(0x3ee, float:1.41E-42)
            r0.f9529d = r7     // Catch:{ Exception -> 0x0190 }
            goto L_0x013f
        L_0x013b:
            r7 = 1005(0x3ed, float:1.408E-42)
            r0.f9529d = r7     // Catch:{ Exception -> 0x0190 }
        L_0x013f:
            java.lang.String r0 = "statSessionId"
            java.lang.String r0 = r5.optString(r0, r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r7 = "statKeywordId"
            java.lang.String r7 = r5.optString(r7, r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r9 = "subScene"
            java.lang.String r4 = r5.optString(r9, r4)     // Catch:{ Exception -> 0x0190 }
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent$a r5 = r8.f9522d     // Catch:{ Exception -> 0x0190 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0190 }
            r9.<init>()     // Catch:{ Exception -> 0x0190 }
            r9.append(r0)     // Catch:{ Exception -> 0x0190 }
            r0 = 58
            r9.append(r0)     // Catch:{ Exception -> 0x0190 }
            r9.append(r7)     // Catch:{ Exception -> 0x0190 }
            r9.append(r0)     // Catch:{ Exception -> 0x0190 }
            r9.append(r2)     // Catch:{ Exception -> 0x0190 }
            r9.append(r0)     // Catch:{ Exception -> 0x0190 }
            r9.append(r3)     // Catch:{ Exception -> 0x0190 }
            r9.append(r0)     // Catch:{ Exception -> 0x0190 }
            r9.append(r6)     // Catch:{ Exception -> 0x0190 }
            r9.append(r0)     // Catch:{ Exception -> 0x0190 }
            r9.append(r4)     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = r9.toString()     // Catch:{ Exception -> 0x0190 }
            r5.f9530e = r0     // Catch:{ Exception -> 0x0190 }
            r8.publish()     // Catch:{ Exception -> 0x0190 }
            org.json.JSONObject r0 = r17.mo74341e()     // Catch:{ Exception -> 0x0190 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0190 }
            goto L_0x01a4
        L_0x0190:
            r0 = move-exception
            java.lang.String r2 = r1.f287560d
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "openWeAppPage"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
            org.json.JSONObject r0 = r17.mo74340d()
            java.lang.String r0 = r0.toString()
        L_0x01a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g83.C98093l.openWeAppPage(java.lang.String):java.lang.String");
    }

    @JavascriptInterface
    public final String openWeAppProfile(String str) {
        Log.m105925i(this.f287560d, "openWeAppProfile %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("searchId", "");
            String optString2 = jSONObject.optString("docId", "");
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int optInt2 = jSONObject.optInt("fromScene", 0);
            int optInt3 = jSONObject.optInt("type", 0);
            String optString3 = jSONObject.optString("weAppUsername", "");
            Bundle bundle = new Bundle();
            bundle.putInt("stat_scene", 8);
            bundle.putString("stat_search_id", optString);
            String str2 = optString + XVFSFile.PATH_SEPARATOR_CHAR + optString2 + XVFSFile.PATH_SEPARATOR_CHAR + optInt + XVFSFile.PATH_SEPARATOR_CHAR + optInt3;
            Intent intent = new Intent();
            intent.putExtra("key_username", optString3);
            intent.putExtra("key_can_swipe_back", true);
            intent.putExtra("key_from_scene", optInt2);
            intent.putExtra("key_scene_note", str2);
            intent.putExtra("_stat_obj", bundle);
            C98091e l = mo137384l();
            if (l == null) {
                return mo74340d().toString();
            }
            C88144b.m109791i(l.mo24908k0(), XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandProfileUI", intent, (Bundle) null);
            return mo74341e().toString();
        } catch (Exception e) {
            Log.printErrStackTrace(this.f287560d, e, C91036c.NAME, new Object[0]);
            return mo74340d().toString();
        }
    }

    /* renamed from: p */
    public final void mo137392p(String str, String str2) {
        BaseWebSearchWebView webView;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        C87412m.m108594g(str2, "custom");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(SearchIntents.EXTRA_QUERY, str);
            jSONObject.put("custom", str2);
        } catch (Exception unused) {
        }
        C53759a aVar = this.f150904a;
        if (aVar != null && (webView = aVar.getWebView()) != null) {
            C53761n nVar = C53761n.f150905a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "requestObj.toString()");
            nVar.mo74349a(webView, "onSearchInputConfirm", jSONObject2);
        }
    }

    /* renamed from: q */
    public final void mo137393q(String str) {
        BaseWebSearchWebView webView;
        C87412m.m108594g(str, "json");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("json", str);
        } catch (Exception unused) {
        }
        C53759a aVar = this.f150904a;
        if (aVar != null && (webView = aVar.getWebView()) != null) {
            C53761n nVar = C53761n.f150905a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "requestObj.toString()");
            nVar.mo74349a(webView, "onSearchSuggestionDataReady", jSONObject2);
        }
    }

    @JavascriptInterface
    public String setSearchInputWord(String str) {
        String str2 = this.f287560d;
        Log.m105924i(str2, "setSearchInputWord " + str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            C61926c.m72668M(new C98094b(this, jSONObject.optString("word", ""), jSONObject.optBoolean("isInputChange", false)));
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }

    @JavascriptInterface
    public String startSearchItemDetailPage(String str) {
        String str2 = str;
        String str3 = this.f287560d;
        Log.m105924i(str3, "startSearchItemDetailPage " + str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
            int optInt2 = jSONObject.optInt("type", 0);
            int optInt3 = jSONObject.optInt("subType", 0);
            String optString = jSONObject.optString("srcUserName", "");
            String optString2 = jSONObject.optString("jumpUrl", "");
            String optString3 = jSONObject.optString("cookie", "");
            String optString4 = jSONObject.optString("publishId", "");
            int optInt4 = jSONObject.optInt("payScene", 0);
            if (optInt2 == 1) {
                f287559e.mo71328b(jSONObject);
            } else if (optInt2 == 2 || optInt2 == 4 || optInt2 == 16) {
                C45901a aVar = f287559e;
                C87412m.m108593f(optString2, "jumpUrl");
                C87412m.m108593f(optString4, "publishId");
                C87412m.m108593f(optString, "srcUserName");
                C87412m.m108593f(optString3, "cookie");
                C45901a.m51178a(aVar, optString2, optString4, optInt4, optString, optInt, optInt3, optString3);
            }
            return mo74341e().toString();
        } catch (Exception unused) {
            return mo74340d().toString();
        }
    }
}
