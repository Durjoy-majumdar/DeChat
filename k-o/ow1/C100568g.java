package ow1;

import com.tencent.p014mm.p136ui.widget.AlbumChooserView;
import com.tencent.p014mm.plugin.gallery.p473ui.AlbumPreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import ew1.C97754e;

/* renamed from: ow1.g */
public class C100568g implements AlbumChooserView.C116178b {

    /* renamed from: a */
    public final /* synthetic */ AlbumPreviewUI f294652a;

    public C100568g(AlbumPreviewUI albumPreviewUI) {
        this.f294652a = albumPreviewUI;
    }

    /* renamed from: a */
    public void mo135191a() {
        Log.m105924i("MicroMsg.AlbumPreviewUI", "onAlbumChooserViewClick.");
        AlbumPreviewUI albumPreviewUI = this.f294652a;
        albumPreviewUI.f271296k1 = null;
        C97754e.C97756b.f286807a.f286785d = 1;
        Log.m105919d("MicroMsg.AlbumPreviewUI", "click folder times: [%d].", Integer.valueOf(albumPreviewUI.f271261R));
        AlbumPreviewUI albumPreviewUI2 = this.f294652a;
        albumPreviewUI2.f271261R++;
        albumPreviewUI2.playActionBarOperationAreaAnim();
        this.f294652a.f271303p.mo128973b();
    }
}
