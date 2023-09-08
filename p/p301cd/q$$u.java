package p301cd;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fl0.C86921f;
import java.util.HashMap;
import lo0.C88606e;
import p823sg.C48380r;
import p954dd.C86224a;

/* renamed from: cd.q$$u */
public class q$$u implements C86224a.C86226b {

    /* renamed from: a */
    public final /* synthetic */ C80005q f234391a;

    public q$$u(C80005q qVar) {
        this.f234391a = qVar;
    }

    /* renamed from: a */
    public void mo110249a(String str, String str2) {
        if (!Util.isNullOrNil(str2)) {
            String a = C48380r.m53726a(str2, false);
            Log.m105925i(this.f234391a.mo110227w(), "convertBackgroundImageToLocalPath, targetPath:%s", a);
            this.f234391a.mo110217G(new q$$u$$a(this, a));
            return;
        }
        Log.m105925i(this.f234391a.mo110227w(), "convertBackgroundImageToLocalPath, url: %s, localPath: %s", str, str2);
        if (Util.isNullOrNil(str)) {
            if (str != null) {
                this.f234391a.mo110217G(new q$$u$$b(this));
            }
        } else if (this.f234391a.f234329n != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            C80005q qVar = this.f234391a;
            ((C88606e) qVar.f234329n).mo123053b(qVar.f253971d, C86921f.f252339m, 10004, "load background image fail", hashMap);
        }
    }
}
