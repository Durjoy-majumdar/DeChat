package com.tencent.p014mm.p136ui.chatting.gallery;

import com.tencent.p014mm.storage.C72963f4;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {1362}, mo125471m = "awaitVideoDownloadedWithProgress")
/* renamed from: com.tencent.mm.ui.chatting.gallery.w0 */
public final class C97152w0 extends C66704d {

    /* renamed from: d */
    public Object f285090d;

    /* renamed from: e */
    public Object f285091e;

    /* renamed from: f */
    public /* synthetic */ Object f285092f;

    /* renamed from: g */
    public final /* synthetic */ C97136u0 f285093g;

    /* renamed from: h */
    public int f285094h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97152w0(C97136u0 u0Var, C15601d<? super C97152w0> dVar) {
        super(dVar);
        this.f285093g = u0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.f285092f = obj;
        this.f285094h |= Integer.MIN_VALUE;
        return C97136u0.m125063C(this.f285093g, (C72963f4) null, this);
    }
}
