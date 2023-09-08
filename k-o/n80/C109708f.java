package n80;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eu3.C58834h;
import eu3.C97749e;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import java.nio.ByteBuffer;
import l80.C109277d;
import p206nj.C11171e;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: n80.f */
public final class C109708f extends C109697b {

    /* renamed from: k */
    public final String f328376k = "MicroMsg.MediaCodecTransEncoderAsync";

    /* renamed from: l */
    public C104619a f328377l;

    /* renamed from: m */
    public long f328378m;

    /* renamed from: n */
    public HandlerThread f328379n;

    /* renamed from: o */
    public Handler f328380o;

    /* renamed from: p */
    public C109709a f328381p;

    /* renamed from: n80.f$a */
    public static final class C109709a extends MediaCodec.Callback {

        /* renamed from: a */
        public final /* synthetic */ C109708f f328382a;

        public C109709a(C109708f fVar) {
            this.f328382a = fVar;
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(codecException, "e");
            String str = this.f328382a.f328376k;
            Log.m105920e(str, "codec Error, e:" + codecException);
            if (this.f328382a.f328350g) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailedAsyncOnError");
                C115669n.INSTANCE.mo175913w(986, 81, 1);
            }
            this.f328382a.mo160922f();
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            C87412m.m108594g(mediaCodec, "codec");
            String str = this.f328382a.f328376k;
            Log.m105924i(str, "onInputBufferAvailable, index:" + i);
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(bufferInfo, "bufferInfo");
            String str = this.f328382a.f328376k;
            Log.m105918d(str, "onOutputBufferAvailable index:" + i + ", info.size: " + bufferInfo.size);
            if (i >= 0) {
                try {
                    ByteBuffer l = this.f328382a.f328377l.mo148210l(i);
                    if ((bufferInfo.flags & 2) != 0) {
                        Log.m105924i(this.f328382a.f328376k, "codec config!");
                    }
                    if ((bufferInfo.flags & 4) != 0) {
                        Log.m105924i(this.f328382a.f328376k, "encode end of stream");
                        this.f328382a.mo160922f();
                    } else if (bufferInfo.size != 0) {
                        l.position(bufferInfo.offset);
                        l.limit(bufferInfo.offset + bufferInfo.size);
                        this.f328382a.mo160921e(l, bufferInfo);
                        this.f328382a.f328377l.mo148215q(i, bufferInfo.presentationTimeUs);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f328382a.f328376k, e, "onOutputBufferAvailable error", new Object[0]);
                    if (this.f328382a.f328350g) {
                        Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailed");
                        C115669n.INSTANCE.mo175913w(986, 77, 1);
                    }
                }
            } else {
                this.f328382a.f328377l.mo148216r(i, false);
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            C87412m.m108594g(mediaCodec, "codec");
            C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            String str = this.f328382a.f328376k;
            Log.m105924i(str, "encoder output format changed " + this.f328382a.f328377l.mo148212n());
        }
    }

    /* renamed from: n80.f$b */
    public static final class C109710b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109708f f328383d;

        public C109710b(C109708f fVar) {
            this.f328383d = fVar;
        }

