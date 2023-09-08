package com.tencent.p014mm.plugin.announcement;

import androidx.core.widget.NestedScrollView;

/* renamed from: com.tencent.mm.plugin.announcement.d */
public class C68570d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NestedScrollView f196996d;

    /* renamed from: e */
    public final /* synthetic */ ChatroomNoticeUI f196997e;

    public C68570d(ChatroomNoticeUI chatroomNoticeUI, NestedScrollView nestedScrollView) {
        this.f196997e = chatroomNoticeUI;
        this.f196996d = nestedScrollView;
    }

    public void run() {
        this.f196997e.f196938N.setVisibility(8);
        this.f196996d.setScrollY(0);
        ChatroomNoticeUI chatroomNoticeUI = this.f196997e;
        chatroomNoticeUI.f196946W = true;
        chatroomNoticeUI.mo127489X7(true);
    }
}
