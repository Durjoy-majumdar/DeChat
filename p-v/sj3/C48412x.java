package sj3;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.bizchat.BizChatroomInfoUI;
import eb0.C97625j3;
import sb0.C48359n;

/* renamed from: sj3.x */
public class C48412x implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C48359n f129593d;

    public C48412x(BizChatroomInfoUI bizChatroomInfoUI, C48359n nVar) {
        this.f129593d = nVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C97625j3.m125815e().mo123458d(this.f129593d);
    }
}
