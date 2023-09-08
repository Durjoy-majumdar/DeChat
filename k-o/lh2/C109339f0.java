package lh2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import h90.C98324b;
import ih2.C60287a;
import lh2.C109344g0;
import p206nj.C100115c;
import qh2.C101198e;
import zg2.C103020m;

/* renamed from: lh2.f0 */
public final class C109339f0 implements C109344g0 {

    /* renamed from: d */
    public VideoPlayerTextureView f327322d;

    /* renamed from: e */
    public final TextView f327323e;

    /* renamed from: f */
    public C100115c f327324f;

    /* renamed from: g */
    public Context f327325g;

    /* renamed from: h */
    public long f327326h;

    /* renamed from: i */
    public C98324b f327327i;

    /* renamed from: j */
    public int f327328j;

    /* renamed from: n */
    public boolean f327329n;

    /* renamed from: o */
    public int f327330o;

    /* renamed from: p */
    public int f327331p;

    /* renamed from: q */
    public boolean f327332q;

    /* renamed from: r */
    public int f327333r;

    /* renamed from: s */
    public final C109340a f327334s;

    /* renamed from: lh2.f0$a */
    public static final class C109340a implements C96875r0.C96876a {

        /* renamed from: d */
        public final /* synthetic */ C109339f0 f327335d;

        /* renamed from: e */
        public final /* synthetic */ C101198e f327336e;

        /* renamed from: lh2.f0$a$a */
        public static final class C109341a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C109339f0 f327337d;

