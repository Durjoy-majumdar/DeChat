package gp1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59673q2;
import gr1.C59684w2;
import gy3.C87412m;
import ht1.C60153b5;
import ht1.C60171g1;
import mr1.C61575s;
import mr1.C61576t;
import qt1.C12931a;
import te3.C64689rq2;

/* renamed from: gp1.d */
public final class C59601d implements C60153b5 {

    /* renamed from: gp1.d$a */
    public static final class C59602a implements C59684w2 {

        /* renamed from: a */
        public final /* synthetic */ ImageView f170311a;

        public C59602a(ImageView imageView) {
            this.f170311a = imageView;
        }

        /* renamed from: b */
        public void mo78295b(float f) {
        }

        /* renamed from: c */
        public void mo78294c(C64689rq2 rq22, int i, int i2) {
        }

        /* renamed from: d */
        public void mo78296d(C64689rq2 rq22, long j, long j2) {
        }

        /* renamed from: e */
        public void mo77475e(C64689rq2 rq22) {
        }

        /* renamed from: f */
        public void mo78297f(C64689rq2 rq22, long j, C12931a aVar) {
            this.f170311a.setVisibility(8);
        }

        /* renamed from: g */
        public void mo78298g(C64689rq2 rq22, C59673q2 q2Var, int i) {
        }

        /* renamed from: h */
        public void mo78299h(C64689rq2 rq22) {
        }

        /* renamed from: i */
        public void mo78300i(C64689rq2 rq22, C61576t tVar) {
        }

        /* renamed from: j */
        public void mo78301j(C64689rq2 rq22, C61575s sVar) {
        }

        /* renamed from: k */
        public void mo78302k(C64689rq2 rq22) {
        }

        /* renamed from: l */
        public void mo78303l(C64689rq2 rq22, C59673q2 q2Var, int i) {
        }

        /* renamed from: m */
        public void mo78304m(C64689rq2 rq22, long j) {
        }

        /* renamed from: n */
        public void mo78305n(C64689rq2 rq22, C59673q2 q2Var, int i) {
        }

        /* renamed from: o */
        public void mo78306o(C59673q2 q2Var, C61575s sVar) {
        }
    }

