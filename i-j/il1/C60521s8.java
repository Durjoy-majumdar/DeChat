package il1;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: il1.s8 */
public final class C60521s8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f172498d;

    /* renamed from: e */
    public final /* synthetic */ C60424h8 f172499e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<Boolean, C13598b0> f172500f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60521s8(Bitmap bitmap, C60424h8 h8Var, C32226l<? super Boolean, C13598b0> lVar) {
        super(0);
        this.f172498d = bitmap;
        this.f172499e = h8Var;
        this.f172500f = lVar;
    }

    public Object invoke() {
        if (this.f172498d != null) {
            this.f172499e.f172290u.setLayerPaint((Paint) null);
            this.f172499e.f172290u.setImageBitmap(this.f172498d);
            C32226l<Boolean, C13598b0> lVar = this.f172500f;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        } else {
            Log.m105924i(this.f172499e.f172287r, "updateCheerIcon resource is null!");
            C60424h8 h8Var = this.f172499e;
            h8Var.f172290u.setImageDrawable(C74933u4.m89768e(h8Var.f166287d.getContext(), C0966R.raw.icons_filled_call_good, this.f172499e.f172281F));
            C32226l<Boolean, C13598b0> lVar2 = this.f172500f;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.FALSE);
            }
        }
        return C13598b0.f38549a;
    }
}
