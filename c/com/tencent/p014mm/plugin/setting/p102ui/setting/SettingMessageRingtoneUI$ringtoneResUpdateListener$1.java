package com.tencent.p014mm.plugin.setting.p102ui.setting;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RingtoneResUpdateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/setting/ui/setting/SettingMessageRingtoneUI$ringtoneResUpdateListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RingtoneResUpdateEvent;", "plugin-setting_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingMessageRingtoneUI$ringtoneResUpdateListener$1 */
public final class SettingMessageRingtoneUI$ringtoneResUpdateListener$1 extends IListener<RingtoneResUpdateEvent> {

    /* renamed from: d */
    public final /* synthetic */ SettingMessageRingtoneUI f205653d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingMessageRingtoneUI$ringtoneResUpdateListener$1(SettingMessageRingtoneUI settingMessageRingtoneUI, C40008f fVar) {
        super(fVar);
        this.f205653d = settingMessageRingtoneUI;
    }

    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((RingtoneResUpdateEvent) iEvent, "event");
        Log.m105924i("MicroMsg.SettingMessageRingtoneUI", "ringtone update res");
        ((C119157j) C119157j.f356862d).mo183895z(new C71163w0(this.f205653d));
        return true;
    }
}
