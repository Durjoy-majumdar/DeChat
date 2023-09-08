package qj1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.e7 */
public final class C12359e7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f35584d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f35585e;

    /* renamed from: f */
    public final /* synthetic */ C12282d7 f35586f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12359e7(Bitmap bitmap, ImageView imageView, C12282d7 d7Var) {
        super(0);
        this.f35584d = bitmap;
        this.f35585e = imageView;
        this.f35586f = d7Var;
    }

    public Object invoke() {
        Bitmap bitmap = this.f35584d;
        if (bitmap != null) {
            this.f35585e.setImageBitmap(bitmap);
        } else {
            this.f35585e.setImageDrawable(this.f35586f.f35409V.getContext().getResources().getDrawable(C0966R.C0969drawable.bfd));
        }
        return C13598b0.f38549a;
    }
}
