package ub2;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.SliderSeekBar;

/* renamed from: ub2.r0 */
public class C111151r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f332869d;

    /* renamed from: e */
    public final /* synthetic */ int f332870e;

    /* renamed from: f */
    public final /* synthetic */ int f332871f;

    /* renamed from: g */
    public final /* synthetic */ SliderSeekBar f332872g;

    public C111151r0(SliderSeekBar sliderSeekBar, int i, int i2, int i3) {
        this.f332872g = sliderSeekBar;
        this.f332869d = i;
        this.f332870e = i2;
        this.f332871f = i3;
    }

    public void run() {
        int i = this.f332869d;
        SliderSeekBar sliderSeekBar = this.f332872g;
        if (i > sliderSeekBar.f315254o * 2) {
            sliderSeekBar.f315246d = true;
            sliderSeekBar.f315264y = this.f332870e;
            sliderSeekBar.f315248f = Math.min(i, sliderSeekBar.getWidth() - (this.f332870e * 2));
            this.f332872g.f315249g = Math.max(this.f332871f, 0);
            SliderSeekBar sliderSeekBar2 = this.f332872g;
            if (sliderSeekBar2.f315244C) {
                Drawable drawable = sliderSeekBar2.f315252j;
                int i2 = sliderSeekBar2.f315264y;
                drawable.setBounds(i2, 0, sliderSeekBar2.f315254o + i2, sliderSeekBar2.getHeight());
                Drawable drawable2 = sliderSeekBar2.f315253n;
                int i3 = sliderSeekBar2.f315264y + sliderSeekBar2.f315248f;
                drawable2.setBounds(i3 - sliderSeekBar2.f315254o, 0, i3, sliderSeekBar2.getHeight());
            } else {
                Drawable drawable3 = sliderSeekBar2.f315252j;
                int i4 = sliderSeekBar2.f315264y;
                drawable3.setBounds(i4 - sliderSeekBar2.f315254o, 0, i4, sliderSeekBar2.getHeight());
                Drawable drawable4 = sliderSeekBar2.f315253n;
                int i5 = sliderSeekBar2.f315264y + sliderSeekBar2.f315248f;
                drawable4.setBounds(i5, 0, sliderSeekBar2.f315254o + i5, sliderSeekBar2.getHeight());
            }
            SliderSeekBar sliderSeekBar3 = this.f332872g;
            if (sliderSeekBar3.f315242A == null && sliderSeekBar3.f315243B == null) {
                sliderSeekBar3.f315242A = new Rect(this.f332872g.f315252j.getBounds().left, this.f332872g.f315252j.getBounds().top, this.f332872g.f315252j.getBounds().right, this.f332872g.f315252j.getBounds().bottom);
                this.f332872g.f315243B = new Rect(this.f332872g.f315253n.getBounds().left, this.f332872g.f315253n.getBounds().top, this.f332872g.f315253n.getBounds().right, this.f332872g.f315253n.getBounds().bottom);
            }
            this.f332872g.invalidate();
            return;
        }
        throw new IllegalStateException("MaxExtent can not less than sliderWidth * 2");
    }
}
