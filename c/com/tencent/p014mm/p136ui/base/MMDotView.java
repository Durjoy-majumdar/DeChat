package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import t40.C77853a;

/* renamed from: com.tencent.mm.ui.base.MMDotView */
public class MMDotView extends LinearLayout {

    /* renamed from: d */
    public int f121233d = 9;

    /* renamed from: e */
    public int f121234e = C0966R.C0969drawable.alf;

    /* renamed from: f */
    public int f121235f = C0966R.C0969drawable.ald;

    public MMDotView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226866l);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        setDotCount(resourceId);
    }

    public void setDarkStyle(boolean z) {
        if (z) {
            this.f121234e = C0966R.C0969drawable.alg;
            this.f121235f = C0966R.C0969drawable.ale;
            return;
        }
        this.f121234e = C0966R.C0969drawable.alf;
        this.f121235f = C0966R.C0969drawable.ald;
    }

    public void setDotCount(int i) {
        Log.m105927v("MicroMsg.MMDotView", "setDotCount:%d", Integer.valueOf(i));
        if (i >= 0) {
            if (i > this.f121233d) {
                Log.m105924i("MicroMsg.MMDotView", "large than max count");
                i = this.f121233d;
            }
            removeAllViews();
            while (i != 0) {
                ImageView imageView = (ImageView) View.inflate(getContext(), C0966R.C0971layout.bfw, (ViewGroup) null);
                imageView.setImageResource(this.f121234e);
                addView(imageView);
                i--;
            }
            ImageView imageView2 = (ImageView) getChildAt(0);
            if (imageView2 != null) {
                imageView2.setImageResource(this.f121235f);
            }
        }
    }

    public void setInvertedStyle(boolean z) {
        if (z) {
            this.f121234e = C0966R.C0969drawable.ald;
            this.f121235f = C0966R.C0969drawable.alf;
            return;
        }
        this.f121234e = C0966R.C0969drawable.alf;
        this.f121235f = C0966R.C0969drawable.ald;
    }

    public void setMaxCount(int i) {
        Log.m105919d("MicroMsg.MMDotView", "setMaxCount:%d", Integer.valueOf(i));
        this.f121233d = i;
    }

    public void setSelectedDot(int i) {
        Log.m105927v("MicroMsg.MMDotView", "setSelectedDot:target index is %d", Integer.valueOf(i));
        if (i >= getChildCount()) {
            i = getChildCount() - 1;
        } else if (i < 0) {
            i = 0;
        }
        Log.m105927v("MicroMsg.MMDotView", "setSelectedDot:after adjust index is %d", Integer.valueOf(i));
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((ImageView) getChildAt(i2)).setImageResource(this.f121234e);
        }
        ImageView imageView = (ImageView) getChildAt(i);
        if (imageView != null) {
            imageView.setImageResource(this.f121235f);
        }
    }

    public MMDotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226866l);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        setDotCount(resourceId);
    }
}
