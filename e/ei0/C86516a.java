package ei0;

import com.tencent.p014mm.pluginsdk.res.downloader.model.C85638o;
import java.util.concurrent.TimeUnit;
import te3.C90422jy;

/* renamed from: ei0.a */
public abstract class C86516a extends C85638o {

    /* renamed from: l */
    public final String f251357l;

    /* renamed from: m */
    public final int f251358m;

    /* renamed from: n */
    public final int f251359n;

    /* renamed from: o */
    public volatile boolean f251360o = true;

    /* renamed from: p */
    public volatile C90422jy f251361p;

    /* renamed from: ei0.a$a */
    public interface C86517a {
        /* renamed from: a */
        String mo113492a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86516a(String str, String str2, String str3, String str4, int i, int i2) {
        super(str, str2, String.valueOf(i), "AppBrandWxaPkgDownloader", str3, "GET", 1, 2, 0);
        this.f251357l = str4;
        this.f251358m = i;
        this.f251359n = i2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f249588h = (int) timeUnit.toMillis(15);
        this.f249589i = (int) timeUnit.toMillis(30);
    }

    /* renamed from: h */
    public void mo120990h(boolean z) {
        this.f251360o = z;
    }
}
