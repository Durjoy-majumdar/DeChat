package com.tencent.p014mm.p136ui.chatting.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0007R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/view/FoldableCellLayout;", "Landroid/widget/FrameLayout;", "", "getPaddingLeftWithForeground", "getPaddingRightWithForeground", "getPaddingTopWithForeground", "getPaddingBottomWithForeground", "num", "Lrx3/b0;", "setBackgroundFillCardNum", "layoutId", "setBackgroundCardLayout", "height", "setHeightForAnim", "Landroid/view/View$OnClickListener;", "w", "Landroid/view/View$OnClickListener;", "getOnBackgroundCardClickListener", "()Landroid/view/View$OnClickListener;", "setOnBackgroundCardClickListener", "(Landroid/view/View$OnClickListener;)V", "OnBackgroundCardClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ViewWrapperForAnim", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.chatting.view.FoldableCellLayout */
public final class FoldableCellLayout extends FrameLayout {

    /* renamed from: d */
    public final String f318980d = "MicroMsg.CardCellLayout";

    /* renamed from: e */
    public final long f318981e = 150;

    /* renamed from: f */
    public final long f318982f = 200;

    /* renamed from: g */
    public final int f318983g = 2;

    /* renamed from: h */
    public boolean f318984h;

    /* renamed from: i */
    public boolean f318985i;

    /* renamed from: j */
    public int f318986j;

    /* renamed from: n */
    public float f318987n;

    /* renamed from: o */
    public int f318988o;

    /* renamed from: p */
    public int f318989p;

    /* renamed from: q */
    public int f318990q;

    /* renamed from: r */
    public final List<View> f318991r = new ArrayList();

    /* renamed from: s */
    public final List<View> f318992s = new ArrayList();

    /* renamed from: t */
    public final List<View> f318993t = new ArrayList();

    /* renamed from: u */
    public final ArrayList<View> f318994u = new ArrayList<>(1);

    /* renamed from: v */
    public int f318995v;

    /* renamed from: w */
    public View.OnClickListener f318996w;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\t"}, mo182094d2 = {"Lcom/tencent/mm/ui/chatting/view/FoldableCellLayout$ViewWrapperForAnim;", "", "", "width", "Lrx3/b0;", "setWidthForAnim", "", "scaleX", "setScaleX", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.chatting.view.FoldableCellLayout$ViewWrapperForAnim */
    public static final class ViewWrapperForAnim {

        /* renamed from: a */
        public final View f285171a;

        public ViewWrapperForAnim(View view) {
            C87412m.m108594g(view, "targetView");
            this.f285171a = view;
        }

        public final void setScaleX(float f) {
            this.f285171a.setScaleX(f);
        }

        public final void setWidthForAnim(int i) {
            View view = this.f285171a;
            view.getLayoutParams().width = i;
            view.requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FoldableCellLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        setForegroundGravity(1);
        this.f318986j = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3956le);
        this.f318987n = (float) C76577a.m92155f(getContext(), C0966R.dimen.f4285yp);
        this.f318988o = getContext().getResources().getColor(C0966R.color.f3240ke);
        this.f318989p = getContext().getResources().getColor(C0966R.color.f3239kd);
        this.f318990q = getContext().getResources().getColor(17170445);
    }

    private final int getPaddingBottomWithForeground() {
        int paddingBottom = getPaddingBottom();
        if (paddingBottom < 0) {
            return 0;
        }
        return paddingBottom;
    }

    private final int getPaddingLeftWithForeground() {
        int paddingLeft = getPaddingLeft();
        if (paddingLeft < 0) {
            return 0;
        }
        return paddingLeft;
    }

    private final int getPaddingRightWithForeground() {
        int paddingRight = getPaddingRight();
        if (paddingRight < 0) {
            return 0;
        }
        return paddingRight;
    }

    private final int getPaddingTopWithForeground() {
        int paddingTop = getPaddingTop();
        if (paddingTop < 0) {
            return 0;
        }
        return paddingTop;
    }

