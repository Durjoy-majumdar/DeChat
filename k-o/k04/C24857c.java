package k04;

import d04.C24442a;
import gy3.C8480h;
import j04.C24771q;
import l04.C24893h;
import m04.C24980n;
import qz3.C26049m;
import rz3.C110670a;
import ty3.C26331b;
import vz3.C22826c;
import wy3.C26448e0;

/* renamed from: k04.c */
public final class C24857c extends C24771q implements C26331b {

    /* renamed from: s */
    public static final C24858a f70843s = new C24858a((C8480h) null);

    /* renamed from: k04.c$a */
    public static final class C24858a {
        public C24858a(C8480h hVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
            r11 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
            cy3.C58003b.m67160a(r13, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
            throw r11;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final k04.C24857c mo51861a(vz3.C22826c r10, m04.C24980n r11, wy3.C26448e0 r12, java.io.InputStream r13, boolean r14) {
            /*
                r9 = this;
                java.lang.String r0 = "fqName"
                gy3.C87412m.m108594g(r10, r0)
                java.lang.String r0 = "storageManager"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.String r0 = "module"
                gy3.C87412m.m108594g(r12, r0)
                java.lang.String r0 = "inputStream"
                gy3.C87412m.m108594g(r13, r0)
                rz3.a$a r0 = rz3.C110670a.f331079f     // Catch:{ all -> 0x004c }
                rz3.a r6 = r0.mo162238a(r13)     // Catch:{ all -> 0x004c }
                rz3.a r0 = rz3.C110670a.f331080g     // Catch:{ all -> 0x004c }
                boolean r1 = r6.mo162404b(r0)     // Catch:{ all -> 0x004c }
                r2 = 0
                if (r1 == 0) goto L_0x004e
                xz3.f r1 = new xz3.f     // Catch:{ all -> 0x004c }
                r1.<init>()     // Catch:{ all -> 0x004c }
                rz3.C26155b.m33575a(r1)     // Catch:{ all -> 0x004c }
                xz3.r<qz3.m> r3 = qz3.C26049m.f72678q     // Catch:{ all -> 0x004c }
                xz3.b r3 = (xz3.C26585b) r3     // Catch:{ all -> 0x004c }
                r3.getClass()     // Catch:{ all -> 0x004c }
                xz3.d r4 = new xz3.d     // Catch:{ all -> 0x004c }
                r4.<init>(r13)     // Catch:{ all -> 0x004c }
                java.lang.Object r1 = r3.mo52860a(r4, r1)     // Catch:{ all -> 0x004c }
                xz3.p r1 = (xz3.C26607p) r1     // Catch:{ all -> 0x004c }
                r5 = 0
                r4.mo53517a(r5)     // Catch:{ j -> 0x0048 }
                r3.mo53515b(r1)     // Catch:{ all -> 0x004c }
                qz3.m r1 = (qz3.C26049m) r1     // Catch:{ all -> 0x004c }
                r5 = r1
                goto L_0x004f
            L_0x0048:
                r10 = move-exception
                r10.f74023d = r1     // Catch:{ all -> 0x004c }
                throw r10     // Catch:{ all -> 0x004c }
            L_0x004c:
                r10 = move-exception
                goto L_0x0084
            L_0x004e:
                r5 = r2
            L_0x004f:
                cy3.C58003b.m67160a(r13, r2)
                if (r5 == 0) goto L_0x0060
                k04.c r13 = new k04.c
                r8 = 0
                r1 = r13
                r2 = r10
                r3 = r11
                r4 = r12
                r7 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r13
            L_0x0060:
                java.lang.UnsupportedOperationException r10 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "Kotlin built-in definition format version is not supported: expected "
                r11.append(r12)
                r11.append(r0)
                java.lang.String r12 = ", actual "
                r11.append(r12)
                r11.append(r6)
                java.lang.String r12 = ". Please update Kotlin"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                r10.<init>(r11)
                throw r10
            L_0x0084:
                throw r10     // Catch:{ all -> 0x0085 }
            L_0x0085:
                r11 = move-exception
                cy3.C58003b.m67160a(r13, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: k04.C24857c.C24858a.mo51861a(vz3.c, m04.n, wy3.e0, java.io.InputStream, boolean):k04.c");
        }
    }

    public C24857c(C22826c cVar, C24980n nVar, C26448e0 e0Var, C26049m mVar, C110670a aVar, boolean z, C8480h hVar) {
        super(cVar, nVar, e0Var, mVar, aVar, (C24893h) null);
    }

    public String toString() {
        return "builtins package fragment for " + this.f74328h + " from " + C24442a.m30543j(this);
    }
}
