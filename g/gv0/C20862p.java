package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import pe3.C47465a;
import pv0.C100966p;
import pv0.C22015q;
import pv0.C22016r;
import qv0.C22134c;

/* renamed from: gv0.p */
public class C20862p extends C20842c {

    /* renamed from: u */
    public C22015q f58953u = new C22015q();

    /* renamed from: v */
    public C22016r f58954v = new C22016r();

    public C20862p(String str) {
        Log.m105925i("MicroMsg.BackupStartScene", "BackupStartScene, id[%s]", str);
        this.f58953u.f62292d = str;
    }

    /* renamed from: F1 */
    public void mo32563F1(long j, C100966p pVar, int i, Long l, String str) {
        C22015q qVar = this.f58953u;
        qVar.f62293e = 0;
        qVar.f62294f = j;
        qVar.f62295g = 0;
        qVar.f62296h = pVar;
        qVar.f62297i = l.longValue();
        C22015q qVar2 = this.f58953u;
        qVar2.f62298j = i;
        qVar2.f62299n = str;
        C22134c.m25609a("SessionId", str);
    }

    public int getType() {
        return 3;
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f58953u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f58954v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        Log.m105924i("MicroMsg.BackupStartScene", "onSceneEnd.");
        int i2 = this.f58954v.f62303g;
        if (i2 != 0) {
            mo32546m1(4, i2, "BackupStartScene onSceneEnd failed");
        } else {
            mo32546m1(0, i2, "BackupStartScene onSceneEnd success");
        }
    }
}
