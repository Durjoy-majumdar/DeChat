package p172io.flutter.embedding.engine.systemchannels;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterJNI;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.StandardMessageCodec;
import p172io.flutter.view.AccessibilityBridge;

/* renamed from: io.flutter.embedding.engine.systemchannels.AccessibilityChannel */
public class AccessibilityChannel {
    private static final String TAG = "AccessibilityChannel";
    public final BasicMessageChannel<Object> channel;
    public final FlutterJNI flutterJNI;
    /* access modifiers changed from: private */
    public AccessibilityMessageHandler handler;
    private final BasicMessageChannel.MessageHandler<Object> parsingMessageHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.AccessibilityChannel$AccessibilityMessageHandler */
    public interface AccessibilityMessageHandler extends FlutterJNI.AccessibilityDelegate {
        void announce(String str);

        void onLongPress(int i);

        void onTap(int i);

        void onTooltip(String str);
    }

    public AccessibilityChannel(DartExecutor dartExecutor, FlutterJNI flutterJNI2) {
        C1172421 r0 = new BasicMessageChannel.MessageHandler<Object>() {
            public void onMessage(Object obj, BasicMessageChannel.Reply<Object> reply) {
                if (AccessibilityChannel.this.handler != null) {
                    HashMap hashMap = (HashMap) obj;
                    String str = (String) hashMap.get("type");
                    HashMap hashMap2 = (HashMap) hashMap.get("data");
                    Log.m165290v(AccessibilityChannel.TAG, "Received " + str + " message.");
                    str.getClass();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1140076541:
                            if (str.equals("tooltip")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -649620375:
                            if (str.equals("announce")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 114595:
                            if (str.equals("tap")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 114203431:
                            if (str.equals("longPress")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            String str2 = (String) hashMap2.get(StateEvent.Name.MESSAGE);
                            if (str2 != null) {
                                AccessibilityChannel.this.handler.onTooltip(str2);
                                break;
                            }
                            break;
                        case 1:
                            String str3 = (String) hashMap2.get(StateEvent.Name.MESSAGE);
                            if (str3 != null) {
                                AccessibilityChannel.this.handler.announce(str3);
                                break;
                            }
                            break;
                        case 2:
                            Integer num = (Integer) hashMap.get("nodeId");
                            if (num != null) {
                                AccessibilityChannel.this.handler.onTap(num.intValue());
                                break;
                            }
                            break;
                        case 3:
                            Integer num2 = (Integer) hashMap.get("nodeId");
                            if (num2 != null) {
                                AccessibilityChannel.this.handler.onLongPress(num2.intValue());
                                break;
                            }
                            break;
                    }
                    reply.reply(null);
                }
            }
        };
        this.parsingMessageHandler = r0;
        BasicMessageChannel<Object> basicMessageChannel = new BasicMessageChannel<>(dartExecutor, "flutter/accessibility", StandardMessageCodec.INSTANCE);
        this.channel = basicMessageChannel;
        basicMessageChannel.setMessageHandler(r0);
        this.flutterJNI = flutterJNI2;
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action) {
        this.flutterJNI.dispatchSemanticsAction(i, action);
    }

    public void onAndroidAccessibilityDisabled() {
        this.flutterJNI.setSemanticsEnabled(false);
    }

    public void onAndroidAccessibilityEnabled() {
        this.flutterJNI.setSemanticsEnabled(true);
    }

    public void setAccessibilityFeatures(int i) {
        this.flutterJNI.setAccessibilityFeatures(i);
    }

    public void setAccessibilityMessageHandler(AccessibilityMessageHandler accessibilityMessageHandler) {
        this.handler = accessibilityMessageHandler;
        this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
    }

    public void dispatchSemanticsAction(int i, AccessibilityBridge.Action action, Object obj) {
        this.flutterJNI.dispatchSemanticsAction(i, action, obj);
    }
}
