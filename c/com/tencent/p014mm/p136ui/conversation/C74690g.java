package com.tencent.p014mm.p136ui.conversation;

import android.content.DialogInterface;
import com.tencent.p014mm.pointers.PBool;

/* renamed from: com.tencent.mm.ui.conversation.g */
public class C74690g implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ PBool f219584d;

    public C74690g(PBool pBool) {
        this.f219584d = pBool;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f219584d.value = true;
    }
}
