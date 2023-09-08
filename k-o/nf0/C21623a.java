package nf0;

import com.tencent.p014mm.picker.base.view.WheelView;

/* renamed from: nf0.a */
public class C21623a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WheelView f61221d;

    public C21623a(WheelView wheelView) {
        this.f61221d = wheelView;
    }

    public void run() {
        WheelView wheelView = this.f61221d;
        wheelView.f49146i.onItemSelected(wheelView.getCurrentItem());
    }
}
