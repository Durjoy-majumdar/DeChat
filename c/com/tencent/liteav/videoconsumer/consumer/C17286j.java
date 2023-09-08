package com.tencent.liteav.videoconsumer.consumer;

import android.os.Message;
import android.os.SystemClock;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.C17244c;
import com.tencent.liteav.videobase.utils.C17246e;
import com.tencent.liteav.videobase.utils.C17250i;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.VideoDecodeController;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import com.tencent.liteav.videoconsumer.renderer.C17380g;
import com.tencent.liteav.videoconsumer.renderer.C17381h;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.tencent.liteav.videoconsumer.consumer.j */
public final class C17286j {

    /* renamed from: A */
    public final VideoDecodeController.C17311a f46825A = new VideoDecodeController.C17311a() {
        /* renamed from: a */
        public final void mo20334a(long j) {
        }

        /* renamed from: a */
        public final void mo20335a(PixelFrame pixelFrame, long j) {
            if (pixelFrame != null) {
                C17286j.this.f46850w.getAndSet(pixelFrame.getTimestamp());
                C17286j jVar = C17286j.this;
                if (jVar.f46843p == C17292a.STARTED) {
                    jVar.f46852y.mo20218a(pixelFrame);
                    C17286j jVar2 = C17286j.this;
                    jVar2.mo20329a(jVar2.f46853z, "onDecodeFrame", false);
                }
            }
        }

        /* renamed from: b */
        public final void mo20336b() {
            C17286j.this.mo20329a(C17277ae.m17182a(this), "onRequestKeyFrame", false);
        }

        /* renamed from: c */
        public final void mo20337c() {
        }

        /* renamed from: d */
        public final void mo20338d() {
        }

        /* renamed from: e */
        public final void mo20339e() {
        }

        /* renamed from: a */
        public final void mo20333a() {
            C17286j.this.mo20329a(C17276ad.m17181a(this), "onDecodeFailed", false);
        }
    };

    /* renamed from: B */
    private VideoRenderListener f46826B = new VideoRenderListener() {
        public final void onRenderFrame(PixelFrame pixelFrame) {
            C17286j jVar = C17286j.this;
            jVar.mo20327a(pixelFrame);
            if (jVar.f46835h != null) {
                PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
                pixelFrame2.setRotation(Rotation.NORMAL);
                jVar.f46835h.onRenderFrame(pixelFrame2);
            }
        }

        public final void onRenderTargetSizeChanged(int i, int i2) {
        }
    };

    /* renamed from: C */
    private VideoRenderListener f46827C = new VideoRenderListener() {
        public final void onRenderFrame(PixelFrame pixelFrame) {
            C17286j.this.mo20327a(pixelFrame);
        }

        public final void onRenderTargetSizeChanged(int i, int i2) {
        }
    };

    /* renamed from: a */
    public String f46828a = "VideoConsumer";

    /* renamed from: b */
    public C17111b f46829b;

    /* renamed from: c */
    public final IVideoReporter f46830c;

    /* renamed from: d */
    public C17380g f46831d;

    /* renamed from: e */
    public C17380g f46832e;

    /* renamed from: f */
    public VideoDecodeController f46833f;

    /* renamed from: g */
    public C17293b f46834g;

    /* renamed from: h */
    public VideoRenderListener f46835h;

    /* renamed from: i */
    public DisplayTarget f46836i;

    /* renamed from: j */
    public GLConstants.GLScaleType f46837j = GLConstants.GLScaleType.CENTER_CROP;

    /* renamed from: k */
    public Rotation f46838k = Rotation.NORMAL;

    /* renamed from: l */
    public boolean f46839l = false;

    /* renamed from: m */
    public final C17244c f46840m = new C17244c();

    /* renamed from: n */
    public boolean f46841n = false;

    /* renamed from: o */
    public final C17246e f46842o;

    /* renamed from: p */
    public C17292a f46843p = C17292a.STOPPED;

    /* renamed from: q */
    public boolean f46844q = false;

    /* renamed from: r */
    public int f46845r = 0;

    /* renamed from: s */
    public int f46846s = 0;

    /* renamed from: t */
    public VideoDecoderDef.ConsumerScene f46847t = VideoDecoderDef.ConsumerScene.UNKNOWN;

    /* renamed from: u */
    public Object f46848u = null;

    /* renamed from: v */
    public final AtomicLong f46849v = new AtomicLong(0);

    /* renamed from: w */
    public final AtomicLong f46850w = new AtomicLong(0);

    /* renamed from: x */
    public final C17381h f46851x;

    /* renamed from: y */
    public final C17250i f46852y = new C17250i(1);

