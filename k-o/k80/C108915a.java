package k80;

import a70.C112760b;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import java.util.Arrays;
import m80.C109536e;
import n80.C109696a;
import n80.C109698c;
import n80.C109699d;
import o40.C61926c;
import p206nj.C11171e;
import q80.C110371a;
import q80.C110373b;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: k80.a */
public final class C108915a {

    /* renamed from: a */
    public int f326277a;

    /* renamed from: b */
    public final int f326278b;

    /* renamed from: c */
    public final int f326279c;

    /* renamed from: d */
    public final C32228q<ByteBuffer, MediaCodec.BufferInfo, MediaFormat, C13598b0> f326280d;

    /* renamed from: e */
    public C109536e f326281e;

    /* renamed from: f */
    public C109536e f326282f;

    /* renamed from: g */
    public C109696a f326283g;

    /* renamed from: h */
    public C110371a f326284h;

    /* renamed from: i */
    public volatile boolean f326285i;

    /* renamed from: j */
    public boolean f326286j;

    /* renamed from: k */
    public boolean f326287k;

    /* renamed from: l */
    public HandlerThread f326288l = C97749e.m126093a("MediaCodecAACCodec_EncodeThread", 5);

    /* renamed from: m */
    public MMHandler f326289m;

    /* renamed from: n */
    public C32224a<C13598b0> f326290n;

    /* renamed from: o */
    public int f326291o;

    /* renamed from: p */
    public int f326292p;

    /* renamed from: q */
    public int f326293q;

    /* renamed from: r */
    public Runnable f326294r;

    /* renamed from: s */
    public Runnable f326295s;

    /* renamed from: t */
    public boolean f326296t;

    /* renamed from: u */
    public long f326297u;

    /* renamed from: v */
    public boolean f326298v;

    /* renamed from: w */
    public int f326299w;

    /* renamed from: k80.a$a */
    public static final class C108916a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108916a(C108915a aVar) {
            super(0);
            this.f326300d = aVar;
        }

        public Object invoke() {
            this.f326300d.getClass();
            Log.m105924i("MicroMsg.MediaCodecAACCodec", "onFrameMix");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$b */
    public static final class C108917b extends C87413o implements C32227p<byte[], Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108917b(C108915a aVar) {
            super(2);
            this.f326301d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            long longValue = ((Number) obj2).longValue();
            C87412m.m108594g(bArr, "audioData");
            C108915a.m147833e(this.f326301d, bArr, longValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$c */
    public static final class C108918c {

        /* renamed from: a */
        public final byte[] f326302a;

        /* renamed from: b */
        public final long f326303b;

        /* renamed from: c */
        public final boolean f326304c;

        public C108918c(byte[] bArr, long j, boolean z) {
            C87412m.m108594g(bArr, "data");
            this.f326302a = bArr;
            this.f326303b = j;
            this.f326304c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C108918c)) {
                return false;
            }
            C108918c cVar = (C108918c) obj;
            return C87412m.m108589b(this.f326302a, cVar.f326302a) && this.f326303b == cVar.f326303b && this.f326304c == cVar.f326304c;
        }

        public int hashCode() {
            long j = this.f326303b;
            int hashCode = ((Arrays.hashCode(this.f326302a) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            boolean z = this.f326304c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "EncoderData(data=" + Arrays.toString(this.f326302a) + ", pts=" + this.f326303b + ", isEnd=" + this.f326304c + ')';
        }
    }

    /* renamed from: k80.a$d */
    public static final class C108919d implements MMHandler.Callback {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326305d;

        public C108919d(C108915a aVar) {
            this.f326305d = aVar;
        }

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what != 1024) {
                return false;
            }
            Object obj = message.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.media.codec.MediaCodecAACCodec.EncoderData");
            C108918c cVar = (C108918c) obj;
            this.f326305d.getClass();
            Log.m105924i("MicroMsg.MediaCodecAACCodec", "start encode data " + cVar.f326302a.length + ", pts:" + cVar.f326303b + ", isLast: " + cVar.f326304c);
            C109696a aVar = this.f326305d.f326283g;
            if (aVar != null) {
                aVar.mo160916c(cVar.f326302a, cVar.f326303b, cVar.f326304c);
                return false;
            }
            C87412m.m108603p("mAudioEncoder");
            throw null;
        }
    }

    /* renamed from: k80.a$e */
    public static final class C108920e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326306d;

        public C108920e(C108915a aVar) {
            this.f326306d = aVar;
        }

        public final void run() {
            this.f326306d.getClass();
            Log.m105924i("MicroMsg.MediaCodecAACCodec", "mixMusic onDecodeEnd delay check, isPostEncodeEnd:" + this.f326306d.f326298v + ", mixCount:" + this.f326306d.f326299w + ", decodeMusicFrameCount:" + this.f326306d.f326293q);
            C108915a aVar = this.f326306d;
            if (!aVar.f326298v) {
                aVar.mo160047h(new byte[0], Util.currentTicks(), true);
            }
        }
    }

