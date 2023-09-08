package com.tencent.kinda.framework.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.JsonReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tavkit.component.TAVPlayer;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Map;
import p156gj.C87203t;

public final class FingerprintInsets {
    public static final int ICON_INVISIBLE = 0;
    public static final int ICON_VISIBLE = 1;
    private static final String KEY_HAS_UNDER_DISPLAY_FINGERPRINT = "has_under_display_fingerprint";
    private static final String KEY_ICON_POSITION = "icon_position";
    private static final String KEY_ICON_STATE = "icon_state";
    private static final String KEY_MAJOR_VERSION = "version_major";
    private static final String KEY_MINOR_VERSION = "version_minor";
    private static final String KEY_QUERY_JSON_STRING = "query_json";
    private static final String KEY_TOKEN = "token";
    private static final int MSG_CLEAR = 10002;
    private static final int MSG_ICON_STATE_CHANGE = 10001;
    private static final int MSG_INTERNAL_NOTIFY_READY = 10;
    private static final int MSG_QUERY_INFO = 10000;
    private static final String TAG = "FingerprintInsets";
    private static final int VERSION_MAJOR = 1;
    private static final int VERSION_MINOR = 1;
    private static boolean sDebuggable;
    private static FingerprintInsets sInstance;
    private ServiceConnection mConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Messenger unused = FingerprintInsets.this.mService = new Messenger(iBinder);
            FingerprintInsets.debug("Attached.");
            Message obtain = Message.obtain((Handler) null, 10000);
            obtain.arg1 = 1;
            obtain.arg2 = 1;
            boolean access$200 = FingerprintInsets.this.sendMessageToService(obtain);
            StringBuilder sb = new StringBuilder();
            sb.append("query ");
            sb.append(access$200 ? "success." : "failed!");
            FingerprintInsets.debug(sb.toString());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Messenger unused = FingerprintInsets.this.mService = null;
            FingerprintInsets.debug("Disconnected.");
        }
    };
    private WeakReference<Context> mContextRef;
    private Handler mHandler;
    private boolean mIsBound;
    private FingerprintInsetsListener mListener;
    private Messenger mMessenger;
    private Map<String, Property> mProperties;
    /* access modifiers changed from: private */
    public Messenger mService;

    public interface FingerprintInsetsListener {
        void onIconStateChanged(int i);

        void onReady();
    }

    public static class IncomingHandler extends Handler {
        private WeakReference<FingerprintInsets> mInsets;

        public IncomingHandler(FingerprintInsets fingerprintInsets) {
            this.mInsets = new WeakReference<>(fingerprintInsets);
        }

        public void handleMessage(Message message) {
            FingerprintInsets fingerprintInsets = this.mInsets.get();
            if (fingerprintInsets == null) {
                FingerprintInsets.debug("missing insets reference");
                super.handleMessage(message);
                return;
            }
            int i = message.what;
            if (i == 10) {
                fingerprintInsets.notifyReady();
            } else if (i == 10000) {
                FingerprintInsets.debug(String.format(Locale.ENGLISH, "Received from service, version:%d.%d", new Object[]{Integer.valueOf(message.arg1), Integer.valueOf(message.arg2)}));
                Bundle data = message.getData();
                fingerprintInsets.parseQueryResult(data != null ? data.getString(FingerprintInsets.KEY_QUERY_JSON_STRING) : null);
            } else if (i != 10001) {
                super.handleMessage(message);
            } else {
                int i2 = message.arg1;
                FingerprintInsets.debug("Received from service, icon state:" + i2);
                fingerprintInsets.notifyIconStateChanged(i2);
            }
        }
    }

    public static class Property<T> {
        public String key;
        public T value;

        public Property(String str, T t) {
            this.key = str;
            this.value = t;
        }

        public T value() {
            return this.value;
        }
    }

    private FingerprintInsets(Context context) {
        this.mContextRef = new WeakReference<>(context);
        this.mProperties = new ArrayMap(8);
        this.mHandler = new IncomingHandler(this);
        this.mMessenger = new Messenger(this.mHandler);
        info(String.format(Locale.ENGLISH, "model:%s, product:%s, device:%s, manufacturer:%s", new Object[]{C87203t.m108275k(), Build.PRODUCT, Build.DEVICE, Build.MANUFACTURER}));
    }

    public static FingerprintInsets create(Context context, FingerprintInsetsListener fingerprintInsetsListener) {
        if (!isVivoDevice()) {
            return null;
        }
        if (sInstance == null) {
            FingerprintInsets fingerprintInsets = new FingerprintInsets(context);
            fingerprintInsets.setFingerprintInsetsListener(fingerprintInsetsListener);
            fingerprintInsets.doBindService();
            sInstance = fingerprintInsets;
        }
        return sInstance;
    }

    /* access modifiers changed from: private */
    public static void debug(String str) {
        if (sDebuggable) {
            Log.m105924i(TAG, str);
        }
    }

    private boolean doBindService() {
        Context context = this.mContextRef.get();
        if (context == null) {
            debug("Context missed!");
            return false;
        }
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 28) {
            intent.setClassName("com.vivo.fingerprintui", "com.vivo.fingerprintui.export.MessengerService");
        } else {
            intent.setClassName("com.vivo.udfingerprint", "com.vivo.udfingerprint.service.MessengerService");
        }
        intent.putExtra(KEY_MAJOR_VERSION, 1);
        intent.putExtra(KEY_MINOR_VERSION, 1);
        try {
            if (!context.bindService(intent, this.mConnection, 1)) {
                info("Service not exist");
                this.mIsBound = false;
                loadPropertiesOffline();
                Message.obtain(this.mHandler, 10).sendToTarget();
            } else {
                debug("Binding.");
                this.mIsBound = true;
            }
        } catch (SecurityException e) {
            Log.m105928w(TAG, "bindService failed:" + e.getMessage());
        }
        return this.mIsBound;
    }

    private void doUnbindService() {
        if (!this.mIsBound) {
            debug("Service not bound");
            return;
        }
        if (this.mService != null) {
            sendMessageToService(Message.obtain((Handler) null, 10002));
            this.mService = null;
        }
        this.mIsBound = false;
        Context context = this.mContextRef.get();
        if (context == null) {
            debug("Context missed!");
            return;
        }
        context.unbindService(this.mConnection);
        debug("Unbinding.");
    }

    private static String getFingerprintModule() {
        String property = getProperty("sys.fingerprint.boot", "");
        return TextUtils.isEmpty(property) ? getProperty("persist.sys.fptype", "unknown") : property;
    }

    private static String getProperty(String str, String str2) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.os.SystemProperties");
            return (String) cls2.getMethod("get", new Class[]{cls, cls}).invoke(cls2, new Object[]{str, str2});
        } catch (Exception e) {
            debug(e.getMessage());
            return str2;
        }
    }

    private boolean getPropertyBoolean(String str) {
        Property property = this.mProperties.get(str);
        if (property == null) {
            return false;
        }
        return ((Boolean) property.value()).booleanValue();
    }

    private int getPropertyInteger(String str) {
        Property property = this.mProperties.get(str);
        if (property == null) {
            return -1;
        }
        return ((Integer) property.value()).intValue();
    }

    private Rect getPropertyRect(String str) {
        Property property = this.mProperties.get(str);
        if (property == null) {
            return null;
        }
        return (Rect) property.value();
    }

    private static void info(String str) {
        Log.m105924i(TAG, str);
    }

    private static boolean isUdModule() {
        String fingerprintModule = getFingerprintModule();
        return !TextUtils.isEmpty(fingerprintModule) && fingerprintModule.startsWith("udfp_");
    }

    private static boolean isVivoDevice() {
        return Build.MANUFACTURER.equalsIgnoreCase("vivo");
    }

    private static boolean isX20PlusUD() {
        String str = Build.DEVICE;
        if (str.equalsIgnoreCase("PD1721")) {
            return true;
        }
        return str.equalsIgnoreCase("PD1710") && Build.VERSION.SDK_INT < 26 && isUdModule();
    }

    private static boolean isX21UD() {
        String str = Build.DEVICE;
        if (str.equalsIgnoreCase("PD1728UD")) {
            return true;
        }
        return (str.contains("1728") || str.contains("1725")) && Build.VERSION.SDK_INT <= 27 && isUdModule();
    }

    private boolean loadPropertiesOffline() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 24) {
            setPropertyBoolean(KEY_HAS_UNDER_DISPLAY_FINGERPRINT, false);
            return false;
        }
        if (i2 < 26) {
            debug("fingerprint: " + getFingerprintModule());
        }
        Rect rect = new Rect();
        boolean isX20PlusUD = isX20PlusUD();
        int i3 = 170;
        int i4 = 160;
        int i5 = TAVPlayer.VIDEO_PLAYER_WIDTH;
        if (isX20PlusUD) {
            debug("isX20PlusUD");
            i = 2006;
            i3 = 160;
        } else if (isX21UD()) {
            debug("isX21UD");
            i = 1924;
            i4 = 170;
        } else {
            debug("No under display fingerprint detected");
            i = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        rect.set(i5, i, i5 + i3, i + i4);
        rect.offset((-i3) / 2, (-i4) / 2);
        if (rect.isEmpty()) {
            setPropertyBoolean(KEY_HAS_UNDER_DISPLAY_FINGERPRINT, false);
        } else {
            setPropertyRect(KEY_ICON_POSITION, rect);
            setPropertyInteger(KEY_ICON_STATE, 1);
            setPropertyBoolean(KEY_HAS_UNDER_DISPLAY_FINGERPRINT, true);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void notifyIconStateChanged(int i) {
        setPropertyInteger(KEY_ICON_STATE, i);
        FingerprintInsetsListener fingerprintInsetsListener = this.mListener;
        if (fingerprintInsetsListener != null) {
            fingerprintInsetsListener.onIconStateChanged(i);
        }
    }

    /* access modifiers changed from: private */
    public void notifyReady() {
        FingerprintInsetsListener fingerprintInsetsListener = this.mListener;
        if (fingerprintInsetsListener != null) {
            fingerprintInsetsListener.onReady();
        }
    }

    private Rect parsePosition(JsonReader jsonReader) {
        jsonReader.beginArray();
        int i = 0;
        int nextInt = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt2 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        int nextInt3 = jsonReader.hasNext() ? jsonReader.nextInt() : 0;
        if (jsonReader.hasNext()) {
            i = jsonReader.nextInt();
        }
        jsonReader.endArray();
        return new Rect(nextInt, nextInt2, nextInt3, i);
    }

    private void parseProperties(JsonReader jsonReader) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (TextUtils.equals(nextName, KEY_ICON_STATE)) {
                setPropertyInteger(nextName, jsonReader.nextInt());
            } else if (TextUtils.equals(nextName, KEY_HAS_UNDER_DISPLAY_FINGERPRINT)) {
                setPropertyBoolean(nextName, jsonReader.nextBoolean());
            } else if (TextUtils.equals(nextName, KEY_ICON_POSITION)) {
                setPropertyRect(nextName, parsePosition(jsonReader));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    /* access modifiers changed from: private */
    public void parseQueryResult(String str) {
        JsonReader jsonReader;
        setPropertyBoolean(KEY_HAS_UNDER_DISPLAY_FINGERPRINT, false);
        if (!TextUtils.isEmpty(str)) {
            try {
                jsonReader = new JsonReader(new StringReader(str));
                parseProperties(jsonReader);
                jsonReader.close();
            } catch (IOException unused) {
                this.mProperties.clear();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        Message.obtain(this.mHandler, 10).sendToTarget();
        return;
        throw th;
    }

    /* access modifiers changed from: private */
    public boolean sendMessageToService(Message message) {
        Context context;
        Messenger messenger = this.mService;
        if (messenger == null || (context = this.mContextRef.get()) == null) {
            return false;
        }
        try {
            Bundle data = message.getData();
            if (data == null) {
                data = new Bundle();
            }
            if (!data.containsKey("token")) {
                data.putString("token", context.getPackageName());
            }
            message.setData(data);
            message.replyTo = this.mMessenger;
            messenger.send(message);
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }

    public static void setDebugEnable(boolean z) {
        sDebuggable = z;
    }

    private void setPropertyBoolean(String str, boolean z) {
        if (this.mProperties.containsKey(str)) {
            debug("update property " + str);
        }
        this.mProperties.put(str, new Property(str, Boolean.valueOf(z)));
    }

    private void setPropertyInteger(String str, int i) {
        if (this.mProperties.containsKey(str)) {
            debug("update property " + str);
        }
        this.mProperties.put(str, new Property(str, Integer.valueOf(i)));
    }

    private void setPropertyRect(String str, Rect rect) {
        this.mProperties.put(str, new Property(KEY_ICON_POSITION, rect));
    }

    public void destroy() {
        if (sInstance != null) {
            doUnbindService();
            this.mProperties.clear();
            this.mContextRef.clear();
            sInstance = null;
        }
    }

    public int getFingerprintIconBottom() {
        Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.bottom;
    }

    public int getFingerprintIconLeft() {
        Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.left;
    }

    public Rect getFingerprintIconPosition() {
        Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        return propertyRect == null ? new Rect(-1, -1, -1, -1) : new Rect(propertyRect);
    }

    public int getFingerprintIconRight() {
        Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.right;
    }

    public int getFingerprintIconState() {
        return getPropertyInteger(KEY_ICON_STATE);
    }

    public int getFingerprintIconTop() {
        Rect propertyRect = getPropertyRect(KEY_ICON_POSITION);
        if (propertyRect == null) {
            return -1;
        }
        return propertyRect.top;
    }

    public boolean hasUnderDisplayFingerprint() {
        return getPropertyBoolean(KEY_HAS_UNDER_DISPLAY_FINGERPRINT);
    }

    public boolean isReady() {
        return !this.mIsBound || !this.mProperties.isEmpty();
    }

    public void setFingerprintInsetsListener(FingerprintInsetsListener fingerprintInsetsListener) {
        this.mListener = fingerprintInsetsListener;
    }
}
