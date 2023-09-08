package com.tencent.kinda.framework.widget.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.kinda.framework.app.MainFragment;
import com.tencent.kinda.framework.widget.base.BaseFragment;
import com.tencent.kinda.framework.widget.base.IEventFragment;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.IUIPage;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k20.C9556a;

public class ActivityController {
    public static final String TAG = "MicroMsg.ActivityController";
    private static boolean activityCreating = false;
    private static WeakReference<Activity> currentActivity;
    private static HashMap<Integer, BaseFragment> fragmentPond = new HashMap<>();
    private static List<Integer> pendingList = new ArrayList();
    private byte _hellAccFlag_;

    public static void attach(Activity activity) {
        Log.m105925i(TAG, "attach %s", activity);
        synchronized (ActivityController.class) {
            currentActivity = new WeakReference<>(activity);
            if (pendingList.size() > 0) {
                IEventFragment iEventFragment = (IEventFragment) activity;
                if (!activity.isFinishing()) {
                    for (Integer num : pendingList) {
                        BaseFragment baseFragment = fragmentPond.get(num);
                        if (baseFragment != null) {
                            iEventFragment.addFragment(baseFragment);
                        }
                    }
                    pendingList.clear();
                } else {
                    return;
                }
            }
            activityCreating = false;
            Log.m105924i(TAG, "activityCreating has set false.");
        }
    }

    public static void attachOnlyActivity(Activity activity) {
        Log.m105925i(TAG, "attachOnlyActivity %s", activity);
        synchronized (ActivityController.class) {
            currentActivity = new WeakReference<>(activity);
        }
    }

    public static void detach(Activity activity) {
        Log.m105925i(TAG, "detach %s", activity);
        synchronized (ActivityController.class) {
            WeakReference<Activity> weakReference = currentActivity;
            if (weakReference != null && activity == weakReference.get()) {
                currentActivity = null;
            }
            pendingList.clear();
            activityCreating = false;
        }
    }

