package com.tencent.p014mm.plugin.finder.view;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.TextureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import p156gj.C107835h0;
import p914oj.C110052b;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.finder.view.o5 */
public final class C105312o5 {

    /* renamed from: a */
    public final String f312918a;

    /* renamed from: b */
    public final TextureView f312919b;

    /* renamed from: c */
    public final String f312920c = "Finder.FinderVideoFrameSeeker";

    /* renamed from: d */
    public final Object f312921d = new Object();

    /* renamed from: e */
    public C110052b f312922e;

    /* renamed from: f */
    public C110052b f312923f;

    /* renamed from: g */
    public MediaCodec f312924g;

    /* renamed from: h */
    public MediaFormat f312925h;

    /* renamed from: i */
    public String f312926i;

    /* renamed from: j */
    public HandlerThread f312927j;

    /* renamed from: k */
    public MMHandler f312928k;

    /* renamed from: l */
    public long f312929l = -1;

    /* renamed from: m */
    public long f312930m = -1;

    /* renamed from: n */
    public long f312931n = -1;

    /* renamed from: o */
    public boolean f312932o;

    /* renamed from: p */
    public boolean f312933p;

    /* renamed from: com.tencent.mm.plugin.finder.view.o5$a */
    public static final class C105313a implements TextureView.SurfaceTextureListener {

        /* renamed from: d */
        public final /* synthetic */ C105312o5 f312934d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f312935e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Long, C13598b0> f312936f;

        /* renamed from: g */
        public final /* synthetic */ C32224a<C13598b0> f312937g;

        /* renamed from: com.tencent.mm.plugin.finder.view.o5$a$a */
        public static final class C105314a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C105312o5 f312938d;

            /* renamed from: e */
            public final /* synthetic */ SurfaceTexture f312939e;

            /* renamed from: f */
            public final /* synthetic */ C32226l<Long, C13598b0> f312940f;

            /* renamed from: g */
            public final /* synthetic */ C32224a<C13598b0> f312941g;

            /* renamed from: com.tencent.mm.plugin.finder.view.o5$a$a$a */
            public static final class C105315a extends MediaCodec.Callback {

                /* renamed from: a */
                public final /* synthetic */ C105312o5 f312942a;

                /* renamed from: b */
                public final /* synthetic */ C32226l<Long, C13598b0> f312943b;

                public C105315a(C105312o5 o5Var, C32226l<? super Long, C13598b0> lVar) {
                    this.f312942a = o5Var;
                    this.f312943b = lVar;
                }

                public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                    C87412m.m108594g(mediaCodec, "codec");
                    C87412m.m108594g(codecException, "e");
                }

