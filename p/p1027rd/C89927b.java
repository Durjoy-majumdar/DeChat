package p1027rd;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.tencent.magicbrush.MBRuntime;
import fy3.C32226l;
import gy3.C87412m;
import java.util.HashMap;
import p1017od.f$$a;
import p1017od.f$$b;
import p416qd.C89598h;
import rx3.C13598b0;

/* renamed from: rd.b */
public final class C89927b implements C89926a {

    /* renamed from: a */
    public final MBRuntime f258410a;

    /* renamed from: b */
    public final String f258411b;

    /* renamed from: c */
    public final HashMap<Integer, b$$b> f258412c = new HashMap<>();

    public C89927b(MBRuntime mBRuntime, String str) {
        C87412m.m108594g(mBRuntime, "runtime");
        C87412m.m108594g(str, "type");
        this.f258410a = mBRuntime;
        this.f258411b = str;
    }

    /* renamed from: a */
    public void mo124241a(int i, int i2, int i3, Surface surface, C32226l<? super SurfaceTexture, C13598b0> lVar, C32226l<? super SurfaceTexture, C13598b0> lVar2) {
        C32226l<? super SurfaceTexture, C13598b0> lVar3 = lVar;
        C87412m.m108594g(lVar, "replaceCallback");
        if (i2 > 0 && i3 > 0 && !this.f258412c.containsKey(Integer.valueOf(i))) {
            this.f258412c.put(Integer.valueOf(i), new b$$b(i2, i3, surface, lVar, lVar2));
            MBRuntime mBRuntime = this.f258410a;
            String str = this.f258411b;
            if (mBRuntime.f235052a != 0) {
                mBRuntime.mo111515k(new f$$a(mBRuntime, i, str, i2, i3, surface));
            }
        }
    }

    /* renamed from: b */
    public void mo124242b(int i, SurfaceTexture surfaceTexture) {
        C87412m.m108594g(surfaceTexture, "surfaceTexture");
        b$$b b__b = this.f258412c.get(Integer.valueOf(i));
        if (b__b != null) {
            b__b.f258419d.invoke(surfaceTexture);
            surfaceTexture.setOnFrameAvailableListener(new b$$a(this, i, b__b));
        }
    }

    /* renamed from: c */
    public void mo124243c(int i) {
        C89598h.m112044a("MagicBrush", "surface texture unload id = " + i, new Object[0]);
        b$$b remove = this.f258412c.remove(Integer.valueOf(i));
        if (remove != null) {
            remove.f258419d.invoke(null);
        }
    }

    /* renamed from: d */
    public void mo124244d(int i) {
        if (this.f258412c.containsKey(Integer.valueOf(i))) {
            this.f258412c.remove(Integer.valueOf(i));
            MBRuntime mBRuntime = this.f258410a;
            String str = this.f258411b;
            if (mBRuntime.f235052a != 0) {
                mBRuntime.mo111515k(new f$$b(mBRuntime, i, str));
            }
        }
    }
}
