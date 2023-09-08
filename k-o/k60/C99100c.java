package k60;

import android.graphics.Bitmap;
import android.widget.ImageView;
import gy3.C87412m;
import l60.C99342a;
import l60.C99344b;
import n60.C100074e;
import n60.C100075f;
import x60.C102564a;
import x60.C15627c;

/* renamed from: k60.c */
public class C99100c<T extends C15627c> extends C60979d<T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99100c(C100074e<T, Bitmap> eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "configuration");
    }

    /* renamed from: e */
    public C99342a<T> mo85955a(T t) {
        C87412m.m108594g(t, "url");
        return new C99342a<>(new C102564a((C15627c) t), this.f173682a);
    }

    /* renamed from: f */
    public C99344b<T, Bitmap> mo85956b(T t, C100075f fVar) {
        C87412m.m108594g(t, "url");
        C87412m.m108594g(fVar, "options");
        C99342a aVar = new C99342a(new C102564a((C15627c) t), this.f173682a);
        aVar.f291319c = fVar;
        return aVar;
    }

    /* renamed from: g */
    public void mo85957c(T t, ImageView imageView, C100075f fVar) {
        C87412m.m108594g(t, "url");
        C87412m.m108594g(imageView, "view");
        C87412m.m108594g(fVar, "options");
        C99342a aVar = new C99342a(new C102564a((C15627c) t), this.f173682a);
        aVar.f291319c = fVar;
        aVar.mo85954d(imageView);
    }

    /* renamed from: h */
    public C99342a<T> mo85958d(T t, C100075f fVar) {
        C87412m.m108594g(t, "url");
        C87412m.m108594g(fVar, "options");
        C99342a<T> aVar = new C99342a<>(new C102564a((C15627c) t), this.f173682a);
        aVar.f291319c = fVar;
        return aVar;
    }
}