                public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
                    C87412m.m108594g(mediaCodec, "decoder");
                    Log.m105924i(this.f312942a.f312920c, "lxl onInputBufferAvailable");
                    C105312o5 o5Var = this.f312942a;
                    synchronized (o5Var.f312921d) {
                        if (i >= 0) {
                            try {
                                ByteBuffer inputBuffer = mediaCodec.getInputBuffer(i);
                                C110052b a = o5Var.mo149783a();
                                C87412m.m108591d(inputBuffer);
                                int f = a.mo161387f(inputBuffer, 0);
                                if (f < 0) {
                                    Log.m105924i(o5Var.f312920c, "lxl queueInputBuffer BUFFER_FLAG_END_OF_STREAM");
                                    mediaCodec.queueInputBuffer(i, 0, 0, 0, 4);
                                } else {
                                    mediaCodec.queueInputBuffer(i, 0, f, o5Var.mo149783a().mo161383b(), 0);
                                    o5Var.mo149783a().mo161382a();
                                    String str = o5Var.f312920c;
                                    Log.m105924i(str, "lxl queueInputBuffer " + (o5Var.mo149783a().mo161383b() / ((long) 1000)));
                                }
                                if (o5Var.f312932o) {
                                    o5Var.f312921d.wait();
                                    o5Var.f312932o = false;
                                }
                            } catch (Throwable th) {
                                Log.printErrStackTrace(o5Var.f312920c, th, "lxl onInputBufferAvailable exception", new Object[0]);
                            }
                        }
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
                    r10 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9.f312942a.f312920c, r10, "lxl onOutputBufferAvailable exception", new java.lang.Object[0]);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
                    return;
                 */
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onOutputBufferAvailable(android.media.MediaCodec r10, int r11, android.media.MediaCodec.BufferInfo r12) {
                    /*
                        r9 = this;
                        java.lang.String r0 = "decoder"
                        gy3.C87412m.m108594g(r10, r0)
                        java.lang.String r0 = "bufferInfo"
                        gy3.C87412m.m108594g(r12, r0)
                        com.tencent.mm.plugin.finder.view.o5 r0 = r9.f312942a
                        java.lang.String r0 = r0.f312920c
                        java.lang.String r1 = "lxl onOutputBufferAvailable"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                        r0 = -3
                        r1 = 0
                        if (r11 == r0) goto L_0x00a7
                        r0 = -2
                        if (r11 == r0) goto L_0x00a7
                        r0 = -1
                        if (r11 == r0) goto L_0x00a7
                        if (r11 < 0) goto L_0x009a
                        int r0 = r12.flags     // Catch:{ all -> 0x00ab }
                        r0 = r0 & 4
                        if (r0 == 0) goto L_0x0026
                        goto L_0x009a
                    L_0x0026:
                        long r2 = r12.presentationTimeUs     // Catch:{ all -> 0x00ab }
                        com.tencent.mm.plugin.finder.view.o5 r0 = r9.f312942a     // Catch:{ all -> 0x00ab }
                        long r4 = r0.f312929l     // Catch:{ all -> 0x00ab }
                        r6 = 1000(0x3e8, float:1.401E-42)
                        long r6 = (long) r6     // Catch:{ all -> 0x00ab }
                        long r4 = r4 * r6
                        int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r8 < 0) goto L_0x0072
                        r0 = 1
                        r10.releaseOutputBuffer(r11, r0)     // Catch:{ all -> 0x00ab }
                        fy3.l<java.lang.Long, rx3.b0> r10 = r9.f312943b     // Catch:{ all -> 0x00ab }
                        long r2 = r12.presentationTimeUs     // Catch:{ all -> 0x00ab }
                        java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00ab }
                        r10.invoke(r11)     // Catch:{ all -> 0x00ab }
                        com.tencent.mm.plugin.finder.view.o5 r10 = r9.f312942a     // Catch:{ all -> 0x00ab }
                        java.lang.String r10 = r10.f312920c     // Catch:{ all -> 0x00ab }
                        java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
                        r11.<init>()     // Catch:{ all -> 0x00ab }
                        java.lang.String r2 = "lxl releaseOutputBuffer "
                        r11.append(r2)     // Catch:{ all -> 0x00ab }
                        long r2 = r12.presentationTimeUs     // Catch:{ all -> 0x00ab }
                        long r2 = r2 / r6
                        r11.append(r2)     // Catch:{ all -> 0x00ab }
                        java.lang.String r2 = ", render!"
                        r11.append(r2)     // Catch:{ all -> 0x00ab }
                        java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00ab }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x00ab }
                        com.tencent.mm.plugin.finder.view.o5 r10 = r9.f312942a     // Catch:{ all -> 0x00ab }
                        java.lang.Object r11 = r10.f312921d     // Catch:{ all -> 0x00ab }
                        monitor-enter(r11)     // Catch:{ all -> 0x00ab }
                        r10.f312932o = r0     // Catch:{ all -> 0x006f }
                        rx3.b0 r10 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x006f }
                        monitor-exit(r11)     // Catch:{ all -> 0x00ab }
                        goto L_0x0093
                    L_0x006f:
                        r10 = move-exception
                        monitor-exit(r11)     // Catch:{ all -> 0x00ab }
                        throw r10     // Catch:{ all -> 0x00ab }
                    L_0x0072:
                        java.lang.String r0 = r0.f312920c     // Catch:{ all -> 0x00ab }
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
                        r2.<init>()     // Catch:{ all -> 0x00ab }
                        java.lang.String r3 = "lxl releaseOutputBuffer "
                        r2.append(r3)     // Catch:{ all -> 0x00ab }
                        long r3 = r12.presentationTimeUs     // Catch:{ all -> 0x00ab }
                        long r3 = r3 / r6
                        r2.append(r3)     // Catch:{ all -> 0x00ab }
                        java.lang.String r3 = ", no"
                        r2.append(r3)     // Catch:{ all -> 0x00ab }
                        java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00ab }
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x00ab }
                        r10.releaseOutputBuffer(r11, r1)     // Catch:{ all -> 0x00ab }
                    L_0x0093:
                        com.tencent.mm.plugin.finder.view.o5 r10 = r9.f312942a     // Catch:{ all -> 0x00ab }
                        long r11 = r12.presentationTimeUs     // Catch:{ all -> 0x00ab }
                        r10.f312931n = r11     // Catch:{ all -> 0x00ab }
                        goto L_0x00b7
                    L_0x009a:
                        com.tencent.mm.plugin.finder.view.o5 r12 = r9.f312942a     // Catch:{ all -> 0x00ab }
                        java.lang.String r12 = r12.f312920c     // Catch:{ all -> 0x00ab }
                        java.lang.String r0 = "lxl releaseOutputBuffer BUFFER_FLAG_END_OF_STREAM"
                        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x00ab }
                        r10.releaseOutputBuffer(r11, r1)     // Catch:{ all -> 0x00ab }
                        goto L_0x00b7
                    L_0x00a7:
                        r10.releaseOutputBuffer(r11, r1)     // Catch:{ all -> 0x00ab }
                        goto L_0x00b7
                    L_0x00ab:
                        r10 = move-exception
                        com.tencent.mm.plugin.finder.view.o5 r11 = r9.f312942a
                        java.lang.String r11 = r11.f312920c
                        java.lang.String r12 = "lxl onOutputBufferAvailable exception"
                        java.lang.Object[] r0 = new java.lang.Object[r1]
                        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r10, r12, r0)
                    L_0x00b7:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C105312o5.C105313a.C105314a.C105315a.onOutputBufferAvailable(android.media.MediaCodec, int, android.media.MediaCodec$BufferInfo):void");
                }

                public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                    C87412m.m108594g(mediaCodec, "codec");
                    C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
                }
            }

            /* renamed from: com.tencent.mm.plugin.finder.view.o5$a$a$b */
            public static final class C105316b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C32224a<C13598b0> f312944d;

                public C105316b(C32224a<C13598b0> aVar) {
                    this.f312944d = aVar;
                }

                public final void run() {
                    this.f312944d.invoke();
                }
            }

