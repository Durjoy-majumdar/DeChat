package cn0;

import an0.C79592a;
import android.net.Uri;
import android.text.TextUtils;
import cn0.C80089l;
import dn0.C86360d;
import dn0.C86375p;
import fn0.C86999d;
import fn0.C87002g;
import fn0.C87003h;
import java.util.List;
import java.util.Map;

/* renamed from: cn0.n */
public class C80099n extends C80085j {

    /* renamed from: B */
    public static int f234572B = 3;

    /* renamed from: C */
    public static boolean f234573C;

    /* renamed from: A */
    public String f234574A;

    /* renamed from: x */
    public C86360d f234575x;

    /* renamed from: y */
    public C86375p f234576y;

    /* renamed from: z */
    public int f234577z = 0;

    public C80099n(String str, C87003h<String> hVar, C80108s sVar, C86360d dVar, C86999d<Map<String, List<String>>> dVar2, C86375p pVar) {
        super(str, hVar, sVar, 30000, 12000, true, dVar2);
        this.f234575x = dVar;
        this.f234576y = pVar;
        if (!f234573C) {
            f234572B = C79592a.m96648a().f233409l;
            f234573C = true;
        }
    }

    /* renamed from: b */
    public long mo109837b(C80081g gVar) {
        int i;
        Map<String, List<String>> map;
        C80089l.C80090a aVar;
        C80081g gVar2 = gVar;
        this.f234574A = gVar2.f234525g;
        Throwable th = null;
        try {
            return mo110342k(gVar2, (String) null);
        } catch (C80089l.C80090a e) {
            C80089l.C80090a aVar2 = e;
            if (aVar2 instanceof C80089l.C80095f) {
                C80089l.C80095f fVar = (C80089l.C80095f) aVar2;
                i = fVar.f234570d;
                map = fVar.f234571e;
            } else {
                map = null;
                i = 0;
            }
            String uri = gVar2.f234519a.toString();
            int i2 = 4;
            C87002g.m108023q(4, mo110340i(), "retryOpen url=" + uri + " with responseCode=" + i, (Throwable) null);
            int i3 = 0;
            while (true) {
                if (!Thread.currentThread().isInterrupted() && i3 < f234572B) {
                    C86360d dVar = this.f234575x;
                    if (dVar == null) {
                        aVar = aVar2;
                        C87002g.m108023q(4, mo110340i(), "httpRetryLogic is null", (Throwable) null);
                        break;
                    }
                    String a = dVar.mo120752a(uri, i3, i, map);
                    C87002g.m108023q(i2, mo110340i(), "retryCount=" + i3 + " retryUrl=" + a, th);
                    if (TextUtils.isEmpty(a)) {
                        a = uri;
                    }
                    if (a.equals(uri)) {
                        C87002g.m108023q(5, mo110340i(), "retryUrl is same as origin url", th);
                    }
                    int i4 = i3 + 1;
                    int i5 = i4 * 2000;
                    C87002g.m108023q(i2, mo110340i(), "retry open retrying after " + i5 + " seconds  retry " + i4 + "/" + f234572B, th);
                    try {
                        Thread.sleep((long) i5);
                        Map<String, List<String>> map2 = map;
                        C80089l.C80090a aVar3 = aVar2;
                        int i6 = i;
                        int i7 = i4;
                        try {
                            return mo110342k(new C80081g(Uri.parse(a), gVar2.f234520b, gVar2.f234521c, gVar2.f234522d, gVar2.f234523e, gVar2.f234524f, gVar2.f234525g, gVar2.f234526h), (String) null);
                        } catch (C80089l.C80090a e2) {
                            C80089l.C80090a aVar4 = e2;
                            if (this.f234576y == null || !this.f234576y.mo120771a(1)) {
                                uri = a;
                                map = map2;
                                aVar2 = aVar3;
                                i = i6;
                                i3 = i7;
                                th = null;
                                i2 = 4;
                            } else {
                                C87002g.m108023q(4, mo110340i(), "abort retryOpen videoRequest is cancelling " + this.f234576y + ", reason=" + C87002g.m108014h(aVar4, false), (Throwable) null);
                                throw new C80089l.C80091b("retry open interrupted " + this.f234576y, this.f234549j);
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new C80089l.C80091b("retry open interrupted " + this.f234576y, this.f234549j);
                    }
                } else {
                    aVar = aVar2;
                }
            }
            throw aVar;
        }
    }

    /* renamed from: c */
    public int mo109838c(byte[] bArr, int i, int i2) {
        try {
            return super.mo109838c(bArr, i, i2);
        } catch (C80089l.C80090a e) {
            C80089l.C80090a aVar = e;
            String i3 = mo110340i();
            C87002g.m108023q(4, i3, "read source error occurred " + aVar.toString(), (Throwable) null);
            int i4 = this.f234577z + 1;
            this.f234577z = i4;
            long j = this.f234549j.f234521c + this.f234556q;
            int i5 = i4 * 2000;
            String i6 = mo110340i();
            C87002g.m108023q(4, i6, "retrying after " + i5 + " ms, read start at offset " + j + " retry " + this.f234577z + "/" + f234572B, (Throwable) null);
            try {
                Thread.sleep((long) i5);
                C80081g gVar = new C80081g(Uri.parse(getUri()), 0, j, -1, (String) null, 0, this.f234574A, this.f234549j.f234526h);
                if (Thread.currentThread().isInterrupted() || this.f234577z >= f234572B) {
                    throw aVar;
                } else if (!this.f234576y.mo120771a(1)) {
                    mo109837b(gVar);
                    return mo109838c(bArr, i, i2);
                } else {
                    String i7 = mo110340i();
                    C87002g.m108023q(4, i7, "abort retry videoRequest is cancelling " + this.f234576y, (Throwable) null);
                    throw new C80089l.C80092c("readRetry interrupted " + this.f234576y, this.f234549j);
                }
            } catch (InterruptedException unused) {
                C87002g.m108023q(5, mo110340i(), "readRetry interrupted", (Throwable) null);
                throw aVar;
            }
        }
    }
}
