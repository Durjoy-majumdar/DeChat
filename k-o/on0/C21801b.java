package on0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import sn0.C90259e;

/* renamed from: on0.b */
public class C21801b extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: d */
    public final /* synthetic */ C21797a f61798d;

    public C21801b(C21797a aVar) {
        this.f61798d = aVar;
    }

    public boolean onContextClick(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        C21797a aVar = this.f61798d;
        aVar.f61782b.removeCallbacks(aVar.f61791k);
        C17976a aVar2 = (C17976a) this.f61798d.f61785e;
        aVar2.getClass();
        Log.m105918d("MicroMsg.Video.AppBrandVideoView", "onDoubleTap");
        AppBrandVideoView appBrandVideoView = aVar2.f49577a;
        if (appBrandVideoView.f49516W) {
            if (appBrandVideoView.f49521f.isPlaying()) {
                aVar2.f49577a.mo22238r();
            } else {
                aVar2.f49577a.mo22277w();
            }
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0211, code lost:
        if (r12 < 0.0f) goto L_0x0215;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScroll(android.view.MotionEvent r11, android.view.MotionEvent r12, float r13, float r14) {
        /*
            r10 = this;
            on0.a$b r0 = on0.C21797a.C21799b.Volume
            on0.a$b r1 = on0.C21797a.C21799b.Brightness
            on0.a$b r2 = on0.C21797a.C21799b.FastBackwardOrForward
            r3 = 1
            r4 = 0
            if (r11 == 0) goto L_0x026d
            if (r12 != 0) goto L_0x000e
            goto L_0x026d
        L_0x000e:
            on0.a r5 = r10.f61798d
            on0.a$b r5 = r5.f61783c
            on0.a$b r6 = on0.C21797a.C21799b.None
            if (r5 != r6) goto L_0x0043
            float r13 = java.lang.Math.abs(r13)
            float r14 = java.lang.Math.abs(r14)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0027
            on0.a r13 = r10.f61798d
            r13.f61783c = r2
            goto L_0x0043
        L_0x0027:
            float r13 = r11.getX()
            on0.a r14 = r10.f61798d
            android.view.View r14 = r14.f61782b
            int r14 = r14.getMeasuredWidth()
            int r14 = r14 / 2
            float r14 = (float) r14
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 >= 0) goto L_0x003f
            on0.a r13 = r10.f61798d
            r13.f61783c = r1
            goto L_0x0043
        L_0x003f:
            on0.a r13 = r10.f61798d
            r13.f61783c = r0
        L_0x0043:
            float r13 = r12.getX()
            float r14 = r11.getX()
            float r13 = r13 - r14
            float r12 = r12.getY()
            float r11 = r11.getY()
            float r12 = r12 - r11
            on0.a r11 = r10.f61798d
            on0.a$b r14 = r11.f61783c
            r5 = -1
            java.lang.String r6 = "MicroMsg.Video.AppBrandVideoView"
            if (r14 != r2) goto L_0x0143
            on0.a$c r12 = r11.f61785e
            com.tencent.mm.plugin.appbrand.jsapi.video.a r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r12
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r12.f49577a
            int r14 = com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView.f49488Y0
            boolean r12 = r12.mo22218e()
            if (r12 != 0) goto L_0x006e
            goto L_0x01d9
        L_0x006e:
            int r12 = r11.f61789i
            if (r12 != r5) goto L_0x0099
            on0.a$c r12 = r11.f61785e
            com.tencent.mm.plugin.appbrand.jsapi.video.a r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r12
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r14 = r12.f49577a
            boolean r14 = r14.mo22218e()
            if (r14 != 0) goto L_0x007f
            goto L_0x008b
        L_0x007f:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r14 = r12.f49577a
            android.widget.TextView r14 = r14.f49522g
            r14.setVisibility(r4)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r12.f49577a
            r12.mo22228i()
        L_0x008b:
            on0.a$c r12 = r11.f61785e
            com.tencent.mm.plugin.appbrand.jsapi.video.a r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r12
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r12.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.c r12 = r12.f49521f
            int r12 = r12.getCurrPosSec()
            r11.f61789i = r12
        L_0x0099:
            on0.a$c r12 = r11.f61785e
            int r14 = r11.f61789i
            com.tencent.mm.plugin.appbrand.jsapi.video.a r12 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r12
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49577a
            boolean r0 = r0.mo22218e()
            if (r0 != 0) goto L_0x00a9
            goto L_0x013f
        L_0x00a9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onDragProgress:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = "/"
            r0.append(r14)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.c r0 = r0.f49521f
            int r0 = r0.getVideoDurationSec()
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r1 = r12.f49577a
            int r1 = r1.getMeasuredWidth()
            float r1 = (float) r1
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r2 = r12.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.c r2 = r2.f49521f
            int r2 = r2.getCurrPosSec()
            float r13 = r13 / r1
            r1 = 180(0xb4, float:2.52E-43)
            r5 = 600(0x258, float:8.41E-43)
            if (r0 > r1) goto L_0x00e5
            r1 = r0
            goto L_0x00f1
        L_0x00e5:
            if (r0 > r5) goto L_0x00e8
            goto L_0x00f1
        L_0x00e8:
            r1 = 1800(0x708, float:2.522E-42)
            if (r0 > r1) goto L_0x00ef
            r1 = 300(0x12c, float:4.2E-43)
            goto L_0x00f1
        L_0x00ef:
            r1 = 600(0x258, float:8.41E-43)
        L_0x00f1:
            float r1 = (float) r1
            float r1 = r1 * r13
            int r13 = (int) r1
            int r2 = r2 + r13
            if (r2 >= 0) goto L_0x00f9
            goto L_0x00fe
        L_0x00f9:
            if (r2 <= r0) goto L_0x00fd
            r4 = r0
            goto L_0x00fe
        L_0x00fd:
            r4 = r2
        L_0x00fe:
            long r0 = (long) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r5
            java.lang.String r13 = ym0.C91515l.m114817a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49577a
            android.widget.TextView r0 = r0.f49522g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r7 = (long) r4
            long r7 = r7 * r5
            java.lang.String r2 = ym0.C91515l.m114817a(r7)
            r1.append(r2)
            r1.append(r14)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.setText(r13)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r13 = r12.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.c$a r13 = r13.f49524i
            r13.seek(r4)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r13 = r12.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.c$a r13 = r13.f49524i
            boolean r13 = r13.mo22343q()
            if (r13 == 0) goto L_0x013f
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r12.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.c$a r12 = r12.f49524i
            r12.mo22344r()
        L_0x013f:
            r11.f61790j = r4
            goto L_0x026d
        L_0x0143:
            r13 = 1067030938(0x3f99999a, float:1.2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 0
            if (r14 != r1) goto L_0x01c9
            on0.a$c r14 = r11.f61785e
            com.tencent.mm.plugin.appbrand.jsapi.video.a r14 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r14
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r14 = r14.f49577a
            int r0 = com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView.f49488Y0
            boolean r14 = r14.mo22217d()
            if (r14 != 0) goto L_0x015b
            goto L_0x01d9
        L_0x015b:
            float r12 = r12 * r2
            android.view.View r14 = r11.f61782b
            int r14 = r14.getMeasuredHeight()
            float r14 = (float) r14
            float r12 = r12 / r14
            float r12 = r12 * r13
            float r13 = r11.f61786f
            float r13 = r13 + r12
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x0171
            goto L_0x0179
        L_0x0171:
            int r14 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r14 <= 0) goto L_0x0178
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0179
        L_0x0178:
            r7 = r13
        L_0x0179:
            android.content.Context r12 = r11.f61781a
            ym0.C91515l.m114821e(r12, r7)
            on0.a$c r11 = r11.f61785e
            com.tencent.mm.plugin.appbrand.jsapi.video.a r11 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r11
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            boolean r12 = r12.mo22217d()
            if (r12 != 0) goto L_0x018c
            goto L_0x026d
        L_0x018c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "onAdjustBrightness:"
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r12)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.ui.AppBrandDotPercentIndicator r12 = r12.f49530q
            r12.setPercent(r7)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            android.widget.TextView r12 = r12.f49531r
            r13 = 2131832576(0x7f112f00, float:1.929821E38)
            r12.setText(r13)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            android.widget.ImageView r12 = r12.f49532s
            r13 = 2131231047(0x7f080147, float:1.8078164E38)
            r12.setImageResource(r13)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            android.widget.LinearLayout r12 = r12.f49528p
            r12.setVisibility(r4)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r11 = r11.f49577a
            r11.mo22228i()
            goto L_0x026d
        L_0x01c9:
            if (r14 != r0) goto L_0x026d
            on0.a$c r14 = r11.f61785e
            com.tencent.mm.plugin.appbrand.jsapi.video.a r14 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r14
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r14 = r14.f49577a
            int r0 = com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView.f49488Y0
            boolean r14 = r14.mo22217d()
            if (r14 != 0) goto L_0x01dc
        L_0x01d9:
            r3 = 0
            goto L_0x026d
        L_0x01dc:
            float r12 = r12 * r2
            android.view.View r14 = r11.f61782b
            int r14 = r14.getMeasuredHeight()
            float r14 = (float) r14
            float r14 = r12 / r14
            android.content.Context r0 = r11.f61781a
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            r1 = 3
            int r2 = r0.getStreamMaxVolume(r1)
            float r8 = (float) r2
            float r14 = r14 * r8
            float r14 = r14 * r13
            int r13 = (int) r14
            if (r13 != 0) goto L_0x0214
            float r14 = java.lang.Math.abs(r14)
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x0214
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x020f
            r5 = 1
            goto L_0x0215
        L_0x020f:
            int r12 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r12 >= 0) goto L_0x0214
            goto L_0x0215
        L_0x0214:
            r5 = r13
        L_0x0215:
            int r12 = r11.f61787g
            int r12 = r12 + r5
            if (r12 >= 0) goto L_0x021c
            r2 = 0
            goto L_0x0220
        L_0x021c:
            if (r12 < r2) goto L_0x021f
            goto L_0x0220
        L_0x021f:
            r2 = r12
        L_0x0220:
            p331dj.C107043a.m144905c(r0, r1, r2, r4)
            float r12 = (float) r2
            float r12 = r12 / r8
            on0.a$c r11 = r11.f61785e
            com.tencent.mm.plugin.appbrand.jsapi.video.a r11 = (com.tencent.p014mm.plugin.appbrand.jsapi.video.C17976a) r11
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r13 = r11.f49577a
            boolean r13 = r13.mo22217d()
            if (r13 != 0) goto L_0x0232
            goto L_0x026d
        L_0x0232:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "onAdjustVolume:"
            r13.append(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r13)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r13 = r11.f49577a
            com.tencent.mm.plugin.appbrand.jsapi.video.ui.AppBrandDotPercentIndicator r13 = r13.f49530q
            r13.setPercent(r12)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            android.widget.TextView r12 = r12.f49531r
            r13 = 2131832577(0x7f112f01, float:1.9298212E38)
            r12.setText(r13)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            android.widget.ImageView r12 = r12.f49532s
            r13 = 2131231053(0x7f08014d, float:1.8078176E38)
            r12.setImageResource(r13)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r12 = r11.f49577a
            android.widget.LinearLayout r12 = r12.f49528p
            r12.setVisibility(r4)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r11 = r11.f49577a
            r11.mo22228i()
        L_0x026d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: on0.C21801b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        C21797a aVar = this.f61798d;
        aVar.f61782b.postDelayed(aVar.f61791k, 200);
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/appbrand/jsapi/video/ui/VideoPlayerGestureController$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }
}
