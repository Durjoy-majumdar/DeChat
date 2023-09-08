package com.tencent.p014mm.plugin.finder.view.sidebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/sidebar/DraggableConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "need", "Lrx3/b0;", "setNeedIntercept", "", "angle", "setAngle", "Lcom/tencent/mm/plugin/finder/view/sidebar/DraggableConstraintLayout$a;", "D", "Lcom/tencent/mm/plugin/finder/view/sidebar/DraggableConstraintLayout$a;", "getDragListener", "()Lcom/tencent/mm/plugin/finder/view/sidebar/DraggableConstraintLayout$a;", "setDragListener", "(Lcom/tencent/mm/plugin/finder/view/sidebar/DraggableConstraintLayout$a;)V", "dragListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout */
public final class DraggableConstraintLayout extends ConstraintLayout {

    /* renamed from: L */
    public static int f312947L = 45;

    /* renamed from: A */
    public int f312948A;

    /* renamed from: B */
    public int f312949B;

    /* renamed from: C */
    public int f312950C;

    /* renamed from: D */
    public C105319a f312951D;

    /* renamed from: E */
    public VelocityTracker f312952E;

    /* renamed from: F */
    public boolean f312953F;

    /* renamed from: G */
    public int f312954G;

    /* renamed from: H */
    public int f312955H;

    /* renamed from: I */
    public int f312956I;

    /* renamed from: J */
    public int f312957J;

    /* renamed from: K */
    public boolean f312958K;

    /* renamed from: v */
    public int f312959v = 8;

    /* renamed from: w */
    public int f312960w;

    /* renamed from: x */
    public int f312961x;

    /* renamed from: y */
    public int f312962y;

    /* renamed from: z */
    public double f312963z;

    /* renamed from: com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout$a */
    public interface C105319a {
        /* renamed from: a */
        void mo85825a();

        /* renamed from: b */
        void mo85826b(int i);

        /* renamed from: c */
        void mo85827c(boolean z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int i = 8;
        int i2 = 8000;
        this.f312960w = 8000;
        this.f312961x = 25;
        this.f312962y = 400;
        this.f312963z = Math.tan(((double) (((float) f312947L) / 180.0f)) * 3.141592653589793d);
        this.f312948A = 0;
        this.f312950C = Integer.MAX_VALUE;
        this.f312954G = -1;
        this.f312958K = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f312959v = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : i;
        this.f312960w = viewConfiguration != null ? viewConfiguration.getScaledMaximumFlingVelocity() : i2;
        this.f312961x = C76577a.m92151b(getContext(), 25);
        this.f312962y = C76577a.m92151b(getContext(), 400);
    }

