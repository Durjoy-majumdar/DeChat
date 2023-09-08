package p172io.flutter.embedding.engine.systemchannels;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.JSONMethodCodec;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: io.flutter.embedding.engine.systemchannels.LocalizationChannel */
public class LocalizationChannel {
    private static final String TAG = "LocalizationChannel";
    public final MethodChannel channel;
    public final MethodChannel.MethodCallHandler handler;
    /* access modifiers changed from: private */
    public LocalizationMessageHandler localizationMessageHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.LocalizationChannel$LocalizationMessageHandler */
    public interface LocalizationMessageHandler {
        String getStringResource(String str, String str2);
    }

    public LocalizationChannel(DartExecutor dartExecutor) {
        C1084721 r0 = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (LocalizationChannel.this.localizationMessageHandler != null) {
                    String str = methodCall.method;
                    str.getClass();
                    if (!str.equals("Localization.getStringResource")) {
                        result.notImplemented();
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) methodCall.arguments();
                    try {
                        result.success(LocalizationChannel.this.localizationMessageHandler.getStringResource(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                    } catch (JSONException e) {
                        result.error("error", e.getMessage(), (Object) null);
                    }
                }
            }
        };
        this.handler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    public void sendLocales(List<Locale> list) {
        Log.m165290v(TAG, "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale next : list) {
            Log.m165290v(TAG, "Locale (Language: " + next.getLanguage() + ", Country: " + next.getCountry() + ", Variant: " + next.getVariant() + ")");
            arrayList.add(next.getLanguage());
            arrayList.add(next.getCountry());
            arrayList.add(next.getScript());
            arrayList.add(next.getVariant());
        }
        this.channel.invokeMethod("setLocale", arrayList);
    }

    public void setLocalizationMessageHandler(LocalizationMessageHandler localizationMessageHandler2) {
        this.localizationMessageHandler = localizationMessageHandler2;
    }
}
