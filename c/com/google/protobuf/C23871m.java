package com.google.protobuf;

import com.google.protobuf.C24087z2;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.protobuf.m */
public final class C23871m implements C23819d2 {

    /* renamed from: a */
    public final C23856l f68417a;

    /* renamed from: b */
    public int f68418b;

    /* renamed from: c */
    public int f68419c;

    /* renamed from: d */
    public int f68420d = 0;

    public C23871m(C23856l lVar) {
        Charset charset = C23908o0.f68505a;
        if (lVar != null) {
            this.f68417a = lVar;
            lVar.f68362d = this;
            return;
        }
        throw new NullPointerException("input");
    }

    /* renamed from: A */
    public long mo37533A() {
        mo37831V(0);
        return this.f68417a.mo37759H();
    }

    /* renamed from: B */
    public void mo37534B(List<Integer> list) {
        int F;
        int F2;
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            int i = this.f68418b & 7;
            if (i == 2) {
                int G = this.f68417a.mo37758G();
                mo37832W(G);
                int e = this.f68417a.mo37763e() + G;
                do {
                    n0Var.mo37933h(this.f68417a.mo37771p());
                } while (this.f68417a.mo37763e() < e);
            } else if (i == 5) {
                do {
                    n0Var.mo37933h(this.f68417a.mo37771p());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 2) {
                int G2 = this.f68417a.mo37758G();
                mo37832W(G2);
                int e2 = this.f68417a.mo37763e() + G2;
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37771p()));
                } while (this.f68417a.mo37763e() < e2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37771p()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: C */
    public int mo37535C() {
        int i = this.f68420d;
        if (i != 0) {
            this.f68418b = i;
            this.f68420d = 0;
        } else {
            this.f68418b = this.f68417a.mo37757F();
        }
        int i2 = this.f68418b;
        if (i2 == 0 || i2 == this.f68419c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: D */
    public void mo37536D(List<String> list) {
        mo37829T(list, false);
    }

    /* renamed from: E */
    public void mo37537E(List<Float> list) {
        int F;
        int F2;
        if (list instanceof C23843i0) {
            C23843i0 i0Var = (C23843i0) list;
            int i = this.f68418b & 7;
            if (i == 2) {
                int G = this.f68417a.mo37758G();
                mo37832W(G);
                int e = this.f68417a.mo37763e() + G;
                do {
                    i0Var.mo37694h(this.f68417a.mo37773r());
                } while (this.f68417a.mo37763e() < e);
            } else if (i == 5) {
                do {
                    i0Var.mo37694h(this.f68417a.mo37773r());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 2) {
                int G2 = this.f68417a.mo37758G();
                mo37832W(G2);
                int e2 = this.f68417a.mo37763e() + G2;
                do {
                    list.add(Float.valueOf(this.f68417a.mo37773r()));
                } while (this.f68417a.mo37763e() < e2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f68417a.mo37773r()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: F */
    public void mo37538F(List<C16994k> list) {
        int F;
        if ((this.f68418b & 7) == 2) {
            do {
                list.add(mo37577z());
                if (!this.f68417a.mo37764f()) {
                    F = this.f68417a.mo37757F();
                } else {
                    return;
                }
            } while (F == this.f68418b);
            this.f68420d = F;
            return;
        }
        throw C23922p0.m29479d();
    }

    /* renamed from: G */
    public void mo37539G(List<Double> list) {
        int F;
        int F2;
        if (list instanceof C24047u) {
            C24047u uVar = (C24047u) list;
            int i = this.f68418b & 7;
            if (i == 1) {
                do {
                    uVar.mo38368h(this.f68417a.mo37769n());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int G = this.f68417a.mo37758G();
                mo37833X(G);
                int e = this.f68417a.mo37763e() + G;
                do {
                    uVar.mo38368h(this.f68417a.mo37769n());
                } while (this.f68417a.mo37763e() < e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f68417a.mo37769n()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int G2 = this.f68417a.mo37758G();
                mo37833X(G2);
                int e2 = this.f68417a.mo37763e() + G2;
                do {
                    list.add(Double.valueOf(this.f68417a.mo37769n()));
                } while (this.f68417a.mo37763e() < e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: H */
    public long mo37540H() {
        mo37831V(1);
        return this.f68417a.mo37772q();
    }

    /* renamed from: I */
    public void mo37541I(List<Integer> list) {
        int F;
        int F2;
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            int i = this.f68418b & 7;
            if (i == 2) {
                int G = this.f68417a.mo37758G();
                mo37832W(G);
                int e = this.f68417a.mo37763e() + G;
                do {
                    n0Var.mo37933h(this.f68417a.mo37780z());
                } while (this.f68417a.mo37763e() < e);
            } else if (i == 5) {
                do {
                    n0Var.mo37933h(this.f68417a.mo37780z());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 2) {
                int G2 = this.f68417a.mo37758G();
                mo37832W(G2);
                int e2 = this.f68417a.mo37763e() + G2;
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37780z()));
                } while (this.f68417a.mo37763e() < e2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37780z()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: J */
    public <T> void mo37542J(List<T> list, C23828f2<T> f2Var, C23806a0 a0Var) {
        int F;
        int i = this.f68418b;
        if ((i & 7) == 3) {
            do {
                list.add(mo37827R(f2Var, a0Var));
                if (!this.f68417a.mo37764f() && this.f68420d == 0) {
                    F = this.f68417a.mo37757F();
                } else {
                    return;
                }
            } while (F == i);
            this.f68420d = F;
            return;
        }
        throw C23922p0.m29479d();
    }

    /* renamed from: K */
    public void mo37543K(List<Long> list) {
        int F;
        int F2;
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    w0Var.mo38392h(this.f68417a.mo37776u());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    w0Var.mo38392h(this.f68417a.mo37776u());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f68417a.mo37776u()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Long.valueOf(this.f68417a.mo37776u()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: L */
    public void mo37544L(List<Integer> list) {
        int F;
        int F2;
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    n0Var.mo37933h(this.f68417a.mo37770o());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    n0Var.mo37933h(this.f68417a.mo37770o());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37770o()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37770o()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: M */
    public void mo37545M(List<Integer> list) {
        int F;
        int F2;
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    n0Var.mo37933h(this.f68417a.mo37758G());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    n0Var.mo37933h(this.f68417a.mo37758G());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37758G()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37758G()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: N */
    public long mo37546N() {
        mo37831V(0);
        return this.f68417a.mo37754C();
    }

    /* renamed from: O */
    public int mo37547O() {
        mo37831V(5);
        return this.f68417a.mo37780z();
    }

    /* renamed from: P */
    public String mo37548P() {
        mo37831V(2);
        return this.f68417a.mo37756E();
    }

    /* renamed from: Q */
    public final Object mo37826Q(C24087z2.C24089b bVar, Class<?> cls, C23806a0 a0Var) {
        switch (bVar.ordinal()) {
            case 0:
                return Double.valueOf(readDouble());
            case 1:
                return Float.valueOf(readFloat());
            case 2:
                return Long.valueOf(mo37559j());
            case 3:
                return Long.valueOf(mo37533A());
            case 4:
                return Integer.valueOf(mo37565p());
            case 5:
                return Long.valueOf(mo37540H());
            case 6:
                return Integer.valueOf(mo37570s());
            case 7:
                return Boolean.valueOf(mo37560k());
            case 8:
                return mo37548P();
            case 10:
                return mo37567r(cls, a0Var);
            case 11:
                return mo37577z();
            case 12:
                return Integer.valueOf(mo37549a());
            case 13:
                return Integer.valueOf(mo37550b());
            case 14:
                return Integer.valueOf(mo37547O());
            case 15:
                return Long.valueOf(mo37574w());
            case 16:
                return Integer.valueOf(mo37575x());
            case 17:
                return Long.valueOf(mo37546N());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: R */
    public final <T> T mo37827R(C23828f2<T> f2Var, C23806a0 a0Var) {
        int i = this.f68419c;
        this.f68419c = ((this.f68418b >>> 3) << 3) | 4;
        try {
            T g = f2Var.mo37616g();
            f2Var.mo37617h(g, this, a0Var);
            f2Var.mo37613e(g);
            if (this.f68418b == this.f68419c) {
                return g;
            }
            throw C23922p0.m29482g();
        } finally {
            this.f68419c = i;
        }
    }

    /* renamed from: S */
    public final <T> T mo37828S(C23828f2<T> f2Var, C23806a0 a0Var) {
        int G = this.f68417a.mo37758G();
        C23856l lVar = this.f68417a;
        if (lVar.f68359a < lVar.f68360b) {
            int k = lVar.mo37766k(G);
            T g = f2Var.mo37616g();
            this.f68417a.f68359a++;
            f2Var.mo37617h(g, this, a0Var);
            f2Var.mo37613e(g);
            this.f68417a.mo37761a(0);
            C23856l lVar2 = this.f68417a;
            lVar2.f68359a--;
            lVar2.mo37765j(k);
            return g;
        }
        throw C23922p0.m29483h();
    }

    /* renamed from: T */
    public void mo37829T(List<String> list, boolean z) {
        int F;
        int F2;
        if ((this.f68418b & 7) != 2) {
            throw C23922p0.m29479d();
        } else if (!(list instanceof C24048u0) || z) {
            do {
                list.add(z ? mo37548P() : mo37571t());
                if (!this.f68417a.mo37764f()) {
                    F = this.f68417a.mo37757F();
                } else {
                    return;
                }
            } while (F == this.f68418b);
            this.f68420d = F;
        } else {
            C24048u0 u0Var = (C24048u0) list;
            do {
                u0Var.mo38353g(mo37577z());
                if (!this.f68417a.mo37764f()) {
                    F2 = this.f68417a.mo37757F();
                } else {
                    return;
                }
            } while (F2 == this.f68418b);
            this.f68420d = F2;
        }
    }

    /* renamed from: U */
    public final void mo37830U(int i) {
        if (this.f68417a.mo37763e() != i) {
            throw C23922p0.m29484i();
        }
    }

    /* renamed from: V */
    public final void mo37831V(int i) {
        if ((this.f68418b & 7) != i) {
            throw C23922p0.m29479d();
        }
    }

    /* renamed from: W */
    public final void mo37832W(int i) {
        if ((i & 3) != 0) {
            throw C23922p0.m29482g();
        }
    }

    /* renamed from: X */
    public final void mo37833X(int i) {
        if ((i & 7) != 0) {
            throw C23922p0.m29482g();
        }
    }

    /* renamed from: a */
    public int mo37549a() {
        mo37831V(0);
        return this.f68417a.mo37758G();
    }

    /* renamed from: b */
    public int mo37550b() {
        mo37831V(0);
        return this.f68417a.mo37770o();
    }

    /* renamed from: c */
    public void mo37551c(List<Boolean> list) {
        int F;
        int F2;
        if (list instanceof C23838h) {
            C23838h hVar = (C23838h) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    hVar.mo37681h(this.f68417a.mo37767l());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    hVar.mo37681h(this.f68417a.mo37767l());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f68417a.mo37767l()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Boolean.valueOf(this.f68417a.mo37767l()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: d */
    public void mo37552d(List<Integer> list) {
        int F;
        int F2;
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    n0Var.mo37933h(this.f68417a.mo37753B());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    n0Var.mo37933h(this.f68417a.mo37753B());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37753B()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37753B()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: e */
    public <T> T mo37553e(C23828f2<T> f2Var, C23806a0 a0Var) {
        mo37831V(3);
        return mo37827R(f2Var, a0Var);
    }

    /* renamed from: f */
    public void mo37554f(List<Long> list) {
        int F;
        int F2;
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            int i = this.f68418b & 7;
            if (i == 1) {
                do {
                    w0Var.mo38392h(this.f68417a.mo37752A());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int G = this.f68417a.mo37758G();
                mo37833X(G);
                int e = this.f68417a.mo37763e() + G;
                do {
                    w0Var.mo38392h(this.f68417a.mo37752A());
                } while (this.f68417a.mo37763e() < e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f68417a.mo37752A()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int G2 = this.f68417a.mo37758G();
                mo37833X(G2);
                int e2 = this.f68417a.mo37763e() + G2;
                do {
                    list.add(Long.valueOf(this.f68417a.mo37752A()));
                } while (this.f68417a.mo37763e() < e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: g */
    public void mo37555g(List<Integer> list) {
        int F;
        int F2;
        if (list instanceof C23901n0) {
            C23901n0 n0Var = (C23901n0) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    n0Var.mo37933h(this.f68417a.mo37775t());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    n0Var.mo37933h(this.f68417a.mo37775t());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37775t()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Integer.valueOf(this.f68417a.mo37775t()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    public int getTag() {
        return this.f68418b;
    }

    /* renamed from: h */
    public boolean mo37557h() {
        this.f68417a.getClass();
        return false;
    }

    /* renamed from: i */
    public boolean mo37558i() {
        int i;
        if (this.f68417a.mo37764f() || (i = this.f68418b) == this.f68419c) {
            return false;
        }
        return this.f68417a.mo37760I(i);
    }

    /* renamed from: j */
    public long mo37559j() {
        mo37831V(0);
        return this.f68417a.mo37776u();
    }

    /* renamed from: k */
    public boolean mo37560k() {
        mo37831V(0);
        return this.f68417a.mo37767l();
    }

    /* renamed from: l */
    public <T> void mo37561l(List<T> list, C23828f2<T> f2Var, C23806a0 a0Var) {
        int F;
        int i = this.f68418b;
        if ((i & 7) == 2) {
            do {
                list.add(mo37828S(f2Var, a0Var));
                if (!this.f68417a.mo37764f() && this.f68420d == 0) {
                    F = this.f68417a.mo37757F();
                } else {
                    return;
                }
            } while (F == i);
            this.f68420d = F;
            return;
        }
        throw C23922p0.m29479d();
    }

    /* renamed from: m */
    public void mo37562m(List<Long> list) {
        int F;
        int F2;
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    w0Var.mo38392h(this.f68417a.mo37759H());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    w0Var.mo38392h(this.f68417a.mo37759H());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f68417a.mo37759H()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Long.valueOf(this.f68417a.mo37759H()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: n */
    public <T> T mo37563n(Class<T> cls, C23806a0 a0Var) {
        mo37831V(3);
        return mo37827R(C24086z1.f69225c.mo38436a(cls), a0Var);
    }

    /* renamed from: o */
    public void mo37564o(List<String> list) {
        mo37829T(list, true);
    }

    /* renamed from: p */
    public int mo37565p() {
        mo37831V(0);
        return this.f68417a.mo37775t();
    }

    /* renamed from: q */
    public void mo37566q(List<Long> list) {
        int F;
        int F2;
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            int i = this.f68418b & 7;
            if (i == 1) {
                do {
                    w0Var.mo38392h(this.f68417a.mo37772q());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int G = this.f68417a.mo37758G();
                mo37833X(G);
                int e = this.f68417a.mo37763e() + G;
                do {
                    w0Var.mo38392h(this.f68417a.mo37772q());
                } while (this.f68417a.mo37763e() < e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f68417a.mo37772q()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int G2 = this.f68417a.mo37758G();
                mo37833X(G2);
                int e2 = this.f68417a.mo37763e() + G2;
                do {
                    list.add(Long.valueOf(this.f68417a.mo37772q()));
                } while (this.f68417a.mo37763e() < e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: r */
    public <T> T mo37567r(Class<T> cls, C23806a0 a0Var) {
        mo37831V(2);
        return mo37828S(C24086z1.f69225c.mo38436a(cls), a0Var);
    }

    public double readDouble() {
        mo37831V(1);
        return this.f68417a.mo37769n();
    }

    public float readFloat() {
        mo37831V(5);
        return this.f68417a.mo37773r();
    }

    /* renamed from: s */
    public int mo37570s() {
        mo37831V(5);
        return this.f68417a.mo37771p();
    }

    /* renamed from: t */
    public String mo37571t() {
        mo37831V(2);
        return this.f68417a.mo37755D();
    }

    /* renamed from: u */
    public <T> T mo37572u(C23828f2<T> f2Var, C23806a0 a0Var) {
        mo37831V(2);
        return mo37828S(f2Var, a0Var);
    }

    /* renamed from: v */
    public void mo37573v(List<Long> list) {
        int F;
        int F2;
        if (list instanceof C24061w0) {
            C24061w0 w0Var = (C24061w0) list;
            int i = this.f68418b & 7;
            if (i == 0) {
                do {
                    w0Var.mo38392h(this.f68417a.mo37754C());
                    if (!this.f68417a.mo37764f()) {
                        F2 = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F2 == this.f68418b);
                this.f68420d = F2;
            } else if (i == 2) {
                int e = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    w0Var.mo38392h(this.f68417a.mo37754C());
                } while (this.f68417a.mo37763e() < e);
                mo37830U(e);
            } else {
                throw C23922p0.m29479d();
            }
        } else {
            int i2 = this.f68418b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f68417a.mo37754C()));
                    if (!this.f68417a.mo37764f()) {
                        F = this.f68417a.mo37757F();
                    } else {
                        return;
                    }
                } while (F == this.f68418b);
                this.f68420d = F;
            } else if (i2 == 2) {
                int e2 = this.f68417a.mo37763e() + this.f68417a.mo37758G();
                do {
                    list.add(Long.valueOf(this.f68417a.mo37754C()));
                } while (this.f68417a.mo37763e() < e2);
                mo37830U(e2);
            } else {
                throw C23922p0.m29479d();
            }
        }
    }

    /* renamed from: w */
    public long mo37574w() {
        mo37831V(1);
        return this.f68417a.mo37752A();
    }

    /* renamed from: x */
    public int mo37575x() {
        mo37831V(0);
        return this.f68417a.mo37753B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo37558i() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.C23922p0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo37576y(java.util.Map<K, V> r8, com.google.protobuf.C24084z0.C24085a<K, V> r9, com.google.protobuf.C23806a0 r10) {
        /*
            r7 = this;
            r0 = 2
            r7.mo37831V(r0)
            com.google.protobuf.l r1 = r7.f68417a
            int r1 = r1.mo37758G()
            com.google.protobuf.l r2 = r7.f68417a
            int r1 = r2.mo37766k(r1)
            K r2 = r9.f69222b
            V r3 = r9.f69224d
        L_0x0014:
            int r4 = r7.mo37535C()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.l r5 = r7.f68417a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo37764f()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo37558i()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.p0 r4 = new com.google.protobuf.p0     // Catch:{ a -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            com.google.protobuf.z2$b r4 = r9.f69223c     // Catch:{ a -> 0x004f }
            V r5 = r9.f69224d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.mo37826Q(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.z2$b r4 = r9.f69221a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.mo37826Q(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo37558i()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.p0 r8 = new com.google.protobuf.p0     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.l r8 = r7.f68417a
            r8.mo37765j(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.l r9 = r7.f68417a
            r9.mo37765j(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23871m.mo37576y(java.util.Map, com.google.protobuf.z0$a, com.google.protobuf.a0):void");
    }

    /* renamed from: z */
    public C16994k mo37577z() {
        mo37831V(2);
        return this.f68417a.mo37768m();
    }
}
