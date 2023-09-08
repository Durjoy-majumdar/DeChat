package pn0;

import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView;

/* renamed from: pn0.e */
public class C22001e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AbstractVideoView f62257d;

    public C22001e(AbstractVideoView abstractVideoView) {
        this.f62257d = abstractVideoView;
    }

    public void run() {
        LinearLayout linearLayout = this.f62257d.f49701i;
        if (linearLayout != null && linearLayout.getVisibility() != 0) {
            this.f62257d.f49701i.setVisibility(0);
        }
    }
}
