package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import fl0.C86918c;
import fl0.C86919d;
import fl0.C86920e;
import java.util.HashMap;
import js0.C9514m;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.v0 */
public final class C82489v0 extends C82268c {
    public static final int CTRL_INDEX = 51;
    public static final String NAME = "saveFile";

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.v0$a */
    public class C82490a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f241549d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f241550e;

        /* renamed from: f */
        public final /* synthetic */ int f241551f;

        public C82490a(C82381f fVar, JSONObject jSONObject, int i) {
            this.f241549d = fVar;
            this.f241550e = jSONObject;
            this.f241551f = i;
        }

        public void run() {
            if (this.f241549d.isRunning()) {
                C82870p.C82871a w = C82489v0.m101248w(this.f241549d, this.f241550e);
                C86918c cVar = w.f242318c;
                if (cVar != null) {
                    this.f241549d.mo109647a(this.f241551f, C82489v0.this.mo115110k((String) null, cVar, w.f242316a));
                } else {
                    this.f241549d.mo109647a(this.f241551f, C82489v0.this.mo115112m(w.f242317b, w.f242316a));
                }
            }
        }
    }

    /* renamed from: w */
    public static C82870p.C82871a m101248w(C82381f fVar, JSONObject jSONObject) {
        String optString = jSONObject.optString("tempFilePath");
        String optString2 = jSONObject.optString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (Util.isNullOrNil(optString)) {
            Log.m105920e("MicroMsg.JsApiSaveFile", "temp localId is null or nil");
            return new C82870p.C82871a(C86919d.f252310e, new Object[0]);
        }
        C86009m1 absoluteFile = fVar.getFileSystem().getAbsoluteFile(optString);
        if (absoluteFile == null || !absoluteFile.mo119967g()) {
            Log.m105920e("MicroMsg.JsApiSaveFile", "fail tempFilePath file not exist");
            return new C82870p.C82871a(C86919d.f252310e, new Object[0]);
        }
        C9514m mVar = new C9514m();
        C86918c x = m101249x(fVar, absoluteFile, optString2, mVar);
        HashMap hashMap = new HashMap();
        if ("ok".equals(x.f252305b)) {
            hashMap.put("savedFilePath", mVar.f29691a);
        }
        C82870p.C82871a aVar = new C82870p.C82871a(x, new Object[0]);
        ((HashMap) aVar.f242316a).putAll(hashMap);
        return aVar;
    }

    /* renamed from: x */
    public static C86918c m101249x(C82381f fVar, C86009m1 m1Var, String str, C9514m<String> mVar) {
        boolean z;
        if (m1Var == null || !m1Var.mo119967g()) {
            return C86919d.f252306a;
        }
        C81410b0 isdir = fVar.getFileSystem().isdir(str);
        if (isdir != C81410b0.OK) {
            try {
                C9514m mVar2 = new C9514m();
                C81410b0 saveFile = fVar.getFileSystem().saveFile(m1Var, str, mVar2);
                if (mVar != null) {
                    mVar.f29691a = mVar2.f29691a;
                }
                isdir = saveFile;
                z = false;
            } catch (Exception e) {
                return new C86918c(-1, "fail:saveFile exception: " + e.toString());
            }
        } else {
            z = true;
        }
        int ordinal = isdir.ordinal();
        if (ordinal != 0) {
            if (ordinal == 9) {
                return new C86918c(1301003, String.format("%s, \"%s\"", new Object[]{"fail:illegal operation on a directory", str}));
            } else if (ordinal == 15) {
                return C86919d.f252309d;
            } else {
                if (ordinal == 17) {
                    return C86919d.f252308c;
                }
                if (ordinal == 3) {
                    return new C86918c(1300002, String.format("%s, \"%s\"", new Object[]{"fail:No such file or directory", str}));
                } else if (ordinal == 4) {
                    return C86919d.f252307b;
                } else {
                    return new C86918c(-1, "fail " + isdir.name());
                }
            }
        } else if (!z) {
            return C86920e.f252311a;
        } else {
            return new C86918c(1301003, String.format("%s, \"%s\"", new Object[]{"fail:illegal operation on a directory", str}));
        }
    }

    /* renamed from: t */
    public boolean mo1769t() {
        return true;
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C82421e.f241505h.execute(new C82490a(fVar, jSONObject, i));
    }
}
