package k33;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32226l;
import j33.C108551b;
import kd0.C99125s;
import rx3.C13598b0;

/* renamed from: k33.q */
public class C117381q {

    /* renamed from: i */
    public static int f351415i = 100;

    /* renamed from: a */
    public C99125s f351416a = null;

    /* renamed from: b */
    public int f351417b = 0;

    /* renamed from: c */
    public String f351418c = "";

    /* renamed from: d */
    public long f351419d = 0;

    /* renamed from: e */
    public int f351420e = 0;

    /* renamed from: f */
    public boolean f351421f = false;

    /* renamed from: g */
    public C108551b f351422g = new C108551b(new C117382a());

    /* renamed from: h */
    public C117383b f351423h = null;

    /* renamed from: k33.q$a */
    public class C117382a implements C32226l<Boolean, C13598b0> {
        public C117382a() {
        }

        public Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            C117381q qVar = C117381q.this;
            qVar.getClass();
            qVar.f351416a = new C99125s();
            new C117384c().start();
            qVar.f351421f = false;
            qVar.f351420e = 1;
            return null;
        }
    }

    /* renamed from: k33.q$b */
    public interface C117383b {
    }

    /* renamed from: k33.q$c */
    public final class C117384c extends Thread {

        /* renamed from: d */
        public MMHandler f351425d;

        /* renamed from: k33.q$c$a */
        public class C117385a extends MMHandler {
            public C117385a(C117381q qVar) {
            }

            public void handleMessage(Message message) {
                C117381q qVar = C117381q.this;
                if (qVar.f351420e > 0) {
                    qVar.f351420e = 2;
                }
            }
        }

        public C117384c() {
            this.f351425d = new C117385a(C117381q.this);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x007a, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                k33.q r0 = k33.C117381q.this
                kd0.s r1 = r0.f351416a
                if (r1 != 0) goto L_0x000e
                java.lang.String r0 = "MicroMsg.VoicePrintRecoder"
                java.lang.String r1 = "Stop Record Failed recorder == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                return
            L_0x000e:
                monitor-enter(r0)
                k33.q r1 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                java.lang.String r1 = r1.f351418c     // Catch:{ all -> 0x00b4 }
                r2 = 1
                java.lang.String r1 = k33.C33823m.m40152a(r1, r2)     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = "MicroMsg.VoicePrintRecoder"
                java.lang.String r4 = "fullPathName %s"
                java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00b4 }
                r6 = 0
                r5[r6] = r1     // Catch:{ all -> 0x00b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r4, r5)     // Catch:{ all -> 0x00b4 }
                k33.q r3 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                r3.getClass()     // Catch:{ all -> 0x00b4 }
                k33.q r3 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                j33.b r3 = r3.f351422g     // Catch:{ all -> 0x00b4 }
                r3.mo159435d0(r2)     // Catch:{ all -> 0x00b4 }
                k33.q r3 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                kd0.s r3 = r3.f351416a     // Catch:{ all -> 0x00b4 }
                boolean r1 = r3.startRecord(r1)     // Catch:{ all -> 0x00b4 }
                if (r1 != 0) goto L_0x007b
                k33.q r1 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                r3 = 0
                r1.f351418c = r3     // Catch:{ all -> 0x00b4 }
                java.lang.String r1 = "MicroMsg.VoicePrintRecoder"
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
                r4.<init>()     // Catch:{ all -> 0x00b4 }
                java.lang.String r5 = "Thread Start Record  Error fileName["
                r4.append(r5)     // Catch:{ all -> 0x00b4 }
                k33.q r5 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                java.lang.String r5 = r5.f351418c     // Catch:{ all -> 0x00b4 }
                r4.append(r5)     // Catch:{ all -> 0x00b4 }
                java.lang.String r5 = "]"
                r4.append(r5)     // Catch:{ all -> 0x00b4 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r4)     // Catch:{ all -> 0x00b4 }
                k33.q r1 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                kd0.s r1 = r1.f351416a     // Catch:{ all -> 0x00b4 }
                r1.stopRecord()     // Catch:{ all -> 0x00b4 }
                k33.q r1 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                r1.f351416a = r3     // Catch:{ all -> 0x00b4 }
                j33.b r1 = r1.f351422g     // Catch:{ all -> 0x00b4 }
                r1.mo159435d0(r2)     // Catch:{ all -> 0x00b4 }
                k33.q r1 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                k33.q$b r1 = r1.f351423h     // Catch:{ all -> 0x00b4 }
                if (r1 == 0) goto L_0x0079
                com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$b r1 = (com.tencent.p014mm.plugin.voiceprint.p118ui.BaseVoicePrintUI$$b) r1     // Catch:{ all -> 0x00b4 }
                r1.mo176329a()     // Catch:{ all -> 0x00b4 }
            L_0x0079:
                monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
                return
            L_0x007b:
                k33.q r1 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                k33.q$b r1 = r1.f351423h     // Catch:{ all -> 0x00b4 }
                if (r1 == 0) goto L_0x0084
                r1.getClass()     // Catch:{ all -> 0x00b4 }
            L_0x0084:
                k33.q r1 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x00b4 }
                r1.f351419d = r2     // Catch:{ all -> 0x00b4 }
                java.lang.String r1 = "MicroMsg.VoicePrintRecoder"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b4 }
                r2.<init>()     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = "Thread Started Record fileName["
                r2.append(r3)     // Catch:{ all -> 0x00b4 }
                k33.q r3 = k33.C117381q.this     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = r3.f351418c     // Catch:{ all -> 0x00b4 }
                r2.append(r3)     // Catch:{ all -> 0x00b4 }
                java.lang.String r3 = "]"
                r2.append(r3)     // Catch:{ all -> 0x00b4 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b4 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)     // Catch:{ all -> 0x00b4 }
                monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r7.f351425d
                r1 = 1
                r0.sendEmptyMessageDelayed(r6, r1)
                return
            L_0x00b4:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00b4 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: k33.C117381q.C117384c.run():void");
        }
    }
}