            public C109341a(C109339f0 f0Var) {
                this.f327337d = f0Var;
            }

            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append("video onPrepared l:");
                VideoPlayerTextureView videoPlayerTextureView = this.f327337d.f327322d;
                Integer num = null;
                sb.append(videoPlayerTextureView != null ? Integer.valueOf(videoPlayerTextureView.getLeft()) : null);
                sb.append(" t:");
                VideoPlayerTextureView videoPlayerTextureView2 = this.f327337d.f327322d;
                sb.append(videoPlayerTextureView2 != null ? Integer.valueOf(videoPlayerTextureView2.getTop()) : null);
                sb.append(" r:");
                VideoPlayerTextureView videoPlayerTextureView3 = this.f327337d.f327322d;
                sb.append(videoPlayerTextureView3 != null ? Integer.valueOf(videoPlayerTextureView3.getRight()) : null);
                sb.append(" b:");
                VideoPlayerTextureView videoPlayerTextureView4 = this.f327337d.f327322d;
                if (videoPlayerTextureView4 != null) {
                    num = Integer.valueOf(videoPlayerTextureView4.getBottom());
                }
                sb.append(num);
                Log.m105924i("MicroMsg.EditVideoPlayPlugin", sb.toString());
                C103020m mVar = C103020m.f303985a;
                Rect rect = C103020m.f303988d;
                VideoPlayerTextureView videoPlayerTextureView5 = this.f327337d.f327322d;
                C87412m.m108591d(videoPlayerTextureView5);
                int left = videoPlayerTextureView5.getLeft();
                VideoPlayerTextureView videoPlayerTextureView6 = this.f327337d.f327322d;
                C87412m.m108591d(videoPlayerTextureView6);
                int top = videoPlayerTextureView6.getTop();
                VideoPlayerTextureView videoPlayerTextureView7 = this.f327337d.f327322d;
                C87412m.m108591d(videoPlayerTextureView7);
                int right = videoPlayerTextureView7.getRight();
                VideoPlayerTextureView videoPlayerTextureView8 = this.f327337d.f327322d;
                C87412m.m108591d(videoPlayerTextureView8);
                rect.set(new Rect(left, top, right, videoPlayerTextureView8.getBottom()));
            }
        }

        /* renamed from: lh2.f0$a$b */
        public static final class C109342b implements C96875r0.C96879e {

            /* renamed from: d */
            public final /* synthetic */ C109339f0 f327338d;

            /* renamed from: e */
            public final /* synthetic */ C101198e f327339e;

            /* renamed from: lh2.f0$a$b$a */
            public static final class C109343a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C109339f0 f327340d;

                /* renamed from: e */
                public final /* synthetic */ C101198e f327341e;

                public C109343a(C109339f0 f0Var, C101198e eVar) {
                    this.f327340d = f0Var;
                    this.f327341e = eVar;
                }

                public final void run() {
                    Log.m105924i("MicroMsg.MMRecordUI", "onTextureUpdate");
                    VideoPlayerTextureView videoPlayerTextureView = this.f327340d.f327322d;
                    if (videoPlayerTextureView != null) {
                        videoPlayerTextureView.setAlpha(1.0f);
                    }
                    C101198e.C62622a.m73576a(this.f327341e, C101198e.C101199b.START_PLAY_VIDEO, (Bundle) null, 2, (Object) null);
                }
            }

            public C109342b(C109339f0 f0Var, C101198e eVar) {
                this.f327338d = f0Var;
                this.f327339e = eVar;
            }

            /* renamed from: r */
            public final void mo79636r() {
                MMHandlerThread.postToMainThreadDelayed(new C109343a(this.f327338d, this.f327339e), 10);
            }
        }

        public C109340a(C109339f0 f0Var, C101198e eVar) {
            this.f327335d = f0Var;
            this.f327336e = eVar;
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            C101198e.C101199b bVar = C101198e.C101199b.EDIT_CROP_VIDEO_PERCENT;
            long j = this.f327335d.f327326h;
            Integer num = null;
            if (j <= 0 || Util.ticksToNow(j) >= 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append(' ');
                VideoPlayerTextureView videoPlayerTextureView = this.f327335d.f327322d;
                sb.append(videoPlayerTextureView != null ? Boolean.valueOf(videoPlayerTextureView.isPlaying()) : null);
                sb.append(" videoPlayView.currentPosition: ");
                VideoPlayerTextureView videoPlayerTextureView2 = this.f327335d.f327322d;
                sb.append(videoPlayerTextureView2 != null ? Integer.valueOf(videoPlayerTextureView2.getCurrentPosition()) : null);
                sb.append(" + ");
                sb.append(this.f327335d.f327331p);
                Log.m105918d("MicroMsg.EditVideoPlayPlugin", sb.toString());
                this.f327335d.f327326h = Util.currentTicks();
            }
            VideoPlayerTextureView videoPlayerTextureView3 = this.f327335d.f327322d;
            C87412m.m108591d(videoPlayerTextureView3);
            if (!videoPlayerTextureView3.isPlaying()) {
                return 0;
            }
            VideoPlayerTextureView videoPlayerTextureView4 = this.f327335d.f327322d;
            C87412m.m108591d(videoPlayerTextureView4);
            int currentPosition = videoPlayerTextureView4.getCurrentPosition();
            C109339f0 f0Var = this.f327335d;
            int i3 = f0Var.f327331p;
            if (currentPosition >= i3) {
                VideoPlayerTextureView videoPlayerTextureView5 = f0Var.f327322d;
                C87412m.m108591d(videoPlayerTextureView5);
                if (i3 < videoPlayerTextureView5.getDuration()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("currentPosition:");
                    VideoPlayerTextureView videoPlayerTextureView6 = this.f327335d.f327322d;
                    if (videoPlayerTextureView6 != null) {
                        num = Integer.valueOf(videoPlayerTextureView6.getCurrentPosition());
                    }
                    sb4.append(num);
                    sb4.append(" reach endTime:");
                    sb4.append(this.f327335d.f327331p);
                    sb4.append(", seekTo startTime:");
                    sb4.append(this.f327335d.f327330o);
                    sb4.append(", isClipMode:");
                    sb4.append(this.f327335d.f327329n);
                    Log.m105924i("MicroMsg.EditVideoPlayPlugin", sb4.toString());
                    C109339f0 f0Var2 = this.f327335d;
                    VideoPlayerTextureView videoPlayerTextureView7 = f0Var2.f327322d;
                    if (videoPlayerTextureView7 != null) {
                        videoPlayerTextureView7.mo24787a((double) f0Var2.f327330o, true);
                    }
                }
            }
            if (this.f327335d.f327329n) {
                Bundle bundle = new Bundle();
                VideoPlayerTextureView videoPlayerTextureView8 = this.f327335d.f327322d;
                C87412m.m108591d(videoPlayerTextureView8);
                bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", videoPlayerTextureView8.getCurrentPosition());
                this.f327336e.mo14585p(bVar, bundle);
                return 0;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f327335d.getClass();
            if (currentTimeMillis - 0 < ((long) this.f327335d.f327333r)) {
                return 0;
            }
            Bundle bundle2 = new Bundle();
            VideoPlayerTextureView videoPlayerTextureView9 = this.f327335d.f327322d;
            C87412m.m108591d(videoPlayerTextureView9);
            bundle2.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", videoPlayerTextureView9.getCurrentPosition());
            this.f327336e.mo14585p(bVar, bundle2);
            return 0;
        }

        public void onCompletion() {
            Log.m105924i("MicroMsg.EditVideoPlayPlugin", "onCompletion, startTime:" + this.f327335d.f327330o);
            C109339f0 f0Var = this.f327335d;
            VideoPlayerTextureView videoPlayerTextureView = f0Var.f327322d;
            if (videoPlayerTextureView != null) {
                videoPlayerTextureView.mo24787a((double) f0Var.f327330o, true);
            }
        }

        public void onError(int i, int i2) {
            Log.m105921e("MicroMsg.MMRecordUI", "%d on error what %d extra %d", Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2));
        }

        public void onPrepared() {
            Log.m105924i("MicroMsg.EditVideoPlayPlugin", "video onPrepared");
            C109339f0 f0Var = this.f327335d;
            if (f0Var.f327332q) {
                C75044y4.m89990b(f0Var.f327325g);
                C103020m mVar = C103020m.f303985a;
                Rect rect = C103020m.f303988d;
                int i = C60287a.f171906a;
                rect.set(new Rect(0, 0, C60287a.f171906a, C60287a.f171907b));
            } else {
                VideoPlayerTextureView videoPlayerTextureView = f0Var.f327322d;
                if (videoPlayerTextureView != null) {
                    videoPlayerTextureView.invalidate();
                }
                C109339f0 f0Var2 = this.f327335d;
                VideoPlayerTextureView videoPlayerTextureView2 = f0Var2.f327322d;
                if (videoPlayerTextureView2 != null) {
                    videoPlayerTextureView2.post(new C109341a(f0Var2));
                }
            }
            C109339f0 f0Var3 = this.f327335d;
            f0Var3.f327326h = -1;
            VideoPlayerTextureView videoPlayerTextureView3 = f0Var3.f327322d;
            if (videoPlayerTextureView3 != null) {
                videoPlayerTextureView3.start();
            }
            VideoPlayerTextureView videoPlayerTextureView4 = this.f327335d.f327322d;
            if (videoPlayerTextureView4 != null) {
                videoPlayerTextureView4.setLoop(true);
            }
            C109339f0 f0Var4 = this.f327335d;
            VideoPlayerTextureView videoPlayerTextureView5 = f0Var4.f327322d;
            if (videoPlayerTextureView5 != null) {
                videoPlayerTextureView5.setOneTimeVideoTextureUpdateCallback(new C109342b(f0Var4, this.f327336e));
            }
            Bundle bundle = new Bundle();
            C109339f0 f0Var5 = this.f327335d;
            if (f0Var5.f327331p - f0Var5.f327330o > f0Var5.f327328j + 750) {
                bundle.putBoolean("PARAM_VIDEO_NEED_CROP", true);
            }
            this.f327336e.mo14585p(C101198e.C101199b.EDIT_VIDEO_PREPARE, bundle);
            C109339f0 f0Var6 = this.f327335d;
            int i2 = f0Var6.f327331p - f0Var6.f327330o;
            int i3 = f0Var6.f327328j;
            if (i2 > i3 + 750) {
                f0Var6.f327331p = i3 + 250;
                C101198e.C62622a.m73576a(this.f327336e, C101198e.C101199b.EDIT_FORCE_CROP_VIDEO, (Bundle) null, 2, (Object) null);
            }
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    public C109339f0(VideoPlayerTextureView videoPlayerTextureView, C101198e eVar, TextView textView) {
        C87412m.m108594g(eVar, "status");
        this.f327322d = videoPlayerTextureView;
        this.f327323e = textView;
        this.f327325g = videoPlayerTextureView != null ? videoPlayerTextureView.getContext() : null;
        this.f327326h = -1;
        this.f327328j = 10000;
        this.f327333r = 333;
        this.f327334s = new C109340a(this, eVar);
    }

    /* renamed from: a */
    public final ViewGroup mo160538a() {
        VideoPlayerTextureView videoPlayerTextureView = this.f327322d;
        return (ViewGroup) (videoPlayerTextureView != null ? videoPlayerTextureView.getParent() : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = (r1 = (r1 = r1.animate()).scaleX(1.0f)).scaleY(1.0f);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160539b(boolean r5) {
        /*
            r4 = this;
            r0 = 0
            r4.f327329n = r0
            android.view.ViewGroup r1 = r4.mo160538a()
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
            r4.f327330o = r0
            h90.b r5 = r4.f327327i
            if (r5 == 0) goto L_0x0037
            int r5 = r5.f288184e
            goto L_0x0039
        L_0x0037:
            r5 = 10000(0x2710, float:1.4013E-41)
        L_0x0039:
            r4.f327331p = r5
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C109339f0.mo160539b(boolean):void");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C109339f0.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
        release();
    }

    public void onPause() {
        Log.m105924i("MicroMsg.EditVideoPlayPlugin", "onPause");
        C100115c cVar = this.f327324f;
        if (cVar != null) {
            cVar.mo139414a();
        }
        VideoPlayerTextureView videoPlayerTextureView = this.f327322d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.pause();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.EditVideoPlayPlugin", "onResume");
        VideoPlayerTextureView videoPlayerTextureView = this.f327322d;
        C87412m.m108591d(videoPlayerTextureView);
        if (!videoPlayerTextureView.isPlaying()) {
            C100115c cVar = this.f327324f;
            if (cVar != null) {
                cVar.mo139415b();
            }
            VideoPlayerTextureView videoPlayerTextureView2 = this.f327322d;
            if (videoPlayerTextureView2 != null) {
                videoPlayerTextureView2.start();
            }
        }
    }

    public void release() {
        Log.m105924i("MicroMsg.EditVideoPlayPlugin", "release");
        C100115c cVar = this.f327324f;
        if (cVar != null) {
            cVar.mo139414a();
        }
        VideoPlayerTextureView videoPlayerTextureView = this.f327322d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
        }
        VideoPlayerTextureView videoPlayerTextureView2 = this.f327322d;
        if (videoPlayerTextureView2 != null) {
            videoPlayerTextureView2.setVideoCallback((C96875r0.C96876a) null);
        }
    }

    public void reset() {
        Log.m105924i("MicroMsg.EditVideoPlayPlugin", "release");
        C100115c cVar = this.f327324f;
        if (cVar != null) {
            cVar.mo139414a();
        }
        VideoPlayerTextureView videoPlayerTextureView = this.f327322d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
        }
        VideoPlayerTextureView videoPlayerTextureView2 = this.f327322d;
        if (videoPlayerTextureView2 != null) {
            videoPlayerTextureView2.setVideoCallback((C96875r0.C96876a) null);
        }
    }

    public void setVisibility(int i) {
        VideoPlayerTextureView videoPlayerTextureView = this.f327322d;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.setVisibility(i);
        }
        TextView textView = this.f327323e;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
