package pc1;

import android.widget.ProgressBar;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: pc1.i */
public class C100781i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f295248d;

    /* renamed from: e */
    public final /* synthetic */ int f295249e;

    /* renamed from: f */
    public final /* synthetic */ FavVideoView f295250f;

    public C100781i(FavVideoView favVideoView, int i, int i2) {
        this.f295250f = favVideoView;
        this.f295248d = i;
        this.f295249e = i2;
    }

    public void run() {
        ProgressBar progressBar = this.f295250f.f270547z;
        if (!(progressBar == null || progressBar.getVisibility() == 8)) {
            this.f295250f.f270547z.setVisibility(8);
        }
        MMPinProgressBtn mMPinProgressBtn = this.f295250f.f270518A;
        if (mMPinProgressBtn != null) {
            if (mMPinProgressBtn.getVisibility() != 0) {
                this.f295250f.f270518A.setVisibility(0);
            }
            Log.m105925i(this.f295250f.f270528d, "download video update progress offset:%d  total: %d", Integer.valueOf(this.f295248d), Integer.valueOf(this.f295249e));
            int max = this.f295250f.f270518A.getMax();
            int i = this.f295249e;
            if (max != i && i > 0) {
                this.f295250f.f270518A.setMax(i);
            }
            this.f295250f.f270518A.setProgress(this.f295248d);
        }
    }
}
