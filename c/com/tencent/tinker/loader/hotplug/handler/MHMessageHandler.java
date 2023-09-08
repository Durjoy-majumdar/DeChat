package com.tencent.tinker.loader.hotplug.handler;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.hotplug.IncrementComponentManager;
import com.tencent.tinker.loader.hotplug.interceptor.HandlerMessageInterceptor;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MHMessageHandler implements HandlerMessageInterceptor.MessageHandler {
    private static final int LAUNCH_ACTIVITY;
    private static final String TAG = "Tinker.MHMsgHndlr";
    private final Context mContext;

    static {
        int i = 100;
        if (Build.VERSION.SDK_INT < 27) {
            try {
                i = ShareReflectUtil.findField(Class.forName("android.app.ActivityThread$H"), "LAUNCH_ACTIVITY").getInt((Object) null);
            } catch (Throwable unused) {
            }
        }
        LAUNCH_ACTIVITY = i;
    }

    public MHMessageHandler(Context context) {
        Context baseContext;
        while ((context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.mContext = context;
    }

    private <T> void copyInstanceFields(T t, T t2) {
        if (t != null && t2 != null) {
            for (Class cls = t.getClass(); !cls.equals(Object.class); cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                        if (!field.isAccessible()) {
                            field.setAccessible(true);
                        }
                        try {
                            field.set(t2, field.get(t));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    private void fixActivityScreenOrientation(Object obj, int i) {
        if (i == -1) {
            i = 2;
        }
        try {
            Object obj2 = ShareReflectUtil.findField(obj, XWalkReaderBasePlugin.PARAM_KEY_TOKEN).get(obj);
            Object invoke = ShareReflectUtil.findMethod(Class.forName("android.app.ActivityManagerNative"), "getDefault", (Class<?>[]) new Class[0]).invoke((Object) null, new Object[0]);
            ShareReflectUtil.findMethod(invoke, "setRequestedOrientation", (Class<?>[]) new Class[]{IBinder.class, Integer.TYPE}).invoke(invoke, new Object[]{obj2, Integer.valueOf(i)});
        } catch (Throwable th) {
            ShareTinkerLog.m106531e(TAG, "Failed to fix screen orientation.", th);
        }
    }

    private void fixStubActivityInfo(ActivityInfo activityInfo, ActivityInfo activityInfo2) {
        copyInstanceFields(activityInfo2, activityInfo);
    }

    public boolean handleMessage(Message message) {
        if (message.what == LAUNCH_ACTIVITY) {
            try {
                Object obj = message.obj;
                if (obj == null) {
                    ShareTinkerLog.m106534w(TAG, "msg: [" + message.what + "] has no 'obj' value.", new Object[0]);
                    return false;
                }
                Intent intent = (Intent) ShareReflectUtil.findField(obj, "intent").get(obj);
                if (intent == null) {
                    ShareTinkerLog.m106534w(TAG, "cannot fetch intent from message received by mH.", new Object[0]);
                    return false;
                }
                ShareIntentUtil.fixIntentClassLoader(intent, this.mContext.getClassLoader());
                ComponentName componentName = (ComponentName) intent.getParcelableExtra(EnvConsts.INTENT_EXTRA_OLD_COMPONENT);
                if (componentName == null) {
                    ShareTinkerLog.m106534w(TAG, "oldComponent was null, start " + intent.getComponent() + " next.", new Object[0]);
                    return false;
                }
                ActivityInfo activityInfo = (ActivityInfo) ShareReflectUtil.findField(obj, "activityInfo").get(obj);
                if (activityInfo == null) {
                    return false;
                }
                ActivityInfo queryActivityInfo = IncrementComponentManager.queryActivityInfo(componentName.getClassName());
                if (queryActivityInfo == null) {
                    ShareTinkerLog.m106531e(TAG, "Failed to query target activity's info, perhaps the target is not hotpluged component. Target: " + componentName.getClassName(), new Object[0]);
                    return false;
                }
                fixActivityScreenOrientation(obj, queryActivityInfo.screenOrientation);
                fixStubActivityInfo(activityInfo, queryActivityInfo);
                intent.setComponent(componentName);
                intent.removeExtra(EnvConsts.INTENT_EXTRA_OLD_COMPONENT);
            } catch (Throwable th) {
                ShareTinkerLog.m106531e(TAG, "exception in handleMessage.", th);
            }
        }
        return false;
    }
}
