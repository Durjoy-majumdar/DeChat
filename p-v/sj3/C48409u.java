package sj3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.bizchat.BizChatSelectConversationUI;

/* renamed from: sj3.u */
public class C48409u implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatSelectConversationUI f129588d;

    public C48409u(BizChatSelectConversationUI bizChatSelectConversationUI) {
        this.f129588d = bizChatSelectConversationUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f129588d.finish();
    }
}
