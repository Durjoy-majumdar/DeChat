package fw2;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import cw2.C97391o;
import gy3.C87412m;
import k60.C99102f;
import m60.C99789a;
import n60.C100075f;
import p823sg.C90193h;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;
import z04.C119027c;

/* renamed from: fw2.a */
public final class C98056a extends C99789a<C98059c> {
    /* renamed from: a */
    public String mo137106a(C102564a<C98059c> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        String str;
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        C97391o oVar = C97391o.f285892a;
        T t = aVar.f301995a;
        String str2 = ((C98059c) t).f287505d.f297959d;
        String str3 = ((C98059c) t).f287506e;
        if (str2 == null) {
            oVar.getClass();
            str = "";
        } else {
            byte[] bytes = str2.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            str = oVar.mo136654g(oVar.mo136649b(str3) + "pic/", C90193h.m112878f(bytes));
        }
        oVar.mo136650c(str, true);
        return str;
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C98059c> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        String str;
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String a = mo137106a(aVar, fVar, fVar2);
        boolean k = C86013q1.m106450k(a);
        Log.m105924i("MicroMsg.StoryLoader", "url " + aVar + " and path " + a + " ret " + k);
        if (k) {
            return C102802a.m135853b(a, (Object) null);
        }
        C97391o oVar = C97391o.f285892a;
        String str2 = ((C98059c) aVar.f301995a).f287505d.f297959d;
        if (str2 == null) {
            oVar.getClass();
            str = "";
        } else {
            str = oVar.mo136654g(oVar.mo136648a(), str2) + ".u";
        }
        boolean k2 = C86013q1.m106450k(str);
        Log.m105924i("MicroMsg.StoryLoader", "thumb url " + aVar + " and path " + a + " ret " + k2);
        if (k2) {
            return C102802a.m135853b(str, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C98059c> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C98059c> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }
}
