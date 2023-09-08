package com.tencent.p014mm.plugin.profile.p088ui;

import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$e */
public class ContactInfoUI$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContactInfoUI f202551d;

    public ContactInfoUI$$e(ContactInfoUI contactInfoUI) {
        this.f202551d = contactInfoUI;
    }

    public void run() {
        PullDownListView pullDownListView = this.f202551d.f202541s;
        if (pullDownListView != null && !pullDownListView.f220631I) {
            pullDownListView.mo104539o();
        }
    }
}