            public C105314a(C105312o5 o5Var, SurfaceTexture surfaceTexture, C32226l<? super Long, C13598b0> lVar, C32224a<C13598b0> aVar) {
                this.f312938d = o5Var;
                this.f312939e = surfaceTexture;
                this.f312940f = lVar;
                this.f312941g = aVar;
            }

            public final void run() {
                C105312o5 o5Var = this.f312938d;
                if (o5Var.f312924g != null) {
                    o5Var.mo149785c();
                }
                C105312o5 o5Var2 = this.f312938d;
                String str = o5Var2.f312926i;
                if (str != null) {
                    o5Var2.f312924g = MediaCodec.createDecoderByType(str);
                    C105312o5 o5Var3 = this.f312938d;
                    MediaCodec mediaCodec = o5Var3.f312924g;
                    if (mediaCodec != null) {
                        SurfaceTexture surfaceTexture = this.f312939e;
                        C32226l<Long, C13598b0> lVar = this.f312940f;
                        C32224a<C13598b0> aVar = this.f312941g;
                        mediaCodec.setCallback(new C105315a(o5Var3, lVar));
                        MediaFormat mediaFormat = o5Var3.f312925h;
                        if (mediaFormat != null) {
                            mediaCodec.configure(mediaFormat, new Surface(surfaceTexture), (MediaCrypto) null, 0);
                            o5Var3.f312919b.post(new C105316b(aVar));
                            return;
                        }
                        C87412m.m108603p("mediaFormat");
                        throw null;
                    }
                    return;
                }
                C87412m.m108603p("mime");
                throw null;
            }
        }

