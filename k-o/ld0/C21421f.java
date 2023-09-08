package ld0;

import com.tencent.p014mm.modelvoice.MediaRecorder;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.Future;
import kd0.C21322l;
import ld0.C21418e;
import lu3.C88654b;
import zt3.C119157j;

/* renamed from: ld0.f */
public final class C21421f {

    /* renamed from: h */
    public static int f60618h;

    /* renamed from: a */
    public final int f60619a;

    /* renamed from: b */
    public final String f60620b;

    /* renamed from: c */
    public C21422a f60621c;

    /* renamed from: d */
    public final C21418e f60622d;

    /* renamed from: e */
    public final C21412a f60623e;

    /* renamed from: f */
    public volatile boolean f60624f;

    /* renamed from: g */
    public C21416c f60625g;

    /* renamed from: ld0.f$a */
    public final class C21422a extends C88654b {

        /* renamed from: e */
        public final C21415b f60626e;

        /* renamed from: f */
        public final C21417d f60627f;

        /* renamed from: g */
        public C109335h f60628g;

        /* renamed from: h */
        public final /* synthetic */ C21421f f60629h;

        public C21422a(C21421f fVar, C21415b bVar, C21417d dVar) {
            C87412m.m108594g(bVar, "audioDecoder");
            C87412m.m108594g(dVar, "audioPlayer");
            this.f60629h = fVar;
            this.f60626e = bVar;
            this.f60627f = dVar;
        }

        public String getKey() {
            return "MultiFileSilkPlayer-" + this.f60629h.f60619a;
        }

