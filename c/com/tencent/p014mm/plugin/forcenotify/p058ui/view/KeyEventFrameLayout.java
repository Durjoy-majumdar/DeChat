package com.tencent.p014mm.plugin.forcenotify.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/forcenotify/ui/view/KeyEventFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View$OnKeyListener;", "listener", "Lrx3/b0;", "setOnKeyListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-force-notify_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.forcenotify.ui.view.KeyEventFrameLayout */
public final class KeyEventFrameLayout extends FrameLayout {

    /* renamed from: d */
    public View.OnKeyListener f19080d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View.OnKeyListener onKeyListener;
        if (!(keyEvent == null || (onKeyListener = this.f19080d) == null)) {
            onKeyListener.onKey(this, keyEvent.getKeyCode(), keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f19080d = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KeyEventFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