        public final void run() {
            C109708f fVar = this.f328383d;
            synchronized (fVar.f328353j) {
                if (!fVar.f328351h && !fVar.f328352i) {
                    if (0 != fVar.f328378m) {
                        C13598b0 b0Var = C13598b0.f38549a;
                        String str = this.f328383d.f328376k;
                        Log.m105924i(str, "finishEncode() hash:" + this.f328383d.hashCode() + "  isFinishEncode:" + this.f328383d.f328351h + "  startTime:" + this.f328383d.f328378m);
                        this.f328383d.f328377l.mo148221x();
                        this.f328383d.f328351h = true;
                        return;
                    }
                }
                String str2 = fVar.f328376k;
                Log.m105924i(str2, "finishEncode() already finish " + fVar.hashCode() + ", isFinishEncode:" + fVar.f328351h + ", isRelease:" + fVar.f328352i + ", startTime:" + fVar.f328378m);
            }
        }
    }

    /* renamed from: n80.f$c */
    public static final class C109711c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109708f f328384d;

        public C109711c(C109708f fVar) {
            this.f328384d = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
            r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks();
            r2 = r12.f328384d.f328376k;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, "releaseEncoder() start " + r12.f328384d.hashCode());
            r2 = r12.f328384d.f328348e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
            if (r2 == null) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
            r2.invoke();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
            r12.f328384d.f328379n.quitSafely();
            r12.f328384d.f328377l.mo148223z();
            r12.f328384d.f328377l.mo148214p();
            r12.f328384d.mo160919c().release();
            r12.f328384d.f328352i = true;
            com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.idkeyStat(985, 166, 1, false);
            r2 = r12.f328384d.f328376k;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, "releaseEncoder() finish: time:" + com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0) + ", " + r12.f328384d.hashCode());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ac, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                n80.f r0 = r12.f328384d
                java.lang.Object r1 = r0.f328353j
                monitor-enter(r1)
                boolean r2 = r0.f328352i     // Catch:{ all -> 0x00ad }
                if (r2 == 0) goto L_0x0025
                java.lang.String r2 = r0.f328376k     // Catch:{ all -> 0x00ad }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
                r3.<init>()     // Catch:{ all -> 0x00ad }
                java.lang.String r4 = "releaseEncoder(), already finished "
                r3.append(r4)     // Catch:{ all -> 0x00ad }
                int r0 = r0.hashCode()     // Catch:{ all -> 0x00ad }
                r3.append(r0)     // Catch:{ all -> 0x00ad }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00ad }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x00ad }
                monitor-exit(r1)
                return
            L_0x0025:
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ad }
                monitor-exit(r1)
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                n80.f r2 = r12.f328384d
                java.lang.String r2 = r2.f328376k
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "releaseEncoder() start "
                r3.append(r4)
                n80.f r4 = r12.f328384d
                int r4 = r4.hashCode()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                n80.f r2 = r12.f328384d
                fy3.a<rx3.b0> r2 = r2.f328348e
                if (r2 == 0) goto L_0x0053
                r2.invoke()
            L_0x0053:
                n80.f r2 = r12.f328384d
                android.os.HandlerThread r2 = r2.f328379n
                r2.quitSafely()
                n80.f r2 = r12.f328384d
                com.tencent.mm.compatible.deviceinfo.a r2 = r2.f328377l
                r2.mo148223z()
                n80.f r2 = r12.f328384d
                com.tencent.mm.compatible.deviceinfo.a r2 = r2.f328377l
                r2.mo148214p()
                n80.f r2 = r12.f328384d
                android.view.Surface r2 = r2.mo160919c()
                r2.release()
                n80.f r2 = r12.f328384d
                r3 = 1
                r2.f328352i = r3
                com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r5 = 985(0x3d9, double:4.867E-321)
                r7 = 166(0xa6, double:8.2E-322)
                r9 = 1
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)
                n80.f r2 = r12.f328384d
                java.lang.String r2 = r2.f328376k
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "releaseEncoder() finish: time:"
                r3.append(r4)
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)
                r3.append(r0)
                java.lang.String r0 = ", "
                r3.append(r0)
                n80.f r0 = r12.f328384d
                int r0 = r0.hashCode()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                return
            L_0x00ad:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n80.C109708f.C109711c.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109708f(C109277d dVar, C32226l<? super C109697b, C13598b0> lVar) {
        super(dVar, lVar);
        C87412m.m108594g(dVar, "videoCodecConfig");
        this.f328377l = C104619a.m140210b(dVar.f327165h);
        int i = C58834h.f168432b;
        this.f328379n = C97749e.m126093a("MediaCodecTransEncoder_encodeThread", 5);
        this.f328381p = new C109709a(this);
        Log.m105924i("MicroMsg.MediaCodecTransEncoderAsync", "MediaCodecTransEncoderAsync start");
        C115669n nVar = C115669n.INSTANCE;
        C115669n nVar2 = nVar;
        nVar2.idkeyStat(985, 165, 1, false);
        nVar2.idkeyStat(985, 143, 1, false);
        this.f328377l.mo148202a(dVar.mo160510b(), (Surface) null, (MediaCrypto) null, 1);
        if (!MMApplicationContext.isMainProcess() || !C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_REMUX_THROW_ERROR_INT_SYNC, -1), 1)) {
            Log.m105924i("MicroMsg.MediaCodecTransEncoderAsync", "MediaCodecTransEncoderAsync end");
            nVar.idkeyStat(985, 144, 1, false);
            if (C11171e.m11046c(23)) {
                this.f328379n.start();
                Handler handler = new Handler(this.f328379n.getLooper());
                this.f328380o = handler;
                this.f328377l.mo148218u(this.f328381p, handler);
            } else {
                C104619a aVar = this.f328377l;
                aVar.f310657a.setCallback(this.f328381p);
            }
            Surface e = this.f328377l.mo148203e();
            C87412m.m108593f(e, "encoder.createInputSurface()");
            this.f328346c = e;
            this.f328377l.mo148222y();
            if (lVar != null) {
                lVar.invoke(this);
                return;
            }
            return;
        }
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "remuxer 抛出异常", 0).show();
        throw new IllegalStateException("leex test error");
    }

    /* renamed from: a */
    public void mo160917a(long j) {
        if (0 == this.f328378m) {
            this.f328378m = Util.currentTicks();
        }
    }

    /* renamed from: b */
    public void mo160918b() {
        try {
            Handler handler = this.f328380o;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                Handler handler2 = this.f328380o;
                if (handler2 != null) {
                    handler2.post(new C109710b(this));
                } else {
                    C87412m.m108603p("encodeHandler");
                    throw null;
                }
            } else {
                C87412m.m108603p("encodeHandler");
                throw null;
            }
        } catch (Exception e) {
            String str = this.f328376k;
            Log.printErrStackTrace(str, e, "finishEncode " + hashCode() + " \n signalEndOfInputStream error:" + e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: d */
    public long mo160920d() {
        return Util.currentTicks() - this.f328378m;
    }

    /* renamed from: f */
    public void mo160922f() {
        try {
            Handler handler = this.f328380o;
            if (handler != null) {
                handler.post(new C109711c(this));
            } else {
                C87412m.m108603p("encodeHandler");
                throw null;
            }
        } catch (Exception e) {
            String str = this.f328376k;
            Log.m105920e(str, "release encoder error " + e.getMessage());
        }
    }
}
