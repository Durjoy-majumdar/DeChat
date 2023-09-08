package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import jv0.C99055a;
import ov0.C100546d;
import pv0.C47537w;
import te3.C101780g9;
import zt3.C119157j;

/* renamed from: mv0.o */
public class C100001o extends C100546d.C100550c {

    /* renamed from: h */
    public final /* synthetic */ C99996l f292992h;

    public C100001o(C99996l lVar) {
        this.f292992h = lVar;
    }

    public void run() {
        C99996l lVar = this.f292992h;
        int i = 0;
        for (C47537w next : lVar.f292972d) {
            try {
                i += ((C101780g9) new C101780g9().parseFrom(C86013q1.m106433O(C99055a.m129003b() + "backupItem/" + C99055a.m129004c(next.f127548d) + next.f127548d, 0, -1))).f298276e.size();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.RecoverPCServer", e, "", new Object[0]);
            }
        }
        Log.m105924i("MicroMsg.RecoverPCServer", "all msg item Count : " + i);
        Log.m105918d("MicroMsg.RecoverPCServer", "readFromSdcard start");
        ((C119157j) C119157j.f356862d).mo183884o(new C100002p(lVar, i));
    }
}
