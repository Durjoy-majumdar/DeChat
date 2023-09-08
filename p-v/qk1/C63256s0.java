package qk1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import fy3.C32224a;
import gy3.C87413o;
import qk1.C63252r0;
import rx3.C13598b0;

/* renamed from: qk1.s0 */
public final class C63256s0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f179502d;

    /* renamed from: e */
    public final /* synthetic */ C63252r0.C63253a f179503e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63256s0(Bitmap bitmap, C63252r0.C63253a aVar) {
        super(0);
        this.f179502d = bitmap;
        this.f179503e = aVar;
    }

    public Object invoke() {
        Bitmap bitmap = this.f179502d;
        if (bitmap != null) {
            this.f179503e.f179497z.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, 3.0f));
        }
        return C13598b0.f38549a;
    }
}
