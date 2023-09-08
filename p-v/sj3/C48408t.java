package sj3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.bizchat.BizChatSelectConversationUI;
import eb0.C97625j3;
import sb0.C48359n;

/* renamed from: sj3.t */
public class C48408t implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C48359n f129587d;

    public C48408t(BizChatSelectConversationUI bizChatSelectConversationUI, C48359n nVar) {
        this.f129587d = nVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f129587d);
    }
}
