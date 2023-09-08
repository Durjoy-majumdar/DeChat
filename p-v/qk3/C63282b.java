package qk3;

import java.util.HashSet;
import p157gk.C59479c;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.model.LoadMoreImageDataModel", mo125469f = "LoadMoreImageDataModel.kt", mo125470l = {92}, mo125471m = "dealDataFromStorage")
/* renamed from: qk3.b */
public final class C63282b extends C66704d {

    /* renamed from: d */
    public int f179604d;

    /* renamed from: e */
    public long f179605e;

    /* renamed from: f */
    public /* synthetic */ Object f179606f;

    /* renamed from: g */
    public final /* synthetic */ C63284d f179607g;

    /* renamed from: h */
    public int f179608h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63282b(C63284d dVar, C15601d<? super C63282b> dVar2) {
        super(dVar2);
        this.f179607g = dVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f179606f = obj;
        this.f179608h |= Integer.MIN_VALUE;
        return C63284d.m74575a(this.f179607g, (String) null, 0, (HashSet) null, (String) null, 0, (C59479c) null, this);
    }
}
