package com.tencent.p014mm.plugin.appbrand.jsapi.picker;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p216op.C47389f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.g */
public final class C82881g extends C82268c<C83780d1> {
    private static final int CTRL_INDEX = 280;
    private static final String NAME = "getRegionData";

    /* renamed from: g */
    public static final AtomicReference<String> f242330g = new AtomicReference<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.picker.g$a */
    public static final class C29534a implements C80916r<IPCVoid, IPCString> {
        private C29534a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            String str = ((C47389f) C86312j.m106911c(C47389f.class)).x10() + "address";
            return C86013q1.m106450k(str) ? new IPCString(str) : new IPCString("");
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        WeakReference weakReference = new WeakReference((C83780d1) fVar);
        ((C119157j) C119157j.f356862d).mo183876g(new C82880f(this, weakReference, i), "MicroMsg.AppBrand.JsApiGetRegionData");
    }
}
