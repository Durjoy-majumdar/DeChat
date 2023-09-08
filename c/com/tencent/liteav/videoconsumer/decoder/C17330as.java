package com.tencent.liteav.videoconsumer.decoder;

import android.os.SystemClock;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.utils.C17246e;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import com.tencent.liteav.videoconsumer.decoder.VideoDecoderDef;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.as */
public final class C17330as {

    /* renamed from: a */
    public String f46957a = "VideoDecodeControllerStatistics";

    /* renamed from: b */
    public final IVideoReporter f46958b;

    /* renamed from: c */
    public final C17331a f46959c;

    /* renamed from: d */
    public final C17332b f46960d;

    /* renamed from: e */
    public final C17246e f46961e;

    /* renamed from: f */
    public C17334au.C17335a f46962f;

    /* renamed from: g */
    public boolean f46963g;

    /* renamed from: h */
    public long f46964h = 0;

    /* renamed from: i */
    public long f46965i = 0;

    /* renamed from: j */
    public long f46966j = 0;

    /* renamed from: k */
    private boolean f46967k = false;

    /* renamed from: l */
    private long f46968l = 0;

    public C17330as(IVideoReporter iVideoReporter) {
        this.f46958b = iVideoReporter;
        this.f46959c = new C17331a(this, (byte) 0);
        this.f46960d = new C17332b((byte) 0);
        this.f46961e = new C17246e("videoDecoder", 1000, new C17333at(this));
        this.f46957a += "_" + hashCode();
        mo20407a();
    }

    /* renamed from: a */
    public final void mo20407a() {
        this.f46959c.mo20411a();
        this.f46960d.mo20413a();
        this.f46961e.mo20223b();
        this.f46962f = null;
        this.f46963g = false;
        this.f46967k = false;
        this.f46965i = 0;
    }

    /* renamed from: b */
    public final void mo20410b() {
        if (this.f46968l == 0) {
            this.f46968l = SystemClock.elapsedRealtime();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f46968l + TimeUnit.SECONDS.toMillis(1) < elapsedRealtime) {
            this.f46968l = elapsedRealtime;
            this.f46958b.updateStatus(C17271i.STATUS_VIDEO_DECODER_ERROR, Long.valueOf(this.f46966j));
            this.f46966j = 0;
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.as$b */
    public static class C17332b {

        /* renamed from: a */
        public long f46976a;

        /* renamed from: b */
        public long f46977b;

        private C17332b() {
            this.f46976a = 0;
            this.f46977b = 0;
        }

        /* renamed from: a */
        public final void mo20413a() {
            this.f46977b = 0;
            this.f46976a = 0;
        }

        public /* synthetic */ C17332b(byte b) {
            this();
        }
    }

    /* renamed from: com.tencent.liteav.videoconsumer.decoder.as$a */
    public class C17331a {

        /* renamed from: a */
        public long f46969a;

        /* renamed from: b */
        public long f46970b;

        /* renamed from: c */
        public long f46971c;

        /* renamed from: d */
        public long f46972d;

        /* renamed from: e */
        public final Deque<Long> f46973e;

        /* renamed from: f */
        public final List<Long> f46974f;

        private C17331a() {
            this.f46969a = 0;
            this.f46970b = 0;
            this.f46971c = 0;
            this.f46972d = 0;
            this.f46973e = new LinkedList();
            this.f46974f = new ArrayList();
        }

        /* renamed from: a */
        public final void mo20411a() {
            this.f46969a = 0;
            this.f46970b = 0;
            this.f46971c = 0;
            this.f46972d = 0;
            this.f46973e.clear();
            this.f46974f.clear();
        }

        /* renamed from: a */
        public final void mo20412a(long j) {
            if (this.f46973e.isEmpty()) {
                this.f46972d = SystemClock.elapsedRealtime();
            }
            this.f46973e.addLast(Long.valueOf(j));
        }

        public /* synthetic */ C17331a(C17330as asVar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo20408a(EncodedVideoFrame encodedVideoFrame) {
        if (!this.f46967k && encodedVideoFrame.isIDRFrame()) {
            this.f46964h = SystemClock.elapsedRealtime();
            this.f46967k = true;
            this.f46958b.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_START_DECODE_FIRST_FRAME, "Start decode first frame", new Object[0]);
            LiteavLog.m16896d(this.f46957a, "received first I frame.");
        }
        if (!this.f46963g) {
            this.f46965i++;
        }
        this.f46959c.mo20412a(encodedVideoFrame.pts);
    }

    /* renamed from: a */
    public final void mo20409a(C17334au.C17335a aVar, boolean z) {
        this.f46962f = aVar;
        if (z && aVar == C17334au.C17335a.SOFTWARE) {
            aVar = C17334au.C17335a.CUSTOM;
        }
        this.f46958b.updateStatus(C17271i.STATUS_VIDEO_DECODER_TYPE, new VideoDecoderDef.DecoderProperty(aVar, z ? CodecType.H265 : CodecType.H264));
    }
}
