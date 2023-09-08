package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/provider/EventRecorder;", "Lcom/tencent/mm/accessibility/core/provider/Provider;", "Landroid/view/View;", "view", "Landroid/view/accessibility/AccessibilityEvent;", "event", "Lrx3/b0;", "dealAccEvent", "", "getAuthority", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.EventRecorder */
public final class EventRecorder extends Provider {
    public static final int $stable = 0;
    public static final EventRecorder INSTANCE = new EventRecorder();

    private EventRecorder() {
    }

    public void dealAccEvent(View view, AccessibilityEvent accessibilityEvent) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(accessibilityEvent, "event");
        if ((accessibilityEvent.getEventType() & 32768) == 32768) {
            getConfig(view, new EventRecorder$dealAccEvent$1(view));
        }
    }

    public int getAuthority() {
        return 4;
    }
}
