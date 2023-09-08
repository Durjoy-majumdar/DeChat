package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import ck3.C67391b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ScrollChattingUIConversationListEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import hk3.C76227e;
import p270xi.C91212b;
import zj3.C79368l;
import zj3.C79380r0;

@C91212b(exportInterface = C79380r0.class)
/* renamed from: com.tencent.mm.ui.chatting.component.RemittanceSearchComponent */
public class RemittanceSearchComponent extends C73412a implements C79380r0 {

    /* renamed from: e */
    public long f215653e;

    /* renamed from: f */
    public IListener<ScrollChattingUIConversationListEvent> f215654f = new IListener<ScrollChattingUIConversationListEvent>(C40008f.f107254d) {
        {
            this.__eventId = -477523102;
        }

        public boolean callback(IEvent iEvent) {
            ScrollChattingUIConversationListEvent scrollChattingUIConversationListEvent = (ScrollChattingUIConversationListEvent) iEvent;
            ScrollChattingUIConversationListEvent.C67784a aVar = scrollChattingUIConversationListEvent.f193923d;
            Log.m105925i("MicroMsg.ChattingUI.RemittanceSearchComponent", "ScrollChattingUIConversationList: %s, %s", aVar.f193924a, Long.valueOf(aVar.f193925b));
            RemittanceSearchComponent remittanceSearchComponent = RemittanceSearchComponent.this;
            remittanceSearchComponent.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = currentTimeMillis - remittanceSearchComponent.f215653e < 1200;
            remittanceSearchComponent.f215653e = currentTimeMillis;
            if (!z) {
                C67391b bVar = RemittanceSearchComponent.this.f215752d;
                bVar.f193290n = true;
                ((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108214y2(scrollChattingUIConversationListEvent.f193923d.f193925b, true, false, false, 0, false, C76227e.C76228a.ACTION_POSITION);
                if (RemittanceSearchComponent.this.f215752d.mo91570k() != null) {
                    RemittanceSearchComponent.this.f215752d.mo91570k().postDelayed(new C73492h4(this), 220);
                }
            }
            return false;
        }
    };

    /* renamed from: G4 */
    public void mo26160G4() {
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
    }

    /* renamed from: e */
    public void mo70065e() {
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        this.f215654f.alive();
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        this.f215654f.dead();
        this.f215752d.f193290n = false;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        this.f215654f.dead();
        this.f215752d.f193290n = false;
    }
}
