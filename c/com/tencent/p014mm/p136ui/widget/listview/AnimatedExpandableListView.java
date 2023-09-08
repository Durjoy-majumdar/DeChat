package com.tencent.p014mm.p136ui.widget.listview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView */
public class AnimatedExpandableListView extends ExpandableListView {

    /* renamed from: d */
    public C97285b f285547d;

    /* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView$b */
    public static abstract class C97285b extends BaseExpandableListAdapter {

        /* renamed from: c */
        public static final /* synthetic */ int f285548c = 0;

        /* renamed from: a */
        public SparseArray<C97290e> f285549a = new SparseArray<>();

        /* renamed from: b */
        public AnimatedExpandableListView f285550b;

        /* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView$b$a */
        public class C97286a implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ int f285551a;

            /* renamed from: b */
            public final /* synthetic */ C97288c f285552b;

            public C97286a(int i, C97288c cVar) {
                this.f285551a = i;
                this.f285552b = cVar;
            }

            public void onAnimationEnd(Animation animation) {
                C97285b.this.mo136341a(this.f285551a).f285567a = false;
                C97285b.this.notifyDataSetChanged();
                this.f285552b.setTag(0);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        /* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView$b$b */
        public class C97287b implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ int f285554a;

            /* renamed from: b */
            public final /* synthetic */ ExpandableListView f285555b;

            /* renamed from: c */
            public final /* synthetic */ C97290e f285556c;

            /* renamed from: d */
            public final /* synthetic */ C97288c f285557d;

            public C97287b(int i, ExpandableListView expandableListView, C97290e eVar, C97288c cVar) {
                this.f285554a = i;
                this.f285555b = expandableListView;
                this.f285556c = eVar;
                this.f285557d = cVar;
            }

            public void onAnimationEnd(Animation animation) {
                C97285b.this.mo136341a(this.f285554a).f285567a = false;
                this.f285555b.collapseGroup(this.f285554a);
                C97285b.this.notifyDataSetChanged();
                this.f285556c.f285570d = -1;
                this.f285557d.setTag(0);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        /* renamed from: a */
        public final C97290e mo136341a(int i) {
            C97290e eVar = this.f285549a.get(i);
            if (eVar != null) {
                return eVar;
            }
            C97290e eVar2 = new C97290e();
            this.f285549a.put(i, eVar2);
            return eVar2;
        }

        /* renamed from: b */
        public abstract View mo133513b(int i, int i2, boolean z, View view, ViewGroup viewGroup);

        /* renamed from: c */
        public abstract int mo133514c(int i);

        public final int getChildType(int i, int i2) {
            return mo136341a(i).f285567a ? 0 : 1;
        }

        public final int getChildTypeCount() {
            return 2;
        }

        public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
            int i3;
            int i4;
            C97290e a = mo136341a(i);
            if (a.f285567a) {
                View view2 = view;
                int i5 = 0;
                if (!(view2 instanceof C97288c)) {
                    view2 = new C97288c(viewGroup.getContext(), (C97284a) null);
                    view2.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
                }
                View view3 = view2;
                if (i2 < a.f285569c) {
                    view3.getLayoutParams().height = 0;
                    return view3;
                }
                ExpandableListView expandableListView = (ExpandableListView) viewGroup;
                C97288c cVar = (C97288c) view3;
                ((ArrayList) cVar.f285559d).clear();
                Drawable divider = expandableListView.getDivider();
                int measuredWidth = viewGroup.getMeasuredWidth();
                int dividerHeight = expandableListView.getDividerHeight();
                if (divider != null) {
                    cVar.f285560e = divider;
                    cVar.f285561f = measuredWidth;
                    cVar.f285562g = dividerHeight;
                    divider.setBounds(0, 0, measuredWidth, dividerHeight);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                int height = viewGroup.getHeight();
                int c = mo133514c(i);
                int i6 = a.f285569c;
                int i7 = 0;
                while (true) {
                    if (i6 >= c) {
                        i3 = 1;
                        i4 = i7;
                        break;
                    }
                    i3 = 1;
                    int i8 = i6;
                    int i9 = c;
                    View b = mo133513b(i, i6, i6 == c + -1, (View) null, viewGroup);
                    b.measure(makeMeasureSpec, makeMeasureSpec2);
                    int measuredHeight = i7 + b.getMeasuredHeight();
                    if (measuredHeight >= height) {
                        b.layout(0, 0, cVar.getWidth(), cVar.getHeight());
                        ((ArrayList) cVar.f285559d).add(b);
                        i4 = measuredHeight + (((i9 - i8) - 1) * (measuredHeight / (i8 + 1)));
                        break;
                    }
                    b.layout(0, 0, cVar.getWidth(), cVar.getHeight());
                    ((ArrayList) cVar.f285559d).add(b);
                    i6 = i8 + 1;
                    i7 = measuredHeight;
                    c = i9;
                }
                Object tag = cVar.getTag();
                if (tag != null) {
                    i5 = ((Integer) tag).intValue();
                }
                boolean z2 = a.f285568b;
                if (!z2 || i5 == i3) {
                    int i15 = i;
                    if (!z2 && i5 != 2) {
                        if (a.f285570d == -1) {
                            a.f285570d = i4;
                        }
                        C97290e eVar = a;
                        C97289d dVar = new C97289d(cVar, a.f285570d, 0, eVar, (C97284a) null);
                        dVar.setDuration((long) this.f285550b.getAnimationDuration());
                        dVar.setAnimationListener(new C97287b(i, expandableListView, eVar, cVar));
                        cVar.startAnimation(dVar);
                        cVar.setTag(2);
                    }
                } else {
                    C97289d dVar2 = new C97289d(cVar, 0, i4, a, (C97284a) null);
                    dVar2.setDuration((long) this.f285550b.getAnimationDuration());
                    dVar2.setAnimationListener(new C97286a(i, cVar));
                    cVar.startAnimation(dVar2);
                    cVar.setTag(Integer.valueOf(i3));
                }
                return view3;
            }
            int i16 = i;
            int i17 = i2;
            View view4 = view;
            return mo133513b(i, i2, z, view, viewGroup);
        }

        public final int getChildrenCount(int i) {
            C97290e a = mo136341a(i);
            return a.f285567a ? a.f285569c + 1 : mo133514c(i);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView$c */
    public static class C97288c extends View {

        /* renamed from: d */
        public List<View> f285559d = new ArrayList();

        /* renamed from: e */
        public Drawable f285560e;

        /* renamed from: f */
        public int f285561f;

        /* renamed from: g */
        public int f285562g;

        public C97288c(Context context, C97284a aVar) {
            super(context);
        }

        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            Drawable drawable = this.f285560e;
            if (drawable != null) {
                drawable.setBounds(0, 0, this.f285561f, this.f285562g);
            }
            int size = ((ArrayList) this.f285559d).size();
            for (int i = 0; i < size; i++) {
                View view = (View) ((ArrayList) this.f285559d).get(i);
                view.draw(canvas);
                canvas.translate(0.0f, (float) view.getMeasuredHeight());
                Drawable drawable2 = this.f285560e;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                    canvas.translate(0.0f, (float) this.f285562g);
                }
            }
            canvas.restore();
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int size = ((ArrayList) this.f285559d).size();
            for (int i5 = 0; i5 < size; i5++) {
                ((View) ((ArrayList) this.f285559d).get(i5)).layout(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView$d */
    public static class C97289d extends Animation {

        /* renamed from: d */
        public int f285563d;

        /* renamed from: e */
        public int f285564e;

        /* renamed from: f */
        public View f285565f;

        /* renamed from: g */
        public C97290e f285566g;

        public C97289d(View view, int i, int i2, C97290e eVar, C97284a aVar) {
            this.f285563d = i;
            this.f285564e = i2 - i;
            this.f285565f = view;
            this.f285566g = eVar;
            view.getLayoutParams().height = i;
            this.f285565f.requestLayout();
        }

        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            if (f < 1.0f) {
                int i = this.f285563d + ((int) (((float) this.f285564e) * f));
                this.f285565f.getLayoutParams().height = i;
                this.f285566g.f285570d = i;
                this.f285565f.requestLayout();
                return;
            }
            int i2 = this.f285563d + this.f285564e;
            this.f285565f.getLayoutParams().height = i2;
            this.f285566g.f285570d = i2;
            this.f285565f.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.listview.AnimatedExpandableListView$e */
    public static class C97290e {

        /* renamed from: a */
        public boolean f285567a = false;

        /* renamed from: b */
        public boolean f285568b = false;

        /* renamed from: c */
        public int f285569c;

        /* renamed from: d */
        public int f285570d = -1;
    }

    static {
        Class<C97285b> cls = C97285b.class;
    }

    public AnimatedExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public int getAnimationDuration() {
        return 150;
    }

    /* renamed from: c */
    public boolean mo136338c(int i) {
        int flatListPosition = getFlatListPosition(ExpandableListView.getPackedPositionForGroup(i));
        if (flatListPosition != -1) {
            int firstVisiblePosition = flatListPosition - getFirstVisiblePosition();
            if (firstVisiblePosition < 0 || firstVisiblePosition >= getChildCount()) {
                return collapseGroup(i);
            }
            if (getChildAt(firstVisiblePosition).getBottom() >= getBottom()) {
                return collapseGroup(i);
            }
        }
        long expandableListPosition = getExpandableListPosition(getFirstVisiblePosition());
        int packedPositionChild = ExpandableListView.getPackedPositionChild(expandableListPosition);
        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(expandableListPosition);
        if (packedPositionChild == -1 || packedPositionGroup != i) {
            packedPositionChild = 0;
        }
        C97285b bVar = this.f285547d;
        int i2 = C97285b.f285548c;
        C97290e a = bVar.mo136341a(i);
        a.f285567a = true;
        a.f285569c = packedPositionChild;
        a.f285568b = false;
        this.f285547d.notifyDataSetChanged();
        return isGroupExpanded(i);
    }

    /* renamed from: e */
    public boolean mo136339e(int i) {
        int firstVisiblePosition;
        int flatListPosition = getFlatListPosition(ExpandableListView.getPackedPositionForGroup(i));
        if (flatListPosition == -1 || (firstVisiblePosition = flatListPosition - getFirstVisiblePosition()) >= getChildCount() || getChildAt(firstVisiblePosition).getBottom() < getBottom()) {
            C97285b bVar = this.f285547d;
            int i2 = C97285b.f285548c;
            C97290e a = bVar.mo136341a(i);
            a.f285567a = true;
            a.f285569c = 0;
            a.f285568b = true;
            return expandGroup(i);
        }
        this.f285547d.mo136341a(i).f285570d = -1;
        return expandGroup(i);
    }

    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        super.setAdapter(expandableListAdapter);
        if (expandableListAdapter instanceof C97285b) {
            C97285b bVar = (C97285b) expandableListAdapter;
            this.f285547d = bVar;
            bVar.f285550b = this;
            return;
        }
        throw new ClassCastException(expandableListAdapter.toString() + " must implement AnimatedExpandableListAdapter");
    }

    public AnimatedExpandableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
