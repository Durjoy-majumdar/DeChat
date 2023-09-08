package sh3;

import android.graphics.Bitmap;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import k60.C99102f;
import m60.C99789a;
import n60.C100075f;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;

/* renamed from: sh3.b */
public final class C101620b extends C99789a<C101619a> {
    /* renamed from: a */
    public String mo137106a(C102564a<C101619a> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        C101624e eVar = C101624e.f297484a;
        String str = C101624e.f297488e;
        C86013q1.m106461v(str);
        return str + ((C101619a) aVar.f301995a).f297473d.f298862d;
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C101619a> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String a = mo137106a(aVar, fVar, fVar2);
        if (C86013q1.m106450k(a)) {
            return C102802a.m135853b(a, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C101619a> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C101619a> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }
}
