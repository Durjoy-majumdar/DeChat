package nx3;

import android.app.Activity;
import android.provider.Settings;
import android.view.WindowManager;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: nx3.a */
public class C89101a implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f256762d;

    /* renamed from: e */
    public Activity f256763e;

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f256763e = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "github.com/clovisnicolas/flutter_screen");
        this.f256762d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromActivity() {
        this.f256763e = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f256763e = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.f256762d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (this.f256763e != null) {
            String str = methodCall.method;
            str.getClass();
            char c = 65535;
            boolean z = true;
            switch (str.hashCode()) {
                case -1135253436:
                    if (str.equals("keepOn")) {
                        c = 0;
                        break;
                    }
                    break;
                case -460887769:
                    if (str.equals("isKeptOn")) {
                        c = 1;
                        break;
                    }
                    break;
                case 648162385:
                    if (str.equals("brightness")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1124545107:
                    if (str.equals("setBrightness")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (((Boolean) methodCall.argument("on")).booleanValue()) {
                        System.out.println("Keeping screen on ");
                        this.f256763e.getWindow().addFlags(128);
                    } else {
                        System.out.println("Not keeping screen on");
                        this.f256763e.getWindow().clearFlags(128);
                    }
                    result.success((Object) null);
                    return;
                case 1:
                    if ((this.f256763e.getWindow().getAttributes().flags & 128) == 0) {
                        z = false;
                    }
                    result.success(Boolean.valueOf(z));
                    return;
                case 2:
                    Activity activity = this.f256763e;
                    float f = 0.0f;
                    if (activity != null) {
                        float f2 = activity.getWindow().getAttributes().screenBrightness;
                        if (f2 < 0.0f) {
                            try {
                                f2 = ((float) Settings.System.getInt(this.f256763e.getContentResolver(), "screen_brightness")) / 255.0f;
                            } catch (Settings.SettingNotFoundException unused) {
                                f = 1.0f;
                            }
                        }
                        f = f2;
                    }
                    result.success(Float.valueOf(f));
                    return;
                case 3:
                    double doubleValue = ((Double) methodCall.argument("brightness")).doubleValue();
                    WindowManager.LayoutParams attributes = this.f256763e.getWindow().getAttributes();
                    attributes.screenBrightness = (float) doubleValue;
                    this.f256763e.getWindow().setAttributes(attributes);
                    result.success((Object) null);
                    return;
                default:
                    result.notImplemented();
                    return;
            }
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.f256763e = activityPluginBinding.getActivity();
    }
}
