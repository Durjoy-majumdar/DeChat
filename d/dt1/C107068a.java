package dt1;

import com.tencent.p014mm.plugin.finder.widget.record.MarqueeTextView;

/* renamed from: dt1.a */
public class C107068a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f320485d;

    /* renamed from: e */
    public final /* synthetic */ int f320486e;

    /* renamed from: f */
    public final /* synthetic */ MarqueeTextView f320487f;

    public C107068a(MarqueeTextView marqueeTextView, int i, int i2) {
        this.f320487f = marqueeTextView;
        this.f320485d = i;
        this.f320486e = i2;
    }

    public void run() {
        MarqueeTextView marqueeTextView = this.f320487f;
        marqueeTextView.f313113d.startScroll(marqueeTextView.f313115f, 0, this.f320485d, 0, this.f320486e);
        this.f320487f.invalidate();
        this.f320487f.f313116g = false;
    }
}
