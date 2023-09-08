package h52;

import android.webkit.URLUtil;
import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import d42.C86185m;
import di3.C86312j;
import e42.C7597n;
import j52.C87881g;
import java.util.Map;
import zt3.C119157j;

/* renamed from: h52.g */
public class C87443g implements Runnable, C86185m {

    /* renamed from: A */
    public boolean f253366A = false;

    /* renamed from: B */
    public boolean f253367B = true;

    /* renamed from: d */
    public int f253368d = 15;

    /* renamed from: e */
    public C7597n f253369e;

    /* renamed from: f */
    public final C87439d f253370f;

    /* renamed from: g */
    public volatile boolean f253371g = false;

    /* renamed from: h */
    public volatile boolean f253372h = false;

    /* renamed from: i */
    public String f253373i;

    /* renamed from: j */
    public String f253374j;

    /* renamed from: n */
    public String f253375n;

    /* renamed from: o */
    public String f253376o;

    /* renamed from: p */
    public Map<String, String> f253377p;

    /* renamed from: q */
    public int f253378q = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;

    /* renamed from: r */
    public volatile long f253379r;

    /* renamed from: s */
    public long f253380s;

    /* renamed from: t */
    public String f253381t;

    /* renamed from: u */
    public String f253382u;

    /* renamed from: v */
    public long f253383v;

    /* renamed from: w */
    public String f253384w;

    /* renamed from: x */
    public final String f253385x;

    /* renamed from: y */
    public boolean f253386y = false;

    /* renamed from: z */
    public boolean f253387z = false;

    /* renamed from: h52.g$a */
    public class C87444a {

        /* renamed from: a */
        public int f253388a = 0;

        /* renamed from: b */
        public int f253389b = -1;

        public C87444a(C87443g gVar) {
        }
    }

    public C87443g(C7597n nVar, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, C87439d dVar) {
        this.f253369e = nVar;
        this.f253373i = str;
        this.f253374j = str2;
        this.f253375n = str3;
        this.f253376o = str4;
        this.f253370f = dVar;
        this.f253383v = System.currentTimeMillis();
        this.f253385x = str5;
        this.f253386y = z;
        this.f253387z = z2;
        this.f253366A = z3;
        this.f253367B = z4;
    }

    /* renamed from: a */
    public void mo120593a() {
        this.f253371g = false;
        if (!Util.isNullOrNil(this.f253382u)) {
            CronetLogic.cancelCronetTask(this.f253382u);
        }
    }

    public String getTaskId() {
        return this.f253381t;
    }

    public void run() {
        if (URLUtil.isHttpsUrl(this.f253374j) || URLUtil.isHttpUrl(this.f253374j)) {
            C87444a aVar = new C87444a(this);
            if (!this.f253371g) {
                this.f253370f.mo121898d(this.f253375n, this.f253374j, "force stop", 300004);
                if (Util.isNullOrNil(this.f253376o)) {
                    C87881g.m109359a(this.f253373i, this.f253384w, "GET", this.f253374j, 0, 0, 0, 2, (int) (System.currentTimeMillis() - this.f253383v), this.f253375n, "unknow");
                    return;
                }
                C87881g.m109359a(this.f253373i, this.f253384w, "GET", this.f253374j, 0, 0, 0, 2, (int) (System.currentTimeMillis() - this.f253383v), this.f253376o, "unknow");
                return;
            }
            this.f253380s = System.currentTimeMillis();
            this.f253370f.mo121897c(this.f253375n, this.f253374j);
            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicNetworkDownloadTaskCount.name(), 1, (String) null);
            Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "downloadCronetFile prepare to start download taskid is %s, usehttp2 is %b, usequic is %b, usecache is %b, url is %s, filename is %s", this.f253381t, Boolean.valueOf(this.f253386y), Boolean.valueOf(this.f253387z), Boolean.valueOf(this.f253366A), this.f253374j, this.f253375n);
            C87440e eVar = new C87440e(this);
            C87441f fVar = new C87441f(this, eVar, aVar);
            CronetLogic.CronetRequestParams cronetRequestParams = new CronetLogic.CronetRequestParams();
            cronetRequestParams.url = this.f253374j;
            cronetRequestParams.taskId = this.f253381t;
            cronetRequestParams.followRedirect = false;
            cronetRequestParams.savePath = this.f253375n;
            cronetRequestParams.method = "GET";
            cronetRequestParams.needWirteCache = true;
            cronetRequestParams.useHttp2 = this.f253386y;
            cronetRequestParams.useQuic = this.f253387z;
            cronetRequestParams.useMemoryCache = this.f253366A;
            Map<String, String> map = this.f253377p;
            if (!map.containsKey("Accept-Encoding")) {
                map.put("Accept-Encoding", "gzip,compress,br,deflate");
            } else {
                Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest Accept-Encoding:%s", map.get("Accept-Encoding"));
            }
            map.put("User-Agent", this.f253385x);
            cronetRequestParams.makeRequestHeader(map);
            cronetRequestParams.taskType = 2;
            ((C119157j) C119157j.f356862d).mo183878i(eVar, (long) this.f253378q);
            Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest taskId:%s", cronetRequestParams.taskId);
            CronetLogic.CronetHttpsCreateResult startCronetDownloadTask = CronetLogic.startCronetDownloadTask(cronetRequestParams, fVar);
            Log.m105925i("MicroMsg.MagicBrushDownloadWorker", "startCronetHttpsRequest createRet is %d, taskId %s,CronetRequestId:%s", Integer.valueOf(startCronetDownloadTask.createRet), this.f253381t, startCronetDownloadTask.taskId);
            if (startCronetDownloadTask.createRet == 0) {
                this.f253382u = startCronetDownloadTask.taskId;
            } else if (!this.f253372h) {
                this.f253372h = true;
                C87439d dVar = this.f253370f;
                String str = this.f253375n;
                String str2 = this.f253374j;
                dVar.mo121898d(str, str2, "call request error:" + startCronetDownloadTask.createRet, 300004);
            }
        } else {
            this.f253370f.mo121898d(this.f253375n, this.f253374j, "downloadFile protocol must be http or https", 300005);
        }
    }
}
