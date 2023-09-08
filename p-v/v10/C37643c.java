package v10;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import java.net.URLEncoder;
import u10.C52415a;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: v10.c */
public class C37643c extends C86301e implements C52735e {
    /* renamed from: Ad */
    public int mo61266Ad(C32735h.C32737c cVar, int i) {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(cVar, i);
        C52415a.m58668a().mo62980b(2, cVar.name(), String.valueOf(Qe), 0);
        Log.m105925i("MicroMsg.GameExptManager", "key: %s, result: %d", cVar.name(), Integer.valueOf(Qe));
        return Qe;
    }

    public String C50(C32735h.C32737c cVar, String str) {
        String str2;
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(cVar, str);
        if (!Y60.equals(str)) {
            C52415a a = C52415a.m58668a();
            String name = cVar.name();
            try {
                str2 = URLEncoder.encode(Y60, "UTF-8");
            } catch (Exception unused) {
                str2 = Y60;
            }
            a.mo62980b(2, name, str2, 0);
        }
        Log.m105925i("MicroMsg.GameExptManager", "key: %s, result: %s", cVar.name(), Y60);
        return Y60;
    }

    /* renamed from: F5 */
    public String mo61268F5(String str, String str2) {
        String F5 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58776F5(str, str2);
        C52415a.m58668a().mo62980b(2, str, F5, 0);
        Log.m105925i("MicroMsg.GameExptManager", "key: %s, result: %b", str, F5);
        return F5;
    }

    /* renamed from: fe */
    public boolean mo61269fe(C32735h.C32737c cVar, boolean z) {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(cVar, z);
        C52415a.m58668a().mo62980b(2, cVar.name(), String.valueOf(wf), 0);
        Log.m105925i("MicroMsg.GameExptManager", "key: %s, result: %b", cVar.name(), Boolean.valueOf(wf));
        return wf;
    }
}
