package pz3;

import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import sx3.C90363p0;
import uz3.C111238e;

/* renamed from: pz3.a */
public final class C25505a {

    /* renamed from: a */
    public final C25506a f72189a;

    /* renamed from: b */
    public final C111238e f72190b;

    /* renamed from: c */
    public final String[] f72191c;

    /* renamed from: d */
    public final String[] f72192d;

    /* renamed from: e */
    public final String[] f72193e;

    /* renamed from: f */
    public final String f72194f;

    /* renamed from: g */
    public final int f72195g;

    /* renamed from: pz3.a$a */
    public enum C25506a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        

        /* renamed from: e */
        public static final Map<Integer, C25506a> f72196e = null;

        /* renamed from: d */
        public final int f72204d;

        /* access modifiers changed from: public */
        static {
            int i;
            C25506a[] values = values();
            int a = C90363p0.m113142a(values.length);
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            for (C25506a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f72204d), aVar);
            }
            f72196e = linkedHashMap;
        }

        /* access modifiers changed from: public */
        C25506a(int i) {
            this.f72204d = i;
        }
    }

    public C25505a(C25506a aVar, C111238e eVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        C87412m.m108594g(aVar, "kind");
        C87412m.m108594g(eVar, "metadataVersion");
        this.f72189a = aVar;
        this.f72190b = eVar;
        this.f72191c = strArr;
        this.f72192d = strArr2;
        this.f72193e = strArr3;
        this.f72194f = str;
        this.f72195g = i;
    }

    public String toString() {
        return this.f72189a + " version=" + this.f72190b;
    }
}
