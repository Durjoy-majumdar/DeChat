package go3;

import com.tencent.p014mm.p136ui.widget.AlbumChooserView;

/* renamed from: go3.b */
public class C116983b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f350547d;

    /* renamed from: e */
    public final /* synthetic */ AlbumChooserView f350548e;

    public C116983b(AlbumChooserView albumChooserView, String str) {
        this.f350548e = albumChooserView;
        this.f350547d = str;
    }

    public void run() {
        AlbumChooserView albumChooserView = this.f350548e;
        albumChooserView.f348676f = false;
        albumChooserView.f348674d.setText(this.f350547d);
    }
}
