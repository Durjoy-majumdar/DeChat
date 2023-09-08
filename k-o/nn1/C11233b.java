package nn1;

import gy3.C8480h;
import java.util.HashMap;

/* renamed from: nn1.b */
public final class C11233b {

    /* renamed from: i */
    public static final C11234a f33100i = new C11234a((C8480h) null);

    /* renamed from: j */
    public static final HashMap<Integer, C11233b> f33101j = new HashMap<>();

    /* renamed from: a */
    public int f33102a;

    /* renamed from: b */
    public long f33103b;

    /* renamed from: c */
    public long f33104c;

    /* renamed from: d */
    public long f33105d;

    /* renamed from: e */
    public long f33106e;

    /* renamed from: f */
    public long f33107f;

    /* renamed from: g */
    public long f33108g;

    /* renamed from: h */
    public long f33109h;

    /* renamed from: nn1.b$a */
    public static final class C11234a {
        public C11234a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C11233b mo11311a(int i) {
            HashMap<Integer, C11233b> hashMap = C11233b.f33101j;
            C11233b bVar = hashMap.get(Integer.valueOf(i));
            if (bVar == null) {
                bVar = new C11233b(i);
            }
            hashMap.put(Integer.valueOf(i), bVar);
            return bVar;
        }
    }

    public C11233b(int i) {
        this.f33102a = i;
    }
}
