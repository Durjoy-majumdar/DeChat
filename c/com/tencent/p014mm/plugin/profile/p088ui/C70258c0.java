package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.profile.ui.c0 */
public class C70258c0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f203011d;

    /* renamed from: e */
    public final /* synthetic */ String f203012e;

    /* renamed from: f */
    public final /* synthetic */ ContactInfoUI f203013f;

    public C70258c0(ContactInfoUI contactInfoUI, View view, String str) {
        this.f203013f = contactInfoUI;
        this.f203011d = view;
        this.f203012e = str;
    }

    public void run() {
        ContactInfoUI contactInfoUI = this.f203013f;
        View view = this.f203011d;
        c0$$a c0__a = new c0$$a(this.f203012e);
        int i = ContactInfoUI.f202514P;
        View I7 = contactInfoUI.mo96579I7(view, c0__a);
        if (I7 != null && !I7.isAccessibilityFocused()) {
            long currentTimeMillis = System.currentTimeMillis();
            ContactInfoUI contactInfoUI2 = this.f203013f;
            if (currentTimeMillis - contactInfoUI2.f202525K > 0) {
                contactInfoUI2.f202525K = System.currentTimeMillis();
                I7.sendAccessibilityEvent(128);
            }
        }
    }
}
