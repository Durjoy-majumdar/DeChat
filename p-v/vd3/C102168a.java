package vd3;

import android.widget.LinearLayout;
import com.tencent.p014mm.pluginsdk.p133ui.AbstractVideoView;

/* renamed from: vd3.a */
public class C102168a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AbstractVideoView f300832d;

    public C102168a(AbstractVideoView abstractVideoView) {
        this.f300832d = abstractVideoView;
    }

    public void run() {
        LinearLayout linearLayout = this.f300832d.f283592n;
        if (linearLayout != null && linearLayout.getVisibility() != 8) {
            this.f300832d.f283592n.setVisibility(8);
        }
    }
}
