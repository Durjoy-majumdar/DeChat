package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.jsapi.picker.C82881g;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.f */
public class C82880f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeakReference f242327d;

    /* renamed from: e */
    public final /* synthetic */ int f242328e;

    /* renamed from: f */
    public final /* synthetic */ C82881g f242329f;

    public C82880f(C82881g gVar, WeakReference weakReference, int i) {
        this.f242329f = gVar;
        this.f242327d = weakReference;
        this.f242328e = i;
    }

    public void run() {
        String str;
        String str2 = C82881g.f242330g.get();
        if (Util.isNullOrNil(str2)) {
            if (MMApplicationContext.isMMProcessExist()) {
                try {
                    str = ((IPCString) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C82881g.C29534a.class)).f10315d;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.JsApiGetRegionData", e, "query updated address path", new Object[0]);
                    str = null;
                }
            } else {
                Log.m105920e("MicroMsg.AppBrand.JsApiGetRegionData", "MMProcessExist==FALSE, will fallback assets file");
                str = "";
            }
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.AppBrand.JsApiGetRegionData", "read file use updatedAddressPath[%s]", str);
                try {
                    str2 = C86013q1.m106432N(str);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.JsApiGetRegionData", e2, "read address from file %s", str);
                    str2 = null;
                }
            }
            if (Util.isNullOrNil(str2)) {
                Log.m105924i("MicroMsg.AppBrand.JsApiGetRegionData", "read file use assets");
                try {
                    str2 = Util.convertStreamToString(MMApplicationContext.getContext().getAssets().open("address"));
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.JsApiGetRegionData", e3, "read address from assets", new Object[0]);
                }
            }
            if (!Util.isNullOrNil(str2)) {
                Log.m105925i("MicroMsg.AppBrand.JsApiGetRegionData", "update process shared data, size[%d]", Integer.valueOf(str2.length()));
                C82881g.f242330g.set(str2);
            } else {
                Log.m105920e("MicroMsg.AppBrand.JsApiGetRegionData", "get invalid data");
            }
        } else {
            Log.m105925i("MicroMsg.AppBrand.JsApiGetRegionData", "use process shared cache, size[%d]", Integer.valueOf(str2.length()));
        }
        C83780d1 d1Var = (C83780d1) this.f242327d.get();
        if (d1Var != null && d1Var.isRunning()) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("data", str2);
            d1Var.mo109647a(this.f242328e, this.f242329f.mo115112m("ok", hashMap));
        }
    }
}
