package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent */
public final class WalletReceiveLuckyMoneyAppMsgEvent extends IEvent {

    /* renamed from: d */
    public C67830a f194099d = new C67830a();

    /* renamed from: com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent$a */
    public static final class C67830a {

        /* renamed from: a */
        public String f194100a;

        /* renamed from: b */
        public String f194101b;

        /* renamed from: c */
        public long f194102c;
    }

    public WalletReceiveLuckyMoneyAppMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WalletReceiveLuckyMoneyAppMsgEvent)) {
            return false;
        }
        C67830a aVar = ((WalletReceiveLuckyMoneyAppMsgEvent) iEvent).f194099d;
        return C46238a.m51546a(this.f194099d.f194100a, aVar.f194100a) && C46238a.m51546a(this.f194099d.f194101b, aVar.f194101b) && C46238a.m51546a(Long.valueOf(this.f194099d.f194102c), Long.valueOf(aVar.f194102c));
    }
}
