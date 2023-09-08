package ti1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ti1.d */
public final class C13928d extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f39129d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13928d(ImageView imageView) {
        super(1);
        this.f39129d = imageView;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f39129d.setImageDrawable(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
        }
        return C13598b0.f38549a;
    }
}
