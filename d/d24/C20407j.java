package d24;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import e24.C20509c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: d24.j */
public final class C20407j {

    /* renamed from: e */
    public static final C20407j f57238e;

    /* renamed from: f */
    public static final C20407j f57239f = new C20407j(new C20408a(false));

    /* renamed from: a */
    public final boolean f57240a;

    /* renamed from: b */
    public final boolean f57241b;

    /* renamed from: c */
    public final String[] f57242c;

    /* renamed from: d */
    public final String[] f57243d;

    static {
        C20403h hVar = C20403h.f57224q;
        C20403h hVar2 = C20403h.f57225r;
        C20403h hVar3 = C20403h.f57226s;
        C20403h hVar4 = C20403h.f57227t;
        C20403h hVar5 = C20403h.f57228u;
        C20403h hVar6 = C20403h.f57218k;
        C20403h hVar7 = C20403h.f57220m;
        C20403h hVar8 = C20403h.f57219l;
        C20403h hVar9 = C20403h.f57221n;
        C20403h hVar10 = C20403h.f57223p;
        C20403h hVar11 = C20403h.f57222o;
        C20403h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11};
        C20403h[] hVarArr2 = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, C20403h.f57216i, C20403h.f57217j, C20403h.f57214g, C20403h.f57215h, C20403h.f57212e, C20403h.f57213f, C20403h.f57211d};
        C20408a aVar = new C20408a(true);
        aVar.mo31918a(hVarArr);
        C20402f0 f0Var = C20402f0.TLS_1_3;
        C20402f0 f0Var2 = C20402f0.TLS_1_2;
        aVar.mo31920c(f0Var, f0Var2);
        if (aVar.f57244a) {
            aVar.f57247d = true;
            new C20407j(aVar);
            C20408a aVar2 = new C20408a(true);
            aVar2.mo31918a(hVarArr2);
            C20402f0 f0Var3 = C20402f0.TLS_1_0;
            aVar2.mo31920c(f0Var, f0Var2, C20402f0.TLS_1_1, f0Var3);
            if (aVar2.f57244a) {
                aVar2.f57247d = true;
                f57238e = new C20407j(aVar2);
                C20408a aVar3 = new C20408a(true);
                aVar3.mo31918a(hVarArr2);
                aVar3.mo31920c(f0Var3);
                if (aVar3.f57244a) {
                    aVar3.f57247d = true;
                    new C20407j(aVar3);
                    return;
                }
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public C20407j(C20408a aVar) {
        this.f57240a = aVar.f57244a;
        this.f57242c = aVar.f57245b;
        this.f57243d = aVar.f57246c;
        this.f57241b = aVar.f57247d;
    }

    /* renamed from: a */
    public boolean mo31914a(SSLSocket sSLSocket) {
        if (!this.f57240a) {
            return false;
        }
        String[] strArr = this.f57243d;
        if (strArr != null && !C20509c.m22210p(C20509c.f57734f, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f57242c;
        return strArr2 == null || C20509c.m22210p(C20403h.f57209b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C20407j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C20407j jVar = (C20407j) obj;
        boolean z = this.f57240a;
        if (z != jVar.f57240a) {
            return false;
        }
        return !z || (Arrays.equals(this.f57242c, jVar.f57242c) && Arrays.equals(this.f57243d, jVar.f57243d) && this.f57241b == jVar.f57241b);
    }

    public int hashCode() {
        if (this.f57240a) {
            return ((((C1883v2.CTRL_INDEX + Arrays.hashCode(this.f57242c)) * 31) + Arrays.hashCode(this.f57243d)) * 31) + (this.f57241b ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        String str;
        List list;
        if (!this.f57240a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f57242c;
        List list2 = null;
        String str2 = "[all enabled]";
        if (strArr != null) {
            if (strArr != null) {
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String a : strArr) {
                    arrayList.add(C20403h.m21959a(a));
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = str2;
        }
        String[] strArr2 = this.f57243d;
        if (strArr2 != null) {
            if (strArr2 != null) {
                ArrayList arrayList2 = new ArrayList(strArr2.length);
                for (String a2 : strArr2) {
                    arrayList2.add(C20402f0.m21958a(a2));
                }
                list2 = Collections.unmodifiableList(arrayList2);
            }
            str2 = list2.toString();
        }
        return "ConnectionSpec(cipherSuites=" + str + ", tlsVersions=" + str2 + ", supportsTlsExtensions=" + this.f57241b + ")";
    }

    /* renamed from: d24.j$a */
    public static final class C20408a {

        /* renamed from: a */
        public boolean f57244a;

        /* renamed from: b */
        public String[] f57245b;

        /* renamed from: c */
        public String[] f57246c;

        /* renamed from: d */
        public boolean f57247d;

        public C20408a(boolean z) {
            this.f57244a = z;
        }

        /* renamed from: a */
        public C20408a mo31918a(C20403h... hVarArr) {
            if (this.f57244a) {
                String[] strArr = new String[hVarArr.length];
                for (int i = 0; i < hVarArr.length; i++) {
                    strArr[i] = hVarArr[i].f57229a;
                }
                mo31919b(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        /* renamed from: b */
        public C20408a mo31919b(String... strArr) {
            if (!this.f57244a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f57245b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: c */
        public C20408a mo31920c(C20402f0... f0VarArr) {
            if (this.f57244a) {
                String[] strArr = new String[f0VarArr.length];
                for (int i = 0; i < f0VarArr.length; i++) {
                    strArr[i] = f0VarArr[i].f57208d;
                }
                mo31921d(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        /* renamed from: d */
        public C20408a mo31921d(String... strArr) {
            if (!this.f57244a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f57246c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public C20408a(C20407j jVar) {
            this.f57244a = jVar.f57240a;
            this.f57245b = jVar.f57242c;
            this.f57246c = jVar.f57243d;
            this.f57247d = jVar.f57241b;
        }
    }
}
