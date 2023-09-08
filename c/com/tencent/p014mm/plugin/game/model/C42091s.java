package com.tencent.p014mm.plugin.game.model;

import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ob0.C47350c;
import ob0.C89144l0;
import org.json.JSONObject;
import p156gj.C87203t;
import p237sp.C36772r;
import p237sp.C48456t;
import p237sp.C48457w;
import p749xh.C53352w2;
import qy1.C12934a;
import tw1.C52374h;
import tw1.C52375i;
import tw1.C52376j;
import tw1.C52377k;
import u10.C52415a;
import uy1.C52642c;
import wx1.C15599c;
import wx1.C15600f;
import wx1.C38346d;
import wx1.C53217b;
import y41.C53493b;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.game.model.s */
public class C42091s {

    /* renamed from: a */
    public static C42091s f113396a;

    /* renamed from: b */
    public static Set<C42092a> f113397b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    public static HashMap<String, C42093b> f113398c = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.game.model.s$a */
    public interface C42092a {
        /* renamed from: a */
        void mo66052a(int i, String str, boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.game.model.s$b */
    public static class C42093b {

        /* renamed from: a */
        public String f113399a;

        /* renamed from: b */
        public int f113400b;

        /* renamed from: c */
        public String f113401c;

        /* renamed from: d */
        public String f113402d;

        /* renamed from: e */
        public String f113403e;

        /* renamed from: f */
        public boolean f113404f = false;

        public C42093b(String str, int i, String str2, String str3, String str4) {
            this.f113399a = str;
            this.f113400b = i;
            this.f113401c = str2;
            this.f113402d = str3;
            this.f113403e = str4;
        }
    }

    /* renamed from: a */
    public static void m45783a(C42092a aVar) {
        synchronized (f113397b) {
            f113397b.add(aVar);
        }
    }

    /* renamed from: c */
    public static C42091s m45784c() {
        if (f113396a == null) {
            f113396a = new C42091s();
        }
        return f113396a;
    }

    /* renamed from: e */
    public static void m45785e(C42092a aVar) {
        synchronized (f113397b) {
            f113397b.remove(aVar);
            Log.m105919d("MicroMsg.GameDownloadEventBus", "removeListener, size:%d, listener:%s", Integer.valueOf(f113397b.size()), aVar);
        }
    }

    /* renamed from: i */
    public static void m45786i(String str, String str2, int i, String str3, String str4, String str5) {
        if (!Util.isNullOrNil(str)) {
            f113398c.put(str, new C42093b(str2, i, str3, str4, str5));
        }
    }

    /* renamed from: b */
    public final void mo66047b(long j, int i) {
        int i2;
        int i3 = i;
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        if (nh != null) {
            Class cls = C48457w.class;
            if (!Util.isNullOrNil(nh.field_appId)) {
                C42093b bVar = f113398c.get(nh.field_downloadUrl);
                switch (i3) {
                    case 1:
                        ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 0, 1);
                        if (bVar != null) {
                            if (bVar.f113404f) {
                                ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 1, 1);
                            } else {
                                ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 2, 1);
                            }
                        }
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 6;
                        ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 3, 1);
                        break;
                    case 3:
                        ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 6, 1);
                        i2 = 3;
                        break;
                    case 4:
                        ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 5, 1);
                        i2 = 2;
                        break;
                    case 5:
                        i2 = 8;
                        ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 7, 1);
                        break;
                    case 6:
                        break;
                    case 7:
                        i2 = 7;
                        ((C48457w) C86312j.m106911c(cls)).mo72827VV(nh.field_appId, 4, 1);
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                C53493b bVar2 = new C53493b();
                bVar2.mo74165a(nh);
                ((C48457w) C86312j.m106911c(cls)).mo72829tX(i2, bVar2);
                int i4 = nh.field_status;
                if (i4 == 2 || i4 == 5 || i4 == 4 || i4 == 3 || i4 == 0) {
                    long j2 = nh.field_downloadId;
                    Log.m105918d("MicroMsg.FileDownloadSP", "clearDownloadSpeedStr");
                    SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("download_pref", 0);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().remove(String.valueOf(j2)).apply();
                    }
                }
                if (bVar == null) {
                    ((C48457w) C86312j.m106911c(cls)).mo72828q8(nh.field_appId, nh.field_scene, i2, nh.field_md5, nh.field_downloadUrl, "", nh.field_extInfo);
                } else {
                    ((C48457w) C86312j.m106911c(cls)).mo72828q8(bVar.f113401c, bVar.f113400b, i2, bVar.f113399a, nh.field_downloadUrl, bVar.f113402d, bVar.f113403e);
                }
            }
            MMHandlerThread.postToMainThread(new C42087q(this, i3, nh.field_appId, true));
            return;
        }
    }

    /* renamed from: d */
    public void mo66048d(long j, int i, boolean z) {
        Class cls = C48456t.class;
        C53352w2 nh = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j);
        if (nh == null || !nh.field_downloadInWifi || NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            mo66047b(j, 5);
            C53352w2 nh4 = ((C48456t) C86312j.m106911c(cls)).mo72824nh(j);
            if (nh4 != null) {
                String str = null;
                if (i == 802) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("ChannelId", nh4.field_channelId);
                        jSONObject.put("DownloadSize", nh4.field_downloadedSize);
                        str = C12934a.m12382d(jSONObject.toString());
                        Log.m105918d("MicroMsg.GameDownloadEventBus", "extInfo = " + jSONObject.toString());
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.GameDownloadEventBus", "reportDownloadFailed, e = " + e.getMessage());
                    }
                }
                mo66050g(nh4.field_appId, i, z, str);
            }
            mo66049f(j);
            mo66051h(j);
            ((C36772r) C86312j.m106911c(C36772r.class)).ux0(j);
            return;
        }
        Log.m105924i("MicroMsg.GameDownloadEventBus", "wifi pause, return");
        nh.field_status = 2;
        nh.field_errCode = 0;
        ((C48456t) C86312j.m106911c(cls)).mo72823NW(nh);
        C53493b bVar = new C53493b();
        bVar.mo74165a(nh);
        ((C48457w) C86312j.m106911c(C48457w.class)).mo72829tX(13, bVar);
    }

    /* renamed from: f */
    public final void mo66049f(long j) {
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        if (nh == null) {
            Log.m105924i("MicroMsg.ReportDownloadAppState", "report, info is null");
        } else if (!nh.field_fromWeApp) {
            Log.m105924i("MicroMsg.ReportDownloadAppState", "report,not from weApp, return");
        } else if (nh.field_status != 3 || C86013q1.m106450k(nh.field_filePath)) {
            C52374h hVar = new C52374h();
            hVar.f146392d = nh.field_appId;
            int i = nh.field_status;
            if (i == 3) {
                hVar.f146393e = 1;
            } else if (i == 4) {
                hVar.f146393e = 2;
            }
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 2683;
            bVar.f127068c = "/cgi-bin/mmgame-bin/reportappdownloadstatus";
            bVar.f127066a = hVar;
            bVar.f127067b = new C52375i();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C89144l0.m111429e(bVar.mo72403a(), new C15600f(), false);
        } else {
            Log.m105924i("MicroMsg.ReportDownloadAppState", "download success, but file not exist");
        }
    }

    /* renamed from: g */
    public void mo66050g(String str, int i, boolean z, String str2) {
        int i2 = (i == 710 || i == 711) ? 804 : i;
        Log.m105925i("MicroMsg.GameDownloadEventBus", "appid = %s, errCode = %d", str, Integer.valueOf(i2));
        if (!z) {
            C52415a.m58668a().mo62981c(str, 2, i2, (String) null, str2);
        } else {
            C52415a.m58668a().mo62981c(str, 4, i2, (String) null, str2);
        }
    }

    /* renamed from: h */
    public final void mo66051h(long j) {
        int i;
        C38346d dVar = C38346d.f101204a;
        C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
        if (nh == null) {
            Log.m105924i("MicroMsg.GameResourceDownloadReporter", "report, info is null");
            return;
        }
        int i2 = 3;
        if (nh.field_fileType == 3) {
            int i3 = nh.field_status;
            if (i3 != 1) {
                if (i3 == 3) {
                    String str = nh.field_packageName;
                    C87412m.m108593f(str, "info.field_packageName");
                    dVar.mo61625a(str);
                    i = 0;
                } else if (i3 == 4) {
                    String str2 = nh.field_packageName;
                    C87412m.m108593f(str2, "info.field_packageName");
                    dVar.mo61625a(str2);
                    i = 1;
                } else if (i3 == 5) {
                    C53217b bVar = C53217b.f148462a;
                    String str3 = nh.field_packageName;
                    C87412m.m108593f(str3, "info.field_packageName");
                    bVar.mo73885b(str3);
                    i = 0;
                    i2 = 5;
                } else {
                    return;
                }
                i2 = 4;
            } else {
                i = 0;
            }
            String nullAsNil = Util.nullAsNil(nh.field_filePath);
            C52376j jVar = new C52376j();
            jVar.f146394d = nh.field_packageName;
            jVar.f146395e = i2;
            jVar.f146396f = i;
            C87412m.m108593f(nullAsNil, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            String substring = nullAsNil.substring(C112550d0.m153772H(nullAsNil, "/", 0, false, 6, (Object) null) + 1);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            jVar.f146397g = substring;
            jVar.f146398h = nh.field_md5;
            String substring2 = nullAsNil.substring(0, C112550d0.m153772H(nullAsNil, "/", 0, false, 6, (Object) null) + 1);
            C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            jVar.f146399i = substring2;
            jVar.f146400j = nh.field_errCode;
            jVar.f146401n = C87203t.m108270f(false);
            jVar.f146402o = C87203t.m108276l();
            jVar.f146403p = "";
            jVar.f146404q = String.valueOf(C52642c.m58992j(jVar.f146394d));
            jVar.f146405r = C52642c.m58993k(jVar.f146394d);
            jVar.f146406s = C87203t.m108275k();
            jVar.f146407t = Build.MANUFACTURER;
            Log.m105924i("MicroMsg.GameResourceDownloadReporter", "PackageName:" + jVar.f146394d + ", Stage:" + jVar.f146395e + ", Status:" + jVar.f146396f + ", FileName:" + jVar.f146397g + ", FileMd5:" + jVar.f146398h + ", DownloadPath:" + jVar.f146399i + ", errorCode:" + jVar.f146400j + ", Imei:" + jVar.f146401n + ", Oaid:" + jVar.f146402o + ", Xid:" + jVar.f146403p + ", VersionCode:" + jVar.f146404q + ", VersionName:" + jVar.f146405r + ", Model:" + jVar.f146406s + ", Manufacturer:" + jVar.f146407t);
            C47350c.C47352b bVar2 = new C47350c.C47352b();
            bVar2.f127069d = 4100;
            bVar2.f127068c = "/cgi-bin/mmgame-bin/reportgameresourcedownload";
            bVar2.f127066a = jVar;
            bVar2.f127067b = new C52377k();
            bVar2.f127070e = 0;
            bVar2.f127071f = 0;
            C89144l0.m111429e(bVar2.mo72403a(), C15599c.f42225d, false);
        }
    }
}
