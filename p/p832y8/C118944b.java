package p832y8;

import java.util.Arrays;

/* renamed from: y8.b */
public final class C118944b {

    /* renamed from: a */
    public final String f356263a;

    /* renamed from: b */
    public final C118945a f356264b;

    /* renamed from: c */
    public C118945a f356265c;

    /* renamed from: y8.b$a */
    public static final class C118945a {

        /* renamed from: a */
        public Object f356266a;

        /* renamed from: b */
        public C118945a f356267b;

        public C118945a(C118943a aVar) {
        }
    }

    public C118944b(String str, C118943a aVar) {
        C118945a aVar2 = new C118945a((C118943a) null);
        this.f356264b = aVar2;
        this.f356265c = aVar2;
        str.getClass();
        this.f356263a = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f356263a);
        sb.append('{');
        C118945a aVar = this.f356264b.f356267b;
        String str = "";
        while (aVar != null) {
            Object obj = aVar.f356266a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            aVar = aVar.f356267b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
