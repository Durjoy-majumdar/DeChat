package mi2;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import li2.C10531a;
import p256vw.C15016h;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: mi2.b */
public final class C10894b extends C15053a {

    /* renamed from: d */
    public static final C10894b f32516d = new C10894b();

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        int i;
        String str;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        int hashCode = jVar.f38998a.hashCode();
        Map<Integer, C15016h> map = C10531a.f31800a;
        HashMap hashMap = new HashMap();
        C15016h hVar = C10531a.f31800a.get(Integer.valueOf(hashCode));
        int i2 = 32;
        if (hVar != null) {
            str = hVar.f41139a;
            i = hVar.f41140b;
            int i3 = hVar.f41141c;
            if (i3 != 0) {
                i2 = i3;
            }
            int i4 = hVar.f41144f;
            if (i4 >= 0) {
                hashMap.put("selectedStartIndex", Integer.valueOf(i4));
            }
            int i5 = hVar.f41145g;
            if (i5 >= 0) {
                hashMap.put("selectedEndIndex", Integer.valueOf(i5));
            }
        } else {
            str = "";
            i = 0;
        }
        hashMap.put("content", str);
        hashMap.put("currentCharLength", Integer.valueOf(i));
        hashMap.put("maxCharLength", Integer.valueOf(i2));
        C13849g gVar = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar.mo10774a(str2, h1Var.f38996i + ":ok", hashMap);
        Log.m105925i("MicroMsg.JsApiGetTextContent", "JsApi-Call: msg:%s", h1Var);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10004;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "getTextContent";
    }
}
