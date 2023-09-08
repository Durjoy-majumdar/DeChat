package sj3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C45618p;
import f40.C86709a0;
import ke3.C88144b;
import nj3.C76879j;
import rb0.C48009v0;
import sb0.C48349h;
import sb0.C48365u;

/* renamed from: sj3.z */
public class C48414z implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatroomInfoUI f129596d;

    public C48414z(BizChatroomInfoUI bizChatroomInfoUI) {
        this.f129596d = bizChatroomInfoUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        BizChatroomInfoUI bizChatroomInfoUI = this.f129596d;
        int i2 = BizChatroomInfoUI.f121441H;
        bizChatroomInfoUI.getClass();
        Log.m105924i("MicroMsg.BizChatroomInfoUI", "deleteChatroom");
        C48349h yx02 = C48009v0.yx0();
        String str = bizChatroomInfoUI.f121457o;
        String str2 = bizChatroomInfoUI.f121467y.field_bizChatServId;
        yx02.getClass();
        C86709a0.m107529k().f251779b.mo123460f(new C48365u(str, str2));
        bizChatroomInfoUI.f121447F = false;
        C45618p.m50717a(bizChatroomInfoUI.f121457o, bizChatroomInfoUI.f121458p, new C48410v(bizChatroomInfoUI, C76879j.m92723Q(bizChatroomInfoUI, bizChatroomInfoUI.getString(C0966R.string.a3h), bizChatroomInfoUI.getString(C0966R.string.a4d), true, true, new C48394a0(bizChatroomInfoUI))));
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("Contact_User", bizChatroomInfoUI.f121457o);
        C88144b.m109791i(bizChatroomInfoUI.getContext(), "brandservice", ".ui.BizChatConversationUI", intent, (Bundle) null);
        bizChatroomInfoUI.finish();
    }
}
