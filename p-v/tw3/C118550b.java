package tw3;

import p172io.flutter.embedding.engine.FlutterEngine;
import ww3.C118789a;

/* renamed from: tw3.b */
public class C118550b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f354791d;

    /* renamed from: e */
    public final /* synthetic */ FlutterEngine f354792e;

    public C118550b(C118552d dVar, int i, FlutterEngine flutterEngine) {
        this.f354791d = i;
        this.f354792e = flutterEngine;
    }

    public void run() {
        C118789a.m167472c("WxaRouter.WxaRouter", "destroy engine: %d", Integer.valueOf(this.f354791d));
        this.f354792e.destroy();
    }
}
