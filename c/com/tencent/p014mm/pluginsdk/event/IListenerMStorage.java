package com.tencent.p014mm.pluginsdk.event;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.SwitcherEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.event.IListenerMStorage */
public abstract class IListenerMStorage extends IListener<MStorageNotifyEvent> {

    /* renamed from: d */
    public ArrayList<String> f120790d = new ArrayList<>(3);

    public IListenerMStorage() {
        super(C40008f.f107254d);
        this.__eventId = -400127373;
    }

    /* renamed from: f */
    public static void m48928f(String str, IListenerMStorage iListenerMStorage) {
        if (!iListenerMStorage.f120790d.contains(str)) {
            iListenerMStorage.f120790d.add(str);
        }
        iListenerMStorage.alive();
        SwitcherEvent switcherEvent = new SwitcherEvent();
        SwitcherEvent.C40174a aVar = switcherEvent.f107783d;
        aVar.f107784a = 1;
        aVar.f107785b = str;
        switcherEvent.publish();
    }

    /* renamed from: g */
    public static void m48929g(String str, IListenerMStorage iListenerMStorage) {
        SwitcherEvent switcherEvent = new SwitcherEvent();
        SwitcherEvent.C40174a aVar = switcherEvent.f107783d;
        aVar.f107784a = 2;
        aVar.f107785b = str;
        switcherEvent.publish();
        iListenerMStorage.dead();
        if (iListenerMStorage.f120790d.contains(str)) {
            iListenerMStorage.f120790d.remove(str);
        }
    }

    public boolean callback(IEvent iEvent) {
        IEvent iEvent2;
        MStorageNotifyEvent mStorageNotifyEvent = (MStorageNotifyEvent) iEvent;
        if (!(mStorageNotifyEvent instanceof MStorageNotifyEvent) || (iEvent2 = mStorageNotifyEvent.f107633d.f107634a) == null || !this.f120790d.contains(iEvent2.getClass().getName())) {
            return false;
        }
        mo25931e(mStorageNotifyEvent.f107633d.f107634a);
        return false;
    }

    /* renamed from: e */
    public abstract void mo25931e(IEvent iEvent);
}
