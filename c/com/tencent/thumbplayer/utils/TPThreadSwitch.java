package com.tencent.thumbplayer.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TPThreadSwitch {
    private static final int API_CALL_TIME_OUT_MS = 500;
    private static final boolean ENV_DEBUG = false;
    private Class<?> mClass;
    private EventHandler mEventHandler = new EventHandler(this.mLooper);
    private Object mHandleListener;
    private TPReadWriteLock mLock = new TPReadWriteLock();
    private String mLogTag;
    private Looper mLooper;

    public class EventHandler extends Handler {
        public void handleMessage(Message message) {
            TPThreadSwitch.this.handleEventMessage(message);
        }

        private EventHandler(Looper looper) {
            super(looper);
        }
    }

    public static class MessageParams {
        public Object params;
        public TPFutureResult result;

        private MessageParams() {
        }
    }

    public TPThreadSwitch(String str, Looper looper, Object obj) {
        this.mLogTag = str;
        this.mLooper = looper;
        this.mHandleListener = obj;
        Class<?> cls = obj.getClass();
        this.mClass = cls;
        if (!TPThreadAnnotations.register(cls, 0)) {
            String str2 = this.mLogTag;
            TPLogUtil.m21894e(str2, "Register " + this.mClass.getName() + " @ThreadSwitch method failed, version: " + TPPlayerConfig.VERSION);
            throw new RuntimeException("register @ThreadSwitch method failed, player can not work");
        }
    }

    private Object dealResult(String str, Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        String name = TPThreadAnnotations.getMethod(this.mClass, str, getMethodParams(obj2)).getReturnType().getName();
        if (name.equals(DownloadSetting.TYPE_BOOLEAN)) {
            return Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    private Object[] getMethodParams(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof MessageParams)) {
            return (Object[]) obj;
        }
        Object obj2 = ((MessageParams) obj).params;
        if (obj2 == null) {
            return null;
        }
        return (Object[]) obj2;
    }

    /* access modifiers changed from: private */
    public void handleEventMessage(Message message) {
        if (this.mHandleListener == null) {
            TPLogUtil.m21894e(this.mLogTag, "handle listener is null, return");
        } else {
            invokeMethod(message.what, message.obj);
        }
    }

    private boolean internalMessage(int i, Object obj) {
        return internalMessage(i, 0, 0, obj, false, false, 0);
    }

    private Object internalMessageLock(int i, int i2, int i3, Object obj, boolean z, boolean z2, long j) {
        TPFutureResult tPFutureResult = new TPFutureResult();
        MessageParams messageParams = new MessageParams();
        messageParams.params = obj;
        messageParams.result = tPFutureResult;
        internalMessage(i, i2, i3, messageParams, z, z2, j);
        return tPFutureResult.getResult(500);
    }

    private void invokeMethod(int i, Object obj) {
        TPFutureResult tPFutureResult = obj instanceof MessageParams ? ((MessageParams) obj).result : null;
        Method methodByMsgId = TPThreadAnnotations.getMethodByMsgId(this.mClass, i);
        if (methodByMsgId == null) {
            String str = this.mLogTag;
            TPLogUtil.m21894e(str, "invokeMethod, handle method name is empty, msg:" + i);
            if (tPFutureResult != null) {
                tPFutureResult.setException(new RuntimeException("invokeMethod, handle method name is empty"));
                return;
            }
            return;
        }
        try {
            Object invoke = methodByMsgId.getParameterTypes().length == 0 ? methodByMsgId.invoke(this.mHandleListener, new Object[0]) : methodByMsgId.invoke(this.mHandleListener, getMethodParams(obj));
            if (tPFutureResult != null) {
                tPFutureResult.setResult(invoke);
            }
        } catch (InvocationTargetException e) {
            String str2 = this.mLogTag;
            TPLogUtil.m21894e(str2, "invokeMethod " + methodByMsgId.getName() + " has excecption: " + e.getTargetException().toString());
            if (tPFutureResult != null) {
                if (e.getTargetException() instanceof IllegalArgumentException) {
                    tPFutureResult.setException(new IllegalArgumentException("invokeMethod " + methodByMsgId.getName() + " failed, params invalid", e.getCause()));
                } else if (e.getTargetException() instanceof IllegalStateException) {
                    tPFutureResult.setException(new IllegalStateException("invokeMethod " + methodByMsgId.getName() + " failed, state invalid", e.getCause()));
                } else {
                    tPFutureResult.setException(e.getTargetException());
                }
            }
        } catch (Exception e2) {
            String str3 = this.mLogTag;
            TPLogUtil.m21894e(str3, "invokeMethod " + methodByMsgId.getName() + " has excecption: " + e2.toString());
            if (tPFutureResult != null) {
                tPFutureResult.setException(e2);
            }
        }
    }

    private boolean isSameLooper() {
        return Looper.myLooper() == this.mLooper;
    }

    private String messageToCommand(int i) {
        String api = TPThreadAnnotations.getApi(this.mClass, i);
        if (!TextUtils.isEmpty(api) && !api.equals("unknown")) {
            return api;
        }
        return i + " not find";
    }

    private void recycle() {
        this.mEventHandler.removeCallbacksAndMessages((Object) null);
    }

    public Object dealThreadSwitch(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            int methodMsgId = TPThreadAnnotations.getMethodMsgId(this.mClass, str, getMethodParams(obj));
            if (methodMsgId >= 0) {
                boolean removeRepeat = TPThreadAnnotations.removeRepeat(this.mClass, methodMsgId);
                boolean checkObj = TPThreadAnnotations.checkObj(this.mClass, methodMsgId);
                if (TPThreadAnnotations.isNeedWait(this.mClass, methodMsgId)) {
                    return internalMessageLock(methodMsgId, 0, 0, obj, checkObj, removeRepeat, 0);
                }
                internalMessage(methodMsgId, 0, 0, obj, checkObj, removeRepeat, 0);
                return null;
            }
            String str2 = this.mLogTag;
            TPLogUtil.m21894e(str2, "dealThreadSwitch failed , not match method:" + str);
            throw new RuntimeException("dealThreadSwitch failed , not match method:" + str);
        }
        TPLogUtil.m21894e(this.mLogTag, "dealThreadSwitch failed , methodName is null");
        throw new RuntimeException("dealThreadSwitch failed , methodName is null");
    }

    public Object dealThreadSwitchWithResult(String str, Object obj) {
        return dealResult(str, dealThreadSwitch(str, obj), obj);
    }

    private boolean internalMessage(int i, int i2, int i3, Object obj, boolean z, boolean z2, long j) {
        if (this.mEventHandler == null) {
            String str = this.mLogTag;
            TPLogUtil.m21894e(str, messageToCommand(i) + " , send failed , handler null");
            return false;
        } else if (z && obj == null) {
            String str2 = this.mLogTag;
            TPLogUtil.m21894e(str2, messageToCommand(i) + ", send failed , params null");
            return false;
        } else if (!this.mLooper.getThread().isAlive()) {
            String str3 = this.mLogTag;
            TPLogUtil.m21894e(str3, messageToCommand(i) + ", send failed , thread had dead");
            return false;
        } else {
            if (!isSameLooper()) {
                this.mLock.readLock().lock();
            }
            if (z2) {
                this.mEventHandler.removeMessages(i);
            }
            Message obtainMessage = this.mEventHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = i3;
            obtainMessage.obj = obj;
            if (isSameLooper()) {
                handleEventMessage(obtainMessage);
                return true;
            }
            this.mEventHandler.sendMessageDelayed(obtainMessage, j);
            this.mLock.readLock().unlock();
            return true;
        }
    }
}
