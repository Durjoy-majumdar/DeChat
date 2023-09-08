package com.tencent.p014mm.p136ui.chatting;

import android.content.Intent;
import ck3.C67391b;
import ke3.C88144b;
import zj3.C79369m;

/* renamed from: com.tencent.mm.ui.chatting.m1 */
public class C73755m1 implements C88144b.C76564c {

    /* renamed from: a */
    public final /* synthetic */ C67391b f216511a;

    public C73755m1(C67391b bVar) {
        this.f216511a = bVar;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        C79369m mVar = (C79369m) this.f216511a.f193278b.mo102812a(C79369m.class);
        if (-1 == i2 && mVar != null && mVar.mo102685p2()) {
            mVar.mo102686y3();
        }
    }
}
