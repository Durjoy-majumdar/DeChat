package com.tencent.p014mm.plugin.voip.widget;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.voip.p475ui.C106448g;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.plugin.voip.video.camera.prev.CaptureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.lang.ref.WeakReference;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.widget.BaseSmallView */
public abstract class BaseSmallView extends FrameLayout {

    /* renamed from: d */
    public WindowManager f318159d;

    /* renamed from: e */
    public int f318160e = -1;

    /* renamed from: f */
    public WeakReference<C106448g> f318161f;

    /* renamed from: g */
    public Runnable f318162g = new C106504a();

    /* renamed from: com.tencent.mm.plugin.voip.widget.BaseSmallView$a */
    public class C106504a implements Runnable {

        /* renamed from: com.tencent.mm.plugin.voip.widget.BaseSmallView$a$a */
        public class C106505a implements Runnable {
            public C106505a() {
            }

            public void run() {
                BaseSmallView.this.mo153023g();
            }
        }

        public C106504a() {
        }

        public void run() {
            MMHandlerThread.postToMainThread(new C106505a());
        }
    }

    public BaseSmallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new PointF();
        new Point();
        new Point();
        new Point();
        this.f318159d = (WindowManager) context.getSystemService("window");
        new MMHandler();
        new Point(this.f318159d.getDefaultDisplay().getWidth(), this.f318159d.getDefaultDisplay().getHeight());
    }

    /* renamed from: c */
    public void mo153021c(boolean z) {
        ((C119157j) C119157j.f356862d).mo183894y("resumeIcon");
        ((C119157j) C119157j.f356862d).mo183879j(this.f318162g, 2000, "resumeIcon");
    }

    /* renamed from: d */
    public boolean mo153022d() {
        ((C119157j) C119157j.f356862d).mo183894y("resumeIcon");
        return true;
    }

    /* renamed from: e */
    public void mo153119e(int i) {
    }

    /* renamed from: f */
    public void mo153120f() {
    }

    /* renamed from: g */
    public void mo153023g() {
    }

    @Deprecated
    public OpenGlRender getBeautyData() {
        return null;
    }

    @Deprecated
    public OpenGlRender getSpatioTemporalFilterData() {
        return null;
    }

    /* renamed from: h */
    public void mo153026h() {
        ((C119157j) C119157j.f356862d).mo183894y("resumeIcon");
        ((C119157j) C119157j.f356862d).mo183879j(this.f318162g, 2000, "resumeIcon");
    }

    /* renamed from: i */
    public void mo153121i(int i, int i2) {
    }

    /* renamed from: j */
    public void mo153122j(boolean z) {
    }

    /* renamed from: k */
    public void mo153123k() {
        this.f318159d = null;
    }

    /* renamed from: l */
    public void mo153027l(String str) {
    }

    /* renamed from: m */
    public void mo153028m(String str) {
    }

    @Deprecated
    public void onAnimationEnd() {
    }

    @Deprecated
    public void setCaptureView(CaptureView captureView) {
    }

    public void setConnectSec(long j) {
    }

    @Deprecated
    public void setHWDecMode(int i) {
    }

    @Deprecated
    public void setSpatiotemporalDenosing(int i) {
    }

    public void setStatus(int i) {
    }

    public void setVoicePlayDevice(int i) {
        ((C119157j) C119157j.f356862d).mo183894y("resumeIcon");
        ((C119157j) C119157j.f356862d).mo183879j(this.f318162g, 2000, "resumeIcon");
    }

    @Deprecated
    public void setVoipBeauty(int i) {
    }

    public void setVoipUIListener(C106448g gVar) {
        Log.m105924i("MicroMsg.Voip.BaseSmallView", "hwViewSmall setVoipUIListener, before initHWView");
        this.f318161f = new WeakReference<>(gVar);
    }
}
