package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import js0.C9514m;
import p224ra.C12964b;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.h0 */
public interface C81415h0 extends C12964b {

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.h0$a */
    public interface C81416a {
        /* renamed from: a */
        String mo113671a();

        /* renamed from: b */
        long mo113672b();

        long lastModified();
    }

    boolean accept(String str);

    C81410b0 access(String str);

    C86009m1 allocTempFile(String str);

    boolean canRenameFile(String str);

    boolean canSaveToLocal(String str);

    C81410b0 copyTo(String str, C86009m1 m1Var, boolean z);

    C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar);

    C86009m1 getAbsoluteFile(String str);

    C86009m1 getAbsoluteFile(String str, boolean z);

    C86009m1 getPrivateAbsoluteFile(String str);

    List<? extends C81416a> getSavedFileList();

    C81418k0 getStorageSpaceStatistics();

    C81410b0 getTempDirectory(C9514m<String> mVar);

    void initialize();

    boolean isSavedFile(String str);

    C81410b0 isdir(String str);

    C81410b0 mkdir(String str, boolean z);

    C81410b0 readDir(String str, C9514m<List<C81463z>> mVar);

    C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar);

    C81410b0 readFile(String str, C9514m<ByteBuffer> mVar);

    InputStream readStream(String str);

    C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2);

    void release();

    boolean removeSavedFile(String str);

    C81410b0 rmdir(String str, boolean z);

    C81410b0 saveFile(C86009m1 m1Var, String str, C9514m<String> mVar);

    C81410b0 stat(String str, FileStructStat fileStructStat);

    C81410b0 statDir(String str, List<C81432q0> list);

    C81410b0 unlink(String str);

    C81410b0 unzip(String str, C86009m1 m1Var);

    C81410b0 writeFile(String str, InputStream inputStream, boolean z);
}
