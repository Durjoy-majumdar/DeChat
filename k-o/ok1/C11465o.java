package ok1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ok1.o */
public final class C11465o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f33716d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f33717e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11465o(Bitmap bitmap, ImageView imageView) {
        super(0);
        this.f33716d = bitmap;
        this.f33717e = imageView;
    }

    public Object invoke() {
        Bitmap bitmap = this.f33716d;
        if (bitmap != null) {
            this.f33717e.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) / 2.0f));
        } else {
            this.f33717e.setVisibility(8);
        }
        return C13598b0.f38549a;
    }
}
