package com.tencent.p014mm.plugin.appbrand.menu;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.io.InputStream;
import java.util.Map;
import lb0.C88394b;
import org.json.JSONObject;
import p210o.C11323a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.d0 */
public final class C83664d0 {

    /* renamed from: a */
    public static final C83664d0 f244290a = new C83664d0();

    /* renamed from: b */
    public static final C13601g f244291b = C36568h.m40985a(C29603g.f80530d);

    /* renamed from: c */
    public static final C13601g f244292c = C36568h.m40985a(C83670f.f244303d);

    /* renamed from: d */
    public static final C13601g f244293d = C36568h.m40985a(C83667c.f244300d);

    /* renamed from: e */
    public static final C13601g f244294e;

    /* renamed from: f */
    public static final C13601g f244295f;

    /* renamed from: g */
    public static final C13601g f244296g;

    /* renamed from: h */
    public static final C13601g f244297h;

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d0$g */
    public static final class C29603g extends C87413o implements C32224a<JSONObject> {

        /* renamed from: d */
        public static final C29603g f80530d = new C29603g();

        public C29603g() {
            super(0);
        }

        public Object invoke() {
            try {
                String str = AppBrandGlobalSystemConfig.m100099b().f239302Z;
                return str != null ? new JSONObject(str) : new JSONObject();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "tradeGuaranteeMenuSettingJson#get, fail since " + e);
                return new JSONObject();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d0$a */
    public static final class C83665a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C83665a f244298d = new C83665a();

        public C83665a() {
            super(0);
        }

        public Object invoke() {
            String optString = C83664d0.m102704a(C83664d0.f244290a).optString("ComplaintDarkIconUrl");
            if (optString.length() == 0) {
                optString = null;
            }
            Log.m105924i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "complaintDarkIconUrl#get, " + optString);
            return optString;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d0$b */
    public static final class C83666b extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C83666b f244299d = new C83666b();

        public C83666b() {
            super(0);
        }

        public Object invoke() {
            String optString = C83664d0.m102704a(C83664d0.f244290a).optString("ComplaintIconUrl");
            if (optString.length() == 0) {
                optString = null;
            }
            Log.m105924i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "complaintLightIconUrl#get, " + optString);
            return optString;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d0$c */
    public static final class C83667c extends C87413o implements C32224a<JSONObject> {

        /* renamed from: d */
        public static final C83667c f244300d = new C83667c();

        public C83667c() {
            super(0);
        }

        public Object invoke() {
            JSONObject optJSONObject = C83664d0.m102704a(C83664d0.f244290a).optJSONObject("ComplaintWording");
            Log.m105924i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "complaintWordingPack#get, " + optJSONObject);
            return optJSONObject;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d0$d */
    public static final class C83668d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C83668d f244301d = new C83668d();

        public C83668d() {
            super(0);
        }

        public Object invoke() {
            String optString = C83664d0.m102704a(C83664d0.f244290a).optString("FeedbackDarkIconUrl");
            if (optString.length() == 0) {
                optString = null;
            }
            Log.m105924i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "feedbackDarkIconUrl#get, " + optString);
            return optString;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d0$e */
    public static final class C83669e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C83669e f244302d = new C83669e();

        public C83669e() {
            super(0);
        }

        public Object invoke() {
            String optString = C83664d0.m102704a(C83664d0.f244290a).optString("FeedbackIconUrl");
            if (optString.length() == 0) {
                optString = null;
            }
            Log.m105924i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "feedbackLightIconUrl#get, " + optString);
            return optString;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.d0$f */
    public static final class C83670f extends C87413o implements C32224a<JSONObject> {

        /* renamed from: d */
        public static final C83670f f244303d = new C83670f();

        public C83670f() {
            super(0);
        }

        public Object invoke() {
            JSONObject optJSONObject = C83664d0.m102704a(C83664d0.f244290a).optJSONObject("FeedbackWording");
            Log.m105924i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "feedbackWordingPack#get, " + optJSONObject);
            return optJSONObject;
        }
    }

    static {
        C13601g a = C36568h.m40985a(C83669e.f244302d);
        f244294e = a;
        C13601g a2 = C36568h.m40985a(C83668d.f244301d);
        f244295f = a2;
        C13601g a3 = C36568h.m40985a(C83666b.f244299d);
        f244296g = a3;
        C13601g a4 = C36568h.m40985a(C83665a.f244298d);
        f244297h = a4;
        Log.m105924i("MicroMsg.AppBrand.TradeGuaranteeMenuSetting", "<init>, preDownloadIcons");
        String str = C88394b.f255384g;
        C88394b bVar = C88394b.C88418q.f255427a;
        bVar.mo122799r((String) ((C36570n) a).getValue(), (Map<String, String>) null, (C11323a<InputStream, Void>) null);
        bVar.mo122799r((String) ((C36570n) a2).getValue(), (Map<String, String>) null, (C11323a<InputStream, Void>) null);
        bVar.mo122799r((String) ((C36570n) a3).getValue(), (Map<String, String>) null, (C11323a<InputStream, Void>) null);
        bVar.mo122799r((String) ((C36570n) a4).getValue(), (Map<String, String>) null, (C11323a<InputStream, Void>) null);
    }

    /* renamed from: a */
    public static final JSONObject m102704a(C83664d0 d0Var) {
        d0Var.getClass();
        return (JSONObject) ((C36570n) f244291b).getValue();
    }
}
