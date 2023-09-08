package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager;
import com.tencent.p014mm.plugin.webview.luggage.util.C6013c;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashMap;
import nj3.C76879j;
import org.json.JSONObject;
import p749xh.C66261f3;
import p828wa.C53096b;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.l2 */
public class C24290l2 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.l2$a */
    public class C24291a implements LuggageUploadMediaFileManager.C19421d {

        /* renamed from: a */
        public final /* synthetic */ C53096b.C53097a f69744a;

        /* renamed from: b */
        public final /* synthetic */ LuggageUploadMediaFileManager f69745b;

        public C24291a(C24290l2 l2Var, C53096b.C53097a aVar, LuggageUploadMediaFileManager luggageUploadMediaFileManager) {
            this.f69744a = aVar;
            this.f69745b = luggageUploadMediaFileManager;
        }

        /* renamed from: a */
        public void mo41064a(boolean z, HashMap<String, Object> hashMap) {
            Log.m105925i("MicroMsg.JsApiUploadMediaFile", "sucess = %b", Boolean.valueOf(z));
            if (z) {
                this.f69744a.mo73779d(hashMap);
            } else {
                this.f69744a.mo73778c("fail", (JSONObject) null);
            }
            LuggageUploadMediaFileManager luggageUploadMediaFileManager = this.f69745b;
            luggageUploadMediaFileManager.f69724a = null;
            luggageUploadMediaFileManager.f69725b = null;
            luggageUploadMediaFileManager.f69726c = null;
            luggageUploadMediaFileManager.f69727d = null;
            luggageUploadMediaFileManager.f69729f = null;
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "uploadMediaFile";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiUploadMediaFile", "invokeInOwn");
        String optString = aVar.f148190b.f129368c.optString("appId");
        String optString2 = aVar.f148190b.f129368c.optString(C66261f3.COL_LOCALID);
        boolean z = aVar.f148190b.f129368c.optInt("isShowProgressTips", 0) == 1;
        Log.m105925i("MicroMsg.JsApiUploadMediaFile", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips = %b", optString, optString2, Boolean.valueOf(z));
        if (Util.isNullOrNil(optString) || Util.isNullOrNil(optString2)) {
            Log.m105920e("MicroMsg.JsApiUploadMediaFile", "appId or localid is null or nil.");
            aVar.mo73778c("missing arguments", (JSONObject) null);
            return;
        }
        LuggageUploadMediaFileManager luggageUploadMediaFileManager = new LuggageUploadMediaFileManager();
        CONTEXT context = aVar.f148189a;
        C24291a aVar2 = new C24291a(this, aVar, luggageUploadMediaFileManager);
        luggageUploadMediaFileManager.f69724a = (MMActivity) ((C43658n) context).f148196d;
        luggageUploadMediaFileManager.f69725b = (C43658n) context;
        luggageUploadMediaFileManager.f69726c = optString;
        luggageUploadMediaFileManager.f69727d = optString2;
        luggageUploadMediaFileManager.f69728e = z;
        luggageUploadMediaFileManager.f69729f = aVar2;
        WebViewJSSDKFileItem a = C6013c.m5889a(optString2);
        if (a == null) {
            Log.m105920e("MicroMsg.UploadMediaFileHelp", "item is null");
            ((C24291a) luggageUploadMediaFileManager.f69729f).mo41064a(false, (HashMap<String, Object>) null);
        } else if (a.f283028n == 1) {
            luggageUploadMediaFileManager.mo41055c();
        } else if (Util.isNullOrNil(a.f283024g) || !C86013q1.m106450k(a.f283024g)) {
            Log.m105920e("MicroMsg.UploadMediaFileHelp", "origFilePath is not exist");
            ((C24291a) luggageUploadMediaFileManager.f69729f).mo41064a(false, (HashMap<String, Object>) null);
        } else if (!C114786m0.m161568a(luggageUploadMediaFileManager.f69724a)) {
            String sizeMB = Util.getSizeMB((long) ((int) C86013q1.m106451l(a.f283024g)));
            MMActivity mMActivity = luggageUploadMediaFileManager.f69724a;
            C76879j.m92714H(mMActivity, mMActivity.getString(C0966R.string.lg8, new Object[]{sizeMB}), luggageUploadMediaFileManager.f69724a.getString(C0966R.string.a3h), false, new C24292p2(luggageUploadMediaFileManager), new C24293q2(luggageUploadMediaFileManager));
        } else {
            luggageUploadMediaFileManager.mo41056d();
        }
    }
}
