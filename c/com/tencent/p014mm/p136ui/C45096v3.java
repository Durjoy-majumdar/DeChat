package com.tencent.p014mm.p136ui;

import js0.C9514m;

/* renamed from: com.tencent.mm.ui.v3 */
public class C45096v3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C45098w3 f122330d;

    public C45096v3(C45098w3 w3Var) {
        this.f122330d = w3Var;
    }

    public void run() {
        C9514m<Boolean> mVar = this.f122330d.f122331a.f121203q;
        if (!(mVar == null || mVar.f29691a == null)) {
            this.f122330d.f122331a.f121199j.edit().putBoolean("room_add_blacklist", ((Boolean) this.f122330d.f122331a.f121203q.f29691a).booleanValue()).commit();
        }
        this.f122330d.f122331a.f121193d.notifyDataSetChanged();
    }
}
