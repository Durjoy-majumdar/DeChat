package com.tencent.p014mm.console;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CommandProcessorEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.console.CommandLine */
public class CommandLine extends IListener<CommandProcessorEvent> {
    public CommandLine() {
        super(C40008f.f107254d);
        this.__eventId = 1064607011;
    }

    public boolean callback(IEvent iEvent) {
        CommandProcessorEvent commandProcessorEvent = (CommandProcessorEvent) iEvent;
        CommandProcessorEvent.C67674b bVar = commandProcessorEvent.f193537e;
        CommandProcessorEvent.C67673a aVar = commandProcessorEvent.f193536d;
        bVar.f193541a = C92618a.m116695e(aVar.f193539b, aVar.f193538a, aVar.f193540c);
        return false;
    }
}
