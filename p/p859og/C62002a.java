package p859og;

import android.widget.ProgressBar;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;

/* renamed from: og.a */
public class C62002a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AlbumVideoView f176266d;

    public C62002a(AlbumVideoView albumVideoView) {
        this.f176266d = albumVideoView;
    }

    public void run() {
        ProgressBar progressBar = this.f176266d.f154671A;
        if (!(progressBar == null || progressBar.getVisibility() == 8)) {
            this.f176266d.f154671A.setVisibility(8);
        }
        MMPinProgressBtn mMPinProgressBtn = this.f176266d.f154672B;
        if (mMPinProgressBtn != null && mMPinProgressBtn.getVisibility() != 8) {
            this.f176266d.f154672B.setVisibility(8);
        }
    }
}
