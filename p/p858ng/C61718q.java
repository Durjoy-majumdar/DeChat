package p858ng;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.album.p836ui.gallery.view.AlbumVideoView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import p855lg.C61278a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ng.q */
public final class C61718q extends UIComponent {

    /* renamed from: d */
    public AlbumVideoView f175424d;

    /* renamed from: e */
    public C61278a f175425e;

    /* renamed from: f */
    public boolean f175426f;

    /* renamed from: g */
    public final C13601g f175427g = C36568h.m40985a(new C61721c(this));

    /* renamed from: h */
    public final ArrayList<AlbumVideoView> f175428h = new ArrayList<>();

    /* renamed from: i */
    public boolean f175429i;

    /* renamed from: j */
    public final C13601g f175430j;

    /* renamed from: ng.q$a */
    public /* synthetic */ class C61719a extends C24565l implements C32226l<C61710l, C13598b0> {
        public C61719a(Object obj) {
            super(1, obj, C61718q.class, "processState", "processState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C61710l) obj, "p0");
            ((C61718q) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ng.q$b */
    public /* synthetic */ class C61720b extends C24565l implements C32226l<C61710l, C13598b0> {
        public C61720b(Object obj) {
            super(1, obj, C61718q.class, "observeState", "observeState(Lcom/tencent/mm/album/ui/gallery/uic/AlbumGalleryState;)V", 0);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C61710l) obj, "p0");
            ((C61718q) this.receiver).getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ng.q$c */
    public static final class C61721c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C61718q f175431d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61721c(C61718q qVar) {
            super(0);
            this.f175431d = qVar;
        }

        public Object invoke() {
            return Integer.valueOf(this.f175431d.getIntent().getIntExtra("album_enter_position_from_list_page", 0));
        }
    }

    /* renamed from: ng.q$d */
    public static final class C61722d extends C87413o implements C32224a<UIStateCenter<C61710l>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f175432d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61722d(AppCompatActivity appCompatActivity) {
            super(0);
            this.f175432d = appCompatActivity;
        }

        public Object invoke() {
            return new UIStateCenter(new C61710l(), this.f175432d, (String) null, (LifecycleScope) null, 12, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61718q(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f175430j = C36568h.m40985a(new C61722d(appCompatActivity));
    }

    public void onCreate(Bundle bundle) {
        ((UIStateCenter) ((C36570n) this.f175430j).getValue()).process((C0125s) getActivity(), new C61719a(this));
        ((UIStateCenter) ((C36570n) this.f175430j).getValue()).observe((C0125s) getActivity(), new C61720b(this));
    }

    public void onCreateAfter(Bundle bundle) {
    }

    public void onDestroy() {
        super.onDestroy();
        for (AlbumVideoView d : this.f175428h) {
            d.mo76211d();
        }
    }

    public void onPause() {
        super.onPause();
        AlbumVideoView albumVideoView = this.f175424d;
        if (albumVideoView != null && albumVideoView.mo76210c()) {
            this.f175429i = true;
        }
        AlbumVideoView albumVideoView2 = this.f175424d;
        if (albumVideoView2 != null) {
            Log.m105924i(albumVideoView2.f154680d, "VideoPlay:   onPause()");
            albumVideoView2.mo76218h();
            if (albumVideoView2.f154684h.isPlaying()) {
                Log.m105924i(albumVideoView2.f154680d, "VideoPlay: pausePlay()");
                albumVideoView2.f154684h.pause();
            }
            albumVideoView2.f154675E.stopTimer();
            albumVideoView2.setVideoStateIv(true);
            albumVideoView2.f154676F.stopTimer();
            albumVideoView2.mo76214g(true);
        }
    }

    public void onResume() {
        AlbumVideoView albumVideoView;
        super.onResume();
        if (this.f175429i && (albumVideoView = this.f175424d) != null) {
            albumVideoView.mo76213f(albumVideoView.f154688o.getmPosition());
            albumVideoView.f154675E.startTimer(500);
            albumVideoView.setVideoStateIv(false);
            if (albumVideoView.f154697x) {
                albumVideoView.f154676F.startTimer(4000);
            }
            albumVideoView.mo76214g(false);
        }
    }
}
