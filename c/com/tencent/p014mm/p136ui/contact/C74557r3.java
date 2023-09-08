package com.tencent.p014mm.p136ui.contact;

import android.content.DialogInterface;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.ui.contact.r3 */
public class C74557r3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LinkedList f219156d;

    /* renamed from: e */
    public final /* synthetic */ SelectContactUI f219157e;

    public C74557r3(SelectContactUI selectContactUI, LinkedList linkedList) {
        this.f219157e = selectContactUI;
        this.f219156d = linkedList;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SelectContactUI.m88929j8(this.f219157e, this.f219156d);
    }
}
