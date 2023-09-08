package com.tencent.p014mm.p136ui.contact;

import android.content.DialogInterface;
import com.tencent.p014mm.p136ui.contact.SnsLabelContactListUI;

/* renamed from: com.tencent.mm.ui.contact.a4 */
public class C6878a4 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsLabelContactListUI.ReturnSnsObjectDetailEventListener f24512d;

    public C6878a4(SnsLabelContactListUI.ReturnSnsObjectDetailEventListener returnSnsObjectDetailEventListener) {
        this.f24512d = returnSnsObjectDetailEventListener;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SnsLabelContactListUI.this.finish();
    }
}
