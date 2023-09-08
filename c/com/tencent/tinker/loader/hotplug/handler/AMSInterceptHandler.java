package com.tencent.tinker.loader.hotplug.handler;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.hotplug.interceptor.ServiceBinderInterceptor;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import java.lang.reflect.Method;

public class AMSInterceptHandler implements ServiceBinderInterceptor.BinderInvocationHandler {
    private static final int INTENT_SENDER_ACTIVITY;
    private static final String TAG = "Tinker.AMSIntrcptHndlr";
    private static final int[] TRANSLUCENT_ATTR_ID = {16842840};
    private final Context mContext;

    static {
        int i = 2;
        if (Build.VERSION.SDK_INT < 27) {
            try {
                i = ((Integer) ShareReflectUtil.findField((Class<?>) ActivityManager.class, "INTENT_SENDER_ACTIVITY").get((Object) null)).intValue();
            } catch (Throwable unused) {
            }
        }
        INTENT_SENDER_ACTIVITY = i;
    }

    public AMSInterceptHandler(Context context) {
        Context baseContext;
        while ((context instanceof ContextWrapper) && (baseContext = ((ContextWrapper) context).getBaseContext()) != null) {
            context = baseContext;
        }
        this.mContext = context;
    }

    private Object handleGetIntentSender(Object obj, Method method, Object[] objArr) {
        int i = 0;
        while (true) {
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (objArr[i] instanceof Intent[]) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1 && objArr[0].intValue() == INTENT_SENDER_ACTIVITY) {
            Intent[] intentArr = objArr[i];
            for (int i2 = 0; i2 < intentArr.length; i2++) {
                Intent intent = new Intent(intentArr[i2]);
                processActivityIntent(intent);
                intentArr[i2] = intent;
            }
        }
        return method.invoke(obj, objArr);
    }

    private Object handleStartActivities(Object obj, Method method, Object[] objArr) {
        int i = 0;
        while (true) {
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (objArr[i] instanceof Intent[]) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            Intent[] intentArr = objArr[i];
            for (int i2 = 0; i2 < intentArr.length; i2++) {
                Intent intent = new Intent(intentArr[i2]);
                processActivityIntent(intent);
                intentArr[i2] = intent;
            }
        }
        return method.invoke(obj, objArr);
    }

    private Object handleStartActivity(Object obj, Method method, Object[] objArr) {
        int i = 0;
        while (true) {
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (objArr[i] instanceof Intent) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            Intent intent = new Intent((Intent) objArr[i]);
            processActivityIntent(intent);
            objArr[i] = intent;
        }
        return method.invoke(obj, objArr);
    }

    private boolean hasTransparentTheme(ActivityInfo activityInfo) {
        int themeResource = activityInfo.getThemeResource();
        Resources.Theme newTheme = this.mContext.getResources().newTheme();
        newTheme.applyStyle(themeResource, true);
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = newTheme.obtainStyledAttributes(TRANSLUCENT_ATTR_ID);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
            return z;
        } catch (Throwable unused) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void processActivityIntent(android.content.Intent r6) {
        /*
            r5 = this;
            android.content.ComponentName r0 = r6.getComponent()
            r1 = 0
            if (r0 == 0) goto L_0x001b
            android.content.ComponentName r0 = r6.getComponent()
            java.lang.String r1 = r0.getPackageName()
            android.content.ComponentName r0 = r6.getComponent()
            java.lang.String r0 = r0.getClassName()
        L_0x0017:
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0042
        L_0x001b:
            android.content.Context r0 = r5.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r2 = 0
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r6, r2)
            if (r0 != 0) goto L_0x002c
            android.content.pm.ResolveInfo r0 = com.tencent.tinker.loader.hotplug.IncrementComponentManager.resolveIntent(r6)
        L_0x002c:
            if (r0 == 0) goto L_0x0041
            android.content.IntentFilter r2 = r0.filter
            if (r2 == 0) goto L_0x0041
            java.lang.String r3 = "android.intent.category.DEFAULT"
            boolean r2 = r2.hasCategory(r3)
            if (r2 == 0) goto L_0x0041
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r1 = r0.packageName
            java.lang.String r0 = r0.name
            goto L_0x0017
        L_0x0041:
            r0 = r1
        L_0x0042:
            boolean r2 = com.tencent.tinker.loader.hotplug.IncrementComponentManager.isIncrementActivity(r1)
            if (r2 == 0) goto L_0x0059
            android.content.pm.ActivityInfo r2 = com.tencent.tinker.loader.hotplug.IncrementComponentManager.queryActivityInfo(r1)
            boolean r3 = r5.hasTransparentTheme(r2)
            int r2 = r2.launchMode
            java.lang.String r2 = com.tencent.tinker.loader.hotplug.ActivityStubManager.assignStub(r1, r2, r3)
            r5.storeAndReplaceOriginalComponentName(r6, r0, r1, r2)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.hotplug.handler.AMSInterceptHandler.processActivityIntent(android.content.Intent):void");
    }

    private void storeAndReplaceOriginalComponentName(Intent intent, String str, String str2, String str3) {
        ComponentName componentName = new ComponentName(str, str2);
        ShareIntentUtil.fixIntentClassLoader(intent, this.mContext.getClassLoader());
        intent.putExtra(EnvConsts.INTENT_EXTRA_OLD_COMPONENT, componentName);
        intent.setComponent(new ComponentName(str, str3));
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        return "startActivity".equals(name) ? handleStartActivity(obj, method, objArr) : "startActivities".equals(name) ? handleStartActivities(obj, method, objArr) : "startActivityAndWait".equals(name) ? handleStartActivity(obj, method, objArr) : "startActivityWithConfig".equals(name) ? handleStartActivity(obj, method, objArr) : "startActivityAsUser".equals(name) ? handleStartActivity(obj, method, objArr) : "getIntentSender".equals(name) ? handleGetIntentSender(obj, method, objArr) : method.invoke(obj, objArr);
    }
}
