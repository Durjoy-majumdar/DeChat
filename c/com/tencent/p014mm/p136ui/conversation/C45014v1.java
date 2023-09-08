package com.tencent.p014mm.p136ui.conversation;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.conversation.OpenImKefuServiceConversationUI;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import fn3.C45804b;
import g62.C32330n;
import he0.C46021h;
import nj3.C76879j;
import tc0.C77885p;
import te3.C50904q20;
import te3.C51163rv3;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.v1 */
public final class C45014v1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f122107d;

    /* renamed from: e */
    public final /* synthetic */ OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI f122108e;

    /* renamed from: com.tencent.mm.ui.conversation.v1$a */
    public static final class C30854a implements Runnable {

        /* renamed from: d */
        public static final C30854a f82882d = new C30854a();

        public final void run() {
            ((C46021h) C86312j.m106911c(C46021h.class)).Dd0((C72976h2) null);
        }
    }

    public C45014v1(String str, OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI) {
        this.f122107d = str;
        this.f122108e = openImKefuServiceConversationFmUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C45804b.m51082a(2, this.f122107d, this.f122108e.f121858i);
        OpenImKefuServiceConversationUI.OpenImKefuServiceConversationFmUI openImKefuServiceConversationFmUI = this.f122108e;
        String str = this.f122107d;
        openImKefuServiceConversationFmUI.getClass();
        C72963f4 Rx0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(str);
        C50904q20 q202 = new C50904q20();
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = str;
        rv32.f141176e = true;
        q202.f140097d = rv32;
        q202.f140099f = Rx0.mo108774y2();
        ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(8, q202));
        openImKefuServiceConversationFmUI.f121859j = false;
        C75604z3.m90836h(str, new C45002r1(openImKefuServiceConversationFmUI, C76879j.m92723Q(openImKefuServiceConversationFmUI.thisActivity(), openImKefuServiceConversationFmUI.getString(C0966R.string.a3h), openImKefuServiceConversationFmUI.getString(C0966R.string.a4d), true, true, new C45007s1(openImKefuServiceConversationFmUI))));
        ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(this.f122107d);
        ((C119157j) C119157j.f356862d).mo183875f(C30854a.f82882d);
    }
}
