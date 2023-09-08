package p292ad;

import android.graphics.Bitmap;
import p1066yc.C91414k;

/* renamed from: ad.f */
public class C79506f implements C91414k {

    /* renamed from: a */
    public final /* synthetic */ Runnable f233141a;

    /* renamed from: b */
    public final /* synthetic */ C79502b f233142b;

    public C79506f(C79502b bVar, Runnable runnable) {
        this.f233142b = bVar;
        this.f233141a = runnable;
    }

    /* renamed from: a */
    public void mo109546a(Bitmap bitmap) {
        this.f233142b.f233095V = bitmap;
        this.f233141a.run();
    }
}
