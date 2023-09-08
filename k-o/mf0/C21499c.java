package mf0;

import com.tencent.p014mm.picker.base.view.WheelView;
import java.util.TimerTask;

/* renamed from: mf0.c */
public final class C21499c extends TimerTask {

    /* renamed from: d */
    public float f60867d = 2.14748365E9f;

    /* renamed from: e */
    public final float f60868e;

    /* renamed from: f */
    public final WheelView f60869f;

    public C21499c(WheelView wheelView, float f) {
        this.f60869f = wheelView;
        this.f60868e = f;
    }

    public final void run() {
        if (this.f60867d == 2.14748365E9f) {
            float f = 2000.0f;
            if (Math.abs(this.f60868e) > 2000.0f) {
                if (this.f60868e <= 0.0f) {
                    f = -2000.0f;
                }
                this.f60867d = f;
            } else {
                this.f60867d = this.f60868e;
            }
        }
        if (Math.abs(this.f60867d) < 0.0f || Math.abs(this.f60867d) > 20.0f) {
            WheelView wheelView = this.f60869f;
            float f2 = (float) ((int) (this.f60867d / 100.0f));
            wheelView.setTotalScrollY(wheelView.getTotalScrollY() - f2);
            WheelView wheelView2 = this.f60869f;
            if (!wheelView2.f49160z) {
                float itemHeight = wheelView2.getItemHeight();
                float f3 = ((float) (-this.f60869f.getInitPosition())) * itemHeight;
                float itemsCount = ((float) ((this.f60869f.getItemsCount() - 1) - this.f60869f.getInitPosition())) * itemHeight;
                double d = ((double) itemHeight) * 0.25d;
                if (((double) this.f60869f.getTotalScrollY()) - d < ((double) f3)) {
                    f3 = this.f60869f.getTotalScrollY() + f2;
                } else if (((double) this.f60869f.getTotalScrollY()) + d > ((double) itemsCount)) {
                    itemsCount = this.f60869f.getTotalScrollY() + f2;
                }
                if (this.f60869f.getTotalScrollY() <= f3) {
                    this.f60867d = 40.0f;
                    this.f60869f.setTotalScrollY((float) ((int) f3));
                } else if (this.f60869f.getTotalScrollY() >= itemsCount) {
                    this.f60869f.setTotalScrollY((float) ((int) itemsCount));
                    this.f60867d = -40.0f;
                }
            }
            float f4 = this.f60867d;
            if (f4 < 0.0f) {
                this.f60867d = f4 + 20.0f;
            } else {
                this.f60867d = f4 - 20.0f;
            }
            this.f60869f.getHandler().sendEmptyMessage(1000);
            return;
        }
        this.f60869f.mo22028a();
        this.f60869f.getHandler().sendEmptyMessage(2000);
    }
}
