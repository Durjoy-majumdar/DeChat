package d60;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: d60.l0 */
public final class C7216l0 extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7202k0 f25248d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7216l0(C7202k0 k0Var) {
        super(1);
        this.f25248d = k0Var;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f25248d.f166287d.setBackground(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
        }
        return C13598b0.f38549a;
    }
}