    /* renamed from: a */
    public void mo84616a(View view) {
        C87412m.m108594g(view, "view");
        FinderThumbPlayerProxy finderThumbPlayerProxy = view instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) view : null;
        if (finderThumbPlayerProxy != null) {
            Log.m105924i("MicroMsg.FinderVideoPlayHelper", "release " + view);
            finderThumbPlayerProxy.mo78608c();
            finderThumbPlayerProxy.mo78609d();
        }
    }

    /* JADX WARNING: type inference failed for: r11v16, types: [android.view.View, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo84617b(android.widget.FrameLayout r11, android.widget.ImageView r12, com.tencent.p014mm.protocal.protobuf.FinderObject r13, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "videoContainer"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "coverView"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "finderObject"
            gy3.C87412m.m108594g(r13, r0)
            long r0 = r13.f164794id
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r13.objectDesc
            r3 = 0
            if (r2 == 0) goto L_0x0102
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r2 = r2.media
            if (r2 == 0) goto L_0x0102
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            com.tencent.mm.protocal.protobuf.FinderMedia r2 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r2
            if (r2 != 0) goto L_0x0025
            goto L_0x0102
        L_0x0025:
            te3.rq2 r2 = vp1.C65840n.m77568d(r2)
            co1.a r4 = co1.C55041a.f154526a
            r5 = 0
            pl1.r0 r4 = r4.mo76098a(r0, r2, r5)
            com.tencent.mm.plugin.finder.storage.FeedData$a r6 = com.tencent.p014mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.FinderItem$a r7 = com.tencent.p014mm.plugin.finder.storage.FinderItem.Companion
            int r8 = r13.objectType
            com.tencent.mm.plugin.finder.storage.FinderItem r13 = r7.mo79056a(r13, r8)
            com.tencent.mm.plugin.finder.storage.FeedData r13 = r6.mo78884b(r13)
            int r6 = r11.getChildCount()
            if (r6 != 0) goto L_0x005d
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r6 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
            android.content.Context r7 = r11.getContext()
            java.lang.String r8 = "videoContainer.context"
            gy3.C87412m.m108593f(r7, r8)
            r6.<init>(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r8 = -1
            r7.<init>(r8, r8)
            r11.addView(r6, r7)
            goto L_0x007e
        L_0x005d:
            android.view.View r11 = r11.getChildAt(r5)
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy"
            gy3.C87412m.m108592e(r11, r6)
            r6 = r11
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r6 = (com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy) r6
            java.lang.String r11 = r4.mo11841b()
            java.lang.String r7 = r6.getVideoMediaId()
            boolean r11 = gy3.C87412m.m108589b(r11, r7)
            if (r11 != 0) goto L_0x007b
            r6.stop()
            goto L_0x007e
        L_0x007b:
            r6.pause()
        L_0x007e:
            java.lang.String r11 = r4.mo11841b()
            java.lang.String r7 = r6.getVideoMediaId()
            boolean r11 = gy3.C87412m.m108589b(r11, r7)
            r7 = 1
            if (r11 != 0) goto L_0x00c4
            float r11 = r2.f185270h
            r8 = 0
            int r9 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x00a3
            float r2 = r2.f185271i
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a3
            float r11 = r11 / r2
            r2 = 1061158912(0x3f400000, float:0.75)
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x00a3
            r11 = 1
            goto L_0x00a4
        L_0x00a3:
            r11 = 0
        L_0x00a4:
            if (r11 == 0) goto L_0x00b1
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.FIT_CENTER
            r12.setScaleType(r11)
            com.tencent.mm.pluginsdk.ui.a$e r11 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.CONTAIN
            r6.setScaleType(r11)
            goto L_0x00bb
        L_0x00b1:
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER_CROP
            r12.setScaleType(r11)
            com.tencent.mm.pluginsdk.ui.a$e r11 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r6.setScaleType(r11)
        L_0x00bb:
            r6.setLoop(r7)
            r6.mo78639o(r4, r5, r13)
            r6.mo51228s()
        L_0x00c4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "onBindViewHolder feedId:"
            r11.append(r13)
            r11.append(r0)
            java.lang.String r13 = ", mediaId:"
            r11.append(r13)
            java.lang.String r13 = r6.getVideoMediaId()
            r11.append(r13)
            java.lang.String r13 = ", isPlay:"
            r11.append(r13)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            java.lang.String r13 = "MicroMsg.FinderVideoPlayHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r11)
            gp1.d$a r11 = new gp1.d$a
            r11.<init>(r12)
            r6.setVideoPlayLifecycle(r11)
            r12.setVisibility(r5)
            if (r14 == 0) goto L_0x0101
            r6.setVideoViewFocused(r7)
            ht1.C60171g1.C8767a.m8577a(r6, r3, r7, r3)
        L_0x0101:
            return r6
        L_0x0102:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gp1.C59601d.mo84617b(android.widget.FrameLayout, android.widget.ImageView, com.tencent.mm.protocal.protobuf.FinderObject, boolean):android.view.View");
    }

    /* renamed from: c */
    public void mo84618c(FrameLayout frameLayout) {
        C87412m.m108594g(frameLayout, "videoContainer");
        View childAt = frameLayout.getChildAt(0);
        FinderThumbPlayerProxy finderThumbPlayerProxy = childAt instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) childAt : null;
        if (finderThumbPlayerProxy != null) {
            Log.m105924i("MicroMsg.FinderVideoPlayHelper", "stop mediaId:" + finderThumbPlayerProxy.getVideoMediaId());
            finderThumbPlayerProxy.setVideoViewFocused(false);
            finderThumbPlayerProxy.stop();
        }
    }

    /* renamed from: d */
    public void mo84619d(FrameLayout frameLayout, boolean z) {
        C87412m.m108594g(frameLayout, "videoContainer");
        View childAt = frameLayout.getChildAt(0);
        FinderThumbPlayerProxy finderThumbPlayerProxy = childAt instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) childAt : null;
        if (finderThumbPlayerProxy != null) {
            Log.m105924i("MicroMsg.FinderVideoPlayHelper", "playOrPause mediaId:" + finderThumbPlayerProxy.getVideoMediaId() + ", play:" + z);
            if (z) {
                finderThumbPlayerProxy.setVideoViewFocused(true);
                C60171g1.C8767a.m8577a(finderThumbPlayerProxy, (Integer) null, 1, (Object) null);
                return;
            }
            finderThumbPlayerProxy.setVideoViewFocused(false);
            finderThumbPlayerProxy.pause();
        }
    }
}
