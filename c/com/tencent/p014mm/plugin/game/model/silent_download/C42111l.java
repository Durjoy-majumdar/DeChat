package com.tencent.p014mm.plugin.game.model.silent_download;

import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.p014mm.plugin.downloader_app.model.C40979a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.luggage.util.C6012a;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45543b;
import e51.C45547h;
import java.io.IOException;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import p237sp.C13753x;
import p237sp.C13754y;
import p237sp.C48457w;
import p763ym.C79138l;
import sw1.C48484q;
import tw1.C52368b;
import u10.C52415a;
import uy1.C52642c;
import v41.C52744c;
import v41.C52748g;
import v41.C52758q;

/* renamed from: com.tencent.mm.plugin.game.model.silent_download.l */
public class C42111l implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ String f113421d;

    /* renamed from: e */
    public final /* synthetic */ C42107k f113422e;

    public C42111l(C42107k kVar, String str) {
        this.f113422e = kVar;
        this.f113421d = str;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C52744c cVar2;
        FileDownloadTaskInfo p;
        int i3;
        Class cls = C13754y.class;
        Class cls2 = C13753x.class;
        Class cls3 = C79138l.class;
        Class cls4 = C48457w.class;
        Class cls5 = C48484q.class;
        if (i == 0 && i2 == 0) {
            C52368b bVar = (C52368b) cVar.f127056b.f127083a;
            if (bVar == null) {
                return 0;
            }
            Log.m105925i("MicroMsg.GameSilentDownloader", "op:%d", Integer.valueOf(bVar.f146354d));
            int i4 = bVar.f146354d;
            if (i4 == 1) {
                ((C48484q) C86312j.m106911c(cls5)).Po0().mo66066qq(this.f113421d);
                C52748g gVar = bVar.f146356f;
                if (gVar == null || (cVar2 = gVar.f147385d) == null || Util.isNullOrNil(cVar2.f147349d)) {
                    Log.m105920e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
                    ((C48457w) C86312j.m106911c(cls4)).mo72827VV(this.f113421d, 20, 1);
                    return 0;
                }
                C42103f jo = ((C48484q) C86312j.m106911c(cls5)).Po0().mo66064jo(this.f113421d);
                if (jo == null) {
                    Log.m105924i("MicroMsg.GameSilentDownloader", "local SilentDownloadTask is deleted");
                    return 0;
                }
                C44561j GW = ((C79138l) C86312j.m106911c(cls3)).mo73990GW(this.f113421d, false);
                if (GW == null) {
                    Log.m105925i("MicroMsg.GameSilentDownloader", "local appInfo is null, appid:%s", this.f113421d);
                    return 0;
                }
                long j = (long) bVar.f146356f.f147385d.f147354i;
                long j2 = (long) C52642c.m58992j(GW.field_packageName);
                Log.m105925i("MicroMsg.GameSilentDownloader", "serverVersionCode: %d, localVersionCode:%d", Long.valueOf(j), Long.valueOf(j2));
                if (j > 0 && j > j2) {
                    Log.m105925i("MicroMsg.GameSilentDownloader", "force update, serverVersionCode(%d) > localVersionCode(%d)", Long.valueOf(j), Long.valueOf(j2));
                    if (j2 == 0) {
                        ((C48484q) C86312j.m106911c(cls5)).Po0().mo66062Yt(this.f113421d, 2);
                    } else {
                        ((C48484q) C86312j.m106911c(cls5)).Po0().mo66062Yt(this.f113421d, 1);
                    }
                } else if (((C79138l) C86312j.m106911c(cls3)).mo74016tz(MMApplicationContext.getContext(), GW)) {
                    Log.m105925i("MicroMsg.GameSilentDownloader", "app is installed, appid = %s", this.f113421d);
                    C42104h.m45804a(jo.field_appId, 4, 0);
                    this.f113422e.mo66067a(jo.field_appId);
                    this.f113422e.mo66068b(false);
                    return 0;
                }
                if (!bVar.f146356f.f147385d.f147349d.equals(Util.nullAsNil(jo.field_downloadUrl))) {
                    C52744c cVar3 = bVar.f146356f.f147385d;
                    C52744c cVar4 = bVar.f146356f.f147385d;
                    Log.m105925i("MicroMsg.GameSilentDownloader", "update downloadInfo. [oldDownloadUrl]:%s, [newDownloadUrl]:%s, [size]:%d, [md5]:%s, [SecondaryUrl]:%s", jo.field_downloadUrl, cVar3.f147349d, Long.valueOf(cVar3.f147351f), cVar4.f147352g, cVar4.f147357o);
                    if (!Util.isNullOrNil(jo.field_downloadUrl) || (p = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63968p(bVar.f146356f.f147385d.f147349d)) == null || p.f12194d <= 0 || (i3 = p.f12196f) == 4 || i3 == 5) {
                        C52744c cVar5 = bVar.f146356f.f147385d;
                        jo.field_downloadUrl = cVar5.f147349d;
                        jo.field_size = cVar5.f147351f;
                        jo.field_md5 = cVar5.f147352g;
                        jo.field_SecondaryUrl = cVar5.f147357o;
                        if (!Util.isNullOrNil(cVar5.f147350e)) {
                            jo.field_packageName = bVar.f146356f.f147385d.f147350e;
                        }
                        C52748g gVar2 = bVar.f146356f;
                        jo.field_downloadInWidget = gVar2.f147389h;
                        if (!Util.isNullOrNil((List) gVar2.f147385d.f147360r)) {
                            C52758q qVar = new C52758q();
                            qVar.f147428d = bVar.f146356f.f147385d.f147360r;
                            try {
                                jo.field_sectionMd5Byte = qVar.toByteArray();
                            } catch (IOException unused) {
                            }
                        }
                        ((C48484q) C86312j.m106911c(cls5)).Po0().update(jo, new String[0]);
                    } else {
                        Log.m105924i("MicroMsg.GameSilentDownloader", "download task already exists");
                        ((C48484q) C86312j.m106911c(cls5)).Po0().mo66062Yt(this.f113421d, 3);
                        C42104h.m45804a(this.f113421d, 6, 0);
                        ((C48484q) C86312j.m106911c(cls5)).Po0().delete(jo, new String[0]);
                        this.f113422e.mo66068b(false);
                        return 0;
                    }
                }
                if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                    Log.m105924i("MicroMsg.GameSilentDownloader", "cgi response back, but not in wifi");
                } else if (jo.field_size <= 0 || ((C13753x) C86312j.m106911c(cls2)).Ci0(jo.field_size) || ((C13753x) C86312j.m106911c(cls2)).mo13122Um(jo.field_size)) {
                    C52415a.m58668a().mo62980b(12, this.f113421d, "ok", 0);
                    C42107k kVar = this.f113422e;
                    int i5 = bVar.f146356f.f147385d.f147353h;
                    kVar.getClass();
                    if (Util.isNullOrNil(jo.field_downloadUrl)) {
                        Log.m105920e("MicroMsg.GameSilentDownloader", "downloadInfo is null");
                    } else {
                        Log.m105925i("MicroMsg.GameSilentDownloader", "startDownload, appId:%s, url:%s, size:%d, md5:%s, packageName:%s, expireTime:%d, isFirst:%b, nextCheckTime:%d, isRunning:%b", jo.field_appId, jo.field_downloadUrl, Long.valueOf(jo.field_size), jo.field_md5, jo.field_packageName, Long.valueOf(jo.field_expireTime), Boolean.valueOf(jo.field_isFirst), Long.valueOf(jo.field_nextCheckTime), Boolean.valueOf(jo.field_isRunning));
                        if (C6012a.m5887a()) {
                            Log.m105928w("MicroMsg.GameSilentDownloader", "startDownload isTeenMode and ignore");
                        } else {
                            FileDownloadTaskInfo p2 = ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63968p(jo.field_downloadUrl);
                            if (p2 == null || p2.f12194d <= 0 || p2.f12196f != 2) {
                                C115669n.INSTANCE.idkeyStat(858, 9, 1, false);
                                C40979a aVar = new C40979a();
                                aVar.f110292d = jo.field_appId;
                                aVar.f110289a = jo.field_downloadUrl;
                                aVar.f110290b = jo.field_SecondaryUrl;
                                aVar.f110294f = jo.field_packageName;
                                aVar.f110295g = jo.field_size;
                                aVar.f110296h = jo.field_md5;
                                aVar.f110301m = false;
                                aVar.f110299k = 7001;
                                aVar.f110307s = true;
                                if (jo.field_sectionMd5Byte != null) {
                                    try {
                                        C52758q qVar2 = new C52758q();
                                        qVar2.parseFrom(jo.field_sectionMd5Byte);
                                        aVar.f110308t = qVar2.f147428d;
                                    } catch (IOException unused2) {
                                    }
                                }
                                aVar.f110291c = ((C79138l) C86312j.m106911c(cls3)).mo74011hv(MMApplicationContext.getContext(), ((C79138l) C86312j.m106911c(cls3)).getAppInfo(jo.field_appId));
                                aVar.f110297i = i5;
                                ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).f110164g = true;
                                Log.m105925i("MicroMsg.GameSilentDownload.GameDownloadHelper", "add downloadTask id:%d, downloaderType:%d", Long.valueOf(((C45547h) C86312j.m106911c(C45547h.class)).mo70789R7(aVar, (C45543b) null)), Integer.valueOf(i5));
                                return 0;
                            }
                            Log.m105924i("MicroMsg.GameSilentDownloader", "resume downloadTask");
                            long j3 = p2.f12194d;
                            ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).f110164g = true;
                            ((C40935l) ((C13754y) C86312j.m106911c(cls)).Ds0()).mo63972t(j3);
                        }
                    }
                } else {
                    Log.m105924i("MicroMsg.GameSilentDownloader", "sdcard dont have enough space");
                    C52415a.m58668a().mo62980b(12, this.f113421d, "space_not_enough", 0);
                }
            } else if (i4 == 2) {
                Log.m105925i("MicroMsg.GameSilentDownloader", "delay, nextInterval:%d", Long.valueOf(bVar.f146355e));
                ((C48484q) C86312j.m106911c(cls5)).Po0().mo66059Ow(this.f113421d, Util.nowSecond() + bVar.f146355e);
                this.f113422e.mo66068b(false);
            } else if (i4 != 3) {
                ((C48457w) C86312j.m106911c(cls4)).mo72827VV(this.f113421d, 19, 1);
            } else {
                C42104h.m45804a(this.f113421d, 5, 0);
                this.f113422e.mo66067a(this.f113421d);
                this.f113422e.mo66068b(false);
            }
            return 0;
        }
        Log.m105921e("MicroMsg.GameSilentDownloader", "Check Error, errType:%d, errCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        ((C48457w) C86312j.m106911c(cls4)).mo72827VV(this.f113421d, 18, 1);
        return 0;
    }
}
