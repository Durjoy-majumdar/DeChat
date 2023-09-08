package h23;

import android.media.MediaFormat;
import android.os.HandlerThread;
import com.tencent.p014mm.plugin.vlog.model.C96530a0;
import com.tencent.p014mm.plugin.vlog.model.C96533c0;
import com.tencent.p014mm.plugin.vlog.model.C96559y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m80.C109536e;
import o80.C109993a;
import rx3.C13598b0;
import zx3.C66986c;

/* renamed from: h23.b */
public final class C108020b extends C109536e {

    /* renamed from: A */
    public HandlerThread f323465A;

    /* renamed from: B */
    public MediaFormat f323466B;

    /* renamed from: C */
    public volatile int f323467C = 1;

    /* renamed from: D */
    public volatile int f323468D = 44100;

    /* renamed from: E */
    public long f323469E = 23;

    /* renamed from: F */
    public long f323470F = -1;

    /* renamed from: G */
    public long f323471G;

    /* renamed from: v */
    public final List<C96533c0> f323472v;

    /* renamed from: w */
    public ArrayList<C108023c> f323473w = new ArrayList<>();

    /* renamed from: x */
    public volatile int f323474x;

    /* renamed from: y */
    public volatile int f323475y;

    /* renamed from: z */
    public MMHandler f323476z;

    /* renamed from: h23.b$a */
    public static final class C108021a extends C87413o implements C32227p<byte[], Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108020b f323477d;

        /* renamed from: e */
        public final /* synthetic */ int f323478e;

        /* renamed from: f */
        public final /* synthetic */ C96533c0 f323479f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108021a(C108020b bVar, int i, C96533c0 c0Var) {
            super(2);
            this.f323477d = bVar;
            this.f323478e = i;
            this.f323479f = c0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            long longValue = ((Number) obj2).longValue();
            C108020b bVar = this.f323477d;
            int i = this.f323478e;
            C96559y0 y0Var = (C96559y0) this.f323479f;
            bVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("onFrameDecode: ");
            sb.append(bArr != null ? Integer.valueOf(bArr.length) : null);
            sb.append(", pts:");
            sb.append(longValue);
            sb.append(", index:");
            sb.append(i);
            sb.append(", materialStart:");
            sb.append(y0Var.f282489a);
            sb.append(", materialEnd:");
            sb.append(y0Var.f282490b);
            Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", sb.toString());
            long j = bVar.f323470F;
            if (j > 0) {
                long j2 = longValue - j;
                if (j2 > 0) {
                    long j3 = j2 / ((long) 1000);
                    bVar.f323469E = j3;
                    if (j3 <= 0) {
                        bVar.f323469E = 23;
                    }
                }
            }
            Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "onFrameDecode, currentAudioFrameInterval:" + bVar.f323469E);
            bVar.f323476z.post(new C108025c(longValue, y0Var, bVar, bArr));
            bVar.f323470F = longValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h23.b$b */
    public static final class C108022b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108020b f323480d;

        /* renamed from: e */
        public final /* synthetic */ int f323481e;

        /* renamed from: f */
        public final /* synthetic */ C96533c0 f323482f;

        /* renamed from: g */
        public final /* synthetic */ C109536e f323483g;

        /* renamed from: h */
        public final /* synthetic */ C109993a f323484h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108022b(C108020b bVar, int i, C96533c0 c0Var, C109536e eVar, C109993a aVar) {
            super(0);
            this.f323480d = bVar;
            this.f323481e = i;
            this.f323482f = c0Var;
            this.f323483g = eVar;
            this.f323484h = aVar;
        }

