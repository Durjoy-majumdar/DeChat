package com.google.protobuf;

import com.google.protobuf.C16994k;
import com.google.protobuf.C17003m2;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23897n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.s2 */
public final class C24020s2 implements C23845j1 {

    /* renamed from: f */
    public static final C24020s2 f69054f = new C24020s2(Collections.emptyMap(), Collections.emptyMap());

    /* renamed from: g */
    public static final C24024c f69055g = new C24024c();

    /* renamed from: d */
    public final Map<Integer, C24022b> f69056d;

    /* renamed from: e */
    public final Map<Integer, C24022b> f69057e;

    /* renamed from: com.google.protobuf.s2$b */
    public static final class C24022b {

        /* renamed from: f */
        public static final /* synthetic */ int f69061f = 0;

        /* renamed from: a */
        public List<Long> f69062a;

        /* renamed from: b */
        public List<Integer> f69063b;

        /* renamed from: c */
        public List<Long> f69064c;

        /* renamed from: d */
        public List<C16994k> f69065d;

        /* renamed from: e */
        public List<C24020s2> f69066e;

        /* renamed from: com.google.protobuf.s2$b$a */
        public static final class C24023a {

            /* renamed from: a */
            public C24022b f69067a;

            /* renamed from: a */
            public C24023a mo38308a(C16994k kVar) {
                C24022b bVar = this.f69067a;
                if (bVar.f69065d == null) {
                    bVar.f69065d = new ArrayList();
                }
                this.f69067a.f69065d.add(kVar);
                return this;
            }

            /* renamed from: b */
            public C24023a mo38309b(long j) {
                C24022b bVar = this.f69067a;
                if (bVar.f69062a == null) {
                    bVar.f69062a = new ArrayList();
                }
                this.f69067a.f69062a.add(Long.valueOf(j));
                return this;
            }

            /* renamed from: c */
            public C24022b mo38310c() {
                C24022b bVar = this.f69067a;
                List<Long> list = bVar.f69062a;
                if (list == null) {
                    bVar.f69062a = Collections.emptyList();
                } else {
                    bVar.f69062a = Collections.unmodifiableList(list);
                }
                C24022b bVar2 = this.f69067a;
                List<Integer> list2 = bVar2.f69063b;
                if (list2 == null) {
                    bVar2.f69063b = Collections.emptyList();
                } else {
                    bVar2.f69063b = Collections.unmodifiableList(list2);
                }
                C24022b bVar3 = this.f69067a;
                List<Long> list3 = bVar3.f69064c;
                if (list3 == null) {
                    bVar3.f69064c = Collections.emptyList();
                } else {
                    bVar3.f69064c = Collections.unmodifiableList(list3);
                }
                C24022b bVar4 = this.f69067a;
                List<C16994k> list4 = bVar4.f69065d;
                if (list4 == null) {
                    bVar4.f69065d = Collections.emptyList();
                } else {
                    bVar4.f69065d = Collections.unmodifiableList(list4);
                }
                C24022b bVar5 = this.f69067a;
                List<C24020s2> list5 = bVar5.f69066e;
                if (list5 == null) {
                    bVar5.f69066e = Collections.emptyList();
                } else {
                    bVar5.f69066e = Collections.unmodifiableList(list5);
                }
                C24022b bVar6 = this.f69067a;
                this.f69067a = null;
                return bVar6;
            }

            /* renamed from: d */
            public C24023a mo38311d(C24022b bVar) {
                if (!bVar.f69062a.isEmpty()) {
                    C24022b bVar2 = this.f69067a;
                    if (bVar2.f69062a == null) {
                        bVar2.f69062a = new ArrayList();
                    }
                    this.f69067a.f69062a.addAll(bVar.f69062a);
                }
                if (!bVar.f69063b.isEmpty()) {
                    C24022b bVar3 = this.f69067a;
                    if (bVar3.f69063b == null) {
                        bVar3.f69063b = new ArrayList();
                    }
                    this.f69067a.f69063b.addAll(bVar.f69063b);
                }
                if (!bVar.f69064c.isEmpty()) {
                    C24022b bVar4 = this.f69067a;
                    if (bVar4.f69064c == null) {
                        bVar4.f69064c = new ArrayList();
                    }
                    this.f69067a.f69064c.addAll(bVar.f69064c);
                }
                if (!bVar.f69065d.isEmpty()) {
                    C24022b bVar5 = this.f69067a;
                    if (bVar5.f69065d == null) {
                        bVar5.f69065d = new ArrayList();
                    }
                    this.f69067a.f69065d.addAll(bVar.f69065d);
                }
                if (!bVar.f69066e.isEmpty()) {
                    C24022b bVar6 = this.f69067a;
                    if (bVar6.f69066e == null) {
                        bVar6.f69066e = new ArrayList();
                    }
                    this.f69067a.f69066e.addAll(bVar.f69066e);
                }
                return this;
            }
        }

