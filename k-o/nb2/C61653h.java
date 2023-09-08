package nb2;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ic0.C21070h;
import jc0.C21210b;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: nb2.h */
public final class C61653h implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ ImageView f175314a;

    /* renamed from: nb2.h$a */
    public static final class C61654a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f175315d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f175316e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61654a(ImageView imageView, Bitmap bitmap) {
            super(0);
            this.f175315d = imageView;
            this.f175316e = bitmap;
        }

        public Object invoke() {
            this.f175315d.setImageBitmap(this.f175316e);
            return C13598b0.f38549a;
        }
    }

    public C61653h(ImageView imageView) {
        this.f175314a = imageView;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        Bitmap fastblur;
        C87412m.m108594g(str, "url");
        if ((bVar != null ? bVar.f59988d : null) != null && !bVar.f59988d.isRecycled() && (fastblur = BitmapUtil.fastblur(bVar.f59988d, 10)) != null) {
            C61926c.m72668M(new C61654a(this.f175314a, fastblur));
        }
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
