package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineMusicImp */
public class BizTimeLineMusicImp {

    /* renamed from: a */
    public C92953s4 f267710a;

    /* renamed from: b */
    public IListener f267711b = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1155728636;
        }

        public boolean callback(IEvent iEvent) {
            int i = ((MusicPlayerEvent) iEvent).f9336d.f9337a;
            if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 7) {
                return false;
            }
            BizTimeLineMusicImp.this.f267710a.mo22778D4();
            return false;
        }
    };

    public BizTimeLineMusicImp(C92953s4 s4Var) {
        this.f267710a = s4Var;
    }
}
