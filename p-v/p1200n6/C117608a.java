package p1200n6;

import p1200n6.C117609b;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: n6.a */
public class C117608a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C117609b.C117610a f351828d;

    public C117608a(C117609b.C117610a aVar) {
        this.f351828d = aVar;
    }

    public void run() {
        MethodChannel methodChannel = C117609b.this.f351830e;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onCallback", (Object) null);
        }
    }
}
