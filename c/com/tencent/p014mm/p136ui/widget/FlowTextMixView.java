package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import rx3.C13598b0;
import sx3.C64197v;
import t40.C77853a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/FlowTextMixView;", "Landroid/widget/FrameLayout;", "", "size", "Lrx3/b0;", "setItemSpacing", "maxPixels", "setMaxWidth", "Lkotlin/Function0;", "h", "Lfy3/a;", "getMeasuredListener", "()Lfy3/a;", "setMeasuredListener", "(Lfy3/a;)V", "measuredListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.FlowTextMixView */
public class FlowTextMixView extends FrameLayout {

    /* renamed from: i */
    public static final C106762a f319165i = new C106762a((C8480h) null);

    /* renamed from: d */
    public int f319166d;

    /* renamed from: e */
    public int f319167e;

    /* renamed from: f */
    public int f319168f;

    /* renamed from: g */
    public final ArrayList<C106763b> f319169g = new ArrayList<>();

    /* renamed from: h */
    public C32224a<C13598b0> f319170h;

    /* renamed from: com.tencent.mm.ui.widget.FlowTextMixView$a */
    public static final class C106762a {
        public C106762a(C8480h hVar) {
        }

        /* renamed from: a */
        public static final int m144170a(C106762a aVar, View view) {
            int i;
            int i2;
            int i3;
            aVar.getClass();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int marginStart = ((FrameLayout.LayoutParams) layoutParams).getMarginStart();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int marginEnd = ((FrameLayout.LayoutParams) layoutParams2).getMarginEnd();
            int i4 = 0;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                if (textView.getLayout() != null) {
                    i4 = C60641c.m70921b(textView.getLayout().getPrimaryHorizontal(textView.getLayout().getOffsetForHorizontal(textView.getLineCount() - 1, Float.MAX_VALUE)));
                }
                i3 = i4 + textView.getPaddingStart();
                i2 = textView.getPaddingEnd();
            } else if (view instanceof NeatTextView) {
                NeatTextView neatTextView = (NeatTextView) view;
                if (neatTextView.getLayout() != null) {
                    i4 = C60641c.m70921b(neatTextView.getLayout().mo109120S(neatTextView.getLayout().mo109131o0(neatTextView.getLayout().mo109128l0() - 1, Float.MAX_VALUE)));
                }
                i3 = i4 + neatTextView.getPaddingStart();
                i2 = neatTextView.getPaddingEnd();
            } else {
                i = view.getMeasuredWidth();
                return marginStart + marginEnd + i;
            }
            i = i3 + i2;
            return marginStart + marginEnd + i;
        }

