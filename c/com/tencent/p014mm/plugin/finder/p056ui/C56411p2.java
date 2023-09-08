package com.tencent.p014mm.plugin.finder.p056ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.p2 */
public final class C56411p2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161263d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f161264e;

    public C56411p2(FinderSelectCoverUI finderSelectCoverUI, Bitmap bitmap) {
        this.f161263d = finderSelectCoverUI;
        this.f161264e = bitmap;
    }

    public final void run() {
        SeekBar seekBar = this.f161263d.f161088A;
        if (seekBar != null) {
            seekBar.setVisibility(0);
            FinderSelectCoverUI finderSelectCoverUI = this.f161263d;
            if (finderSelectCoverUI.f161115p0) {
                SeekBar seekBar2 = finderSelectCoverUI.f161088A;
                if (seekBar2 != null) {
                    seekBar2.setProgressDrawable(new BitmapDrawable(this.f161263d.getResources(), this.f161264e));
                    this.f161263d.f161115p0 = false;
                    return;
                }
                C87412m.m108603p("seekBar");
                throw null;
            }
            SeekBar seekBar3 = finderSelectCoverUI.f161088A;
            if (seekBar3 != null) {
                Drawable progressDrawable = seekBar3.getProgressDrawable();
                if (progressDrawable != null) {
                    progressDrawable.invalidateSelf();
                    return;
                }
                return;
            }
            C87412m.m108603p("seekBar");
            throw null;
        }
        C87412m.m108603p("seekBar");
        throw null;
    }
}
