package hr1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59671p2;

/* renamed from: hr1.h */
public final class C60144h implements C59671p2 {

    /* renamed from: d */
    public final /* synthetic */ FinderMultiFlowVideoAutoPlayManager f171681d;

    /* renamed from: e */
    public final /* synthetic */ long f171682e;

    /* renamed from: f */
    public final /* synthetic */ FinderVideoLayout f171683f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16631z f171684g;

    /* renamed from: h */
    public final /* synthetic */ BaseFinderFeed f171685h;

    public C60144h(FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager, long j, FinderVideoLayout finderVideoLayout, RecyclerView.C16631z zVar, BaseFinderFeed baseFinderFeed) {
        this.f171681d = finderMultiFlowVideoAutoPlayManager;
        this.f171682e = j;
        this.f171683f = finderVideoLayout;
        this.f171684g = zVar;
        this.f171685h = baseFinderFeed;
    }

    /* renamed from: K2 */
    public void mo5164K2(long j, long j2) {
    }

    public boolean equals(Object obj) {
        return true;
    }

    public int hashCode() {
        return hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005f, code lost:
        r2 = r2.mo12855k3(-1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onVideoPause() {
        /*
            r13 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager r2 = r13.f171681d
            java.util.HashMap<java.lang.Long, java.lang.Long> r2 = r2.f161946o
            long r3 = r13.f171682e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.remove(r3)
            java.lang.Long r2 = (java.lang.Long) r2
            r3 = 0
            if (r2 != 0) goto L_0x001c
            java.lang.Long r2 = java.lang.Long.valueOf(r3)
        L_0x001c:
            long r5 = r2.longValue()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0025
            return
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "[onVideoPause] autoplay_duration="
            r2.append(r7)
            long r0 = r0 - r5
            r2.append(r0)
            java.lang.String r5 = "ms "
            r2.append(r5)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r5 = r13.f171683f
            java.lang.String r5 = r5.getFTPPTag()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "Finder.MultiFlowVideoAutoPlayManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            rs1.s8$a r2 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r5 = r13.f171683f
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "videoLayout.context"
            gy3.C87412m.m108593f(r5, r6)
            rs1.s8 r2 = r2.mo12873f(r5)
            r5 = 0
            if (r2 == 0) goto L_0x0069
            r6 = -1
            dp1.t r2 = r2.mo12855k3(r6)
            if (r2 == 0) goto L_0x0069
            te3.hj1 r2 = r2.f167327h
            goto L_0x006a
        L_0x0069:
            r2 = r5
        L_0x006a:
            java.lang.Class<l31.e> r6 = l31.C61212e.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            l31.e r6 = (l31.C61212e) r6
            androidx.recyclerview.widget.RecyclerView$z r7 = r13.f171684g
            android.view.View r7 = r7.f44854d
            r8 = 7
            rx3.l[] r8 = new rx3.C13604l[r8]
            r9 = 0
            rx3.l r10 = new rx3.l
            java.lang.String r11 = "view_id"
            java.lang.String r12 = "care_feed_card"
            r10.<init>(r11, r12)
            r8[r9] = r10
            r9 = 1
            if (r2 == 0) goto L_0x008c
            java.lang.String r10 = r2.f134672f
            goto L_0x008d
        L_0x008c:
            r10 = r5
        L_0x008d:
            rx3.l r11 = new rx3.l
            java.lang.String r12 = "finder_tab_context_id"
            r11.<init>(r12, r10)
            r8[r9] = r11
            r9 = 2
            if (r2 == 0) goto L_0x009c
            java.lang.String r10 = r2.f134671e
            goto L_0x009d
        L_0x009c:
            r10 = r5
        L_0x009d:
            rx3.l r11 = new rx3.l
            java.lang.String r12 = "finder_context_id"
            r11.<init>(r12, r10)
            r8[r9] = r11
            r9 = 3
            if (r2 == 0) goto L_0x00ac
            java.lang.String r10 = r2.f134670d
            goto L_0x00ad
        L_0x00ac:
            r10 = r5
        L_0x00ad:
            rx3.l r11 = new rx3.l
            java.lang.String r12 = "behaviour_session_id"
            r11.<init>(r12, r10)
            r8[r9] = r11
            r9 = 4
            if (r2 == 0) goto L_0x00bf
            int r2 = r2.f134675i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
        L_0x00bf:
            rx3.l r2 = new rx3.l
            java.lang.String r10 = "comment_scene"
            r2.<init>(r10, r5)
            r8[r9] = r2
            r2 = 5
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = r13.f171685h
            if (r5 == 0) goto L_0x00d1
            long r3 = r5.getItemId()
        L_0x00d1:
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            rx3.l r4 = new rx3.l
            java.lang.String r5 = "feed_id"
            r4.<init>(r5, r3)
            r8[r2] = r4
            r2 = 6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            rx3.l r1 = new rx3.l
            java.lang.String r3 = "autoplay_duration"
            r1.<init>(r3, r0)
            r8[r2] = r1
            java.util.Map r0 = sx3.C90364q0.m113147f(r8)
            r1 = 25496(0x6398, float:3.5728E-41)
            java.lang.String r2 = "exit_autoplay"
            r6.mo86153W7(r2, r7, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr1.C60144h.onVideoPause():void");
    }

    public void onVideoPlay() {
        if (!this.f171681d.f161946o.containsKey(Long.valueOf(this.f171682e))) {
            Log.m105924i("Finder.MultiFlowVideoAutoPlayManager", "[onVideoPlay] " + this.f171683f.getFTPPTag());
            this.f171681d.f161946o.put(Long.valueOf(this.f171682e), Long.valueOf(System.currentTimeMillis()));
        }
    }
}
