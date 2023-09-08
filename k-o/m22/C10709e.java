package m22;

import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C60213x3;
import org.json.JSONObject;

/* renamed from: m22.e */
public class C10709e extends C4770c {

    /* renamed from: m22.e$a */
    public class C10710a implements C60213x3 {
        public C10710a(C10709e eVar) {
        }

        /* renamed from: a */
        public void mo5408a(int i, String str) {
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiOpenFinderPostView", "Invoke openFinderPostView");
        if (jSONObject == null) {
            this.f19815f.mo5689a("data is null");
            return;
        }
        try {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76834ai(MMApplicationContext.getContext(), jSONObject.toString(), 3, new C10710a(this));
            this.f19815f.mo5690b();
        } catch (Exception e) {
            Log.printErrStackTrace("LiteAppJsApiOpenFinderPostView", e, "openFinderPostView fail", new Object[0]);
            this.f19815f.mo5689a("fail");
        }
    }
}
