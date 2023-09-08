package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.protobuf.z1 */
public final class C24086z1 {

    /* renamed from: c */
    public static final C24086z1 f69225c = new C24086z1();

    /* renamed from: a */
    public final C16990g2 f69226a = new C17013x0();

    /* renamed from: b */
    public final ConcurrentMap<Class<?>, C23828f2<?>> f69227b = new ConcurrentHashMap();

    /* renamed from: a */
    public <T> C23828f2<T> mo38436a(Class<T> cls) {
        C23828f2 f2Var;
        C23828f2 f2Var2;
        C23828f2 f2Var3;
        Class<?> cls2;
        C24078y1 y1Var = C24078y1.PROTO2;
        Charset charset = C23908o0.f68505a;
        if (cls != null) {
            C23828f2<T> f2Var4 = (C23828f2) ((ConcurrentHashMap) this.f69227b).get(cls);
            if (f2Var4 != null) {
                return f2Var4;
            }
            C17013x0 x0Var = (C17013x0) this.f69226a;
            x0Var.getClass();
            Class<C23861l0> cls3 = C23861l0.class;
            Class<?> cls4 = C23842h2.f68331a;
            if (cls3.isAssignableFrom(cls) || (cls2 = C23842h2.f68331a) == null || cls2.isAssignableFrom(cls)) {
                C23841h1 b = x0Var.f46020a.mo18735b(cls);
                if (b.mo37517a()) {
                    if (cls3.isAssignableFrom(cls)) {
                        f2Var3 = new C23924p1(C23842h2.f68334d, C23820e0.f68222a, b.mo37518b());
                    } else {
                        C23937r2<?, ?> r2Var = C23842h2.f68332b;
                        C23812b0<?> b0Var = C23820e0.f68223b;
                        if (b0Var != null) {
                            f2Var3 = new C23924p1(r2Var, b0Var, b.mo37518b());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    f2Var = f2Var3;
                } else {
                    boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                    boolean z = true;
                    if (isAssignableFrom) {
                        if (b.mo37519c() != y1Var) {
                            z = false;
                        }
                        f2Var2 = z ? C23920o1.m29436y(cls, b, C24049u1.f69169b, C24054v0.f69181b, C23842h2.f68334d, C23820e0.f68222a, C16989f1.f45996b) : C23920o1.m29436y(cls, b, C24049u1.f69169b, C24054v0.f69181b, C23842h2.f68334d, (C23812b0<?>) null, C16989f1.f45996b);
                    } else {
                        if (b.mo37519c() != y1Var) {
                            z = false;
                        }
                        if (z) {
                            C23936r1 r1Var = C24049u1.f69168a;
                            C24054v0 v0Var = C24054v0.f69180a;
                            C23937r2<?, ?> r2Var2 = C23842h2.f68332b;
                            C23812b0<?> b0Var2 = C23820e0.f68223b;
                            if (b0Var2 != null) {
                                f2Var2 = C23920o1.m29436y(cls, b, r1Var, v0Var, r2Var2, b0Var2, C16989f1.f45995a);
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            f2Var2 = C23920o1.m29436y(cls, b, C24049u1.f69168a, C24054v0.f69180a, C23842h2.f68333c, (C23812b0<?>) null, C16989f1.f45995a);
                        }
                    }
                    f2Var = f2Var2;
                }
                C23828f2<T> f2Var5 = (C23828f2) ((ConcurrentHashMap) this.f69227b).putIfAbsent(cls, f2Var);
                return f2Var5 != null ? f2Var5 : f2Var;
            }
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        throw new NullPointerException("messageType");
    }
}
