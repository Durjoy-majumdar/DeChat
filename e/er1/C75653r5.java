package er1;

import android.content.Context;
import android.widget.Scroller;

/* renamed from: er1.r5 */
public final class C75653r5 extends Scroller {

    /* renamed from: a */
    public int f222239a;

    public C75653r5(Context context, int i) {
        super(context);
        this.f222239a = i;
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f222239a);
    }
}
