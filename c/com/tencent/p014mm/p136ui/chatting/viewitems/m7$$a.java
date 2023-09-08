package com.tencent.p014mm.p136ui.chatting.viewitems;

import hd0.C98408n0;
import hd0.C98429r0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m7$$a */
public final /* synthetic */ class m7$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98408n0 f217582d;

    /* renamed from: e */
    public final /* synthetic */ C74123m7 f217583e;

    public /* synthetic */ m7$$a(C98408n0 n0Var, C74123m7 m7Var) {
        this.f217582d = n0Var;
        this.f217583e = m7Var;
    }

    public final void run() {
        C98408n0 n0Var = this.f217582d;
        C74123m7 m7Var = this.f217583e;
        int n = C98429r0.m127823n(n0Var);
        ((C119157j) C119157j.f356862d).mo183895z(new m7$$c(m7Var, n));
    }
}
