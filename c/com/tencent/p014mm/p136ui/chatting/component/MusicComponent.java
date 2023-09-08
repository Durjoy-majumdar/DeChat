package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import p270xi.C53356d;

/* renamed from: com.tencent.mm.ui.chatting.component.MusicComponent */
public class MusicComponent extends C73412a implements C53356d {

    /* renamed from: e */
    public String f121539e = null;

    /* renamed from: f */
    public IListener f121540f = new IListener<MusicPlayerEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1155728636;
        }

        public boolean callback(IEvent iEvent) {
            C67391b bVar;
            int i = ((MusicPlayerEvent) iEvent).f9336d.f9337a;
            if ((i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 7) || (bVar = MusicComponent.this.f215752d) == null) {
                return false;
            }
            bVar.mo91540A();
            return false;
        }
    };

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = qc0.C101093a.m132480b();
     */
    /* renamed from: g5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo70046g5() {
        /*
            r3 = this;
            com.tencent.mm.sdk.event.IListener r0 = r3.f121540f
            r0.alive()
            boolean r0 = qc0.C101093a.m132481c()
            if (r0 == 0) goto L_0x0014
            qc0.m r0 = qc0.C101093a.m132480b()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.f295960e
            goto L_0x0016
        L_0x0014:
            java.lang.String r0 = ""
        L_0x0016:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = r3.f121539e
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0034
        L_0x0024:
            java.lang.String r1 = r3.f121539e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = r3.f121539e
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x004d
        L_0x0034:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            java.lang.String r2 = r3.f121539e
            r1[r0] = r2
            java.lang.String r0 = "MicroMsg.MusicComponent"
            java.lang.String r2 = "onChattingEnterAnimEnd playingMsgId: %s, last: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            ck3.b r0 = r3.f215752d
            if (r0 == 0) goto L_0x004d
            r0.mo91540A()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.MusicComponent.mo70046g5():void");
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        this.f121540f.dead();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = qc0.C101093a.m132480b();
     */
    /* renamed from: u5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26170u5() {
        /*
            r1 = this;
            com.tencent.mm.sdk.event.IListener r0 = r1.f121540f
            r0.dead()
            boolean r0 = qc0.C101093a.m132481c()
            if (r0 == 0) goto L_0x0014
            qc0.m r0 = qc0.C101093a.m132480b()
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r0.f295960e
            goto L_0x0016
        L_0x0014:
            java.lang.String r0 = ""
        L_0x0016:
            r1.f121539e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.MusicComponent.mo26170u5():void");
    }
}
