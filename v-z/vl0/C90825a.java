package vl0;

import com.tencent.mars.cdn.CronetLogic;
import com.tencent.p014mm.plugin.appbrand.C84081q4;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82919r2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jk0.C87975a;
import jk0.C87986j;
import org.json.JSONObject;
import s24.C90124b;
import sp0.C90272a;
import sp0.C90302k;
import sp0.C90306l;
import sp0.C90309m;

/* renamed from: vl0.a */
public class C90825a implements C87986j {

    /* renamed from: d */
    public C90302k.C90305c f260783d;

    /* renamed from: e */
    public boolean f260784e = false;

    /* renamed from: f */
    public C87975a f260785f;

    /* renamed from: g */
    public final AtomicBoolean f260786g = new AtomicBoolean(false);

    /* renamed from: vl0.a$a */
    public class C90826a implements C90302k.C90304b {

        /* renamed from: a */
        public JSONObject f260787a;

        /* renamed from: b */
        public final /* synthetic */ String f260788b;

        /* renamed from: c */
        public final /* synthetic */ String f260789c;

        /* renamed from: d */
        public final /* synthetic */ C82381f f260790d;

        public C90826a(String str, String str2, C82381f fVar) {
            this.f260788b = str;
            this.f260789c = str2;
            this.f260790d = fVar;
        }

        /* renamed from: a */
        public void mo124937a(int i, String str, int i2) {
            boolean z = false;
            Log.m105925i("MicroMsg.BaseCreateUploadTask", "onUploadResult uploadTaskId:%s, filePath:%s, result:%s, errMsg:%d, errno:%d", this.f260788b, this.f260789c, str, Integer.valueOf(i), Integer.valueOf(i2));
            C90825a aVar = C90825a.this;
            C82381f fVar = this.f260790d;
            String str2 = this.f260788b;
            aVar.getClass();
            AtomicInteger atomicInteger = C90306l.f259255b;
            C90302k a = C90306l.C90308b.f259257a.mo124542a(fVar.getAppId());
            if (a != null && a.f259251g.contains(str2)) {
                Log.m105925i("MicroMsg.BaseCreateUploadTask", "upload abort %s", str2);
                z = true;
            }
            if (!z) {
                C90825a.this.mo124936b(this.f260790d, this.f260788b, str, i2);
            }
        }
    }

    /* renamed from: vl0.a$b */
    public static class C90827b extends C82919r2 {
        public static final int CTRL_INDEX = 274;
        public static final String NAME = "onUploadTaskStateChange";
    }

    public C90825a(C90302k.C90305c cVar, C87975a aVar) {
        this.f260783d = cVar;
        this.f260785f = aVar;
    }

    /* renamed from: a */
    public String mo122435a() {
        return "uploadTaskId";
    }

