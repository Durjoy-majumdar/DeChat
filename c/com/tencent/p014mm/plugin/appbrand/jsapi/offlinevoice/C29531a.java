package com.tencent.p014mm.plugin.appbrand.jsapi.offlinevoice;

import android.os.Bundle;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.offlinevoice.IPCSetCurrentPaySpeech;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86009m1;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.a */
public class C29531a extends C82268c {
    public static final int CTRL_INDEX = 634;
    public static final String NAME = "setCurrentPaySpeech";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.a$a */
    public class C29532a implements C1256g<Bundle> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f80426d;

        /* renamed from: e */
        public final /* synthetic */ int f80427e;

        public C29532a(C82381f fVar, int i) {
            this.f80426d = fVar;
            this.f80427e = i;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null) {
                String string = bundle.getString("IPCResultInfo");
                Log.m105925i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "onCallback() IPCResultInfo：%s", string);
                this.f80426d.mo109647a(this.f80427e, C29531a.this.mo115109j(string));
            }
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        String str;
        Log.m105924i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "invoke JsApiSetCurrentPaySpeech!");
        if (fVar == null) {
            Log.m105920e("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:component is null");
        } else if (fVar.getContext() == null) {
            Log.m105920e("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:context is null");
            fVar.mo109647a(i, mo115109j("fail：service.getContext() is null "));
        } else {
            String optString = jSONObject.optString("dialectPackId");
            String optString2 = jSONObject.optString("tempFilePath");
            String optString3 = jSONObject.optString("md5Sum");
            String optString4 = jSONObject.optString(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            boolean optBoolean = jSONObject.optBoolean("isOnlyDownload");
            Log.m105919d("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "tempFilePath:%s dialectPackId:%s md5Sum:%s isOnlyDownload:%s", optString2, optString, optString3, Boolean.valueOf(optBoolean));
            if (!Util.isNullOrNil(optString2)) {
                C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(optString2);
                if (absoluteFile == null || !absoluteFile.mo119967g()) {
                    Log.m105924i("MicroMsg.OfflineVoice.JsApiSetCurrentPaySpeech", "fail:tempFile no exist");
                    fVar.mo109647a(i, mo115109j("fail:tempFile no exist"));
                    return;
                }
                str = absoluteFile.mo119971i();
            } else {
                str = "";
            }
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCSetCurrentPaySpeech.IPCSetCurrentPaySpeechParam(optString, optString2, str, optBoolean, optString3, optString4), IPCSetCurrentPaySpeech.class, new C29532a(fVar, i));
        }
    }
}
