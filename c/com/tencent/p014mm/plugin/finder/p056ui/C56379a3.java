package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.SeekBar;
import gr1.C59664m2;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.finder.ui.a3 */
public final class C56379a3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161178d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f161179e;

    public C56379a3(FinderSelectCoverUI finderSelectCoverUI, Bitmap bitmap) {
        this.f161178d = finderSelectCoverUI;
        this.f161179e = bitmap;
    }

    public final void run() {
        FinderSelectCoverUI finderSelectCoverUI = this.f161178d;
        if (finderSelectCoverUI.f161112Z) {
            SeekBar seekBar = finderSelectCoverUI.f161088A;
            if (seekBar != null) {
                Resources resources = this.f161178d.getResources();
                Bitmap bitmap = this.f161178d.f161094G;
                if (bitmap != null) {
                    seekBar.setThumb(new BitmapDrawable(resources, bitmap));
                    SeekBar seekBar2 = this.f161178d.f161088A;
                    if (seekBar2 != null) {
                        seekBar2.setThumbOffset(0);
                        this.f161178d.f161112Z = false;
                    } else {
                        C87412m.m108603p("seekBar");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("thumbBitmap");
                    throw null;
                }
            } else {
                C87412m.m108603p("seekBar");
                throw null;
            }
        } else {
            SeekBar seekBar3 = finderSelectCoverUI.f161088A;
            if (seekBar3 != null) {
                Drawable thumb = seekBar3.getThumb();
                if (thumb != null) {
                    thumb.invalidateSelf();
                }
            } else {
                C87412m.m108603p("seekBar");
                throw null;
            }
        }
        C59664m2 m2Var = this.f161178d.f161089B;
        if (m2Var != null) {
            Bitmap bitmap2 = m2Var.getBitmap();
            if (bitmap2 != null) {
                FinderSelectCoverUI.m64623P7(this.f161178d, bitmap2);
            }
            ImageView imageView = this.f161178d.f161116q;
            if (imageView != null) {
                imageView.setImageBitmap(this.f161179e);
            } else {
                C87412m.m108603p("cropBlurView");
                throw null;
            }
        } else {
            C87412m.m108603p("seeker");
            throw null;
        }
    }
}
