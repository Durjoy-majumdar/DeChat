package am0;

import android.nfc.tech.IsoDep;
import android.nfc.tech.Ndef;
import android.nfc.tech.NfcA;
import android.util.ArrayMap;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;
import zl0.C91770b;
import zl0.C91771c;
import zl0.C91792p;

/* renamed from: am0.b */
public enum C79589b {
    NFC_A("NFC-A", NfcA.class.getName(), C91792p.f262872a),
    ISO_DEP("ISO-DEP", IsoDep.class.getName(), C91771c.f262828a),
    NDEF("NDEF", Ndef.class.getName(), (String) null);
    

    /* renamed from: h */
    public static final C79590a f233384h = null;

    /* renamed from: i */
    public static final Map<String, C79589b> f233385i = null;

    /* renamed from: j */
    public static final Map<String, String> f233386j = null;

    /* renamed from: d */
    public final String f233391d;

    /* renamed from: e */
    public final String f233392e;

    /* renamed from: f */
    public final C91770b f233393f;

    /* renamed from: g */
    public final ArrayMap<C79591b, Boolean> f233394g;

    /* renamed from: am0.b$a */
    public static final class C79590a {
        public C79590a(C8480h hVar) {
        }
    }

    /* renamed from: am0.b$b */
    public static final class C79591b {

        /* renamed from: a */
        public final String f233395a;

        /* renamed from: b */
        public final Class<? extends Object>[] f233396b;

        public C79591b(String str, Class<? extends Object>[] clsArr) {
            C87412m.m108594g(str, "name");
            C87412m.m108594g(clsArr, "parameterTypes");
            this.f233395a = str;
            this.f233396b = clsArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C87412m.m108589b(C79591b.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.nfc.rw.model.NFCTech.MethodSignature");
            C79591b bVar = (C79591b) obj;
            return C87412m.m108589b(this.f233395a, bVar.f233395a) && Arrays.equals(this.f233396b, bVar.f233396b);
        }

        public int hashCode() {
            return (this.f233395a.hashCode() * 31) + Arrays.hashCode(this.f233396b);
        }

        public String toString() {
            return "MethodSignature(name=" + this.f233395a + ", parameterTypes=" + Arrays.toString(this.f233396b) + ')';
        }
    }

    /* access modifiers changed from: public */
    static {
        int i;
        f233384h = new C79590a((C8480h) null);
        C79589b[] values = values();
        ArrayList arrayList = new ArrayList(values.length);
        for (C79589b bVar : values) {
            arrayList.add(new C13604l(bVar.f233391d, bVar));
        }
        f233385i = C90364q0.m113152k(arrayList);
        C79589b[] values2 = values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (C79589b bVar2 : values2) {
            arrayList2.add(new C13604l(bVar2.f233392e, bVar2.f233391d));
        }
        f233386j = C90364q0.m113152k(arrayList2);
    }

    /* access modifiers changed from: public */
    C79589b(String str, String str2, C91770b bVar) {
        this.f233391d = str;
        this.f233392e = str2;
        this.f233393f = bVar;
        this.f233394g = new ArrayMap<>();
    }
}
