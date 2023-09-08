package qj1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.f7 */
public final class C12387f7 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f35658d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f35659e;

    /* renamed from: f */
    public final /* synthetic */ C12282d7 f35660f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12387f7(Bitmap bitmap, ImageView imageView, C12282d7 d7Var) {
        super(0);
        this.f35658d = bitmap;
        this.f35659e = imageView;
        this.f35660f = d7Var;
    }

    public Object invoke() {
        Bitmap bitmap = this.f35658d;
        if (bitmap != null) {
            this.f35659e.setImageBitmap(bitmap);
        } else {
            this.f35659e.setImageDrawable(this.f35660f.f35409V.getContext().getResources().getDrawable(C0966R.C0969drawable.bfd));
        }
        return C13598b0.f38549a;
    }
}
