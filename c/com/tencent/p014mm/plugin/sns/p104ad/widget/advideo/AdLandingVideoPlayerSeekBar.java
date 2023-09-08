package com.tencent.p014mm.plugin.sns.p104ad.widget.advideo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar */
public class AdLandingVideoPlayerSeekBar extends VideoPlayerSeekBar {
    public AdLandingVideoPlayerSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        return C0966R.C0971layout.f6349cd;
    }

    public void setIsPlay(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
        this.f283824z = z;
        ImageView imageView = this.f273525i;
        if (imageView == null) {
            Log.m105920e("AdLandingVideoPlayerSeekBar", "in adLandingVideoPlayerSeekBar setIsPlay, mPlayBtn is null");
            SnsMethodCalculate.markEndTimeMs("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
            return;
        }
        if (z) {
            imageView.setImageResource(C0966R.raw.media_player_btn_cur_status_on);
        } else {
            imageView.setImageResource(C0966R.raw.media_player_btn_cur_status_off);
        }
        SnsMethodCalculate.markEndTimeMs("setIsPlay", "com.tencent.mm.plugin.sns.ad.widget.advideo.AdLandingVideoPlayerSeekBar");
    }

    public AdLandingVideoPlayerSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
