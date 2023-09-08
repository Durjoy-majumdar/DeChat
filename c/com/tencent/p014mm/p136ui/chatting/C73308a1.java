package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.storage.C72963f4;
import f40.C86709a0;
import hd0.C76151b1;
import hd0.C98398h0;
import hd0.C98447z0;

/* renamed from: com.tencent.mm.ui.chatting.a1 */
public class C73308a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f215411d;

    /* renamed from: e */
    public final /* synthetic */ String f215412e;

    public C73308a1(C72963f4 f4Var, String str) {
        this.f215411d = f4Var;
        this.f215412e = str;
    }

    public void run() {
        C98447z0 Dx0 = C98398h0.Dx0();
        String s2 = this.f215411d.mo108765s2();
        Dx0.f288768x.put(s2, new C74343y0.C74345b(this.f215412e, this.f215411d));
        C86709a0.m107525e().postToWorker(new C76151b1(Dx0, s2, 3));
    }
}
