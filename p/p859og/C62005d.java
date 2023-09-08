package p859og;

import android.view.View;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: og.d */
public class C62005d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f176269d;

    /* renamed from: e */
    public final /* synthetic */ AlbumVideoView f176270e;

    public C62005d(AlbumVideoView albumVideoView, boolean z) {
        this.f176270e = albumVideoView;
        this.f176269d = z;
    }

    public void run() {
        Log.m105925i(this.f176270e.f154680d, "VideoPlay: switch video model isVideoPlay %b ", Boolean.valueOf(this.f176269d));
        View view = (View) this.f176270e.f154684h;
        if (this.f176269d) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/album/ui/gallery/view/AlbumVideoView$6", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView$6", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = view;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/album/ui/gallery/view/AlbumVideoView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f176270e.f154682f.setVisibility(8);
            AlbumVideoView albumVideoView = this.f176270e;
            albumVideoView.f154698y = albumVideoView.f154684h.getDuration();
            AlbumVideoView albumVideoView2 = this.f176270e;
            albumVideoView2.f154688o.setVideoTotalTime(albumVideoView2.f154698y / 1000);
            this.f176270e.mo76214g(false);
            return;
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view4 = view;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/album/ui/gallery/view/AlbumVideoView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/album/ui/gallery/view/AlbumVideoView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f176270e.f154682f.setVisibility(0);
        this.f176270e.mo76214g(true);
    }
}
