package com.tencent.mapsdk.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.tencent.mapsdk.internal.e */
public class C113647e extends C113583c {

    /* renamed from: e */
    public HashMap<String, byte[]> f340045e = null;

    /* renamed from: f */
    public C113953m f340046f = new C113953m();

    /* renamed from: g */
    private HashMap<String, Object> f340047g = new HashMap<>();

    /* renamed from: f */
    private <T> T m156633f(String str, T t) {
        if (!this.f340045e.containsKey(str)) {
            return null;
        }
        if (t != null) {
            return m156624a(this.f340045e.remove(str), (Object) t);
        }
        this.f340045e.remove(str);
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo171891a() {
        return super.mo171891a();
    }

    /* renamed from: b */
    public final void mo171897b() {
        this.f340047g.clear();
    }

    /* renamed from: c */
    public final Set<String> mo171900c() {
        HashMap<String, byte[]> hashMap = this.f340045e;
        if (hashMap != null) {
            return Collections.unmodifiableSet(hashMap.keySet());
        }
        return Collections.unmodifiableSet(this.f339928a.keySet());
    }

    /* renamed from: d */
    public final boolean mo171901d() {
        HashMap<String, byte[]> hashMap = this.f340045e;
        if (hashMap != null) {
            return hashMap.isEmpty();
        }
        return this.f339928a.isEmpty();
    }

    /* renamed from: e */
    public final int mo171902e() {
        HashMap<String, byte[]> hashMap = this.f340045e;
        if (hashMap != null) {
            return hashMap.size();
        }
        return this.f339928a.size();
    }

    /* renamed from: g */
    public void mo171985g() {
        this.f340045e = new HashMap<>();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo171892a(Object obj) {
        return super.mo171892a(obj);
    }

    /* renamed from: b */
    public final boolean mo171898b(String str) {
        HashMap<String, byte[]> hashMap = this.f340045e;
        if (hashMap != null) {
            return hashMap.containsKey(str);
        }
        return this.f339928a.containsKey(str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo171893a(String str) {
        super.mo171893a(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T m156628c(java.lang.String r5, T r6) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, byte[]> r0 = r4.f340045e
            r1 = 0
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.f340047g
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x001b
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r4.f340047g
            java.lang.Object r5 = r6.get(r5)
            return r5
        L_0x001b:
            java.util.HashMap<java.lang.String, byte[]> r0 = r4.f340045e
            java.lang.Object r0 = r0.get(r5)
            byte[] r0 = (byte[]) r0
            java.lang.Object r6 = r4.m156624a((byte[]) r0, (java.lang.Object) r6)     // Catch:{ Exception -> 0x002d }
            if (r6 == 0) goto L_0x002c
            r4.m156630d(r5, r6)     // Catch:{ Exception -> 0x002d }
        L_0x002c:
            return r6
        L_0x002d:
            r5 = move-exception
            com.tencent.mapsdk.internal.b r6 = new com.tencent.mapsdk.internal.b
            r6.<init>(r5)
            throw r6
        L_0x0034:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r0 = r4.f339928a
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto L_0x003d
            return r1
        L_0x003d:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.f340047g
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x004c
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r4.f340047g
            java.lang.Object r5 = r6.get(r5)
            return r5
        L_0x004c:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r0 = r4.f339928a
            java.lang.Object r0 = r0.get(r5)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r1 = 0
            byte[] r2 = new byte[r1]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0075
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            byte[] r2 = (byte[]) r2
        L_0x0075:
            com.tencent.mapsdk.internal.m r0 = r4.f340046f     // Catch:{ Exception -> 0x008c }
            r0.mo172387a((byte[]) r2)     // Catch:{ Exception -> 0x008c }
            com.tencent.mapsdk.internal.m r0 = r4.f340046f     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = r4.f339930c     // Catch:{ Exception -> 0x008c }
            r0.mo172380a((java.lang.String) r2)     // Catch:{ Exception -> 0x008c }
            com.tencent.mapsdk.internal.m r0 = r4.f340046f     // Catch:{ Exception -> 0x008c }
            r2 = 1
            java.lang.Object r6 = r0.mo172384a(r6, (int) r1, (boolean) r2)     // Catch:{ Exception -> 0x008c }
            r4.m156630d(r5, r6)     // Catch:{ Exception -> 0x008c }
            return r6
        L_0x008c:
            r5 = move-exception
            com.tencent.mapsdk.internal.b r6 = new com.tencent.mapsdk.internal.b
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113647e.m156628c(java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: d */
    private void m156630d(String str, Object obj) {
        this.f340047g.put(str, obj);
    }

    /* renamed from: e */
    private <T> T m156632e(String str, Object obj) {
        return mo171889a(str, obj, true, (ClassLoader) null);
    }

    /* renamed from: a */
    public <T> void mo171894a(String str, T t) {
        if (this.f340045e == null) {
            super.mo171894a(str, t);
        } else if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        } else if (!(t instanceof Set)) {
            C113979n nVar = new C113979n();
            nVar.mo172509a(this.f339930c);
            nVar.mo172516a((Object) t, 0);
            this.f340045e.put(str, C114095q.m158994a(nVar.f340970a));
        } else {
            throw new IllegalArgumentException("can not support Set");
        }
    }

    /* renamed from: b */
    private <T> T m156625b(String str, T t) {
        if (!this.f340045e.containsKey(str)) {
            return null;
        }
        if (this.f340047g.containsKey(str)) {
            return this.f340047g.get(str);
        }
        try {
            T a = m156624a(this.f340045e.get(str), (Object) t);
            if (a != null) {
                m156630d(str, a);
            }
            return a;
        } catch (Exception e) {
            throw new C80337b(e);
        }
    }

    /* renamed from: d */
    private <T> T mo172058d(String str) {
        return mo171896b(str, true, (ClassLoader) null);
    }

    /* renamed from: e */
    private <T> T m156631e(String str) {
        return mo171899c(str, true, (ClassLoader) null);
    }

    /* renamed from: f */
    public byte[] mo171903f() {
        if (this.f340045e == null) {
            return super.mo171903f();
        }
        C113979n nVar = new C113979n(0);
        nVar.mo172509a(this.f339930c);
        nVar.mo172519a(this.f340045e, 0);
        return C114095q.m158994a(nVar.f340970a);
    }

    /* renamed from: b */
    private <T> T m156626b(String str, T t, Object obj) {
        if (!this.f340045e.containsKey(str)) {
            return obj;
        }
        return m156628c(str, t);
    }

    /* renamed from: b */
    public final <T> T mo171896b(String str, boolean z, ClassLoader classLoader) {
        if (this.f340045e == null) {
            return super.mo171896b(str, z, classLoader);
        }
        throw new RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy)");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T m156623a(java.lang.String r4, T r5, T r6) {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, byte[]> r0 = r3.f340045e
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L_0x000b
            return r6
        L_0x000b:
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r3.f340047g
            boolean r6 = r6.containsKey(r4)
            if (r6 == 0) goto L_0x001a
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = r3.f340047g
            java.lang.Object r4 = r5.get(r4)
            return r4
        L_0x001a:
            java.util.HashMap<java.lang.String, byte[]> r6 = r3.f340045e
            java.lang.Object r6 = r6.get(r4)
            byte[] r6 = (byte[]) r6
            java.lang.Object r5 = r3.m156624a((byte[]) r6, (java.lang.Object) r5)     // Catch:{ Exception -> 0x002c }
            if (r5 == 0) goto L_0x002b
            r3.m156630d(r4, r5)     // Catch:{ Exception -> 0x002c }
        L_0x002b:
            return r5
        L_0x002c:
            r4 = move-exception
            com.tencent.mapsdk.internal.b r5 = new com.tencent.mapsdk.internal.b
            r5.<init>(r4)
            throw r5
        L_0x0033:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r0 = r3.f339928a
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L_0x003c
            return r6
        L_0x003c:
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r3.f340047g
            boolean r6 = r6.containsKey(r4)
            if (r6 == 0) goto L_0x004b
            java.util.HashMap<java.lang.String, java.lang.Object> r5 = r3.f340047g
            java.lang.Object r4 = r5.get(r4)
            return r4
        L_0x004b:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r6 = r3.f339928a
            java.lang.Object r6 = r6.get(r4)
            java.util.HashMap r6 = (java.util.HashMap) r6
            r0 = 0
            byte[] r1 = new byte[r0]
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0074
            java.lang.Object r6 = r6.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r1 = r6
            byte[] r1 = (byte[]) r1
        L_0x0074:
            com.tencent.mapsdk.internal.m r6 = r3.f340046f     // Catch:{ Exception -> 0x008b }
            r6.mo172387a((byte[]) r1)     // Catch:{ Exception -> 0x008b }
            com.tencent.mapsdk.internal.m r6 = r3.f340046f     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = r3.f339930c     // Catch:{ Exception -> 0x008b }
            r6.mo172380a((java.lang.String) r1)     // Catch:{ Exception -> 0x008b }
            com.tencent.mapsdk.internal.m r6 = r3.f340046f     // Catch:{ Exception -> 0x008b }
            r1 = 1
            java.lang.Object r5 = r6.mo172384a(r5, (int) r0, (boolean) r1)     // Catch:{ Exception -> 0x008b }
            r3.m156630d(r4, r5)     // Catch:{ Exception -> 0x008b }
            return r5
        L_0x008b:
            r4 = move-exception
            com.tencent.mapsdk.internal.b r5 = new com.tencent.mapsdk.internal.b
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113647e.m156623a(java.lang.String, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public void mo171983b(byte[] bArr) {
        this.f340046f.mo172387a(bArr);
        this.f340046f.mo172380a(this.f339930c);
        HashMap hashMap = new HashMap(1);
        hashMap.put("", new byte[0]);
        this.f340045e = this.f340046f.mo172385a(hashMap, 0, false);
    }

    /* renamed from: c */
    private <T> T mo172057c(String str) {
        return mo171890a(str, true, (ClassLoader) null);
    }

    /* renamed from: c */
    public final <T> T mo171899c(String str, boolean z, ClassLoader classLoader) {
        HashMap<String, byte[]> hashMap = this.f340045e;
        if (hashMap == null) {
            return super.mo171899c(str, z, classLoader);
        }
        if (!hashMap.containsKey(str)) {
            return null;
        }
        this.f340045e.remove(str);
        return null;
    }

    /* renamed from: c */
    public void mo171984c(byte[] bArr) {
        super.mo171895a(bArr);
    }

    /* renamed from: a */
    private Object m156624a(byte[] bArr, Object obj) {
        this.f340046f.mo172387a(bArr);
        this.f340046f.mo172380a(this.f339930c);
        return this.f340046f.mo172384a(obj, 0, true);
    }

    /* renamed from: a */
    public final <T> T mo171890a(String str, boolean z, ClassLoader classLoader) {
        if (this.f340045e == null) {
            return super.mo171890a(str, z, classLoader);
        }
        throw new RuntimeException("data is encoded by new version, please use getJceStruct(String name,T proxy)");
    }

    /* renamed from: a */
    public final <T> T mo171889a(String str, Object obj, boolean z, ClassLoader classLoader) {
        if (this.f340045e == null) {
            return super.mo171889a(str, obj, z, classLoader);
        }
        throw new RuntimeException("data is encoded by new version, please use getByClass(String name, T proxy, Object defaultValue)");
    }

    /* renamed from: a */
    public void mo171895a(byte[] bArr) {
        try {
            super.mo171895a(bArr);
        } catch (Exception unused) {
            this.f340046f.mo172387a(bArr);
            this.f340046f.mo172380a(this.f339930c);
            HashMap hashMap = new HashMap(1);
            hashMap.put("", new byte[0]);
            this.f340045e = this.f340046f.mo172385a(hashMap, 0, false);
        }
    }
}
