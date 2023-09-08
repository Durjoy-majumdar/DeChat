package com.tencent.p014mm.pluginsdk.event;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NetSceneResponseEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.event.IListenerNetScene */
public abstract class IListenerNetScene extends IListener<NetSceneResponseEvent> {

    /* renamed from: d */
    public ArrayList<String> f120791d = new ArrayList<>(3);

    public IListenerNetScene(int i) {
        super(C40008f.f107254d, i);
        this.__eventId = 949432826;
    }

    public boolean callback(IEvent iEvent) {
        IEvent iEvent2;
        NetSceneResponseEvent netSceneResponseEvent = (NetSceneResponseEvent) iEvent;
        if (!(netSceneResponseEvent instanceof NetSceneResponseEvent) || (iEvent2 = netSceneResponseEvent.f107652d.f107656d) == null || !this.f120791d.contains(iEvent2.getClass().getName())) {
            return false;
        }
        NetSceneResponseEvent.C40142a aVar = netSceneResponseEvent.f107652d;
        mo69319e(aVar.f107653a, aVar.f107654b, aVar.f107655c, aVar.f107656d);
        return false;
    }

    /* renamed from: e */
    public abstract void mo69319e(int i, int i2, String str, IEvent iEvent);
}
