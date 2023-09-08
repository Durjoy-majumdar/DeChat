package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import js0.C9514m;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing */
public interface IWxaFileSystemWithModularizing extends C81415h0 {
    /* synthetic */ boolean accept(String str);

    /* synthetic */ C81410b0 access(String str);

    /* synthetic */ C86009m1 allocTempFile(String str);

    /* synthetic */ boolean canRenameFile(String str);

    /* synthetic */ boolean canSaveToLocal(String str);

    /* synthetic */ void cleanupDirectory();

    /* synthetic */ C81410b0 copyTo(String str, C86009m1 m1Var, boolean z);

    /* synthetic */ C81410b0 createTempFileFrom(C86009m1 m1Var, String str, boolean z, C9514m<String> mVar);

    /* synthetic */ C86009m1 getAbsoluteFile(String str);

    /* synthetic */ C86009m1 getAbsoluteFile(String str, boolean z);

    /* synthetic */ C86009m1 getPrivateAbsoluteFile(String str);

    /* synthetic */ List<? extends C81415h0.C81416a> getSavedFileList();

    /* synthetic */ C81418k0 getStorageSpaceStatistics();

    /* synthetic */ C81410b0 getTempDirectory(C9514m<String> mVar);

    /* synthetic */ void initialize();

    /* synthetic */ boolean isSavedFile(String str);

    /* synthetic */ C81410b0 isdir(String str);

    /* synthetic */ C81410b0 mkdir(String str, boolean z);

    WxaPkg.Info openReadPartialInfo(String str);

    /* synthetic */ C81410b0 readDir(String str, C9514m<List<C81463z>> mVar);

    /* synthetic */ C81410b0 readFile(String str, long j, long j2, C9514m<ByteBuffer> mVar);

    /* synthetic */ C81410b0 readFile(String str, C9514m<ByteBuffer> mVar);

    /* synthetic */ InputStream readStream(String str);

    /* synthetic */ C81410b0 readZipEntry(String str, C9514m<Map<String, ByteBuffer>> mVar, String str2, long j, long j2);

    /* synthetic */ void release();

    /* synthetic */ boolean removeSavedFile(String str);

    /* synthetic */ C81410b0 rmdir(String str, boolean z);

    /* synthetic */ C81410b0 saveFile(C86009m1 m1Var, String str, C9514m<String> mVar);

    /* synthetic */ void setMaxTotalSize(long j);

    /* synthetic */ C81410b0 stat(String str, FileStructStat fileStructStat);

    /* synthetic */ C81410b0 statDir(String str, List<C81432q0> list);

    /* synthetic */ C81410b0 unlink(String str);

    /* synthetic */ C81410b0 unzip(String str, C86009m1 m1Var);

    /* synthetic */ C81410b0 writeFile(String str, InputStream inputStream, boolean z);
}
