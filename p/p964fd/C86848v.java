package p964fd;

import android.graphics.Bitmap;
import p1066yc.C91414k;

/* renamed from: fd.v */
public class C86848v implements C91414k {

    /* renamed from: a */
    public final /* synthetic */ Runnable f252110a;

    /* renamed from: b */
    public final /* synthetic */ C86826e f252111b;

    public C86848v(C86826e eVar, Runnable runnable) {
        this.f252111b = eVar;
        this.f252110a = runnable;
    }

    /* renamed from: a */
    public void mo109546a(Bitmap bitmap) {
        this.f252111b.f252043n1 = bitmap;
        this.f252110a.run();
    }
}