        public Object invoke() {
            this.f323480d.mo158420g(this.f323481e, this.f323482f, this.f323483g, this.f323484h);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h23.b$c */
    public static final class C108023c {

        /* renamed from: a */
        public final int f323485a;

        /* renamed from: b */
        public final C96559y0 f323486b;

        /* renamed from: c */
        public final C109536e f323487c;

        /* renamed from: d */
        public final C109993a f323488d;

        /* renamed from: e */
        public final long f323489e;

        /* renamed from: f */
        public final long f323490f;

        public C108023c(int i, C96559y0 y0Var, C109536e eVar, C109993a aVar, long j, long j2) {
            C87412m.m108594g(y0Var, "material");
            C87412m.m108594g(eVar, "decoder");
            C87412m.m108594g(aVar, "mediaExtractor");
            this.f323485a = i;
            this.f323486b = y0Var;
            this.f323487c = eVar;
            this.f323488d = aVar;
            this.f323489e = j;
            this.f323490f = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C108023c)) {
                return false;
            }
            C108023c cVar = (C108023c) obj;
            return this.f323485a == cVar.f323485a && C87412m.m108589b(this.f323486b, cVar.f323486b) && C87412m.m108589b(this.f323487c, cVar.f323487c) && C87412m.m108589b(this.f323488d, cVar.f323488d) && this.f323489e == cVar.f323489e && this.f323490f == cVar.f323490f;
        }

