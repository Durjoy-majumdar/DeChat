package sj3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI;

/* renamed from: sj3.a0 */
public class C48394a0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ BizChatroomInfoUI f129540d;

    public C48394a0(BizChatroomInfoUI bizChatroomInfoUI) {
        this.f129540d = bizChatroomInfoUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f129540d.f121447F = true;
    }
}
