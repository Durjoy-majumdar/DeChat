package eq0;

import c30.C104289g;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq0.C86089b;
import cq0.C86091c;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Set;
import yq0.C91548e;
import yq0.C91572m;

/* renamed from: eq0.j */
public class C86642j extends C86089b {

    /* renamed from: eq0.j$a */
    public class C86643a implements C91548e.C91554e {

        /* renamed from: a */
        public final /* synthetic */ C86091c f251602a;

        /* renamed from: b */
        public final /* synthetic */ String f251603b;

        public C86643a(C86091c cVar, String str) {
            this.f251602a = cVar;
            this.f251603b = str;
        }

        /* renamed from: a */
        public void mo115867a() {
            C86642j.this.mo121052c(this.f251602a, 1);
        }

        /* renamed from: b */
        public void mo115868b(String str) {
            Log.m105921e("Luggage.NodeJS.RequireUserAuth", "onDeny apiName[%s], reason[%s]", this.f251603b, str);
            C86642j.this.mo121052c(this.f251602a, 2);
        }

        public void onCancel() {
            C86642j.this.mo121052c(this.f251602a, 3);
        }
    }

    /* renamed from: a */
    public int mo120512a() {
        return 1;
    }

    /* renamed from: b */
    public void mo120513b(C104289g gVar, C86091c cVar) {
        String optString = gVar.optString("apiName");
        C81925i2 i2Var = cVar.f250575b;
        boolean z = false;
        Set c = C91548e.f262377e.mo122462c(i2Var.getAppId(), false);
        if (c != null) {
            synchronized (c) {
                z = c.contains(optString);
            }
        }
        if (z) {
            mo121052c(cVar, 1);
            return;
        }
        C87412m.m108594g(optString, ProviderConstants.API_PATH);
        C91548e.m114887d(new C91572m(i2Var, optString, (String) null, (String) null, 0), new C86643a(cVar, optString));
    }

    /* renamed from: c */
    public final void mo121052c(C86091c cVar, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        cVar.mo120516c(hashMap);
    }
}
