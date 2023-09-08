package com.tencent.p014mm.vfs;

import android.net.Uri;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.vfs.m1 */
public class C86009m1 implements Comparable<C86009m1> {

    /* renamed from: d */
    public final Uri f250486d;

    /* renamed from: e */
    public C116281f0.C116288h f250487e;

    public C86009m1(String str) {
        this(C116299g2.m163858n(str));
    }

    /* renamed from: c */
    public static C86009m1 m106378c(File file) {
        if (file != null) {
            return new C86009m1(file);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo119961a() {
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a()) {
            return false;
        }
        FileSystem.C85995c cVar = z.f348991a;
        String w = cVar.mo119947w(z.f348992b, false);
        return w != null ? new File(w).canRead() : cVar.mo119948x(z.f348992b);
    }

    /* renamed from: b */
    public boolean mo119962b() {
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a()) {
            return false;
        }
        FileSystem.C85995c cVar = z.f348991a;
        if ((cVar.mo119936f() & 1) == 0) {
            return false;
        }
        String w = cVar.mo119947w(z.f348992b, true);
        return w != null ? new File(w).canWrite() : cVar.mo119948x(z.f348992b);
    }

    public int compareTo(Object obj) {
        return mo119976n().compareTo(((C86009m1) obj).mo119976n());
    }

