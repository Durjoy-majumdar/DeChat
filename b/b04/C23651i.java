package b04;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import n04.C25143j0;
import n04.C25176s0;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C26236u;
import sx3.C64186f0;
import ty3.C22558j;
import wy3.C26448e0;

/* renamed from: b04.i */
public final class C23651i {

    /* renamed from: a */
    public static final C23651i f67841a = new C23651i();

    /* renamed from: b04.i$a */
    public static final class C23652a extends C87413o implements C32226l<C26448e0, C25143j0> {

        /* renamed from: d */
        public final /* synthetic */ C22558j f67842d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23652a(C22558j jVar) {
            super(1);
            this.f67842d = jVar;
        }

        public Object invoke(Object obj) {
            C26448e0 e0Var = (C26448e0) obj;
            C87412m.m108594g(e0Var, "module");
            C25176s0 r = e0Var.mo52623m().mo53326r(this.f67842d);
            C87412m.m108593f(r, "module.builtIns.getPrimi…KotlinType(componentType)");
            return r;
        }
    }

    /* renamed from: a */
    public final C23643b mo37199a(List<?> list, C22558j jVar) {
        List<T> y0 = C110818d0.m150953y0(list);
        ArrayList arrayList = new ArrayList();
        for (T b : y0) {
            C23649g<?> b2 = mo37200b(b);
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return new C23643b(arrayList, new C23652a(jVar));
    }

    /* renamed from: b */
    public final C23649g<?> mo37200b(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (obj instanceof Byte) {
            return new C23646d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C23669v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C23658n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C23667t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C23647e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C23657m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C23653j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C23645c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C23670w((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            C87412m.m108594g(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                arrayList5 = C64186f0.f181907d;
            } else if (length != 1) {
                ArrayList arrayList6 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i < length2) {
                    arrayList6.add(Byte.valueOf(bArr[i]));
                    i++;
                }
                arrayList5 = arrayList6;
            } else {
                arrayList5 = C26236u.m33719b(Byte.valueOf(bArr[0]));
            }
            return mo37199a(arrayList5, C22558j.BYTE);
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            C87412m.m108594g(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                arrayList4 = C64186f0.f181907d;
            } else if (length3 != 1) {
                ArrayList arrayList7 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i < length4) {
                    arrayList7.add(Short.valueOf(sArr[i]));
                    i++;
                }
                arrayList4 = arrayList7;
            } else {
                arrayList4 = C26236u.m33719b(Short.valueOf(sArr[0]));
            }
            return mo37199a(arrayList4, C22558j.SHORT);
        } else if (obj instanceof int[]) {
            return mo37199a(C110823p.m150999Y((int[]) obj), C22558j.INT);
        } else {
            if (obj instanceof long[]) {
                return mo37199a(C110823p.m151000Z((long[]) obj), C22558j.LONG);
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                C87412m.m108594g(cArr, "<this>");
                int length5 = cArr.length;
                if (length5 == 0) {
                    arrayList3 = C64186f0.f181907d;
                } else if (length5 != 1) {
                    ArrayList arrayList8 = new ArrayList(cArr.length);
                    int length6 = cArr.length;
                    while (i < length6) {
                        arrayList8.add(Character.valueOf(cArr[i]));
                        i++;
                    }
                    arrayList3 = arrayList8;
                } else {
                    arrayList3 = C26236u.m33719b(Character.valueOf(cArr[0]));
                }
                return mo37199a(arrayList3, C22558j.CHAR);
            } else if (obj instanceof float[]) {
                return mo37199a(C110823p.m150998X((float[]) obj), C22558j.FLOAT);
            } else {
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    C87412m.m108594g(dArr, "<this>");
                    int length7 = dArr.length;
                    if (length7 == 0) {
                        arrayList2 = C64186f0.f181907d;
                    } else if (length7 != 1) {
                        ArrayList arrayList9 = new ArrayList(dArr.length);
                        int length8 = dArr.length;
                        while (i < length8) {
                            arrayList9.add(Double.valueOf(dArr[i]));
                            i++;
                        }
                        arrayList2 = arrayList9;
                    } else {
                        arrayList2 = C26236u.m33719b(Double.valueOf(dArr[0]));
                    }
                    return mo37199a(arrayList2, C22558j.DOUBLE);
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    C87412m.m108594g(zArr, "<this>");
                    int length9 = zArr.length;
                    if (length9 == 0) {
                        arrayList = C64186f0.f181907d;
                    } else if (length9 != 1) {
                        ArrayList arrayList10 = new ArrayList(zArr.length);
                        int length10 = zArr.length;
                        while (i < length10) {
                            arrayList10.add(Boolean.valueOf(zArr[i]));
                            i++;
                        }
                        arrayList = arrayList10;
                    } else {
                        arrayList = C26236u.m33719b(Boolean.valueOf(zArr[0]));
                    }
                    return mo37199a(arrayList, C22558j.BOOLEAN);
                } else if (obj == null) {
                    return new C23668u();
                } else {
                    return null;
                }
            }
        }
    }
}
