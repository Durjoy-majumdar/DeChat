package up0;

import android.text.TextUtils;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import hr0.C87583a;
import java.util.Map;
import lu3.C88654b;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import sp0.C90302k;
import sp0.C90309m;
import sp0.C90326y;
import up0.C90721c;
import zt3.C119157j;

/* renamed from: up0.b */
public class C90719b implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public final /* synthetic */ C88654b f260553a;

    /* renamed from: b */
    public final /* synthetic */ C90721c.C90722a f260554b;

    /* renamed from: c */
    public final /* synthetic */ C90721c f260555c;

    /* renamed from: up0.b$a */
    public class C90720a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CronetLogic.CronetTaskResult f260556d;

        public C90720a(CronetLogic.CronetTaskResult cronetTaskResult) {
            this.f260556d = cronetTaskResult;
        }

        public void run() {
            boolean z;
            Class cls = C90326y.class;
            Class cls2 = C87583a.class;
            CronetLogic.CronetTaskResult cronetTaskResult = this.f260556d;
            long j = cronetTaskResult.totalReceiveByte;
            int i = cronetTaskResult.statusCode;
            C90721c cVar = C90719b.this.f260555c;
            Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "appbrand_cronetupload_callback_thread run taskid:%s,CronetRequestId:%s", cVar.f260581w, cVar.f260583y);
            if (this.f260556d.errorCode == 0) {
                C90719b.this.f260555c.getClass();
                int i2 = (i < 100 || i >= 200) ? 200 == i ? 21 : (i <= 200 || i >= 300) ? 302 == i ? 23 : (i < 300 || i >= 400) ? 404 == i ? 25 : (i < 400 || i >= 500) ? i >= 500 ? 27 : 28 : 26 : 24 : 22 : 20;
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, (long) i2, 1, false);
                Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "reportCronetStatusCode:%d, key:%d", Integer.valueOf(i), Integer.valueOf(i2));
                if (i != 200) {
                    C90721c cVar2 = C90719b.this.f260555c;
                    Log.m105921e("MicroMsg.AppBrandNetworkUploadWorker", "failed code: %d,url is %s,filename is %s ", Integer.valueOf(i), cVar2.f260571j, cVar2.f260573o);
                    if (C90309m.m113089x(i)) {
                        String str = this.f260556d.newLocation;
                        if (!TextUtils.isEmpty(str)) {
                            C90721c cVar3 = C90719b.this.f260555c;
                            int i3 = cVar3.f260565d;
                            int i4 = i3 - 1;
                            cVar3.f260565d = i4;
                            if (i3 <= 0) {
                                Log.m105929w("MicroMsg.AppBrandNetworkUploadWorker", "reach the max redirect count(%d)", 15);
                                if (!C90719b.this.f260555c.f260569h) {
                                    C90719b.this.f260555c.f260569h = true;
                                    C90721c cVar4 = C90719b.this.f260555c;
                                    if (cVar4.f260564G) {
                                        ((C90302k.C90303a) cVar4.f260567f).mo124539c(cVar4.f260573o, cVar4.f260571j, "reach the max redirect count 15", i, 0, C90309m.m113076k(this.f260556d.webPageProfile));
                                    } else {
                                        ((C90302k.C90303a) cVar4.f260567f).mo124539c(cVar4.f260573o, cVar4.f260571j, "reach the max redirect count 15", i, 0, (Map) null);
                                    }
                                    String appId = C90719b.this.f260555c.f260566e.getAppId();
                                    C90721c cVar5 = C90719b.this.f260555c;
                                    String str2 = cVar5.f260559B;
                                    String str3 = cVar5.f260571j;
                                    CronetLogic.CronetTaskResult cronetTaskResult2 = this.f260556d;
                                    ((C90326y) C89909e.m112439d(cls, true)).mo121695c(appId, str2, "POST", str3, cronetTaskResult2.totalSendByte, cronetTaskResult2.totalReceiveByte, i, 1, cVar5.mo124842b(), (String) null, C90719b.this.f260555c.f260574p);
                                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, 10, 1, false);
                                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, 12, System.currentTimeMillis() - C90719b.this.f260555c.f260580v, false);
                                    return;
                                }
                                Log.m105920e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                                return;
                            }
                            Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "redirect(%d) URL(%s) to URL(%s)", Integer.valueOf(i4), C90719b.this.f260555c.f260571j, str);
                            C90721c cVar6 = C90719b.this.f260555c;
                            cVar6.f260571j = str;
                            cVar6.run();
                            return;
                        }
                    }
                }
                if (!C90719b.this.f260555c.f260569h) {
                    C90719b.this.f260555c.f260569h = true;
                    if (C90719b.this.f260555c.f260568g) {
                        C90721c cVar7 = C90719b.this.f260555c;
                        if (cVar7.f260564G) {
                            z = true;
                            ((C90302k.C90303a) cVar7.f260567f).mo124539c(cVar7.f260573o, cVar7.f260571j, this.f260556d.getDataString(), i, j, C90309m.m113076k(this.f260556d.webPageProfile));
                        } else {
                            z = true;
                            ((C90302k.C90303a) cVar7.f260567f).mo124539c(cVar7.f260573o, cVar7.f260571j, this.f260556d.getDataString(), i, j, (Map) null);
                        }
                        C90721c cVar8 = C90719b.this.f260555c;
                        long j2 = this.f260556d.totalSendByte;
                        long currentTimeMillis = System.currentTimeMillis() - C90719b.this.f260555c.f260580v;
                        cVar8.getClass();
                        if (j2 <= 0 || currentTimeMillis <= 0) {
                            Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "reportCronetSpeed len:%d, time:%d return", Long.valueOf(j2), Long.valueOf(currentTimeMillis));
                        } else {
                            long j3 = j2;
                            double d = (((double) j2) / ((double) currentTimeMillis)) * 0.9765625d;
                            int i5 = NetStatusUtil.is2G(MMApplicationContext.getContext()) ? 30 : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? 31 : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? 32 : NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 33 : 34;
                            ((C87583a) C89909e.m112439d(cls2, z)).idkeyStat(1791, (long) i5, (long) d, false);
                            Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "reportCronetSpeed len:%d, time:%d, speed:%f, key:%d", Long.valueOf(j3), Long.valueOf(currentTimeMillis), Double.valueOf(d), Integer.valueOf(i5));
                        }
                        C90719b.this.f260554b.getClass();
                    } else {
                        C90721c cVar9 = C90719b.this.f260555c;
                        ((C90302k.C90303a) cVar9.f260567f).mo124537a(cVar9.f260573o, cVar9.f260571j, "force stop", 600004);
                    }
                    C90721c cVar10 = C90719b.this.f260555c;
                    Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "cronet upload file finished taskid:%s,CronetRequestId:%s,filename: %s, url:%s ", cVar10.f260581w, cVar10.f260583y, cVar10.f260573o, cVar10.f260571j);
                    C90721c cVar11 = C90719b.this.f260555c;
                    ((C90302k.C90303a) cVar11.f260567f).mo124538b(cVar11.f260581w);
                    String appId2 = C90719b.this.f260555c.f260566e.getAppId();
                    C90721c cVar12 = C90719b.this.f260555c;
                    String str4 = cVar12.f260559B;
                    String str5 = cVar12.f260571j;
                    CronetLogic.CronetTaskResult cronetTaskResult3 = this.f260556d;
                    ((C90326y) C89909e.m112439d(cls, true)).mo121695c(appId2, str4, "POST", str5, cronetTaskResult3.totalSendByte, cronetTaskResult3.totalReceiveByte, i, 1, cVar12.mo124842b(), (String) null, C90719b.this.f260555c.f260574p);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, 10, 1, false);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, 12, System.currentTimeMillis() - C90719b.this.f260555c.f260580v, false);
                    long currentTimeMillis2 = System.currentTimeMillis() - C90719b.this.f260555c.f260558A;
                    Log.m105924i("cronet upload time", "request time is " + currentTimeMillis2);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1800, 3, currentTimeMillis2, false);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1800, 1, 1, false);
                    return;
                }
                Log.m105920e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted already callback");
            } else if (!C90719b.this.f260555c.f260569h) {
                C90719b.this.f260555c.f260569h = true;
                C90721c cVar13 = C90719b.this.f260555c;
                C90723d dVar = cVar13.f260567f;
                ((C90302k.C90303a) dVar).mo124537a(cVar13.f260573o, cVar13.f260571j, "upload fail:" + this.f260556d.errorCode + XVFSFile.PATH_SEPARATOR + this.f260556d.errorMsg, 600001);
                String appId3 = C90719b.this.f260555c.f260566e.getAppId();
                C90721c cVar14 = C90719b.this.f260555c;
                String str6 = cVar14.f260559B;
                String str7 = cVar14.f260571j;
                CronetLogic.CronetTaskResult cronetTaskResult4 = this.f260556d;
                long j4 = cronetTaskResult4.totalSendByte;
                long j5 = cronetTaskResult4.totalReceiveByte;
                String str8 = "MicroMsg.AppBrandNetworkUploadWorker";
                ((C90326y) C89909e.m112439d(cls, true)).mo121695c(appId3, str6, "POST", str7, j4, j5, i, 2, cVar14.mo124842b(), (String) null, C90719b.this.f260555c.f260574p);
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, 11, 1, false);
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, 13, System.currentTimeMillis() - C90719b.this.f260555c.f260580v, false);
                int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
                if (netType == -1) {
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1791, 7, 1, false);
                }
                Log.m105925i(str8, "cronet uploadFile fail ret:%d", Integer.valueOf(netType));
            } else {
                Log.m105920e("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetTaskCompleted uploadFile fail already callback");
            }
        }
    }

    public C90719b(C90721c cVar, C88654b bVar, C90721c.C90722a aVar) {
        this.f260555c = cVar;
        this.f260553a = bVar;
        this.f260554b = aVar;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        C90721c cVar = this.f260555c;
        Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "cronet file upload onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", Integer.valueOf(i), str, cVar.f260581w, cVar.f260583y);
        JSONObject e = C90309m.m113070e(CronetLogic.getHeaderList(responseHeader), 2);
        try {
            if (!Util.isNullOrNil(str)) {
                e.put("protocol", str);
            }
        } catch (JSONException e2) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkUploadWorker", e2, "JSONException: upload onCronetReceiveHeader put protocol error", new Object[0]);
        }
        ((C90302k.C90303a) this.f260555c.f260567f).mo124540d(e);
        return 0;
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
        if (C90309m.m113065A(this.f260555c.f260566e)) {
            C90721c cVar = this.f260555c;
            Log.m105929w("MicroMsg.AppBrandNetworkUploadWorker", "onCronetReceiveUploadProgress shouldStopTask taskid %s,CronetRequestId:%s", cVar.f260581w, cVar.f260583y);
            if (!this.f260555c.f260569h) {
                this.f260555c.f260569h = true;
                CronetLogic.cancelCronetTask(this.f260555c.f260583y);
                C90721c cVar2 = this.f260555c;
                ((C90302k.C90303a) cVar2.f260567f).mo124537a(cVar2.f260573o, cVar2.f260571j, "fail:network interrupted error", 600003);
            } else {
                Log.m105920e("MicroMsg.AppBrandNetworkUploadWorker", "onCronetReceiveUploadProgress already callback");
            }
            C88654b bVar = this.f260553a;
            if (bVar != null) {
                bVar.mo97819a();
                Log.m105924i("MicroMsg.AppBrandNetworkUploadWorker", "cronet onCronetReceiveUploadProgress shouldStopTask TimerTask cancel");
                return;
            }
            return;
        }
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i > 0 && this.f260555c.f260568g) {
            if (i > 0) {
                if (j > j2) {
                    this.f260554b.f260585a = 100;
                } else {
                    this.f260554b.f260585a = (int) ((100 * j) / j2);
                }
                C90721c.C90722a aVar = this.f260554b;
                int i2 = aVar.f260586b;
                int i3 = aVar.f260585a;
                if (i2 != i3) {
                    C90721c cVar3 = this.f260555c;
                    C90723d dVar = cVar3.f260567f;
                    ((C90302k.C90303a) dVar).mo124541e(cVar3.f260573o, cVar3.f260571j, i3, j, j2);
                    C90721c.C90722a aVar2 = this.f260554b;
                    aVar2.f260586b = aVar2.f260585a;
                }
            } else {
                C90721c cVar4 = this.f260555c;
                C90723d dVar2 = cVar4.f260567f;
                ((C90302k.C90303a) dVar2).mo124541e(cVar4.f260573o, cVar4.f260571j, this.f260554b.f260585a, j, 0);
            }
            if (this.f260554b.f260585a == 100) {
                Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "cronet upload size %d, totalSize %d, percent = %d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(this.f260554b.f260585a));
            }
        }
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        C90721c cVar = this.f260555c;
        Log.m105925i("MicroMsg.AppBrandNetworkUploadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s,fileKey:%s", Integer.valueOf(cronetTaskResult.errorCode), cronetTaskResult.errorMsg, Integer.valueOf(cronetTaskResult.statusCode), Long.valueOf(cronetTaskResult.totalReceiveByte), cVar.f260581w, cVar.f260583y, str);
        C88654b bVar = this.f260553a;
        if (bVar != null) {
            bVar.mo97819a();
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C90720a(cronetTaskResult));
    }

    public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
    }
}
