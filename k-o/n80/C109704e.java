package n80;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.HandlerThread;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eu3.C58834h;
import eu3.C97749e;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import java.nio.ByteBuffer;
import l80.C109277d;
import p910lj.C76701a;
import rx3.C13598b0;

/* renamed from: n80.e */
public final class C109704e extends C109697b {

    /* renamed from: k */
    public final String f328365k = "MicroMsg.MediaCodecTransEncoder";

    /* renamed from: l */
    public C104619a f328366l;

    /* renamed from: m */
    public final long f328367m = 50000;

    /* renamed from: n */
    public final MediaCodec.BufferInfo f328368n = new MediaCodec.BufferInfo();

    /* renamed from: o */
    public HandlerThread f328369o;

    /* renamed from: p */
    public MMHandler f328370p;

    /* renamed from: q */
    public long f328371q;

    /* renamed from: r */
    public boolean f328372r;

    /* renamed from: n80.e$a */
    public static final class C109705a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109704e f328373d;

        public C109705a(C109704e eVar) {
            this.f328373d = eVar;
        }

        public final void run() {
            long currentTicks = Util.currentTicks();
            C109704e eVar = this.f328373d;
            synchronized (eVar.f328353j) {
                if (!eVar.f328352i) {
                    if (!eVar.f328351h) {
                        C13598b0 b0Var = C13598b0.f38549a;
                        C109704e.m149027g(this.f328373d);
                        String str = this.f328373d.f328365k;
                        Log.m105918d(str, " drainEncoder cost " + Util.ticksToNow(currentTicks) + "  " + this.f328373d.hashCode());
                        return;
                    }
                }
                String str2 = eVar.f328365k;
                Log.m105924i(str2, "encodeFrame() stop encodeFrame " + eVar.hashCode() + ", isRelease:" + eVar.f328352i + ", isFinishEncode:" + eVar.f328351h);
            }
        }
    }

    /* renamed from: n80.e$b */
    public static final class C109706b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109704e f328374d;

        public C109706b(C109704e eVar) {
            this.f328374d = eVar;
        }

        public final void run() {
            C109704e eVar = this.f328374d;
            synchronized (eVar.f328353j) {
                if (!eVar.f328351h && !eVar.f328352i) {
                    if (0 != eVar.f328371q) {
                        C13598b0 b0Var = C13598b0.f38549a;
                        try {
                            String str = this.f328374d.f328365k;
                            Log.m105924i(str, "finishEncode() hash:" + this.f328374d.hashCode() + "  isFinishEncode:" + this.f328374d.f328351h + "  startTime:" + this.f328374d.f328371q);
                            this.f328374d.f328366l.mo148221x();
                            this.f328374d.f328351h = true;
                            C109704e.m149027g(this.f328374d);
                            return;
                        } catch (Exception e) {
                            String str2 = this.f328374d.f328365k;
                            Log.printErrStackTrace(str2, e, "finishEncode " + this.f328374d.hashCode() + " \n signalEndOfInputStream error:" + e.getMessage(), new Object[0]);
                            return;
                        }
                    }
                }
                String str3 = eVar.f328365k;
                Log.m105924i(str3, "finishEncode() already finish " + eVar.hashCode() + ", isFinishEncode:" + eVar.f328351h + ", isRelease:" + eVar.f328352i + ", startTime:" + eVar.f328371q);
            }
        }
    }

    /* renamed from: n80.e$c */
    public static final class C109707c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C109704e f328375d;

        public C109707c(C109704e eVar) {
            this.f328375d = eVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks();
            r2 = r12.f328375d.f328365k;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, "releaseEncoder() start " + r12.f328375d.hashCode());
            r2 = r12.f328375d.f328348e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
            if (r2 == null) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
            r2.invoke();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
            r12.f328375d.f328370p.removeCallbacksAndMessages((java.lang.Object) null);
            r12.f328375d.f328369o.quitSafely();
            r12.f328375d.f328366l.mo148223z();
            r12.f328375d.f328366l.mo148214p();
            r12.f328375d.mo160919c().release();
            r12.f328375d.f328352i = true;
            com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE.idkeyStat(985, 164, 1, false);
            r2 = r12.f328375d.f328365k;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, "releaseEncoder() finish: time:" + com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0) + ", " + r12.f328375d.hashCode());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b5, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b6, code lost:
            r1 = r12.f328375d.f328365k;
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, "release encoder error " + r12.f328375d.hashCode() + " \n " + r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r12 = this;
                n80.e r0 = r12.f328375d
                java.lang.Object r1 = r0.f328353j
                monitor-enter(r1)
                boolean r2 = r0.f328352i     // Catch:{ all -> 0x00e1 }
                if (r2 == 0) goto L_0x0025
                java.lang.String r2 = r0.f328365k     // Catch:{ all -> 0x00e1 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
                r3.<init>()     // Catch:{ all -> 0x00e1 }
                java.lang.String r4 = "releaseEncoder(), already finished "
                r3.append(r4)     // Catch:{ all -> 0x00e1 }
                int r0 = r0.hashCode()     // Catch:{ all -> 0x00e1 }
                r3.append(r0)     // Catch:{ all -> 0x00e1 }
                java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00e1 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ all -> 0x00e1 }
                monitor-exit(r1)
                return
            L_0x0025:
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00e1 }
                monitor-exit(r1)
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r2 = r2.f328365k     // Catch:{ Exception -> 0x00b5 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b5 }
                r3.<init>()     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r4 = "releaseEncoder() start "
                r3.append(r4)     // Catch:{ Exception -> 0x00b5 }
                n80.e r4 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                int r4 = r4.hashCode()     // Catch:{ Exception -> 0x00b5 }
                r3.append(r4)     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00b5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                fy3.a<rx3.b0> r2 = r2.f328348e     // Catch:{ Exception -> 0x00b5 }
                if (r2 == 0) goto L_0x0053
                r2.invoke()     // Catch:{ Exception -> 0x00b5 }
            L_0x0053:
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.f328370p     // Catch:{ Exception -> 0x00b5 }
                r3 = 0
                r2.removeCallbacksAndMessages(r3)     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                android.os.HandlerThread r2 = r2.f328369o     // Catch:{ Exception -> 0x00b5 }
                r2.quitSafely()     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                com.tencent.mm.compatible.deviceinfo.a r2 = r2.f328366l     // Catch:{ Exception -> 0x00b5 }
                r2.mo148223z()     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                com.tencent.mm.compatible.deviceinfo.a r2 = r2.f328366l     // Catch:{ Exception -> 0x00b5 }
                r2.mo148214p()     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                android.view.Surface r2 = r2.mo160919c()     // Catch:{ Exception -> 0x00b5 }
                r2.release()     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                r3 = 1
                r2.f328352i = r3     // Catch:{ Exception -> 0x00b5 }
                com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00b5 }
                r5 = 985(0x3d9, double:4.867E-321)
                r7 = 164(0xa4, double:8.1E-322)
                r9 = 1
                r11 = 0
                r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ Exception -> 0x00b5 }
                n80.e r2 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r2 = r2.f328365k     // Catch:{ Exception -> 0x00b5 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b5 }
                r3.<init>()     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r4 = "releaseEncoder() finish: time:"
                r3.append(r4)     // Catch:{ Exception -> 0x00b5 }
                long r0 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r0)     // Catch:{ Exception -> 0x00b5 }
                r3.append(r0)     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r0 = ", "
                r3.append(r0)     // Catch:{ Exception -> 0x00b5 }
                n80.e r0 = r12.f328375d     // Catch:{ Exception -> 0x00b5 }
                int r0 = r0.hashCode()     // Catch:{ Exception -> 0x00b5 }
                r3.append(r0)     // Catch:{ Exception -> 0x00b5 }
                java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x00b5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x00b5 }
                goto L_0x00e0
            L_0x00b5:
                r0 = move-exception
                n80.e r1 = r12.f328375d
                java.lang.String r1 = r1.f328365k
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "release encoder error "
                r2.append(r3)
                n80.e r3 = r12.f328375d
                int r3 = r3.hashCode()
                r2.append(r3)
                java.lang.String r3 = " \n "
                r2.append(r3)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            L_0x00e0:
                return
            L_0x00e1:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: n80.C109704e.C109707c.run():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109704e(C109277d dVar, C32226l<? super C109697b, C13598b0> lVar) {
        super(dVar, lVar);
        C87412m.m108594g(dVar, "videoCodecConfig");
        int i = C58834h.f168432b;
        this.f328369o = C97749e.m126093a("MediaCodecTransEncoder_encodeThread", 0);
        C115669n.INSTANCE.idkeyStat(985, 163, 1, false);
        Log.m105924i("MicroMsg.MediaCodecTransEncoder", "create mp4encoder " + hashCode());
        C104619a b = C104619a.m140210b(dVar.f327165h);
        this.f328366l = b;
        b.mo148202a(dVar.mo160510b(), (Surface) null, (MediaCrypto) null, 1);
        if (!MMApplicationContext.isMainProcess() || !C87412m.m108589b(C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOCAL_SIGHT_RECORD_THROW_ERROR_INT_SYNC, -1), 1)) {
            Surface e = this.f328366l.mo148203e();
            C87412m.m108593f(e, "encoder.createInputSurface()");
            this.f328346c = e;
            this.f328366l.mo148222y();
            this.f328369o.start();
            this.f328370p = new MMHandler(this.f328369o.getLooper());
            Log.m105924i("MicroMsg.MediaCodecTransEncoder", "create mp4encoder finish " + hashCode());
            if (lVar != null) {
                lVar.invoke(this);
                return;
            }
            return;
        }
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) "remuxer 抛出异常", 0).show();
        throw new IllegalStateException("leex test error");
    }

    /* renamed from: g */
    public static final void m149027g(C109704e eVar) {
        eVar.getClass();
        try {
            int g = eVar.f328366l.mo148205g(eVar.f328368n, eVar.f328367m);
            String str = eVar.f328365k;
            Log.m105924i(str, "drainEncoder  outputBufferIndex : " + g);
            int i = 0;
            while (true) {
                if (g == -1) {
                    Log.m105924i(eVar.f328365k, "outputBuffer try again later");
                } else if (g == -2) {
                    String str2 = eVar.f328365k;
                    Log.m105924i(str2, "encoder output format changed " + eVar.f328366l.mo148212n());
                } else if (g != -3) {
                    if (g < 0) {
                        String str3 = eVar.f328365k;
                        Log.m105920e(str3, "outputBufferIndex " + g + ", ignore");
                    } else {
                        String str4 = eVar.f328365k;
                        Log.m105918d(str4, "outputBuffer index: " + g);
                        ByteBuffer[] m = eVar.f328366l.mo148211m();
                        Log.m105918d(eVar.f328365k, "getOutputBuffers");
                        ByteBuffer byteBuffer = m[g];
                        if (byteBuffer != null) {
                            String str5 = eVar.f328365k;
                            Log.m105918d(str5, "outputBuffers[" + g + ']');
                            if ((eVar.f328368n.flags & 2) != 0) {
                                Log.m105924i(eVar.f328365k, "codec config!");
                            }
                            String str6 = eVar.f328365k;
                            Log.m105924i(str6, "bufferInfo.flags : " + (eVar.f328368n.flags & 4));
                            MediaCodec.BufferInfo bufferInfo = eVar.f328368n;
                            if (bufferInfo.size != 0) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = eVar.f328368n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                                eVar.mo160921e(byteBuffer, eVar.f328368n);
                                eVar.f328366l.mo148216r(g, true);
                            } else if ((bufferInfo.flags & 4) != 0) {
                                eVar.f328372r = true;
                                Log.m105924i(eVar.f328365k, "encode end of stream");
                                eVar.mo160922f();
                                break;
                            } else {
                                Log.m105918d(eVar.f328365k, "bufferInfo.size == 0");
                            }
                        } else {
                            throw new RuntimeException("encoderOutputBuffer " + g + " was null");
                        }
                    }
                }
                g = eVar.f328366l.mo148205g(eVar.f328368n, eVar.f328367m);
                String str7 = eVar.f328365k;
                Log.m105924i(str7, "dequeueOutputBuffer start  outputBufferIndex:" + g + "  timeout:" + i + "  " + eVar.hashCode());
                i = g < 0 ? i + 1 : 0;
                if (g < 0 && i >= 3) {
                    break;
                }
            }
            if (eVar.f328351h && i >= 3) {
                Log.m105924i(eVar.f328365k, "isFinishEncode && timeout >= 3");
                eVar.mo160922f();
            }
        } catch (Exception e) {
            String str8 = eVar.f328365k;
            Log.printErrStackTrace(str8, e, "drainEncoder error " + eVar.hashCode() + ", \n " + e.getMessage(), new Object[0]);
            if (eVar.f328350g) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxEncodeFrameFailed");
                C115669n.INSTANCE.mo175913w(986, 77, 1);
            }
        }
    }

    /* renamed from: a */
    public void mo160917a(long j) {
        if (0 == this.f328371q) {
            this.f328371q = Util.currentTicks();
        }
        this.f328370p.post(new C109705a(this));
    }

    /* renamed from: b */
    public void mo160918b() {
        if (this.f328372r) {
            Log.m105920e(this.f328365k, "has received eos");
            return;
        }
        this.f328370p.removeCallbacksAndMessages((Object) null);
        this.f328370p.post(new C109706b(this));
    }

    /* renamed from: d */
    public long mo160920d() {
        return Util.currentTicks() - this.f328371q;
    }

    /* renamed from: f */
    public void mo160922f() {
        String str = this.f328365k;
        Log.m105924i(str, "try to release " + hashCode());
        this.f328370p.post(new C109707c(this));
    }

    public final void finalize() {
        Log.m105924i(this.f328365k, "finalize");
        if (!this.f328352i) {
            this.f328366l.mo148214p();
        }
    }
}
