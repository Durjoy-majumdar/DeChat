package com.tencent.p014mm.view.manager;

import com.tencent.p014mm.view.manager.SmileyPanelManager;

/* renamed from: com.tencent.mm.view.manager.c */
public class C97338c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f285751d;

    /* renamed from: e */
    public final /* synthetic */ SmileyPanelManager.C973369 f285752e;

    public C97338c(SmileyPanelManager.C973369 r1, String str) {
        this.f285752e = r1;
        this.f285751d = str;
    }

    public void run() {
        SmileyPanelManager.this.mo136451c(this.f285751d);
    }
}
