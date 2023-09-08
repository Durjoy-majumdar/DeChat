package iq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86295k;
import gy3.C8480h;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: iq0.a */
public final class C87791a implements C86295k {

    /* renamed from: h */
    public static final C87792a f254157h = new C87792a((C8480h) null);

    /* renamed from: d */
    public final String f254158d;

    /* renamed from: e */
    public final String f254159e;

    /* renamed from: f */
    public final String f254160f;

    /* renamed from: g */
    public final int f254161g;

    /* renamed from: iq0.a$a */
    public static final class C87792a {
        public C87792a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C87791a mo122239a(String str) {
            C87412m.m108594g(str, "jsonStr");
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("mimeType");
                String string2 = jSONObject.getString("materialPath");
                String optString = jSONObject.optString("materialName", "");
                int optInt = jSONObject.optInt("materialSize", 0);
                C87412m.m108593f(string, "mimeType");
                C87412m.m108593f(string2, "materialPath");
                C87412m.m108593f(optString, "materialName");
                return new C87791a(string, string2, optString, optInt);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandOpenMaterialNativeExtraData", "fromJsonString fail since " + e);
                return null;
            }
        }
    }

    public C87791a(String str, String str2, String str3, int i) {
        C87412m.m108594g(str, "mimeType");
        C87412m.m108594g(str2, "materialPath");
        C87412m.m108594g(str3, "materialName");
        this.f254158d = str;
        this.f254159e = str2;
        this.f254160f = str3;
        this.f254161g = i;
    }

    /* renamed from: b */
    public static final String m109237b(String str) {
        C87791a a;
        C87792a aVar = f254157h;
        if (str == null || (a = aVar.mo122239a(str)) == null) {
            return null;
        }
        return a.f254158d;
    }

    /* renamed from: a */
    public String mo3693a() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mimeType", this.f254158d);
            jSONObject.put("materialPath", this.f254159e);
            jSONObject.put("materialName", this.f254160f);
            jSONObject.put("materialSize", this.f254161g);
            str = jSONObject.toString();
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandOpenMaterialNativeExtraData", "toJsonString fail since " + e);
            str = "{}";
        }
        C87412m.m108593f(str, "try {\n            val js…     EMPTY_JSON\n        }");
        return str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C87791a(String str, String str2, String str3, int i, int i2, C8480h hVar) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
