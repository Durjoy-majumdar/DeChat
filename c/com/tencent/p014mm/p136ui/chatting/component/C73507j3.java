package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import eb0.C97625j3;

/* renamed from: com.tencent.mm.ui.chatting.component.j3 */
public class C73507j3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f215949d;

    public C73507j3(C73497i3 i3Var, String str) {
        this.f215949d = str;
    }

    public void run() {
        C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f215949d);
        if (j != null) {
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69776n0(this.f215949d, TPMediaCodecProfileLevel.HEVCHighTierLevel62, false, j.mo108819m2());
        }
    }
}
