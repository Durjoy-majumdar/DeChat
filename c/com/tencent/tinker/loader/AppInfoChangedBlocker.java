package com.tencent.tinker.loader;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.lang.reflect.Field;

public final class AppInfoChangedBlocker {
    private static final String TAG = "Tinker.AppInfoChangedBlocker";

    public static class HackerCallback implements Handler.Callback {
        private final int APPLICATION_INFO_CHANGED;
        private Handler.Callback origin;

        public HackerCallback(Handler.Callback callback, Class cls) {
            int i;
            this.origin = callback;
            try {
                i = ShareReflectUtil.findField((Class<?>) cls, "APPLICATION_INFO_CHANGED").getInt((Object) null);
            } catch (Throwable unused) {
                i = 156;
            }
            this.APPLICATION_INFO_CHANGED = i;
        }

        private boolean hackMessage(Message message) {
            if (message.what != this.APPLICATION_INFO_CHANGED) {
                return false;
            }
            ShareTinkerLog.m106534w(AppInfoChangedBlocker.TAG, "Suicide now.", new Object[0]);
            Process.killProcess(Process.myPid());
            return true;
        }

        public boolean handleMessage(Message message) {
            if (hackMessage(message)) {
                return true;
            }
            Handler.Callback callback = this.origin;
            if (callback != null) {
                return callback.handleMessage(message);
            }
            return false;
        }
    }

    private static Handler fetchMHObject(Context context) {
        Object activityThread = ShareReflectUtil.getActivityThread(context, (Class<?>) null);
        return (Handler) ShareReflectUtil.findField(activityThread, "mH").get(activityThread);
    }

    private static void interceptHandler(Handler handler) {
        Field findField = ShareReflectUtil.findField((Class<?>) Handler.class, "mCallback");
        Handler.Callback callback = (Handler.Callback) findField.get(handler);
        if (!(callback instanceof HackerCallback)) {
            findField.set(handler, new HackerCallback(callback, handler.getClass()));
        } else {
            ShareTinkerLog.m106534w(TAG, "Already intercepted, skip rest logic.", new Object[0]);
        }
    }

    public static boolean tryStart(Application application) {
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        try {
            ShareTinkerLog.m106532i(TAG, "tryStart called.", new Object[0]);
            interceptHandler(fetchMHObject(application));
            ShareTinkerLog.m106532i(TAG, "tryStart done.", new Object[0]);
            return true;
        } catch (Throwable th) {
            ShareTinkerLog.m106531e(TAG, "AppInfoChangedBlocker start failed, simply ignore.", th);
            return false;
        }
    }
}
