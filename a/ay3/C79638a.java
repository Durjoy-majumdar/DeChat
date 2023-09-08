package ay3;

import gy3.C87412m;
import zx3.C91943a;

/* renamed from: ay3.a */
public class C79638a extends C91943a {

    /* renamed from: ay3.a$a */
    public static final class C79639a {

        /* renamed from: a */
        public static final Integer f233513a;

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
                f233513a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ay3.C79638a.C79639a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo109775a(Throwable th, Throwable th4) {
        C87412m.m108594g(th, "cause");
        C87412m.m108594g(th4, "exception");
        Integer num = C79639a.f233513a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th4);
        } else {
            super.mo109775a(th, th4);
        }
    }
}
