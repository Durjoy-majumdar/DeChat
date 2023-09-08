package h52;

import android.text.TextUtils;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import g52.C87160b;
import h52.C87443g;
import j52.C87881g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lu3.C88654b;
import org.json.JSONException;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: h52.f */
public class C87441f implements CronetLogic.CronetTaskCallback {

    /* renamed from: a */
    public final /* synthetic */ C88654b f253361a;

    /* renamed from: b */
    public final /* synthetic */ C87443g.C87444a f253362b;

    /* renamed from: c */
    public final /* synthetic */ C87443g f253363c;

    /* renamed from: h52.f$a */
    public class C87442a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CronetLogic.CronetTaskResult f253364d;

        public C87442a(CronetLogic.CronetTaskResult cronetTaskResult) {
            this.f253364d = cronetTaskResult;
        }

        public void run() {
            char c;
            String str;
            String str2;
            String str3;
            Class cls = IMagicBrushMonitor.class;
            CronetLogic.CronetTaskResult cronetTaskResult = this.f253364d;
            int i = (int) cronetTaskResult.totalReceiveByte;
            int i2 = cronetTaskResult.statusCode;
            C87443g gVar = C87441f.this.f253363c;
            Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "magicbrush_cronetdownload_callback_thread run taskid:%s,CronetRequestId:%s", gVar.f253381t, gVar.f253382u);
            CronetLogic.CronetTaskResult cronetTaskResult2 = this.f253364d;
            String str4 = "";
            if (cronetTaskResult2.errorCode == 0) {
                for (Map.Entry next : cronetTaskResult2.getHeaderMap().entrySet()) {
                    String str5 = (String) next.getKey();
                    String str6 = (String) next.getValue();
                    if (str5.equalsIgnoreCase("Content-Type") || str5.equalsIgnoreCase("content-type")) {
                        String str7 = C87441f.this.f253363c.f253374j;
                        MimeTypeUtil.ContentType obtain = MimeTypeUtil.ContentType.obtain(str6);
                        if (obtain == null) {
                            str3 = MimeTypeUtil.getMimeTypeByFilePath(str7);
                        } else if (obtain.mimeType.contains("application/octet-stream")) {
                            str4 = MimeTypeUtil.getMimeTypeByFilePath(str7);
                            if (Util.isNullOrNil(str4)) {
                                str3 = obtain.mimeType;
                            }
                        } else {
                            str3 = obtain.mimeType;
                        }
                        str4 = str3;
                    }
                }
                if (i2 != 200) {
                    C87443g gVar2 = C87441f.this.f253363c;
                    Log.m105921e("MicroMsg.MagicBrushDownloadWorker", "failed code: %d,url is %s,filename is %s ", Integer.valueOf(i2), gVar2.f253374j, gVar2.f253375n);
                    if (i2 == 301 || i2 == 302 || i2 == 307) {
                        String str8 = this.f253364d.newLocation;
                        if (!TextUtils.isEmpty(str8)) {
                            C87443g gVar3 = C87441f.this.f253363c;
                            int i3 = gVar3.f253368d;
                            int i4 = i3 - 1;
                            gVar3.f253368d = i4;
                            if (i3 <= 0) {
                                Log.m105929w("MicroMsg.MagicBrushDownloadWorker", "reach the max redirect count(%d)", 15);
                                if (!C87441f.this.f253363c.f253372h) {
                                    C87441f.this.f253363c.f253372h = true;
                                    C87443g gVar4 = C87441f.this.f253363c;
                                    if (gVar4.f253367B) {
                                        gVar4.f253370f.mo121896b(gVar4.f253375n, str4, gVar4.f253374j, i2, 0, C87160b.m108191a(this.f253364d.webPageProfile));
                                    } else {
                                        gVar4.f253370f.mo121896b(gVar4.f253375n, str4, gVar4.f253374j, i2, 0, (Map) null);
                                    }
                                    C87443g gVar5 = C87441f.this.f253363c;
                                    C87881g.m109359a(gVar5.f253373i, gVar5.f253384w, "GET", gVar5.f253374j, 0, (long) i, i2, 1, (int) (System.currentTimeMillis() - gVar5.f253383v), C87441f.this.f253363c.f253375n, str4);
                                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSuccess.name(), 1, (String) null);
                                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSuccessCost.name(), (int) (System.currentTimeMillis() - C87441f.this.f253363c.f253380s), (String) null);
                                    return;
                                }
                                Log.m105920e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted max redirect already callback");
                                return;
                            }
                            Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "redirect(%d) URL(%s) to URL(%s)", Integer.valueOf(i4), C87441f.this.f253363c.f253374j, str8);
                            C87443g gVar6 = C87441f.this.f253363c;
                            gVar6.f253374j = str8;
                            gVar6.run();
                            return;
                        }
                    }
                }
                if (!C87441f.this.f253363c.f253372h) {
                    C87441f.this.f253363c.f253372h = true;
                    if (C87441f.this.f253363c.f253371g) {
                        C87443g gVar7 = C87441f.this.f253363c;
                        if (gVar7.f253367B) {
                            c = 3;
                            str2 = "MicroMsg.MagicBrushDownloadWorker";
                            gVar7.f253370f.mo121896b(gVar7.f253375n, str4, gVar7.f253374j, i2, (long) i, C87160b.m108191a(this.f253364d.webPageProfile));
                        } else {
                            str2 = "MicroMsg.MagicBrushDownloadWorker";
                            c = 3;
                            gVar7.f253370f.mo121896b(gVar7.f253375n, str4, gVar7.f253374j, i2, (long) i, (Map) null);
                        }
                        C87443g gVar8 = C87441f.this.f253363c;
                        long j = this.f253364d.totalReceiveByte;
                        long currentTimeMillis = System.currentTimeMillis() - C87441f.this.f253363c.f253380s;
                        gVar8.getClass();
                        if (j <= 0 || currentTimeMillis <= 0) {
                            str = str2;
                            Log.m105925i(str, "reportCronetSpeed len:%d, time:%d return", Long.valueOf(j), Long.valueOf(currentTimeMillis));
                        } else {
                            String name = IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSpeedOtherNet.name();
                            double d = (((double) j) / ((double) currentTimeMillis)) * 0.9765625d;
                            if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
                                name = IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSpeed2G.name();
                            } else if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
                                name = IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSpeed3G.name();
                            } else if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                                name = IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSpeed4G.name();
                            } else if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                                name = IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSpeedWIFI.name();
                            }
                            ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(name, 1, (String) null);
                            Object[] objArr = new Object[4];
                            objArr[0] = Long.valueOf(j);
                            objArr[1] = Long.valueOf(currentTimeMillis);
                            objArr[2] = Double.valueOf(d);
                            objArr[c] = name;
                            str = str2;
                            Log.m105925i(str, "reportCronetSpeed len:%d, time:%d, speed:%f, key:%s", objArr);
                        }
                        C87441f.this.f253362b.getClass();
                    } else {
                        str = "MicroMsg.MagicBrushDownloadWorker";
                        c = 3;
                        C87443g gVar9 = C87441f.this.f253363c;
                        gVar9.f253370f.mo121898d(gVar9.f253375n, gVar9.f253374j, "force stop", 300004);
                    }
                    Object[] objArr2 = new Object[5];
                    C87443g gVar10 = C87441f.this.f253363c;
                    objArr2[0] = gVar10.f253381t;
                    objArr2[1] = gVar10.f253382u;
                    objArr2[2] = str4;
                    objArr2[c] = gVar10.f253375n;
                    objArr2[4] = gVar10.f253374j;
                    Log.m105925i(str, "cronet download file finished taskid:%s,CronetRequestId:%s,contentType:%s,filename: %s, url:%s ", objArr2);
                    C87443g gVar11 = C87441f.this.f253363c;
                    gVar11.f253370f.mo121899e(gVar11.f253381t);
                    C87443g gVar12 = C87441f.this.f253363c;
                    C87881g.m109359a(gVar12.f253373i, gVar12.f253384w, "GET", gVar12.f253374j, 0, (long) i, i2, 1, (int) (System.currentTimeMillis() - gVar12.f253383v), C87441f.this.f253363c.f253375n, str4);
                    int currentTimeMillis2 = (int) (System.currentTimeMillis() - C87441f.this.f253363c.f253380s);
                    Log.m105924i(str, "success request time is " + currentTimeMillis2);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSuccess.name(), 1, (String) null);
                    ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskSuccessCost.name(), currentTimeMillis2, (String) null);
                    return;
                }
                Log.m105920e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetTaskCompleted already callback");
                return;
            }
            String str9 = "MicroMsg.MagicBrushDownloadWorker";
            if (!C87441f.this.f253363c.f253372h) {
                C87441f.this.f253363c.f253372h = true;
                C87443g gVar13 = C87441f.this.f253363c;
                gVar13.f253370f.mo121898d(gVar13.f253375n, gVar13.f253374j, "download fail:" + this.f253364d.errorCode + XVFSFile.PATH_SEPARATOR + this.f253364d.errorMsg, 300002);
                C87443g gVar14 = C87441f.this.f253363c;
                C87881g.m109359a(gVar14.f253373i, gVar14.f253384w, "GET", gVar14.f253374j, 0, (long) i, i2, 2, (int) (System.currentTimeMillis() - gVar14.f253383v), C87441f.this.f253363c.f253375n, str4);
                int currentTimeMillis3 = (int) (System.currentTimeMillis() - C87441f.this.f253363c.f253380s);
                Log.m105924i(str9, "fail request time is " + currentTimeMillis3);
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskFail.name(), 1, (String) null);
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskFailCost.name(), currentTimeMillis3, (String) null);
                return;
            }
            Log.m105920e(str9, "cronet onCronetTaskCompleted downloadFile fail already callback");
        }
    }

    public C87441f(C87443g gVar, C88654b bVar, C87443g.C87444a aVar) {
        this.f253363c = gVar;
        this.f253361a = bVar;
        this.f253362b = aVar;
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        long j;
        C87443g gVar = this.f253363c;
        Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "cronet file download onCronetReceiveHeader status %d,protocol %s,taskid:%s,CronetRequestId:%s", Integer.valueOf(i), str, gVar.f253381t, gVar.f253382u);
        Map<String, List<String>> headerList = CronetLogic.getHeaderList(responseHeader);
        JSONObject jSONObject = new JSONObject();
        if (headerList != null) {
            for (Map.Entry next : headerList.entrySet()) {
                String str2 = (String) next.getKey();
                List list = (List) next.getValue();
                if (!Util.isNullOrNil(str2) && list != null && !list.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) list.get(0));
                    for (int i2 = 1; i2 < list.size(); i2++) {
                        sb.append(",");
                        sb.append((String) list.get(i2));
                    }
                    try {
                        jSONObject.put(str2, sb.toString());
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.MagicBrushNetworkUtil", e, "JSONException: getHeaderJsonObject put header error", new Object[0]);
                    }
                }
            }
        }
        try {
            if (!Util.isNullOrNil(str)) {
                jSONObject.put("protocol", str);
            }
        } catch (JSONException e2) {
            Log.printErrStackTrace("MicroMsg.MagicBrushDownloadWorker", e2, "JSONException: download onCronetReceiveHeader put protocol error", new Object[0]);
        }
        this.f253363c.f253370f.mo121901g(jSONObject, i);
        Iterator<Map.Entry<String, List<String>>> it = headerList.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                j = 0;
                break;
            }
            Map.Entry next2 = it.next();
            String str3 = (String) next2.getKey();
            List list2 = (List) next2.getValue();
            if (!Util.isNullOrNil(str3) && list2 != null && !list2.isEmpty()) {
                if (str3.equals("Content-Length")) {
                    Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader Content-Length:%s", list2.get(0));
                    j = Long.parseLong((String) list2.get(0));
                    break;
                } else if (str3.equals("content-length")) {
                    Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader content-length:%s", list2.get(0));
                    j = Long.parseLong((String) list2.get(0));
                    break;
                }
            }
        }
        Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader contentLength:%d", Long.valueOf(j));
        if (j <= 0 || this.f253363c.f253379r <= 0 || j <= this.f253363c.f253379r) {
            return 0;
        }
        Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "onCronetReceiveHeader before actually read stream, contentLength %d exceed limit", Long.valueOf(j));
        if (!this.f253363c.f253372h) {
            this.f253363c.f253372h = true;
            CronetLogic.cancelCronetTask(this.f253363c.f253382u);
            C87443g gVar2 = this.f253363c;
            gVar2.f253370f.mo121898d(gVar2.f253375n, gVar2.f253374j, "fail:exceed max file size", 303301);
        } else {
            Log.m105920e("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader max file size already callback");
        }
        C88654b bVar = this.f253361a;
        if (bVar == null) {
            return -1;
        }
        bVar.mo97819a();
        Log.m105924i("MicroMsg.MagicBrushDownloadWorker", "cronet onCronetReceiveHeader exceed max file size TimerTask cancel");
        return -1;
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        C87443g gVar = this.f253363c;
        Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "onCronetTaskCompleted errorCode:%d,errorMsg:%s,statusCode:%d,totalReceiveByte:%d,taskid:%s,CronetRequestId:%s,fileKey:%s", Integer.valueOf(cronetTaskResult.errorCode), cronetTaskResult.errorMsg, Integer.valueOf(cronetTaskResult.statusCode), Long.valueOf(cronetTaskResult.totalReceiveByte), gVar.f253381t, gVar.f253382u, str);
        C88654b bVar = this.f253361a;
        if (bVar != null) {
            bVar.mo97819a();
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C87442a(cronetTaskResult));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.mo8723g0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDownloadProgressChanged(java.lang.String r21, com.tencent.mars.cdn.CronetLogic.CronetDownloadProgress r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            h52.g r2 = r0.f253363c
            e42.n r2 = r2.f253369e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001b
            int r2 = r2.mo8723g0()
            r5 = 8
            if (r2 == r5) goto L_0x0019
            r5 = 16
            if (r2 == r5) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            r5 = 2
            r6 = 3
            java.lang.String r7 = "MicroMsg.MagicBrushDownloadWorker"
            if (r2 == 0) goto L_0x0069
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r3] = r21
            h52.g r2 = r0.f253363c
            java.lang.String r3 = r2.f253381t
            r1[r4] = r3
            java.lang.String r2 = r2.f253382u
            r1[r5] = r2
            java.lang.String r2 = "onDownloadProgressChanged shouldStopTask fileKey:%s,taskid %s,CronetRequestId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r7, r2, r1)
            h52.g r1 = r0.f253363c
            boolean r1 = r1.f253372h
            if (r1 != 0) goto L_0x0057
            h52.g r1 = r0.f253363c
            r1.f253372h = r4
            h52.g r1 = r0.f253363c
            java.lang.String r1 = r1.f253382u
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(r1)
            h52.g r1 = r0.f253363c
            h52.d r2 = r1.f253370f
            java.lang.String r3 = r1.f253375n
            java.lang.String r1 = r1.f253374j
            r4 = 300003(0x493e3, float:4.20394E-40)
            java.lang.String r5 = "fail:network interrupted error"
            r2.mo121898d(r3, r1, r5, r4)
            goto L_0x005c
        L_0x0057:
            java.lang.String r1 = "onDownloadProgressChanged already callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
        L_0x005c:
            lu3.b r1 = r0.f253361a
            if (r1 == 0) goto L_0x0068
            r1.mo97819a()
            java.lang.String r1 = "cronet onDownloadProgressChanged shouldStopTask TimerTask cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x0068:
            return
        L_0x0069:
            long r8 = r1.currentWriteByte
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e6
            h52.g r2 = r0.f253363c
            long r8 = r2.f253379r
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e6
            long r8 = r1.currentWriteByte
            h52.g r2 = r0.f253363c
            long r12 = r2.f253379r
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 > 0) goto L_0x008d
            long r8 = r1.totalByte
            h52.g r2 = r0.f253363c
            long r12 = r2.f253379r
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e6
        L_0x008d:
            h52.g r2 = r0.f253363c
            boolean r2 = r2.f253372h
            if (r2 != 0) goto L_0x00e0
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r8 = r1.currentWriteByte
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r2[r3] = r8
            long r8 = r1.totalByte
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r2[r4] = r1
            r2[r5] = r21
            h52.g r1 = r0.f253363c
            java.lang.String r3 = r1.f253381t
            r2[r6] = r3
            r3 = 4
            java.lang.String r1 = r1.f253382u
            r2[r3] = r1
            java.lang.String r1 = "onDownloadProgressChanged currentWriteByte %d or progress.totalByte %d exceed limit,fileKey:%s,taskid %s,CronetRequestId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r2)
            h52.g r1 = r0.f253363c
            r1.f253372h = r4
            h52.g r1 = r0.f253363c
            java.lang.String r1 = r1.f253382u
            com.tencent.mars.cdn.CronetLogic.cancelCronetTask(r1)
            h52.g r1 = r0.f253363c
            h52.d r2 = r1.f253370f
            java.lang.String r3 = r1.f253375n
            java.lang.String r1 = r1.f253374j
            r4 = 303301(0x4a0c5, float:4.25015E-40)
            java.lang.String r5 = "fail:exceed max file size"
            r2.mo121898d(r3, r1, r5, r4)
            lu3.b r1 = r0.f253361a
            if (r1 == 0) goto L_0x00df
            r1.mo97819a()
            java.lang.String r1 = "cronet onDownloadProgressChanged exceed max file size TimerTask cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x00df:
            return
        L_0x00e0:
            java.lang.String r1 = "cronet onDownloadProgressChanged max file size already callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            return
        L_0x00e6:
            long r8 = r1.totalByte
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x016d
            h52.g r2 = r0.f253363c
            boolean r2 = r2.f253371g
            if (r2 == 0) goto L_0x016d
            long r8 = r1.totalByte
            r2 = 100
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0133
            long r10 = r1.currentWriteByte
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0105
            h52.g$a r12 = r0.f253362b
            r12.f253388a = r2
            goto L_0x010f
        L_0x0105:
            h52.g$a r12 = r0.f253362b
            r13 = 100
            long r13 = r13 * r10
            long r13 = r13 / r8
            int r14 = (int) r13
            r12.f253388a = r14
        L_0x010f:
            h52.g$a r12 = r0.f253362b
            int r13 = r12.f253389b
            int r15 = r12.f253388a
            if (r13 == r15) goto L_0x0146
            h52.g r12 = r0.f253363c
            h52.d r13 = r12.f253370f
            java.lang.String r14 = r12.f253375n
            java.lang.String r12 = r12.f253374j
            r16 = r12
            r12 = r13
            r13 = r14
            r14 = r16
            r16 = r10
            r18 = r8
            r12.mo121900f(r13, r14, r15, r16, r18)
            h52.g$a r8 = r0.f253362b
            int r9 = r8.f253388a
            r8.f253389b = r9
            goto L_0x0146
        L_0x0133:
            h52.g r8 = r0.f253363c
            h52.d r9 = r8.f253370f
            java.lang.String r10 = r8.f253375n
            java.lang.String r11 = r8.f253374j
            h52.g$a r8 = r0.f253362b
            int r12 = r8.f253388a
            long r13 = r1.currentWriteByte
            r15 = 0
            r9.mo121900f(r10, r11, r12, r13, r15)
        L_0x0146:
            h52.g$a r8 = r0.f253362b
            int r8 = r8.f253388a
            if (r8 != r2) goto L_0x016d
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r8 = r1.currentWriteByte
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r2[r3] = r6
            long r8 = r1.totalByte
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r2[r4] = r1
            h52.g$a r1 = r0.f253362b
            int r1 = r1.f253388a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r5] = r1
            java.lang.String r1 = "cronet download size %d, totalSize %d, percent = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r2)
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h52.C87441f.onDownloadProgressChanged(java.lang.String, com.tencent.mars.cdn.CronetLogic$CronetDownloadProgress):void");
    }
}
