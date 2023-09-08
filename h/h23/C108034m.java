package h23;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.vlog.model.C96556t0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.IntBuffer;
import rx3.C13598b0;

/* renamed from: h23.m */
public final class C108034m extends C87413o implements C32227p<IntBuffer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108038q f323514d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108034m(C108038q qVar) {
        super(2);
        this.f323514d = qVar;
    }

    public Object invoke(Object obj, Object obj2) {
        IntBuffer intBuffer = (IntBuffer) obj;
        int intValue = ((Number) obj2).intValue();
        C87412m.m108594g(intBuffer, "buffer");
        Log.m105924i("MicroMsg.VLogRemuxer", "on snapshot callback, buffer:" + intBuffer + ", frameCount:" + intValue);
        if (this.f323514d.f323537t && intValue >= 1) {
            intBuffer.position(0);
            C96556t0 t0Var = this.f323514d.f323519b;
            Bitmap createBitmap = Bitmap.createBitmap(t0Var.f282603d, t0Var.f282604e, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(intBuffer);
            BitmapUtil.saveBitmapToImage(createBitmap, 60, Bitmap.CompressFormat.JPEG, this.f323514d.f323538u, true);
            Log.m105924i("MicroMsg.VLogRemuxer", "remuxForThumb finish, thumbPath:" + this.f323514d.f323538u + ", thumb:[" + createBitmap.getWidth() + ", " + createBitmap.getHeight() + ']');
            C108038q qVar = this.f323514d;
            qVar.f323537t = false;
            Log.m105924i("MicroMsg.VLogRemuxer", "release");
            qVar.mo158427c();
            qVar.f323535r.mo161988b();
            MMHandlerThread.postToMainThread(new C108033l(this.f323514d));
        }
        return C13598b0.f38549a;
    }
}
