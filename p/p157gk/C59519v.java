package p157gk;

import com.tencent.p014mm.api.QueryImageData;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.data.ImageQuerySDKCore", mo125469f = "ImageQuerySDKCore.kt", mo125470l = {329}, mo125471m = "ocrDataBack")
/* renamed from: gk.v */
public final class C59519v extends C66704d {

    /* renamed from: d */
    public Object f170105d;

    /* renamed from: e */
    public Object f170106e;

    /* renamed from: f */
    public /* synthetic */ Object f170107f;

    /* renamed from: g */
    public final /* synthetic */ C59503r f170108g;

    /* renamed from: h */
    public int f170109h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59519v(C59503r rVar, C15601d<? super C59519v> dVar) {
        super(dVar);
        this.f170108g = rVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f170107f = obj;
        this.f170109h |= Integer.MIN_VALUE;
        return C59503r.m69407c(this.f170108g, (QueryImageData) null, (String) null, this);
    }
}
