package p859og;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: og.e */
public class C62006e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f176271d;

    /* renamed from: e */
    public final /* synthetic */ int f176272e;

    /* renamed from: f */
    public final /* synthetic */ AlbumVideoView f176273f;

    public C62006e(AlbumVideoView albumVideoView, int i, int i2) {
        this.f176273f = albumVideoView;
        this.f176271d = i;
        this.f176272e = i2;
    }

    public void run() {
        ProgressBar progressBar = this.f176273f.f154671A;
        if (!(progressBar == null || progressBar.getVisibility() == 8)) {
            this.f176273f.f154671A.setVisibility(8);
        }
        ImageView imageView = this.f176273f.f154683g;
        if (!(imageView == null || imageView.getVisibility() == 8)) {
            this.f176273f.mo76214g(false);
        }
        MMPinProgressBtn mMPinProgressBtn = this.f176273f.f154672B;
        if (mMPinProgressBtn != null) {
            if (mMPinProgressBtn.getVisibility() != 0) {
                this.f176273f.f154672B.setVisibility(0);
            }
            Log.m105925i(this.f176273f.f154680d, "download video update progress offset:%d  total: %d", Integer.valueOf(this.f176271d), Integer.valueOf(this.f176272e));
            int max = this.f176273f.f154672B.getMax();
            int i = this.f176272e;
            if (max != i && i > 0) {
                this.f176273f.f154672B.setMax(i);
            }
            this.f176273f.f154672B.setProgress(this.f176271d);
        }
    }
}
