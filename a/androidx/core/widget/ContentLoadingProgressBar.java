package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: f */
    public static final /* synthetic */ int f44565f = 0;

    /* renamed from: d */
    public final Runnable f44566d = new ContentLoadingProgressBar$$a(this);

    /* renamed from: e */
    public final Runnable f44567e = new ContentLoadingProgressBar$$b(this);

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f44566d);
        removeCallbacks(this.f44567e);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f44566d);
        removeCallbacks(this.f44567e);
    }
}
