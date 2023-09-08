package com.tencent.p014mm.plugin.webview.fts.p810ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: com.tencent.mm.plugin.webview.fts.ui.b */
public class C96642b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ C96638a f283011d;

    public C96642b(C96638a aVar) {
        this.f283011d = aVar;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        C96638a aVar = this.f283011d;
        aVar.f282995b.removeCallbacks(aVar.f283004k);
        ((C96643c) this.f283011d.f282998e).getClass();
        Log.m105918d("MicroMsg.FtsWebVideoView", "onDoubleTap");
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e5, code lost:
        if (r12 < 0.0f) goto L_0x01e9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScroll(android.view.MotionEvent r11, android.view.MotionEvent r12, float r13, float r14) {
        /*
            r10 = this;
            com.tencent.mm.plugin.webview.fts.ui.a$b r0 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.Volume
            com.tencent.mm.plugin.webview.fts.ui.a$b r1 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.Brightness
            com.tencent.mm.plugin.webview.fts.ui.a$b r2 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.FastBackwardOrForward
            r3 = 1
            if (r11 == 0) goto L_0x0237
            if (r12 != 0) goto L_0x000d
            goto L_0x0237
        L_0x000d:
            com.tencent.mm.plugin.webview.fts.ui.a r4 = r10.f283011d
            com.tencent.mm.plugin.webview.fts.ui.a$b r4 = r4.f282996c
            com.tencent.mm.plugin.webview.fts.ui.a$b r5 = com.tencent.p014mm.plugin.webview.fts.p810ui.C96638a.C96640b.None
            if (r4 != r5) goto L_0x0042
            float r13 = java.lang.Math.abs(r13)
            float r14 = java.lang.Math.abs(r14)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0026
            com.tencent.mm.plugin.webview.fts.ui.a r13 = r10.f283011d
            r13.f282996c = r2
            goto L_0x0042
        L_0x0026:
            float r13 = r11.getX()
            com.tencent.mm.plugin.webview.fts.ui.a r14 = r10.f283011d
            android.view.View r14 = r14.f282995b
            int r14 = r14.getMeasuredWidth()
            int r14 = r14 / 2
            float r14 = (float) r14
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 >= 0) goto L_0x003e
            com.tencent.mm.plugin.webview.fts.ui.a r13 = r10.f283011d
            r13.f282996c = r1
            goto L_0x0042
        L_0x003e:
            com.tencent.mm.plugin.webview.fts.ui.a r13 = r10.f283011d
            r13.f282996c = r0
        L_0x0042:
            float r13 = r12.getX()
            float r14 = r11.getX()
            float r13 = r13 - r14
            float r12 = r12.getY()
            float r11 = r11.getY()
            float r12 = r12 - r11
            com.tencent.mm.plugin.webview.fts.ui.a r11 = r10.f283011d
            com.tencent.mm.plugin.webview.fts.ui.a$b r14 = r11.f282996c
            r4 = -1
            java.lang.String r5 = "MicroMsg.FtsWebVideoView"
            r6 = 0
            if (r14 != r2) goto L_0x011d
            int r12 = r11.f283002i
            if (r12 != r4) goto L_0x0097
            com.tencent.mm.plugin.webview.fts.ui.a$c r12 = r11.f282998e
            com.tencent.mm.plugin.webview.fts.ui.c r12 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r12
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r14 = r12.f283012a
            com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper r14 = r14.f282960e
            boolean r14 = r14.mo129198i()
            if (r14 == 0) goto L_0x0077
            java.lang.String r12 = "onStartDragProgress isLive: no seek"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            goto L_0x0089
        L_0x0077:
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r14 = r12.f283012a
            android.widget.TextView r14 = r14.f282961f
            r14.setVisibility(r6)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r12.f283012a
            com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar r12 = r12.f282962g
            android.widget.ImageView r12 = r12.f273525i
            r14 = 8
            r12.setVisibility(r14)
        L_0x0089:
            com.tencent.mm.plugin.webview.fts.ui.a$c r12 = r11.f282998e
            com.tencent.mm.plugin.webview.fts.ui.c r12 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r12
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r12.f283012a
            com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper r12 = r12.f282960e
            int r12 = r12.getCurrPosSec()
            r11.f283002i = r12
        L_0x0097:
            com.tencent.mm.plugin.webview.fts.ui.a$c r12 = r11.f282998e
            int r14 = r11.f283002i
            com.tencent.mm.plugin.webview.fts.ui.c r12 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r12
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r0 = r12.f283012a
            com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper r0 = r0.f282960e
            boolean r0 = r0.mo129198i()
            if (r0 == 0) goto L_0x00ae
            java.lang.String r12 = "onDragProgress isLive: no seek"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
            goto L_0x0119
        L_0x00ae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onDragProgress:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = "/"
            r0.append(r14)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r0 = r12.f283012a
            int r0 = r0.getMeasuredWidth()
            float r0 = (float) r0
            float r13 = r13 / r0
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r0 = r12.f283012a
            com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper r0 = r0.f282960e
            int r0 = r0.getVideoDurationSec()
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r1 = r12.f283012a
            com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper r1 = r1.f282960e
            int r1 = r1.getCurrPosSec()
            float r2 = (float) r0
            float r2 = r2 * r13
            int r13 = (int) r2
            int r1 = r1 + r13
            if (r1 >= 0) goto L_0x00eb
            goto L_0x00f0
        L_0x00eb:
            if (r1 <= r0) goto L_0x00ef
            r6 = r0
            goto L_0x00f0
        L_0x00ef:
            r6 = r1
        L_0x00f0:
            long r0 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            java.lang.String r13 = r83.C89906f.m112428a(r0)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r12.f283012a
            android.widget.TextView r12 = r12.f282961f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r1 = r1 * r4
            java.lang.String r1 = r83.C89906f.m112428a(r1)
            r0.append(r1)
            r0.append(r14)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.setText(r13)
        L_0x0119:
            r11.f283003j = r6
            goto L_0x0237
        L_0x011d:
            r13 = 1067030938(0x3f99999a, float:1.2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 0
            if (r14 != r1) goto L_0x01ae
            float r12 = r12 * r2
            android.view.View r14 = r11.f282995b
            int r14 = r14.getMeasuredHeight()
            float r14 = (float) r14
            float r12 = r12 / r14
            float r12 = r12 * r13
            float r13 = r11.f282999f
            float r13 = r13 + r12
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x013b
            goto L_0x0143
        L_0x013b:
            int r14 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0142
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0143
        L_0x0142:
            r7 = r13
        L_0x0143:
            android.content.Context r13 = r11.f282994a
            boolean r14 = r13 instanceof android.app.Activity
            if (r14 != 0) goto L_0x014a
            goto L_0x016e
        L_0x014a:
            r14 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0155
            r12 = 1008981770(0x3c23d70a, float:0.01)
            goto L_0x015b
        L_0x0155:
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r12 = r7
        L_0x015b:
            android.app.Activity r13 = (android.app.Activity) r13
            android.view.Window r14 = r13.getWindow()
            android.view.WindowManager$LayoutParams r14 = r14.getAttributes()
            r14.screenBrightness = r12
            android.view.Window r12 = r13.getWindow()
            r12.setAttributes(r14)
        L_0x016e:
            com.tencent.mm.plugin.webview.fts.ui.a$c r11 = r11.f282998e
            com.tencent.mm.plugin.webview.fts.ui.c r11 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r11
            r11.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "onAdjustBrightness:"
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r12)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r11.f283012a
            com.tencent.mm.plugin.websearch.widget.WebSearchDotPercentIndicator r12 = r12.f282966n
            r12.setPercent(r7)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r11.f283012a
            android.widget.TextView r12 = r12.f282967o
            r13 = 2131830548(0x7f112714, float:1.9294096E38)
            r12.setText(r13)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r11.f283012a
            android.widget.ImageView r12 = r12.f282968p
            r13 = 2131755798(0x7f100316, float:1.9142485E38)
            r12.setImageResource(r13)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r11 = r11.f283012a
            android.widget.LinearLayout r11 = r11.f282965j
            r11.setVisibility(r6)
            goto L_0x0237
        L_0x01ae:
            if (r14 != r0) goto L_0x0237
            float r12 = r12 * r2
            android.view.View r14 = r11.f282995b
            int r14 = r14.getMeasuredHeight()
            float r14 = (float) r14
            float r14 = r12 / r14
            android.content.Context r0 = r11.f282994a
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 3
            int r2 = r0.getStreamMaxVolume(r1)
            float r8 = (float) r2
            float r14 = r14 * r8
            float r14 = r14 * r13
            int r13 = (int) r14
            if (r13 != 0) goto L_0x01e8
            float r14 = java.lang.Math.abs(r14)
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x01e8
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x01e3
            r4 = 1
            goto L_0x01e9
        L_0x01e3:
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 >= 0) goto L_0x01e8
            goto L_0x01e9
        L_0x01e8:
            r4 = r13
        L_0x01e9:
            int r12 = r11.f283000g
            int r12 = r12 + r4
            if (r12 >= 0) goto L_0x01f0
            r2 = 0
            goto L_0x01f4
        L_0x01f0:
            if (r12 < r2) goto L_0x01f3
            goto L_0x01f4
        L_0x01f3:
            r2 = r12
        L_0x01f4:
            p331dj.C107043a.m144905c(r0, r1, r2, r6)
            float r12 = (float) r2
            float r12 = r12 / r8
            com.tencent.mm.plugin.webview.fts.ui.a$c r11 = r11.f282998e
            com.tencent.mm.plugin.webview.fts.ui.c r11 = (com.tencent.p014mm.plugin.webview.fts.p810ui.C96643c) r11
            r11.getClass()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "onAdjustVolume:"
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r13)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r13 = r11.f283012a
            com.tencent.mm.plugin.websearch.widget.WebSearchDotPercentIndicator r13 = r13.f282966n
            r13.setPercent(r12)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r11.f283012a
            android.widget.TextView r12 = r12.f282967o
            r13 = 2131830551(0x7f112717, float:1.9294103E38)
            r12.setText(r13)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r12 = r11.f283012a
            android.widget.ImageView r12 = r12.f282968p
            r13 = 2131755799(0x7f100317, float:1.9142487E38)
            r12.setImageResource(r13)
            com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView r11 = r11.f283012a
            android.widget.LinearLayout r11 = r11.f282965j
            r11.setVisibility(r6)
        L_0x0237:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.fts.p810ui.C96642b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C96638a aVar = this.f283011d;
        aVar.f282995b.postDelayed(aVar.f283004k, 200);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/webview/fts/ui/FtsWebVideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}
