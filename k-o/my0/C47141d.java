package my0;

import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: my0.d */
public final class C47141d {

    /* renamed from: a */
    public final String f126656a;

    /* renamed from: b */
    public final C86009m1 f126657b;

    /* renamed from: c */
    public boolean f126658c;

    /* renamed from: d */
    public String f126659d = "";

    /* renamed from: e */
    public String f126660e = "";

    public C47141d(String str, C86009m1 m1Var) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(m1Var, "savedFile");
        this.f126656a = str;
        this.f126657b = m1Var;
    }

    public String toString() {
        String format = String.format("WebPrefetcherHttpDownloadRequest{eTag: " + this.f126659d + ", wxETag: " + this.f126660e + ", savedFile: " + this.f126657b.mo119971i() + ", " + this.f126657b.mo119967g() + '}', Arrays.copyOf(new Object[0], 0));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }
}
