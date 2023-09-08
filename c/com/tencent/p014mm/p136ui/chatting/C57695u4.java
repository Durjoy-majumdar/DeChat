package com.tencent.p014mm.p136ui.chatting;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.p136ui.chatting.view.C57702l;
import com.tencent.p014mm.storage.C72963f4;

/* renamed from: com.tencent.mm.ui.chatting.u4 */
public class C57695u4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f165133d;

    /* renamed from: e */
    public final /* synthetic */ TextPreviewUI f165134e;

    public C57695u4(TextPreviewUI textPreviewUI, C72963f4 f4Var) {
        this.f165134e = textPreviewUI;
        this.f165133d = f4Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TextPreviewUI textPreviewUI = this.f165134e;
        C72963f4 f4Var = this.f165133d;
        int i2 = TextPreviewUI.f215355E;
        C57702l lVar = new C57702l(textPreviewUI.getContext());
        lVar.f165149h = new C57696v4(textPreviewUI, lVar, f4Var);
        C104428a aVar = lVar.f165144c;
        if (aVar != null) {
            aVar.show();
        }
    }
}
