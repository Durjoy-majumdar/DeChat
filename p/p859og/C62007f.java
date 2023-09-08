package p859og;

import android.widget.ProgressBar;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;

/* renamed from: og.f */
public class C62007f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AlbumVideoView f176274d;

    public C62007f(AlbumVideoView albumVideoView) {
        this.f176274d = albumVideoView;
    }

    public void run() {
        ProgressBar progressBar = this.f176274d.f154671A;
        if (!(progressBar == null || progressBar.getVisibility() == 0)) {
            this.f176274d.f154671A.setVisibility(0);
        }
        this.f176274d.mo76214g(false);
        MMPinProgressBtn mMPinProgressBtn = this.f176274d.f154672B;
        if (mMPinProgressBtn != null && mMPinProgressBtn.getVisibility() != 8) {
            this.f176274d.f154672B.setVisibility(8);
        }
    }
}
