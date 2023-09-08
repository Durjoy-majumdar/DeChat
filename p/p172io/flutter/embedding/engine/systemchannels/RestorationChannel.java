package p172io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import java.util.Map;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.common.StandardMethodCodec;

/* renamed from: io.flutter.embedding.engine.systemchannels.RestorationChannel */
public class RestorationChannel {
    private static final String TAG = "RestorationChannel";
    private MethodChannel channel;
    /* access modifiers changed from: private */
    public boolean engineHasProvidedData;
    /* access modifiers changed from: private */
    public boolean frameworkHasRequestedData;
    private final MethodChannel.MethodCallHandler handler;
    /* access modifiers changed from: private */
    public MethodChannel.Result pendingFrameworkRestorationChannelRequest;
    /* access modifiers changed from: private */
    public byte[] restorationData;
    public final boolean waitForRestorationData;

    public RestorationChannel(DartExecutor dartExecutor, boolean z) {
        this(new MethodChannel(dartExecutor, "flutter/restoration", StandardMethodCodec.INSTANCE), z);
    }

    /* access modifiers changed from: private */
    public Map<String, Object> packageData(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void clearData() {
        this.restorationData = null;
    }

    public byte[] getRestorationData() {
        return this.restorationData;
    }

    public void setRestorationData(final byte[] bArr) {
        this.engineHasProvidedData = true;
        MethodChannel.Result result = this.pendingFrameworkRestorationChannelRequest;
        if (result != null) {
            result.success(packageData(bArr));
            this.pendingFrameworkRestorationChannelRequest = null;
            this.restorationData = bArr;
        } else if (this.frameworkHasRequestedData) {
            this.channel.invokeMethod("push", packageData(bArr), new MethodChannel.Result() {
                public void error(String str, String str2, Object obj) {
                    Log.m165286e(RestorationChannel.TAG, "Error " + str + " while sending restoration data to framework: " + str2);
                }

                public void notImplemented() {
                }

                public void success(Object obj) {
                    byte[] unused = RestorationChannel.this.restorationData = bArr;
                }
            });
        } else {
            this.restorationData = bArr;
        }
    }

    public RestorationChannel(MethodChannel methodChannel, boolean z) {
        this.engineHasProvidedData = false;
        this.frameworkHasRequestedData = false;
        C1172472 r0 = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                str.getClass();
                if (str.equals("get")) {
                    boolean unused = RestorationChannel.this.frameworkHasRequestedData = true;
                    if (!RestorationChannel.this.engineHasProvidedData) {
                        RestorationChannel restorationChannel = RestorationChannel.this;
                        if (restorationChannel.waitForRestorationData) {
                            MethodChannel.Result unused2 = restorationChannel.pendingFrameworkRestorationChannelRequest = result;
                            return;
                        }
                    }
                    RestorationChannel restorationChannel2 = RestorationChannel.this;
                    result.success(restorationChannel2.packageData(restorationChannel2.restorationData));
                } else if (!str.equals("put")) {
                    result.notImplemented();
                } else {
                    byte[] unused3 = RestorationChannel.this.restorationData = (byte[]) obj;
                    result.success((Object) null);
                }
            }
        };
        this.handler = r0;
        this.channel = methodChannel;
        this.waitForRestorationData = z;
        methodChannel.setMethodCallHandler(r0);
    }
}
