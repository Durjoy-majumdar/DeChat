package com.tencent.p014mm.network;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.network.d0 */
public class C81038d0 implements CronetLogic.CronetTaskCallback, C92871c0 {

    /* renamed from: a */
    public boolean f238045a = false;

    /* renamed from: b */
    public String f238046b = "";

    /* renamed from: c */
    public String f238047c;

    /* renamed from: d */
    public Map<String, String> f238048d = new HashMap();

    /* renamed from: e */
    public int f238049e = 5000;

    /* renamed from: f */
    public int f238050f = 5000;

    /* renamed from: g */
    public int f238051g;

    /* renamed from: h */
    public String f238052h;

    /* renamed from: i */
    public String f238053i = "GET";

    /* renamed from: j */
    public boolean f238054j = false;

    /* renamed from: k */
    public String f238055k;

    /* renamed from: l */
    public boolean f238056l = false;

    /* renamed from: m */
    public CronetLogic.CronetTaskCallback f238057m;

    /* renamed from: n */
    public int f238058n = 8;

    /* renamed from: o */
    public int f238059o = -1;

    /* renamed from: p */
    public byte[] f238060p;

    /* renamed from: q */
    public Map<String, List<String>> f238061q = new HashMap();

    /* renamed from: r */
    public int f238062r = 0;

    /* renamed from: s */
    public boolean f238063s = false;

    public C81038d0(String str, int i) {
        this.f238047c = str;
        this.f238051g = i;
    }

    /* renamed from: a */
    public int mo112916a() {
        int i;
        if (this.f238045a && (i = this.f238059o) != -1) {
            return i;
        }
        if ("".equals(this.f238046b)) {
            mo112935i();
        }
        return this.f238059o;
    }

    /* renamed from: b */
    public void mo112917b(String str) {
        ((HashMap) this.f238048d).put("Referer", str);
    }

    /* renamed from: c */
    public void mo112918c(boolean z) {
        this.f238054j = z;
    }

    /* renamed from: d */
    public void mo112919d(int i) {
        this.f238049e = i;
    }

    public void disconnect() {
    }

    /* renamed from: e */
    public void mo112921e(String str, String str2) {
        ((HashMap) this.f238048d).put(str, str2);
    }

    /* renamed from: f */
    public String mo112922f(String str) {
        if (str.isEmpty()) {
            return "";
        }
        List list = this.f238061q.get(str.toLowerCase());
        if (list == null) {
            Log.m105929w("MicroMsg.CronetConnect", "getHeaderField %s is null", str);
            return "";
        }
        Log.m105925i("MicroMsg.CronetConnect", "getHeaderField field %s, value %s ", str, list.get(0));
        return (String) list.get(0);
    }

    /* renamed from: g */
    public void mo112923g(int i) {
        this.f238050f = i;
    }

