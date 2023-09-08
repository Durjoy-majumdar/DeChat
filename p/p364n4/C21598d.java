package p364n4;

import p364n4.C88902e;

/* renamed from: n4.d */
public enum C21598d {
    ;
    

    /* renamed from: d */
    public final String f61171d;

    /* renamed from: e */
    public final int f61172e;

    /* renamed from: n4.d$a */
    public static class C21599a {

        /* renamed from: a */
        public static final String[] f61173a = null;

        static {
            f61173a = C88902e.C21601b.f61175a.mo33857a();
        }
    }

    /* access modifiers changed from: public */
    C21598d(String str, int i) {
        this.f61171d = str;
        this.f61172e = i;
    }

    /* renamed from: a */
    public static C21598d m24511a(String str) {
        for (C21598d dVar : values()) {
            if (dVar.f61171d.equals(str)) {
                return dVar;
            }
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    /* renamed from: b */
    public boolean mo33859b() {
        for (String equals : C21599a.f61173a) {
            if (equals.equals(this.f61171d)) {
                return true;
            }
        }
        return false;
    }
}
