package k60;

import android.graphics.Bitmap;
import android.widget.ImageView;
import gy3.C87412m;
import l60.C99342a;
import l60.C99344b;
import n60.C100074e;
import n60.C100075f;

/* renamed from: k60.d */
public abstract class C60979d<T> {

    /* renamed from: a */
    public final C100074e<T, Bitmap> f173682a;

    public C60979d(C100074e<T, Bitmap> eVar) {
        C87412m.m108594g(eVar, "configuration");
        this.f173682a = eVar;
    }

    /* renamed from: a */
    public abstract C99344b<T, Bitmap> mo85955a(T t);

    /* renamed from: b */
    public abstract C99344b<T, Bitmap> mo85956b(T t, C100075f fVar);

    /* renamed from: c */
    public abstract void mo85957c(T t, ImageView imageView, C100075f fVar);

    /* renamed from: d */
    public abstract C99342a<T> mo85958d(T t, C100075f fVar);
}
