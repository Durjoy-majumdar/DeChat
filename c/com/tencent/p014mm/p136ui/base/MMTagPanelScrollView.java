package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.base.MMTagPanelScrollView */
public class MMTagPanelScrollView extends ScrollView {

    /* renamed from: d */
    public C73210b f214969d = new C73210b((C73209a) null);

    /* renamed from: e */
    public int f214970e = 0;

    /* renamed from: f */
    public int f214971f = 2;

    /* renamed from: com.tencent.mm.ui.base.MMTagPanelScrollView$a */
    public class C73209a implements Runnable {
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanelScrollView$b */
    public static class C73210b implements Runnable {

        /* renamed from: d */
        public MMTagPanel f214972d;

        public C73210b(C73209a aVar) {
        }

        public void run() {
            MMTagPanel mMTagPanel = this.f214972d;
            if (mMTagPanel != null) {
                mMTagPanel.mo101813p();
            }
            this.f214972d = null;
        }
    }

    public MMTagPanelScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        scrollBy(0, i4);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (getChildCount() > 0 && (getChildAt(0) instanceof MMTagPanel)) {
            MMTagPanel mMTagPanel = (MMTagPanel) getChildAt(0);
            MMEditText mMEditText = mMTagPanel.f214919E;
            boolean isFocused = mMEditText == null ? false : mMEditText.isFocused();
            if (mMTagPanel.getLineCount() == this.f214971f) {
                this.f214970e = mMTagPanel.getMeasuredHeight() + getResources().getDimensionPixelOffset(C0966R.dimen.f3961lj);
            }
            if (mMTagPanel.getLineCount() >= this.f214971f) {
                int size = View.MeasureSpec.getSize(i);
                int max = Math.max(0, Math.min(mMTagPanel.f165048f.size(), this.f214971f));
                int paddingTop = mMTagPanel.getPaddingTop();
                int i4 = 0;
                while (true) {
                    i3 = max - 1;
                    if (i4 >= i3) {
                        break;
                    }
                    paddingTop += mMTagPanel.f165048f.get(i4).intValue() + mMTagPanel.f165047e;
                    i4++;
                }
                int max2 = Math.max(paddingTop + mMTagPanel.f165048f.get(i3).intValue() + mMTagPanel.getPaddingBottom(), this.f214970e);
                Log.m105919d("MicroMsg.FavTagPanelScrollView", "height %d", Integer.valueOf(max2));
                setMeasuredDimension(size, max2);
                if (isFocused) {
                    C73210b bVar = this.f214969d;
                    bVar.f214972d = mMTagPanel;
                    removeCallbacks(bVar);
                    post(this.f214969d);
                }
            }
        }
    }

    public void setMaxLine(int i) {
        if (i < 1) {
            i = 1;
        }
        this.f214971f = i;
    }

    public MMTagPanelScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
