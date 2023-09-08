package vd3;

import android.widget.LinearLayout;
import com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView;

/* renamed from: vd3.c */
public class C102170c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AbstractVideoView f300834d;

    public C102170c(AbstractVideoView abstractVideoView) {
        this.f300834d = abstractVideoView;
    }

    public void run() {
        LinearLayout linearLayout = this.f300834d.f283592n;
        if (linearLayout != null && linearLayout.getVisibility() != 0) {
            this.f300834d.f283592n.setVisibility(0);
        }
    }
}
