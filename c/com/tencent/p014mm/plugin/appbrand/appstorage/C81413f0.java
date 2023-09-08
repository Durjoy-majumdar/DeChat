package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import js0.C9514m;
import p225rc.C89914c;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.f0 */
public class C81413f0 extends C81461w {

    /* renamed from: d */
    public volatile boolean f238946d = false;

    /* renamed from: e */
    public final String f238947e;

    /* renamed from: f */
    public final String f238948f;

    /* renamed from: g */
    public final LuggageLocalFileObjectManager f238949g;

    /* renamed from: h */
    public C81418k0 f238950h = null;

    /* renamed from: i */
    public volatile long f238951i = -1;

    public C81413f0(String str, String str2, String str3) {
        String i = new C86009m1(str).mo119971i();
        this.f238947e = i;
        this.f238948f = str3;
        this.f238949g = new LuggageLocalFileObjectManager(i, str2, str3);
    }

    public boolean accept(String str) {
        return Util.nullAsNil(str).startsWith(this.f238948f);
    }

    public C81410b0 access(String str) {
        C81433r0 e = this.f238949g.mo113718e(str);
        return (e == null || !C86013q1.m106450k(e.f238978e)) ? C81410b0.RET_NOT_EXISTS : C81410b0.OK;
    }

    public C86009m1 allocTempFile(String str) {
        C86013q1.m106461v(this.f238947e);
        return new C86009m1(this.f238947e + "/" + str);
    }

    /* renamed from: b */
    public void mo113732b() {
        C86013q1.m106447h(this.f238947e + "/dir.lock");
    }

    /* renamed from: c */
    public void mo113733c() {
        C86013q1.m106438T(this.f238947e + "/dir.lock", new byte[1], 0, 1);
    }

