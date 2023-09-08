package com.google.protobuf;

import com.google.protobuf.C23861l0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.a0 */
public class C23806a0 {

    /* renamed from: b */
    public static volatile C23806a0 f68207b;

    /* renamed from: c */
    public static final C23806a0 f68208c = new C23806a0(true);

    /* renamed from: a */
    public final Map<C23807a, C23861l0.C23866e<?, ?>> f68209a;

    /* renamed from: com.google.protobuf.a0$a */
    public static final class C23807a {

        /* renamed from: a */
        public final Object f68210a;

        /* renamed from: b */
        public final int f68211b;

        public C23807a(Object obj, int i) {
            this.f68210a = obj;
            this.f68211b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C23807a)) {
                return false;
            }
            C23807a aVar = (C23807a) obj;
            return this.f68210a == aVar.f68210a && this.f68211b == aVar.f68211b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f68210a) * 65535) + this.f68211b;
        }
    }

    public C23806a0() {
        this.f68209a = new HashMap();
    }

    /* renamed from: a */
    public static C23806a0 m28602a() {
        C23806a0 a0Var = f68207b;
        if (a0Var == null) {
            synchronized (C23806a0.class) {
                a0Var = f68207b;
                if (a0Var == null) {
                    Class<?> cls = C113389z.f339245a;
                    C23806a0 a0Var2 = null;
                    if (cls != null) {
                        try {
                            a0Var2 = (C23806a0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (a0Var2 == null) {
                        a0Var2 = f68208c;
                    }
                    f68207b = a0Var2;
                    a0Var = a0Var2;
                }
            }
        }
        return a0Var;
    }

    public C23806a0(C23806a0 a0Var) {
        if (a0Var == f68208c) {
            this.f68209a = Collections.emptyMap();
        } else {
            this.f68209a = Collections.unmodifiableMap(a0Var.f68209a);
        }
    }

    public C23806a0(boolean z) {
        this.f68209a = Collections.emptyMap();
    }
}
