package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;
import nv0.C100216b;
import ov0.C100546d;
import pv0.C62568v;

/* renamed from: mv0.h */
public class C99985h extends C100546d.C100550c {

    /* renamed from: h */
    public final /* synthetic */ C99990k f292951h;

    public C99985h(C99990k kVar) {
        this.f292951h = kVar;
    }

    public void run() {
        C62568v vVar = new C62568v();
        if (this.f294604d) {
            long j = this.f294605e;
            vVar.f177717d = j;
            vVar.f177719f = this.f294607g - j;
            vVar.f177718e = this.f294606f;
            C99990k kVar = this.f292951h;
            kVar.mo139335i(6, 0, vVar);
            C20842c.m22879k1(3, new C99986i(kVar));
            Log.m105924i("MicroMsg.BakPcProcessMgr", "send restore info cmd");
            new C100216b(2).mo32547o1();
            return;
        }
        long j2 = this.f294605e;
        long j3 = this.f294607g;
        if (j2 > j3 && j3 > 0) {
            vVar.f177717d = j2;
            vVar.f177719f = j3 - j2;
        }
        this.f292951h.mo139335i(6, 14, vVar);
        Log.m105920e("MicroMsg.BakPcProcessMgr", "init TempDB error");
    }
}
