package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.MMSingelLinePanel */
public class MMSingelLinePanel extends MMTagPanel {

    /* renamed from: J */
    public LinkedList<Integer> f165052J;

    /* renamed from: K */
    public int f165053K;

    /* renamed from: L */
    public int f165054L;

    /* renamed from: M */
    public boolean f165055M;

    /* renamed from: N */
    public TextView f165056N;

    /* renamed from: P */
    public int f165057P;

    /* renamed from: Q */
    public int f165058Q;

    static {
        Class<MMSingelLinePanel> cls = MMSingelLinePanel.class;
    }

    public MMSingelLinePanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: e */
    public void mo82020e() {
        super.mo82020e();
        TextView textView = new TextView(getContext());
        this.f165056N = textView;
        textView.setText("...");
        this.f165056N.setTextColor(getResources().getColor(C0966R.color.akw));
        this.f165056N.setLayoutParams(generateDefaultLayoutParams());
        addView(this.f165056N);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f165055M) {
            int childCount = getChildCount();
            int i5 = (i3 - i) - this.f165057P;
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                if (!(childAt.getVisibility() == 8 || childAt == this.f165056N)) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (paddingLeft + measuredWidth + getPaddingRight() > i5) {
                        paddingLeft = getPaddingLeft();
                        paddingTop += this.f165052J.get(i6).intValue() + this.f165054L;
                        i6++;
                    }
                    if (i6 < 1) {
                        int i15 = paddingTop + 0;
                        childAt.layout(paddingLeft, i15, paddingLeft + measuredWidth, measuredHeight + i15);
                        i7 = paddingLeft + measuredWidth + this.f165053K;
                        i8 = paddingTop;
                        paddingLeft = i7;
                    }
                }
            }
            TextView textView = this.f165056N;
            if (textView == null) {
                return;
            }
            if (i6 > 0) {
                textView.layout(i7, i8, this.f165057P + i7, this.f165058Q + i8);
            } else {
                textView.layout(0, 0, 0, 0);
            }
        } else {
            int childCount2 = getChildCount();
            int i16 = i3 - i;
            int paddingLeft2 = getPaddingLeft();
            int paddingTop2 = getPaddingTop();
            int i17 = 0;
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!(childAt2.getVisibility() == 8 || childAt2 == this.f165056N)) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    if (paddingLeft2 + measuredWidth2 + getPaddingRight() > i16) {
                        paddingLeft2 = getPaddingLeft();
                        paddingTop2 += this.f165052J.get(i17).intValue() + this.f165054L;
                        i17++;
                    }
                    int intValue = ((this.f165052J.get(i17).intValue() - measuredHeight2) / 2) + paddingTop2;
                    childAt2.layout(paddingLeft2, intValue, paddingLeft2 + measuredWidth2, measuredHeight2 + intValue);
                    paddingLeft2 += measuredWidth2 + this.f165053K;
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        TextView textView;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        this.f165052J.clear();
        int makeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        if (this.f165055M && (textView = this.f165056N) != null) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
            this.f165057P = this.f165056N.getMeasuredWidth();
            this.f165058Q = this.f165056N.getMeasuredHeight();
            Log.m105919d("MicroMsg.MMTagContactPanel", "mEllipsisWidth %d", Integer.valueOf(this.f165057P));
        }
        if (this.f165055M) {
            size -= this.f165057P;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i5 + measuredWidth > size) {
                    i6 += this.f165054L + i3;
                    this.f165052J.add(Integer.valueOf(i3));
                    i3 = 0;
                    i5 = 0;
                }
                i3 = Math.max(i3, childAt.getMeasuredHeight());
                i5 += measuredWidth + this.f165053K;
                i4 = measuredHeight;
            }
        }
        this.f165052J.add(Integer.valueOf(i3));
        if (this.f165055M) {
            getPaddingTop();
            getPaddingBottom();
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            getPaddingTop();
            getPaddingBottom();
        } else if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && i6 + i3 < size2) {
            getPaddingTop();
            getPaddingBottom();
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i4);
    }

    public void setSingleLine(boolean z) {
        this.f165055M = z;
        TextView textView = new TextView(getContext());
        this.f165056N = textView;
        textView.setText("...");
        this.f165056N.setLayoutParams(generateDefaultLayoutParams());
        addView(this.f165056N);
    }

    public MMSingelLinePanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f165052J = new LinkedList<>();
        this.f165053K = 0;
        this.f165054L = 0;
        this.f165055M = true;
        this.f165057P = 0;
        this.f165058Q = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226861g);
        try {
            this.f165053K = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f165054L = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
