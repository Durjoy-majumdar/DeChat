package com.tencent.liteav.videoconsumer.decoder;

import android.os.SystemClock;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.videobase.C17263h;
import com.tencent.liteav.videobase.videobase.C17271i;
import com.tencent.liteav.videoconsumer.decoder.C17330as;
import com.tencent.liteav.videoconsumer.decoder.C17334au;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.videoconsumer.decoder.ae */
final /* synthetic */ class C17316ae implements Runnable {

    /* renamed from: a */
    private final VideoDecodeController f46937a;

    /* renamed from: b */
    private final long f46938b;

    private C17316ae(VideoDecodeController videoDecodeController, long j) {
        this.f46937a = videoDecodeController;
        this.f46938b = j;
    }

    /* renamed from: a */
    public static Runnable m17243a(VideoDecodeController videoDecodeController, long j) {
        return new C17316ae(videoDecodeController, j);
    }

    public final void run() {
        VideoDecodeController videoDecodeController = this.f46937a;
        long j = this.f46938b;
        C17330as asVar = videoDecodeController.f46896d;
        asVar.f46961e.mo20222a();
        C17330as.C17331a aVar = asVar.f46959c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - aVar.f46972d;
        aVar.f46974f.add(Long.valueOf(j2));
        aVar.f46972d = elapsedRealtime;
        if (!aVar.f46973e.isEmpty()) {
            aVar.f46973e.removeFirst();
        }
        if (elapsedRealtime - aVar.f46970b >= TimeUnit.SECONDS.toMillis(1)) {
            aVar.f46970b = elapsedRealtime;
            long j3 = 0;
            for (Long longValue : aVar.f46974f) {
                j3 += longValue.longValue();
            }
            aVar.f46971c = j3 / ((long) Math.max(aVar.f46974f.size(), 1));
            aVar.f46974f.clear();
        }
        C17330as.this.f46958b.updateStatus(C17271i.STATUS_VIDEO_DECODER_COST, Long.valueOf(j2));
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (aVar.f46969a == 0) {
            aVar.f46969a = elapsedRealtime2;
        }
        long j4 = aVar.f46969a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (elapsedRealtime2 >= j4 + timeUnit.toMillis(1)) {
            aVar.f46969a = elapsedRealtime2;
            long j5 = aVar.f46971c;
            C17330as asVar2 = C17330as.this;
            if (asVar2.f46962f == C17334au.C17335a.HARDWARE) {
                asVar2.f46958b.updateStatus(C17271i.STATUS_VIDEO_HW_DECODE_TASK_COST, Long.valueOf(j5));
            } else {
                asVar2.f46958b.updateStatus(C17271i.STATUS_VIDEO_SW_DECODE_TASK_COST, Long.valueOf(j5));
            }
        }
        C17330as.C17332b bVar = asVar.f46960d;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        if (bVar.f46977b == 0) {
            bVar.f46977b = elapsedRealtime3;
        }
        if (bVar.f46976a == 0) {
            bVar.f46976a = elapsedRealtime3;
        }
        if (elapsedRealtime3 > bVar.f46976a + timeUnit.toMillis(1) && elapsedRealtime3 > bVar.f46977b + timeUnit.toMillis(2)) {
            LiteavLog.m16900e("DecodeSmoothStatistics", "frame interval [%d] > %d", Long.valueOf(elapsedRealtime3 - bVar.f46976a), Long.valueOf(timeUnit.toMillis(1)));
            bVar.f46977b = elapsedRealtime3;
        }
        bVar.f46976a = elapsedRealtime3;
        asVar.mo20410b();
        if (!asVar.f46963g) {
            asVar.f46963g = true;
            asVar.f46958b.notifyEvent(C17263h.C17269b.EVT_VIDEO_DECODE_FIRST_FRAME_DECODED, "first frame decoded", new Object[0]);
            LiteavLog.m16896d(asVar.f46957a, "first frame decoded cost time: " + (SystemClock.elapsedRealtime() - asVar.f46964h) + ", before decode first frame received: " + asVar.f46965i);
        }
        videoDecodeController.f46894b.updateStatus(C17271i.STATUS_VIDEO_DECODER_FRAME, 0);
        C17340d dVar = videoDecodeController.f46895c;
        int i = dVar.f47005q;
        if (i > 0) {
            dVar.f47005q = i - 1;
        }
        if (dVar.f47000l == 0) {
            LiteavLog.m16901i(dVar.f46989a, "decode first frame success");
        }
        dVar.f47000l = j;
        dVar.f47008t = 0;
    }
}
