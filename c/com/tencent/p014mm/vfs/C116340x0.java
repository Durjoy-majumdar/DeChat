package com.tencent.p014mm.vfs;

import android.util.Pair;
import com.tencent.p014mm.vfs.C116328u0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.SchemeResolver;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.tencent.mm.vfs.x0 */
public final class C116340x0 implements C116328u0 {

    /* renamed from: g */
    public static final C116342y0<FileSystem, FileSystem.C85995c> f349122g = new C116342y0<>(new NativeFileSystem(""));

    /* renamed from: a */
    public final C116333v0 f349123a;

    /* renamed from: b */
    public final List<C116341a> f349124b;

    /* renamed from: c */
    public final C116342y0<FileSystem, FileSystem.C85995c> f349125c;

    /* renamed from: d */
    public Map<String, FileSystem> f349126d = null;

    /* renamed from: e */
    public Map<String, Object> f349127e = null;

    /* renamed from: f */
    public List<C116328u0.C116329a> f349128f = null;

    /* renamed from: com.tencent.mm.vfs.x0$a */
    public static final class C116341a extends C116328u0.C116329a implements Comparable<String> {

        /* renamed from: f */
        public final int f349129f;

        /* renamed from: g */
        public FileSystem.C85995c f349130g;

        public C116341a(String str, String str2, int i, FileSystem.C85995c cVar) {
            super(str, str2);
            this.f349129f = i;
            this.f349130g = cVar;
        }

        public int compareTo(Object obj) {
            return this.f349095d.compareTo((String) obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ea, code lost:
        r4 = r5.f349129f;
     */
    /* JADX WARNING: Incorrect condition in loop: B:25:0x00ec */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116340x0(com.tencent.p014mm.vfs.C116333v0 r14) {
        /*
            r13 = this;
            r13.<init>()
            r0 = 0
            r13.f349126d = r0
            r13.f349127e = r0
            r13.f349128f = r0
            r13.f349123a = r14
            java.util.SortedMap<com.tencent.mm.vfs.v, java.lang.String> r0 = r14.f349108d
            java.util.Map<java.lang.String, com.tencent.mm.vfs.y0<com.tencent.mm.vfs.FileSystem, com.tencent.mm.vfs.FileSystem$c>> r1 = r14.f349106b
            java.util.Map<java.lang.String, java.lang.Object> r2 = r14.f349109e
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            int r4 = r0.size()
            r3.<init>(r4)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0025:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r6 = r4.getKey()
            com.tencent.mm.vfs.v r6 = (com.tencent.p014mm.vfs.C116330v) r6
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r7 = r1
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r7 = r7.get(r4)
            com.tencent.mm.vfs.y0 r7 = (com.tencent.p014mm.vfs.C116342y0) r7
            if (r7 == 0) goto L_0x0068
            java.lang.String[] r6 = r6.mo177822b(r2)
            if (r6 == 0) goto L_0x0025
            int r8 = r6.length
            if (r8 != 0) goto L_0x0053
            goto L_0x0025
        L_0x0053:
            int r8 = r6.length
        L_0x0054:
            if (r5 >= r8) goto L_0x0025
            r9 = r6[r5]
            com.tencent.mm.vfs.x0$a r10 = new com.tencent.mm.vfs.x0$a
            State r11 = r7.f349132b
            com.tencent.mm.vfs.FileSystem$c r11 = (com.tencent.p014mm.vfs.FileSystem.C85995c) r11
            r12 = -1
            r10.<init>(r9, r4, r12, r11)
            r3.add(r10)
            int r5 = r5 + 1
            goto L_0x0054
        L_0x0068:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FileSystem '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "' for mount point '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = "' not exist."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x008c:
            com.tencent.mm.vfs.x0$a[] r0 = new com.tencent.p014mm.vfs.C116340x0.C116341a[r5]
            java.lang.Object[] r0 = r3.toArray(r0)
            com.tencent.mm.vfs.x0$a[] r0 = (com.tencent.p014mm.vfs.C116340x0.C116341a[]) r0
            com.tencent.mm.vfs.w0 r1 = new com.tencent.mm.vfs.w0
            r1.<init>()
            java.util.Arrays.sort(r0, r1)
            r1 = 1
        L_0x009d:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x0101
            r2 = r0[r1]
            java.lang.String r3 = r2.f349095d
            int r4 = r1 + -1
            r5 = r0[r4]
            java.lang.String r6 = r5.f349095d
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L_0x00d1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Oops, duplicated mount point detected: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " <=> "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "VFS.ResolverState"
            com.tencent.stubs.logger.Log.m106513w(r4, r3)
            int r3 = r5.f349129f
            goto L_0x00ef
        L_0x00d1:
            r5 = r0[r4]
            java.lang.String r6 = r5.f349095d
            boolean r6 = r3.startsWith(r6)
            if (r6 == 0) goto L_0x00ea
            java.lang.String r6 = r5.f349095d
            int r6 = r6.length()
            char r6 = r3.charAt(r6)
            r7 = 47
            if (r6 != r7) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            int r4 = r5.f349129f
            if (r4 >= 0) goto L_0x00d1
        L_0x00ee:
            r3 = r4
        L_0x00ef:
            if (r3 < 0) goto L_0x00fe
            com.tencent.mm.vfs.x0$a r4 = new com.tencent.mm.vfs.x0$a
            java.lang.String r5 = r2.f349095d
            java.lang.String r6 = r2.f349096e
            com.tencent.mm.vfs.FileSystem$c r2 = r2.f349130g
            r4.<init>(r5, r6, r3, r2)
            r0[r1] = r4
        L_0x00fe:
            int r1 = r1 + 1
            goto L_0x009d
        L_0x0101:
            java.util.List r0 = java.util.Arrays.asList(r0)
            r13.f349124b = r0
            com.tencent.mm.vfs.y0<com.tencent.mm.vfs.FileSystem, com.tencent.mm.vfs.FileSystem$c> r14 = r14.f349110f
            if (r14 != 0) goto L_0x010d
            com.tencent.mm.vfs.y0<com.tencent.mm.vfs.FileSystem, com.tencent.mm.vfs.FileSystem$c> r14 = f349122g
        L_0x010d:
            r13.f349125c = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116340x0.<init>(com.tencent.mm.vfs.v0):void");
    }

    /* renamed from: a */
    public Map<String, Object> mo177846a() {
        if (this.f349127e == null) {
            this.f349127e = Collections.unmodifiableMap(this.f349123a.f349109e);
        }
        return this.f349127e;
    }

    /* renamed from: b */
    public FileSystem.C85995c mo177847b(String str) {
        C116342y0 y0Var = (C116342y0) ((LinkedHashMap) this.f349123a.f349106b).get(str);
        if (y0Var == null) {
            return null;
        }
        return (FileSystem.C85995c) y0Var.mo177854a(mo177846a(), str);
    }

    /* renamed from: c */
    public Map<String, FileSystem> mo177848c() {
        if (this.f349126d == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) this.f349123a.f349106b).entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (FileSystem) ((C116342y0) entry.getValue()).f349131a);
            }
            this.f349126d = Collections.unmodifiableMap(linkedHashMap);
        }
        return this.f349126d;
    }

