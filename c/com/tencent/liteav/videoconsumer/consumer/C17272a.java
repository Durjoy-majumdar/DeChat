package com.tencent.liteav.videoconsumer.consumer;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;
import com.tencent.liteav.videobase.frame.C17223e;
import com.tencent.liteav.videobase.frame.C17234j;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.p1096b.C104516e;
import com.tencent.liteav.videobase.p1096b.C104518g;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17257e;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videoconsumer.renderer.C17380g;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.a */
public final class C17272a implements C17257e.C17258a, C17380g {

    /* renamed from: a */
    public C104516e f46785a = null;

    /* renamed from: b */
    public volatile boolean f46786b = false;

    /* renamed from: c */
    public boolean f46787c = false;

    /* renamed from: d */
    public GLConstants.PixelFormatType f46788d = GLConstants.PixelFormatType.RGBA;

    /* renamed from: e */
    public GLConstants.PixelBufferType f46789e = GLConstants.PixelBufferType.TEXTURE_2D;

    /* renamed from: f */
    public C17257e f46790f;

    /* renamed from: g */
    public VideoRenderListener f46791g;

    /* renamed from: h */
    public C17234j f46792h;

    /* renamed from: i */
    public C17223e f46793i;

    /* renamed from: j */
    public int f46794j = 0;

    /* renamed from: k */
    public int f46795k = 0;

    /* renamed from: l */
    public Object f46796l;

    /* renamed from: m */
    public Rotation f46797m = Rotation.NORMAL;

    /* renamed from: n */
    public boolean f46798n = false;

    /* renamed from: o */
    public boolean f46799o = false;

    /* renamed from: p */
    private final C17111b f46800p;

    public C17272a(Looper looper) {
        this.f46800p = new C17111b(looper);
    }

    /* renamed from: a */
    public final void mo20304a(GLConstants.PixelFormatType pixelFormatType, GLConstants.PixelBufferType pixelBufferType) {
        m17166a(C17278b.m17183a(this, pixelFormatType, pixelBufferType));
    }

    /* renamed from: b */
    public final void mo20311b(boolean z) {
        m17166a(C17282f.m17187a(this, z));
    }

    /* renamed from: c */
    public final void mo20312c(boolean z) {
        m17166a(C17283g.m17188a(this, z));
    }

    public final void onFrameConverted(int i, PixelFrame pixelFrame) {
        m17166a(C17285i.m17190a(this, pixelFrame));
    }

    /* renamed from: a */
    public final void mo20309a(VideoRenderListener videoRenderListener) {
        LiteavLog.m16901i("CustomRenderProcess", "Start");
        m17166a(C17279c.m17184a(this, videoRenderListener));
    }

    /* renamed from: a */
    public final void mo20310a(boolean z) {
        LiteavLog.m16901i("CustomRenderProcess", "Stop");
        m17166a(C17280d.m17185a(this));
    }

    /* renamed from: a */
    public final void mo20303a(GLConstants.GLScaleType gLScaleType) {
        LiteavLog.m16901i("CustomRenderProcess", "setScaleType " + gLScaleType + " not support");
    }

    /* renamed from: a */
    public final void mo20307a(Rotation rotation) {
        LiteavLog.m16901i("CustomRenderProcess", "setRenderRotation ".concat(String.valueOf(rotation)));
        m17166a(C17281e.m17186a(this, rotation));
    }

    /* renamed from: a */
    public final void mo20308a(DisplayTarget displayTarget, boolean z) {
        LiteavLog.m16901i("CustomRenderProcess", "setDisplayView not support");
    }

    /* renamed from: a */
    public final void mo20306a(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            LiteavLog.m16905w("CustomRenderProcess", "renderFrame: pixelFrame is null.");
            return;
        }
        pixelFrame.retain();
        if (!m17166a(C17284h.m17189a(this, pixelFrame))) {
            pixelFrame.release();
        }
    }

    /* renamed from: a */
    public final void mo20305a(TakeSnapshotListener takeSnapshotListener) {
        if (takeSnapshotListener != null) {
            takeSnapshotListener.onComplete((Bitmap) null);
        }
    }

    /* renamed from: a */
    public final void mo20302a() {
        C104516e eVar = this.f46785a;
        if (eVar != null) {
            try {
                eVar.mo147195a();
            } catch (C104518g e) {
                LiteavLog.m16898e("CustomRenderProcess", "uninitializedEGL makeCurrent error " + e.toString());
            }
            LiteavLog.m16901i("CustomRenderProcess", "egl uninitializedEGL");
            C17234j jVar = this.f46792h;
            if (jVar != null) {
                jVar.mo20209a();
                this.f46792h = null;
            }
            C17223e eVar2 = this.f46793i;
            if (eVar2 != null) {
                eVar2.mo20184a();
                this.f46793i.mo20187b();
                this.f46793i = null;
            }
            C17257e eVar3 = this.f46790f;
            if (eVar3 != null) {
                eVar3.mo20257a(0, (C17257e.C17258a) this);
                this.f46790f.mo20256a();
                this.f46790f = null;
            }
            C104516e.m139822a(this.f46785a);
            this.f46785a = null;
        }
    }

    /* renamed from: a */
    private boolean m17166a(Runnable runnable) {
        if (Looper.myLooper() == this.f46800p.getLooper()) {
            runnable.run();
            return true;
        } else if (this.f46800p.getLooper().getThread().isAlive()) {
            return this.f46800p.post(runnable);
        } else {
            LiteavLog.m16905w("CustomRenderProcess", "runOnRenderThread: thread is dead!");
            return false;
        }
    }
}
