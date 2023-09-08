package com.tencent.p014mm.live.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;
import x50.C66235b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/live/core/view/LiveCameraOptionView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/live/core/view/LiveCameraOptionView$a;", "callback", "Lrx3/b0;", "setTouchCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.view.LiveCameraOptionView */
public final class LiveCameraOptionView extends RelativeLayout {

    /* renamed from: d */
    public C55208a f157146d;

    /* renamed from: e */
    public long f157147e;

    /* renamed from: f */
    public float f157148f = -1.0f;

    /* renamed from: g */
    public int f157149g;

    /* renamed from: h */
    public final LiveCameraFocusView f157150h;

    /* renamed from: i */
    public GestureDetector f157151i;

    /* renamed from: com.tencent.mm.live.core.view.LiveCameraOptionView$a */
    public interface C55208a {
        /* renamed from: a */
        void mo76414a();

        /* renamed from: b */
        void mo76415b();

        /* renamed from: c */
        void mo76416c();

        /* renamed from: d */
        void mo76417d(float f, float f2, int i, int i2, long j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCameraOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        LiveCameraFocusView liveCameraFocusView = new LiveCameraFocusView(context2);
        liveCameraFocusView.mo76410a(C76577a.m92151b(liveCameraFocusView.getContext(), 120), C76577a.m92151b(liveCameraFocusView.getContext(), 120), liveCameraFocusView.getContext().getResources().getColor(C0966R.color.akw));
        this.f157150h = liveCameraFocusView;
        addView(liveCameraFocusView);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C66235b(this));
        this.f157151i = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r12, r0)
            android.view.GestureDetector r0 = r11.f157151i
            if (r0 == 0) goto L_0x00d9
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r12)
            java.lang.Object[] r2 = r9.mo10232b()
            java.lang.String r3 = "com/tencent/mm/live/core/view/LiveCameraOptionView"
            java.lang.String r4 = "onTouchEvent"
            java.lang.String r5 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r6 = "android/view/GestureDetector_EXEC_"
            java.lang.String r7 = "onTouchEvent"
            java.lang.String r8 = "(Landroid/view/MotionEvent;)Z"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            r10 = 0
            java.lang.Object r1 = r9.mo10231a(r10)
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            boolean r2 = r0.onTouchEvent(r1)
            java.lang.String r3 = "com/tencent/mm/live/core/view/LiveCameraOptionView"
            java.lang.String r4 = "onTouchEvent"
            java.lang.String r5 = "(Landroid/view/MotionEvent;)Z"
            java.lang.String r6 = "android/view/GestureDetector_EXEC_"
            java.lang.String r7 = "onTouchEvent"
            java.lang.String r8 = "(Landroid/view/MotionEvent;)Z"
            r1 = r0
            j20.C117292a.m165360f(r1, r2, r3, r4, r5, r6, r7, r8)
            int r0 = r12.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1
            if (r0 == 0) goto L_0x00d1
            if (r0 == r2) goto L_0x00cc
            r1 = 2
            if (r0 == r1) goto L_0x0067
            r12 = 5
            if (r0 == r12) goto L_0x0060
            r12 = 6
            if (r0 == r12) goto L_0x0058
            goto L_0x00d8
        L_0x0058:
            int r12 = r11.f157149g
            int r12 = r12 + -1
            r11.f157149g = r12
            goto L_0x00d8
        L_0x0060:
            int r12 = r11.f157149g
            int r12 = r12 + r2
            r11.f157149g = r12
            goto L_0x00d8
        L_0x0067:
            int r0 = r11.f157149g
            if (r0 < r1) goto L_0x00d8
            r3 = 0
            if (r0 < r1) goto L_0x009a
            float r0 = r12.getX(r10)     // Catch:{ Exception -> 0x008a }
            float r1 = r12.getY(r10)     // Catch:{ Exception -> 0x008a }
            float r4 = r12.getX(r2)     // Catch:{ Exception -> 0x008a }
            float r12 = r12.getY(r2)     // Catch:{ Exception -> 0x008a }
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)     // Catch:{ Exception -> 0x008a }
            float r1 = r1 - r12
            float r12 = java.lang.Math.abs(r1)     // Catch:{ Exception -> 0x008a }
            float r0 = r0 + r12
            goto L_0x009b
        L_0x008a:
            r12 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r12 = r12.getMessage()
            r0[r10] = r12
            java.lang.String r12 = "LiveCameraOptionView"
            java.lang.String r1 = "pointerDistance error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r12, r1, r0)
        L_0x009a:
            r0 = 0
        L_0x009b:
            int r12 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r12 <= 0) goto L_0x00d8
            float r12 = r11.f157148f
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x00a8
            r11.f157148f = r0
            goto L_0x00d8
        L_0x00a8:
            float r12 = r0 - r12
            float r12 = java.lang.Math.abs(r12)
            r1 = 1097859072(0x41700000, float:15.0)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 <= 0) goto L_0x00d8
            float r12 = r11.f157148f
            int r12 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c2
            com.tencent.mm.live.core.view.LiveCameraOptionView$a r12 = r11.f157146d
            if (r12 == 0) goto L_0x00c9
            r12.mo76414a()
            goto L_0x00c9
        L_0x00c2:
            com.tencent.mm.live.core.view.LiveCameraOptionView$a r12 = r11.f157146d
            if (r12 == 0) goto L_0x00c9
            r12.mo76415b()
        L_0x00c9:
            r11.f157148f = r0
            goto L_0x00d8
        L_0x00cc:
            r11.f157148f = r1
            r11.f157149g = r10
            goto L_0x00d8
        L_0x00d1:
            r11.f157148f = r1
            int r12 = r11.f157149g
            int r12 = r12 + r2
            r11.f157149g = r12
        L_0x00d8:
            return r2
        L_0x00d9:
            java.lang.String r12 = "gestureDetector"
            gy3.C87412m.m108603p(r12)
            r12 = 0
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.core.view.LiveCameraOptionView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setTouchCallback(C55208a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f157146d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveCameraOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        LiveCameraFocusView liveCameraFocusView = new LiveCameraFocusView(context2);
        liveCameraFocusView.mo76410a(C76577a.m92151b(liveCameraFocusView.getContext(), 120), C76577a.m92151b(liveCameraFocusView.getContext(), 120), liveCameraFocusView.getContext().getResources().getColor(C0966R.color.akw));
        this.f157150h = liveCameraFocusView;
        addView(liveCameraFocusView);
        GestureDetector gestureDetector = new GestureDetector(getContext(), new C66235b(this));
        this.f157151i = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }
}
