package f20;

import com.tencent.p014mm.sdk.platformtools.Log;
import e20.C86418c;
import e20.C97585a;
import kj2.C117407d;

/* renamed from: f20.a */
public enum C20644a {
    INSTANCE;

    /* renamed from: f20.a$a */
    public static class C20645a {

        /* renamed from: a */
        public String f58112a;

        /* renamed from: b */
        public String f58113b;

        /* renamed from: c */
        public int f58114c;

        /* renamed from: d */
        public int f58115d;

        /* renamed from: e */
        public int f58116e;

        /* renamed from: f */
        public int f58117f;

        /* renamed from: g */
        public int f58118g;

        /* renamed from: h */
        public int f58119h;

        /* renamed from: i */
        public int f58120i;

        /* renamed from: j */
        public int f58121j;

        /* renamed from: k */
        public int f58122k;
    }

    /* renamed from: a */
    public final void mo32325a(long j, C20645a aVar) {
        C20645a aVar2 = aVar;
        if (aVar2 != null) {
            Log.m105925i("MicroMsg.ImageReporter", "alvinluo reportImageDecodeInfo sessionId: %d, from: %s, imageType: %d, w: %d, h: %d, fileSize: %d, orientation: %d, decodeResult: %d, decodeTime: %d, fullSampleSzie: %d, onlyDecodeTime: %d", Long.valueOf(j), aVar2.f58113b, Integer.valueOf(aVar2.f58114c), Integer.valueOf(aVar2.f58115d), Integer.valueOf(aVar2.f58116e), Integer.valueOf(aVar2.f58117f), Integer.valueOf(aVar2.f58118g), Integer.valueOf(aVar2.f58119h), Integer.valueOf(aVar2.f58120i), Integer.valueOf(aVar2.f58121j), Integer.valueOf(aVar2.f58122k));
            C117407d.INSTANCE.mo160131h(15467, Long.valueOf(j), aVar2.f58113b, Integer.valueOf(aVar2.f58114c), Integer.valueOf(aVar2.f58115d), Integer.valueOf(aVar2.f58116e), Integer.valueOf(aVar2.f58117f), Integer.valueOf(aVar2.f58118g), Integer.valueOf(aVar2.f58119h), Integer.valueOf(aVar2.f58120i), Integer.valueOf(aVar2.f58121j), Integer.valueOf(aVar2.f58122k));
        }
    }

    /* renamed from: b */
    public void mo32326b(C97585a aVar, C86418c cVar) {
        C86418c cVar2 = cVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (cVar2 != null) {
            Log.m105925i("MicroMsg.ImageReporter", "alvinluo reportPerformance sessionId: %d, fps.maxFps: %f, fps.minFps: %f, fps.averageFps: %f, memory.memoryUsedWhenInit: %f, memory.currentMaxUsedMemory: %f, memory.currentMinUsedMemory: %f, memory.averUsed: %f, memory.currentVarianceSum: %f", Long.valueOf(currentTimeMillis), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(cVar2.f251203d), Double.valueOf(cVar2.f251204e), Double.valueOf(cVar2.f251205f), Double.valueOf(cVar2.f251207h), Double.valueOf(cVar2.f251206g));
            C117407d.INSTANCE.mo160131h(15471, Long.valueOf(currentTimeMillis), Integer.valueOf((int) 0.0d), Integer.valueOf((int) 0.0d), Integer.valueOf((int) 0.0d), Integer.valueOf((int) cVar2.f251203d), Integer.valueOf((int) cVar2.f251204e), Integer.valueOf((int) cVar2.f251207h), Integer.valueOf((int) cVar2.f251206g), 1);
        }
    }
}
