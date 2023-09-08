package j92;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import h92.C98325d;
import l92.C109296d;

/* renamed from: j92.d */
public final class C108677d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108669a f325456d;

    /* renamed from: e */
    public final /* synthetic */ C109296d f325457e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f325458f;

    /* renamed from: g */
    public final /* synthetic */ int f325459g;

    /* renamed from: j92.d$a */
    public static final class C108678a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109296d f325460d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f325461e;

        /* renamed from: f */
        public final /* synthetic */ int f325462f;

        /* renamed from: g */
        public final /* synthetic */ C108669a f325463g;

        public C108678a(C109296d dVar, Bitmap bitmap, int i, C108669a aVar) {
            this.f325460d = dVar;
            this.f325461e = bitmap;
            this.f325462f = i;
            this.f325463g = aVar;
        }

        public final void run() {
            C109296d dVar = this.f325460d;
            if (dVar != null) {
                dVar.mo90718c(this.f325461e, this.f325462f);
            }
            C98325d dVar2 = this.f325463g.f325431d;
            if (dVar2 != null) {
                ViewParent viewParent = null;
                if ((dVar2 != null ? dVar2.getParent() : null) != null) {
                    C98325d dVar3 = this.f325463g.f325431d;
                    if (dVar3 != null) {
                        viewParent = dVar3.getParent();
                    }
                    C87412m.m108592e(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) viewParent).removeView(this.f325463g.f325431d);
                }
            }
        }
    }

    public C108677d(C108669a aVar, C109296d dVar, Bitmap bitmap, int i) {
        this.f325456d = aVar;
        this.f325457e = dVar;
        this.f325458f = bitmap;
        this.f325459g = i;
    }

    public final void run() {
        C108669a aVar = this.f325456d;
        aVar.f325433f = false;
        MMHandlerThread.postToMainThread(new C108678a(this.f325457e, this.f325458f, this.f325459g, aVar));
    }
}
