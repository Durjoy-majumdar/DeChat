package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82419d1;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import mi0.C34574b;
import p1039tb.C90388a;
import p224ra.C89909e;
import p823sg.C77710q;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.l4 */
public class C83244l4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f243112d;

    /* renamed from: e */
    public final /* synthetic */ int f243113e;

    /* renamed from: f */
    public final /* synthetic */ String f243114f;

    public C83244l4(String str, int i, String str2) {
        this.f243112d = str;
        this.f243113e = i;
        this.f243114f = str2;
    }

    public void run() {
        Class cls = C90388a.class;
        Log.m105924i("MicroMsg.SinglePageModeLogic", "cleanData");
        try {
            C82419d1.m101182i(C77710q.m93738a(((C34574b) C86312j.m106911c(C34574b.class)).mo56629LU(this.f243112d)), this.f243112d).cleanupDirectory();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SinglePageModeLogic", "clean SinglePageNotFlattern appId=%s e=%s", this.f243112d, e);
        }
        String str = this.f243112d;
        int i = this.f243113e;
        String str2 = this.f243114f;
        Log.m105925i("MicroMsg.SinglePageModeLogic", "cleanStorage scheme:%d", Integer.valueOf(i));
        if (C90988l.m114155a(i)) {
            ((C90388a) C89909e.m112436a(cls)).mo56837dI(str, i, str2).mo56590S(2, str);
        } else if (i == 3) {
            ((C90388a) C89909e.m112436a(cls)).mo56837dI(str, i, str2).mo56590S(2, str);
            JsApiClearStorageTask jsApiClearStorageTask = new JsApiClearStorageTask();
            jsApiClearStorageTask.f242659f = str;
            jsApiClearStorageTask.f242660g = 2;
            jsApiClearStorageTask.mo114396f();
        } else {
            JsApiClearStorageTask jsApiClearStorageTask2 = new JsApiClearStorageTask();
            jsApiClearStorageTask2.f242659f = str;
            jsApiClearStorageTask2.f242660g = 2;
            jsApiClearStorageTask2.mo114396f();
        }
        Log.m105924i("MicroMsg.SinglePageModeLogic", "cleanData done");
    }
}
