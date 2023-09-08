package com.tencent.p014mm.sdk.platformtools;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.res.TypedArray;
import android.os.Build;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.sdk.platformtools.AndroidOSafety */
public class AndroidOSafety {
    public static final int ID_ANDROID_O_SAFETY = 1221;
    public static final int KEY_SAFETY_IGNORE_BY_IS_FLOATING = 0;
    public static final int KEY_SAFETY_IGNORE_BY_IS_SWIPE_TO_DISMISS = 1;
    public static final int KEY_SAFETY_PREPARE_FAILED = 2;
    public static final int SAFETY_IGNORE_BY_IS_FLOATING = 2;
    public static final int SAFETY_IGNORE_BY_IS_SWIPE_TO_DISMISS = 3;
    public static final int SAFETY_NORMAL = 0;
    public static final int SAFETY_PREPARE_FAILED = 4;
    public static final int SAFETY_TO_OPAQUE = 1;
    private static final String TAG = "MicroMsg.AndroidOSafety";
    private static ISafetyCallback sISafetyCallback;
    private static boolean sPrepared;
    private static int sRealTargetVersion;
    private static int[] sStyleableWindow;
    private static int sStyleableWindowIsFloating;
    private static int sStyleableWindowIsTranslucent;
    private static int sStyleableWindowSwipeToDismiss;

    /* renamed from: com.tencent.mm.sdk.platformtools.AndroidOSafety$ISafetyCallback */
    public interface ISafetyCallback {
        void invokeToOpaque(Activity activity);

        void reportState(int i, Activity activity);

        boolean supportSwipe(Activity activity);
    }

    public static boolean checkIfNeedAndroidOSafty(ApplicationInfo applicationInfo) {
        if (Build.VERSION.SDK_INT != 26) {
            return false;
        }
        return sRealTargetVersion > 26 || applicationInfo.targetSdkVersion > 26;
    }

    public static int getRealTargetVersion() {
        return sRealTargetVersion;
    }

    private static int[] getStyleableWindow() {
        return sStyleableWindow;
    }

    private static int getWindowIsFloating() {
        return sStyleableWindowIsFloating;
    }

    private static int getWindowIsTranslucent() {
        return sStyleableWindowIsTranslucent;
    }

    private static int getWindowSwipeToDismiss() {
        return sStyleableWindowSwipeToDismiss;
    }

    public static boolean isFixedOrientationLandscape(int i) {
        return i == 0 || i == 6 || i == 8 || i == 11;
    }

    public static boolean isFixedOrientationPortrait(int i) {
        return i == 1 || i == 7 || i == 9 || i == 12;
    }

    private static boolean prepare() {
        if (sPrepared) {
            return true;
        }
        synchronized (AndroidOSafety.class) {
            if (sPrepared) {
                return true;
            }
            try {
                Class<?> cls = Class.forName("com.android.internal.R$styleable");
                Field declaredField = cls.getDeclaredField("Window");
                declaredField.setAccessible(true);
                sStyleableWindow = (int[]) declaredField.get(cls);
                Field declaredField2 = cls.getDeclaredField("Window_windowIsTranslucent");
                declaredField2.setAccessible(true);
                sStyleableWindowIsTranslucent = ((Integer) declaredField2.get(cls)).intValue();
                Field declaredField3 = cls.getDeclaredField("Window_windowSwipeToDismiss");
                declaredField3.setAccessible(true);
                sStyleableWindowSwipeToDismiss = ((Integer) declaredField3.get(cls)).intValue();
                Field declaredField4 = cls.getDeclaredField("Window_windowIsFloating");
                declaredField4.setAccessible(true);
                sStyleableWindowIsFloating = ((Integer) declaredField4.get(cls)).intValue();
                sPrepared = true;
                return true;
            } catch (ClassNotFoundException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                return false;
            } catch (NoSuchFieldException e2) {
                Log.printErrStackTrace(TAG, e2, "", new Object[0]);
                return false;
            } catch (IllegalAccessException e3) {
                Log.printErrStackTrace(TAG, e3, "", new Object[0]);
                return false;
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
                return false;
            }
        }
    }

