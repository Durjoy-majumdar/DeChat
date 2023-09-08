package gz2;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
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

/* renamed from: gz2.a */
public final class C98291a extends C99789a<C46003b> {
    /* renamed from: a */
    public String mo137106a(C102564a<C46003b> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String str = ((C46003b) aVar.f301995a).f124051d;
        C87412m.m108594g(str, "url");
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251806d + "textstatus/");
        sb.append("icon");
        String sb4 = sb.toString();
        if (!C86013q1.m106450k(sb4)) {
            C86013q1.m106461v(sb4);
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(XVFSFile.SEPARATOR_CHAR);
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        sb5.append(C90193h.m112878f(bytes));
        return sb5.toString();
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C46003b> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String a = mo137106a(aVar, fVar, fVar2);
        boolean k = C86013q1.m106450k(a);
        Log.m105918d("MicroMsg.TextStatus.TextStatusLoader", "get() called with: ret = " + k + " url = " + aVar + ", opts = " + fVar + ", reaper = " + fVar2);
        if (k) {
            return C102802a.m135853b(a, (Object) null);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C46003b> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C46003b> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }
}
