package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import js0.C9514m;
import k70.C88117a;
import p225rc.C89912a;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.w */
public class C81461w implements C81415h0 {
    /* renamed from: a */
    public C81410b0 mo113759a(long j, long j2, long j3) {
        return (j < 0 || j > j3 - 1) ? C81410b0.ERR_ILLEGAL_READ_POSITION : (j2 < 1 || j2 > j3 - j) ? C81410b0.ERR_ILLEGAL_READ_LENGTH : C81410b0.OK;
    }

    public boolean accept(String str) {
        return this instanceof C88117a;
    }

    public C81410b0 access(String str) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C86009m1 allocTempFile(String str) {
        return null;
    }

    public boolean canRenameFile(String str) {
        return this instanceof C81439t0;
    }

    public boolean canSaveToLocal(String str) {
        return !(this instanceof C81437t);
    }

    public void cleanupDirectory() {
    }

    public C81410b0 copyTo(String str, C86009m1 m1Var, boolean z) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar) {
        return C81410b0.ERR_NOT_SUPPORTED;
    }

    public C86009m1 getAbsoluteFile(String str) {
        return getAbsoluteFile(str, false);
    }

    public C86009m1 getAbsoluteFile(String str, boolean z) {
        return null;
    }

    public C86009m1 getPrivateAbsoluteFile(String str) {
        return null;
    }

    public List<? extends C81415h0.C81416a> getSavedFileList() {
        return null;
    }

    public C81418k0 getStorageSpaceStatistics() {
        return null;
    }

    public C81410b0 getTempDirectory(C9514m<String> mVar) {
        return C81410b0.ERR_NOT_SUPPORTED;
    }

    public void initialize() {
    }

    public boolean isSavedFile(String str) {
        return false;
    }

    public C81410b0 isdir(String str) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 mkdir(String str, boolean z) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 readDir(String str, C9514m<List<C81463z>> mVar) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 readFile(String str, C9514m<ByteBuffer> mVar) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public InputStream readStream(String str) {
        C9514m mVar = new C9514m();
        if (readFile(str, mVar) == C81410b0.OK) {
            return new C89912a((ByteBuffer) mVar.f29691a);
        }
        return null;
    }

    public C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public void release() {
    }

    public boolean removeSavedFile(String str) {
        return false;
    }

    public C81410b0 rmdir(String str, boolean z) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 saveFile(C86009m1 m1Var, String str, C9514m<String> mVar) {
        return C81410b0.ERR_NOT_SUPPORTED;
    }

    public void setMaxTotalSize(long j) {
    }

    public C81410b0 stat(String str, FileStructStat fileStructStat) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 statDir(String str, List<C81432q0> list) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 unlink(String str) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 unzip(String str, C86009m1 m1Var) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 writeFile(String str, InputStream inputStream, boolean z) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }

    public C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar) {
        return C81410b0.ERR_PERMISSION_DENIED;
    }
}
