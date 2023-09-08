package com.tencent.tinker.loader.hotplug.interceptor;

import android.os.Handler;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.interceptor.Interceptor;
import java.lang.reflect.Field;

public class HandlerMessageInterceptor extends Interceptor<Handler.Callback> {
    private static Field sMCallbackField;
    private final MessageHandler mMessageHandler;
    private final Handler mTarget;

    public static class CallbackWrapper implements Handler.Callback, Interceptor.ITinkerHotplugProxy {
        private volatile boolean mIsInHandleMethod = false;
        private final MessageHandler mMessageHandler;
        private final Handler.Callback mOrigCallback;

        public CallbackWrapper(MessageHandler messageHandler, Handler.Callback callback) {
            this.mMessageHandler = messageHandler;
            this.mOrigCallback = callback;
        }

        public boolean handleMessage(Message message) {
            if (this.mIsInHandleMethod) {
                return false;
            }
            boolean z = true;
            this.mIsInHandleMethod = true;
            if (!this.mMessageHandler.handleMessage(message)) {
                Handler.Callback callback = this.mOrigCallback;
                z = callback != null ? callback.handleMessage(message) : false;
            }
            this.mIsInHandleMethod = false;
            return z;
        }
    }

    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(3:5|6|7)|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    static {
        /*
            java.lang.Class<com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor> r0 = com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.class
            monitor-enter(r0)
            java.lang.reflect.Field r1 = sMCallbackField     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            java.lang.Class<android.os.Handler> r1 = android.os.Handler.class
            java.lang.String r2 = "mCallback"
            java.lang.reflect.Field r1 = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField((java.lang.Class<?>) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0011 }
            sMCallbackField = r1     // Catch:{ all -> 0x0011 }
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor.<clinit>():void");
    }

    public HandlerMessageInterceptor(Handler handler, MessageHandler messageHandler) {
        this.mTarget = handler;
        this.mMessageHandler = messageHandler;
    }

    public Handler.Callback decorate(Handler.Callback callback) {
        if (callback == null || !Interceptor.ITinkerHotplugProxy.class.isAssignableFrom(callback.getClass())) {
            return new CallbackWrapper(this.mMessageHandler, callback);
        }
        return callback;
    }

    public Handler.Callback fetchTarget() {
        return (Handler.Callback) sMCallbackField.get(this.mTarget);
    }

    public void inject(Handler.Callback callback) {
        sMCallbackField.set(this.mTarget, callback);
    }
}
