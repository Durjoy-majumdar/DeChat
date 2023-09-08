package p252vb;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONException;
import p170ic.C87689c;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: vb.a */
public final class C14423a {

    /* renamed from: a */
    public final HashMap<String, String> f40028a = new HashMap<>();

    /* renamed from: b */
    public String f40029b;

    /* renamed from: vb.a$a */
    public static final class C14424a {

        /* renamed from: a */
        public static C14427b f40030a;
    }

    /* renamed from: vb.a$b */
    public static final class C14425b {

        /* renamed from: vb.a$b$a */
        public static final class C14426a extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C14423a f40031d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14426a(C14423a aVar) {
                super(1);
                this.f40031d = aVar;
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                if (!(str == null || str.length() == 0)) {
                    HashMap<String, String> hashMap = this.f40031d.f40028a;
                    String str2 = "";
                    String f = C14424a.f40030a != null ? C117731d.m166007c().mo182444f(str, str2, true, true) : null;
                    if (f != null) {
                        str2 = f;
                    }
                    hashMap.put(str, str2);
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: a */
        public static final C14423a m13714a(String str) {
            if (str == null || str.length() == 0) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray(str);
                C14423a aVar = new C14423a((C8480h) null);
                try {
                    C87689c.m109089b(jSONArray, new C14426a(aVar));
                } catch (JSONException e) {
                    Log.m105920e("Luggage.ExptMapping", "createForFeatureValue(" + str + ") fill mapping get exception:" + e);
                }
                return aVar;
            } catch (JSONException e2) {
                Log.m105920e("Luggage.ExptMapping", "createForFeatureValue(" + str + ") toJSONArray get exception:" + e2);
                return null;
            }
        }
    }

    public C14423a(C8480h hVar) {
    }

    /* renamed from: a */
    public final String mo13713a() {
        String str = this.f40029b;
        if (str == null || str.length() == 0) {
            try {
                HashMap<String, String> hashMap = this.f40028a;
                ArrayList arrayList = new ArrayList(hashMap.size());
                for (Map.Entry next : hashMap.entrySet()) {
                    arrayList.add(((String) next.getKey()) + '=' + ((String) next.getValue()));
                }
                this.f40029b = C110818d0.m150921S(arrayList, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
            } catch (Exception e) {
                Log.m105920e("Luggage.ExptMapping", "reportValue::get exception:" + e);
            }
        }
        String str2 = this.f40029b;
        return str2 == null ? "" : str2;
    }
}
