package com.tencent.p014mm.plugin.finder.live.view;

import android.widget.ImageView;
import android.widget.SeekBar;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.finder.live.view.e0 */
public final class C3212e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SeekBar f15328d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f15329e;

    /* renamed from: f */
    public final /* synthetic */ int f15330f;

    public C3212e0(SeekBar seekBar, ImageView imageView, int i) {
        this.f15328d = seekBar;
        this.f15329e = imageView;
        this.f15330f = i;
    }

    public final void run() {
        int width = this.f15328d.getWidth() - this.f15329e.getWidth();
        float max = (((float) this.f15330f) / ((float) this.f15328d.getMax())) * ((float) ((this.f15328d.getMeasuredWidth() - this.f15328d.getPaddingStart()) - this.f15328d.getPaddingEnd()));
        Log.m105924i("Finder.FinderLiveCameraOptMakeupView", "#setAndMoveDefaultValueIcon progress:" + this.f15330f + " translationX:" + max);
        ImageView imageView = this.f15329e;
        float f = (float) width;
        if (max > f) {
            max = f;
        }
        imageView.setTranslationX(max);
    }
}
