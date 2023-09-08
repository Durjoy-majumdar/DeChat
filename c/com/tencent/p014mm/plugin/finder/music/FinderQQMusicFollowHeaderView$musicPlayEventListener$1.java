package com.tencent.p014mm.plugin.finder.music;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.sdk.event.IListener;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView$musicPlayEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MusicPlayerEvent;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1 */
public final class FinderQQMusicFollowHeaderView$musicPlayEventListener$1 extends IListener<MusicPlayerEvent> {

    /* renamed from: d */
    public final /* synthetic */ FinderQQMusicFollowHeaderView f15510d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderQQMusicFollowHeaderView$musicPlayEventListener$1(FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView, C40008f fVar) {
        super(fVar);
        this.f15510d = finderQQMusicFollowHeaderView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r4.f295960e, r6) != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r6) {
        /*
            r5 = this;
            com.tencent.mm.autogen.events.MusicPlayerEvent r6 = (com.tencent.p014mm.autogen.events.MusicPlayerEvent) r6
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "event :"
            r0.append(r1)
            com.tencent.mm.autogen.events.MusicPlayerEvent$a r1 = r6.f9336d
            r2 = 0
            if (r1 == 0) goto L_0x001d
            int r1 = r1.f9337a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.QQMusicFollowHeaderView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView r0 = r5.f15510d
            com.tencent.mm.autogen.events.MusicPlayerEvent$a r6 = r6.f9336d
            if (r6 == 0) goto L_0x0037
            int r6 = r6.f9337a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0038
        L_0x0037:
            r6 = r2
        L_0x0038:
            r1 = 1
            r3 = 0
            if (r6 != 0) goto L_0x003d
            goto L_0x0076
        L_0x003d:
            int r4 = r6.intValue()
            if (r4 != 0) goto L_0x0076
            java.lang.String r6 = r0.f15502f
            java.lang.String r4 = "playId"
            gy3.C87412m.m108594g(r6, r4)
            qc0.m r4 = qc0.C101093a.m132480b()
            if (r4 == 0) goto L_0x0052
            java.lang.String r2 = r4.f295960e
        L_0x0052:
            if (r2 == 0) goto L_0x0068
            int r2 = r4.f295959d
            if (r2 != 0) goto L_0x0068
            boolean r2 = qc0.C101093a.m132481c()
            if (r2 == 0) goto L_0x0068
            java.lang.String r2 = r4.f295960e     // Catch:{ Exception -> 0x0067 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ Exception -> 0x0067 }
            if (r6 == 0) goto L_0x0068
            goto L_0x0069
        L_0x0067:
        L_0x0068:
            r1 = 0
        L_0x0069:
            if (r1 == 0) goto L_0x00a9
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = r0.f15501e
            if (r6 == 0) goto L_0x00a9
            r0 = 2131756393(0x7f100569, float:1.9143692E38)
            r6.setImageResource(r0)
            goto L_0x00a9
        L_0x0076:
            r2 = 2
            if (r6 != 0) goto L_0x007a
            goto L_0x0081
        L_0x007a:
            int r4 = r6.intValue()
            if (r4 != r2) goto L_0x0081
            goto L_0x008b
        L_0x0081:
            r2 = 3
            if (r6 != 0) goto L_0x0085
            goto L_0x008d
        L_0x0085:
            int r4 = r6.intValue()
            if (r4 != r2) goto L_0x008d
        L_0x008b:
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            if (r2 == 0) goto L_0x0091
            goto L_0x009d
        L_0x0091:
            r2 = 4
            if (r6 != 0) goto L_0x0095
            goto L_0x009c
        L_0x0095:
            int r6 = r6.intValue()
            if (r6 != r2) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r1 = 0
        L_0x009d:
            if (r1 == 0) goto L_0x00a9
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = r0.f15501e
            if (r6 == 0) goto L_0x00a9
            r0 = 2131756415(0x7f10057f, float:1.9143737E38)
            r6.setImageResource(r0)
        L_0x00a9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
