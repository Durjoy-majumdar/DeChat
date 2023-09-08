package xz3;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xz3.C23159i;
import xz3.C26591g.C26592a;
import xz3.C26607p;

/* renamed from: xz3.g */
public final class C26591g<FieldDescriptorType extends C26592a<FieldDescriptorType>> {

    /* renamed from: d */
    public static final C26591g f74003d = new C26591g(true);

    /* renamed from: a */
    public final C23172u<FieldDescriptorType, Object> f74004a;

    /* renamed from: b */
    public boolean f74005b;

    /* renamed from: c */
    public boolean f74006c = false;

    /* renamed from: xz3.g$a */
    public interface C26592a<T extends C26592a<T>> extends Comparable<T> {
        /* renamed from: Bh */
        C26607p.C26608a mo53562Bh(C26607p.C26608a aVar, C26607p pVar);

        /* renamed from: E0 */
        boolean mo53563E0();

        /* renamed from: O */
        C26612y mo53564O();

        /* renamed from: Q */
        C26617z mo53565Q();

        /* renamed from: T0 */
        boolean mo53566T0();

        int getNumber();
    }

    public C26591g() {
        int i = C23172u.f66558i;
        this.f74004a = new C23171t(16);
    }

    /* renamed from: c */
    public static int m34429c(C26612y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return 8;
            case 1:
                ((Float) obj).floatValue();
                return 4;
            case 2:
                return C26587e.m34410g(((Long) obj).longValue());
            case 3:
                return C26587e.m34410g(((Long) obj).longValue());
            case 4:
                return C26587e.m34406c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return 8;
            case 6:
                ((Integer) obj).intValue();
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C26587e.m34409f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported.", e);
                }
            case 9:
                return ((C26607p) obj).getSerializedSize();
            case 10:
                if (!(obj instanceof C26602k)) {
                    return C26587e.m34408e((C26607p) obj);
                }
                C26602k kVar = (C26602k) obj;
                if (kVar.f74026a) {
                    int serializedSize = kVar.f74027b.getSerializedSize();
                    return C26587e.m34409f(serializedSize) + serializedSize;
                }
                throw null;
            case 11:
                if (obj instanceof C23156c) {
                    C23156c cVar = (C23156c) obj;
                    return C26587e.m34409f(cVar.size()) + cVar.size();
                }
                byte[] bArr = (byte[]) obj;
                return C26587e.m34409f(bArr.length) + bArr.length;
            case 12:
                return C26587e.m34409f(((Integer) obj).intValue());
            case 13:
                return obj instanceof C23159i.C23160a ? C26587e.m34406c(((C23159i.C23160a) obj).getNumber()) : C26587e.m34406c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return 4;
            case 15:
                ((Long) obj).longValue();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return C26587e.m34409f((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return C26587e.m34410g((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m34430d(C26592a<?> aVar, Object obj) {
        C26612y O = aVar.mo53564O();
        int number = aVar.getNumber();
        if (aVar.mo53563E0()) {
            int i = 0;
            if (aVar.mo53566T0()) {
                for (Object c : (List) obj) {
                    i += m34429c(O, c);
                }
                return C26587e.m34411h(number) + i + C26587e.m34409f(i);
            }
            for (Object next : (List) obj) {
                int h = C26587e.m34411h(number);
                if (O == C26612y.GROUP) {
                    h *= 2;
                }
                i += h + m34429c(O, next);
            }
            return i;
        }
        int h2 = C26587e.m34411h(number);
        if (O == C26612y.GROUP) {
            h2 *= 2;
        }
        return h2 + m34429c(O, obj);
    }

    /* renamed from: i */
    public static Object m34431i(C26586d dVar, C26612y yVar, boolean z) {
        byte[] bArr;
        boolean z2 = false;
        switch (yVar.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(dVar.mo53526j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(dVar.mo53525i()));
            case 2:
                return Long.valueOf(dVar.mo53528l());
            case 3:
                return Long.valueOf(dVar.mo53528l());
            case 4:
                return Integer.valueOf(dVar.mo53527k());
            case 5:
                return Long.valueOf(dVar.mo53526j());
            case 6:
                return Integer.valueOf(dVar.mo53525i());
            case 7:
                if (dVar.mo53528l() != 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 8:
                if (z) {
                    int k = dVar.mo53527k();
                    int i = dVar.f73989d;
                    if (k <= dVar.f73987b - i && k > 0) {
                        bArr = dVar.f73986a;
                        dVar.f73989d = i + k;
                    } else if (k == 0) {
                        return "";
                    } else {
                        bArr = dVar.mo53524h(k);
                        i = 0;
                    }
                    if (C23179x.m27555b(bArr, i, i + k) == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        return new String(bArr, i, k, "UTF-8");
                    }
                    throw new C26601j("Protocol message had invalid UTF-8.");
                }
                int k2 = dVar.mo53527k();
                int i2 = dVar.f73987b;
                int i3 = dVar.f73989d;
                if (k2 > i2 - i3 || k2 <= 0) {
                    return k2 == 0 ? "" : new String(dVar.mo53524h(k2), "UTF-8");
                }
                String str = new String(dVar.f73986a, i3, k2, "UTF-8");
                dVar.f73989d += k2;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return dVar.mo53521e();
            case 12:
                return Integer.valueOf(dVar.mo53527k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(dVar.mo53525i());
            case 15:
                return Long.valueOf(dVar.mo53526j());
            case 16:
                int k3 = dVar.mo53527k();
                return Integer.valueOf((-(k3 & 1)) ^ (k3 >>> 1));
            case 17:
                long l = dVar.mo53528l();
                return Long.valueOf((-(l & 1)) ^ (l >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if ((r3 instanceof xz3.C26602k) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        if ((r3 instanceof xz3.C23159i.C23160a) == false) goto L_0x002a;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m34432k(xz3.C26612y r2, java.lang.Object r3) {
        /*
            r3.getClass()
            xz3.z r2 = r2.f74034d
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0039;
                case 2: goto L_0x0036;
                case 3: goto L_0x0033;
                case 4: goto L_0x0030;
                case 5: goto L_0x002d;
                case 6: goto L_0x0021;
                case 7: goto L_0x0018;
                case 8: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x003e
        L_0x000f:
            boolean r2 = r3 instanceof xz3.C26607p
            if (r2 != 0) goto L_0x002b
            boolean r2 = r3 instanceof xz3.C26602k
            if (r2 == 0) goto L_0x002a
            goto L_0x002b
        L_0x0018:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x002b
            boolean r2 = r3 instanceof xz3.C23159i.C23160a
            if (r2 == 0) goto L_0x002a
            goto L_0x002b
        L_0x0021:
            boolean r2 = r3 instanceof xz3.C23156c
            if (r2 != 0) goto L_0x002b
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            r1 = r0
            goto L_0x003e
        L_0x002d:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x003e
        L_0x0030:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x003e
        L_0x0033:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x003e
        L_0x0036:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x003e
        L_0x0039:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x003e
        L_0x003c:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x003e:
            if (r1 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xz3.C26591g.m34432k(xz3.y, java.lang.Object):void");
    }

    /* renamed from: l */
    public static void m34433l(C26587e eVar, C26612y yVar, int i, Object obj) {
        if (yVar == C26612y.GROUP) {
            eVar.mo53550x(i, 3);
            ((C26607p) obj).mo52855a(eVar);
            eVar.mo53550x(i, 4);
            return;
        }
        eVar.mo53550x(i, yVar.f74035e);
        m34434m(eVar, yVar, obj);
    }

    /* renamed from: m */
    public static void m34434m(C26587e eVar, C26612y yVar, Object obj) {
        switch (yVar.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                eVar.getClass();
                eVar.mo53547u(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                eVar.getClass();
                eVar.mo53546t(Float.floatToRawIntBits(floatValue));
                return;
            case 2:
                eVar.mo53549w(((Long) obj).longValue());
                return;
            case 3:
                eVar.mo53549w(((Long) obj).longValue());
                return;
            case 4:
                eVar.mo53540n(((Integer) obj).intValue());
                return;
            case 5:
                eVar.mo53547u(((Long) obj).longValue());
                return;
            case 6:
                eVar.mo53546t(((Integer) obj).intValue());
                return;
            case 7:
                eVar.mo53543q(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                eVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                eVar.mo53548v(bytes.length);
                eVar.mo53545s(bytes);
                return;
            case 9:
                eVar.getClass();
                ((C26607p) obj).mo52855a(eVar);
                return;
            case 10:
                eVar.mo53542p((C26607p) obj);
                return;
            case 11:
                if (obj instanceof C23156c) {
                    C23156c cVar = (C23156c) obj;
                    eVar.getClass();
                    eVar.mo53548v(cVar.size());
                    eVar.mo53544r(cVar);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                eVar.getClass();
                eVar.mo53548v(bArr.length);
                eVar.mo53545s(bArr);
                return;
            case 12:
                eVar.mo53548v(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof C23159i.C23160a) {
                    eVar.mo53540n(((C23159i.C23160a) obj).getNumber());
                    return;
                } else {
                    eVar.mo53540n(((Integer) obj).intValue());
                    return;
                }
            case 14:
                eVar.mo53546t(((Integer) obj).intValue());
                return;
            case 15:
                eVar.mo53547u(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                eVar.mo53548v((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                eVar.mo53549w((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo53554a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo53563E0()) {
            m34432k(fielddescriptortype.mo53564O(), obj);
            Object e = mo53557e(fielddescriptortype);
            if (e == null) {
                list = new ArrayList();
                this.f74004a.mo36602f(fielddescriptortype, list);
            } else {
                list = (List) e;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public C26591g<FieldDescriptorType> clone() {
        C26591g<FieldDescriptorType> gVar = new C26591g<>();
        for (int i = 0; i < this.f74004a.f66560e.size(); i++) {
            Map.Entry entry = this.f74004a.f66560e.get(i);
            gVar.mo53561j((C26592a) entry.getKey(), entry.getValue());
        }
        for (Map.Entry next : this.f74004a.mo36597c()) {
            gVar.mo53561j((C26592a) next.getKey(), next.getValue());
        }
        gVar.f74006c = this.f74006c;
        return gVar;
    }

    /* renamed from: e */
    public Object mo53557e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f74004a.get(fielddescriptortype);
        return obj instanceof C26602k ? ((C26602k) obj).mo53582a() : obj;
    }

    /* renamed from: f */
    public final boolean mo53558f(Map.Entry<FieldDescriptorType, Object> entry) {
        C26592a aVar = (C26592a) entry.getKey();
        if (aVar.mo53565Q() == C26617z.MESSAGE) {
            if (aVar.mo53563E0()) {
                for (C26607p isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C26607p) {
                    if (!((C26607p) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C26602k) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: g */
    public void mo53559g() {
        if (!this.f74005b) {
            C23171t tVar = (C23171t) this.f74004a;
            if (!tVar.f66562g) {
                for (int i = 0; i < tVar.f66560e.size(); i++) {
                    Map.Entry entry = tVar.f66560e.get(i);
                    if (((C26592a) entry.getKey()).mo53563E0()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
                for (Map.Entry entry2 : tVar.mo36597c()) {
                    if (((C26592a) entry2.getKey()).mo53563E0()) {
                        entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                    }
                }
            }
            if (!tVar.f66562g) {
                tVar.f66561f = tVar.f66561f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(tVar.f66561f);
                tVar.f66562g = true;
            }
            this.f74005b = true;
        }
    }

    /* renamed from: h */
    public final void mo53560h(Map.Entry<FieldDescriptorType, Object> entry) {
        C26592a aVar = (C26592a) entry.getKey();
        byte[] value = entry.getValue();
        if (value instanceof C26602k) {
            value = ((C26602k) value).mo53582a();
        }
        if (aVar.mo53563E0()) {
            Object e = mo53557e(aVar);
            if (e == null) {
                e = new ArrayList();
            }
            for (Object next : (List) value) {
                List list = (List) e;
                if (next instanceof byte[]) {
                    byte[] bArr = (byte[]) next;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    next = bArr2;
                }
                list.add(next);
            }
            this.f74004a.mo36602f(aVar, e);
        } else if (aVar.mo53565Q() == C26617z.MESSAGE) {
            Object e2 = mo53557e(aVar);
            if (e2 == null) {
                C23172u<FieldDescriptorType, Object> uVar = this.f74004a;
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                uVar.mo36602f(aVar, value);
                return;
            }
            this.f74004a.mo36602f(aVar, aVar.mo53562Bh(((C26607p) e2).toBuilder(), (C26607p) value).build());
        } else {
            C23172u<FieldDescriptorType, Object> uVar2 = this.f74004a;
            if (value instanceof byte[]) {
                byte[] bArr5 = (byte[]) value;
                byte[] bArr6 = new byte[bArr5.length];
                System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
                value = bArr6;
            }
            uVar2.mo36602f(aVar, value);
        }
    }

    /* renamed from: j */
    public void mo53561j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo53563E0()) {
            m34432k(fielddescriptortype.mo53564O(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m34432k(fielddescriptortype.mo53564O(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C26602k) {
            this.f74006c = true;
        }
        this.f74004a.mo36602f(fielddescriptortype, obj);
    }

    public C26591g(boolean z) {
        int i = C23172u.f66558i;
        this.f74004a = new C23171t(0);
        mo53559g();
    }
}
