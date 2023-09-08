package p1222y4;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;
import p1014o4.C109939f;
import p1014o4.C117687g;
import p1014o4.C117693m;
import p1169a5.C112757a;
import p1169a5.C112758b;
import p1221x4.C118847o;
import p283z4.C119060c;
import p834a3.C103297a;

/* renamed from: y4.n */
public class C118930n implements Runnable {

    /* renamed from: j */
    public static final String f356219j = C117693m.m165967e("WorkForegroundRunnable");

    /* renamed from: d */
    public final C119060c<Void> f356220d = new C119060c<>();

    /* renamed from: e */
    public final Context f356221e;

    /* renamed from: f */
    public final C118847o f356222f;

    /* renamed from: g */
    public final ListenableWorker f356223g;

    /* renamed from: h */
    public final C117687g f356224h;

    /* renamed from: i */
    public final C112757a f356225i;

    /* renamed from: y4.n$a */
    public class C118931a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C119060c f356226d;

        public C118931a(C119060c cVar) {
            this.f356226d = cVar;
        }

        public void run() {
            this.f356226d.mo183734k(C118930n.this.f356223g.mo165503a());
        }
    }

    /* renamed from: y4.n$b */
    public class C118932b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C119060c f356228d;

        public C118932b(C119060c cVar) {
            this.f356228d = cVar;
        }

        public void run() {
            try {
                C109939f fVar = (C109939f) this.f356228d.get();
                if (fVar != null) {
                    C117693m.m165966c().mo182389a(C118930n.f356219j, String.format("Updating notification for %s", new Object[]{C118930n.this.f356222f.f355543c}), new Throwable[0]);
                    C118930n nVar = C118930n.this;
                    ListenableWorker listenableWorker = nVar.f356223g;
                    listenableWorker.f338330h = true;
                    C119060c<Void> cVar = nVar.f356220d;
                    C117687g gVar = nVar.f356224h;
                    Context context = nVar.f356221e;
                    UUID uuid = listenableWorker.f338327e.f338336a;
                    C118934p pVar = (C118934p) gVar;
                    pVar.getClass();
                    C119060c cVar2 = new C119060c();
                    ((C112758b) pVar.f356235a).mo164514a(new C118933o(pVar, cVar2, uuid, fVar, context));
                    cVar.mo183734k(cVar2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{C118930n.this.f356222f.f355543c}));
            } catch (Throwable th) {
                C118930n.this.f356220d.mo183733j(th);
            }
        }
    }

    public C118930n(Context context, C118847o oVar, ListenableWorker listenableWorker, C117687g gVar, C112757a aVar) {
        this.f356221e = context;
        this.f356222f = oVar;
        this.f356223g = listenableWorker;
        this.f356224h = gVar;
        this.f356225i = aVar;
    }

    public void run() {
        if (!this.f356222f.f355557q || C103297a.m136810a()) {
            this.f356220d.mo183732i(null);
            return;
        }
        C119060c cVar = new C119060c();
        ((C112758b.C112759a) ((C112758b) this.f356225i).f337644c).execute(new C118931a(cVar));
        cVar.addListener(new C118932b(cVar), ((C112758b) this.f356225i).f337644c);
    }
}
