package lx1;

import android.util.SparseIntArray;
import android.view.LayoutInflater;
import java.util.List;
import lx1.C99718b;

/* renamed from: lx1.c */
public abstract class C99719c<T, VH extends C99718b> extends C99717a<VH> {

    /* renamed from: b */
    public LayoutInflater f292259b;

    /* renamed from: c */
    public SparseIntArray f292260c;

    /* renamed from: d */
    public List<T> f292261d;

    /* renamed from: a */
    public int mo139068a() {
        List<T> list = this.f292261d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: b */
    public int mo139069b(int i) {
        return mo139075h(i);
    }

    /* renamed from: d */
    public void mo139071d(VH vh, int i) {
        mo139074g(vh, i, this.f292261d.get(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r1 = r6;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VH mo139072e(android.view.ViewGroup r9, int r10) {
        /*
            r8 = this;
            android.view.LayoutInflater r0 = r8.f292259b
            if (r0 != 0) goto L_0x000e
            android.content.Context r0 = r9.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r8.f292259b = r0
        L_0x000e:
            android.util.SparseIntArray r0 = r8.f292260c
            r1 = -404(0xfffffffffffffe6c, float:NaN)
            int r10 = r0.get(r10, r1)
            r0 = 0
            r2 = 0
            if (r10 == r1) goto L_0x0021
            android.view.LayoutInflater r1 = r8.f292259b
            android.view.View r9 = r1.inflate(r10, r9, r0)
            goto L_0x0022
        L_0x0021:
            r9 = r2
        L_0x0022:
            java.lang.Class r10 = r8.getClass()
            r1 = r2
        L_0x0027:
            if (r1 != 0) goto L_0x006f
            if (r10 == 0) goto L_0x006f
            java.lang.Class<lx1.b> r1 = lx1.C99718b.class
            java.lang.reflect.Type r3 = r10.getGenericSuperclass()
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0069
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            int r4 = r3.length
            r5 = 0
        L_0x003d:
            if (r5 >= r4) goto L_0x0069
            r6 = r3[r5]
            boolean r7 = r6 instanceof java.lang.Class
            if (r7 == 0) goto L_0x004e
            java.lang.Class r6 = (java.lang.Class) r6
            boolean r7 = r1.isAssignableFrom(r6)
            if (r7 == 0) goto L_0x0066
            goto L_0x0064
        L_0x004e:
            boolean r7 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x0066
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type r6 = r6.getRawType()
            boolean r7 = r6 instanceof java.lang.Class
            if (r7 == 0) goto L_0x0066
            java.lang.Class r6 = (java.lang.Class) r6
            boolean r7 = r1.isAssignableFrom(r6)
            if (r7 == 0) goto L_0x0066
        L_0x0064:
            r1 = r6
            goto L_0x006a
        L_0x0066:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0069:
            r1 = r2
        L_0x006a:
            java.lang.Class r10 = r10.getSuperclass()
            goto L_0x0027
        L_0x006f:
            if (r1 != 0) goto L_0x0077
            lx1.b r10 = new lx1.b
            r10.<init>(r9)
            goto L_0x00c4
        L_0x0077:
            boolean r10 = r1.isMemberClass()     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            r3 = 1
            if (r10 == 0) goto L_0x00a9
            int r10 = r1.getModifiers()     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            if (r10 != 0) goto L_0x00a9
            r10 = 2
            java.lang.Class[] r4 = new java.lang.Class[r10]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Class r5 = r8.getClass()     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            r4[r0] = r5     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Class<android.view.View> r5 = android.view.View.class
            r4[r3] = r5     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r4)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            r1.setAccessible(r3)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            r10[r0] = r8     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            r10[r3] = r9     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Object r10 = r1.newInstance(r10)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            lx1.b r10 = (lx1.C99718b) r10     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            goto L_0x00c0
        L_0x00a9:
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Class<android.view.View> r4 = android.view.View.class
            r10[r0] = r4     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.reflect.Constructor r10 = r1.getDeclaredConstructor(r10)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            r10.setAccessible(r3)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            r1[r0] = r9     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            java.lang.Object r10 = r10.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
            lx1.b r10 = (lx1.C99718b) r10     // Catch:{ IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException -> 0x00c2 }
        L_0x00c0:
            r2 = r10
            goto L_0x00c3
        L_0x00c2:
        L_0x00c3:
            r10 = r2
        L_0x00c4:
            if (r10 == 0) goto L_0x00c7
            goto L_0x00cc
        L_0x00c7:
            lx1.b r10 = new lx1.b
            r10.<init>(r9)
        L_0x00cc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: lx1.C99719c.mo139072e(android.view.ViewGroup, int):lx1.b");
    }

    /* renamed from: f */
    public void mo139073f(int i, int i2) {
        if (this.f292260c == null) {
            this.f292260c = new SparseIntArray();
        }
        this.f292260c.put(i, i2);
    }

    /* renamed from: g */
    public abstract void mo139074g(VH vh, int i, T t);

    /* renamed from: h */
    public abstract int mo139075h(int i);
}
