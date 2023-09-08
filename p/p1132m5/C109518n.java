package p1132m5;

import android.graphics.Bitmap;
import gy3.C87412m;
import p1106e5.C107228a;
import p1106e5.C107230c;

/* renamed from: m5.n */
public final class C109518n {

    /* renamed from: a */
    public final C109527r f327786a;

    /* renamed from: b */
    public final C109530u f327787b;

    /* renamed from: c */
    public final C107230c f327788c;

    /* renamed from: d */
    public final C107228a f327789d;

    /* renamed from: m5.n$a */
    public interface C109519a {
        /* renamed from: a */
        boolean mo160745a();

        Bitmap getBitmap();
    }

    public C109518n(C109527r rVar, C109530u uVar, C107230c cVar, C107228a aVar) {
        C87412m.m108594g(rVar, "strongMemoryCache");
        C87412m.m108594g(uVar, "weakMemoryCache");
        C87412m.m108594g(cVar, "referenceCounter");
        C87412m.m108594g(aVar, "bitmapPool");
        this.f327786a = rVar;
        this.f327787b = uVar;
        this.f327788c = cVar;
        this.f327789d = aVar;
    }
}
