package oh0;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import k60.C99102f;
import m60.C99789a;
import n60.C100075f;
import p1081gi.C98124g;
import p753xp.C102704b;
import p867wp.C102479b;
import ph0.C100792a;
import w60.C102355h;
import w60.C65941g;
import x60.C102564a;
import y60.C102802a;

/* renamed from: oh0.a */
public final class C100347a extends C99789a<C100353d> {
    /* renamed from: a */
    public String mo137106a(C102564a<C100353d> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return ((C100353d) aVar.f301995a).f293936g;
    }

    /* renamed from: b */
    public C102802a mo137107b(C102564a<C100353d> aVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return C102802a.m135853b(mo137106a(aVar, fVar, fVar2), aVar.f301995a);
    }

    /* renamed from: c */
    public boolean mo137108c(C102564a<C100353d> aVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        String a = mo137106a(aVar, fVar, fVar2);
        String str = null;
        C102479b as = ((C102704b) C86312j.m106911c(C102704b.class)).mo138751as(a, 9999, (String) null, (byte[]) null);
        C100792a aVar2 = C100792a.f295260a;
        C98124g gVar2 = ((C100353d) aVar.f301995a).f293938i;
        if (gVar2 != null) {
            str = gVar2.field_mediaId;
        }
        String i = aVar2.mo140237i(str);
        if (C86013q1.m106450k(i)) {
            C86013q1.m106447h(i);
        }
        Log.m105925i("MicroMsg.AlbumBitmapDiskCache", "AlbumCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", a, Integer.valueOf(as.f301760a), Boolean.valueOf(as.f301761b), Boolean.FALSE, Boolean.valueOf(as.f301762c), Long.valueOf(as.f301763d));
        return true;
    }

    /* renamed from: d */
    public boolean mo137109d(C102564a<C100353d> aVar, C102355h<?> hVar, C65941g<Bitmap> gVar, C100075f fVar, C99102f<?, Bitmap> fVar2) {
        C87412m.m108594g(aVar, "url");
        C87412m.m108594g(hVar, "httpResponse");
        C87412m.m108594g(fVar, "opts");
        C87412m.m108594g(fVar2, "reaper");
        return true;
    }
}
