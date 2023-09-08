package t34;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: t34.p */
public class C118378p {

    /* renamed from: e */
    public static final C118378p f353781e = new C118378p();

    /* renamed from: f */
    public static final C118364b f353782f = new C118379a();

    /* renamed from: a */
    public final AtomicReference<C118364b> f353783a = new AtomicReference<>();

    /* renamed from: b */
    public final AtomicReference<C118376n> f353784b = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<C118363a> f353785c;

    /* renamed from: d */
    public final AtomicReference<C118381q> f353786d;

    /* renamed from: t34.p$a */
    public static class C118379a extends C118364b {
    }

    /* renamed from: t34.p$b */
    public class C118380b extends C118363a {
        public C118380b(C118378p pVar) {
        }
    }

    public C118378p() {
        new AtomicReference();
        this.f353785c = new AtomicReference<>();
        this.f353786d = new AtomicReference<>();
    }

    /* renamed from: d */
    public static Object m166987d(Class<?> cls, Properties properties) {
        Properties properties2 = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String property = properties2.getProperty("rxjava.plugin." + simpleName + ".implementation");
        if (property == null) {
            Iterator it = properties2.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String obj = entry.getKey().toString();
                if (obj.startsWith("rxjava.plugin.") && obj.endsWith(".class") && simpleName.equals(entry.getValue().toString())) {
                    String str = "rxjava.plugin." + obj.substring(0, obj.length() - 6).substring(14) + ".impl";
                    String property2 = properties2.getProperty(str);
                    if (property2 != null) {
                        property = property2;
                    } else {
                        throw new IllegalStateException("Implementing class declaration for " + simpleName + " missing: " + str);
                    }
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (ClassCastException e) {
            throw new IllegalStateException(simpleName + " implementation is not an instance of " + simpleName + ": " + property, e);
        } catch (ClassNotFoundException e2) {
            throw new IllegalStateException(simpleName + " implementation class not found: " + property, e2);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(simpleName + " implementation not able to be instantiated: " + property, e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(simpleName + " implementation not able to be accessed: " + property, e4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[LOOP:1: B:10:0x002e->B:13:0x0039, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001c A[LOOP:0: B:5:0x001c->B:8:0x0027, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t34.C118363a mo183166a() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<t34.a> r0 = r4.f353785c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x003b
            java.lang.Class<t34.a> r0 = t34.C118363a.class
            java.util.Properties r1 = java.lang.System.getProperties()
            java.lang.Object r0 = m166987d(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x002a
            java.util.concurrent.atomic.AtomicReference<t34.a> r2 = r4.f353785c
            t34.p$b r3 = new t34.p$b
            r3.<init>(r4)
        L_0x001c:
            boolean r0 = r2.compareAndSet(r1, r3)
            if (r0 == 0) goto L_0x0023
            goto L_0x003b
        L_0x0023:
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x001c
            goto L_0x003b
        L_0x002a:
            java.util.concurrent.atomic.AtomicReference<t34.a> r2 = r4.f353785c
            t34.a r0 = (t34.C118363a) r0
        L_0x002e:
            boolean r3 = r2.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x0035
            goto L_0x003b
        L_0x0035:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L_0x002e
        L_0x003b:
            java.util.concurrent.atomic.AtomicReference<t34.a> r0 = r4.f353785c
            java.lang.Object r0 = r0.get()
            t34.a r0 = (t34.C118363a) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t34.C118378p.mo183166a():t34.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[LOOP:1: B:10:0x002b->B:13:0x0036, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019 A[LOOP:0: B:5:0x0019->B:8:0x0024, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t34.C118364b mo183167b() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<t34.b> r0 = r4.f353783a
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0038
            java.lang.Class<t34.b> r0 = t34.C118364b.class
            java.util.Properties r1 = java.lang.System.getProperties()
            java.lang.Object r0 = m166987d(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.concurrent.atomic.AtomicReference<t34.b> r2 = r4.f353783a
            t34.b r3 = f353782f
        L_0x0019:
            boolean r0 = r2.compareAndSet(r1, r3)
            if (r0 == 0) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x0019
            goto L_0x0038
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference<t34.b> r2 = r4.f353783a
            t34.b r0 = (t34.C118364b) r0
        L_0x002b:
            boolean r3 = r2.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L_0x002b
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference<t34.b> r0 = r4.f353783a
            java.lang.Object r0 = r0.get()
            t34.b r0 = (t34.C118364b) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t34.C118378p.mo183167b():t34.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[LOOP:1: B:10:0x002b->B:13:0x0036, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019 A[LOOP:0: B:5:0x0019->B:8:0x0024, LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t34.C118376n mo183168c() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<t34.n> r0 = r4.f353784b
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0038
            java.lang.Class<t34.n> r0 = t34.C118376n.class
            java.util.Properties r1 = java.lang.System.getProperties()
            java.lang.Object r0 = m166987d(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.concurrent.atomic.AtomicReference<t34.n> r2 = r4.f353784b
            t34.o r3 = t34.C118377o.f353780a
        L_0x0019:
            boolean r0 = r2.compareAndSet(r1, r3)
            if (r0 == 0) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x0019
            goto L_0x0038
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference<t34.n> r2 = r4.f353784b
            t34.n r0 = (t34.C118376n) r0
        L_0x002b:
            boolean r3 = r2.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L_0x002b
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference<t34.n> r0 = r4.f353784b
            java.lang.Object r0 = r0.get()
            t34.n r0 = (t34.C118376n) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t34.C118378p.mo183168c():t34.n");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b A[LOOP:1: B:10:0x002b->B:13:0x0036, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0019 A[LOOP:0: B:5:0x0019->B:8:0x0024, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t34.C118381q mo183169e() {
        /*
            r4 = this;
            java.util.concurrent.atomic.AtomicReference<t34.q> r0 = r4.f353786d
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0038
            java.lang.Class<t34.q> r0 = t34.C118381q.class
            java.util.Properties r1 = java.lang.System.getProperties()
            java.lang.Object r0 = m166987d(r0, r1)
            r1 = 0
            if (r0 != 0) goto L_0x0027
            java.util.concurrent.atomic.AtomicReference<t34.q> r2 = r4.f353786d
            t34.q r3 = t34.C118381q.f353787a
        L_0x0019:
            boolean r0 = r2.compareAndSet(r1, r3)
            if (r0 == 0) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x0019
            goto L_0x0038
        L_0x0027:
            java.util.concurrent.atomic.AtomicReference<t34.q> r2 = r4.f353786d
            t34.q r0 = (t34.C118381q) r0
        L_0x002b:
            boolean r3 = r2.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L_0x002b
        L_0x0038:
            java.util.concurrent.atomic.AtomicReference<t34.q> r0 = r4.f353786d
            java.lang.Object r0 = r0.get()
            t34.q r0 = (t34.C118381q) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t34.C118378p.mo183169e():t34.q");
    }
}
