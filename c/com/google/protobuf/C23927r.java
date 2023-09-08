package com.google.protobuf;

import com.google.protobuf.C23839h0;
import com.google.protobuf.C23869l2;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24025t;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.r */
public final class C23927r implements C16992i1 {

    /* renamed from: a */
    public static final Set<String> f68548a = new HashSet(Arrays.asList(new String[]{"cached_size", "serialized_size", "class"}));

    /* renamed from: b */
    public static C23928a f68549b = new C23928a();

    /* renamed from: com.google.protobuf.r$a */
    public static class C23928a {

        /* renamed from: a */
        public final Map<C24025t.C24027b, Boolean> f68550a = new ConcurrentHashMap();

        /* renamed from: b */
        public int f68551b = 0;

        /* renamed from: c */
        public final Stack<C23929a> f68552c = new Stack<>();

        /* renamed from: d */
        public final Map<C24025t.C24027b, C23929a> f68553d = new HashMap();

        /* renamed from: com.google.protobuf.r$a$a */
        public static class C23929a {

            /* renamed from: a */
            public final C24025t.C24027b f68554a;

            /* renamed from: b */
            public final int f68555b;

            /* renamed from: c */
            public int f68556c;

            /* renamed from: d */
            public C23930b f68557d = null;

            public C23929a(C24025t.C24027b bVar, int i) {
                this.f68554a = bVar;
                this.f68555b = i;
                this.f68556c = i;
            }
        }

        /* renamed from: com.google.protobuf.r$a$b */
        public static class C23930b {

            /* renamed from: a */
            public final List<C24025t.C24027b> f68558a = new ArrayList();

            /* renamed from: b */
            public boolean f68559b = false;

