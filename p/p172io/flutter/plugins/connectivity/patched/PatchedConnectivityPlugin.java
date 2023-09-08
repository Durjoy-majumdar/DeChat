package p172io.flutter.plugins.connectivity.patched;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.net.ConnectivityManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import wx3.C15601d;
import wx3.C66217g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, mo182094d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lrx3/b0;", "teardownChannels", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/EventChannel;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "La14/n0;", "coroutineScope", "La14/n0;", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "connectivity", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "<init>", "()V", "Companion", "SafeStreamHandler", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin */
public final class PatchedConnectivityPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final String TAG = "MicroMsg.PatchedConnectivityPlugin";
    /* access modifiers changed from: private */
    public PatchedConnectivity connectivity;
    private C0000n0 coroutineScope = C53930o0.m60554a(C66217g.f190253d);
    private EventChannel eventChannel;
    private MethodChannel methodChannel;

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityPlugin$Companion;", "", "()V", "TAG", "", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityPlugin$SafeStreamHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "Lrx3/b0;", "onListen", "onCancel", "impl", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "<init>", "(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$SafeStreamHandler */
    public static final class SafeStreamHandler implements EventChannel.StreamHandler {
        private final EventChannel.StreamHandler impl;

        public SafeStreamHandler(EventChannel.StreamHandler streamHandler) {
            C87412m.m108594g(streamHandler, "impl");
            this.impl = streamHandler;
        }

        public void onCancel(Object obj) {
            try {
                this.impl.onCancel(obj);
            } catch (Throwable th) {
                Log.printErrStackTrace(PatchedConnectivityPlugin.TAG, th, "onCancel() occurs an exception: " + th, new Object[0]);
            }
        }

        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            try {
                this.impl.onListen(obj, eventSink);
            } catch (Throwable th) {
                Log.printErrStackTrace(PatchedConnectivityPlugin.TAG, th, "onListen() occurs an exception: " + th, new Object[0]);
            }
        }
    }

    private final void teardownChannels() {
        MethodChannel methodChannel2 = this.methodChannel;
        if (methodChannel2 != null) {
            methodChannel2.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
        EventChannel eventChannel2 = this.eventChannel;
        if (eventChannel2 != null) {
            eventChannel2.setStreamHandler((EventChannel.StreamHandler) null);
        }
        this.methodChannel = null;
        this.eventChannel = null;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        Object systemService = flutterPluginBinding.getApplicationContext().getSystemService("connectivity");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivity = new PatchedConnectivity((ConnectivityManager) systemService);
        this.coroutineScope = C53930o0.m60555b();
        MethodChannel methodChannel2 = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/connectivity");
        methodChannel2.setMethodCallHandler(this);
        this.methodChannel = methodChannel2;
        EventChannel eventChannel2 = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/connectivity_status");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        C87412m.m108593f(applicationContext, "binding.applicationContext");
        PatchedConnectivity patchedConnectivity = this.connectivity;
        C87412m.m108591d(patchedConnectivity);
        eventChannel2.setStreamHandler(new SafeStreamHandler(new PatchedConnectivityBroadcastReceiver(applicationContext, patchedConnectivity, this.coroutineScope)));
        this.eventChannel = eventChannel2;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C53930o0.m60558e(this.coroutineScope, (CancellationException) null, 1, (Object) null);
        teardownChannels();
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C87412m.m108594g(methodCall, "call");
        C87412m.m108594g(result, "result");
        C0000n0 n0Var = this.coroutineScope;
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(n0Var, C58901s.f168555a.mo74590i0(), (C53934p0) null, new PatchedConnectivityPlugin$onMethodCall$1(methodCall, result, this, (C15601d<? super PatchedConnectivityPlugin$onMethodCall$1>) null), 2, (Object) null);
    }
}
