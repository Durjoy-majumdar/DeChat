package pl1;

import android.graphics.Bitmap;
import di3.C86312j;
import er1.C58784w3;
import gy3.C87412m;
import java.io.InputStream;
import k60.C99102f;
import n60.C100075f;
import o40.C61925b;
import p143ds.C97528n;
import q60.C101036c;
import r60.C101350i;
import rx3.C13598b0;
import w60.C65941g;
import y60.C102802a;

/* renamed from: pl1.k */
public class C100813k extends C101036c {
    /* renamed from: a */
    public C65941g<Bitmap> mo87424a(C101350i<?> iVar, C99102f<?, Bitmap> fVar, C102802a aVar) {
        Bitmap bitmap;
        C87412m.m108594g(iVar, "targetView");
        C87412m.m108594g(fVar, "reaper");
        C87412m.m108594g(aVar, "input");
        C61925b bVar = new C61925b("FinderBitmapProducer");
        InputStream a = aVar.mo142542a();
        if (a != null) {
            C100075f fVar2 = fVar.f290573b;
            int i = fVar2.f293168f;
            int i2 = fVar2.f293169g;
            C58784w3.f168295a.getClass();
            bitmap = ((C97528n) C86312j.m106911c(C97528n.class)).mo136634Vf(a, i, i2, true, false, true);
            C13598b0 b0Var = C13598b0.f38549a;
        } else {
            bitmap = null;
        }
        bVar.mo86838a();
        return new C65941g<>(bitmap);
    }
}
