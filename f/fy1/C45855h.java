package fy1;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import org.json.JSONObject;
import p828wa.C53099d;
import te3.C50187kw2;

/* renamed from: fy1.h */
public class C45855h extends C45845a {

    /* renamed from: fy1.h$a */
    public class C45856a extends C53099d {

        /* renamed from: a */
        public final /* synthetic */ C50187kw2 f123801a;

        public C45856a(C45855h hVar, C50187kw2 kw22) {
            this.f123801a = kw22;
        }

        /* renamed from: a */
        public JSONObject mo14701a() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("itemId", this.f123801a.f137069d);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: b */
        public String mo14702b() {
            return "onCustomGameMenuClicked";
        }
    }

    public C45855h(int i) {
        super(i);
    }

    /* renamed from: b */
    public void mo71307b(Context context, C43658n nVar, C50187kw2 kw22) {
        nVar.f148259i.mo73815b(new C45856a(this, kw22));
    }
}
