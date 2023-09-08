package p1217u6;

import android.content.Context;
import java.util.LinkedList;
import java.util.Map;
import p1217u6.C118589a;
import p1217u6.C118600f;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: u6.c */
public class C118592c implements FlutterPlugin {

    /* renamed from: d */
    public MethodChannel f354886d;

    /* renamed from: e */
    public EventChannel f354887e;

    /* renamed from: f */
    public C118599e f354888f;

    /* renamed from: g */
    public C118603g f354889g;

    /* renamed from: h */
    public final C118593a f354890h = new C118593a();

    /* renamed from: i */
    public final C118595b f354891i = new C118595b();

    /* renamed from: j */
    public C118589a f354892j;

    /* renamed from: n */
    public Context f354893n;

    /* renamed from: u6.c$a */
    public class C118593a implements MethodChannel.MethodCallHandler {

        /* renamed from: u6.c$a$a */
        public class C118594a implements C118589a.C118590a {

            /* renamed from: a */
            public final /* synthetic */ MethodChannel.Result f354895a;

            public C118594a(C118593a aVar, MethodChannel.Result result) {
                this.f354895a = result;
            }

            /* renamed from: a */
            public void mo183344a(C118591b bVar) {
                this.f354895a.success(bVar.name());
            }
        }

        public C118593a() {
        }

        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            String str = methodCall.method;
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -2079769446:
                    if (str.equals("getOrientation")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934426579:
                    if (str.equals("resume")) {
                        c = 1;
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    Boolean bool = (Boolean) methodCall.argument("useSensor");
                    if (bool == null || !bool.booleanValue()) {
                        result.success(C118592c.this.f354888f.mo183346a().name());
                        return;
                    }
                    C118603g gVar = C118592c.this.f354889g;
                    ((LinkedList) gVar.f354917b).add(new C118594a(this, result));
                    if (gVar.f354918c == null) {
                        C118600f fVar = new C118600f(gVar.f354916a, gVar, C118600f.C118602b.fastest);
                        gVar.f354918c = fVar;
                        fVar.mo183342a();
                        return;
                    }
                    return;
                case 1:
                    C118589a aVar = C118592c.this.f354892j;
                    if (aVar != null) {
                        aVar.mo183342a();
                    }
                    result.success((Object) null);
                    return;
                case 2:
                    C118589a aVar2 = C118592c.this.f354892j;
                    if (aVar2 != null) {
                        aVar2.mo183343b();
                    }
                    result.success((Object) null);
                    return;
                default:
                    result.notImplemented();
                    return;
            }
        }
    }

    /* renamed from: u6.c$b */
    public class C118595b implements EventChannel.StreamHandler {

        /* renamed from: u6.c$b$a */
        public class C118596a implements C118589a.C118590a {

            /* renamed from: a */
            public final /* synthetic */ EventChannel.EventSink f354897a;

            public C118596a(C118595b bVar, EventChannel.EventSink eventSink) {
                this.f354897a = eventSink;
            }

            /* renamed from: a */
            public void mo183344a(C118591b bVar) {
                this.f354897a.success(bVar.name());
            }
        }

        public C118595b() {
        }

        public void onCancel(Object obj) {
            C118592c.this.f354892j.mo183343b();
            C118592c.this.f354892j = null;
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            Boolean bool;
            boolean z = false;
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (map.containsKey("useSensor") && (bool = (Boolean) map.get("useSensor")) != null && bool.booleanValue()) {
                    z = true;
                }
            }
            C118596a aVar = new C118596a(this, eventSink);
            if (z) {
                Log.m165288i("NDOP", "listening using sensor listener");
                C118592c cVar = C118592c.this;
                cVar.f354892j = new C118600f(cVar.f354893n, aVar, C118600f.C118602b.normal);
            } else {
                Log.m165288i("NDOP", "listening using window listener");
                C118592c cVar2 = C118592c.this;
                C118592c cVar3 = C118592c.this;
                cVar2.f354892j = new C118597d(cVar3.f354888f, cVar3.f354893n, aVar);
            }
            C118592c.this.f354892j.mo183342a();
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.github.rmtmckenzie/flutter_native_device_orientation/orientation");
        this.f354886d = methodChannel;
        methodChannel.setMethodCallHandler(this.f354890h);
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "com.github.rmtmckenzie/flutter_native_device_orientation/orientationevent");
        this.f354887e = eventChannel;
        eventChannel.setStreamHandler(this.f354891i);
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.f354893n = applicationContext;
        this.f354888f = new C118599e(applicationContext);
        this.f354889g = new C118603g(applicationContext);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f354886d.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f354887e.setStreamHandler((EventChannel.StreamHandler) null);
    }
}