        public C105313a(C105312o5 o5Var, C32224a<C13598b0> aVar, C32226l<? super Long, C13598b0> lVar, C32224a<C13598b0> aVar2) {
            this.f312934d = o5Var;
            this.f312935e = aVar;
            this.f312936f = lVar;
            this.f312937g = aVar2;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
            C105312o5 o5Var = this.f312934d;
            MMHandler mMHandler = o5Var.f312928k;
            if (mMHandler != null) {
                mMHandler.post(new C105314a(o5Var, surfaceTexture, this.f312936f, this.f312937g));
            } else {
                C87412m.m108603p("handler");
                throw null;
            }
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
            this.f312934d.mo149785c();
            this.f312935e.invoke();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C87412m.m108594g(surfaceTexture, "surface");
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C87412m.m108594g(surfaceTexture, "surface");
        }
    }

    public C105312o5(String str, TextureView textureView) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(textureView, "textureView");
        this.f312918a = str;
        this.f312919b = textureView;
    }

    /* renamed from: a */
    public final C110052b mo149783a() {
        C110052b bVar = this.f312922e;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("extractor");
        throw null;
    }

    /* renamed from: b */
    public final C110052b mo149784b() {
        C110052b bVar = this.f312923f;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("frameFlagExtractor");
        throw null;
    }

    /* renamed from: c */
    public final void mo149785c() {
        MediaCodec mediaCodec = this.f312924g;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
        MediaCodec mediaCodec2 = this.f312924g;
        if (mediaCodec2 != null) {
            mediaCodec2.release();
        }
        this.f312924g = null;
    }

    /* renamed from: d */
    public final void mo149786d(C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32226l<? super Long, C13598b0> lVar) {
        C87412m.m108594g(aVar, "onTextureReady");
        C87412m.m108594g(aVar2, "onTextureDestroy");
        C87412m.m108594g(lVar, "onSeekFrame");
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("FinderVideoFrameSeeker_renderThread" + hashCode(), -2);
        this.f312927j = a;
        a.start();
        HandlerThread handlerThread = this.f312927j;
        if (handlerThread != null) {
            this.f312928k = new MMHandler(handlerThread.getLooper());
            this.f312922e = new C110052b();
            this.f312923f = new C110052b();
            RandomAccessFile B = C86013q1.m106420B(this.f312918a, false);
            FileDescriptor fd = B.getFD();
            if (C107835h0.f322847d.f322835a == 1) {
                mo149783a().mo161391j(fd, 0, C86013q1.m106451l(this.f312918a));
                mo149784b().mo161391j(fd, 0, C86013q1.m106451l(this.f312918a));
            } else {
                mo149783a().f329324a.setDataSource(fd);
                mo149784b().f329324a.setDataSource(fd);
            }
            B.close();
            int d = mo149783a().mo161385d();
            int i2 = 0;
            while (true) {
                if (i2 >= d) {
                    break;
                }
                MediaFormat e = mo149783a().mo161386e(i2);
                C87412m.m108593f(e, "extractor.getTrackFormat(i)");
                this.f312925h = e;
                String string = e.getString("mime");
                C87412m.m108591d(string);
                this.f312926i = string;
                if (C112551y.m153819s(string, "video/", false)) {
                    mo149783a().mo161390i(i2);
                    mo149784b().mo161390i(i2);
                    break;
                }
                i2++;
            }
            this.f312919b.setSurfaceTextureListener(new C105313a(this, aVar2, lVar, aVar));
            return;
        }
        C87412m.m108603p("ht");
        throw null;
    }
}
