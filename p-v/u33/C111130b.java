package u33;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: u33.b */
public final class C111130b {

    /* renamed from: a */
    public final String f332734a;

    /* renamed from: b */
    public MMHandler f332735b;

    /* renamed from: c */
    public final HandlerThread f332736c;

    /* renamed from: d */
    public C111742d.C65942b f332737d;

    /* renamed from: u33.b$a */
    public static final class C111131a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f332738d;

        public C111131a(C32224a aVar) {
            this.f332738d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f332738d.invoke();
        }
    }

    public C111130b(String str) {
        C87412m.m108594g(str, "usage");
        this.f332734a = str;
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("voip{" + str + '}', 10);
        this.f332736c = a;
        Log.m105924i("MicroMsg.VoipThread", "init voip render thread " + str);
        a.start();
        MMHandler mMHandler = new MMHandler(a.getLooper());
        this.f332735b = mMHandler;
        mMHandler.setLogging(false);
        Log.m105924i("MicroMsg.VoipThread", "start: " + a.getName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getRunningMessage();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo162867a() {
        /*
            r6 = this;
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f332735b
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.os.Message r0 = r0.getRunningMessage()
            if (r0 == 0) goto L_0x0010
            java.lang.Runnable r0 = r0.getCallback()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            r2 = 0
            if (r0 == 0) goto L_0x0065
            android.os.HandlerThread r0 = r6.f332736c
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            java.lang.String r4 = "it"
            gy3.C87412m.m108593f(r0, r4)
            int r4 = r0.length
        L_0x0025:
            if (r2 >= r4) goto L_0x0038
            r5 = r0[r2]
            java.lang.String r5 = r5.toString()
            r3.write(r5)
            java.lang.String r5 = "\n"
            r3.write(r5)
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0038:
            r3.flush()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "voip{"
            r0.append(r2)
            java.lang.String r2 = r6.f332734a
            r0.append(r2)
            java.lang.String r2 = "} current run "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.VoipThread"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r6.f332735b
            if (r0 == 0) goto L_0x0064
            r0.removeCallbacksAndMessages(r1)
        L_0x0064:
            r2 = 1
        L_0x0065:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u33.C111130b.mo162867a():boolean");
    }

    /* renamed from: b */
    public final void mo162868b(Runnable runnable) {
        C87412m.m108594g(runnable, "callback");
        MMHandler mMHandler = this.f332735b;
        if (mMHandler != null) {
            mMHandler.post(runnable);
        }
    }

    /* renamed from: c */
    public final void mo162869c(C32224a<C13598b0> aVar) {
        MMHandler mMHandler;
        C87412m.m108594g(aVar, "callback");
        if (C87412m.m108589b(Looper.myLooper(), this.f332736c.getLooper())) {
            aVar.invoke();
        } else if (this.f332736c.isAlive() && (mMHandler = this.f332735b) != null) {
            mMHandler.post(new C111131a(aVar));
        }
    }
}
