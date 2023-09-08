package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import p368o2.C21738f;
import p368o2.C21740g;
import p368o2.C21742i;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: d */
    public SparseArray<View> f44394d = new SparseArray<>();

    /* renamed from: e */
    public ArrayList<ConstraintHelper> f44395e = new ArrayList<>(4);

    /* renamed from: f */
    public final ArrayList<C21738f> f44396f = new ArrayList<>(100);

    /* renamed from: g */
    public C21740g f44397g = new C21740g();

    /* renamed from: h */
    public int f44398h = 0;

    /* renamed from: i */
    public int f44399i = 0;

    /* renamed from: j */
    public int f44400j = Integer.MAX_VALUE;

    /* renamed from: n */
    public int f44401n = Integer.MAX_VALUE;

    /* renamed from: o */
    public boolean f44402o = true;

    /* renamed from: p */
    public int f44403p = 7;

    /* renamed from: q */
    public C16569a f44404q = null;

    /* renamed from: r */
    public int f44405r = -1;

    /* renamed from: s */
    public HashMap<String, Integer> f44406s = new HashMap<>();

    /* renamed from: t */
    public int f44407t = -1;

    /* renamed from: u */
    public int f44408u = -1;

    public ConstraintLayout(Context context) {
        super(context);
        m15622o((AttributeSet) null);
    }

    /* renamed from: o */
    private void m15622o(AttributeSet attributeSet) {
        this.f44397g.f61574X = this;
        this.f44394d.put(getId(), this);
        this.f44404q = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_minWidth) {
                    this.f44398h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44398h);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_minHeight) {
                    this.f44399i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44399i);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxWidth) {
                    this.f44400j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44400j);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_maxHeight) {
                    this.f44401n = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44401n);
                } else if (index == R$styleable.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f44403p = obtainStyledAttributes.getInt(index, this.f44403p);
                } else if (index == R$styleable.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C16569a aVar = new C16569a();
                        this.f44404q = aVar;
                        aVar.mo16722i(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.f44404q = null;
                    }
                    this.f44405r = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f44397g.f61629w0 = this.f44403p;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i2;
                        float f2 = (float) (i2 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i3;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i3 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f15 = parseInt4;
                        float f16 = f5;
                        canvas2.drawLine(f8, f15, f16, f9, paint3);
                        float f17 = f5;
                        canvas2.drawLine(f17, f15, f16, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f18 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f17, f3, f18, parseInt4, paint6);
                        canvas2.drawLine(f17, parseInt4, f18, f3, paint6);
                    }
                }
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f44401n;
    }

    public int getMaxWidth() {
        return this.f44400j;
    }

    public int getMinHeight() {
        return this.f44399i;
    }

    public int getMinWidth() {
        return this.f44398h;
    }

    public int getOptimizationLevel() {
        return this.f44397g.f61629w0;
    }

    /* renamed from: m */
    public final C21738f mo16689m(int i) {
        if (i == 0) {
            return this.f44397g;
        }
        View view = this.f44394d.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f44397g;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f44456k0;
    }

    /* renamed from: n */
    public final C21738f mo16690n(View view) {
        if (view == this) {
            return this.f44397g;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f44456k0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C21738f fVar = layoutParams.f44456k0;
            if ((childAt.getVisibility() != 8 || layoutParams.f44432X || layoutParams.f44433Y || isInEditMode) && !layoutParams.f44434Z) {
                int i7 = fVar.f61563M + fVar.f61565O;
                int i8 = fVar.f61564N + fVar.f61566P;
                int q = fVar.mo34049q() + i7;
                int k = fVar.mo34043k() + i8;
                childAt.layout(i7, i8, q, k);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = content;
                    i5 = childCount;
                    C117292a.m165358d(view, aVar.mo10232b(), "androidx/constraintlayout/widget/ConstraintLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    content.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "androidx/constraintlayout/widget/ConstraintLayout", "onLayout", "(ZIIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    content.layout(i7, i8, q, k);
                    i6++;
                    childCount = i5;
                }
            }
            i5 = childCount;
            i6++;
            childCount = i5;
        }
        int size = this.f44395e.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                this.f44395e.get(i9).mo16671c(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:352:0x070e, code lost:
        if (r12.f44416H != 1) goto L_0x0714;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03fe  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0727  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x077a  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x0789  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x078d  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x09cf  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x09e8  */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x0bd6  */
    /* JADX WARNING: Removed duplicated region for block: B:604:0x0c0a  */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x0c0f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r50, int r51) {
        /*
            r49 = this;
            r0 = r49
            r1 = r50
            r2 = r51
            o2.e$b r9 = p368o2.C21735e.C21737b.BOTTOM
            o2.e$b r10 = p368o2.C21735e.C21737b.RIGHT
            o2.f$a r11 = p368o2.C21738f.C21739a.WRAP_CONTENT
            o2.f$a r12 = p368o2.C21738f.C21739a.FIXED
            java.lang.System.currentTimeMillis()
            int r13 = android.view.View.MeasureSpec.getMode(r50)
            int r14 = android.view.View.MeasureSpec.getSize(r50)
            int r15 = android.view.View.MeasureSpec.getMode(r51)
            int r8 = android.view.View.MeasureSpec.getSize(r51)
            int r7 = r49.getPaddingLeft()
            int r6 = r49.getPaddingTop()
            o2.g r3 = r0.f44397g
            r3.f61559I = r7
            r3.f61560J = r6
            int r4 = r0.f44400j
            int[] r5 = r3.f61601q
            r16 = r15
            r15 = 0
            r5[r15] = r4
            int r4 = r0.f44401n
            r15 = 1
            r5[r15] = r4
            int r4 = r49.getLayoutDirection()
            if (r4 != r15) goto L_0x0045
            r4 = 1
            goto L_0x0046
        L_0x0045:
            r4 = 0
        L_0x0046:
            r3.f61616j0 = r4
            int r3 = android.view.View.MeasureSpec.getMode(r50)
            int r4 = android.view.View.MeasureSpec.getSize(r50)
            int r5 = android.view.View.MeasureSpec.getMode(r51)
            int r15 = android.view.View.MeasureSpec.getSize(r51)
            int r17 = r49.getPaddingTop()
            int r18 = r49.getPaddingBottom()
            int r17 = r17 + r18
            int r18 = r49.getPaddingLeft()
            int r19 = r49.getPaddingRight()
            int r18 = r18 + r19
            r49.getLayoutParams()
            r19 = r14
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = r13
            r13 = 1073741824(0x40000000, float:2.0)
            if (r3 == r14) goto L_0x008d
            if (r3 == 0) goto L_0x008a
            if (r3 == r13) goto L_0x007f
            r3 = r12
            goto L_0x008b
        L_0x007f:
            int r3 = r0.f44400j
            int r3 = java.lang.Math.min(r3, r4)
            int r3 = r3 - r18
            r4 = r3
            r3 = r12
            goto L_0x008e
        L_0x008a:
            r3 = r11
        L_0x008b:
            r4 = 0
            goto L_0x008e
        L_0x008d:
            r3 = r11
        L_0x008e:
            if (r5 == r14) goto L_0x00a4
            if (r5 == 0) goto L_0x00a1
            if (r5 == r13) goto L_0x0096
            r5 = r12
            goto L_0x00a2
        L_0x0096:
            int r5 = r0.f44401n
            int r5 = java.lang.Math.min(r5, r15)
            int r5 = r5 - r17
            r15 = r5
            r5 = r12
            goto L_0x00a5
        L_0x00a1:
            r5 = r11
        L_0x00a2:
            r15 = 0
            goto L_0x00a5
        L_0x00a4:
            r5 = r11
        L_0x00a5:
            o2.g r13 = r0.f44397g
            r14 = 0
            r13.f61568R = r14
            r13.f61569S = r14
            r13.mo34030A(r3)
            o2.g r3 = r0.f44397g
            r3.mo34033D(r4)
            o2.g r3 = r0.f44397g
            r3.mo34032C(r5)
            o2.g r3 = r0.f44397g
            r3.mo34057z(r15)
            o2.g r3 = r0.f44397g
            int r4 = r0.f44398h
            int r5 = r49.getPaddingLeft()
            int r4 = r4 - r5
            int r5 = r49.getPaddingRight()
            int r4 = r4 - r5
            if (r4 >= 0) goto L_0x00d2
            r5 = 0
            r3.f61568R = r5
            goto L_0x00d4
        L_0x00d2:
            r3.f61568R = r4
        L_0x00d4:
            o2.g r3 = r0.f44397g
            int r4 = r0.f44399i
            int r5 = r49.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r49.getPaddingBottom()
            int r4 = r4 - r5
            if (r4 >= 0) goto L_0x00e8
            r5 = 0
            r3.f61569S = r5
            goto L_0x00ea
        L_0x00e8:
            r3.f61569S = r4
        L_0x00ea:
            o2.g r3 = r0.f44397g
            int r13 = r3.mo34049q()
            o2.g r3 = r0.f44397g
            int r14 = r3.mo34043k()
            boolean r3 = r0.f44402o
            if (r3 == 0) goto L_0x063b
            r3 = 0
            r0.f44402o = r3
            int r3 = r49.getChildCount()
            r15 = 0
        L_0x0102:
            if (r15 >= r3) goto L_0x0113
            android.view.View r21 = r0.getChildAt(r15)
            boolean r21 = r21.isLayoutRequested()
            if (r21 == 0) goto L_0x0110
            r3 = 1
            goto L_0x0114
        L_0x0110:
            int r15 = r15 + 1
            goto L_0x0102
        L_0x0113:
            r3 = 0
        L_0x0114:
            if (r3 == 0) goto L_0x062b
            java.util.ArrayList<o2.f> r3 = r0.f44396f
            r3.clear()
            o2.f$a r15 = p368o2.C21738f.C21739a.MATCH_PARENT
            o2.f$a r3 = p368o2.C21738f.C21739a.MATCH_CONSTRAINT
            o2.e$b r5 = p368o2.C21735e.C21737b.LEFT
            o2.e$b r4 = p368o2.C21735e.C21737b.TOP
            boolean r29 = r49.isInEditMode()
            int r2 = r49.getChildCount()
            r30 = r3
            if (r29 == 0) goto L_0x017b
            r3 = 0
        L_0x0130:
            if (r3 >= r2) goto L_0x017b
            android.view.View r21 = r0.getChildAt(r3)
            r31 = r4
            android.content.res.Resources r4 = r49.getResources()     // Catch:{ NotFoundException -> 0x016e }
            r32 = r6
            int r6 = r21.getId()     // Catch:{ NotFoundException -> 0x0170 }
            java.lang.String r4 = r4.getResourceName(r6)     // Catch:{ NotFoundException -> 0x0170 }
            int r6 = r21.getId()     // Catch:{ NotFoundException -> 0x0170 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NotFoundException -> 0x0170 }
            r33 = r7
            r7 = 0
            r0.mo16696q(r7, r4, r6)     // Catch:{ NotFoundException -> 0x0172 }
            r6 = 47
            int r6 = r4.indexOf(r6)     // Catch:{ NotFoundException -> 0x0172 }
            r7 = -1
            if (r6 == r7) goto L_0x0163
            int r6 = r6 + 1
            java.lang.String r4 = r4.substring(r6)     // Catch:{ NotFoundException -> 0x0172 }
        L_0x0163:
            int r6 = r21.getId()     // Catch:{ NotFoundException -> 0x0172 }
            o2.f r6 = r0.mo16689m(r6)     // Catch:{ NotFoundException -> 0x0172 }
            r6.f61576Z = r4     // Catch:{ NotFoundException -> 0x0172 }
            goto L_0x0172
        L_0x016e:
            r32 = r6
        L_0x0170:
            r33 = r7
        L_0x0172:
            int r3 = r3 + 1
            r4 = r31
            r6 = r32
            r7 = r33
            goto L_0x0130
        L_0x017b:
            r31 = r4
            r32 = r6
            r33 = r7
            r3 = 0
        L_0x0182:
            if (r3 >= r2) goto L_0x0195
            android.view.View r4 = r0.getChildAt(r3)
            o2.f r4 = r0.mo16690n(r4)
            if (r4 != 0) goto L_0x018f
            goto L_0x0192
        L_0x018f:
            r4.mo34054u()
        L_0x0192:
            int r3 = r3 + 1
            goto L_0x0182
        L_0x0195:
            int r3 = r0.f44405r
            r4 = -1
            if (r3 == r4) goto L_0x01b8
            r3 = 0
        L_0x019b:
            if (r3 >= r2) goto L_0x01b8
            android.view.View r4 = r0.getChildAt(r3)
            int r6 = r4.getId()
            int r7 = r0.f44405r
            if (r6 != r7) goto L_0x01b5
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.Constraints
            if (r6 == 0) goto L_0x01b5
            androidx.constraintlayout.widget.Constraints r4 = (androidx.constraintlayout.widget.Constraints) r4
            androidx.constraintlayout.widget.a r4 = r4.getConstraintSet()
            r0.f44404q = r4
        L_0x01b5:
            int r3 = r3 + 1
            goto L_0x019b
        L_0x01b8:
            androidx.constraintlayout.widget.a r3 = r0.f44404q
            if (r3 == 0) goto L_0x01bf
            r3.mo16714a(r0)
        L_0x01bf:
            o2.g r3 = r0.f44397g
            java.util.ArrayList<o2.f> r3 = r3.f61673i0
            r3.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r3 = r0.f44395e
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x01df
            r4 = 0
        L_0x01cf:
            if (r4 >= r3) goto L_0x01df
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r6 = r0.f44395e
            java.lang.Object r6 = r6.get(r4)
            androidx.constraintlayout.widget.ConstraintHelper r6 = (androidx.constraintlayout.widget.ConstraintHelper) r6
            r6.mo16672d(r0)
            int r4 = r4 + 1
            goto L_0x01cf
        L_0x01df:
            r3 = 0
        L_0x01e0:
            if (r3 >= r2) goto L_0x01f2
            android.view.View r4 = r0.getChildAt(r3)
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.Placeholder
            if (r6 == 0) goto L_0x01ef
            androidx.constraintlayout.widget.Placeholder r4 = (androidx.constraintlayout.widget.Placeholder) r4
            r4.mo91158b(r0)
        L_0x01ef:
            int r3 = r3 + 1
            goto L_0x01e0
        L_0x01f2:
            r7 = 0
        L_0x01f3:
            if (r7 >= r2) goto L_0x061d
            android.view.View r3 = r0.getChildAt(r7)
            o2.f r6 = r0.mo16690n(r3)
            if (r6 != 0) goto L_0x0209
            r34 = r2
            r35 = r7
            r36 = r8
            r2 = 8
            goto L_0x030a
        L_0x0209:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            r4.mo16707a()
            if (r29 == 0) goto L_0x024f
            r34 = r2
            android.content.res.Resources r2 = r49.getResources()     // Catch:{ NotFoundException -> 0x0249 }
            r35 = r7
            int r7 = r3.getId()     // Catch:{ NotFoundException -> 0x024b }
            java.lang.String r2 = r2.getResourceName(r7)     // Catch:{ NotFoundException -> 0x024b }
            int r7 = r3.getId()     // Catch:{ NotFoundException -> 0x024b }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NotFoundException -> 0x024b }
            r36 = r8
            r8 = 0
            r0.mo16696q(r8, r2, r7)     // Catch:{ NotFoundException -> 0x024d }
            java.lang.String r7 = "id/"
            int r7 = r2.indexOf(r7)     // Catch:{ NotFoundException -> 0x024d }
            int r7 = r7 + 3
            java.lang.String r2 = r2.substring(r7)     // Catch:{ NotFoundException -> 0x024d }
            int r7 = r3.getId()     // Catch:{ NotFoundException -> 0x024d }
            o2.f r7 = r0.mo16689m(r7)     // Catch:{ NotFoundException -> 0x024d }
            r7.f61576Z = r2     // Catch:{ NotFoundException -> 0x024d }
            goto L_0x0255
        L_0x0249:
            r35 = r7
        L_0x024b:
            r36 = r8
        L_0x024d:
            goto L_0x0255
        L_0x024f:
            r34 = r2
            r35 = r7
            r36 = r8
        L_0x0255:
            int r2 = r3.getVisibility()
            r6.f61575Y = r2
            boolean r2 = r4.f44434Z
            if (r2 == 0) goto L_0x0264
            r2 = 8
            r6.f61575Y = r2
            goto L_0x0266
        L_0x0264:
            r2 = 8
        L_0x0266:
            r6.f61574X = r3
            o2.g r3 = r0.f44397g
            java.util.ArrayList<o2.f> r7 = r3.f61673i0
            r7.add(r6)
            o2.f r7 = r6.f61554D
            if (r7 == 0) goto L_0x027d
            o2.p r7 = (p368o2.C21750p) r7
            java.util.ArrayList<o2.f> r7 = r7.f61673i0
            r7.remove(r6)
            r7 = 0
            r6.f61554D = r7
        L_0x027d:
            r6.f61554D = r3
            boolean r3 = r4.f44430V
            if (r3 == 0) goto L_0x0287
            boolean r3 = r4.f44429U
            if (r3 != 0) goto L_0x028c
        L_0x0287:
            java.util.ArrayList<o2.f> r3 = r0.f44396f
            r3.add(r6)
        L_0x028c:
            boolean r3 = r4.f44432X
            if (r3 == 0) goto L_0x02c0
            o2.i r6 = (p368o2.C21742i) r6
            int r3 = r4.f44450h0
            int r7 = r4.f44452i0
            float r4 = r4.f44454j0
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r21 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r21 == 0) goto L_0x02a9
            if (r21 <= 0) goto L_0x030a
            r6.f61642i0 = r4
            r4 = -1
            r6.f61643j0 = r4
            r6.f61644k0 = r4
            goto L_0x030a
        L_0x02a9:
            r4 = -1
            if (r3 == r4) goto L_0x02b5
            if (r3 <= r4) goto L_0x030a
            r6.f61642i0 = r8
            r6.f61643j0 = r3
            r6.f61644k0 = r4
            goto L_0x030a
        L_0x02b5:
            if (r7 == r4) goto L_0x030a
            if (r7 <= r4) goto L_0x030a
            r6.f61642i0 = r8
            r6.f61643j0 = r4
            r6.f61644k0 = r7
            goto L_0x030a
        L_0x02c0:
            r3 = -1
            int r7 = r4.f44441d
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44443e
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44445f
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44447g
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44462q
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44461p
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44463r
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44464s
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44449h
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44451i
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44453j
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44455k
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44457l
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44424P
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44425Q
            if (r7 != r3) goto L_0x031f
            int r7 = r4.f44458m
            if (r7 != r3) goto L_0x031f
            int r7 = r4.width
            if (r7 == r3) goto L_0x031f
            int r7 = r4.height
            if (r7 != r3) goto L_0x030a
            goto L_0x031f
        L_0x030a:
            r2 = r5
            r40 = r11
            r4 = r12
            r39 = r13
            r38 = r14
            r11 = r30
            r1 = r31
            r27 = r32
            r32 = r33
            r33 = r35
            r12 = -1
            goto L_0x0603
        L_0x031f:
            int r3 = r4.f44436a0
            int r7 = r4.f44438b0
            int r8 = r4.f44440c0
            int r2 = r4.f44442d0
            r37 = r8
            int r8 = r4.f44444e0
            int r1 = r4.f44446f0
            r38 = r14
            float r14 = r4.f44448g0
            r39 = r13
            int r13 = r4.f44458m
            r40 = r11
            r11 = -1
            if (r13 == r11) goto L_0x0366
            o2.f r23 = r0.mo16689m(r13)
            if (r23 == 0) goto L_0x0353
            float r1 = r4.f44460o
            int r2 = r4.f44459n
            o2.e$b r24 = p368o2.C21735e.C21737b.CENTER
            r26 = 0
            r21 = r6
            r22 = r24
            r25 = r2
            r21.mo34050r(r22, r23, r24, r25, r26)
            r6.f61602r = r1
        L_0x0353:
            r13 = r4
            r28 = r5
            r3 = r6
            r11 = r30
            r1 = r31
            r27 = r32
            r32 = r33
            r33 = r35
            r30 = r12
            r12 = -1
            goto L_0x04b0
        L_0x0366:
            if (r3 == r11) goto L_0x037e
            o2.f r23 = r0.mo16689m(r3)
            if (r23 == 0) goto L_0x03a5
            int r3 = r4.leftMargin
            r21 = r6
            r22 = r5
            r24 = r5
            r25 = r3
            r26 = r8
            r21.mo34050r(r22, r23, r24, r25, r26)
            goto L_0x03a5
        L_0x037e:
            if (r7 == r11) goto L_0x03a5
            o2.f r7 = r0.mo16689m(r7)
            if (r7 == 0) goto L_0x03a5
            int r13 = r4.leftMargin
            r11 = r30
            r3 = r6
            r41 = r4
            r30 = r12
            r12 = -1
            r4 = r5
            r28 = r5
            r5 = r7
            r7 = r6
            r27 = r32
            r6 = r10
            r32 = r33
            r33 = r35
            r35 = r7
            r7 = r13
            r13 = r37
            r3.mo34050r(r4, r5, r6, r7, r8)
            goto L_0x03b8
        L_0x03a5:
            r41 = r4
            r28 = r5
            r11 = r30
            r27 = r32
            r32 = r33
            r33 = r35
            r13 = r37
            r35 = r6
            r30 = r12
            r12 = -1
        L_0x03b8:
            if (r13 == r12) goto L_0x03ce
            o2.f r5 = r0.mo16689m(r13)
            r13 = r41
            if (r5 == 0) goto L_0x03e2
            int r7 = r13.rightMargin
            r3 = r35
            r4 = r10
            r6 = r28
            r8 = r1
            r3.mo34050r(r4, r5, r6, r7, r8)
            goto L_0x03e2
        L_0x03ce:
            r13 = r41
            if (r2 == r12) goto L_0x03e2
            o2.f r5 = r0.mo16689m(r2)
            if (r5 == 0) goto L_0x03e2
            int r7 = r13.rightMargin
            r3 = r35
            r4 = r10
            r6 = r10
            r8 = r1
            r3.mo34050r(r4, r5, r6, r7, r8)
        L_0x03e2:
            int r1 = r13.f44449h
            if (r1 == r12) goto L_0x03fe
            o2.f r23 = r0.mo16689m(r1)
            if (r23 == 0) goto L_0x0414
            int r1 = r13.topMargin
            int r2 = r13.f44466u
            r21 = r35
            r22 = r31
            r24 = r31
            r25 = r1
            r26 = r2
            r21.mo34050r(r22, r23, r24, r25, r26)
            goto L_0x0414
        L_0x03fe:
            int r1 = r13.f44451i
            if (r1 == r12) goto L_0x0414
            o2.f r5 = r0.mo16689m(r1)
            if (r5 == 0) goto L_0x0414
            int r7 = r13.topMargin
            int r8 = r13.f44466u
            r3 = r35
            r4 = r31
            r6 = r9
            r3.mo34050r(r4, r5, r6, r7, r8)
        L_0x0414:
            int r1 = r13.f44453j
            if (r1 == r12) goto L_0x042b
            o2.f r5 = r0.mo16689m(r1)
            if (r5 == 0) goto L_0x0440
            int r7 = r13.bottomMargin
            int r8 = r13.f44468w
            r3 = r35
            r4 = r9
            r6 = r31
            r3.mo34050r(r4, r5, r6, r7, r8)
            goto L_0x0440
        L_0x042b:
            int r1 = r13.f44455k
            if (r1 == r12) goto L_0x0440
            o2.f r5 = r0.mo16689m(r1)
            if (r5 == 0) goto L_0x0440
            int r7 = r13.bottomMargin
            int r8 = r13.f44468w
            r3 = r35
            r4 = r9
            r6 = r9
            r3.mo34050r(r4, r5, r6, r7, r8)
        L_0x0440:
            int r1 = r13.f44457l
            if (r1 == r12) goto L_0x0493
            android.util.SparseArray<android.view.View> r2 = r0.f44394d
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r13.f44457l
            o2.f r2 = r0.mo16689m(r2)
            if (r2 == 0) goto L_0x0493
            if (r1 == 0) goto L_0x0493
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r3 == 0) goto L_0x0493
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r3 = 1
            r13.f44431W = r3
            r1.f44431W = r3
            o2.e$b r1 = p368o2.C21735e.C21737b.BASELINE
            r3 = r35
            o2.e r42 = r3.mo34038f(r1)
            o2.e r43 = r2.mo34038f(r1)
            r44 = 0
            r45 = -1
            o2.e$a r46 = p368o2.C21735e.C21736a.STRONG
            r47 = 0
            r48 = 1
            r42.mo34024a(r43, r44, r45, r46, r47, r48)
            r1 = r31
            o2.e r2 = r3.mo34038f(r1)
            r2.mo34027d()
            o2.e r2 = r3.mo34038f(r9)
            r2.mo34027d()
            goto L_0x0497
        L_0x0493:
            r1 = r31
            r3 = r35
        L_0x0497:
            r2 = 1056964608(0x3f000000, float:0.5)
            r4 = 0
            int r5 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r5 < 0) goto L_0x04a4
            int r5 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x04a4
            r3.f61572V = r14
        L_0x04a4:
            float r5 = r13.f44409A
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x04b0
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x04b0
            r3.f61573W = r5
        L_0x04b0:
            if (r29 == 0) goto L_0x04c0
            int r2 = r13.f44424P
            if (r2 != r12) goto L_0x04ba
            int r4 = r13.f44425Q
            if (r4 == r12) goto L_0x04c0
        L_0x04ba:
            int r4 = r13.f44425Q
            r3.f61559I = r2
            r3.f61560J = r4
        L_0x04c0:
            boolean r2 = r13.f44429U
            if (r2 != 0) goto L_0x04ea
            int r2 = r13.width
            if (r2 != r12) goto L_0x04de
            r3.mo34030A(r15)
            r2 = r28
            o2.e r4 = r3.mo34038f(r2)
            int r5 = r13.leftMargin
            r4.f61534e = r5
            o2.e r4 = r3.mo34038f(r10)
            int r5 = r13.rightMargin
            r4.f61534e = r5
            goto L_0x04e7
        L_0x04de:
            r2 = r28
            r3.mo34030A(r11)
            r4 = 0
            r3.mo34033D(r4)
        L_0x04e7:
            r4 = r30
            goto L_0x04f6
        L_0x04ea:
            r2 = r28
            r4 = r30
            r3.mo34030A(r4)
            int r5 = r13.width
            r3.mo34033D(r5)
        L_0x04f6:
            boolean r5 = r13.f44430V
            if (r5 != 0) goto L_0x051a
            int r5 = r13.height
            if (r5 != r12) goto L_0x0512
            r3.mo34032C(r15)
            o2.e r5 = r3.mo34038f(r1)
            int r6 = r13.topMargin
            r5.f61534e = r6
            o2.e r5 = r3.mo34038f(r9)
            int r6 = r13.bottomMargin
            r5.f61534e = r6
            goto L_0x0522
        L_0x0512:
            r3.mo34032C(r11)
            r5 = 0
            r3.mo34057z(r5)
            goto L_0x0522
        L_0x051a:
            r3.mo34032C(r4)
            int r5 = r13.height
            r3.mo34057z(r5)
        L_0x0522:
            java.lang.String r5 = r13.f44410B
            if (r5 == 0) goto L_0x05bc
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0531
            r6 = 0
            r3.f61557G = r6
            goto L_0x05bc
        L_0x0531:
            int r6 = r5.length()
            r7 = 44
            int r7 = r5.indexOf(r7)
            if (r7 <= 0) goto L_0x055e
            int r8 = r6 + -1
            if (r7 >= r8) goto L_0x055e
            r8 = 0
            java.lang.String r14 = r5.substring(r8, r7)
            java.lang.String r8 = "W"
            boolean r8 = r14.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x0550
            r8 = 0
            goto L_0x055b
        L_0x0550:
            java.lang.String r8 = "H"
            boolean r8 = r14.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x055a
            r8 = 1
            goto L_0x055b
        L_0x055a:
            r8 = -1
        L_0x055b:
            int r7 = r7 + 1
            goto L_0x0560
        L_0x055e:
            r7 = 0
            r8 = -1
        L_0x0560:
            r14 = 58
            int r14 = r5.indexOf(r14)
            if (r14 < 0) goto L_0x05a2
            int r6 = r6 + -1
            if (r14 >= r6) goto L_0x05a2
            java.lang.String r6 = r5.substring(r7, r14)
            int r14 = r14 + 1
            java.lang.String r5 = r5.substring(r14)
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x05b2
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x05b2
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x05b1 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x05b1 }
            r7 = 0
            int r14 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x05b2
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x05b2
            r7 = 1
            if (r8 != r7) goto L_0x059c
            float r5 = r5 / r6
            float r5 = java.lang.Math.abs(r5)     // Catch:{ NumberFormatException -> 0x05b1 }
            goto L_0x05b3
        L_0x059c:
            float r6 = r6 / r5
            float r5 = java.lang.Math.abs(r6)     // Catch:{ NumberFormatException -> 0x05b1 }
            goto L_0x05b3
        L_0x05a2:
            java.lang.String r5 = r5.substring(r7)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x05b2
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ NumberFormatException -> 0x05b1 }
            goto L_0x05b3
        L_0x05b1:
        L_0x05b2:
            r5 = 0
        L_0x05b3:
            r6 = 0
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x05bc
            r3.f61557G = r5
            r3.f61558H = r8
        L_0x05bc:
            float r5 = r13.f44412D
            float[] r6 = r3.f61588f0
            r7 = 0
            r6[r7] = r5
            float r5 = r13.f44413E
            r7 = 1
            r6[r7] = r5
            int r5 = r13.f44414F
            r3.f61584d0 = r5
            int r5 = r13.f44415G
            r3.f61586e0 = r5
            int r5 = r13.f44416H
            int r6 = r13.f44418J
            int r7 = r13.f44420L
            float r8 = r13.f44422N
            r3.f61585e = r5
            r3.f61591h = r6
            r3.f61593i = r7
            r3.f61594j = r8
            r6 = 2
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x05eb
            if (r5 != 0) goto L_0x05eb
            r3.f61585e = r6
        L_0x05eb:
            int r5 = r13.f44417I
            int r8 = r13.f44419K
            int r14 = r13.f44421M
            float r13 = r13.f44423O
            r3.f61587f = r5
            r3.f61595k = r8
            r3.f61596l = r14
            r3.f61597m = r13
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x0603
            if (r5 != 0) goto L_0x0603
            r3.f61587f = r6
        L_0x0603:
            int r7 = r33 + 1
            r31 = r1
            r5 = r2
            r12 = r4
            r30 = r11
            r33 = r32
            r2 = r34
            r8 = r36
            r14 = r38
            r13 = r39
            r11 = r40
            r1 = r50
            r32 = r27
            goto L_0x01f3
        L_0x061d:
            r36 = r8
            r40 = r11
            r4 = r12
            r39 = r13
            r38 = r14
            r27 = r32
            r32 = r33
            goto L_0x0638
        L_0x062b:
            r27 = r6
            r32 = r7
            r36 = r8
            r40 = r11
            r4 = r12
            r39 = r13
            r38 = r14
        L_0x0638:
            r12 = -1
            r1 = 1
            goto L_0x064a
        L_0x063b:
            r27 = r6
            r32 = r7
            r36 = r8
            r40 = r11
            r4 = r12
            r39 = r13
            r38 = r14
            r12 = -1
            r1 = 0
        L_0x064a:
            int r2 = r0.f44403p
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto L_0x0653
            r14 = 1
            goto L_0x0654
        L_0x0653:
            r14 = 0
        L_0x0654:
            if (r14 == 0) goto L_0x06a6
            o2.g r5 = r0.f44397g
            java.util.ArrayList<o2.f> r6 = r5.f61673i0
            int r6 = r6.size()
            r5.mo34022v()
            r7 = 0
        L_0x0662:
            if (r7 >= r6) goto L_0x0672
            java.util.ArrayList<o2.f> r8 = r5.f61673i0
            java.lang.Object r8 = r8.get(r7)
            o2.f r8 = (p368o2.C21738f) r8
            r8.mo34022v()
            int r7 = r7 + 1
            goto L_0x0662
        L_0x0672:
            int r6 = r5.f61629w0
            r5.mo34021c(r6)
            o2.g r5 = r0.f44397g
            o2.f$a[] r6 = r5.f61553C
            r7 = 0
            r6 = r6[r7]
            r7 = r40
            if (r6 == r7) goto L_0x068c
            o2.m r6 = r5.f61581c
            if (r6 == 0) goto L_0x068c
            r8 = r39
            r6.mo34077g(r8)
            goto L_0x068e
        L_0x068c:
            r8 = r39
        L_0x068e:
            o2.f$a[] r6 = r5.f61553C
            r11 = 1
            r6 = r6[r11]
            if (r6 == r7) goto L_0x069f
            o2.m r5 = r5.f61583d
            if (r5 == 0) goto L_0x069f
            r6 = r38
            r5.mo34077g(r6)
            goto L_0x06a1
        L_0x069f:
            r6 = r38
        L_0x06a1:
            r49.mo16695p(r50, r51)
            goto L_0x07ba
        L_0x06a6:
            r6 = r38
            r8 = r39
            r7 = r40
            int r5 = r49.getPaddingTop()
            int r11 = r49.getPaddingBottom()
            int r5 = r5 + r11
            int r11 = r49.getPaddingLeft()
            int r13 = r49.getPaddingRight()
            int r11 = r11 + r13
            int r13 = r49.getChildCount()
            r15 = 0
        L_0x06c3:
            if (r15 >= r13) goto L_0x07ba
            android.view.View r2 = r0.getChildAt(r15)
            int r12 = r2.getVisibility()
            if (r12 != r3) goto L_0x06db
            r38 = r6
            r39 = r8
            r23 = r9
            r24 = r10
            r22 = r13
            goto L_0x07a5
        L_0x06db:
            android.view.ViewGroup$LayoutParams r12 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12
            o2.f r3 = r12.f44456k0
            r22 = r13
            boolean r13 = r12.f44432X
            if (r13 != 0) goto L_0x079d
            boolean r13 = r12.f44433Y
            if (r13 == 0) goto L_0x06ef
            goto L_0x079d
        L_0x06ef:
            int r13 = r2.getVisibility()
            r3.f61575Y = r13
            int r13 = r12.width
            r38 = r6
            int r6 = r12.height
            r39 = r8
            boolean r8 = r12.f44429U
            r23 = r9
            if (r8 != 0) goto L_0x0722
            boolean r9 = r12.f44430V
            if (r9 != 0) goto L_0x0722
            if (r8 != 0) goto L_0x0711
            int r8 = r12.f44416H
            r24 = r10
            r10 = 1
            if (r8 == r10) goto L_0x0724
            goto L_0x0714
        L_0x0711:
            r24 = r10
            r10 = 1
        L_0x0714:
            r8 = -1
            if (r13 == r8) goto L_0x0724
            if (r9 != 0) goto L_0x0720
            int r9 = r12.f44417I
            if (r9 == r10) goto L_0x0724
            if (r6 != r8) goto L_0x0720
            goto L_0x0724
        L_0x0720:
            r8 = 0
            goto L_0x0725
        L_0x0722:
            r24 = r10
        L_0x0724:
            r8 = 1
        L_0x0725:
            if (r8 == 0) goto L_0x077a
            if (r13 != 0) goto L_0x0735
            r8 = r50
            r9 = -2
            int r10 = android.view.ViewGroup.getChildMeasureSpec(r8, r11, r9)
            r13 = r10
            r10 = -1
            r25 = 1
            goto L_0x074f
        L_0x0735:
            r8 = r50
            r9 = -2
            r10 = -1
            if (r13 != r10) goto L_0x0742
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r8, r11, r10)
            r25 = 0
            goto L_0x074f
        L_0x0742:
            if (r13 != r9) goto L_0x0747
            r21 = 1
            goto L_0x0749
        L_0x0747:
            r21 = 0
        L_0x0749:
            int r13 = android.view.ViewGroup.getChildMeasureSpec(r8, r11, r13)
            r25 = r21
        L_0x074f:
            if (r6 != 0) goto L_0x0759
            r10 = r51
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r10, r5, r9)
            r9 = 1
            goto L_0x076e
        L_0x0759:
            r10 = r51
            r9 = -1
            if (r6 != r9) goto L_0x0764
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r10, r5, r9)
            r9 = 0
            goto L_0x076e
        L_0x0764:
            r9 = -2
            if (r6 != r9) goto L_0x0769
            r9 = 1
            goto L_0x076a
        L_0x0769:
            r9 = 0
        L_0x076a:
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r10, r5, r6)
        L_0x076e:
            r2.measure(r13, r6)
            int r13 = r2.getMeasuredWidth()
            int r6 = r2.getMeasuredHeight()
            goto L_0x0781
        L_0x077a:
            r8 = r50
            r10 = r51
            r9 = 0
            r25 = 0
        L_0x0781:
            r3.mo34033D(r13)
            r3.mo34057z(r6)
            if (r25 == 0) goto L_0x078b
            r3.f61570T = r13
        L_0x078b:
            if (r9 == 0) goto L_0x078f
            r3.f61571U = r6
        L_0x078f:
            boolean r6 = r12.f44431W
            if (r6 == 0) goto L_0x07a9
            int r2 = r2.getBaseline()
            r6 = -1
            if (r2 == r6) goto L_0x07a9
            r3.f61567Q = r2
            goto L_0x07a9
        L_0x079d:
            r38 = r6
            r39 = r8
            r23 = r9
            r24 = r10
        L_0x07a5:
            r8 = r50
            r10 = r51
        L_0x07a9:
            int r15 = r15 + 1
            r13 = r22
            r9 = r23
            r10 = r24
            r6 = r38
            r8 = r39
            r3 = 8
            r12 = -1
            goto L_0x06c3
        L_0x07ba:
            r38 = r6
            r39 = r8
            r23 = r9
            r24 = r10
            r8 = r50
            r10 = r51
            int r2 = r49.getChildCount()
            r3 = 0
        L_0x07cb:
            if (r3 >= r2) goto L_0x080c
            android.view.View r5 = r0.getChildAt(r3)
            boolean r6 = r5 instanceof androidx.constraintlayout.widget.Placeholder
            if (r6 == 0) goto L_0x0809
            androidx.constraintlayout.widget.Placeholder r5 = (androidx.constraintlayout.widget.Placeholder) r5
            android.view.View r6 = r5.f192668e
            if (r6 != 0) goto L_0x07dc
            goto L_0x0809
        L_0x07dc:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r6
            android.view.View r5 = r5.f192668e
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r5
            o2.f r9 = r5.f44456k0
            r11 = 0
            r9.f61575Y = r11
            o2.f r11 = r6.f44456k0
            int r9 = r9.mo34049q()
            r11.mo34033D(r9)
            o2.f r6 = r6.f44456k0
            o2.f r9 = r5.f44456k0
            int r9 = r9.mo34043k()
            r6.mo34057z(r9)
            o2.f r5 = r5.f44456k0
            r6 = 8
            r5.f61575Y = r6
        L_0x0809:
            int r3 = r3 + 1
            goto L_0x07cb
        L_0x080c:
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r2 = r0.f44395e
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0825
            r3 = 0
        L_0x0815:
            if (r3 >= r2) goto L_0x0825
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r5 = r0.f44395e
            java.lang.Object r5 = r5.get(r3)
            androidx.constraintlayout.widget.ConstraintHelper r5 = (androidx.constraintlayout.widget.ConstraintHelper) r5
            r5.getClass()
            int r3 = r3 + 1
            goto L_0x0815
        L_0x0825:
            int r2 = r49.getChildCount()
            r3 = 32
            if (r2 <= 0) goto L_0x0929
            if (r1 == 0) goto L_0x0929
            o2.g r1 = r0.f44397g
            int r2 = r1.f61629w0
            r2 = r2 & r3
            if (r2 == r3) goto L_0x084e
            java.util.List<o2.h> r2 = r1.f61623q0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.util.List<o2.h> r2 = r1.f61623q0
            o2.h r5 = new o2.h
            java.util.ArrayList<o2.f> r1 = r1.f61673i0
            r5.<init>(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r6 = 0
            r2.add(r6, r5)
            goto L_0x0929
        L_0x084e:
            r2 = 1
            r6 = 0
            r1.f61630x0 = r2
            r1.f61624r0 = r6
            r1.f61625s0 = r6
            r1.f61626t0 = r6
            java.util.ArrayList<o2.f> r5 = r1.f61673i0
            java.util.List<o2.h> r9 = r1.f61623q0
            o2.f$a[] r11 = r1.f61553C
            r12 = r11[r6]
            if (r12 != r7) goto L_0x0864
            r6 = 1
            goto L_0x0865
        L_0x0864:
            r6 = 0
        L_0x0865:
            r11 = r11[r2]
            if (r11 != r7) goto L_0x086b
            r2 = 1
            goto L_0x086c
        L_0x086b:
            r2 = 0
        L_0x086c:
            if (r6 != 0) goto L_0x0873
            if (r2 == 0) goto L_0x0871
            goto L_0x0873
        L_0x0871:
            r11 = 0
            goto L_0x0874
        L_0x0873:
            r11 = 1
        L_0x0874:
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r9.clear()
            java.util.Iterator r12 = r5.iterator()
        L_0x087d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0893
            java.lang.Object r13 = r12.next()
            o2.f r13 = (p368o2.C21738f) r13
            r15 = 0
            r13.f61600p = r15
            r15 = 0
            r13.f61582c0 = r15
            r13.mo34022v()
            goto L_0x087d
        L_0x0893:
            java.util.Iterator r5 = r5.iterator()
        L_0x0897:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x08d7
            java.lang.Object r12 = r5.next()
            o2.f r12 = (p368o2.C21738f) r12
            o2.h r13 = r12.f61600p
            if (r13 != 0) goto L_0x0897
            o2.h r13 = new o2.h
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r3 = 1
            r13.<init>(r15, r3)
            r9.add(r13)
            boolean r3 = p368o2.C21731a.m24720f(r12, r13, r9, r11)
            if (r3 != 0) goto L_0x08d4
            java.util.List<o2.h> r2 = r1.f61623q0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.util.List<o2.h> r2 = r1.f61623q0
            o2.h r3 = new o2.h
            java.util.ArrayList<o2.f> r5 = r1.f61673i0
            r3.<init>(r5)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r12 = 0
            r2.add(r12, r3)
            r1.f61630x0 = r12
            goto L_0x0929
        L_0x08d4:
            r3 = 32
            goto L_0x0897
        L_0x08d7:
            r12 = 0
            java.util.Iterator r3 = r9.iterator()
            r5 = 0
            r11 = 0
        L_0x08de:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x08fd
            java.lang.Object r13 = r3.next()
            o2.h r13 = (p368o2.C21741h) r13
            int r15 = p368o2.C21731a.m24715a(r13, r12)
            int r5 = java.lang.Math.max(r5, r15)
            r12 = 1
            int r13 = p368o2.C21731a.m24715a(r13, r12)
            int r11 = java.lang.Math.max(r11, r13)
            r12 = 0
            goto L_0x08de
        L_0x08fd:
            r12 = 1
            if (r6 == 0) goto L_0x090c
            r1.mo34030A(r4)
            r1.mo34033D(r5)
            r1.f61624r0 = r12
            r1.f61625s0 = r12
            r1.f61627u0 = r5
        L_0x090c:
            if (r2 == 0) goto L_0x091a
            r1.mo34032C(r4)
            r1.mo34057z(r11)
            r1.f61624r0 = r12
            r1.f61626t0 = r12
            r1.f61628v0 = r11
        L_0x091a:
            int r2 = r1.mo34049q()
            r3 = 0
            p368o2.C21731a.m24719e(r9, r3, r2)
            int r1 = r1.mo34043k()
            p368o2.C21731a.m24719e(r9, r12, r1)
        L_0x0929:
            o2.g r1 = r0.f44397g
            boolean r2 = r1.f61624r0
            if (r2 == 0) goto L_0x096d
            boolean r2 = r1.f61625s0
            if (r2 == 0) goto L_0x094b
            r2 = r20
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r3) goto L_0x0948
            int r3 = r1.f61627u0
            r5 = r19
            if (r3 >= r5) goto L_0x0942
            r1.mo34033D(r3)
        L_0x0942:
            o2.g r1 = r0.f44397g
            r1.mo34030A(r4)
            goto L_0x094f
        L_0x0948:
            r5 = r19
            goto L_0x094f
        L_0x094b:
            r5 = r19
            r2 = r20
        L_0x094f:
            o2.g r1 = r0.f44397g
            boolean r3 = r1.f61626t0
            if (r3 == 0) goto L_0x096a
            r3 = r16
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r6) goto L_0x0973
            int r6 = r1.f61628v0
            r9 = r36
            if (r6 >= r9) goto L_0x0964
            r1.mo34057z(r6)
        L_0x0964:
            o2.g r1 = r0.f44397g
            r1.mo34032C(r4)
            goto L_0x0975
        L_0x096a:
            r3 = r16
            goto L_0x0973
        L_0x096d:
            r3 = r16
            r5 = r19
            r2 = r20
        L_0x0973:
            r9 = r36
        L_0x0975:
            int r1 = r0.f44403p
            r4 = 32
            r1 = r1 & r4
            if (r1 != r4) goto L_0x09c9
            o2.g r1 = r0.f44397g
            int r1 = r1.mo34049q()
            o2.g r4 = r0.f44397g
            int r4 = r4.mo34043k()
            int r6 = r0.f44407t
            if (r6 == r1) goto L_0x0999
            r6 = 1073741824(0x40000000, float:2.0)
            if (r2 != r6) goto L_0x099b
            o2.g r2 = r0.f44397g
            java.util.List<o2.h> r2 = r2.f61623q0
            r11 = 0
            p368o2.C21731a.m24719e(r2, r11, r1)
            goto L_0x099b
        L_0x0999:
            r6 = 1073741824(0x40000000, float:2.0)
        L_0x099b:
            int r1 = r0.f44408u
            if (r1 == r4) goto L_0x09a9
            if (r3 != r6) goto L_0x09a9
            o2.g r1 = r0.f44397g
            java.util.List<o2.h> r1 = r1.f61623q0
            r2 = 1
            p368o2.C21731a.m24719e(r1, r2, r4)
        L_0x09a9:
            o2.g r1 = r0.f44397g
            boolean r2 = r1.f61625s0
            if (r2 == 0) goto L_0x09b9
            int r2 = r1.f61627u0
            if (r2 <= r5) goto L_0x09b9
            java.util.List<o2.h> r1 = r1.f61623q0
            r2 = 0
            p368o2.C21731a.m24719e(r1, r2, r5)
        L_0x09b9:
            o2.g r1 = r0.f44397g
            boolean r2 = r1.f61626t0
            if (r2 == 0) goto L_0x09c9
            int r2 = r1.f61628v0
            if (r2 <= r9) goto L_0x09c9
            java.util.List<o2.h> r1 = r1.f61623q0
            r2 = 1
            p368o2.C21731a.m24719e(r1, r2, r9)
        L_0x09c9:
            int r1 = r49.getChildCount()
            if (r1 <= 0) goto L_0x09d4
            o2.g r1 = r0.f44397g
            r1.mo34058G()
        L_0x09d4:
            java.util.ArrayList<o2.f> r1 = r0.f44396f
            int r1 = r1.size()
            int r2 = r49.getPaddingBottom()
            int r6 = r27 + r2
            int r2 = r49.getPaddingRight()
            int r2 = r32 + r2
            if (r1 <= 0) goto L_0x0bd6
            o2.g r3 = r0.f44397g
            o2.f$a[] r4 = r3.f61553C
            r5 = 0
            r9 = r4[r5]
            if (r9 != r7) goto L_0x09f3
            r9 = 1
            goto L_0x09f4
        L_0x09f3:
            r9 = 0
        L_0x09f4:
            r11 = 1
            r4 = r4[r11]
            if (r4 != r7) goto L_0x09fb
            r4 = 1
            goto L_0x09fc
        L_0x09fb:
            r4 = 0
        L_0x09fc:
            int r3 = r3.mo34049q()
            int r7 = r0.f44398h
            int r3 = java.lang.Math.max(r3, r7)
            o2.g r7 = r0.f44397g
            int r7 = r7.mo34043k()
            int r12 = r0.f44399i
            int r7 = java.lang.Math.max(r7, r12)
            r12 = 0
            r13 = 0
            r15 = 0
        L_0x0a15:
            if (r12 >= r1) goto L_0x0b3f
            java.util.ArrayList<o2.f> r5 = r0.f44396f
            java.lang.Object r5 = r5.get(r12)
            o2.f r5 = (p368o2.C21738f) r5
            java.lang.Object r11 = r5.f61574X
            android.view.View r11 = (android.view.View) r11
            if (r11 != 0) goto L_0x0a29
            r18 = r1
            goto L_0x0b27
        L_0x0a29:
            android.view.ViewGroup$LayoutParams r16 = r11.getLayoutParams()
            r18 = r1
            r1 = r16
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            boolean r0 = r1.f44433Y
            if (r0 != 0) goto L_0x0b27
            boolean r0 = r1.f44432X
            if (r0 == 0) goto L_0x0a3d
            goto L_0x0b27
        L_0x0a3d:
            int r0 = r11.getVisibility()
            r16 = r13
            r13 = 8
            if (r0 != r13) goto L_0x0a49
        L_0x0a47:
            goto L_0x0b29
        L_0x0a49:
            if (r14 == 0) goto L_0x0a60
            o2.m r0 = r5.mo34046n()
            boolean r0 = r0.mo34081d()
            if (r0 == 0) goto L_0x0a60
            o2.m r0 = r5.mo34045m()
            boolean r0 = r0.mo34081d()
            if (r0 == 0) goto L_0x0a60
            goto L_0x0a47
        L_0x0a60:
            int r0 = r1.width
            r13 = -2
            if (r0 != r13) goto L_0x0a6e
            boolean r13 = r1.f44429U
            if (r13 == 0) goto L_0x0a6e
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r8, r2, r0)
            goto L_0x0a78
        L_0x0a6e:
            int r0 = r5.mo34049q()
            r13 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
        L_0x0a78:
            int r13 = r1.height
            r8 = -2
            if (r13 != r8) goto L_0x0a86
            boolean r8 = r1.f44430V
            if (r8 == 0) goto L_0x0a86
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r10, r6, r13)
            goto L_0x0a90
        L_0x0a86:
            int r8 = r5.mo34043k()
            r13 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r13)
        L_0x0a90:
            r11.measure(r0, r8)
            int r0 = r11.getMeasuredWidth()
            int r8 = r11.getMeasuredHeight()
            int r13 = r5.mo34049q()
            if (r0 == r13) goto L_0x0acf
            r5.mo34033D(r0)
            if (r14 == 0) goto L_0x0aad
            o2.m r13 = r5.mo34046n()
            r13.mo34077g(r0)
        L_0x0aad:
            if (r9 == 0) goto L_0x0aca
            int r0 = r5.mo34047o()
            if (r0 <= r3) goto L_0x0aca
            int r0 = r5.mo34047o()
            r13 = r24
            o2.e r16 = r5.mo34038f(r13)
            int r16 = r16.mo34025b()
            int r0 = r0 + r16
            int r3 = java.lang.Math.max(r3, r0)
            goto L_0x0acc
        L_0x0aca:
            r13 = r24
        L_0x0acc:
            r16 = 1
            goto L_0x0ad1
        L_0x0acf:
            r13 = r24
        L_0x0ad1:
            int r0 = r5.mo34043k()
            if (r8 == r0) goto L_0x0b05
            r5.mo34057z(r8)
            if (r14 == 0) goto L_0x0ae3
            o2.m r0 = r5.mo34045m()
            r0.mo34077g(r8)
        L_0x0ae3:
            if (r4 == 0) goto L_0x0b00
            int r0 = r5.mo34041i()
            if (r0 <= r7) goto L_0x0b00
            int r0 = r5.mo34041i()
            r8 = r23
            o2.e r16 = r5.mo34038f(r8)
            int r16 = r16.mo34025b()
            int r0 = r0 + r16
            int r7 = java.lang.Math.max(r7, r0)
            goto L_0x0b02
        L_0x0b00:
            r8 = r23
        L_0x0b02:
            r16 = 1
            goto L_0x0b07
        L_0x0b05:
            r8 = r23
        L_0x0b07:
            boolean r0 = r1.f44431W
            if (r0 == 0) goto L_0x0b1d
            int r0 = r11.getBaseline()
            r1 = -1
            if (r0 == r1) goto L_0x0b1d
            int r1 = r5.mo34040h()
            if (r0 == r1) goto L_0x0b1d
            r5.mo34056y(r0)
            r16 = 1
        L_0x0b1d:
            int r0 = r11.getMeasuredState()
            int r0 = android.view.View.combineMeasuredStates(r15, r0)
            r15 = r0
            goto L_0x0b2d
        L_0x0b27:
            r16 = r13
        L_0x0b29:
            r8 = r23
            r13 = r24
        L_0x0b2d:
            int r12 = r12 + 1
            r0 = r49
            r23 = r8
            r24 = r13
            r13 = r16
            r1 = r18
            r5 = 0
            r11 = 1
            r8 = r50
            goto L_0x0a15
        L_0x0b3f:
            r18 = r1
            r16 = r13
            r0 = r49
            if (r16 == 0) goto L_0x0b86
            o2.g r1 = r0.f44397g
            r4 = r39
            r1.mo34033D(r4)
            o2.g r1 = r0.f44397g
            r4 = r38
            r1.mo34057z(r4)
            if (r14 == 0) goto L_0x0b5c
            o2.g r1 = r0.f44397g
            r1.mo34062K()
        L_0x0b5c:
            o2.g r1 = r0.f44397g
            r1.mo34058G()
            o2.g r1 = r0.f44397g
            int r1 = r1.mo34049q()
            if (r1 >= r3) goto L_0x0b70
            o2.g r1 = r0.f44397g
            r1.mo34033D(r3)
            r14 = 1
            goto L_0x0b71
        L_0x0b70:
            r14 = 0
        L_0x0b71:
            o2.g r1 = r0.f44397g
            int r1 = r1.mo34043k()
            if (r1 >= r7) goto L_0x0b7f
            o2.g r1 = r0.f44397g
            r1.mo34057z(r7)
            r14 = 1
        L_0x0b7f:
            if (r14 == 0) goto L_0x0b86
            o2.g r1 = r0.f44397g
            r1.mo34058G()
        L_0x0b86:
            r3 = r18
            r1 = 0
        L_0x0b89:
            if (r1 >= r3) goto L_0x0bd7
            java.util.ArrayList<o2.f> r4 = r0.f44396f
            java.lang.Object r4 = r4.get(r1)
            o2.f r4 = (p368o2.C21738f) r4
            java.lang.Object r5 = r4.mo34042j()
            android.view.View r5 = (android.view.View) r5
            if (r5 != 0) goto L_0x0b9c
            goto L_0x0bb1
        L_0x0b9c:
            int r7 = r5.getMeasuredWidth()
            int r8 = r4.mo34049q()
            if (r7 != r8) goto L_0x0bb6
            int r7 = r5.getMeasuredHeight()
            int r8 = r4.mo34043k()
            if (r7 == r8) goto L_0x0bb1
            goto L_0x0bb6
        L_0x0bb1:
            r8 = 8
        L_0x0bb3:
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x0bd3
        L_0x0bb6:
            int r7 = r4.mo34048p()
            r8 = 8
            if (r7 == r8) goto L_0x0bb3
            int r7 = r4.mo34049q()
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            int r4 = r4.mo34043k()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r9)
            r5.measure(r7, r4)
        L_0x0bd3:
            int r1 = r1 + 1
            goto L_0x0b89
        L_0x0bd6:
            r15 = 0
        L_0x0bd7:
            o2.g r1 = r0.f44397g
            int r1 = r1.mo34049q()
            int r1 = r1 + r2
            o2.g r2 = r0.f44397g
            int r2 = r2.mo34043k()
            int r2 = r2 + r6
            r3 = r50
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r15)
            int r3 = r15 << 16
            int r2 = android.view.View.resolveSizeAndState(r2, r10, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r2 = r2 & r3
            int r3 = r0.f44400j
            int r1 = java.lang.Math.min(r3, r1)
            int r3 = r0.f44401n
            int r2 = java.lang.Math.min(r3, r2)
            o2.g r3 = r0.f44397g
            boolean r4 = r3.f61631y0
            r5 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 == 0) goto L_0x0c0b
            r1 = r1 | r5
        L_0x0c0b:
            boolean r3 = r3.f61632z0
            if (r3 == 0) goto L_0x0c10
            r2 = r2 | r5
        L_0x0c10:
            r0.setMeasuredDimension(r1, r2)
            r0.f44407t = r1
            r0.f44408u = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C21738f n = mo16690n(view);
        if ((view instanceof Guideline) && !(n instanceof C21742i)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C21742i iVar = new C21742i();
            layoutParams.f44456k0 = iVar;
            layoutParams.f44432X = true;
            iVar.mo34066G(layoutParams.f44426R);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo16673e();
            ((LayoutParams) view.getLayoutParams()).f44433Y = true;
            if (!this.f44395e.contains(constraintHelper)) {
                this.f44395e.add(constraintHelper);
            }
        }
        this.f44394d.put(view.getId(), view);
        this.f44402o = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f44394d.remove(view.getId());
        C21738f n = mo16690n(view);
        this.f44397g.f61673i0.remove(n);
        n.f61554D = null;
        this.f44395e.remove(view);
        this.f44396f.remove(n);
        this.f44402o = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x029c  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16695p(int r25, int r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            o2.f$a r3 = p368o2.C21738f.C21739a.MATCH_CONSTRAINT
            int r4 = r24.getPaddingTop()
            int r5 = r24.getPaddingBottom()
            int r4 = r4 + r5
            int r5 = r24.getPaddingLeft()
            int r6 = r24.getPaddingRight()
            int r5 = r5 + r6
            int r6 = r24.getChildCount()
            r8 = 0
        L_0x001f:
            r9 = 8
            r10 = -1
            r11 = -2
            if (r8 >= r6) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r8)
            int r14 = r13.getVisibility()
            if (r14 != r9) goto L_0x0031
            goto L_0x00b2
        L_0x0031:
            android.view.ViewGroup$LayoutParams r9 = r13.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r9 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r9
            o2.f r14 = r9.f44456k0
            boolean r15 = r9.f44432X
            if (r15 != 0) goto L_0x00b2
            boolean r15 = r9.f44433Y
            if (r15 == 0) goto L_0x0043
            goto L_0x00b2
        L_0x0043:
            int r15 = r13.getVisibility()
            r14.f61575Y = r15
            int r15 = r9.width
            int r12 = r9.height
            if (r15 == 0) goto L_0x00a4
            if (r12 != 0) goto L_0x0052
            goto L_0x00a4
        L_0x0052:
            if (r15 != r11) goto L_0x0057
            r17 = 1
            goto L_0x0059
        L_0x0057:
            r17 = 0
        L_0x0059:
            int r15 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r15)
            if (r12 != r11) goto L_0x0062
            r16 = 1
            goto L_0x0064
        L_0x0062:
            r16 = 0
        L_0x0064:
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r2, r4, r12)
            r13.measure(r15, r11)
            int r11 = r13.getMeasuredWidth()
            int r12 = r13.getMeasuredHeight()
            r14.mo34033D(r11)
            r14.mo34057z(r12)
            if (r17 == 0) goto L_0x007d
            r14.f61570T = r11
        L_0x007d:
            if (r16 == 0) goto L_0x0081
            r14.f61571U = r12
        L_0x0081:
            boolean r15 = r9.f44431W
            if (r15 == 0) goto L_0x008d
            int r13 = r13.getBaseline()
            if (r13 == r10) goto L_0x008d
            r14.f61567Q = r13
        L_0x008d:
            boolean r10 = r9.f44429U
            if (r10 == 0) goto L_0x00b2
            boolean r9 = r9.f44430V
            if (r9 == 0) goto L_0x00b2
            o2.m r9 = r14.mo34046n()
            r9.mo34077g(r11)
            o2.m r9 = r14.mo34045m()
            r9.mo34077g(r12)
            goto L_0x00b2
        L_0x00a4:
            o2.m r9 = r14.mo34046n()
            r9.mo34080c()
            o2.m r9 = r14.mo34045m()
            r9.mo34080c()
        L_0x00b2:
            int r8 = r8 + 1
            goto L_0x001f
        L_0x00b6:
            o2.g r8 = r0.f44397g
            r8.mo34062K()
            r8 = 0
        L_0x00bc:
            if (r8 >= r6) goto L_0x02b6
            android.view.View r12 = r0.getChildAt(r8)
            int r13 = r12.getVisibility()
            if (r13 != r9) goto L_0x00ca
            goto L_0x029e
        L_0x00ca:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r13 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r13
            o2.f r14 = r13.f44456k0
            boolean r15 = r13.f44432X
            if (r15 != 0) goto L_0x029e
            boolean r15 = r13.f44433Y
            if (r15 == 0) goto L_0x00dc
            goto L_0x029e
        L_0x00dc:
            int r15 = r12.getVisibility()
            r14.f61575Y = r15
            int r15 = r13.width
            int r9 = r13.height
            if (r15 == 0) goto L_0x00ec
            if (r9 == 0) goto L_0x00ec
            goto L_0x029e
        L_0x00ec:
            o2.e$b r10 = p368o2.C21735e.C21737b.LEFT
            o2.e r11 = r14.mo34038f(r10)
            o2.l r11 = r11.f61530a
            o2.e$b r7 = p368o2.C21735e.C21737b.RIGHT
            r19 = r6
            o2.e r6 = r14.mo34038f(r7)
            o2.l r6 = r6.f61530a
            o2.e r10 = r14.mo34038f(r10)
            o2.e r10 = r10.f61533d
            if (r10 == 0) goto L_0x0110
            o2.e r7 = r14.mo34038f(r7)
            o2.e r7 = r7.f61533d
            if (r7 == 0) goto L_0x0110
            r7 = 1
            goto L_0x0111
        L_0x0110:
            r7 = 0
        L_0x0111:
            o2.e$b r10 = p368o2.C21735e.C21737b.TOP
            r20 = r8
            o2.e r8 = r14.mo34038f(r10)
            o2.l r8 = r8.f61530a
            r21 = r13
            o2.e$b r13 = p368o2.C21735e.C21737b.BOTTOM
            r22 = r12
            o2.e r12 = r14.mo34038f(r13)
            o2.l r12 = r12.f61530a
            o2.e r10 = r14.mo34038f(r10)
            o2.e r10 = r10.f61533d
            if (r10 == 0) goto L_0x0139
            o2.e r10 = r14.mo34038f(r13)
            o2.e r10 = r10.f61533d
            if (r10 == 0) goto L_0x0139
            r10 = 1
            goto L_0x013a
        L_0x0139:
            r10 = 0
        L_0x013a:
            if (r15 != 0) goto L_0x0145
            if (r9 != 0) goto L_0x0145
            if (r7 == 0) goto L_0x0145
            if (r10 == 0) goto L_0x0145
            r10 = r2
            goto L_0x02a3
        L_0x0145:
            o2.g r13 = r0.f44397g
            o2.f$a[] r13 = r13.f61553C
            r18 = 0
            r0 = r13[r18]
            o2.f$a r2 = p368o2.C21738f.C21739a.WRAP_CONTENT
            if (r0 == r2) goto L_0x0153
            r0 = 1
            goto L_0x0154
        L_0x0153:
            r0 = 0
        L_0x0154:
            r16 = 1
            r13 = r13[r16]
            if (r13 == r2) goto L_0x015c
            r2 = 1
            goto L_0x015d
        L_0x015c:
            r2 = 0
        L_0x015d:
            if (r0 != 0) goto L_0x0166
            o2.m r13 = r14.mo34046n()
            r13.mo34080c()
        L_0x0166:
            if (r2 != 0) goto L_0x016f
            o2.m r13 = r14.mo34045m()
            r13.mo34080c()
        L_0x016f:
            r13 = 0
            if (r15 != 0) goto L_0x01c1
            if (r0 == 0) goto L_0x01b6
            int r15 = r14.f61585e
            if (r15 != 0) goto L_0x0190
            float r15 = r14.f61557G
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0190
            int r15 = r14.f61591h
            if (r15 != 0) goto L_0x0190
            int r15 = r14.f61593i
            if (r15 != 0) goto L_0x0190
            o2.f$a[] r15 = r14.f61553C
            r18 = 0
            r15 = r15[r18]
            if (r15 != r3) goto L_0x0192
            r15 = 1
            goto L_0x0193
        L_0x0190:
            r18 = 0
        L_0x0192:
            r15 = 0
        L_0x0193:
            if (r15 == 0) goto L_0x01b8
            if (r7 == 0) goto L_0x01b8
            boolean r7 = r11.mo34081d()
            if (r7 == 0) goto L_0x01b8
            boolean r7 = r6.mo34081d()
            if (r7 == 0) goto L_0x01b8
            float r6 = r6.f61654g
            float r7 = r11.f61654g
            float r6 = r6 - r7
            int r6 = (int) r6
            o2.m r7 = r14.mo34046n()
            r7.mo34077g(r6)
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r6)
            r7 = r0
            goto L_0x01cd
        L_0x01b6:
            r18 = 0
        L_0x01b8:
            r6 = -2
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r6)
            r6 = r0
            r0 = 1
            r7 = 0
            goto L_0x01de
        L_0x01c1:
            r6 = -2
            r7 = -1
            r18 = 0
            if (r15 != r7) goto L_0x01cf
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r7)
            r7 = r0
            r6 = r11
        L_0x01cd:
            r0 = 0
            goto L_0x01de
        L_0x01cf:
            if (r15 != r6) goto L_0x01d3
            r6 = 1
            goto L_0x01d4
        L_0x01d3:
            r6 = 0
        L_0x01d4:
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r1, r5, r15)
            r23 = r7
            r7 = r0
            r0 = r6
            r6 = r23
        L_0x01de:
            if (r9 != 0) goto L_0x0238
            if (r2 == 0) goto L_0x022a
            int r9 = r14.f61587f
            if (r9 != 0) goto L_0x01fd
            float r9 = r14.f61557G
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 != 0) goto L_0x01fd
            int r9 = r14.f61595k
            if (r9 != 0) goto L_0x01fd
            int r9 = r14.f61596l
            if (r9 != 0) goto L_0x01fd
            o2.f$a[] r9 = r14.f61553C
            r11 = 1
            r9 = r9[r11]
            if (r9 != r3) goto L_0x01fe
            r9 = 1
            goto L_0x01ff
        L_0x01fd:
            r11 = 1
        L_0x01fe:
            r9 = 0
        L_0x01ff:
            if (r9 == 0) goto L_0x0227
            if (r10 == 0) goto L_0x0227
            boolean r9 = r8.mo34081d()
            if (r9 == 0) goto L_0x0227
            boolean r9 = r12.mo34081d()
            if (r9 == 0) goto L_0x0227
            float r9 = r12.f61654g
            float r8 = r8.f61654g
            float r9 = r9 - r8
            int r8 = (int) r9
            o2.m r9 = r14.mo34045m()
            r9.mo34077g(r8)
            r10 = r26
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r10, r4, r8)
            r9 = r8
            r13 = r22
            r8 = -2
            goto L_0x0245
        L_0x0227:
            r10 = r26
            goto L_0x022d
        L_0x022a:
            r10 = r26
            r11 = 1
        L_0x022d:
            r8 = -2
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r10, r4, r8)
            r9 = r2
            r13 = r22
            r2 = 0
            r12 = 1
            goto L_0x0252
        L_0x0238:
            r10 = r26
            r8 = -2
            r11 = 1
            r12 = -1
            if (r9 != r12) goto L_0x0247
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r10, r4, r12)
            r13 = r22
        L_0x0245:
            r12 = 0
            goto L_0x0252
        L_0x0247:
            if (r9 != r8) goto L_0x024b
            r12 = 1
            goto L_0x024c
        L_0x024b:
            r12 = 0
        L_0x024c:
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r10, r4, r9)
            r13 = r22
        L_0x0252:
            r13.measure(r6, r9)
            int r6 = r13.getMeasuredWidth()
            int r9 = r13.getMeasuredHeight()
            r14.mo34033D(r6)
            r14.mo34057z(r9)
            if (r0 == 0) goto L_0x0267
            r14.f61570T = r6
        L_0x0267:
            if (r12 == 0) goto L_0x026b
            r14.f61571U = r9
        L_0x026b:
            r0 = 2
            if (r7 == 0) goto L_0x0276
            o2.m r7 = r14.mo34046n()
            r7.mo34077g(r6)
            goto L_0x027c
        L_0x0276:
            o2.m r6 = r14.mo34046n()
            r6.f61662b = r0
        L_0x027c:
            if (r2 == 0) goto L_0x0286
            o2.m r0 = r14.mo34045m()
            r0.mo34077g(r9)
            goto L_0x028c
        L_0x0286:
            o2.m r2 = r14.mo34045m()
            r2.f61662b = r0
        L_0x028c:
            r0 = r21
            boolean r0 = r0.f44431W
            if (r0 == 0) goto L_0x029c
            int r0 = r13.getBaseline()
            r2 = -1
            if (r0 == r2) goto L_0x02a8
            r14.f61567Q = r0
            goto L_0x02a8
        L_0x029c:
            r2 = -1
            goto L_0x02a8
        L_0x029e:
            r10 = r2
            r19 = r6
            r20 = r8
        L_0x02a3:
            r2 = -1
            r8 = -2
            r11 = 1
            r18 = 0
        L_0x02a8:
            int r0 = r20 + 1
            r8 = r0
            r2 = r10
            r6 = r19
            r9 = 8
            r10 = -1
            r11 = -2
            r0 = r24
            goto L_0x00bc
        L_0x02b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo16695p(int, int):void");
    }

    /* renamed from: q */
    public void mo16696q(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f44406s == null) {
                this.f44406s = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f44406s.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        this.f44402o = true;
        this.f44407t = -1;
        this.f44408u = -1;
    }

    public void setConstraintSet(C16569a aVar) {
        this.f44404q = aVar;
    }

    public void setId(int i) {
        this.f44394d.remove(getId());
        super.setId(i);
        this.f44394d.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f44401n) {
            this.f44401n = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f44400j) {
            this.f44400j = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f44399i) {
            this.f44399i = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f44398h) {
            this.f44398h = i;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f44397g.f61629w0 = i;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m15622o(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m15622o(attributeSet);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f44409A = 0.5f;

        /* renamed from: B */
        public String f44410B = null;

        /* renamed from: C */
        public int f44411C = 1;

        /* renamed from: D */
        public float f44412D = -1.0f;

        /* renamed from: E */
        public float f44413E = -1.0f;

        /* renamed from: F */
        public int f44414F = 0;

        /* renamed from: G */
        public int f44415G = 0;

        /* renamed from: H */
        public int f44416H = 0;

        /* renamed from: I */
        public int f44417I = 0;

        /* renamed from: J */
        public int f44418J = 0;

        /* renamed from: K */
        public int f44419K = 0;

        /* renamed from: L */
        public int f44420L = 0;

        /* renamed from: M */
        public int f44421M = 0;

        /* renamed from: N */
        public float f44422N = 1.0f;

        /* renamed from: O */
        public float f44423O = 1.0f;

        /* renamed from: P */
        public int f44424P = -1;

        /* renamed from: Q */
        public int f44425Q = -1;

        /* renamed from: R */
        public int f44426R = -1;

        /* renamed from: S */
        public boolean f44427S = false;

        /* renamed from: T */
        public boolean f44428T = false;

        /* renamed from: U */
        public boolean f44429U = true;

        /* renamed from: V */
        public boolean f44430V = true;

        /* renamed from: W */
        public boolean f44431W = false;

        /* renamed from: X */
        public boolean f44432X = false;

        /* renamed from: Y */
        public boolean f44433Y = false;

        /* renamed from: Z */
        public boolean f44434Z = false;

        /* renamed from: a */
        public int f44435a = -1;

        /* renamed from: a0 */
        public int f44436a0 = -1;

        /* renamed from: b */
        public int f44437b = -1;

        /* renamed from: b0 */
        public int f44438b0 = -1;

        /* renamed from: c */
        public float f44439c = -1.0f;

        /* renamed from: c0 */
        public int f44440c0 = -1;

        /* renamed from: d */
        public int f44441d = -1;

        /* renamed from: d0 */
        public int f44442d0 = -1;

        /* renamed from: e */
        public int f44443e = -1;

        /* renamed from: e0 */
        public int f44444e0 = -1;

        /* renamed from: f */
        public int f44445f = -1;

        /* renamed from: f0 */
        public int f44446f0 = -1;

        /* renamed from: g */
        public int f44447g = -1;

        /* renamed from: g0 */
        public float f44448g0 = 0.5f;

        /* renamed from: h */
        public int f44449h = -1;

        /* renamed from: h0 */
        public int f44450h0;

        /* renamed from: i */
        public int f44451i = -1;

        /* renamed from: i0 */
        public int f44452i0;

        /* renamed from: j */
        public int f44453j = -1;

        /* renamed from: j0 */
        public float f44454j0;

        /* renamed from: k */
        public int f44455k = -1;

        /* renamed from: k0 */
        public C21738f f44456k0 = new C21738f();

        /* renamed from: l */
        public int f44457l = -1;

        /* renamed from: m */
        public int f44458m = -1;

        /* renamed from: n */
        public int f44459n = 0;

        /* renamed from: o */
        public float f44460o = 0.0f;

        /* renamed from: p */
        public int f44461p = -1;

        /* renamed from: q */
        public int f44462q = -1;

        /* renamed from: r */
        public int f44463r = -1;

        /* renamed from: s */
        public int f44464s = -1;

        /* renamed from: t */
        public int f44465t = -1;

        /* renamed from: u */
        public int f44466u = -1;

        /* renamed from: v */
        public int f44467v = -1;

        /* renamed from: w */
        public int f44468w = -1;

        /* renamed from: x */
        public int f44469x = -1;

        /* renamed from: y */
        public int f44470y = -1;

        /* renamed from: z */
        public float f44471z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        public static class C16568a {

            /* renamed from: a */
            public static final SparseIntArray f44472a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f44472a = sparseIntArray;
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C16568a.f44472a.get(index);
                switch (i3) {
                    case 1:
                        this.f44426R = obtainStyledAttributes.getInt(index, this.f44426R);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f44458m);
                        this.f44458m = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f44458m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f44459n = obtainStyledAttributes.getDimensionPixelSize(index, this.f44459n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f44460o) % 360.0f;
                        this.f44460o = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f44460o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f44435a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44435a);
                        break;
                    case 6:
                        this.f44437b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44437b);
                        break;
                    case 7:
                        this.f44439c = obtainStyledAttributes.getFloat(index, this.f44439c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f44441d);
                        this.f44441d = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f44441d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f44443e);
                        this.f44443e = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f44443e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f44445f);
                        this.f44445f = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f44445f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f44447g);
                        this.f44447g = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f44447g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f44449h);
                        this.f44449h = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f44449h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f44451i);
                        this.f44451i = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f44451i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f44453j);
                        this.f44453j = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f44453j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f44455k);
                        this.f44455k = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f44455k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f44457l);
                        this.f44457l = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f44457l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f44461p);
                        this.f44461p = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f44461p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f44462q);
                        this.f44462q = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f44462q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f44463r);
                        this.f44463r = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f44463r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f44464s);
                        this.f44464s = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f44464s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f44465t = obtainStyledAttributes.getDimensionPixelSize(index, this.f44465t);
                        break;
                    case 22:
                        this.f44466u = obtainStyledAttributes.getDimensionPixelSize(index, this.f44466u);
                        break;
                    case 23:
                        this.f44467v = obtainStyledAttributes.getDimensionPixelSize(index, this.f44467v);
                        break;
                    case 24:
                        this.f44468w = obtainStyledAttributes.getDimensionPixelSize(index, this.f44468w);
                        break;
                    case 25:
                        this.f44469x = obtainStyledAttributes.getDimensionPixelSize(index, this.f44469x);
                        break;
                    case 26:
                        this.f44470y = obtainStyledAttributes.getDimensionPixelSize(index, this.f44470y);
                        break;
                    case 27:
                        this.f44427S = obtainStyledAttributes.getBoolean(index, this.f44427S);
                        break;
                    case 28:
                        this.f44428T = obtainStyledAttributes.getBoolean(index, this.f44428T);
                        break;
                    case 29:
                        this.f44471z = obtainStyledAttributes.getFloat(index, this.f44471z);
                        break;
                    case 30:
                        this.f44409A = obtainStyledAttributes.getFloat(index, this.f44409A);
                        break;
                    case 31:
                        this.f44416H = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f44417I = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f44418J = obtainStyledAttributes.getDimensionPixelSize(index, this.f44418J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f44418J) != -2) {
                                break;
                            } else {
                                this.f44418J = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f44420L = obtainStyledAttributes.getDimensionPixelSize(index, this.f44420L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f44420L) != -2) {
                                break;
                            } else {
                                this.f44420L = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f44422N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f44422N));
                        break;
                    case 36:
                        try {
                            this.f44419K = obtainStyledAttributes.getDimensionPixelSize(index, this.f44419K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f44419K) != -2) {
                                break;
                            } else {
                                this.f44419K = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f44421M = obtainStyledAttributes.getDimensionPixelSize(index, this.f44421M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f44421M) != -2) {
                                break;
                            } else {
                                this.f44421M = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f44423O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f44423O));
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f44410B = string;
                                this.f44411C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.f44410B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f44410B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                                            this.f44411C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f44411C = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f44410B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f44410B.substring(i, indexOf2);
                                        String substring3 = this.f44410B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f44411C != 1) {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f44410B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f44412D = obtainStyledAttributes.getFloat(index, this.f44412D);
                                break;
                            case 46:
                                this.f44413E = obtainStyledAttributes.getFloat(index, this.f44413E);
                                break;
                            case 47:
                                this.f44414F = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f44415G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f44424P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44424P);
                                break;
                            case 50:
                                this.f44425Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44425Q);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo16707a();
        }

        /* renamed from: a */
        public void mo16707a() {
            this.f44432X = false;
            this.f44429U = true;
            this.f44430V = true;
            int i = this.width;
            if (i == -2 && this.f44427S) {
                this.f44429U = false;
                this.f44416H = 1;
            }
            int i2 = this.height;
            if (i2 == -2 && this.f44428T) {
                this.f44430V = false;
                this.f44417I = 1;
            }
            if (i == 0 || i == -1) {
                this.f44429U = false;
                if (i == 0 && this.f44416H == 1) {
                    this.width = -2;
                    this.f44427S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f44430V = false;
                if (i2 == 0 && this.f44417I == 1) {
                    this.height = -2;
                    this.f44428T = true;
                }
            }
            if (this.f44439c != -1.0f || this.f44435a != -1 || this.f44437b != -1) {
                this.f44432X = true;
                this.f44429U = true;
                this.f44430V = true;
                if (!(this.f44456k0 instanceof C21742i)) {
                    this.f44456k0 = new C21742i();
                }
                ((C21742i) this.f44456k0).mo34066G(this.f44426R);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0080  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                super.resolveLayoutDirection(r7)
                r7 = -1
                r6.f44440c0 = r7
                r6.f44442d0 = r7
                r6.f44436a0 = r7
                r6.f44438b0 = r7
                int r2 = r6.f44465t
                r6.f44444e0 = r2
                int r2 = r6.f44467v
                r6.f44446f0 = r2
                float r2 = r6.f44471z
                r6.f44448g0 = r2
                int r2 = r6.f44435a
                r6.f44450h0 = r2
                int r2 = r6.f44437b
                r6.f44452i0 = r2
                float r2 = r6.f44439c
                r6.f44454j0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x0032
                r2 = 1
                goto L_0x0033
            L_0x0032:
                r2 = 0
            L_0x0033:
                if (r2 == 0) goto L_0x0096
                int r2 = r6.f44461p
                if (r2 == r7) goto L_0x003d
                r6.f44440c0 = r2
            L_0x003b:
                r3 = 1
                goto L_0x0044
            L_0x003d:
                int r2 = r6.f44462q
                if (r2 == r7) goto L_0x0044
                r6.f44442d0 = r2
                goto L_0x003b
            L_0x0044:
                int r2 = r6.f44463r
                if (r2 == r7) goto L_0x004b
                r6.f44438b0 = r2
                r3 = 1
            L_0x004b:
                int r2 = r6.f44464s
                if (r2 == r7) goto L_0x0052
                r6.f44436a0 = r2
                r3 = 1
            L_0x0052:
                int r2 = r6.f44469x
                if (r2 == r7) goto L_0x0058
                r6.f44446f0 = r2
            L_0x0058:
                int r2 = r6.f44470y
                if (r2 == r7) goto L_0x005e
                r6.f44444e0 = r2
            L_0x005e:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0068
                float r3 = r6.f44471z
                float r3 = r2 - r3
                r6.f44448g0 = r3
            L_0x0068:
                boolean r3 = r6.f44432X
                if (r3 == 0) goto L_0x00ba
                int r3 = r6.f44426R
                if (r3 != r4) goto L_0x00ba
                float r3 = r6.f44439c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x0080
                float r2 = r2 - r3
                r6.f44454j0 = r2
                r6.f44450h0 = r7
                r6.f44452i0 = r7
                goto L_0x00ba
            L_0x0080:
                int r2 = r6.f44435a
                if (r2 == r7) goto L_0x008b
                r6.f44452i0 = r2
                r6.f44450h0 = r7
                r6.f44454j0 = r4
                goto L_0x00ba
            L_0x008b:
                int r2 = r6.f44437b
                if (r2 == r7) goto L_0x00ba
                r6.f44450h0 = r2
                r6.f44452i0 = r7
                r6.f44454j0 = r4
                goto L_0x00ba
            L_0x0096:
                int r2 = r6.f44461p
                if (r2 == r7) goto L_0x009c
                r6.f44438b0 = r2
            L_0x009c:
                int r2 = r6.f44462q
                if (r2 == r7) goto L_0x00a2
                r6.f44436a0 = r2
            L_0x00a2:
                int r2 = r6.f44463r
                if (r2 == r7) goto L_0x00a8
                r6.f44440c0 = r2
            L_0x00a8:
                int r2 = r6.f44464s
                if (r2 == r7) goto L_0x00ae
                r6.f44442d0 = r2
            L_0x00ae:
                int r2 = r6.f44469x
                if (r2 == r7) goto L_0x00b4
                r6.f44444e0 = r2
            L_0x00b4:
                int r2 = r6.f44470y
                if (r2 == r7) goto L_0x00ba
                r6.f44446f0 = r2
            L_0x00ba:
                int r2 = r6.f44463r
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f44464s
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f44462q
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f44461p
                if (r2 != r7) goto L_0x0104
                int r2 = r6.f44445f
                if (r2 == r7) goto L_0x00d9
                r6.f44440c0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e7
                if (r1 <= 0) goto L_0x00e7
                r6.rightMargin = r1
                goto L_0x00e7
            L_0x00d9:
                int r2 = r6.f44447g
                if (r2 == r7) goto L_0x00e7
                r6.f44442d0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00e7
                if (r1 <= 0) goto L_0x00e7
                r6.rightMargin = r1
            L_0x00e7:
                int r1 = r6.f44441d
                if (r1 == r7) goto L_0x00f6
                r6.f44436a0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                r6.leftMargin = r0
                goto L_0x0104
            L_0x00f6:
                int r1 = r6.f44443e
                if (r1 == r7) goto L_0x0104
                r6.f44438b0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x0104
                if (r0 <= 0) goto L_0x0104
                r6.leftMargin = r0
            L_0x0104:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
