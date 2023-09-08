package p1017od;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.TextureView;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import gy3.C87412m;
import p1033sd.C90172b;
import p1059wd.C90965h;
import p416qd.C89598h;
import p673r6.C89876b;
import p748xd.C91174f;
import p748xd.C91175g;
import p748xd.g$$a;

/* renamed from: od.b */
public final class C89154b {

    /* renamed from: a */
    public final C80301a f256880a;

    public C89154b(C80301a aVar) {
        C87412m.m108594g(aVar, "magicbrush");
        this.f256880a = aVar;
    }

    /* renamed from: d */
    public static Bitmap m111438d(C89154b bVar, Bitmap bitmap, int i, Object obj) {
        Bitmap a;
        if ((i & 1) != 0) {
            bitmap = null;
        }
        MagicBrushView e = bVar.mo123495e(0);
        if (e == null) {
            return null;
        }
        MagicBrushView.C80319b bVar2 = e.f235128e;
        if (bVar2 instanceof TextureView) {
            C89598h.m112045b("MagicBrushView", "hy: trigger get bitmap in texture view. need sync ui thread", new Object[0]);
            Handler handler = C91175g.f261413a;
            C91174f fVar = new C91174f(new g$$a(new C90965h(bitmap, bVar2)));
            C91175g.m114415b(fVar);
            a = (Bitmap) fVar.mo125236b();
        } else {
            C89598h.m112045b("MagicBrushView", "hy: trigger get bitmap int other views", new Object[0]);
            C80301a aVar = e.f235133j;
            if (aVar != null) {
                a = aVar.f235098n.mo123492a(e.f235127d, -1, true, 2500);
            } else {
                C87412m.m108603p("magicbrush");
                throw null;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final Bitmap mo123492a(int i, int i2, boolean z, long j) {
        int i3 = i2;
        boolean z2 = z;
        R r = null;
        if (i3 <= 0 && !z2) {
            return null;
        }
        if (this.f256880a.f235057f.mo123774q()) {
            return mo123493b(i, i2, z);
        }
        boolean z3 = true;
        if (!z2) {
            C89598h.m112045b("MagicBrush", "captureCanvasOnOtherThread", new Object[0]);
            C90172b bVar = this.f256880a.f235057f;
            b$$a b__a = new b$$a(this, i, i3, z2);
            bVar.getClass();
            C91174f fVar = new C91174f(b__a);
            if (bVar.f258890a.mo123774q()) {
                fVar.run();
            } else {
                bVar.f258890a.mo123773p(fVar, false);
            }
            Bitmap bitmap = (Bitmap) fVar.mo125236b();
            Object[] objArr = new Object[1];
            if (bitmap != null) {
                z3 = false;
            }
            objArr[0] = Boolean.valueOf(z3);
            C89598h.m112045b("MagicBrush", "ca done %b", objArr);
            return bitmap;
        }
        int i4 = i;
        C89598h.m112045b("MagicBrush", "hy: captureCanvasOnOtherThreadWaitingSwapDone", new Object[0]);
        C89155c cVar = new C89155c(this, i, i2, z, 2500);
        C90172b bVar2 = this.f256880a.f235057f;
        if (bVar2 == null) {
            C89598h.f257791a.mo109481d("MicroMsg.SDK.SyncTask", "null handler, task in exec thread, return now", new Object[0]);
            cVar.mo123497a();
        } else {
            C89598h.m112045b("MicroMsg.SDK.SyncTask", "sync task exec...", new Object[0]);
            cVar.f261407c = SystemClock.elapsedRealtime();
            try {
                synchronized (cVar.f261406b) {
                    C89598h.m112045b("MicroMsg.SDK.SyncTask", "sync task exec at synchronized", new Object[0]);
                    bVar2.mo123773p(cVar.f261410f, false);
                    cVar.f261406b.wait(2500);
                }
            } catch (InterruptedException e) {
                C89598h.m112046c("MicroMsg.SDK.SyncTask", e, "", new Object[0]);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - cVar.f261407c;
            C89598h.m112045b("MicroMsg.SDK.SyncTask", "sync task done, return=%s, cost=%d(wait=%d, run=%d)", "" + cVar.f261405a, Long.valueOf(elapsedRealtime), Long.valueOf(cVar.f261408d), Long.valueOf(elapsedRealtime - cVar.f261408d));
            r = cVar.f261405a;
        }
        Bitmap bitmap2 = (Bitmap) r;
        Object[] objArr2 = new Object[1];
        if (bitmap2 != null) {
            z3 = false;
        }
        objArr2[0] = Boolean.valueOf(z3);
        C89598h.m112045b("MagicBrush.MBCanvasHandler", "hy: is ret bitmap is null? %b", objArr2);
        return bitmap2;
    }

    /* renamed from: b */
    public final Bitmap mo123493b(int i, int i2, boolean z) {
        C80301a aVar = this.f256880a;
        if (aVar.f235052a == 0) {
            return null;
        }
        return z ? aVar.nativeCaptureScreen(aVar.f235052a, i) : aVar.nativeCaptureCanvas(aVar.f235052a, i2);
    }

    /* renamed from: c */
    public final Bitmap mo123494c() {
        return m111438d(this, (Bitmap) null, 1, (Object) null);
    }

    /* renamed from: e */
    public final MagicBrushView mo123495e(int i) {
        MagicBrushView findOrNull = this.f256880a.f235096l.findOrNull(i);
        if (findOrNull != null) {
            return findOrNull;
        }
        C89876b.m112384a("MagicBrush", "findView [%d] but can not find. thread = [%s]", Integer.valueOf(i), Thread.currentThread());
        return null;
    }
}
