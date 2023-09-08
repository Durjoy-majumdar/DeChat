package p1035sf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import p1023pf.C89350a;

/* renamed from: sf.b */
public class C90179b {

    /* renamed from: sf.b$a */
    public class C90180a implements Comparator<C89350a> {
        public int compare(Object obj, Object obj2) {
            C89350a aVar = (C89350a) obj;
            C89350a aVar2 = (C89350a) obj2;
            return Integer.compare((aVar2.f257330c + 1) * aVar2.f257329b, (aVar.f257330c + 1) * aVar.f257329b);
        }
    }

    /* renamed from: sf.b$b */
    public interface C90181b {
        /* renamed from: a */
        int mo124261a();

        /* renamed from: b */
        boolean mo124262b(long j, int i);

        /* renamed from: c */
        void mo124263c(List<C89350a> list, int i);
    }

    /* renamed from: sf.b$c */
    public static final class C90182c {

        /* renamed from: a */
        public C89350a f258900a;

        /* renamed from: b */
        public C90182c f258901b;

        /* renamed from: c */
        public LinkedList<C90182c> f258902c = new LinkedList<>();

        public C90182c(C89350a aVar, C90182c cVar) {
            this.f258900a = aVar;
            this.f258901b = cVar;
        }
    }

    /* renamed from: a */
    public static int m112844a(LinkedList<C89350a> linkedList, C89350a aVar) {
        int i;
        if (AppMethodBeat.isDev) {
            Objects.toString(aVar);
        }
        C89350a aVar2 = null;
        if (!linkedList.isEmpty()) {
            aVar2 = linkedList.peek();
        }
        if (aVar2 == null || aVar2.f257328a != aVar.f257328a || aVar2.f257330c != (i = aVar.f257330c) || i == 0) {
            linkedList.push(aVar);
            return aVar.f257329b;
        }
        int i2 = aVar.f257329b;
        if (i2 == 5000) {
            i2 = aVar2.f257329b;
        }
        aVar.f257329b = i2;
        aVar2.f257331d++;
        int i3 = (int) (((long) aVar2.f257329b) + ((long) i2));
        aVar2.f257329b = i3;
        return i3;
    }

