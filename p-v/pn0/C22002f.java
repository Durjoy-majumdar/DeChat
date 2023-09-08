package pn0;

import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.videoview.AbstractVideoView;

/* renamed from: pn0.f */
public class C22002f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AbstractVideoView f62258d;

    public C22002f(AbstractVideoView abstractVideoView) {
        this.f62258d = abstractVideoView;
    }

    public void run() {
        LinearLayout linearLayout = this.f62258d.f49701i;
        if (linearLayout != null && linearLayout.getVisibility() != 8) {
            this.f62258d.f49701i.setVisibility(8);
        }
    }
}