    /* renamed from: e */
    public boolean mo119964e() {
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a()) {
            throw new FileNotFoundException("Cannot resolve path or URI: " + this.f250486d);
        } else if (z.f348991a.mo119948x(z.f348992b)) {
            return false;
        } else {
            z.f348991a.mo119941m(z.f348992b, false).close();
            return true;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C86009m1)) {
            return false;
        }
        return this.f250486d.equals(((C86009m1) obj).f250486d);
    }

    /* renamed from: f */
    public boolean mo119966f() {
        C116281f0.C116288h z = mo119989z();
        return z.mo177810a() && z.f348991a.mo119933c(z.f348992b);
    }

    /* renamed from: g */
    public boolean mo119967g() {
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a()) {
            return false;
        }
        return z.f348991a.mo119948x(z.f348992b);
    }

    public String getName() {
        String path = this.f250486d.getPath();
        int lastIndexOf = path.lastIndexOf("/");
        return lastIndexOf < 0 ? path : path.substring(lastIndexOf + 1);
    }

    /* renamed from: h */
    public C86009m1 mo119969h() {
        return new C86009m1(mo119972j());
    }

    public int hashCode() {
        return mo119976n().hashCode() ^ 1234321;
    }

    /* renamed from: i */
    public String mo119971i() {
        return C116299g2.m163865u(mo119972j());
    }

    /* renamed from: j */
    public final Uri mo119972j() {
        String path = this.f250486d.getPath();
        boolean z = false;
        if (this.f250486d.isAbsolute() || (path.length() > 0 && path.charAt(0) == '/')) {
            z = true;
        }
        if (z) {
            return this.f250486d;
        }
        String path2 = this.f250486d.getPath();
        String property = System.getProperty("user.dir");
        if (!path2.isEmpty()) {
            property = property + XVFSFile.SEPARATOR_CHAR + path2;
        }
        return this.f250486d.buildUpon().path(property).build();
    }

    /* renamed from: k */
    public String mo119973k() {
        Uri m = mo119975m();
        if (m == null) {
            return null;
        }
        return C116299g2.m163865u(m);
    }

    /* renamed from: l */
    public C86009m1 mo119974l() {
        Uri m = mo119975m();
        if (m == null) {
            return null;
        }
        return new C86009m1(m);
    }

    /* renamed from: m */
    public Uri mo119975m() {
        String path = this.f250486d.getPath();
        int length = path.length();
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf == -1 || path.charAt(length - 1) == '/') {
            return null;
        }
        return this.f250486d.buildUpon().path((path.indexOf(47) == lastIndexOf && path.charAt(0) == '/') ? path.substring(0, lastIndexOf + 1) : path.substring(0, lastIndexOf)).build();
    }

    /* renamed from: n */
    public String mo119976n() {
        return C116299g2.m163865u(this.f250486d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0 = r0.f348991a.mo119945q(r0.f348992b);
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo119977o() {
        /*
            r3 = this;
            com.tencent.mm.vfs.f0$h r0 = r3.mo119989z()
            boolean r1 = r0.mo177810a()
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            com.tencent.mm.vfs.FileSystem$c r1 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            com.tencent.mm.vfs.b0 r0 = r1.mo119945q(r0)
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.f250476f
            if (r0 == 0) goto L_0x001b
            r2 = 1
        L_0x001b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C86009m1.mo119977o():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0 = r0.f348991a.mo119945q(r0.f348992b);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo119978p() {
        /*
            r3 = this;
            com.tencent.mm.vfs.f0$h r0 = r3.mo119989z()
            boolean r1 = r0.mo177810a()
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            com.tencent.mm.vfs.FileSystem$c r1 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            com.tencent.mm.vfs.b0 r0 = r1.mo119945q(r0)
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.f250476f
            if (r0 != 0) goto L_0x001b
            r2 = 1
        L_0x001b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C86009m1.mo119978p():boolean");
    }

    /* renamed from: q */
    public long mo119979q() {
        C86001b0 q;
        C116281f0.C116288h z = mo119989z();
        if (z.mo177810a() && (q = z.f348991a.mo119945q(z.f348992b)) != null) {
            return q.f250475e;
        }
        return 0;
    }

    /* renamed from: r */
    public long mo119980r() {
        C86001b0 q;
        C116281f0.C116288h z = mo119989z();
        if (z.mo177810a() && (q = z.f348991a.mo119945q(z.f348992b)) != null) {
            return q.f250473c;
        }
        return 0;
    }

    /* renamed from: s */
    public String[] mo119981s() {
        Iterable<C86001b0> list;
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a() || (list = z.f348991a.list(z.f348992b)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C86001b0 b0Var : list) {
            arrayList.add(b0Var.f250472b);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: t */
    public String[] mo119982t(C86016v1 v1Var) {
        Iterable<C86001b0> list;
        if (v1Var == null) {
            return mo119981s();
        }
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a() || (list = z.f348991a.list(z.f348992b)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C86001b0 next : list) {
            if (v1Var.accept(this, next.f250472b)) {
                arrayList.add(next.f250472b);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public String toString() {
        return this.f250486d.toString();
    }

    /* renamed from: u */
    public C86009m1[] mo119984u() {
        Iterable<C86001b0> list;
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a() || (list = z.f348991a.list(z.f348992b)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C86001b0 b0Var : list) {
            arrayList.add(new C86009m1(this, b0Var.f250472b));
        }
        return (C86009m1[]) arrayList.toArray(new C86009m1[0]);
    }

    /* renamed from: v */
    public C86009m1[] mo119985v(C86011o1 o1Var) {
        Iterable<C86001b0> list;
        if (o1Var == null) {
            return mo119984u();
        }
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a() || (list = z.f348991a.list(z.f348992b)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C86001b0 b0Var : list) {
            C86009m1 m1Var = new C86009m1(this, b0Var.f250472b);
            if (o1Var.accept(m1Var)) {
                arrayList.add(m1Var);
            }
        }
        return (C86009m1[]) arrayList.toArray(new C86009m1[0]);
    }

    /* renamed from: w */
    public C86009m1[] mo119986w(C86016v1 v1Var) {
        Iterable<C86001b0> list;
        if (v1Var == null) {
            return mo119984u();
        }
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a() || (list = z.f348991a.list(z.f348992b)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C86001b0 next : list) {
            if (v1Var.accept(this, next.f250472b)) {
                arrayList.add(new C86009m1(this, next.f250472b));
            }
        }
        return (C86009m1[]) arrayList.toArray(new C86009m1[0]);
    }

    /* renamed from: x */
    public boolean mo119987x() {
        C116281f0.C116288h z = mo119989z();
        if (!z.mo177810a()) {
            return false;
        }
        return z.f348991a.mo119937g(z.f348992b);
    }

    /* renamed from: y */
    public boolean mo119988y(C86009m1 m1Var) {
        C116281f0.C116288h z = mo119989z();
        C116281f0.C116288h z2 = m1Var.mo119989z();
        if (z.mo177810a() && z2.mo177810a()) {
            try {
                return z2.f348991a.mo119946t(z2.f348992b, z.f348991a, z.f348992b);
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: z */
    public C116281f0.C116288h mo119989z() {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(this.f250486d, this.f250487e);
        this.f250487e = l;
        return l;
    }

    public C86009m1(Uri uri) {
        this.f250487e = null;
        String path = uri.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!uri.getPath().equals(k)) {
                uri = uri.buildUpon().path(k).build();
            }
        }
        this.f250486d = uri;
    }

    @Deprecated
    public C86009m1(File file) {
        this(C116299g2.m163858n(file.getPath()));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C86009m1(String str, String str2) {
        this(str == null ? null : C116299g2.m163858n(str), str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C86009m1(File file, String str) {
        this(file == null ? null : C116299g2.m163858n(file.getPath()), str);
    }

    public C86009m1(Uri uri, String str) {
        Uri.Builder builder;
        this.f250487e = null;
        if (uri == null) {
            builder = new Uri.Builder().path(str);
        } else {
            builder = uri.buildUpon();
            if (!str.isEmpty()) {
                builder.appendPath(str);
            }
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        this.f250486d = build;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C86009m1(C86009m1 m1Var, String str) {
        this(m1Var == null ? null : m1Var.f250486d, str);
    }
}
