package s01;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oa1.C117731d;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;

/* renamed from: s01.a */
public class C101492a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f297185d;

    /* renamed from: e */
    public final /* synthetic */ C98124g f297186e;

    /* renamed from: f */
    public final /* synthetic */ C101493b f297187f;

    public C101492a(C101493b bVar, int i, C98124g gVar) {
        this.f297187f = bVar;
        this.f297185d = i;
        this.f297186e = gVar;
    }

    public void run() {
        int i;
        int i2;
        int i3;
        int i4 = this.f297185d;
        if (i4 != -1) {
            ((ConcurrentHashMap) this.f297187f.f297192g).put(this.f297186e.field_mediaId, Integer.valueOf(i4));
        }
        ((LinkedList) this.f297187f.f297189d).add(this.f297186e.field_mediaId);
        Map<String, C98124g> map = this.f297187f.f297190e;
        C98124g gVar = this.f297186e;
        ((ConcurrentHashMap) map).put(gVar.field_mediaId, gVar);
        C101493b bVar = this.f297187f;
        int i5 = 1;
        char c = 0;
        Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart queue:%d", Integer.valueOf(((LinkedList) bVar.f297189d).size()));
        StringBuilder sb = new StringBuilder();
        String f = C117731d.m166007c().mo182444f("clicfg_android_new_multiconn_game_download", "0", false, true);
        sb.append("clicfg_android_new_multiconn_game_download=");
        sb.append(f);
        sb.append(";");
        CdnLogic.Config config = new CdnLogic.Config();
        config.EnableSafeCDN = 1;
        String sb4 = sb.toString();
        config.MiscellaneousExptValues = sb4;
        Log.m105925i("MicroMsg.CdnDownloadNativeService", "[push.miscell.config] expt %s", sb4);
        CdnLogic.setConfig(config);
        while (!bVar.f297189d.isEmpty()) {
            C98124g gVar2 = (C98124g) ((ConcurrentHashMap) bVar.f297190e).remove((String) ((LinkedList) bVar.f297189d).poll());
            if (gVar2 == null) {
                Log.m105920e("MicroMsg.CdnDownloadNativeService", "summersafecdn task queue is empty , maybe bug here");
                return;
            }
            Object[] objArr = new Object[3];
            objArr[c] = gVar2.field_mediaId;
            objArr[i5] = Boolean.valueOf(gVar2.field_autostart);
            objArr[2] = Integer.valueOf(gVar2.field_chattype);
            Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", objArr);
            gVar2.field_startTime = Util.nowMilliSecond();
            String str = "";
            if (gVar2.f287661e) {
                Object[] objArr2 = new Object[7];
                String str2 = gVar2.field_fullpath;
                objArr2[c] = Integer.valueOf(str2 == null ? -1 : str2.length());
                String str3 = gVar2.field_thumbpath;
                objArr2[i5] = Integer.valueOf(str3 == null ? -1 : str3.length());
                objArr2[2] = Util.secPrint(gVar2.field_svr_signature);
                objArr2[3] = Util.secPrint(gVar2.field_aesKey);
                objArr2[4] = Integer.valueOf(gVar2.field_fileType);
                objArr2[5] = gVar2.field_mediaId;
                objArr2[6] = Boolean.valueOf(gVar2.field_onlycheckexist);
                Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", objArr2);
                if (gVar2.field_fullpath == null) {
                    gVar2.field_fullpath = str;
                }
                if (gVar2.field_thumbpath == null) {
                    gVar2.field_thumbpath = str;
                }
                int s = bVar.mo140984f().mo127050s(gVar2);
                if (s != 0) {
                    Object[] objArr3 = new Object[2];
                    objArr3[c] = Integer.valueOf(s);
                    objArr3[i5] = gVar2.field_mediaId;
                    Log.m105921e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia error:%d clientid:%s", objArr3);
                    C98124g.C98125a aVar = gVar2.f287662f;
                    if (aVar != null) {
                        aVar.mo1773g0(gVar2.field_mediaId, s, (C98120c) null, (C98121d) null, gVar2.field_onlycheckexist);
                    }
                } else {
                    Object[] objArr4 = new Object[i5];
                    objArr4[c] = gVar2.field_mediaId;
                    Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia ok, field_mediaId[%s]", objArr4);
                    ((ConcurrentHashMap) bVar.f297191f).put(gVar2.field_mediaId, gVar2);
                }
            } else {
                int i6 = gVar2.field_fileType;
                if (i6 == 30001 || i6 == 30003 || i6 == 30004 || i6 == 30005 || i6 == 30006 || i6 == 50001) {
                    String str4 = gVar2.field_fullpath;
                    int o = (str4 == null || str4.isEmpty()) ? -1 : bVar.mo140984f().mo127046o(gVar2.field_mediaId, gVar2.f287672s, gVar2.field_fullpath, gVar2.field_fileType, gVar2.f287673t, gVar2.f287674u, (String[]) null, gVar2.f287675v, false, false, gVar2.f287652I);
                    Object[] objArr5 = new Object[5];
                    String str5 = gVar2.field_fullpath;
                    objArr5[0] = Integer.valueOf(str5 == null ? -1 : str5.length());
                    objArr5[1] = gVar2.field_mediaId;
                    i2 = 2;
                    objArr5[2] = gVar2.f287672s;
                    objArr5[3] = Integer.valueOf(gVar2.field_fileType);
                    objArr5[4] = Integer.valueOf(o);
                    Log.m105925i("MicroMsg.CdnDownloadNativeService", "url download tryStart recv file:%d field_mediaId[%s], download_url[%s], filetype:[%d], ret:%d", objArr5);
                    i = o;
                } else {
                    if (gVar2.f287677x) {
                        String str6 = gVar2.field_fullpath;
                        i3 = (str6 == null || str6.isEmpty()) ? -1 : bVar.mo140984f().mo127026i(gVar2.field_mediaId, gVar2.field_fullpath, gVar2.f287672s, gVar2.f287644A, gVar2.f287645B, gVar2.f287678y, gVar2.f287673t, gVar2.f287674u, gVar2.f287679z, gVar2.f287676w, (String[]) null);
                        Object[] objArr6 = new Object[4];
                        String str7 = gVar2.field_fullpath;
                        if (str7 != null) {
                            str = str7;
                        }
                        objArr6[0] = str;
                        objArr6[1] = gVar2.field_mediaId;
                        objArr6[2] = gVar2.f287672s;
                        objArr6[3] = gVar2.f287644A;
                        Log.m105925i("MicroMsg.CdnDownloadNativeService", "game package download tryStart recv file:%s field_mediaId[%s], download_url[%s] https url[%s]", objArr6);
                    } else {
                        Object[] objArr7 = new Object[7];
                        String str8 = gVar2.field_fullpath;
                        objArr7[0] = Integer.valueOf(str8 == null ? -1 : str8.length());
                        String str9 = gVar2.field_thumbpath;
                        objArr7[1] = Integer.valueOf(str9 == null ? -1 : str9.length());
                        objArr7[2] = gVar2.field_svr_signature;
                        objArr7[3] = gVar2.field_aesKey;
                        objArr7[4] = Integer.valueOf(gVar2.field_fileType);
                        objArr7[5] = gVar2.field_mediaId;
                        objArr7[6] = Boolean.valueOf(gVar2.field_onlycheckexist);
                        Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", objArr7);
                        if (gVar2.f287654K != 2) {
                            i3 = bVar.mo140984f().mo127049r(gVar2);
                        } else if (gVar2 instanceof C98127h) {
                            C98127h hVar = (C98127h) gVar2;
                            if (hVar.mo137413a()) {
                                i3 = bVar.mo140984f().mo127048q(gVar2, 2);
                            } else if (hVar.mo137414b()) {
                                hVar.f287657N = 1;
                                hVar.f287696Y0 = 1;
                                i3 = bVar.mo140984f().mo127028k(hVar);
                            } else {
                                i3 = -1;
                            }
                        } else {
                            i2 = 2;
                            i = -1;
                        }
                    }
                    i = i3;
                    i2 = 2;
                }
                if (i != 0) {
                    Object[] objArr8 = new Object[i2];
                    objArr8[0] = Integer.valueOf(i);
                    objArr8[1] = gVar2.field_mediaId;
                    Log.m105921e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia error:%d clientid:%s", objArr8);
                    C98124g.C98125a aVar2 = gVar2.f287662f;
                    if (aVar2 != null) {
                        aVar2.mo1773g0(gVar2.field_mediaId, i, (C98120c) null, (C98121d) null, gVar2.field_onlycheckexist);
                    }
                } else {
                    Log.m105925i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s]", gVar2.field_mediaId);
                    ((ConcurrentHashMap) bVar.f297191f).put(gVar2.field_mediaId, gVar2);
                    i5 = 1;
                    c = 0;
                }
            }
            i5 = 1;
            c = 0;
        }
    }

    public String toString() {
        return super.toString() + "|addRecvTask";
    }
}
