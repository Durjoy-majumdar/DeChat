package xm2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: xm2.w */
public final class C15862w {
    /* renamed from: a */
    public static final void m14786a(MMNeat7extView mMNeat7extView, TextView textView, int i, int i2, int i3, boolean z) {
        C87412m.m108594g(mMNeat7extView, "appNameTextView");
        C87412m.m108594g(textView, "appTypeTextView");
        if (z) {
            mMNeat7extView.setMaxWidth(Integer.MAX_VALUE);
            textView.setMaxWidth(Integer.MAX_VALUE);
        }
        mMNeat7extView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = mMNeat7extView.getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        Log.m105924i("MicroMsg.SettingsAuthViewUtils", "updateAuthInfoViewMaxWidth appTypeWidth: " + measuredWidth2 + ", appNameTextViewWidth: " + measuredWidth);
        if (measuredWidth + measuredWidth2 <= i) {
            mMNeat7extView.setMaxWidth(Integer.MAX_VALUE);
            textView.setMaxWidth(Integer.MAX_VALUE);
        } else if (measuredWidth2 < i3) {
            mMNeat7extView.setMaxWidth(i - measuredWidth2);
            textView.setMaxWidth(Integer.MAX_VALUE);
        } else if (measuredWidth <= i2) {
            mMNeat7extView.setMaxWidth(Integer.MAX_VALUE);
            textView.setMaxWidth(i - measuredWidth);
        } else {
            mMNeat7extView.setMaxWidth(i2);
            textView.setMaxWidth(i3);
        }
    }
}
