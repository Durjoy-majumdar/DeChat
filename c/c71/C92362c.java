package c71;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import qz1.C101324a;

/* renamed from: c71.c */
public final class C92362c {

    /* renamed from: a */
    public final String f264299a = "MicroMsg.EmojiMixGifEncoder";

    /* renamed from: b */
    public MMHandler f264300b = new MMHandler("EmojiMixer_gifEncode");

    /* renamed from: c */
    public C101324a f264301c;

    /* renamed from: d */
    public long f264302d;

    /* renamed from: c71.c$a */
    public static final class C92363a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C92362c f264303d;

        /* renamed from: e */
        public final /* synthetic */ boolean f264304e;

        public C92363a(C92362c cVar, boolean z) {
            this.f264303d = cVar;
            this.f264304e = z;
        }

        public final void run() {
            boolean init = this.f264303d.f264301c.init();
            String str = this.f264303d.f264299a;
            Log.m105924i(str, "init encoder, outputGif: " + this.f264304e + " ret: " + init);
            if (!init) {
                if (this.f264304e) {
                    Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markGifInitFailed");
                    C115669n.INSTANCE.mo175913w(1012, 33, 1);
                } else {
                    Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markWxamInitFailed");
                    C115669n.INSTANCE.mo175913w(1012, 32, 1);
                }
            }
            this.f264303d.f264302d = Util.currentTicks();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [qz1.a] */
    /* JADX WARNING: type inference failed for: r1v2, types: [qz1.j] */
    /* JADX WARNING: type inference failed for: r2v2, types: [qz1.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C92362c(java.lang.String r9, int r10, int r11, long r12, boolean r14) {
        /*
            r8 = this;
            java.lang.String r0 = "outputPath"
            gy3.C87412m.m108594g(r9, r0)
            r8.<init>()
            java.lang.String r0 = "MicroMsg.EmojiMixGifEncoder"
            r8.f264299a = r0
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            java.lang.String r1 = "EmojiMixer_gifEncode"
            r0.<init>((java.lang.String) r1)
            r8.f264300b = r0
            if (r14 == 0) goto L_0x0023
            qz1.g r0 = new qz1.g
            r2 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            goto L_0x002f
        L_0x0023:
            qz1.j r0 = new qz1.j
            r7 = 20
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5, r7)
        L_0x002f:
            r8.f264301c = r0
            com.tencent.mm.sdk.platformtools.MMHandler r9 = r8.f264300b
            c71.c$a r10 = new c71.c$a
            r10.<init>(r8, r14)
            r9.post(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c71.C92362c.<init>(java.lang.String, int, int, long, boolean):void");
    }
}