    /* renamed from: k80.a$f */
    public static final class C108921f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108921f(C108915a aVar) {
            super(0);
            this.f326307d = aVar;
        }

        public Object invoke() {
            C108915a.m147834f(this.f326307d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$g */
    public static final class C108922g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108922g(C108915a aVar) {
            super(0);
            this.f326308d = aVar;
        }

        public Object invoke() {
            this.f326308d.getClass();
            Log.m105924i("MicroMsg.MediaCodecAACCodec", "onFrameMix");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$h */
    public static final class C108923h extends C87413o implements C32227p<byte[], Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108923h(C108915a aVar) {
            super(2);
            this.f326309d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            long longValue = ((Number) obj2).longValue();
            C87412m.m108594g(bArr, "audioData");
            C108915a.m147833e(this.f326309d, bArr, longValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$i */
    public static final class C108924i extends C87413o implements C32227p<byte[], Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326310d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108924i(C108915a aVar) {
            super(2);
            this.f326310d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj2).longValue();
            C108915a.m147832d(this.f326310d, (byte[]) obj, longValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$j */
    public static final class C108925j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108925j(C108915a aVar) {
            super(0);
            this.f326311d = aVar;
        }

        public Object invoke() {
            C108915a.m147831c(this.f326311d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$k */
    public static final class C108926k extends C87413o implements C32227p<byte[], Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326312d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108926k(C108915a aVar) {
            super(2);
            this.f326312d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj2).longValue();
            C108915a.m147832d(this.f326312d, (byte[]) obj, longValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$l */
    public static final class C108927l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108927l(C108915a aVar) {
            super(0);
            this.f326313d = aVar;
        }

        public Object invoke() {
            C108915a.m147831c(this.f326313d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$m */
    public static final class C108928m extends C87413o implements C32227p<byte[], Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108928m(C108915a aVar) {
            super(2);
            this.f326314d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj2).longValue();
            C108915a.m147835g(this.f326314d, (byte[]) obj, longValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$n */
    public static final class C108929n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108929n(C108915a aVar) {
            super(0);
            this.f326315d = aVar;
        }

        public Object invoke() {
            C108915a.m147834f(this.f326315d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$o */
    public static final class C108930o extends C87413o implements C32227p<byte[], Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326316d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108930o(C108915a aVar) {
            super(2);
            this.f326316d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj2).longValue();
            C108915a.m147835g(this.f326316d, (byte[]) obj, longValue);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$p */
    public static final class C108931p extends C87413o implements C32228q<ByteBuffer, MediaCodec.BufferInfo, MediaFormat, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326317d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108931p(C108915a aVar) {
            super(3);
            this.f326317d = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
            MediaFormat mediaFormat = (MediaFormat) obj3;
            C87412m.m108594g(byteBuffer, "pcmData");
            C87412m.m108594g(bufferInfo, "bufferInfo");
            C87412m.m108594g(mediaFormat, "desMediaFormat");
            C108915a.m147829a(this.f326317d, byteBuffer, bufferInfo, mediaFormat);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$q */
    public static final class C108932q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326318d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108932q(C108915a aVar) {
            super(0);
            this.f326318d = aVar;
        }

        public Object invoke() {
            C108915a.m147830b(this.f326318d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$r */
    public static final class C108933r extends C87413o implements C32228q<ByteBuffer, MediaCodec.BufferInfo, MediaFormat, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326319d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108933r(C108915a aVar) {
            super(3);
            this.f326319d = aVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
            MediaFormat mediaFormat = (MediaFormat) obj3;
            C87412m.m108594g(byteBuffer, "pcmData");
            C87412m.m108594g(bufferInfo, "bufferInfo");
            C87412m.m108594g(mediaFormat, "desMediaFormat");
            C108915a.m147829a(this.f326319d, byteBuffer, bufferInfo, mediaFormat);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$s */
    public static final class C108934s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108934s(C108915a aVar) {
            super(0);
            this.f326320d = aVar;
        }

        public Object invoke() {
            C108915a.m147830b(this.f326320d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$t */
    public static final class C108935t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326321d;

        public C108935t(C108915a aVar) {
            this.f326321d = aVar;
        }

        public final void run() {
            C109536e eVar = this.f326321d.f326282f;
            if (eVar != null) {
                eVar.mo158417d();
            }
        }
    }

    /* renamed from: k80.a$u */
    public static final class C108936u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326322d;

        public C108936u(C108915a aVar) {
            this.f326322d = aVar;
        }

        public final void run() {
            C109536e eVar = this.f326322d.f326281e;
            if (eVar != null) {
                eVar.mo158417d();
            }
        }
    }

    /* renamed from: k80.a$v */
    public static final class C108937v extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326323d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108937v(C108915a aVar) {
            super(0);
            this.f326323d = aVar;
        }

        public Object invoke() {
            this.f326323d.getClass();
            Log.m105924i("MicroMsg.MediaCodecAACCodec", "startCodec BackgroundDecoder");
            ((C108935t) this.f326323d.f326294r).run();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k80.a$w */
    public static final class C108938w extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108915a f326324d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108938w(C108915a aVar) {
            super(0);
            this.f326324d = aVar;
        }

        public Object invoke() {
            this.f326324d.getClass();
            Log.m105924i("MicroMsg.MediaCodecAACCodec", "startCodec MusicDecoder");
            ((C108936u) this.f326324d.f326295s).run();
            return C13598b0.f38549a;
        }
    }

    public C108915a(int i, int i2, int i3, C32228q<? super ByteBuffer, ? super MediaCodec.BufferInfo, ? super MediaFormat, C13598b0> qVar) {
        this.f326277a = i;
        this.f326278b = i2;
        this.f326279c = i3;
        this.f326280d = qVar;
        int i4 = C58834h.f168432b;
        C112760b.m154195C();
        this.f326294r = new C108935t(this);
        this.f326295s = new C108936u(this);
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "init MediaCodecAACCodec, sampleRate:" + i2 + ", channelCount:" + i3);
        boolean contains = C64197v.m75537f(3, 1).contains(Integer.valueOf(this.f326277a));
        this.f326284h = new C110371a(i2, i3, contains, C64197v.m75537f(2, 3).contains(Integer.valueOf(this.f326277a)), new C108916a(this), new C108917b(this));
    }

    /* renamed from: a */
    public static final void m147829a(C108915a aVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat) {
        aVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("encode end ,data size is ");
        sb.append(byteBuffer);
        sb.append(' ');
        int i = aVar.f326291o;
        aVar.f326291o = i + 1;
        sb.append(i);
        sb.append(", pts:");
        sb.append(bufferInfo.presentationTimeUs);
        Log.m105924i("MicroMsg.MediaCodecAACCodec", sb.toString());
        C32228q<ByteBuffer, MediaCodec.BufferInfo, MediaFormat, C13598b0> qVar = aVar.f326280d;
        if (qVar != null) {
            qVar.invoke(byteBuffer, bufferInfo, mediaFormat);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:9|10|11|12|13|14|15|16) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0088 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0188  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m147830b(k80.C108915a r13) {
        /*
            r13.getClass()
            java.lang.String r0 = "MicroMsg.MediaCodecAACCodec"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onFrameEncodeEnd, mixCount:"
            r1.append(r2)
            int r2 = r13.f326299w
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            q80.a r0 = r13.f326284h
            r1 = 0
            if (r0 == 0) goto L_0x01a1
            java.lang.String r2 = r0.f330152n
            java.lang.String r3 = "stopMix"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            java.util.List<eh.e> r2 = r0.f330148j
            java.lang.String r3 = "pcmDataList"
            gy3.C87412m.m108593f(r2, r3)
            monitor-enter(r2)
            java.util.List<eh.e> r3 = r0.f330148j     // Catch:{ all -> 0x019e }
            r3.clear()     // Catch:{ all -> 0x019e }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x019e }
            monitor-exit(r2)
            java.lang.Object r2 = r0.f330153o
            monitor-enter(r2)
            r3 = 1
            r0.f330151m = r3     // Catch:{ all -> 0x019b }
            java.lang.Object r4 = r0.f330153o     // Catch:{ Exception -> 0x0042 }
            r4.notifyAll()     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x019b }
            monitor-exit(r2)
            java.lang.String r2 = r0.f330152n
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "isMixingFinish1 "
            r4.append(r5)
            boolean r5 = r0.f330149k
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            boolean r2 = r0.f330149k
            if (r2 != 0) goto L_0x008e
            java.lang.Object r2 = r0.f330154p
            monitor-enter(r2)
            boolean r4 = r0.f330149k     // Catch:{ Exception -> 0x0088 }
            if (r4 != 0) goto L_0x0088
            java.lang.String r4 = r0.f330152n     // Catch:{ Exception -> 0x0088 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0088 }
            r5.<init>()     // Catch:{ Exception -> 0x0088 }
            java.lang.String r6 = "isMixingFinish2 "
            r5.append(r6)     // Catch:{ Exception -> 0x0088 }
            boolean r6 = r0.f330149k     // Catch:{ Exception -> 0x0088 }
            r5.append(r6)     // Catch:{ Exception -> 0x0088 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0088 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r4 = r0.f330154p     // Catch:{ Exception -> 0x0088 }
            r4.wait()     // Catch:{ Exception -> 0x0088 }
            goto L_0x0088
        L_0x0086:
            r13 = move-exception
            goto L_0x008c
        L_0x0088:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0086 }
            monitor-exit(r2)
            goto L_0x008e
        L_0x008c:
            monitor-exit(r2)
            throw r13
        L_0x008e:
            kh.c r2 = r0.f330145g
            r2.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList<java.lang.String> r5 = r2.f326503e
            java.util.Iterator r5 = r5.iterator()
        L_0x009e:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x00f6
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.HashMap<java.lang.String, byte[]> r8 = r2.f326505g
            boolean r8 = r8.containsKey(r6)
            if (r8 == 0) goto L_0x009e
            java.util.HashMap<java.lang.String, byte[]> r8 = r2.f326505g
            java.lang.Object r8 = r8.get(r6)
            byte[] r8 = (byte[]) r8
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r2.f326506h
            java.lang.Object r9 = r9.get(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            eh.e r10 = new eh.e
            r10.<init>()
            int r11 = r2.f326502d
            byte[] r12 = new byte[r11]
            if (r9 <= 0) goto L_0x00d8
            if (r9 > r11) goto L_0x00d8
            java.lang.System.arraycopy(r8, r7, r12, r7, r9)
            goto L_0x00dd
        L_0x00d8:
            if (r8 == 0) goto L_0x00dd
            java.lang.System.arraycopy(r8, r7, r12, r7, r11)
        L_0x00dd:
            r10.f320943f = r12
            r4.add(r10)
            java.util.HashMap<java.lang.String, java.lang.Integer> r9 = r2.f326506h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r9.put(r6, r10)
            int r9 = p354kh.C109007c.f326498j
            java.util.Arrays.fill(r8, r7, r9, r7)
            java.util.HashMap<java.lang.String, byte[]> r7 = r2.f326505g
            r7.put(r6, r8)
            goto L_0x009e
        L_0x00f6:
            byte[] r2 = r2.mo160123b(r4)
            kh.c r4 = r0.f330145g
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.util.ArrayList<java.lang.String> r5 = r4.f326503e
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r7] = r5
            int r5 = p213oh.C11412b.f33577a
            java.lang.String r5 = "MicroMsg.Mix.AudioSyncMixController"
            java.lang.String r6 = "release, ids size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r3)
            java.util.ArrayList<java.lang.String> r3 = r4.f326503e
            java.util.Iterator r3 = r3.iterator()
        L_0x0119:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0145
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.HashMap<java.lang.String, hh.j> r6 = r4.f326504f
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x013a
            java.util.HashMap<java.lang.String, hh.j> r6 = r4.f326504f
            java.lang.Object r6 = r6.remove(r5)
            hh.j r6 = (p346hh.C20941j) r6
            if (r6 == 0) goto L_0x013a
            r6.release()
        L_0x013a:
            java.util.HashMap<java.lang.String, byte[]> r6 = r4.f326505g
            r6.remove(r5)
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r4.f326506h
            r6.remove(r5)
            goto L_0x0119
        L_0x0145:
            java.util.HashMap<java.lang.String, hh.j> r3 = r4.f326504f
            r3.clear()
            java.util.HashMap<java.lang.String, byte[]> r3 = r4.f326505g
            r3.clear()
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r4.f326506h
            r3.clear()
            java.util.ArrayList<java.lang.String> r3 = r4.f326503e
            r3.clear()
            kh.f r3 = r4.f326507i
            if (r3 == 0) goto L_0x015f
            r4.f326507i = r1
        L_0x015f:
            java.lang.String r3 = r0.f330152n
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "stopMix, final dstAudio:"
            r4.append(r5)
            if (r2 == 0) goto L_0x016f
            int r5 = r2.length
            goto L_0x0170
        L_0x016f:
            r5 = 0
        L_0x0170:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r3 = 0
            if (r2 == 0) goto L_0x0188
            fy3.p<? super byte[], ? super java.lang.Long, rx3.b0> r5 = r0.f330144f
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5.invoke(r2, r3)
            goto L_0x0193
        L_0x0188:
            fy3.p<? super byte[], ? super java.lang.Long, rx3.b0> r2 = r0.f330144f
            byte[] r5 = new byte[r7]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.invoke(r5, r3)
        L_0x0193:
            java.lang.String r0 = r0.f330152n
            java.lang.String r2 = "stopMix finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x01a1
        L_0x019b:
            r13 = move-exception
            monitor-exit(r2)
            throw r13
        L_0x019e:
            r13 = move-exception
            monitor-exit(r2)
            throw r13
        L_0x01a1:
            n80.a r0 = r13.f326283g
            if (r0 == 0) goto L_0x01bd
            r0.mo160915b()
            n80.a r0 = r13.f326283g
            if (r0 == 0) goto L_0x01b7
            r0.mo160915b()
            fy3.a<rx3.b0> r13 = r13.f326290n
            if (r13 == 0) goto L_0x01b6
            r13.invoke()
        L_0x01b6:
            return
        L_0x01b7:
            java.lang.String r13 = "mAudioEncoder"
            gy3.C87412m.m108603p(r13)
            throw r1
        L_0x01bd:
            java.lang.String r13 = "mAudioEncoder"
            gy3.C87412m.m108603p(r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k80.C108915a.m147830b(k80.a):void");
    }

    /* renamed from: c */
    public static final void m147831c(C108915a aVar) {
        aVar.getClass();
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "on background decode end");
        C110371a aVar2 = aVar.f326284h;
        if (aVar2 != null) {
            aVar2.mo161882d("background");
        }
        aVar.mo160051l(true);
    }

    /* renamed from: d */
    public static final void m147832d(C108915a aVar, byte[] bArr, long j) {
        C110371a aVar2;
        aVar.getClass();
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "on background frame decode, isDecodeEnd:" + aVar.f326285i);
        if (!aVar.f326285i) {
            aVar.f326292p++;
            if (bArr != null) {
                Log.m105924i("MicroMsg.MediaCodecAACCodec", "input background data");
                C109536e eVar = aVar.f326282f;
                if (eVar != null && (aVar2 = aVar.f326284h) != null) {
                    aVar2.mo161881c(bArr, "background", j, eVar.mo158416b(), eVar.mo158415a());
                }
            }
        }
    }

    /* renamed from: e */
    public static final void m147833e(C108915a aVar, byte[] bArr, long j) {
        boolean z = true;
        aVar.f326299w++;
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "onFrameMixEnd, mixCount:" + aVar.f326299w + ", decodeMusicFrameCount:" + aVar.f326293q + ", decodeBackgroundFrameCount:" + aVar.f326292p + ", mixType:" + aVar.f326277a + ", data:" + bArr.length + ", pts:" + j);
        if (aVar.f326277a == 3) {
            if (!aVar.f326285i || aVar.f326299w != aVar.f326292p) {
                z = false;
            }
            aVar.mo160047h(bArr, j, z);
        } else if (!aVar.f326285i) {
            aVar.mo160047h(bArr, j, false);
        } else if (aVar.f326277a == 2) {
            if (!aVar.f326285i || aVar.f326299w != aVar.f326293q) {
                z = false;
            }
            aVar.mo160047h(bArr, j, z);
        } else {
            if (!aVar.f326285i || aVar.f326299w != aVar.f326292p) {
                z = false;
            }
            aVar.mo160047h(bArr, j, z);
        }
    }

    /* renamed from: f */
    public static final void m147834f(C108915a aVar) {
        aVar.getClass();
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "on music decode end");
        C110371a aVar2 = aVar.f326284h;
        if (aVar2 != null) {
            aVar2.mo161882d("music");
        }
        aVar.mo160051l(false);
    }

    /* renamed from: g */
    public static final void m147835g(C108915a aVar, byte[] bArr, long j) {
        C110371a aVar2;
        aVar.getClass();
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "on music frame decode, isDecodeEnd:" + aVar.f326285i);
        if (!aVar.f326285i || aVar.f326293q != aVar.f326292p) {
            aVar.f326293q++;
            if (bArr != null) {
                C109536e eVar = aVar.f326281e;
                if (!(eVar == null || (aVar2 = aVar.f326284h) == null)) {
                    aVar2.mo161881c(bArr, "music", j, eVar.mo158416b(), eVar.mo158415a());
                }
                Log.m105924i("MicroMsg.MediaCodecAACCodec", "input music data");
            }
        }
    }

    /* renamed from: h */
    public final void mo160047h(byte[] bArr, long j, boolean z) {
        if (this.f326289m == null) {
            this.f326288l.start();
            this.f326289m = new MMHandler(this.f326288l.getLooper(), (MMHandler.Callback) new C108919d(this));
        }
        if (z) {
            this.f326298v = true;
        }
        MMHandler mMHandler = this.f326289m;
        Message obtainMessage = mMHandler != null ? mMHandler.obtainMessage() : null;
        if (obtainMessage != null) {
            obtainMessage.what = 1024;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C87412m.m108593f(copyOf, "copyOf(this, newSize)");
        C108918c cVar = new C108918c(copyOf, j, z);
        if (obtainMessage != null) {
            obtainMessage.obj = cVar;
        }
        MMHandler mMHandler2 = this.f326289m;
        if (mMHandler2 != null) {
            mMHandler2.sendMessage(obtainMessage);
        }
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "checkPostEncoder, " + cVar.f326302a.length + ", pts:" + cVar.f326303b + ", isLast: " + cVar.f326304c);
    }

    /* renamed from: i */
    public final void mo160048i() {
        long j = ((long) this.f326293q) * 5;
        MMHandler mMHandler = this.f326289m;
        if (mMHandler != null) {
            mMHandler.postDelayed(new C108920e(this), j);
        }
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "set check post encode end delay:" + j);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [m80.e] */
    /* JADX WARNING: type inference failed for: r17v0 */
    /* JADX WARNING: type inference failed for: r2v20, types: [m80.h] */
    /* JADX WARNING: type inference failed for: r2v21, types: [m80.g] */
    /* JADX WARNING: type inference failed for: r2v22, types: [m80.h] */
    /* JADX WARNING: type inference failed for: r2v23, types: [m80.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo160049j(o80.C109993a r24, o80.C109993a r25, long r26, long r28) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r11 = r25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "init decoder background "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "music is "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.lang.String r12 = "MicroMsg.MediaCodecAACCodec"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            java.lang.String r13 = "MicroMsg.MediaEditorIDKeyStat"
            r14 = 0
            if (r0 == 0) goto L_0x002f
            android.media.MediaFormat r2 = r0.f329159f     // Catch:{ Exception -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            goto L_0x0147
        L_0x002f:
            r2 = 0
        L_0x0030:
            r3 = 3
            r15 = 1
            if (r2 != 0) goto L_0x00c2
            int r2 = r1.f326277a     // Catch:{ Exception -> 0x002c }
            if (r2 != r3) goto L_0x00c2
            r2 = 2
            r1.f326277a = r2     // Catch:{ Exception -> 0x002c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002c }
            r4.<init>()     // Catch:{ Exception -> 0x002c }
            java.lang.String r5 = "background AudioFormat is null, recreate AudioMixCodec, sampleRate:"
            r4.append(r5)     // Catch:{ Exception -> 0x002c }
            int r5 = r1.f326278b     // Catch:{ Exception -> 0x002c }
            r4.append(r5)     // Catch:{ Exception -> 0x002c }
            java.lang.String r5 = ", channelCount:"
            r4.append(r5)     // Catch:{ Exception -> 0x002c }
            int r5 = r1.f326279c     // Catch:{ Exception -> 0x002c }
            r4.append(r5)     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x002c }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r4)     // Catch:{ Exception -> 0x002c }
            q80.a r4 = new q80.a     // Catch:{ Exception -> 0x002c }
            int r5 = r1.f326278b     // Catch:{ Exception -> 0x002c }
            int r6 = r1.f326279c     // Catch:{ Exception -> 0x002c }
            java.lang.Integer[] r7 = new java.lang.Integer[r2]     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x002c }
            r7[r14] = r8     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x002c }
            r7[r15] = r8     // Catch:{ Exception -> 0x002c }
            java.util.List r7 = sx3.C64197v.m75537f(r7)     // Catch:{ Exception -> 0x002c }
            int r8 = r1.f326277a     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x002c }
            boolean r19 = r7.contains(r8)     // Catch:{ Exception -> 0x002c }
            java.lang.Integer[] r7 = new java.lang.Integer[r2]     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x002c }
            r7[r14] = r2     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x002c }
            r7[r15] = r2     // Catch:{ Exception -> 0x002c }
            java.util.List r2 = sx3.C64197v.m75537f(r7)     // Catch:{ Exception -> 0x002c }
            int r7 = r1.f326277a     // Catch:{ Exception -> 0x002c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x002c }
            boolean r20 = r2.contains(r7)     // Catch:{ Exception -> 0x002c }
            k80.a$g r2 = new k80.a$g     // Catch:{ Exception -> 0x002c }
            r2.<init>(r1)     // Catch:{ Exception -> 0x002c }
            k80.a$h r7 = new k80.a$h     // Catch:{ Exception -> 0x002c }
            r7.<init>(r1)     // Catch:{ Exception -> 0x002c }
            r16 = r4
            r17 = r5
            r18 = r6
            r21 = r2
            r22 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x002c }
            r1.f326284h = r4     // Catch:{ Exception -> 0x002c }
            java.lang.String r2 = "markRemuxBackgroundNoAudioTrack"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)     // Catch:{ Exception -> 0x002c }
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x002c }
            r5 = 986(0x3da, double:4.87E-321)
            r7 = 25
            r9 = 1
            r4.mo175913w(r5, r7, r9)     // Catch:{ Exception -> 0x002c }
        L_0x00c2:
            int r2 = r1.f326277a     // Catch:{ Exception -> 0x002c }
            r16 = 23
            if (r2 != r3) goto L_0x0109
            if (r0 == 0) goto L_0x0109
            boolean r2 = p206nj.C11171e.m11044a(r16)     // Catch:{ Exception -> 0x002c }
            if (r2 == 0) goto L_0x00ea
            m80.g r17 = new m80.g     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = "background"
            k80.a$i r9 = new k80.a$i     // Catch:{ Exception -> 0x002c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x002c }
            k80.a$j r10 = new k80.a$j     // Catch:{ Exception -> 0x002c }
            r10.<init>(r1)     // Catch:{ Exception -> 0x002c }
            r2 = r17
            r3 = r24
            r5 = r26
            r7 = r28
            r2.<init>(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x002c }
            goto L_0x0105
        L_0x00ea:
            r1.f326296t = r15     // Catch:{ Exception -> 0x002c }
            m80.h r17 = new m80.h     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = "background"
            k80.a$k r9 = new k80.a$k     // Catch:{ Exception -> 0x002c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x002c }
            k80.a$l r10 = new k80.a$l     // Catch:{ Exception -> 0x002c }
            r10.<init>(r1)     // Catch:{ Exception -> 0x002c }
            r2 = r17
            r3 = r24
            r5 = r26
            r7 = r28
            r2.<init>(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x002c }
        L_0x0105:
            r0 = r17
            r1.f326282f = r0     // Catch:{ Exception -> 0x002c }
        L_0x0109:
            if (r11 == 0) goto L_0x0146
            boolean r0 = p206nj.C11171e.m11044a(r16)     // Catch:{ Exception -> 0x002c }
            if (r0 == 0) goto L_0x012a
            m80.g r0 = new m80.g     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = "music"
            r5 = 0
            long r7 = r28 - r26
            k80.a$m r9 = new k80.a$m     // Catch:{ Exception -> 0x002c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x002c }
            k80.a$n r10 = new k80.a$n     // Catch:{ Exception -> 0x002c }
            r10.<init>(r1)     // Catch:{ Exception -> 0x002c }
            r2 = r0
            r3 = r25
            r2.<init>(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x002c }
            goto L_0x0144
        L_0x012a:
            r1.f326296t = r15     // Catch:{ Exception -> 0x002c }
            m80.h r0 = new m80.h     // Catch:{ Exception -> 0x002c }
            java.lang.String r4 = "music"
            r5 = 0
            long r7 = r28 - r26
            k80.a$o r9 = new k80.a$o     // Catch:{ Exception -> 0x002c }
            r9.<init>(r1)     // Catch:{ Exception -> 0x002c }
            k80.a$f r10 = new k80.a$f     // Catch:{ Exception -> 0x002c }
            r10.<init>(r1)     // Catch:{ Exception -> 0x002c }
            r2 = r0
            r3 = r25
            r2.<init>(r3, r4, r5, r7, r9, r10)     // Catch:{ Exception -> 0x002c }
        L_0x0144:
            r1.f326281e = r0     // Catch:{ Exception -> 0x002c }
        L_0x0146:
            return
        L_0x0147:
            java.lang.Object[] r2 = new java.lang.Object[r14]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r2)
            java.lang.String r2 = "markRemuxAACDecoderInitFailed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 986(0x3da, double:4.87E-321)
            r6 = 22
            r8 = 1
            r3.mo175913w(r4, r6, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k80.C108915a.mo160049j(o80.a, o80.a, long, long):void");
    }

    /* renamed from: k */
    public final void mo160050k(MediaFormat mediaFormat) {
        C109696a aVar;
        C87412m.m108594g(mediaFormat, "mediaFormat");
        try {
            if (C11171e.m11044a(23)) {
                aVar = new C109698c(mediaFormat, new C108931p(this), new C108932q(this));
            } else {
                this.f326296t = true;
                aVar = new C109699d(mediaFormat, new C108933r(this), new C108934s(this));
            }
            this.f326283g = aVar;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MediaCodecAACCodec", e, "", new Object[0]);
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACEncoderInitFailed");
            C115669n.INSTANCE.mo175913w(986, 23, 1);
        }
    }

    /* renamed from: l */
    public final synchronized void mo160051l(boolean z) {
        Log.printInfoStack("MicroMsg.MediaCodecAACCodec", "onDecodeEnd, isDecodeEnd:" + this.f326285i + ", isBackground:" + z + ", mixCount:" + this.f326299w + ", decodeMusicFrameCount:" + this.f326293q + ", decodeBackgroundFrameCount:" + this.f326292p, new Object[0]);
        if (z) {
            this.f326287k = true;
        } else {
            this.f326286j = true;
        }
        int i = this.f326277a;
        if (i != 3 || !this.f326286j || !this.f326287k) {
            if (i != 2 || !this.f326286j) {
                if (i == 1 && this.f326287k && !this.f326285i) {
                    this.f326285i = true;
                    C109536e eVar = this.f326282f;
                    if (eVar != null) {
                        eVar.mo158418e();
                    }
                }
            } else if (!this.f326285i) {
                this.f326285i = true;
                C109536e eVar2 = this.f326281e;
                if (eVar2 != null) {
                    eVar2.mo158418e();
                }
                mo160048i();
            }
        } else if (!this.f326285i) {
            this.f326285i = true;
            C109536e eVar3 = this.f326281e;
            if (eVar3 != null) {
                eVar3.mo158418e();
            }
            C109536e eVar4 = this.f326282f;
            if (eVar4 != null) {
                eVar4.mo158418e();
            }
            mo160048i();
        }
    }

    /* renamed from: m */
    public boolean mo160052m(C32224a<C13598b0> aVar) {
        C110371a aVar2 = this.f326284h;
        if (aVar2 != null) {
            Log.m105924i(aVar2.f330152n, "startMix");
            aVar2.f330150l = true;
            C61926c.m72685j("AudioMixCodec_MixAudio", true, new C110373b(aVar2));
        }
        int i = this.f326277a;
        if (i == 3 || i == 1) {
            C61926c.m72685j("BackgroundDecoder", true, new C108937v(this));
        }
        if (this.f326281e != null) {
            C61926c.m72685j("MusicDecoder", true, new C108938w(this));
        }
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "startCodec");
        this.f326290n = aVar;
        this.f326297u = Util.currentTicks();
        return true;
    }

    /* renamed from: n */
    public boolean mo160053n() {
        Log.m105924i("MicroMsg.MediaCodecAACCodec", "stopCodec, isPostDecodeEnd:" + this.f326298v);
        C109536e eVar = this.f326282f;
        if (eVar != null) {
            eVar.mo158418e();
        }
        C109536e eVar2 = this.f326281e;
        if (eVar2 != null) {
            eVar2.mo158418e();
        }
        C109696a aVar = this.f326283g;
        if (aVar != null) {
            aVar.mo160915b();
            this.f326288l.quitSafely();
            long j = this.f326297u;
            if (j <= 0) {
                return true;
            }
            long ticksToNow = Util.ticksToNow(j);
            if (this.f326296t) {
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMix");
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175913w(986, 26, 1);
                Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACAsyncMixTime: " + ticksToNow);
                nVar.mo175913w(986, 27, ticksToNow);
                return true;
            }
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMix");
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo175913w(986, 30, 1);
            Log.m105924i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACSyncMixTime: " + ticksToNow);
            nVar2.mo175913w(986, 31, ticksToNow);
            return true;
        }
        C87412m.m108603p("mAudioEncoder");
        throw null;
    }
}
