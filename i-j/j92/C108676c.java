package j92;

import android.graphics.Bitmap;
import l92.C109296d;

/* renamed from: j92.c */
public final class C108676c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108669a f325452d;

    /* renamed from: e */
    public final /* synthetic */ C109296d f325453e;

    /* renamed from: f */
    public final /* synthetic */ Bitmap f325454f;

    /* renamed from: g */
    public final /* synthetic */ int f325455g;

    public C108676c(C108669a aVar, C109296d dVar, Bitmap bitmap, int i) {
        this.f325452d = aVar;
        this.f325453e = dVar;
        this.f325454f = bitmap;
        this.f325455g = i;
    }

    public final void run() {
        this.f325452d.mo159685e();
        C109296d dVar = this.f325453e;
        if (dVar != null) {
            dVar.mo90716a(this.f325454f, false, this.f325455g);
        }
    }
}