    public String getContentType() {
        return mo112922f("content-type");
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.f238060p);
    }

    /* renamed from: h */
    public void mo112934h() {
        if ("".equals(this.f238046b) && this.f238058n == 2) {
            mo112935i();
        }
    }

    /* renamed from: i */
    public final synchronized void mo112935i() {
        CronetLogic.CronetHttpsCreateResult cronetHttpsCreateResult;
        CronetLogic.CronetRequestParams cronetRequestParams = new CronetLogic.CronetRequestParams();
        cronetRequestParams.url = this.f238047c;
        cronetRequestParams.followRedirect = false;
        cronetRequestParams.bodyData = null;
        cronetRequestParams.method = this.f238053i;
        cronetRequestParams.useMemoryCache = this.f238054j;
        cronetRequestParams.useHttp2 = this.f238056l;
        cronetRequestParams.useQuic = false;
        cronetRequestParams.makeRequestHeader(this.f238048d);
        cronetRequestParams.taskType = this.f238058n;
        if (this.f238062r != 0) {
            CronetLogic.DefaultHttpTaskParams defaultHttpTaskParams = new CronetLogic.DefaultHttpTaskParams();
            cronetRequestParams.defaultHttpTaskParams = defaultHttpTaskParams;
            defaultHttpTaskParams.reportId = this.f238062r;
        }
        int i = this.f238058n;
        if (i == 1) {
            cronetHttpsCreateResult = CronetLogic.startCronetHttpTask(cronetRequestParams, this);
        } else if (i != 2) {
            cronetRequestParams.useNewdns = this.f238063s;
            cronetHttpsCreateResult = CronetLogic.startCronetDefaultHttpTask(cronetRequestParams, this);
        } else {
            cronetRequestParams.savePath = this.f238055k;
            cronetRequestParams.needWirteCache = true;
            cronetHttpsCreateResult = CronetLogic.startCronetDownloadTask(cronetRequestParams, this);
        }
        this.f238046b = cronetHttpsCreateResult.taskId;
        try {
            wait((long) (this.f238049e + this.f238050f));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CronetConnect", "createAndStartCronetRequest " + e.getLocalizedMessage());
        }
        if (!this.f238045a) {
            CronetLogic.cancelCronetTask(this.f238046b);
        }
        mo112941o();
    }

    /* renamed from: j */
    public int mo112936j() {
        String f = mo112922f("content-length");
        if (f == null) {
            return -1;
        }
        long j = -1;
        try {
            j = Long.parseLong(f);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CronetConnect", "getContentLength content-length " + e.getLocalizedMessage());
        }
        if (j > 2147483647L) {
            return -1;
        }
        return (int) j;
    }

    /* renamed from: k */
    public String mo112937k() {
        return this.f238052h;
    }

    /* renamed from: l */
    public int mo112938l() {
        return this.f238051g;
    }

    /* renamed from: m */
    public int mo112939m(String str, int i) {
        try {
            return Integer.parseInt(mo112922f(str));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.CronetConnect", "getHeaderFieldInt field " + str + " " + e.getLocalizedMessage());
            return i;
        }
    }

    /* renamed from: n */
    public Map<String, List<String>> mo112940n() {
        return this.f238061q;
    }

    /* renamed from: o */
    public final void mo112941o() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.f238061q);
        this.f238061q.clear();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!(entry == null || entry.getKey() == null)) {
                this.f238061q.put(((String) entry.getKey()).toLowerCase(), (List) entry.getValue());
            }
        }
    }

    public void onCronetReceiveChunkedData(CronetLogic.ChunkedData chunkedData, long j) {
    }

    public int onCronetReceiveHeader(CronetLogic.ResponseHeader responseHeader, int i, String str) {
        Log.m105918d("MicroMsg.CronetConnect", "onCronetReceiveHeader " + i);
        if (this.f238057m == null) {
            return 0;
        }
        this.f238061q = CronetLogic.getHeaderList(responseHeader);
        return this.f238057m.onCronetReceiveHeader(responseHeader, i, str);
    }

    public void onCronetReceiveUploadProgress(long j, long j2) {
    }

    public void onCronetTaskCompleted(String str, CronetLogic.CronetTaskResult cronetTaskResult, String str2) {
        Log.m105925i("MicroMsg.CronetConnect", "receive callback, status %d, error %d, msg %s, quic %b http2 %b newdns %b", Integer.valueOf(cronetTaskResult.statusCode), Integer.valueOf(cronetTaskResult.errorCode), cronetTaskResult.errorMsg, Boolean.valueOf(cronetTaskResult.useQuic), Boolean.valueOf(cronetTaskResult.useHttp2), Boolean.valueOf(cronetTaskResult.useNewdns));
        synchronized (this) {
            this.f238045a = true;
            this.f238059o = cronetTaskResult.statusCode;
            this.f238060p = cronetTaskResult.data;
            this.f238061q = cronetTaskResult.getHeaderMapList();
            notify();
        }
        CronetLogic.CronetTaskCallback cronetTaskCallback = this.f238057m;
        if (cronetTaskCallback != null) {
            cronetTaskCallback.onCronetTaskCompleted(str, cronetTaskResult, str2);
        }
    }

    public void onDownloadProgressChanged(String str, CronetLogic.CronetDownloadProgress cronetDownloadProgress) {
        CronetLogic.CronetTaskCallback cronetTaskCallback = this.f238057m;
        if (cronetTaskCallback != null) {
            cronetTaskCallback.onDownloadProgressChanged(str, cronetDownloadProgress);
        }
    }

    /* renamed from: p */
    public void mo112942p(int i) {
        this.f238062r = i;
    }

    /* renamed from: q */
    public void mo112943q(String str) {
        this.f238053i = str;
    }

    /* renamed from: r */
    public void mo112944r(boolean z) {
        this.f238063s = z;
    }
}
