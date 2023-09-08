package com.tencent.p014mm.ipcinvoker.wx_extension;

import fy3.C32226l;
import gy3.C87413o;
import jp3.C46566c;
import jp3.C9486a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.ipcinvoker.wx_extension.b */
public final class C40321b extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46566c<C9486a> f108397d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40321b(C46566c<C9486a> cVar) {
        super(1);
        this.f108397d = cVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f108397d.dead();
        return C13598b0.f38549a;
    }
}
