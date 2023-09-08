package com.tencent.maas.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class NativeCallbackManager {
    public static final int INVALID_CALLBACK_ID = -1;
    private static final int MSG_INVOKE_CALLBACK = 1000001;
    private static final String TAG = "NativeCallbackManager";
    private final HandlerThread mCallbackHandlerThread;
    /* access modifiers changed from: private */
    public final SparseArray<Callback> mCallbackMap = new SparseArray<>();
    /* access modifiers changed from: private */
    public final ReentrantReadWriteLock mCallbackMapLock = new ReentrantReadWriteLock();
    private final SparseArray<CallbackWithReturnValue> mCallbackWithReturnReturnValueMap = new SparseArray<>();
    private final AtomicInteger mCurrentID = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final SparseIntArray mProgressCallbackMap = new SparseIntArray();
    private final MyHandler myHandler;

    public static abstract class CallbackArgs {
    }

    public class MyHandler extends Handler {
        public MyHandler(Looper looper) {
            super(looper);
        }

        /* JADX INFO: finally extract failed */
        private void handleInvokeCallbackMsg(Message message) {
            Callback callback;
            int i = message.arg1;
            ReentrantReadWriteLock.ReadLock readLock = NativeCallbackManager.this.mCallbackMapLock.readLock();
            readLock.lock();
            try {
                callback = (Callback) NativeCallbackManager.this.mCallbackMap.get(i);
                readLock.unlock();
            } catch (Exception unused) {
                readLock.unlock();
                callback = null;
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
            if (callback != null) {
                callback.invoke((CallbackArgs) message.obj);
                if (callback.callOnce) {
                    ReentrantReadWriteLock.WriteLock writeLock = NativeCallbackManager.this.mCallbackMapLock.writeLock();
                    writeLock.lock();
                    try {
                        NativeCallbackManager.this.mCallbackMap.remove(i);
                        int i2 = NativeCallbackManager.this.mProgressCallbackMap.get(i, -1);
                        if (i2 != -1) {
                            NativeCallbackManager.this.mCallbackMap.remove(i2);
                        }
                    } catch (Exception unused2) {
                    } catch (Throwable th4) {
                        writeLock.unlock();
                        throw th4;
                    }
                    writeLock.unlock();
                }
            }
        }

        public void handleMessage(Message message) {
            if (message.what == 1000001) {
                handleInvokeCallbackMsg(message);
            }
        }
    }

    public NativeCallbackManager() {
        HandlerThread handlerThread = new HandlerThread(TAG);
        this.mCallbackHandlerThread = handlerThread;
        handlerThread.start();
        this.myHandler = new MyHandler(handlerThread.getLooper());
    }

    /* JADX INFO: finally extract failed */
    private Object invokeWithReturnValue(int i, CallbackArgs callbackArgs, SparseArray<CallbackWithReturnValue> sparseArray) {
        CallbackWithReturnValue callbackWithReturnValue;
        ReentrantReadWriteLock.ReadLock readLock = this.mCallbackMapLock.readLock();
        readLock.lock();
        try {
            callbackWithReturnValue = sparseArray.get(i);
            readLock.unlock();
        } catch (Exception unused) {
            readLock.unlock();
            callbackWithReturnValue = null;
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
        if (callbackWithReturnValue == null) {
            return null;
        }
        Object invoke = callbackWithReturnValue.invoke(callbackArgs);
        if (callbackWithReturnValue.callOnce) {
            ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
            writeLock.lock();
            try {
                this.mCallbackMap.remove(i);
            } catch (Exception unused2) {
            } catch (Throwable th4) {
                writeLock.unlock();
                throw th4;
            }
            writeLock.unlock();
        }
        return invoke;
    }

    private void notifyInvokeCallback(int i) {
        notifyInvokeCallbackArg(i, (CallbackArgs) null);
    }

    private void notifyInvokeCallbackArg(int i, CallbackArgs callbackArgs) {
        this.myHandler.obtainMessage(1000001, i, 0, callbackArgs).sendToTarget();
    }

    private Object notifyInvokeCallbackArgWithReturnValue(int i, CallbackArgs callbackArgs) {
        return invokeWithReturnValue(i, callbackArgs, this.mCallbackWithReturnReturnValueMap);
    }

    public int registerCallback(Callback callback) {
        int incrementAndGet = this.mCurrentID.incrementAndGet();
        ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackMap.put(incrementAndGet, callback);
        } catch (Exception unused) {
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
        writeLock.unlock();
        return incrementAndGet;
    }

    public int registerCallbackWithReturnValue(CallbackWithReturnValue callbackWithReturnValue) {
        int incrementAndGet = this.mCurrentID.incrementAndGet();
        ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackWithReturnReturnValueMap.put(incrementAndGet, callbackWithReturnValue);
        } catch (Exception unused) {
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
        writeLock.unlock();
        return incrementAndGet;
    }

    public int[] registerProgressWithComplete(Callback callback, Callback callback2) {
        if (callback == null || callback2 == null) {
            return new int[]{-1, -1};
        }
        int registerCallback = registerCallback(callback);
        int registerCallback2 = registerCallback(callback2);
        ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mProgressCallbackMap.put(registerCallback2, registerCallback);
        } catch (Exception unused) {
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
        writeLock.unlock();
        return new int[]{registerCallback, registerCallback2};
    }

    public void removeAllCallback() {
        ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackMap.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
        writeLock.unlock();
    }

    public void removeAllCallbackWithReturnValue() {
        ReentrantReadWriteLock.WriteLock writeLock = this.mCallbackMapLock.writeLock();
        writeLock.lock();
        try {
            this.mCallbackWithReturnReturnValueMap.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
        writeLock.unlock();
    }

    public static abstract class Callback {
        public final boolean callOnce;

        public Callback() {
            this.callOnce = true;
        }

        public abstract void invoke(CallbackArgs callbackArgs);

        public Callback(boolean z) {
            this.callOnce = z;
        }
    }

    public static abstract class CallbackWithReturnValue {
        public final boolean callOnce;

        public CallbackWithReturnValue() {
            this.callOnce = true;
        }

        public abstract Object invoke(CallbackArgs callbackArgs);

        public CallbackWithReturnValue(boolean z) {
            this.callOnce = z;
        }
    }

    public NativeCallbackManager(Looper looper) {
        this.myHandler = new MyHandler(looper);
        this.mCallbackHandlerThread = null;
    }
}