    /* renamed from: b */
    public static String m112845b(List<C89350a> list, long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = (long) (((float) j) * 0.3f);
        LinkedList linkedList = new LinkedList();
        for (C89350a next : list) {
            if (((long) next.f257329b) >= j2) {
                linkedList.add(next);
            }
        }
        Collections.sort(linkedList, new C90180a());
        if (linkedList.isEmpty() && !list.isEmpty()) {
            linkedList.add(list.get(0));
        } else if (linkedList.size() > 1 && ((C89350a) linkedList.peek()).f257328a == 1048574) {
            linkedList.removeFirst();
        }
        Iterator it = linkedList.iterator();
        if (it.hasNext()) {
            sb.append(((C89350a) it.next()).f257328a + "|");
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static long m112846c(LinkedList<C89350a> linkedList, StringBuilder sb, StringBuilder sb4) {
        sb4.append("|*\t\tTraceStack:");
        sb4.append("\n");
        sb4.append("|*\t\t[id count cost]");
        sb4.append("\n");
        Iterator<C89350a> it = linkedList.iterator();
        long j = 0;
        while (it.hasNext()) {
            C89350a next = it.next();
            sb.append(next.toString());
            sb.append(10);
            sb4.append("|*\t\t");
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < next.f257330c; i++) {
                stringBuffer.append('.');
            }
            sb4.append(stringBuffer.toString() + next.f257328a + " " + next.f257331d + " " + next.f257329b);
            sb4.append(10);
            int i2 = next.f257329b;
            if (j < ((long) i2)) {
                j = (long) i2;
            }
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m112847d(long[] r30, java.util.LinkedList<p1023pf.C89350a> r31, boolean r32, long r33) {
        /*
            r0 = r30
            r1 = r31
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = r32 ^ 1
            int r4 = r0.length
            r6 = 0
            r7 = 0
        L_0x000e:
            r8 = 2
            java.lang.String r9 = "Matrix.TraceDataUtils"
            r12 = 1
            r14 = 63
            r15 = 1048575(0xfffff, double:5.18065E-318)
            r17 = 43
            r10 = 1
            if (r6 >= r4) goto L_0x0133
            r20 = r0[r6]
            r22 = 0
            int r11 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r11 != 0) goto L_0x0029
            r27 = r6
            goto L_0x012f
        L_0x0029:
            r11 = 1048574(0xffffe, float:1.469365E-39)
            if (r32 == 0) goto L_0x004e
            long r24 = r20 >> r14
            long r24 = r24 & r12
            int r26 = (r24 > r12 ? 1 : (r24 == r12 ? 0 : -1))
            if (r26 != 0) goto L_0x0039
            r24 = 1
            goto L_0x003b
        L_0x0039:
            r24 = 0
        L_0x003b:
            if (r24 == 0) goto L_0x0048
            long r24 = r20 >> r17
            r27 = r6
            long r5 = r24 & r15
            int r6 = (int) r5
            if (r11 != r6) goto L_0x004a
            r3 = 1
            goto L_0x004a
        L_0x0048:
            r27 = r6
        L_0x004a:
            if (r3 != 0) goto L_0x0050
            goto L_0x012f
        L_0x004e:
            r27 = r6
        L_0x0050:
            long r5 = r20 >> r14
            long r5 = r5 & r12
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0059
            r5 = 1
            goto L_0x005a
        L_0x0059:
            r5 = 0
        L_0x005a:
            if (r5 == 0) goto L_0x0073
            long r5 = r20 >> r17
            long r5 = r5 & r15
            int r6 = (int) r5
            long r5 = (long) r6
            r8 = 1048574(0xffffe, double:5.180644E-318)
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x0069
            r7 = 0
        L_0x0069:
            int r7 = r7 + r10
            java.lang.Long r5 = java.lang.Long.valueOf(r20)
            r2.push(r5)
            goto L_0x012f
        L_0x0073:
            long r5 = r20 >> r17
            long r5 = r5 & r15
            int r6 = (int) r5
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x0121
            java.lang.Object r5 = r2.pop()
            java.lang.Long r5 = (java.lang.Long) r5
            long r12 = r5.longValue()
            int r7 = r7 + -1
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            r5.add(r14)
        L_0x0095:
            long r24 = r12 >> r17
            r28 = r12
            long r11 = r24 & r15
            int r12 = (int) r11
            if (r12 == r6) goto L_0x00d0
            boolean r11 = r2.isEmpty()
            if (r11 != 0) goto L_0x00d0
            java.lang.Object[] r11 = new java.lang.Object[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 0
            r11[r13] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11[r10] = r12
            java.lang.String r12 = "pop inMethodId[%s] to continue match ouMethodId[%s]"
            p723vf.C118672d.m167356f(r9, r12, r11)
            java.lang.Object r11 = r2.pop()
            java.lang.Long r11 = (java.lang.Long) r11
            long r12 = r11.longValue()
            int r7 = r7 + -1
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            r5.add(r11)
            r11 = 1048574(0xffffe, float:1.469365E-39)
            goto L_0x0095
        L_0x00d0:
            if (r12 == r6) goto L_0x00f4
            r11 = 1048574(0xffffe, float:1.469365E-39)
            if (r12 != r11) goto L_0x00f4
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r12 = 0
            r8[r12] = r11
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8[r10] = r6
            java.lang.String r6 = "inMethodId[%s] != outMethodId[%s] throw this outMethodId!"
            p723vf.C118672d.m167352b(r9, r6, r8)
            r2.addAll(r5)
            int r5 = r2.size()
            int r7 = r7 + r5
            goto L_0x012f
        L_0x00f4:
            r11 = 8796093022207(0x7ffffffffff, double:4.3458473798964E-311)
            long r13 = r20 & r11
            long r11 = r28 & r11
            long r13 = r13 - r11
            int r5 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
            if (r5 >= 0) goto L_0x0117
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r4 = 0
            r0[r4] = r3
            java.lang.String r3 = "[structuredDataToStack] trace during invalid:%d"
            p723vf.C118672d.m167352b(r9, r3, r0)
            r2.clear()
            r31.clear()
            return
        L_0x0117:
            pf.a r5 = new pf.a
            int r8 = (int) r13
            r5.<init>(r6, r8, r7)
            m112844a(r1, r5)
            goto L_0x012f
        L_0x0121:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 0
            r5[r8] = r6
            java.lang.String r6 = "[structuredDataToStack] method[%s] not found in! "
            p723vf.C118672d.m167356f(r9, r6, r5)
        L_0x012f:
            int r6 = r27 + 1
            goto L_0x000e
        L_0x0133:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x01b0
            if (r32 == 0) goto L_0x01b0
            java.lang.Object r0 = r2.pop()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            long r5 = r3 >> r17
            long r5 = r5 & r15
            int r0 = (int) r5
            long r5 = r3 >> r14
            long r5 = r5 & r12
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x0152
            r5 = 1
            goto L_0x0153
        L_0x0152:
            r5 = 0
        L_0x0153:
            r6 = 8796093022207(0x7ffffffffff, double:4.3458473798964E-311)
            long r3 = r3 & r6
            long r18 = com.tencent.matrix.trace.core.AppMethodBeat.getDiffTime()
            long r3 = r3 + r18
            r11 = 5
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r19 = 0
            r11[r19] = r18
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r5)
            r11[r10] = r18
            java.lang.Long r18 = java.lang.Long.valueOf(r3)
            r11[r8] = r18
            r18 = 3
            java.lang.Long r19 = java.lang.Long.valueOf(r33)
            r11[r18] = r19
            r18 = 4
            int r19 = r2.size()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r11[r18] = r19
            java.lang.String r6 = "[structuredDataToStack] has never out method[%s], isIn:%s, inTime:%s, endTime:%s,rawData size:%s"
            p723vf.C118672d.m167356f(r9, r6, r11)
            if (r5 != 0) goto L_0x01a0
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4 = 0
            r3[r4] = r0
            java.lang.String r0 = "[structuredDataToStack] why has out Method[%s]? is wrong! "
            p723vf.C118672d.m167352b(r9, r0, r3)
            goto L_0x0133
        L_0x01a0:
            pf.a r5 = new pf.a
            long r3 = r33 - r3
            int r4 = (int) r3
            int r3 = r2.size()
            r5.<init>(r0, r4, r3)
            m112844a(r1, r5)
            goto L_0x0133
        L_0x01b0:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2 = 0
            java.util.ListIterator r3 = r1.listIterator(r2)
            r2 = 0
            r13 = 0
        L_0x01bc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0226
            sf.b$c r4 = new sf.b$c
            java.lang.Object r5 = r3.next()
            pf.a r5 = (p1023pf.C89350a) r5
            r4.<init>(r5, r2)
            int r13 = r13 + 1
            if (r2 != 0) goto L_0x01e5
            pf.a r5 = r4.f258900a
            if (r5 != 0) goto L_0x01d7
            r5 = 0
            goto L_0x01d9
        L_0x01d7:
            int r5 = r5.f257330c
        L_0x01d9:
            if (r5 == 0) goto L_0x01e5
            r5 = 0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = "[stackToTree] begin error! why the first node'depth is not 0!"
            p723vf.C118672d.m167352b(r9, r3, r2)
            r13 = 0
            goto L_0x0226
        L_0x01e5:
            pf.a r5 = r4.f258900a
            if (r5 != 0) goto L_0x01eb
            r5 = 0
            goto L_0x01ed
        L_0x01eb:
            int r5 = r5.f257330c
        L_0x01ed:
            if (r2 == 0) goto L_0x0221
            if (r5 != 0) goto L_0x01f2
            goto L_0x0221
        L_0x01f2:
            pf.a r6 = r2.f258900a
            if (r6 != 0) goto L_0x01f8
            r6 = 0
            goto L_0x01fa
        L_0x01f8:
            int r6 = r6.f257330c
        L_0x01fa:
            if (r6 < r5) goto L_0x021b
        L_0x01fc:
            if (r2 == 0) goto L_0x020b
            pf.a r6 = r2.f258900a
            if (r6 != 0) goto L_0x0204
            r6 = 0
            goto L_0x0206
        L_0x0204:
            int r6 = r6.f257330c
        L_0x0206:
            if (r6 <= r5) goto L_0x020b
            sf.b$c r2 = r2.f258901b
            goto L_0x01fc
        L_0x020b:
            if (r2 == 0) goto L_0x0224
            sf.b$c r5 = r2.f258901b
            if (r5 == 0) goto L_0x0224
            r4.f258901b = r5
            sf.b$c r2 = r2.f258901b
            java.util.LinkedList<sf.b$c> r2 = r2.f258902c
            r2.addFirst(r4)
            goto L_0x0224
        L_0x021b:
            java.util.LinkedList<sf.b$c> r2 = r2.f258902c
            r2.addFirst(r4)
            goto L_0x0224
        L_0x0221:
            r0.addFirst(r4)
        L_0x0224:
            r2 = r4
            goto L_0x01bc
        L_0x0226:
            java.lang.Object[] r2 = new java.lang.Object[r10]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "stackToTree: count=%s"
            p723vf.C118672d.m167353c(r9, r3, r2)
            r31.clear()
            r5 = 0
        L_0x0239:
            int r2 = r0.size()
            if (r5 >= r2) goto L_0x025d
            java.lang.Object r2 = r0.get(r5)
            sf.b$c r2 = (p1035sf.C90179b.C90182c) r2
            if (r2 != 0) goto L_0x0248
            goto L_0x025a
        L_0x0248:
            pf.a r3 = r2.f258900a
            if (r3 == 0) goto L_0x024f
            r1.add(r3)
        L_0x024f:
            java.util.LinkedList<sf.b$c> r3 = r2.f258902c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x025a
            m112848e(r2, r1)
        L_0x025a:
            int r5 = r5 + 1
            goto L_0x0239
        L_0x025d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1035sf.C90179b.m112847d(long[], java.util.LinkedList, boolean, long):void");
    }

    /* renamed from: e */
    public static void m112848e(C90182c cVar, LinkedList<C89350a> linkedList) {
        for (int i = 0; i < cVar.f258902c.size(); i++) {
            C90182c cVar2 = cVar.f258902c.get(i);
            if (cVar2 != null) {
                C89350a aVar = cVar2.f258900a;
                if (aVar != null) {
                    linkedList.add(aVar);
                }
                if (!cVar2.f258902c.isEmpty()) {
                    m112848e(cVar2, linkedList);
                }
            }
        }
    }

    /* renamed from: f */
    public static void m112849f(List<C89350a> list, int i, C90181b bVar) {
        if (i < 0) {
            list.clear();
            return;
        }
        int size = list.size();
        int i2 = 1;
        while (size > i) {
            ListIterator<C89350a> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (bVar.mo124262b((long) listIterator.previous().f257329b, i2)) {
                    listIterator.remove();
                    size--;
                    if (size <= i) {
                        return;
                    }
                }
            }
            size = list.size();
            i2++;
            if (bVar.mo124261a() < i2) {
                break;
            }
        }
        int size2 = list.size();
        if (size2 > i) {
            bVar.mo124263c(list, size2);
        }
    }
}
