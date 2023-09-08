package p172io.flutter.embedding.engine.systemchannels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.FlutterInjector;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.common.StandardMethodCodec;

/* renamed from: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel */
public class DeferredComponentChannel {
    private static final String TAG = "DeferredComponentChannel";
    private final MethodChannel channel;
    /* access modifiers changed from: private */
    public Map<String, List<MethodChannel.Result>> componentNameToResults = new HashMap();
    /* access modifiers changed from: private */
    public DeferredComponentManager deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
    public final MethodChannel.MethodCallHandler parsingMethodHandler;

    public DeferredComponentChannel(DartExecutor dartExecutor) {
        C1172431 r0 = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (DeferredComponentChannel.this.deferredComponentManager != null) {
                    String str = methodCall.method;
                    Map map = (Map) methodCall.arguments();
                    Log.m165290v(DeferredComponentChannel.TAG, "Received '" + str + "' message.");
                    int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                    String str2 = (String) map.get("componentName");
                    str.getClass();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1004447972:
                            if (str.equals("uninstallDeferredComponent")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 399701758:
                            if (str.equals("getDeferredComponentInstallState")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 520962947:
                            if (str.equals("installDeferredComponent")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(intValue, str2);
                            result.success((Object) null);
                            return;
                        case 1:
                            result.success(DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(intValue, str2));
                            return;
                        case 2:
                            DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(intValue, str2);
                            if (!DeferredComponentChannel.this.componentNameToResults.containsKey(str2)) {
                                DeferredComponentChannel.this.componentNameToResults.put(str2, new ArrayList());
                            }
                            ((List) DeferredComponentChannel.this.componentNameToResults.get(str2)).add(result);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                }
            }
        };
        this.parsingMethodHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/deferredcomponent", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    public void completeInstallError(String str, String str2) {
        if (this.componentNameToResults.containsKey(str)) {
            for (MethodChannel.Result error : this.componentNameToResults.get(str)) {
                error.error("DeferredComponent Install failure", str2, (Object) null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void completeInstallSuccess(String str) {
        if (this.componentNameToResults.containsKey(str)) {
            for (MethodChannel.Result success : this.componentNameToResults.get(str)) {
                success.success((Object) null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager2) {
        this.deferredComponentManager = deferredComponentManager2;
    }
}
