package un0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p206nj.C11171e;

/* renamed from: un0.d */
public class C14253d extends C82268c {
    public static final int CTRL_INDEX = 469;
    public static final String NAME = "getAvailableAudioSources";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        Object[] objArr = new Object[1];
        objArr[0] = jSONObject != null ? jSONObject.toString() : "";
        Log.m105925i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources data:%s", objArr);
        ArrayList arrayList = new ArrayList();
        arrayList.add("auto");
        arrayList.add("mic");
        arrayList.add("camcorder");
        arrayList.add("voice_recognition");
        arrayList.add("voice_communication");
        if (C11171e.m11046c(24)) {
            arrayList.add("unprocessed");
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("audioSources", jSONArray);
        Log.m105925i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources ret:%s", hashMap.toString());
        fVar.mo109647a(i, mo115112m("ok", hashMap));
    }
}
