package com.tencent.p014mm.plugin.appbrand.jsapi.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.o */
public final class C82982o extends C82268c<C82381f> {
    private static final int CTRL_INDEX = 957;
    private static final String NAME = "shareVideoMessage";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.share.o$a */
    public static final class C82983a<R extends AppBrandProxyUIProcessTask.ProcessResult> implements AppBrandProxyUIProcessTask.C81943b {

        /* renamed from: a */
        public final /* synthetic */ Activity f242641a;

        /* renamed from: b */
        public final /* synthetic */ C82381f f242642b;

        /* renamed from: c */
        public final /* synthetic */ int f242643c;

        /* renamed from: d */
        public final /* synthetic */ C82982o f242644d;

        public C82983a(Activity activity, C82381f fVar, int i, C82982o oVar) {
            this.f242641a = activity;
            this.f242642b = fVar;
            this.f242643c = i;
            this.f242644d = oVar;
        }

        public void onReceiveResult(AppBrandProxyUIProcessTask.ProcessResult processResult) {
            C82975k0 k0Var;
            ShareToConversationResult shareToConversationResult = (ShareToConversationResult) processResult;
            if (shareToConversationResult == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, result is null");
                return;
            }
            int i = shareToConversationResult.f242577d;
            C82975k0[] values = C82975k0.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    k0Var = null;
                    break;
                }
                k0Var = values[i2];
                if (i == k0Var.f242615d) {
                    break;
                }
                i2++;
            }
            if (k0Var == null) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, shareResult is null");
                k0Var = C82975k0.FAIL;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, shareResult: " + k0Var);
            int ordinal = k0Var.ordinal();
            if (ordinal == 0) {
                Activity activity = this.f242641a;
                C75026b.m89951a(activity, activity.getString(C0966R.string.euo));
                this.f242642b.mo109647a(this.f242643c, this.f242644d.mo115109j("ok"));
            } else if (ordinal == 1) {
                this.f242642b.mo109647a(this.f242643c, this.f242644d.mo115109j("cancel"));
            } else if (ordinal == 2) {
                this.f242642b.mo109647a(this.f242643c, this.f242644d.mo115109j("fail"));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C86009m1 absoluteFile;
        C86009m1 absoluteFile2;
        if (fVar == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, env is null");
            return;
        }
        Context context = fVar.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, activity is null");
            fVar.mo109647a(i, mo115109j("fail:activity is null"));
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, data is null");
            fVar.mo109647a(i, mo115109j("fail:data is null"));
        } else {
            String optString = jSONObject.optString("videoPath");
            boolean z = false;
            if (optString == null || optString.length() == 0) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath is empty");
                fVar.mo109647a(i, mo115109j("fail:videoPath is empty"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath: " + optString);
            C81415h0 fileSystem = fVar.getFileSystem();
            String i2 = (fileSystem == null || (absoluteFile2 = fileSystem.getAbsoluteFile(optString)) == null) ? null : absoluteFile2.mo119971i();
            if (i2 == null || i2.length() == 0) {
                z = true;
            }
            if (z) {
                Log.m105928w("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, videoPath is illegal");
                fVar.mo109647a(i, mo115109j("fail:videoPath is illegal"));
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, realVideoPath: " + i2);
            String optString2 = jSONObject.optString("thumbPath");
            C81415h0 fileSystem2 = fVar.getFileSystem();
            String i3 = (fileSystem2 == null || (absoluteFile = fileSystem2.getAbsoluteFile(optString2)) == null) ? null : absoluteFile.mo119971i();
            Log.m105924i("MicroMsg.AppBrand.JsApiShareVideoMessage", "invoke, thumbPath: " + optString2 + ", realThumbPath: " + i3);
            C81956c.m100675c(activity, new ShareVideoToConversationRequest(i2, i3), new C82983a(activity, fVar, i, this), (Intent) null);
        }
    }
}
