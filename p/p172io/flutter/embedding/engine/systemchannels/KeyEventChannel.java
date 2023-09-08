package p172io.flutter.embedding.engine.systemchannels;

import android.view.InputDevice;
import android.view.KeyEvent;
import com.eclipsesource.mmv8.Platform;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.scanner.JsApiScanCode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p172io.flutter.Log;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.JSONMessageCodec;

/* renamed from: io.flutter.embedding.engine.systemchannels.KeyEventChannel */
public class KeyEventChannel {
    private static final String TAG = "KeyEventChannel";
    public final BasicMessageChannel<Object> channel;

    /* renamed from: io.flutter.embedding.engine.systemchannels.KeyEventChannel$EventResponseHandler */
    public interface EventResponseHandler {
        void onFrameworkResponse(boolean z);
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.KeyEventChannel$FlutterKeyEvent */
    public static class FlutterKeyEvent {
        public final Character complexCharacter;
        public final KeyEvent event;

        public FlutterKeyEvent(KeyEvent keyEvent) {
            this(keyEvent, (Character) null);
        }

        public FlutterKeyEvent(KeyEvent keyEvent, Character ch) {
            this.event = keyEvent;
            this.complexCharacter = ch;
        }
    }

    public KeyEventChannel(BinaryMessenger binaryMessenger) {
        this.channel = new BasicMessageChannel<>(binaryMessenger, "flutter/keyevent", JSONMessageCodec.INSTANCE);
    }

    private static BasicMessageChannel.Reply<Object> createReplyHandler(EventResponseHandler eventResponseHandler) {
        return new KeyEventChannel$$a(eventResponseHandler);
    }

    private Map<String, Object> encodeKeyEvent(FlutterKeyEvent flutterKeyEvent, boolean z) {
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("type", z ? "keyup" : "keydown");
        hashMap.put("keymap", Platform.ANDROID);
        hashMap.put("flags", Integer.valueOf(flutterKeyEvent.event.getFlags()));
        int i2 = 0;
        hashMap.put("plainCodePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
        hashMap.put(JsApiScanCode.NAME, Integer.valueOf(flutterKeyEvent.event.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(flutterKeyEvent.event.getMetaState()));
        Character ch = flutterKeyEvent.complexCharacter;
        if (ch != null) {
            hashMap.put(FirebaseAnalytics.C113379b.CHARACTER, ch.toString());
        }
        hashMap.put(FirebaseAnalytics.C113379b.SOURCE, Integer.valueOf(flutterKeyEvent.event.getSource()));
        InputDevice device = InputDevice.getDevice(flutterKeyEvent.event.getDeviceId());
        if (device != null) {
            i2 = device.getVendorId();
            i = device.getProductId();
        } else {
            i = 0;
        }
        hashMap.put("vendorId", Integer.valueOf(i2));
        hashMap.put("productId", Integer.valueOf(i));
        hashMap.put("deviceId", Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$createReplyHandler$0(EventResponseHandler eventResponseHandler, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                Log.m165286e(TAG, "Unable to unpack JSON message: " + e);
            }
        }
        eventResponseHandler.onFrameworkResponse(z);
    }

    public void sendFlutterKeyEvent(FlutterKeyEvent flutterKeyEvent, boolean z, EventResponseHandler eventResponseHandler) {
        this.channel.send(encodeKeyEvent(flutterKeyEvent, z), createReplyHandler(eventResponseHandler));
    }
}