    /* renamed from: z */
    public final Runnable f46853z = new Runnable() {
        public final void run() {
            PixelFrame a = C17286j.this.f46852y.mo20217a();
            if (a != null) {
                C17286j jVar = C17286j.this;
                int width = a.getWidth();
                int height = a.getHeight();
                if (!(jVar.f46845r == width && jVar.f46846s == height)) {
                    IVideoReporter iVideoReporter = jVar.f46830c;
                    if (iVideoReporter != null) {
                        iVideoReporter.updateStatus(C17271i.STATUS_VIDEO_DECODER_WIDTH, Integer.valueOf(width));
                        jVar.f46830c.updateStatus(C17271i.STATUS_VIDEO_DECODER_HEIGHT, Integer.valueOf(height));
                    }
                    jVar.f46845r = width;
                    jVar.f46846s = height;
                }
                for (C17380g next : jVar.mo20326a()) {
                    if (next != null) {
                        next.mo20306a(a);
                    }
                }
                if (jVar.f46834g != null) {
                    a.getTimestamp();
                }
                a.release();
            }
        }
    };

    /* renamed from: com.tencent.liteav.videoconsumer.consumer.j$a */
    public enum C17292a {
        STOPPED,
        STARTED,
        PAUSED
    }

    /* renamed from: com.tencent.liteav.videoconsumer.consumer.j$b */
    public interface C17293b {
    }

    public C17286j(IVideoReporter iVideoReporter) {
        this.f46830c = iVideoReporter;
        this.f46828a += hashCode();
        this.f46842o = new C17246e("VideoConsumer", 1000, new C17294k(this));
        this.f46851x = new C17381h(iVideoReporter);
    }

    /* renamed from: a */
    public final void mo20330a(boolean z) {
        mo20329a(C17307x.m17217a(this, z), "Stop", false);
    }

    /* renamed from: a */
    public final void mo20328a(C17380g gVar) {
        if (gVar != null) {
            gVar.mo20309a(gVar instanceof C17272a ? this.f46826B : this.f46827C);
            gVar.mo20308a(this.f46836i, true);
            gVar.mo20307a(this.f46838k);
            gVar.mo20303a(this.f46837j);
            gVar.mo20311b(this.f46839l);
        }
    }

    /* renamed from: a */
    public final void mo20327a(PixelFrame pixelFrame) {
        boolean z;
        if (pixelFrame != null) {
            this.f46849v.getAndSet(pixelFrame.getTimestamp());
            C17381h hVar = this.f46851x;
            long timestamp = pixelFrame.getTimestamp();
            int width = pixelFrame.getWidth();
            int height = pixelFrame.getHeight();
            hVar.f47121b.mo20222a();
            if (width == hVar.f47122c && height == hVar.f47123d) {
                z = false;
            } else {
                hVar.f47122c = width;
                hVar.f47123d = height;
                hVar.f47120a.updateStatus(C17271i.STATUS_VIDEO_RENDER_FRAME_WIDTH, Integer.valueOf(width));
                hVar.f47120a.updateStatus(C17271i.STATUS_VIDEO_RENDER_FRAME_HEIGHT, Integer.valueOf(height));
                z = true;
            }
            if (!hVar.f47125f) {
                LiteavLog.m16901i("VideoRenderStatistic", "rendered first frame!");
                hVar.f47120a.notifyEvent(C17263h.C17269b.EVT_VIDEO_RENDER_FIRST_FRAME, "rendered first frame", new Object[0]);
                hVar.f47125f = true;
            }
            if (z) {
                IVideoReporter iVideoReporter = hVar.f47120a;
                C17263h.C17269b bVar = C17263h.C17269b.EVT_VIDEO_RENDER_RESOLUTION_CHANGE;
                iVideoReporter.notifyEvent(bVar, "resolution change to " + width + "x" + height, new Object[0]);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            hVar.f47120a.updateStatus(C17271i.STATUS_VIDEO_RENDER_FRAME, 0);
            hVar.f47120a.updateStatus(C17271i.STATUS_VIDEO_FRAME_RENDER_PTS, Long.valueOf(timestamp));
            hVar.f47124e.mo20472a(elapsedRealtime);
        }
    }

    /* renamed from: a */
    public final void mo20329a(Runnable runnable, String str, boolean z) {
        C17111b bVar = this.f46829b;
        if (bVar == null) {
            LiteavLog.m16905w(this.f46828a, "ignore runnable: ".concat(String.valueOf(str)));
        } else if (z) {
            bVar.sendMessage(bVar.obtainMessage(1, 0, 0, runnable));
        } else {
            bVar.post(runnable);
        }
    }

    /* renamed from: a */
    public final boolean mo20331a(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof Runnable)) {
            return true;
        }
        Runnable runnable = (Runnable) obj;
        if (this.f46843p != C17292a.STOPPED) {
            runnable.run();
            return true;
        }
        this.f46840m.mo20221a(runnable);
        return true;
    }

    /* renamed from: a */
    public final List<C17380g> mo20326a() {
        ArrayList arrayList = new ArrayList();
        C17380g gVar = this.f46831d;
        if (gVar != null) {
            arrayList.add(gVar);
        }
        C17380g gVar2 = this.f46832e;
        if (gVar2 != null) {
            arrayList.add(gVar2);
        }
        return arrayList;
    }
}
