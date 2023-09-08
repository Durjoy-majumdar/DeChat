package com.google.protobuf;

import com.google.protobuf.C23836g1;
import com.google.protobuf.C24025t;
import com.google.protobuf.C24071y;
import com.google.protobuf.C24087z2;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.n1 */
public class C23902n1 {

    /* renamed from: com.google.protobuf.n1$a */
    public static class C23903a implements C23905c {

        /* renamed from: a */
        public final C23836g1.C23837a f68499a;

        public C23903a(C23836g1.C23837a aVar) {
            this.f68499a = aVar;
        }

        /* renamed from: a */
        public C23905c.C23906a mo37944a() {
            return C23905c.C23906a.MESSAGE;
        }

        public C23905c addRepeatedField(C24025t.C24035g gVar, Object obj) {
            this.f68499a.addRepeatedField(gVar, obj);
            return this;
        }

        /* renamed from: b */
        public Object mo37946b(C23856l lVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var) {
            C23836g1 g1Var2;
            C23836g1.C23837a newBuilderForType = g1Var != null ? g1Var.newBuilderForType() : this.f68499a.newBuilderForField(gVar);
            if (!gVar.mo37662E0() && (g1Var2 = (C23836g1) this.f68499a.getField(gVar)) != null) {
                newBuilderForType.mergeFrom(g1Var2);
            }
            lVar.mo37774s(gVar.f69104e.f68739f, newBuilderForType, a0Var);
            return newBuilderForType.buildPartial();
        }

        /* renamed from: c */
        public C24071y.C24073b mo37947c(C24071y yVar, C24025t.C24027b bVar, int i) {
            return yVar.f69201f.get(new C24071y.C24072a(bVar, i));
        }

        /* renamed from: d */
        public C24087z2.C24095d mo37948d(C24025t.C24035g gVar) {
            if (gVar.mo38344m()) {
                return C24087z2.C24095d.STRICT;
            }
            gVar.mo37662E0();
            return C24087z2.C24095d.LOOSE;
        }

        /* renamed from: e */
        public Object mo37949e(C16994k kVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var) {
            C23836g1 g1Var2;
            C23836g1.C23837a newBuilderForType = g1Var != null ? g1Var.newBuilderForType() : this.f68499a.newBuilderForField(gVar);
            if (!gVar.mo37662E0() && (g1Var2 = (C23836g1) this.f68499a.getField(gVar)) != null) {
                newBuilderForType.mergeFrom(g1Var2);
            }
            newBuilderForType.mergeFrom(kVar, a0Var);
            return newBuilderForType.buildPartial();
        }

        /* renamed from: f */
        public Object mo37950f(C23856l lVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var) {
            C23836g1 g1Var2;
            C23836g1.C23837a newBuilderForType = g1Var != null ? g1Var.newBuilderForType() : this.f68499a.newBuilderForField(gVar);
            if (!gVar.mo37662E0() && (g1Var2 = (C23836g1) this.f68499a.getField(gVar)) != null) {
                newBuilderForType.mergeFrom(g1Var2);
            }
            lVar.mo37778w(newBuilderForType, a0Var);
            return newBuilderForType.buildPartial();
        }

        public boolean hasField(C24025t.C24035g gVar) {
            return this.f68499a.hasField(gVar);
        }

