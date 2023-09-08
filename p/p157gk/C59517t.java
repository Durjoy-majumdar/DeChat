package p157gk;

import com.tencent.p014mm.api.QueryImageData;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {305}, mo125471m = "labelDataBack")
/* renamed from: gk.t */
public final class C59517t extends C66704d {

    /* renamed from: d */
    public Object f170099d;

    /* renamed from: e */
    public Object f170100e;

    /* renamed from: f */
    public /* synthetic */ Object f170101f;

    /* renamed from: g */
    public final /* synthetic */ C59503r f170102g;

    /* renamed from: h */
    public int f170103h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59517t(C59503r rVar, C15601d<? super C59517t> dVar) {
        super(dVar);
        this.f170102g = rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f170101f = obj;
        this.f170103h |= Integer.MIN_VALUE;
        return C59503r.m69406b(this.f170102g, (QueryImageData) null, (String) null, this);
    }
}
