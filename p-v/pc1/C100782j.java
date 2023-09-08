package pc1;

import android.widget.ProgressBar;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;

/* renamed from: pc1.j */
public class C100782j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FavVideoView f295251d;

    public C100782j(FavVideoView favVideoView) {
        this.f295251d = favVideoView;
    }

    public void run() {
        ProgressBar progressBar = this.f295251d.f270547z;
        if (!(progressBar == null || progressBar.getVisibility() == 0)) {
            this.f295251d.f270547z.setVisibility(0);
        }
        MMPinProgressBtn mMPinProgressBtn = this.f295251d.f270518A;
        if (mMPinProgressBtn != null && mMPinProgressBtn.getVisibility() != 8) {
            this.f295251d.f270518A.setVisibility(8);
        }
    }
}
