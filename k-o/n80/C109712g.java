package n80;

import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import gu3.C107916a;
import gu3.C107917d;
import gu3.C107920f;
import gu3.C87399g;
import rx3.C13598b0;

/* renamed from: n80.g */
public final class C109712g {

    /* renamed from: a */
    public final int f328385a;

    /* renamed from: b */
    public C107920f<?> f328386b;

    /* renamed from: c */
    public final MMHandler f328387c = new MMHandler("X264TransEncoder_writeDataThread");

    /* renamed from: d */
    public boolean f328388d;

    /* renamed from: e */
    public boolean f328389e;

    /* renamed from: f */
    public final Object f328390f = new Object();

    /* renamed from: g */
    public int f328391g;

    /* renamed from: h */
    public int f328392h;

    /* renamed from: i */
    public boolean f328393i;

    /* renamed from: n80.g$a */
    public static final class C109713a<I, O> implements C107916a {

        /* renamed from: a */
        public final /* synthetic */ C109712g f328394a;

        public C109713a(C109712g gVar) {
            this.f328394a = gVar;
        }

        /* renamed from: a */
        public Object mo63988a(Object obj) {
            C107917d.C87398b bVar = (C107917d.C87398b) obj;
            C109712g gVar = this.f328394a;
            while (!gVar.f328388d) {
                long currentTicks = Util.currentTicks();
                int triggerEncode = SightVideoJNI.triggerEncode(gVar.f328385a, Math.max(0, gVar.f328392h), false);
                Log.m105925i("MicroMsg.X264TransEncoder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(gVar.f328392h), Integer.valueOf(triggerEncode), Long.valueOf(Thread.currentThread().getId()));
                if (Math.abs(triggerEncode - gVar.f328392h) <= 5) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception unused) {
                        Log.m105920e("MicroMsg.X264TransEncoder", "thread sleep error");
                    }
                }
                gVar.f328392h = triggerEncode;
            }
            long currentTicks2 = Util.currentTicks();
            if (!gVar.f328389e) {
                gVar.f328392h = SightVideoJNI.triggerEncode(gVar.f328385a, gVar.f328392h, true);
            }
            Log.m105925i("MicroMsg.X264TransEncoder", "end: trgger encode use %dms, curEncode index %d, markCancel %s, threadId: %s", Long.valueOf(Util.ticksToNow(currentTicks2)), Integer.valueOf(gVar.f328392h), Boolean.valueOf(gVar.f328389e), Long.valueOf(Thread.currentThread().getId()));
            return C13598b0.f38549a;
        }
    }

    public C109712g(int i, int i2, int i3) {
        this.f328385a = i;
        Log.m105924i("MicroMsg.X264TransEncoder", "create X264TransEncoder, width:" + i2 + ", height:" + i3);
    }

    /* renamed from: a */
    public final void mo160942a() {
        this.f328388d = false;
        this.f328389e = false;
        this.f328391g = 0;
        Util.currentTicks();
        SightVideoJNI.setRotateForBufId(this.f328385a, 0);
        C87399g gVar = C107917d.f323120i;
        C107920f fVar = new C107920f(C107917d.f323122k);
        fVar.f323124b = C107917d.f323120i;
        C109713a aVar = new C109713a(this);
        C107920f<?> fVar2 = new C107920f<>();
        fVar2.f323124b = fVar.mo158344e();
        fVar2.f323126d = fVar;
        fVar.f323127e = fVar2;
        fVar.f323125c = aVar;
        this.f328386b = fVar2;
        this.f328393i = false;
        Log.m105924i("MicroMsg.X264TransEncoder", IXWebBroadcastListener.STAGE_START);
    }
}
