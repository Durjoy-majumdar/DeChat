package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;

/* renamed from: com.tencent.mm.plugin.finder.view.v6 */
public final class C4197v6 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ HorizontalVideoPreviewLayout f18486d;

    /* renamed from: e */
    public final /* synthetic */ int f18487e;

    /* renamed from: f */
    public final /* synthetic */ FinderLongVideoPlayerSeekBar f18488f;

    /* renamed from: g */
    public final /* synthetic */ FinderThumbPlayerProxy f18489g;

    /* renamed from: h */
    public final /* synthetic */ FinderVideoLayout f18490h;

    public C4197v6(HorizontalVideoPreviewLayout horizontalVideoPreviewLayout, int i, FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, FinderThumbPlayerProxy finderThumbPlayerProxy, FinderVideoLayout finderVideoLayout) {
        this.f18486d = horizontalVideoPreviewLayout;
        this.f18487e = i;
        this.f18488f = finderLongVideoPlayerSeekBar;
        this.f18489g = finderThumbPlayerProxy;
        this.f18490h = finderVideoLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bf, code lost:
        if (java.lang.Math.abs(r0 - r6.f18486d.f18013t) > r6.f18486d.getTouchSlop()) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e7, code lost:
        if (java.lang.Math.abs(r1 - r6.f18486d.f18014u) > r6.f18486d.getTouchSlop()) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0070, code lost:
        if (r0 != 3) goto L_0x029e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r19
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r18
            r0.add(r1)
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachTouchListener$1"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r17
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            android.view.GestureDetector r0 = r0.f18010q
            k20.a r1 = new k20.a
            r1.<init>()
            r1.mo10233c(r7)
            java.lang.Object[] r9 = r1.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachTouchListener$1"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/GestureDetector_EXEC_"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r16 = r0.onTouchEvent(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachTouchListener$1"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/GestureDetector_EXEC_"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            r9 = r16
            j20.C117292a.m165360f(r8, r9, r10, r11, r12, r13, r14, r15)
            int r0 = r19.getAction()
            if (r0 == 0) goto L_0x028c
            r1 = 3
            java.lang.String r3 = "HorizontalVideoPreviewLayout"
            r8 = 1
            if (r0 == r8) goto L_0x01a9
            r4 = 2
            if (r0 == r4) goto L_0x0074
            if (r0 == r1) goto L_0x01a9
            goto L_0x029e
        L_0x0074:
            int r0 = r19.getPointerCount()
            if (r0 <= r8) goto L_0x008a
            java.lang.String r2 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachTouchListener$1"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r0 = r16
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r16
        L_0x008a:
            float r0 = r19.getX()
            int r0 = (int) r0
            float r1 = r19.getY()
            int r1 = (int) r1
            int r4 = r6.f18487e
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r4 != 0) goto L_0x00c2
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r4 = r6.f18486d
            int r7 = r4.f18013t
            int r7 = r0 - r7
            float r7 = (float) r7
            int r4 = r4.f18014u
            int r4 = r1 - r4
            float r4 = (float) r4
            float r7 = r7 / r4
            float r4 = java.lang.Math.abs(r7)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00eb
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r4 = r6.f18486d
            int r4 = r4.f18013t
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r5 = r6.f18486d
            int r5 = r5.getTouchSlop()
            if (r4 <= r5) goto L_0x00eb
            goto L_0x00e9
        L_0x00c2:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r4 = r6.f18486d
            int r7 = r4.f18014u
            int r7 = r1 - r7
            float r7 = (float) r7
            int r4 = r4.f18013t
            int r4 = r0 - r4
            float r4 = (float) r4
            float r7 = r7 / r4
            float r4 = java.lang.Math.abs(r7)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00eb
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r4 = r6.f18486d
            int r4 = r4.f18014u
            int r4 = r1 - r4
            int r4 = java.lang.Math.abs(r4)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r5 = r6.f18486d
            int r5 = r5.getTouchSlop()
            if (r4 <= r5) goto L_0x00eb
        L_0x00e9:
            r4 = 1
            goto L_0x00ec
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r5 = r6.f18486d
            boolean r7 = r5.f18015v
            if (r7 != 0) goto L_0x00f8
            if (r4 == 0) goto L_0x029e
            boolean r4 = r5.f18011r
            if (r4 != 0) goto L_0x029e
        L_0x00f8:
            if (r7 != 0) goto L_0x0151
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r4 = r6.f18488f
            fy3.a r4 = r4.getOnSeekStart()
            if (r4 == 0) goto L_0x0105
            r4.invoke()
        L_0x0105:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r4 = r6.f18486d
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = r6.f18489g
            int r5 = r5.getCurrentPlaySecond()
            r4.f18017x = r5
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r4 = r6.f18490h
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r4 = r4.getPlayInfo()
            if (r4 != 0) goto L_0x0118
            goto L_0x0121
        L_0x0118:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r5 = r6.f18489g
            boolean r5 = r5.isPlaying()
            r5 = r5 ^ r8
            r4.f161902k = r5
        L_0x0121:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r4 = r6.f18489g
            r4.pause()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r4 = r6.f18488f
            r4.setIsPlay(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "onHorizontalPreviewTouch: start track move, startTime = "
            r2.append(r4)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r4 = r6.f18486d
            int r4 = r4.f18017x
            r2.append(r4)
            java.lang.String r4 = " videoTotalTime="
            r2.append(r4)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r4 = r6.f18488f
            int r4 = r4.getVideoTotalTime()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
        L_0x0151:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r2 = r6.f18486d
            r2.f18015v = r8
            int r3 = r2.f18014u
            int r1 = r1 - r3
            float r1 = (float) r1
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.f18487e
            if (r2 != 0) goto L_0x0171
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r1 = r6.f18486d
            int r2 = r1.f18013t
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r1 = r0 / r1
            goto L_0x0174
        L_0x0171:
            if (r2 >= 0) goto L_0x0174
            float r1 = -r1
        L_0x0174:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            int r2 = r0.f18017x
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r3 = r6.f18488f
            int r3 = r3.getVideoTotalTime()
            float r3 = (float) r3
            float r1 = r1 * r3
            int r1 = iy3.C60641c.m70921b(r1)
            int r2 = r2 + r1
            r0.f18018y = r2
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r6.f18488f
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r1 = r6.f18486d
            int r1 = r1.f18018y
            r0.seek(r1)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r1 = r6.f18489g
            int r2 = r0.f18018y
            r0.mo4790f(r1, r2)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachTouchListener$1"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x01a9:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            boolean r4 = r0.f18011r
            if (r4 == 0) goto L_0x01b2
            r0.mo4803j(r2)
        L_0x01b2:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            boolean r0 = r0.f18015v
            if (r0 == 0) goto L_0x024f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "onHorizontalPreviewTouch: seek end, target time = "
            r0.append(r4)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r4 = r6.f18486d
            int r4 = r4.f18018y
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r6.f18488f
            fy3.a r0 = r0.getOnSeekEnd()
            if (r0 == 0) goto L_0x01db
            r0.invoke()
        L_0x01db:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            r0.f18015v = r2
            r0.f18017x = r2
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r3 = r6.f18488f
            int r0 = r0.f18018y
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar$a r3 = r3.f17551H
            if (r3 == 0) goto L_0x01ec
            r3.mo2425a(r0)
        L_0x01ec:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r6.f18489g
            int r11 = r0.getCurrentPlaySecond()
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r6.f18489g
            int r0 = r0.getVideoDuration()
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r3 = r6.f18489g
            r3.setVideoViewFocused(r8)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r3 = r6.f18486d
            gr1.n2 r3 = r3.getFullSeekBar()
            if (r3 == 0) goto L_0x020a
            java.lang.String r4 = "HorizontalSeek"
            r3.mo4259i(r4)
        L_0x020a:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r3 = r6.f18486d
            int r3 = r3.f18018y
            if (r3 < r0) goto L_0x0213
            int r0 = r0 - r8
            r12 = r0
            goto L_0x0217
        L_0x0213:
            if (r3 >= 0) goto L_0x0216
            r3 = 0
        L_0x0216:
            r12 = r3
        L_0x0217:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r6.f18489g
            double r3 = (double) r12
            r0.mo51233x(r3, r8, r1)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r6.f18489g
            r0.play()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r6.f18488f
            r0.setIsPlay(r8)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            r0.f18018y = r2
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = r6.f18490h
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r10 = r0.getPlayInfo()
            if (r10 == 0) goto L_0x023f
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r9 = r6.f18486d
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r6.f18489g
            long r13 = r0.getVideoDurationMs()
            r15 = 1
            com.tencent.p014mm.plugin.finder.view.HorizontalVideoPreviewLayout.m4253b(r9, r10, r11, r12, r13, r15)
        L_0x023f:
            java.lang.String r2 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachTouchListener$1"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r0 = r16
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r16
        L_0x024f:
            float r0 = r19.getX()
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r1 = r6.f18486d
            int r1 = r1.f18013t
            float r1 = (float) r1
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r1 = r6.f18486d
            int r1 = r1.getTouchSlop()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x029e
            float r0 = r19.getY()
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r1 = r6.f18486d
            int r1 = r1.f18014u
            float r1 = (float) r1
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r1 = r6.f18486d
            int r1 = r1.getTouchSlop()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x029e
            java.lang.String r0 = "onHorizontalPreviewTouch: performClick"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r0)
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            r0.performClick()
            goto L_0x029e
        L_0x028c:
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            float r1 = r19.getX()
            int r1 = (int) r1
            r0.f18013t = r1
            com.tencent.mm.plugin.finder.view.HorizontalVideoPreviewLayout r0 = r6.f18486d
            float r1 = r19.getY()
            int r1 = (int) r1
            r0.f18014u = r1
        L_0x029e:
            java.lang.String r2 = "com/tencent/mm/plugin/finder/view/HorizontalVideoPreviewLayout$attachTouchListener$1"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r0 = r16
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4197v6.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
