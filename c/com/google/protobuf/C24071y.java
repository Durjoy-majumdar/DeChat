package com.google.protobuf;

import com.google.protobuf.C24025t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.y */
public class C24071y extends C23806a0 {

    /* renamed from: h */
    public static final C24071y f69198h = new C24071y(true);

    /* renamed from: d */
    public final Map<String, C24073b> f69199d;

    /* renamed from: e */
    public final Map<String, C24073b> f69200e;

    /* renamed from: f */
    public final Map<C24072a, C24073b> f69201f;

    /* renamed from: g */
    public final Map<C24072a, C24073b> f69202g;

    /* renamed from: com.google.protobuf.y$a */
    public static final class C24072a {

        /* renamed from: a */
        public final C24025t.C24027b f69203a;

        /* renamed from: b */
        public final int f69204b;

        public C24072a(C24025t.C24027b bVar, int i) {
            this.f69203a = bVar;
            this.f69204b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C24072a)) {
                return false;
            }
            C24072a aVar = (C24072a) obj;
            return this.f69203a == aVar.f69203a && this.f69204b == aVar.f69204b;
        }

        public int hashCode() {
            return (this.f69203a.hashCode() * 65535) + this.f69204b;
        }
    }

    /* renamed from: com.google.protobuf.y$b */
    public static final class C24073b {
    }

    public C24071y() {
        new HashMap();
        new HashMap();
        this.f69201f = new HashMap();
        new HashMap();
    }

    public C24071y(boolean z) {
        super(C23806a0.f68208c);
        this.f69199d = Collections.emptyMap();
        this.f69200e = Collections.emptyMap();
        this.f69201f = Collections.emptyMap();
        this.f69202g = Collections.emptyMap();
    }
}
