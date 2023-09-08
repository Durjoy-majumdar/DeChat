package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/ui/base/DragDownContainer;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/ui/base/DragDownContainer$a;", "d", "Lcom/tencent/mm/ui/base/DragDownContainer$a;", "getScaleListener", "()Lcom/tencent/mm/ui/base/DragDownContainer$a;", "setScaleListener", "(Lcom/tencent/mm/ui/base/DragDownContainer$a;)V", "scaleListener", "Landroid/view/View;", "e", "Landroid/view/View;", "getGalleryBg", "()Landroid/view/View;", "setGalleryBg", "(Landroid/view/View;)V", "galleryBg", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.base.DragDownContainer */
public final class DragDownContainer extends FrameLayout {

    /* renamed from: d */
    public C106642a f318673d;

    /* renamed from: e */
    public View f318674e;

    /* renamed from: f */
    public float f318675f;

    /* renamed from: g */
    public float f318676g;

    /* renamed from: h */
    public VelocityTracker f318677h;

    /* renamed from: i */
    public float f318678i;

    /* renamed from: j */
    public float f318679j;

    /* renamed from: n */
    public VelocityTracker f318680n;

    /* renamed from: o */
    public boolean f318681o;

    /* renamed from: p */
    public boolean f318682p;

    /* renamed from: com.tencent.mm.ui.base.DragDownContainer$a */
    public interface C106642a {
        /* renamed from: a */
        void mo86630a();

        /* renamed from: b */
        void mo86631b(float f);

        /* renamed from: c */
        void mo86632c();
    }

    /* renamed from: com.tencent.mm.ui.base.DragDownContainer$b */
    public static final class C106643b implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ DragDownContainer f318683d;

        public C106643b(DragDownContainer dragDownContainer) {
            this.f318683d = dragDownContainer;
        }

