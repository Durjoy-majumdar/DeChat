package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86921f;
import java.util.HashMap;
import lo0.C88606e;
import p823sg.C48380r;
import p954dd.C86224a;

/* renamed from: cd.q$$o */
public class q$$o implements C86224a.C86226b {

    /* renamed from: a */
    public final /* synthetic */ C80005q f234372a;

    public q$$o(C80005q qVar) {
        this.f234372a = qVar;
    }

    /* renamed from: a */
    public void mo110249a(String str, String str2) {
        if (!Util.isNullOrNil(str2)) {
            String a = C48380r.m53726a(str2, false);
            Log.m105925i(this.f234372a.mo110227w(), "convertFilterImageToLocalPath, targetPath:%s", a);
            this.f234372a.mo110217G(new q$$o$$a(this, a));
            return;
        }
        Log.m105924i(this.f234372a.mo110227w(), "convertFilterImageToLocalPath, load filter image fail");
        if (this.f234372a.f234329n != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            C80005q qVar = this.f234372a;
            ((C88606e) qVar.f234329n).mo123053b(qVar.f253971d, C86921f.f252339m, 10005, "load filter image fail", hashMap);
        }
    }
}
