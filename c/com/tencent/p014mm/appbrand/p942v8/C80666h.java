package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.MultiContextNodeJS;
import com.eclipsesource.mmv8.V8Context;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.appbrand.v8.h */
public class C80666h implements C80669j.C80674e {

    /* renamed from: a */
    public final /* synthetic */ C80662g f236034a;

    public C80666h(C80662g gVar) {
        this.f236034a = gVar;
    }

    /* renamed from: a */
    public V8Context mo112475a() {
        MultiContextNodeJS multiContextNodeJS = this.f236034a.f236029y;
        if (multiContextNodeJS != null) {
            Log.m105925i("MicroMsg.NodeJSRuntime", "getMainContext %s", Integer.valueOf(multiContextNodeJS.getMainContext().hashCode()));
            return this.f236034a.f236029y.getMainContext();
        }
        throw new IllegalStateException("getMainContext mNodeJS not ready!");
    }
}
