package m34;

import java.util.HashSet;
import java.util.Set;

/* renamed from: m34.g */
public final class C117531g extends RuntimeException {

    /* renamed from: m34.g$a */
    public static class C117532a extends RuntimeException {

        /* renamed from: d */
        public final Object f351646d;

        /* renamed from: m34.g$a$a */
        public static final class C88696a {

            /* renamed from: a */
            public static final Set<Class<?>> f256048a;

            static {
                HashSet hashSet = new HashSet();
                hashSet.add(Boolean.class);
                hashSet.add(Character.class);
                hashSet.add(Byte.class);
                hashSet.add(Short.class);
                hashSet.add(Integer.class);
                hashSet.add(Long.class);
                hashSet.add(Float.class);
                hashSet.add(Double.class);
                f256048a = hashSet;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C117532a(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OnError while emitting onNext value: "
                r0.append(r1)
                if (r4 != 0) goto L_0x000f
                java.lang.String r1 = "null"
                goto L_0x0058
            L_0x000f:
                java.util.Set<java.lang.Class<?>> r1 = m34.C117531g.C117532a.C88696a.f256048a
                java.lang.Class r2 = r4.getClass()
                java.util.HashSet r1 = (java.util.HashSet) r1
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L_0x0022
                java.lang.String r1 = r4.toString()
                goto L_0x0058
            L_0x0022:
                boolean r1 = r4 instanceof java.lang.String
                if (r1 == 0) goto L_0x002a
                r1 = r4
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x0058
            L_0x002a:
                boolean r1 = r4 instanceof java.lang.Enum
                if (r1 == 0) goto L_0x0036
                r1 = r4
                java.lang.Enum r1 = (java.lang.Enum) r1
                java.lang.String r1 = r1.name()
                goto L_0x0058
            L_0x0036:
                t34.p r1 = t34.C118378p.f353781e
                t34.b r1 = r1.mo183167b()
                r1.getClass()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Class r2 = r4.getClass()
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                java.lang.String r2 = ".class"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
            L_0x0058:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                r3.f351646d = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m34.C117531g.C117532a.<init>(java.lang.Object):void");
        }
    }

    /* renamed from: a */
    public static Throwable m165777a(Throwable th, Object obj) {
        if (th == null) {
            th = new NullPointerException();
        }
        int i = 0;
        int i2 = 0;
        Throwable th4 = th;
        while (true) {
            if (th4.getCause() == null) {
                break;
            }
            int i3 = i2 + 1;
            if (i2 >= 25) {
                th4 = new RuntimeException("Stack too deep to get final cause");
                break;
            }
            th4 = th4.getCause();
            i2 = i3;
        }
        if ((th4 instanceof C117532a) && ((C117532a) th4).f351646d == obj) {
            return th;
        }
        C117532a aVar = new C117532a(obj);
        HashSet hashSet = new HashSet();
        Throwable th5 = th;
        while (true) {
            if (th5.getCause() != null) {
                int i4 = i + 1;
                if (i >= 25) {
                    break;
                }
                th5 = th5.getCause();
                if (!hashSet.contains(th5.getCause())) {
                    hashSet.add(th5.getCause());
                    i = i4;
                }
            }
            try {
                th5.initCause(aVar);
                break;
            } catch (Throwable unused) {
            }
        }
        return th;
    }
}
