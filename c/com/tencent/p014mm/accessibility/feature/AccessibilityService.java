package com.tencent.p014mm.accessibility.feature;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import bp3.C104160f;
import com.tencent.p014mm.accessibility.core.AccReporter;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import kotlin.Metadata;
import p1108f3.C107452c;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_SUPPORT, C80625v0.MATCH_SWITCH, C80625v0.MATCH_NOSPACE})
@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/feature/AccessibilityService;", "Ldi3/e;", "Lcom/tencent/mm/accessibility/feature/IAccessibilityService;", "", "value", "Lrx3/b0;", "setIsTouchExplorationEnable", "Landroid/content/Context;", "context", "onCreate", "enable", "notifyReport", "onAccountInitialized", "onAccountReleased", "triggerOnCreate", "<init>", "()V", "Companion", "feature-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.feature.AccessibilityService */
public final class AccessibilityService extends C86301e implements IAccessibilityService {
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Acc.AccessibilityService";

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/feature/AccessibilityService$Companion;", "", "()V", "TAG", "", "feature-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.feature.AccessibilityService$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    /* access modifiers changed from: private */
    public final void setIsTouchExplorationEnable(boolean z) {
        AccUtil.INSTANCE.setTouchExplorationEnable(z);
        notifyReport(z);
    }

    public final void notifyReport(boolean z) {
        if (z) {
            AccReporter accReporter = AccReporter.INSTANCE;
            accReporter.reportTouchExplorationEnable();
            accReporter.reportAppTypeIfNeed();
        }
    }

    public void onAccountInitialized(Context context) {
        Class cls = C32735h.class;
        C87412m.m108594g(context, "context");
        AccUtil accUtil = AccUtil.INSTANCE;
        boolean z = false;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_autoaccessibility_globle_disable, 0);
        Log.m105924i(TAG, "isGlobalDisableAcc = " + Qe);
        accUtil.setGlobalDisableAcc(Qe == 1);
        int dl02 = ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_autoaccessibility_force_enable, C104160f.RepairerConfig_AutoAccessibility_AccForcedEnable_Int, 0);
        Log.m105924i(TAG, "isEnableAccEnableForced = " + dl02);
        accUtil.setEnableAccEnableForced(dl02 == 1);
        int dl03 = ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_accessibility_expand_enable, C104160f.RepairerConfig_AutoAccessibility_ExpandEnable_Int, 1);
        Log.m105924i(TAG, "isEnableExpand = " + dl03);
        if (dl03 == 1) {
            z = true;
        }
        accUtil.setEnableExpand(z);
        ((C119157j) C119157j.f356862d).mo183875f(AccessibilityService$onAccountInitialized$4.INSTANCE);
        AccReporter.INSTANCE.initListener();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        AccReporter.INSTANCE.releaseListener();
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        Object systemService = MMApplicationContext.getContext().getSystemService("accessibility");
        AccessibilityManager accessibilityManager = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
        if (accessibilityManager != null) {
            setIsTouchExplorationEnable(accessibilityManager.isTouchExplorationEnabled());
            accessibilityManager.addTouchExplorationStateChangeListener(new C107452c(new AccessibilityService$onCreate$1(this)));
        }
    }

    public void triggerOnCreate() {
    }
}
