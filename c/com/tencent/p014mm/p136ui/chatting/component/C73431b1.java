package com.tencent.p014mm.p136ui.chatting.component;

import bh3.C113177k;
import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C45628s0;
import p270xi.C53356d;

/* renamed from: com.tencent.mm.ui.chatting.component.b1 */
public final class C73431b1 extends C73412a implements C53356d {

    /* renamed from: e */
    public final String f215805e = "ChattingPermissionComponent";

    /* renamed from: f */
    public C67391b f215806f;

    /* renamed from: F4 */
    public void mo26186F4() {
        Log.m105924i(this.f215805e, "[onChattingResume]");
        Class cls = C113177k.class;
        C67391b bVar = this.f215806f;
        if (C45628s0.m50738C(bVar != null ? bVar.mo91577r() : null)) {
            ((C113177k) C86312j.m106911c(cls)).mo165716oQ(".ui.chatting.ChattingBizView");
        } else {
            ((C113177k) C86312j.m106911c(cls)).mo165716oQ(".ui.chatting.ChattingView");
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105924i(this.f215805e, "[onChattingEnterAnimStart]");
        Class cls = C113177k.class;
        C67391b bVar = this.f215806f;
        if (C45628s0.m50738C(bVar != null ? bVar.mo91577r() : null)) {
            ((C113177k) C86312j.m106911c(cls)).mo165709du(".ui.chatting.ChattingBizView");
        } else {
            ((C113177k) C86312j.m106911c(cls)).mo165709du(".ui.chatting.ChattingView");
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        this.f215806f = null;
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        this.f215806f = bVar;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105924i(this.f215805e, "[onChattingExitAnimStart]");
        Class cls = C113177k.class;
        C67391b bVar = this.f215806f;
        if (C45628s0.m50738C(bVar != null ? bVar.mo91577r() : null)) {
            ((C113177k) C86312j.m106911c(cls)).mo165697Ci(".ui.chatting.ChattingBizView");
        } else {
            ((C113177k) C86312j.m106911c(cls)).mo165697Ci(".ui.chatting.ChattingView");
        }
    }
}
