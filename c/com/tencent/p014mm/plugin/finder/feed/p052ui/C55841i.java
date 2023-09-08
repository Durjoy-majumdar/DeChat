package com.tencent.p014mm.plugin.finder.feed.p052ui;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import qk1.C63226j0;
import rx3.C13598b0;
import te3.C64693s21;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.i */
public final class C55841i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorCommentManagerUI f159050d;

    /* renamed from: e */
    public final /* synthetic */ LinkedList<C64693s21> f159051e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55841i(FinderLiveAnchorCommentManagerUI finderLiveAnchorCommentManagerUI, LinkedList<C64693s21> linkedList) {
        super(0);
        this.f159050d = finderLiveAnchorCommentManagerUI;
        this.f159051e = linkedList;
    }

    public Object invoke() {
        C63226j0 j0Var = this.f159050d.f158937t;
        if (j0Var != null) {
            j0Var.mo88135G4(this.f159051e);
            return C13598b0.f38549a;
        }
        C87412m.m108603p("adapter");
        throw null;
    }
}
