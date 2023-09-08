package com.tencent.p014mm.accessibility.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.accessibility.core.area.AreaProvider;
import com.tencent.p014mm.accessibility.core.provider.AccProviderFactory;
import com.tencent.p014mm.accessibility.uitl.AccNodeUtil;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u0014\u001a\u00020\u00132\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/MMAccessibilityDelegateWrap;", "Landroid/view/View$AccessibilityDelegate;", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "Lrx3/b0;", "saveCache", "getCache", "Landroid/view/View;", "host", "onInitializeAccessibilityNodeInfo", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityNodeProvider;", "getAccessibilityNodeProvider", "", "action", "Landroid/os/Bundle;", "args", "", "performAccessibilityAction", "origin", "Landroid/view/View$AccessibilityDelegate;", "getOrigin", "()Landroid/view/View$AccessibilityDelegate;", "", "nodeCacheTime", "J", "nodeCache", "Landroid/view/accessibility/AccessibilityNodeInfo;", "<init>", "(Landroid/view/View$AccessibilityDelegate;)V", "Companion", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap */
public final class MMAccessibilityDelegateWrap extends View.AccessibilityDelegate {
    public static final int $stable = 8;
    public static final long CACHE_TIME = 100;
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Acc.MMAccessibilityDelegateWrap";
    private AccessibilityNodeInfo nodeCache;
    private long nodeCacheTime;
    private final View.AccessibilityDelegate origin;

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/MMAccessibilityDelegateWrap$Companion;", "", "()V", "CACHE_TIME", "", "TAG", "", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.MMAccessibilityDelegateWrap$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public MMAccessibilityDelegateWrap() {
        this((View.AccessibilityDelegate) null, 1, (C8480h) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MMAccessibilityDelegateWrap(View.AccessibilityDelegate accessibilityDelegate, int i, C8480h hVar) {
        this((i & 1) != 0 ? null : accessibilityDelegate);
    }

    private final AccessibilityNodeInfo getCache() {
        if (System.currentTimeMillis() - this.nodeCacheTime >= 100 || !AccUtil.INSTANCE.isEnableNodeInfoCache()) {
            return null;
        }
        return this.nodeCache;
    }

    private final void saveCache(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (AccUtil.INSTANCE.isEnableNodeInfoCache()) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.nodeCache;
            if (!(accessibilityNodeInfo2 == null || accessibilityNodeInfo2 == null)) {
                accessibilityNodeInfo2.recycle();
            }
            this.nodeCache = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            this.nodeCacheTime = System.currentTimeMillis();
        }
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null && (accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view)) != null) {
            return accessibilityNodeProvider;
        }
        AccUtil accUtil = AccUtil.INSTANCE;
        if (!accUtil.canPreDeal() || !accUtil.isAccessibilityEnabled() || view == null) {
            return null;
        }
        if (view.isClickable() || view.isLongClickable()) {
            return AreaProvider.INSTANCE.buildAccessibilityProvider(view);
        }
        return null;
    }

    public final View.AccessibilityDelegate getOrigin() {
        return this.origin;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        C13598b0 b0Var;
        View.AccessibilityDelegate accessibilityDelegate = this.origin;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
        if (view != null && accessibilityEvent != null) {
            AccUtil accUtil = AccUtil.INSTANCE;
            if (accUtil.isAccessibilityEnabled() || accUtil.isEnableAccEnableForced()) {
                AccProviderFactory.INSTANCE.dispatchAccEvent(view, accessibilityEvent);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C13598b0 b0Var;
        try {
            View.AccessibilityDelegate accessibilityDelegate = this.origin;
            if (accessibilityDelegate != null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
            if (view == null) {
                return;
            }
            if (accessibilityNodeInfo != null) {
                AccessibilityNodeInfo cache = getCache();
                if (cache != null) {
                    AccNodeUtil.INSTANCE.copy(cache, accessibilityNodeInfo);
                    Log.m105918d(TAG, "node hit cache");
                    return;
                }
                AccUtil accUtil = AccUtil.INSTANCE;
                if (accUtil.isAccessibilityEnabled() || accUtil.isEnableAccEnableForced()) {
                    AccProviderFactory.INSTANCE.dispatchNodeInfo(view, accessibilityNodeInfo);
                    saveCache(accessibilityNodeInfo);
                }
            }
        } catch (Exception unused) {
        }
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (view != null) {
            AccProviderFactory.INSTANCE.dispatchOnAction(view, i, bundle);
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    public MMAccessibilityDelegateWrap(View.AccessibilityDelegate accessibilityDelegate) {
        this.origin = accessibilityDelegate;
    }
}
