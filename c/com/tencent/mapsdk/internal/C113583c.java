package com.tencent.mapsdk.internal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mapsdk.internal.c */
class C113583c {

    /* renamed from: a */
    public HashMap<String, HashMap<String, byte[]>> f339928a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, Object> f339929b = new HashMap<>();

    /* renamed from: c */
    public String f339930c = "GBK";

    /* renamed from: d */
    public C113953m f339931d = new C113953m();

    /* renamed from: e */
    private HashMap<String, Object> f339932e = new HashMap<>();

    /* renamed from: a */
    public String mo171891a() {
        return this.f339930c;
    }

    /* renamed from: b */
    public void mo171897b() {
        this.f339932e.clear();
    }

    /* renamed from: c */
    public Set<String> mo171900c() {
        return Collections.unmodifiableSet(this.f339928a.keySet());
    }

    /* renamed from: d */
    public boolean mo171901d() {
        return this.f339928a.isEmpty();
    }

    /* renamed from: e */
    public int mo171902e() {
        return this.f339928a.size();
    }

    /* renamed from: f */
    public byte[] mo171903f() {
        C113979n nVar = new C113979n(0);
        nVar.mo172509a(this.f339930c);
        nVar.mo172519a(this.f339928a, 0);
        return C114095q.m158994a(nVar.f340970a);
    }

    /* renamed from: d */
    private Object m156419d(String str, boolean z, ClassLoader classLoader) {
        String a = C114006o.m158419a(str);
        if (a != null && !"".equals(a)) {
            str = a;
        }
        if (this.f339929b.containsKey(str)) {
            return this.f339929b.get(str);
        }
        Object a2 = C80336a.m97803a(str, z, classLoader);
        this.f339929b.put(str, a2);
        return a2;
    }

    /* renamed from: a */
    public void mo171893a(String str) {
        this.f339930c = str;
    }

    /* renamed from: b */
    public boolean mo171898b(String str) {
        return this.f339928a.containsKey(str);
    }

    /* renamed from: c */
    public <T> T mo171899c(String str, boolean z, ClassLoader classLoader) {
        byte[] bArr;
        String str2;
        if (!this.f339928a.containsKey(str)) {
            return null;
        }
        byte[] bArr2 = new byte[0];
        Iterator it = this.f339928a.remove(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            str2 = (String) entry.getKey();
            bArr = (byte[]) entry.getValue();
        } else {
            byte[] bArr3 = bArr2;
            str2 = "";
            bArr = bArr3;
        }
        try {
            Object a = C80336a.m97803a(str2, z, classLoader);
            this.f339931d.mo172387a(bArr);
            this.f339931d.mo172380a(this.f339930c);
            return this.f339931d.mo172384a(a, 0, true);
        } catch (Exception e) {
            throw new C80337b(e);
        }
    }

