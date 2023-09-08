package mv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gv0.C20842c;
import lu3.C88656g;
import nv0.C100216b;
import ob0.C11385n;
import ob0.C117747y;
import pv0.C100965f0;
import pv0.C47536u;
import zt3.C119157j;

/* renamed from: mv0.m */
public class C99998m implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ C99996l f292989d;

    /* renamed from: mv0.m$a */
    public class C99999a implements C88656g {
        public C99999a() {
        }

        public String getKey() {
            return "RecoverPCServer_recover_getIDList";
        }

        public void run() {
            C99996l.m130675a(C99998m.this.f292989d);
        }
    }

    public C99998m(C99996l lVar) {
        this.f292989d = lVar;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C100965f0 f0Var = (C100965f0) ((C20842c) yVar).mo32543r1();
        if (f0Var.f295649d == 2) {
            C47536u uVar = f0Var.f295653h;
            this.f292989d.f292973e.addAll(uVar.f127547o);
            this.f292989d.f292972d.addAll(uVar.f127546n);
            Log.m105925i("MicroMsg.RecoverPCServer", "MediaSize:[%d / %d], digestSize: [%d / %d]", Integer.valueOf(this.f292989d.f292973e.size()), Integer.valueOf(this.f292989d.f292972d.size()), Integer.valueOf(uVar.f127542g), Integer.valueOf(uVar.f127541f));
            if (this.f292989d.f292973e.size() < uVar.f127542g || this.f292989d.f292972d.size() < uVar.f127541f) {
                Log.m105924i("MicroMsg.RecoverPCServer", "send restore info cmd again~");
                new C100216b(2).mo32547o1();
                return;
            }
            C99996l lVar = this.f292989d;
            long j = uVar.f127543h;
            lVar.f292984s = j;
            Log.m105925i("MicroMsg.RecoverPCServer", "down RestoreInfo complete, convDataSize:%d", Long.valueOf(j));
            C20842c.m22884u1(3, this);
            ((C119157j) C119157j.f356862d).mo183875f(new C99999a());
        }
    }
}
