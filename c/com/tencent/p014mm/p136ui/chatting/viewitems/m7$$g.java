package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7$$g */
public class m7$$g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C74123m7 f217595d;

    /* renamed from: e */
    public final /* synthetic */ boolean f217596e;

    public m7$$g(C74123m7 m7Var, boolean z) {
        this.f217595d = m7Var;
        this.f217596e = z;
    }

    public boolean onPreDraw() {
        this.f217595d.f217565l.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f217595d.f217566m.setGravity((this.f217595d.f217565l.getWidth() <= this.f217595d.clickArea.getWidth() || this.f217596e) ? 3 : 5);
        return true;
    }
}
