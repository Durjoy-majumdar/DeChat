package p518fb;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;
import rt0.C90097c;
import rt0.C90098e;

/* renamed from: fb.q */
public class C86795q extends C82268c<C81925i2> {
    public static final int CTRL_INDEX = 1;
    public static final String NAME = "showKeyboard";

    /* renamed from: g */
    public final C86782d f251932g = new C86782d();

    /* renamed from: h */
    public final C86780b f251933h = new C86780b();

    /* renamed from: i */
    public final C86781c f251934i = new C86781c();

    /* renamed from: j */
    public final C86798t f251935j = new C86798t();

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = jSONObject;
        C81925i2 i2Var = (C81925i2) fVar;
        String optString = jSONObject2.optString("defaultValue");
        int optInt = jSONObject2.optInt("maxLength", 140);
        int i2 = optInt <= 0 ? Integer.MAX_VALUE : optInt;
        boolean optBoolean = jSONObject2.optBoolean("multiple", false);
        boolean optBoolean2 = jSONObject2.optBoolean("confirmHold", false);
        C90097c cVar = (C90097c) C90098e.m112719a(jSONObject2.optString("confirmType"), C90097c.class);
        C31988a aVar = (C31988a) C90098e.m112719a(jSONObject2.optString("keyboardType"), C31988a.class);
        if (aVar == null) {
            aVar = C31988a.TEXT;
        }
        boolean optBoolean3 = jSONObject2.optBoolean("showStoreEmoticon", false);
        boolean optBoolean4 = jSONObject2.optBoolean("showStoreEmoticonPlus", false);
        boolean optBoolean5 = jSONObject2.optBoolean("showEmoticonFirst", false);
        String optString2 = jSONObject2.optString("keyboardAppearance", "default");
        Log.m105925i("MicroMsg.WAGameJsApiShowKeyboard", "defaultValue :%s,finalMaxLength(%d),multiple(%b),confirmHold(%b),showStoreEmoticon(%b),showEmoticonFirst(%b),keyboardAppearance(%s),showStoreEmoticonPlus(%b).", optString, Integer.valueOf(i2), Boolean.valueOf(optBoolean), Boolean.valueOf(optBoolean2), Boolean.valueOf(optBoolean3), Boolean.valueOf(optBoolean5), optString2, Boolean.valueOf(optBoolean4));
        i2Var.mo109673t(new C86786h(this, i2Var, optString, i2, optBoolean, optBoolean2, cVar, aVar, optBoolean3, optBoolean4, optBoolean5, optString2.equalsIgnoreCase("dark"), i));
    }
}