            public C23930b(C23921p pVar) {
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e3, code lost:
            r3 = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.protobuf.C23927r.C23928a.C23929a mo38015a(com.google.protobuf.C24025t.C24027b r8) {
            /*
                r7 = this;
                com.google.protobuf.r$a$a r0 = new com.google.protobuf.r$a$a
                int r1 = r7.f68551b
                int r2 = r1 + 1
                r7.f68551b = r2
                r0.<init>(r8, r1)
                java.util.Stack<com.google.protobuf.r$a$a> r1 = r7.f68552c
                r1.push(r0)
                java.util.Map<com.google.protobuf.t$b, com.google.protobuf.r$a$a> r1 = r7.f68553d
                java.util.HashMap r1 = (java.util.HashMap) r1
                r1.put(r8, r0)
                java.util.List r8 = r8.mo38319h()
                java.util.Iterator r8 = r8.iterator()
            L_0x001f:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L_0x0065
                java.lang.Object r1 = r8.next()
                com.google.protobuf.t$g r1 = (com.google.protobuf.C24025t.C24035g) r1
                com.google.protobuf.t$g$b r2 = r1.f69109j
                com.google.protobuf.t$g$a r2 = r2.f69132d
                com.google.protobuf.t$g$a r3 = com.google.protobuf.C24025t.C24035g.C24036a.MESSAGE
                if (r2 != r3) goto L_0x001f
                java.util.Map<com.google.protobuf.t$b, com.google.protobuf.r$a$a> r2 = r7.f68553d
                com.google.protobuf.t$b r3 = r1.mo38339h()
                java.util.HashMap r2 = (java.util.HashMap) r2
                java.lang.Object r2 = r2.get(r3)
                com.google.protobuf.r$a$a r2 = (com.google.protobuf.C23927r.C23928a.C23929a) r2
                if (r2 != 0) goto L_0x0056
                com.google.protobuf.t$b r1 = r1.mo38339h()
                com.google.protobuf.r$a$a r1 = r7.mo38015a(r1)
                int r2 = r0.f68556c
                int r1 = r1.f68556c
                int r1 = java.lang.Math.min(r2, r1)
                r0.f68556c = r1
                goto L_0x001f
            L_0x0056:
                com.google.protobuf.r$a$b r1 = r2.f68557d
                if (r1 != 0) goto L_0x001f
                int r1 = r0.f68556c
                int r2 = r2.f68556c
                int r1 = java.lang.Math.min(r1, r2)
                r0.f68556c = r1
                goto L_0x001f
            L_0x0065:
                int r8 = r0.f68555b
                int r1 = r0.f68556c
                if (r8 != r1) goto L_0x0108
                com.google.protobuf.r$a$b r8 = new com.google.protobuf.r$a$b
                r1 = 0
                r8.<init>(r1)
            L_0x0071:
                java.util.Stack<com.google.protobuf.r$a$a> r1 = r7.f68552c
                java.lang.Object r1 = r1.pop()
                com.google.protobuf.r$a$a r1 = (com.google.protobuf.C23927r.C23928a.C23929a) r1
                r1.f68557d = r8
                java.util.List<com.google.protobuf.t$b> r2 = r8.f68558a
                com.google.protobuf.t$b r3 = r1.f68554a
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.add(r3)
                if (r1 != r0) goto L_0x0071
                java.util.List<com.google.protobuf.t$b> r1 = r8.f68558a
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x008e:
                boolean r2 = r1.hasNext()
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x00e4
                java.lang.Object r2 = r1.next()
                com.google.protobuf.t$b r2 = (com.google.protobuf.C24025t.C24027b) r2
                com.google.protobuf.s$b r5 = r2.f69069d
                java.util.List<com.google.protobuf.s$b$c> r5 = r5.f68621j
                int r5 = r5.size()
                if (r5 == 0) goto L_0x00a7
                r3 = 1
            L_0x00a7:
                if (r3 == 0) goto L_0x00aa
                goto L_0x00e3
            L_0x00aa:
                java.util.List r2 = r2.mo38319h()
                java.util.Iterator r2 = r2.iterator()
            L_0x00b2:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x008e
                java.lang.Object r3 = r2.next()
                com.google.protobuf.t$g r3 = (com.google.protobuf.C24025t.C24035g) r3
                boolean r5 = r3.mo38343l()
                if (r5 == 0) goto L_0x00c5
                goto L_0x00e3
            L_0x00c5:
                com.google.protobuf.t$g$b r5 = r3.f69109j
                com.google.protobuf.t$g$a r5 = r5.f69132d
                com.google.protobuf.t$g$a r6 = com.google.protobuf.C24025t.C24035g.C24036a.MESSAGE
                if (r5 != r6) goto L_0x00b2
                java.util.Map<com.google.protobuf.t$b, com.google.protobuf.r$a$a> r5 = r7.f68553d
                com.google.protobuf.t$b r3 = r3.mo38339h()
                java.util.HashMap r5 = (java.util.HashMap) r5
                java.lang.Object r3 = r5.get(r3)
                com.google.protobuf.r$a$a r3 = (com.google.protobuf.C23927r.C23928a.C23929a) r3
                com.google.protobuf.r$a$b r3 = r3.f68557d
                if (r3 == r8) goto L_0x00b2
                boolean r3 = r3.f68559b
                if (r3 == 0) goto L_0x00b2
            L_0x00e3:
                r3 = 1
            L_0x00e4:
                r8.f68559b = r3
                java.util.List<com.google.protobuf.t$b> r1 = r8.f68558a
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x00ee:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0108
                java.lang.Object r2 = r1.next()
                com.google.protobuf.t$b r2 = (com.google.protobuf.C24025t.C24027b) r2
                java.util.Map<com.google.protobuf.t$b, java.lang.Boolean> r3 = r7.f68550a
                boolean r4 = r8.f68559b
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
                r3.put(r2, r4)
                goto L_0x00ee
            L_0x0108:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23927r.C23928a.mo38015a(com.google.protobuf.t$b):com.google.protobuf.r$a$a");
        }
    }

    /* renamed from: com.google.protobuf.r$b */
    public static final class C23931b {

        /* renamed from: a */
        public C24058v1[] f68560a = new C24058v1[2];

        public C23931b(C23921p pVar) {
        }
    }

    static {
        new C23927r();
    }

    /* renamed from: c */
    public static C23827f0 m29495c(Class<?> cls, C24025t.C24035g gVar, C23931b bVar, boolean z, C23908o0.C23913e eVar) {
        C24058v1 v1Var;
        Class cls2;
        Class<?> cls3 = cls;
        C24025t.C24035g gVar2 = gVar;
        C23931b bVar2 = bVar;
        C24025t.C24042k kVar = gVar2.f69112p;
        bVar.getClass();
        int i = kVar.f69146d;
        C24058v1[] v1VarArr = bVar2.f68560a;
        if (i >= v1VarArr.length) {
            bVar2.f68560a = (C24058v1[]) Arrays.copyOf(v1VarArr, i * 2);
        }
        C24058v1 v1Var2 = bVar2.f68560a[i];
        if (v1Var2 == null) {
            String k = m29503k(kVar.getName());
            C24058v1 v1Var3 = new C24058v1(kVar.f69146d, m29498f(cls3, String.valueOf(k).concat("Case_")), m29498f(cls3, String.valueOf(k).concat("_")));
            bVar2.f68560a[i] = v1Var3;
            v1Var = v1Var3;
        } else {
            v1Var = v1Var2;
        }
        C23839h0 h = m29500h(gVar);
        boolean z2 = false;
        switch (h.f68322d.ordinal()) {
            case 1:
            case 8:
                cls2 = Integer.class;
                break;
            case 2:
                cls2 = Long.class;
                break;
            case 3:
                cls2 = Float.class;
                break;
            case 4:
                cls2 = Double.class;
                break;
            case 5:
                cls2 = Boolean.class;
                break;
            case 6:
                cls2 = String.class;
                break;
            case 7:
                cls2 = C16994k.class;
                break;
            case 9:
                try {
                    cls2 = cls3.getDeclaredMethod(m29502j(gVar2.f69109j == C24025t.C24035g.C24037b.GROUP ? gVar.mo38339h().getName() : gVar.getName()), new Class[0]).getReturnType();
                    break;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                String valueOf = String.valueOf(h);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Invalid type for oneof: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
        Class cls4 = cls2;
        int i2 = gVar2.f69104e.f68739f;
        C23827f0.m28758a(i2);
        Charset charset = C23908o0.f68505a;
        if (cls4 != null) {
            if (h.f68324f == C23839h0.C23840a.SCALAR) {
                z2 = true;
            }
            if (z2) {
                return new C23827f0((Field) null, i2, h, (Class<?>) null, (Field) null, 0, false, z, v1Var, cls4, (Object) null, eVar, (Field) null);
            }
            String valueOf2 = String.valueOf(h);
            StringBuilder sb4 = new StringBuilder(valueOf2.length() + 72);
            sb4.append("Oneof is only supported for scalar fields. Field ");
            sb4.append(i2);
            sb4.append(" is of type ");
            sb4.append(valueOf2);
            throw new IllegalArgumentException(sb4.toString());
        }
        throw new NullPointerException("oneofStoredType");
    }

    /* renamed from: d */
    public static Field m29496d(Class<?> cls, C24025t.C24035g gVar) {
        return m29498f(cls, String.valueOf(m29503k(gVar.getName())).concat("MemoizedSerializedSize"));
    }

    /* renamed from: e */
    public static Field m29497e(Class<?> cls, C24025t.C24035g gVar) {
        String name = gVar.f69109j == C24025t.C24035g.C24037b.GROUP ? gVar.mo38339h().getName() : gVar.getName();
        String str = ((HashSet) f68548a).contains(name) ? "__" : "_";
        String valueOf = String.valueOf(m29503k(name));
        return m29498f(cls, str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
    }

    /* renamed from: f */
    public static Field m29498f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + name.length());
            sb.append("Unable to find field ");
            sb.append(str);
            sb.append(" in message class ");
            sb.append(name);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: g */
    public static C23836g1 m29499g(Class<?> cls) {
        try {
            return (C23836g1) cls.getDeclaredMethod("getDefaultInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unable to get default instance for message class ".concat(name) : new String("Unable to get default instance for message class "), e);
        }
    }

    /* renamed from: h */
    public static C23839h0 m29500h(C24025t.C24035g gVar) {
        switch (gVar.f69109j.ordinal()) {
            case 0:
                return !gVar.mo37662E0() ? C23839h0.DOUBLE : gVar.mo37666T0() ? C23839h0.DOUBLE_LIST_PACKED : C23839h0.DOUBLE_LIST;
            case 1:
                return !gVar.mo37662E0() ? C23839h0.FLOAT : gVar.mo37666T0() ? C23839h0.FLOAT_LIST_PACKED : C23839h0.FLOAT_LIST;
            case 2:
                return !gVar.mo37662E0() ? C23839h0.INT64 : gVar.mo37666T0() ? C23839h0.INT64_LIST_PACKED : C23839h0.INT64_LIST;
            case 3:
                return !gVar.mo37662E0() ? C23839h0.UINT64 : gVar.mo37666T0() ? C23839h0.UINT64_LIST_PACKED : C23839h0.UINT64_LIST;
            case 4:
                return !gVar.mo37662E0() ? C23839h0.INT32 : gVar.mo37666T0() ? C23839h0.INT32_LIST_PACKED : C23839h0.INT32_LIST;
            case 5:
                return !gVar.mo37662E0() ? C23839h0.FIXED64 : gVar.mo37666T0() ? C23839h0.FIXED64_LIST_PACKED : C23839h0.FIXED64_LIST;
            case 6:
                return !gVar.mo37662E0() ? C23839h0.FIXED32 : gVar.mo37666T0() ? C23839h0.FIXED32_LIST_PACKED : C23839h0.FIXED32_LIST;
            case 7:
                return !gVar.mo37662E0() ? C23839h0.BOOL : gVar.mo37666T0() ? C23839h0.BOOL_LIST_PACKED : C23839h0.BOOL_LIST;
            case 8:
                return gVar.mo37662E0() ? C23839h0.STRING_LIST : C23839h0.STRING;
            case 9:
                return gVar.mo37662E0() ? C23839h0.GROUP_LIST : C23839h0.GROUP;
            case 10:
                return gVar.mo38341j() ? C23839h0.MAP : gVar.mo37662E0() ? C23839h0.MESSAGE_LIST : C23839h0.MESSAGE;
            case 11:
                return gVar.mo37662E0() ? C23839h0.BYTES_LIST : C23839h0.BYTES;
            case 12:
                return !gVar.mo37662E0() ? C23839h0.UINT32 : gVar.mo37666T0() ? C23839h0.UINT32_LIST_PACKED : C23839h0.UINT32_LIST;
            case 13:
                return !gVar.mo37662E0() ? C23839h0.ENUM : gVar.mo37666T0() ? C23839h0.ENUM_LIST_PACKED : C23839h0.ENUM_LIST;
            case 14:
                return !gVar.mo37662E0() ? C23839h0.SFIXED32 : gVar.mo37666T0() ? C23839h0.SFIXED32_LIST_PACKED : C23839h0.SFIXED32_LIST;
            case 15:
                return !gVar.mo37662E0() ? C23839h0.SFIXED64 : gVar.mo37666T0() ? C23839h0.SFIXED64_LIST_PACKED : C23839h0.SFIXED64_LIST;
            case 16:
                return !gVar.mo37662E0() ? C23839h0.SINT32 : gVar.mo37666T0() ? C23839h0.SINT32_LIST_PACKED : C23839h0.SINT32_LIST;
            case 17:
                return !gVar.mo37662E0() ? C23839h0.SINT64 : gVar.mo37666T0() ? C23839h0.SINT64_LIST_PACKED : C23839h0.SINT64_LIST;
            default:
                String valueOf = String.valueOf(gVar.f69109j);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Unsupported field type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: i */
    public static Class<?> m29501i(Class<?> cls, C24025t.C24035g gVar) {
        try {
            return cls.getDeclaredMethod(m29502j(gVar.f69109j == C24025t.C24035g.C24037b.GROUP ? gVar.mo38339h().getName() : gVar.getName()), new Class[]{Integer.TYPE}).getReturnType();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public static String m29502j(String str) {
        String k = m29503k(str);
        return "get" + Character.toUpperCase(k.charAt(0)) + k.substring(1, k.length());
    }

    /* renamed from: k */
    public static String m29503k(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '_') {
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                } else {
                    if (z) {
                        sb.append(Character.toUpperCase(charAt));
                        z = false;
                    } else if (i == 0) {
                        sb.append(Character.toLowerCase(charAt));
                    } else {
                        sb.append(charAt);
                    }
                }
            }
            z = true;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo18734a(Class<?> cls) {
        return C23872m0.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public C23841h1 mo18735b(Class<?> cls) {
        boolean z;
        int i;
        int i2;
        Field field;
        Class<?> cls2 = cls;
        if (!C23872m0.class.isAssignableFrom(cls2)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        C24025t.C24027b descriptorForType = m29499g(cls).getDescriptorForType();
        int ordinal = descriptorForType.f69071f.mo38348h().ordinal();
        int i3 = 2;
        if (ordinal == 1) {
            List<C24025t.C24035g> h = descriptorForType.mo38319h();
            C23869l2.C23870a aVar = new C23869l2.C23870a(h.size());
            aVar.f68416f = m29499g(cls);
            C24078y1 y1Var = C24078y1.PROTO2;
            Charset charset = C23908o0.f68505a;
            aVar.f68412b = y1Var;
            aVar.f68414d = descriptorForType.mo38322k().f68909f;
            C23931b bVar = new C23931b((C23921p) null);
            Field field2 = null;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (i4 < h.size()) {
                C24025t.C24035g gVar = h.get(i4);
                boolean z2 = gVar.f69106g.f69133d.mo38156a().f68864j;
                C24025t.C24035g.C24036a aVar2 = gVar.f69109j.f69132d;
                C24025t.C24035g.C24036a aVar3 = C24025t.C24035g.C24036a.ENUM;
                C23908o0.C23913e pVar = aVar2 == aVar3 ? new C23921p(gVar) : null;
                if (gVar.f69112p != null) {
                    aVar.mo37825b(m29495c(cls2, gVar, bVar, z2, pVar));
                    i = i5;
                    i2 = i6;
                } else {
                    Field e = m29497e(cls2, gVar);
                    int i7 = gVar.f69104e.f68739f;
                    C23839h0 h2 = m29500h(gVar);
                    if (gVar.mo38341j()) {
                        C24025t.C24035g g = gVar.mo38339h().mo38317g(i3);
                        if (g.f69109j.f69132d == aVar3) {
                            pVar = new C23925q(g);
                        }
                        aVar.mo37825b(C23827f0.m28760c(e, i7, C23842h2.m28882B(cls2, gVar.getName()), pVar));
                    } else if (!gVar.mo37662E0()) {
                        if (field2 == null) {
                            StringBuilder sb = new StringBuilder(20);
                            sb.append("bitField");
                            sb.append(i5);
                            sb.append("_");
                            field = m29498f(cls2, sb.toString());
                        } else {
                            field = field2;
                        }
                        if (gVar.mo38343l()) {
                            C23827f0.m28758a(i7);
                            Charset charset2 = C23908o0.f68505a;
                            if (e == null) {
                                throw new NullPointerException("field");
                            } else if (h2 == null) {
                                throw new NullPointerException("fieldType");
                            } else if (field != null) {
                                if (i6 != 0 && ((i6 + -1) & i6) == 0) {
                                    C23827f0 f0Var = r10;
                                    boolean z3 = z2;
                                    C23839h0 h0Var = h2;
                                    i = i5;
                                    int i8 = i6;
                                    C23827f0 f0Var2 = new C23827f0(e, i7, h0Var, (Class<?>) null, field, i8, true, z3, (C24058v1) null, (Class<?>) null, (Object) null, pVar, (Field) null);
                                    aVar.mo37825b(f0Var);
                                    i2 = i8;
                                } else {
                                    StringBuilder sb4 = new StringBuilder(55);
                                    sb4.append("presenceMask must have exactly one bit set: ");
                                    sb4.append(i6);
                                    throw new IllegalArgumentException(sb4.toString());
                                }
                            } else {
                                throw new NullPointerException("presenceField");
                            }
                        } else {
                            C23908o0.C23913e eVar = pVar;
                            boolean z4 = z2;
                            i = i5;
                            i2 = i6;
                            C23827f0.m28758a(i7);
                            Charset charset3 = C23908o0.f68505a;
                            if (e == null) {
                                throw new NullPointerException("field");
                            } else if (h2 == null) {
                                throw new NullPointerException("fieldType");
                            } else if (field != null) {
                                if (i2 != 0 && (i2 & (i2 + -1)) == 0) {
                                    C23839h0 h0Var2 = h2;
                                    C23827f0 f0Var3 = r10;
                                    C23827f0 f0Var4 = new C23827f0(e, i7, h0Var2, (Class<?>) null, field, i2, false, z4, (C24058v1) null, (Class<?>) null, (Object) null, eVar, (Field) null);
                                    aVar.mo37825b(f0Var3);
                                } else {
                                    StringBuilder sb5 = new StringBuilder(55);
                                    sb5.append("presenceMask must have exactly one bit set: ");
                                    sb5.append(i2);
                                    throw new IllegalArgumentException(sb5.toString());
                                }
                            } else {
                                throw new NullPointerException("presenceField");
                            }
                        }
                        field2 = field;
                    } else if (pVar != null) {
                        if (gVar.mo37666T0()) {
                            Field d = m29496d(cls2, gVar);
                            C23827f0.m28758a(i7);
                            Charset charset4 = C23908o0.f68505a;
                            if (e != null) {
                                aVar.mo37825b(new C23827f0(e, i7, h2, (Class<?>) null, (Field) null, 0, false, false, (C24058v1) null, (Class<?>) null, (Object) null, pVar, d));
                            } else {
                                throw new NullPointerException("field");
                            }
                        } else {
                            C23827f0.m28758a(i7);
                            Charset charset5 = C23908o0.f68505a;
                            if (e != null) {
                                aVar.mo37825b(new C23827f0(e, i7, h2, (Class<?>) null, (Field) null, 0, false, false, (C24058v1) null, (Class<?>) null, (Object) null, pVar, (Field) null));
                            } else {
                                throw new NullPointerException("field");
                            }
                        }
                    } else if (gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                        aVar.mo37825b(C23827f0.m28762f(e, i7, h2, m29501i(cls2, gVar)));
                    } else if (gVar.mo37666T0()) {
                        aVar.mo37825b(C23827f0.m28761e(e, i7, h2, m29496d(cls2, gVar)));
                    } else {
                        aVar.mo37825b(C23827f0.m28759b(e, i7, h2, z2));
                    }
                    i4++;
                    i3 = 2;
                }
                i6 = i2 << 1;
                if (i6 == 0) {
                    i5 = i + 1;
                    field2 = null;
                    i6 = 1;
                } else {
                    i5 = i;
                }
                i4++;
                i3 = 2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < h.size(); i9++) {
                C24025t.C24035g gVar2 = h.get(i9);
                if (!gVar2.mo38343l()) {
                    if (gVar2.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                        C24025t.C24027b h3 = gVar2.mo38339h();
                        C23928a aVar4 = f68549b;
                        Boolean bool = (Boolean) ((ConcurrentHashMap) aVar4.f68550a).get(h3);
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            synchronized (aVar4) {
                                Boolean bool2 = (Boolean) ((ConcurrentHashMap) aVar4.f68550a).get(h3);
                                z = bool2 != null ? bool2.booleanValue() : aVar4.mo38015a(h3).f68557d.f68559b;
                            }
                        }
                        if (z) {
                        }
                    } else {
                        continue;
                    }
                }
                arrayList.add(Integer.valueOf(gVar2.f69104e.f68739f));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                iArr[i15] = ((Integer) arrayList.get(i15)).intValue();
            }
            aVar.f68415e = iArr;
            return aVar.mo37824a();
        } else if (ordinal == 2) {
            List<C24025t.C24035g> h4 = descriptorForType.mo38319h();
            C23869l2.C23870a aVar5 = new C23869l2.C23870a(h4.size());
            aVar5.f68416f = m29499g(cls);
            C24078y1 y1Var2 = C24078y1.PROTO3;
            Charset charset6 = C23908o0.f68505a;
            aVar5.f68412b = y1Var2;
            C23931b bVar2 = new C23931b((C23921p) null);
            for (int i16 = 0; i16 < h4.size(); i16++) {
                C24025t.C24035g gVar3 = h4.get(i16);
                if (gVar3.f69112p != null) {
                    aVar5.mo37825b(m29495c(cls2, gVar3, bVar2, true, (C23908o0.C23913e) null));
                } else if (gVar3.mo38341j()) {
                    aVar5.mo37825b(C23827f0.m28760c(m29497e(cls2, gVar3), gVar3.f69104e.f68739f, C23842h2.m28882B(cls2, gVar3.getName()), (C23908o0.C23913e) null));
                } else if (gVar3.mo37662E0() && gVar3.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                    aVar5.mo37825b(C23827f0.m28762f(m29497e(cls2, gVar3), gVar3.f69104e.f68739f, m29500h(gVar3), m29501i(cls2, gVar3)));
                } else if (gVar3.mo37666T0()) {
                    aVar5.mo37825b(C23827f0.m28761e(m29497e(cls2, gVar3), gVar3.f69104e.f68739f, m29500h(gVar3), m29496d(cls2, gVar3)));
                } else {
                    aVar5.mo37825b(C23827f0.m28759b(m29497e(cls2, gVar3), gVar3.f69104e.f68739f, m29500h(gVar3), true));
                }
            }
            return aVar5.mo37824a();
        } else {
            String valueOf = String.valueOf(descriptorForType.f69071f.mo38348h());
            StringBuilder sb6 = new StringBuilder(valueOf.length() + 20);
            sb6.append("Unsupported syntax: ");
            sb6.append(valueOf);
            throw new IllegalArgumentException(sb6.toString());
        }
    }
}
