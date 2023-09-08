package com.facebook.soloader;

import android.content.Context;
import android.os.Build;
import com.facebook.soloader.C80173r;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.facebook.soloader.j */
public class C80159j extends C80173r {

    /* renamed from: f */
    public final File f234670f;

    /* renamed from: g */
    public final String f234671g;

    /* renamed from: com.facebook.soloader.j$b */
    public static final class C80161b extends C80173r.C80175b implements Comparable {

        /* renamed from: f */
        public final ZipEntry f234672f;

        /* renamed from: g */
        public final int f234673g;

        public C80161b(String str, ZipEntry zipEntry, int i) {
            super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
            this.f234672f = zipEntry;
            this.f234673g = i;
        }

        public int compareTo(Object obj) {
            return this.f234708d.compareTo(((C80161b) obj).f234708d);
        }
    }

    /* renamed from: com.facebook.soloader.j$c */
    public class C80162c extends C80173r.C80180g {

        /* renamed from: d */
        public C80161b[] f234674d;

        /* renamed from: e */
        public final ZipFile f234675e;

        /* renamed from: f */
        public final C80173r f234676f;

        /* renamed from: com.facebook.soloader.j$c$a */
        public final class C80163a extends C80173r.C80178e {

            /* renamed from: d */
            public int f234678d;

            public C80163a(C80160a aVar) {
            }

            /* renamed from: a */
            public boolean mo110977a() {
                C80162c.this.mo110980c();
                return this.f234678d < C80162c.this.f234674d.length;
            }

            /* renamed from: b */
            public C80173r.C80177d mo110978b() {
                C80162c.this.mo110980c();
                C80162c cVar = C80162c.this;
                C80161b[] bVarArr = cVar.f234674d;
                int i = this.f234678d;
                this.f234678d = i + 1;
                C80161b bVar = bVarArr[i];
                InputStream inputStream = cVar.f234675e.getInputStream(bVar.f234672f);
                try {
                    return new C80173r.C80179f(bVar, inputStream);
                } catch (Throwable th) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        }

        public C80162c(C80173r rVar) {
            this.f234675e = new ZipFile(C80159j.this.f234670f);
            this.f234676f = rVar;
        }

        /* renamed from: a */
        public final C80173r.C80176c mo110975a() {
            return new C80173r.C80176c(mo110980c());
        }

        /* renamed from: b */
        public final C80173r.C80178e mo110976b() {
            return new C80163a((C80160a) null);
        }

        /* renamed from: c */
        public final C80161b[] mo110980c() {
            int i;
            if (this.f234674d == null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashMap hashMap = new HashMap();
                Pattern compile = Pattern.compile(C80159j.this.f234671g);
                String[] a = Build.VERSION.SDK_INT >= 23 ? SysUtil.C80144a.m97443a() : SysUtil.LollipopSysdeps.getSupportedAbis();
                Enumeration<? extends ZipEntry> entries = this.f234675e.entries();
                while (true) {
                    i = 0;
                    if (!entries.hasMoreElements()) {
                        break;
                    }
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    Matcher matcher = compile.matcher(zipEntry.getName());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        while (true) {
                            if (i >= a.length) {
                                i = -1;
                                break;
                            }
                            String str = a[i];
                            if (str != null && group.equals(str)) {
                                break;
                            }
                            i++;
                        }
                        if (i >= 0) {
                            linkedHashSet.add(group);
                            C80161b bVar = (C80161b) hashMap.get(group2);
                            if (bVar == null || i < bVar.f234673g) {
                                hashMap.put(group2, new C80161b(group2, zipEntry, i));
                            }
                        }
                    }
                }
                C80173r rVar = this.f234676f;
                String[] strArr = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                rVar.getClass();
                C80161b[] bVarArr = (C80161b[]) hashMap.values().toArray(new C80161b[hashMap.size()]);
                Arrays.sort(bVarArr);
                int i2 = 0;
                for (int i3 = 0; i3 < bVarArr.length; i3++) {
                    C80161b bVar2 = bVarArr[i3];
                    if (mo110959d(bVar2.f234672f, bVar2.f234708d)) {
                        i2++;
                    } else {
                        bVarArr[i3] = null;
                    }
                }
                C80161b[] bVarArr2 = new C80161b[i2];
                int i4 = 0;
                while (i < bVarArr.length) {
                    C80161b bVar3 = bVarArr[i];
                    if (bVar3 != null) {
                        bVarArr2[i4] = bVar3;
                        i4++;
                    }
                    i++;
                }
                this.f234674d = bVarArr2;
            }
            return this.f234674d;
        }

        public void close() {
            this.f234675e.close();
        }

        /* renamed from: d */
        public boolean mo110959d(ZipEntry zipEntry, String str) {
            return true;
        }
    }

    public C80159j(Context context, String str, File file, String str2) {
        super(context, str);
        this.f234670f = file;
        this.f234671g = str2;
    }

    /* renamed from: k */
    public C80173r.C80180g mo110958k() {
        return new C80162c(this);
    }
}
