package com.tencent.p014mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import li0.C88508b;
import li0.C88509c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.c */
public class C82023c extends C82926s {
    public static final int CTRL_INDEX = 662;
    public static final String NAME = "onDownloadAppStateChangeForNative";

    /* renamed from: j */
    public static HashMap<String, C82023c> f240489j = new HashMap<>();

    /* renamed from: n */
    public static Set<String> f240490n = new HashSet();

    /* renamed from: i */
    public MMToClientEvent.C81947d f240491i;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.c$c */
    public static class C1603c implements C80883e<IPCString, IPCVoid> {
        private C1603c() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null && !Util.isNullOrNil(iPCString.f10315d)) {
                ((HashSet) C82023c.f240490n).add(iPCString.f10315d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.c$d */
    public static class C1604d implements C80883e<IPCString, IPCVoid> {
        private C1604d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null && !Util.isNullOrNil(iPCString.f10315d)) {
                ((HashSet) C82023c.f240490n).remove(iPCString.f10315d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.c$a */
    public class C40448a implements MMToClientEvent.C81947d {

        /* renamed from: a */
        public final /* synthetic */ C81925i2 f108718a;

        public C40448a(C81925i2 i2Var) {
            this.f108718a = i2Var;
        }

        /* renamed from: a */
        public void mo22085a(Object obj) {
            if (obj instanceof AppBrandDownloadState) {
                AppBrandDownloadState appBrandDownloadState = (AppBrandDownloadState) obj;
                C81925i2 i2Var = this.f108718a;
                if (i2Var != null) {
                    C82023c cVar = C82023c.this;
                    cVar.mo115194p(i2Var);
                    appBrandDownloadState.getClass();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("state", appBrandDownloadState.f108698d);
                        jSONObject.put("downloadId", appBrandDownloadState.f108699e);
                        jSONObject.put("appId", appBrandDownloadState.f108700f);
                        jSONObject.put("progress", appBrandDownloadState.f108701g);
                        jSONObject.put("taskSize", appBrandDownloadState.f108702h);
                        jSONObject.put("progressFloat", (double) appBrandDownloadState.f108703i);
                    } catch (JSONException e) {
                        Log.m105920e("MicroMsg.AppbrandDownloadState", "toJsonObject: " + e.getMessage());
                    }
                    cVar.f242407f = jSONObject.toString();
                    cVar.mo115158h();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.appdownload.c$b */
    public class C82024b implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C81925i2 f240492d;

        public C82024b(C81925i2 i2Var) {
            this.f240492d = i2Var;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            if (bVar == C88508b.DESTROYED) {
                MMToClientEvent.m100657u(this.f240492d.getAppId(), C82023c.this.f240491i);
                C81925i2 i2Var = this.f240492d;
                C82023c.f240489j.remove(i2Var.getAppId());
                C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(i2Var.getAppId()), C1604d.class, (C1256g) null);
            }
        }
    }

    public C82023c(C81925i2 i2Var) {
        this.f240491i = new C40448a(i2Var);
        MMToClientEvent.m100655q(i2Var.getAppId(), this.f240491i);
        i2Var.getRuntime().f238113K.mo122978a(new C82024b(i2Var));
    }

    /* renamed from: s */
    public static void m100725s(AppBrandDownloadState appBrandDownloadState) {
        Iterator it = ((HashSet) f240490n).iterator();
        while (it.hasNext()) {
            C81964j.m100679b((String) it.next(), appBrandDownloadState);
        }
    }
}
