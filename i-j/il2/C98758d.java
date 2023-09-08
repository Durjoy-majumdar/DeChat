package il2;

import com.tencent.p014mm.plugin.scanner.model.C42905l;
import com.tencent.p014mm.plugin.scanner.model.C94480u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import hl2.C8596a;
import il2.C98760e;
import sk2.C101645e;
import sk2.C101647f;
import sk2.C101648g;
import wl2.C102461j;
import zt3.C119157j;

/* renamed from: il2.d */
public final class C98758d extends C98768k {

    /* renamed from: a */
    public static final C98758d f289559a = new C98758d();

    /* renamed from: il2.d$a */
    public static final class C98759a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98760e.C98761a f289560d;

        /* renamed from: e */
        public final /* synthetic */ C101648g f289561e;

        public C98759a(C98760e.C98761a aVar, C101648g gVar) {
            this.f289560d = aVar;
            this.f289561e = gVar;
        }

        public final void run() {
            C101645e eVar;
            C98760e.C98761a aVar = this.f289560d;
            C101648g gVar = this.f289561e;
            if (aVar != null && (eVar = aVar.f289562a) != null) {
                long j = eVar.f297532a;
                boolean z = eVar.f297533b != 2;
                if (C86013q1.m106450k(eVar.f297535d)) {
                    if (eVar.f297540i == null && eVar.f297541j) {
                        C94480u0 u0Var = C94480u0.f273191a;
                        String str = eVar.f297535d;
                        C87412m.m108593f(str, "request.imagePath");
                        eVar.f297540i = u0Var.mo129952a(str);
                    }
                    if (z) {
                        C102461j.m135248b(eVar.f297535d, 0, C8596a.m8446a(eVar.f297533b), new C98757c(aVar, j, eVar, gVar));
                        return;
                    }
                    C42905l lVar = new C42905l(j, 0, eVar.f297540i, 2, (C8480h) null);
                    aVar.f289563b = lVar.hashCode();
                    C86709a0.m107524d().mo123460f(lVar);
                    return;
                }
                int i = eVar.f297533b;
                Log.m105921e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", Long.valueOf(j), 999, "image not exist");
                C101647f fVar = new C101647f();
                fVar.f297547a = i;
                fVar.f297548b = j;
                fVar.f297549c = false;
                fVar.f297550d = 3;
                fVar.f297551e = 999;
                fVar.f297552f = "image not exist";
                ((C119157j) C119157j.f356862d).mo183895z(new C98767j(gVar, j, fVar));
            }
        }
    }

    /* renamed from: x0 */
    public void mo138138x0(long j) {
        Log.m105924i("MicroMsg.AiImageDefaultUploader", "cancelUploadImage-default session: " + j);
    }

    /* renamed from: y0 */
    public void mo138139y0(C98760e.C98761a aVar, C101648g gVar) {
        C87412m.m108594g(aVar, "requestWrapper");
        C87412m.m108594g(gVar, "resultCallback");
        ((C119157j) C119157j.f356862d).mo183875f(new C98759a(aVar, gVar));
    }
}
