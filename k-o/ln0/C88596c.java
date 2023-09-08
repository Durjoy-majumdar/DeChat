package ln0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import p300c8.C79946g;
import p300c8.C79950j;
import p953d8.C86199a;
import p953d8.C86205d;
import p953d8.C86207e;

/* renamed from: ln0.c */
public final class C88596c {

    /* renamed from: a */
    public final C86199a f255863a;

    /* renamed from: b */
    public final C86207e f255864b;

    /* renamed from: c */
    public final ConcurrentHashMap<String, Future<?>> f255865c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public final C79946g.C79947a f255866d = new C88597a(this);

    /* renamed from: ln0.c$a */
    public static final class C88597a implements C79946g.C79947a {

        /* renamed from: a */
        public final /* synthetic */ C88596c f255867a;

        /* renamed from: ln0.c$a$a */
        public static final class C88598a implements C79946g {

            /* renamed from: a */
            public final /* synthetic */ C86205d f255868a;

            /* renamed from: b */
            public final /* synthetic */ C86205d f255869b;

            /* renamed from: c */
            public final /* synthetic */ C88596c f255870c;

            public C88598a(C86205d dVar, C88596c cVar) {
                this.f255869b = dVar;
                this.f255870c = cVar;
                this.f255868a = dVar;
            }

            /* renamed from: b */
            public long mo110126b(C79950j jVar) {
                long b = this.f255869b.mo110126b(jVar);
                Uri uri = jVar.f234181a;
                String uri2 = uri != null ? uri.toString() : null;
                Log.m105924i("MicroMsg.AppBrand.CancellableCacheLogic", "open#DataSource, url: " + uri2);
                Future future = (Future) C24564k0.m30739c(this.f255870c.f255865c).remove(uri2);
                if (future != null) {
                    Log.m105924i("MicroMsg.AppBrand.CancellableCacheLogic", "open#DataSource, url: " + uri2 + ", cancel cache, success: " + future.cancel(true));
                }
                return b;
            }

            /* renamed from: c */
            public int mo110127c(byte[] bArr, int i, int i2) {
                return this.f255868a.mo110127c(bArr, i, i2);
            }

            public void close() {
                this.f255868a.close();
            }

            public Uri getUri() {
                return this.f255868a.getUri();
            }
        }

        public C88597a(C88596c cVar) {
            this.f255867a = cVar;
        }

        public final C79946g createDataSource() {
            return new C88598a(this.f255867a.f255864b.createDataSource(), this.f255867a);
        }
    }

    public C88596c(C86199a aVar, C86207e eVar) {
        C87412m.m108594g(aVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
        C87412m.m108594g(eVar, "cacheDataSourceFactory");
        this.f255863a = aVar;
        this.f255864b = eVar;
    }
}
