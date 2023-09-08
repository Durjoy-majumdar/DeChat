package p423ye;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p276y9.C23281e;
import p276y9.C26627b;
import p276y9.C26628c;
import p276y9.C26632h;
import p276y9.C26635k;
import p291aa.C23628g;
import p291aa.C23632k;
import p425ze.C26698d;

/* renamed from: ye.a */
public class C26638a {

    /* renamed from: a */
    public final C26698d f74125a;

    public C26638a(String str, C26698d dVar) {
        this.f74125a = dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: ze.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: ze.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: ze.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: ze.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: ze.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: ze.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: ze.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v16, resolved type: ze.j} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03f0 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p425ze.C91669a mo53645a(long r29, p276y9.C26635k r31, p276y9.C26632h r32) {
        /*
            r28 = this;
            r0 = r32
            af.b r7 = new af.b
            r8 = r28
            ze.d r1 = r8.f74125a
            r7.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r0)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            boolean r1 = r9.isEmpty()
            java.lang.String r11 = "Thread name not available"
            java.lang.String r12 = "name"
            r13 = 0
            r14 = 1
            r15 = 0
            java.lang.String r6 = "["
            if (r1 == 0) goto L_0x002b
            r18 = r6
            goto L_0x016b
        L_0x002b:
            java.util.Queue<ze.i> r1 = r7.f67825b
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.clear()
            java.util.Queue<ze.i> r1 = r7.f67826c
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.clear()
            java.util.Set<y9.h> r1 = r7.f67827d
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.clear()
            java.util.Set<y9.h> r1 = r7.f67828e
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.clear()
            java.util.Set<y9.h> r1 = r7.f67829f
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.clear()
            r1 = r31
            java.util.ArrayList<y9.f> r1 = r1.f74117b
            java.lang.Object r1 = r1.get(r15)
            y9.f r1 = (p276y9.C26630f) r1
            java.util.ArrayList<y9.i> r1 = r1.f74082d
            java.util.Iterator r16 = r1.iterator()
        L_0x005e:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r16.next()
            r4 = r1
            y9.i r4 = (p276y9.C26633i) r4
            y9.j r1 = r4.f74097h
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005e;
                case 2: goto L_0x005e;
                case 3: goto L_0x005e;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00c3;
                case 6: goto L_0x005e;
                case 7: goto L_0x00c3;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00c3;
                case 10: goto L_0x00c3;
                case 11: goto L_0x00c3;
                case 12: goto L_0x00c3;
                case 13: goto L_0x005e;
                case 14: goto L_0x0081;
                case 15: goto L_0x00c3;
                case 16: goto L_0x00c3;
                default: goto L_0x0074;
            }
        L_0x0074:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown root type:"
            r1.append(r2)
            goto L_0x00d0
        L_0x0081:
            y9.f r1 = r4.f74095f
            y9.k r1 = r1.f74087i
            int r2 = r4.f74098i
            y9.n r2 = r1.mo53640g(r2)
            long r2 = r2.f74123a
            y9.h r1 = r1.mo53637d(r2)
            java.util.Set<java.lang.String> r2 = p276y9.C23281e.f66913a
            y9.b r1 = (p276y9.C26627b) r1
            java.util.List r1 = r1.mo53610g()
            java.lang.Object r1 = p276y9.C23281e.m27762b(r1, r12)
            if (r1 != 0) goto L_0x00a1
            r1 = r11
            goto L_0x00a5
        L_0x00a1:
            java.lang.String r1 = p276y9.C23281e.m27761a(r1)
        L_0x00a5:
            ze.d r2 = r7.f67824a
            java.util.Map<java.lang.String, ze.e> r2 = r2.f74232f
            java.lang.Object r1 = r2.get(r1)
            r2 = r1
            ze.e r2 = (p425ze.C26702e) r2
            if (r2 == 0) goto L_0x00b6
            boolean r1 = r2.f74242d
            if (r1 != 0) goto L_0x005e
        L_0x00b6:
            r3 = 0
            r5 = 0
            r17 = 0
            r1 = r7
            r18 = r6
            r6 = r17
            r1.mo37181a(r2, r3, r4, r5, r6)
            goto L_0x00cd
        L_0x00c3:
            r18 = r6
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r1.mo37181a(r2, r3, r4, r5, r6)
        L_0x00cd:
            r6 = r18
            goto L_0x005e
        L_0x00d0:
            y9.j r2 = r4.f74097h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            r18 = r6
            r7.f67830g = r14
            java.util.Iterator r1 = r9.iterator()
        L_0x00e5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0110
            java.lang.Object r2 = r1.next()
            y9.h r2 = (p276y9.C26632h) r2
            y9.c r3 = r2.mo53605b()
            if (r3 == 0) goto L_0x010b
            y9.c r2 = r2.mo53605b()
            java.lang.String r2 = r2.f74070h
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r3 = r3.getName()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x010b
            r2 = 1
            goto L_0x010c
        L_0x010b:
            r2 = 0
        L_0x010c:
            if (r2 == 0) goto L_0x00e5
            r7.f67830g = r15
        L_0x0110:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r9)
        L_0x0115:
            java.util.Queue<ze.i> r1 = r7.f67825b
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0125
            java.util.Queue<ze.i> r1 = r7.f67826c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x016b
        L_0x0125:
            java.util.Queue<ze.i> r1 = r7.f67825b
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0138
            java.util.Queue<ze.i> r1 = r7.f67825b
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.poll()
            ze.i r1 = (p425ze.C26704i) r1
            goto L_0x0146
        L_0x0138:
            java.util.Queue<ze.i> r1 = r7.f67826c
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            java.lang.Object r1 = r1.poll()
            ze.i r1 = (p425ze.C26704i) r1
            ze.e r2 = r1.f74245a
            if (r2 == 0) goto L_0x061b
        L_0x0146:
            r9 = r1
            y9.h r1 = r9.f74246b
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x0437
            y9.h r1 = r9.f74246b
            af.b$a r2 = new af.b$a
            ze.e r3 = r9.f74245a
            if (r3 == 0) goto L_0x0159
            r3 = 1
            goto L_0x015a
        L_0x0159:
            r3 = 0
        L_0x015a:
            r2.<init>(r9, r3)
            r10.put(r1, r2)
            y9.h r1 = r9.f74246b
            r6.remove(r1)
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0437
        L_0x016b:
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L_0x0177
            af.b$a r1 = new af.b$a
            r1.<init>(r13, r15)
            goto L_0x017d
        L_0x0177:
            java.lang.Object r1 = r10.get(r0)
            af.b$a r1 = (p408af.C23635b.C23636a) r1
        L_0x017d:
            ze.i r2 = r1.f67831a
            if (r2 != 0) goto L_0x018a
            long r0 = p408af.C79522a.m96544a(r29)
            ze.a r0 = p425ze.C91669a.m115209b(r0)
            return r0
        L_0x018a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            ze.i r3 = new ze.i
            ze.i r4 = r1.f67831a
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r19 = r3
            r22 = r4
            r19.<init>(r20, r21, r22, r23, r24)
        L_0x01a2:
            if (r3 == 0) goto L_0x03ff
            ze.j$a r4 = p425ze.C91672j.C91673a.OBJECT
            ze.i r5 = r3.f74247c
            if (r5 != 0) goto L_0x01ab
            goto L_0x01b1
        L_0x01ab:
            y9.h r5 = r5.f74246b
            boolean r6 = r5 instanceof p276y9.C26633i
            if (r6 == 0) goto L_0x01b8
        L_0x01b1:
            r27 = r11
            r4 = r13
            r15 = r18
            goto L_0x03ea
        L_0x01b8:
            ze.j$b r6 = r3.f74249e
            java.lang.String r7 = r3.f74248d
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            boolean r10 = r5 instanceof p276y9.C26628c
            java.lang.String r13 = "static "
            java.lang.String r14 = " = "
            if (r10 == 0) goto L_0x021d
            r19 = r5
            y9.c r19 = (p276y9.C26628c) r19
            java.util.Map r19 = r19.mo53615h()
            java.util.HashMap r19 = (java.util.HashMap) r19
            java.util.Set r19 = r19.entrySet()
            java.util.Iterator r19 = r19.iterator()
        L_0x01db:
            boolean r20 = r19.hasNext()
            if (r20 == 0) goto L_0x0215
            java.lang.Object r20 = r19.next()
            java.util.Map$Entry r20 = (java.util.Map.Entry) r20
            java.lang.Object r21 = r20.getKey()
            r15 = r21
            y9.d r15 = (p276y9.C23280d) r15
            java.lang.Object r0 = r20.getValue()
            r31 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r13)
            java.lang.String r15 = r15.f66912b
            r4.append(r15)
            r4.append(r14)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r9.add(r0)
            r4 = r31
            r0 = r32
            r15 = 0
            goto L_0x01db
        L_0x0215:
            r31 = r4
            r27 = r11
            r15 = r18
            goto L_0x02f3
        L_0x021d:
            r31 = r4
            boolean r0 = r5 instanceof p276y9.C26626a
            if (r0 == 0) goto L_0x025b
            r0 = r5
            y9.a r0 = (p276y9.C26626a) r0
            y9.o r4 = r0.f74066h
            y9.o r13 = p276y9.C23282o.OBJECT
            if (r4 != r13) goto L_0x0255
            java.lang.Object[] r0 = r0.mo53608h()
            r4 = 0
        L_0x0231:
            int r13 = r0.length
            if (r4 >= r13) goto L_0x0255
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r15 = r18
            r13.append(r15)
            r13.append(r4)
            java.lang.String r14 = "] = "
            r13.append(r14)
            r14 = r0[r4]
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r9.add(r13)
            int r4 = r4 + 1
            goto L_0x0231
        L_0x0255:
            r15 = r18
            r27 = r11
            goto L_0x02f3
        L_0x025b:
            r15 = r18
            y9.c r0 = r5.mo53605b()
            java.util.Map r0 = r0.mo53615h()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x026f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02ba
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r18 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            java.util.Set<java.lang.String> r19 = p276y9.C23281e.f66913a
            java.lang.Object r19 = r4.getKey()
            r8 = r19
            y9.d r8 = (p276y9.C23280d) r8
            java.lang.Object r4 = r4.getValue()
            r27 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r8 = r8.f66912b
            r11.append(r8)
            r11.append(r14)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r9.add(r0)
            r8 = r28
            r0 = r18
            r11 = r27
            goto L_0x026f
        L_0x02ba:
            r27 = r11
            r0 = r5
            y9.b r0 = (p276y9.C26627b) r0
            java.util.List r0 = r0.mo53610g()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02c9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02f3
            java.lang.Object r4 = r0.next()
            y9.b$a r4 = (p276y9.C26627b.C23279a) r4
            java.util.Set<java.lang.String> r8 = p276y9.C23281e.f66913a
            y9.d r8 = r4.f66909a
            java.lang.Object r4 = r4.f66910b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r8 = r8.f66912b
            r11.append(r8)
            r11.append(r14)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r9.add(r4)
            goto L_0x02c9
        L_0x02f3:
            if (r10 == 0) goto L_0x02fb
            r0 = r5
            y9.c r0 = (p276y9.C26628c) r0
            java.lang.String r0 = r0.f74070h
            goto L_0x030f
        L_0x02fb:
            boolean r0 = r5 instanceof p276y9.C26626a
            if (r0 == 0) goto L_0x0309
            r0 = r5
            y9.a r0 = (p276y9.C26626a) r0
            y9.c r0 = r0.mo53605b()
            java.lang.String r0 = r0.f74070h
            goto L_0x030f
        L_0x0309:
            y9.c r0 = r5.mo53605b()
            java.lang.String r0 = r0.f74070h
        L_0x030f:
            if (r10 == 0) goto L_0x0315
            ze.j$a r4 = p425ze.C91672j.C91673a.CLASS
            goto L_0x03d3
        L_0x0315:
            boolean r4 = r5 instanceof p276y9.C26626a
            if (r4 == 0) goto L_0x031d
            ze.j$a r4 = p425ze.C91672j.C91673a.ARRAY
            goto L_0x03d3
        L_0x031d:
            y9.c r4 = r5.mo53605b()
            java.util.Set<java.lang.String> r8 = p276y9.C23281e.f66913a
            r8 = r4
        L_0x0324:
            y9.c r10 = r8.mo53617i()
            if (r10 == 0) goto L_0x033f
            java.lang.String r10 = r4.f74070h
            java.lang.Class<java.lang.Thread> r11 = java.lang.Thread.class
            java.lang.String r11 = r11.getName()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x033a
            r8 = 1
            goto L_0x0340
        L_0x033a:
            y9.c r8 = r8.mo53617i()
            goto L_0x0324
        L_0x033f:
            r8 = 0
        L_0x0340:
            if (r8 == 0) goto L_0x036e
            ze.j$a r4 = p425ze.C91672j.C91673a.THREAD
            y9.b r5 = (p276y9.C26627b) r5
            java.util.List r5 = r5.mo53610g()
            java.lang.Object r5 = p276y9.C23281e.m27762b(r5, r12)
            if (r5 != 0) goto L_0x0353
            r5 = r27
            goto L_0x0357
        L_0x0353:
            java.lang.String r5 = p276y9.C23281e.m27761a(r5)
        L_0x0357:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "(named '"
            r8.append(r10)
            r8.append(r5)
            java.lang.String r5 = "')"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            goto L_0x03cc
        L_0x036e:
            java.lang.String r5 = "^.+\\$\\d+$"
            boolean r5 = r0.matches(r5)
            if (r5 == 0) goto L_0x03d1
            y9.c r5 = r4.mo53617i()
            java.lang.String r5 = r5.f74070h
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.String r8 = r8.getName()
            boolean r8 = r8.equals(r5)
            java.lang.String r10 = ")"
            if (r8 == 0) goto L_0x03b6
            java.lang.String r4 = r4.f74070h     // Catch:{ ClassNotFoundException -> 0x03d1 }
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x03d1 }
            java.lang.Class[] r4 = r4.getInterfaces()     // Catch:{ ClassNotFoundException -> 0x03d1 }
            int r5 = r4.length     // Catch:{ ClassNotFoundException -> 0x03d1 }
            if (r5 <= 0) goto L_0x03b3
            r5 = 0
            r4 = r4[r5]     // Catch:{ ClassNotFoundException -> 0x03d1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x03d1 }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x03d1 }
            java.lang.String r8 = "(anonymous implementation of "
            r5.append(r8)     // Catch:{ ClassNotFoundException -> 0x03d1 }
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x03d1 }
            r5.append(r4)     // Catch:{ ClassNotFoundException -> 0x03d1 }
            r5.append(r10)     // Catch:{ ClassNotFoundException -> 0x03d1 }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x03d1 }
            goto L_0x03ca
        L_0x03b3:
            java.lang.String r5 = "(anonymous subclass of java.lang.Object)"
            goto L_0x03ca
        L_0x03b6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "(anonymous subclass of "
            r4.append(r8)
            r4.append(r5)
            r4.append(r10)
            java.lang.String r5 = r4.toString()
        L_0x03ca:
            r4 = r31
        L_0x03cc:
            r22 = r4
            r24 = r5
            goto L_0x03d7
        L_0x03d1:
            r4 = r31
        L_0x03d3:
            r22 = r4
            r24 = 0
        L_0x03d7:
            ze.j r4 = new ze.j
            ze.e r5 = r3.f74245a
            r19 = r4
            r20 = r7
            r21 = r6
            r23 = r0
            r25 = r5
            r26 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
        L_0x03ea:
            r0 = 0
            if (r4 == 0) goto L_0x03f0
            r2.add(r0, r4)
        L_0x03f0:
            ze.i r3 = r3.f74247c
            r8 = r28
            r0 = r32
            r18 = r15
            r11 = r27
            r13 = 0
            r14 = 1
            r15 = 0
            goto L_0x01a2
        L_0x03ff:
            r0 = 0
            ze.h r8 = new ze.h
            r8.<init>(r2)
            y9.c r2 = r32.mo53605b()
            java.lang.String r7 = r2.f74070h
            boolean r1 = r1.f67832b
            if (r1 != 0) goto L_0x042e
            java.util.List<ze.j> r1 = r8.f105755d
            if (r1 == 0) goto L_0x041c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x041a
            goto L_0x041c
        L_0x041a:
            r14 = 0
            goto L_0x041d
        L_0x041c:
            r14 = 1
        L_0x041d:
            if (r14 == 0) goto L_0x0420
            goto L_0x042e
        L_0x0420:
            long r10 = p408af.C79522a.m96544a(r29)
            r6 = 0
            ze.a r0 = new ze.a
            r5 = 1
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r0
        L_0x042e:
            long r0 = p408af.C79522a.m96544a(r29)
            ze.a r0 = p425ze.C91669a.m115209b(r0)
            return r0
        L_0x0437:
            r27 = r11
            r15 = r18
            r0 = 0
            java.util.Set<y9.h> r1 = r7.f67829f
            y9.h r2 = r9.f74246b
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r1 = r1.add(r2)
            r8 = 1
            r1 = r1 ^ r8
            if (r1 == 0) goto L_0x044d
            r11 = r6
            goto L_0x05f4
        L_0x044d:
            y9.h r1 = r9.f74246b
            boolean r2 = r1 instanceof p276y9.C26633i
            if (r2 == 0) goto L_0x04b4
            y9.i r1 = (p276y9.C26633i) r1
            y9.j r2 = r1.f74097h
            y9.j r3 = p276y9.C26634j.SYSTEM_CLASS
            if (r2 != r3) goto L_0x0466
            y9.f r2 = r1.f74095f
            y9.k r2 = r2.f74087i
            long r3 = r1.f74093d
            y9.c r2 = r2.mo53635b(r3)
            goto L_0x0470
        L_0x0466:
            y9.f r2 = r1.f74095f
            y9.k r2 = r2.f74087i
            long r3 = r1.f74093d
            y9.h r2 = r2.mo53637d(r3)
        L_0x0470:
            r4 = r2
            y9.j r2 = r1.f74097h
            y9.j r3 = p276y9.C26634j.JAVA_LOCAL
            if (r2 != r3) goto L_0x04a9
            y9.f r2 = r1.f74095f
            y9.k r2 = r2.f74087i
            int r1 = r1.f74098i
            y9.n r1 = r2.mo53640g(r1)
            long r13 = r1.f74123a
            y9.h r19 = r2.mo53637d(r13)
            ze.e r1 = r9.f74245a
            if (r1 == 0) goto L_0x048d
            r2 = r1
            goto L_0x048e
        L_0x048d:
            r2 = 0
        L_0x048e:
            ze.i r3 = new ze.i
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            ze.j$b r9 = p425ze.C91672j.C91674b.LOCAL
            java.lang.String r5 = "<Java Local>"
            r1 = r7
            r11 = r6
            r6 = r9
            r1.mo37181a(r2, r3, r4, r5, r6)
            goto L_0x05f4
        L_0x04a9:
            r11 = r6
            r2 = 0
            r5 = 0
            r6 = 0
            r1 = r7
            r3 = r9
            r1.mo37181a(r2, r3, r4, r5, r6)
            goto L_0x05f4
        L_0x04b4:
            r11 = r6
            boolean r2 = r1 instanceof p276y9.C26628c
            if (r2 == 0) goto L_0x0534
            ze.j$b r13 = p425ze.C91672j.C91674b.STATIC_FIELD
            y9.c r1 = (p276y9.C26628c) r1
            ze.d r2 = r7.f67824a
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, ze.e>> r2 = r2.f74231e
            java.lang.String r3 = r1.f74070h
            java.lang.Object r2 = r2.get(r3)
            r14 = r2
            java.util.Map r14 = (java.util.Map) r14
            java.util.Map r1 = r1.mo53615h()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r17 = r1.iterator()
        L_0x04d8:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x05f4
            java.lang.Object r1 = r17.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            y9.d r2 = (p276y9.C23280d) r2
            y9.o r3 = r2.f66911a
            y9.o r4 = p276y9.C23282o.OBJECT
            if (r3 == r4) goto L_0x04f1
            goto L_0x04d8
        L_0x04f1:
            java.lang.String r6 = r2.f66912b
            java.lang.String r2 = "$staticOverhead"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x04fc
            goto L_0x04d8
        L_0x04fc:
            java.lang.Object r1 = r1.getValue()
            r18 = r1
            y9.h r18 = (p276y9.C26632h) r18
            if (r14 == 0) goto L_0x0523
            java.lang.Object r1 = r14.get(r6)
            r2 = r1
            ze.e r2 = (p425ze.C26702e) r2
            if (r2 == 0) goto L_0x0523
            boolean r1 = r2.f74242d
            if (r1 != 0) goto L_0x051f
            r1 = r7
            r3 = r9
            r4 = r18
            r5 = r6
            r19 = r6
            r6 = r13
            r1.mo37181a(r2, r3, r4, r5, r6)
            goto L_0x0521
        L_0x051f:
            r19 = r6
        L_0x0521:
            r5 = 0
            goto L_0x0526
        L_0x0523:
            r19 = r6
            r5 = 1
        L_0x0526:
            if (r5 == 0) goto L_0x04d8
            r2 = 0
            r1 = r7
            r3 = r9
            r4 = r18
            r5 = r19
            r6 = r13
            r1.mo37181a(r2, r3, r4, r5, r6)
            goto L_0x04d8
        L_0x0534:
            boolean r2 = r1 instanceof p276y9.C26627b
            if (r2 == 0) goto L_0x05bc
            y9.b r1 = (p276y9.C26627b) r1
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            y9.c r2 = r1.mo53605b()
            r14 = 0
        L_0x0544:
            if (r2 == 0) goto L_0x0571
            ze.d r3 = r7.f67824a
            java.util.Map<java.lang.String, ze.e> r3 = r3.f74233g
            java.lang.String r4 = r2.f74070h
            java.lang.Object r3 = r3.get(r4)
            ze.e r3 = (p425ze.C26702e) r3
            if (r3 == 0) goto L_0x055b
            if (r14 == 0) goto L_0x055a
            boolean r4 = r14.f74242d
            if (r4 != 0) goto L_0x055b
        L_0x055a:
            r14 = r3
        L_0x055b:
            ze.d r3 = r7.f67824a
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, ze.e>> r3 = r3.f74230d
            java.lang.String r4 = r2.f74070h
            java.lang.Object r3 = r3.get(r4)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x056c
            r13.putAll(r3)
        L_0x056c:
            y9.c r2 = r2.mo53617i()
            goto L_0x0544
        L_0x0571:
            if (r14 == 0) goto L_0x0579
            boolean r2 = r14.f74242d
            if (r2 == 0) goto L_0x0579
            goto L_0x05f4
        L_0x0579:
            java.util.List r1 = r1.mo53610g()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r17 = r1.iterator()
        L_0x0583:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x05f4
            java.lang.Object r1 = r17.next()
            y9.b$a r1 = (p276y9.C26627b.C23279a) r1
            y9.d r2 = r1.f66909a
            y9.o r3 = r2.f66911a
            y9.o r4 = p276y9.C23282o.OBJECT
            if (r3 == r4) goto L_0x0598
            goto L_0x0583
        L_0x0598:
            java.lang.Object r1 = r1.f66910b
            r4 = r1
            y9.h r4 = (p276y9.C26632h) r4
            java.lang.String r5 = r2.f66912b
            java.lang.Object r1 = r13.get(r5)
            ze.e r1 = (p425ze.C26702e) r1
            if (r1 == 0) goto L_0x05b3
            if (r14 == 0) goto L_0x05b1
            boolean r2 = r1.f74242d
            if (r2 == 0) goto L_0x05b3
            boolean r2 = r14.f74242d
            if (r2 != 0) goto L_0x05b3
        L_0x05b1:
            r2 = r1
            goto L_0x05b4
        L_0x05b3:
            r2 = r14
        L_0x05b4:
            ze.j$b r6 = p425ze.C91672j.C91674b.INSTANCE_FIELD
            r1 = r7
            r3 = r9
            r1.mo37181a(r2, r3, r4, r5, r6)
            goto L_0x0583
        L_0x05bc:
            boolean r2 = r1 instanceof p276y9.C26626a
            if (r2 == 0) goto L_0x0602
            y9.a r1 = (p276y9.C26626a) r1
            y9.o r2 = r1.f74066h
            y9.o r3 = p276y9.C23282o.OBJECT
            if (r2 != r3) goto L_0x05f4
            java.lang.Object[] r13 = r1.mo53608h()
            r14 = 0
        L_0x05cd:
            int r1 = r13.length
            if (r14 >= r1) goto L_0x05f4
            r1 = r13[r14]
            r4 = r1
            y9.h r4 = (p276y9.C26632h) r4
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            r1.append(r14)
            java.lang.String r3 = "]"
            r1.append(r3)
            java.lang.String r5 = r1.toString()
            ze.j$b r6 = p425ze.C91672j.C91674b.ARRAY_ENTRY
            r1 = r7
            r3 = r9
            r1.mo37181a(r2, r3, r4, r5, r6)
            int r14 = r14 + 1
            goto L_0x05cd
        L_0x05f4:
            r8 = r28
            r0 = r32
            r6 = r11
            r18 = r15
            r11 = r27
            r13 = 0
            r14 = 1
            r15 = 0
            goto L_0x0115
        L_0x0602:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected type for "
            r1.append(r2)
            y9.h r2 = r9.f74246b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x061b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected node to have an exclusion "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p423ye.C26638a.mo53645a(long, y9.k, y9.h):ze.a");
    }

    /* renamed from: b */
    public final C26632h mo53646b(String str, C26635k kVar) {
        C26628c c = kVar.mo53636c("com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo");
        if (c != null) {
            ArrayList arrayList = new ArrayList();
            C23628g<C26628c.C26629a> gVar = c.f74076q;
            int i = gVar.f67798d;
            Object[] objArr = new Object[i];
            V[] vArr = gVar.f67810i;
            int length = vArr.length;
            int i2 = 0;
            while (true) {
                int i3 = length - 1;
                if (length <= 0) {
                    break;
                }
                if (C23628g.m28248u(vArr, i3)) {
                    int i4 = i2 + 1;
                    V v = vArr[i3];
                    if (v == C23632k.f67820o) {
                        v = null;
                    }
                    objArr[i2] = v;
                    i2 = i4;
                }
                length = i3;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 += ((ArrayList) ((C26628c.C26629a) objArr[i6]).f74078a).size();
            }
            ArrayList arrayList2 = new ArrayList(i5);
            C23628g<C26628c.C26629a> gVar2 = c.f74076q;
            int i7 = gVar2.f67798d;
            int[] iArr = new int[i7];
            int[] iArr2 = gVar2.f67811j;
            V[] vArr2 = gVar2.f67810i;
            int length2 = iArr2.length;
            int i8 = 0;
            while (true) {
                int i9 = length2 - 1;
                if (length2 <= 0) {
                    break;
                }
                if (C23628g.m28248u(vArr2, i9)) {
                    iArr[i8] = iArr2[i9];
                    i8++;
                }
                length2 = i9;
            }
            for (int i15 = 0; i15 < i7; i15++) {
                C26628c.C26629a aVar = c.f74076q.get(iArr[i15]);
                arrayList2.addAll(aVar == null ? new ArrayList(0) : aVar.f74078a);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Set<String> set = C23281e.f66913a;
                List<C26627b.C23279a> g = ((C26627b) ((C26632h) it.next())).mo53610g();
                String a = C23281e.m27761a(C23281e.m27762b(g, "mKey"));
                if (a.equals(str)) {
                    C26632h hVar = (C26632h) C23281e.m27762b(g, "mActivityRef");
                    if (hVar != null) {
                        return (C26632h) C23281e.m27762b(((C26627b) hVar).mo53610g(), "referent");
                    }
                } else {
                    arrayList.add(a);
                }
            }
            throw new IllegalStateException("Could not find weak reference with key " + str + " in " + arrayList);
        }
        throw new IllegalStateException("Unabled to find destroy activity info class with name: com.tencent.matrix.resource.analyzer.model.DestroyedActivityInfo");
    }
}
