package mf0;

import com.tencent.p014mm.picker.base.view.WheelView;
import java.util.TimerTask;

/* renamed from: mf0.e */
public final class C21501e extends TimerTask {

    /* renamed from: d */
    public int f60871d = Integer.MAX_VALUE;

    /* renamed from: e */
    public int f60872e = 0;

    /* renamed from: f */
    public int f60873f;

    /* renamed from: g */
    public final WheelView f60874g;

    public C21501e(WheelView wheelView, int i) {
        this.f60874g = wheelView;
        this.f60873f = i;
    }

    public final void run() {
        if (this.f60871d == Integer.MAX_VALUE) {
            this.f60871d = this.f60873f;
        }
        int i = this.f60871d;
        int i2 = (int) (((float) i) * 0.1f);
        this.f60872e = i2;
        if (i2 == 0) {
            if (i < 0) {
                this.f60872e = -1;
            } else {
                this.f60872e = 1;
            }
        }
        if (Math.abs(i) <= 1) {
            this.f60874g.mo22028a();
            this.f60874g.getHandler().sendEmptyMessage(3000);
            return;
        }
        WheelView wheelView = this.f60874g;
        wheelView.setTotalScrollY(wheelView.getTotalScrollY() + ((float) this.f60872e));
        WheelView wheelView2 = this.f60874g;
        if (!wheelView2.f49160z) {
            float itemHeight = wheelView2.getItemHeight();
            float f = ((float) (-this.f60874g.getInitPosition())) * itemHeight;
            float itemsCount = ((float) ((this.f60874g.getItemsCount() - 1) - this.f60874g.getInitPosition())) * itemHeight;
            if (this.f60874g.getTotalScrollY() <= f || this.f60874g.getTotalScrollY() >= itemsCount) {
                WheelView wheelView3 = this.f60874g;
                wheelView3.setTotalScrollY(wheelView3.getTotalScrollY() - ((float) this.f60872e));
                this.f60874g.mo22028a();
                this.f60874g.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        this.f60874g.getHandler().sendEmptyMessage(1000);
        this.f60871d -= this.f60872e;
    }
}
