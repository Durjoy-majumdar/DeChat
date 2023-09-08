package qk1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import qk1.C63226j0;
import rx3.C13598b0;
import te3.C64693s21;

/* renamed from: qk1.k0 */
public final class C63230k0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f179434d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C64693s21> f179435e;

    /* renamed from: f */
    public final /* synthetic */ C63226j0.C63227a f179436f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63230k0(Bitmap bitmap, C8479f0<C64693s21> f0Var, C63226j0.C63227a aVar) {
        super(0);
        this.f179434d = bitmap;
        this.f179435e = f0Var;
        this.f179436f = aVar;
    }

    public Object invoke() {
        Bitmap bitmap = this.f179434d;
        if (bitmap != null) {
            if (((C64693s21) this.f179435e.f27484d).f185314i == 3) {
                this.f179436f.f179427z.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, (float) (bitmap.getHeight() / 2)));
            } else {
                this.f179436f.f179427z.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, 6.0f));
            }
        }
        return C13598b0.f38549a;
    }
}
