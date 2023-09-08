package yz2;

import android.view.View;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import b03.C67133s;
import com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import zp3.C79406f;

/* renamed from: yz2.e */
public final class C79232e implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ LongTextView f232602d;

    /* renamed from: e */
    public final /* synthetic */ String f232603e;

    public C79232e(LongTextView longTextView, String str) {
        this.f232602d = longTextView;
        this.f232603e = str;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f232602d.removeOnLayoutChangeListener(this);
        TextView tvInvisible = this.f232602d.getTvInvisible();
        if (tvInvisible != null) {
            String str = this.f232603e;
            LongTextView longTextView = this.f232602d;
            tvInvisible.setVisibility(4);
            tvInvisible.setText(str);
            int measuredHeight = longTextView.getMeasuredHeight();
            int measuredHeight2 = tvInvisible.getMeasuredHeight();
            float b = C79406f.m96348b(tvInvisible.getContext(), (float) Math.ceil((double) Math.min(measuredHeight, measuredHeight2)));
            longTextView.setFullTextHeight(measuredHeight2);
            C67133s textviewSuffixWrapper = longTextView.getTextviewSuffixWrapper();
            Transition transition = textviewSuffixWrapper != null ? textviewSuffixWrapper.f192764r : null;
            if (transition != null) {
                ((TransitionSet) transition).mo145349V((long) ((b * ((float) 1000)) / ((float) 5000)));
            }
            Log.m105924i("LongTextView", "tvInvisible: tvHeight:" + measuredHeight2 + " rootViewHeight:" + measuredHeight + " rootView.paddingTop:" + tvInvisible.getRootView().getPaddingTop() + " duration:" + longTextView.getAnimationDuration() + " speed:5000");
            tvInvisible.setText("");
            tvInvisible.setVisibility(8);
            C79229d fullTextHeightChangeListener = longTextView.getFullTextHeightChangeListener();
            if (fullTextHeightChangeListener != null) {
                fullTextHeightChangeListener.mo106686a(longTextView.getFullTextHeight());
            }
        }
    }
}
