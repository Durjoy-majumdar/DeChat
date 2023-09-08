package wa3;

import java.util.LinkedList;
import java.util.List;
import xa3.C102599o;

/* renamed from: wa3.l */
public class C102372l {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static wa3.C102372l.C102373a m135093a(java.lang.Object r11, java.lang.String r12, java.util.List<java.lang.String> r13, boolean r14) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x000c:
            int r5 = r13.size()
            java.lang.String r6 = "<ThisisNoteNodeObjDivStart>"
            java.lang.String r7 = "<ThisisNoteNodeObj>"
            r8 = 1
            if (r3 >= r5) goto L_0x0042
            java.lang.Object r5 = r13.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r9 = r5.trim()
            java.lang.String r10 = "div"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x002b
            r4 = 1
            goto L_0x003f
        L_0x002b:
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = r5.trim()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x003b
            r1.add(r6)
            goto L_0x003e
        L_0x003b:
            r1.add(r5)
        L_0x003e:
            r4 = 0
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0042:
            bb3.f r13 = bb3.C28293f.f77884a
            boolean r13 = r13.mo55909a()
            java.lang.String r3 = "MicroMsg.WNNoteLogic"
            if (r13 != 0) goto L_0x004d
            goto L_0x006d
        L_0x004d:
            java.lang.String r13 = "head"
            java.util.Map r12 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r12, r13, r0)     // Catch:{ all -> 0x0064 }
            if (r12 == 0) goto L_0x006d
            java.lang.String r13 = ".head.$image-show-type"
            java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x0064 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0064 }
            java.lang.String r13 = "1"
            boolean r12 = r13.equals(r12)     // Catch:{ all -> 0x0064 }
            goto L_0x006e
        L_0x0064:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.String r0 = "parse head err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r12, r0, r13)
        L_0x006d:
            r12 = 0
        L_0x006e:
            java.util.List r11 = (java.util.List) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r0 = r11.iterator()
        L_0x0079:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r0.next()
            xa3.c r4 = (xa3.C102587c) r4
            int r5 = r4.mo142212c()
            if (r5 == r8) goto L_0x0079
            xa3.o r4 = (xa3.C102599o) r4
            r13.add(r4)
            goto L_0x0079
        L_0x0091:
            r0 = 0
        L_0x0092:
            int r4 = r1.size()
            if (r0 >= r4) goto L_0x0119
            java.lang.Object r4 = r1.get(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r4.trim()
            java.lang.String r9 = "<ThisisNoteNodeHrObj>"
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L_0x00c1
            xa3.h r4 = new xa3.h
            r4.<init>()
            r4.f302071b = r2
            r4.f302077h = r2
            int r5 = r13.size()
            if (r0 >= r5) goto L_0x00bd
            r13.add(r0, r4)
            goto L_0x0115
        L_0x00bd:
            r13.add(r4)
            goto L_0x0115
        L_0x00c1:
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00da
            int r4 = r13.size()
            if (r0 >= r4) goto L_0x0115
            java.lang.Object r4 = r13.get(r0)
            xa3.o r4 = (xa3.C102599o) r4
            r4.f302082m = r8
            goto L_0x0115
        L_0x00da:
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0115
            xa3.i r5 = new xa3.i
            r5.<init>()
            r5.f302126s = r4
            r5.f302071b = r2
            r5.f302077h = r2
            java.lang.String r4 = r5.toString()
            r9 = 18
            java.lang.String r4 = wa3.C102368h.m135071b(r4, r9)
            r5.f302070a = r4
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r4[r2] = r9
            java.lang.String r9 = "insert text index:%s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r9, r4)
            int r4 = r13.size()
            if (r0 >= r4) goto L_0x0112
            r13.add(r0, r5)
            goto L_0x0115
        L_0x0112:
            r13.add(r5)
        L_0x0115:
            int r0 = r0 + 1
            goto L_0x0092
        L_0x0119:
            if (r14 == 0) goto L_0x0121
            r11.clear()
            r11.addAll(r13)
        L_0x0121:
            wa3.l$a r11 = new wa3.l$a
            r11.<init>(r13, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.C102372l.m135093a(java.lang.Object, java.lang.String, java.util.List, boolean):wa3.l$a");
    }

    /* renamed from: wa3.l$a */
    public static class C102373a {

        /* renamed from: a */
        public List<C102599o> f301503a;

        /* renamed from: b */
        public boolean f301504b;

        public C102373a() {
            this.f301503a = new LinkedList();
        }

        public String toString() {
            return "Struct{dataItems=" + this.f301503a.size() + ", isSmallPicMode=" + this.f301504b + '}';
        }

        public C102373a(List<C102599o> list, boolean z) {
            this.f301503a = list;
            this.f301504b = z;
        }
    }
}
