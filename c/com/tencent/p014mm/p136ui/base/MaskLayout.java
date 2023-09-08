package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import t40.C77853a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.ui.base.MaskLayout */
public class MaskLayout extends RelativeLayout implements C111847h {

    /* renamed from: d */
    public ImageView f24203d;

    /* renamed from: e */
    public View f24204e;

    /* renamed from: f */
    public Drawable f24205f;

    /* renamed from: com.tencent.mm.ui.base.MaskLayout$a */
    public enum C6755a {
        SUBSCRIPT_DRAWABLE_DIRECTION_ALL
    }

    public MaskLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo7728a(C6755a aVar) {
        removeView(this.f24203d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            layoutParams.addRule(11);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                layoutParams.addRule(12);
                layoutParams.addRule(11);
            } else if (ordinal != 3) {
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            } else {
                layoutParams.addRule(12);
                layoutParams.addRule(9);
            }
        }
        addView(this.f24203d, layoutParams);
    }

    public View getContentView() {
        return this.f24204e;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.br8);
        this.f24204e = findViewById;
        if (findViewById == null) {
            Log.m105919d("MicroMsg.MaskLayout", "%s", "not found view by id, new one");
            this.f24204e = new View(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f24204e.setLayoutParams(layoutParams);
            addView(this.f24204e);
        }
        ImageView imageView = new ImageView(getContext());
        this.f24203d = imageView;
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f24203d.setImageDrawable(this.f24205f);
        addView(this.f24203d);
    }

    public void setMaskBitmap(Bitmap bitmap) {
        mo7728a(C6755a.SUBSCRIPT_DRAWABLE_DIRECTION_ALL);
        this.f24203d.setImageBitmap(bitmap);
    }

    public void setMaskDrawable(Drawable drawable) {
        mo7728a(C6755a.SUBSCRIPT_DRAWABLE_DIRECTION_ALL);
        this.f24203d.setImageDrawable(drawable);
    }

    public MaskLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C77853a.f226871q, i, 0);
        this.f24205f = obtainStyledAttributes.getDrawable(5);
        obtainStyledAttributes.recycle();
    }
}
