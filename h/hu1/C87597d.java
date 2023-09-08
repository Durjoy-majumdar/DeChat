package hu1;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.Constants;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: hu1.d */
public class C87597d implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: d */
    public MethodChannel f253681d;

    /* renamed from: e */
    public Context f253682e;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Log.m105925i("MicroMsg.Flutter.FlutterLvCppHandler", "onAttachedToEngine FlutterLvCppHandler CHANNEL%s", "com.tencent.mm.mmflutter.lvcppmethod");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.mmflutter.lvcppmethod");
        this.f253681d = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f253682e = flutterPluginBinding.getApplicationContext();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f253681d.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("getDisplayParams")) {
            JSONObject jSONObject = new JSONObject();
            try {
                DisplayMetrics displayMetrics = this.f253682e.getResources().getDisplayMetrics();
                Point h = C85875k4.m106184h(this.f253682e);
                jSONObject.put("screenWidth", h.x);
                jSONObject.put("screenHeight", h.y);
                jSONObject.put("densityDpi", displayMetrics.densityDpi);
                jSONObject.put(Constants.PARAM_DENSITY, (double) displayMetrics.density);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.Flutter.FlutterLvCppHandler", e, "", new Object[0]);
            }
            result.success(jSONObject.toString());
            return;
        }
        result.notImplemented();
    }
}
