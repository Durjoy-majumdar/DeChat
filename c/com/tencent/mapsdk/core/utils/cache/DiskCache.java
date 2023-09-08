package com.tencent.mapsdk.core.utils.cache;

import android.text.TextUtils;
import com.tencent.mapsdk.internal.C0949kl;
import com.tencent.mapsdk.internal.C113846jl;
import com.tencent.mapsdk.internal.C113849jm;
import com.tencent.mapsdk.internal.C113850jn;
import com.tencent.mapsdk.internal.C113856jr;
import com.tencent.mapsdk.internal.C113884kf;
import com.tencent.mapsdk.internal.C113896kq;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DiskCache<D extends C113849jm> extends C113856jr<D> {

    /* renamed from: a */
    private static final String f339585a = "DiskCache";

    /* renamed from: b */
    private static final String f339586b = ".disk_idx";

    /* renamed from: c */
    private static final String f339587c = ".disk_idx_root";
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C113489a f339588k = new C113489a() {
        /* renamed from: a */
        public final File mo170959a(String str, String str2, byte[] bArr) {
            File file = new File(str2, str);
            C113884kf.m157491a(file, bArr);
            return file;
        }

        /* renamed from: a */
        public final byte[] mo170961a(String str, File file) {
            return C113884kf.m157503c(file);
        }

        /* renamed from: a */
        public final boolean mo170960a(File file) {
            return C113884kf.m157500b(file);
        }
    };

    /* renamed from: d */
    private C113850jn.C113851a<C113490b> f339589d;

    /* renamed from: e */
    private C113491c f339590e;

    /* renamed from: f */
    private File f339591f;

    /* renamed from: g */
    private File f339592g;

    /* renamed from: h */
    private Map<String, String> f339593h;

    /* renamed from: i */
    private List<String> f339594i;

    /* renamed from: j */
    private boolean f339595j;

    /* renamed from: com.tencent.mapsdk.core.utils.cache.DiskCache$a */
    public interface C113489a {
        /* renamed from: a */
        File mo170959a(String str, String str2, byte[] bArr);

        /* renamed from: a */
        boolean mo170960a(File file);

        /* renamed from: a */
        byte[] mo170961a(String str, File file);
    }

    /* renamed from: com.tencent.mapsdk.core.utils.cache.DiskCache$b */
    public static final class C113490b extends C113849jm {

        /* renamed from: a */
        public File f339596a;

        /* renamed from: b */
        private int f339597b;

        public C113490b(File file, int i) {
            this.f339596a = file;
            this.f339597b = i;
        }

        /* renamed from: a */
        public final void mo56235a(byte[] bArr) {
        }

        /* renamed from: b */
        public final byte[] mo56236b() {
            return new byte[this.f339597b];
        }

        public final String toString() {
            return this.f339596a.getName() + "," + this.f339597b;
        }

        /* renamed from: a */
        public final int mo56234a() {
            return this.f339597b;
        }
    }

    /* renamed from: com.tencent.mapsdk.core.utils.cache.DiskCache$c */
    public static class C113491c extends C113856jr.C113860c {

        /* renamed from: b */
        public static final long f339598b = -1;

        /* renamed from: c */
        public File f339599c = C113884kf.f340711d;

        /* renamed from: d */
        public String f339600d = "tmp";

        /* renamed from: e */
        public C113489a f339601e = DiskCache.f339588k;

        /* renamed from: f */
        public long f339602f = -1;

        /* renamed from: g */
        public final C113846jl.C113848b<C113490b> f339603g = new C113846jl.C113848b<C113490b>() {
            /* renamed from: a */
            public final /* synthetic */ boolean mo147866a(Object obj) {
                C113490b bVar = (C113490b) obj;
                boolean z = false;
                if (bVar == null) {
                    return false;
                }
                C113846jl.C113848b<File> bVar2 = C113491c.this.f339604h;
                if (bVar2 != null) {
                    z = bVar2.mo147866a(bVar.f339596a);
                }
                if (z) {
                    return z;
                }
                C113884kf.m157500b(bVar.f339596a);
                return true;
            }

            /* renamed from: a */
            private boolean m155419a(C113490b bVar) {
                boolean z = false;
                if (bVar == null) {
                    return false;
                }
                C113846jl.C113848b<File> bVar2 = C113491c.this.f339604h;
                if (bVar2 != null) {
                    z = bVar2.mo147866a(bVar.f339596a);
                }
                if (z) {
                    return z;
                }
                C113884kf.m157500b(bVar.f339596a);
                return true;
            }
        };

        /* renamed from: h */
        public C113846jl.C113848b<File> f339604h;

        public C113491c() {
            super(C113856jr.C113858a.DISK);
        }

        public final String toString() {
            return "Options{mCacheDirectory=" + this.f339599c + ", mCacheName='" + this.f339600d + '\'' + ", fileAccessStrategy=" + this.f339601e + "} " + super.toString();
        }

        /* renamed from: a */
        private C113491c m155408a(C113846jl.C113848b<File> bVar) {
            this.f339604h = bVar;
            return this;
        }

        /* renamed from: c */
        private File m155414c() {
            return new File(this.f339599c, this.f339600d);
        }

        /* renamed from: b */
        public final C113491c mo170963b() {
            this.f339602f = 1024;
            return this;
        }

        /* renamed from: a */
        private C113491c m155407a(C113489a aVar) {
            this.f339601e = aVar;
            return this;
        }

        /* renamed from: a */
        private C113491c m155409a(File file) {
            this.f339599c = file;
            return this;
        }

        /* renamed from: a */
        private C113491c m155410a(String str) {
            this.f339600d = str;
            return this;
        }

        private C113491c(String str) {
            super(C113856jr.C113858a.DISK);
            this.f339600d = str;
        }
    }

    public DiskCache(C113491c cVar) {
        super(cVar);
        this.f339590e = cVar;
        if (cVar != null) {
            this.f339591f = C113884kf.m157485a(cVar.f339599c, cVar.f339600d);
            C113491c cVar2 = this.f339590e;
            int i = cVar2.f340638j;
            boolean z = i == -1;
            this.f339595j = z;
            if (!z) {
                this.f339589d = new C113850jn.C113851a<>(i, cVar2.f339603g);
            }
            this.f339592g = C113884kf.m157494b(this.f339591f, f339587c);
            this.f339594i = new ArrayList();
            this.f339593h = new HashMap();
            List<String> d = C113884kf.m157505d(this.f339592g);
            if (d != null) {
                for (String next : d) {
                    if (next.length() > 0) {
                        String[] split = next.split("#");
                        if (split.length > 1) {
                            for (String put : split[1].split(",")) {
                                this.f339593h.put(put, split[0]);
                            }
                        }
                    }
                }
            }
            C113896kq.m157658a("loadRootIndex count:" + this.f339593h.size(), "disk_cache_dir:" + this.f339591f);
        }
    }

    /* renamed from: n */
    private C113491c m155386n() {
        return this.f339590e;
    }

    /* renamed from: o */
    private void m155387o() {
        this.f339592g = C113884kf.m157494b(this.f339591f, f339587c);
        this.f339594i = new ArrayList();
        this.f339593h = new HashMap();
        List<String> d = C113884kf.m157505d(this.f339592g);
        if (d != null) {
            for (String next : d) {
                if (next.length() > 0) {
                    String[] split = next.split("#");
                    if (split.length > 1) {
                        for (String put : split[1].split(",")) {
                            this.f339593h.put(put, split[0]);
                        }
                    }
                }
            }
        }
        C113896kq.m157658a("loadRootIndex count:" + this.f339593h.size(), "disk_cache_dir:" + this.f339591f);
    }

    /* renamed from: a */
    public final void mo170951a(String str, D d) {
        String str2 = str;
        if (!TextUtils.isEmpty(str) && d != null) {
            C113896kq.m157664b(C0949kl.f2246p, str2);
            String a = this.f339590e.f340639k.mo172237a(str2);
            byte[] b = d.mo56236b();
            int i = 0;
            if (b != null) {
                File a2 = this.f339590e.f339601e.mo170959a(a, this.f339591f.getAbsolutePath(), b);
                if (!this.f339595j || this.f339590e.f339602f != -1) {
                    C113490b bVar = new C113490b(a2, b.length);
                    if (!this.f339595j) {
                        this.f339589d.mo147869a(a, bVar);
                    }
                    File file = bVar.f339596a;
                    if (file != null) {
                        File parentFile = file.getParentFile();
                        File b2 = C113884kf.m157494b(parentFile, f339586b);
                        String str3 = a + "#" + bVar.toString();
                        if (C113884kf.m157504d(b2, str3) == -1) {
                            C113896kq.m157677f(f339585a).mo172332a("index writeLine data:".concat(String.valueOf(str3)));
                            C113884kf.m157502c(b2, str3);
                        }
                        int d2 = C113884kf.m157504d(this.f339592g, parentFile.getAbsolutePath());
                        if (d2 != -1) {
                            String concat = ",".concat(String.valueOf(a));
                            String a3 = C113884kf.m157487a(this.f339592g, d2);
                            if (a3 != null && !a3.contains(a)) {
                                C113896kq.m157677f(f339585a).mo172332a("root writeAppend data:".concat(String.valueOf(concat)));
                                C113884kf.m157488a(this.f339592g, d2, ",".concat(String.valueOf(a)));
                            }
                        } else {
                            String str4 = parentFile.getAbsolutePath() + "#" + a;
                            C113896kq.m157677f(f339585a).mo172332a("root writeLine data:".concat(String.valueOf(str4)));
                            C113884kf.m157502c(this.f339592g, str4);
                        }
                        this.f339593h.put(a, parentFile.getAbsolutePath());
                    }
                }
            }
            if (b != null) {
                i = b.length;
            }
            C113896kq.m157656a(C0949kl.f2246p, str2, "put data length", (Object) Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final void mo170953b() {
        File file = this.f339591f;
        if (file == null) {
            return;
        }
        if (this.f339595j) {
            this.f339590e.f339601e.mo170960a(file);
            return;
        }
        this.f339589d.mo147870a();
        this.f339590e.f339601e.mo170960a(this.f339591f);
    }

    /* renamed from: c */
    public final long mo170954c() {
        int size;
        if (this.f339595j) {
            C113491c cVar = this.f339590e;
            if (cVar == null || cVar.f339602f == -1) {
                return -1;
            }
            size = this.f339593h.size();
        } else {
            size = this.f339589d.mo147876d().size();
        }
        return (long) size;
    }

    /* renamed from: d */
    public final long mo170955d() {
        if (this.f339595j) {
            return -1;
        }
        return (long) this.f339589d.mo147872b();
    }

    /* renamed from: e */
    public final long mo170956e() {
        if (this.f339595j) {
            return -1;
        }
        return (long) this.f339589d.mo147874c();
    }

    /* renamed from: f */
    public final void mo170957f() {
        C113491c cVar = this.f339590e;
        if (cVar != null && cVar.f339602f != -1 && ((long) this.f339593h.size()) > this.f339590e.f339602f) {
            C113896kq.m157658a("cached tile count:" + this.f339593h.size());
            this.f339593h.size();
            mo170953b();
        }
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C113856jr.C113860c mo170958g() {
        return this.f339590e;
    }

    /* renamed from: d */
    private void m155384d(String str) {
        String a;
        String str2 = this.f339593h.get(str);
        if (str2 != null) {
            C113896kq.m157677f(f339585a).mo172332a("key：".concat(String.valueOf(str)), "dir : ".concat(str2));
            File file = new File(new File(str2), f339586b);
            int d = C113884kf.m157504d(file, str);
            if (d != -1) {
                C113884kf.m157496b(file, d);
            }
            int d2 = C113884kf.m157504d(this.f339592g, str2);
            if (d2 != -1 && (a = C113884kf.m157487a(this.f339592g, d2)) != null && a.contains(str)) {
                C113884kf.m157497b(this.f339592g, d2, a.replaceAll(str + ",", ""));
            }
        }
    }

    /* renamed from: c */
    private void m155383c(String str) {
        String str2 = this.f339593h.get(str);
        if (str2 != null && !this.f339594i.contains(str2)) {
            C113896kq.m157677f(f339585a).mo172332a("key：".concat(String.valueOf(str)), "dir : ".concat(str2));
            List<String> d = C113884kf.m157505d(C113884kf.m157494b(new File(str2), f339586b));
            if (d != null && !d.isEmpty()) {
                C113896kq.m157677f(f339585a).mo172332a(d.toArray());
                if (this.f339589d != null) {
                    for (String split : d) {
                        String[] split2 = split.split("#");
                        String[] split3 = split2[1].split(",");
                        String str3 = split2[0];
                        String str4 = split3[0];
                        this.f339589d.mo147869a(str3, new C113490b(new File(str2, str4), Integer.parseInt(split3[1])));
                    }
                }
                if (d.size() > 0) {
                    this.f339594i.add(str2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a A[SYNTHETIC, Splitter:B:12:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D mo170950a(java.lang.String r10, java.lang.Class<D> r11) {
        /*
            r9 = this;
            java.lang.String r0 = " must have a empty construct. #"
            java.lang.String r1 = "The "
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r2 = r9.f339590e
            com.tencent.mapsdk.internal.jr$b r2 = r2.f340639k
            java.lang.String r2 = r2.mo172237a(r10)
            boolean r3 = r9.f339595j
            r4 = 0
            if (r3 == 0) goto L_0x001b
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r3 = r9.f339590e
            long r5 = r3.f339602f
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x002f
        L_0x001b:
            r9.m155383c(r2)
            boolean r3 = r9.f339595j
            if (r3 != 0) goto L_0x002f
            com.tencent.mapsdk.internal.jn$a<com.tencent.mapsdk.core.utils.cache.DiskCache$b> r3 = r9.f339589d
            java.lang.Object r3 = r3.mo147873b(r2)
            com.tencent.mapsdk.core.utils.cache.DiskCache$b r3 = (com.tencent.mapsdk.core.utils.cache.DiskCache.C113490b) r3
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r3.f339596a
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            com.tencent.mapsdk.core.utils.cache.DiskCache$c r5 = r9.f339590e
            com.tencent.mapsdk.core.utils.cache.DiskCache$a r5 = r5.f339601e
            byte[] r2 = r5.mo170961a(r2, r3)
            if (r2 == 0) goto L_0x0087
            java.lang.Object r3 = r11.newInstance()     // Catch:{ IllegalAccessException -> 0x0066, InstantiationException -> 0x0045 }
            r4 = r3
            com.tencent.mapsdk.internal.jm r4 = (com.tencent.mapsdk.internal.C113849jm) r4     // Catch:{ IllegalAccessException -> 0x0066, InstantiationException -> 0x0045 }
            r4.mo56235a(r2)     // Catch:{ IllegalAccessException -> 0x0066, InstantiationException -> 0x0045 }
            goto L_0x0087
        L_0x0045:
            r10 = move-exception
            java.lang.Error r2 = new java.lang.Error
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r11 = r11.getSimpleName()
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r10.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r2.<init>(r11, r10)
            throw r2
        L_0x0066:
            r10 = move-exception
            java.lang.Error r2 = new java.lang.Error
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r11 = r11.getSimpleName()
            r3.append(r11)
            r3.append(r0)
            java.lang.String r11 = r10.getMessage()
            r3.append(r11)
            java.lang.String r11 = r3.toString()
            r2.<init>(r11, r10)
            throw r2
        L_0x0087:
            if (r2 != 0) goto L_0x008b
            r11 = 0
            goto L_0x008c
        L_0x008b:
            int r11 = r2.length
        L_0x008c:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r0 = "DC"
            java.lang.String r1 = "get data length"
            com.tencent.mapsdk.internal.C113896kq.m157656a((java.lang.String) r0, (java.lang.String) r10, (java.lang.String) r1, (java.lang.Object) r11)
            com.tencent.mapsdk.internal.C113896kq.m157676f(r0, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.core.utils.cache.DiskCache.mo170950a(java.lang.String, java.lang.Class):com.tencent.mapsdk.internal.jm");
    }

    /* renamed from: a */
    public final boolean mo170952a(String str) {
        String str2;
        String a;
        String a2 = this.f339590e.f340639k.mo172237a(str);
        File file = null;
        if (!this.f339595j || this.f339590e.f339602f != -1) {
            m155383c(a2);
            if (!this.f339595j) {
                C113490b bVar = (C113490b) this.f339589d.mo147873b(a2);
                if (bVar != null) {
                    file = bVar.f339596a;
                }
                if (file != null && file.exists()) {
                    this.f339589d.mo147875c(a2);
                }
            }
            if (!(file == null || !file.exists() || (str2 = this.f339593h.get(a2)) == null)) {
                C113896kq.m157677f(f339585a).mo172332a("key：".concat(String.valueOf(a2)), "dir : ".concat(str2));
                File file2 = new File(new File(str2), f339586b);
                int d = C113884kf.m157504d(file2, a2);
                if (d != -1) {
                    C113884kf.m157496b(file2, d);
                }
                int d2 = C113884kf.m157504d(this.f339592g, str2);
                if (!(d2 == -1 || (a = C113884kf.m157487a(this.f339592g, d2)) == null || !a.contains(a2))) {
                    C113884kf.m157497b(this.f339592g, d2, a.replaceAll(a2 + ",", ""));
                }
            }
        }
        return this.f339590e.f339601e.mo170960a(file);
    }

    /* renamed from: a */
    private void m155382a(String str, C113490b bVar) {
        File file = bVar.f339596a;
        if (file != null) {
            File parentFile = file.getParentFile();
            File b = C113884kf.m157494b(parentFile, f339586b);
            String str2 = str + "#" + bVar.toString();
            if (C113884kf.m157504d(b, str2) == -1) {
                C113896kq.m157677f(f339585a).mo172332a("index writeLine data:".concat(String.valueOf(str2)));
                C113884kf.m157502c(b, str2);
            }
            int d = C113884kf.m157504d(this.f339592g, parentFile.getAbsolutePath());
            if (d != -1) {
                String concat = ",".concat(String.valueOf(str));
                String a = C113884kf.m157487a(this.f339592g, d);
                if (a != null && !a.contains(str)) {
                    C113896kq.m157677f(f339585a).mo172332a("root writeAppend data:".concat(String.valueOf(concat)));
                    C113884kf.m157488a(this.f339592g, d, ",".concat(String.valueOf(str)));
                }
            } else {
                String str3 = parentFile.getAbsolutePath() + "#" + str;
                C113896kq.m157677f(f339585a).mo172332a("root writeLine data:".concat(String.valueOf(str3)));
                C113884kf.m157502c(this.f339592g, str3);
            }
            this.f339593h.put(str, parentFile.getAbsolutePath());
        }
    }
}
