package com.tencent.p014mm.sdk.platformtools;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import zt3.C119157j;

/* renamed from: com.tencent.mm.sdk.platformtools.AccessibilityUtil */
public class AccessibilityUtil {
    private static String TAG = "AccessibilityUtil";
    private static HashSet<String> spokenServiceBlackSet;

    static {
        HashSet<String> hashSet = new HashSet<>();
        spokenServiceBlackSet = hashSet;
        hashSet.add("com.eg.android.AlipayGphone/com.alipay.mobile.rome.voicebroadcast.a11y.A11yService");
        spokenServiceBlackSet.add("com.apowersoft.mirror/.service.ListenAppService");
        spokenServiceBlackSet.add("com.tencent.android.qqdownloader/com.tencent.nucleus.manager.accessibility.YYBAccessibilityService");
        spokenServiceBlackSet.add("com.huawei.recsys/.service.PortraitDaService");
        spokenServiceBlackSet.add("com.samsung.android.app.sreminder/.phone.shoppingassistant.ShoppingAssistantService");
        spokenServiceBlackSet.add("com.samsung.android.app.sreminder/.shoppingassistant.ShoppingAssistantService");
        spokenServiceBlackSet.add("com.liuzh.quickly/.accservice.QuicklyAccService");
        spokenServiceBlackSet.add("com.kugou.android.ringtone/.ringcommon.util.permission.accessibilitysuper.service.AccessibilitySuperService");
        spokenServiceBlackSet.add("com.tencent.qqpinyin/.accessibility.EmotionHelperService");
        spokenServiceBlackSet.add("com.samsung.android.bixbytouch/com.samsung.android.bixbytouch.library.shopping.ShoppingAccessibilityService");
        spokenServiceBlackSet.add("org.autojs.autojs/com.stardust.autojs.core.accessibility.AccessibilityService");
        spokenServiceBlackSet.add("com.whatsbug.litiaotiao/.MyAccessibilityService");
        spokenServiceBlackSet.add("com.auto.greenskipad/com.auto.skip.service.NewTiaoGuoService");
        spokenServiceBlackSet.add("com.hihonor.awareness/.server.pageanalysis.AccessibleInfoStuck");
        spokenServiceBlackSet.add("com.coloros.colordirectservice/.ColorTextAccessibilityService");
        spokenServiceBlackSet.add("com.huawei.contentsensor/.accessibility.ContentAccessibilityService");
        spokenServiceBlackSet.add("com.huawei.hiai/.awareness.service.AwarenessAccessibilityService");
        spokenServiceBlackSet.add("cn.litiaotiao.app/com.litiaotiao.app.LttService");
    }

    /* access modifiers changed from: private */
    public static void printEnabledAccessibilityServiceInfo(AccessibilityManager accessibilityManager) {
        Log.m105924i(TAG, "printEnabledAccessibilityServiceInfo");
        try {
            String str = TAG;
            Log.m105924i(str, "printEnabledAccessibilityServiceInfo enabled = " + accessibilityManager.isEnabled());
            for (AccessibilityServiceInfo accessibilityServiceInfo : accessibilityManager.getEnabledAccessibilityServiceList(-1)) {
                Log.m105925i(TAG, "enabledAccessibilityServiceInfo : %s", accessibilityServiceInfo.toString());
            }
        } catch (Throwable th) {
            Log.m105921e(TAG, "printEnabledAccessibilityServiceInfo error : %s", th.getMessage());
        }
    }

    public static void recoverAccessibilityEnable() {
        try {
            Log.m105924i(TAG, "recoverAccessibilityEnable");
            AccessibilityManager accessibilityManager = (AccessibilityManager) MMApplicationContext.getContext().getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            Field declaredField = AccessibilityManager.class.getDeclaredField("mIsHighTextContrastEnabled");
            declaredField.setAccessible(true);
            boolean booleanValue = ((Boolean) declaredField.get(accessibilityManager)).booleanValue();
            String str = TAG;
            Log.m105924i(str, "recoverAccessibilityEnable enabledNow = " + isEnabled);
            if (!isEnabled) {
                recoverAccessibilityEnable(accessibilityManager, booleanValue);
            }
        } catch (Throwable th) {
            String str2 = TAG;
            Log.m105924i(str2, "enableAccessibility failed -> " + th.getMessage());
        }
    }

    public static void smartDisableAccessibility() {
        try {
            Log.m105924i(TAG, "smartDisableAccessibility");
            final AccessibilityManager accessibilityManager = (AccessibilityManager) MMApplicationContext.getContext().getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            Field declaredField = AccessibilityManager.class.getDeclaredField("mIsHighTextContrastEnabled");
            declaredField.setAccessible(true);
            boolean booleanValue = ((Boolean) declaredField.get(accessibilityManager)).booleanValue();
            if (!isEnabled) {
                recoverAccessibilityEnable(accessibilityManager, booleanValue);
            }
            if (!WeChatEnvironment.isCoolassistEnv()) {
                if (!BuildInfo.IS_FLAVOR_RED) {
                    for (AccessibilityServiceInfo id : accessibilityManager.getEnabledAccessibilityServiceList(1)) {
                        if (!spokenServiceBlackSet.contains(id.getId())) {
                            Log.m105924i(TAG, "has spoken service, return");
                            printEnabledAccessibilityServiceInfo(accessibilityManager);
                            return;
                        }
                    }
                    if (accessibilityManager.isTouchExplorationEnabled()) {
                        Log.m105924i(TAG, "isTouchExplorationEnabled is true, return");
                        return;
                    }
                    Log.m105924i(TAG, "disableAccessibility");
                    Method declaredMethod = AccessibilityManager.class.getDeclaredMethod("setStateLocked", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    int i = booleanValue ? 4 : 0;
                    declaredMethod.invoke(accessibilityManager, new Object[]{Integer.valueOf(i)});
                    Log.m105925i(TAG, "smartDisableAccessibility setStateLocked is invoked, flag = %d", Integer.valueOf(i));
                    ((C119157j) C119157j.f356862d).mo183875f(new Runnable() {
                        public void run() {
                            AccessibilityUtil.printEnabledAccessibilityServiceInfo(accessibilityManager);
                        }
                    });
                    return;
                }
            }
            Log.m105924i(TAG, "isCoolassistEnv or flavor red, return");
        } catch (Throwable th) {
            String str = TAG;
            Log.m105928w(str, "disableAccessibility exception -> " + th.getMessage());
        }
    }

    private static void recoverAccessibilityEnable(AccessibilityManager accessibilityManager, boolean z) {
        try {
            Log.m105924i(TAG, "recoverAccessibilityEnable");
            Method declaredMethod = AccessibilityManager.class.getDeclaredMethod("setStateLocked", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            int i = accessibilityManager.isTouchExplorationEnabled() ? 3 : 1;
            if (z) {
                i |= 4;
            }
            declaredMethod.invoke(accessibilityManager, new Object[]{Integer.valueOf(i)});
            Log.m105925i(TAG, "recoverAccessibilityEnable setStateLocked is invoked, flag = %d", Integer.valueOf(i));
        } catch (Throwable th) {
            Log.m105921e(TAG, "recoverAccessibilityEnable error : %s", th.getMessage());
        }
    }
}
