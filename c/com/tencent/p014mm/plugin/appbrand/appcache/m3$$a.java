package com.tencent.p014mm.plugin.appbrand.appcache;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import js0.C9513g;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.m3$$a */
public final /* synthetic */ class m3$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C29222i f238707d;

    /* renamed from: e */
    public final /* synthetic */ C81347q0 f238708e;

    public /* synthetic */ m3$$a(C29222i iVar, C81347q0 q0Var) {
        this.f238707d = iVar;
        this.f238708e = q0Var;
    }

    public final void run() {
        C29222i iVar = this.f238707d;
        C81347q0 q0Var = this.f238708e;
        if (C81293m3.m99677c()) {
            if (Util.isNullOrNil(iVar.field_versionMd5) || Util.isNullOrNil(iVar.field_NewMd5) || iVar.field_versionMd5.equals(iVar.field_NewMd5)) {
                String str = iVar.field_pkgPath;
                long a = C9513g.m9208a(str);
                if (a == 0) {
                    Log.m105921e("MicroMsg.WxaPkgUpdater", "postCacheChecksum, checksum is 0, filePath = %s", str);
                    return;
                }
                String c = WxaPkgIntegrityChecker.m99520c(str);
                if (c == null || c.length() == 0) {
                    Log.m105921e("MicroMsg.WxaPkgUpdater", "postCacheChecksum, md5 is empty, filePath = %s", str);
                } else if (c.equals(iVar.field_versionMd5) || c.equals(iVar.field_NewMd5)) {
                    iVar.field_checksum = a;
                    if (!C81277j3.m99636b(q0Var, iVar)) {
                        Log.m105921e("MicroMsg.WxaPkgUpdater", "postCacheChecksum, update failed, filePath = %s", str);
                    }
                    Object[] objArr = new Object[3];
                    objArr[0] = Long.valueOf(a);
                    objArr[1] = c;
                    Uri n = C116299g2.m163858n(str);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    String path2 = n.getPath();
                    int lastIndexOf = path2.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        path2 = path2.substring(lastIndexOf + 1);
                    }
                    objArr[2] = path2;
                    Log.m105925i("MicroMsg.WxaPkgUpdater", "postCacheChecksum, checksum = %d, md5 = %s, file = %s", objArr);
                } else {
                    Log.m105921e("MicroMsg.WxaPkgUpdater", "postCacheChecksum, md5 not match, filePath = %s, md5 = %s, manifest.field_versionMd5 = %s, manifest.field_NewMd5 = %s", str, c, iVar.field_versionMd5, iVar.field_NewMd5);
                }
            } else {
                iVar.field_checksum = 0;
                Log.m105925i("MicroMsg.WxaPkgUpdater", "clear checksum versionMD5(%s) newMD5(%s)", iVar.field_versionMd5, iVar.field_NewMd5);
                if (!C81277j3.m99636b(q0Var, iVar)) {
                    Log.m105921e("MicroMsg.WxaPkgUpdater", "postCacheChecksum, update failed: %s", iVar.field_appId);
                }
            }
        }
    }
}
