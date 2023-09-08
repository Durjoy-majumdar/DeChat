package com.tencent.p014mm.plugin.appbrand.appstorage;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import js0.C9514m;
import p225rc.C89925n;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.p0 */
public class C81428p0 implements C81415h0 {

    /* renamed from: d */
    public final LinkedList<C81415h0> f238970d;

    /* renamed from: e */
    public final C81415h0 f238971e = new C81461w();

    public C81428p0(String str) {
        LinkedList<C81415h0> linkedList = new LinkedList<>();
        this.f238970d = linkedList;
        String C = C112760b.m154195C();
        String i = new C86009m1(C, "luggage/" + str).mo119971i();
        C81413f0 f0Var = new C81413f0(new C86009m1(i, "objects/").mo119971i(), "default_obfuscation_key", "wxfile://");
        C81439t0 t0Var = new C81439t0(new C86009m1(i, "files/").mo119971i(), "file:///usr");
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(f0Var);
        linkedList2.add(t0Var);
        linkedList.addAll(linkedList2);
    }

    /* renamed from: a */
    public final C81415h0 mo113747a(String str) {
        if (Util.isNullOrNil(str)) {
            return this.f238971e;
        }
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            C81415h0 next = it.next();
            if (next.accept(str)) {
                return next;
            }
        }
        return this.f238971e;
    }

    public boolean accept(String str) {
        String[] strArr = {"file://", HttpWrapperBase.PROTOCAL_HTTP, HttpWrapperBase.PROTOCAL_HTTPS};
        for (int i = 0; i < 3; i++) {
            if (C89925n.m112490c(str, strArr[i])) {
                return false;
            }
        }
        return true;
    }

    public C81410b0 access(String str) {
        return mo113747a(str).access(str);
    }

    public C86009m1 allocTempFile(String str) {
        return ((C81413f0) mo113748b(C81413f0.class)).allocTempFile(str);
    }

    /* renamed from: b */
    public <T extends C81415h0> T mo113748b(Class<T> cls) {
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            T t = (C81415h0) it.next();
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    public boolean canRenameFile(String str) {
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            C81415h0 next = it.next();
            if (next.accept(str) && next.canRenameFile(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean canSaveToLocal(String str) {
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            C81415h0 next = it.next();
            if (next.accept(str) && !next.canSaveToLocal(str)) {
                return false;
            }
        }
        return true;
    }

    public C81410b0 copyTo(String str, C86009m1 m1Var, boolean z) {
        return mo113747a(str).copyTo(str, m1Var, z);
    }

    public C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar) {
        C81410b0 b0Var = C81410b0.ERR_NOT_SUPPORTED;
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            C81410b0 createTempFileFrom = it.next().createTempFileFrom(m1Var, str, z, mVar);
            if (createTempFileFrom != b0Var) {
                return createTempFileFrom;
            }
        }
        return b0Var;
    }

    public C86009m1 getAbsoluteFile(String str) {
        return getAbsoluteFile(str, false);
    }

    public C86009m1 getPrivateAbsoluteFile(String str) {
        return mo113747a(str).getPrivateAbsoluteFile(str);
    }

    public List<? extends C81415h0.C81416a> getSavedFileList() {
        return ((C81413f0) mo113748b(C81413f0.class)).getSavedFileList();
    }

    public C81418k0 getStorageSpaceStatistics() {
        return null;
    }

    public C81410b0 getTempDirectory(C9514m<String> mVar) {
        C81410b0 b0Var = C81410b0.ERR_NOT_SUPPORTED;
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            C81410b0 tempDirectory = it.next().getTempDirectory(mVar);
            if (tempDirectory != b0Var) {
                return tempDirectory;
            }
        }
        return b0Var;
    }

    public void initialize() {
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            it.next().initialize();
        }
        this.f238971e.getClass();
    }

    public boolean isSavedFile(String str) {
        return ((C81413f0) mo113748b(C81413f0.class)).isSavedFile(str);
    }

    public C81410b0 isdir(String str) {
        return mo113747a(str).isdir(str);
    }

    public C81410b0 mkdir(String str, boolean z) {
        return mo113747a(str).mkdir(str, z);
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        return mo113747a(str).readDir(str, mVar);
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        return mo113747a(str).readFile(str, mVar);
    }

    public final InputStream readStream(String str) {
        return mo113747a(str).readStream(str);
    }

    public C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2) {
        return mo113747a(str).readZipEntry(str, mVar, str2, j, j2);
    }

    public void release() {
        C81413f0 f0Var = (C81413f0) mo113748b(C81413f0.class);
        if (f0Var != null) {
            f0Var.mo113732b();
        }
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f238971e.getClass();
    }

    public boolean removeSavedFile(String str) {
        return ((C81413f0) mo113748b(C81413f0.class)).removeSavedFile(str);
    }

    public C81410b0 rmdir(String str, boolean z) {
        return mo113747a(str).rmdir(str, z);
    }

    public C81410b0 saveFile(C86009m1 m1Var, String str, C9514m<String> mVar) {
        C81410b0 b0Var = C81410b0.ERR_NOT_SUPPORTED;
        Iterator<C81415h0> it = this.f238970d.iterator();
        while (it.hasNext()) {
            C81410b0 saveFile = it.next().saveFile(m1Var, str, mVar);
            if (saveFile != b0Var) {
                return saveFile;
            }
        }
        return b0Var;
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        return mo113747a(str).stat(str, fileStructStat);
    }

    public C81410b0 statDir(String str, List<C81432q0> list) {
        return mo113747a(str).statDir(str, list);
    }

    public C81410b0 unlink(String str) {
        return mo113747a(str).unlink(str);
    }

    public C81410b0 unzip(String str, C86009m1 m1Var) {
        return mo113747a(str).unzip(str, m1Var);
    }

    public C81410b0 writeFile(String str, InputStream inputStream, boolean z) {
        return mo113747a(str).writeFile(str, inputStream, z);
    }

    public C86009m1 getAbsoluteFile(String str, boolean z) {
        return mo113747a(str).getAbsoluteFile(str, z);
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        return mo113747a(str).readFile(str, j, j2, mVar);
    }

    public C81428p0(LinkedList<C81415h0> linkedList) {
        LinkedList<C81415h0> linkedList2 = new LinkedList<>();
        this.f238970d = linkedList2;
        linkedList2.addAll(linkedList);
    }
}
