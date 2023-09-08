package com.tencent.p014mm.plugin.magicbrush.p074fs;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81413f0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81418k0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81432q0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81461w;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81463z;
import com.tencent.p014mm.plugin.appbrand.appstorage.FileStructStat;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import js0.C9514m;
import p225rc.C89925n;

/* renamed from: com.tencent.mm.plugin.magicbrush.fs.d */
public class C85261d implements C81415h0 {

    /* renamed from: d */
    public final CopyOnWriteArrayList<C81415h0> f248413d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public final C81415h0 f248414e = new C81461w();

    /* renamed from: a */
    public C81415h0 mo118422a(String str) {
        String c = mo118424c(str);
        if (Util.isNullOrNil(c)) {
            return this.f248414e;
        }
        Iterator<C81415h0> it = mo118425d().iterator();
        while (it.hasNext()) {
            C81415h0 next = it.next();
            if (next.accept(c)) {
                return next;
            }
        }
        return this.f248414e;
    }

    public boolean accept(String str) {
        String[] strArr = {"file://", HttpWrapperBase.PROTOCAL_HTTP, HttpWrapperBase.PROTOCAL_HTTPS};
        for (int i = 0; i < 3; i++) {
            if (C89925n.m112490c(mo118426f(str), strArr[i])) {
                return false;
            }
        }
        return true;
    }

    public C81410b0 access(String str) {
        return mo118422a(str).access(mo118426f(str));
    }

    /* renamed from: b */
    public <T extends C81415h0> T mo118423b(Class<T> cls) {
        Iterator<C81415h0> it = mo118425d().iterator();
        while (it.hasNext()) {
            T t = (C81415h0) it.next();
            if (cls.isInstance(t)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo118424c(String str) {
        if (!Util.isNullOrNil(str)) {
            try {
                return URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                Log.printErrStackTrace("MicroMsg.MagicBrushFileSystemRegistry", e, "getDecodePath exception", new Object[0]);
            }
        }
        return str;
    }

    public boolean canRenameFile(String str) {
        String f = mo118426f(str);
        Iterator<C81415h0> it = mo118425d().iterator();
        while (it.hasNext()) {
            C81415h0 next = it.next();
            if (next.accept(f) && next.canRenameFile(f)) {
                return true;
            }
        }
        return false;
    }

    public boolean canSaveToLocal(String str) {
        String f = mo118426f(str);
        Iterator<C81415h0> it = mo118425d().iterator();
        while (it.hasNext()) {
            C81415h0 next = it.next();
            if (next.accept(f) && !next.canSaveToLocal(f)) {
                return false;
            }
        }
        return true;
    }

    public C81410b0 copyTo(String str, C86009m1 m1Var, boolean z) {
        return mo118422a(str).copyTo(mo118426f(str), m1Var, z);
    }

    /* renamed from: d */
    public synchronized CopyOnWriteArrayList<C81415h0> mo118425d() {
        return this.f248413d;
    }

    /* renamed from: f */
    public String mo118426f(String str) {
        return mo118424c(str);
    }

    public C86009m1 getAbsoluteFile(String str) {
        return getAbsoluteFile(mo118426f(str), false);
    }

    public C86009m1 getPrivateAbsoluteFile(String str) {
        return mo118422a(str).getPrivateAbsoluteFile(mo118426f(str));
    }

    public List<? extends C81415h0.C81416a> getSavedFileList() {
        return ((C81413f0) mo118423b(C81413f0.class)).getSavedFileList();
    }

    public C81418k0 getStorageSpaceStatistics() {
        return null;
    }

    public boolean isSavedFile(String str) {
        return ((C81413f0) mo118423b(C81413f0.class)).isSavedFile(mo118426f(str));
    }

    public C81410b0 isdir(String str) {
        return mo118422a(str).isdir(mo118426f(str));
    }

    public C81410b0 mkdir(String str, boolean z) {
        return mo118422a(str).mkdir(mo118426f(str), z);
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        return mo118422a(str).readDir(mo118426f(str), mVar);
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        return mo118422a(str).readFile(mo118426f(str), mVar);
    }

    public final InputStream readStream(String str) {
        return mo118422a(str).readStream(mo118426f(str));
    }

    public C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2) {
        return mo118422a(str).readZipEntry(mo118426f(str), mVar, str2, j, j2);
    }

    public boolean removeSavedFile(String str) {
        return ((C81413f0) mo118423b(C81413f0.class)).removeSavedFile(mo118426f(str));
    }

    public C81410b0 rmdir(String str, boolean z) {
        return mo118422a(str).rmdir(mo118426f(str), z);
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        return mo118422a(str).stat(mo118426f(str), fileStructStat);
    }

    public C81410b0 statDir(String str, List<C81432q0> list) {
        return mo118422a(str).statDir(mo118426f(str), list);
    }

    public C81410b0 unlink(String str) {
        return mo118422a(str).unlink(mo118426f(str));
    }

    public C81410b0 unzip(String str, C86009m1 m1Var) {
        return mo118422a(str).unzip(mo118426f(str), m1Var);
    }

    public C81410b0 writeFile(String str, InputStream inputStream, boolean z) {
        return mo118422a(str).writeFile(mo118426f(str), inputStream, z);
    }

    public C86009m1 getAbsoluteFile(String str, boolean z) {
        return mo118422a(str).getAbsoluteFile(mo118426f(str), z);
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        return mo118422a(str).readFile(mo118426f(str), j, j2, mVar);
    }
}
