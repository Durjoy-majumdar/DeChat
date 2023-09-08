package com.tencent.p014mm.accessibility.uitl;

import android.content.ContentResolver;
import android.text.TextUtils;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.accessibility.feature.IAccessibilityService;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C9556a;
import kotlin.Metadata;
import sx3.C64197v;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b/\u00100J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R*\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028V@VX\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R)\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\u0004\u0012\u00020\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0012R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0013\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019R\"\u0010+\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b+\u0010\u0017\"\u0004\b,\u0010\u0019R\"\u0010-\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0013\u001a\u0004\b-\u0010\u0017\"\u0004\b.\u0010\u0019¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/uitl/AccUtil;", "", "", "enable", "Lrx3/b0;", "notifyTouchExplorationChange", "isAccessibilityEnabled", "isCoolAssistRunning", "isEnableCallbackRealtime", "isEnableNodeInfoCache", "canPreDeal", "canExpand", "isEnableShowTextLinespace", "", "TAG", "Ljava/lang/String;", "", "CACHE_TIME", "J", "Z", "lastTimeEnabled", "value", "isTouchExplorationEnable", "()Z", "setTouchExplorationEnable", "(Z)V", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "Lcom/tencent/mm/sdk/observer/IMvvmObserver;", "listenersOwner", "Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "getListenersOwner", "()Lcom/tencent/mm/sdk/observer/MvvmObserverOwner;", "", "defaultWhiteList", "Ljava/util/List;", "whileList", "getWhileList", "()Ljava/util/List;", "setWhileList", "(Ljava/util/List;)V", "lastTimeCoolAssist", "isGlobalDisableAcc", "setGlobalDisableAcc", "isEnableExpand", "setEnableExpand", "isEnableAccEnableForced", "setEnableAccEnableForced", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.uitl.AccUtil */
public final class AccUtil {
    public static final int $stable = 8;
    private static final long CACHE_TIME = 1000;
    public static final AccUtil INSTANCE = new AccUtil();
    public static final String TAG = "MicroMsg.Acc.AccUtil";
    private static final List<String> defaultWhiteList;
    private static boolean isAccessibilityEnabled;
    private static boolean isCoolAssistRunning;
    private static boolean isEnableAccEnableForced;
    private static boolean isEnableExpand = true;
    private static boolean isGlobalDisableAcc;
    private static boolean isTouchExplorationEnable;
    private static long lastTimeCoolAssist;
    private static long lastTimeEnabled;
    private static final MvvmObserverOwner<IMvvmObserver<Boolean>, Boolean> listenersOwner = new AccUtil$listenersOwner$1();
    private static List<String> whileList;

    static {
        List<String> f = C64197v.m75537f("com.google.android.marvin.talkback.TalkBackService", "com.bjbyhd.screenreader_huawei.ScreenReaderService", "com.bjbyhd.voiceback.BoyhoodVoiceBackService", "com.nirenr.talkman.TalkManAccessibilityService", "com.dianming.phoneapp.MyAccessibilityService");
        defaultWhiteList = f;
        whileList = f;
    }

    private AccUtil() {
    }

    private final void notifyTouchExplorationChange(boolean z) {
        listenersOwner.notify(Boolean.valueOf(z));
        Log.m105924i(TAG, "notifyTouchExplorationChange " + z + ' ');
    }

    public final boolean canExpand() {
        return isEnableExpand;
    }

    public final boolean canPreDeal() {
        return (isAccessibilityEnabled() || isEnableAccEnableForced || canExpand()) && !isGlobalDisableAcc;
    }

    public final MvvmObserverOwner<IMvvmObserver<Boolean>, Boolean> getListenersOwner() {
        return listenersOwner;
    }

    public final List<String> getWhileList() {
        return whileList;
    }

    public final boolean isAccessibilityEnabled() {
        if (isTouchExplorationEnable()) {
            return true;
        }
        if (System.currentTimeMillis() - lastTimeEnabled < 1000) {
            return isAccessibilityEnabled;
        }
        lastTimeEnabled = System.currentTimeMillis();
        ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
        C9556a aVar = new C9556a();
        aVar.mo10233c("enabled_accessibility_services");
        aVar.mo10233c(contentResolver);
        String str = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/accessibility/uitl/AccUtil", "isAccessibilityEnabled", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        if (str != null) {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(XVFSFile.PATH_SEPARATOR_CHAR);
            simpleStringSplitter.setString(str);
            while (simpleStringSplitter.hasNext()) {
                String next = simpleStringSplitter.next();
                C87412m.m108593f(next, "splitter.next()");
                if (C112550d0.m153799i0(next).toString().length() == 0) {
                    return false;
                }
                Log.m105924i(TAG, "Setting: " + next);
                int size = whileList.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        if (C112550d0.m153801u(next, whileList.get(i), false)) {
                            isAccessibilityEnabled = true;
                            return true;
                        }
                        i++;
                    }
                }
            }
        }
        isAccessibilityEnabled = false;
        return false;
    }

    public final boolean isCoolAssistRunning() {
        if (System.currentTimeMillis() - lastTimeCoolAssist < 1000) {
            return isCoolAssistRunning;
        }
        lastTimeCoolAssist = System.currentTimeMillis();
        ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
        C9556a aVar = new C9556a();
        aVar.mo10233c("enabled_accessibility_services");
        aVar.mo10233c(contentResolver);
        String str = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/accessibility/uitl/AccUtil", "isCoolAssistRunning", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        if (str != null) {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(XVFSFile.PATH_SEPARATOR_CHAR);
            simpleStringSplitter.setString(str);
            while (simpleStringSplitter.hasNext()) {
                String next = simpleStringSplitter.next();
                C87412m.m108593f(next, "splitter.next()");
                if (C112550d0.m153801u(next, "MMAccessibilityService", false)) {
                    isCoolAssistRunning = true;
                    return true;
                }
            }
        }
        isCoolAssistRunning = false;
        return false;
    }

    public final boolean isEnableAccEnableForced() {
        return isEnableAccEnableForced;
    }

    public final boolean isEnableCallbackRealtime() {
        return C79758p.f233760a.mo109882e(C104160f.RepairerConfig_AutoAccessibility_CallbackRealtime_Int, 0) == 1;
    }

    public final boolean isEnableExpand() {
        return isEnableExpand;
    }

    public final boolean isEnableNodeInfoCache() {
        return C79758p.f233760a.mo109882e(C104160f.RepairerConfig_AutoAccessibility_NodeCacheEnable_Int, 0) == 1;
    }

    public final boolean isEnableShowTextLinespace() {
        return true;
    }

    public final boolean isGlobalDisableAcc() {
        return isGlobalDisableAcc;
    }

    public boolean isTouchExplorationEnable() {
        ((IAccessibilityService) C86312j.m106911c(IAccessibilityService.class)).triggerOnCreate();
        return isTouchExplorationEnable;
    }

    public final void setEnableAccEnableForced(boolean z) {
        isEnableAccEnableForced = z;
    }

    public final void setEnableExpand(boolean z) {
        isEnableExpand = z;
    }

    public final void setGlobalDisableAcc(boolean z) {
        isGlobalDisableAcc = z;
    }

    public void setTouchExplorationEnable(boolean z) {
        isTouchExplorationEnable = z;
        notifyTouchExplorationChange(z);
    }

    public final void setWhileList(List<String> list) {
        C87412m.m108594g(list, "<set-?>");
        whileList = list;
    }
}
