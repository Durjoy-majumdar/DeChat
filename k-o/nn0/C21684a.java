package nn0;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.progressbar.AdVideoPlayerLoadingBar;

/* renamed from: nn0.a */
public class C21684a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AdVideoPlayerLoadingBar f61387d;

    public C21684a(AdVideoPlayerLoadingBar adVideoPlayerLoadingBar) {
        this.f61387d = adVideoPlayerLoadingBar;
    }

    public void run() {
        int paddingLeft = (((FrameLayout.LayoutParams) this.f61387d.f49596g.getLayoutParams()).leftMargin - this.f61387d.f49597h.getPaddingLeft()) - (((this.f61387d.getBarPointWidth() - this.f61387d.f49597h.getPaddingLeft()) - this.f61387d.f49597h.getPaddingRight()) / 2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f61387d.f49597h.getLayoutParams();
        layoutParams.leftMargin = paddingLeft;
        this.f61387d.f49597h.setLayoutParams(layoutParams);
    }
}
