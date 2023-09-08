package com.tencent.p014mm.plugin.voip.p475ui;

import android.util.Base64;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.voip.ui.h0 */
public final class C30539h0 extends C87413o implements C32226l<JSONObject, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JSONArray f82272d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30539h0(JSONArray jSONArray) {
        super(1);
        this.f82272d = jSONArray;
    }

    public Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        JSONObject jSONObject = (JSONObject) obj;
        C87412m.m108594g(jSONObject, LocaleUtil.ITALIAN);
        int i8 = 8;
        try {
            i = jSONObject.has("codec") ? jSONObject.getInt("codec") : 8;
        } catch (Exception e) {
            Log.printDebugStack("safeGetInt", "", e);
            i = 8;
        }
        try {
            if (jSONObject.has("codecSize")) {
                i8 = jSONObject.getInt("codecSize");
            }
            i2 = i8;
        } catch (Exception e2) {
            Log.printDebugStack("safeGetInt", "", e2);
            i2 = 8;
        }
        int i9 = 15;
        try {
            i3 = jSONObject.has(V2TXJSAdapterConstants.PUSHER_KEY_FPS) ? jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_FPS) : 15;
        } catch (Exception e3) {
            Log.printDebugStack("safeGetInt", "", e3);
            i3 = 15;
        }
        try {
            if (jSONObject.has("iPeriod")) {
                i9 = jSONObject.getInt("iPeriod");
            }
            i4 = i9;
        } catch (Exception e4) {
            Log.printDebugStack("safeGetInt", "", e4);
            i4 = 15;
        }
        int i15 = 10;
        try {
            if (jSONObject.has("interval")) {
                i15 = jSONObject.getInt("interval");
            }
            i5 = i15;
        } catch (Exception e5) {
            Log.printDebugStack("safeGetInt", "", e5);
            i5 = 10;
        }
        int i16 = 2;
        try {
            if (jSONObject.has("rsLevel")) {
                i16 = jSONObject.getInt("rsLevel");
            }
            i6 = i16;
        } catch (Exception e6) {
            Log.printDebugStack("safeGetInt", "", e6);
            i6 = 2;
        }
        int i17 = 600;
        try {
            if (jSONObject.has(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) {
                i17 = jSONObject.getInt(FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE);
            }
            i7 = i17;
        } catch (Exception e7) {
            Log.printDebugStack("safeGetInt", "", e7);
            i7 = 600;
        }
        C30540n nVar = new C30540n(i, i2, i3, i4, i5, i6, i7);
        this.f82272d.put(Base64.encodeToString(nVar.mo57468a(), 0));
        Log.m105924i("MicroMsg.VoipAutomatedTestSetupShell", "add qos params " + nVar);
        return C13598b0.f38549a;
    }
}
