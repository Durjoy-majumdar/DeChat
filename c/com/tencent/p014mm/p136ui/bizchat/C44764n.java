package com.tencent.p014mm.p136ui.bizchat;

import com.tencent.p014mm.p136ui.bizchat.BizChatSearchUI;
import eb0.C97625j3;
import sb0.C48358l;

/* renamed from: com.tencent.mm.ui.bizchat.n */
public class C44764n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f121489d;

    /* renamed from: e */
    public final /* synthetic */ BizChatSearchUI.C44737c f121490e;

    public C44764n(BizChatSearchUI.C44737c cVar, String str) {
        this.f121490e = cVar;
        this.f121489d = str;
    }

    public void run() {
        if (this.f121489d.equals(this.f121490e.f121400g)) {
            C97625j3.m125815e().mo123460f(new C48358l(this.f121490e.f121397d, this.f121489d, 0, (Object) null));
        }
    }
}
