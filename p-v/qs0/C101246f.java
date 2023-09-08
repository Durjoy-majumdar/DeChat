package qs0;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.video.player.thumb.C104818d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: qs0.f */
public final class C101246f {

    /* renamed from: a */
    public static final C101246f f296460a = new C101246f();

    /* renamed from: b */
    public static final C13601g f296461b = C36568h.m40985a(C36074c.f96160d);

    /* renamed from: qs0.f$c */
    public static final class C36074c extends C87413o implements C32224a<C86009m1> {

        /* renamed from: d */
        public static final C36074c f96160d = new C36074c();

        public C36074c() {
            super(0);
        }

        public Object invoke() {
            C86009m1 m1Var = new C86009m1(C112760b.m154195C(), "ThumbVideoCache/CdnDownload/Cache");
            C86013q1.m106461v(m1Var.mo119971i());
            C86009m1 m1Var2 = new C86009m1(m1Var, C104818d.m140485a());
            C86013q1.m106461v(m1Var2.mo119971i());
            return m1Var2;
        }
    }

    /* renamed from: qs0.f$a */
    public static final class C101247a {

        /* renamed from: a */
        public final String f296462a;

        /* renamed from: b */
        public final String f296463b;

        /* renamed from: c */
        public final String f296464c;

        /* renamed from: d */
        public final boolean f296465d;

        public C101247a(String str, String str2, String str3, boolean z) {
            C87412m.m108594g(str, "srcUrl");
            C87412m.m108594g(str2, "downloadId");
            C87412m.m108594g(str3, "cachePath");
            this.f296462a = str;
            this.f296463b = str2;
            this.f296464c = str3;
            this.f296465d = z;
        }

        /* renamed from: a */
        public static C101247a m132824a(C101247a aVar, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f296462a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f296463b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.f296464c;
            }
            if ((i & 8) != 0) {
                z = aVar.f296465d;
            }
            aVar.getClass();
            C87412m.m108594g(str, "srcUrl");
            C87412m.m108594g(str2, "downloadId");
            C87412m.m108594g(str3, "cachePath");
            return new C101247a(str, str2, str3, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C101247a)) {
                return false;
            }
            C101247a aVar = (C101247a) obj;
            return C87412m.m108589b(this.f296462a, aVar.f296462a) && C87412m.m108589b(this.f296463b, aVar.f296463b) && C87412m.m108589b(this.f296464c, aVar.f296464c) && this.f296465d == aVar.f296465d;
        }

        public int hashCode() {
            int hashCode = ((((this.f296462a.hashCode() * 31) + this.f296463b.hashCode()) * 31) + this.f296464c.hashCode()) * 31;
            boolean z = this.f296465d;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "CacheInfo(srcUrl=" + this.f296462a + ", downloadId=" + this.f296463b + ", cachePath=" + this.f296464c + ", isCacheFinished=" + this.f296465d + ')';
        }
    }

    /* renamed from: qs0.f$b */
    public static final class C101248b {

        /* renamed from: a */
        public C101247a f296466a;

        public C101248b(C101247a aVar) {
            C87412m.m108594g(aVar, "_cacheInfo");
            this.f296466a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo140716a(C101247a aVar) {
        C86009m1 m1Var;
        Uri.Builder builder;
        if (aVar.f296465d) {
            m1Var = new C86009m1(mo140717b(), aVar.f296463b + ".mark");
            if (!m1Var.mo119967g()) {
                Log.m105924i("MicroMsg.AppBrand.ThumbCdnCacheManager", "doMark, markFile is not exists");
                C86009m1 b = mo140717b();
                String str = aVar.f296463b + ".temp.mark";
                Uri uri = b == null ? null : b.f250486d;
                if (uri == null) {
                    builder = new Uri.Builder().path(str);
                } else {
                    Uri.Builder buildUpon = uri.buildUpon();
                    if (!str.isEmpty()) {
                        buildUpon.appendPath(str);
                    }
                    builder = buildUpon;
                }
                Uri build = builder.build();
                String path = build.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!build.getPath().equals(k)) {
                        build = builder.path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null);
                C116281f0.C116288h z = m1Var.mo119989z();
                if (l.mo177810a() && z.mo177810a()) {
                    try {
                        z.f348991a.mo119946t(z.f348992b, l.f348991a, l.f348992b);
                    } catch (IOException unused) {
                    }
                }
            }
        } else {
            m1Var = new C86009m1(mo140717b(), aVar.f296463b + ".temp.mark");
        }
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnCacheManager", "doMark, needDoMarkFile(virtual): " + m1Var);
        C86013q1.m106438T(m1Var.mo119971i(), new byte[]{0}, 0, 1);
    }

    /* renamed from: b */
    public final C86009m1 mo140717b() {
        return (C86009m1) ((C36570n) f296461b).getValue();
    }

    /* renamed from: c */
    public final void mo140718c(C101248b bVar) {
        C87412m.m108594g(bVar, "cacheInfoHolder");
        C101247a aVar = bVar.f296466a;
        Log.m105924i("MicroMsg.AppBrand.ThumbCdnCacheManager", "onCacheTouch, cacheInfo: " + aVar);
        mo140716a(aVar);
    }
}
