package xc0;

import wx3.C15601d;
import xc0.C78789e;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.modelremark.RemarkCdnUploadServicePLC$Companion", mo125469f = "RemarkCdnUploadServicePLC.kt", mo125470l = {49, 52}, mo125471m = "startCdnTask")
/* renamed from: xc0.f */
public final class C78794f extends C66704d {

    /* renamed from: d */
    public /* synthetic */ Object f230544d;

    /* renamed from: e */
    public final /* synthetic */ C78789e.C78790a f230545e;

    /* renamed from: f */
    public int f230546f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78794f(C78789e.C78790a aVar, C15601d<? super C78794f> dVar) {
        super(dVar);
        this.f230545e = aVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f230544d = obj;
        this.f230546f |= Integer.MIN_VALUE;
        return C78789e.C78790a.m95193a(this.f230545e, (String) null, 0, this);
    }
}
