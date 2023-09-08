package qj1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.t1 */
public final class C12668t1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f36275d;

    /* renamed from: e */
    public final /* synthetic */ C12690u1 f36276e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12668t1(Bitmap bitmap, C12690u1 u1Var) {
        super(0);
        this.f36275d = bitmap;
        this.f36276e = u1Var;
    }

    public Object invoke() {
        if (this.f36275d != null) {
            this.f36276e.f36363r.setLayerPaint((Paint) null);
            this.f36276e.f36363r.setImageBitmap(this.f36275d);
        } else {
            Log.m105924i(this.f36276e.f36362q, "updateCheerIcon resource is null!");
            C12690u1 u1Var = this.f36276e;
            u1Var.f36357B = null;
            ImageView imageView = u1Var.f36363r;
            Drawable drawable = u1Var.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_call_good);
            C74933u4.m89769f(drawable, this.f36276e.f166287d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            imageView.setImageDrawable(drawable);
        }
        return C13598b0.f38549a;
    }
}
