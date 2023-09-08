package ry3;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C45984j0;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import rx3.C13598b0;
import ry3.C26121e;
import sx3.C110821n;
import sx3.C110823p;
import sx3.C64197v;

/* renamed from: ry3.f */
public abstract class C26123f<M extends Member> implements C26121e<M> {

    /* renamed from: a */
    public final M f73056a;

    /* renamed from: b */
    public final Type f73057b;

    /* renamed from: c */
    public final Class<?> f73058c;

    /* renamed from: d */
    public final List<Type> f73059d;

    /* renamed from: ry3.f$a */
    public static final class C26124a extends C26123f<Constructor<?>> implements C26120d {

        /* renamed from: e */
        public final Object f73060e;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26124a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                gy3.C87412m.m108593f(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                gy3.C87412m.m108593f(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0026
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = sx3.C110821n.m150967n(r0, r2, r1)
            L_0x0026:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f73060e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26124a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            C26121e.C26122a.m33553a(this, objArr);
            C45984j0 j0Var = new C45984j0(3);
            j0Var.mo71372a(this.f73060e);
            j0Var.mo71373b(objArr);
            j0Var.mo71372a((Object) null);
            return ((Constructor) this.f73056a).newInstance(j0Var.mo71375d(new Object[j0Var.mo71374c()]));
        }
    }

    /* renamed from: ry3.f$b */
    public static final class C26125b extends C26123f<Constructor<?>> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26125b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                gy3.C87412m.m108593f(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                gy3.C87412m.m108593f(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0025
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = sx3.C110821n.m150967n(r0, r2, r1)
            L_0x0025:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26125b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            C26121e.C26122a.m33553a(this, objArr);
            C45984j0 j0Var = new C45984j0(2);
            j0Var.mo71373b(objArr);
            j0Var.mo71372a((Object) null);
            return ((Constructor) this.f73056a).newInstance(j0Var.mo71375d(new Object[j0Var.mo71374c()]));
        }
    }

    /* renamed from: ry3.f$c */
    public static final class C26126c extends C26123f<Constructor<?>> implements C26120d {

        /* renamed from: e */
        public final Object f73061e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26126c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                gy3.C87412m.m108593f(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                gy3.C87412m.m108593f(r5, r0)
                r4 = 0
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f73061e = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26126c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            C26121e.C26122a.m33553a(this, objArr);
            C45984j0 j0Var = new C45984j0(2);
            j0Var.mo71372a(this.f73061e);
            j0Var.mo71373b(objArr);
            return ((Constructor) this.f73056a).newInstance(j0Var.mo71375d(new Object[j0Var.mo71374c()]));
        }
    }