        public int hashCode() {
            long j = this.f323489e;
            long j2 = this.f323490f;
            return (((((((((this.f323485a * 31) + this.f323486b.hashCode()) * 31) + this.f323487c.hashCode()) * 31) + this.f323488d.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "VideoDecoder(index=" + this.f323485a + ", material=" + this.f323486b + ", decoder=" + this.f323487c + ", mediaExtractor=" + this.f323488d + ", startTime=" + this.f323489e + ", endTime=" + this.f323490f + ')';
        }
    }

    /* renamed from: h23.b$d */
    public static final class C108024d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108020b f323491d;

        public C108024d(C108020b bVar) {
            this.f323491d = bVar;
        }

        public final void run() {
            int i = this.f323491d.f323467C * 2048;
            C108020b bVar = this.f323491d;
            C32227p<? super byte[], ? super Long, C13598b0> pVar = bVar.f327850e;
            if (pVar != null) {
                C13598b0 invoke = pVar.invoke(new byte[i], Long.valueOf(bVar.f323471G));
            }
            C108020b bVar2 = this.f323491d;
            bVar2.f323471G += bVar2.f323469E * ((long) 1000);
        }
    }

    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: type inference failed for: r23v3, types: [m80.h] */
    /* JADX WARNING: type inference failed for: r23v4, types: [m80.g] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C108020b(java.util.List<? extends com.tencent.p014mm.plugin.vlog.model.C96533c0> r33) {
        /*
            r32 = this;
            r9 = r32
            r10 = r33
            java.lang.String r0 = "materials"
            gy3.C87412m.m108594g(r10, r0)
            r1 = 0
            java.lang.String r2 = "background"
            r3 = -1
            r5 = -1
            r7 = 0
            r8 = 0
            r0 = r32
            r0.<init>(r1, r2, r3, r5, r7, r8)
            r9.f323472v = r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f323473w = r0
            r6 = 1
            r9.f323467C = r6
            r7 = 44100(0xac44, float:6.1797E-41)
            r9.f323468D = r7
            r11 = 23
            r9.f323469E = r11
            r0 = -1
            r9.f323470F = r0
            java.util.Iterator r8 = r33.iterator()
            r15 = 0
        L_0x0035:
            boolean r0 = r8.hasNext()
            java.lang.String r14 = "MicroMsg.VLogAudioBackgroundDecoder"
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r8.next()
            int r22 = r15 + 1
            if (r15 < 0) goto L_0x0146
            r13 = r0
            com.tencent.mm.plugin.vlog.model.c0 r13 = (com.tencent.p014mm.plugin.vlog.model.C96533c0) r13
            boolean r0 = r13 instanceof com.tencent.p014mm.plugin.vlog.model.C96559y0
            if (r0 == 0) goto L_0x0139
            o80.a r5 = new o80.a
            java.lang.String r0 = r13.f282491c
            r5.<init>(r0)
            android.media.MediaFormat r0 = r5.f329159f
            java.lang.String r4 = ", material:"
            if (r0 == 0) goto L_0x0089
            java.lang.String r1 = "frame-rate"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x0089
            int r0 = r0.getInteger(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "index:"
            r1.append(r2)
            r1.append(r15)
            r1.append(r4)
            java.lang.String r2 = r13.f282491c
            r1.append(r2)
            java.lang.String r2 = ", audioFps:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x0089:
            r3 = r13
            com.tencent.mm.plugin.vlog.model.y0 r3 = (com.tencent.p014mm.plugin.vlog.model.C96559y0) r3
            long r1 = r3.f282622f
            r33 = r8
            long r7 = r13.f282490b
            long r11 = r13.f282489a
            long r7 = r7 - r11
            long r7 = r7 + r1
            r0 = 23
            boolean r0 = p206nj.C11171e.m11044a(r0)
            if (r0 == 0) goto L_0x00b2
            m80.g r0 = new m80.g
            r30 = 0
            r31 = 0
            java.lang.String r25 = "background"
            r23 = r0
            r24 = r5
            r26 = r1
            r28 = r7
            r23.<init>(r24, r25, r26, r28, r30, r31)
            goto L_0x00c5
        L_0x00b2:
            m80.h r0 = new m80.h
            r30 = 0
            r31 = 0
            java.lang.String r25 = "background"
            r23 = r0
            r24 = r5
            r26 = r1
            r28 = r7
            r23.<init>(r24, r25, r26, r28, r30, r31)
        L_0x00c5:
            r11 = r0
            h23.b$a r0 = new h23.b$a
            r0.<init>(r9, r15, r13)
            r11.f327850e = r0
            h23.b$b r12 = new h23.b$b
            r0 = r12
            r23 = r1
            r1 = r32
            r2 = r15
            r16 = r3
            r3 = r13
            r10 = r4
            r4 = r11
            r17 = r5
            r0.<init>(r1, r2, r3, r4, r5)
            r11.f327851f = r12
            java.util.ArrayList<h23.b$c> r0 = r9.f323473w
            h23.b$c r1 = new h23.b$c
            r2 = r13
            r13 = r1
            r3 = r14
            r14 = r15
            r4 = r15
            r15 = r16
            r16 = r11
            r18 = r23
            r20 = r7
            r13.<init>(r14, r15, r16, r17, r18, r20)
            r0.add(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add video decoder, index:"
            r0.append(r1)
            r0.append(r4)
            r0.append(r10)
            java.lang.String r1 = r2.f282491c
            r0.append(r1)
            java.lang.String r1 = ", start:"
            r0.append(r1)
            r4 = r23
            r0.append(r4)
            r1 = 44
            r0.append(r1)
            long r4 = r2.f282489a
            r0.append(r4)
            java.lang.String r4 = ", end:"
            r0.append(r4)
            r0.append(r7)
            r0.append(r1)
            long r1 = r2.f282490b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            goto L_0x013b
        L_0x0139:
            r33 = r8
        L_0x013b:
            r8 = r33
            r15 = r22
            r7 = 44100(0xac44, float:6.1797E-41)
            r11 = 23
            goto L_0x0035
        L_0x0146:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x014b:
            r3 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init finish, decoderList:"
            r0.append(r1)
            java.util.ArrayList<h23.b$c> r1 = r9.f323473w
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.util.ArrayList<h23.b$c> r0 = r9.f323473w
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x01be
            java.util.ArrayList<h23.b$c> r0 = r9.f323473w
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            h23.b$c r0 = (h23.C108020b.C108023c) r0
            m80.e r0 = r0.f323487c
            int r0 = r0.mo158415a()
            r9.f323467C = r0
            java.util.ArrayList<h23.b$c> r0 = r9.f323473w
            java.lang.Object r0 = r0.get(r1)
            h23.b$c r0 = (h23.C108020b.C108023c) r0
            m80.e r0 = r0.f323487c
            int r0 = r0.mo158416b()
            r9.f323468D = r0
            r0 = 23
            r9.f323469E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init currentChannelCount:"
            r0.append(r1)
            int r1 = r9.f323467C
            r0.append(r1)
            java.lang.String r1 = ", currentSampleRate:"
            r0.append(r1)
            int r1 = r9.f323468D
            r0.append(r1)
            java.lang.String r1 = ", currentAudioFrameInterval:"
            r0.append(r1)
            long r1 = r9.f323469E
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x01be:
            r0 = 5
            int r1 = eu3.C58834h.f168432b
            java.lang.String r1 = "VLogAudioBackgroundDecoder_sendVideoFrameDataThread"
            android.os.HandlerThread r0 = eu3.C97749e.m126093a(r1, r0)
            r9.f323465A = r0
            r0.start()
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.HandlerThread r1 = r9.f323465A
            android.os.Looper r1 = r1.getLooper()
            r0.<init>((android.os.Looper) r1)
            r9.f323476z = r0
            android.media.MediaFormat r0 = new android.media.MediaFormat
            r0.<init>()
            java.lang.String r1 = "mime"
            java.lang.String r2 = "audio/mp4a-latm"
            r0.setString(r1, r2)
            r1 = 2
            java.lang.String r2 = "aac-profile"
            r0.setInteger(r2, r1)
            java.lang.String r1 = "sample-rate"
            r2 = 44100(0xac44, float:6.1797E-41)
            r0.setInteger(r1, r2)
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r6)
            r1 = 64000(0xfa00, float:8.9683E-41)
            java.lang.String r2 = "bitrate"
            r0.setInteger(r2, r1)
            r1 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r2 = "max-input-size"
            r0.setInteger(r2, r1)
            r9.f323466B = r0
            r0 = 0
            r9.f323474x = r0
            r9.f323475y = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "init finish, defaultMediaFormat:"
            r0.append(r1)
            android.media.MediaFormat r1 = r9.f323466B
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h23.C108020b.<init>(java.util.List):void");
    }

    /* renamed from: a */
    public int mo158415a() {
        return this.f323467C;
    }

    /* renamed from: b */
    public int mo158416b() {
        return this.f323468D;
    }

    /* renamed from: d */
    public void mo158417d() {
        Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "startDecoder: " + this.f323473w.size());
        boolean z = true;
        if (!this.f323473w.isEmpty()) {
            this.f323471G = 0;
            this.f323475y = 0;
            this.f323474x = 0;
            C96533c0 c0Var = this.f323472v.get(0);
            if (c0Var instanceof C96530a0) {
                Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "firstMaterial is image, startTime:" + c0Var.f282489a + ", endTime:" + c0Var.f282490b);
                mo158419f(c0Var);
                StringBuilder sb = new StringBuilder();
                sb.append("finish process first image material, index:");
                sb.append(this.f323474x);
                Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", sb.toString());
                mo158420g(this.f323475y, c0Var, (C109536e) null, (C109993a) null);
                return;
            }
            C109993a aVar = this.f323473w.get(0).f323488d;
            if (aVar.f329159f == null || aVar.f329157d < 0) {
                z = false;
            }
            if (z) {
                this.f323467C = this.f323473w.get(0).f323487c.mo158415a();
                this.f323468D = this.f323473w.get(0).f323487c.mo158416b();
                this.f323470F = -1;
                this.f323473w.get(0).f323487c.mo158417d();
                return;
            }
            Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "first video not have audio:" + this.f323473w.get(0).f323486b.f282491c);
            mo158419f(this.f323473w.get(0).f323486b);
            Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "finish process first mute video material");
            mo158420g(this.f323475y, this.f323473w.get(0).f323486b, this.f323473w.get(0).f323487c, this.f323473w.get(0).f323488d);
        }
    }

    /* renamed from: e */
    public void mo158418e() {
        Log.printInfoStack("MicroMsg.VLogAudioBackgroundDecoder", "stopDecoder, decoderStop:" + this.f327855j, new Object[0]);
        if (!this.f327855j) {
            for (C108023c cVar : this.f323473w) {
                cVar.f323487c.mo158418e();
            }
            this.f323473w.clear();
        }
        this.f323465A.quitSafely();
        this.f323474x = 0;
        this.f323475y = 0;
    }

    /* renamed from: f */
    public final void mo158419f(C96533c0 c0Var) {
        Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "dumpFakeMaterialDecodeData, currentChannelCount:" + this.f323467C + ", currentSampleRate:" + this.f323468D + ", currentAudioFrameInterval:" + this.f323469E);
        long j = c0Var.f282489a;
        long j2 = c0Var.f282490b;
        long j3 = this.f323469E;
        if (j3 > 0) {
            long b = C66986c.m79138b(j, j2, j3);
            if (j <= b) {
                while (true) {
                    this.f323476z.post(new C108024d(this));
                    if (j != b) {
                        j += j3;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Step must be positive, was: " + j3 + '.');
        }
    }

    /* renamed from: g */
    public final void mo158420g(int i, C96533c0 c0Var, C109536e eVar, C109993a aVar) {
        boolean z;
        Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "videoDecodeEnd, index:" + i + ", material:" + c0Var.f282491c + ", currentPts:" + this.f323471G);
        if (eVar != null) {
            try {
                eVar.mo158418e();
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "videoDecodeEnd release decoder and extractor error");
            }
        }
        if (aVar != null) {
            aVar.mo161327e();
        }
        boolean z2 = true;
        int i2 = i + 1;
        if (i2 < this.f323472v.size()) {
            C96533c0 c0Var2 = this.f323472v.get(i2);
            this.f323475y = i2;
            Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "nextMaterial:" + c0Var2.f282491c);
            C108023c cVar = null;
            if (c0Var2 instanceof C96559y0) {
                Iterator<C108023c> it = this.f323473w.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C108023c next = it.next();
                    if (next.f323485a == i2) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        cVar = next;
                        break;
                    }
                }
                C108023c cVar2 = cVar;
                if (cVar2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("find start next decoder index:");
                    sb.append(i2);
                    sb.append(", hasAudio:");
                    C109993a aVar2 = cVar2.f323488d;
                    sb.append(aVar2.f329159f != null && aVar2.f329157d >= 0);
                    Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", sb.toString());
                    C109993a aVar3 = cVar2.f323488d;
                    if (aVar3.f329159f == null || aVar3.f329157d < 0) {
                        z2 = false;
                    }
                    if (!z2) {
                        Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "next material not have audio: " + cVar2.f323486b.f282491c);
                        mo158419f(cVar2.f323486b);
                        Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "finish process mute video material, index:" + this.f323474x);
                        mo158420g(this.f323475y, cVar2.f323486b, cVar2.f323487c, cVar2.f323488d);
                    } else {
                        this.f323467C = cVar2.f323487c.mo158415a();
                        this.f323468D = cVar2.f323487c.mo158416b();
                        this.f323470F = -1;
                        cVar2.f323487c.mo158417d();
                    }
                }
                this.f323474x = i2;
            } else if (c0Var2 instanceof C96530a0) {
                Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "next material is image, startTime:" + c0Var2.f282489a + ", endTime:" + c0Var2.f282490b);
                mo158419f(c0Var2);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("finish process image material, index:");
                sb4.append(this.f323474x);
                Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", sb4.toString());
                mo158420g(this.f323475y, c0Var2, (C109536e) null, (C109993a) null);
            } else {
                Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "cannot find next material");
            }
        } else {
            Log.m105924i("MicroMsg.VLogAudioBackgroundDecoder", "finish decode all material");
            C32224a<C13598b0> aVar4 = this.f327851f;
            if (aVar4 != null) {
                C13598b0 invoke = aVar4.invoke();
            }
        }
    }
}
