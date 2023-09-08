package com.tencent.p014mm.pluginsdk.p133ui.tools;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sight.decode.model.C30398d;
import com.tencent.p014mm.plugin.sight.decode.model.SightPlayController;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import p156gj.C107835h0;
import p682rz.C101485o;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightView */
public class VideoSightView extends SightPlayImageView implements C96875r0 {

    /* renamed from: R */
    public boolean f283832R;

    /* renamed from: S */
    public String f283833S;

    /* renamed from: T */
    public int f283834T = 0;

    /* renamed from: U */
    public boolean f283835U = true;

    /* renamed from: V */
    public boolean f283836V = false;

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightView$a */
    public class C96862a implements SightPlayController.C94564e {
        public C96862a() {
        }

        /* renamed from: a */
        public void mo130064a(SightPlayController sightPlayController, int i) {
            C96875r0.C96876a aVar;
            if (-1 == i) {
                C96875r0.C96876a aVar2 = VideoSightView.this.f273544L;
                if (aVar2 != null) {
                    aVar2.onError(0, 0);
                }
            } else if (i == 0 && (aVar = VideoSightView.this.f273544L) != null) {
                aVar.onCompletion();
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.tools.VideoSightView$b */
    public class C96863b implements SightPlayController.C94565f {
        public C96863b() {
        }

        /* renamed from: a */
        public void mo130056a(SightPlayController sightPlayController, long j) {
            VideoSightView videoSightView = VideoSightView.this;
            if (videoSightView.f283834T == 0) {
                videoSightView.f283834T = videoSightView.getDuration();
            }
            if (VideoSightView.this.f273544L != null) {
                Log.m105927v("MicroMsg.VideoSightView", "onPlayTime, currentTime: %s, duration: %s", Long.valueOf(j), Integer.valueOf(VideoSightView.this.f283834T));
                VideoSightView videoSightView2 = VideoSightView.this;
                videoSightView2.f273544L.mo76207M0((int) j, videoSightView2.f283834T);
            }
        }
    }

    public VideoSightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo135179s();
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        mo24788d(d);
    }

    /* renamed from: b */
    public void mo130071b(String str, boolean z, int i) {
        this.f283833S = str;
        super.mo130071b(str, z, i);
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        SightPlayController sightPlayController = this.f273545M;
        if (sightPlayController != null) {
            Log.m105927v("MicroMsg.SightPlayController", "seekToFrame now %f %s", Double.valueOf(d), Util.getStack().toString());
            ((C101485o) C86312j.m106911c(C101485o.class)).mo140808fO(new C30398d(sightPlayController, d), 0);
        }
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        if (this.f283833S == null) {
            Log.m105920e("MicroMsg.VideoSightView", "start::use path is null!");
            return false;
        } else if (Util.nullAs(C107835h0.f322856m.f322886Z, "").equals("other") || !SightPlayController.m119571b(this.f283833S)) {
            Log.m105925i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", this.f283833S, Boolean.valueOf(this.f283832R));
            if (this.f283832R && !z) {
                return false;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            FileProviderHelper.setIntentDataAndType(context, intent, new C86009m1(this.f283833S), "video/*", false);
            try {
                Intent createChooser = Intent.createChooser(intent, context.getString(C0966R.string.a44));
                C9556a aVar = new C9556a();
                aVar.mo10233c(createChooser);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/tools/VideoSightView", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/tools/VideoSightView", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
                C76879j.m92726T(context, context.getResources().getString(C0966R.string.kae));
            }
            this.f283832R = true;
            return false;
        } else {
            super.mo130071b(this.f283833S, false, 0);
            mo130096p(!this.f283836V);
            return true;
        }
    }

    public int getCurrentPosition() {
        Log.m105926v("MicroMsg.VideoSightView", "get current position");
        return 0;
    }

    public int getDuration() {
        int duration = super.getDuration();
        Log.m105926v("MicroMsg.VideoSightView", "get duration " + duration);
        return duration;
    }

    public double getLastProgresstime() {
        if (getController() == null) {
            return 0.0d;
        }
        SightPlayController controller = getController();
        double d = controller.f273462C;
        return d != -1.0d ? d : controller.f273461B;
    }

    public long getLastSurfaceUpdateTime() {
        return 0;
    }

    public boolean isPlaying() {
        return this.f273545M.mo130050j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f283835U) {
            setDrawableWidth(getResources().getDisplayMetrics().widthPixels);
        }
    }

    public void onDetach() {
        this.f273545M.mo130048h().dead();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        Log.m105927v("MicroMsg.VideoSightView", "ashutest::on layout changed %B, %d %d %d %d %s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(this.f273546N));
        if (this.f273546N && (i5 = i3 - i) > 0) {
            setDrawableWidth(i5);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void pause() {
        super.mo130071b(this.f283833S, true, 0);
    }

    /* renamed from: s */
    public void mo135179s() {
        if (Util.nullAs(C107835h0.f322856m.f322886Z, "").equals("other")) {
            Log.m105924i("MicroMsg.VideoSightView", "init::use other player");
        } else {
            mo130096p(true);
        }
        setOnCompletionListener(new C96862a());
    }

    public void setEnableConfigChanged(boolean z) {
        this.f283835U = z;
    }

    public void setForceScaleFullScreen(boolean z) {
    }

    public void setLoop(boolean z) {
        setLoopImp(z);
    }

    public void setMute(boolean z) {
        this.f283836V = z;
        mo130096p(!z);
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
    }

    public void setPlayProgressCallback(boolean z) {
        if (z) {
            setOnDecodeDurationListener(new C96863b());
        } else {
            setOnDecodeDurationListener((SightPlayController.C94565f) null);
        }
    }

    public void setThumb(Bitmap bitmap) {
        mo130098r(bitmap);
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        this.f273544L = aVar;
    }

    public void setVideoPath(String str) {
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(this.f273544L == null);
        Log.m105925i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", objArr);
        this.f283834T = 0;
        this.f283833S = str;
        C96875r0.C96876a aVar = this.f273544L;
        if (aVar != null) {
            aVar.onPrepared();
        }
    }

    public boolean start() {
        return mo24789e(getContext(), false);
    }

    public void stop() {
        clear();
    }

    public VideoSightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo135179s();
    }

    public VideoSightView(Context context) {
        super(context, (AttributeSet) null, 0);
        mo135179s();
    }
}