    public C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar) {
        Log.m105925i("MicroMsg.Luggage.FlattenFileSystem", "createTempFileFrom src[%s] suffix[%s] deleteSrc[%b] released[%b]", m1Var, str, Boolean.valueOf(z), Boolean.valueOf(this.f238946d));
        if (this.f238946d) {
            return C81410b0.ERR_FS_NOT_MOUNTED;
        }
        C81433r0 c = this.f238949g.mo113716c(m1Var.mo119971i(), str, z);
        if (c == null) {
            return C81410b0.ERR_OP_FAIL;
        }
        C81418k0 k0Var = this.f238950h;
        if (k0Var != null) {
            k0Var.mo113737c(this.f238947e, c.f238978e, c.f238980g, "FlattenFileSystem#createTempFileFrom");
        }
        mVar.f29691a = c.f238977d;
        return C81410b0.OK;
    }

    public C86009m1 getAbsoluteFile(String str, boolean z) {
        return getAbsoluteFile(str);
    }

    public List<C81433r0> getSavedFileList() {
        return this.f238949g.mo113722i();
    }

    public C81418k0 getStorageSpaceStatistics() {
        return this.f238950h;
    }

    public C81410b0 getTempDirectory(C9514m<String> mVar) {
        mVar.f29691a = this.f238947e;
        return C81410b0.OK;
    }

    public void initialize() {
        if (!C86013q1.m106461v(this.f238947e)) {
            Log.m105920e("MicroMsg.Luggage.FlattenFileSystem", "Initialization Failed");
        }
    }

    public boolean isSavedFile(String str) {
        C81433r0 e = this.f238949g.mo113718e(str);
        return e != null && e.f238979f;
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        LinkedList<C81433r0> linkedList = new LinkedList<>();
        C89914c.m112445a(linkedList, this.f238949g.mo113722i());
        LuggageLocalFileObjectManager luggageLocalFileObjectManager = this.f238949g;
        C86009m1 m1Var = new C86009m1(luggageLocalFileObjectManager.mo113719f());
        LinkedList linkedList2 = null;
        C86009m1[] v = (!m1Var.mo119967g() || !m1Var.mo119977o()) ? null : m1Var.mo119985v(new C81436s0(luggageLocalFileObjectManager));
        if (v != null && v.length > 0) {
            linkedList2 = new LinkedList();
            for (C86009m1 name : v) {
                C81433r0 d = luggageLocalFileObjectManager.mo113717d(name.getName());
                if (d != null) {
                    linkedList2.add(d);
                }
            }
        }
        C89914c.m112445a(linkedList, linkedList2);
        T linkedList3 = new LinkedList();
        for (C81433r0 r0Var : linkedList) {
            C81463z zVar = new C81463z();
            zVar.f239026a = r0Var.f238977d;
            linkedList3.add(zVar);
        }
        mVar.f29691a = linkedList3;
        return C81410b0.OK;
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        C81433r0 e = this.f238949g.mo113718e(str);
        if (e == null || !C86013q1.m106450k(e.f238978e)) {
            return C81410b0.RET_NOT_EXISTS;
        }
        mVar.f29691a = C81412d0.m99870d(new C86009m1(e.f238978e), 0, -1);
        return C81410b0.OK;
    }

    public final InputStream readStream(String str) {
        C81433r0 e = this.f238949g.mo113718e(str);
        if (e != null && C86013q1.m106450k(e.f238978e)) {
            try {
                return C86013q1.m106423E(e.f238978e);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2) {
        C81433r0 e = this.f238949g.mo113718e(str);
        return (e == null || !C86013q1.m106450k(e.f238978e)) ? C81410b0.RET_NOT_EXISTS : C81412d0.m99871e(e.f238978e, mVar, str2, j, j2);
    }

    public void release() {
        this.f238946d = true;
    }

    public boolean removeSavedFile(String str) {
        C81433r0 e = this.f238949g.mo113718e(str);
        boolean z = false;
        if (e != null && e.f238979f) {
            Uri n = C116299g2.m163858n(e.f238978e);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a() && l.f348991a.mo119933c(l.f348992b)) {
                z = true;
            }
            C81418k0 k0Var = this.f238950h;
            if (k0Var != null) {
                k0Var.mo113738d(e.f238978e, -e.f238980g, "FlattenFileSystem#removeSavedFile");
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0110, code lost:
        r1 = r1.f348991a.mo119945q(r1.f348992b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c3 A[LOOP:2: B:43:0x00c3->B:46:0x00d3, LOOP_START, PHI: r8 
      PHI: (r8v7 com.tencent.mm.plugin.appbrand.appstorage.r0) = (r8v6 com.tencent.mm.plugin.appbrand.appstorage.r0), (r8v11 com.tencent.mm.plugin.appbrand.appstorage.r0) binds: [B:42:0x00b8, B:46:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017b A[LOOP:3: B:73:0x017b->B:76:0x018b, LOOP_START, PHI: r8 
      PHI: (r8v1 com.tencent.mm.plugin.appbrand.appstorage.r0) = (r8v0 com.tencent.mm.plugin.appbrand.appstorage.r0), (r8v5 com.tencent.mm.plugin.appbrand.appstorage.r0) binds: [B:72:0x0166, B:76:0x018b] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0 saveFile(com.tencent.p014mm.vfs.C86009m1 r13, java.lang.String r14, js0.C9514m<java.lang.String> r15) {
        /*
            r12 = this;
            com.tencent.mm.plugin.appbrand.appstorage.b0 r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
            if (r13 == 0) goto L_0x0221
            boolean r1 = r13.mo119967g()
            if (r1 != 0) goto L_0x000c
            goto L_0x0221
        L_0x000c:
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L_0x021e
            if (r15 != 0) goto L_0x0016
            goto L_0x021e
        L_0x0016:
            long r1 = r12.f238951i
            r14 = 0
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a0
            com.tencent.mm.plugin.appbrand.appstorage.k0 r1 = r12.f238950h
            if (r1 == 0) goto L_0x0076
            java.lang.String r2 = r12.f238947e
            java.lang.String r5 = r13.mo119971i()
            long r1 = r1.mo113736b(r2, r5)
            long r5 = r13.mo119980r()
            long r1 = r1 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "saveFile: WxaStorageSpaceStatisticsService getDirTotalSize="
            r5.append(r6)
            long r6 = r13.mo119980r()
            long r6 = r1 - r6
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "MicroMsg.Luggage.FlattenFileSystem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = -1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager r1 = r12.f238949g
            com.tencent.mm.vfs.m1[] r1 = r1.mo113723j()
            if (r1 == 0) goto L_0x0070
            int r2 = r1.length
            if (r2 > 0) goto L_0x0061
            goto L_0x0070
        L_0x0061:
            int r2 = r1.length
            r6 = r3
            r5 = 0
        L_0x0064:
            if (r5 >= r2) goto L_0x0071
            r8 = r1[r5]
            long r8 = r8.mo119980r()
            long r6 = r6 + r8
            int r5 = r5 + 1
            goto L_0x0064
        L_0x0070:
            r6 = r3
        L_0x0071:
            long r1 = r13.mo119980r()
            goto L_0x0096
        L_0x0076:
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager r1 = r12.f238949g
            com.tencent.mm.vfs.m1[] r1 = r1.mo113723j()
            if (r1 == 0) goto L_0x0091
            int r2 = r1.length
            if (r2 > 0) goto L_0x0082
            goto L_0x0091
        L_0x0082:
            int r2 = r1.length
            r6 = r3
            r5 = 0
        L_0x0085:
            if (r5 >= r2) goto L_0x0092
            r8 = r1[r5]
            long r8 = r8.mo119980r()
            long r6 = r6 + r8
            int r5 = r5 + 1
            goto L_0x0085
        L_0x0091:
            r6 = r3
        L_0x0092:
            long r1 = r13.mo119980r()
        L_0x0096:
            long r1 = r1 + r6
        L_0x0097:
            long r5 = r12.f238951i
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00a0
            com.tencent.mm.plugin.appbrand.appstorage.b0 r13 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_EXCEED_DIRECTORY_MAX_SIZE
            return r13
        L_0x00a0:
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager r1 = r12.f238949g
            java.lang.String r2 = r13.getName()
            com.tencent.mm.plugin.appbrand.appstorage.r0 r1 = r1.mo113717d(r2)
            java.lang.String r2 = "FlattenFileSystem#saveFile"
            r5 = 0
            if (r1 == 0) goto L_0x0166
            boolean r13 = r1.f238979f
            if (r13 == 0) goto L_0x00b8
            java.lang.String r13 = r1.f238977d
            r15.f29691a = r13
            return r0
        L_0x00b8:
            long r6 = r1.f238980g
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager r13 = r12.f238949g
            java.util.Collection<com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d> r13 = r13.f238924d
            java.util.Iterator r13 = r13.iterator()
            r8 = r5
        L_0x00c3:
            boolean r9 = r13.hasNext()
            if (r9 == 0) goto L_0x00d5
            java.lang.Object r8 = r13.next()
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d r8 = (com.tencent.p014mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.C81407d) r8
            com.tencent.mm.plugin.appbrand.appstorage.r0 r8 = r8.mo113727c(r1)
            if (r8 == 0) goto L_0x00c3
        L_0x00d5:
            java.lang.String r13 = r8.f238977d
            r15.f29691a = r13
            com.tencent.mm.plugin.appbrand.appstorage.k0 r13 = r12.f238950h
            if (r13 == 0) goto L_0x0165
            java.lang.String r15 = r1.f238978e
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r15)
            java.lang.String r9 = r1.getPath()
            if (r9 == 0) goto L_0x0103
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r14, r14)
            java.lang.String r10 = r1.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x0103
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r9)
            android.net.Uri r1 = r1.build()
        L_0x0103:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r9.mo177799l(r1, r5)
            boolean r10 = r1.mo177810a()
            if (r10 != 0) goto L_0x0110
            goto L_0x011a
        L_0x0110:
            com.tencent.mm.vfs.FileSystem$c r10 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            com.tencent.mm.vfs.b0 r1 = r10.mo119945q(r1)
            if (r1 != 0) goto L_0x011c
        L_0x011a:
            r10 = r3
            goto L_0x011e
        L_0x011c:
            long r10 = r1.f250473c
        L_0x011e:
            long r10 = r10 - r6
            r13.mo113738d(r15, r10, r2)
            com.tencent.mm.plugin.appbrand.appstorage.k0 r13 = r12.f238950h
            java.lang.String r15 = r8.f238978e
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r15)
            java.lang.String r6 = r1.getPath()
            if (r6 == 0) goto L_0x014a
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r14, r14)
            java.lang.String r6 = r1.getPath()
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x014a
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r14 = r1.path(r14)
            android.net.Uri r1 = r14.build()
        L_0x014a:
            com.tencent.mm.vfs.f0$h r14 = r9.mo177799l(r1, r5)
            boolean r1 = r14.mo177810a()
            if (r1 != 0) goto L_0x0155
            goto L_0x0162
        L_0x0155:
            com.tencent.mm.vfs.FileSystem$c r1 = r14.f348991a
            java.lang.String r14 = r14.f348992b
            com.tencent.mm.vfs.b0 r14 = r1.mo119945q(r14)
            if (r14 != 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            long r3 = r14.f250473c
        L_0x0162:
            r13.mo113738d(r15, r3, r2)
        L_0x0165:
            return r0
        L_0x0166:
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager r1 = r12.f238949g
            java.lang.String r13 = r13.mo119971i()
            com.tencent.mm.plugin.appbrand.appstorage.r0 r13 = r1.mo113716c(r13, r5, r14)
            long r6 = r13.f238980g
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager r1 = r12.f238949g
            java.util.Collection<com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d> r1 = r1.f238924d
            java.util.Iterator r1 = r1.iterator()
            r8 = r5
        L_0x017b:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x018d
            java.lang.Object r8 = r1.next()
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d r8 = (com.tencent.p014mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.C81407d) r8
            com.tencent.mm.plugin.appbrand.appstorage.r0 r8 = r8.mo113727c(r13)
            if (r8 == 0) goto L_0x017b
        L_0x018d:
            java.lang.String r1 = r8.f238977d
            r15.f29691a = r1
            com.tencent.mm.plugin.appbrand.appstorage.k0 r15 = r12.f238950h
            if (r15 == 0) goto L_0x021d
            java.lang.String r13 = r13.f238978e
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r13)
            java.lang.String r9 = r1.getPath()
            if (r9 == 0) goto L_0x01bb
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r14, r14)
            java.lang.String r10 = r1.getPath()
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x01bb
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r9)
            android.net.Uri r1 = r1.build()
        L_0x01bb:
            com.tencent.mm.vfs.f0 r9 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r9.mo177799l(r1, r5)
            boolean r10 = r1.mo177810a()
            if (r10 != 0) goto L_0x01c8
            goto L_0x01d2
        L_0x01c8:
            com.tencent.mm.vfs.FileSystem$c r10 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            com.tencent.mm.vfs.b0 r1 = r10.mo119945q(r1)
            if (r1 != 0) goto L_0x01d4
        L_0x01d2:
            r10 = r3
            goto L_0x01d6
        L_0x01d4:
            long r10 = r1.f250473c
        L_0x01d6:
            long r10 = r10 - r6
            r15.mo113738d(r13, r10, r2)
            com.tencent.mm.plugin.appbrand.appstorage.k0 r13 = r12.f238950h
            java.lang.String r15 = r8.f238978e
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r15)
            java.lang.String r6 = r1.getPath()
            if (r6 == 0) goto L_0x0202
            java.lang.String r14 = com.tencent.p014mm.vfs.C116299g2.m163855k(r6, r14, r14)
            java.lang.String r6 = r1.getPath()
            boolean r6 = r6.equals(r14)
            if (r6 != 0) goto L_0x0202
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r14 = r1.path(r14)
            android.net.Uri r1 = r14.build()
        L_0x0202:
            com.tencent.mm.vfs.f0$h r14 = r9.mo177799l(r1, r5)
            boolean r1 = r14.mo177810a()
            if (r1 != 0) goto L_0x020d
            goto L_0x021a
        L_0x020d:
            com.tencent.mm.vfs.FileSystem$c r1 = r14.f348991a
            java.lang.String r14 = r14.f348992b
            com.tencent.mm.vfs.b0 r14 = r1.mo119945q(r14)
            if (r14 != 0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            long r3 = r14.f250473c
        L_0x021a:
            r13.mo113738d(r15, r3, r2)
        L_0x021d:
            return r0
        L_0x021e:
            com.tencent.mm.plugin.appbrand.appstorage.b0 r13 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_NOT_SUPPORTED
            return r13
        L_0x0221:
            com.tencent.mm.plugin.appbrand.appstorage.b0 r13 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.ERR_OP_FAIL
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0.saveFile(com.tencent.mm.vfs.m1, java.lang.String, js0.m):com.tencent.mm.plugin.appbrand.appstorage.b0");
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        C81410b0 b0Var = C81410b0.ERR_OP_FAIL;
        C81433r0 e = this.f238949g.mo113718e(str);
        return (e == null || !C86013q1.m106450k(e.f238978e)) ? C81410b0.RET_NOT_EXISTS : (fileStructStat != null && FileStat.vfsStat(e.f238978e, fileStructStat) == 0) ? C81410b0.OK : b0Var;
    }

    public C81410b0 unlink(String str) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C86009m1 getAbsoluteFile(String str) {
        C81433r0 e = this.f238949g.mo113718e(str);
        if (e == null) {
            return null;
        }
        return new C86009m1(e.f238978e);
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        C81433r0 e = this.f238949g.mo113718e(str);
        if (e == null || !C86013q1.m106450k(e.f238978e)) {
            return C81410b0.RET_NOT_EXISTS;
        }
        C86009m1 m1Var = new C86009m1(e.f238978e);
        if (j2 == MAlarmHandler.NEXT_FIRE_INTERVAL) {
            j2 = m1Var.mo119980r() - j;
        }
        C81410b0 a = mo113759a(j, j2, m1Var.mo119980r());
        C81410b0 b0Var = C81410b0.OK;
        if (a != b0Var) {
            return a;
        }
        mVar.f29691a = C81412d0.m99870d(m1Var, j, j2);
        return b0Var;
    }
}
