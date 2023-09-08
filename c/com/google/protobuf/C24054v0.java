package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.v0 */
public abstract class C24054v0 {

    /* renamed from: a */
    public static final C24054v0 f69180a = new C24056b((C24055a) null);

    /* renamed from: b */
    public static final C24054v0 f69181b = new C24057c((C24055a) null);

    /* renamed from: com.google.protobuf.v0$b */
    public static final class C24056b extends C24054v0 {

        /* renamed from: c */
        public static final Class<?> f69182c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public C24056b(C24055a aVar) {
            super((C24055a) null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.t0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.t0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.t0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> m29943d(java.lang.Object r3, long r4, int r6) {
            /*
                java.lang.Object r0 = com.google.protobuf.C24065x2.m29988o(r3, r4)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof com.google.protobuf.C24048u0
                if (r1 == 0) goto L_0x0016
                com.google.protobuf.t0 r0 = new com.google.protobuf.t0
                r0.<init>((int) r6)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof com.google.protobuf.C24064x1
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.google.protobuf.C23908o0.C23919j
                if (r1 == 0) goto L_0x0026
                com.google.protobuf.o0$j r0 = (com.google.protobuf.C23908o0.C23919j) r0
                com.google.protobuf.o0$j r6 = r0.mo37467E0(r6)
                r0 = r6
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x002b:
                com.google.protobuf.C24065x2.m29999z(r3, r4, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f69182c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.C24065x2.m29999z(r3, r4, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof com.google.protobuf.C104491w2
                if (r1 == 0) goto L_0x0064
                com.google.protobuf.t0 r1 = new com.google.protobuf.t0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.protobuf.w2 r0 = (com.google.protobuf.C104491w2) r0
                r1.addAll(r0)
                com.google.protobuf.C24065x2.m29999z(r3, r4, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof com.google.protobuf.C24064x1
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof com.google.protobuf.C23908o0.C23919j
                if (r1 == 0) goto L_0x0081
                r1 = r0
                com.google.protobuf.o0$j r1 = (com.google.protobuf.C23908o0.C23919j) r1
                boolean r2 = r1.mo37523Q()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.protobuf.o0$j r0 = r1.mo37467E0(r0)
                com.google.protobuf.C24065x2.m29999z(r3, r4, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24054v0.C24056b.m29943d(java.lang.Object, long, int):java.util.List");
        }

        /* renamed from: a */
        public void mo38386a(Object obj, long j) {
            Object obj2;
            List list = (List) C24065x2.m29988o(obj, j);
            if (list instanceof C24048u0) {
                obj2 = ((C24048u0) list).mo38349a();
            } else if (!f69182c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C24064x1) || !(list instanceof C23908o0.C23919j)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C23908o0.C23919j jVar = (C23908o0.C23919j) list;
                    if (jVar.mo37523Q()) {
                        jVar.mo37522O();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C24065x2.m29999z(obj, j, obj2);
        }

        /* renamed from: b */
        public <E> void mo38387b(Object obj, Object obj2, long j) {
            List list = (List) C24065x2.m29988o(obj2, j);
            List d = m29943d(obj, j, list.size());
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            C24065x2.m29999z(obj, j, list);
        }

        /* renamed from: c */
        public <L> List<L> mo38388c(Object obj, long j) {
            return m29943d(obj, j, 10);
        }
    }

    /* renamed from: com.google.protobuf.v0$c */
    public static final class C24057c extends C24054v0 {
        public C24057c(C24055a aVar) {
            super((C24055a) null);
        }

        /* renamed from: a */
        public void mo38386a(Object obj, long j) {
            ((C23908o0.C23919j) C24065x2.m29988o(obj, j)).mo37522O();
        }

        /* renamed from: b */
        public <E> void mo38387b(Object obj, Object obj2, long j) {
            C23908o0.C23919j jVar = (C23908o0.C23919j) C24065x2.m29988o(obj, j);
            C23908o0.C23919j jVar2 = (C23908o0.C23919j) C24065x2.m29988o(obj2, j);
            int size = jVar.size();
            int size2 = jVar2.size();
            if (size > 0 && size2 > 0) {
                if (!jVar.mo37523Q()) {
                    jVar = jVar.mo37467E0(size2 + size);
                }
                jVar.addAll(jVar2);
            }
            if (size > 0) {
                jVar2 = jVar;
            }
            C24065x2.m29999z(obj, j, jVar2);
        }

        /* renamed from: c */
        public <L> List<L> mo38388c(Object obj, long j) {
            C23908o0.C23919j jVar = (C23908o0.C23919j) C24065x2.m29988o(obj, j);
            if (jVar.mo37523Q()) {
                return jVar;
            }
            int size = jVar.size();
            C23908o0.C23919j E0 = jVar.mo37467E0(size == 0 ? 10 : size * 2);
            C24065x2.m29999z(obj, j, E0);
            return E0;
        }
    }

    public C24054v0(C24055a aVar) {
    }

    /* renamed from: a */
    public abstract void mo38386a(Object obj, long j);

    /* renamed from: b */
    public abstract <L> void mo38387b(Object obj, Object obj2, long j);

    /* renamed from: c */
    public abstract <L> List<L> mo38388c(Object obj, long j);
}
