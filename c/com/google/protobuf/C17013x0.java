package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.Set;

/* renamed from: com.google.protobuf.x0 */
public final class C17013x0 implements C16990g2 {

    /* renamed from: b */
    public static final C16992i1 f46019b = new C17014a();

    /* renamed from: a */
    public final C16992i1 f46020a;

    /* renamed from: com.google.protobuf.x0$a */
    public class C17014a implements C16992i1 {
        /* renamed from: a */
        public boolean mo18734a(Class<?> cls) {
            return false;
        }

        /* renamed from: b */
        public C23841h1 mo18735b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* renamed from: com.google.protobuf.x0$b */
    public static class C17015b implements C16992i1 {

        /* renamed from: a */
        public C16992i1[] f46021a;

        public C17015b(C16992i1... i1VarArr) {
            this.f46021a = i1VarArr;
        }

        /* renamed from: a */
        public boolean mo18734a(Class<?> cls) {
            for (C16992i1 a : this.f46021a) {
                if (a.mo18734a(cls)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public C23841h1 mo18735b(Class<?> cls) {
            for (C16992i1 i1Var : this.f46021a) {
                if (i1Var.mo18734a(cls)) {
                    return i1Var.mo18735b(cls);
                }
            }
            String name = cls.getName();
            throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
        }
    }

    public C17013x0() {
        C16992i1 i1Var;
        C16992i1[] i1VarArr = new C16992i1[2];
        i1VarArr[0] = C17002k0.f46006a;
        Class<C23927r> cls = C23927r.class;
        try {
            Set<String> set = C23927r.f68548a;
            i1Var = (C16992i1) cls.getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            i1Var = f46019b;
        }
        i1VarArr[1] = i1Var;
        C17015b bVar = new C17015b(i1VarArr);
        Charset charset = C23908o0.f68505a;
        this.f46020a = bVar;
    }
}
