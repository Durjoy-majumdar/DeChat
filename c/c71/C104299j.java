package c71;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.p014mm.compatible.deviceinfo.C104619a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import o40.C61926c;
import p914oj.C110052b;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: c71.j */
public final class C104299j extends C92380u {

    /* renamed from: c */
    public final Surface f308695c;

    /* renamed from: d */
    public final String f308696d = "MicroMsg.MixVideoDecoder";

    /* renamed from: e */
    public C104619a f308697e;

    /* renamed from: f */
    public MediaFormat f308698f;

    /* renamed from: g */
    public C110052b f308699g = new C110052b();

    /* renamed from: h */
    public String f308700h = "";

    /* renamed from: i */
    public final long f308701i = 60000;

    /* renamed from: j */
    public final long f308702j = 10000;

    /* renamed from: k */
    public final int f308703k = 10;

    /* renamed from: l */
    public MediaCodec.BufferInfo f308704l = new MediaCodec.BufferInfo();

    /* renamed from: m */
    public final Object f308705m = new Object();

    /* renamed from: c71.j$a */
    public static final class C104300a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C104299j f308706d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104300a(C104299j jVar) {
            super(0);
            this.f308706d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
            if (r1 != false) goto L_0x00bf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00fd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r15 = this;
                c71.j r0 = r15.f308706d
                java.lang.String r1 = r0.f308696d
                java.lang.String r2 = "startDecode"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                oj.b r1 = r0.f308699g
                r2 = 0
                r4 = 2
                r1.mo161389h(r2, r4)
            L_0x0012:
                com.tencent.mm.compatible.deviceinfo.a r1 = r0.f308697e
                java.lang.String r4 = "decoder"
                r5 = 0
                if (r1 == 0) goto L_0x0160
                long r6 = r0.f308701i
                int r1 = r1.mo148204f(r6)
                r6 = 0
                r8 = r1
                r1 = 0
            L_0x0022:
                r14 = 1
                if (r8 >= 0) goto L_0x0066
                int r7 = r0.f308703k
                if (r1 >= r7) goto L_0x0066
                boolean r7 = r0.mo145985d()
                java.lang.String r9 = r0.f308696d
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "inputDecoder "
                r10.append(r11)
                r10.append(r8)
                r8 = 32
                r10.append(r8)
                r10.append(r1)
                r10.append(r8)
                r10.append(r7)
                java.lang.String r8 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
                if (r7 != 0) goto L_0x0055
                goto L_0x00bf
            L_0x0055:
                com.tencent.mm.compatible.deviceinfo.a r7 = r0.f308697e
                if (r7 == 0) goto L_0x0062
                long r8 = r0.f308701i
                int r8 = r7.mo148204f(r8)
                int r1 = r1 + 1
                goto L_0x0022
            L_0x0062:
                gy3.C87412m.m108603p(r4)
                throw r5
            L_0x0066:
                if (r8 < 0) goto L_0x00b4
                com.tencent.mm.compatible.deviceinfo.a r1 = r0.f308697e
                if (r1 == 0) goto L_0x00b0
                java.nio.ByteBuffer[] r1 = r1.mo148208j()
                r1 = r1[r8]
                r1.clear()
                oj.b r7 = r0.f308699g
                int r10 = r7.mo161387f(r1, r6)
                if (r10 >= 0) goto L_0x0086
                java.lang.String r1 = r0.f308696d
                java.lang.String r7 = "read sample end"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
                goto L_0x00bf
            L_0x0086:
                r1.position(r6)
                oj.b r1 = r0.f308699g
                long r11 = r1.mo161383b()
                int r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                if (r1 >= 0) goto L_0x009d
                java.lang.String r1 = r0.f308696d
                java.lang.String r7 = "read sample end, saw eos"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
                r1 = 1
                goto L_0x009e
            L_0x009d:
                r1 = 0
            L_0x009e:
                com.tencent.mm.compatible.deviceinfo.a r7 = r0.f308697e
                if (r7 == 0) goto L_0x00ac
                r9 = 0
                if (r1 == 0) goto L_0x00a7
                r13 = 4
                goto L_0x00a8
            L_0x00a7:
                r13 = 0
            L_0x00a8:
                r7.mo148213o(r8, r9, r10, r11, r13)
                goto L_0x00b5
            L_0x00ac:
                gy3.C87412m.m108603p(r4)
                throw r5
            L_0x00b0:
                gy3.C87412m.m108603p(r4)
                throw r5
            L_0x00b4:
                r1 = 0
            L_0x00b5:
                boolean r7 = r0.mo145985d()
                if (r7 == 0) goto L_0x00bc
                goto L_0x00bf
            L_0x00bc:
                if (r1 != 0) goto L_0x00bf
                goto L_0x00c0
            L_0x00bf:
                r14 = 0
            L_0x00c0:
                if (r14 != 0) goto L_0x0159
                java.lang.String r1 = r0.f308696d
                java.lang.String r2 = "input end"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                java.lang.String r1 = r0.f308696d
                java.lang.String r2 = "sendDecoderEos"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.compatible.deviceinfo.a r1 = r0.f308697e
                if (r1 == 0) goto L_0x0155
                long r2 = r0.f308701i
                int r1 = r1.mo148204f(r2)
                r8 = r1
                r1 = 0
            L_0x00dd:
                if (r8 >= 0) goto L_0x00fb
                int r2 = r0.f308703k
                if (r1 >= r2) goto L_0x00fb
                boolean r2 = r0.mo145985d()
                if (r2 != 0) goto L_0x00ea
                goto L_0x012a
            L_0x00ea:
                com.tencent.mm.compatible.deviceinfo.a r2 = r0.f308697e
                if (r2 == 0) goto L_0x00f7
                long r7 = r0.f308701i
                int r8 = r2.mo148204f(r7)
                int r1 = r1 + 1
                goto L_0x00dd
            L_0x00f7:
                gy3.C87412m.m108603p(r4)
                throw r5
            L_0x00fb:
                if (r8 < 0) goto L_0x0127
                com.tencent.mm.compatible.deviceinfo.a r1 = r0.f308697e
                if (r1 == 0) goto L_0x0123
                java.nio.ByteBuffer[] r1 = r1.mo148208j()
                r1 = r1[r8]
                r1.clear()
                oj.b r2 = r0.f308699g
                r2.mo161387f(r1, r6)
                r1.position(r6)
                com.tencent.mm.compatible.deviceinfo.a r7 = r0.f308697e
                if (r7 == 0) goto L_0x011f
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 4
                r7.mo148213o(r8, r9, r10, r11, r13)
                goto L_0x0127
            L_0x011f:
                gy3.C87412m.m108603p(r4)
                throw r5
            L_0x0123:
                gy3.C87412m.m108603p(r4)
                throw r5
            L_0x0127:
                r0.mo145985d()
            L_0x012a:
                java.lang.String r1 = r0.f308696d
                java.lang.String r2 = "release"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                com.tencent.mm.compatible.deviceinfo.a r1 = r0.f308697e     // Catch:{ Exception -> 0x0145 }
                if (r1 == 0) goto L_0x0147
                r1.mo148223z()     // Catch:{ Exception -> 0x0145 }
                com.tencent.mm.compatible.deviceinfo.a r1 = r0.f308697e     // Catch:{ Exception -> 0x0145 }
                if (r1 == 0) goto L_0x0141
                r1.mo148214p()     // Catch:{ Exception -> 0x0145 }
                goto L_0x014b
            L_0x0141:
                gy3.C87412m.m108603p(r4)     // Catch:{ Exception -> 0x0145 }
                throw r5     // Catch:{ Exception -> 0x0145 }
            L_0x0145:
                goto L_0x014b
            L_0x0147:
                gy3.C87412m.m108603p(r4)     // Catch:{ Exception -> 0x0145 }
                throw r5     // Catch:{ Exception -> 0x0145 }
            L_0x014b:
                fy3.a<rx3.b0> r0 = r0.f264357b
                if (r0 == 0) goto L_0x0152
                r0.invoke()
            L_0x0152:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0155:
                gy3.C87412m.m108603p(r4)
                throw r5
            L_0x0159:
                oj.b r1 = r0.f308699g
                r1.mo161382a()
                goto L_0x0012
            L_0x0160:
                gy3.C87412m.m108603p(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: c71.C104299j.C104300a.invoke():java.lang.Object");
        }
    }

