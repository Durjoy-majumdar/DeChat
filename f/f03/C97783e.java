package f03;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import cy3.C58003b;
import gy3.C87412m;
import java.io.OutputStream;
import k60.C99102f;
import ky3.C88334c;
import m60.C99789a;
import m60.C99791c;
import n60.C100075f;
import rx3.C13598b0;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;

/* renamed from: f03.e */
public final class C97783e extends C99789a<C97784f> {
    /* renamed from: a */
    public String mo137106a(C102564a<C97784f> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return ((C97784f) aVar.f301995a).f286869e;
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C97784f> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String a = mo137106a(aVar, fVar, fVar2);
        C88334c cVar = C86703c.f251712a;
        Log.m105926v("MicroMsg.CdnImageLoader", "url " + aVar + " and path " + a + " fileret " + C86013q1.m106450k(a));
        if (C86013q1.m106450k(a)) {
            return C102802a.m135853b(a, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C97784f> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C97784f> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: e */
    public boolean mo137112e(C102564a<C97784f> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C65941g<Bitmap> gVar2, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        Throwable th;
        C102564a<C97784f> aVar2 = aVar;
        C102355h<?> hVar2 = hVar;
        C65941g<Bitmap> gVar3 = gVar;
        C100075f fVar3 = fVar;
        C99102f<?, Bitmap> fVar4 = fVar2;
        C87412m.m108594g(aVar2, "url");
        C87412m.m108594g(hVar2, "httpResponse");
        C87412m.m108594g(gVar3, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(fVar3, "opts");
        C87412m.m108594g(fVar4, "reaper");
        String a = mo137106a(aVar2, fVar3, fVar4);
        C88334c cVar = C86703c.f251712a;
        boolean z = false;
        Log.printInfoStack("MicroMsg.CdnImageLoader", "save " + aVar2 + " filePath " + a + ' ' + gVar3 + ", " + gVar3.f189590a, new Object[0]);
        C99791c cVar2 = C99791c.f292469a;
        OutputStream b = cVar2.mo139149b(a);
        if (b != null) {
            try {
                Log.m105924i("MicroMsg.CdnImageLoader", "open stream save " + aVar2);
                T t = gVar3.f189590a;
                if (t != null) {
                    C99791c.m130249a(cVar2, (Bitmap) t, (Bitmap.CompressFormat) null, 0, b, 6, (Object) null);
                    Log.m105924i("MicroMsg.CdnImageLoader", "finished compress to local file: " + aVar2);
                    z = true;
                }
                if (!z) {
                    hVar2.mo141919b(b);
                    z = true;
                }
                if (z) {
                    mo137108c(aVar2, gVar3, fVar3, fVar4);
                }
                Log.m105924i("MicroMsg.CdnImageLoader", "call onCompleted finished: " + aVar2);
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(b, (Throwable) null);
            } catch (Throwable th4) {
                Throwable th5 = th4;
                C58003b.m67160a(b, th);
                throw th5;
            }
        }
        return true;
    }
}
