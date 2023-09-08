package m60;

import c70.C0427b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import k60.C99102f;
import n60.C100075f;
import p60.C100632a;
import p823sg.C90193h;
import t60.C101725g;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;

/* renamed from: m60.d */
public abstract class C99792d<T, R> {

    /* renamed from: a */
    public C101725g f292470a = new C100632a();

    /* renamed from: a */
    public String mo137106a(C102564a<T> aVar, C100075f fVar, C99102f<?, R> fVar2) {
        String str;
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String str2 = fVar.f293166d;
        if (str2 == null || str2.length() == 0) {
            str2 = fVar.f293166d;
        }
        if (str2 == null || str2.length() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0427b.f1051b);
            sb.append(XVFSFile.SEPARATOR_CHAR);
            C87412m.m108591d(this.f292470a);
            if (!Util.isNullOrNil(aVar.toString())) {
                str = C90193h.m112878f(aVar.toString().getBytes());
                Log.m105919d("MicroMsg.Loader.DefaultFileNameCreator", "create image file name :%s", str);
            } else {
                str = null;
            }
            sb.append(str);
            str2 = sb.toString();
        }
        return (str2 == null || str2.length() == 0) ? "" : str2;
    }

    /* renamed from: b */
    public abstract C102802a mo137107b(C102564a<T> aVar, C100075f fVar, C99102f<?, R> fVar2);

    /* renamed from: c */
    public abstract boolean mo137108c(C102564a<T> aVar, C65941g<R> gVar, C100075f fVar, C99102f<?, R> fVar2);

    /* renamed from: d */
    public abstract boolean mo137109d(C102564a<T> aVar, C102355h<?> hVar, C65941g<R> gVar, C100075f fVar, C99102f<?, R> fVar2);

    /* renamed from: e */
    public abstract boolean mo137112e(C102564a<T> aVar, C102355h<?> hVar, C65941g<R> gVar, C65941g<R> gVar2, C100075f fVar, C99102f<?, R> fVar2);
}
