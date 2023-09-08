package com.tencent.p014mm.plugin.downloader.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C9556a;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.s */
public class C40946s extends C40945r {
    public C40946s(C40923i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public boolean mo62091a(long j) {
        return false;
    }

    /* renamed from: b */
    public long mo62092b(C40939n nVar) {
        if (Util.isNullOrNil(nVar.f110176a)) {
            return -1;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(nVar.f110176a));
        intent.addFlags(268435456);
        try {
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/downloader/model/FileDownloaderImplNormal", JsApiAddDownloadTask.NAME, "(Lcom/tencent/mm/plugin/downloader/model/FileDownloadRequest;)J", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/downloader/model/FileDownloaderImplNormal", JsApiAddDownloadTask.NAME, "(Lcom/tencent/mm/plugin/downloader/model/FileDownloadRequest;)J", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return 0;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.FileDownloaderImplNormal", "Add download task failed: " + e.toString());
            return -1;
        }
    }

    /* renamed from: c */
    public boolean mo62093c(long j) {
        return false;
    }

    /* renamed from: d */
    public long mo62094d(C53736a aVar) {
        return 0;
    }

    /* renamed from: e */
    public FileDownloadTaskInfo mo62095e(long j) {
        FileDownloadTaskInfo fileDownloadTaskInfo = new FileDownloadTaskInfo();
        fileDownloadTaskInfo.f12194d = j;
        fileDownloadTaskInfo.f12196f = -1;
        return fileDownloadTaskInfo;
    }

    public int removeDownloadTask(long j) {
        return 1;
    }
}
