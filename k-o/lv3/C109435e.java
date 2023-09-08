package lv3;

import bs3.C104161b;
import java.util.HashMap;
import nv3.C109761b;
import nv3.C109762c;
import nv3.C109763d;

/* renamed from: lv3.e */
public final class C109435e {

    /* renamed from: f */
    public static C109435e f327571f;

    /* renamed from: a */
    public HashMap<String, C109437f> f327572a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Object> f327573b = new HashMap<>();

    /* renamed from: c */
    public Object f327574c = new Object();

    /* renamed from: d */
    public Object f327575d = new Object();

    /* renamed from: e */
    public C109436a f327576e = new C109436a(this);

    /* renamed from: lv3.e$a */
    public class C109436a {

        /* renamed from: a */
        public final Object f327577a = new Object();

        /* renamed from: b */
        public final HashMap<String, Object> f327578b = new HashMap<>();

        public C109436a(C109435e eVar) {
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0020 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo160620a(java.lang.String r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                java.lang.Object r0 = r2.f327577a
                monitor-enter(r0)
            L_0x0012:
                java.util.HashMap<java.lang.String, java.lang.Object> r1 = r2.f327578b     // Catch:{ all -> 0x002f }
                java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0028
                java.lang.Object r1 = r2.f327577a     // Catch:{ InterruptedException -> 0x0020 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0020 }
                goto L_0x0012
            L_0x0020:
                nv3.c r3 = new nv3.c     // Catch:{ all -> 0x002f }
                java.lang.String r4 = "install fail,lock interrupted!"
                r3.<init>(r4)     // Catch:{ all -> 0x002f }
                throw r3     // Catch:{ all -> 0x002f }
            L_0x0028:
                java.util.HashMap<java.lang.String, java.lang.Object> r1 = r2.f327578b     // Catch:{ all -> 0x002f }
                r1.put(r3, r4)     // Catch:{ all -> 0x002f }
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r3 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002f }
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: lv3.C109435e.C109436a.mo160620a(java.lang.String, java.lang.String):void");
        }

        /* renamed from: b */
        public void mo160621b(String str, String str2) {
            String str3 = str + str2;
            synchronized (this.f327577a) {
                this.f327578b.remove(str3);
                this.f327577a.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public static C109435e m148611b() {
        if (f327571f == null) {
            synchronized (C109435e.class) {
                if (f327571f == null) {
                    f327571f = new C109435e();
                }
            }
        }
        return f327571f;
    }

    /* renamed from: c */
    public static Object m148612c(String str) {
        Object obj;
        C109437f fVar;
        C109435e b = m148611b();
        if (str != null) {
            synchronized (b.f327575d) {
                obj = b.f327573b.get(str);
            }
            if (obj == null) {
                synchronized (b.f327574c) {
                    fVar = b.f327572a.get(str);
                }
                if (fVar != null) {
                    fVar.f327581c.getClass();
                    if (4 == fVar.f327579a) {
                        try {
                            b.mo160619e(fVar);
                        } catch (C109762c e) {
                            C104161b.m138997f("service", e);
                            return null;
                        }
                    }
                    synchronized (b.f327575d) {
                        obj = b.f327573b.get(str);
                    }
                }
            }
            return obj;
        }
        b.getClass();
        throw new C109438g("TpfServiceCenter|getService|service name should not be null");
    }

    /* renamed from: d */
    public static C109761b m148613d(C109763d dVar) {
        C109437f fVar;
        boolean z;
        C109435e b = m148611b();
        b.getClass();
        if (dVar == null) {
            return null;
        }
        b.f327576e.mo160620a("install_", "EventCenter");
        try {
            synchronized (b.f327574c) {
                fVar = b.f327572a.get("EventCenter");
                if (fVar == null) {
                    fVar = new C109437f(b, dVar);
                    fVar.f327579a = 2;
                    C104161b.m138993b("service", "service [", "EventCenter", "] installed!");
                    b.f327572a.put("EventCenter", fVar);
                    z = true;
                } else {
                    C104161b.m138993b("service", "service [", "EventCenter", "] had been installed!");
                    z = false;
                }
            }
            if (z) {
                if (dVar.f328514a != null) {
                    fVar.f327579a = 4;
                    C104161b.m138993b("service", "service [", "EventCenter", "] resolved!");
                } else {
                    throw new C109762c("resolve service [EventCenter] failed.");
                }
            }
            b.f327576e.mo160621b("install_", "EventCenter");
            return fVar;
        } catch (Throwable th) {
            b.f327576e.mo160621b("install_", "EventCenter");
            throw th;
        }
    }

    /* renamed from: a */
    public final boolean mo160618a(C109437f fVar) {
        fVar.f327581c.getClass();
        try {
            C109432b bVar = (C109432b) Class.forName(fVar.f327581c.f328514a).newInstance();
            fVar.f327582d = bVar;
            bVar.mo160617a(new C109431a(fVar));
            return true;
        } catch (Exception e) {
            C104161b.m138997f("service", e);
            return false;
        }
    }

    /* renamed from: e */
    public boolean mo160619e(C109437f fVar) {
        fVar.f327581c.getClass();
        this.f327576e.mo160620a("service_", "EventCenter");
        try {
            int i = fVar.f327579a;
            boolean z = true;
            if (i != 32) {
                if (i == 4) {
                    fVar.f327579a = 8;
                    C104161b.m138993b("service", "service [", "EventCenter", "] starting...");
                    if (mo160618a(fVar)) {
                        fVar.f327579a = 32;
                        C104161b.m138993b("service", "service [", "EventCenter", "] active...");
                    }
                }
                z = false;
            }
            if (z) {
                return z;
            }
            throw new C109762c("startService [EventCenter] failed");
        } finally {
            this.f327576e.mo160621b("service_", "EventCenter");
        }
    }
}
