package kh1;

import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.EventSubscribeController", mo125469f = "EventSubscribeController.kt", mo125470l = {88}, mo125471m = "getStreamFrame")
/* renamed from: kh1.b */
public final class C10078b extends C66704d {

    /* renamed from: d */
    public /* synthetic */ Object f30849d;

    /* renamed from: e */
    public final /* synthetic */ EventSubscribeController f30850e;

    /* renamed from: f */
    public int f30851f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10078b(EventSubscribeController eventSubscribeController, C15601d<? super C10078b> dVar) {
        super(dVar);
        this.f30850e = eventSubscribeController;
    }

    public final Object invokeSuspend(Object obj) {
        this.f30849d = obj;
        this.f30851f |= Integer.MIN_VALUE;
        return EventSubscribeController.m3060m3(this.f30850e, this);
    }
}
