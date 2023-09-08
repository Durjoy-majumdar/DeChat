package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.chatroom.ui.b0 */
public class C67951b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatroomInfoUI f195067d;

    public C67951b0(ChatroomInfoUI chatroomInfoUI) {
        this.f195067d = chatroomInfoUI;
    }

    public void run() {
        ChatroomInfoUI chatroomInfoUI = this.f195067d;
        if (chatroomInfoUI.f194795h != null) {
            chatroomInfoUI.f194790W = chatroomInfoUI.getListView().getTranscriptMode();
            chatroomInfoUI.getListView().setTranscriptMode(2);
            chatroomInfoUI.f194795h.notifyDataSetChanged();
            MTimerHandler mTimerHandler = chatroomInfoUI.f194789V;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            MTimerHandler mTimerHandler2 = new MTimerHandler(new C67952c0(chatroomInfoUI, "room_notify_new_msg"), true);
            chatroomInfoUI.f194789V = mTimerHandler2;
            mTimerHandler2.startTimer(5);
        }
        this.f195067d.f194779K = true;
    }
}
