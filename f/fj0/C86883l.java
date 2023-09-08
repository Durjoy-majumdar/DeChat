package fj0;

import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.xweb.file.XVFSFile;
import fj0.C86887m;
import hj0.C87533c;
import hj0.C87534d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fj0.l */
public class C86883l {

    /* renamed from: a */
    public String f252184a;

    /* renamed from: b */
    public int f252185b;

    /* renamed from: c */
    public Map<String, C87533c> f252186c = new HashMap();

    /* renamed from: d */
    public Map<String, C87533c> f252187d = new HashMap();

    /* renamed from: e */
    public C86885b f252188e = new C86884a();

    /* renamed from: fj0.l$a */
    public class C86884a implements C86885b {
        public C86884a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: hj0.c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: hj0.c} */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
            return true;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo121339a(hj0.C87534d r9) {
            /*
                r8 = this;
                java.lang.Class<fj0.l$b> r0 = fj0.C86883l.C86885b.class
                monitor-enter(r0)
                hj0.b r1 = r9.f253593a     // Catch:{ all -> 0x0063 }
                java.lang.String r2 = "SID"
                java.lang.String r1 = r1.mo122001a(r2)     // Catch:{ all -> 0x0063 }
                r2 = 0
                java.lang.String r3 = r9.f253591c     // Catch:{ all -> 0x0063 }
                r4 = -1
                int r5 = r3.hashCode()     // Catch:{ all -> 0x0063 }
                r6 = -2006516997(0xffffffff8866fafb, float:-6.9508133E-34)
                r7 = 1
                if (r5 == r6) goto L_0x002a
                r6 = -1725405015(0xffffffff992868a9, float:-8.706532E-24)
                if (r5 == r6) goto L_0x001f
                goto L_0x0033
            L_0x001f:
                java.lang.String r5 = "rdcEvent"
                boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0063 }
                if (r3 == 0) goto L_0x0033
                r4 = 1
                goto L_0x0033
            L_0x002a:
                java.lang.String r5 = "avtEvent"
                boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x0063 }
                if (r3 == 0) goto L_0x0033
                r4 = 0
            L_0x0033:
                if (r4 == 0) goto L_0x0046
                if (r4 == r7) goto L_0x0038
                goto L_0x0053
            L_0x0038:
                fj0.l r2 = fj0.C86883l.this     // Catch:{ all -> 0x0063 }
                java.util.Map<java.lang.String, hj0.c> r2 = r2.f252187d     // Catch:{ all -> 0x0063 }
                java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x0063 }
                java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0063 }
                r2 = r1
                hj0.c r2 = (hj0.C87533c) r2     // Catch:{ all -> 0x0063 }
                goto L_0x0053
            L_0x0046:
                fj0.l r2 = fj0.C86883l.this     // Catch:{ all -> 0x0063 }
                java.util.Map<java.lang.String, hj0.c> r2 = r2.f252186c     // Catch:{ all -> 0x0063 }
                java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x0063 }
                java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0063 }
                r2 = r1
                hj0.c r2 = (hj0.C87533c) r2     // Catch:{ all -> 0x0063 }
            L_0x0053:
                if (r2 == 0) goto L_0x0061
                gj0.b r1 = r2.f253590b     // Catch:{ all -> 0x0063 }
                if (r1 == 0) goto L_0x0061
                ej0.c r1 = (ej0.C86525c) r1     // Catch:{ all -> 0x0063 }
                boolean r9 = r1.mo121000b(r9)     // Catch:{ all -> 0x0063 }
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return r9
            L_0x0061:
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                return r7
            L_0x0063:
                r9 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0063 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: fj0.C86883l.C86884a.mo121339a(hj0.d):boolean");
        }
    }

    /* renamed from: fj0.l$b */
    public interface C86885b {
        /* renamed from: a */
        boolean mo121339a(C87534d dVar);
    }

    /* renamed from: fj0.l$c */
    public static class C86886c {

        /* renamed from: a */
        public static C86883l f252190a = new C86883l((C86879h) null);
    }

    public C86883l(C86879h hVar) {
    }

    /* renamed from: a */
    public boolean mo121336a() {
        C86887m mVar = C86887m.C86891d.f252199a;
        mVar.f252195e = null;
        synchronized (mVar) {
            if (mVar.f252191a) {
                mVar.f252191a = false;
                ServerSocket serverSocket = mVar.f252194d;
                if (serverSocket != null && serverSocket.isClosed()) {
                    try {
                        mVar.f252194d.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        ((HashMap) this.f252186c).clear();
        ((HashMap) this.f252187d).clear();
        return true;
    }

    /* renamed from: b */
    public boolean mo121337b() {
        C86887m mVar = C86887m.C86891d.f252199a;
        mVar.f252195e = this.f252188e;
        synchronized (mVar) {
            if (!mVar.f252191a) {
                mVar.f252191a = true;
                try {
                    String b = C86897p.m107913b();
                    mVar.f252192b = b;
                    ServerSocket serverSocket = new ServerSocket(0, 32, InetAddress.getByName(b));
                    mVar.f252194d = serverSocket;
                    mVar.f252193c = serverSocket.getLocalPort();
                    Thread thread = new Thread(new C86887m.C86890c());
                    thread.setName("DLNA-Server-Thread");
                    thread.start();
                } catch (IOException unused) {
                }
            }
        }
        this.f252184a = mVar.f252192b;
        this.f252185b = mVar.f252193c;
        return true;
    }

    /* renamed from: c */
    public final String mo121338c(String str) {
        return HttpWrapperBase.PROTOCAL_HTTP + this.f252184a + XVFSFile.PATH_SEPARATOR + this.f252185b + str;
    }
}
