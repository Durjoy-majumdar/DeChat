package p172io.flutter.plugins.connectivity.patched;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p172io.flutter.plugin.common.EventChannel;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001dB\u001f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo182094d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Lrx3/b0;", "sendEvent", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "onListen", "onCancel", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "Landroid/content/Context;", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "connectivity", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "La14/n0;", "coroutineScope", "La14/n0;", "Lio/flutter/plugin/common/EventChannel$EventSink;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "(Landroid/content/Context;Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;La14/n0;)V", "Companion", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver */
public final class PatchedConnectivityBroadcastReceiver extends BroadcastReceiver implements EventChannel.StreamHandler {
    public static final String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final Companion Companion = new Companion((C8480h) null);
    /* access modifiers changed from: private */
    public final PatchedConnectivity connectivity;
    private final Context context;
    private final C0000n0 coroutineScope;
    /* access modifiers changed from: private */
    public EventChannel.EventSink events;
    private final ConnectivityManager.NetworkCallback networkCallback = new PatchedConnectivityBroadcastReceiver$networkCallback$1(this);

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityBroadcastReceiver$Companion;", "", "()V", "CONNECTIVITY_ACTION", "", "flutter-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public PatchedConnectivityBroadcastReceiver(Context context2, PatchedConnectivity patchedConnectivity, C0000n0 n0Var) {
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(patchedConnectivity, "connectivity");
        C87412m.m108594g(n0Var, "coroutineScope");
        this.context = context2;
        this.connectivity = patchedConnectivity;
        this.coroutineScope = n0Var;
    }

    /* access modifiers changed from: private */
    public final void sendEvent() {
        C53895h.m60466d(this.coroutineScope, (C66212f) null, (C53934p0) null, new PatchedConnectivityBroadcastReceiver$sendEvent$1(this, (C15601d<? super PatchedConnectivityBroadcastReceiver$sendEvent$1>) null), 3, (Object) null);
    }

    public void onCancel(Object obj) {
        C87412m.m108594g(obj, "arguments");
        if (Build.VERSION.SDK_INT >= 24) {
            this.connectivity.getConnectivityManager().unregisterNetworkCallback(this.networkCallback);
        } else {
            this.context.unregisterReceiver(this);
        }
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        C87412m.m108594g(obj, "arguments");
        C87412m.m108594g(eventSink, "events");
        this.events = eventSink;
        if (Build.VERSION.SDK_INT >= 24) {
            this.connectivity.getConnectivityManager().registerDefaultNetworkCallback(this.networkCallback);
        } else {
            this.context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public void onReceive(Context context2, Intent intent) {
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(intent, "intent");
        sendEvent();
    }
}
