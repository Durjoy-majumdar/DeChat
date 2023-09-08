package gr1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.video.FinderLongVideoPlayerSeekBar;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;

/* renamed from: gr1.p0 */
public final class C8419p0 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ FinderVideoLayout f27414d;

    /* renamed from: e */
    public final /* synthetic */ FinderLongVideoPlayerSeekBar f27415e;

    public C8419p0(FinderVideoLayout finderVideoLayout, FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar) {
        this.f27414d = finderVideoLayout;
        this.f27415e = finderLongVideoPlayerSeekBar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r10 != 3) goto L_0x01c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            r0.add(r11)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$bindFinderVideoLayoutTouch$1"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = r9.f27414d
            gr1.o2 r10 = r10.getVideoView()
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0030
            boolean r10 = r10.getVideoViewFocused()
            if (r10 != r0) goto L_0x0030
            r10 = 1
            goto L_0x0031
        L_0x0030:
            r10 = 0
        L_0x0031:
            if (r10 != 0) goto L_0x0041
            r2 = 0
            java.lang.String r4 = "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$bindFinderVideoLayoutTouch$1"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r9
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x0041:
            int r10 = r11.getAction()
            if (r10 == 0) goto L_0x01d3
            java.lang.String r2 = "FinderLongVideoPlayerSeekBar"
            if (r10 == r0) goto L_0x0125
            r3 = 2
            if (r10 == r3) goto L_0x0053
            r3 = 3
            if (r10 == r3) goto L_0x0125
            goto L_0x01c5
        L_0x0053:
            int r10 = r11.getPointerCount()
            if (r10 <= r0) goto L_0x0067
            r3 = 0
            java.lang.String r5 = "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$bindFinderVideoLayoutTouch$1"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r1
        L_0x0067:
            float r10 = r11.getX()
            int r10 = (int) r10
            float r11 = r11.getY()
            int r11 = (int) r11
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r3 = r9.f27415e
            boolean r4 = r3.f17557N
            if (r4 != 0) goto L_0x009d
            int r4 = r3.f17555L
            int r4 = r10 - r4
            float r4 = (float) r4
            int r3 = r3.f17556M
            int r11 = r11 - r3
            float r11 = (float) r11
            float r4 = r4 / r11
            float r11 = java.lang.Math.abs(r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x01c5
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            int r11 = r11.f17555L
            int r11 = r10 - r11
            int r11 = java.lang.Math.abs(r11)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r3 = r9.f27415e
            int r3 = r3.getTouchSlop()
            if (r11 <= r3) goto L_0x01c5
        L_0x009d:
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            boolean r3 = r11.f17557N
            if (r3 != 0) goto L_0x00ee
            fy3.a r11 = r11.getOnSeekStart()
            if (r11 == 0) goto L_0x00ac
            r11.invoke()
        L_0x00ac:
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = r9.f27414d
            gr1.o2 r3 = r3.getVideoView()
            if (r3 == 0) goto L_0x00bb
            int r3 = r3.getCurrentPlaySecond()
            goto L_0x00bc
        L_0x00bb:
            r3 = 0
        L_0x00bc:
            r11.f17559Q = r3
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r11 = r9.f27414d
            r11.mo79547N(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            r11.setIsPlay(r1)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "onFinderVideoLayoutTouch: start track move, startTime = "
            r11.append(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r1 = r9.f27415e
            int r1 = r1.f17559Q
            r11.append(r1)
            java.lang.String r1 = " videoTotalTime="
            r11.append(r1)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r1 = r9.f27415e
            int r1 = r1.getVideoTotalTime()
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
        L_0x00ee:
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            r11.f17557N = r0
            int r11 = r11.f17555L
            int r10 = r10 - r11
            float r10 = (float) r10
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r11 = r9.f27414d
            int r11 = r11.getWidth()
            float r11 = (float) r11
            float r10 = r10 / r11
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            int r1 = r11.f17559Q
            int r2 = r11.getVideoTotalTime()
            float r2 = (float) r2
            float r10 = r10 * r2
            int r10 = iy3.C60641c.m70921b(r10)
            int r1 = r1 + r10
            r11.f17560R = r1
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            int r11 = r10.f17560R
            r10.seek(r11)
            r1 = 1
            java.lang.String r3 = "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$bindFinderVideoLayoutTouch$1"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r9
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x0125:
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            boolean r10 = r10.f17557N
            if (r10 == 0) goto L_0x0189
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "onFinderVideoLayoutTouch: seek end, target time = "
            r10.append(r11)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            int r11 = r11.f17560R
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            fy3.a r10 = r10.getOnSeekEnd()
            if (r10 == 0) goto L_0x014e
            r10.invoke()
        L_0x014e:
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            r10.f17557N = r1
            r10.f17559Q = r1
            int r11 = r10.f17560R
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar$a r10 = r10.f17551H
            if (r10 == 0) goto L_0x015d
            r10.mo2425a(r11)
        L_0x015d:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = r9.f27414d
            gr1.o2 r10 = r10.getVideoView()
            if (r10 == 0) goto L_0x016d
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            int r11 = r11.f17560R
            double r2 = (double) r11
            r10.mo51223a(r2, r0)
        L_0x016d:
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = r9.f27414d
            r10.mo79547N(r0)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            r10.setIsPlay(r0)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            r10.f17560R = r1
            r2 = 1
            java.lang.String r4 = "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$bindFinderVideoLayoutTouch$1"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r9
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r0
        L_0x0189:
            float r10 = r11.getX()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r9.f27415e
            int r0 = r0.f17555L
            float r0 = (float) r0
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r0 = r9.f27415e
            int r0 = r0.getTouchSlop()
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c5
            float r10 = r11.getY()
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            int r11 = r11.f17556M
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r11 = r9.f27415e
            int r11 = r11.getTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x01c5
            java.lang.String r10 = "onFinderVideoLayoutTouch: performClick"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r10 = r9.f27414d
            r10.performClick()
        L_0x01c5:
            r2 = 0
            java.lang.String r4 = "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$bindFinderVideoLayoutTouch$1"
            java.lang.String r5 = "android/view/View$OnTouchListener"
            java.lang.String r6 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r9
            j20.C117292a.m165362h(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x01d3:
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            float r1 = r11.getX()
            int r1 = (int) r1
            r10.f17555L = r1
            com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar r10 = r9.f27415e
            float r11 = r11.getY()
            int r11 = (int) r11
            r10.f17556M = r11
            r1 = 1
            java.lang.String r3 = "com/tencent/mm/plugin/finder/video/FinderLongVideoPlayerSeekBar$bindFinderVideoLayoutTouch$1"
            java.lang.String r4 = "android/view/View$OnTouchListener"
            java.lang.String r5 = "onTouch"
            java.lang.String r6 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r2 = r9
            j20.C117292a.m165362h(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gr1.C8419p0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
