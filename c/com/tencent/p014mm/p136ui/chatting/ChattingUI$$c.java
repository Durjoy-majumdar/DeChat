package com.tencent.p014mm.p136ui.chatting;

import p903ij.C76359b;
import wc3.C78538u;

/* renamed from: com.tencent.mm.ui.chatting.ChattingUI$$c */
public class ChattingUI$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChattingUI f215284d;

    public ChattingUI$$c(ChattingUI chattingUI) {
        this.f215284d = chattingUI;
    }

    public void run() {
        ChattingUI chattingUI = this.f215284d;
        ChattingUIFragment chattingUIFragment = chattingUI.f215277j;
        if (chattingUIFragment != null) {
            C78538u.m94869e(chattingUI, chattingUIFragment.getBodyView());
        }
        C76359b.m91788e(this.f215284d.f215277j.getContext());
    }
}
