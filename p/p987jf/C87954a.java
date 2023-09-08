package p987jf;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import com.tencent.matrix.lifecycle.C28654a;
import com.tencent.matrix.resource.C80530h;
import com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p269xe.C91184f;
import p723vf.C118672d;
import p937cf.C80018a;
import p982if.C87719c;
import p987jf.C87958b;

/* renamed from: jf.a */
public class C87954a extends C91184f {

    /* renamed from: s */
    public static final long f254525s = TimeUnit.DAYS.toMillis(1);

    /* renamed from: g */
    public final C80530h f254526g;

    /* renamed from: h */
    public final C87958b f254527h;

    /* renamed from: i */
    public final int f254528i;

    /* renamed from: j */
    public final long f254529j;

    /* renamed from: k */
    public final long f254530k;

    /* renamed from: l */
    public final Handler f254531l;

    /* renamed from: m */
    public final ConcurrentLinkedQueue<DestroyedActivityInfo> f254532m;

    /* renamed from: n */
    public final C87719c f254533n;

    /* renamed from: o */
    public final C80018a.C80020b f254534o;

    /* renamed from: p */
    public final Application.ActivityLifecycleCallbacks f254535p = new C87955a();

    /* renamed from: q */
    public final C87958b.C87960b f254536q = new C87957b();

    /* renamed from: r */
    public long f254537r = 0;

    /* renamed from: jf.a$a */
    public class C87955a extends C28654a {

        /* renamed from: jf.a$a$a */
        public class C87956a implements Runnable {
            public C87956a() {
            }

            public void run() {
                C87954a.this.mo122416c();
            }
        }

        public C87955a() {
        }

        public void onActivityDestroyed(Activity activity) {
            C87954a aVar = C87954a.this;
            aVar.getClass();
            String name = activity.getClass().getName();
            C80018a.C80020b bVar = aVar.f254534o;
            if (bVar == C80018a.C80020b.NO_DUMP || bVar == C80018a.C80020b.AUTO_DUMP) {
                aVar.f254526g.f235548h.getClass();
                if (aVar.mo125241a(name)) {
                    C118672d.m167353c("Matrix.ActivityRefWatcher", "activity leak with name %s had published, just ignore", name);
                    C87954a.this.f254531l.postDelayed(new C87956a(), 2000);
                }
            }
            UUID randomUUID = UUID.randomUUID();
            aVar.f254532m.add(new DestroyedActivityInfo("MATRIX_RESCANARY_REFKEY_" + name + "@" + activity.hashCode() + '_' + Long.toHexString(randomUUID.getMostSignificantBits()) + Long.toHexString(randomUUID.getLeastSignificantBits()), activity, name));
            synchronized (aVar.f254532m) {
                aVar.f254532m.notifyAll();
            }
            C118672d.m167351a("Matrix.ActivityRefWatcher", "mDestroyedActivityInfos add %s", name);
            C87954a.this.f254531l.postDelayed(new C87956a(), 2000);
        }
    }

    /* renamed from: jf.a$b */
    public class C87957b implements C87958b.C87960b {
        public C87957b() {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87954a(android.app.Application r8, com.tencent.matrix.resource.C80530h r9) {
        /*
            r7 = this;
            long r2 = f254525s
            r9.getClass()
            java.lang.String r4 = "memory"
            r0 = r7
            r1 = r8
            r5 = r9
            r0.<init>(r1, r2, r4, r5)
            jf.a$a r8 = new jf.a$a
            r8.<init>()
            r7.f254535p = r8
            jf.a$b r8 = new jf.a$b
            r8.<init>()
            r7.f254536q = r8
            r0 = 0
            r7.f254537r = r0
            r7.f254526g = r9
            cf.a r8 = r9.f235548h
            java.lang.String r0 = "matrix_res"
            r1 = 5
            android.os.HandlerThread r0 = p723vf.C90778c.m113845c(r0, r1)
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r0.getLooper()
            r1.<init>(r2)
            r7.f254531l = r1
            cf.a$b r1 = r8.f234432b
            r7.f254534o = r1
            ur3.a r2 = r8.f234431a
            long r3 = p937cf.C80018a.f234429g
            com.tencent.mm.matrix.l r2 = (com.tencent.p014mm.matrix.C80993l) r2
            java.lang.String r5 = "clicfg_matrix_resource_detect_interval_millis_bg"
            java.lang.String r6 = ""
            java.lang.String r2 = r2.mo112815b(r5, r6)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r5 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r2, r3)
        L_0x0052:
            r7.f254529j = r3
            long r2 = r8.mo110261a()
            r7.f254530k = r2
            jf.b r2 = new jf.b
            long r3 = r8.mo110261a()
            r2.<init>(r3, r0)
            r7.f254527h = r2
            ur3.a r8 = r8.f234431a
            com.tencent.mm.matrix.l r8 = (com.tencent.p014mm.matrix.C80993l) r8
            r0 = 10
            java.lang.String r2 = "clicfg_matrix_resource_max_detect_times"
            int r8 = r8.mo112814a(r2, r0)
            r7.f254528i = r8
            int r8 = r1.ordinal()
            switch(r8) {
                case 1: goto L_0x00a2;
                case 2: goto L_0x0098;
                case 3: goto L_0x0092;
                case 4: goto L_0x008c;
                case 5: goto L_0x0086;
                case 6: goto L_0x0080;
                default: goto L_0x007a;
            }
        L_0x007a:
            if.h r8 = new if.h
            r8.<init>(r7)
            goto L_0x00a7
        L_0x0080:
            if.e r8 = new if.e
            r8.<init>(r7)
            goto L_0x00a7
        L_0x0086:
            com.tencent.matrix.resource.processor.a r8 = new com.tencent.matrix.resource.processor.a
            r8.<init>(r7)
            goto L_0x00a7
        L_0x008c:
            if.d r8 = new if.d
            r8.<init>(r7)
            goto L_0x00a7
        L_0x0092:
            if.j r8 = new if.j
            r8.<init>(r7)
            goto L_0x00a7
        L_0x0098:
            if.f r8 = new if.f
            cf.a r9 = r9.f235548h
            java.lang.String r9 = r9.f234433c
            r8.<init>(r7, r9)
            goto L_0x00a7
        L_0x00a2:
            if.a r8 = new if.a
            r8.<init>(r7)
        L_0x00a7:
            r7.f254533n = r8
            java.util.concurrent.ConcurrentLinkedQueue r8 = new java.util.concurrent.ConcurrentLinkedQueue
            r8.<init>()
            r7.f254532m = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p987jf.C87954a.<init>(android.app.Application, com.tencent.matrix.resource.h):void");
    }

    /* renamed from: c */
    public void mo122416c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f254534o != C80018a.C80020b.NO_DUMP || currentTimeMillis - this.f254537r >= (this.f254526g.f235548h.mo110261a() / 2) - 100) {
            this.f254537r = currentTimeMillis;
            C118672d.m167355e("Matrix.ActivityRefWatcher", "triggering gc...", new Object[0]);
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                C118672d.m167354d("Matrix.ActivityRefWatcher", e, "", new Object[0]);
            }
            Runtime.getRuntime().runFinalization();
            C118672d.m167355e("Matrix.ActivityRefWatcher", "gc was triggered.", new Object[0]);
            return;
        }
        C118672d.m167355e("Matrix.ActivityRefWatcher", "skip triggering gc for frequency", new Object[0]);
    }
}
