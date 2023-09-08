package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import a14.C0000n0;
import fy3.C32227p;
import java.util.ArrayList;
import kotlin.ResultKt;
import nb2.C61646d;
import rx3.C13598b0;
import sx3.C64197v;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$onPageStartChangeListener$1$onPageStartChange$1$1", mo125469f = "MusicMvMainUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.mv.ui.uic.g */
public final class C57066g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ MusicMvMainUIC f163405d;

    /* renamed from: e */
    public final /* synthetic */ int f163406e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57066g(MusicMvMainUIC musicMvMainUIC, int i, C15601d<? super C57066g> dVar) {
        super(2, dVar);
        this.f163405d = musicMvMainUIC;
        this.f163406e = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C57066g(this.f163405d, this.f163406e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C57066g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ArrayList<C61646d> arrayList = this.f163405d.f163270g;
        int i = this.f163406e;
        int i2 = 0;
        for (T next : arrayList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C61646d dVar = (C61646d) next;
                if (Math.abs(i2 - i) > 1) {
                    dVar.f175298d.getClass();
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}
