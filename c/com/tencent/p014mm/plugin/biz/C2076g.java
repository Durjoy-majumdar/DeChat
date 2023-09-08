package com.tencent.p014mm.plugin.biz;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.biz.g */
public final class C2076g extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C1256g<IPCBoolean> f12030d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2076g(C1256g<IPCBoolean> gVar) {
        super(1);
        this.f12030d = gVar;
    }

    public Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f12030d.mo894a(new IPCBoolean(bool != null ? bool.booleanValue() : true));
        return C13598b0.f38549a;
    }
}
