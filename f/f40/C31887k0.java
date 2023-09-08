package f40;

import bp3.C79760s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import java.util.HashMap;
import java.util.List;
import p261wl.C15510f;
import p261wl.C38174i;
import zh3.C91753f;

/* renamed from: f40.k0 */
public enum C31887k0 {
    INSTANCE;
    

    /* renamed from: d */
    public final boolean[] f84959d;

    /* renamed from: e */
    public final boolean[] f84960e;

    /* renamed from: f */
    public final boolean[] f84961f;

    /* renamed from: f40.k0$a */
    public class C31888a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C38174i f84962d;

        /* renamed from: e */
        public final /* synthetic */ String f84963e;

        public C31888a(C31887k0 k0Var, C38174i iVar, String str) {
            this.f84962d = iVar;
            this.f84963e = str;
        }

        public void run() {
            C31889b bVar = (C31889b) this.f84962d.get();
            if (bVar == null) {
                Log.m105921e("MicroMsg.StorageManager", "Fail to get impl class of extendable itf: %s", C31889b.class.getName());
                return;
            }
            Log.m105925i("MicroMsg.StorageManager", "Invoke extension: %s", bVar.getClass().getName());
            try {
                C79760s.m96908a("batch-mkdir-for: " + bVar.getClass().getSimpleName());
                List<String> In = bVar.mo57874In();
                if (In != null) {
                    C31887k0.m39573a(In, this.f84963e);
                }
            } finally {
                C79760s.m96909b();
            }
        }
    }

    /* renamed from: f40.k0$b */
    public interface C31889b extends C15510f {
        /* renamed from: In */
        List<String> mo57874In();
    }

    /* renamed from: f40.k0$c */
    public interface C31890c extends C15510f {
        /* renamed from: Rg */
        HashMap<Integer, C91753f.C66827b> mo9070Rg();
    }

    /* renamed from: f40.k0$d */
    public interface C31891d extends C15510f {
        /* renamed from: Pq */
        void mo58411Pq(String str);

        void it0();
    }

    /* renamed from: a */
    public static void m39573a(List list, String str) {
        int size = list.size() + 1;
        String[] strArr = new String[size];
        strArr[0] = str;
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            strArr[i2] = str + ((String) list.get(i));
            i = i2;
        }
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            C86009m1 m1Var = new C86009m1(str2);
            if (!m1Var.mo119967g() && (!m1Var.mo119987x() || !m1Var.mo119977o())) {
                Log.m105921e("MicroMsg.StorageManager", "batchMkDirs mkdir error. %s", str2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r2.hasNext() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r0.add(((zt3.C119157j) zt3.C119157j.f356862d).mo183870a(new f40.C31887k0.C31888a(r5, (p261wl.C38174i) r2.next(), r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        bp3.C79753e.m96889a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r6 = f40.C86709a0.m107535s().f251806d;
        r0 = new java.util.ArrayList();
        r1 = (p261wl.C38166b.C38167a) p261wl.C38166b.m41759f(f40.C31887k0.C31889b.class);
        r2 = new p261wl.C38166b.C38167a.C38169b(r1, r1.f100837d.all().iterator());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58409b(android.content.Context r6) {
        /*
            r5 = this;
            boolean[] r6 = r5.f84961f
            r0 = 0
            boolean r1 = r6[r0]
            if (r1 != 0) goto L_0x005a
            monitor-enter(r6)
            boolean[] r1 = r5.f84961f     // Catch:{ all -> 0x0057 }
            boolean r2 = r1[r0]     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x0055
            r2 = 1
            r1[r0] = r2     // Catch:{ all -> 0x0057 }
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            f40.o r6 = f40.C86709a0.m107535s()
            java.lang.String r6 = r6.f251806d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<f40.k0$b> r1 = f40.C31887k0.C31889b.class
            wl.d r1 = p261wl.C38166b.m41759f(r1)
            wl.b$a r1 = (p261wl.C38166b.C38167a) r1
            wl.b$a$b r2 = new wl.b$a$b
            wl.d<T> r3 = r1.f100837d
            java.lang.Iterable r3 = r3.all()
            java.util.Iterator r3 = r3.iterator()
            r2.<init>(r1, r3)
        L_0x0034:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0051
            java.lang.Object r1 = r2.next()
            wl.i r1 = (p261wl.C38174i) r1
            zt3.t r3 = zt3.C119157j.f356862d
            f40.k0$a r4 = new f40.k0$a
            r4.<init>(r5, r1, r6)
            zt3.j r3 = (zt3.C119157j) r3
            lu3.c r1 = r3.mo183870a(r4)
            r0.add(r1)
            goto L_0x0034
        L_0x0051:
            bp3.C79753e.m96889a(r0)
            return
        L_0x0055:
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            return
        L_0x0057:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            throw r0
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.C31887k0.mo58409b(android.content.Context):void");
    }
}
