package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113846jl;
import com.tencent.mapsdk.internal.C113849jm;

/* renamed from: com.tencent.mapsdk.internal.jr */
public abstract class C113856jr<D extends C113849jm> extends C113838jk<D> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static C113859b f340632a = new C113859b() {
        /* renamed from: a */
        public final String mo172237a(String str) {
            return C113853jp.m157305a(str);
        }
    };

    /* renamed from: b */
    private C113860c f340633b;

    /* renamed from: com.tencent.mapsdk.internal.jr$a */
    public enum C113858a {
        DISK,
        DB
    }

    /* renamed from: com.tencent.mapsdk.internal.jr$b */
    public interface C113859b {
        /* renamed from: a */
        String mo172237a(String str);
    }

    /* renamed from: com.tencent.mapsdk.internal.jr$c */
    public static abstract class C113860c implements C113846jl.C113847a {

        /* renamed from: i */
        public C113858a f340637i;

        /* renamed from: j */
        public int f340638j = 104857600;

        /* renamed from: k */
        public C113859b f340639k = C113856jr.f340632a;

        public C113860c(C113858a aVar) {
            this.f340637i = aVar;
        }

        /* renamed from: a */
        private C113860c m157320a(C113859b bVar) {
            this.f340639k = bVar;
            return this;
        }

        /* renamed from: b */
        private C113860c mo170963b() {
            this.f340638j = -1;
            return this;
        }

        /* renamed from: c */
        private C113858a m157322c() {
            return this.f340637i;
        }

        /* renamed from: d */
        private C113859b m157323d() {
            return this.f340639k;
        }

        public String toString() {
            return "Options{mType=" + this.f340637i + ", mCacheSize=" + this.f340638j + ", keyGenerator=" + this.f340639k + '}';
        }

        /* renamed from: a */
        public final int mo170965a() {
            return this.f340638j;
        }
    }

    public C113856jr(C113860c cVar) {
        this.f340633b = cVar;
    }

    /* renamed from: g */
    public C113860c mo170958g() {
        return this.f340633b;
    }
}