    /* renamed from: a */
    public final void mo153656a(View view, FrameLayout.LayoutParams layoutParams) {
        C87412m.m108594g(view, "contentView");
        C87412m.m108594g(layoutParams, "params");
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(View.inflate(frameLayout.getContext(), this.f318995v, (ViewGroup) null), new FrameLayout.LayoutParams(-1, (this.f318986j * 2) + ((int) this.f318987n)));
        layoutParams.topMargin = (int) this.f318987n;
        frameLayout.addView(view, layoutParams);
        frameLayout.setTag(view.getTag());
        frameLayout.setId(C0966R.C0970id.b8t);
        addView(frameLayout, new FrameLayout.LayoutParams(-2, -2));
    }

    /* renamed from: b */
    public final boolean mo153657b(View view, int i) {
        View findViewById = view.findViewById(C0966R.C0970id.b6p);
        if (findViewById == null) {
            return false;
        }
        if (i == this.f318990q) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "changeCardShadow", "(Landroid/view/View;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Drawable background = findViewById.getBackground();
        if (background != null) {
            background.setTintMode(PorterDuff.Mode.MULTIPLY);
            background.setTint(i);
        }
        ((ArrayList) this.f318992s).add(findViewById);
        return true;
    }

    /* renamed from: c */
    public final void mo153658c(View view, int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int paddingLeftWithForeground = getPaddingLeftWithForeground();
        int paddingRightWithForeground = (i3 - i) - getPaddingRightWithForeground();
        int paddingTopWithForeground = getPaddingTopWithForeground();
        getPaddingBottomWithForeground();
        if (view.getVisibility() != 8) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int absoluteGravity = Gravity.getAbsoluteGravity(1, getLayoutDirection()) & 7;
            if (absoluteGravity != 1) {
                if (absoluteGravity == 3) {
                    i7 = layoutParams2.leftMargin;
                } else if (absoluteGravity != 5) {
                    i7 = layoutParams2.leftMargin;
                } else if (!z) {
                    i6 = (paddingRightWithForeground - measuredWidth) - layoutParams2.rightMargin;
                } else {
                    i7 = layoutParams2.leftMargin;
                }
                i6 = paddingLeftWithForeground + i7;
            } else {
                i6 = ((paddingLeftWithForeground + (((paddingRightWithForeground - paddingLeftWithForeground) - measuredWidth) / 2)) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
            }
            int i8 = paddingTopWithForeground + layoutParams2.topMargin + i5;
            view.layout(i6, i8, measuredWidth + i6, measuredHeight + i8);
        }
    }

