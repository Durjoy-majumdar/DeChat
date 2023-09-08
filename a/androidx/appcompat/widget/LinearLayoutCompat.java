package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.tav.core.ExportErrorStatus;
import p1115h.C107922a;
import p433g.C107593a;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: d */
    public boolean f305490d;

    /* renamed from: e */
    public int f305491e;

    /* renamed from: f */
    public int f305492f;

    /* renamed from: g */
    public int f305493g;

    /* renamed from: h */
    public int f305494h;

    /* renamed from: i */
    public int f305495i;

    /* renamed from: j */
    public float f305496j;

    /* renamed from: n */
    public boolean f305497n;

    /* renamed from: o */
    public int[] f305498o;

    /* renamed from: p */
    public int[] f305499p;

    /* renamed from: q */
    public Drawable f305500q;

    /* renamed from: r */
    public int f305501r;

    /* renamed from: s */
    public int f305502s;

    /* renamed from: t */
    public int f305503t;

    /* renamed from: u */
    public int f305504u;

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: e */
    public void mo144062e(Canvas canvas, int i) {
        this.f305500q.setBounds(getPaddingLeft() + this.f305504u, i, (getWidth() - getPaddingRight()) - this.f305504u, this.f305502s + i);
        this.f305500q.draw(canvas);
    }

    /* renamed from: g */
    public void mo144063g(Canvas canvas, int i) {
        this.f305500q.setBounds(i, getPaddingTop() + this.f305504u, this.f305501r + i, (getHeight() - getPaddingBottom()) - this.f305504u);
        this.f305500q.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.f305491e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f305491e;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f305492f;
                if (this.f305493g == 1 && (i = this.f305494h & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f305495i) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f305495i;
                    }
                }
                return i3 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f305491e == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f305491e;
    }

    public Drawable getDividerDrawable() {
        return this.f305500q;
    }

    public int getDividerPadding() {
        return this.f305504u;
    }

    public int getDividerWidth() {
        return this.f305501r;
    }

    public int getGravity() {
        return this.f305494h;
    }

    public int getOrientation() {
        return this.f305493g;
    }

    public int getShowDividers() {
        return this.f305503t;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f305496j;
    }

    /* renamed from: h */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f305493g;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: j */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: k */
    public boolean mo144074k(int i) {
        if (i == 0) {
            return (this.f305503t & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f305503t & 4) != 0;
        }
        if ((this.f305503t & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.f305500q != null) {
            int i4 = 0;
            if (this.f305493g == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo144074k(i4))) {
                        mo144062e(canvas, (childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin) - this.f305502s);
                    }
                    i4++;
                }
                if (mo144074k(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    mo144062e(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f305502s : childAt2.getBottom() + ((LayoutParams) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = C103553n0.m137647a(this);
            while (i4 < virtualChildCount2) {
                View childAt3 = getChildAt(i4);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo144074k(i4))) {
                    LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    mo144063g(canvas, a ? childAt3.getRight() + layoutParams.rightMargin : (childAt3.getLeft() - layoutParams.leftMargin) - this.f305501r);
                }
                i4++;
            }
            if (mo144074k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                    if (a) {
                        i3 = childAt4.getLeft() - layoutParams2.leftMargin;
                        i2 = this.f305501r;
                    } else {
                        i = childAt4.getRight() + layoutParams2.rightMargin;
                        mo144063g(canvas, i);
                    }
                } else if (a) {
                    i = getPaddingLeft();
                    mo144063g(canvas, i);
                } else {
                    i3 = getWidth() - getPaddingRight();
                    i2 = this.f305501r;
                }
                i = i3 - i2;
                mo144063g(canvas, i);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f305493g
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r8 = 1
            if (r1 != r8) goto L_0x00ba
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.f305494h
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.f305495i
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.f305495i
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d4
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b4
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b4
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            int r9 = r4.f305506b
            if (r9 >= 0) goto L_0x0074
            r9 = r6
        L_0x0074:
            java.util.WeakHashMap<android.view.View, e3.a0> r17 = p849e3.C107207u.f320808a
            int r7 = p849e3.C107207u.C107209c.m145195d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r9, r7)
            r7 = r7 & 7
            if (r7 == r8) goto L_0x008d
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0098
        L_0x0088:
            int r7 = r11 - r14
            int r9 = r4.rightMargin
            goto L_0x0097
        L_0x008d:
            int r7 = r10 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r1
            int r9 = r4.leftMargin
            int r7 = r7 + r9
            int r9 = r4.rightMargin
        L_0x0097:
            int r7 = r7 - r9
        L_0x0098:
            boolean r9 = r0.mo144074k(r3)
            if (r9 == 0) goto L_0x00a1
            int r9 = r0.f305502s
            int r2 = r2 + r9
        L_0x00a1:
            int r9 = r4.topMargin
            int r2 = r2 + r9
            int r9 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r9
            r13.layout(r7, r9, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r2 = r2 + r15
            int r3 = r3 + 0
        L_0x00b4:
            int r3 = r3 + r8
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00ba:
            boolean r1 = androidx.appcompat.widget.C103553n0.m137647a(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r9 = r25.getPaddingBottom()
            int r5 = r5 - r9
            int r9 = r25.getVirtualChildCount()
            int r10 = r0.f305494h
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f305490d
            int[] r12 = r0.f305498o
            int[] r13 = r0.f305499p
            java.util.WeakHashMap<android.view.View, e3.a0> r14 = p849e3.C107207u.f320808a
            int r14 = p849e3.C107207u.C107209c.m145195d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r8) goto L_0x00ff
            r14 = 5
            if (r6 == r14) goto L_0x00f3
            int r6 = r25.getPaddingLeft()
            goto L_0x010b
        L_0x00f3:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.f305495i
            int r6 = r6 - r14
            goto L_0x010b
        L_0x00ff:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.f305495i
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x010b:
            if (r1 == 0) goto L_0x0111
            int r1 = r9 + -1
            r15 = -1
            goto L_0x0113
        L_0x0111:
            r1 = 0
            r15 = 1
        L_0x0113:
            r18 = r6
            r6 = 0
        L_0x0116:
            if (r6 >= r9) goto L_0x01d4
            int r19 = r15 * r6
            int r8 = r1 + r19
            android.view.View r2 = r0.getChildAt(r8)
            if (r2 != 0) goto L_0x012e
            int r18 = r18 + 0
        L_0x0124:
            r28 = r1
            r30 = r9
            r22 = r10
            r1 = 0
        L_0x012b:
            r2 = 1
            goto L_0x01c6
        L_0x012e:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0124
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            if (r11 == 0) goto L_0x0156
            r28 = r1
            int r1 = r14.height
            r30 = r9
            r9 = -1
            if (r1 == r9) goto L_0x015a
            int r9 = r2.getBaseline()
            goto L_0x015b
        L_0x0156:
            r28 = r1
            r30 = r9
        L_0x015a:
            r9 = -1
        L_0x015b:
            int r1 = r14.f305506b
            if (r1 >= 0) goto L_0x0160
            r1 = r10
        L_0x0160:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0198
            r10 = 48
            if (r1 == r10) goto L_0x0189
            r10 = 80
            if (r1 == r10) goto L_0x0173
            r1 = r4
            r10 = -1
            goto L_0x01a4
        L_0x0173:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r9 == r10) goto L_0x01a4
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r9
            r9 = 2
            r24 = r13[r9]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a4
        L_0x0189:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r9 == r10) goto L_0x01a4
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r9
            int r1 = r1 + r23
            goto L_0x01a4
        L_0x0198:
            r10 = -1
            int r1 = r5 - r21
            r9 = 2
            int r1 = r1 / r9
            int r1 = r1 + r4
            int r9 = r14.topMargin
            int r1 = r1 + r9
            int r9 = r14.bottomMargin
            int r1 = r1 - r9
        L_0x01a4:
            boolean r8 = r0.mo144074k(r8)
            if (r8 == 0) goto L_0x01ae
            int r8 = r0.f305501r
            int r18 = r18 + r8
        L_0x01ae:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r18 + r3
            int r6 = r6 + 0
            goto L_0x012b
        L_0x01c6:
            int r6 = r6 + r2
            r1 = r28
            r9 = r30
            r10 = r22
            r2 = 80
            r3 = 16
            r8 = 1
            goto L_0x0116
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x049d  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e0  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04f4  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x06de  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x07cc  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0836  */
    /* JADX WARNING: Removed duplicated region for block: B:378:0x088e  */
    /* JADX WARNING: Removed duplicated region for block: B:428:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r39, int r40) {
        /*
            r38 = this;
            r6 = r38
            r7 = r39
            r8 = r40
            int r0 = r6.f305493g
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x0393
            r6.f305495i = r4
            int r3 = r38.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r39)
            int r1 = android.view.View.MeasureSpec.getMode(r40)
            int r0 = r6.f305491e
            boolean r9 = r6.f305497n
            r13 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x0039:
            if (r13 >= r3) goto L_0x017b
            android.view.View r26 = r6.getChildAt(r13)
            if (r26 != 0) goto L_0x0047
            int r5 = r6.f305495i
            int r5 = r5 + r4
            r6.f305495i = r5
            goto L_0x004f
        L_0x0047:
            int r5 = r26.getVisibility()
            if (r5 != r12) goto L_0x005b
            int r13 = r13 + 0
        L_0x004f:
            r10 = r0
            r28 = r1
            r0 = r2
            r30 = r3
            r12 = r20
            r27 = 1
            goto L_0x0165
        L_0x005b:
            boolean r5 = r6.mo144074k(r13)
            if (r5 == 0) goto L_0x0068
            int r5 = r6.f305495i
            int r4 = r6.f305502s
            int r5 = r5 + r4
            r6.f305495i = r5
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r4 = r5.f305505a
            float r22 = r22 + r4
            if (r1 != r15) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r12 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            int r4 = r6.f305495i
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.f305495i = r4
            r10 = r0
            r28 = r1
            r29 = r2
            r30 = r3
            r14 = r5
            r5 = 1
            r27 = 1
            goto L_0x00ed
        L_0x0097:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00a3
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a3
            r5.height = r10
            r12 = 0
            goto L_0x00a5
        L_0x00a3:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            r4 = 0
            int r15 = (r22 > r14 ? 1 : (r22 == r14 ? 0 : -1))
            if (r15 != 0) goto L_0x00ad
            int r15 = r6.f305495i
            goto L_0x00ae
        L_0x00ad:
            r15 = 0
        L_0x00ae:
            r10 = r0
            r0 = r38
            r28 = r1
            r1 = r26
            r29 = r2
            r2 = r39
            r30 = r3
            r3 = r4
            r14 = 0
            r4 = r40
            r14 = r5
            r27 = 1
            r5 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00ca
            r14.height = r12
        L_0x00ca:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f305495i
            int r2 = r1 + r0
            int r3 = r14.topMargin
            int r2 = r2 + r3
            int r3 = r14.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f305495i = r1
            if (r9 == 0) goto L_0x00e9
            r4 = r18
            int r18 = java.lang.Math.max(r0, r4)
            goto L_0x00eb
        L_0x00e9:
            r4 = r18
        L_0x00eb:
            r5 = r23
        L_0x00ed:
            if (r10 < 0) goto L_0x00f7
            int r0 = r13 + 1
            if (r10 != r0) goto L_0x00f7
            int r0 = r6.f305495i
            r6.f305492f = r0
        L_0x00f7:
            if (r13 >= r10) goto L_0x0109
            float r0 = r14.f305505a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0101
            goto L_0x0109
        L_0x0101:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0109:
            r0 = r29
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0118
            int r1 = r14.width
            r2 = -1
            if (r1 != r2) goto L_0x0118
            r1 = 1
            r25 = 1
            goto L_0x0119
        L_0x0118:
            r1 = 0
        L_0x0119:
            int r2 = r14.leftMargin
            int r3 = r14.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r21
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r20
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r24 == 0) goto L_0x013c
            int r15 = r14.width
            r11 = -1
            if (r15 != r11) goto L_0x013c
            r11 = 1
            goto L_0x013d
        L_0x013c:
            r11 = 0
        L_0x013d:
            float r14 = r14.f305505a
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x014f
            if (r1 == 0) goto L_0x0147
            goto L_0x0148
        L_0x0147:
            r2 = r3
        L_0x0148:
            r14 = r19
            int r19 = java.lang.Math.max(r14, r2)
            goto L_0x015d
        L_0x014f:
            r14 = r19
            if (r1 == 0) goto L_0x0154
            goto L_0x0155
        L_0x0154:
            r2 = r3
        L_0x0155:
            r1 = r17
            int r17 = java.lang.Math.max(r1, r2)
            r19 = r14
        L_0x015d:
            int r13 = r13 + 0
            r21 = r4
            r23 = r5
            r24 = r11
        L_0x0165:
            int r13 = r13 + 1
            r2 = r0
            r0 = r10
            r20 = r12
            r1 = r28
            r3 = r30
            r4 = 0
            r5 = 1
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r14 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x017b:
            r28 = r1
            r0 = r2
            r30 = r3
            r1 = r17
            r4 = r18
            r14 = r19
            r15 = r20
            r12 = r21
            r27 = 1
            int r2 = r6.f305495i
            r10 = r30
            if (r2 <= 0) goto L_0x019f
            boolean r2 = r6.mo144074k(r10)
            if (r2 == 0) goto L_0x019f
            int r2 = r6.f305495i
            int r3 = r6.f305502s
            int r2 = r2 + r3
            r6.f305495i = r2
        L_0x019f:
            r2 = r28
            if (r9 == 0) goto L_0x01e5
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01a9
            if (r2 != 0) goto L_0x01e5
        L_0x01a9:
            r3 = 0
            r6.f305495i = r3
            r5 = 0
        L_0x01ad:
            if (r5 >= r10) goto L_0x01e5
            android.view.View r11 = r6.getChildAt(r5)
            if (r11 != 0) goto L_0x01bb
            int r11 = r6.f305495i
            int r11 = r11 + r3
            r6.f305495i = r11
            goto L_0x01e1
        L_0x01bb:
            int r3 = r11.getVisibility()
            r13 = 8
            if (r3 != r13) goto L_0x01c6
            int r5 = r5 + 0
            goto L_0x01e1
        L_0x01c6:
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r11 = r6.f305495i
            int r18 = r11 + r4
            int r13 = r3.topMargin
            int r18 = r18 + r13
            int r3 = r3.bottomMargin
            int r18 = r18 + r3
            r3 = 0
            int r13 = r18 + 0
            int r3 = java.lang.Math.max(r11, r13)
            r6.f305495i = r3
        L_0x01e1:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x01ad
        L_0x01e5:
            int r3 = r6.f305495i
            int r5 = r38.getPaddingTop()
            int r11 = r38.getPaddingBottom()
            int r5 = r5 + r11
            int r3 = r3 + r5
            r6.f305495i = r3
            int r5 = r38.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r3, r5)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r11 = r6.f305495i
            int r5 = r5 - r11
            if (r23 != 0) goto L_0x0252
            if (r5 == 0) goto L_0x0211
            r11 = 0
            int r13 = (r22 > r11 ? 1 : (r22 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0211
            goto L_0x0252
        L_0x0211:
            int r1 = java.lang.Math.max(r1, r14)
            if (r9 == 0) goto L_0x024e
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x024e
            r2 = 0
        L_0x021c:
            if (r2 >= r10) goto L_0x024e
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x024b
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x022d
            goto L_0x024b
        L_0x022d:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            float r9 = r9.f305505a
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x024b
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r5.measure(r9, r13)
        L_0x024b:
            int r2 = r2 + 1
            goto L_0x021c
        L_0x024e:
            r21 = r12
            goto L_0x0333
        L_0x0252:
            float r4 = r6.f305496j
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x025b
            r22 = r4
        L_0x025b:
            r4 = 0
            r6.f305495i = r4
            r4 = 0
        L_0x025f:
            if (r4 >= r10) goto L_0x0323
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x0271
            r28 = r2
            goto L_0x031d
        L_0x0271:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            float r13 = r11.f305505a
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02d2
            float r14 = (float) r5
            float r14 = r14 * r13
            float r14 = r14 / r22
            int r14 = (int) r14
            float r22 = r22 - r13
            int r5 = r5 - r14
            int r13 = r38.getPaddingLeft()
            int r16 = r38.getPaddingRight()
            int r13 = r13 + r16
            r16 = r5
            int r5 = r11.leftMargin
            int r13 = r13 + r5
            int r5 = r11.rightMargin
            int r13 = r13 + r5
            int r5 = r11.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r5)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02b4
            r13 = 1073741824(0x40000000, float:2.0)
            if (r2 == r13) goto L_0x02a8
            goto L_0x02b6
        L_0x02a8:
            if (r14 <= 0) goto L_0x02ab
            goto L_0x02ac
        L_0x02ab:
            r14 = 0
        L_0x02ac:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r5, r14)
            goto L_0x02c6
        L_0x02b4:
            r13 = 1073741824(0x40000000, float:2.0)
        L_0x02b6:
            int r17 = r9.getMeasuredHeight()
            int r14 = r17 + r14
            if (r14 >= 0) goto L_0x02bf
            r14 = 0
        L_0x02bf:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r9.measure(r5, r14)
        L_0x02c6:
            int r5 = r9.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r5)
            r5 = r16
        L_0x02d2:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r28 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x02ef
            int r2 = r11.width
            r16 = r5
            r5 = -1
            if (r2 != r5) goto L_0x02f2
            r2 = 1
            goto L_0x02f3
        L_0x02ef:
            r16 = r5
            r5 = -1
        L_0x02f2:
            r2 = 0
        L_0x02f3:
            if (r2 == 0) goto L_0x02f6
            goto L_0x02f7
        L_0x02f6:
            r13 = r14
        L_0x02f7:
            int r1 = java.lang.Math.max(r1, r13)
            if (r24 == 0) goto L_0x0303
            int r2 = r11.width
            if (r2 != r5) goto L_0x0303
            r5 = 1
            goto L_0x0304
        L_0x0303:
            r5 = 0
        L_0x0304:
            int r2 = r6.f305495i
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r2
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            r11 = 0
            int r9 = r9 + r11
            int r2 = java.lang.Math.max(r2, r9)
            r6.f305495i = r2
            r24 = r5
            r5 = r16
        L_0x031d:
            int r4 = r4 + 1
            r2 = r28
            goto L_0x025f
        L_0x0323:
            int r2 = r6.f305495i
            int r4 = r38.getPaddingTop()
            int r5 = r38.getPaddingBottom()
            int r4 = r4 + r5
            int r2 = r2 + r4
            r6.f305495i = r2
            goto L_0x024e
        L_0x0333:
            if (r24 != 0) goto L_0x033a
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x033a
            goto L_0x033c
        L_0x033a:
            r1 = r21
        L_0x033c:
            int r0 = r38.getPaddingLeft()
            int r2 = r38.getPaddingRight()
            int r0 = r0 + r2
            int r1 = r1 + r0
            int r0 = r38.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r3)
            if (r25 == 0) goto L_0x08cb
            int r0 = r38.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0362:
            if (r9 >= r10) goto L_0x08cb
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0390
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0390
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r7
            r4 = r40
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0390:
            int r9 = r9 + 1
            goto L_0x0362
        L_0x0393:
            r0 = 0
            r27 = 1
            r6.f305495i = r0
            int r9 = r38.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r39)
            int r11 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r6.f305498o
            r12 = 4
            if (r0 == 0) goto L_0x03ad
            int[] r0 = r6.f305499p
            if (r0 != 0) goto L_0x03b5
        L_0x03ad:
            int[] r0 = new int[r12]
            r6.f305498o = r0
            int[] r0 = new int[r12]
            r6.f305499p = r0
        L_0x03b5:
            int[] r13 = r6.f305498o
            int[] r14 = r6.f305499p
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f305490d
            boolean r4 = r6.f305497n
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03d9
            r18 = 1
            goto L_0x03db
        L_0x03d9:
            r18 = 0
        L_0x03db:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r31 = 0
        L_0x03e9:
            if (r3 >= r9) goto L_0x0593
            android.view.View r8 = r6.getChildAt(r3)
            if (r8 != 0) goto L_0x03fe
            int r8 = r6.f305495i
            r25 = 0
            int r8 = r8 + 0
            r6.f305495i = r8
            r25 = r0
            r26 = r2
            goto L_0x040c
        L_0x03fe:
            r25 = r0
            int r0 = r8.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x0416
            int r3 = r3 + 0
        L_0x040c:
            r29 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x0589
        L_0x0416:
            boolean r0 = r6.mo144074k(r3)
            if (r0 == 0) goto L_0x0423
            int r0 = r6.f305495i
            int r2 = r6.f305501r
            int r0 = r0 + r2
            r6.f305495i = r0
        L_0x0423:
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            float r0 = r2.f305505a
            float r28 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0481
            int r1 = r2.width
            if (r1 != 0) goto L_0x0481
            r1 = 0
            int r29 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r29 <= 0) goto L_0x0481
            if (r18 == 0) goto L_0x044a
            int r0 = r6.f305495i
            int r1 = r2.leftMargin
            r29 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = r0 + r1
            r6.f305495i = r0
            goto L_0x045a
        L_0x044a:
            r29 = r3
            int r0 = r6.f305495i
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f305495i = r0
        L_0x045a:
            if (r5 == 0) goto L_0x0471
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r8.measure(r1, r1)
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r29
            r26 = r4
            r29 = r5
            goto L_0x04f8
        L_0x0471:
            r1 = r2
            r33 = r25
            r34 = r26
            r25 = r29
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r29 = r5
            r5 = 1
            goto L_0x04fc
        L_0x0481:
            r29 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x0491
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0492
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x0494
        L_0x0491:
            r1 = 0
        L_0x0492:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0494:
            int r0 = (r28 > r1 ? 1 : (r28 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x049d
            int r0 = r6.f305495i
            r30 = r0
            goto L_0x049f
        L_0x049d:
            r30 = 0
        L_0x049f:
            r32 = 0
            r1 = r25
            r0 = r38
            r33 = r1
            r1 = r8
            r35 = r2
            r34 = r26
            r2 = r39
            r36 = r3
            r25 = r29
            r3 = r30
            r26 = r4
            r4 = r40
            r29 = r5
            r5 = r32
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r36
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04ca
            r1 = r35
            r1.width = r0
            goto L_0x04cc
        L_0x04ca:
            r1 = r35
        L_0x04cc:
            int r0 = r8.getMeasuredWidth()
            if (r18 == 0) goto L_0x04e0
            int r2 = r6.f305495i
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r2 = r2 + r3
            r6.f305495i = r2
            goto L_0x04f2
        L_0x04e0:
            r4 = 0
            int r2 = r6.f305495i
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f305495i = r2
        L_0x04f2:
            if (r26 == 0) goto L_0x04f8
            int r12 = java.lang.Math.max(r0, r12)
        L_0x04f8:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04fc:
            if (r11 == r0) goto L_0x0507
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x0507
            r0 = 1
            r24 = 1
            goto L_0x0508
        L_0x0507:
            r0 = 0
        L_0x0508:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r8.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r8.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r15, r4)
            if (r29 == 0) goto L_0x054a
            int r8 = r8.getBaseline()
            r15 = -1
            if (r8 == r15) goto L_0x054a
            int r15 = r1.f305506b
            if (r15 >= 0) goto L_0x0529
            int r15 = r6.f305494h
        L_0x0529:
            r15 = r15 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r15 = r15 >> 4
            r22 = -2
            r15 = r15 & -2
            int r15 = r15 >> 1
            r22 = r2
            r2 = r13[r15]
            int r2 = java.lang.Math.max(r2, r8)
            r13[r15] = r2
            r2 = r14[r15]
            int r8 = r3 - r8
            int r2 = java.lang.Math.max(r2, r8)
            r14[r15] = r2
            goto L_0x054c
        L_0x054a:
            r22 = r2
        L_0x054c:
            r2 = r33
            int r2 = java.lang.Math.max(r2, r3)
            if (r23 == 0) goto L_0x055b
            int r8 = r1.height
            r15 = -1
            if (r8 != r15) goto L_0x055b
            r8 = 1
            goto L_0x055c
        L_0x055b:
            r8 = 0
        L_0x055c:
            float r1 = r1.f305505a
            r15 = 0
            int r1 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x056e
            if (r0 == 0) goto L_0x0567
            r3 = r22
        L_0x0567:
            r1 = r34
            int r0 = java.lang.Math.max(r1, r3)
            goto L_0x057b
        L_0x056e:
            r1 = r34
            if (r0 == 0) goto L_0x0574
            r3 = r22
        L_0x0574:
            r0 = r31
            int r31 = java.lang.Math.max(r0, r3)
            r0 = r1
        L_0x057b:
            int r3 = r25 + 0
            r15 = r4
            r22 = r5
            r23 = r8
            r1 = r28
            r37 = r2
            r2 = r0
            r0 = r37
        L_0x0589:
            int r3 = r3 + 1
            r8 = r40
            r4 = r26
            r5 = r29
            goto L_0x03e9
        L_0x0593:
            r3 = r2
            r26 = r4
            r29 = r5
            r2 = r0
            r0 = r31
            int r4 = r6.f305495i
            if (r4 <= 0) goto L_0x05ac
            boolean r4 = r6.mo144074k(r9)
            if (r4 == 0) goto L_0x05ac
            int r4 = r6.f305495i
            int r5 = r6.f305501r
            int r4 = r4 + r5
            r6.f305495i = r4
        L_0x05ac:
            r4 = r13[r27]
            r5 = -1
            r25 = r15
            if (r4 != r5) goto L_0x05c5
            r8 = 0
            r15 = r13[r8]
            if (r15 != r5) goto L_0x05c5
            r8 = r13[r17]
            if (r8 != r5) goto L_0x05c5
            r8 = 3
            r15 = r13[r8]
            if (r15 == r5) goto L_0x05c2
            goto L_0x05c6
        L_0x05c2:
            r28 = r11
            goto L_0x05f6
        L_0x05c5:
            r8 = 3
        L_0x05c6:
            r5 = r13[r8]
            r15 = 0
            r8 = r13[r15]
            r15 = r13[r17]
            int r4 = java.lang.Math.max(r4, r15)
            int r4 = java.lang.Math.max(r8, r4)
            int r4 = java.lang.Math.max(r5, r4)
            r5 = 3
            r8 = r14[r5]
            r5 = 0
            r15 = r14[r5]
            r5 = r14[r27]
            r28 = r11
            r11 = r14[r17]
            int r5 = java.lang.Math.max(r5, r11)
            int r5 = java.lang.Math.max(r15, r5)
            int r5 = java.lang.Math.max(r8, r5)
            int r4 = r4 + r5
            int r2 = java.lang.Math.max(r2, r4)
        L_0x05f6:
            if (r26 == 0) goto L_0x0648
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r4) goto L_0x05fe
            if (r10 != 0) goto L_0x0648
        L_0x05fe:
            r4 = 0
            r6.f305495i = r4
            r5 = 0
        L_0x0602:
            if (r5 >= r9) goto L_0x0648
            android.view.View r8 = r6.getChildAt(r5)
            if (r8 != 0) goto L_0x0610
            int r8 = r6.f305495i
            int r8 = r8 + r4
            r6.f305495i = r8
            goto L_0x0644
        L_0x0610:
            int r4 = r8.getVisibility()
            r11 = 8
            if (r4 != r11) goto L_0x061b
            int r5 = r5 + 0
            goto L_0x0644
        L_0x061b:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            if (r18 == 0) goto L_0x0631
            int r8 = r6.f305495i
            int r11 = r4.leftMargin
            int r11 = r11 + r12
            int r4 = r4.rightMargin
            int r11 = r11 + r4
            r15 = 0
            int r11 = r11 + r15
            int r8 = r8 + r11
            r6.f305495i = r8
            goto L_0x0644
        L_0x0631:
            r15 = 0
            int r8 = r6.f305495i
            int r11 = r8 + r12
            int r15 = r4.leftMargin
            int r11 = r11 + r15
            int r4 = r4.rightMargin
            int r11 = r11 + r4
            r4 = 0
            int r11 = r11 + r4
            int r4 = java.lang.Math.max(r8, r11)
            r6.f305495i = r4
        L_0x0644:
            int r5 = r5 + 1
            r4 = 0
            goto L_0x0602
        L_0x0648:
            int r4 = r6.f305495i
            int r5 = r38.getPaddingLeft()
            int r8 = r38.getPaddingRight()
            int r5 = r5 + r8
            int r4 = r4 + r5
            r6.f305495i = r4
            int r5 = r38.getSuggestedMinimumWidth()
            int r4 = java.lang.Math.max(r4, r5)
            r5 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r7, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            int r8 = r6.f305495i
            int r5 = r5 - r8
            if (r22 != 0) goto L_0x06ba
            if (r5 == 0) goto L_0x0674
            r11 = 0
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x0674
            goto L_0x06ba
        L_0x0674:
            int r0 = java.lang.Math.max(r0, r3)
            if (r26 == 0) goto L_0x06b1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06b1
            r1 = 0
        L_0x067f:
            if (r1 >= r9) goto L_0x06b1
            android.view.View r3 = r6.getChildAt(r1)
            if (r3 == 0) goto L_0x06ae
            int r5 = r3.getVisibility()
            r10 = 8
            if (r5 != r10) goto L_0x0690
            goto L_0x06ae
        L_0x0690:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r5 = r5.f305505a
            r10 = 0
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x06ae
            r5 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
            int r11 = r3.getMeasuredHeight()
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r5)
            r3.measure(r10, r11)
        L_0x06ae:
            int r1 = r1 + 1
            goto L_0x067f
        L_0x06b1:
            r5 = r40
            r15 = r25
            r12 = r28
            r8 = 0
            goto L_0x0865
        L_0x06ba:
            float r2 = r6.f305496j
            r3 = 0
            int r11 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r11 <= 0) goto L_0x06c2
            r1 = r2
        L_0x06c2:
            r2 = 3
            r3 = -1
            r13[r2] = r3
            r13[r17] = r3
            r13[r27] = r3
            r11 = 0
            r13[r11] = r3
            r14[r2] = r3
            r14[r17] = r3
            r14[r27] = r3
            r14[r11] = r3
            r6.f305495i = r11
            r3 = r0
            r15 = r25
            r0 = 0
            r2 = -1
        L_0x06dc:
            if (r0 >= r9) goto L_0x080e
            android.view.View r11 = r6.getChildAt(r0)
            if (r11 == 0) goto L_0x07f8
            int r12 = r11.getVisibility()
            r8 = 8
            if (r12 != r8) goto L_0x06ee
            goto L_0x07f8
        L_0x06ee:
            android.view.ViewGroup$LayoutParams r8 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            float r12 = r8.f305505a
            r20 = 0
            int r22 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x0756
            float r7 = (float) r5
            float r7 = r7 * r12
            float r7 = r7 / r1
            int r7 = (int) r7
            float r1 = r1 - r12
            int r5 = r5 - r7
            int r12 = r38.getPaddingTop()
            int r22 = r38.getPaddingBottom()
            int r12 = r12 + r22
            r22 = r1
            int r1 = r8.topMargin
            int r12 = r12 + r1
            int r1 = r8.bottomMargin
            int r12 = r12 + r1
            int r1 = r8.height
            r25 = r5
            r5 = r40
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r5, r12, r1)
            int r12 = r8.width
            if (r12 != 0) goto L_0x0734
            r12 = 1073741824(0x40000000, float:2.0)
            if (r10 == r12) goto L_0x0728
            goto L_0x0736
        L_0x0728:
            if (r7 <= 0) goto L_0x072b
            goto L_0x072c
        L_0x072b:
            r7 = 0
        L_0x072c:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
            goto L_0x0746
        L_0x0734:
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x0736:
            int r26 = r11.getMeasuredWidth()
            int r7 = r26 + r7
            if (r7 >= 0) goto L_0x073f
            r7 = 0
        L_0x073f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r11.measure(r7, r1)
        L_0x0746:
            int r1 = r11.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r15 = android.view.View.combineMeasuredStates(r15, r1)
            r1 = r22
            r7 = r25
            goto L_0x0759
        L_0x0756:
            r7 = r5
            r5 = r40
        L_0x0759:
            if (r18 == 0) goto L_0x0775
            int r12 = r6.f305495i
            int r22 = r11.getMeasuredWidth()
            r25 = r1
            int r1 = r8.leftMargin
            int r22 = r22 + r1
            int r1 = r8.rightMargin
            int r22 = r22 + r1
            r1 = 0
            int r22 = r22 + 0
            int r12 = r12 + r22
            r6.f305495i = r12
            r26 = r7
            goto L_0x0793
        L_0x0775:
            r25 = r1
            r1 = 0
            int r12 = r6.f305495i
            int r22 = r11.getMeasuredWidth()
            int r22 = r22 + r12
            int r1 = r8.leftMargin
            int r22 = r22 + r1
            int r1 = r8.rightMargin
            int r22 = r22 + r1
            r26 = r7
            r1 = 0
            int r7 = r22 + 0
            int r1 = java.lang.Math.max(r12, r7)
            r6.f305495i = r1
        L_0x0793:
            r12 = r28
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x07a0
            int r1 = r8.height
            r7 = -1
            if (r1 != r7) goto L_0x07a0
            r1 = 1
            goto L_0x07a1
        L_0x07a0:
            r1 = 0
        L_0x07a1:
            int r7 = r8.topMargin
            r22 = r10
            int r10 = r8.bottomMargin
            int r7 = r7 + r10
            int r10 = r11.getMeasuredHeight()
            int r10 = r10 + r7
            int r2 = java.lang.Math.max(r2, r10)
            if (r1 == 0) goto L_0x07b4
            goto L_0x07b5
        L_0x07b4:
            r7 = r10
        L_0x07b5:
            int r1 = java.lang.Math.max(r3, r7)
            if (r23 == 0) goto L_0x07c2
            int r3 = r8.height
            r7 = -1
            if (r3 != r7) goto L_0x07c3
            r3 = 1
            goto L_0x07c4
        L_0x07c2:
            r7 = -1
        L_0x07c3:
            r3 = 0
        L_0x07c4:
            if (r29 == 0) goto L_0x07ee
            int r11 = r11.getBaseline()
            if (r11 == r7) goto L_0x07ee
            int r7 = r8.f305506b
            if (r7 >= 0) goto L_0x07d2
            int r7 = r6.f305494h
        L_0x07d2:
            r7 = r7 & 112(0x70, float:1.57E-43)
            r8 = 4
            int r7 = r7 >> r8
            r21 = -2
            r7 = r7 & -2
            int r7 = r7 >> 1
            r8 = r13[r7]
            int r8 = java.lang.Math.max(r8, r11)
            r13[r7] = r8
            r8 = r14[r7]
            int r10 = r10 - r11
            int r8 = java.lang.Math.max(r8, r10)
            r14[r7] = r8
            goto L_0x07f0
        L_0x07ee:
            r21 = -2
        L_0x07f0:
            r23 = r3
            r7 = r26
            r3 = r1
            r1 = r25
            goto L_0x0803
        L_0x07f8:
            r7 = r5
            r22 = r10
            r12 = r28
            r20 = 0
            r21 = -2
            r5 = r40
        L_0x0803:
            int r0 = r0 + 1
            r5 = r7
            r28 = r12
            r10 = r22
            r7 = r39
            goto L_0x06dc
        L_0x080e:
            r5 = r40
            r12 = r28
            int r0 = r6.f305495i
            int r1 = r38.getPaddingLeft()
            int r7 = r38.getPaddingRight()
            int r1 = r1 + r7
            int r0 = r0 + r1
            r6.f305495i = r0
            r0 = r13[r27]
            r1 = -1
            if (r0 != r1) goto L_0x0836
            r7 = 0
            r8 = r13[r7]
            if (r8 != r1) goto L_0x0836
            r7 = r13[r17]
            if (r7 != r1) goto L_0x0836
            r7 = 3
            r8 = r13[r7]
            if (r8 == r1) goto L_0x0834
            goto L_0x0837
        L_0x0834:
            r8 = 0
            goto L_0x0864
        L_0x0836:
            r7 = 3
        L_0x0837:
            r1 = r13[r7]
            r8 = 0
            r10 = r13[r8]
            r11 = r13[r17]
            int r0 = java.lang.Math.max(r0, r11)
            int r0 = java.lang.Math.max(r10, r0)
            int r0 = java.lang.Math.max(r1, r0)
            r1 = r14[r7]
            r7 = r14[r8]
            r10 = r14[r27]
            r11 = r14[r17]
            int r10 = java.lang.Math.max(r10, r11)
            int r7 = java.lang.Math.max(r7, r10)
            int r1 = java.lang.Math.max(r1, r7)
            int r0 = r0 + r1
            int r0 = java.lang.Math.max(r2, r0)
            r2 = r0
        L_0x0864:
            r0 = r3
        L_0x0865:
            if (r23 != 0) goto L_0x086c
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x086c
            goto L_0x086d
        L_0x086c:
            r0 = r2
        L_0x086d:
            int r1 = r38.getPaddingTop()
            int r2 = r38.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r15
            r1 = r1 | r4
            int r2 = r15 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x08cb
            int r0 = r38.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x0898:
            if (r8 >= r9) goto L_0x08cb
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08c7
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08c8
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r38
            r2 = r39
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08c8
        L_0x08c7:
            r12 = -1
        L_0x08c8:
            int r8 = r8 + 1
            goto L_0x0898
        L_0x08cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f305490d = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f305491e = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f305500q) {
            this.f305500q = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f305501r = drawable.getIntrinsicWidth();
                this.f305502s = drawable.getIntrinsicHeight();
            } else {
                this.f305501r = 0;
                this.f305502s = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f305504u = i;
    }

    public void setGravity(int i) {
        if (this.f305494h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f305494h = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f305494h;
        if ((8388615 & i3) != i2) {
            this.f305494h = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f305497n = z;
    }

    public void setOrientation(int i) {
        if (this.f305493g != i) {
            this.f305493g = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f305503t) {
            requestLayout();
        }
        this.f305503t = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f305494h;
        if ((i3 & 112) != i2) {
            this.f305494h = i2 | (i3 & ExportErrorStatus.APPEND_VIDEO_SAMPLE_SWAP_BUFFERS);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f305496j = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.f305490d = true;
        this.f305491e = -1;
        this.f305492f = 0;
        this.f305494h = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321917q, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f305496j = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f305491e = obtainStyledAttributes.getInt(3, -1);
        this.f305497n = obtainStyledAttributes.getBoolean(7, false);
        if (!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(5);
        } else {
            drawable = C107922a.m146228b(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.f305503t = obtainStyledAttributes.getInt(8, 0);
        this.f305504u = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f305505a;

        /* renamed from: b */
        public int f305506b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f305506b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321918r);
            this.f305505a = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f305506b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f305506b = -1;
            this.f305505a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f305506b = -1;
        }
    }
}
