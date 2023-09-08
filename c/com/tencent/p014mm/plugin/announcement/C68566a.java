package com.tencent.p014mm.plugin.announcement;

import qo3.C47883u;

/* renamed from: com.tencent.mm.plugin.announcement.a */
public class C68566a implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ int f196991a;

    /* renamed from: b */
    public final /* synthetic */ ChatroomNoticeUI f196992b;

    public C68566a(ChatroomNoticeUI chatroomNoticeUI, int i) {
        this.f196992b = chatroomNoticeUI;
        this.f196991a = i;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        ChatroomNoticeUI chatroomNoticeUI = this.f196992b;
        int i = ChatroomNoticeUI.f196934x0;
        if (chatroomNoticeUI.f196948Y) {
            chatroomNoticeUI.enableOptionMenu(true);
        } else {
            chatroomNoticeUI.enableOptionMenu(false);
        }
        this.f196992b.mo94190g8(this.f196991a == 5 ? 9 : 7);
    }
}
