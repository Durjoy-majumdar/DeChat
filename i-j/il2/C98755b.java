package il2;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import hl2.C98473e;
import hl2.C98477g;
import hl2.C98488m;
import hl2.C98489n;
import il2.C98760e;
import java.util.HashMap;
import p663qo.C101213l;
import sk2.C101645e;
import sk2.C101648g;
import zt3.C119157j;

/* renamed from: il2.b */
public final class C98755b extends C98768k {

    /* renamed from: a */
    public static final C98755b f289551a = new C98755b();

    /* renamed from: b */
    public static final HashMap<Long, String> f289552b = new HashMap<>();

    /* renamed from: il2.b$a */
    public static final class C98756a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98760e.C98761a f289553d;

        /* renamed from: e */
        public final /* synthetic */ C101648g f289554e;

        public C98756a(C98760e.C98761a aVar, C101648g gVar) {
            this.f289553d = aVar;
            this.f289554e = gVar;
        }

        public final void run() {
            C101645e eVar;
            C98755b bVar = C98755b.f289551a;
            C98760e.C98761a aVar = this.f289553d;
            C101648g gVar = this.f289554e;
            if (aVar != null && (eVar = aVar.f289562a) != null) {
                long j = eVar.f297532a;
                int i = eVar.f297536e;
                C98489n eVar2 = (i == 3 || i == 4) ? new C98473e() : (i == 5 || i == 6 || i == 7 || i == 9) ? new C98488m() : new C98477g();
                Log.m105925i("MicroMsg.AiImageCDNUploader", "alvinluo uploadImage-cdn requestType: %s, strategy: %s", Integer.valueOf(i), eVar2.name());
                eVar2.mo137839a(eVar, new C98751a(j, eVar, gVar, aVar));
            }
        }
    }

    /* renamed from: x0 */
    public void mo138138x0(long j) {
        Log.m105918d("MicroMsg.AiImageCDNUploader", "cancelUploadImage-cdn session: " + j);
        String remove = f289552b.remove(Long.valueOf(j));
        if (remove != null) {
            ((C101213l) C86312j.m106911c(C101213l.class)).gn0(remove);
        }
    }

    /* renamed from: y0 */
    public void mo138139y0(C98760e.C98761a aVar, C101648g gVar) {
        C87412m.m108594g(aVar, "requestWrapper");
        C87412m.m108594g(gVar, "resultCallback");
        ((C119157j) C119157j.f356862d).mo183875f(new C98756a(aVar, gVar));
    }
}
