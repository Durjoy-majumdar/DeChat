package i32;

import com.tencent.p014mm.autogen.events.ChattingUIExitBeginForPayEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import g32.C75846b;

/* renamed from: i32.d */
public class C33196d extends IStaticListener<ChattingUIExitBeginForPayEvent> {
    public boolean callback(IEvent iEvent) {
        ChattingUIExitBeginForPayEvent chattingUIExitBeginForPayEvent = (ChattingUIExitBeginForPayEvent) iEvent;
        Log.m105918d("LuckyChattingUIExitListener", "exit chatting ui");
        C75846b.f222485q = -1;
        return false;
    }
}
