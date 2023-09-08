package dc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import je0.C46502z;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49099d52;

/* renamed from: dc0.f */
public class C31116f implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ String f83441d;

    /* renamed from: e */
    public final /* synthetic */ C31113d f83442e;

    public C31116f(C31113d dVar, String str) {
        this.f83442e = dVar;
        this.f83441d = str;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        if (yVar.getType() != 881) {
            return 0;
        }
        C31113d dVar = this.f83442e;
        dVar.f83415a = false;
        if (i == 0 && i2 == 0) {
            if (!dVar.f83418d.isEmpty() && this.f83442e.f83422h.stopped()) {
                this.f83442e.f83422h.startTimer(500);
            }
            C46502z.m51788b((C49099d52) cVar.f127056b.f127083a);
            Log.m105925i("MicroMsg.GetContactService", "getopenimcontact onResult %s %s", Boolean.valueOf(C31118h.vx0().mo57989jo(this.f83441d)), this.f83441d);
            this.f83442e.mo57991h(this.f83441d, true);
            return 0;
        }
        Log.m105921e("MicroMsg.GetContactService", "tryStartNetscene onSceneEnd openImUser errType: %s  errCode: %s username %s will retry/del ", Integer.valueOf(i), Integer.valueOf(i2), this.f83441d);
        if (i == 4) {
            C31118h.vx0().mo57989jo(this.f83441d);
        }
        this.f83442e.f83422h.startTimer(10000);
        this.f83442e.mo57991h(this.f83441d, false);
        return 0;
    }
}