    public C104299j(String str, Surface surface) {
        C87412m.m108594g(str, "videoPath");
        C87412m.m108594g(surface, "surface");
        this.f308695c = surface;
        try {
            Log.m105924i("MicroMsg.MixVideoDecoder", "create decoder with path: " + str);
            this.f308699g.mo161392k(str);
            int d = this.f308699g.mo161385d();
            for (int i = 0; i < d; i++) {
                MediaFormat e = this.f308699g.mo161386e(i);
                C87412m.m108593f(e, "extractor.getTrackFormat(i)");
                String string = e.getString("mime");
                C87412m.m108591d(string);
                if (C112550d0.m153801u(string, "video", false)) {
                    String string2 = e.getString("mime");
                    C87412m.m108591d(string2);
                    this.f308700h = string2;
                    this.f308698f = e;
                    String str2 = this.f308696d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("find video format ");
                    MediaFormat mediaFormat = this.f308698f;
                    if (mediaFormat != null) {
                        sb.append(mediaFormat);
                        sb.append(", mime: ");
                        sb.append(this.f308700h);
                        Log.m105924i(str2, sb.toString());
                        this.f308699g.mo161390i(i);
                        return;
                    }
                    C87412m.m108603p("mediaFormat");
                    throw null;
                }
            }
        } catch (Exception e2) {
            Log.printErrStackTrace(this.f308696d, e2, "init create extractor error", new Object[0]);
        }
    }

