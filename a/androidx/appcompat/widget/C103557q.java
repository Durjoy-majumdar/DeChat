package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.C103728e;
import com.tencent.p014mm.C0966R;
import java.lang.reflect.Field;
import p1119i.C108289c;

/* renamed from: androidx.appcompat.widget.q */
public class C103557q extends ListView {

    /* renamed from: d */
    public final Rect f305823d = new Rect();

    /* renamed from: e */
    public int f305824e = 0;

    /* renamed from: f */
    public int f305825f = 0;

    /* renamed from: g */
    public int f305826g = 0;

    /* renamed from: h */
    public int f305827h = 0;

    /* renamed from: i */
    public int f305828i;

    /* renamed from: j */
    public Field f305829j;

    /* renamed from: n */
    public C103558a f305830n;

    /* renamed from: o */
    public boolean f305831o;

    /* renamed from: p */
    public boolean f305832p;

    /* renamed from: q */
    public boolean f305833q;

    /* renamed from: r */
    public C103728e f305834r;

    /* renamed from: s */
    public C103559b f305835s;

    /* renamed from: androidx.appcompat.widget.q$a */
    public static class C103558a extends C108289c {

        /* renamed from: e */
        public boolean f305836e = true;

        public C103558a(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.f305836e) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f305836e) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f305836e) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f305836e) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f305836e) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.q$b */
    public class C103559b implements Runnable {
        public C103559b() {
        }

        public void run() {
            C103557q qVar = C103557q.this;
            qVar.f305835s = null;
            qVar.drawableStateChanged();
        }
    }

    public C103557q(Context context, boolean z) {
        super(context, (AttributeSet) null, C0966R.attr.f2789ke);
        this.f305832p = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f305829j = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private void setSelectorEnabled(boolean z) {
        C103558a aVar = this.f305830n;
        if (aVar != null) {
            aVar.f305836e = z;
        }
    }

    /* renamed from: b */
    public int mo144415b(int i, int i2, int i3, int i4, int i5) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 != 3) goto L_0x011f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0155  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo144416c(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            r3 = 0
            r4 = 1
            if (r2 == r4) goto L_0x0016
            r5 = 2
            if (r2 == r5) goto L_0x0014
            r5 = 3
            if (r2 == r5) goto L_0x001d
            goto L_0x011f
        L_0x0014:
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0021
        L_0x001d:
            r4 = 0
            r5 = 0
            goto L_0x0121
        L_0x0021:
            float r7 = r1.getX(r6)
            int r7 = (int) r7
            float r6 = r1.getY(r6)
            int r6 = (int) r6
            int r8 = r0.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0034
            goto L_0x0121
        L_0x0034:
            int r5 = r16.getFirstVisiblePosition()
            int r5 = r8 - r5
            android.view.View r5 = r0.getChildAt(r5)
            float r7 = (float) r7
            float r6 = (float) r6
            r0.f305833q = r4
            r0.drawableHotspotChanged(r7, r6)
            boolean r10 = r16.isPressed()
            if (r10 != 0) goto L_0x004e
            r0.setPressed(r4)
        L_0x004e:
            r16.layoutChildren()
            int r10 = r0.f305828i
            if (r10 == r9) goto L_0x006b
            int r11 = r16.getFirstVisiblePosition()
            int r10 = r10 - r11
            android.view.View r10 = r0.getChildAt(r10)
            if (r10 == 0) goto L_0x006b
            if (r10 == r5) goto L_0x006b
            boolean r11 = r10.isPressed()
            if (r11 == 0) goto L_0x006b
            r10.setPressed(r3)
        L_0x006b:
            r0.f305828i = r8
            int r10 = r5.getLeft()
            float r10 = (float) r10
            float r10 = r7 - r10
            int r11 = r5.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r5.drawableHotspotChanged(r10, r11)
            boolean r10 = r5.isPressed()
            if (r10 != 0) goto L_0x0087
            r5.setPressed(r4)
        L_0x0087:
            android.graphics.drawable.Drawable r10 = r16.getSelector()
            if (r10 == 0) goto L_0x0091
            if (r8 == r9) goto L_0x0091
            r11 = 1
            goto L_0x0092
        L_0x0091:
            r11 = 0
        L_0x0092:
            if (r11 == 0) goto L_0x0097
            r10.setVisible(r3, r3)
        L_0x0097:
            android.graphics.Rect r12 = r0.f305823d
            int r13 = r5.getLeft()
            int r14 = r5.getTop()
            int r15 = r5.getRight()
            int r4 = r5.getBottom()
            r12.set(r13, r14, r15, r4)
            int r4 = r12.left
            int r13 = r0.f305824e
            int r4 = r4 - r13
            r12.left = r4
            int r4 = r12.top
            int r13 = r0.f305825f
            int r4 = r4 - r13
            r12.top = r4
            int r4 = r12.right
            int r13 = r0.f305826g
            int r4 = r4 + r13
            r12.right = r4
            int r4 = r12.bottom
            int r13 = r0.f305827h
            int r4 = r4 + r13
            r12.bottom = r4
            java.lang.reflect.Field r4 = r0.f305829j     // Catch:{ IllegalAccessException -> 0x00e8 }
            boolean r4 = r4.getBoolean(r0)     // Catch:{ IllegalAccessException -> 0x00e8 }
            boolean r12 = r5.isEnabled()     // Catch:{ IllegalAccessException -> 0x00e8 }
            if (r12 == r4) goto L_0x00e9
            java.lang.reflect.Field r12 = r0.f305829j     // Catch:{ IllegalAccessException -> 0x00e8 }
            if (r4 != 0) goto L_0x00da
            r4 = 1
            goto L_0x00db
        L_0x00da:
            r4 = 0
        L_0x00db:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ IllegalAccessException -> 0x00e8 }
            r12.set(r0, r4)     // Catch:{ IllegalAccessException -> 0x00e8 }
            if (r8 == r9) goto L_0x00e9
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r11 == 0) goto L_0x0104
            android.graphics.Rect r4 = r0.f305823d
            float r11 = r4.exactCenterX()
            float r4 = r4.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x00fd
            r12 = 1
            goto L_0x00fe
        L_0x00fd:
            r12 = 0
        L_0x00fe:
            r10.setVisible(r12, r3)
            r10.setHotspot(r11, r4)
        L_0x0104:
            android.graphics.drawable.Drawable r4 = r16.getSelector()
            if (r4 == 0) goto L_0x010f
            if (r8 == r9) goto L_0x010f
            r4.setHotspot(r7, r6)
        L_0x010f:
            r0.setSelectorEnabled(r3)
            r16.refreshDrawableState()
            r4 = 1
            if (r2 != r4) goto L_0x011f
            long r6 = r0.getItemIdAtPosition(r8)
            r0.performItemClick(r5, r8, r6)
        L_0x011f:
            r4 = 0
            r5 = 1
        L_0x0121:
            if (r5 == 0) goto L_0x0125
            if (r4 == 0) goto L_0x013d
        L_0x0125:
            r0.f305833q = r3
            r0.setPressed(r3)
            r16.drawableStateChanged()
            int r2 = r0.f305828i
            int r4 = r16.getFirstVisiblePosition()
            int r2 = r2 - r4
            android.view.View r2 = r0.getChildAt(r2)
            if (r2 == 0) goto L_0x013d
            r2.setPressed(r3)
        L_0x013d:
            if (r5 == 0) goto L_0x0155
            androidx.core.widget.e r2 = r0.f305834r
            if (r2 != 0) goto L_0x014a
            androidx.core.widget.e r2 = new androidx.core.widget.e
            r2.<init>(r0)
            r0.f305834r = r2
        L_0x014a:
            androidx.core.widget.e r2 = r0.f305834r
            boolean r3 = r2.f306408v
            r3 = 1
            r2.f306408v = r3
            r2.onTouch(r0, r1)
            goto L_0x0162
        L_0x0155:
            androidx.core.widget.e r1 = r0.f305834r
            if (r1 == 0) goto L_0x0162
            boolean r2 = r1.f306408v
            if (r2 == 0) goto L_0x0160
            r1.mo145027d()
        L_0x0160:
            r1.f306408v = r3
        L_0x0162:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103557q.mo144416c(android.view.MotionEvent, int):boolean");
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f305823d.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f305823d);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f305835s == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.f305833q && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public boolean hasFocus() {
        return this.f305832p || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f305832p || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f305832p || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f305832p && this.f305831o) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f305835s = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f305835s == null) {
            C103559b bVar = new C103559b();
            this.f305835s = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                Drawable selector = getSelector();
                if (selector != null && this.f305833q && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f305828i = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C103559b bVar = this.f305835s;
        if (bVar != null) {
            C103557q qVar = C103557q.this;
            qVar.f305835s = null;
            qVar.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f305831o = z;
    }

    public void setSelector(Drawable drawable) {
        C103558a aVar = drawable != null ? new C103558a(drawable) : null;
        this.f305830n = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f305824e = rect.left;
        this.f305825f = rect.top;
        this.f305826g = rect.right;
        this.f305827h = rect.bottom;
    }
}
