package tw3;

import p172io.flutter.embedding.engine.FlutterEngine;
import ww3.C118789a;

/* renamed from: tw3.c */
public class C118551c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f354793d;

    /* renamed from: e */
    public final /* synthetic */ FlutterEngine f354794e;

    public C118551c(C118552d dVar, int i, FlutterEngine flutterEngine) {
        this.f354793d = i;
        this.f354794e = flutterEngine;
    }

    public void run() {
        C118789a.m167472c("WxaRouter.WxaRouter", "destroy engine: %d", Integer.valueOf(this.f354793d));
        this.f354794e.destroy();
    }
}
