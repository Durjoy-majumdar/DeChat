package com.tencent.p014mm.plugin.sns.p106ui.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import bv2.C92315e;
import bv2.C92318f;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerTextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f03.C97787h;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import s62.C110768l;
import s62.C110770m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView */
public class SnsTimelineVideoView extends OnlineVideoView {

    /* renamed from: R1 */
    public static final /* synthetic */ int f281248R1 = 0;

    /* renamed from: I1 */
    public C96252c f281249I1 = C96252c.AVAILABLE;

    /* renamed from: J1 */
    public C92318f f281250J1;

    /* renamed from: K1 */
    public String f281251K1;

    /* renamed from: L1 */
    public long f281252L1 = 0;

    /* renamed from: M1 */
    public View f281253M1;

    /* renamed from: N1 */
    public volatile boolean f281254N1 = false;

    /* renamed from: O1 */
    public boolean f281255O1 = false;

    /* renamed from: P1 */
    public volatile boolean f281256P1 = false;

    /* renamed from: Q1 */
    public C96253d f281257Q1 = null;

    /* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$a */
    public class C96250a implements Runnable {
        public C96250a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$1");
            SnsTimelineVideoView.this.mo130402D();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$b */
    public class C96251b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f281259d;

        public C96251b(String str) {
            this.f281259d = str;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$2");
            try {
                SnsTimelineVideoView snsTimelineVideoView = SnsTimelineVideoView.this;
                int i = SnsTimelineVideoView.f281248R1;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
                C96253d dVar = snsTimelineVideoView.f281257Q1;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
                dVar.mo133426O3(this.f281259d);
                SnsTimelineVideoView snsTimelineVideoView2 = SnsTimelineVideoView.this;
                SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
                snsTimelineVideoView2.f281257Q1 = null;
                SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Sns.SnsOnlineVideoView", e, "doUICallback", new Object[0]);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$c */
    public enum C96252c {
        AVAILABLE,
        ATTACHING,
        PLAYING
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView$d */
    public interface C96253d {
        /* renamed from: O3 */
        void mo133426O3(String str);
    }

    public SnsTimelineVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m123379g0();
    }

    /* renamed from: g0 */
    private void m123379g0() {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        this.f281253M1 = findViewById(C0966R.C0970id.l86);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: D */
    public void mo130402D() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        mo133916e0(this.f281251K1);
        this.f281251K1 = "";
        super.mo130402D();
        this.f281254N1 = false;
        this.f281256P1 = true;
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%d on destroy succ", Integer.valueOf(hashCode()));
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: E */
    public void mo130403E() {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        mo133917f0();
        super.mo130403E();
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: G */
    public void mo132317G() {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        C96875r0 r0Var = this.f277145A;
        if (r0Var instanceof ThumbPlayerVideoView) {
            ThumbPlayerVideoView thumbPlayerVideoView = (ThumbPlayerVideoView) r0Var;
            Bitmap bitmap = null;
            try {
                bitmap = thumbPlayerVideoView.getBitmap(thumbPlayerVideoView.getWidth() / 2, thumbPlayerVideoView.getHeight() / 2);
            } catch (OutOfMemoryError unused) {
                Log.m105920e("MicroMsg.Sns.SnsOnlineVideoView", "OOM occurs, ignore bitmap");
            }
            if (bitmap != null) {
                this.f277153E.setImageBitmap(bitmap);
            }
        }
        super.mo132317G();
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: K */
    public void mo130404K() {
        SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        super.mo130404K();
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%s resumePlay, setState PLAYING", Integer.valueOf(hashCode()));
        this.f281249I1 = C96252c.PLAYING;
        this.f281252L1 = System.currentTimeMillis();
        mo133917f0();
        mo132329U(true);
        SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: c0 */
    public void mo133915c0() {
        SnsMethodCalculate.markStartTimeMs("doUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        try {
            C96253d dVar = this.f281257Q1;
            if (dVar != null) {
                dVar.mo133426O3(this.f281251K1);
                this.f281257Q1 = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Sns.SnsOnlineVideoView", e, "doUICallback", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("doUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: e0 */
    public final void mo133916e0(String str) {
        SnsMethodCalculate.markStartTimeMs("doUICallbackAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        if (this.f281257Q1 != null && !Util.isNullOrNil(str)) {
            post(new C96251b(str));
        }
        SnsMethodCalculate.markEndTimeMs("doUICallbackAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: f0 */
    public void mo133917f0() {
        SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        View view = this.f281253M1;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "hidePlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%s refreshPlayBtn gone", Integer.valueOf(hashCode()));
        }
        SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public View getInnerVideoView() {
        SnsMethodCalculate.markStartTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        C96875r0 r0Var = this.f277145A;
        if (r0Var instanceof View) {
            View view = (View) r0Var;
            SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return view;
        }
        SnsMethodCalculate.markEndTimeMs("getInnerVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        return null;
    }

    /* renamed from: h0 */
    public boolean mo133919h0() {
        C110770m mVar;
        SnsMethodCalculate.markStartTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        C96875r0 r0Var = this.f277145A;
        boolean z = true;
        if (r0Var instanceof VideoPlayerTextureView) {
            C110768l lVar = ((VideoPlayerTextureView) r0Var).f318486j;
            if (lVar == null || (mVar = lVar.f331337f) == null || mVar.f331350j != 4) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return z;
        } else if (r0Var instanceof ThumbPlayerVideoView) {
            if (((ThumbPlayerVideoView) r0Var).f54454u != 6) {
                z = false;
            }
            SnsMethodCalculate.markEndTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return z;
        } else {
            Log.m105920e("MicroMsg.Sns.SnsOnlineVideoView", "videoview not VideoPlayerTextureView");
            SnsMethodCalculate.markEndTimeMs("isPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            return false;
        }
    }

    /* renamed from: i0 */
    public void mo133920i0() {
        SnsMethodCalculate.markStartTimeMs("onDestroyAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%d onDestroyAsync", Integer.valueOf(hashCode()));
        mo133916e0(this.f281251K1);
        this.f281251K1 = "";
        this.f281254N1 = true;
        C97787h hVar = this.f277172S0;
        if (hVar != null) {
            hVar.stop();
            this.f277172S0 = null;
        }
        if (this.f277155F != null) {
            this.f277155F.mo132418q();
            this.f277155F.mo132405d();
            this.f277155F = null;
        }
        mo132356s();
        ((C119157j) C119157j.f356862d).mo183875f(new C96250a());
        SnsMethodCalculate.markEndTimeMs("onDestroyAsync", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: j0 */
    public void mo133921j0() {
        SnsMethodCalculate.markStartTimeMs("onDestroyWithoutCallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        this.f281251K1 = "";
        super.mo130402D();
        this.f281254N1 = false;
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%d onDestroyWithoutCallback succ", Integer.valueOf(hashCode()));
        SnsMethodCalculate.markEndTimeMs("onDestroyWithoutCallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: k0 */
    public void mo133922k0(boolean z) {
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        mo132317G();
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%s pausePlay, setState ATTACHING", Integer.valueOf(hashCode()));
        this.f281249I1 = C96252c.ATTACHING;
        if (z) {
            SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
            View view = this.f281253M1;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(1.0f));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "showPlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/video/SnsTimelineVideoView", "showPlayBtn", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%s refreshPlayBtn visible", Integer.valueOf(hashCode()));
            }
            SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        }
        mo132356s();
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: l0 */
    public void mo133923l0() {
        SnsMethodCalculate.markStartTimeMs("pausePlayWithoutChangePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        mo133922k0(false);
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%s pausePlayWithoutChangePlayBtn, setState ATTACHING", Integer.valueOf(hashCode()));
        SnsMethodCalculate.markEndTimeMs("pausePlayWithoutChangePlayBtn", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    /* renamed from: m0 */
    public void mo133924m0() {
        SnsMethodCalculate.markStartTimeMs("reportVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        C92315e eVar = this.f277174T0;
        if (eVar != null) {
            eVar.mo126316i();
        }
        SnsMethodCalculate.markEndTimeMs("reportVideoPause", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        super.onDetachedFromWindow();
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%s onDetachedFromWindow, setState AVAILABLE, %s", Integer.valueOf(hashCode()), Boolean.valueOf(this.f281255O1));
        this.f281249I1 = C96252c.AVAILABLE;
        if (!this.f281255O1) {
            mo133920i0();
        } else {
            this.f281255O1 = false;
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public void setUICallback(C96253d dVar) {
        SnsMethodCalculate.markStartTimeMs("setUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
        Log.m105925i("MicroMsg.Sns.SnsOnlineVideoView", "%s videoview setUICallback", Integer.valueOf(hashCode()));
        this.f281257Q1 = dVar;
        SnsMethodCalculate.markEndTimeMs("setUICallback", "com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView");
    }

    public SnsTimelineVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m123379g0();
    }

    public SnsTimelineVideoView(Context context) {
        super(context, (AttributeSet) null);
        m123379g0();
    }

    public SnsTimelineVideoView(Context context, boolean z) {
        super(context, (AttributeSet) null);
        this.f277190e1 = z;
        m123379g0();
    }
}
