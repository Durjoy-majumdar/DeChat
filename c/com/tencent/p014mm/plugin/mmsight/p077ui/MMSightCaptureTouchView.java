package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView */
public class MMSightCaptureTouchView extends RelativeLayout {

    /* renamed from: d */
    public long f313744d;

    /* renamed from: e */
    public float f313745e;

    /* renamed from: f */
    public int f313746f;

    /* renamed from: g */
    public C105491a f313747g;

    /* renamed from: h */
    public GestureDetector f313748h;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView$a */
    public interface C105491a {
        /* renamed from: a */
        void mo128048a();

        /* renamed from: b */
        void mo128049b();

        /* renamed from: c */
        void mo128050c();

        /* renamed from: e */
        void mo128051e(float f, float f2);
    }

    public MMSightCaptureTouchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            android.view.GestureDetector r8 = r11.f313748h
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r12)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView"
            java.lang.String r3 = "onTouchEvent"
            java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r5 = "android/view/GestureDetector_EXEC_"
            java.lang.String r6 = "onTouchEvent"
            java.lang.String r7 = "(Landroid/view/MotionEvent;)Z"
            r0 = r8
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r10 = 0
            java.lang.Object r0 = r9.mo10231a(r10)
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            boolean r1 = r8.onTouchEvent(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView"
            java.lang.String r3 = "onTouchEvent"
            java.lang.String r4 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r5 = "android/view/GestureDetector_EXEC_"
            java.lang.String r6 = "onTouchEvent"
            java.lang.String r7 = "(Landroid/view/MotionEvent;)Z"
            r0 = r8
            j20.C117292a.m165360f(r0, r1, r2, r3, r4, r5, r6, r7)
            int r0 = r12.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1
            java.lang.String r3 = "MicroMsg.MMSightCaptureTouchView"
            if (r0 == 0) goto L_0x00f1
            if (r0 == r2) goto L_0x00e7
            r1 = 2
            if (r0 == r1) goto L_0x006b
            r12 = 5
            if (r0 == r12) goto L_0x005f
            r12 = 6
            if (r0 == r12) goto L_0x0053
            goto L_0x00fd
        L_0x0053:
            java.lang.String r12 = "ACTION_POINTER_UP"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            int r12 = r11.f313746f
            int r12 = r12 - r2
            r11.f313746f = r12
            goto L_0x00fd
        L_0x005f:
            java.lang.String r12 = "ACTION_POINTER_DOWN"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            int r12 = r11.f313746f
            int r12 = r12 + r2
            r11.f313746f = r12
            goto L_0x00fd
        L_0x006b:
            int r0 = r11.f313746f
            if (r0 < r1) goto L_0x00fd
            r4 = 0
            if (r0 < r1) goto L_0x009c
            float r0 = r12.getX(r10)     // Catch:{ Exception -> 0x008e }
            float r1 = r12.getY(r10)     // Catch:{ Exception -> 0x008e }
            float r5 = r12.getX(r2)     // Catch:{ Exception -> 0x008e }
            float r12 = r12.getY(r2)     // Catch:{ Exception -> 0x008e }
            float r0 = r0 - r5
            float r0 = java.lang.Math.abs(r0)     // Catch:{ Exception -> 0x008e }
            float r1 = r1 - r12
            float r12 = java.lang.Math.abs(r1)     // Catch:{ Exception -> 0x008e }
            float r0 = r0 + r12
            goto L_0x009d
        L_0x008e:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r12 = r12.getMessage()
            r0[r10] = r12
            java.lang.String r12 = "pointerDistance error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r12, r0)
        L_0x009c:
            r0 = 0
        L_0x009d:
            java.lang.Object[] r12 = new java.lang.Object[r2]
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r12[r10] = r1
            java.lang.String r1 = "distance: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r1, r12)
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x00fd
            float r12 = r11.f313745e
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x00b7
            r11.f313745e = r0
            goto L_0x00fd
        L_0x00b7:
            float r12 = r0 - r12
            float r12 = java.lang.Math.abs(r12)
            r1 = 1097859072(0x41700000, float:15.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x00fd
            float r12 = r11.f313745e
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x00d7
            java.lang.String r12 = "zoom out"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView$a r12 = r11.f313747g
            if (r12 == 0) goto L_0x00e4
            r12.mo128048a()
            goto L_0x00e4
        L_0x00d7:
            java.lang.String r12 = "zoom in"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView$a r12 = r11.f313747g
            if (r12 == 0) goto L_0x00e4
            r12.mo128049b()
        L_0x00e4:
            r11.f313745e = r0
            goto L_0x00fd
        L_0x00e7:
            java.lang.String r12 = "ACTION_UP"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            r11.f313745e = r1
            r11.f313746f = r10
            goto L_0x00fd
        L_0x00f1:
            java.lang.String r12 = "ACTION_DOWN"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r12)
            r11.f313745e = r1
            int r12 = r11.f313746f
            int r12 = r12 + r2
            r11.f313746f = r12
        L_0x00fd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.MMSightCaptureTouchView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setTouchCallback(C105491a aVar) {
        this.f313747g = aVar;
    }

    public MMSightCaptureTouchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f313744d = 0;
        this.f313745e = -1.0f;
        this.f313746f = 0;
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C105541l(this));
        this.f313748h = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }
}
