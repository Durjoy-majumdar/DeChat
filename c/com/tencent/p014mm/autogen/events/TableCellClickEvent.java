package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TableCellClickEvent */
public final class TableCellClickEvent extends IEvent {

    /* renamed from: d */
    public C40175a f107786d = new C40175a();

    /* renamed from: com.tencent.mm.autogen.events.TableCellClickEvent$a */
    public static final class C40175a {

        /* renamed from: a */
        public String f107787a;
    }

    public TableCellClickEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TableCellClickEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107786d.f107787a, ((TableCellClickEvent) iEvent).f107786d.f107787a);
    }
}
