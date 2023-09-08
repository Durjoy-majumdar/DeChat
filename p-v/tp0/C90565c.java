package tp0;

import android.text.TextUtils;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import hr0.C87583a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lu3.C88654b;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import sp0.C90309m;
import sp0.C90326y;
import tp0.C90567d;
import zt3.C119157j;

/* renamed from: tp0.c */
public class C90565c implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public final /* synthetic */ C88654b f260193a;

    /* renamed from: b */
    public final /* synthetic */ C90567d.C90568a f260194b;

    /* renamed from: c */
    public final /* synthetic */ long f260195c;

    /* renamed from: d */
    public final /* synthetic */ C90567d f260196d;

    /* renamed from: tp0.c$a */
    public class C90566a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CronetLogic.CronetTaskResult f260197d;

        public C90566a(CronetLogic.CronetTaskResult cronetTaskResult) {
            this.f260197d = cronetTaskResult;
        }

        public void run() {
            int i;
            String str;
            int i2;
            String str2;
            Class cls = C90326y.class;
            Class cls2 = C87583a.class;
            CronetLogic.CronetTaskResult cronetTaskResult = this.f260197d;
            int i3 = (int) cronetTaskResult.totalReceiveByte;
            int i4 = cronetTaskResult.statusCode;
            C90567d dVar = C90565c.this.f260196d;
            Log.m105925i("MicroMsg.AppBrandDownloadWorker", "appbrand_cronetdownload_callback_thread run taskid:%s,CronetRequestId:%s", dVar.f260220v, dVar.f260222x);
            String str3 = "";
            if (this.f260197d.errorCode == 0) {
                C90565c.this.f260196d.getClass();
                int i5 = (i4 < 100 || i4 >= 200) ? 200 == i4 ? 21 : (i4 <= 200 || i4 >= 300) ? 302 == i4 ? 23 : (i4 < 300 || i4 >= 400) ? 404 == i4 ? 25 : (i4 < 400 || i4 >= 500) ? i4 >= 500 ? 27 : 28 : 26 : 24 : 22 : 20;
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, (long) i5, 1, false);
                Log.m105925i("MicroMsg.AppBrandDownloadWorker", "reportCronetStatusCode:%d, key:%d", Integer.valueOf(i4), Integer.valueOf(i5));
                for (Map.Entry next : this.f260197d.getHeaderMap().entrySet()) {
                    String str4 = (String) next.getKey();
                    String str5 = (String) next.getValue();
                    if (str4.equalsIgnoreCase("Content-Type") || str4.equalsIgnoreCase("content-type")) {
                        C90567d dVar2 = C90565c.this.f260196d;
                        str3 = dVar2.mo124703e(str5, dVar2.f260210i);
                    }
                }
                if (i4 != 200) {
                    C90567d dVar3 = C90565c.this.f260196d;
                    Log.m105921e("MicroMsg.AppBrandDownloadWorker", "failed code: %d,url is %s,filename is %s ", Integer.valueOf(i4), dVar3.f260210i, dVar3.f260211j);
                    if (C90309m.m113089x(i4)) {
                        String str6 = this.f260197d.newLocation;
                        if (!TextUtils.isEmpty(str6)) {
                            C90567d dVar4 = C90565c.this.f260196d;
                            int i6 = dVar4.f260205d;
                            int i7 = i6 - 1;
                            dVar4.f260205d = i7;
                            if (i6 <= 0) {
                                Log.m105929w("MicroMsg.AppBrandDownloadWorker", "reach the max redirect count(%d)", 15);
                                if (!C90565c.this.f260196d.f260209h) {
                                    C90565c.this.f260196d.f260209h = true;
                                    C90567d dVar5 = C90565c.this.f260196d;
                                    if (dVar5.f260204F) {
                                        dVar5.f260207f.mo124492b(dVar5.f260211j, str3, dVar5.f260210i, i4, 0, C90309m.m113076k(this.f260197d.webPageProfile));
                                    } else {
                                        dVar5.f260207f.mo124492b(dVar5.f260211j, str3, dVar5.f260210i, i4, 0, (Map) null);
                                    }
                                    String appId = C90565c.this.f260196d.f260206e.getAppId();
                                    C90567d dVar6 = C90565c.this.f260196d;
                                    ((C90326y) C89909e.m112439d(cls, true)).mo121695c(appId, dVar6.f260224z, "GET", dVar6.f260210i, 0, (long) i3, i4, 1, dVar6.mo124701c(), C90565c.this.f260196d.f260211j, str3);
                                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, 10, 1, false);
                                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, 12, System.currentTimeMillis() - C90565c.this.f260196d.f260219u, false);
                                    return;
                                }
                                Log.m105920e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                                return;
                            }
                            Log.m105925i("MicroMsg.AppBrandDownloadWorker", "redirect(%d) URL(%s) to URL(%s)", Integer.valueOf(i7), C90565c.this.f260196d.f260210i, str6);
                            C90567d dVar7 = C90565c.this.f260196d;
                            dVar7.f260210i = str6;
                            dVar7.run();
                            return;
                        }
                    }
                }
                if (!C90565c.this.f260196d.f260209h) {
                    C90565c.this.f260196d.f260209h = true;
                    if (C90565c.this.f260196d.f260208g) {
                        C90567d dVar8 = C90565c.this.f260196d;
                        if (dVar8.f260204F) {
                            i2 = 4;
                            str2 = "MicroMsg.AppBrandDownloadWorker";
                            dVar8.f260207f.mo124492b(dVar8.f260211j, str3, dVar8.f260210i, i4, (long) i3, C90309m.m113076k(this.f260197d.webPageProfile));
                        } else {
                            str2 = "MicroMsg.AppBrandDownloadWorker";
                            i2 = 4;
                            dVar8.f260207f.mo124492b(dVar8.f260211j, str3, dVar8.f260210i, i4, (long) i3, (Map) null);
                        }
                        C90567d dVar9 = C90565c.this.f260196d;
                        long j = this.f260197d.totalReceiveByte;
                        long currentTimeMillis = System.currentTimeMillis() - C90565c.this.f260196d.f260219u;
                        dVar9.getClass();
                        if (j <= 0 || currentTimeMillis <= 0) {
                            i = i4;
                            str = str2;
                            Log.m105925i(str, "reportCronetSpeed len:%d, time:%d return", Long.valueOf(j), Long.valueOf(currentTimeMillis));
                        } else {
                            long j2 = j;
                            double d = (((double) j) / ((double) currentTimeMillis)) * 0.9765625d;
                            int i8 = NetStatusUtil.is2G(MMApplicationContext.getContext()) ? 30 : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? 31 : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? 32 : NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 33 : 34;
                            i = i4;
                            ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, (long) i8, (long) d, false);
                            Object[] objArr = new Object[i2];
                            objArr[0] = Long.valueOf(j2);
                            objArr[1] = Long.valueOf(currentTimeMillis);
                            objArr[2] = Double.valueOf(d);
                            objArr[3] = Integer.valueOf(i8);
                            str = str2;
                            Log.m105925i(str, "reportCronetSpeed len:%d, time:%d, speed:%f, key:%d", objArr);
                        }
                        C90565c.this.f260194b.getClass();
                    } else {
                        i = i4;
                        i2 = 4;
                        str = "MicroMsg.AppBrandDownloadWorker";
                        C90567d dVar10 = C90565c.this.f260196d;
                        dVar10.f260207f.mo124494d(dVar10.f260211j, dVar10.f260210i, "force stop", 600004);
                    }
                    Object[] objArr2 = new Object[5];
                    C90567d dVar11 = C90565c.this.f260196d;
                    objArr2[0] = dVar11.f260220v;
                    objArr2[1] = dVar11.f260222x;
                    objArr2[2] = str3;
                    objArr2[3] = dVar11.f260211j;
                    objArr2[i2] = dVar11.f260210i;
                    Log.m105925i(str, "cronet download file finished taskid:%s,CronetRequestId:%s,contentType:%s,filename: %s, url:%s ", objArr2);
                    C90567d dVar12 = C90565c.this.f260196d;
                    dVar12.f260207f.mo124495e(dVar12.f260220v);
                    String appId2 = C90565c.this.f260196d.f260206e.getAppId();
                    C90567d dVar13 = C90565c.this.f260196d;
                    ((C90326y) C89909e.m112439d(cls, true)).mo121695c(appId2, dVar13.f260224z, "GET", dVar13.f260210i, 0, (long) i3, i, 1, dVar13.mo124701c(), C90565c.this.f260196d.f260211j, str3);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, 10, 1, false);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, 12, System.currentTimeMillis() - C90565c.this.f260196d.f260219u, false);
                    long currentTimeMillis2 = System.currentTimeMillis() - C90565c.this.f260195c;
                    Log.m105924i("cronet download time", "request time is " + currentTimeMillis2);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1199, 99, currentTimeMillis2, false);
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1199, 97, 1, false);
                    return;
                }
                Log.m105920e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetTaskCompleted already callback");
                return;
            }
            int i9 = i4;
            String str7 = "MicroMsg.AppBrandDownloadWorker";
            if (!C90565c.this.f260196d.f260209h) {
                C90565c.this.f260196d.f260209h = true;
                C90567d dVar14 = C90565c.this.f260196d;
                dVar14.f260207f.mo124494d(dVar14.f260211j, dVar14.f260210i, "download fail:" + this.f260197d.errorCode + XVFSFile.PATH_SEPARATOR + this.f260197d.errorMsg, 600001);
                String appId3 = C90565c.this.f260196d.f260206e.getAppId();
                C90567d dVar15 = C90565c.this.f260196d;
                String str8 = str7;
                ((C90326y) C89909e.m112439d(cls, true)).mo121695c(appId3, dVar15.f260224z, "GET", dVar15.f260210i, 0, (long) i3, i9, 2, dVar15.mo124701c(), C90565c.this.f260196d.f260211j, str3);
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, 11, 1, false);
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, 13, System.currentTimeMillis() - C90565c.this.f260196d.f260219u, false);
                int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
                if (netType == -1) {
                    ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1197, 7, 1, false);
                }
                Log.m105925i(str8, "cronet downloadFile fail ret:%d", Integer.valueOf(netType));
                return;
            }
            Log.m105920e(str7, "cronet onCronetTaskCompleted downloadFile fail already callback");
        }
    }

    public C90565c(C90567d dVar, C88654b bVar, C90567d.C90568a aVar, long j) {
        this.f260196d = dVar;
        this.f260193a = bVar;
        this.f260194b = aVar;
        this.f260195c = j;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        long j;
        String str2 = str;
        C90567d dVar = this.f260196d;
        Log.m105925i("MicroMsg.AppBrandDownloadWorker", "cronet file download onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", Integer.valueOf(i), str2, dVar.f260220v, dVar.f260222x);
        Map<String, List<String>> headerList = CronetLogic.getHeaderList(responseHeader);
        JSONObject e = C90309m.m113070e(headerList, 2);
        try {
            if (!Util.isNullOrNil(str)) {
                e.put("protocol", str2);
            }
        } catch (JSONException e2) {
            Log.printErrStackTrace("MicroMsg.AppBrandDownloadWorker", e2, "JSONException: download onCronetReceiveHeader put protocol error", new Object[0]);
        }
        this.f260196d.f260207f.mo124491a(e);
        Iterator<Map.Entry<String, List<String>>> it = headerList.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                j = 0;
                break;
            }
            Map.Entry next = it.next();
            String str3 = (String) next.getKey();
            List list = (List) next.getValue();
            if (!Util.isNullOrNil(str3) && list != null && !list.isEmpty()) {
                if (str3.equals("Content-Length")) {
                    Log.m105925i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader Content-Length:%s", list.get(0));
                    j = Long.parseLong((String) list.get(0));
                    break;
                } else if (str3.equals("content-length")) {
                    Log.m105925i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader content-length:%s", list.get(0));
                    j = Long.parseLong((String) list.get(0));
                    break;
                }
            }
        }
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i2 > 0) {
            ((C87583a) C89909e.m112439d(C87583a.class, true)).idkeyStat(1197, 16, j, false);
        } else {
            Log.m105920e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader contentLength fail");
        }
        if (i2 <= 0 || this.f260196d.f260218t <= 0 || j <= this.f260196d.f260218t) {
            return 0;
        }
        Log.m105925i("MicroMsg.AppBrandDownloadWorker", "onCronetReceiveHeader before actually read stream, contentLength %d exceed limit", Long.valueOf(j));
        if (!this.f260196d.f260209h) {
            this.f260196d.f260209h = true;
            CronetLogic.cancelCronetTask(this.f260196d.f260222x);
            C90567d dVar2 = this.f260196d;
            dVar2.f260207f.mo124494d(dVar2.f260211j, dVar2.f260210i, "fail:exceed max file size", 603301);
        } else {
            Log.m105920e("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader max file size already callback");
        }
        C88654b bVar = this.f260193a;
        if (bVar == null) {
            return -1;
        }
        bVar.mo97819a();
        Log.m105924i("MicroMsg.AppBrandDownloadWorker", "cronet onCronetReceiveHeader exceed max file size TimerTask cancel");
        return -1;
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        C90567d dVar = this.f260196d;
        Log.m105925i("MicroMsg.AppBrandDownloadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s,fileKey:%s", Integer.valueOf(cronetTaskResult.errorCode), cronetTaskResult.errorMsg, Integer.valueOf(cronetTaskResult.statusCode), Long.valueOf(cronetTaskResult.totalReceiveByte), dVar.f260220v, dVar.f260222x, str);
        C88654b bVar = this.f260193a;
        if (bVar != null) {
            bVar.mo97819a();
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C90566a(cronetTaskResult));
    }

    public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        CronetLogic.CronetDownloadProgress cronetDownloadProgress2 = cronetDownloadProgress;
        if (C90309m.m113065A(this.f260196d.f260206e)) {
            C90567d dVar = this.f260196d;
            Log.m105929w("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged shouldStopTask fileKey:%s,taskid %s,CronetRequestId:%s", str, dVar.f260220v, dVar.f260222x);
            if (!this.f260196d.f260209h) {
                this.f260196d.f260209h = true;
                CronetLogic.cancelCronetTask(this.f260196d.f260222x);
                C90567d dVar2 = this.f260196d;
                dVar2.f260207f.mo124494d(dVar2.f260211j, dVar2.f260210i, "fail:network interrupted error", 600003);
            } else {
                Log.m105920e("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged already callback");
            }
            C88654b bVar = this.f260193a;
            if (bVar != null) {
                bVar.mo97819a();
                Log.m105924i("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged shouldStopTask TimerTask cancel");
            }
        } else if (cronetDownloadProgress2.currentWriteByte <= 0 || this.f260196d.f260218t <= 0 || (cronetDownloadProgress2.currentWriteByte <= this.f260196d.f260218t && cronetDownloadProgress2.totalByte <= this.f260196d.f260218t)) {
            if (cronetDownloadProgress2.totalByte > 0 && this.f260196d.f260208g) {
                long j = cronetDownloadProgress2.totalByte;
                if (j > 0) {
                    long j2 = cronetDownloadProgress2.currentWriteByte;
                    if (j2 > j) {
                        this.f260194b.f260225a = 100;
                    } else {
                        this.f260194b.f260225a = (int) ((100 * j2) / j);
                    }
                    C90567d.C90568a aVar = this.f260194b;
                    int i = aVar.f260226b;
                    int i2 = aVar.f260225a;
                    if (i != i2) {
                        C90567d dVar3 = this.f260196d;
                        dVar3.f260207f.mo124496f(dVar3.f260211j, dVar3.f260210i, i2, j2, j);
                        C90567d.C90568a aVar2 = this.f260194b;
                        aVar2.f260226b = aVar2.f260225a;
                    }
                } else {
                    C90567d dVar4 = this.f260196d;
                    dVar4.f260207f.mo124496f(dVar4.f260211j, dVar4.f260210i, this.f260194b.f260225a, cronetDownloadProgress2.currentWriteByte, 0);
                }
                if (this.f260194b.f260225a == 100) {
                    Log.m105925i("MicroMsg.AppBrandDownloadWorker", "cronet download size %d, totalSize %d, percent = %d", Long.valueOf(cronetDownloadProgress2.currentWriteByte), Long.valueOf(cronetDownloadProgress2.totalByte), Integer.valueOf(this.f260194b.f260225a));
                }
            }
        } else if (!this.f260196d.f260209h) {
            C90567d dVar5 = this.f260196d;
            Log.m105925i("MicroMsg.AppBrandDownloadWorker", "onDownloadProgressChanged currentWriteByte %d or progress.totalByte %d exceed limit,fileKey:%s,taskid %s,CronetRequestId:%s", Long.valueOf(cronetDownloadProgress2.currentWriteByte), Long.valueOf(cronetDownloadProgress2.totalByte), str, dVar5.f260220v, dVar5.f260222x);
            this.f260196d.f260209h = true;
            CronetLogic.cancelCronetTask(this.f260196d.f260222x);
            C90567d dVar6 = this.f260196d;
            dVar6.f260207f.mo124494d(dVar6.f260211j, dVar6.f260210i, "fail:exceed max file size", 603301);
            C88654b bVar2 = this.f260193a;
            if (bVar2 != null) {
                bVar2.mo97819a();
                Log.m105924i("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged exceed max file size TimerTask cancel");
            }
        } else {
            Log.m105920e("MicroMsg.AppBrandDownloadWorker", "cronet onDownloadProgressChanged max file size already callback");
        }
    }
}
