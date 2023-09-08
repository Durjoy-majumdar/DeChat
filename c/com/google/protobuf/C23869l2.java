package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.l2 */
public final class C23869l2 implements C23841h1 {

    /* renamed from: a */
    public final C24078y1 f68406a;

    /* renamed from: b */
    public final boolean f68407b;

    /* renamed from: c */
    public final int[] f68408c;

    /* renamed from: d */
    public final C23827f0[] f68409d;

    /* renamed from: e */
    public final C23845j1 f68410e;

    /* renamed from: com.google.protobuf.l2$a */
    public static final class C23870a {

        /* renamed from: a */
        public final List<C23827f0> f68411a;

        /* renamed from: b */
        public C24078y1 f68412b;

        /* renamed from: c */
        public boolean f68413c;

        /* renamed from: d */
        public boolean f68414d;

        /* renamed from: e */
        public int[] f68415e = null;

        /* renamed from: f */
        public Object f68416f;

        public C23870a(int i) {
            this.f68411a = new ArrayList(i);
        }

        /* renamed from: a */
        public C23869l2 mo37824a() {
            if (this.f68413c) {
                throw new IllegalStateException("Builder can only build once");
            } else if (this.f68412b != null) {
                this.f68413c = true;
                Collections.sort(this.f68411a);
                return new C23869l2(this.f68412b, this.f68414d, this.f68415e, (C23827f0[]) ((ArrayList) this.f68411a).toArray(new C23827f0[0]), this.f68416f);
            } else {
                throw new IllegalStateException("Must specify a proto syntax");
            }
        }

        /* renamed from: b */
        public void mo37825b(C23827f0 f0Var) {
            if (!this.f68413c) {
                ((ArrayList) this.f68411a).add(f0Var);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }
    }

    public C23869l2(C24078y1 y1Var, boolean z, int[] iArr, C23827f0[] f0VarArr, Object obj) {
        this.f68406a = y1Var;
        this.f68407b = z;
        this.f68408c = iArr;
        this.f68409d = f0VarArr;
        Charset charset = C23908o0.f68505a;
        if (obj != null) {
            this.f68410e = (C23845j1) obj;
            return;
        }
        throw new NullPointerException("defaultInstance");
    }

    /* renamed from: a */
    public boolean mo37517a() {
        return this.f68407b;
    }

    /* renamed from: b */
    public C23845j1 mo37518b() {
        return this.f68410e;
    }

    /* renamed from: c */
    public C24078y1 mo37519c() {
        return this.f68406a;
    }
}
