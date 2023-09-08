package lh1;

import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView", mo125469f = "ShellView.kt", mo125470l = {164, 169}, mo125471m = "onSave")
/* renamed from: lh1.h */
public final class C10520h extends C66704d {

    /* renamed from: d */
    public Object f31766d;

    /* renamed from: e */
    public Object f31767e;

    /* renamed from: f */
    public Object f31768f;

    /* renamed from: g */
    public /* synthetic */ Object f31769g;

    /* renamed from: h */
    public final /* synthetic */ ShellView f31770h;

    /* renamed from: i */
    public int f31771i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10520h(ShellView shellView, C15601d<? super C10520h> dVar) {
        super(dVar);
        this.f31770h = shellView;
    }

    public final Object invokeSuspend(Object obj) {
        this.f31769g = obj;
        this.f31771i |= Integer.MIN_VALUE;
        return ShellView.m3064a(this.f31770h, this);
    }
}
