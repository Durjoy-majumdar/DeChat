package ue2;

import com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader;
import ve2.C102179e;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader", mo125469f = "C2CMsgPreDownloader.kt", mo125470l = {278}, mo125471m = "setTask")
/* renamed from: ue2.c */
public final class C102005c extends C66704d {

    /* renamed from: d */
    public Object f300333d;

    /* renamed from: e */
    public Object f300334e;

    /* renamed from: f */
    public Object f300335f;

    /* renamed from: g */
    public /* synthetic */ Object f300336g;

    /* renamed from: h */
    public final /* synthetic */ C2CMsgPreDownloader f300337h;

    /* renamed from: i */
    public int f300338i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102005c(C2CMsgPreDownloader c2CMsgPreDownloader, C15601d<? super C102005c> dVar) {
        super(dVar);
        this.f300337h = c2CMsgPreDownloader;
    }

    public final Object invokeSuspend(Object obj) {
        this.f300336g = obj;
        this.f300338i |= Integer.MIN_VALUE;
        return C2CMsgPreDownloader.m119249d(this.f300337h, (C102179e) null, this);
    }
}
