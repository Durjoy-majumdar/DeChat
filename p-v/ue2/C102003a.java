package ue2;

import com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader", mo125469f = "C2CMsgPreDownloader.kt", mo125470l = {226}, mo125471m = "cancelCurrentTask")
/* renamed from: ue2.a */
public final class C102003a extends C66704d {

    /* renamed from: d */
    public Object f300324d;

    /* renamed from: e */
    public /* synthetic */ Object f300325e;

    /* renamed from: f */
    public final /* synthetic */ C2CMsgPreDownloader f300326f;

    /* renamed from: g */
    public int f300327g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102003a(C2CMsgPreDownloader c2CMsgPreDownloader, C15601d<? super C102003a> dVar) {
        super(dVar);
        this.f300326f = c2CMsgPreDownloader;
    }

    public final Object invokeSuspend(Object obj) {
        this.f300325e = obj;
        this.f300327g |= Integer.MIN_VALUE;
        return C2CMsgPreDownloader.m119247b(this.f300326f, this);
    }
}
