package ln0;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import gy3.C87412m;
import java.io.IOException;
import lu3.C88656g;
import p300c8.C79950j;
import p333e8.C86464p;
import p953d8.C86199a;
import p953d8.C86209g;
import p953d8.C86210h;
import ym0.C91512j;

/* renamed from: ln0.b */
public final class C88594b implements C88656g {

    /* renamed from: d */
    public final /* synthetic */ String f255859d;

    /* renamed from: e */
    public final /* synthetic */ long f255860e;

    /* renamed from: f */
    public final /* synthetic */ long f255861f;

    /* renamed from: g */
    public final /* synthetic */ C88596c f255862g;

    /* renamed from: ln0.b$a */
    public static final class C88595a implements C86199a.C86201b {
        /* renamed from: a */
        public void mo120623a(C86199a aVar, C86209g gVar) {
            C87412m.m108594g(aVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
            C87412m.m108594g(gVar, "cacheSpan");
            Log.m105919d("MicroMsg.SameLayer.ExoVideoCacheHandler", "onSpanAdded, cacheSpan isCached:%s [%s, %s]", Boolean.valueOf(gVar.f250756g), Long.valueOf(gVar.f250754e), Long.valueOf(gVar.f250755f));
        }

        /* renamed from: c */
        public void mo120624c(C86199a aVar, C86209g gVar) {
            C87412m.m108594g(aVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
            C87412m.m108594g(gVar, "cacheSpan");
            Log.m105919d("MicroMsg.SameLayer.ExoVideoCacheHandler", "onSpanRemoved, cacheSpan isCached:%s [%s, %s]", Boolean.valueOf(gVar.f250756g), Long.valueOf(gVar.f250754e), Long.valueOf(gVar.f250755f));
        }

        /* renamed from: d */
        public void mo120625d(C86199a aVar, C86209g gVar, C86209g gVar2) {
            C87412m.m108594g(aVar, XWalkPlugin.PRIVATE_CACHE_DIR_NAME);
            C87412m.m108594g(gVar, "cacheSpan");
            C87412m.m108594g(gVar2, "cacheSpan1");
            Log.m105919d("MicroMsg.SameLayer.ExoVideoCacheHandler", "onSpanTouched, cacheSpan isCached:%s [%s, %s]", Boolean.valueOf(gVar.f250756g), Long.valueOf(gVar.f250754e), Long.valueOf(gVar.f250755f));
        }
    }

    public C88594b(String str, long j, long j2, C88596c cVar) {
        this.f255859d = str;
        this.f255860e = j;
        this.f255861f = j2;
        this.f255862g = cVar;
    }

    public String getKey() {
        return "AppBrandVideoCache#Exo";
    }

    public void run() {
        Uri parse = Uri.parse(this.f255859d);
        String b = C91512j.m114810c().mo125425b(this.f255859d);
        C79950j jVar = new C79950j(parse, this.f255860e, this.f255861f, b);
        C86210h.C86211a aVar = new C86210h.C86211a();
        this.f255862g.f255863a.mo120613F(b, new C88595a());
        try {
            Log.m105925i("MicroMsg.SameLayer.ExoVideoCacheHandler", "cache, offset:%s, length:%s, url:%s", Long.valueOf(this.f255860e), Long.valueOf(this.f255861f), this.f255859d);
            C88596c cVar = this.f255862g;
            C86210h.m106781a(jVar, cVar.f255863a, cVar.f255864b.createDataSource(), new byte[131072], (C86464p) null, 0, aVar, false);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e, "cache IOException", new Object[0]);
        } catch (IllegalArgumentException e2) {
            Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e2, "cache IllegalArgumentException", new Object[0]);
        } catch (InterruptedException e3) {
            Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e3, "cache InterruptedException", new Object[0]);
        } catch (Exception e4) {
            Log.printErrStackTrace("MicroMsg.SameLayer.ExoVideoCacheHandler", e4, "cache Exception", new Object[0]);
        }
        this.f255862g.f255865c.remove(this.f255859d);
    }
}
