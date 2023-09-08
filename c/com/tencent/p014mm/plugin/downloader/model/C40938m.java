package com.tencent.p014mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import nd3.C47223a;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.m */
public class C40938m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53736a f110171d;

    /* renamed from: e */
    public final /* synthetic */ boolean f110172e;

    /* renamed from: f */
    public final /* synthetic */ C40935l f110173f;

    public C40938m(C40935l lVar, C53736a aVar, boolean z) {
        this.f110173f = lVar;
        this.f110171d = aVar;
        this.f110172e = z;
    }

    public void run() {
        PendingIntent pendingIntent;
        C53736a aVar = this.f110171d;
        if (aVar.field_fileType == 1) {
            C40935l lVar = this.f110173f;
            String str = aVar.field_filePath;
            lVar.getClass();
            Intent intent = new Intent();
            Context context = MMApplicationContext.getContext();
            intent.setClass(context, FileDownloadPendingReceive.class);
            intent.putExtra(FileDownloadService.f110081n, 3);
            intent.putExtra(FileDownloadService.f110082o, str);
            intent.putExtra(FileDownloadService.f110083p, aVar.field_md5);
            intent.putExtra("downloadId", aVar.field_downloadId);
            pendingIntent = PendingIntent.getBroadcast(context, (int) System.currentTimeMillis(), intent, 0);
        } else {
            pendingIntent = null;
        }
        C53736a aVar2 = this.f110171d;
        if (!aVar2.field_showNotification || Util.isNullOrNil(aVar2.field_notificationTitle)) {
            C53736a aVar3 = this.f110171d;
            if (!aVar3.field_showNotification || !Util.isNullOrNil(aVar3.field_fileName)) {
                C53736a aVar4 = this.f110171d;
                if (aVar4.field_showNotification && !Util.isNullOrNil(aVar4.field_fileName)) {
                    C40935l lVar2 = this.f110173f;
                    C53736a aVar5 = this.f110171d;
                    lVar2.mo63974v(aVar5.field_appId, aVar5.field_fileName, MMApplicationContext.getContext().getString(C0966R.string.cuh), pendingIntent);
                }
            } else {
                this.f110173f.mo63974v(this.f110171d.field_appId, MMApplicationContext.getContext().getString(C0966R.string.cuh), "", pendingIntent);
            }
        } else {
            C40935l lVar3 = this.f110173f;
            C53736a aVar6 = this.f110171d;
            lVar3.mo63974v(aVar6.field_appId, aVar6.field_notificationTitle, MMApplicationContext.getContext().getString(C0966R.string.cuh), pendingIntent);
        }
        C53736a aVar7 = this.f110171d;
        if (aVar7.field_autoInstall && aVar7.field_fileType == 1 && !aVar7.field_reserveInWifi) {
            this.f110173f.getClass();
            if (Util.isNullOrNil(aVar7.field_filePath)) {
                Log.m105920e("MicroMsg.FileDownloadManager", "installApk, path is null");
            } else {
                Log.m105925i("MicroMsg.FileDownloadManager", "APK File Path: %s", aVar7.field_filePath);
                C39890a.m42668a(aVar7.field_downloadId, true, (C47223a) null);
            }
        }
        C40923i iVar = this.f110173f.f110163f;
        C53736a aVar8 = this.f110171d;
        iVar.mo63941d(aVar8.field_downloadId, aVar8.field_filePath, this.f110172e);
    }
}
