package com.tencent.p014mm.chatroom.p015ui;

import com.tencent.p014mm.autogen.mmdata.rpt.DismissChatroomReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.chatroom.ui.ManageChatroomUI$$b */
public class ManageChatroomUI$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f108082d;

    /* renamed from: e */
    public final /* synthetic */ long f108083e;

    /* renamed from: f */
    public final /* synthetic */ ManageChatroomUI f108084f;

    public ManageChatroomUI$$b(ManageChatroomUI manageChatroomUI, long j, long j2) {
        this.f108084f = manageChatroomUI;
        this.f108082d = j;
        this.f108083e = j2;
    }

    public void run() {
        DismissChatroomReportStruct dismissChatroomReportStruct = new DismissChatroomReportStruct();
        dismissChatroomReportStruct.f107875f = this.f108082d;
        dismissChatroomReportStruct.f107876g = this.f108083e;
        ManageChatroomUI manageChatroomUI = this.f108084f;
        dismissChatroomReportStruct.f107874e = (long) manageChatroomUI.f108079p;
        dismissChatroomReportStruct.f107873d = dismissChatroomReportStruct.mo86045b("roomUsername", manageChatroomUI.f108078o, true);
        dismissChatroomReportStruct.mo86054n();
        Log.m105924i("MicroMsg.ManageChatroomUI", "24180 action = " + this.f108082d + ",code = " + this.f108083e + ",mMembersCount = " + this.f108084f.f108079p + ",mRoomId = " + this.f108084f.f108078o);
    }
}
