package tw3;

import java.util.HashSet;
import java.util.Iterator;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import tw3.C118548a;
import uw3.C118626a;
import ww3.C118789a;

/* renamed from: tw3.e */
public class C118554e implements FlutterPlugin {

    /* renamed from: d */
    public C118626a f354815d;

    /* renamed from: e */
    public HashSet<C118548a> f354816e = new HashSet<>();

    /* renamed from: f */
    public final MethodChannel.MethodCallHandler f354817f = new C118555a();

    /* renamed from: tw3.e$a */
    public class C118555a implements MethodChannel.MethodCallHandler {
        public C118555a() {
        }

        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            HashSet hashSet = new HashSet();
            hashSet.addAll(C118554e.this.f354816e);
            String str = methodCall.method;
            if (!hashSet.isEmpty()) {
                Iterator it = hashSet.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    C118548a aVar = (C118548a) it.next();
                    if (!z) {
                        C118548a.C118549a a = aVar.mo181975a(methodCall);
                        boolean z2 = a.f354789a;
                        if (z2) {
                            C118789a.m167472c("WxaRouter.WxaRouterPlugin", "method call %s success ", str);
                            result.success(a.f354790b);
                            return;
                        }
                        z = z2;
                    } else {
                        C118789a.m167472c("WxaRouter.WxaRouterPlugin", "method call %s had been consumed", str);
                    }
                }
                if (!z) {
                    C118789a.m167472c("WxaRouter.WxaRouterPlugin", "method call %s had no ", str);
                    result.notImplemented();
                }
                hashSet.clear();
            }
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C118789a.m167472c("WxaRouter.WxaRouterPlugin", "onAttachedToEngine", new Object[0]);
        C118626a aVar = new C118626a(flutterPluginBinding.getBinaryMessenger(), "com.tencent.wxa/wxa_router");
        this.f354815d = aVar;
        aVar.f354973c = this.f354817f;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C118789a.m167472c("WxaRouter.WxaRouterPlugin", "onDetachedFromEngine", new Object[0]);
        C118626a aVar = this.f354815d;
        if (aVar != null) {
            aVar.f354973c = null;
        }
    }
}
