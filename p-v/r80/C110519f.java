package r80;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: r80.f */
public final class C110519f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C110505a f330498d;

    public C110519f(C110505a aVar) {
        this.f330498d = aVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        String str = this.f330498d.f330438b;
        StringBuilder sb = new StringBuilder();
        sb.append("onFrameAvailable, thread:");
        sb.append(Thread.currentThread());
        sb.append(", surface timestamp:");
        SurfaceTexture surfaceTexture2 = this.f330498d.f330444h;
        Bitmap bitmap = null;
        sb.append(surfaceTexture2 != null ? Long.valueOf(surfaceTexture2.getTimestamp()) : null);
        sb.append(", drawInOnFrameAvailable:");
        sb.append(this.f330498d.f330451o);
        Log.m105924i(str, sb.toString());
        C110505a aVar = this.f330498d;
        SurfaceTexture surfaceTexture3 = aVar.f330444h;
        if (surfaceTexture3 != null) {
            if (surfaceTexture3.getTimestamp() <= 0) {
                aVar.f330455s++;
            } else {
                aVar.f330455s = 0;
            }
            if (!aVar.f330445i || surfaceTexture3.getTimestamp() > 0) {
                aVar.f330460x = surfaceTexture3.getTimestamp();
            } else {
                Log.m105924i(aVar.f330438b, "first frame available and new timestamp still zero!!");
                if (aVar.f330455s >= 3) {
                    Log.m105924i(aVar.f330438b, "continue 3 frames pts is zero!!!");
                    aVar.f330451o = false;
                    C32224a<C13598b0> aVar2 = aVar.f330453q;
                    if (aVar2 != null) {
                        aVar2.invoke();
                        return;
                    }
                    return;
                }
            }
            if (!aVar.f330445i) {
                aVar.f330445i = true;
            }
            if (aVar.f330451o) {
                Bitmap bitmap2 = aVar.f330449m;
                if (bitmap2 != null) {
                    C110505a.m150444a(aVar, aVar.f330460x, bitmap2, (Bitmap) null);
                    return;
                }
                long j = aVar.f330460x;
                C32226l<? super Long, Bitmap> lVar = aVar.f330448l;
                Bitmap invoke = lVar != null ? lVar.invoke(Long.valueOf(surfaceTexture3.getTimestamp() / ((long) 1000))) : null;
                C32226l<? super Long, Bitmap> lVar2 = aVar.f330450n;
                if (lVar2 != null) {
                    bitmap = lVar2.invoke(Long.valueOf(surfaceTexture3.getTimestamp() / ((long) 1000)));
                }
                C110505a.m150444a(aVar, j, invoke, bitmap);
            }
        }
    }
}
