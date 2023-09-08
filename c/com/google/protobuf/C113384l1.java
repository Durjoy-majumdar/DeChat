package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.l1 */
public final class C113384l1 {
    /* renamed from: a */
    public static final String m155236a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m155237b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m155237b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m155237b(sb, i, str, b2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C113385n2.m155239a(C16994k.m16791k((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C16994k) {
                sb.append(": \"");
                sb.append(C113385n2.m155239a((C16994k) obj));
                sb.append('\"');
            } else if (obj instanceof C23861l0) {
                sb.append(" {");
                m155238c((C23861l0) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m155237b(sb, i4, "key", entry.getKey());
                m155237b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f7, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020b, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x021d, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L_0x01f9;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m155238c(com.google.protobuf.C23845j1 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            r4 = 3
            if (r3 == 0) goto L_0x026e
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r6 = r3.startsWith(r7)
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = r3.substring(r4)
            goto L_0x0066
        L_0x0065:
            r6 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r6.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r6.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 + -4
            java.lang.String r9 = r6.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = m155236a(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.protobuf.C23861l0.invokeOrDie(r9, r13, r4)
            m155237b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r6.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r6.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r6.length()
            int r9 = r9 - r4
            java.lang.String r4 = r6.substring(r10, r9)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r9 = r4.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r4 = r8.concat(r4)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = m155236a(r4)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.protobuf.C23861l0.invokeOrDie(r3, r13, r6)
            m155237b(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0136:
            java.lang.String r3 = "set"
            int r4 = r6.length()
            if (r4 == 0) goto L_0x0143
            java.lang.String r3 = r3.concat(r6)
            goto L_0x0149
        L_0x0143:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x0149:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 != 0) goto L_0x0153
            goto L_0x004d
        L_0x0153:
            java.lang.String r3 = "Bytes"
            boolean r3 = r6.endsWith(r3)
            if (r3 == 0) goto L_0x0181
            int r3 = r6.length()
            int r3 = r3 + -5
            java.lang.String r3 = r6.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x0174
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0179
        L_0x0174:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0179:
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x0181
            goto L_0x004d
        L_0x0181:
            java.lang.String r3 = r6.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r6.substring(r10)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r8 = r4.length()
            if (r8 == 0) goto L_0x01a0
            java.lang.String r3 = r3.concat(r4)
            goto L_0x01a6
        L_0x01a0:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x01a6:
            int r4 = r6.length()
            if (r4 == 0) goto L_0x01b1
            java.lang.String r4 = r7.concat(r6)
            goto L_0x01b6
        L_0x01b1:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r7)
        L_0x01b6:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r8 = "has"
            int r9 = r6.length()
            if (r9 == 0) goto L_0x01c9
            java.lang.String r6 = r8.concat(r6)
            goto L_0x01ce
        L_0x01c9:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x01ce:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r4 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.protobuf.C23861l0.invokeOrDie(r4, r13, r8)
            if (r6 != 0) goto L_0x0257
            boolean r6 = r4 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x01ec
            r6 = r4
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r6 = r6 ^ r10
            goto L_0x0252
        L_0x01ec:
            boolean r6 = r4 instanceof java.lang.Integer
            if (r6 == 0) goto L_0x01fd
            r6 = r4
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L_0x01fb
        L_0x01f9:
            r6 = 1
            goto L_0x0252
        L_0x01fb:
            r6 = 0
            goto L_0x0252
        L_0x01fd:
            boolean r6 = r4 instanceof java.lang.Float
            if (r6 == 0) goto L_0x020e
            r6 = r4
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x01fb
            goto L_0x01f9
        L_0x020e:
            boolean r6 = r4 instanceof java.lang.Double
            if (r6 == 0) goto L_0x0220
            r6 = r4
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r11 = 0
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x01fb
            goto L_0x01f9
        L_0x0220:
            boolean r6 = r4 instanceof java.lang.String
            if (r6 == 0) goto L_0x022b
            java.lang.String r6 = ""
            boolean r6 = r4.equals(r6)
            goto L_0x0252
        L_0x022b:
            boolean r6 = r4 instanceof com.google.protobuf.C16994k
            if (r6 == 0) goto L_0x0236
            com.google.protobuf.k r6 = com.google.protobuf.C16994k.f46000e
            boolean r6 = r4.equals(r6)
            goto L_0x0252
        L_0x0236:
            boolean r6 = r4 instanceof com.google.protobuf.C23845j1
            if (r6 == 0) goto L_0x0244
            r6 = r4
            com.google.protobuf.j1 r6 = (com.google.protobuf.C23845j1) r6
            com.google.protobuf.j1 r6 = r6.getDefaultInstanceForType()
            if (r4 != r6) goto L_0x01fb
            goto L_0x01f9
        L_0x0244:
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L_0x01fb
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            if (r6 != 0) goto L_0x01fb
            goto L_0x01f9
        L_0x0252:
            if (r6 != 0) goto L_0x0255
            goto L_0x0263
        L_0x0255:
            r10 = 0
            goto L_0x0263
        L_0x0257:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.protobuf.C23861l0.invokeOrDie(r6, r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r10 = r6.booleanValue()
        L_0x0263:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = m155236a(r3)
            m155237b(r14, r15, r3, r4)
            goto L_0x004d
        L_0x026e:
            boolean r0 = r13 instanceof com.google.protobuf.C23861l0.C23864c
            if (r0 == 0) goto L_0x02af
            r0 = r13
            com.google.protobuf.l0$c r0 = (com.google.protobuf.C23861l0.C23864c) r0
            com.google.protobuf.g0<com.google.protobuf.l0$d> r0 = r0.f68388d
            java.util.Iterator r0 = r0.mo37650t()
        L_0x027b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02af
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.protobuf.l0$d r2 = (com.google.protobuf.C23861l0.C23865d) r2
            int r2 = r2.f68390e
            r3 = 13
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            java.lang.String r3 = "["
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = "]"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.Object r1 = r1.getValue()
            m155237b(r14, r15, r2, r1)
            goto L_0x027b
        L_0x02af:
            com.google.protobuf.l0 r13 = (com.google.protobuf.C23861l0) r13
            com.google.protobuf.t2 r13 = r13.unknownFields
            if (r13 == 0) goto L_0x02cc
        L_0x02b5:
            int r0 = r13.f69160a
            if (r5 >= r0) goto L_0x02cc
            int[] r0 = r13.f69161b
            r0 = r0[r5]
            int r0 = r0 >>> r4
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object[] r1 = r13.f69162c
            r1 = r1[r5]
            m155237b(r14, r15, r0, r1)
            int r5 = r5 + 1
            goto L_0x02b5
        L_0x02cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C113384l1.m155238c(com.google.protobuf.j1, java.lang.StringBuilder, int):void");
    }
}
