package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKImageItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C66261f3;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v */
public class C5991v extends C5954n2<C43658n> {

    /* renamed from: e */
    public ProgressDialog f22238e = null;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v$a */
    public class C5992a implements C96651n {

        /* renamed from: a */
        public final /* synthetic */ String f22239a;

        /* renamed from: b */
        public final /* synthetic */ C43620m2.C5947b f22240b;

        public C5992a(String str, C43620m2.C5947b bVar) {
            this.f22239a = str;
            this.f22240b = bVar;
        }

        /* renamed from: a */
        public void mo6964a(boolean z, int i, String str, String str2, String str3, String str4) {
            Log.m105925i("MicroMsg.JsApiDownLoadImage", "doDownLoadImage, on cdn finish, is success : %b, local id : %s, media id is : %s", Boolean.valueOf(z), str, str2);
            if (!Util.isNullOrNil(str2) && str2.equals(this.f22239a)) {
                C6080m.Cx0().mo134808h(this);
                ProgressDialog progressDialog = C5991v.this.f22238e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    C5991v.this.f22238e = null;
                }
                if (!z) {
                    this.f22240b.mo6945a("fail", (JSONObject) null);
                    return;
                }
                WebViewJSSDKFileItem b = C6080m.Ax0().mo7010b(str);
                if ((b instanceof WebViewJSSDKImageItem) && Util.isNullOrNil(b.f283023f)) {
                    ((WebViewJSSDKImageItem) b).mo6984f();
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C66261f3.COL_LOCALID, str);
                } catch (JSONException unused) {
                }
                this.f22240b.mo6945a((String) null, jSONObject);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v$b */
    public class C5993b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C96651n f22242d;

        /* renamed from: e */
        public final /* synthetic */ String f22243e;

        /* renamed from: f */
        public final /* synthetic */ C43620m2.C5947b f22244f;

        public C5993b(C5991v vVar, C96651n nVar, String str, C43620m2.C5947b bVar) {
            this.f22242d = nVar;
            this.f22243e = str;
            this.f22244f = bVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C6080m.Cx0().mo134808h(this.f22242d);
            C6080m.Cx0().mo134804d(this.f22243e);
            this.f22244f.mo6945a("downloadImage:fail", (JSONObject) null);
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "downloadImage";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 2;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
        JSONObject e = C6013c.m5893e(str);
        if (e == null) {
            Log.m105924i("MicroMsg.JsApiDownLoadImage", "data is null");
            bVar.mo6945a("invalid_data", (JSONObject) null);
            return;
        }
        String optString = e.optString("preVerifyAppId");
        String optString2 = e.optString("serverId");
        boolean z = Util.getInt(e.optString("isShowProgressTips", "0"), 0) == 1;
        Log.m105925i("MicroMsg.JsApiDownLoadImage", "doDownLoadImage, appid is : %s, media id is : %s", optString, optString2);
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
            bVar.mo6945a("missing arguments", (JSONObject) null);
            return;
        }
        C5992a aVar = new C5992a(optString2, bVar);
        C6080m.Cx0().mo134801a(optString, optString2, aVar);
        Log.m105925i("MicroMsg.JsApiDownLoadImage", "doDownLoadImage, add cdn download task result : %b", Boolean.TRUE);
        if (z) {
            this.f22238e = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.f361651lm0), true, true, new C5993b(this, aVar, optString2, bVar));
        }
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
    }
}
