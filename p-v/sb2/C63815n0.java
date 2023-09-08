package sb2;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: sb2.n0 */
public final class C63815n0 extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f180897d;

    /* renamed from: e */
    public final /* synthetic */ C63774j0 f180898e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63815n0(int i, C63774j0 j0Var) {
        super(1);
        this.f180897d = i;
        this.f180898e = j0Var;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        Log.m105924i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "tryCatchFirstFrame, timeInMv:" + this.f180897d + ", thumb:" + bitmap);
        C63774j0 j0Var = this.f180898e;
        j0Var.f180830y = bitmap;
        j0Var.f180829x = this.f180897d;
        return C13598b0.f38549a;
    }
}
