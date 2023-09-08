package uw3;

import java.util.concurrent.LinkedBlockingQueue;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import ww3.C118789a;

/* renamed from: uw3.a */
public class C118626a {

    /* renamed from: a */
    public boolean f354971a = true;

    /* renamed from: b */
    public MethodChannel f354972b;

    /* renamed from: c */
    public MethodChannel.MethodCallHandler f354973c;

    /* renamed from: d */
    public LinkedBlockingQueue<C118629b> f354974d = new LinkedBlockingQueue<>();

    /* renamed from: e */
    public MethodChannel.MethodCallHandler f354975e = new C118627a();

    /* renamed from: uw3.a$a */
    public class C118627a implements MethodChannel.MethodCallHandler {
        public C118627a() {
        }

        public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
            String str = methodCall.method;
            str.getClass();
            if (!str.equals("onDartChannelReady")) {
                MethodChannel.MethodCallHandler methodCallHandler = C118626a.this.f354973c;
                if (methodCallHandler != null) {
                    methodCallHandler.onMethodCall(methodCall, result);
                    return;
                }
                return;
            }
            C118789a.m167470a("WxaRouter.SafeMethodChannel", "onMethodCall onDartChannelReady", new Object[0]);
            C118626a aVar = C118626a.this;
            if (!aVar.f354971a) {
                aVar.mo183360b();
            }
        }
    }

    /* renamed from: uw3.a$b */
    public class C118628b implements MethodChannel.Result {
        public C118628b() {
        }

        public void error(String str, String str2, Object obj) {
            C118789a.m167472c("WxaRouter.SafeMethodChannel", "invokeMethod error %s", str);
        }

        public void notImplemented() {
            C118789a.m167472c("WxaRouter.SafeMethodChannel", "invokeMethod notImplemented", new Object[0]);
        }

        public void success(Object obj) {
            C118626a aVar = C118626a.this;
            if (!aVar.f354971a) {
                aVar.mo183360b();
            }
        }
    }

    public C118626a(BinaryMessenger binaryMessenger, String str) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, str);
        this.f354972b = methodChannel;
        methodChannel.setMethodCallHandler(this.f354975e);
        this.f354972b.invokeMethod("onCheckDartChannelReady", (Object) null, new C118628b());
    }

    /* renamed from: a */
    public void mo183359a(String str, Object obj, MethodChannel.Result result) {
        if (this.f354971a) {
            this.f354972b.invokeMethod(str, obj, result);
            C118789a.m167470a("WxaRouter.SafeMethodChannel", "invokeMethod invoke method %s", str);
            return;
        }
        this.f354974d.offer(new C118629b(str, obj, result));
        C118789a.m167470a("WxaRouter.SafeMethodChannel", "invokeMethod add invoke method %s", str);
    }

    /* renamed from: b */
    public void mo183360b() {
        this.f354971a = true;
        while (!this.f354974d.isEmpty()) {
            C118629b poll = this.f354974d.poll();
            if (poll != null) {
                this.f354972b.invokeMethod(poll.f354978a, poll.f354979b, poll.f354980c);
                C118789a.m167470a("WxaRouter.SafeMethodChannel", "notifyChannelReady doing invoke method %s", poll.f354978a);
            }
        }
    }
}