        public C23905c setField(C24025t.C24035g gVar, Object obj) {
            this.f68499a.setField(gVar, obj);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.n1$b */
    public static class C23904b implements C23905c {

        /* renamed from: a */
        public final C23832g0<C24025t.C24035g> f68500a;

        public C23904b(C23832g0<C24025t.C24035g> g0Var) {
            this.f68500a = g0Var;
        }

        /* renamed from: a */
        public C23905c.C23906a mo37944a() {
            return C23905c.C23906a.EXTENSION_SET;
        }

        public C23905c addRepeatedField(C24025t.C24035g gVar, Object obj) {
            this.f68500a.mo37636a(gVar, obj);
            return this;
        }

        /* renamed from: b */
        public Object mo37946b(C23856l lVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var) {
            C23836g1 g1Var2;
            C23836g1.C23837a newBuilderForType = g1Var.newBuilderForType();
            if (!gVar.mo37662E0() && (g1Var2 = (C23836g1) this.f68500a.mo37643k(gVar)) != null) {
                newBuilderForType.mergeFrom(g1Var2);
            }
            lVar.mo37774s(gVar.f69104e.f68739f, newBuilderForType, a0Var);
            return newBuilderForType.buildPartial();
        }

        /* renamed from: c */
        public C24071y.C24073b mo37947c(C24071y yVar, C24025t.C24027b bVar, int i) {
            return yVar.f69201f.get(new C24071y.C24072a(bVar, i));
        }

        /* renamed from: d */
        public C24087z2.C24095d mo37948d(C24025t.C24035g gVar) {
            return gVar.mo38344m() ? C24087z2.C24095d.STRICT : C24087z2.C24095d.LOOSE;
        }

        /* renamed from: e */
        public Object mo37949e(C16994k kVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var) {
            C23836g1 g1Var2;
            C23836g1.C23837a newBuilderForType = g1Var.newBuilderForType();
            if (!gVar.mo37662E0() && (g1Var2 = (C23836g1) this.f68500a.mo37643k(gVar)) != null) {
                newBuilderForType.mergeFrom(g1Var2);
            }
            newBuilderForType.mergeFrom(kVar, a0Var);
            return newBuilderForType.buildPartial();
        }

        /* renamed from: f */
        public Object mo37950f(C23856l lVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var) {
            C23836g1 g1Var2;
            C23836g1.C23837a newBuilderForType = g1Var.newBuilderForType();
            if (!gVar.mo37662E0() && (g1Var2 = (C23836g1) this.f68500a.mo37643k(gVar)) != null) {
                newBuilderForType.mergeFrom(g1Var2);
            }
            lVar.mo37778w(newBuilderForType, a0Var);
            return newBuilderForType.buildPartial();
        }

        public boolean hasField(C24025t.C24035g gVar) {
            return this.f68500a.mo37647o(gVar);
        }

        public C23905c setField(C24025t.C24035g gVar, Object obj) {
            this.f68500a.mo37654x(gVar, obj);
            return this;
        }
    }

    /* renamed from: com.google.protobuf.n1$c */
    public interface C23905c {

        /* renamed from: com.google.protobuf.n1$c$a */
        public enum C23906a {
            MESSAGE,
            EXTENSION_SET
        }

        /* renamed from: a */
        C23906a mo37944a();

        C23905c addRepeatedField(C24025t.C24035g gVar, Object obj);

        /* renamed from: b */
        Object mo37946b(C23856l lVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var);

        /* renamed from: c */
        C24071y.C24073b mo37947c(C24071y yVar, C24025t.C24027b bVar, int i);

        /* renamed from: d */
        C24087z2.C24095d mo37948d(C24025t.C24035g gVar);

        /* renamed from: e */
        Object mo37949e(C16994k kVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var);

        /* renamed from: f */
        Object mo37950f(C23856l lVar, C23806a0 a0Var, C24025t.C24035g gVar, C23836g1 g1Var);

        boolean hasField(C24025t.C24035g gVar);

        C23905c setField(C24025t.C24035g gVar, Object obj);
    }

    /* renamed from: a */
    public static String m29375a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String next : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(next);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m29376b(C23896m1 m1Var, String str, List<String> list) {
        for (C24025t.C24035g next : m1Var.getDescriptorForType().mo38319h()) {
            if (next.mo38343l() && !m1Var.hasField(next)) {
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(next.getName());
                list.add(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
        }
        for (Map.Entry next2 : m1Var.getAllFields().entrySet()) {
            C24025t.C24035g gVar = (C24025t.C24035g) next2.getKey();
            Object value = next2.getValue();
            if (gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                if (gVar.mo37662E0()) {
                    int i = 0;
                    for (C23896m1 b : (List) value) {
                        m29376b(b, m29379e(str, gVar, i), list);
                        i++;
                    }
                } else if (m1Var.hasField(gVar)) {
                    m29376b((C23896m1) value, m29379e(str, gVar, -1), list);
                }
            }
        }
    }

    /* renamed from: c */
    public static int m29377c(C23836g1 g1Var, Map<C24025t.C24035g, Object> map) {
        boolean z = g1Var.getDescriptorForType().mo38322k().f68909f;
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            C24025t.C24035g gVar = (C24025t.C24035g) next.getKey();
            Object value = next.getValue();
            i += (!z || !gVar.mo38340i() || gVar.f69109j != C24025t.C24035g.C24037b.MESSAGE || gVar.mo37662E0()) ? C23832g0.m28835i(gVar, value) : (C23897n.m29277v(1) * 2) + C23897n.m29278w(2, gVar.f69104e.f68739f) + C23897n.m29270o(3, (C23836g1) value);
        }
        C24020s2 unknownFields = g1Var.getUnknownFields();
        return i + (z ? unknownFields.mo38291a() : unknownFields.getSerializedSize());
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cf  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m29378d(com.google.protobuf.C23856l r8, com.google.protobuf.C24020s2.C24021a r9, com.google.protobuf.C23806a0 r10, com.google.protobuf.C24025t.C24027b r11, com.google.protobuf.C23902n1.C23905c r12, int r13) {
        /*
            com.google.protobuf.t$h$a r0 = com.google.protobuf.C24025t.C24038h.C24039a.PROTO3
            com.google.protobuf.s$l r1 = r11.mo38322k()
            boolean r1 = r1.f68909f
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x007a
            r1 = 11
            if (r13 != r1) goto L_0x007a
            r13 = r4
            r0 = r13
        L_0x0013:
            int r1 = r8.mo37757F()
            if (r1 != 0) goto L_0x001a
            goto L_0x0045
        L_0x001a:
            r5 = 16
            if (r1 != r5) goto L_0x0030
            int r3 = r8.mo37758G()
            if (r3 == 0) goto L_0x0013
            boolean r1 = r10 instanceof com.google.protobuf.C24071y
            if (r1 == 0) goto L_0x0013
            r0 = r10
            com.google.protobuf.y r0 = (com.google.protobuf.C24071y) r0
            com.google.protobuf.y$b r0 = r12.mo37947c(r0, r11, r3)
            goto L_0x0013
        L_0x0030:
            r5 = 26
            if (r1 != r5) goto L_0x003f
            if (r3 == 0) goto L_0x003a
            if (r0 == 0) goto L_0x003a
            com.google.protobuf.a0 r13 = com.google.protobuf.C23806a0.f68207b
        L_0x003a:
            com.google.protobuf.k r13 = r8.mo37768m()
            goto L_0x0013
        L_0x003f:
            boolean r1 = r8.mo37760I(r1)
            if (r1 != 0) goto L_0x0013
        L_0x0045:
            r11 = 12
            r8.mo37761a(r11)
            if (r13 == 0) goto L_0x0079
            if (r3 == 0) goto L_0x0079
            if (r0 == 0) goto L_0x0069
            boolean r8 = r12.hasField(r4)
            if (r8 != 0) goto L_0x0061
            com.google.protobuf.a0 r8 = com.google.protobuf.C23806a0.f68207b
            com.google.protobuf.r0 r8 = new com.google.protobuf.r0
            r8.<init>(r4, r10, r13)
            r12.setField(r4, r8)
            goto L_0x0079
        L_0x0061:
            java.lang.Object r8 = r12.mo37949e(r13, r10, r4, r4)
            r12.setField(r4, r8)
            goto L_0x0079
        L_0x0069:
            if (r9 == 0) goto L_0x0079
            com.google.protobuf.s2$b$a r8 = com.google.protobuf.C24020s2.C24022b.m29818b()
            r8.mo38308a(r13)
            com.google.protobuf.s2$b r8 = r8.mo38310c()
            r9.mo38301d(r3, r8)
        L_0x0079:
            return r2
        L_0x007a:
            r1 = r13 & 7
            int r5 = r13 >>> 3
            boolean r6 = r11.mo38323l(r5)
            if (r6 == 0) goto L_0x0093
            boolean r6 = r10 instanceof com.google.protobuf.C24071y
            if (r6 == 0) goto L_0x00a0
            r6 = r10
            com.google.protobuf.y r6 = (com.google.protobuf.C24071y) r6
            com.google.protobuf.y$b r11 = r12.mo37947c(r6, r11, r5)
            if (r11 != 0) goto L_0x0092
            goto L_0x00a0
        L_0x0092:
            throw r4
        L_0x0093:
            com.google.protobuf.n1$c$a r6 = r12.mo37944a()
            com.google.protobuf.n1$c$a r7 = com.google.protobuf.C23902n1.C23905c.C23906a.MESSAGE
            if (r6 != r7) goto L_0x00a0
            com.google.protobuf.t$g r11 = r11.mo38317g(r5)
            goto L_0x00a1
        L_0x00a0:
            r11 = r4
        L_0x00a1:
            if (r11 != 0) goto L_0x00a4
            goto L_0x00bf
        L_0x00a4:
            com.google.protobuf.z2$b r6 = r11.mo37663O()
            com.google.protobuf.g0 r7 = com.google.protobuf.C23832g0.f68258d
            int r6 = r6.f69234e
            if (r1 != r6) goto L_0x00b0
            r1 = 0
            goto L_0x00c0
        L_0x00b0:
            boolean r6 = r11.mo38342k()
            if (r6 == 0) goto L_0x00bf
            r11.mo37663O()
            r6 = 2
            if (r1 != r6) goto L_0x00bf
            r1 = 0
            r6 = 1
            goto L_0x00c1
        L_0x00bf:
            r1 = 1
        L_0x00c0:
            r6 = 0
        L_0x00c1:
            if (r1 == 0) goto L_0x00cf
            if (r9 == 0) goto L_0x00ca
            boolean r8 = r9.mo38302e(r13, r8)
            return r8
        L_0x00ca:
            boolean r8 = r8.mo37760I(r13)
            return r8
        L_0x00cf:
            if (r6 == 0) goto L_0x0132
            int r10 = r8.mo37779x()
            int r10 = r8.mo37766k(r10)
            com.google.protobuf.z2$b r13 = r11.mo37663O()
            com.google.protobuf.z2$b r1 = com.google.protobuf.C24087z2.C24089b.ENUM
            if (r13 != r1) goto L_0x0118
        L_0x00e1:
            int r13 = r8.mo37762d()
            if (r13 <= 0) goto L_0x012e
            int r13 = r8.mo37770o()
            com.google.protobuf.t$h r1 = r11.f69106g
            com.google.protobuf.t$h$a r1 = r1.mo38348h()
            if (r1 != r0) goto L_0x00f5
            r1 = 1
            goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            if (r1 == 0) goto L_0x0104
            com.google.protobuf.t$e r1 = r11.mo38338g()
            com.google.protobuf.t$f r13 = r1.mo38333g(r13)
            r12.addRepeatedField(r11, r13)
            goto L_0x00e1
        L_0x0104:
            com.google.protobuf.t$e r1 = r11.mo38338g()
            com.google.protobuf.t$f r1 = r1.findValueByNumber(r13)
            if (r1 != 0) goto L_0x0114
            if (r9 == 0) goto L_0x00e1
            r9.mo38304g(r5, r13)
            goto L_0x00e1
        L_0x0114:
            r12.addRepeatedField(r11, r1)
            goto L_0x00e1
        L_0x0118:
            int r9 = r8.mo37762d()
            if (r9 <= 0) goto L_0x012e
            com.google.protobuf.z2$b r9 = r11.mo37663O()
            com.google.protobuf.z2$d r13 = r12.mo37948d(r11)
            java.lang.Object r9 = com.google.protobuf.C24087z2.m30087a(r8, r9, r13)
            r12.addRepeatedField(r11, r9)
            goto L_0x0118
        L_0x012e:
            r8.mo37765j(r10)
            goto L_0x0191
        L_0x0132:
            com.google.protobuf.t$g$b r13 = r11.f69109j
            int r13 = r13.ordinal()
            r1 = 9
            if (r13 == r1) goto L_0x0180
            r1 = 10
            if (r13 == r1) goto L_0x017b
            r10 = 13
            if (r13 == r10) goto L_0x0151
            com.google.protobuf.z2$b r9 = r11.mo37663O()
            com.google.protobuf.z2$d r10 = r12.mo37948d(r11)
            java.lang.Object r8 = com.google.protobuf.C24087z2.m30087a(r8, r9, r10)
            goto L_0x0184
        L_0x0151:
            int r8 = r8.mo37770o()
            com.google.protobuf.t$h r10 = r11.f69106g
            com.google.protobuf.t$h$a r10 = r10.mo38348h()
            if (r10 != r0) goto L_0x015e
            r3 = 1
        L_0x015e:
            if (r3 == 0) goto L_0x0169
            com.google.protobuf.t$e r9 = r11.mo38338g()
            com.google.protobuf.t$f r8 = r9.mo38333g(r8)
            goto L_0x0184
        L_0x0169:
            com.google.protobuf.t$e r10 = r11.mo38338g()
            com.google.protobuf.t$f r10 = r10.findValueByNumber(r8)
            if (r10 != 0) goto L_0x0179
            if (r9 == 0) goto L_0x0178
            r9.mo38304g(r5, r8)
        L_0x0178:
            return r2
        L_0x0179:
            r8 = r10
            goto L_0x0184
        L_0x017b:
            java.lang.Object r8 = r12.mo37950f(r8, r10, r11, r4)
            goto L_0x0184
        L_0x0180:
            java.lang.Object r8 = r12.mo37946b(r8, r10, r11, r4)
        L_0x0184:
            boolean r9 = r11.mo37662E0()
            if (r9 == 0) goto L_0x018e
            r12.addRepeatedField(r11, r8)
            goto L_0x0191
        L_0x018e:
            r12.setField(r11, r8)
        L_0x0191:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C23902n1.m29378d(com.google.protobuf.l, com.google.protobuf.s2$a, com.google.protobuf.a0, com.google.protobuf.t$b, com.google.protobuf.n1$c, int):boolean");
    }

    /* renamed from: e */
    public static String m29379e(String str, C24025t.C24035g gVar, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (gVar.mo38340i()) {
            sb.append('(');
            sb.append(gVar.f69105f);
            sb.append(')');
        } else {
            sb.append(gVar.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    /* renamed from: f */
    public static void m29380f(C23836g1 g1Var, Map<C24025t.C24035g, Object> map, C23897n nVar, boolean z) {
        boolean z2 = g1Var.getDescriptorForType().mo38322k().f68909f;
        if (z) {
            TreeMap treeMap = new TreeMap(map);
            for (C24025t.C24035g next : g1Var.getDescriptorForType().mo38319h()) {
                if (next.mo38343l() && !treeMap.containsKey(next)) {
                    treeMap.put(next, g1Var.getField(next));
                }
            }
            map = treeMap;
        }
        for (Map.Entry next2 : map.entrySet()) {
            C24025t.C24035g gVar = (C24025t.C24035g) next2.getKey();
            Object value = next2.getValue();
            if (!z2 || !gVar.mo38340i() || gVar.f69109j != C24025t.C24035g.C24037b.MESSAGE || gVar.mo37662E0()) {
                C23832g0.m28829A(gVar, value, nVar);
            } else {
                nVar.mo37912S(gVar.f69104e.f68739f, (C23836g1) value);
            }
        }
        C24020s2 unknownFields = g1Var.getUnknownFields();
        if (z2) {
            unknownFields.mo38292c(nVar);
        } else {
            unknownFields.writeTo(nVar);
        }
    }
}
