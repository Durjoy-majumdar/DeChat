package sj3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.UpdateSearchIndexAtOnceEvent;
import com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;
import rb0.C48009v0;
import sb0.C48334c;
import te3.C51960xe;

/* renamed from: sj3.y */
public class C48413y implements C76879j.C47267l {

    /* renamed from: a */
    public final /* synthetic */ String f129594a;

    /* renamed from: b */
    public final /* synthetic */ BizChatroomInfoUI f129595b;

    public C48413y(BizChatroomInfoUI bizChatroomInfoUI, String str) {
        this.f129595b = bizChatroomInfoUI;
        this.f129594a = str;
    }

    public boolean onFinish(CharSequence charSequence) {
        BizChatroomInfoUI bizChatroomInfoUI = this.f129595b;
        String str = this.f129594a;
        int i = BizChatroomInfoUI.f121441H;
        bizChatroomInfoUI.getClass();
        String trim = charSequence == null ? "" : charSequence.toString().trim();
        if (trim.equals(str)) {
            Log.m105918d("MicroMsg.BizChatroomInfoUI", "same room name return");
            return true;
        } else if (trim.length() == 0) {
            C76879j.m92726T(bizChatroomInfoUI.getContext(), bizChatroomInfoUI.getString(C0966R.string.i5v));
            return false;
        } else {
            new UpdateSearchIndexAtOnceEvent().publish();
            C48334c cVar = bizChatroomInfoUI.f121467y;
            bizChatroomInfoUI.f121459q = cVar.field_chatName;
            bizChatroomInfoUI.f121466x = cVar.field_bitFlag;
            cVar.field_chatName = trim;
            C48009v0.Ax0().mo73040Ow(bizChatroomInfoUI.f121467y);
            C51960xe xeVar = new C51960xe();
            xeVar.f144611d = bizChatroomInfoUI.f121467y.field_bizChatServId;
            xeVar.f144614g = trim;
            xeVar.f144616i = bizChatroomInfoUI.f121466x;
            C48009v0.yx0().mo73067m(bizChatroomInfoUI.f121467y.field_brandUserName, xeVar, bizChatroomInfoUI);
            bizChatroomInfoUI.mo70006M7();
            bizChatroomInfoUI.f121450e.notifyDataSetChanged();
            return true;
        }
    }
}
