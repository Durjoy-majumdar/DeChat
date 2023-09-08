package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i7 */
public class C82547i7 {

    /* renamed from: a */
    public static final C82548a f241644a = new C82548a((C8480h) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i7$a */
    public static final class C82548a {
        public C82548a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo114875a(JSONObject jSONObject, String str, Object obj) {
            C87412m.m108594g(jSONObject, "obj");
            C87412m.m108594g(str, "key");
            try {
                jSONObject.put(str, obj);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WASnapshotConfigProvider", e, "put with key(" + str + ')', new Object[0]);
            }
        }
    }
}
