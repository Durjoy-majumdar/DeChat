package sj0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: sj0.h */
public class C13681h extends C82016a0<C81925i2> {
    public static final int CTRL_INDEX = 668;
    public static final String NAME = "isGameRecorderSupported";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C81925i2 i2Var = (C81925i2) fVar;
        Log.m105924i("MicroMsg.WAGameJsApiScreenRecorderSupport", "hy: trigger call whether is support screen recording");
        HashMap hashMap = new HashMap(2);
        Boolean bool = Boolean.TRUE;
        hashMap.put("isVolumeSupported", bool);
        hashMap.put("isAtempoSupported", bool);
        hashMap.put("isFrameSupported", bool);
        hashMap.put("isSoundSupported", bool);
        return mo115112m("ok", hashMap);
    }
}
