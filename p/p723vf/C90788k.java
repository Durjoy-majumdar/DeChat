package p723vf;

import java.lang.reflect.Field;

/* renamed from: vf.k */
public class C90788k<Type> {

    /* renamed from: a */
    public Class<?> f260702a;

    /* renamed from: b */
    public String f260703b;

    /* renamed from: c */
    public boolean f260704c;

    /* renamed from: d */
    public Field f260705d;

    public C90788k(Class<?> cls, String str) {
        if (cls == null || str == null || str.length() == 0) {
            throw new IllegalArgumentException("Both of invoker and fieldName can not be null or nil.");
        }
        this.f260702a = cls;
        this.f260703b = str;
    }

    /* renamed from: a */
    public synchronized Type mo124907a(Object obj) {
        return mo124908b(false, obj);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new java.lang.IllegalArgumentException("unable to cast object");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Type mo124908b(boolean r4, java.lang.Object r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo124909c()     // Catch:{ all -> 0x0037 }
            java.lang.reflect.Field r0 = r3.f260705d     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0028
            if (r4 == 0) goto L_0x0022
            java.lang.String r4 = "ReflectFiled"
            java.lang.String r5 = "Field %s is no exists."
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r3.f260703b     // Catch:{ all -> 0x0037 }
            r2 = 0
            r0[r2] = r1     // Catch:{ all -> 0x0037 }
            java.lang.String r5 = java.lang.String.format(r5, r0)     // Catch:{ all -> 0x0037 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
            p723vf.C118672d.m167356f(r4, r5, r0)     // Catch:{ all -> 0x0037 }
            r4 = 0
            monitor-exit(r3)
            return r4
        L_0x0022:
            java.lang.NoSuchFieldException r4 = new java.lang.NoSuchFieldException     // Catch:{ all -> 0x0037 }
            r4.<init>()     // Catch:{ all -> 0x0037 }
            throw r4     // Catch:{ all -> 0x0037 }
        L_0x0028:
            java.lang.Object r4 = r0.get(r5)     // Catch:{ ClassCastException -> 0x002e }
            monitor-exit(r3)
            return r4
        L_0x002e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0037 }
            java.lang.String r5 = "unable to cast object"
            r4.<init>(r5)     // Catch:{ all -> 0x0037 }
            throw r4     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90788k.mo124908b(boolean, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0018 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo124909c() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f260704c     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            java.lang.Class<?> r0 = r3.f260702a     // Catch:{ all -> 0x0021 }
        L_0x0009:
            r1 = 1
            if (r0 == 0) goto L_0x001d
            java.lang.String r2 = r3.f260703b     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch:{ Exception -> 0x0018 }
            r2.setAccessible(r1)     // Catch:{ Exception -> 0x0018 }
            r3.f260705d = r2     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            java.lang.Class r0 = r0.getSuperclass()     // Catch:{ all -> 0x0021 }
            goto L_0x0009
        L_0x001d:
            r3.f260704c = r1     // Catch:{ all -> 0x0021 }
            monitor-exit(r3)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p723vf.C90788k.mo124909c():void");
    }

    /* renamed from: d */
    public synchronized boolean mo124910d(Object obj, Type type, boolean z) {
        mo124909c();
        Field field = this.f260705d;
        if (field != null) {
            field.set(obj, type);
            return true;
        } else if (z) {
            C118672d.m167356f("ReflectFiled", String.format("Field %s is no exists.", new Object[]{this.f260703b}), new Object[0]);
            return false;
        } else {
            throw new NoSuchFieldException("Method " + this.f260703b + " is not exists.");
        }
    }
}
