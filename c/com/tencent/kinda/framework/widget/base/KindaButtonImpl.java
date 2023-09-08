package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.p014mm.C0966R;
import yq3.C79145c;

public class KindaButtonImpl extends FrameLayout {
    private static final String TAG = "KindaButtonImpl";
    private boolean mIsPressed;
    private ImageView mKButtonImageView;
    private KindaTextViewImpl mKButtonTextView;

    public KindaButtonImpl(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        this.mKButtonImageView = new ImageView(context);
        this.mKButtonImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mKButtonImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.mKButtonImageView.setFocusable(false);
        this.mKButtonImageView.setImportantForAccessibility(2);
        addView(this.mKButtonImageView);
        KindaTextViewImpl kindaTextViewImpl = new KindaTextViewImpl(context);
        this.mKButtonTextView = kindaTextViewImpl;
        kindaTextViewImpl.setKindaButton(this);
        this.mKButtonTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mKButtonTextView.setBackgroundResource(C0966R.color.ahf);
        this.mKButtonTextView.setGravity(17);
        this.mKButtonTextView.setFocusable(false);
        this.mKButtonTextView.setImportantForAccessibility(2);
        C79145c cVar = new C79145c();
        cVar.setViewType(TraitsType.BUTTON);
        setAccessibilityDelegate(cVar);
        addView(this.mKButtonTextView);
        super.setId(C67448R.C67449id.fga);
    }

    public KindaTextViewImpl getKButtonTextView() {
        return this.mKButtonTextView;
    }

    public CharSequence getText() {
        return this.mKButtonTextView.getText();
    }

    public int getTextColor() {
        return this.mKButtonTextView.getCurrentTextColor();
    }

    public float getTextSize() {
        return this.mKButtonTextView.getTextSize();
    }

    public boolean isKindaPressed() {
        return this.mIsPressed;
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        if (getHeight() > 0 && getWidth() > 0) {
            if (mode == Integer.MIN_VALUE) {
                i = getWidth() + 1073741824;
            }
            if (mode2 == Integer.MIN_VALUE) {
                i2 = getHeight() + 1073741824;
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!isEnabled()) {
            return onTouchEvent;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mIsPressed = true;
        } else if (action == 1) {
            this.mIsPressed = false;
        }
        return onTouchEvent;
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
    }

    public void setId(int i) {
        this.mKButtonTextView.setId(i);
    }

    public void setImageDrawable(Drawable drawable) {
        ImageView imageView = this.mKButtonImageView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setNestEnabled(boolean z) {
        this.mKButtonTextView.setEnabled(z);
    }

    public void setText(String str) {
        this.mKButtonTextView.setText(str);
        setContentDescription(str);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.mKButtonTextView.setTextColor(colorStateList);
    }

    public void setTextFont(Typeface typeface) {
        if (typeface != null) {
            this.mKButtonTextView.setTypeface(typeface);
            this.mKButtonTextView.requestLayout();
        }
    }

    public void setTextSize(int i, float f) {
        this.mKButtonTextView.setTextSize(i, f);
    }

    public KindaButtonImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public KindaButtonImpl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