    /* renamed from: b */
    public final void mo124936b(C82381f fVar, String str, String str2, int i) {
        Log.m105929w("MicroMsg.BaseCreateUploadTask", "sendFailMsg, uploadTaskId = %s, errMsg = %s, errno = %d", str, str2, Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        hashMap.put("uploadTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", Integer.valueOf(i));
        hashMap.put("errMsg", str2);
        String jSONObject = new JSONObject(hashMap).toString();
        C90827b bVar = new C90827b();
        bVar.mo115161k(fVar);
        bVar.mo115163m(jSONObject);
        bVar.mo115159i(this.f260785f.mo122426a(str));
    }

    /* renamed from: d */
    public void mo122436d(C82381f fVar, JSONObject jSONObject, String str) {
        C90302k kVar;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        Class cls = C90272a.class;
        Log.m105919d("MicroMsg.BaseCreateUploadTask", "JsApiCreateUploadTask, appId:%s taskId:%s", fVar.getAppId(), str2);
        if (!this.f260786g.getAndSet(true)) {
            if (this.f260783d != null) {
                fVar.getAppId();
                this.f260784e = C84081q4.m103608a(5);
            }
            if (this.f260784e) {
                C90272a aVar = (C90272a) fVar2.mo109671p(cls);
                if (aVar == null) {
                    Log.m105921e("MicroMsg.BaseCreateUploadTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", fVar.getAppId());
                    CronetLogic.setUserCertVerify(false);
                } else {
                    Log.m105925i("MicroMsg.BaseCreateUploadTask", "setupRequestMode(%b),appId(%s)", Boolean.valueOf(aVar.f259126H), fVar.getAppId());
                    CronetLogic.setUserCertVerify(aVar.f259126H);
                }
            }
        }
        String appId = fVar.getAppId();
        String optString = jSONObject2.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (Util.isNullOrNil(optString)) {
            mo124936b(fVar2, str2, "filePath is null", 600005);
            return;
        }
        C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(optString);
        if (absoluteFile == null || !absoluteFile.mo119967g()) {
            Log.m105921e("MicroMsg.BaseCreateUploadTask", "upload appId(%s) tempFilePath(%s), found no real file", fVar.getAppId(), optString);
            mo124936b(fVar2, str2, "fail:file doesn't exist", 600005);
            return;
        }
        String i = absoluteFile.mo119971i();
        String mimeTypeByFilePath = MimeTypeUtil.getMimeTypeByFilePath(optString);
        Log.m105925i("MicroMsg.BaseCreateUploadTask", "upload appId(%s) tempFilePath(%s) realFilePath(%s)", fVar.getAppId(), optString, i);
        C90826a aVar2 = new C90826a(str2, i, fVar2);
        C90272a aVar3 = (C90272a) fVar2.mo109671p(cls);
        Map<String, String> g = C90309m.m113072g(jSONObject2, aVar3);
        String optString2 = jSONObject2.optString("url");
        if (Util.isNullOrNil(optString2)) {
            Log.m105924i("MicroMsg.BaseCreateUploadTask", "url is null");
            mo124936b(fVar2, str2, "url is null or nil", 600005);
            return;
        }
        boolean z = jSONObject2.optBoolean("__skipDomainCheck__") ? false : aVar3.f259128e;
        if (!z || C90309m.m113088w(aVar3.f259139s, optString2, false)) {
            if (aVar3.f259135o <= 0) {
                Log.m105924i("MicroMsg.BaseCreateUploadTask", "concurrent <= 0 ");
            }
            int optInt = jSONObject2.optInt("timeout", 0);
            if (optInt <= 0) {
                optInt = C90309m.m113079n(aVar3, 2);
            }
            int i2 = optInt > 0 ? optInt : CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            Log.m105925i("MicroMsg.BaseCreateUploadTask", "lm:configTimeout: %d,timeout: %d", Integer.valueOf(optInt), Integer.valueOf(i2));
            AtomicInteger atomicInteger = C90306l.f259255b;
            if (C90306l.C90308b.f259257a.mo124542a(appId) == null) {
                C90302k kVar2 = new C90302k(fVar2, this.f260784e);
                C90306l lVar = C90306l.C90308b.f259257a;
                if (!lVar.f259256a.containsKey(appId)) {
                    lVar.f259256a.put(appId, kVar2);
                }
                kVar = kVar2;
            } else {
                kVar = C90306l.C90308b.f259257a.mo124542a(appId);
            }
            String d = C90124b.m112769d(optString);
            if (kVar != null) {
                Log.m105925i("MicroMsg.BaseCreateUploadTask", "before do upload, checkDomains = %b, timeout %d", Boolean.valueOf(z), Integer.valueOf(i2));
                if (!z) {
                    kVar.mo124535a(i2, mimeTypeByFilePath, i, jSONObject, g, (ArrayList<String>) null, aVar2, str, C90828b.NAME, d);
                } else {
                    kVar.mo124535a(i2, mimeTypeByFilePath, i, jSONObject, g, aVar3.f259139s, aVar2, str, C90828b.NAME, d);
                }
            }
        } else {
            Log.m105925i("MicroMsg.BaseCreateUploadTask", "not in domain url %s", optString2);
            mo124936b(fVar2, str2, "url not in domain list", 600002);
        }
    }

    public String getTaskId() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger atomicInteger = C90306l.f259255b;
        C90306l.C90308b.f259257a.getClass();
        sb.append(C90306l.f259255b.incrementAndGet());
        sb.append("");
        return sb.toString();
    }
}
