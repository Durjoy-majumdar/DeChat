package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.m */
public final class C2043m extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C1256g<IPCString> f11990d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2043m(C1256g<IPCString> gVar) {
        super(1);
        this.f11990d = gVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, "avatarPath");
        Log.m105918d("MicroMsg.AnyProcessAvatarAttacher", "invoke#IPCAsyncInvokeTask, avatarPath: " + str);
        this.f11990d.mo894a(new IPCString(str));
        return C13598b0.f38549a;
    }
}
