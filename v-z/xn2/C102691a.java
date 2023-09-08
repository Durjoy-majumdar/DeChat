package xn2;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.AdVideoPlayerLoadingBar;

/* renamed from: xn2.a */
public class C102691a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdVideoPlayerLoadingBar f303306d;

    public C102691a(AdVideoPlayerLoadingBar adVideoPlayerLoadingBar) {
        this.f303306d = adVideoPlayerLoadingBar;
    }

    public void run() {
        int paddingLeft = (((FrameLayout.LayoutParams) this.f303306d.f273523g.getLayoutParams()).leftMargin - this.f303306d.f273524h.getPaddingLeft()) - (((this.f303306d.getBarPointWidth() - this.f303306d.f273524h.getPaddingLeft()) - this.f303306d.f273524h.getPaddingRight()) / 2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f303306d.f273524h.getLayoutParams();
        layoutParams.leftMargin = paddingLeft;
        this.f303306d.f273524h.setLayoutParams(layoutParams);
    }
}
