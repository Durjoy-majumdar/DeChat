package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.text.DecimalFormat;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.r1 */
public class C82760r1 extends C82268c {
    private static final int CTRL_INDEX = 732;
    public static final String NAME = "getVideoInfo";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar == null) {
            Log.m105920e("MicroMsg.JsApiGetVideoInfo", "fail:internal error");
        } else if (jSONObject == null) {
            Log.m105928w("MicroMsg.JsApiGetVideoInfo", "fail:data is null");
            fVar.mo109647a(i, mo115109j("fail:invalid data"));
        } else if (fVar.getFileSystem() == null) {
            Log.m105928w("MicroMsg.JsApiGetVideoInfo", "fail:file system is null");
            fVar.mo109647a(i, mo115109j("fail:internal error"));
        } else {
            String optString = jSONObject.optString("src");
            if (Util.isNullOrNil(optString)) {
                Log.m105928w("MicroMsg.JsApiGetVideoInfo", "fail:data src is null");
                fVar.mo109647a(i, mo115109j("fail:invalid data"));
            } else if (!optString.startsWith("wxfile://")) {
                Log.m105928w("MicroMsg.JsApiGetVideoInfo", "fail:src path not supported");
                fVar.mo109647a(i, mo115109j("fail:src path not be supported"));
            } else {
                C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(optString);
                if (absoluteFile == null) {
                    fVar.mo109647a(i, mo115109j("fail:file doesn't exist"));
                    return;
                }
                C82713f2.C82715b c = C82713f2.m101485c(absoluteFile.mo119971i());
                if (c == null) {
                    Log.m105928w("MicroMsg.JsApiGetVideoInfo", "fail:videoInfo is null");
                    fVar.mo109647a(i, mo115109j("fail:can't get info from video file"));
                    return;
                }
                int i2 = c.f242019a;
                String str = i2 != 90 ? i2 != 180 ? i2 != 270 ? "up" : "left" : "down" : "right";
                HashMap hashMap = new HashMap(8);
                hashMap.put("orientation", str);
                hashMap.put("type", c.f242020b);
                hashMap.put("duration", Float.valueOf(Util.safeParseFloat(new DecimalFormat("#.#").format((double) ((((float) c.f242021c) * 1.0f) / 1000.0f)))));
                hashMap.put("size", Integer.valueOf(Math.round((((float) c.f242022d) * 1.0f) / 1024.0f)));
                hashMap.put("height", Integer.valueOf(c.f242024f));
                hashMap.put("width", Integer.valueOf(c.f242023e));
                hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, Integer.valueOf(Math.round((((float) c.f242025g) * 1.0f) / 1000.0f)));
                hashMap.put(V2TXJSAdapterConstants.PUSHER_KEY_FPS, Float.valueOf(c.f242026h));
                fVar.mo109647a(i, mo115112m("ok", hashMap));
            }
        }
    }
}
