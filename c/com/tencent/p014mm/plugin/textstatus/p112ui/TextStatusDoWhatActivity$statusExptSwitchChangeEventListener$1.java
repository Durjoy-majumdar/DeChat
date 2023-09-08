package com.tencent.p014mm.plugin.textstatus.p112ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StatusExptSwitchChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StatusExptSwitchChangeEvent;", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1 */
public final class TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1 extends IListener<StatusExptSwitchChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivity f206791d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextStatusDoWhatActivity$statusExptSwitchChangeEventListener$1(TextStatusDoWhatActivity textStatusDoWhatActivity, C40008f fVar) {
        super(fVar);
        this.f206791d = textStatusDoWhatActivity;
    }

    public boolean callback(IEvent iEvent) {
        StatusExptSwitchChangeEvent statusExptSwitchChangeEvent = (StatusExptSwitchChangeEvent) iEvent;
        C87412m.m108594g(statusExptSwitchChangeEvent, "event");
        String str = statusExptSwitchChangeEvent.f107773d.f107774a;
        Log.m105925i("MicroMsg.TextStatus.TextStatusDoWhatActivity", "statusExptSwitchChangeEventListener callback: %s", str);
        if (str.equals("ACTION_NEED_HANDLE_LAST_RESP")) {
            this.f206791d.f206779t = true;
        }
        return false;
    }
}
