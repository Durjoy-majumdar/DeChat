package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sight.decode.model.SightPlayController;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.IXWebBroadcastListener;
import hd0.C98398h0;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import p156gj.C107835h0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView */
public class AdlandingVideoSightView extends AdlandingSightPlayImageView implements C96875r0 {

    /* renamed from: Q */
    public boolean f54318Q;

    /* renamed from: R */
    public String f54319R;

    /* renamed from: S */
    public int f54320S = 0;

    /* renamed from: T */
    public boolean f54321T = true;

    /* renamed from: U */
    public boolean f54322U = false;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$a */
    public class C19270a implements AdlandingSightPlayController.C19259d {
        public C19270a() {
        }

        /* renamed from: a */
        public void mo24814a(AdlandingSightPlayController adlandingSightPlayController, int i) {
            C96875r0.C96876a aVar;
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$1");
            if (-1 == i) {
                C96875r0.C96876a aVar2 = AdlandingVideoSightView.this.f54312L;
                if (aVar2 != null) {
                    aVar2.onError(0, 0);
                }
            } else if (i == 0 && (aVar = AdlandingVideoSightView.this.f54312L) != null) {
                aVar.onCompletion();
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$b */
    public class C19271b implements AdlandingSightPlayController.C19260e {
        public C19271b() {
        }

        /* renamed from: a */
        public void mo24815a(AdlandingSightPlayController adlandingSightPlayController, long j) {
            SnsMethodCalculate.markStartTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$2");
            AdlandingVideoSightView adlandingVideoSightView = AdlandingVideoSightView.this;
            if (adlandingVideoSightView.f54320S == 0) {
                adlandingVideoSightView.f54320S = adlandingVideoSightView.getDuration();
            }
            if (AdlandingVideoSightView.this.f54312L != null) {
                Log.m105927v("MicroMsg.VideoSightView", "onPlayTime, currentTime: %s, duration: %s", Long.valueOf(j), Integer.valueOf(AdlandingVideoSightView.this.f54320S));
                AdlandingVideoSightView adlandingVideoSightView2 = AdlandingVideoSightView.this;
                adlandingVideoSightView2.f54312L.mo76207M0((int) j, adlandingVideoSightView2.f54320S);
            }
            SnsMethodCalculate.markEndTimeMs("onDecodeProgress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$2");
        }
    }

    public AdlandingVideoSightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo24799s();
    }

    /* renamed from: a */
    public void mo24787a(double d, boolean z) {
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        mo24788d(d);
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    /* renamed from: d */
    public void mo24788d(double d) {
        SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markStartTimeMs("seekToImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        AdlandingSightPlayController adlandingSightPlayController = this.f54313M;
        if (adlandingSightPlayController != null) {
            SnsMethodCalculate.markStartTimeMs("seekToFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            Log.m105927v("MicroMsg.SightPlayController", "seekToFrame now %f %s", Double.valueOf(d), Util.getStack().toString());
            C98398h0.m127699fO(new C106154d(adlandingSightPlayController, d), 0);
            SnsMethodCalculate.markEndTimeMs("seekToFrame", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        }
        SnsMethodCalculate.markEndTimeMs("seekToImp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    /* renamed from: e */
    public boolean mo24789e(Context context, boolean z) {
        Context context2 = context;
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        if (this.f54319R == null) {
            Log.m105920e("MicroMsg.VideoSightView", "start::use path is null!");
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
            return false;
        } else if (Util.nullAs(C107835h0.f322856m.f322886Z, "").equals("other") || !SightPlayController.m119571b(this.f54319R)) {
            Log.m105925i("MicroMsg.VideoSightView", "start::use other player, path %s, has called %B", this.f54319R, Boolean.valueOf(this.f54318Q));
            if (!this.f54318Q || z) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                FileProviderHelper.setIntentDataAndType(context2, intent, new C86009m1(this.f54319R), "video/*", false);
                try {
                    Intent createChooser = Intent.createChooser(intent, context2.getString(C0966R.string.cs8));
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(createChooser);
                    C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdlandingVideoSightView", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdlandingVideoSightView", IXWebBroadcastListener.STAGE_START, "(Landroid/content/Context;Z)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.VideoSightView", "startActivity fail, activity not found");
                    C76879j.m92726T(context2, context.getResources().getString(C0966R.string.kae));
                }
                this.f54318Q = true;
                SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
            return false;
        } else {
            mo24759b(this.f54319R, false, 0);
            mo24768q(!this.f54322U);
            SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
            return true;
        }
    }

    public int getCurrentPosition() {
        SnsMethodCalculate.markStartTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        Log.m105926v("MicroMsg.VideoSightView", "get current position");
        SnsMethodCalculate.markEndTimeMs("getCurrentPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        return 0;
    }

    public int getDuration() {
        SnsMethodCalculate.markStartTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        int duration = super.getDuration();
        Log.m105926v("MicroMsg.VideoSightView", "get duration " + duration);
        SnsMethodCalculate.markEndTimeMs("getDuration", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        return duration;
    }

    public double getLastProgresstime() {
        SnsMethodCalculate.markStartTimeMs("getLastProgresstime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        if (getController() != null) {
            AdlandingSightPlayController controller = getController();
            controller.getClass();
            SnsMethodCalculate.markStartTimeMs("getLastProgresstime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            double d = controller.f54279z;
            if (d != -1.0d) {
                SnsMethodCalculate.markEndTimeMs("getLastProgresstime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            } else {
                d = controller.f54278y;
                SnsMethodCalculate.markEndTimeMs("getLastProgresstime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            }
            SnsMethodCalculate.markEndTimeMs("getLastProgresstime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
            return d;
        }
        SnsMethodCalculate.markEndTimeMs("getLastProgresstime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        return 0.0d;
    }

    public long getLastSurfaceUpdateTime() {
        SnsMethodCalculate.markStartTimeMs("getLastSurfaceUpdateTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markEndTimeMs("getLastSurfaceUpdateTime", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        return 0;
    }

    public boolean isPlaying() {
        SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markStartTimeMs("isRuning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        boolean y = this.f54313M.mo24739y();
        SnsMethodCalculate.markEndTimeMs("isRuning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        return y;
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        super.onConfigurationChanged(configuration);
        if (this.f54321T) {
            setDrawableWidth(getResources().getDisplayMetrics().widthPixels);
        }
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void onDetach() {
        SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markStartTimeMs("detach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        this.f54313M.mo24737w().dead();
        SnsMethodCalculate.markEndTimeMs("detach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        super.onLayout(z, i, i2, i3, i4);
        Log.m105927v("MicroMsg.VideoSightView", "ashutest::on layout changed %B, %d %d %d %d %s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(this.f54314N));
        if (this.f54314N && (i5 = i3 - i) > 0) {
            setDrawableWidth(i5);
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        mo24759b(this.f54319R, true, 0);
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    /* renamed from: s */
    public void mo24799s() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        if (Util.nullAs(C107835h0.f322856m.f322886Z, "").equals("other")) {
            Log.m105924i("MicroMsg.VideoSightView", "init::use other player");
        } else {
            mo24768q(true);
        }
        setOnCompletionListener(new C19270a());
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setEnableConfigChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setEnableConfigChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        this.f54321T = z;
        SnsMethodCalculate.markEndTimeMs("setEnableConfigChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setForceScaleFullScreen(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setForceScaleFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markEndTimeMs("setForceScaleFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setLoop(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        setLoopImp(z);
        SnsMethodCalculate.markEndTimeMs("setLoop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setMute(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setMute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        this.f54322U = z;
        mo24768q(!z);
        SnsMethodCalculate.markEndTimeMs("setMute", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setOnInfoCallback(C96875r0.C19571b bVar) {
        SnsMethodCalculate.markStartTimeMs("setOnInfoCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markEndTimeMs("setOnInfoCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setOnSeekCompleteCallback(C96875r0.C96877c cVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSeekCompleteCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markEndTimeMs("setOnSeekCompleteCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setOnSurfaceCallback(C96875r0.C96878d dVar) {
        SnsMethodCalculate.markStartTimeMs("setOnSurfaceCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markEndTimeMs("setOnSurfaceCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setOneTimeVideoTextureUpdateCallback(C96875r0.C96879e eVar) {
        SnsMethodCalculate.markStartTimeMs("setOneTimeVideoTextureUpdateCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markEndTimeMs("setOneTimeVideoTextureUpdateCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setPlayProgressCallback(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setPlayProgressCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        if (z) {
            setOnDecodeDurationListener(new C19271b());
        } else {
            setOnDecodeDurationListener((AdlandingSightPlayController.C19260e) null);
        }
        SnsMethodCalculate.markEndTimeMs("setPlayProgressCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setThumb(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setThumb", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        mo24769r(bitmap);
        SnsMethodCalculate.markEndTimeMs("setThumb", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setVideoCallback(C96875r0.C96876a aVar) {
        SnsMethodCalculate.markStartTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        this.f54312L = aVar;
        SnsMethodCalculate.markEndTimeMs("setVideoCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public void setVideoPath(String str) {
        SnsMethodCalculate.markStartTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = Boolean.valueOf(this.f54312L == null);
        Log.m105925i("MicroMsg.VideoSightView", "set sight path %s, callback null ? %B", objArr);
        this.f54320S = 0;
        this.f54319R = str;
        C96875r0.C96876a aVar = this.f54312L;
        if (aVar != null) {
            aVar.onPrepared();
        }
        SnsMethodCalculate.markEndTimeMs("setVideoPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public boolean start() {
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        boolean e = mo24789e(getContext(), false);
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        return e;
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        this.f54313M.mo24734t();
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayImageView");
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView");
    }

    public AdlandingVideoSightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo24799s();
    }
}
