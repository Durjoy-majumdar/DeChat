package ue2;

import com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader", mo125469f = "C2CMsgPreDownloader.kt", mo125470l = {278}, mo125471m = "isDownloading")
/* renamed from: ue2.b */
public final class C102004b extends C66704d {

    /* renamed from: d */
    public Object f300328d;

    /* renamed from: e */
    public Object f300329e;

    /* renamed from: f */
    public /* synthetic */ Object f300330f;

    /* renamed from: g */
    public final /* synthetic */ C2CMsgPreDownloader f300331g;

    /* renamed from: h */
    public int f300332h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102004b(C2CMsgPreDownloader c2CMsgPreDownloader, C15601d<? super C102004b> dVar) {
        super(dVar);
        this.f300331g = c2CMsgPreDownloader;
    }

    public final Object invokeSuspend(Object obj) {
        this.f300330f = obj;
        this.f300332h |= Integer.MIN_VALUE;
        return C2CMsgPreDownloader.m119248c(this.f300331g, this);
    }
}
