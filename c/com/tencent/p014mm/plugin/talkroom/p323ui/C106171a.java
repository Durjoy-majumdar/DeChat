package com.tencent.p014mm.plugin.talkroom.p323ui;

import com.tencent.p014mm.plugin.talkroom.p323ui.TalkRoomAvatarsFrame;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.a */
public class C106171a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TalkRoomAvatarsFrame.C106169a f316333d;

    public C106171a(TalkRoomAvatarsFrame.C106169a aVar) {
        this.f316333d = aVar;
    }

    public void run() {
        TalkRoomAvatarsFrame.this.f316327f.notifyDataSetChanged();
    }
}
