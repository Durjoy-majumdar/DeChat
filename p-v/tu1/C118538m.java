package tu1;

import p172io.flutter.plugin.common.EventChannel;
import tu1.C118534l;

/* renamed from: tu1.m */
public class C118538m implements EventChannel.StreamHandler {

    /* renamed from: d */
    public final /* synthetic */ C118534l.C118536b f354750d;

    public C118538m(C118534l.C118536b bVar) {
        this.f354750d = bVar;
    }

    public void onCancel(Object obj) {
        C118542q qVar = this.f354750d.f354744e;
        qVar.f354752a = null;
        qVar.mo183258a();
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        C118542q qVar = this.f354750d.f354744e;
        qVar.f354752a = eventSink;
        qVar.mo183258a();
    }
}