        /* JADX WARNING: type inference failed for: r11v4, types: [android.content.Context] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
            /*
                r9 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r10)
                r0.add(r11)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/ui/base/DragDownContainer$touchListener$1"
                java.lang.String r2 = "android/view/View$OnTouchListener"
                java.lang.String r3 = "onTouch"
                java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r5 = r9
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.String r10 = "event"
                gy3.C87412m.m108594g(r11, r10)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "onTouch() called with: event = "
                r10.append(r0)
                int r0 = r11.getAction()
                java.lang.String r0 = android.view.MotionEvent.actionToString(r0)
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                java.lang.String r0 = "DragDownContainer"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r10)
                com.tencent.mm.ui.base.DragDownContainer r10 = r9.f318683d
                android.view.VelocityTracker r0 = r10.f318680n
                if (r0 != 0) goto L_0x004d
                android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
                r10.f318680n = r0
            L_0x004d:
                r0.addMovement(r11)
                int r1 = r11.getAction()
                r1 = r1 & 255(0xff, float:3.57E-43)
                r2 = 0
                if (r1 == 0) goto L_0x00db
                r3 = 0
                r4 = 1
                if (r1 == r4) goto L_0x00b6
                r5 = 2
                if (r1 == r5) goto L_0x0062
                goto L_0x00e7
            L_0x0062:
                float r1 = r11.getX()
                float r5 = r10.f318675f
                float r1 = r1 - r5
                float r11 = r11.getY()
                float r5 = r10.f318676g
                float r11 = r11 - r5
                r5 = 1000(0x3e8, float:1.401E-42)
                r0.computeCurrentVelocity(r5)
                float r5 = r0.getXVelocity()
                int r5 = (int) r5
                float r6 = r0.getYVelocity()
                int r6 = (int) r6
                float r7 = java.lang.Math.abs(r1)
                r8 = 1132068864(0x437a0000, float:250.0)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 > 0) goto L_0x0095
                int r7 = java.lang.Math.abs(r6)
                int r5 = java.lang.Math.abs(r5)
                if (r7 <= r5) goto L_0x0095
                if (r6 > 0) goto L_0x0099
            L_0x0095:
                boolean r5 = r10.f318681o
                if (r5 == 0) goto L_0x009f
            L_0x0099:
                r10.mo153401a(r1, r11)
                r10.f318681o = r4
                goto L_0x00a1
            L_0x009f:
                r10.f318681o = r2
            L_0x00a1:
                r1 = 1128792064(0x43480000, float:200.0)
                int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x00aa
                r10.f318682p = r2
                goto L_0x00ac
            L_0x00aa:
                r10.f318682p = r4
            L_0x00ac:
                android.view.VelocityTracker r11 = r10.f318680n
                if (r11 == 0) goto L_0x00e7
                r0.recycle()
                r10.f318680n = r3
                goto L_0x00e7
            L_0x00b6:
                boolean r11 = r10.f318682p
                if (r11 == 0) goto L_0x00c1
                r11 = 0
                r10.mo153401a(r11, r11)
                r10.f318681o = r2
                goto L_0x00e7
            L_0x00c1:
                boolean r11 = r10.f318681o
                if (r11 == 0) goto L_0x00e7
                android.content.Context r11 = r10.getContext()
                boolean r0 = r11 instanceof android.app.Activity
                if (r0 == 0) goto L_0x00d0
                r3 = r11
                android.app.Activity r3 = (android.app.Activity) r3
            L_0x00d0:
                if (r3 == 0) goto L_0x00d8
                r3.finishAfterTransition()
                r3.overridePendingTransition(r2, r2)
            L_0x00d8:
                r10.f318681o = r2
                goto L_0x00e7
            L_0x00db:
                float r0 = r11.getX()
                r10.f318675f = r0
                float r11 = r11.getY()
                r10.f318676g = r11
            L_0x00e7:
                com.tencent.mm.ui.base.DragDownContainer r10 = r9.f318683d
                boolean r10 = r10.f318681o
                java.lang.String r2 = "com/tencent/mm/ui/base/DragDownContainer$touchListener$1"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r0 = r10
                r1 = r9
                j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.DragDownContainer.C106643b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragDownContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setOnTouchListener(new C106643b(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo153401a(float r8, float r9) {
        /*
            r7 = this;
            r0 = 1
            float r1 = (float) r0
            int r2 = r7.getHeight()
            float r2 = (float) r2
            float r2 = r9 / r2
            float r1 = r1 - r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0012
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0012:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Float r3 = java.lang.Float.valueOf(r8)
            r4 = 0
            r2[r4] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r9)
            r2[r0] = r3
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            r5 = 2
            r2[r5] = r3
            java.lang.String r3 = "DragDownContainer"
            java.lang.String r6 = "onGalleryScale tx: %f, ty: %f, scale: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r2)
            android.view.View r2 = r7.getChildAt(r4)
            if (r2 == 0) goto L_0x008e
            r3 = 0
            int r6 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x003d
            r6 = 1
            goto L_0x003e
        L_0x003d:
            r6 = 0
        L_0x003e:
            if (r6 == 0) goto L_0x0050
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            com.tencent.mm.ui.base.DragDownContainer$a r0 = r7.f318673d
            if (r0 == 0) goto L_0x0069
            r0.mo86630a()
            goto L_0x0069
        L_0x0050:
            float r0 = java.lang.Math.abs(r8)
            r3 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0062
            float r0 = java.lang.Math.abs(r9)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0069
        L_0x0062:
            com.tencent.mm.ui.base.DragDownContainer$a r0 = r7.f318673d
            if (r0 == 0) goto L_0x0069
            r0.mo86632c()
        L_0x0069:
            int r0 = r7.getWidth()
            int r0 = r0 / r5
            float r0 = (float) r0
            r2.setPivotX(r0)
            int r0 = r7.getHeight()
            int r0 = r0 / r5
            float r0 = (float) r0
            r2.setPivotY(r0)
            r2.setScaleX(r1)
            r2.setScaleY(r1)
            r2.setTranslationX(r8)
            r2.setTranslationY(r9)
            com.tencent.mm.ui.base.DragDownContainer$a r8 = r7.f318673d
            if (r8 == 0) goto L_0x008e
            r8.mo86631b(r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.base.DragDownContainer.mo153401a(float, float):void");
    }

    public final View getGalleryBg() {
        return this.f318674e;
    }

    public final C106642a getScaleListener() {
        return this.f318673d;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        boolean z = true;
        if (super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        VelocityTracker velocityTracker = this.f318677h;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.f318677h = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        int yVelocity = (int) velocityTracker.getYVelocity();
        int action = motionEvent.getAction() & 255;
        boolean z2 = false;
        if (action == 0) {
            this.f318678i = motionEvent.getRawX();
            this.f318679j = motionEvent.getRawY();
        } else if (action != 1 && action == 2) {
            float rawX = motionEvent.getRawX() - this.f318678i;
            Log.m105919d("DragDownContainer", "onInterceptTouchEvent action_move tx: %f, ty: %f, velocityX: %d, velocityY: %d", Float.valueOf(rawX), Float.valueOf(motionEvent.getRawY() - this.f318679j), Integer.valueOf(xVelocity), Integer.valueOf(yVelocity));
            if (Math.abs(rawX) > 250.0f || Math.abs(yVelocity) <= Math.abs(xVelocity) || Math.abs(yVelocity) <= 0) {
                z = false;
            } else {
                Log.m105925i("DragDownContainer", "onInterceptTouchEvent action: %d", Integer.valueOf(motionEvent.getAction()));
            }
            z2 = z;
        }
        if (z2) {
            this.f318675f = motionEvent.getRawX();
            this.f318676g = motionEvent.getRawY();
        }
        return z2;
    }

    public final void setGalleryBg(View view) {
        this.f318674e = view;
    }

    public final void setScaleListener(C106642a aVar) {
        this.f318673d = aVar;
    }
}
