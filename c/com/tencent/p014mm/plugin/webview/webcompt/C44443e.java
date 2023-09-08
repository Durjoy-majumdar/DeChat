package com.tencent.p014mm.plugin.webview.webcompt;

import com.tencent.p014mm.plugin.webview.webcompt.C44408c;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.webview.webcompt.WebComponent$Companion", mo125469f = "WebComponent.kt", mo125470l = {766}, mo125471m = "getCachedFilePath")
/* renamed from: com.tencent.mm.plugin.webview.webcompt.e */
public final class C44443e extends C66704d {

    /* renamed from: d */
    public /* synthetic */ Object f120536d;

    /* renamed from: e */
    public final /* synthetic */ C44408c.C44410b f120537e;

    /* renamed from: f */
    public int f120538f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44443e(C44408c.C44410b bVar, C15601d<? super C44443e> dVar) {
        super(dVar);
        this.f120537e = bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f120536d = obj;
        this.f120538f |= Integer.MIN_VALUE;
        return C44408c.C44410b.m48780a(this.f120537e, this);
    }
}
