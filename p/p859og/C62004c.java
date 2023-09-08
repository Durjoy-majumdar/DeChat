package p859og;

import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;

/* renamed from: og.c */
public class C62004c implements C96875r0.C96877c {

    /* renamed from: d */
    public final /* synthetic */ AlbumVideoView f176268d;

    public C62004c(AlbumVideoView albumVideoView) {
        this.f176268d = albumVideoView;
    }

    /* renamed from: z */
    public void mo86881z(boolean z) {
        if (z) {
            AlbumVideoView albumVideoView = this.f176268d;
            if (!albumVideoView.f154699z && !albumVideoView.f154684h.isPlaying()) {
                this.f176268d.mo76219i();
            }
        }
    }
}
