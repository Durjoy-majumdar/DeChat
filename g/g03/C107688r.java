package g03;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: g03.r */
public final class C107688r implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C107681p f322194d;

    /* renamed from: g03.r$a */
    public static final class C107689a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SurfaceTexture f322195d;

        /* renamed from: e */
        public final /* synthetic */ C107681p f322196e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107689a(SurfaceTexture surfaceTexture, C107681p pVar) {
            super(0);
            this.f322195d = surfaceTexture;
            this.f322196e = pVar;
        }

        public Object invoke() {
            try {
                this.f322195d.updateTexImage();
            } catch (Exception e) {
                Log.printErrStackTrace(this.f322196e.f322157a, e, "updateTexImage error", new Object[0]);
            }
            C107681p.m145857a(this.f322196e, this.f322195d.getTimestamp());
            return C13598b0.f38549a;
        }
    }

    public C107688r(C107681p pVar) {
        this.f322194d = pVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Looper myLooper = Looper.myLooper();
        MMHandler mMHandler = this.f322194d.f322161e;
        if (C87412m.m108589b(myLooper, mMHandler != null ? mMHandler.getLooper() : null)) {
            try {
                surfaceTexture.updateTexImage();
            } catch (Exception e) {
                Log.printErrStackTrace(this.f322194d.f322157a, e, "updateTexImage error", new Object[0]);
            }
            C107681p.m145857a(this.f322194d, surfaceTexture.getTimestamp());
            return;
        }
        C107681p pVar = this.f322194d;
        pVar.mo158093k(new C107689a(surfaceTexture, pVar));
    }
}
