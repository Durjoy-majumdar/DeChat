package p1106e5;

import android.graphics.Bitmap;
import android.os.Build;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Set;
import p864t5.C110902a;
import p864t5.C110908h;
import tx3.C26317d;
import tx3.C26327h;

/* renamed from: e5.f */
public final class C107233f implements C107228a {

    /* renamed from: j */
    public static final Set<Bitmap.Config> f320842j;

    /* renamed from: a */
    public final int f320843a;

    /* renamed from: b */
    public final Set<Bitmap.Config> f320844b;

    /* renamed from: c */
    public final C107229b f320845c;

    /* renamed from: d */
    public final HashSet<Bitmap> f320846d;

    /* renamed from: e */
    public int f320847e;

    /* renamed from: f */
    public int f320848f;

    /* renamed from: g */
    public int f320849g;

    /* renamed from: h */
    public int f320850h;

    /* renamed from: i */
    public int f320851i;

    static {
        C26327h hVar = new C26327h();
        hVar.add(Bitmap.Config.ALPHA_8);
        hVar.add(Bitmap.Config.RGB_565);
        hVar.add(Bitmap.Config.ARGB_4444);
        hVar.add(Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            hVar.add(Bitmap.Config.RGBA_F16);
        }
        C26317d<E, ?> dVar = hVar.f73348d;
        dVar.mo53242c();
        dVar.f73339r = true;
        f320842j = hVar;
    }

    public C107233f(int i, Set<Bitmap.Config> set, C107229b bVar, C110908h hVar, int i2, C8480h hVar2) {
        set = (i2 & 2) != 0 ? f320842j : set;
        bVar = (i2 & 4) != 0 ? new C107235h() : bVar;
        C87412m.m108594g(set, "allowedConfigs");
        C87412m.m108594g(bVar, "strategy");
        this.f320843a = i;
        this.f320844b = set;
        this.f320845c = bVar;
        this.f320846d = new HashSet<>();
        if (!(i >= 0)) {
            throw new IllegalArgumentException("maxSize must be >= 0.".toString());
        }
    }

    /* renamed from: a */
    public synchronized void mo157692a(int i) {
        if (i >= 40) {
            mo157706g(-1);
        } else {
            boolean z = false;
            if (10 <= i && i < 20) {
                z = true;
            }
            if (z) {
                mo157706g(this.f320847e / 2);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo157693b(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        if (!bitmap.isRecycled()) {
            int a = C110902a.m151198a(bitmap);
            if (bitmap.isMutable() && a <= this.f320843a) {
                if (this.f320844b.contains(bitmap.getConfig())) {
                    if (!this.f320846d.contains(bitmap)) {
                        this.f320845c.mo157697b(bitmap);
                        this.f320846d.add(bitmap);
                        this.f320847e += a;
                        this.f320850h++;
                        mo157706g(this.f320843a);
                        return;
                    }
                    return;
                }
            }
            bitmap.recycle();
        }
    }

    /* renamed from: c */
    public Bitmap mo157694c(int i, int i2, Bitmap.Config config) {
        C87412m.m108594g(config, "config");
        Bitmap e = mo157704e(i, i2, config);
        if (e == null) {
            e = null;
        } else {
            e.eraseColor(0);
        }
        if (e != null) {
            return e;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C87412m.m108593f(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    /* renamed from: d */
    public Bitmap mo157695d(int i, int i2, Bitmap.Config config) {
        C87412m.m108594g(config, "config");
        Bitmap e = mo157704e(i, i2, config);
        if (e != null) {
            return e;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        C87412m.m108593f(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    /* renamed from: e */
    public synchronized Bitmap mo157704e(int i, int i2, Bitmap.Config config) {
        Bitmap c;
        C87412m.m108594g(config, "config");
        if (!C110902a.m151200c(config)) {
            c = this.f320845c.mo157698c(i, i2, config);
            if (c == null) {
                this.f320849g++;
            } else {
                this.f320846d.remove(c);
                this.f320847e -= C110902a.m151198a(c);
                this.f320848f++;
                c.setDensity(0);
                c.setHasAlpha(true);
                c.setPremultiplied(true);
            }
        } else {
            throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        return c;
    }

    /* renamed from: f */
    public final String mo157705f() {
        return "Hits=" + this.f320848f + ", misses=" + this.f320849g + ", puts=" + this.f320850h + ", evictions=" + this.f320851i + ", currentSize=" + this.f320847e + ", maxSize=" + this.f320843a + ", strategy=" + this.f320845c;
    }

    /* renamed from: g */
    public final synchronized void mo157706g(int i) {
        while (this.f320847e > i) {
            Bitmap removeLast = this.f320845c.removeLast();
            if (removeLast == null) {
                this.f320847e = 0;
                return;
            }
            this.f320846d.remove(removeLast);
            this.f320847e -= C110902a.m151198a(removeLast);
            this.f320851i++;
            removeLast.recycle();
        }
    }
}
