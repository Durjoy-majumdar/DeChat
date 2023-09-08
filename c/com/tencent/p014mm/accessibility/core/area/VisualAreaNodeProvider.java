package com.tencent.p014mm.accessibility.core.area;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.accessibility.core.provider.AccProviderFactory;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/area/VisualAreaNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "Lrx3/b0;", "modifyNodeRect", "", "virtualViewId", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "createAccessibilityNodeInfo", "Landroid/view/View;", "host", "Landroid/view/View;", "eLeft", "I", "eTop", "eRight", "eBottom", "Landroid/graphics/Rect;", "tmpRect", "Landroid/graphics/Rect;", "tmpRect2", "<init>", "(Landroid/view/View;IIII)V", "Companion", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.area.VisualAreaNodeProvider */
public final class VisualAreaNodeProvider extends AccessibilityNodeProvider {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((C8480h) null);
    public static final String TAG = "MicroMsg.Acc.VisualAreaNodeProvider";
    private final int eBottom;
    private final int eLeft;
    private final int eRight;
    private final int eTop;
    private final View host;
    private final Rect tmpRect = new Rect();
    private final Rect tmpRect2 = new Rect();

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/area/VisualAreaNodeProvider$Companion;", "", "()V", "TAG", "", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.accessibility.core.area.VisualAreaNodeProvider$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public VisualAreaNodeProvider(View view, int i, int i2, int i3, int i4) {
        C87412m.m108594g(view, "host");
        this.host = view;
        this.eLeft = i;
        this.eTop = i2;
        this.eRight = i3;
        this.eBottom = i4;
    }

    private final void modifyNodeRect(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.getBoundsInScreen(this.tmpRect);
        Rect rect = this.tmpRect;
        rect.left -= this.eLeft;
        rect.top -= this.eTop;
        rect.right += this.eRight;
        rect.bottom += this.eBottom;
        accessibilityNodeInfo.setBoundsInScreen(rect);
        AccProviderFactory.INSTANCE.dispatchNodeInfo(this.host, accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        if (i != -1) {
            return null;
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.host);
        this.host.onInitializeAccessibilityNodeInfo(obtain);
        if (this.host.isClickable() || this.host.isLongClickable()) {
            C87412m.m108593f(obtain, "node");
            modifyNodeRect(obtain);
        }
        return obtain;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return this.host.performAccessibilityAction(i2, bundle);
    }
}
