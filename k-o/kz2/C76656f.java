package kz2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: kz2.f */
public final class C76656f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f224343d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f224344e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f224345f;

    /* renamed from: kz2.f$a */
    public static final class C76657a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f224346d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76657a(ImageView imageView) {
            super(1);
            this.f224346d = imageView;
        }

        public Object invoke(Object obj) {
            this.f224346d.setImageBitmap((Bitmap) obj);
            return C13598b0.f38549a;
        }
    }

    public C76656f(boolean z, Bitmap bitmap, ImageView imageView) {
        this.f224343d = z;
        this.f224344e = bitmap;
        this.f224345f = imageView;
    }

    public final void run() {
        if (this.f224343d || this.f224344e.getWidth() == 0 || this.f224345f.getWidth() == 0 || ((float) this.f224344e.getHeight()) / ((float) this.f224344e.getWidth()) < ((float) this.f224345f.getHeight()) / ((float) this.f224345f.getWidth())) {
            C65849b bVar = new C65849b();
            bVar.mo89891b(this.f224344e);
            int width = this.f224345f.getWidth();
            int height = this.f224345f.getHeight();
            bVar.f189363b = width;
            bVar.f189364c = height;
            bVar.f189366e.f334033b.mo154924d();
            if (this.f224343d) {
                bVar.f189366e.f334033b.mo154922b().mo162186d(1.5f);
            }
            bVar.mo89890a(new C76657a(this.f224345f));
            return;
        }
        this.f224345f.setImageBitmap(this.f224344e);
    }
}
