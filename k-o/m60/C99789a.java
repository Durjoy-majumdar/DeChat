package m60;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import cy3.C58003b;
import gy3.C87412m;
import java.io.OutputStream;
import k60.C99102f;
import n60.C100075f;
import rx3.C13598b0;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;

/* renamed from: m60.a */
public abstract class C99789a<T> extends C99792d<T, Bitmap> {
    /* renamed from: a */
    public abstract String mo137106a(C102564a<T> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2);

    /* renamed from: e */
    public boolean mo137112e(C102564a<T> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C65941g<Bitmap> gVar2, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        Bitmap bitmap;
        Throwable th;
        C102564a<T> aVar2 = aVar;
        C102355h<?> hVar2 = hVar;
        C65941g<Bitmap> gVar3 = gVar2;
        C100075f fVar3 = fVar;
        C99102f<?, Bitmap> fVar4 = fVar2;
        C87412m.m108594g(aVar2, "url");
        C87412m.m108594g(hVar2, "httpResponse");
        C65941g<Bitmap> gVar4 = gVar;
        C87412m.m108594g(gVar4, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(fVar3, "opts");
        C87412m.m108594g(fVar4, "reaper");
        if (mo137109d(aVar, hVar, gVar2, fVar, fVar2)) {
            String a = mo137106a(aVar2, fVar3, fVar4);
            Log.m105924i("MicroMsg.Loader.IDiskCache", "save " + aVar2 + " filePath " + a);
            C99791c cVar = C99791c.f292469a;
            OutputStream b = cVar.mo139149b(a);
            if (b != null) {
                boolean z = false;
                if (gVar3 != null) {
                    try {
                        bitmap = (Bitmap) gVar3.f189590a;
                    } catch (Throwable th4) {
                        Throwable th5 = th4;
                        C58003b.m67160a(b, th);
                        throw th5;
                    }
                } else {
                    bitmap = null;
                }
                if (gVar3 == null || bitmap == null) {
                    gVar3 = gVar4;
                } else {
                    C99791c.m130249a(cVar, bitmap, (Bitmap.CompressFormat) null, 0, b, 6, (Object) null);
                    z = true;
                }
                if (!z) {
                    hVar2.mo141919b(b);
                    z = true;
                }
                if (z) {
                    mo137108c(aVar2, gVar3, fVar3, fVar4);
                }
                C13598b0 b0Var = C13598b0.f38549a;
                C58003b.m67160a(b, (Throwable) null);
            }
        }
        return true;
    }
}
