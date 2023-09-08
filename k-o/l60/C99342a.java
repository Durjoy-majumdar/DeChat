package l60;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32227p;
import gy3.C87412m;
import n60.C100074e;
import r60.C101339a;
import r60.C101341c;
import r60.C101350i;
import rx3.C13598b0;
import x60.C102564a;

/* renamed from: l60.a */
public final class C99342a<T> extends C99344b<T, Bitmap> {

    /* renamed from: l60.a$a */
    public static final class C99343a extends C101341c {

        /* renamed from: c */
        public final /* synthetic */ C32227p<C101350i<?>, Bitmap, C13598b0> f291316c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99343a(C32227p<? super C101350i<?>, ? super Bitmap, C13598b0> pVar, C101350i<ImageView> iVar) {
            super(iVar);
            this.f291316c = pVar;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ boolean mo138755b(Object obj, C101350i iVar) {
            mo138756e((Bitmap) obj, iVar);
            return true;
        }

        /* renamed from: e */
        public boolean mo138756e(Bitmap bitmap, C101350i<?> iVar) {
            C87412m.m108594g(iVar, "viewWeakHolder");
            super.mo138755b(bitmap, iVar);
            C32227p<C101350i<?>, Bitmap, C13598b0> pVar = this.f291316c;
            if (pVar == null) {
                return true;
            }
            pVar.invoke(iVar, bitmap);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99342a(C102564a<T> aVar, C100074e<T, Bitmap> eVar) {
        super(aVar, eVar);
        C87412m.m108594g(aVar, "reqValue");
        C87412m.m108594g(eVar, "mImageLoaderConfiguration");
    }

    /* renamed from: c */
    public void mo85953c() {
        if (this.f291326j == null) {
            this.f291326j = new C101339a();
        }
        mo85951a();
    }

    /* renamed from: d */
    public void mo85954d(ImageView imageView) {
        C87412m.m108594g(imageView, "imageView");
        if (this.f291326j == null) {
            this.f291326j = new C101341c(new C101350i(imageView, this.f291317a));
        }
        mo85951a();
    }

    /* renamed from: h */
    public final void mo138753h(ImageView imageView, C32227p<? super C101350i<?>, ? super Bitmap, C13598b0> pVar) {
        C87412m.m108594g(imageView, "imageView");
        if (this.f291326j == null) {
            this.f291326j = new C99343a(pVar, new C101350i(imageView));
        }
        mo85951a();
    }

    /* renamed from: i */
    public void mo138754i(ImageView imageView, boolean z) {
        C87412m.m108594g(imageView, "imageView");
        if (this.f291326j == null) {
            this.f291326j = new C101341c(new C101350i(imageView, this.f291317a), z);
        }
        mo85951a();
    }
}
