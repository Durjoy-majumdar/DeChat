package com.tencent.youtu.sdkkitframework.framework;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.widget.RelativeLayout;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.net.YtSDKKitNetHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class YtSDKKitFramework {
    private static final String TAG = "YtSDKKitFramework";
    private static YtSDKKitFramework instance = null;
    private static final String version = "1.0.8.84.1-wx";
    private Rect detectRect = new Rect(10, 110, 470, 530);
    private IYtSDKKitFrameworkEventListener eventListener;
    private int networkRequestTimeoutMS = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
    private Rect previewRect = new Rect(0, 0, 480, 640);

    public interface IYTBaseFunctionListener {
        String base64Encode(byte[] bArr, int i);

        byte[] getVoiceData();
    }

    public interface IYtSDKKitFrameworkEventListener {
        void onFrameworkEvent(HashMap<String, Object> hashMap);

        void onNetworkRequestEvent(String str, String str2, HashMap<String, String> hashMap, IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser);
    }

    public enum YtFrameworkFireEventType {
        YT_EVENT_TRIGGER_BEGIN_LIVENESS,
        YT_EVENT_TRIGGER_CANCEL_LIVENESS
    }

    public interface IYTReflectListener {
        float onGetAppBrightness();

        void onReflectEvent(ColorMatrixColorFilter colorMatrixColorFilter, float f);

        void onReflectStart(long j);
    }

    public enum YtSDKKitFrameworkWorkMode {
        YT_FW_UNKNOWN(0),
        YT_FW_OCR_TYPE(1),
        YT_FW_SILENT_TYPE(2),
        YT_FW_ACTION_TYPE(3),
        YT_FW_REFLECT_TYPE(4),
        YT_FW_ACTREFLECT_TYPE(5),
        YT_FW_LIPREAD_TYPE(6),
        YT_FW_DETECTONLY_TYPE(7),
        YT_FW_OCR_VIID_TYPE(8);
        
        private static HashMap<Integer, YtSDKKitFrameworkWorkMode> map;
        private int value;

        /* access modifiers changed from: public */
        static {
            int i;
            map = new HashMap<>();
            for (YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode : values()) {
                map.put(Integer.valueOf(ytSDKKitFrameworkWorkMode.value), ytSDKKitFrameworkWorkMode);
            }
        }

        private YtSDKKitFrameworkWorkMode(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static YtSDKKitFrameworkWorkMode valueOf(int i) {
            if (map.get(Integer.valueOf(i)) == null) {
                return YT_FW_UNKNOWN;
            }
            return map.get(Integer.valueOf(i));
        }
    }

    public static class YtSDKPlatformContext {
        public IYTBaseFunctionListener baseFunctionListener;
        public Context currentAppContext;
        public Camera currentCamera;
        public int currentCameraId;
        public int currentRotateState;
        public int imageToComapreType = 0;
        public Bitmap imageToCompare;
        public RelativeLayout reflectLayout;
        public IYTReflectListener reflectListener;
    }

    public interface IYtSDKKitNetResponseParser {
        void onNetworkResponseEvent(HashMap<String, String> hashMap, Exception exc);
    }

    private YtSDKKitFramework() {
    }

    public static synchronized void clearInstance() {
        synchronized (YtSDKKitFramework.class) {
            instance = null;
        }
    }

    public static synchronized YtSDKKitFramework getInstance() {
        YtSDKKitFramework ytSDKKitFramework;
        synchronized (YtSDKKitFramework.class) {
            if (instance == null) {
                instance = new YtSDKKitFramework();
            }
            ytSDKKitFramework = instance;
        }
        return ytSDKKitFramework;
    }

    private YtFSMBaseState parseStateFrom(String str, JSONObject jSONObject) {
        YtFSMBaseState ytFSMBaseState = null;
        try {
            YtFSMBaseState ytFSMBaseState2 = (YtFSMBaseState) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            try {
                ytFSMBaseState2.loadStateWith(str, jSONObject);
                return ytFSMBaseState2;
            } catch (Throwable th) {
                th = th;
                ytFSMBaseState = ytFSMBaseState2;
            }
        } catch (Throwable th4) {
            th = th4;
            String str2 = TAG;
            YtLogger.m106579e(str2, "Parse state " + str + "failed:" + th.getMessage());
            return ytFSMBaseState;
        }
    }

    public int deInit() {
        YtLogger.m106580i(TAG, "sdkkit framework 1.0.8.84.1-wx deinit");
        YtSDKKitNetHelper.clearInstance();
        YtFSM.getInstance().stop();
        YtFSM.clearInstance();
        YtSDKStats.getInstance().exitState();
        YtSDKStats.clearInstance();
        return 0;
    }

    public void doPause() {
        YtFSM.getInstance().handlePauseEvent();
    }

    public void doResume() {
        YtFSM.getInstance().handleResumeEvent();
    }

    public void fireEvent(YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        YtFSM.getInstance().handleEvent(ytFrameworkFireEventType, obj);
    }

    public Rect getDetectRect() {
        return this.detectRect;
    }

    public int getNetworkRequestTimeoutMS() {
        return this.networkRequestTimeoutMS;
    }

    public YtSDKPlatformContext getPlatformContext() {
        return YtFSM.getInstance().getContext();
    }

    public Rect getPreviewRect() {
        return this.previewRect;
    }

    public int init(YtSDKPlatformContext ytSDKPlatformContext, JSONObject jSONObject, YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, ArrayList<String> arrayList, IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        String str = TAG;
        YtLogger.m106580i(str, "sdkkit framework 1.0.8.84.1-wx init");
        if (ytSDKPlatformContext == null) {
            YtLogger.m106579e(str, "Context cannot be null");
            return -1;
        } else if (arrayList.isEmpty()) {
            YtLogger.m106579e(str, "Pipeline state name cannot be empty");
            return -1;
        } else if (iYtSDKKitFrameworkEventListener == null) {
            YtLogger.m106579e(str, "Event listener cannot be null");
            return -1;
        } else {
            YtFSM.getInstance().stop();
            YtFSM.getInstance().setEventListener(iYtSDKKitFrameworkEventListener);
            YtFSM.getInstance().setContext(ytSDKPlatformContext);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                YtFSM.getInstance().registerState(parseStateFrom(it.next(), jSONObject));
            }
            int i = -20;
            if (jSONObject.has("thread_priority")) {
                try {
                    i = jSONObject.getInt("thread_priority");
                } catch (JSONException e) {
                    String str2 = TAG;
                    YtLogger.m106579e(str2, "failed to get priority " + e.getLocalizedMessage());
                }
            }
            YtFSM.getInstance().start(arrayList.get(0), ytSDKKitFrameworkWorkMode, i);
            return 0;
        }
    }

    public void reset() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                YtSDKStats.getInstance().reset();
                YtFSM.getInstance().reset();
            }
        });
    }

    public void setDetectRect(Rect rect) {
        this.detectRect = rect;
    }

    public void setNetworkRequestTimeoutMS(int i) {
        if (i < 0) {
            i = 0;
        }
        this.networkRequestTimeoutMS = i;
    }

    public void setPreviewRect(Rect rect) {
        this.previewRect = rect;
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        YtFSM.getInstance().updateSDKSetting(jSONObject);
    }

    public int updateWithFrameData(byte[] bArr, int i, int i2, int i3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis <= 946684800000L) {
            return ErrorCode.YT_SDK_TIMETICK_ERROR;
        }
        YtFSM.getInstance().update(bArr, i, i2, i3, currentTimeMillis);
        return 0;
    }

    public String version() {
        return version;
    }
}
