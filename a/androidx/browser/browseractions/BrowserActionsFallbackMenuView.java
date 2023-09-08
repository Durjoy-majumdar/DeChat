package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: d */
    public final int f549d = getResources().getDimensionPixelOffset(C0966R.dimen.f4200vx);

    /* renamed from: e */
    public final int f550e = getResources().getDimensionPixelOffset(C0966R.dimen.f4199vw);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f549d * 2), this.f550e), 1073741824), i2);
    }
}