        static {
            m29818b().mo38310c();
        }

        /* renamed from: b */
        public static C24023a m29818b() {
            C24023a aVar = new C24023a();
            aVar.f69067a = new C24022b();
            return aVar;
        }

        /* renamed from: a */
        public final Object[] mo38305a() {
            return new Object[]{this.f69062a, this.f69063b, this.f69064c, this.f69065d, this.f69066e};
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24022b)) {
                return false;
            }
            return Arrays.equals(mo38305a(), ((C24022b) obj).mo38305a());
        }

        public int hashCode() {
            return Arrays.hashCode(mo38305a());
        }
    }

    /* renamed from: com.google.protobuf.s2$c */
    public static final class C24024c extends C23813c<C24020s2> {
        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            int F;
            C24021a b = C24020s2.m29807b();
            do {
                try {
                    F = lVar.mo37757F();
                    if (F == 0 || !b.mo38302e(F, lVar)) {
                    }
                    F = lVar.mo37757F();
                    break;
                } catch (C23922p0 e) {
                    e.f68530d = b.build();
                    throw e;
                } catch (IOException e2) {
                    C23922p0 p0Var = new C23922p0(e2);
                    p0Var.f68530d = b.build();
                    throw p0Var;
                }
            } while (!b.mo38302e(F, lVar));
            return b.build();
        }
    }

    public C24020s2() {
        this.f69056d = null;
        this.f69057e = null;
    }

    /* renamed from: b */
    public static C24021a m29807b() {
        C24021a aVar = new C24021a();
        aVar.f69058d = Collections.emptyMap();
        aVar.f69059e = 0;
        aVar.f69060f = null;
        return aVar;
    }

    /* renamed from: a */
    public int mo38291a() {
        int i = 0;
        for (Map.Entry next : this.f69056d.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int i2 = 0;
            for (C16994k c : ((C24022b) next.getValue()).f69065d) {
                i2 += (C23897n.m29277v(1) * 2) + C23897n.m29278w(2, intValue) + C23897n.m29258c(3, c);
            }
            i += i2;
        }
        return i;
    }

    /* renamed from: c */
    public void mo38292c(C23897n nVar) {
        for (Map.Entry next : this.f69056d.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            for (C16994k T : ((C24022b) next.getValue()).f69065d) {
                nVar.mo37913T(intValue, T);
            }
        }
    }

    /* renamed from: d */
    public void mo38293d(C23809a3 a3Var) {
        a3Var.getClass();
        for (Map.Entry next : this.f69056d.entrySet()) {
            C24022b bVar = (C24022b) next.getValue();
            int intValue = ((Integer) next.getKey()).intValue();
            C23907o oVar = (C23907o) a3Var;
            oVar.mo37967o(intValue, bVar.f69062a, false);
            oVar.mo37960h(intValue, bVar.f69063b, false);
            oVar.mo37962j(intValue, bVar.f69064c, false);
            oVar.mo37955c(intValue, bVar.f69065d);
            for (int i = 0; i < bVar.f69066e.size(); i++) {
                oVar.mo37974v(intValue);
                bVar.f69066e.get(i).mo38293d(oVar);
                oVar.mo37957e(intValue);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24020s2) && this.f69056d.equals(((C24020s2) obj).f69056d);
    }

    public C23845j1 getDefaultInstanceForType() {
        return f69054f;
    }

    public C24062w1 getParserForType() {
        return f69055g;
    }

    public int getSerializedSize() {
        int i = 0;
        for (Map.Entry next : this.f69056d.entrySet()) {
            C24022b bVar = (C24022b) next.getValue();
            int intValue = ((Integer) next.getKey()).intValue();
            int i2 = 0;
            for (Long longValue : bVar.f69062a) {
                i2 += C23897n.m29280y(intValue, longValue.longValue());
            }
            for (Integer intValue2 : bVar.f69063b) {
                i2 += C23897n.m29262g(intValue, intValue2.intValue());
            }
            for (Long longValue2 : bVar.f69064c) {
                i2 += C23897n.m29263h(intValue, longValue2.longValue());
            }
            for (C16994k c : bVar.f69065d) {
                i2 += C23897n.m29258c(intValue, c);
            }
            for (C24020s2 serializedSize : bVar.f69066e) {
                i2 += (C23897n.m29277v(intValue) * 2) + serializedSize.getSerializedSize();
            }
            i += i2;
        }
        return i;
    }

    public int hashCode() {
        return this.f69056d.hashCode();
    }

    public boolean isInitialized() {
        return true;
    }

    public C23845j1.C23846a newBuilderForType() {
        return m29807b();
    }

    public C23845j1.C23846a toBuilder() {
        C24021a b = m29807b();
        b.mo38303f(this);
        return b;
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = C23897n.f68486b;
            C23897n.C23899b bVar = new C23897n.C23899b(bArr, 0, serializedSize);
            writeTo(bVar);
            if (bVar.mo37895B() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public C16994k toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C16994k kVar = C16994k.f46000e;
            byte[] bArr = new byte[serializedSize];
            Logger logger = C23897n.f68486b;
            C23897n.C23899b bVar = new C23897n.C23899b(bArr, 0, serializedSize);
            writeTo(bVar);
            if (bVar.mo37895B() == 0) {
                return new C16994k.C17000f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public String toString() {
        Logger logger = C17003m2.f46007a;
        C17003m2.C17007c.f46011b.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            C17003m2.C17007c.m16830d(this, new C17003m2.C17006d(sb, false, (C17003m2.C17004a) null));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public void writeTo(C23897n nVar) {
        for (Map.Entry next : this.f69056d.entrySet()) {
            C24022b bVar = (C24022b) next.getValue();
            int intValue = ((Integer) next.getKey()).intValue();
            for (Long longValue : bVar.f69062a) {
                nVar.mo37919Z(intValue, longValue.longValue());
            }
            for (Integer intValue2 : bVar.f69063b) {
                nVar.mo37902I(intValue, intValue2.intValue());
            }
            for (Long longValue2 : bVar.f69064c) {
                nVar.mo37904K(intValue, longValue2.longValue());
            }
            for (C16994k F : bVar.f69065d) {
                nVar.mo37899F(intValue, F);
            }
            for (C24020s2 writeTo : bVar.f69066e) {
                nVar.mo37916W(intValue, 3);
                writeTo.writeTo(nVar);
                nVar.mo37916W(intValue, 4);
            }
        }
    }

    /* renamed from: com.google.protobuf.s2$a */
    public static final class C24021a implements C23845j1.C23846a {

        /* renamed from: d */
        public Map<Integer, C24022b> f69058d;

        /* renamed from: e */
        public int f69059e;

        /* renamed from: f */
        public C24022b.C24023a f69060f;

        /* renamed from: a */
        public C24021a mo38297a(int i, C24022b bVar) {
            if (i != 0) {
                if (this.f69060f != null && this.f69059e == i) {
                    this.f69060f = null;
                    this.f69059e = 0;
                }
                if (this.f69058d.isEmpty()) {
                    this.f69058d = new TreeMap();
                }
                this.f69058d.put(Integer.valueOf(i), bVar);
                return this;
            }
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }

        /* renamed from: b */
        public C24020s2 build() {
            C24020s2 s2Var;
            mo38299c(0);
            if (this.f69058d.isEmpty()) {
                s2Var = C24020s2.f69054f;
            } else {
                s2Var = new C24020s2(Collections.unmodifiableMap(this.f69058d), Collections.unmodifiableMap(((TreeMap) this.f69058d).descendingMap()));
            }
            this.f69058d = null;
            return s2Var;
        }

        public C23845j1 buildPartial() {
            return build();
        }

        /* renamed from: c */
        public final C24022b.C24023a mo38299c(int i) {
            C24022b.C24023a aVar = this.f69060f;
            if (aVar != null) {
                int i2 = this.f69059e;
                if (i == i2) {
                    return aVar;
                }
                mo38297a(i2, aVar.mo38310c());
            }
            if (i == 0) {
                return null;
            }
            C24022b bVar = this.f69058d.get(Integer.valueOf(i));
            this.f69059e = i;
            C24022b.C24023a b = C24022b.m29818b();
            this.f69060f = b;
            if (bVar != null) {
                b.mo38311d(bVar);
            }
            return this.f69060f;
        }

        public Object clone() {
            mo38299c(0);
            Map unmodifiableMap = Collections.unmodifiableMap(((TreeMap) this.f69058d).descendingMap());
            C24021a b = C24020s2.m29807b();
            b.mo38303f(new C24020s2(this.f69058d, unmodifiableMap));
            return b;
        }

        /* renamed from: d */
        public C24021a mo38301d(int i, C24022b bVar) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            } else if (i != 0) {
                if (i == this.f69059e || this.f69058d.containsKey(Integer.valueOf(i))) {
                    mo38299c(i).mo38311d(bVar);
                } else {
                    mo38297a(i, bVar);
                }
                return this;
            } else {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
        }

        /* renamed from: e */
        public boolean mo38302e(int i, C23856l lVar) {
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i3 == 0) {
                mo38299c(i2).mo38309b(lVar.mo37776u());
                return true;
            } else if (i3 == 1) {
                C24022b.C24023a c = mo38299c(i2);
                long q = lVar.mo37772q();
                C24022b bVar = c.f69067a;
                if (bVar.f69064c == null) {
                    bVar.f69064c = new ArrayList();
                }
                c.f69067a.f69064c.add(Long.valueOf(q));
                return true;
            } else if (i3 == 2) {
                mo38299c(i2).mo38308a(lVar.mo37768m());
                return true;
            } else if (i3 == 3) {
                C24021a b = C24020s2.m29807b();
                lVar.mo37774s(i2, b, C24071y.f69198h);
                C24022b.C24023a c2 = mo38299c(i2);
                C24020s2 b2 = b.build();
                C24022b bVar2 = c2.f69067a;
                if (bVar2.f69066e == null) {
                    bVar2.f69066e = new ArrayList();
                }
                c2.f69067a.f69066e.add(b2);
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    C24022b.C24023a c3 = mo38299c(i2);
                    int p = lVar.mo37771p();
                    C24022b bVar3 = c3.f69067a;
                    if (bVar3.f69063b == null) {
                        bVar3.f69063b = new ArrayList();
                    }
                    c3.f69067a.f69063b.add(Integer.valueOf(p));
                    return true;
                }
                throw C23922p0.m29479d();
            }
        }

        /* renamed from: f */
        public C24021a mo38303f(C24020s2 s2Var) {
            if (s2Var != C24020s2.f69054f) {
                for (Map.Entry next : s2Var.f69056d.entrySet()) {
                    mo38301d(((Integer) next.getKey()).intValue(), (C24022b) next.getValue());
                }
            }
            return this;
        }

        /* renamed from: g */
        public C24021a mo38304g(int i, int i2) {
            if (i != 0) {
                mo38299c(i).mo38309b((long) i2);
                return this;
            }
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public com.google.protobuf.C23845j1.C23846a mergeFrom(com.google.protobuf.C23856l r1, com.google.protobuf.C23806a0 r2) {
            /*
                r0 = this;
            L_0x0000:
                int r2 = r1.mo37757F()
                if (r2 == 0) goto L_0x000c
                boolean r2 = r0.mo38302e(r2, r1)
                if (r2 != 0) goto L_0x0000
            L_0x000c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C24020s2.C24021a.mergeFrom(com.google.protobuf.l, com.google.protobuf.a0):com.google.protobuf.j1$a");
        }

        public C23845j1.C23846a mergeFrom(C23845j1 j1Var) {
            if (j1Var instanceof C24020s2) {
                mo38303f((C24020s2) j1Var);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public C24020s2(Map<Integer, C24022b> map, Map<Integer, C24022b> map2) {
        this.f69056d = map;
        this.f69057e = map2;
    }
}
