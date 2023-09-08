package sp0;

import android.text.TextUtils;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.utils.C84782s1;
import com.tencent.p014mm.plugin.appbrand.utils.C84787t1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import hr0.C87583a;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p224ra.C89909e;
import sp0.C90291h;
import sp0.C90299j;
import ul0.C90691a;

/* renamed from: sp0.f */
public class C90287f implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public final /* synthetic */ C90298i f259178a;

    /* renamed from: b */
    public final /* synthetic */ C90291h.C90294c f259179b;

    /* renamed from: c */
    public final /* synthetic */ long f259180c;

    /* renamed from: d */
    public final /* synthetic */ C90291h.C90296e f259181d;

    /* renamed from: e */
    public final /* synthetic */ C90291h f259182e;

    public C90287f(C90291h hVar, C90298i iVar, C90291h.C90294c cVar, long j, C90291h.C90296e eVar) {
        this.f259182e = hVar;
        this.f259178a = iVar;
        this.f259179b = cVar;
        this.f259180c = j;
        this.f259181d = eVar;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
        C90298i iVar = this.f259178a;
        Log.m105919d("MicroMsg.AppBrandNetworkRequest", "onCronetReceiveChunkedData length:%d,taskid is %s,cronettaskid is %s", Long.valueOf(j), iVar.f259225j, iVar.f259227l);
        if (chunkedData == null || chunkedData.data == null || j <= 0) {
            C90298i iVar2 = this.f259178a;
            Log.m105929w("MicroMsg.AppBrandNetworkRequest", "onCronetReceiveChunkedData invaild length length:%d,taskid is %s,cronettaskid is %s", Long.valueOf(j), iVar2.f259225j, iVar2.f259227l);
            return;
        }
        C90291h.m113028a(this.f259182e, this.f259178a);
        ByteBuffer e = C84782s1.m104464e(chunkedData.data);
        C90691a.C90692a aVar = (C90691a.C90692a) this.f259179b;
        C82381f fVar = (C82381f) aVar.f260519a.get();
        Log.m105919d("MicroMsg.BaseCreateRequestTask", "onChunkResult, data size: %d, requestTaskId %s, service:%s", Long.valueOf(j), aVar.f260521c, fVar);
        if (fVar != null) {
            AtomicInteger atomicInteger = C90299j.f259242b;
            C90291h a = C90299j.C90301b.f259244a.mo124533a(fVar.getAppId());
            if (a != null) {
                if (((ConcurrentSkipListSet) a.f259189b).contains(aVar.f260521c)) {
                    Log.m105919d("MicroMsg.BaseCreateRequestTask", "request abort %s", aVar.f260521c);
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("requestTaskId", aVar.f260521c);
            hashMap.put("state", "chunked");
            hashMap.put("data", e);
            C90691a.C90693b bVar = new C90691a.C90693b();
            C84782s1.C84784b d = C84782s1.m104463d(fVar.getJsRuntime(), hashMap, (C84782s1.C84783a) fVar.mo109671p(C84782s1.C84783a.class));
            if (d == C84782s1.C84784b.OK) {
                String jSONObject = new JSONObject(hashMap).toString();
                bVar.mo115161k(fVar);
                bVar.f242407f = jSONObject;
                bVar.mo115159i(C90691a.this.f260517h.mo122426a(aVar.f260521c));
            } else if (d == C84782s1.C84784b.FAIL_SIZE_EXCEED_LIMIT) {
                C84782s1.m104461b(fVar, C90691a.C90693b.NAME);
            }
        }
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        C90298i iVar = this.f259178a;
        Log.m105925i("MicroMsg.AppBrandNetworkRequest", "cronet file request onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", Integer.valueOf(i), str, iVar.f259225j, iVar.f259227l);
        JSONObject e = C90309m.m113070e(CronetLogic.getHeaderList(responseHeader), 2);
        try {
            if (!Util.isNullOrNil(str)) {
                e.put("protocol", str);
            }
        } catch (JSONException e2) {
            Log.printErrStackTrace("MicroMsg.AppBrandNetworkRequest", e2, "JSONException: request onCronetReceiveHeader put protocol error", new Object[0]);
        }
        ((C90691a.C90692a) this.f259179b).mo124829a(e, i);
        return 0;
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        CronetLogic.CronetTaskResult cronetTaskResult2 = cronetTaskResult;
        Class cls = C90326y.class;
        Class cls2 = C87583a.class;
        C90298i iVar = this.f259178a;
        Log.m105925i("MicroMsg.AppBrandNetworkRequest", "cronet onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s,fileKey:%s", Integer.valueOf(cronetTaskResult2.errorCode), cronetTaskResult2.errorMsg, Integer.valueOf(cronetTaskResult2.statusCode), Long.valueOf(cronetTaskResult2.totalReceiveByte), iVar.f259225j, iVar.f259227l, str);
        CronetLogic.WebPageProfile webPageProfile = cronetTaskResult2.webPageProfile;
        if (webPageProfile != null) {
            Log.m105925i("MicroMsg.AppBrandNetworkRequest", "cronet onCronetTaskCompleted profile, protocol:%s, ip:%s, port:%d", webPageProfile.protocol, webPageProfile.peerIP, Integer.valueOf(webPageProfile.port));
        } else {
            Log.m105924i("MicroMsg.AppBrandNetworkRequest", "cronet profile is empty");
        }
        C90291h.m113028a(this.f259182e, this.f259178a);
        if (cronetTaskResult2.errorCode == 0) {
            JSONObject e = C90309m.m113070e(cronetTaskResult.getHeaderMapList(), 2);
            int i = cronetTaskResult2.statusCode;
            if (i != 200) {
                Log.m105921e("MicroMsg.AppBrandNetworkRequest", "cronet failed code: %d,url is %s", Integer.valueOf(i), this.f259178a.f259218c);
                if (C90309m.m113089x(i)) {
                    String str3 = cronetTaskResult2.newLocation;
                    int i2 = this.f259178a.f259223h;
                    if (!TextUtils.isEmpty(str3)) {
                        if (i2 <= 0) {
                            Log.m105929w("MicroMsg.AppBrandNetworkRequest", "cronet reach the max redirect count(%d)", 15);
                            C90298i iVar2 = this.f259178a;
                            if (!iVar2.f259231p) {
                                iVar2.f259231p = true;
                                if (iVar2.f259235t) {
                                    this.f259182e.mo124510d(this.f259179b, "ok", "reach the max redirect count 15", i, e, iVar2.f259225j, (HttpURLConnection) null, C90309m.m113076k(cronetTaskResult2.webPageProfile), (Map) null);
                                } else {
                                    this.f259182e.mo124510d(this.f259179b, "ok", "reach the max redirect count 15", i, e, iVar2.f259225j, (HttpURLConnection) null, (Map) null, (Map) null);
                                }
                            } else {
                                Log.m105920e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted max redirect already callback");
                            }
                            ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1095, 1, 1, false);
                            return;
                        }
                        Log.m105925i("MicroMsg.AppBrandNetworkRequest", "cronet redirect(%d) URL(%s) to URL(%s)", Integer.valueOf(i2), this.f259178a.f259218c, str3);
                        C90298i iVar3 = this.f259178a;
                        iVar3.f259218c = str3;
                        int i3 = i2 - 1;
                        iVar3.f259223h = i3;
                        Log.m105925i("MicroMsg.AppBrandNetworkRequest", "cronet now redirect count = %d", Integer.valueOf(i3));
                        C90291h.m113029b(this.f259182e, this.f259178a);
                        return;
                    }
                }
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1095, 3, 1, false);
            }
            Object e2 = "arraybuffer".equals(this.f259178a.f259224i) ? C84782s1.m104464e(cronetTaskResult2.data) : C84787t1.m104466a(cronetTaskResult.getDataString());
            C90298i iVar4 = this.f259178a;
            if (!iVar4.f259231p) {
                iVar4.f259231p = true;
                HashMap hashMap = new HashMap();
                hashMap.put("beginCGITimestamp", Long.valueOf(this.f259180c));
                hashMap.put("CGICallbackTimestamp", Long.valueOf(System.currentTimeMillis()));
                C90298i iVar5 = this.f259178a;
                if (iVar5.f259235t) {
                    this.f259182e.mo124510d(this.f259179b, "ok", e2, cronetTaskResult2.statusCode, e, iVar5.f259225j, (HttpURLConnection) null, C90309m.m113076k(cronetTaskResult2.webPageProfile), hashMap);
                } else {
                    this.f259182e.mo124510d(this.f259179b, "ok", e2, cronetTaskResult2.statusCode, e, iVar5.f259225j, (HttpURLConnection) null, (Map) null, hashMap);
                }
            } else {
                Log.m105920e("MicroMsg.AppBrandNetworkRequest", "cronet onC2CDownloadCompleted if already callback");
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f259180c;
            Log.m105918d("cronet request time", "request time is " + currentTimeMillis);
            ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1098, 99, currentTimeMillis, false);
            ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1095, 8, 1, false);
            String str4 = this.f259182e.f259195h;
            C90298i iVar6 = this.f259178a;
            ((C90326y) C89909e.m112439d(cls, true)).mo121695c(str4, iVar6.f259229n, iVar6.f259219d, iVar6.f259218c, iVar6.mo124520d(), cronetTaskResult2.totalReceiveByte, i, 1, this.f259178a.mo124519c(), "", "");
        } else {
            C90298i iVar7 = this.f259178a;
            if (!iVar7.f259231p) {
                iVar7.f259231p = true;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("requestURL", this.f259178a.f259218c);
                this.f259182e.mo124509c(this.f259179b, "fail", cronetTaskResult2.errorCode + XVFSFile.PATH_SEPARATOR + cronetTaskResult2.errorMsg, this.f259178a.f259225j, (HttpURLConnection) null, 600001, hashMap2);
            } else {
                Log.m105920e("MicroMsg.AppBrandNetworkRequest", "onC2CDownloadCompleted else already callback");
            }
            String str5 = this.f259182e.f259195h;
            C90298i iVar8 = this.f259178a;
            ((C90326y) C89909e.m112439d(cls, true)).mo121695c(str5, iVar8.f259229n, iVar8.f259219d, iVar8.f259218c, iVar8.mo124520d(), 0, 0, 2, this.f259178a.mo124519c(), "", "");
            ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1095, 5, 1, false);
            int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
            if (netType == -1) {
                ((C87583a) C89909e.m112439d(cls2, true)).idkeyStat(1095, 4, 1, false);
            }
            Log.m105925i("MicroMsg.AppBrandNetworkRequest", "send https request fail ret:%d,url:%s", Integer.valueOf(netType), this.f259178a.f259218c);
        }
        ((ConcurrentSkipListSet) this.f259182e.f259189b).remove(this.f259178a.f259225j);
    }

    public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        int i;
        CronetLogic.CronetDownloadProgress cronetDownloadProgress2 = cronetDownloadProgress;
        C82381f fVar = this.f259182e.f259194g.get();
        if (fVar == null || C90309m.m113065A(fVar)) {
            C90298i iVar = this.f259178a;
            Log.m105925i("MicroMsg.AppBrandNetworkRequest", "onDownloadProgressChanged shouldStopTask fileKey:%s,taskid is %s,cronettaskid is %s", str, iVar.f259225j, iVar.f259227l);
            CronetLogic.cancelCronetTask(this.f259178a.f259227l);
            C90298i iVar2 = this.f259178a;
            if (!iVar2.f259231p) {
                iVar2.f259231p = true;
                this.f259182e.mo124509c(this.f259179b, "fail", "fail:network interrupted error", iVar2.f259225j, (HttpURLConnection) null, 600003, (Map) null);
            } else {
                Log.m105920e("MicroMsg.AppBrandNetworkRequest", "onDownloadProgressChanged already callback");
            }
            C90291h.m113028a(this.f259182e, this.f259178a);
            return;
        }
        C90298i iVar3 = this.f259178a;
        if (!iVar3.f259231p) {
            long j = cronetDownloadProgress2.totalByte;
            if (j > 0) {
                long j2 = cronetDownloadProgress2.currentWriteByte;
                if (j2 > j) {
                    this.f259181d.f259211a = 100;
                } else {
                    this.f259181d.f259211a = (int) ((100 * j2) / j);
                }
                C90291h.C90296e eVar = this.f259181d;
                int i2 = eVar.f259212b;
                int i3 = eVar.f259211a;
                if (i2 != i3) {
                    i = 100;
                    ((C90691a.C90692a) this.f259179b).mo124831c(iVar3.f259225j, iVar3.f259218c, i3, j2, j);
                    C90291h.C90296e eVar2 = this.f259181d;
                    eVar2.f259212b = eVar2.f259211a;
                } else {
                    i = 100;
                }
            } else {
                i = 100;
                long j3 = this.f259181d.f259213c;
                long j4 = cronetDownloadProgress2.currentWriteByte;
                if (j3 != j4) {
                    ((C90691a.C90692a) this.f259179b).mo124831c(iVar3.f259225j, iVar3.f259218c, 0, j4, 0);
                    this.f259181d.f259213c = cronetDownloadProgress2.currentWriteByte;
                }
            }
            if (this.f259181d.f259211a == i) {
                Log.m105925i("MicroMsg.AppBrandNetworkRequest", "cronet request size %d, totalSize %d, percent = %d", Long.valueOf(cronetDownloadProgress2.currentWriteByte), Long.valueOf(cronetDownloadProgress2.totalByte), Integer.valueOf(this.f259181d.f259211a));
            }
        }
    }
}
