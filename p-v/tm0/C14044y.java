package tm0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import org.json.JSONObject;

/* renamed from: tm0.y */
public class C14044y<CONTEXT extends C82381f> extends C82268c<CONTEXT> {
    public static final int CTRL_INDEX = 168;
    public static final String NAME = "setClipboardData";

    /* renamed from: u */
    public void mo1505u(CONTEXT context, JSONObject jSONObject, int i) {
        String optString = jSONObject.optString("data");
        if (Util.isNullOrNil(optString)) {
            context.mo109647a(i, mo115109j("fail"));
            return;
        }
        Log.m105925i("MicroMsg.JsApiSetClipboardData", "stevyang dataStr %s", optString);
        try {
            ClipboardHelper.setText(context.getContext(), MimeTypes.BASE_TYPE_TEXT, optString);
            context.mo109647a(i, mo115109j("ok"));
            mo13452w(context, optString);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.JsApiSetClipboardData", "setPrimaryClip get exception:%s", e);
            context.mo109647a(i, mo115109j("fail:internal error"));
        }
    }

    /* renamed from: w */
    public void mo13452w(CONTEXT context, String str) {
        throw null;
    }
}
