package com.tencent.p014mm.plugin.mmsight.segment;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.i */
public class C105485i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f313695d;

    /* renamed from: e */
    public final /* synthetic */ int f313696e;

    /* renamed from: f */
    public final /* synthetic */ int f313697f;

    /* renamed from: g */
    public final /* synthetic */ SliderSeekBar f313698g;

    public C105485i(SliderSeekBar sliderSeekBar, int i, int i2, int i3) {
        this.f313698g = sliderSeekBar;
        this.f313695d = i;
        this.f313696e = i2;
        this.f313697f = i3;
    }

    public void run() {
        int i = this.f313695d;
        SliderSeekBar sliderSeekBar = this.f313698g;
        if (i > sliderSeekBar.f313636p * 2) {
            sliderSeekBar.f313628e = true;
            sliderSeekBar.f313646z = this.f313696e;
            sliderSeekBar.f313630g = Math.min(i, sliderSeekBar.getWidth() - (this.f313696e * 2));
            this.f313698g.f313631h = Math.max(this.f313697f, 0);
            SliderSeekBar sliderSeekBar2 = this.f313698g;
            if (sliderSeekBar2.f313625D) {
                Drawable drawable = sliderSeekBar2.f313634n;
                int i2 = sliderSeekBar2.f313646z;
                drawable.setBounds(i2, 0, sliderSeekBar2.f313636p + i2, sliderSeekBar2.getHeight());
                Drawable drawable2 = sliderSeekBar2.f313635o;
                int i3 = sliderSeekBar2.f313646z + sliderSeekBar2.f313630g;
                drawable2.setBounds(i3 - sliderSeekBar2.f313636p, 0, i3, sliderSeekBar2.getHeight());
            } else {
                Drawable drawable3 = sliderSeekBar2.f313634n;
                int i4 = sliderSeekBar2.f313646z;
                drawable3.setBounds(i4 - sliderSeekBar2.f313636p, 0, i4, sliderSeekBar2.getHeight());
                Drawable drawable4 = sliderSeekBar2.f313635o;
                int i5 = sliderSeekBar2.f313646z + sliderSeekBar2.f313630g;
                drawable4.setBounds(i5, 0, sliderSeekBar2.f313636p + i5, sliderSeekBar2.getHeight());
            }
            SliderSeekBar sliderSeekBar3 = this.f313698g;
            if (sliderSeekBar3.f313623B == null && sliderSeekBar3.f313624C == null) {
                sliderSeekBar3.f313623B = new Rect(this.f313698g.f313634n.getBounds().left, this.f313698g.f313634n.getBounds().top, this.f313698g.f313634n.getBounds().right, this.f313698g.f313634n.getBounds().bottom);
                this.f313698g.f313624C = new Rect(this.f313698g.f313635o.getBounds().left, this.f313698g.f313635o.getBounds().top, this.f313698g.f313635o.getBounds().right, this.f313698g.f313635o.getBounds().bottom);
            }
            this.f313698g.invalidate();
            return;
        }
        throw new IllegalStateException("MaxExtent can not less than sliderWidth * 2");
    }
}
