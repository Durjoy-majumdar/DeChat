package zs1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zs1.r */
public final class C53821r extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53815m f151037d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53821r(C53815m mVar) {
        super(1);
        this.f151037d = mVar;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = this.f151037d.f151024g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return C13598b0.f38549a;
    }
}
