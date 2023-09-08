package p977hj;

import java.lang.reflect.Field;

/* renamed from: hj.b */
public class C87527b<T> {

    /* renamed from: a */
    public Object f253580a;

    /* renamed from: b */
    public String f253581b;

    /* renamed from: c */
    public boolean f253582c;

    /* renamed from: d */
    public Field f253583d;

    /* renamed from: e */
    public String f253584e;

    public C87527b(Object obj, String str, String str2) {
        if (obj != null) {
            this.f253580a = obj;
            this.f253581b = str;
            this.f253584e = str2;
            return;
        }
        throw new IllegalArgumentException("obj cannot be null");
    }

    /* renamed from: a */
    public T mo121998a() {
        mo121999b();
        Field field = this.f253583d;
        if (field != null) {
            try {
                return field.get(this.f253580a);
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException("unable to cast object");
            }
        } else {
            throw new NoSuchFieldException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r1.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r1.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[Catch:{ Exception -> 0x0054, all -> 0x001f }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054 A[EDGE_INSN: B:30:0x0054->B:23:0x0054 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[ExcHandler: all (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0010] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121999b() {
        /*
            r8 = this;
            boolean r0 = r8.f253582c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r8.f253582c = r0
            java.lang.Object r1 = r8.f253580a
            java.lang.Class r1 = r1.getClass()
        L_0x000e:
            if (r1 == 0) goto L_0x0059
            java.lang.String r2 = r8.f253581b     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r2.setAccessible(r0)     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r8.f253583d = r2     // Catch:{ Exception -> 0x0021, all -> 0x001f }
            r1.getSuperclass()
            return
        L_0x001f:
            r0 = move-exception
            goto L_0x0050
        L_0x0021:
            java.lang.String r2 = r8.f253584e     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            if (r2 == 0) goto L_0x0054
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            if (r2 != 0) goto L_0x0054
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            int r3 = r2.length     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            r4 = 0
        L_0x0033:
            if (r4 >= r3) goto L_0x0054
            r5 = r2[r4]     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            java.lang.Class r6 = r5.getType()     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            java.lang.String r7 = r8.f253584e     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            if (r6 == 0) goto L_0x004d
            r5.setAccessible(r0)     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            r8.f253583d = r5     // Catch:{ Exception -> 0x0054, all -> 0x001f }
            goto L_0x0054
        L_0x004d:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0050:
            r1.getSuperclass()
            throw r0
        L_0x0054:
            java.lang.Class r1 = r1.getSuperclass()
            goto L_0x000e
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p977hj.C87527b.mo121999b():void");
    }
}
