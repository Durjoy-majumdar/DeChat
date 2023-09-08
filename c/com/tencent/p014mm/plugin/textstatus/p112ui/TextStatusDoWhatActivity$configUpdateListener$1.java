package com.tencent.p014mm.plugin.textstatus.p112ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StatusIconConfigUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$configUpdateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StatusIconConfigUpdateEvent;", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$configUpdateListener$1 */
public final class TextStatusDoWhatActivity$configUpdateListener$1 extends IListener<StatusIconConfigUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivity f206790d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusDoWhatActivity$configUpdateListener$1(TextStatusDoWhatActivity textStatusDoWhatActivity, C40008f fVar) {
        super(fVar);
        this.f206790d = textStatusDoWhatActivity;
    }

    public boolean callback(IEvent iEvent) {
        StatusIconConfigUpdateEvent statusIconConfigUpdateEvent = (StatusIconConfigUpdateEvent) iEvent;
        C87412m.m108594g(statusIconConfigUpdateEvent, "event");
        TextStatusDoWhatActivity textStatusDoWhatActivity = this.f206790d;
        ((C119157j) C119157j.f356862d).mo183895z(new C71536b(statusIconConfigUpdateEvent, textStatusDoWhatActivity));
        return false;
    }
}
