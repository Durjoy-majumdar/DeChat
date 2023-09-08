package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterHostAssetPigeon {

    public interface FlutterHostAssetHost {
        byte[] load(String str);

        String loadString(String str, Boolean bool);
    }

    public static class FlutterHostAssetHostCodec extends StandardMessageCodec {
        public static final FlutterHostAssetHostCodec INSTANCE = new FlutterHostAssetHostCodec();

        private FlutterHostAssetHostCodec() {
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
