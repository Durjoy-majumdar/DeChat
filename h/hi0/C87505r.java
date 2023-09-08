package hi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29301t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import hi0.C32920k;
import hp3.C87581a;
import ki0.C88153c;
import lp3.C46888b;

/* renamed from: hi0.r */
public class C87505r implements C87581a<Void, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C46888b f253508a;

    /* renamed from: b */
    public final /* synthetic */ C87504q f253509b;

    public C87505r(C87504q qVar, C46888b bVar) {
        this.f253509b = qVar;
        this.f253508a = bVar;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            C88153c cVar = this.f253509b.f253503a;
            boolean f = C32920k.m39851f(((C29301t1) C81161g2.Bx0(C29301t1.class)).mo56578qq(cVar.field_appId, cVar.field_type, cVar.field_version), C32920k.C32921a.GET_CODE);
            C88153c cVar2 = this.f253509b.f253503a;
            Log.m105925i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s %d %d) download ok, decryptResult %b", cVar2.field_appId, Integer.valueOf(cVar2.field_type), Integer.valueOf(this.f253509b.f253503a.field_version), Boolean.valueOf(f));
        }
        this.f253508a.resume();
        return null;
    }
}
