package ou3;

import java.lang.reflect.Field;
import zt3.C119146d;

/* renamed from: ou3.a */
public class C89297a<Type> {

    /* renamed from: a */
    public Class<?> f257247a;

    /* renamed from: b */
    public String f257248b;

    /* renamed from: c */
    public boolean f257249c;

    /* renamed from: d */
    public Field f257250d;

    public C89297a(Class<?> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            throw new IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f257247a = cls;
        this.f257248b = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        throw new java.lang.IllegalArgumentException("unable to cast object");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0030 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Type mo123639a(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo123640b()     // Catch:{ all -> 0x0039 }
            java.lang.reflect.Field r0 = r6.f257250d     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 != 0) goto L_0x002a
            if (r7 == 0) goto L_0x0024
            zt3.d$b r7 = zt3.C119146d.f356851c     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = "ReflectFiled"
            java.lang.String r2 = "Field %s is no exists."
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0039 }
            java.lang.String r4 = r6.f257248b     // Catch:{ all -> 0x0039 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0039 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0039 }
            r7.mo125766w(r0, r2, r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r6)
            return r1
        L_0x0024:
            java.lang.NoSuchFieldException r7 = new java.lang.NoSuchFieldException     // Catch:{ all -> 0x0039 }
            r7.<init>()     // Catch:{ all -> 0x0039 }
            throw r7     // Catch:{ all -> 0x0039 }
        L_0x002a:
            java.lang.Object r7 = r0.get(r1)     // Catch:{ ClassCastException -> 0x0030 }
            monitor-exit(r6)
            return r7
        L_0x0030:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0039 }
            java.lang.String r0 = "unable to cast object"
            r7.<init>(r0)     // Catch:{ all -> 0x0039 }
            throw r7     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ou3.C89297a.mo123639a(boolean):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0018 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo123640b() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f257249c     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            java.lang.Class<?> r0 = r3.f257247a     // Catch:{ all -> 0x0021 }
        L_0x0009:
            r1 = 1
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = r3.f257248b     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0018 }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x0018 }
            r3.f257250d = r2     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ all -> 0x0021 }
            goto L_0x0009
        L_0x001d:
            r3.f257249c = r1     // Catch:{ all -> 0x0021 }
            monitor-exit(r3)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ou3.C89297a.mo123640b():void");
    }

    /* renamed from: c */
    public synchronized boolean mo123641c(Object obj, Type type, boolean z) {
        mo123640b();
        Field field = this.f257250d;
        if (field != null) {
            field.set(obj, type);
            return true;
        } else if (z) {
            C119146d.f356851c.mo125766w("ReflectFiled", String.format("Field %s is no exists.", new Object[]{this.f257248b}), new Object[0]);
            return false;
        } else {
            throw new NoSuchFieldException("Method " + this.f257248b + " is not exists.");
        }
    }
}
