package com.tencent.p014mm.p136ui.bizchat;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75045z;
import com.tencent.p014mm.p136ui.bizchat.BizChatConversationUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import di3.C86312j;
import eb0.C45618p;
import eb0.C97625j3;
import nj3.C11184p0;
import nj3.C76879j;
import p680ru.C77569h;
import rb0.C48009v0;
import sb0.C48327a;
import sb0.C48329b;

/* renamed from: com.tencent.mm.ui.bizchat.i */
public class C44758i implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BizChatConversationUI.BizChatConversationFmUI f121482d;

    /* renamed from: com.tencent.mm.ui.bizchat.i$a */
    public class C44759a implements Runnable {
        public C44759a() {
        }

        public void run() {
            C48009v0.Dx0().mo73031qq(C44758i.this.f121482d.f121350u);
            if (C48009v0.Dx0().mo73025bD(C44758i.this.f121482d.f121342j) <= 0) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f(C44758i.this.f121482d.f121342j);
            }
        }
    }

    public C44758i(BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI) {
        this.f121482d = bizChatConversationFmUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Class cls = C77569h.class;
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            BizChatConversationUI.BizChatConversationFmUI bizChatConversationFmUI = this.f121482d;
            long j = bizChatConversationFmUI.f121350u;
            Log.m105924i("MicroMsg.BizChatConversationFmUI", "deleteChatroom");
            C48009v0.Ax0().mo73042a0(j);
            bizChatConversationFmUI.f121346q = false;
            bizChatConversationFmUI.f121339g = C76879j.m92723Q(bizChatConversationFmUI.thisActivity(), bizChatConversationFmUI.getString(C0966R.string.a3h), bizChatConversationFmUI.getString(C0966R.string.a4d), true, true, new C44753d(bizChatConversationFmUI));
            C45618p.m50717a(bizChatConversationFmUI.f121342j, j, new C44754e(bizChatConversationFmUI, j));
        } else if (itemId == 1) {
            C48327a Yt = C48009v0.Dx0().mo73024Yt(this.f121482d.f121350u);
            Yt.field_unReadCount = 1;
            Yt.field_atCount = 0;
            Yt.field_atAll = 0;
            C48009v0.Dx0().mo73020LL(Yt);
            ((C77569h) C86312j.m106911c(cls)).mo35236XG(true, Yt.field_brandUserName, true);
        } else if (itemId == 2) {
            C48009v0.Dx0().mo73019DN(this.f121482d.f121350u);
            ((C77569h) C86312j.m106911c(cls)).mo35236XG(true, C48009v0.Dx0().mo73024Yt(this.f121482d.f121350u).field_brandUserName, false);
        } else if (itemId == 3) {
            C48327a Yt2 = C48009v0.Dx0().mo73024Yt(this.f121482d.f121350u);
            C48329b Dx0 = C48009v0.Dx0();
            if (Dx0.mo73026bF(Dx0.mo73024Yt(this.f121482d.f121350u))) {
                C48009v0.Dx0().mo73030mL(this.f121482d.f121350u);
                ((C77569h) C86312j.m106911c(cls)).mo35230Fx(true, Yt2.field_brandUserName, false);
                return;
            }
            C48009v0.Dx0().mo73029mI(this.f121482d.f121350u);
            ((C77569h) C86312j.m106911c(cls)).mo35230Fx(true, Yt2.field_brandUserName, true);
        } else if (itemId == 4) {
            C75045z.m90001b(this.f121482d.thisActivity(), new C44759a());
        }
    }
}
