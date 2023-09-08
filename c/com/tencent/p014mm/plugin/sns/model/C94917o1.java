package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.model.o1 */
public class C94917o1<K, O> {

    /* renamed from: a */
    public Map<K, C94917o1<K, O>.c<O>> f275076a = null;

    /* renamed from: b */
    public int f275077b;

    /* renamed from: c */
    public C94919b f275078c = null;

    /* renamed from: com.tencent.mm.plugin.sns.model.o1$a */
    public class C94918a implements Comparator<Map.Entry<K, C94917o1<K, O>.c<O>>> {
        public C94918a(C94917o1 o1Var) {
        }

        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
            int compareTo = ((C94920c) ((Map.Entry) obj).getValue()).f275080b.compareTo(((C94920c) ((Map.Entry) obj2).getValue()).f275080b);
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsLRUMap$1");
            return compareTo;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o1$b */
    public interface C94919b {
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o1$c */
    public class C94920c<OO> {

        /* renamed from: a */
        public OO f275079a;

        /* renamed from: b */
        public Long f275080b;

        public C94920c(C94917o1 o1Var, OO oo) {
            this.f275079a = oo;
            mo131180a();
        }

        /* renamed from: a */
        public void mo131180a() {
            SnsMethodCalculate.markStartTimeMs("UpTime", "com.tencent.mm.plugin.sns.model.SnsLRUMap$TimeVal");
            this.f275080b = Long.valueOf(System.currentTimeMillis());
            SnsMethodCalculate.markEndTimeMs("UpTime", "com.tencent.mm.plugin.sns.model.SnsLRUMap$TimeVal");
        }
    }

