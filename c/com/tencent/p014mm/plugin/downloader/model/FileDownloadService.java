package com.tencent.p014mm.plugin.downloader.model;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44563k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.MMIntentService;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import f40.C86709a0;
import f40.C86718e;
import java.io.IOException;
import java.util.Set;
import nd3.C47223a;
import v41.C52758q;
import w41.C118747b;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.FileDownloadService */
public class FileDownloadService extends MMIntentService {

    /* renamed from: j */
    public static final String f110080j = ("FileDownloadService_extra_" + "id");

    /* renamed from: n */
    public static final String f110081n = ("FileDownloadService_extra_" + "action_type");

    /* renamed from: o */
    public static final String f110082o = ("FileDownloadService_extra_" + XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH);

    /* renamed from: p */
    public static final String f110083p = ("FileDownloadService_extra_" + "md5");

    /* renamed from: q */
    public static final String f110084q = ("FileDownloadService_extra_" + "change_url");

    public FileDownloadService() {
        super("FileDownloadService");
    }

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.FileDownloadService";
    }

    /* renamed from: j */
    public void mo63929j(Intent intent) {
        long j;
        String str;
        String str2;
        boolean z;
        long j2;
        C53736a d;
        Intent intent2 = intent;
        if (intent2 != null) {
            int intExtra = intent2.getIntExtra(f110081n, 0);
            Log.m105925i("MicroMsg.FileDownloadService", "handle intent type : %d", Integer.valueOf(intExtra));
            if (intExtra == 1) {
                long longExtra = intent2.getLongExtra(f110080j, -1);
                if (longExtra < 0) {
                    Log.m105920e("MicroMsg.FileDownloadService", "Invalid id");
                    return;
                }
                if (C86709a0.m107523b().mo121114l()) {
                    C86709a0.m107523b();
                    if (!C86718e.m107551r()) {
                        C53736a c = C40933j.m44314c(longExtra);
                        if (c != null) {
                            boolean z2 = intent2.getBooleanExtra(f110084q, false) || c.field_isSecondDownload;
                            Log.m105924i("MicroMsg.FileDownloadService", "filePath = " + c.field_filePath);
                            if (Util.isNullOrNil(c.field_filePath) || !C86013q1.m106450k(c.field_filePath)) {
                                C115669n.INSTANCE.idkeyStat(710, 5, 1, false);
                                c.field_status = 4;
                                c.field_errCode = 806;
                                C40933j.m44322k(c);
                                C40935l g = C40935l.m44326g();
                                g.getClass();
                                Log.m105925i("MicroMsg.FileDownloadManager", "onDownloadFailed, id = %d, errCode = %d", Long.valueOf(longExtra), 806);
                                C40923i iVar = g.f110163f;
                                if (iVar != null) {
                                    iVar.mo63940c(longExtra, 806, z2);
                                }
                                Log.m105924i("MicroMsg.FileDownloadService", "file not exists, appid = " + c.field_appId);
                                return;
                            } else if (Util.isNullOrNil(c.field_md5)) {
                                Log.m105924i("MicroMsg.FileDownloadService", "Invalid original md5, abort checking");
                                c.field_status = 3;
                                C40933j.m44322k(c);
                                C40935l.m44326g().mo63964l(longExtra, z2);
                                return;
                            } else {
                                if (!Util.isNullOrNil(c.field_appId)) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    try {
                                        str = C118747b.m167439a(new C86009m1(c.field_filePath));
                                    } catch (Exception e) {
                                        Log.m105920e("MicroMsg.FileDownloadService", "readChannelId exception : " + e.getMessage());
                                        str = "";
                                    }
                                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                    Log.m105925i("MicroMsg.FileDownloadService", "readChannelId, channelId:%s, cost time: %d", str, Long.valueOf(currentTimeMillis2));
                                    j = 0 + currentTimeMillis2;
                                } else {
                                    j = 0;
                                    str = "";
                                }
                                String str3 = c.field_appId;
                                C53493b bVar = new C53493b(str3, c.field_downloadId, str, j, c.field_reserveInWifi ? 1 : 0);
                                Set<Long> set = C40934k.f110154a;
                                if (c.field_sectionMd5Byte == null) {
                                    String str4 = c.field_filePath;
                                    String str5 = c.field_md5;
                                    C86009m1 m1Var = new C86009m1(str4);
                                    Log.m105925i("MicroMsg.FileDownloadMD5Manager", "MD5 Check: %s, File Exists: %b", str4, Boolean.valueOf(m1Var.mo119967g()));
                                    long currentTimeMillis3 = System.currentTimeMillis();
                                    String q = C86013q1.m106456q(m1Var.mo119976n());
                                    long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                                    Log.m105925i("MicroMsg.FileDownloadMD5Manager", "MD5 Check Time: %d", Long.valueOf(currentTimeMillis4));
                                    Log.m105925i("MicroMsg.FileDownloadMD5Manager", "Original MD5: %s, Calculated MD5: %s", str5, q);
                                    if (Util.isNullOrNil(str3) || (d = C40933j.m44315d(str3)) == null) {
                                        str2 = "";
                                    } else {
                                        str2 = "";
                                        C53491a.m60013c(111, new C53493b(str3, d.field_downloadId, "", currentTimeMillis4, d.field_reserveInWifi ? 1 : 0));
                                    }
                                    if (Util.isNullOrNil(str5)) {
                                        z = m1Var.mo119967g();
                                    } else if (Util.isNullOrNil(q)) {
                                        Log.m105924i("MicroMsg.FileDownloadMD5Manager", "check from file failed, may caused by low memory while checking md5");
                                        z = m1Var.mo119967g();
                                    } else {
                                        z = str5.trim().equalsIgnoreCase(q.trim());
                                    }
                                } else {
                                    str2 = "";
                                    z = C40934k.m44325b(c);
                                }
                                if (z2) {
                                    if (z) {
                                        C53491a.m60014d(c.field_appId, 21, 1);
                                        C53491a.m60013c(108, bVar);
                                    } else {
                                        C53491a.m60014d(c.field_appId, 22, 1);
                                        C53491a.m60013c(109, bVar);
                                    }
                                }
                                if (!z) {
                                    if (c.field_downloadUrl.startsWith(C113600ck.f339986i)) {
                                        C53491a.m60014d(c.field_appId, 32, 1);
                                    } else {
                                        C53491a.m60014d(c.field_appId, 31, 1);
                                    }
                                }
                                if (z) {
                                    c.field_status = 3;
                                    c.field_channelId = str;
                                    C40933j.m44322k(c);
                                    C40933j.m44323l(c.field_downloadUrl, 3);
                                    C40935l.m44326g().mo63964l(longExtra, z2);
                                    return;
                                }
                                if (c.field_downloaderType == 3) {
                                    if (c.field_downloadUrl.startsWith(C113600ck.f339986i)) {
                                        C115669n.INSTANCE.idkeyStat(710, 10, 1, false);
                                    } else {
                                        C115669n.INSTANCE.idkeyStat(710, 9, 1, false);
                                    }
                                } else if (c.field_downloadUrl.startsWith(C113600ck.f339986i)) {
                                    C115669n.INSTANCE.idkeyStat(710, 7, 1, false);
                                } else {
                                    C115669n.INSTANCE.idkeyStat(710, 6, 1, false);
                                }
                                c.field_status = 4;
                                c.field_channelId = str;
                                c.field_errCode = 802;
                                c.field_downloadedSize = C86013q1.m106451l(c.field_filePath);
                                C40933j.m44322k(c);
                                Log.m105925i("MicroMsg.FileDownloadService", "ChannelId = %s, receivedSize = %d, fileSize = %d", str, Long.valueOf(c.field_downloadedSize), Long.valueOf(C86013q1.m106451l(c.field_filePath)));
                                Log.m105925i("MicroMsg.FileDownloadService", "delete file: %s", c.field_filePath);
                                C86013q1.m106447h(c.field_filePath);
                                Log.m105925i("MicroMsg.FileDownloadService", "checkMd5, isWifi: %b, hasChangeUrl: %b, hasHttpsUrl: %b", Boolean.valueOf(NetStatusUtil.isWifi(MMApplicationContext.getContext())), Boolean.valueOf(z2), Boolean.valueOf(!Util.isNullOrNil(c.field_secondaryUrl)));
                                if (NetStatusUtil.isWifi(MMApplicationContext.getContext()) && !z2 && !Util.isNullOrNil(c.field_secondaryUrl)) {
                                    C40939n nVar = new C40939n((C40939n.C2206a) null);
                                    nVar.f110176a = c.field_secondaryUrl;
                                    nVar.f110178c = c.field_fileSize;
                                    nVar.f110179d = c.field_fileName;
                                    nVar.f110174A = c.field_notificationTitle;
                                    nVar.f110182g = c.field_appId;
                                    nVar.f110180e = c.field_md5;
                                    nVar.f110187l = c.field_scene;
                                    nVar.f110192q = c.field_extInfo;
                                    nVar.f110188m = true;
                                    nVar.f110184i = true;
                                    nVar.f110181f = 1;
                                    nVar.f110183h = c.field_packageName;
                                    nVar.f110191p = true;
                                    if (c.field_sectionMd5Byte != null) {
                                        C52758q qVar = new C52758q();
                                        try {
                                            qVar.parseFrom(c.field_sectionMd5Byte);
                                            nVar.f110198w = qVar.f147428d;
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (c.field_downloaderType != 3) {
                                        j2 = C40935l.m44326g().mo63956b(nVar);
                                        C115669n.INSTANCE.idkeyStat(710, 8, 1, false);
                                    } else {
                                        j2 = C40935l.m44326g().mo63957c(nVar);
                                        C115669n.INSTANCE.idkeyStat(710, 11, 1, false);
                                    }
                                    Log.m105924i("MicroMsg.FileDownloadService", "MD5 check failed, restart download, id = " + j2);
                                    C53491a.m60013c(110, bVar);
                                    C53491a.m60014d(c.field_appId, 30, 1);
                                    return;
                                }
                                C40935l g2 = C40935l.m44326g();
                                g2.getClass();
                                C53736a c2 = C40933j.m44314c(longExtra);
                                if (c2 != null) {
                                    Context context = MMApplicationContext.getContext();
                                    if (c2.field_showNotification && !Util.isNullOrNil(c2.field_notificationTitle)) {
                                        g2.mo63974v(c2.field_appId, c2.field_notificationTitle, context.getString(C0966R.string.cuj), (PendingIntent) null);
                                    } else if (c2.field_showNotification && Util.isNullOrNil(c2.field_fileName)) {
                                        g2.mo63974v(c2.field_appId, context.getString(C0966R.string.cuj), str2, (PendingIntent) null);
                                    } else if (c2.field_showNotification && !Util.isNullOrNil(c2.field_fileName)) {
                                        g2.mo63974v(c2.field_appId, c2.field_fileName, context.getString(C0966R.string.cuj), (PendingIntent) null);
                                    }
                                    g2.f110163f.mo63940c(longExtra, 802, z2);
                                    return;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                Log.m105918d("MicroMsg.FileDownloadService", "no user login");
            } else if (intExtra == 3) {
                String stringExtra = intent2.getStringExtra(f110082o);
                long longExtra2 = intent2.getLongExtra("downloadId", -1);
                if (Util.isNullOrNil(stringExtra) || !C86013q1.m106450k(stringExtra)) {
                    Log.m105924i("MicroMsg.FileDownloadService", "Invalid file path, ignored");
                    return;
                }
                C53736a c3 = C40933j.m44314c(longExtra2);
                if (c3 != null) {
                    C39890a.m42668a(c3.field_downloadId, false, (C47223a) null);
                } else if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("MicroMsg.DownloadAppUtil", "installApk, path is null");
                } else {
                    Log.m105924i("MicroMsg.DownloadAppUtil", "installApk, path = " + stringExtra);
                    if (!C86013q1.m106450k(stringExtra)) {
                        Log.m105920e("MicroMsg.DownloadAppUtil", "installApk, path not exists");
                    } else {
                        C44563k0.m48979d(MMApplicationContext.getContext(), stringExtra, (C47223a) null, true);
                    }
                }
            }
        }
    }
}
