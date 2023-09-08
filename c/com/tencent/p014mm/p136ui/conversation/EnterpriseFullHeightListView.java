package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

/* renamed from: com.tencent.mm.ui.conversation.EnterpriseFullHeightListView */
public class EnterpriseFullHeightListView extends ListView {

    /* renamed from: d */
    public boolean f121807d = true;

    /* renamed from: e */
    public View f121808e;

    /* renamed from: f */
    public int f121809f = 0;

    public EnterpriseFullHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo70204b(int i, int i2) {
        if (!this.f121807d) {
            int count = getAdapter().getCount();
            if (this.f121808e != null) {
                count--;
            }
            int i3 = 0;
            for (int headerViewsCount = getHeaderViewsCount(); headerViewsCount < count; headerViewsCount++) {
                if (this.f121809f <= 0) {
                    try {
                        View view = getAdapter().getView(headerViewsCount, (View) null, this);
                        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        this.f121809f = view.getMeasuredHeight();
                    } catch (Exception unused) {
                        continue;
                    }
                }
                i3 += this.f121809f;
                if (i3 > i2) {
                    View view2 = this.f121808e;
                    if (view2 != null) {
                        removeFooterView(view2);
                        this.f121808e = null;
                        return;
                    }
                    return;
                }
            }
            if (i3 < i2) {
                if (this.f121808e == null) {
                    this.f121808e = new View(getContext());
                }
                removeFooterView(this.f121808e);
                this.f121808e.setLayoutParams(new AbsListView.LayoutParams(-1, i2 - i3));
                addFooterView(this.f121808e, (Object) null, false);
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!this.f121807d) {
            try {
                mo70204b(i, i2);
            } catch (Exception unused) {
            }
        }
    }

    public EnterpriseFullHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
