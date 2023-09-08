package p1041tf;

import com.tencent.matrix.trace.view.C80550a;

/* renamed from: tf.b */
public class C90451b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80550a f259970d;

    public C90451b(C80550a aVar) {
        this.f259970d = aVar;
    }

    public void run() {
        C80550a aVar = this.f259970d;
        if (aVar.f235623c) {
            aVar.f235623c = false;
            aVar.f235621a.removeView(aVar.f235624d);
        }
    }
}
