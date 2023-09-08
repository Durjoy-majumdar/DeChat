package com.tencent.p014mm.p136ui.conversation;

import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49148di;
import te3.C51225sc3;

/* renamed from: com.tencent.mm.ui.conversation.g1 */
public class C44988g1 implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ NewBizConversationUI f122042d;

    public C44988g1(NewBizConversationUI newBizConversationUI) {
        this.f122042d = newBizConversationUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        boolean z = true;
        Log.m105925i("MicroMsg.NewBizConversationUI", "doBizStrategy callback %d/%d %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 && i2 != 0) {
            return 0;
        }
        boolean I7 = NewBizConversationUI.m49793I7(this.f122042d);
        C49148di diVar = (C49148di) cVar.f127056b.f127083a;
        C44545a.f120794a.mo69327e(diVar.f132343p);
        boolean z2 = NewBizConversationUI.m49793I7(this.f122042d) != I7;
        C51225sc3 sc32 = diVar.f132334d;
        if (sc32 != null && !Util.isNullOrNil(sc32.f141441e)) {
            NewBizConversationUI newBizConversationUI = this.f122042d;
            int decodeInt = newBizConversationUI.f121824t.decodeInt(newBizConversationUI.mo70209L7(), 0);
            this.f122042d.f121824t.encode("PaySubscribeEntryUrl", diVar.f132334d.f141441e);
            NewBizConversationUI newBizConversationUI2 = this.f122042d;
            newBizConversationUI2.f121824t.encode(newBizConversationUI2.mo70209L7(), diVar.f132334d.f141440d);
            if (diVar.f132341n != null) {
                try {
                    NewBizConversationUI newBizConversationUI3 = this.f122042d;
                    newBizConversationUI3.f121824t.encode(newBizConversationUI3.mo70210M7(), diVar.f132341n.toByteArray());
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.NewBizConversationUI", "encode ex %s", e.getMessage());
                }
            } else {
                NewBizConversationUI newBizConversationUI4 = this.f122042d;
                newBizConversationUI4.f121824t.removeValueForKey(newBizConversationUI4.mo70210M7());
            }
            if (decodeInt == diVar.f132334d.f141440d) {
                z = z2;
            }
            if (z) {
                this.f122042d.mo70208K7();
            }
        }
        return 0;
    }
}
