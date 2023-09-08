package com.tencent.p014mm.p136ui;

import android.view.View;
import pj3.C47510b;
import yl3.C53534a;

/* renamed from: com.tencent.mm.ui.c4 */
public class C44765c4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f121491d;

    /* renamed from: e */
    public final /* synthetic */ SingleChatInfoUI f121492e;

    public C44765c4(SingleChatInfoUI singleChatInfoUI, int i) {
        this.f121492e = singleChatInfoUI;
        this.f121491d = i;
    }

    public void run() {
        SingleChatInfoUI singleChatInfoUI = this.f121492e;
        View v = ((C47510b) singleChatInfoUI.f121193d).mo72518v(this.f121491d, singleChatInfoUI.getListView());
        if (v != null) {
            C53534a.m60078a(this.f121492e.getContext(), v);
        }
    }
}
