package qj1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qj1.ag */
public final class C12251ag extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f35330d;

    /* renamed from: e */
    public final /* synthetic */ C12738xf f35331e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12251ag(Bitmap bitmap, C12738xf xfVar) {
        super(0);
        this.f35330d = bitmap;
        this.f35331e = xfVar;
    }

    public Object invoke() {
        if (this.f35330d == null) {
            this.f35331e.mo12281e1(8);
            Log.m105924i("Finder.LiveVisitorAfterPlugin", "videos hidden since load image failed");
        }
        return C13598b0.f38549a;
    }
}
