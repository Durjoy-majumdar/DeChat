package com.tencent.xweb.pinus;

import com.tencent.xweb.IXWebPreferences;
import com.tencent.xweb.util.ReflectMethod;
import com.tencent.xweb.util.XWebLog;

public class PinusPreferences implements IXWebPreferences {
    public static final String TAG = "PinusPreferences";
    private PSCoreWrapper coreWrapper;
    private final ReflectMethod getBooleanValueStringMethod = new ReflectMethod((Class<?>) null, "getBooleanValue", (Class<?>[]) new Class[0]);
    private final ReflectMethod getIntegerValueStringMethod = new ReflectMethod((Class<?>) null, "getIntegerValue", (Class<?>[]) new Class[0]);
    private final ReflectMethod getStringValueStringMethod = new ReflectMethod((Class<?>) null, "getStringValue", (Class<?>[]) new Class[0]);
    private final ReflectMethod getValueStringMethod = new ReflectMethod((Class<?>) null, "getValue", (Class<?>[]) new Class[0]);
    private final ReflectMethod setValueStringStringMethod = new ReflectMethod((Class<?>) null, "setValue", (Class<?>[]) new Class[0]);
    private final ReflectMethod setValueStringbooleanMethod = new ReflectMethod((Class<?>) null, "setValue", (Class<?>[]) new Class[0]);
    private final ReflectMethod setValueStringintMethod = new ReflectMethod((Class<?>) null, "setValue", (Class<?>[]) new Class[0]);

    private void reflectionInit() {
        Class<String> cls = String.class;
        if (this.coreWrapper == null) {
            if (PSCoreWrapper.getInstance() == null) {
                XWebLog.m21913w(TAG, "reflectionInit, pinus core wrapper is null");
                return;
            }
            PSCoreWrapper instance = PSCoreWrapper.getInstance();
            this.coreWrapper = instance;
            Class<?> cls2 = instance.getClass("org.xwalk.core.internal.XWalkPreferencesBridge");
            this.setValueStringbooleanMethod.init((Object) null, cls2, "setValue", cls, Boolean.TYPE);
            this.setValueStringintMethod.init((Object) null, cls2, "setValue", cls, Integer.TYPE);
            this.setValueStringStringMethod.init((Object) null, cls2, "setValue", cls, cls);
            this.getValueStringMethod.init((Object) null, cls2, "getValue", cls);
            this.getBooleanValueStringMethod.init((Object) null, cls2, "getBooleanValue", cls);
            this.getIntegerValueStringMethod.init((Object) null, cls2, "getIntegerValue", cls);
            this.getStringValueStringMethod.init((Object) null, cls2, "getStringValue", cls);
        }
    }

    public boolean getBooleanValue(String str) {
        reflectionInit();
        try {
            return ((Boolean) this.getBooleanValueStringMethod.invoke(str)).booleanValue();
        } catch (UnsupportedOperationException e) {
            if (this.coreWrapper != null) {
                PSCoreWrapper.handleRuntimeError(e);
                return false;
            }
            throw new RuntimeException("Crosswalk's APIs are not ready yet");
        }
    }

    public int getIntegerValue(String str) {
        reflectionInit();
        try {
            return ((Integer) this.getIntegerValueStringMethod.invoke(str)).intValue();
        } catch (UnsupportedOperationException e) {
            if (this.coreWrapper != null) {
                PSCoreWrapper.handleRuntimeError(e);
                return 0;
            }
            throw new RuntimeException("Crosswalk's APIs are not ready yet");
        }
    }

    public String getStringValue(String str) {
        reflectionInit();
        try {
            return (String) this.getStringValueStringMethod.invoke(str);
        } catch (UnsupportedOperationException e) {
            if (this.coreWrapper != null) {
                PSCoreWrapper.handleRuntimeError(e);
                return null;
            }
            throw new RuntimeException("Crosswalk's APIs are not ready yet");
        }
    }

    public boolean getValue(String str) {
        reflectionInit();
        try {
            return ((Boolean) this.getValueStringMethod.invoke(str)).booleanValue();
        } catch (UnsupportedOperationException e) {
            if (this.coreWrapper != null) {
                PSCoreWrapper.handleRuntimeError(e);
                return false;
            }
            throw new RuntimeException("Crosswalk's APIs are not ready yet");
        }
    }

    public void setValue(String str, boolean z) {
        reflectionInit();
        try {
            this.setValueStringbooleanMethod.invoke(str, Boolean.valueOf(z));
        } catch (UnsupportedOperationException e) {
            if (this.coreWrapper != null) {
                PSCoreWrapper.handleRuntimeError(e);
                return;
            }
            throw new RuntimeException("Crosswalk's APIs are not ready yet");
        }
    }

    public void setValue(String str, int i) {
        reflectionInit();
        try {
            this.setValueStringintMethod.invoke(str, Integer.valueOf(i));
        } catch (UnsupportedOperationException e) {
            if (this.coreWrapper != null) {
                PSCoreWrapper.handleRuntimeError(e);
                return;
            }
            throw new RuntimeException("Crosswalk's APIs are not ready yet");
        }
    }

    public void setValue(String str, String str2) {
        reflectionInit();
        try {
            this.setValueStringStringMethod.invoke(str, str2);
        } catch (UnsupportedOperationException e) {
            if (this.coreWrapper != null) {
                PSCoreWrapper.handleRuntimeError(e);
                return;
            }
            throw new RuntimeException("Crosswalk's APIs are not ready yet");
        }
    }
}