        /* renamed from: b */
        public static final int m144171b(C106762a aVar, NeatTextView neatTextView) {
            aVar.getClass();
            if (neatTextView.getLayout() == null) {
                return 0;
            }
            return neatTextView.getLayout().mo109121a(neatTextView.getLayout().mo109128l0() - 1);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.FlowTextMixView$b */
    public static final class C106763b {

        /* renamed from: a */
        public final int f319171a;

        /* renamed from: b */
        public final int f319172b;

        /* renamed from: c */
        public final int f319173c;

        /* renamed from: d */
        public final ArrayList<View> f319174d = new ArrayList<>();

        /* renamed from: e */
        public int f319175e;

        /* renamed from: f */
        public int f319176f;

        /* renamed from: g */
        public int f319177g;

        /* renamed from: h */
        public int f319178h;

        /* renamed from: i */
        public int f319179i;

        public C106763b(int i, int i2, int i3) {
            this.f319171a = i;
            this.f319172b = i2;
            this.f319173c = i3;
        }

        /* renamed from: a */
        public final void mo153887a(View view) {
            C87412m.m108594g(view, "child");
            this.f319174d.add(view);
            int i = this.f319175e;
            int i2 = this.f319172b;
            this.f319175e = i + i2;
            int i3 = this.f319178h + i2;
            this.f319178h = i3;
            C106762a aVar = FlowTextMixView.f319165i;
            this.f319178h = i3 + C106762a.m144170a(aVar, view);
            int i4 = this.f319175e;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int marginStart = ((FrameLayout.LayoutParams) layoutParams).getMarginStart();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            this.f319175e = i4 + marginStart + ((FrameLayout.LayoutParams) layoutParams2).getMarginEnd() + view.getMeasuredWidth();
            if (this.f319177g < view.getMeasuredHeight()) {
                this.f319177g = view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int i5 = ((FrameLayout.LayoutParams) layoutParams3).topMargin;
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            C87412m.m108592e(layoutParams4, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            int measuredHeight = i5 + ((FrameLayout.LayoutParams) layoutParams4).bottomMargin + view.getMeasuredHeight() + this.f319173c;
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                this.f319179i = textView.getLayout() == null ? 0 : textView.getLayout().getLineTop(textView.getLineCount() - 1);
            } else if (view instanceof NeatTextView) {
                this.f319179i = C106762a.m144171b(aVar, (NeatTextView) view);
            } else {
                measuredHeight += this.f319179i;
            }
            if (this.f319176f < measuredHeight) {
                this.f319176f = measuredHeight;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C106763b)) {
                return false;
            }
            C106763b bVar = (C106763b) obj;
            return this.f319171a == bVar.f319171a && this.f319172b == bVar.f319172b && this.f319173c == bVar.f319173c;
        }

        public int hashCode() {
            return (((this.f319171a * 31) + this.f319172b) * 31) + this.f319173c;
        }

        public String toString() {
            return "MeasureLine(index=" + this.f319171a + ", horizontalSpacing=" + this.f319172b + ", verticalSpacing=" + this.f319173c + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowTextMixView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo153880c(context, attributeSet);
    }

    /* renamed from: a */
    public final C106763b mo153878a(int i) {
        if (this.f319169g.size() <= i) {
            C106763b bVar = new C106763b(i, this.f319166d, this.f319167e);
            this.f319169g.add(bVar);
            return bVar;
        }
        C106763b bVar2 = this.f319169g.get(i);
        C87412m.m108593f(bVar2, "{\n            lines[index]\n        }");
        return bVar2;
    }

    /* renamed from: b */
    public final int mo153879b() {
        int i = 0;
        for (C106763b bVar : this.f319169g) {
            int i2 = 0;
            for (View view : bVar.f319174d) {
                if (view instanceof TextView) {
                    TextView textView = (TextView) view;
                    if (textView.getLineCount() > 1 && i2 < textView.getLineCount()) {
                        i2 = textView.getLineCount();
                    }
                }
                if (view instanceof NeatTextView) {
                    NeatTextView neatTextView = (NeatTextView) view;
                    if (neatTextView.getLineCount() > 1 && i2 < neatTextView.getLineCount()) {
                        i2 = neatTextView.getLineCount();
                    }
                }
            }
            if (i2 > 1) {
                i += i2 - 1;
            }
            i++;
        }
        return i;
    }

    /* renamed from: c */
    public final void mo153880c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226862h);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.FlowTextMixView)");
        try {
            this.f319166d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f319167e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f319168f = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final C32224a<C13598b0> getMeasuredListener() {
        return this.f319170h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int b;
        int d;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        Iterator<C106763b> it = this.f319169g.iterator();
        while (it.hasNext()) {
            C106763b next = it.next();
            Iterator<View> it4 = next.f319174d.iterator();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (it4.hasNext()) {
                View next2 = it4.next();
                int i8 = i5 + 1;
                if (i5 >= 0) {
                    View view = next2;
                    if (i5 > 0) {
                        paddingStart += this.f319166d;
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    int marginStart = ((FrameLayout.LayoutParams) layoutParams).getMarginStart();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    int i9 = marginStart + paddingStart;
                    int measuredHeight = (i6 <= 0 ? ((next.f319177g - view.getMeasuredHeight()) / 2) + paddingTop : paddingTop + i6 + ((i7 - view.getMeasuredHeight()) / 2)) + ((FrameLayout.LayoutParams) layoutParams2).topMargin;
                    view.layout(i9, measuredHeight, view.getMeasuredWidth() + i9, view.getMeasuredHeight() + measuredHeight);
                    C106762a aVar = f319165i;
                    paddingStart += C106762a.m144170a(aVar, view);
                    if (view instanceof TextView) {
                        TextView textView = (TextView) view;
                        b = textView.getLayout() == null ? 0 : textView.getLayout().getLineTop(textView.getLineCount() - 1);
                        if (textView.getLayout() != null) {
                            Rect rect = new Rect();
                            textView.getLayout().getLineBounds(textView.getLineCount() - 1, rect);
                            d = rect.height();
                            i7 = d;
                            i6 = b;
                            i5 = i8;
                        }
                    } else if (view instanceof NeatTextView) {
                        NeatTextView neatTextView = (NeatTextView) view;
                        b = C106762a.m144171b(aVar, neatTextView);
                        if (neatTextView.getLayout() != null) {
                            int l0 = neatTextView.getLayout().mo109128l0() - 1;
                            d = neatTextView.getLayout().mo109124d(l0) - neatTextView.getLayout().mo109121a(l0);
                            i7 = d;
                            i6 = b;
                            i5 = i8;
                        }
                    } else {
                        i5 = i8;
                    }
                    i6 = b;
                    i7 = 0;
                    i5 = i8;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            paddingStart = getPaddingStart();
            paddingTop += next.f319176f;
        }
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f319168f;
        if (i3 > 0) {
            int size = View.MeasureSpec.getSize(i);
            if (i3 > size) {
                i3 = size;
            }
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
        this.f319169g.clear();
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C106763b a = mo153878a(i5);
                int a2 = C106762a.m144170a(f319165i, childAt);
                if (a2 > i3) {
                    if (a.f319175e > 0) {
                        i5++;
                        a = mo153878a(i5);
                    }
                    a.mo153887a(childAt);
                } else if (a.f319178h + a2 <= i3) {
                    a.mo153887a(childAt);
                } else {
                    i5++;
                    mo153878a(i5).mo153887a(childAt);
                }
            }
        }
        int i7 = 0;
        for (C106763b bVar : this.f319169g) {
            i7 += bVar.f319176f;
            int i8 = bVar.f319175e;
            if (i4 < i8) {
                i4 = i8;
            }
        }
        setMeasuredDimension(Math.min(i3, i4) + getPaddingStart() + getPaddingEnd(), i7 + getPaddingTop() + getPaddingBottom());
        C32224a<C13598b0> aVar = this.f319170h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setItemSpacing(int i) {
        this.f319166d = i;
        requestLayout();
        invalidate();
    }

    public void setMaxWidth(int i) {
        this.f319168f = i;
        requestLayout();
        invalidate();
    }

    public final void setMeasuredListener(C32224a<C13598b0> aVar) {
        this.f319170h = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowTextMixView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo153880c(context, attributeSet);
    }
}
