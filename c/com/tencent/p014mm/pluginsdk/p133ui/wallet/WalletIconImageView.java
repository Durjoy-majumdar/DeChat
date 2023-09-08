package com.tencent.p014mm.pluginsdk.p133ui.wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;

/* renamed from: com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView */
public class WalletIconImageView extends WeImageView {

    /* renamed from: r */
    public int f212563r;

    /* renamed from: s */
    public int f212564s;

    /* renamed from: t */
    public int f212565t;

    /* renamed from: u */
    public int f212566u;

    /* renamed from: v */
    public int f212567v;

    /* renamed from: w */
    public String f212568w;

    /* renamed from: x */
    public View.OnClickListener f212569x;

    public WalletIconImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f212563r = -1;
        this.f212564s = 0;
        this.f212565t = 4;
        this.f212566u = -1;
        this.f212567v = -1;
        this.f212569x = null;
    }

    /* renamed from: s */
    public void mo100854s() {
        super.setVisibility(this.f212565t);
        setImageResource(this.f212563r);
        setContentDescription(this.f212568w);
        int i = this.f212564s;
        if (i != -1) {
            super.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
            setIconColor(this.f212564s);
        }
        View.OnClickListener onClickListener = this.f212569x;
        if (onClickListener != null) {
            super.setOnClickListener(onClickListener);
        }
    }

    public void setIconContentDescription(String str) {
        this.f212568w = str;
    }

    public void setImageResource(int i) {
        this.f212563r = i;
        if (i != -1) {
            super.setImageResource(i);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f212569x = onClickListener;
    }

    public void setToClearState(View.OnClickListener onClickListener) {
        super.setVisibility(0);
        int i = this.f212566u;
        if (i != -1) {
            super.setImageResource(i);
            int i2 = this.f212567v;
            if (i2 != -1) {
                super.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                setIconColor(this.f212567v);
            }
        } else {
            super.setImageResource(C0966R.C0969drawable.abe);
            int i3 = this.f212567v;
            if (i3 != -1) {
                super.setColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
                setIconColor(this.f212567v);
            } else {
                super.setColorFilter(getResources().getColor(C0966R.color.FG_2), PorterDuff.Mode.SRC_ATOP);
                setIconColor(getResources().getColor(C0966R.color.FG_2));
            }
        }
        super.setContentDescription(getContext().getString(C0966R.string.bf9));
        super.setOnClickListener(onClickListener);
    }

    public void setVisibility(int i) {
        this.f212565t = i;
        super.setVisibility(i);
    }

    public void setmUserSetImageIconColor(int i) {
        this.f212564s = i;
        if (i != -1) {
            setIconColor(i);
        }
    }

    public WalletIconImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public WalletIconImageView(Context context) {
        super(context);
        this.f212563r = -1;
        this.f212564s = 0;
        this.f212565t = 4;
        this.f212566u = -1;
        this.f212567v = -1;
        this.f212569x = null;
    }
}
