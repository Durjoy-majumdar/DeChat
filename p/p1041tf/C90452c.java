package p1041tf;

import com.tencent.matrix.trace.view.C80550a;

/* renamed from: tf.c */
public class C90452c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f259971d;

    /* renamed from: e */
    public final /* synthetic */ C80550a f259972e;

    public C90452c(C80550a aVar, boolean z) {
        this.f259972e = aVar;
        this.f259971d = z;
    }

    public void run() {
        if (this.f259971d) {
            C80550a aVar = this.f259972e;
            if (aVar.f235627g) {
                C80550a.f235617o.post(new C90450a(aVar));
                return;
            }
            return;
        }
        C80550a aVar2 = this.f259972e;
        if (aVar2.f235627g) {
            C80550a.f235617o.post(new C90451b(aVar2));
        }
    }
}