        public boolean isLogging() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10.f60629h.f60620b, "decode result is null");
            r5 = r10.f60628g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
            if (r5 == null) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            r5 = r5.f327314a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
            if (r5 == null) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
            if (r5.length() <= 0) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
            if (r5 != true) goto L_0x0062;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0062, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
            if (r5 == false) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0065, code lost:
            r5 = r10.f60629h.f60625g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
            if (r5 == null) goto L_0x007e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
            r7 = r10.f60628g;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
            if (r7 == null) goto L_0x0075;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
            r8 = r7.f327314a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
            if (r8 != null) goto L_0x0074;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
            r6 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
            if (r7 == null) goto L_0x007a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
            r7 = r7.f327315b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
            r5.mo26183b(r6, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
            ld0.C21421f.m24186e(r10.f60629h, false, true, 1, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e3, code lost:
            if (kotlin.Result.m168120isFailureimpl(r0) != false) goto L_0x00e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e6, code lost:
            r3 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e7, code lost:
            r3 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x0122, code lost:
            if (kotlin.Result.m168120isFailureimpl(r0) != false) goto L_0x00e7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                java.lang.String r0 = "quit loop"
                kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x001a }
                int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x001a }
                int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x001a }
                r2 = -16
                android.os.Process.setThreadPriority(r2)     // Catch:{ all -> 0x001a }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x001a }
                java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)     // Catch:{ all -> 0x001a }
                goto L_0x0025
            L_0x001a:
                r1 = move-exception
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
                java.lang.Object r1 = kotlin.Result.m168114constructorimpl(r1)
            L_0x0025:
                boolean r2 = kotlin.Result.m168120isFailureimpl(r1)
                r3 = 0
                if (r2 == 0) goto L_0x002d
                r1 = r3
            L_0x002d:
                java.lang.Integer r1 = (java.lang.Integer) r1
                ld0.f r2 = r10.f60629h
                java.lang.String r2 = r2.f60620b
                java.lang.String r4 = "enter loop"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            L_0x0038:
                r2 = 1
                r4 = 0
                ld0.b r5 = r10.f60626e     // Catch:{ InterruptedException -> 0x00ec }
                ld0.h r5 = r5.mo33548a()     // Catch:{ InterruptedException -> 0x00ec }
                java.lang.String r6 = ""
                if (r5 != 0) goto L_0x0084
                ld0.f r5 = r10.f60629h     // Catch:{ InterruptedException -> 0x00ec }
                java.lang.String r5 = r5.f60620b     // Catch:{ InterruptedException -> 0x00ec }
                java.lang.String r7 = "decode result is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)     // Catch:{ InterruptedException -> 0x00ec }
                ld0.h r5 = r10.f60628g     // Catch:{ InterruptedException -> 0x00ec }
                if (r5 == 0) goto L_0x0062
                java.lang.String r5 = r5.f327314a     // Catch:{ InterruptedException -> 0x00ec }
                if (r5 == 0) goto L_0x0062
                int r5 = r5.length()     // Catch:{ InterruptedException -> 0x00ec }
                if (r5 <= 0) goto L_0x005d
                r5 = 1
                goto L_0x005e
            L_0x005d:
                r5 = 0
            L_0x005e:
                if (r5 != r2) goto L_0x0062
                r5 = 1
                goto L_0x0063
            L_0x0062:
                r5 = 0
            L_0x0063:
                if (r5 == 0) goto L_0x007e
                ld0.f r5 = r10.f60629h     // Catch:{ InterruptedException -> 0x00ec }
                ld0.c r5 = r5.f60625g     // Catch:{ InterruptedException -> 0x00ec }
                if (r5 == 0) goto L_0x007e
                ld0.h r7 = r10.f60628g     // Catch:{ InterruptedException -> 0x00ec }
                if (r7 == 0) goto L_0x0075
                java.lang.String r8 = r7.f327314a     // Catch:{ InterruptedException -> 0x00ec }
                if (r8 != 0) goto L_0x0074
                goto L_0x0075
            L_0x0074:
                r6 = r8
            L_0x0075:
                if (r7 == 0) goto L_0x007a
                int r7 = r7.f327315b     // Catch:{ InterruptedException -> 0x00ec }
                goto L_0x007b
            L_0x007a:
                r7 = 0
            L_0x007b:
                r5.mo26183b(r6, r7)     // Catch:{ InterruptedException -> 0x00ec }
            L_0x007e:
                ld0.f r5 = r10.f60629h     // Catch:{ InterruptedException -> 0x00ec }
                ld0.C21421f.m24186e(r5, r4, r2, r2, r3)     // Catch:{ InterruptedException -> 0x00ec }
                goto L_0x00bb
            L_0x0084:
                boolean r7 = r5.f327320g     // Catch:{ InterruptedException -> 0x00ec }
                if (r7 != 0) goto L_0x0098
                ld0.f r6 = r10.f60629h     // Catch:{ InterruptedException -> 0x00ec }
                ld0.c r6 = r6.f60625g     // Catch:{ InterruptedException -> 0x00ec }
                if (r6 == 0) goto L_0x00b1
                java.lang.String r7 = r5.f327314a     // Catch:{ InterruptedException -> 0x00ec }
                int r8 = r5.f327315b     // Catch:{ InterruptedException -> 0x00ec }
                float r9 = r5.f327319f     // Catch:{ InterruptedException -> 0x00ec }
                r6.mo26182a(r7, r8, r9)     // Catch:{ InterruptedException -> 0x00ec }
                goto L_0x00b1
            L_0x0098:
                ld0.f r7 = r10.f60629h     // Catch:{ InterruptedException -> 0x00ec }
                ld0.c r7 = r7.f60625g     // Catch:{ InterruptedException -> 0x00ec }
                if (r7 == 0) goto L_0x00b1
                ld0.h r8 = r10.f60628g     // Catch:{ InterruptedException -> 0x00ec }
                if (r8 == 0) goto L_0x00a8
                java.lang.String r9 = r8.f327314a     // Catch:{ InterruptedException -> 0x00ec }
                if (r9 != 0) goto L_0x00a7
                goto L_0x00a8
            L_0x00a7:
                r6 = r9
            L_0x00a8:
                if (r8 == 0) goto L_0x00ad
                int r8 = r8.f327315b     // Catch:{ InterruptedException -> 0x00ec }
                goto L_0x00ae
            L_0x00ad:
                r8 = 0
            L_0x00ae:
                r7.mo26183b(r6, r8)     // Catch:{ InterruptedException -> 0x00ec }
            L_0x00b1:
                r10.f60628g = r5     // Catch:{ InterruptedException -> 0x00ec }
                ld0.d r6 = r10.f60627f     // Catch:{ InterruptedException -> 0x00ec }
                boolean r2 = r6.mo33542a(r5)     // Catch:{ InterruptedException -> 0x00ec }
                if (r2 != 0) goto L_0x0038
            L_0x00bb:
                ld0.f r2 = r10.f60629h
                java.lang.String r2 = r2.f60620b
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                if (r1 == 0) goto L_0x0125
                int r0 = r1.intValue()
                kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x00d4 }
                android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x00d4 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00d4 }
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00d4 }
                goto L_0x00df
            L_0x00d4:
                r0 = move-exception
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            L_0x00df:
                boolean r1 = kotlin.Result.m168120isFailureimpl(r0)
                if (r1 == 0) goto L_0x00e6
                goto L_0x00e7
            L_0x00e6:
                r3 = r0
            L_0x00e7:
                rx3.b0 r3 = (rx3.C13598b0) r3
                goto L_0x0125
            L_0x00ea:
                r2 = move-exception
                goto L_0x0126
            L_0x00ec:
                r5 = move-exception
                ld0.f r6 = r10.f60629h     // Catch:{ all -> 0x00ea }
                java.lang.String r6 = r6.f60620b     // Catch:{ all -> 0x00ea }
                java.lang.String r7 = "onInterrupt"
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ea }
                r2[r4] = r5     // Catch:{ all -> 0x00ea }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r2)     // Catch:{ all -> 0x00ea }
                ld0.f r2 = r10.f60629h
                java.lang.String r2 = r2.f60620b
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                if (r1 == 0) goto L_0x0125
                int r0 = r1.intValue()
                kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0113 }
                android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x0113 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0113 }
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0113 }
                goto L_0x011e
            L_0x0113:
                r0 = move-exception
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            L_0x011e:
                boolean r1 = kotlin.Result.m168120isFailureimpl(r0)
                if (r1 == 0) goto L_0x00e6
                goto L_0x00e7
            L_0x0125:
                return
            L_0x0126:
                ld0.f r4 = r10.f60629h
                java.lang.String r4 = r4.f60620b
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                if (r1 == 0) goto L_0x0154
                int r0 = r1.intValue()
                kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x013f }
                android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x013f }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x013f }
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x013f }
                goto L_0x014a
            L_0x013f:
                r0 = move-exception
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            L_0x014a:
                boolean r1 = kotlin.Result.m168120isFailureimpl(r0)
                if (r1 == 0) goto L_0x0151
                goto L_0x0152
            L_0x0151:
                r3 = r0
            L_0x0152:
                rx3.b0 r3 = (rx3.C13598b0) r3
            L_0x0154:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ld0.C21421f.C21422a.run():void");
        }
    }

    public C21421f(boolean z, int i, C8480h hVar) {
        z = (i & 1) != 0 ? true : z;
        int i2 = f60618h;
        f60618h = i2 + 1;
        this.f60619a = i2;
        this.f60620b = "MicroMsg.MSP.MultiFileSilkPlayer-" + i2;
        this.f60622d = new C21418e();
        this.f60623e = new C21412a(z, new C21423g(this));
    }

    /* renamed from: e */
    public static void m24186e(C21421f fVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        String str = fVar.f60620b;
        Log.m105924i(str, "stopPlay, playingFlag: " + z2);
        fVar.f60624f = z2;
        C21422a aVar = fVar.f60621c;
        if (aVar != null) {
            aVar.mo123097b(true);
        }
        fVar.f60621c = null;
        C21412a aVar2 = fVar.f60623e;
        aVar2.getClass();
        Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "stop play force " + z);
        aVar2.mo33545d(z);
        C21418e eVar = fVar.f60622d;
        eVar.getClass();
        Log.m105924i("MicroMsg.MSP.MultiFileSilkDecoder", "release");
        Log.m105924i("MicroMsg.MSP.MultiFileSilkDecoder", "reset");
        eVar.f60605b = null;
        C21418e.C21419a aVar3 = eVar.f60606c;
        if (aVar3 != null) {
            Log.m105924i(aVar3.f60608b, "decoder uninit");
            aVar3.f60613g = false;
            C21322l lVar = aVar3.f60609c;
            if (lVar != null) {
                MediaRecorder.SilkDecUnInit(lVar.f60230a);
            }
        }
        eVar.f60606c = null;
    }

    /* renamed from: a */
    public final void mo33552a(String str) {
        C87412m.m108594g(str, "path");
        String str2 = this.f60620b;
        Log.m105924i(str2, "appendFile: " + str);
        C21418e eVar = this.f60622d;
        eVar.getClass();
        Log.m105924i("MicroMsg.MSP.MultiFileSilkDecoder", "appendFile " + str);
        ArrayList arrayList = (ArrayList) eVar.f60604a;
        arrayList.add(new C21418e.C21420b(str, arrayList.size(), 0, 4, (C8480h) null));
        if (this.f60624f) {
            mo33555d();
        }
    }

    /* renamed from: b */
    public final void mo33553b() {
        Log.m105924i(this.f60620b, "clearFileList");
        C21418e eVar = this.f60622d;
        eVar.getClass();
        Log.m105924i("MicroMsg.MSP.MultiFileSilkDecoder", "clearFileList");
        ((ArrayList) eVar.f60604a).clear();
        eVar.f60605b = null;
        m24186e(this, true, false, 2, (Object) null);
    }

    /* renamed from: c */
    public final boolean mo33554c() {
        boolean z;
        C21422a aVar = this.f60621c;
        if (aVar != null) {
            Future future = aVar.f255969d;
            z = future == null ? false : future.isDone();
        } else {
            z = true;
        }
        return !z;
    }

    /* renamed from: d */
    public final void mo33555d() {
        Log.m105924i(this.f60620b, "startPlay");
        this.f60624f = true;
        if (mo33554c()) {
            Log.m105924i(this.f60620b, "now is playing");
        } else if (!(true ^ ((ArrayList) this.f60622d.f60604a).isEmpty())) {
            Log.m105928w(this.f60620b, "no audio file, delay init");
        } else {
            C21418e eVar = this.f60622d;
            eVar.getClass();
            Log.m105924i("MicroMsg.MSP.MultiFileSilkDecoder", "reset");
            eVar.f60605b = null;
            C21418e.C21419a aVar = eVar.f60606c;
            boolean z = false;
            if (aVar != null) {
                Log.m105924i(aVar.f60608b, "decoder uninit");
                aVar.f60613g = false;
                C21322l lVar = aVar.f60609c;
                if (lVar != null) {
                    MediaRecorder.SilkDecUnInit(lVar.f60230a);
                }
            }
            eVar.f60606c = null;
            C21412a aVar2 = this.f60623e;
            aVar2.mo33544c(aVar2.f60593c, aVar2.f60594d);
            C21422a aVar3 = this.f60621c;
            if (aVar3 != null) {
                Future future = aVar3.f255969d;
                if (future != null) {
                    z = future.isDone();
                }
                if (!z) {
                    return;
                }
            }
            C21422a aVar4 = new C21422a(this, this.f60622d, this.f60623e);
            this.f60621c = aVar4;
            ((C119157j) C119157j.f356862d).mo183875f(aVar4);
        }
    }
}
