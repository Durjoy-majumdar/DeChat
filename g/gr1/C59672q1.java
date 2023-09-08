package gr1;

import cm1.C55015f1;
import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import df1.C58259c;
import dp1.C58354a2;
import dp1.C58356b0;
import eb0.C31543z5;
import gy3.C87412m;
import he1.C59869v;
import mr1.C61575s;
import mr1.C61576t;
import os1.C62168u;
import pl1.C62367r0;
import qt1.C12931a;
import rx3.C13598b0;
import te3.C64689rq2;
import wp1.C66167g;

/* renamed from: gr1.q1 */
public final class C59672q1 implements C59684w2 {

    /* renamed from: a */
    public final /* synthetic */ FinderVideoLayout f170490a;

    public C59672q1(FinderVideoLayout finderVideoLayout) {
        this.f170490a = finderVideoLayout;
    }

    /* renamed from: b */
    public void mo78295b(float f) {
        C59869v bulletLifecycle = this.f170490a.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.mo78295b(f);
        }
        C59667n2 seekBarLayout = this.f170490a.getSeekBarLayout();
        if (seekBarLayout != null) {
            seekBarLayout.mo4239b(f);
        }
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [gr1.o2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78294c(te3.C64689rq2 r12, int r13, int r14) {
        /*
            r11 = this;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r11.f170490a
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r0 = r0.getPlayInfo()
            if (r0 == 0) goto L_0x00f7
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = r11.f170490a
            gr1.o2 r2 = r1.getVideoView()
            r3 = 0
            if (r2 == 0) goto L_0x0016
            int r2 = r2.getCurrentPlaySecond()
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            df1.c$b r4 = r1.getVideoPlayBehavior()
            if (r4 == 0) goto L_0x002c
            com.tencent.mm.plugin.finder.storage.FeedData r5 = r0.f161892a
            long r5 = r5.getExpectId()
            pl1.r0 r10 = r0.f161894c
            te3.rq2 r7 = r10.f177253e
            r8 = r13
            r9 = r14
            r4.mo83034s(r5, r7, r8, r9, r10)
        L_0x002c:
            r4 = 20
            r5 = 1
            if (r13 < r4) goto L_0x004b
            gr1.n2 r4 = r1.getSeekBarLayout()
            if (r4 == 0) goto L_0x003f
            boolean r4 = r4.mo4240d()
            if (r4 != 0) goto L_0x003f
            r4 = 1
            goto L_0x0040
        L_0x003f:
            r4 = 0
        L_0x0040:
            if (r4 == 0) goto L_0x004b
            gr1.n2 r4 = r1.getSeekBarLayout()
            if (r4 == 0) goto L_0x004b
            r4.mo4262l(r3)
        L_0x004b:
            te3.jr2 r4 = r0.f161901j
            if (r4 == 0) goto L_0x009b
            int r6 = r4.f183833g
            if (r6 <= 0) goto L_0x005b
            int r7 = r4.f183832f
            if (r7 < 0) goto L_0x005b
            if (r6 <= r7) goto L_0x005b
            r6 = 1
            goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            r7 = 0
            if (r6 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r4 = r7
        L_0x0061:
            if (r4 == 0) goto L_0x009b
            int r4 = r4.f183833g
            int r4 = r4 / 1000
            if (r2 < r4) goto L_0x009b
            gr1.o2 r4 = r1.getVideoView()
            boolean r6 = r4 instanceof com.tencent.p014mm.plugin.finder.video.FinderCropVideoView
            if (r6 == 0) goto L_0x0074
            r7 = r4
            com.tencent.mm.plugin.finder.video.FinderCropVideoView r7 = (com.tencent.p014mm.plugin.finder.video.FinderCropVideoView) r7
        L_0x0074:
            if (r7 == 0) goto L_0x007f
            r8 = 0
            com.tencent.mm.pluginsdk.ui.tools.r0 r4 = r7.f283595q
            if (r4 == 0) goto L_0x007f
            r4.mo24787a(r8, r5)
        L_0x007f:
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent r4 = new com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent
            r4.<init>()
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r6 = r4.f9160d
            r6.f9162b = r5
            com.tencent.mm.plugin.finder.storage.FeedData r7 = r0.f161892a
            long r7 = r7.getLocalId()
            r6.f9161a = r7
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r6 = r4.f9160d
            r6.f9164d = r5
            int r7 = r1.f161851G
            r6.f9165e = r7
            r4.publish()
        L_0x009b:
            if (r12 == 0) goto L_0x00a4
            int r4 = r12.f185277q
            r6 = 3
            if (r4 != r6) goto L_0x00a4
            r4 = 1
            goto L_0x00a5
        L_0x00a4:
            r4 = 0
        L_0x00a5:
            if (r4 != 0) goto L_0x00f2
            up1.f r4 = up1.C37521f.f99374d
            int r4 = r4.mo61151E()
            rx3.g r6 = up1.C37521f.f99210K
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int r4 = r4 - r6
            if (r2 != r4) goto L_0x00f2
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent r2 = new com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent
            r2.<init>()
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r4 = r2.f9160d
            com.tencent.mm.plugin.finder.storage.FeedData r6 = r0.f161892a
            long r6 = r6.getLocalId()
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x00d2
            r3 = 1
        L_0x00d2:
            r4.f9162b = r3
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r3 = r2.f9160d
            boolean r4 = r3.f9162b
            if (r4 == 0) goto L_0x00e1
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f161892a
            long r4 = r0.getLocalId()
            goto L_0x00e7
        L_0x00e1:
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f161892a
            long r4 = r0.getFeedId()
        L_0x00e7:
            r3.f9161a = r4
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r0 = r2.f9160d
            int r3 = r1.f161851G
            r0.f9165e = r3
            r2.publish()
        L_0x00f2:
            r2 = -1
            r1.mo79548O(r2, r2)
        L_0x00f7:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r11.f170490a
            he1.v r0 = r0.getBulletLifecycle()
            if (r0 == 0) goto L_0x0102
            r0.mo78294c(r12, r13, r14)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C59672q1.mo78294c(te3.rq2, int, int):void");
    }

    /* renamed from: d */
    public void mo78296d(C64689rq2 rq22, long j, long j2) {
        FinderVideoLayout.C56521b playInfo = this.f170490a.getPlayInfo();
        if (playInfo != null) {
            FinderVideoLayout finderVideoLayout = this.f170490a;
            finderVideoLayout.mo79548O(j, j2);
            C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                long expectId = playInfo.f161892a.getExpectId();
                C62367r0 r0Var = playInfo.f161894c;
                videoPlayBehavior.mo83031p(expectId, r0Var.f177253e, (int) j, (int) j2, r0Var);
            }
        }
        C59869v bulletLifecycle = this.f170490a.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.mo78296d(rq22, j, j2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [gr1.o2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo77475e(te3.C64689rq2 r11) {
        /*
            r10 = this;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r10.f170490a
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r0 = r0.getPlayInfo()
            if (r0 == 0) goto L_0x00ba
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = r10.f170490a
            df1.c$b r2 = r1.getVideoPlayBehavior()
            if (r2 == 0) goto L_0x001f
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r0.f161892a
            long r3 = r3.getExpectId()
            pl1.r0 r7 = r0.f161894c
            te3.rq2 r5 = r7.f177253e
            java.util.LinkedList<te3.rq2> r6 = r0.f161896e
            r2.mo83039x(r3, r5, r6, r7)
        L_0x001f:
            long r2 = r1.f161865V
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a2
            dp1.a2 r2 = dp1.C58354a2.f167095a
            pl1.r0 r0 = r0.f161894c
            te3.rq2 r0 = r0.f177253e
            java.lang.String r0 = r0.f185275p
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = ""
        L_0x0033:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, dp1.a2$a> r2 = dp1.C58354a2.f167096b
            java.lang.Object r0 = r2.get(r0)
            dp1.a2$a r0 = (dp1.C58354a2.C58355a) r0
            if (r0 != 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            long r2 = eb0.C31543z5.m39453c()
            r0.f167102f = r2
        L_0x0044:
            gr1.o2 r0 = r1.getVideoView()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0064
            gr1.o2 r0 = r1.getVideoView()
            boolean r6 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r6 == 0) goto L_0x0059
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r0
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            if (r0 == 0) goto L_0x0078
            long r6 = r1.f161865V
            int r8 = r1.f161866W
            r0.mo79450W(r6, r3, r8)
            goto L_0x0078
        L_0x0064:
            gr1.o2 r0 = r1.getVideoView()
            if (r0 == 0) goto L_0x0078
            long r6 = r1.f161865V
            double r6 = (double) r6
            r8 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r6 = r6 / r8
            int r8 = r1.f161866W
            r0.mo51233x(r6, r3, r8)
        L_0x0078:
            he1.v r0 = r1.getBulletLifecycle()
            if (r0 == 0) goto L_0x0088
            long r6 = r1.f161865V
            r8 = 1000(0x3e8, float:1.401E-42)
            long r8 = (long) r8
            long r6 = r6 / r8
            int r7 = (int) r6
            r0.mo84824a(r7)
        L_0x0088:
            r1.f161865V = r4
            r1.f161866W = r3
            gr1.o2 r0 = r1.getVideoView()
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy
            if (r3 == 0) goto L_0x0097
            r2 = r0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r2 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r2
        L_0x0097:
            if (r2 == 0) goto L_0x009e
            float r0 = r1.f161877p0
            r2.setPlaySpeed(r0)
        L_0x009e:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f161877p0 = r0
        L_0x00a2:
            java.util.LinkedList r0 = r1.getVideoCallBackList()
            java.util.Iterator r0 = r0.iterator()
        L_0x00aa:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = r0.next()
            gr1.p2 r1 = (gr1.C59671p2) r1
            r1.onVideoPlay()
            goto L_0x00aa
        L_0x00ba:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r10.f170490a
            he1.v r0 = r0.getBulletLifecycle()
            if (r0 == 0) goto L_0x00c5
            r0.mo77475e(r11)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C59672q1.mo77475e(te3.rq2):void");
    }

    /* renamed from: f */
    public void mo78297f(C64689rq2 rq22, long j, C12931a aVar) {
        FeedData feedData;
        FinderVideoLayout.C56521b playInfo = this.f170490a.getPlayInfo();
        if (playInfo != null) {
            FinderVideoLayout finderVideoLayout = this.f170490a;
            C58354a2 a2Var = C58354a2.f167095a;
            String str = playInfo.f161894c.f177253e.f185275p;
            if (str == null) {
                str = "";
            }
            boolean z = false;
            a2Var.mo83107a(str, false);
            String str2 = playInfo.f161893b;
            String fTPPTag = finderVideoLayout.getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("[onFirstVideoFrameRendered] videoView=");
            C59670o2 o2Var = finderVideoLayout.f161884w;
            C58356b0.C58357a aVar2 = null;
            sb.append(o2Var != null ? Integer.valueOf(o2Var.hashCode()) : null);
            sb.append(" mediaId=");
            sb.append(str2);
            Log.m105924i(fTPPTag, sb.toString());
            C58356b0 b0Var = C58356b0.f167106a;
            FinderVideoLayout.C56521b bVar = finderVideoLayout.f161854J;
            Long valueOf = (bVar == null || (feedData = bVar.f161892a) == null) ? null : Long.valueOf(feedData.getId());
            b0Var.getClass();
            if (valueOf != null) {
                valueOf.longValue();
                C58356b0.C58357a a = b0Var.mo83108a(valueOf.longValue());
                if ((a.f167111c > 0 || a.f167109a > 0) && a.f167114f == 0) {
                    z = true;
                }
                if (z) {
                    aVar2 = a;
                }
                if (aVar2 != null) {
                    aVar2.f167114f = C31543z5.m39453c();
                    C58356b0.f167108c.add(aVar2);
                    C58356b0.f167107b.clear();
                }
            }
            C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                long expectId = playInfo.f161892a.getExpectId();
                C62367r0 r0Var = playInfo.f161894c;
                videoPlayBehavior.mo83028m(expectId, r0Var.f177253e, r0Var, j, aVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r9.f170490a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78298g(te3.C64689rq2 r10, gr1.C59673q2 r11, int r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = r9.f170490a
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r10 = r10.getPlayInfo()
            if (r10 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r9.f170490a
            df1.c$b r1 = r0.getVideoPlayBehavior()
            if (r1 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r10.f161892a
            long r2 = r2.getId()
            pl1.r0 r4 = r10.f161894c
            te3.rq2 r4 = r4.f177253e
            int r6 = r0.getPlayAdapterPosition()
            pl1.r0 r7 = r10.f161894c
            r5 = r11
            r8 = r12
            r1.mo83018c(r2, r4, r5, r6, r7, r8)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C59672q1.mo78298g(te3.rq2, gr1.q2, int):void");
    }

    /* renamed from: h */
    public void mo78299h(C64689rq2 rq22) {
        FinderLongVideoPlayerSeekBar.C3908a aVar;
        FinderVideoLayout.C56521b playInfo = this.f170490a.getPlayInfo();
        if (playInfo != null) {
            FinderVideoLayout finderVideoLayout = this.f170490a;
            C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                long expectId = playInfo.f161892a.getExpectId();
                C62367r0 r0Var = playInfo.f161894c;
                videoPlayBehavior.mo83030o(expectId, r0Var.f177253e, r0Var);
            }
            FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent = new FeedMegaVideoAnimPlayEvent();
            feedMegaVideoAnimPlayEvent.f9160d.f9161a = playInfo.f161892a.getExpectId();
            FeedMegaVideoAnimPlayEvent.C1038a aVar2 = feedMegaVideoAnimPlayEvent.f9160d;
            aVar2.f9164d = true;
            aVar2.f9165e = finderVideoLayout.f161851G;
            feedMegaVideoAnimPlayEvent.publish();
            FinderLongVideoPlayerSeekBar longVideoSeekBar = finderVideoLayout.getLongVideoSeekBar();
            if (!(longVideoSeekBar == null || (aVar = longVideoSeekBar.f17551H) == null)) {
                aVar.mo2429e();
            }
            C62168u uVar = finderVideoLayout.f161869f;
            long expectId2 = playInfo.f161892a.getExpectId();
            uVar.f176748g.put(Long.valueOf(expectId2), Integer.valueOf(uVar.mo87220d3(expectId2) + 1));
        }
        C59869v bulletLifecycle = this.f170490a.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.mo78299h(rq22);
        }
    }

    /* renamed from: i */
    public void mo78300i(C64689rq2 rq22, C61576t tVar) {
        C58259c.C58261b videoPlayBehavior;
        FinderVideoLayout.C56521b playInfo = this.f170490a.getPlayInfo();
        if (playInfo != null && (videoPlayBehavior = this.f170490a.getVideoPlayBehavior()) != null) {
            long expectId = playInfo.f161892a.getExpectId();
            C62367r0 r0Var = playInfo.f161894c;
            videoPlayBehavior.mo83025j(expectId, r0Var.f177253e, playInfo.f161896e, r0Var, tVar);
        }
    }

    /* renamed from: j */
    public void mo78301j(C64689rq2 rq22, C61575s sVar) {
        FinderVideoLayout.C56521b playInfo = this.f170490a.getPlayInfo();
        if (playInfo != null) {
            FinderVideoLayout finderVideoLayout = this.f170490a;
            C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                long expectId = playInfo.f161892a.getExpectId();
                C62367r0 r0Var = playInfo.f161894c;
                videoPlayBehavior.mo83029n(expectId, r0Var.f177253e, playInfo.f161896e, r0Var, sVar);
            }
            for (C59671p2 onVideoPause : finderVideoLayout.getVideoCallBackList()) {
                onVideoPause.onVideoPause();
            }
            C62168u uVar = finderVideoLayout.f161869f;
            long feedId = playInfo.f161892a.getFeedId();
            int i = finderVideoLayout.f161851G;
            C59667n2 seekBarLayout = finderVideoLayout.getSeekBarLayout();
            int currentProgress = seekBarLayout != null ? seekBarLayout.getCurrentProgress() : 0;
            C59670o2 videoView = finderVideoLayout.getVideoView();
            long currentPlayMs = videoView != null ? videoView.getCurrentPlayMs() : 0;
            C59670o2 videoView2 = finderVideoLayout.getVideoView();
            FinderThumbPlayerProxy finderThumbPlayerProxy = videoView2 instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) videoView2 : null;
            uVar.mo87225j3(feedId, i, currentProgress, currentPlayMs, finderThumbPlayerProxy != null ? finderThumbPlayerProxy.getPlaySpeedRatio() : 1.0f);
        }
        C59869v bulletLifecycle = this.f170490a.getBulletLifecycle();
        if (bulletLifecycle != null) {
            bulletLifecycle.mo78301j(rq22, sVar);
        }
    }

    /* renamed from: k */
    public void mo78302k(C64689rq2 rq22) {
        String str;
        this.f170490a.setPreRenderFirstFrame(true);
        this.f170490a.mo79577s("onBgPrepared");
        String fTPPTag = this.f170490a.getFTPPTag();
        StringBuilder sb = new StringBuilder();
        sb.append("onBgPrepared ");
        if (rq22 == null || (str = rq22.f185275p) == null) {
            str = "";
        }
        sb.append(str);
        Log.m105924i(fTPPTag, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r9.f170490a;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78303l(te3.C64689rq2 r10, gr1.C59673q2 r11, int r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = r9.f170490a
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r10 = r10.getPlayInfo()
            if (r10 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r9.f170490a
            df1.c$b r1 = r0.getVideoPlayBehavior()
            if (r1 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r10.f161892a
            long r2 = r2.getId()
            pl1.r0 r4 = r10.f161894c
            te3.rq2 r4 = r4.f177253e
            int r6 = r0.getPlayAdapterPosition()
            pl1.r0 r7 = r10.f161894c
            r5 = r11
            r8 = r12
            r1.mo83019d(r2, r4, r5, r6, r7, r8)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C59672q1.mo78303l(te3.rq2, gr1.q2, int):void");
    }

    /* renamed from: m */
    public void mo78304m(C64689rq2 rq22, long j) {
        FinderVideoLayout.C56521b playInfo = this.f170490a.getPlayInfo();
        if (playInfo != null) {
            FinderVideoLayout finderVideoLayout = this.f170490a;
            C58354a2 a2Var = C58354a2.f167095a;
            String str = playInfo.f161894c.f177253e.f185275p;
            if (str == null) {
                str = "";
            }
            a2Var.mo83107a(str, true);
            finderVideoLayout.mo22956I1("", playInfo.f161893b);
            C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                long expectId = playInfo.f161892a.getExpectId();
                C62367r0 r0Var = playInfo.f161894c;
                videoPlayBehavior.mo83037v(expectId, r0Var.f177253e, r0Var, j);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r9.f170490a;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo78305n(te3.C64689rq2 r10, gr1.C59673q2 r11, int r12) {
        /*
            r9 = this;
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = r9.f170490a
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r10 = r10.getPlayInfo()
            if (r10 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r9.f170490a
            df1.c$b r1 = r0.getVideoPlayBehavior()
            if (r1 == 0) goto L_0x0025
            com.tencent.mm.plugin.finder.storage.FeedData r2 = r10.f161892a
            long r2 = r2.getId()
            pl1.r0 r4 = r10.f161894c
            te3.rq2 r4 = r4.f177253e
            int r6 = r0.getPlayAdapterPosition()
            pl1.r0 r7 = r10.f161894c
            r5 = r11
            r8 = r12
            r1.mo83024i(r2, r4, r5, r6, r7, r8)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C59672q1.mo78305n(te3.rq2, gr1.q2, int):void");
    }

    /* renamed from: o */
    public void mo78306o(C59673q2 q2Var, C61575s sVar) {
        if (q2Var != null) {
            FinderVideoLayout finderVideoLayout = this.f170490a;
            C66167g gVar = C66167g.f190173a;
            C55015f1 d = C66167g.m78055d(gVar, q2Var.f170493c, false, 2, (Object) null);
            if (!d.field_hasPlayed) {
                d.field_hasPlayed = true;
                String str = d.field_mediaId;
                C87412m.m108593f(str, "mediaCache.field_mediaId");
                gVar.getClass();
                C55015f1 c = gVar.mo90234c(str, false);
                c.field_hasPlayed = true;
                C13598b0 b0Var = C13598b0.f38549a;
                gVar.mo90238i(str, c, false);
            }
            C58259c.C58261b videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior();
            if (videoPlayBehavior != null) {
                videoPlayBehavior.mo83036u(q2Var.f170496f.getId(), q2Var.f170494d, q2Var.f170495e, sVar);
            }
        }
    }
}
