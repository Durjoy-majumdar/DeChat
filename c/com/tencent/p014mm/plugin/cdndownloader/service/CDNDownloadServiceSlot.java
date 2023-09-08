package com.tencent.p014mm.plugin.cdndownloader.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.mars.Mars;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.p014mm.plugin.cdndownloader.ipc.CDNTaskState;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p237sp.C48454b0;
import q01.C47731a;
import q01.C47734b;
import s01.C101493b;
import y20.C53487a;
import y20.C53488b;

/* renamed from: com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot */
public class CDNDownloadServiceSlot extends Service implements C53487a {

    /* renamed from: e */
    public static C47734b f109980e;

    /* renamed from: f */
    public static C98124g.C98125a f109981f = new C40895b();

    /* renamed from: d */
    public final C47731a.C47732a f109982d = new C40894a();

    /* renamed from: com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot$a */
    public class C40894a extends C47731a.C47732a {
        public C40894a() {
        }

        /* renamed from: IC */
        public boolean mo63878IC(String str) {
            C101493b.m133250g().mo140983e(str);
            Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "pauseDownloadTask: true");
            return true;
        }

        /* renamed from: Lo */
        public void mo63879Lo(int i) {
            Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "notifyNetworkChange: " + i);
            if (!MMApplicationContext.isPushProcess()) {
                Mars.onNetworkChange();
            }
        }

        /* renamed from: NQ */
        public int mo63880NQ(CDNTaskInfo cDNTaskInfo) {
            Class cls = C48454b0.class;
            Log.m105925i("MicroMsg.CDNDownloadServiceSlot", "addDownloadTask: %s filepath:%s", cDNTaskInfo.f109964e, cDNTaskInfo.f109966g);
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_CDNDownloadServiceSlot_1";
            gVar.f287677x = cDNTaskInfo.f109963d;
            gVar.field_mediaId = cDNTaskInfo.f109965f;
            gVar.field_fullpath = cDNTaskInfo.f109966g;
            gVar.f287672s = ((C48454b0) C86312j.m106911c(cls)).mo60678Er(cDNTaskInfo.f109964e);
            gVar.f287644A = ((C48454b0) C86312j.m106911c(cls)).mo60678Er(cDNTaskInfo.f109967h);
            gVar.f287662f = CDNDownloadServiceSlot.f109981f;
            gVar.f287673t = cDNTaskInfo.f109969j;
            gVar.f287674u = cDNTaskInfo.f109970n;
            gVar.f287678y = cDNTaskInfo.f109971o;
            gVar.f287676w = cDNTaskInfo.f109972p;
            CDNDownloadServiceSlot.m44247a(CDNDownloadServiceSlot.this, gVar, cDNTaskInfo.f109968i);
            int c = C101493b.m133250g().mo140981c(gVar);
            Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "addDownloadTask: " + c);
            return c;
        }

        /* renamed from: WX */
        public void mo63881WX() {
            Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "removeIPCTaskMarker");
            C53488b.C53489b.f150409a.mo74161c(CDNDownloadServiceSlot.this);
        }

        public boolean Wa0(String str) {
            C101493b.m133250g().mo140982d(str);
            Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "removeDownloadTask: true");
            return true;
        }

        /* renamed from: Wh */
        public CDNTaskState mo63883Wh(String str) {
            CdnLogic.CdnTaskStateInfo httpMultiSocketDownloadTaskState = CdnLogic.httpMultiSocketDownloadTaskState(str);
            CDNTaskState cDNTaskState = new CDNTaskState();
            if (httpMultiSocketDownloadTaskState != null) {
                cDNTaskState.f109974d = httpMultiSocketDownloadTaskState.taskState;
                cDNTaskState.f109976f = (long) ((int) httpMultiSocketDownloadTaskState.fileTotalSize);
                cDNTaskState.f109975e = (long) ((int) httpMultiSocketDownloadTaskState.completeSize);
            }
            return cDNTaskState;
        }

        /* renamed from: iF */
        public void mo63884iF() {
        }

        public void jf0() {
            if (!C53488b.C53489b.f150409a.mo74160b(CDNDownloadServiceSlot.this)) {
                Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "addIPCTaskMarker");
                C53488b.C53489b.f150409a.mo74159a(CDNDownloadServiceSlot.this);
            }
        }

        public void ko0(C47734b bVar) {
            Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "registerCallback");
            CDNDownloadServiceSlot.f109980e = bVar;
        }

        public int r90(CDNTaskInfo cDNTaskInfo) {
            Class cls = C48454b0.class;
            Log.m105925i("MicroMsg.CDNDownloadServiceSlot", "resumeDownloadTask: %s", cDNTaskInfo.f109964e);
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_CDNDownloadServiceSlot_2";
            gVar.f287677x = cDNTaskInfo.f109963d;
            gVar.field_mediaId = cDNTaskInfo.f109965f;
            gVar.field_fullpath = cDNTaskInfo.f109966g;
            gVar.f287672s = ((C48454b0) C86312j.m106911c(cls)).mo60678Er(cDNTaskInfo.f109964e);
            gVar.f287644A = ((C48454b0) C86312j.m106911c(cls)).mo60678Er(cDNTaskInfo.f109967h);
            gVar.f287662f = CDNDownloadServiceSlot.f109981f;
            gVar.f287673t = cDNTaskInfo.f109969j;
            gVar.f287674u = cDNTaskInfo.f109970n;
            gVar.f287676w = cDNTaskInfo.f109972p;
            gVar.f287678y = cDNTaskInfo.f109971o;
            gVar.f287679z = true;
            CDNDownloadServiceSlot.m44247a(CDNDownloadServiceSlot.this, gVar, cDNTaskInfo.f109968i);
            int i = C101493b.m133250g().mo140985i(gVar);
            Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "resumeDownloadTask: " + i);
            return i;
        }

        /* renamed from: vP */
        public void mo63888vP(C47734b bVar) {
            CDNDownloadServiceSlot.f109980e = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.cdndownloader.service.CDNDownloadServiceSlot$b */
    public class C40895b implements C98124g.C98125a {
        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i);
            String str2 = "null";
            objArr[2] = cVar == null ? str2 : cVar.toString();
            if (dVar != null) {
                str2 = dVar.toString();
            }
            objArr[3] = str2;
            Log.m105919d("MicroMsg.CDNDownloadServiceSlot", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
            if (i == -21006) {
                Log.m105925i("MicroMsg.CDNDownloadServiceSlot", "duplicate request, ignore this request, media id is %s", str);
                return 0;
            } else if (i != 0) {
                Log.m105921e("MicroMsg.CDNDownloadServiceSlot", "start failed : %d, media id is :%s", Integer.valueOf(i), str);
                CDNDownloadServiceSlot.m44248b(str, 4, i, (String) null);
                return 0;
            } else if (cVar != null) {
                try {
                    CDNDownloadServiceSlot.f109980e.mo72550oD(str, cVar.field_finishedLength, cVar.field_toltalLength);
                } catch (RemoteException e) {
                    Log.m105920e("MicroMsg.CDNDownloadServiceSlot", "updateProgressChange: " + e);
                }
                return 0;
            } else {
                if (dVar != null) {
                    int i2 = dVar.field_retCode;
                    if (i2 != 0) {
                        Log.m105921e("MicroMsg.CDNDownloadServiceSlot", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, Integer.valueOf(i2), dVar);
                        CDNDownloadServiceSlot.m44248b(str, 4, dVar.field_retCode, (String) null);
                    } else {
                        Log.m105925i("MicroMsg.CDNDownloadServiceSlot", "cdn trans suceess, media id : %s", str);
                        CDNDownloadServiceSlot.m44248b(str, 3, 0, (String) null);
                    }
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public static void m44247a(CDNDownloadServiceSlot cDNDownloadServiceSlot, C98124g gVar, String str) {
        cDNDownloadServiceSlot.getClass();
        if (!Util.isNullOrNil(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                gVar.f287645B = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    ((HashMap) gVar.f287645B).put(next, jSONObject.optString(next));
                }
            } catch (JSONException e) {
                Log.m105920e("MicroMsg.CDNDownloadServiceSlot", "addVerifyHeaders: " + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m44248b(String str, int i, int i2, String str2) {
        Log.m105925i("MicroMsg.CDNDownloadServiceSlot", "updateDownloadState, mediaId = %s, state = %d, errCode= %d, errMsg = %s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
        try {
            f109980e.mo72549A9(str, i, i2, str2);
        } catch (RemoteException e) {
            Log.m105920e("MicroMsg.CDNDownloadServiceSlot", "updateDownloadState: " + e);
        }
    }

    public IBinder onBind(Intent intent) {
        Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "onBind");
        return this.f109982d;
    }

    public void onCreate() {
        super.onCreate();
        Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "onCreate");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "onDestroy");
        C53488b.C53489b.f150409a.mo74161c(this);
        C115669n.INSTANCE.idkeyStat(710, 1, 1, false);
    }

    public boolean onUnbind(Intent intent) {
        Log.m105924i("MicroMsg.CDNDownloadServiceSlot", "onUnbind");
        return super.onUnbind(intent);
    }
}
