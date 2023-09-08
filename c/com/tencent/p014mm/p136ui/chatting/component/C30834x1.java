package com.tencent.p014mm.p136ui.chatting.component;

import eb0.C31519v2;
import eb0.C75597w2;

/* renamed from: com.tencent.mm.ui.chatting.component.x1 */
public class C30834x1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f82850d;

    /* renamed from: e */
    public final /* synthetic */ C75597w2.C31525a f82851e;

    public C30834x1(FootComponent footComponent, String str, C75597w2.C31525a aVar) {
        this.f82850d = str;
        this.f82851e = aVar;
    }

    public void run() {
        C31519v2.m39436a().mo55988e(this.f82850d, "", this.f82851e);
    }

    public String toString() {
        return super.toString() + "|getContactCallBack2";
    }
}
