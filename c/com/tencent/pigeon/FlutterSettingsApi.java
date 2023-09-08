package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MessageCodec;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterSettingsApi {

    public interface FlutterSettingApi {
        String getDisplayUsername();

        String getDistrict();

        String getNickname();

        String getPatTail();

        Boolean getSendMsgInKeybaord();

        Long getSex();

        String getSignature();

        String getUsername();

        Boolean getVoicePlayMode();

        String getVoipRingtone();

        String getWeCoin();

        Boolean isInvoiceEnable();

        Boolean isLandscapeMode();

        Boolean isMultipleUser();

        Boolean isMyAddressEnable();

        Boolean isPatEnable();

        Boolean isWeCoinEnable();

        void resetChatRecord();

        void saveUserInfo();

        void sendMsgInKeyboard(Boolean bool);

        void setSex(Long l);

        void voicePlayMode(Boolean bool);
    }

    public static class FlutterSettingApiCodec extends StandardMessageCodec {
        public static final FlutterSettingApiCodec INSTANCE = new FlutterSettingApiCodec();

        private FlutterSettingApiCodec() {
        }
    }

    public static class FlutterSettingCallback {
        private final BinaryMessenger binaryMessenger;

        public interface Reply<T> {
            void reply(T t);
        }

        public FlutterSettingCallback(BinaryMessenger binaryMessenger2) {
            this.binaryMessenger = binaryMessenger2;
        }

        public static MessageCodec<Object> getCodec() {
            return FlutterSettingCallbackCodec.INSTANCE;
        }

        public void updateAvatar(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.FlutterSettingCallback.updateAvatar", getCodec()).send(null, new FlutterSettingsApi$FlutterSettingCallback$$b(reply));
        }

        public void updateWecoin(Reply<Void> reply) {
            new BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.FlutterSettingCallback.updateWecoin", getCodec()).send(null, new FlutterSettingsApi$FlutterSettingCallback$$a(reply));
        }
    }

    public static class FlutterSettingCallbackCodec extends StandardMessageCodec {
        public static final FlutterSettingCallbackCodec INSTANCE = new FlutterSettingCallbackCodec();

        private FlutterSettingCallbackCodec() {
        }
    }

    /* access modifiers changed from: private */
    public static Map<String, Object> wrapError(Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.MESSAGE, th.toString());
        hashMap.put("code", th.getClass().getSimpleName());
        hashMap.put("details", "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return hashMap;
    }
}
