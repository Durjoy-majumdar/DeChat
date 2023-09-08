package com.tencent.pigeon;

import android.util.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.HashMap;
import java.util.Map;
import p172io.flutter.plugin.common.StandardMessageCodec;

public class FlutterViewDemoPigeon {

    public static class FlutterViewDemoHostCodec extends StandardMessageCodec {
        public static final FlutterViewDemoHostCodec INSTANCE = new FlutterViewDemoHostCodec();

        private FlutterViewDemoHostCodec() {
        }
    }

    public interface FlutterViewDemoHost {
        void switchToActivity();

        void switchToView();
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
