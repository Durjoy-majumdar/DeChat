package m10;

import m10.C117500g;
import p172io.flutter.plugin.common.EventChannel;

/* renamed from: m10.e */
public class C117498e implements EventChannel.StreamHandler {

    /* renamed from: d */
    public final /* synthetic */ C117500g.C117501a f351602d;

    public C117498e(C117500g.C117501a aVar) {
        this.f351602d = aVar;
    }

    public void onCancel(Object obj) {
        C117494d dVar = this.f351602d.f351609d;
        dVar.f351596a = null;
        dVar.mo182213a();
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        C117494d dVar = this.f351602d.f351609d;
        dVar.f351596a = eventSink;
        dVar.mo182213a();
    }
}