    /* renamed from: d */
    public final void mo153659d(View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i7 = 0;
        if (marginLayoutParams.width == -1) {
            int measuredWidth = (((((getMeasuredWidth() - getPaddingLeftWithForeground()) - getPaddingRightWithForeground()) - marginLayoutParams.leftMargin) - i3) - marginLayoutParams.rightMargin) - i3;
            if (measuredWidth <= 0) {
                measuredWidth = 0;
            }
            i5 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        } else {
            i5 = ViewGroup.getChildMeasureSpec(i, getPaddingLeftWithForeground() + getPaddingRightWithForeground() + marginLayoutParams.leftMargin + i3 + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        }
        if (marginLayoutParams.height == -1) {
            int measuredHeight = ((((getMeasuredHeight() - getPaddingTopWithForeground()) - getPaddingBottomWithForeground()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin) - i4;
            if (measuredHeight > 0) {
                i7 = measuredHeight;
            }
            i6 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            i6 = ViewGroup.getChildMeasureSpec(i2, getPaddingTopWithForeground() + getPaddingBottomWithForeground() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        }
        view.measure(i5, i6);
    }

    /* renamed from: e */
    public final boolean mo153660e(View view, boolean z) {
        View findViewById = view.findViewById(C0966R.C0970id.b6q);
        if (findViewById == null) {
            return false;
        }
        int i = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setElevation", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setElevation", "(Landroid/view/View;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public final View.OnClickListener getOnBackgroundCardClickListener() {
        return this.f318996w;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f318993t.clear();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f318993t.clear();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 2) {
            View childAt = getChildAt(0);
            C87412m.m108593f(childAt, "this");
            int i5 = i;
            int i6 = i2;
            int i7 = i3;
            int i8 = i4;
            mo153658c(childAt, i5, i6, i7, i8, 0, false);
            View childAt2 = getChildAt(1);
            C87412m.m108593f(childAt2, "this");
            mo153658c(childAt2, i5, i6, i7, i8, this.f318986j, false);
            int childCount = getChildCount();
            for (int i9 = 2; i9 < childCount; i9++) {
                View childAt3 = getChildAt(i9);
                C87412m.m108593f(childAt3, "this");
                mo153658c(childAt3, i, i2, i3, i4, this.f318986j * 2, false);
            }
        } else if (getChildCount() > 1) {
            View childAt4 = getChildAt(0);
            C87412m.m108593f(childAt4, "this");
            int i15 = i;
            int i16 = i2;
            int i17 = i3;
            int i18 = i4;
            mo153658c(childAt4, i15, i16, i17, i18, 0, false);
            View childAt5 = getChildAt(1);
            C87412m.m108593f(childAt5, "this");
            mo153658c(childAt5, i15, i16, i17, i18, this.f318986j, false);
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f318984h || this.f318985i) {
            int i3 = i;
            int i4 = i2;
            super.onMeasure(i, i2);
            return;
        }
        int childCount = getChildCount();
        if (childCount > 2) {
            View childAt = getChildAt(0);
            C87412m.m108593f(childAt, "this");
            mo153657b(childAt, this.f318989p);
            mo153660e(childAt, false);
            View childAt2 = getChildAt(1);
            C87412m.m108593f(childAt2, "this");
            mo153657b(childAt2, this.f318988o);
            mo153660e(childAt2, true);
            View childAt3 = getChildAt(childCount - 1);
            C87412m.m108593f(childAt3, "this");
            mo153657b(childAt3, this.f318990q);
            mo153660e(childAt3, true);
        } else if (childCount > 1) {
            View childAt4 = getChildAt(0);
            C87412m.m108593f(childAt4, "this");
            mo153657b(childAt4, this.f318988o);
            mo153660e(childAt4, false);
            View childAt5 = getChildAt(1);
            C87412m.m108593f(childAt5, "this");
            mo153657b(childAt5, this.f318990q);
            mo153660e(childAt5, true);
        }
        boolean z = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        this.f318994u.clear();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < childCount) {
            View childAt6 = getChildAt(i6);
            if (childAt6.getVisibility() != 8) {
                View view = childAt6;
                int i9 = i5;
                measureChildWithMargins(childAt6, i, 0, i2, 0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                int measuredWidth = view.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin;
                if (i7 < measuredWidth) {
                    i7 = measuredWidth;
                }
                int measuredHeight = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin + (this.f318986j * (2 > i6 ? i6 : 2));
                if (i8 < measuredHeight) {
                    i8 = measuredHeight;
                }
                i5 = View.combineMeasuredStates(i9, view.getMeasuredState());
                if (z && (layoutParams2.width == -1 || layoutParams2.height == -1)) {
                    this.f318994u.add(view);
                }
            } else {
                int i15 = i5;
            }
            i6++;
        }
        int i16 = i5;
        int paddingLeftWithForeground = i7 + getPaddingLeftWithForeground() + getPaddingRightWithForeground();
        int max = Math.max(i8 + getPaddingTopWithForeground() + getPaddingBottomWithForeground(), getSuggestedMinimumHeight());
        int max2 = Math.max(paddingLeftWithForeground, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            int minimumHeight = foreground.getMinimumHeight();
            if (max < minimumHeight) {
                max = minimumHeight;
            }
            int minimumWidth = foreground.getMinimumWidth();
            if (max2 < minimumWidth) {
                max2 = minimumWidth;
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(max2, i, i16), View.resolveSizeAndState(max, i2, i16 << 16));
        if (childCount > 2) {
            View childAt7 = getChildAt(0);
            C87412m.m108593f(childAt7, "this");
            int i17 = i;
            int i18 = i2;
            mo153659d(childAt7, i17, i18, this.f318986j * 2, (int) this.f318987n);
            View childAt8 = getChildAt(1);
            C87412m.m108593f(childAt8, "this");
            mo153659d(childAt8, i17, i18, this.f318986j, (int) this.f318987n);
            for (int i19 = 2; i19 < childCount; i19++) {
                View childAt9 = getChildAt(i19);
                C87412m.m108593f(childAt9, "this");
                mo153659d(childAt9, i, i2, 0, 0);
                if (i19 != childCount - 1) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view2 = childAt9;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt9.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        } else if (childCount > 1) {
            View childAt10 = getChildAt(0);
            C87412m.m108593f(childAt10, "this");
            int i25 = i;
            int i26 = i2;
            mo153659d(childAt10, i25, i26, this.f318986j, (int) this.f318987n);
            View childAt11 = getChildAt(1);
            C87412m.m108593f(childAt11, "this");
            mo153659d(childAt11, i25, i26, 0, 0);
        }
    }

    public final void setBackgroundCardLayout(int i) {
        this.f318995v = i;
        if (this.f318993t.isEmpty()) {
            View inflate = View.inflate(getContext(), this.f318995v, (ViewGroup) null);
            inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, this.f318986j * 2));
            inflate.setOnClickListener(this.f318996w);
            this.f318993t.add(inflate);
        }
    }

    public final void setBackgroundFillCardNum(int i) {
        int i2 = this.f318983g;
        int i3 = i;
        if (i2 > i3) {
            i2 = i3;
        }
        if (this.f318985i || this.f318984h) {
            removeAllViews();
            getLayoutParams().height = -2;
            ((ArrayList) this.f318993t).clear();
        }
        int i4 = i2 + 1;
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = childCount - 1; i5 < i6; i6 = i6) {
            View childAt = getChildAt(i5);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = childAt;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setBackgroundFillCardNum", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/chatting/view/FoldableCellLayout", "setBackgroundFillCardNum", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i5++;
        }
        if (childCount < i4) {
            int i7 = findViewById(C0966R.C0970id.b8t) == null ? i2 - childCount : i4 - childCount;
            for (int i8 = 0; i8 < i7; i8++) {
                if (!this.f318993t.isEmpty()) {
                    View view2 = (View) ((ArrayList) this.f318993t).remove(0);
                    view2.setLayoutParams(new FrameLayout.LayoutParams(-1, (this.f318986j * 2) + ((int) this.f318987n)));
                    view2.setOnClickListener(this.f318996w);
                    addView(view2, 0);
                } else {
                    View inflate = View.inflate(getContext(), this.f318995v, (ViewGroup) null);
                    inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, (this.f318986j * 2) + ((int) this.f318987n)));
                    inflate.setOnClickListener(this.f318996w);
                    addView(inflate, 0);
                }
            }
        } else if (childCount > i4) {
            if (findViewById(C0966R.C0970id.b8t) != null) {
                i2 = i4;
            }
            while (i2 < childCount) {
                if (((ArrayList) this.f318993t).size() < this.f318983g) {
                    List<View> list = this.f318993t;
                    View childAt2 = getChildAt(0);
                    C87412m.m108593f(childAt2, "getChildAt(0)");
                    ((ArrayList) list).add(childAt2);
                }
                removeViewAt(0);
                i2++;
            }
        }
        this.f318985i = false;
        this.f318984h = false;
    }

    public final void setHeightForAnim(int i) {
        getLayoutParams().height = i;
        requestLayout();
    }

    public final void setOnBackgroundCardClickListener(View.OnClickListener onClickListener) {
        this.f318996w = onClickListener;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FoldableCellLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        setForegroundGravity(1);
        this.f318986j = getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3956le);
        this.f318987n = (float) C76577a.m92155f(getContext(), C0966R.dimen.f4285yp);
        this.f318988o = getContext().getResources().getColor(C0966R.color.f3240ke);
        this.f318989p = getContext().getResources().getColor(C0966R.color.f3239kd);
        this.f318990q = getContext().getResources().getColor(17170445);
    }
}
