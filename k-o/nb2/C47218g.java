package nb2;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ic0.C21070h;
import jc0.C21210b;
import kg3.C76577a;
import o40.C61926c;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: nb2.g */
public final class C47218g implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ C61647e f126780a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f126781b;

    /* renamed from: nb2.g$a */
    public static final class C47219a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f126782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47219a(ImageView imageView) {
            super(1);
            this.f126782d = imageView;
        }

        public Object invoke(Object obj) {
            C61926c.m72668M(new C47217f(this.f126782d, (Bitmap) obj));
            return C13598b0.f38549a;
        }
    }

    public C47218g(C61647e eVar, ImageView imageView) {
        this.f126780a = eVar;
        this.f126781b = imageView;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        C87412m.m108594g(str, "url");
        if ((bVar != null ? bVar.f59988d : null) != null && !bVar.f59988d.isRecycled()) {
            C65849b bVar2 = new C65849b();
            Bitmap bitmap = bVar.f59988d;
            C87412m.m108593f(bitmap, "imageData.bitmap");
            bVar2.mo89891b(bitmap);
            int A = C76577a.m92145A(this.f126780a.f175299e);
            int j = C76577a.m92159j(this.f126780a.f175299e);
            bVar2.f189363b = A;
            bVar2.f189364c = j;
            bVar2.f189366e.f334033b.mo154924d();
            bVar2.mo89890a(new C47219a(this.f126781b));
        }
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
