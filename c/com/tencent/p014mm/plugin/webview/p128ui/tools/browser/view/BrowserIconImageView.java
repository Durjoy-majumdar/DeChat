package com.tencent.p014mm.plugin.webview.p128ui.tools.browser.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/browser/view/BrowserIconImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserIconImageView */
public final class BrowserIconImageView extends AppCompatImageView {

    /* renamed from: f */
    public int f211219f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BrowserIconImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = null;
        if (!isEnabled() || !isFocusable()) {
            Drawable drawable2 = getDrawable();
            if (drawable2 != null) {
                drawable = drawable2.mutate();
            }
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
            }
        } else if (isPressed()) {
            Drawable drawable3 = getDrawable();
            if (drawable3 != null) {
                drawable = drawable3.mutate();
            }
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f211219f, PorterDuff.Mode.SRC_ATOP));
            }
        } else {
            Drawable drawable4 = getDrawable();
            if (drawable4 != null) {
                drawable = drawable4.mutate();
            }
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BrowserIconImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f211219f = getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1);
    }
}
