package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar */
public class RedesignVideoPlayerSeekBar extends VideoPlayerSeekBar {

    /* renamed from: E */
    public ImageView f283816E;

    /* renamed from: F */
    public long f283817F = 0;

    /* renamed from: G */
    public long f283818G = 0;

    public RedesignVideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public void mo130494c(boolean z) {
        setIsPlay(z);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359940br0;
    }

    /* renamed from: p */
    public void mo36657p() {
        super.mo36657p();
        this.f283816E = (ImageView) this.f273521e.findViewById(C0966R.C0970id.hxm);
    }

    public void setIsPlay(boolean z) {
        this.f283824z = z;
        if (z) {
            this.f273525i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_pause, -1));
            this.f273525i.setContentDescription(getContext().getString(C0966R.string.a1a));
            return;
        }
        this.f273525i.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_play, -1));
        this.f273525i.setContentDescription(getContext().getString(C0966R.string.a1s));
    }

    /* renamed from: v */
    public boolean mo135174v(int i) {
        int videoTotalTime = getVideoTotalTime();
        int i2 = 0;
        if ((((long) i) == this.f283817F && ((long) videoTotalTime) == this.f283818G) || System.currentTimeMillis() - 0 < 300 || i < 0 || videoTotalTime < 0) {
            return false;
        }
        if (i > videoTotalTime) {
            i = videoTotalTime;
        }
        int barLen = getBarLen();
        if (barLen <= 0) {
            return true;
        }
        if (videoTotalTime != 0) {
            i2 = (int) (((double) barLen) * ((((double) i) * 1.0d) / ((double) videoTotalTime)));
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f283816E.getLayoutParams();
        layoutParams.width = i2;
        this.f283816E.setLayoutParams(layoutParams);
        this.f283817F = (long) i;
        this.f283818G = (long) videoTotalTime;
        return true;
    }

    public RedesignVideoPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
