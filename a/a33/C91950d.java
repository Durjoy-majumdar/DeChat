package a33;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import gy3.C87412m;
import h90.C98324b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import lh2.C109344g0;
import p206nj.C100115c;
import qh2.C101198e;
import wp3.C111823a;
import wp3.C111824b;

/* renamed from: a33.d */
public final class C91950d implements C109344g0 {

    /* renamed from: d */
    public VideoCompositionPlayView f263236d;

    /* renamed from: e */
    public C101198e f263237e;

    /* renamed from: f */
    public final TextView f263238f;

    /* renamed from: g */
    public Context f263239g;

    /* renamed from: h */
    public C100115c f263240h;

    /* renamed from: i */
    public C98324b f263241i;

    /* renamed from: j */
    public int f263242j = 10000;

    /* renamed from: n */
    public boolean f263243n;

    /* renamed from: o */
    public int f263244o;

    /* renamed from: p */
    public int f263245p;

    /* renamed from: q */
    public C91954f f263246q;

    /* renamed from: r */
    public boolean f263247r = true;

    /* renamed from: s */
    public final C91951a f263248s = new C91951a(this);

    /* renamed from: a33.d$a */
    public static final class C91951a implements C111824b {

        /* renamed from: d */
        public final /* synthetic */ C91950d f263249d;

        public C91951a(C91950d dVar) {
            this.f263249d = dVar;
        }

        /* renamed from: b */
        public void mo79528b(long j) {
            if (this.f263249d.f263243n) {
                Bundle bundle = new Bundle();
                bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) j);
                this.f263249d.f263237e.mo14585p(C101198e.C101199b.EDIT_CROP_VIDEO_PERCENT, bundle);
            }
        }

        /* renamed from: h */
        public void mo79529h() {
            Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "video on error");
        }

        /* renamed from: i */
        public void mo79530i() {
            Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "video on completed");
        }

        /* renamed from: n */
        public void mo84658n() {
            if (this.f263249d.f263247r) {
                Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "video on First Frame");
                C91950d dVar = this.f263249d;
                dVar.f263247r = false;
                VideoCompositionPlayView videoCompositionPlayView = dVar.f263236d;
                if (videoCompositionPlayView != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(1.0f));
                    VideoCompositionPlayView videoCompositionPlayView2 = videoCompositionPlayView;
                    C117292a.m165358d(videoCompositionPlayView2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin$videoCallback$1", "onFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    videoCompositionPlayView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(videoCompositionPlayView2, "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin$videoCallback$1", "onFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                C101198e.C62622a.m73576a(this.f263249d.f263237e, C101198e.C101199b.START_PLAY_VIDEO, (Bundle) null, 2, (Object) null);
            }
        }

        /* renamed from: o */
        public void mo79531o() {
            Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "video on start");
        }

        /* renamed from: r */
        public void mo79532r() {
            Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "videoView on FirstFrame");
        }

        /* renamed from: u */
        public void mo79533u() {
            Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "video on stop");
        }
    }

    public C91950d(VideoCompositionPlayView videoCompositionPlayView, C101198e eVar, TextView textView, Context context) {
        C87412m.m108594g(eVar, "status");
        C87412m.m108594g(context, "context");
        this.f263236d = videoCompositionPlayView;
        this.f263237e = eVar;
        this.f263238f = textView;
        this.f263239g = context;
    }

    /* renamed from: a */
    public final ViewGroup mo125802a() {
        VideoCompositionPlayView videoCompositionPlayView = this.f263236d;
        return (ViewGroup) (videoCompositionPlayView != null ? videoCompositionPlayView.getParent() : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = (r1 = (r1 = r1.animate()).scaleX(1.0f)).scaleY(1.0f);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo125803b(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r4.f263243n = r0
            android.view.ViewGroup r1 = r4.mo125802a()
            if (r1 == 0) goto L_0x0023
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 == 0) goto L_0x0023
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r2)
            if (r1 == 0) goto L_0x0023
            android.view.ViewPropertyAnimator r1 = r1.scaleY(r2)
            if (r1 == 0) goto L_0x0023
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 != 0) goto L_0x0027
            goto L_0x002c
        L_0x0027:
            r2 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r2)
        L_0x002c:
            if (r5 != 0) goto L_0x003b
            r4.f263244o = r0
            h90.b r5 = r4.f263241i
            if (r5 == 0) goto L_0x0037
            int r5 = r5.f288184e
            goto L_0x0039
        L_0x0037:
            r5 = 10000(0x2710, float:1.4013E-41)
        L_0x0039:
            r4.f263245p = r5
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a33.C91950d.mo125803b(boolean):void");
    }

    /* renamed from: c */
    public final void mo125804c() {
        StringBuilder sb = new StringBuilder();
        sb.append("releaseVideo >> ");
        VideoCompositionPlayView videoCompositionPlayView = this.f263236d;
        sb.append(videoCompositionPlayView != null ? Integer.valueOf(videoCompositionPlayView.hashCode()) : null);
        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", sb.toString());
        VideoCompositionPlayView videoCompositionPlayView2 = this.f263236d;
        if (videoCompositionPlayView2 != null) {
            if (videoCompositionPlayView2 != null) {
                videoCompositionPlayView2.mo154756f();
            }
            VideoCompositionPlayView videoCompositionPlayView3 = this.f263236d;
            if (videoCompositionPlayView3 != null) {
                videoCompositionPlayView3.setPlayerCallback((C111823a) null);
            }
            this.f263236d = null;
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C91950d.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "onDetach");
        VideoCompositionPlayView videoCompositionPlayView = this.f263236d;
        if (videoCompositionPlayView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            VideoCompositionPlayView videoCompositionPlayView2 = videoCompositionPlayView;
            C117292a.m165358d(videoCompositionPlayView2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            videoCompositionPlayView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(videoCompositionPlayView2, "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    public void onPause() {
        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "onPause");
        C100115c cVar = this.f263240h;
        if (cVar != null) {
            cVar.mo139414a();
        }
        VideoCompositionPlayView videoCompositionPlayView = this.f263236d;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.pause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "onResume");
        VideoCompositionPlayView videoCompositionPlayView = this.f263236d;
        if (videoCompositionPlayView != null) {
            C87412m.m108591d(videoCompositionPlayView);
            if (!videoCompositionPlayView.isPlaying()) {
                VideoCompositionPlayView videoCompositionPlayView2 = this.f263236d;
                C87412m.m108591d(videoCompositionPlayView2);
                videoCompositionPlayView2.mo154761h();
            }
        }
    }

    public void release() {
        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "onRelease");
        mo125804c();
    }

    public void reset() {
        Log.m105924i("MicroMsg.EditVideoPreviewPlugin", "reset");
        C100115c cVar = this.f263240h;
        if (cVar != null) {
            cVar.mo139414a();
        }
    }

    public void setVisibility(int i) {
        VideoCompositionPlayView videoCompositionPlayView = this.f263236d;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.setVisibility(i);
        }
        TextView textView = this.f263238f;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
