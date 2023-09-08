package com.tencent.tinker.lib.service;

import android.os.Process;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import hv3.C87598a;
import iv3.C87821a;
import iv3.C87826d;
import java.io.File;
import jv3.C88033a;

public class DefaultTinkerResultService extends AbstractResultService {
    /* renamed from: a */
    public void mo118340a(C87598a aVar) {
        if (aVar == null) {
            ShareTinkerLog.m106531e("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received null result!!!!", new Object[0]);
            return;
        }
        ShareTinkerLog.m106532i("Tinker.DefaultTinkerResultService", "DefaultTinkerResultService received a result:%s ", aVar.toString());
        C88033a.m109602c(getApplicationContext());
        if (aVar.f253683d) {
            mo120289d(new File(aVar.f253684e));
            if (mo120288c(aVar)) {
                Process.killProcess(Process.myPid());
            } else {
                ShareTinkerLog.m106532i("Tinker.DefaultTinkerResultService", "I have already install the newly patch version!", new Object[0]);
            }
        }
    }

    /* renamed from: c */
    public boolean mo120288c(C87598a aVar) {
        C87826d dVar;
        C87821a c = C87821a.m109275c(getApplicationContext());
        if (!c.f254239l || (dVar = c.f254238k) == null) {
            return true;
        }
        String str = dVar.f254252a;
        String str2 = aVar.f253689j;
        return str2 == null || !str2.equals(str);
    }

    /* renamed from: d */
    public void mo120289d(File file) {
        if (SharePatchFileUtil.isLegalFile(file)) {
            ShareTinkerLog.m106534w("Tinker.DefaultTinkerResultService", "deleteRawPatchFile rawFile path: %s", file.getPath());
            String name = file.getName();
            if (!name.startsWith(ShareConstants.PATCH_BASE_NAME) || !name.endsWith(".apk")) {
                SharePatchFileUtil.safeDeleteFile(file);
                return;
            }
            File parentFile = file.getParentFile();
            if (!parentFile.getName().startsWith(ShareConstants.PATCH_BASE_NAME)) {
                SharePatchFileUtil.safeDeleteFile(file);
                return;
            }
            File parentFile2 = parentFile.getParentFile();
            if (!parentFile2.getName().equals(ShareConstants.PATCH_DIRECTORY_NAME) && !parentFile2.getName().equals(ShareConstants.PATCH_DIRECTORY_NAME_SPEC)) {
                SharePatchFileUtil.safeDeleteFile(file);
            }
        }
    }
}
