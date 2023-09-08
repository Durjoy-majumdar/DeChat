package pl1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import er1.C58741j5;
import gy3.C87412m;
import k60.C99102f;
import m60.C99789a;
import n60.C100075f;
import rx3.C36570n;
import up1.C27696y;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;

/* renamed from: pl1.v */
public final class C100818v extends C99789a<C100810g0> {
    /* renamed from: a */
    public String mo137106a(C102564a<C100810g0> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return ((C100810g0) aVar.f301995a).getPath();
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C100810g0> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String a = mo137106a(aVar, fVar, fVar2);
        Log.m105926v("Finder.Loader", "url " + aVar + " and path " + a + " fileret " + C86013q1.m106450k(a) + " type " + ((C100810g0) aVar.f301995a).getMediaType());
        if (C86013q1.m106450k(a)) {
            return C102802a.m135853b(a, (Object) null);
        }
        T t = aVar.f301995a;
        if (!(((C100810g0) t) instanceof C62345f)) {
            t = null;
        }
        C100810g0 g0Var = (C100810g0) t;
        if (g0Var != null) {
            C62345f fVar3 = (C62345f) g0Var;
            if (!TextUtils.equals(fVar3.f177199e, fVar3.f177200f)) {
                String str = C58741j5.f168190g + ((String) ((C36570n) fVar3.f177202h).getValue());
                if (C86013q1.m106450k(str)) {
                    Log.m105926v("Finder.Loader", "exist origin url disk cache, rawUrl " + fVar3.f177199e + " and originUrlPath " + str);
                    return C102802a.m135853b(str, (Object) null);
                }
            }
        }
        if (((C100810g0) aVar.f301995a).getMediaType() == C27696y.THUMB_IMAGE) {
            if (C86013q1.m106450k(((C100810g0) aVar.f301995a).getThumbUrl())) {
                return C102802a.m135853b(((C100810g0) aVar.f301995a).getThumbUrl(), (Object) null);
            }
        } else if (C86013q1.m106450k(((C100810g0) aVar.f301995a).getUrl())) {
            return C102802a.m135853b(((C100810g0) aVar.f301995a).getUrl(), (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C100810g0> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C100810g0> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }
}
