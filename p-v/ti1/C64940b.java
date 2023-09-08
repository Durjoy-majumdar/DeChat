package ti1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ti1.b */
public final class C64940b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f186990d;

    /* renamed from: e */
    public final /* synthetic */ C64941c f186991e;

    /* renamed from: f */
    public final /* synthetic */ boolean f186992f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64940b(Bitmap bitmap, C64941c cVar, boolean z) {
        super(0);
        this.f186990d = bitmap;
        this.f186991e = cVar;
        this.f186992f = z;
    }

    public Object invoke() {
        if (this.f186990d != null) {
            this.f186991e.getViewBinding().f175454c.setImageDrawable(new BitmapDrawable(this.f186991e.getContext().getResources(), this.f186990d));
            C64941c cVar = this.f186991e;
            cVar.mo89094b(this.f186992f && cVar.f186999j);
            C64943e eVar = this.f186991e.f186996g;
            if (eVar != null) {
                eVar.f187007c++;
                Log.m105924i("PreviewCountDownData", "cur: " + eVar.f187007c + " sum: " + eVar.f187005a + " code: " + eVar.hashCode());
                if (eVar.f187007c == eVar.f187005a) {
                    eVar.f187006b.invoke();
                }
            }
        }
        return C13598b0.f38549a;
    }
}
