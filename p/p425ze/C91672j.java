package p425ze;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: ze.j */
public final class C91672j implements Serializable {

    /* renamed from: d */
    public final String f262654d;

    /* renamed from: e */
    public final C91674b f262655e;

    /* renamed from: f */
    public final C91673a f262656f;

    /* renamed from: g */
    public final String f262657g;

    /* renamed from: h */
    public final String f262658h;

    /* renamed from: i */
    public final C26702e f262659i;

    /* renamed from: j */
    public final List<String> f262660j;

    /* renamed from: ze.j$a */
    public enum C91673a {
        OBJECT,
        CLASS,
        THREAD,
        ARRAY
    }

    /* renamed from: ze.j$b */
    public enum C91674b {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL,
        ARRAY_ENTRY
    }

    public C91672j(String str, C91674b bVar, C91673a aVar, String str2, String str3, C26702e eVar, List<String> list) {
        this.f262654d = str;
        this.f262655e = bVar;
        this.f262656f = aVar;
        this.f262657g = str2;
        this.f262658h = str3;
        this.f262659i = eVar;
        this.f262660j = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public final String mo125549a(boolean z) {
        String str;
        String str2 = this.f262655e == C91674b.STATIC_FIELD ? "static " : "";
        C91673a aVar = this.f262656f;
        C91673a aVar2 = C91673a.ARRAY;
        if (aVar == aVar2 || aVar == C91673a.THREAD) {
            str2 = str2 + this.f262656f.name().toLowerCase(Locale.US) + " ";
        }
        String str3 = str2 + this.f262657g;
        if (this.f262654d == null) {
            str = str3 + " instance";
        } else if (!z || this.f262656f != aVar2) {
            str = str3 + " " + this.f262654d;
        } else {
            str = str3 + " [*]";
        }
        if (this.f262658h != null) {
            str = str + " " + this.f262658h;
        }
        if (this.f262659i == null) {
            return str;
        }
        return str + " , matching exclusion " + this.f262659i.f74243e;
    }

    public String toString() {
        return mo125549a(false);
    }
}
