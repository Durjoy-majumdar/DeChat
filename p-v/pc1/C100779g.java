package pc1;

import android.widget.ProgressBar;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;

/* renamed from: pc1.g */
public class C100779g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FavVideoView f295245d;

    public C100779g(FavVideoView favVideoView) {
        this.f295245d = favVideoView;
    }

    public void run() {
        ProgressBar progressBar = this.f295245d.f270547z;
        if (!(progressBar == null || progressBar.getVisibility() == 8)) {
            this.f295245d.f270547z.setVisibility(8);
        }
        MMPinProgressBtn mMPinProgressBtn = this.f295245d.f270518A;
        if (mMPinProgressBtn != null && mMPinProgressBtn.getVisibility() != 8) {
            this.f295245d.f270518A.setVisibility(8);
        }
    }
}