    public static void replaceTargetVersion(ApplicationInfo applicationInfo) {
        int i;
        if (Build.VERSION.SDK_INT == 26 && (i = applicationInfo.targetSdkVersion) > 26) {
            sRealTargetVersion = i;
            applicationInfo.targetSdkVersion = 26;
            Log.m105925i(TAG, "replaceTargetVersion %s %s", 26, Integer.valueOf(sRealTargetVersion));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean safety(android.app.Activity r8, int r9) {
        /*
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()
            boolean r0 = checkIfNeedAndroidOSafty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x00ac
            boolean r0 = isFixedOrientationLandscape(r9)
            if (r0 != 0) goto L_0x0018
            boolean r9 = isFixedOrientationPortrait(r9)
            if (r9 != 0) goto L_0x0018
            return r1
        L_0x0018:
            int r9 = safetyImpl(r8)
            r0 = 4
            r2 = 3
            java.lang.String r3 = "MicroMsg.AndroidOSafety"
            r4 = 2
            r5 = 0
            if (r9 != r1) goto L_0x005b
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r8
            int r7 = r8.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r1] = r7
            java.lang.String r7 = "invokeToOpaque %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            com.tencent.mm.sdk.platformtools.AndroidOSafety$ISafetyCallback r6 = sISafetyCallback
            if (r6 == 0) goto L_0x0077
            boolean r6 = r6.supportSwipe(r8)
            if (r6 != 0) goto L_0x0055
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r8
            int r7 = r8.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r1] = r7
            java.lang.String r7 = "not support swipe %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r7, r6)
            goto L_0x008c
        L_0x0055:
            com.tencent.mm.sdk.platformtools.AndroidOSafety$ISafetyCallback r3 = sISafetyCallback
            r3.invokeToOpaque(r8)
            goto L_0x0077
        L_0x005b:
            if (r9 == r4) goto L_0x0079
            if (r9 != r2) goto L_0x0060
            goto L_0x0079
        L_0x0060:
            if (r9 != r0) goto L_0x0077
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r8
            int r7 = r8.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r1] = r7
            java.lang.String r7 = "prepare Failed  %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r7, r6)
            goto L_0x008c
        L_0x0077:
            r3 = 1
            goto L_0x008d
        L_0x0079:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r8
            int r7 = r8.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r1] = r7
            java.lang.String r7 = "ignore by IS_FLOATING or IS_SWIPE_TO_DISMISS  %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r7, r6)
        L_0x008c:
            r3 = 0
        L_0x008d:
            com.tencent.mm.sdk.platformtools.AndroidOSafety$ISafetyCallback r6 = sISafetyCallback
            if (r6 == 0) goto L_0x00ab
            r6.reportState(r9, r8)
            if (r9 != r4) goto L_0x009c
            com.tencent.mm.sdk.platformtools.AndroidOSafety$ISafetyCallback r9 = sISafetyCallback
            r9.reportState(r5, r8)
            goto L_0x00ab
        L_0x009c:
            if (r9 != r2) goto L_0x00a4
            com.tencent.mm.sdk.platformtools.AndroidOSafety$ISafetyCallback r9 = sISafetyCallback
            r9.reportState(r1, r8)
            goto L_0x00ab
        L_0x00a4:
            if (r9 != r0) goto L_0x00ab
            com.tencent.mm.sdk.platformtools.AndroidOSafety$ISafetyCallback r9 = sISafetyCallback
            r9.reportState(r4, r8)
        L_0x00ab:
            r1 = r3
        L_0x00ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.AndroidOSafety.safety(android.app.Activity, int):boolean");
    }

    private static int safetyImpl(Activity activity) {
        if (prepare()) {
            int[] styleableWindow = getStyleableWindow();
            int windowIsTranslucent = getWindowIsTranslucent();
            int windowSwipeToDismiss = getWindowSwipeToDismiss();
            int windowIsFloating = getWindowIsFloating();
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(styleableWindow);
            boolean z = obtainStyledAttributes.getBoolean(windowIsTranslucent, false);
            boolean z2 = !obtainStyledAttributes.hasValue(windowSwipeToDismiss) && obtainStyledAttributes.getBoolean(windowSwipeToDismiss, false);
            boolean z3 = obtainStyledAttributes.getBoolean(windowIsFloating, false);
            obtainStyledAttributes.recycle();
            Log.m105925i(TAG, "activity %s, isTranslucent %s, isFloating %s, isSwipeToDismiss %s", activity, Boolean.valueOf(z), Boolean.valueOf(z3), Boolean.valueOf(z2));
            if (z) {
                return 1;
            }
            if (z3) {
                return 2;
            }
            return z2 ? 3 : 0;
        }
        Log.m105921e(TAG, "prepare Failed %s", activity);
        return 4;
    }

    public static void setISafetyCallback(ISafetyCallback iSafetyCallback) {
        sISafetyCallback = iSafetyCallback;
    }
}