    public C94917o1(int i, C94919b bVar) {
        this.f275077b = i;
        this.f275076a = new HashMap();
        this.f275078c = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x027f A[LOOP:0: B:7:0x0040->B:71:0x027f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0289 A[EDGE_INSN: B:76:0x0289->B:73:0x0289 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo131178a() {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "tryToRecycle"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsLRUMap"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r0 = r1.f275076a
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            int r4 = r1.f275077b
            if (r0 <= r4) goto L_0x0287
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r4 = r1.f275076a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.util.Set r4 = r4.entrySet()
            r0.<init>(r4)
            com.tencent.mm.plugin.sns.model.o1$a r4 = new com.tencent.mm.plugin.sns.model.o1$a
            r4.<init>(r1)
            java.util.Collections.sort(r0, r4)
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r4 = r1.f275076a
            java.util.HashMap r4 = (java.util.HashMap) r4
            int r4 = r4.size()
            int r5 = r1.f275077b
            int r4 = r4 - r5
            if (r4 > 0) goto L_0x003c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x003c:
            java.util.Iterator r5 = r0.iterator()
        L_0x0040:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0287
            java.lang.Object r0 = r5.next()
            r6 = r0
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            java.lang.String r7 = "remove"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            com.tencent.mm.plugin.sns.model.o1$b r8 = r1.f275078c
            com.tencent.mm.plugin.sns.model.r r8 = (com.tencent.p014mm.plugin.sns.model.C94940r) r8
            r8.getClass()
            java.lang.String r9 = "removeObj"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$3"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            r11 = r0
            java.lang.String r11 = (java.lang.String) r11
            com.tencent.mm.plugin.sns.model.o r0 = r8.f275153a
            java.lang.String r12 = "access$000"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r0.getClass()
            java.lang.String r14 = "checkRecycle"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r13)
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.sns.model.o$j> r15 = r0.f275003i
            java.lang.String r1 = "MicroMsg.LazyerImageLoader2"
            r16 = 1
            r17 = r5
            if (r15 == 0) goto L_0x012f
            int r15 = r15.size()
            if (r15 != 0) goto L_0x008c
            goto L_0x012f
        L_0x008c:
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<java.lang.Object>> r15 = r0.f274999e
            java.util.concurrent.ConcurrentHashMap r15 = (java.util.concurrent.ConcurrentHashMap) r15
            java.util.Set r15 = r15.keySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0098:
            boolean r18 = r15.hasNext()
            if (r18 == 0) goto L_0x00fb
            java.lang.Object r18 = r15.next()
            java.lang.Integer r18 = (java.lang.Integer) r18
            int r5 = r18.intValue()
            r18 = r15
            java.util.Map<java.lang.Integer, java.lang.ref.WeakReference<java.lang.Object>> r15 = r0.f274999e
            r19 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap r15 = (java.util.concurrent.ConcurrentHashMap) r15
            java.lang.Object r2 = r15.get(r2)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x00f6
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.sns.model.o$j> r2 = r0.f275003i
            java.util.Iterator r2 = r2.iterator()
        L_0x00c6:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L_0x00f6
            java.lang.Object r15 = r2.next()
            com.tencent.mm.plugin.sns.model.o$j r15 = (com.tencent.p014mm.plugin.sns.model.C94901o.C94913j) r15
            r20 = r2
            int r2 = r15.f275052b
            if (r2 != r5) goto L_0x00f3
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.sns.model.o$j> r2 = r0.f275003i
            r2.remove(r15)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r15 = "remove code ok rCode: "
            r2.append(r15)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
            goto L_0x00f6
        L_0x00f3:
            r2 = r20
            goto L_0x00c6
        L_0x00f6:
            r15 = r18
            r2 = r19
            goto L_0x0098
        L_0x00fb:
            r19 = r2
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.sns.model.o$j> r0 = r0.f275003i
            java.util.Iterator r0 = r0.iterator()
        L_0x0103:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x012b
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.sns.model.o$j r2 = (com.tencent.p014mm.plugin.sns.model.C94901o.C94913j) r2
            if (r11 == 0) goto L_0x0103
            r2.getClass()
            java.lang.String r5 = "getId"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r15)
            java.lang.String r2 = r2.f275051a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r15)
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0103
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            r0 = 0
            goto L_0x0135
        L_0x012b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
            goto L_0x0134
        L_0x012f:
            r19 = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
        L_0x0134:
            r0 = 1
        L_0x0135:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            java.lang.String r2 = "MicroMsg.SnsLRUMap"
            if (r0 == 0) goto L_0x0251
            com.tencent.mm.plugin.sns.model.o r0 = r8.f275153a
            java.lang.String r5 = "access$100"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            com.tencent.mm.plugin.sns.model.o1<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r12 = r0.f274998d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            r12.getClass()
            java.lang.String r14 = "forceRemove"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r3)
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r0 = r12.f275076a     // Catch:{ Exception -> 0x01a5 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x01a5 }
            com.tencent.mm.plugin.sns.model.o1$c r0 = (com.tencent.p014mm.plugin.sns.model.C94917o1.C94920c) r0     // Catch:{ Exception -> 0x01a5 }
            OO r0 = r0.f275079a     // Catch:{ Exception -> 0x01a5 }
            boolean r15 = r0 instanceof android.graphics.Bitmap     // Catch:{ Exception -> 0x01a5 }
            if (r15 == 0) goto L_0x0164
            r15 = r0
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15     // Catch:{ Exception -> 0x01a5 }
            goto L_0x017d
        L_0x0164:
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r0 = r12.f275076a     // Catch:{ Exception -> 0x01a5 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ Exception -> 0x01a5 }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Exception -> 0x01a5 }
            com.tencent.mm.plugin.sns.model.o1$c r0 = (com.tencent.p014mm.plugin.sns.model.C94917o1.C94920c) r0     // Catch:{ Exception -> 0x01a5 }
            OO r0 = r0.f275079a     // Catch:{ Exception -> 0x01a5 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ Exception -> 0x01a5 }
            if (r0 == 0) goto L_0x017c
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01a5 }
            r15 = r0
            android.graphics.Bitmap r15 = (android.graphics.Bitmap) r15     // Catch:{ Exception -> 0x01a5 }
            goto L_0x017d
        L_0x017c:
            r15 = 0
        L_0x017d:
            if (r15 == 0) goto L_0x01a2
            boolean r0 = r15.isRecycled()     // Catch:{ Exception -> 0x01a5 }
            if (r0 != 0) goto L_0x01a2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a5 }
            r0.<init>()     // Catch:{ Exception -> 0x01a5 }
            r18 = r4
            java.lang.String r4 = "remove key:"
            r0.append(r4)     // Catch:{ Exception -> 0x01a0 }
            r0.append(r11)     // Catch:{ Exception -> 0x01a0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)     // Catch:{ Exception -> 0x01a0 }
            r15.recycle()     // Catch:{ Exception -> 0x01a0 }
            goto L_0x01b5
        L_0x01a0:
            r0 = move-exception
            goto L_0x01a8
        L_0x01a2:
            r18 = r4
            goto L_0x01b5
        L_0x01a5:
            r0 = move-exception
            r18 = r4
        L_0x01a8:
            r4 = 0
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r15)
            java.lang.String r0 = "can not recycled forceRemove "
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
        L_0x01b5:
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r0 = r12.f275076a
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r4 = r12.f275076a
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.remove(r11)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r20 = r6
            java.lang.String r6 = "internalMap "
            r15.append(r6)
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r6 = r12.f275076a
            java.util.HashMap r6 = (java.util.HashMap) r6
            int r6 = r6.size()
            r15.append(r6)
            java.lang.String r6 = " bfSize :"
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = " o == null "
            r15.append(r0)
            if (r4 == 0) goto L_0x01ed
            r0 = 1
            goto L_0x01ee
        L_0x01ed:
            r0 = 0
        L_0x01ee:
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "keys "
            r0.append(r4)
            r0.append(r11)
            java.lang.String r4 = " deRef ok  Big:size:"
            r0.append(r4)
            com.tencent.mm.plugin.sns.model.o r4 = r8.f275153a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            com.tencent.mm.plugin.sns.model.o1<java.lang.String, java.lang.ref.WeakReference<android.graphics.Bitmap>> r4 = r4.f274998d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            r4.getClass()
            java.lang.String r5 = "getSize"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            java.util.Map<K, com.tencent.mm.plugin.sns.model.o1<K, O>$c<O>> r4 = r4.f275076a
            java.util.HashMap r4 = (java.util.HashMap) r4
            int r4 = r4.size()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            r0.append(r4)
            java.lang.String r4 = " listPaitSize:"
            r0.append(r4)
            com.tencent.mm.plugin.sns.model.o r4 = r8.f275153a
            java.lang.String r5 = "access$200"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            java.util.concurrent.CopyOnWriteArraySet<com.tencent.mm.plugin.sns.model.o$j> r4 = r4.f275003i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r13)
            int r4 = r4.size()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            goto L_0x025a
        L_0x0251:
            r18 = r4
            r20 = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            r16 = 0
        L_0x025a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            if (r16 == 0) goto L_0x027a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " remove targetKey: "
            r0.append(r1)
            java.lang.Object r1 = r20.getKey()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            int r4 = r18 + -1
            goto L_0x027c
        L_0x027a:
            r4 = r18
        L_0x027c:
            if (r4 > 0) goto L_0x027f
            goto L_0x0289
        L_0x027f:
            r1 = r21
            r5 = r17
            r2 = r19
            goto L_0x0040
        L_0x0287:
            r19 = r2
        L_0x0289:
            r1 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94917o1.mo131178a():void");
    }
}
