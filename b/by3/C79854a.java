package by3;

import ay3.C79638a;
import ky3.C88332b;
import ky3.C88334c;
import ly3.C88670a;

/* renamed from: by3.a */
public class C79854a extends C79638a {

    /* renamed from: by3.a$a */
    public static final class C79855a {

        /* renamed from: a */
        public static final Integer f234001a;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0018 }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x0018 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0018 }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x0018 }
                if (r2 == 0) goto L_0x0019
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0018 }
                goto L_0x001a
            L_0x0018:
            L_0x0019:
                r1 = r0
            L_0x001a:
                if (r1 == 0) goto L_0x0028
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x0024
                r2 = 1
                goto L_0x0025
            L_0x0024:
                r2 = 0
            L_0x0025:
                if (r2 == 0) goto L_0x0028
                r0 = r1
            L_0x0028:
                f234001a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: by3.C79854a.C79855a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public C88334c mo110032b() {
        Integer num = C79855a.f234001a;
        return num == null || num.intValue() >= 24 ? new C88670a() : new C88332b();
    }
}
