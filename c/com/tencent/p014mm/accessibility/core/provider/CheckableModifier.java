package com.tencent.p014mm.accessibility.core.provider;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.p014mm.accessibility.uitl.AccUtil;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/CheckableModifier;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityNodeInfo;", "nodeInfo", "Lrx3/b0;", "dealNodeInfo", "Landroid/view/accessibility/AccessibilityEvent;", "event", "dealAccEvent", "", "getAuthority", "", "TAG", "Ljava/lang/String;", "", "CLEAR_DELAY_TIME", "J", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "clearTask", "Ljava/lang/Runnable;", "hoverViewId", "I", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.CheckableModifier */
public final class CheckableModifier extends Provider {
    public static final int $stable = 8;
    private static final long CLEAR_DELAY_TIME = 500;
    public static final CheckableModifier INSTANCE;
    public static final String TAG = "MicroMsg.Acc.CheckableModifier";
    /* access modifiers changed from: private */
    public static final Runnable clearTask = CheckableModifier$clearTask$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final Handler handler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static int hoverViewId = -1;

    static {
        CheckableModifier checkableModifier = new CheckableModifier();
        INSTANCE = checkableModifier;
        checkableModifier.addRootIdMapper$plugin_autoaccessibility_release(C1045791.INSTANCE);
    }

    private CheckableModifier() {
    }

    public void dealAccEvent(View view, AccessibilityEvent accessibilityEvent) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityEvent, "event");
        if ((accessibilityEvent.getEventType() & 128) == 128) {
            hoverViewId = view.hashCode();
        }
        if ((accessibilityEvent.getEventType() & 32768) == 32768) {
            hoverViewId = view.hashCode();
            logMsg(TAG, view, "TYPE_VIEW_ACCESSIBILITY_FOCUSED");
        }
        if ((accessibilityEvent.getEventType() & 32768) == 32768) {
            hoverViewId = view.hashCode();
        }
    }

    public void dealNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityNodeInfo, "nodeInfo");
        if (view.hashCode() != hoverViewId) {
            AccUtil accUtil = AccUtil.INSTANCE;
            if (!accUtil.isCoolAssistRunning() && !accUtil.isEnableCallbackRealtime()) {
                return;
            }
        }
        getConfig(view, new CheckableModifier$dealNodeInfo$1(view, accessibilityNodeInfo));
    }

    public int getAuthority() {
        return 5;
    }
}
