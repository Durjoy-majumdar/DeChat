package p631o1;

import fy3.C32227p;
import gy3.C24565l;
import iy3.C60639a;

/* renamed from: o1.b */
public final class C61912b {

    /* renamed from: a */
    public static final C61919i f176019a = new C61919i(C61913a.f176021d);

    /* renamed from: b */
    public static final C61919i f176020b = new C61919i(C61914b.f176022d);

    /* renamed from: o1.b$a */
    public /* synthetic */ class C61913a extends C24565l implements C32227p<Integer, Integer, Integer> {

        /* renamed from: d */
        public static final C61913a f176021d = new C61913a();

        public C61913a() {
            super(2, C60639a.class, "min", "min(II)I", 1);
        }

        public Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
        }
    }

    /* renamed from: o1.b$b */
    public /* synthetic */ class C61914b extends C24565l implements C32227p<Integer, Integer, Integer> {

        /* renamed from: d */
        public static final C61914b f176022d = new C61914b();

        public C61914b() {
            super(2, C60639a.class, "max", "max(II)I", 1);
        }

        public Object invoke(Object obj, Object obj2) {
            return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
        }
    }
}