    public final C105319a getDragListener() {
        return this.f312951D;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r0 != 3) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onInterceptTouchEvent, "
            r0.append(r1)
            gy3.C87412m.m108591d(r11)
            int r1 = r11.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.mo149807t(r0)
            int r0 = r10.f312948A
            if (r0 == 0) goto L_0x0102
            boolean r0 = r10.f312958K
            if (r0 != 0) goto L_0x0027
            goto L_0x0102
        L_0x0027:
            int r0 = r11.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x0034
            boolean r3 = r10.f312953F
            if (r3 == 0) goto L_0x0034
            return r2
        L_0x0034:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00cd
            if (r0 == r2) goto L_0x00af
            if (r0 == r1) goto L_0x0042
            r11 = 3
            if (r0 == r11) goto L_0x00af
            goto L_0x00ff
        L_0x0042:
            int r0 = r10.f312954G
            r1 = -1
            if (r0 != r1) goto L_0x004a
            boolean r11 = r10.f312953F
            return r11
        L_0x004a:
            int r0 = r11.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0053
            boolean r11 = r10.f312953F
            return r11
        L_0x0053:
            float r1 = r11.getX(r0)
            int r7 = (int) r1
            float r0 = r11.getY(r0)
            int r8 = (int) r0
            int r0 = r10.f312955H
            int r5 = r7 - r0
            int r0 = r10.f312948A
            if (r0 != r2) goto L_0x0068
            if (r5 >= 0) goto L_0x006c
            goto L_0x006a
        L_0x0068:
            if (r5 <= 0) goto L_0x006c
        L_0x006a:
            r6 = 1
            goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onInterceptTouchEvent ACTION_MOVE x:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", distance:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", matchDirection:"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", check: "
            r0.append(r1)
            int r1 = java.lang.Math.abs(r5)
            int r4 = r10.f312959v
            if (r1 <= r4) goto L_0x009e
            boolean r1 = r10.f312953F
            if (r1 != 0) goto L_0x009f
            if (r6 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r10.mo149807t(r0)
            r4 = r10
            r9 = r11
            r4.mo149801r(r5, r6, r7, r8, r9)
            goto L_0x00ff
        L_0x00af:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "onInterceptTouchEvent ACTION_UP/ACTION_CANCEL mIsBeingDragged:"
            r11.append(r0)
            boolean r0 = r10.f312953F
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.mo149807t(r11)
            boolean r11 = r10.f312953F
            if (r11 == 0) goto L_0x00ff
            r10.mo149803s()
            goto L_0x00ff
        L_0x00cd:
            boolean r0 = r10.f312953F
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "onInterceptTouchEvent ACTION_DOWN begin"
            r10.mo149807t(r0)
            float r0 = r11.getX()
            int r0 = (int) r0
            r10.f312955H = r0
            float r0 = r11.getY()
            int r0 = (int) r0
            r10.f312956I = r0
            int r0 = r11.getPointerId(r3)
            r10.f312954G = r0
            android.view.VelocityTracker r0 = r10.f312952E
            if (r0 != 0) goto L_0x00f5
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.f312952E = r0
            goto L_0x00f8
        L_0x00f5:
            r0.clear()
        L_0x00f8:
            android.view.VelocityTracker r0 = r10.f312952E
            if (r0 == 0) goto L_0x00ff
            r0.addMovement(r11)
        L_0x00ff:
            boolean r11 = r10.f312953F
            return r11
        L_0x0102:
            boolean r11 = super.onInterceptTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r0 != 3) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onTouchEvent , "
            r0.append(r1)
            gy3.C87412m.m108591d(r11)
            int r1 = r11.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.mo149807t(r0)
            int r0 = r10.f312948A
            if (r0 != 0) goto L_0x0026
            boolean r11 = super.onTouchEvent(r11)
            return r11
        L_0x0026:
            android.view.VelocityTracker r0 = r10.f312952E
            if (r0 != 0) goto L_0x0030
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r10.f312952E = r0
        L_0x0030:
            int r0 = r11.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == r1) goto L_0x00ef
            r2 = 2
            if (r0 == r2) goto L_0x0041
            r11 = 3
            if (r0 == r11) goto L_0x00ef
            goto L_0x010c
        L_0x0041:
            int r0 = r10.f312954G
            r3 = -1
            if (r0 != r3) goto L_0x0047
            return r1
        L_0x0047:
            int r0 = r11.findPointerIndex(r0)
            if (r0 != r3) goto L_0x004e
            return r1
        L_0x004e:
            float r3 = r11.getX(r0)
            int r7 = (int) r3
            float r0 = r11.getY(r0)
            int r8 = (int) r0
            int r0 = r10.f312955H
            int r5 = r7 - r0
            int r0 = r10.f312948A
            r3 = 0
            if (r0 != r1) goto L_0x0064
            if (r5 >= 0) goto L_0x0068
            goto L_0x0066
        L_0x0064:
            if (r5 <= 0) goto L_0x0068
        L_0x0066:
            r6 = 1
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "onTouchEvent ACTION_MOVE x:"
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ", distance:"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ", mTouchSlop:"
            r0.append(r4)
            int r4 = r10.f312959v
            r0.append(r4)
            java.lang.String r4 = ", matchDirection:"
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r10.mo149807t(r0)
            boolean r0 = r10.f312953F
            if (r0 != 0) goto L_0x00a1
            r4 = r10
            r9 = r11
            r4.mo149801r(r5, r6, r7, r8, r9)
            goto L_0x010c
        L_0x00a1:
            int r0 = r10.f312955H
            int r0 = r7 - r0
            int r4 = r10.f312957J
            int r4 = r4 + r0
            r10.f312957J = r4
            if (r4 <= 0) goto L_0x00b3
            int r0 = r10.f312948A
            if (r0 != r1) goto L_0x00b3
            r10.f312957J = r3
            goto L_0x00bb
        L_0x00b3:
            if (r4 >= 0) goto L_0x00bb
            int r0 = r10.f312948A
            if (r0 != r2) goto L_0x00bb
            r10.f312957J = r3
        L_0x00bb:
            int r0 = r10.f312957J
            int r0 = java.lang.Math.abs(r0)
            int r2 = r10.f312950C
            if (r0 <= r2) goto L_0x00cf
            int r0 = r10.f312957J
            if (r0 <= 0) goto L_0x00cc
            r10.f312957J = r2
            goto L_0x00cf
        L_0x00cc:
            int r0 = -r2
            r10.f312957J = r0
        L_0x00cf:
            com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout$a r0 = r10.f312951D
            if (r0 == 0) goto L_0x00d8
            int r2 = r10.f312957J
            r0.mo85826b(r2)
        L_0x00d8:
            r10.f312953F = r1
            r10.f312955H = r7
            r10.f312956I = r8
            android.view.VelocityTracker r0 = r10.f312952E
            if (r0 == 0) goto L_0x00e5
            r0.addMovement(r11)
        L_0x00e5:
            android.view.ViewParent r11 = r10.getParent()
            if (r11 == 0) goto L_0x010c
            r11.requestDisallowInterceptTouchEvent(r1)
            goto L_0x010c
        L_0x00ef:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "onTouchEvent ACTION_UP/ACTION_CANCEL mIsBeingDragged:"
            r11.append(r0)
            boolean r0 = r10.f312953F
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r10.mo149807t(r11)
            boolean r11 = r10.f312953F
            if (r11 == 0) goto L_0x010c
            r10.mo149803s()
        L_0x010c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public final void mo149801r(int i, boolean z, int i2, int i3, MotionEvent motionEvent) {
        if (Math.abs(i) > this.f312959v && z) {
            int i4 = i2 - this.f312955H;
            int i5 = i3 - this.f312956I;
            double abs = Math.abs(((double) i4) * this.f312963z);
            double d = ((double) -1) * abs;
            mo149807t("checkAngle angleRate:" + this.f312963z + ", x,y:(" + i2 + ", " + i3 + "), lastX,Y:(" + this.f312955H + ", " + this.f312956I + "), x1,y1:(" + i4 + ", " + i5 + "), minY:" + d + ", maxY:" + abs);
            double d2 = (double) i5;
            if (d2 >= d && d2 <= abs) {
                this.f312955H = i2;
                this.f312956I = i3;
                this.f312953F = true;
                C105319a aVar = this.f312951D;
                if (aVar != null) {
                    aVar.mo85825a();
                }
                if (this.f312952E == null) {
                    this.f312952E = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.f312952E;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
        }
        if (Math.abs(i) > this.f312959v) {
            this.f312955H = i2;
            this.f312956I = i3;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.f312953F) {
            mo149807t("requestDisallowInterceptTouchEvent " + z);
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (java.lang.Math.abs(r3) > ((float) r7.f312962y)) goto L_0x0010;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo149803s() {
        /*
            r7 = this;
            com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout$a r0 = r7.f312951D
            r1 = 0
            if (r0 == 0) goto L_0x0054
            int r2 = r7.f312957J
            int r3 = java.lang.Math.abs(r2)
            int r4 = r7.f312949B
            r5 = 1
            if (r3 <= r4) goto L_0x0012
        L_0x0010:
            r5 = 0
            goto L_0x0051
        L_0x0012:
            android.view.VelocityTracker r3 = r7.f312952E
            if (r3 == 0) goto L_0x001e
            r4 = 1000(0x3e8, float:1.401E-42)
            int r6 = r7.f312960w
            float r6 = (float) r6
            r3.computeCurrentVelocity(r4, r6)
        L_0x001e:
            android.view.VelocityTracker r3 = r7.f312952E
            r4 = 0
            if (r3 == 0) goto L_0x002a
            int r6 = r7.f312954G
            float r3 = r3.getXVelocity(r6)
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r6 = r7.f312948A
            if (r6 != r5) goto L_0x0034
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x003a
            goto L_0x0038
        L_0x0034:
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x003a
        L_0x0038:
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            int r2 = java.lang.Math.abs(r2)
            int r6 = r7.f312961x
            if (r2 <= r6) goto L_0x0051
            if (r4 == 0) goto L_0x0051
            float r2 = java.lang.Math.abs(r3)
            int r3 = r7.f312962y
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0051
            goto L_0x0010
        L_0x0051:
            r0.mo85827c(r5)
        L_0x0054:
            r7.f312953F = r1
            r0 = -1
            r7.f312954G = r0
            r7.f312957J = r1
            r7.f312955H = r1
            r7.f312956I = r1
            android.view.VelocityTracker r0 = r7.f312952E
            if (r0 == 0) goto L_0x0066
            r0.recycle()
        L_0x0066:
            r0 = 0
            r7.f312952E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.sidebar.DraggableConstraintLayout.mo149803s():void");
    }

    public final void setAngle(int i) {
        this.f312963z = Math.tan(((double) (((float) (i % 180)) / 180.0f)) * 3.141592653589793d);
    }

    public final void setDragListener(C105319a aVar) {
        this.f312951D = aVar;
    }

    public final void setNeedIntercept(boolean z) {
        this.f312958K = z;
        mo149807t("setNeedIntercept, " + this.f312958K);
    }

    /* renamed from: t */
    public final void mo149807t(String str) {
        Log.m105924i("lxl layout", str);
    }

    /* renamed from: w */
    public final void mo149808w(boolean z, int i, int i2) {
        this.f312948A = z ? 1 : 2;
        this.f312950C = i2;
        this.f312949B = i;
        mo149807t("enableDrag, dragMode:" + this.f312948A + ", maxTotalDistance:" + i2 + ", springBackDistance:" + i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        int i2 = 8;
        int i3 = 8000;
        this.f312960w = 8000;
        this.f312961x = 25;
        this.f312962y = 400;
        this.f312963z = Math.tan(((double) (((float) f312947L) / 180.0f)) * 3.141592653589793d);
        this.f312948A = 0;
        this.f312950C = Integer.MAX_VALUE;
        this.f312954G = -1;
        this.f312958K = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f312959v = viewConfiguration != null ? viewConfiguration.getScaledTouchSlop() : i2;
        this.f312960w = viewConfiguration != null ? viewConfiguration.getScaledMaximumFlingVelocity() : i3;
        this.f312961x = C76577a.m92151b(getContext(), 25);
        this.f312962y = C76577a.m92151b(getContext(), 400);
    }
}