    /* renamed from: a */
    public <T> void mo171894a(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("put key can not is null");
        } else if (t == null) {
            throw new IllegalArgumentException("put value can not is null");
        } else if (!(t instanceof Set)) {
            C113979n nVar = new C113979n();
            nVar.mo172509a(this.f339930c);
            nVar.mo172516a((Object) t, 0);
            byte[] a = C114095q.m158994a(nVar.f340970a);
            HashMap hashMap = new HashMap(1);
            ArrayList arrayList = new ArrayList(1);
            m156417a((ArrayList<String>) arrayList, (Object) t);
            hashMap.put(C80336a.m97805a((ArrayList<String>) arrayList), a);
            this.f339932e.remove(str);
            this.f339928a.put(str, hashMap);
        } else {
            throw new IllegalArgumentException("can not support Set");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo171896b(java.lang.String r6, boolean r7, java.lang.ClassLoader r8) {
        /*
            r5 = this;
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r0 = r5.f339928a
            boolean r0 = r0.containsKey(r6)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r5.f339932e
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x0019
            java.util.HashMap<java.lang.String, java.lang.Object> r7 = r5.f339932e
            java.lang.Object r6 = r7.get(r6)
            return r6
        L_0x0019:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r0 = r5.f339928a
            java.lang.Object r0 = r0.get(r6)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r2 = 0
            byte[] r3 = new byte[r2]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0045
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r3 = r0
            byte[] r3 = (byte[]) r3
        L_0x0045:
            java.lang.Object r7 = r5.m156419d(r1, r7, r8)     // Catch:{ Exception -> 0x0060 }
            com.tencent.mapsdk.internal.m r8 = r5.f339931d     // Catch:{ Exception -> 0x0060 }
            r8.mo172387a((byte[]) r3)     // Catch:{ Exception -> 0x0060 }
            com.tencent.mapsdk.internal.m r8 = r5.f339931d     // Catch:{ Exception -> 0x0060 }
            java.lang.String r0 = r5.f339930c     // Catch:{ Exception -> 0x0060 }
            r8.mo172380a((java.lang.String) r0)     // Catch:{ Exception -> 0x0060 }
            com.tencent.mapsdk.internal.m r8 = r5.f339931d     // Catch:{ Exception -> 0x0060 }
            r0 = 1
            java.lang.Object r7 = r8.mo172384a(r7, (int) r2, (boolean) r0)     // Catch:{ Exception -> 0x0060 }
            r5.m156418b(r6, r7)     // Catch:{ Exception -> 0x0060 }
            return r7
        L_0x0060:
            r6 = move-exception
            com.tencent.mapsdk.internal.b r7 = new com.tencent.mapsdk.internal.b
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113583c.mo171896b(java.lang.String, boolean, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    private void m156418b(String str, Object obj) {
        this.f339932e.put(str, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo171890a(java.lang.String r5, boolean r6, java.lang.ClassLoader r7) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r0 = r4.f339928a
            boolean r0 = r0.containsKey(r5)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r4.f339932e
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0019
            java.util.HashMap<java.lang.String, java.lang.Object> r6 = r4.f339932e
            java.lang.Object r5 = r6.get(r5)
            return r5
        L_0x0019:
            java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, byte[]>> r0 = r4.f339928a
            java.lang.Object r0 = r0.get(r5)
            java.util.HashMap r0 = (java.util.HashMap) r0
            r2 = 0
            byte[] r2 = new byte[r2]
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            byte[] r2 = (byte[]) r2
        L_0x0045:
            java.lang.Object r6 = r4.m156419d(r1, r6, r7)     // Catch:{ Exception -> 0x0061 }
            com.tencent.mapsdk.internal.m r7 = r4.f339931d     // Catch:{ Exception -> 0x0061 }
            r7.mo172387a((byte[]) r2)     // Catch:{ Exception -> 0x0061 }
            com.tencent.mapsdk.internal.m r7 = r4.f339931d     // Catch:{ Exception -> 0x0061 }
            java.lang.String r0 = r4.f339930c     // Catch:{ Exception -> 0x0061 }
            r7.mo172380a((java.lang.String) r0)     // Catch:{ Exception -> 0x0061 }
            com.tencent.mapsdk.internal.m r7 = r4.f339931d     // Catch:{ Exception -> 0x0061 }
            com.tencent.mapsdk.internal.p r6 = (com.tencent.mapsdk.internal.C114029p) r6     // Catch:{ Exception -> 0x0061 }
            com.tencent.mapsdk.internal.p r6 = r7.mo172382a((com.tencent.mapsdk.internal.C114029p) r6)     // Catch:{ Exception -> 0x0061 }
            r4.m156418b(r5, r6)     // Catch:{ Exception -> 0x0061 }
            return r6
        L_0x0061:
            r5 = move-exception
            com.tencent.mapsdk.internal.b r6 = new com.tencent.mapsdk.internal.b
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C113583c.mo171890a(java.lang.String, boolean, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: a */
    public <T> T mo171889a(String str, Object obj, boolean z, ClassLoader classLoader) {
        String str2;
        byte[] bArr;
        if (!this.f339928a.containsKey(str)) {
            return obj;
        }
        if (this.f339932e.containsKey(str)) {
            return this.f339932e.get(str);
        }
        byte[] bArr2 = new byte[0];
        Iterator it = this.f339928a.get(str).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            str2 = (String) entry.getKey();
            bArr = (byte[]) entry.getValue();
        } else {
            byte[] bArr3 = bArr2;
            str2 = "";
            bArr = bArr3;
        }
        try {
            Object d = m156419d(str2, z, classLoader);
            this.f339931d.mo172387a(bArr);
            this.f339931d.mo172380a(this.f339930c);
            T a = this.f339931d.mo172384a(d, 0, true);
            m156418b(str, a);
            return a;
        } catch (Exception unused) {
            m156418b(str, obj);
            return obj;
        }
    }

    /* renamed from: a */
    private void m156417a(ArrayList<String> arrayList, Object obj) {
        while (true) {
            if (obj.getClass().isArray()) {
                if (!obj.getClass().getComponentType().toString().equals("byte")) {
                    throw new IllegalArgumentException("only byte[] is supported");
                } else if (Array.getLength(obj) > 0) {
                    arrayList.add("java.util.List");
                    obj = Array.get(obj, 0);
                } else {
                    arrayList.add("Array");
                    arrayList.add("?");
                    return;
                }
            } else if (obj instanceof Array) {
                throw new IllegalArgumentException("can not support Array, please use List");
            } else if (obj instanceof List) {
                arrayList.add("java.util.List");
                List list = (List) obj;
                if (list.size() > 0) {
                    obj = list.get(0);
                } else {
                    arrayList.add("?");
                    return;
                }
            } else if (obj instanceof Map) {
                arrayList.add("java.util.Map");
                Map map = (Map) obj;
                if (map.size() > 0) {
                    Object obj2 = map.get(map.keySet().iterator().next());
                    arrayList.add(mo171892a(obj));
                    obj = obj2;
                } else {
                    arrayList.add("?");
                    arrayList.add("?");
                    return;
                }
            } else {
                arrayList.add(mo171892a(obj));
                return;
            }
        }
    }

    /* renamed from: a */
    public <T> String mo171892a(T t) {
        String str;
        if (t instanceof C114029p) {
            str = ((C114029p) t).className();
        } else {
            str = "";
        }
        return "".equals(str) ? t.getClass().getName() : str;
    }

    /* renamed from: a */
    public void mo171895a(byte[] bArr) {
        this.f339931d.mo172387a(bArr);
        this.f339931d.mo172380a(this.f339930c);
        HashMap hashMap = new HashMap(1);
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("", new byte[0]);
        hashMap.put("", hashMap2);
        this.f339928a = this.f339931d.mo172385a(hashMap, 0, false);
    }
}
