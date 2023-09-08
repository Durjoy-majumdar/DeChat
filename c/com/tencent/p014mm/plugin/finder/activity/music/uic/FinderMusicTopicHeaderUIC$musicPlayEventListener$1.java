package com.tencent.p014mm.plugin.finder.activity.music.uic;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicHeaderUIC$musicPlayEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$musicPlayEventListener$1 */
public final class FinderMusicTopicHeaderUIC$musicPlayEventListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f12484d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderMusicTopicHeaderUIC$musicPlayEventListener$1(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, C40008f fVar) {
        super(fVar);
        this.f12484d = finderMusicTopicHeaderUIC;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009e, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r2.f295960e, r7) != false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r7) {
        /*
            r6 = this;
            com.tencent.mm.autogen.events.MusicPlayerEvent r7 = (com.tencent.p014mm.autogen.events.MusicPlayerEvent) r7
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r7, r0)
            com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC r0 = r6.f12484d
            com.tencent.mm.autogen.events.MusicPlayerEvent$a r7 = r7.f9336d
            r1 = 0
            if (r7 == 0) goto L_0x0015
            int r7 = r7.f9337a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0016
        L_0x0015:
            r7 = r1
        L_0x0016:
            r2 = 2
            r3 = 1
            r4 = 0
            if (r7 != 0) goto L_0x001c
            goto L_0x0023
        L_0x001c:
            int r5 = r7.intValue()
            if (r5 != r2) goto L_0x0023
            goto L_0x002d
        L_0x0023:
            r2 = 3
            if (r7 != 0) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            int r5 = r7.intValue()
            if (r5 != r2) goto L_0x002f
        L_0x002d:
            r2 = 1
            goto L_0x0030
        L_0x002f:
            r2 = 0
        L_0x0030:
            if (r2 == 0) goto L_0x0033
            goto L_0x003d
        L_0x0033:
            r2 = 7
            if (r7 != 0) goto L_0x0037
            goto L_0x003f
        L_0x0037:
            int r5 = r7.intValue()
            if (r5 != r2) goto L_0x003f
        L_0x003d:
            r2 = 1
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            if (r2 == 0) goto L_0x0043
            goto L_0x004c
        L_0x0043:
            if (r7 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            int r2 = r7.intValue()
            if (r2 != 0) goto L_0x004e
        L_0x004c:
            r2 = 1
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            if (r2 == 0) goto L_0x0052
            goto L_0x005b
        L_0x0052:
            if (r7 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            int r2 = r7.intValue()
            if (r2 != r3) goto L_0x005d
        L_0x005b:
            r2 = 1
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r2 == 0) goto L_0x0061
            goto L_0x006b
        L_0x0061:
            r2 = 4
            if (r7 != 0) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            int r7 = r7.intValue()
            if (r7 != r2) goto L_0x006d
        L_0x006b:
            r7 = 1
            goto L_0x006e
        L_0x006d:
            r7 = 0
        L_0x006e:
            if (r7 == 0) goto L_0x00b5
            T r7 = r0.f33564d
            te3.sn1 r7 = (te3.C51270sn1) r7
            if (r7 == 0) goto L_0x0082
            te3.xd1 r7 = r7.f141636z
            if (r7 == 0) goto L_0x0082
            te3.td1 r7 = r7.f144603g
            if (r7 == 0) goto L_0x0082
            java.lang.String r7 = r7.f185534d
            if (r7 != 0) goto L_0x0084
        L_0x0082:
            java.lang.String r7 = ""
        L_0x0084:
            qc0.m r2 = qc0.C101093a.m132480b()
            if (r2 == 0) goto L_0x008c
            java.lang.String r1 = r2.f295960e
        L_0x008c:
            if (r1 == 0) goto L_0x00a2
            int r1 = r2.f295959d
            if (r1 != 0) goto L_0x00a2
            boolean r1 = qc0.C101093a.m132481c()
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = r2.f295960e     // Catch:{ Exception -> 0x00a1 }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ Exception -> 0x00a1 }
            if (r7 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a1:
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            if (r3 == 0) goto L_0x00a9
            r7 = 2131756956(0x7f10079c, float:1.9144834E38)
            goto L_0x00ac
        L_0x00a9:
            r7 = 2131756957(0x7f10079d, float:1.9144836E38)
        L_0x00ac:
            ye1.v r0 = r0.mo2214n3()
            android.widget.ImageView r0 = r0.f42995m
            r0.setImageResource(r7)
        L_0x00b5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$musicPlayEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
