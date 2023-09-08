package com.tencent.p014mm.plugin.emojicapture.p841ui;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.HardCoderSystemEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$hardCoderSystemEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/HardCoderSystemEvent;", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$hardCoderSystemEventListener$1 */
public final class EmojiCaptureUI$hardCoderSystemEventListener$1 extends IListener<HardCoderSystemEvent> {

    /* renamed from: d */
    public final /* synthetic */ EmojiCaptureUI f269186d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiCaptureUI$hardCoderSystemEventListener$1(EmojiCaptureUI emojiCaptureUI, C40008f fVar) {
        super(fVar);
        this.f269186d = emojiCaptureUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r6.f269186d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.HardCoderSystemEvent r7 = (com.tencent.p014mm.autogen.events.HardCoderSystemEvent) r7
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r7, r0)
            com.tencent.mm.autogen.events.HardCoderSystemEvent$a r0 = r7.f264901d
            r1 = 0
            if (r0 == 0) goto L_0x003b
            com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI r2 = r6.f269186d
            com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer r3 = r2.f269163e
            if (r3 == 0) goto L_0x003b
            java.lang.String r2 = r2.f269162d
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r0 = r0.f264902a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r1] = r0
            boolean r0 = r3.f269238z
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5 = 1
            r4[r5] = r0
            java.lang.String r0 = "summerhardcoder system event [%s] BackCamera[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
            com.tencent.mm.autogen.events.HardCoderSystemEvent$a r7 = r7.f264901d
            int r7 = r7.f264902a
            if (r7 != r5) goto L_0x003b
            boolean r7 = r3.f269238z
            if (r7 == 0) goto L_0x003b
            r3.mo128032i()
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiCaptureUI$hardCoderSystemEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