    /* renamed from: d */
    public FileSystem.C85995c mo177849d(String str) {
        C116342y0 y0Var = (C116342y0) ((LinkedHashMap) this.f349123a.f349107c).get(str);
        if (y0Var == null) {
            return null;
        }
        return (FileSystem.C85995c) y0Var.mo177854a(mo177846a(), str);
    }

    /* renamed from: e */
    public Pair<FileSystem.C85995c, String> mo177850e(String str, String[] strArr) {
        C116341a aVar;
        String str2;
        FileSystem.C85995c cVar;
        C116341a aVar2;
        List<C116341a> list = this.f349124b;
        String str3 = null;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String k = C116299g2.m163855k(str, true, false);
        int binarySearch = Collections.binarySearch(list, k);
        if (binarySearch >= 0) {
            aVar = list.get(binarySearch);
            str2 = "";
        } else {
            int i = (-binarySearch) - 2;
            while (true) {
                if (i >= 0) {
                    aVar2 = list.get(i);
                    if (k.startsWith(aVar2.f349095d) && k.charAt(aVar2.f349095d.length()) == '/') {
                        break;
                    }
                    i = aVar2.f349129f;
                } else {
                    aVar2 = null;
                    break;
                }
            }
            if (i >= 0) {
                k = k.substring(aVar2.f349095d.length() + 1);
            } else if (!k.isEmpty() && k.charAt(0) == '/') {
                k = k.substring(1);
            }
            str2 = k;
            aVar = aVar2;
        }
        if (aVar == null) {
            cVar = this.f349125c.mo177854a(mo177846a(), "(root)");
        } else {
            if (aVar.f349130g == null) {
                aVar.f349130g = mo177847b(aVar.f349096e);
            }
            FileSystem.C85995c cVar2 = aVar.f349130g;
            str3 = aVar.f349096e;
            cVar = cVar2;
        }
        if (strArr != null) {
            strArr[0] = str3;
        }
        return new Pair<>(cVar, str2);
    }

    /* renamed from: f */
    public SchemeResolver.C116250a mo177851f(String str) {
        C116342y0 y0Var = (C116342y0) ((LinkedHashMap) this.f349123a.f349105a).get(str);
        if (y0Var == null) {
            return null;
        }
        return (SchemeResolver.C116250a) y0Var.mo177854a(mo177846a(), str);
    }

    public String toString() {
        return "schemes: " + this.f349123a.f349105a.size() + ", fileSystems: " + this.f349123a.f349106b.size() + ", mountPoints: " + ((TreeMap) this.f349123a.f349108d).size() + " (" + this.f349124b + " active), envVars: " + this.f349123a.f349109e.size();
    }
}
