package g93;

import com.tencent.p014mm.sdk.platformtools.Log;
import ea3.C45587d;
import g93.C8251e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import t83.C13851h1;

/* renamed from: g93.d */
public class C8250d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f27177d;

    /* renamed from: e */
    public final /* synthetic */ String f27178e;

    /* renamed from: f */
    public final /* synthetic */ Map f27179f;

    /* renamed from: g */
    public final /* synthetic */ String f27180g;

    /* renamed from: h */
    public final /* synthetic */ C8251e.C8252a f27181h;

    /* renamed from: i */
    public final /* synthetic */ C13851h1 f27182i;

    public C8250d(String str, String str2, Map map, String str3, C8251e.C8252a aVar, C13851h1 h1Var) {
        this.f27177d = str;
        this.f27178e = str2;
        this.f27179f = map;
        this.f27180g = str3;
        this.f27181h = aVar;
        this.f27182i = h1Var;
    }

    public void run() {
        C45587d.C7609a f = this.f27177d.toUpperCase().equals("POST") ? C45587d.m50637f(this.f27178e, this.f27179f, this.f27180g) : C45587d.m50636e(this.f27178e, this.f27179f, this.f27180g);
        if (f != null) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(f.f25879a);
            Map<String, String> map = f.f25880b;
            objArr[1] = Integer.valueOf(map != null ? ((HashMap) map).size() : 0);
            Log.m105925i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse stats:%d, header.size:%d", objArr);
            Log.m105927v("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse header:%s data:%s", f.f25880b, f.f25881c);
            C32355a.m39689a(71);
            HashMap hashMap = new HashMap();
            hashMap.put("statusCode", Integer.valueOf(f.f25879a));
            hashMap.put("data", f.f25881c);
            Map<String, String> map2 = f.f25880b;
            if (map2 != null && ((HashMap) map2).size() > 0) {
                C8251e.m8321a(f.f25880b);
                hashMap.put("header", new JSONObject(f.f25880b).toString());
            }
            Log.m105924i("MicroMsg.TmplWebViewJsAPi", "[doRequest]values success");
            Log.m105919d("MicroMsg.TmplWebViewJsAPi", "[doRequest]values:%s", hashMap);
            C8251e.C8252a aVar = this.f27181h;
            C13851h1 h1Var = this.f27182i;
            aVar.mo7434a(h1Var, this.f27182i.f38996i + ":ok", hashMap);
            return;
        }
        C32355a.m39689a(72);
        Log.m105924i("MicroMsg.TmplWebViewJsAPi", "[doRequest]resonse is null, return");
        C8251e.C8252a aVar2 = this.f27181h;
        C13851h1 h1Var2 = this.f27182i;
        aVar2.mo7434a(h1Var2, this.f27182i.f38996i + ":fail", (Map<String, Object>) null);
    }
}
