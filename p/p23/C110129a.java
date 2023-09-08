package p23;

import android.graphics.Rect;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timecrop.TimeCropSliderSeekBar;

/* renamed from: p23.a */
public class C110129a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f329478d;

    /* renamed from: e */
    public final /* synthetic */ int f329479e;

    /* renamed from: f */
    public final /* synthetic */ int f329480f;

    /* renamed from: g */
    public final /* synthetic */ TimeCropSliderSeekBar f329481g;

    public C110129a(TimeCropSliderSeekBar timeCropSliderSeekBar, int i, int i2, int i3) {
        this.f329481g = timeCropSliderSeekBar;
        this.f329478d = i;
        this.f329479e = i2;
        this.f329480f = i3;
    }

    public void run() {
        int i = this.f329478d;
        TimeCropSliderSeekBar timeCropSliderSeekBar = this.f329481g;
        if (i > timeCropSliderSeekBar.f316719p * 2) {
            timeCropSliderSeekBar.f316711e = true;
            timeCropSliderSeekBar.f316703D = this.f329479e;
            timeCropSliderSeekBar.f316713g = Math.min(i, timeCropSliderSeekBar.getWidth() - (this.f329479e * 2));
            TimeCropSliderSeekBar timeCropSliderSeekBar2 = this.f329481g;
            timeCropSliderSeekBar2.f316714h = Math.max(this.f329480f, timeCropSliderSeekBar2.f316719p * 2);
            this.f329481g.mo152217e();
            TimeCropSliderSeekBar timeCropSliderSeekBar3 = this.f329481g;
            if (timeCropSliderSeekBar3.f316705F == null && timeCropSliderSeekBar3.f316706G == null) {
                timeCropSliderSeekBar3.f316705F = new Rect(this.f329481g.f316717n.getBounds().left, this.f329481g.f316717n.getBounds().top, this.f329481g.f316717n.getBounds().right, this.f329481g.f316717n.getBounds().bottom);
                this.f329481g.f316706G = new Rect(this.f329481g.f316718o.getBounds().left, this.f329481g.f316718o.getBounds().top, this.f329481g.f316718o.getBounds().right, this.f329481g.f316718o.getBounds().bottom);
            }
            this.f329481g.invalidate();
            return;
        }
        throw new IllegalStateException("MaxExtent can not less than sliderWidth * 2");
    }
}
