package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import a93.C0019d;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6209b4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$c */
public class b2$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f22098d;

    /* renamed from: e */
    public final /* synthetic */ C43620m2.C5947b f22099e;

    /* renamed from: f */
    public final /* synthetic */ Context f22100f;

    /* renamed from: g */
    public final /* synthetic */ C5883b2 f22101g;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$c$a */
    public class C5884a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ JSONArray f22102d;

        public C5884a(JSONArray jSONArray) {
            this.f22102d = jSONArray;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107146h(1, b2$$c.this.f22100f.getString(C0966R.string.hre), C0966R.raw.icons_filled_share, b2$$c.this.f22100f.getResources().getColor(C0966R.color.f2939n));
            e0Var.mo107146h(2, b2$$c.this.f22100f.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, 0);
            b2$$c b2__c = b2$$c.this;
            b2__c.f22101g.mo6922g(this.f22102d, e0Var, b2__c.f22100f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$c$b */
    public class C5885b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f22104d;

        /* renamed from: e */
        public final /* synthetic */ String f22105e;

        /* renamed from: f */
        public final /* synthetic */ C77407n f22106f;

        public C5885b(JSONObject jSONObject, String str, C77407n nVar) {
            this.f22104d = jSONObject;
            this.f22105e = str;
            this.f22106f = nVar;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                b2$$c b2__c = b2$$c.this;
                if (!C5883b2.m5609f(b2__c.f22101g, b2__c.f22100f, this.f22104d, b2__c.f22099e, false) && (optJSONObject2 = this.f22104d.optJSONObject("friend")) != null) {
                    b2$$c b2__c2 = b2$$c.this;
                    C5883b2 b2Var = b2__c2.f22101g;
                    Context context = b2__c2.f22100f;
                    String str = this.f22105e;
                    C43620m2.C5947b bVar = b2__c2.f22099e;
                    b2Var.getClass();
                    String optString = optJSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    String optString2 = optJSONObject2.optString("desc");
                    String optString3 = optJSONObject2.optString("img_url");
                    String optString4 = optJSONObject2.optString("link");
                    C6209b4.m6499a(optString3);
                    HashMap hashMap = new HashMap();
                    hashMap.put("img_url", optString3);
                    hashMap.put("desc", optString2);
                    hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, optString);
                    hashMap.put("url", optString4);
                    Intent intent = new Intent();
                    intent.putExtra("Select_Conv_Type", 35);
                    intent.putExtra("scene_from", 2);
                    intent.putExtra("mutil_select_is_ret", true);
                    intent.putExtra("webview_params", hashMap);
                    intent.putExtra("Retr_Msg_Type", 2);
                    C88144b.m109803u((MMActivity) context, ".ui.transmit.SelectConversationUI", intent, 1, new C5892c2(b2Var, optJSONObject2, context, str, bVar));
                }
                C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 2, 2, 0, this.f22105e);
            } else if (itemId == 2) {
                b2$$c b2__c3 = b2$$c.this;
                if (!C5883b2.m5609f(b2__c3.f22101g, b2__c3.f22100f, this.f22104d, b2__c3.f22099e, true) && (optJSONObject = this.f22104d.optJSONObject("timeline")) != null) {
                    b2$$c b2__c4 = b2$$c.this;
                    C5883b2 b2Var2 = b2__c4.f22101g;
                    Context context2 = b2__c4.f22100f;
                    String str2 = this.f22105e;
                    C43620m2.C5947b bVar2 = b2__c4.f22099e;
                    b2Var2.getClass();
                    MMActivity mMActivity = (MMActivity) context2;
                    if (mMActivity == null || mMActivity.isFinishing()) {
                        Log.m105928w("MicroMsg.JsApiShareCustomContent", "activity is null or finish");
                    } else {
                        String optString5 = optJSONObject.optString("link");
                        if (Util.isNullOrNil(optString5)) {
                            Log.m105920e("MicroMsg.JsApiShareCustomContent", "link is null");
                        } else {
                            String optString6 = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                            String optString7 = optJSONObject.optString("img_url");
                            Intent intent2 = new Intent();
                            intent2.putExtra("Ksnsupload_link", optString5);
                            intent2.putExtra("Ksnsupload_title", optString6);
                            intent2.putExtra("Ksnsupload_imgurl", optString7);
                            intent2.putExtra("ShareUrlOriginal", optString5);
                            intent2.putExtra("ShareUrlOpen", optJSONObject.optString("currentUrl"));
                            intent2.putExtra("JsAppId", optJSONObject.optString("preVerifyAppId"));
                            intent2.putExtra("need_result", true);
                            intent2.putExtra("Ksnsupload_type", 1);
                            Log.m105924i("MicroMsg.JsApiShareCustomContent", "doTimeline, start activity");
                            mMActivity.mmSetOnActivityResultCallback(new C5915f2(b2Var2, str2, mMActivity, bVar2));
                            C88144b.m109796n(mMActivity, "sns", ".ui.SnsUploadUI", intent2, 2, false);
                        }
                    }
                }
                C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 3, 2, 0, this.f22105e);
            } else {
                b2$$c b2__c5 = b2$$c.this;
                C5883b2 b2Var3 = b2__c5.f22101g;
                C43620m2.C5947b bVar3 = b2__c5.f22099e;
                b2Var3.getClass();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", itemId - 1000);
                } catch (JSONException unused) {
                }
                bVar3.mo6946b("onShareCustomMenuItemClick", jSONObject);
                bVar3.mo6945a((String) null, (JSONObject) null);
            }
            this.f22106f.mo107572p();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$c$c */
    public class C5886c implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ String f22108a;

        public C5886c(String str) {
            this.f22108a = str;
        }

        public void onDismiss() {
            C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 1, 28, 0, this.f22108a);
            b2$$c.this.f22099e.mo6945a((String) null, (JSONObject) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$c$d */
    public class C5887d implements C0019d.C0020a {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f22110a;

        /* renamed from: b */
        public final /* synthetic */ String f22111b;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.b2$$c$d$a */
        public class C5888a implements C0019d.C0021b {
            public C5888a() {
            }
        }

        public C5887d(JSONObject jSONObject, String str) {
            this.f22110a = jSONObject;
            this.f22111b = str;
        }

        /* renamed from: a */
        public void mo22a(String str, JSONObject jSONObject) {
            JSONObject optJSONObject = this.f22110a.optJSONObject("friend");
            if (optJSONObject != null) {
                C0019d.m10b(b2$$c.this.f22100f, str, optJSONObject.optString("link"), optJSONObject, b2$$c.this.f22099e, new C5888a());
            }
            C40314g.m43484c(MMApplicationContext.getContext(), 20, 2001, 2, 2, 0, this.f22111b);
        }
    }

    public b2$$c(C5883b2 b2Var, String str, C43620m2.C5947b bVar, Context context) {
        this.f22101g = b2Var;
        this.f22098d = str;
        this.f22099e = bVar;
        this.f22100f = context;
    }

    public void run() {
        String str = "";
        try {
            JSONObject jSONObject = new JSONObject(this.f22098d);
            JSONObject optJSONObject = jSONObject.optJSONObject("extInfo");
            if (optJSONObject != null) {
                try {
                    str = URLEncoder.encode(optJSONObject.toString(), "utf-8");
                } catch (UnsupportedEncodingException unused) {
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("menuItems");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("opItems");
            C77407n nVar = new C77407n(this.f22100f, 0, false);
            nVar.f225771i = new C5884a(optJSONArray);
            nVar.f225782p = new C5885b(jSONObject, str, nVar);
            C5883b2 b2Var = this.f22101g;
            C43620m2.C5947b bVar = this.f22099e;
            Context context = this.f22100f;
            b2Var.getClass();
            if (optJSONArray2 != null) {
                nVar.f225773j = new b2$$a(b2Var, optJSONArray2, context);
                nVar.f225787r = new b2$$b(b2Var, bVar, nVar);
            }
            nVar.f225761d = new C5886c(str);
            if (jSONObject.optBoolean("enableQuickSend", true)) {
                C0019d.m9a(this.f22100f, nVar, new C5887d(jSONObject, str));
            }
            nVar.mo107573q();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.JsApiShareCustomContent", e, str, new Object[0]);
            this.f22099e.mo6945a((String) null, (JSONObject) null);
        }
    }
}
