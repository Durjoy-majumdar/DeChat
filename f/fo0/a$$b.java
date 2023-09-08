package fo0;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;

public final /* synthetic */ class a$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87012a f252503d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f252504e;

    /* renamed from: f */
    public final /* synthetic */ Runnable f252505f;

    public /* synthetic */ a$$b(C87012a aVar, C82381f fVar, Runnable runnable) {
        this.f252503d = aVar;
        this.f252504e = fVar;
        this.f252505f = runnable;
    }

    public final void run() {
        C87012a aVar = this.f252503d;
        C82381f fVar = this.f252504e;
        Runnable runnable = this.f252505f;
        aVar.getClass();
        if (fVar.getAsyncHandler().getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            fVar.getAsyncHandler().post(runnable);
        }
    }
}
