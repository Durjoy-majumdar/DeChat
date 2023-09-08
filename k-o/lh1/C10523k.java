package lh1;

import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView", mo125469f = "ShellView.kt", mo125470l = {189, 195, 210}, mo125471m = "onShare")
/* renamed from: lh1.k */
public final class C10523k extends C66704d {

    /* renamed from: d */
    public Object f31776d;

    /* renamed from: e */
    public Object f31777e;

    /* renamed from: f */
    public Object f31778f;

    /* renamed from: g */
    public /* synthetic */ Object f31779g;

    /* renamed from: h */
    public final /* synthetic */ ShellView f31780h;

    /* renamed from: i */
    public int f31781i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10523k(ShellView shellView, C15601d<? super C10523k> dVar) {
        super(dVar);
        this.f31780h = shellView;
    }

    public final Object invokeSuspend(Object obj) {
        this.f31779g = obj;
        this.f31781i |= Integer.MIN_VALUE;
        return ShellView.m3065b(this.f31780h, this);
    }
}
