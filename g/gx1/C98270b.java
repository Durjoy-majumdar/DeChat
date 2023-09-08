package gx1;

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

/* renamed from: gx1.b */
public final class C98270b extends C99789a<C45982a> {
    /* renamed from: a */
    public String mo137106a(C102564a<C45982a> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return ((C45982a) aVar.f301995a).getPath();
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C45982a> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String path = ((C45982a) aVar.f301995a).getPath();
        if (C86013q1.m106450k(path)) {
            return C102802a.m135853b(path, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C45982a> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C45982a> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }
}
