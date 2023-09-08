package po1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: po1.a */
public final class C62413a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f177380d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f177381e;

    /* renamed from: po1.a$a */
    public static final class C62414a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f177382d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62414a(ImageView imageView) {
            super(1);
            this.f177382d = imageView;
        }

        public Object invoke(Object obj) {
            this.f177382d.setImageBitmap((Bitmap) obj);
            return C13598b0.f38549a;
        }
    }

    public C62413a(Bitmap bitmap, ImageView imageView) {
        this.f177380d = bitmap;
        this.f177381e = imageView;
    }

    public final void run() {
        C65849b bVar = new C65849b();
        Bitmap bitmap = this.f177380d;
        C87412m.m108593f(bitmap, "resource");
        bVar.mo89891b(bitmap);
        int width = this.f177381e.getWidth();
        int height = this.f177381e.getHeight();
        bVar.f189363b = width;
        bVar.f189364c = height;
        bVar.f189366e.f334033b.mo154924d();
        bVar.mo89890a(new C62414a(this.f177381e));
    }
}
