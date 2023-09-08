package vf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderAlbumTimelineUI;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: vf1.b */
public final class C65688b implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ FinderAlbumTimelineUI f189031d;

    public C65688b(FinderAlbumTimelineUI finderAlbumTimelineUI) {
        this.f189031d = finderAlbumTimelineUI;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        if (e0Var.mo107176v()) {
            FinderAlbumTimelineUI finderAlbumTimelineUI = this.f189031d;
            e0Var.mo107150j(finderAlbumTimelineUI.f158822E, finderAlbumTimelineUI.getContext().getString(C0966R.string.f360098a33), C0966R.raw.finder_icons_filled_share, this.f189031d.getContext().getResources().getColor(C0966R.color.f2939n), false);
            FinderAlbumTimelineUI finderAlbumTimelineUI2 = this.f189031d;
            e0Var.mo107150j(finderAlbumTimelineUI2.f158823F, finderAlbumTimelineUI2.getContext().getString(C0966R.string.epb), C0966R.raw.bottomsheet_icon_moment, 0, false);
        }
    }
}
