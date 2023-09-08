package tf0;

import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.pigeon.C19928d;
import com.tencent.pigeon.FlutterMMKVPigeon;
import gy3.C87412m;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;

/* renamed from: tf0.j1 */
public final class C22540j1 implements FlutterMMKVPigeon.FlutterMMKVHost, FlutterPlugin {
    public FlutterMMKVPigeon.FlutterBoolResponse getBool(FlutterMMKVPigeon.FlutterBoolRequest flutterBoolRequest) {
        C87412m.m108594g(flutterBoolRequest, "request");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(flutterBoolRequest.getName());
        String key = flutterBoolRequest.getKey();
        Boolean value = flutterBoolRequest.getValue();
        C87412m.m108593f(value, "request.value");
        FlutterMMKVPigeon.FlutterBoolResponse build = new FlutterMMKVPigeon.FlutterBoolResponse.Builder().setValue(Boolean.valueOf(mmkv.getBoolean(key, value.booleanValue()))).build();
        C87412m.m108593f(build, "Builder().setValue(value).build()");
        return build;
    }

    public FlutterMMKVPigeon.FlutterIntResponse getInt(FlutterMMKVPigeon.FlutterIntRequest flutterIntRequest) {
        C87412m.m108594g(flutterIntRequest, "request");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(flutterIntRequest.getName());
        String key = flutterIntRequest.getKey();
        Long value = flutterIntRequest.getValue();
        C87412m.m108593f(value, "request.value");
        FlutterMMKVPigeon.FlutterIntResponse build = new FlutterMMKVPigeon.FlutterIntResponse.Builder().setValue(Long.valueOf(mmkv.getLong(key, value.longValue()))).build();
        C87412m.m108593f(build, "Builder().setValue(value).build()");
        return build;
    }

    public FlutterMMKVPigeon.FlutterStringResponse getString(FlutterMMKVPigeon.FlutterStringRequest flutterStringRequest) {
        C87412m.m108594g(flutterStringRequest, "request");
        String string = MultiProcessMMKV.getMMKV(flutterStringRequest.getName()).getString(flutterStringRequest.getKey(), flutterStringRequest.getValue());
        if (string == null) {
            string = flutterStringRequest.getValue();
        }
        C87412m.m108593f(string, "MultiProcessMMKV.getMMKV…t.value) ?: request.value");
        FlutterMMKVPigeon.FlutterStringResponse build = new FlutterMMKVPigeon.FlutterStringResponse.Builder().setValue(string).build();
        C87412m.m108593f(build, "Builder().setValue(value).build()");
        return build;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C19928d.m21725h(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        C19928d.m21725h(flutterPluginBinding.getBinaryMessenger(), (FlutterMMKVPigeon.FlutterMMKVHost) null);
    }

    public void putBool(FlutterMMKVPigeon.FlutterBoolRequest flutterBoolRequest) {
        C87412m.m108594g(flutterBoolRequest, "request");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(flutterBoolRequest.getName());
        String key = flutterBoolRequest.getKey();
        Boolean value = flutterBoolRequest.getValue();
        C87412m.m108593f(value, "value");
        mmkv.putBoolean(key, value.booleanValue());
    }

    public void putInt(FlutterMMKVPigeon.FlutterIntRequest flutterIntRequest) {
        C87412m.m108594g(flutterIntRequest, "request");
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(flutterIntRequest.getName());
        String key = flutterIntRequest.getKey();
        Long value = flutterIntRequest.getValue();
        C87412m.m108593f(value, "value");
        mmkv.putLong(key, value.longValue());
    }

    public void putString(FlutterMMKVPigeon.FlutterStringRequest flutterStringRequest) {
        C87412m.m108594g(flutterStringRequest, "request");
        MultiProcessMMKV.getMMKV(flutterStringRequest.getName()).putString(flutterStringRequest.getKey(), flutterStringRequest.getValue());
    }
}