    private static boolean isTopKindaActivity() {
        WeakReference<Activity> weakReference = currentActivity;
        return weakReference != null && (weakReference.get() instanceof UIPageFragmentActivity) && currentActivity.get().equals(KindaContext.get());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void remove(com.tencent.kinda.gen.IUIModal r6) {
        /*
            java.lang.Class<com.tencent.kinda.framework.widget.tools.ActivityController> r0 = com.tencent.kinda.framework.widget.tools.ActivityController.class
            monitor-enter(r0)
            java.lang.String r1 = "MicroMsg.ActivityController"
            java.lang.String r2 = "remove modal: %s, %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x008b }
            r4 = 0
            java.lang.String r5 = r6.getReportUrl()     // Catch:{ all -> 0x008b }
            r3[r4] = r5     // Catch:{ all -> 0x008b }
            r4 = 1
            int r5 = r6.hashCode()     // Catch:{ all -> 0x008b }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008b }
            r3[r4] = r5     // Catch:{ all -> 0x008b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r3)     // Catch:{ all -> 0x008b }
            java.util.HashMap<java.lang.Integer, com.tencent.kinda.framework.widget.base.BaseFragment> r1 = fragmentPond     // Catch:{ all -> 0x008b }
            int r2 = r6.hashCode()     // Catch:{ all -> 0x008b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008b }
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x008b }
            com.tencent.kinda.framework.widget.base.BaseFragment r1 = (com.tencent.kinda.framework.widget.base.BaseFragment) r1     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x003f
            androidx.fragment.app.FragmentActivity r6 = r1.getActivity()     // Catch:{ all -> 0x008b }
            boolean r2 = r6 instanceof com.tencent.kinda.framework.widget.base.IEventFragment     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0089
            com.tencent.kinda.framework.widget.base.IEventFragment r6 = (com.tencent.kinda.framework.widget.base.IEventFragment) r6     // Catch:{ all -> 0x008b }
            r6.removeModal(r1)     // Catch:{ all -> 0x008b }
            goto L_0x0089
        L_0x003f:
            java.util.HashMap<java.lang.Integer, com.tencent.kinda.framework.widget.base.BaseFragment> r1 = fragmentPond     // Catch:{ all -> 0x008b }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x008b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x008b }
        L_0x0049:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0079
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x008b }
            com.tencent.kinda.framework.widget.base.BaseFragment r2 = (com.tencent.kinda.framework.widget.base.BaseFragment) r2     // Catch:{ all -> 0x008b }
            java.lang.String r3 = r2.getReportUrl()     // Catch:{ all -> 0x008b }
            java.lang.String r4 = r6.getReportUrl()     // Catch:{ all -> 0x008b }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x0049
            java.lang.String r6 = "MicroMsg.ActivityController"
            java.lang.String r1 = "remove same url modal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)     // Catch:{ all -> 0x008b }
            androidx.fragment.app.FragmentActivity r6 = r2.getActivity()     // Catch:{ all -> 0x008b }
            boolean r1 = r6 instanceof com.tencent.kinda.framework.widget.base.IEventFragment     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0077
            com.tencent.kinda.framework.widget.base.IEventFragment r6 = (com.tencent.kinda.framework.widget.base.IEventFragment) r6     // Catch:{ all -> 0x008b }
            r6.removeModal(r2)     // Catch:{ all -> 0x008b }
        L_0x0077:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x0079:
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x008b }
            r1 = 965(0x3c5, float:1.352E-42)
            r2 = 53
            r6.mo175911u(r1, r2)     // Catch:{ all -> 0x008b }
            java.lang.String r6 = "MicroMsg.ActivityController"
            java.lang.String r1 = "can't find associated activity"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            return
        L_0x008b:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008b }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.tools.ActivityController.remove(com.tencent.kinda.gen.IUIModal):void");
    }

    public static void removeAll() {
        Log.m105924i(TAG, "removeAllFragments");
        WeakReference<Activity> weakReference = currentActivity;
        if (weakReference == null || weakReference.get() == null) {
            Log.m105920e(TAG, "currentActivity is null, needn't remove any modal.");
            return;
        }
        Activity activity = currentActivity.get();
        if (activity != null && !activity.isFinishing()) {
            Log.m105928w(TAG, "remove all modal");
            if (fragmentPond.size() > 0) {
                fragmentPond.clear();
                C115669n.INSTANCE.mo175911u(965, 52);
            }
            activity.finish();
        }
    }

    public static void resetFlag() {
        activityCreating = false;
        Log.m105924i(TAG, "activityCreating has set false.");
    }

    public static BaseFragment resolveFragment(Bundle bundle) {
        int i = bundle.getInt(ConstantsKinda.INTENT_TARGET, 0);
        if (fragmentPond.containsKey(Integer.valueOf(i))) {
            return fragmentPond.remove(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void startNewUIModal(com.tencent.kinda.gen.IUIModal r11) {
        /*
            java.lang.Class<com.tencent.kinda.framework.widget.tools.ActivityController> r0 = com.tencent.kinda.framework.widget.tools.ActivityController.class
            monitor-enter(r0)
            java.lang.ref.WeakReference<android.app.Activity> r1 = currentActivity     // Catch:{ all -> 0x00fa }
            r2 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x00fa }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x00fa }
            boolean r3 = r1 instanceof com.tencent.p014mm.framework.app.UIPageFragmentActivity     // Catch:{ all -> 0x00fa }
            if (r3 == 0) goto L_0x001e
            java.util.HashMap<java.lang.Integer, com.tencent.kinda.framework.widget.base.BaseFragment> r3 = fragmentPond     // Catch:{ all -> 0x00fa }
            int r3 = r3.size()     // Catch:{ all -> 0x00fa }
            if (r3 != 0) goto L_0x001e
            com.tencent.mm.framework.app.UIPageFragmentActivity r1 = (com.tencent.p014mm.framework.app.UIPageFragmentActivity) r1     // Catch:{ all -> 0x00fa }
            r1.f195306d = r2     // Catch:{ all -> 0x00fa }
        L_0x001e:
            int r1 = r11.hashCode()     // Catch:{ all -> 0x00fa }
            java.util.HashMap<java.lang.Integer, com.tencent.kinda.framework.widget.base.BaseFragment> r3 = fragmentPond     // Catch:{ all -> 0x00fa }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00fa }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x00fa }
            if (r3 != 0) goto L_0x0040
            com.tencent.kinda.framework.app.ModalFragment r3 = new com.tencent.kinda.framework.app.ModalFragment     // Catch:{ all -> 0x00fa }
            r3.<init>()     // Catch:{ all -> 0x00fa }
            r3.attachModal(r11)     // Catch:{ all -> 0x00fa }
            java.util.HashMap<java.lang.Integer, com.tencent.kinda.framework.widget.base.BaseFragment> r11 = fragmentPond     // Catch:{ all -> 0x00fa }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00fa }
            r11.put(r4, r3)     // Catch:{ all -> 0x00fa }
            goto L_0x004d
        L_0x0040:
            java.util.HashMap<java.lang.Integer, com.tencent.kinda.framework.widget.base.BaseFragment> r11 = fragmentPond     // Catch:{ all -> 0x00fa }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00fa }
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x00fa }
            r3 = r11
            com.tencent.kinda.framework.widget.base.BaseFragment r3 = (com.tencent.kinda.framework.widget.base.BaseFragment) r3     // Catch:{ all -> 0x00fa }
        L_0x004d:
            boolean r11 = isTopKindaActivity()     // Catch:{ all -> 0x00fa }
            if (r11 == 0) goto L_0x0068
            java.lang.ref.WeakReference<android.app.Activity> r11 = currentActivity     // Catch:{ all -> 0x00fa }
            java.lang.Object r11 = r11.get()     // Catch:{ all -> 0x00fa }
            com.tencent.kinda.framework.widget.base.IEventFragment r11 = (com.tencent.kinda.framework.widget.base.IEventFragment) r11     // Catch:{ all -> 0x00fa }
            r11.addFragment(r3)     // Catch:{ all -> 0x00fa }
            java.lang.String r11 = "MicroMsg.ActivityController"
            java.lang.String r1 = "startNewUIModal by an existing activity."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ all -> 0x00fa }
            goto L_0x00f8
        L_0x0068:
            java.util.List<java.lang.Integer> r11 = pendingList     // Catch:{ all -> 0x00fa }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x00fa }
            r11.add(r1)     // Catch:{ all -> 0x00fa }
            boolean r11 = activityCreating     // Catch:{ all -> 0x00fa }
            if (r11 == 0) goto L_0x007f
            java.lang.String r11 = "MicroMsg.ActivityController"
            java.lang.String r1 = "startNewUIModal failed, because activityCreating is true!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)     // Catch:{ all -> 0x00fa }
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            return
        L_0x007f:
            android.content.Context r11 = com.tencent.kinda.framework.widget.tools.KindaContext.get()     // Catch:{ all -> 0x00fa }
            if (r11 != 0) goto L_0x008f
            java.lang.String r11 = "MicroMsg.ActivityController"
            java.lang.String r1 = "startNewUIModal failed, because KindaContext get null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r11, r1)     // Catch:{ all -> 0x00fa }
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            return
        L_0x008f:
            activityCreating = r2     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "MicroMsg.ActivityController"
            java.lang.String r3 = "activityCreating has set true."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)     // Catch:{ all -> 0x00fa }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00fa }
            java.lang.Class<com.tencent.mm.framework.app.UIPageFragmentActivity> r3 = com.tencent.p014mm.framework.app.UIPageFragmentActivity.class
            r1.<init>(r11, r3)     // Catch:{ all -> 0x00fa }
            boolean r3 = r11 instanceof android.app.Activity     // Catch:{ all -> 0x00fa }
            if (r3 == 0) goto L_0x00b1
            r3 = r11
            android.app.Activity r3 = (android.app.Activity) r3     // Catch:{ all -> 0x00fa }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ all -> 0x00fa }
            if (r3 == 0) goto L_0x00b1
            java.lang.String r4 = "extra_use_system_default_enter_exit_anim"
            r3.putExtra(r4, r2)     // Catch:{ all -> 0x00fa }
        L_0x00b1:
            java.lang.String r2 = "key_support_swipe_back"
            r9 = 0
            r1.putExtra(r2, r9)     // Catch:{ all -> 0x00fa }
            k20.a r10 = new k20.a     // Catch:{ all -> 0x00fa }
            r10.<init>()     // Catch:{ all -> 0x00fa }
            r10.mo10233c(r1)     // Catch:{ all -> 0x00fa }
            java.lang.Object[] r2 = r10.mo10232b()     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "com/tencent/kinda/framework/widget/tools/ActivityController"
            java.lang.String r4 = "startNewUIModal"
            java.lang.String r5 = "(Lcom/tencent/kinda/gen/IUIModal;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            r1 = r11
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00fa }
            java.lang.Object r1 = r10.mo10231a(r9)     // Catch:{ all -> 0x00fa }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x00fa }
            r11.startActivity(r1)     // Catch:{ all -> 0x00fa }
            java.lang.String r2 = "com/tencent/kinda/framework/widget/tools/ActivityController"
            java.lang.String r3 = "startNewUIModal"
            java.lang.String r4 = "(Lcom/tencent/kinda/gen/IUIModal;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r11
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00fa }
            java.lang.String r11 = "MicroMsg.ActivityController"
            java.lang.String r1 = "startNewUIModal by a new activity."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)     // Catch:{ all -> 0x00fa }
        L_0x00f8:
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            return
        L_0x00fa:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fa }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.tools.ActivityController.startNewUIModal(com.tencent.kinda.gen.IUIModal):void");
    }

    public static void startNewUIPage(IUIPage iUIPage, ITransmitKvData iTransmitKvData, int i) {
        Intent intent;
        Context context;
        ITransmitKvData iTransmitKvData2 = iTransmitKvData;
        int i2 = i;
        Class<UIPageFragmentActivity> cls = UIPageFragmentActivity.class;
        WeakReference<Activity> weakReference = currentActivity;
        if (weakReference != null) {
            Activity activity = weakReference.get();
            if (activity instanceof UIPageFragmentActivity) {
                ((UIPageFragmentActivity) activity).f195306d = false;
            }
        }
        String string = iTransmitKvData2.getString("KindaWebViewURL");
        String string2 = iTransmitKvData2.getString("KindaTinyAppUserName");
        String string3 = iTransmitKvData2.getString("KindaTinyAppPath");
        String string4 = iTransmitKvData2.getString("KindaTinyAppVersion");
        int i3 = Util.getInt(iTransmitKvData2.getString("KindaTinyAppScene"), 0);
        int i4 = Util.getInt(iTransmitKvData2.getString("KindaTinyAppType"), 0);
        MainFragment mainFragment = new MainFragment();
        mainFragment.enterAnimStyle = i2;
        mainFragment.attachPage(iUIPage);
        fragmentPond.put(Integer.valueOf(iUIPage.hashCode()), mainFragment);
        if (isTopKindaActivity()) {
            context = currentActivity.get();
            intent = new Intent(context, cls);
            intent.addFlags(67108864);
        } else {
            context = KindaContext.get();
            if (context == null) {
                Log.m105928w(TAG, "can't find valid activity");
                return;
            }
            intent = new Intent(context, cls);
        }
        Bundle bundle = new Bundle();
        bundle.putInt(ConstantsKinda.INTENT_TARGET, iUIPage.hashCode());
        if (string.length() > 0) {
            bundle.putBoolean(ConstantsKinda.INTENT_WEBVIEW, true);
            bundle.putString(ConstantsKinda.INTENT_WEBVIEW_URL, string);
        } else if (string2.length() > 0) {
            bundle.putBoolean(ConstantsKinda.INTENT_TINYAPP, true);
            bundle.putString(ConstantsKinda.INTENT_TINYAPP_USERNAME, string2);
            bundle.putString(ConstantsKinda.INTENT_TINYAPP_PATH, string3);
            bundle.putString(ConstantsKinda.INTENT_TINYAPP_VERSION, string4);
            bundle.putInt(ConstantsKinda.INTENT_TINYAPP_TYPE, i4);
            bundle.putInt(ConstantsKinda.INTENT_TINYAPP_SCENE, i3);
        }
        intent.putExtra(ConstantsKinda.INTENT_BUNDLE, bundle);
        intent.putExtra(ConstantsKinda.CHEEK_WALLET_LOCK, iTransmitKvData2.getBool(ConstantsKinda.CHEEK_WALLET_LOCK));
        if (isTopKindaActivity()) {
            UIPageFragmentActivity uIPageFragmentActivity = (UIPageFragmentActivity) currentActivity.get();
            uIPageFragmentActivity.getClass();
            uIPageFragmentActivity.mo93519H7(intent.getBundleExtra(ConstantsKinda.INTENT_BUNDLE));
            boolean booleanExtra = intent.getBooleanExtra(ConstantsKinda.CHEEK_WALLET_LOCK, false);
            uIPageFragmentActivity.f195312j = booleanExtra;
            Log.m105925i("MicroMsg.UIPageFragmentActivity", "check wallet lock %s", Boolean.valueOf(booleanExtra));
            Log.m105924i(TAG, "startNewUIPage by onNewIntentForKinda.");
            return;
        }
        if (i2 == ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
            intent.putExtra(ConstantsKinda.INTENT_ENTER_ANIMATION, C0966R.C0968anim.f2503er);
        } else if (i2 == ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
            intent.putExtra(ConstantsKinda.INTENT_ENTER_ANIMATION, C0966R.C0968anim.f2492eg);
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIPage", "(Lcom/tencent/kinda/gen/IUIPage;Lcom/tencent/kinda/gen/ITransmitKvData;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/kinda/framework/widget/tools/ActivityController", "startNewUIPage", "(Lcom/tencent/kinda/gen/IUIPage;Lcom/tencent/kinda/gen/ITransmitKvData;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Log.m105924i(TAG, "startNewUIPage by a new activity.");
    }
}
