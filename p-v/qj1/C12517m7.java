package qj1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.m7 */
public final class C12517m7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f35980d;

    /* renamed from: e */
    public final /* synthetic */ C12282d7 f35981e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12517m7(Bitmap bitmap, C12282d7 d7Var) {
        super(0);
        this.f35980d = bitmap;
        this.f35981e = d7Var;
    }

    public Object invoke() {
        Bitmap bitmap = this.f35980d;
        if (bitmap != null) {
            this.f35981e.f35409V.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) / 2.0f));
        } else {
            ImageView imageView = this.f35981e.f35409V;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(C0966R.C0969drawable.bfd));
        }
        return C13598b0.f38549a;
    }
}
