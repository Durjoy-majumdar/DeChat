package com.tencent.p014mm.p136ui.contact;

import android.view.ViewGroup;

/* renamed from: com.tencent.mm.ui.contact.t3 */
public class C74567t3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SelectContactUI f219180d;

    public C74567t3(SelectContactUI selectContactUI) {
        this.f219180d = selectContactUI;
    }

    public void run() {
        int height = this.f219180d.f218768Z.getHeight();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f219180d.f218605d.getLayoutParams();
        marginLayoutParams.bottomMargin = height;
        this.f219180d.f218605d.setLayoutParams(marginLayoutParams);
    }
}
