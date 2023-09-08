package com.tencent.p014mm.plugin.finder.live.view;

import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.live.view.f0 */
public final class C56058f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SeekBar f159877d;

    /* renamed from: e */
    public final /* synthetic */ TextView f159878e;

    /* renamed from: f */
    public final /* synthetic */ int f159879f;

    /* renamed from: g */
    public final /* synthetic */ FinderLiveCameraOptMakeupView f159880g;

    public C56058f0(SeekBar seekBar, TextView textView, int i, FinderLiveCameraOptMakeupView finderLiveCameraOptMakeupView) {
        this.f159877d = seekBar;
        this.f159878e = textView;
        this.f159879f = i;
        this.f159880g = finderLiveCameraOptMakeupView;
    }

    public final void run() {
        int width = this.f159877d.getWidth() - (this.f159878e.getWidth() / 2);
        float max = (((float) this.f159879f) / ((float) this.f159877d.getMax())) * ((float) ((this.f159877d.getMeasuredWidth() - this.f159877d.getPaddingStart()) - this.f159877d.getPaddingEnd()));
        Log.m105924i("Finder.FinderLiveCameraOptMakeupView", "#setAndMoveSeekValueText progress:" + this.f159879f + " translationX:" + max);
        StringBuilder sb = new StringBuilder();
        sb.append('+');
        sb.append(FinderLiveCameraOptMakeupView.m63968b(this.f159880g, this.f159879f, false, this.f159877d.getMax()));
        this.f159878e.setText(sb.toString());
        TextView textView = this.f159878e;
        float f = (float) width;
        if (max > f) {
            max = f;
        }
        float f2 = this.f159880g.f159672D;
        if (max < f2) {
            max = f2;
        }
        textView.setTranslationX(max);
    }
}