    /* renamed from: a */
    public int mo126339a() {
        if (this.f308698f != null && !Util.isNullOrNil(this.f308700h)) {
            try {
                C104619a c = C104619a.m140211c(this.f308700h);
                this.f308697e = c;
                MediaFormat mediaFormat = this.f308698f;
                if (mediaFormat != null) {
                    c.mo148202a(mediaFormat, this.f308695c, (MediaCrypto) null, 0);
                    C104619a aVar = this.f308697e;
                    if (aVar != null) {
                        aVar.mo148222y();
                        return 0;
                    }
                    C87412m.m108603p("decoder");
                    throw null;
                }
                C87412m.m108603p("mediaFormat");
                throw null;
            } catch (Exception e) {
                String str = this.f308696d;
                Log.m105920e(str, "init decoder error " + e.getMessage());
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo126340b(boolean z) {
        if (!z) {
            synchronized (this.f308705m) {
                try {
                    this.f308705m.notifyAll();
                } catch (Exception e) {
                    Log.printErrStackTrace(this.f308696d, e, "", new Object[0]);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: c */
    public void mo126341c() {
        C61926c.m72685j("EmojiMixVideoDecoder_decodeThread", true, new C104300a(this));
    }

    /* renamed from: d */
    public final boolean mo145985d() {
        C104619a aVar = this.f308697e;
        if (aVar != null) {
            int g = aVar.mo148205g(this.f308704l, this.f308702j);
            C104619a aVar2 = this.f308697e;
            if (aVar2 != null) {
                ByteBuffer[] m = aVar2.mo148211m();
                while (true) {
                    if (g == -1) {
                        Log.m105924i(this.f308696d, "drainDecoder try again later");
                        break;
                    } else if (g == -2) {
                        String str = this.f308696d;
                        StringBuilder sb = new StringBuilder();
                        sb.append("drainDecoder output format change: ");
                        C104619a aVar3 = this.f308697e;
                        if (aVar3 != null) {
                            sb.append(aVar3.mo148212n());
                            Log.m105924i(str, sb.toString());
                            C104619a aVar4 = this.f308697e;
                            if (aVar4 != null) {
                                MediaFormat n = aVar4.mo148212n();
                                C87412m.m108593f(n, "decoder.outputFormat");
                                this.f308698f = n;
                            } else {
                                C87412m.m108603p("decoder");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("decoder");
                            throw null;
                        }
                    } else {
                        if (g == -3) {
                            C104619a aVar5 = this.f308697e;
                            if (aVar5 == null) {
                                C87412m.m108603p("decoder");
                                throw null;
                            } else if (aVar5.mo148211m() != null) {
                                C104619a aVar6 = this.f308697e;
                                if (aVar6 != null) {
                                    m = aVar6.mo148211m();
                                } else {
                                    C87412m.m108603p("decoder");
                                    throw null;
                                }
                            }
                        } else if (g < 0) {
                            String str2 = this.f308696d;
                            Log.m105924i(str2, "drainDecoder loop outputBufferIndex:" + g + ", break");
                            break;
                        } else {
                            ByteBuffer byteBuffer = m[g];
                            MediaCodec.BufferInfo bufferInfo = this.f308704l;
                            long j = bufferInfo.presentationTimeUs;
                            if ((bufferInfo.flags & 4) != 0) {
                                Log.m105924i(this.f308696d, "drainDecoder loop reach eof");
                                C104619a aVar7 = this.f308697e;
                                if (aVar7 != null) {
                                    aVar7.mo148216r(g, true);
                                    return true;
                                }
                                C87412m.m108603p("decoder");
                                throw null;
                            } else if (byteBuffer == null || bufferInfo.size == 0) {
                                C104619a aVar8 = this.f308697e;
                                if (aVar8 != null) {
                                    aVar8.mo148216r(g, true);
                                } else {
                                    C87412m.m108603p("decoder");
                                    throw null;
                                }
                            } else {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f308704l;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                                C104619a aVar9 = this.f308697e;
                                if (aVar9 != null) {
                                    aVar9.mo148216r(g, true);
                                    MediaCodec.BufferInfo bufferInfo3 = this.f308704l;
                                    String str3 = this.f308696d;
                                    Log.m105924i(str3, "processDecodeBuffer pts: " + bufferInfo3.presentationTimeUs + ", size: " + bufferInfo3.size);
                                    C32226l<? super Long, C13598b0> lVar = this.f264356a;
                                    if (lVar != null) {
                                        lVar.invoke(Long.valueOf(bufferInfo3.presentationTimeUs * ((long) 1000)));
                                    }
                                    synchronized (this.f308705m) {
                                        try {
                                            this.f308705m.wait(50);
                                        } catch (Exception e) {
                                            Log.printErrStackTrace(this.f308696d, e, "", new Object[0]);
                                        }
                                        C13598b0 b0Var = C13598b0.f38549a;
                                    }
                                    if ((this.f308704l.flags & 4) != 0) {
                                        try {
                                            C104619a aVar10 = this.f308697e;
                                            if (aVar10 != null) {
                                                aVar10.mo148223z();
                                                C104619a aVar11 = this.f308697e;
                                                if (aVar11 != null) {
                                                    aVar11.mo148214p();
                                                    return true;
                                                }
                                                C87412m.m108603p("decoder");
                                                throw null;
                                            }
                                            C87412m.m108603p("decoder");
                                            throw null;
                                        } catch (Exception unused) {
                                        }
                                    }
                                } else {
                                    C87412m.m108603p("decoder");
                                    throw null;
                                }
                            }
                        }
                        C104619a aVar12 = this.f308697e;
                        if (aVar12 != null) {
                            g = aVar12.mo148205g(this.f308704l, this.f308702j);
                            if (g < 0) {
                                break;
                            }
                        } else {
                            C87412m.m108603p("decoder");
                            throw null;
                        }
                    }
                }
                return false;
            }
            C87412m.m108603p("decoder");
            throw null;
        }
        C87412m.m108603p("decoder");
        throw null;
    }
}