    /* renamed from: ry3.f$d */
    public static final class C26127d extends C26123f<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26127d(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                gy3.C87412m.m108593f(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0024
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0024
                r4 = r1
                goto L_0x0026
            L_0x0024:
                r0 = 0
                r4 = r0
            L_0x0026:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                gy3.C87412m.m108593f(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26127d.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            C26121e.C26122a.m33553a(this, objArr);
            return ((Constructor) this.f73056a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: ry3.f$e */
    public static abstract class C26128e extends C26123f<Field> {

        /* renamed from: ry3.f$e$a */
        public static final class C26129a extends C26128e implements C26120d {

            /* renamed from: e */
            public final Object f73062e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26129a(Field field, Object obj) {
                super(field, false, (C8480h) null);
                C87412m.m108594g(field, "field");
                this.f73062e = obj;
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                return ((Field) this.f73056a).get(this.f73062e);
            }
        }

        /* renamed from: ry3.f$e$b */
        public static final class C26130b extends C26128e implements C26120d {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26130b(Field field) {
                super(field, false, (C8480h) null);
                C87412m.m108594g(field, "field");
            }
        }

        /* renamed from: ry3.f$e$c */
        public static final class C26131c extends C26128e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26131c(Field field) {
                super(field, true, (C8480h) null);
                C87412m.m108594g(field, "field");
            }
        }

        /* renamed from: ry3.f$e$d */
        public static final class C26132d extends C26128e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26132d(Field field) {
                super(field, true, (C8480h) null);
                C87412m.m108594g(field, "field");
            }

            /* renamed from: c */
            public void mo53058c(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                mo53059d(C110823p.m150978D(objArr));
            }
        }

        /* renamed from: ry3.f$e$e */
        public static final class C26133e extends C26128e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26133e(Field field) {
                super(field, false, (C8480h) null);
                C87412m.m108594g(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26128e(java.lang.reflect.Field r7, boolean r8, gy3.C8480h r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r9 = "field.genericType"
                gy3.C87412m.m108593f(r2, r9)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r8 = new java.lang.reflect.Type[r8]
                r4 = r8
                java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26128e.<init>(java.lang.reflect.Field, boolean, gy3.h):void");
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            mo53058c(objArr);
            return ((Field) this.f73056a).get(this.f73058c != null ? C110823p.m150976B(objArr) : null);
        }
    }

    /* renamed from: ry3.f$f */
    public static abstract class C26134f extends C26123f<Field> {

        /* renamed from: e */
        public final boolean f73063e;

        /* renamed from: ry3.f$f$a */
        public static final class C26135a extends C26134f implements C26120d {

            /* renamed from: f */
            public final Object f73064f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26135a(Field field, boolean z, Object obj) {
                super(field, z, false, (C8480h) null);
                C87412m.m108594g(field, "field");
                this.f73064f = obj;
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                mo53058c(objArr);
                ((Field) this.f73056a).set(this.f73064f, C110823p.m150976B(objArr));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ry3.f$f$b */
        public static final class C26136b extends C26134f implements C26120d {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26136b(Field field, boolean z) {
                super(field, z, false, (C8480h) null);
                C87412m.m108594g(field, "field");
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                mo53058c(objArr);
                ((Field) this.f73056a).set((Object) null, C110823p.m150989O(objArr));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: ry3.f$f$c */
        public static final class C26137c extends C26134f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26137c(Field field, boolean z) {
                super(field, z, true, (C8480h) null);
                C87412m.m108594g(field, "field");
            }
        }

        /* renamed from: ry3.f$f$d */
        public static final class C26138d extends C26134f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26138d(Field field, boolean z) {
                super(field, z, true, (C8480h) null);
                C87412m.m108594g(field, "field");
            }

            /* renamed from: c */
            public void mo53058c(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                super.mo53058c(objArr);
                mo53059d(C110823p.m150978D(objArr));
            }
        }

        /* renamed from: ry3.f$f$e */
        public static final class C26139e extends C26134f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26139e(Field field, boolean z) {
                super(field, z, false, (C8480h) null);
                C87412m.m108594g(field, "field");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26134f(java.lang.reflect.Field r7, boolean r8, boolean r9, gy3.C8480h r10) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r10 = "TYPE"
                gy3.C87412m.m108593f(r2, r10)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r10 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                gy3.C87412m.m108593f(r10, r0)
                r4[r9] = r10
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f73063e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26134f.<init>(java.lang.reflect.Field, boolean, boolean, gy3.h):void");
        }

        /* renamed from: c */
        public void mo53058c(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            C26121e.C26122a.m33553a(this, objArr);
            if (this.f73063e && C110823p.m150989O(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        public Object call(Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            mo53058c(objArr);
            ((Field) this.f73056a).set(this.f73058c != null ? C110823p.m150976B(objArr) : null, C110823p.m150989O(objArr));
            return C13598b0.f38549a;
        }
    }

    public C26123f(Member member, Type type, Class cls, Type[] typeArr, C8480h hVar) {
        List<Type> list;
        this.f73056a = member;
        this.f73057b = type;
        this.f73058c = cls;
        if (cls != null) {
            C45984j0 j0Var = new C45984j0(2);
            j0Var.mo71372a(cls);
            j0Var.mo71373b(typeArr);
            list = C64197v.m75537f(j0Var.mo71375d(new Type[j0Var.mo71374c()]));
        } else {
            list = C110823p.m151001a0(typeArr);
        }
        this.f73059d = list;
    }

    /* renamed from: a */
    public List<Type> mo53054a() {
        return this.f73059d;
    }

    /* renamed from: b */
    public final M mo53055b() {
        return this.f73056a;
    }

    /* renamed from: c */
    public void mo53058c(Object[] objArr) {
        C26121e.C26122a.m33553a(this, objArr);
    }

    /* renamed from: d */
    public final void mo53059d(Object obj) {
        if (obj == null || !this.f73056a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Type getReturnType() {
        return this.f73057b;
    }

    /* renamed from: ry3.f$g */
    public static abstract class C26140g extends C26123f<Method> {

        /* renamed from: e */
        public final boolean f73065e;

        /* renamed from: ry3.f$g$a */
        public static final class C26141a extends C26140g implements C26120d {

            /* renamed from: f */
            public final Object f73066f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26141a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4, (C8480h) null);
                C87412m.m108594g(method, FirebaseAnalytics.C113379b.METHOD);
                this.f73066f = obj;
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                return mo53060e(this.f73066f, objArr);
            }
        }

        /* renamed from: ry3.f$g$b */
        public static final class C26142b extends C26140g implements C26120d {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26142b(Method method) {
                super(method, false, (Type[]) null, 4, (C8480h) null);
                C87412m.m108594g(method, FirebaseAnalytics.C113379b.METHOD);
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                return mo53060e((Object) null, objArr);
            }
        }

        /* renamed from: ry3.f$g$c */
        public static final class C26143c extends C26140g implements C26120d {

            /* renamed from: f */
            public final Object f73067f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C26143c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    gy3.C87412m.m108594g(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    gy3.C87412m.m108593f(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = sx3.C110821n.m150967n(r0, r2, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r3, r0, r1)
                    r4.f73067f = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26140g.C26143c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                C45984j0 j0Var = new C45984j0(2);
                j0Var.mo71372a(this.f73067f);
                j0Var.mo71373b(objArr);
                return mo53060e((Object) null, j0Var.mo71375d(new Object[j0Var.mo71374c()]));
            }
        }

        /* renamed from: ry3.f$g$d */
        public static final class C26144d extends C26140g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26144d(Method method) {
                super(method, false, (Type[]) null, 6, (C8480h) null);
                C87412m.m108594g(method, FirebaseAnalytics.C113379b.METHOD);
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                return mo53060e(objArr[0], objArr.length <= 1 ? new Object[0] : C110821n.m150967n(objArr, 1, objArr.length));
            }
        }

        /* renamed from: ry3.f$g$e */
        public static final class C26145e extends C26140g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26145e(Method method) {
                super(method, true, (Type[]) null, 4, (C8480h) null);
                C87412m.m108594g(method, FirebaseAnalytics.C113379b.METHOD);
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                mo53059d(C110823p.m150978D(objArr));
                return mo53060e((Object) null, objArr.length <= 1 ? new Object[0] : C110821n.m150967n(objArr, 1, objArr.length));
            }
        }

        /* renamed from: ry3.f$g$f */
        public static final class C26146f extends C26140g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C26146f(Method method) {
                super(method, false, (Type[]) null, 6, (C8480h) null);
                C87412m.m108594g(method, FirebaseAnalytics.C113379b.METHOD);
            }

            public Object call(Object[] objArr) {
                C87412m.m108594g(objArr, "args");
                C26121e.C26122a.m33553a(this, objArr);
                return mo53060e((Object) null, objArr);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C26140g(java.lang.reflect.Method r1, boolean r2, java.lang.reflect.Type[] r3, int r4, gy3.C8480h r5) {
            /*
                r0 = this;
                r5 = r4 & 2
                if (r5 == 0) goto L_0x000e
                int r2 = r1.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r2 = r2 ^ 1
            L_0x000e:
                r4 = r4 & 4
                if (r4 == 0) goto L_0x001b
                java.lang.reflect.Type[] r3 = r1.getGenericParameterTypes()
                java.lang.String r4 = "method.genericParameterTypes"
                gy3.C87412m.m108593f(r3, r4)
            L_0x001b:
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26140g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int, gy3.h):void");
        }

        /* renamed from: e */
        public final Object mo53060e(Object obj, Object[] objArr) {
            C87412m.m108594g(objArr, "args");
            return this.f73065e ? C13598b0.f38549a : ((Method) this.f73056a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26140g(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9, gy3.C8480h r10) {
            /*
                r6 = this;
                java.lang.reflect.Type r10 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                gy3.C87412m.m108593f(r10, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r10
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.Class r7 = java.lang.Void.TYPE
                boolean r7 = gy3.C87412m.m108589b(r10, r7)
                r6.f73065e = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ry3.C26123f.C26140g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], gy3.h):void");
        }
    }
}
