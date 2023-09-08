package dy1;

import android.content.Intent;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import e51.C45544c;
import e51.C45547h;
import org.json.JSONObject;

/* renamed from: dy1.j */
public class C7552j extends C4770c {

    /* renamed from: dy1.j$a */
    public class C7553a implements C45544c {
        public C7553a() {
        }

        /* renamed from: a */
        public void mo5407a() {
            C7552j.this.f19815f.mo5690b();
        }
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        String optString = jSONObject != null ? jSONObject.optString("appId") : "";
        Intent intent = new Intent();
        intent.putExtra("appId", optString);
        intent.putExtra("view_task", true);
        intent.addFlags(268435456);
        ((C45547h) C86312j.m106911c(C45547h.class)).p30(MMApplicationContext.getContext(), intent, new C7553a());
    }
}
