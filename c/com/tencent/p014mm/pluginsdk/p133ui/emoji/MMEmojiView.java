package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import i61.C98602h;
import kg3.C76577a;
import qz1.C22180d;
import qz1.C22187h;
import z51.C39315g;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.MMEmojiView */
public class MMEmojiView extends MMAnimateView {

    /* renamed from: n */
    public EmojiInfo f283644n;

    /* renamed from: o */
    public int f283645o;

    /* renamed from: p */
    public int f283646p;

    /* renamed from: q */
    public boolean f283647q;

    public MMEmojiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
        mo135101y(context);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null && this.f283644n != null) {
            float f = 1.0f;
            if (drawable instanceof C22180d) {
                f = ((C22180d) drawable).mo35284e();
            } else if (drawable instanceof C22187h) {
                f = ((C22187h) drawable).mo35304e();
            } else if (!(drawable instanceof BitmapDrawable)) {
                return;
            }
            float intrinsicWidth = ((float) drawable.getIntrinsicWidth()) / f;
            float intrinsicHeight = ((float) drawable.getIntrinsicHeight()) / f;
            if (this.f283647q) {
                EmojiInfo emojiInfo = this.f283644n;
                if (emojiInfo.field_width == 0 || emojiInfo.field_height == 0) {
                    emojiInfo.field_width = (int) intrinsicWidth;
                    emojiInfo.field_height = (int) intrinsicHeight;
                    ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138019f(this.f283644n);
                }
            }
        }
    }

    public void setIsMaxSizeLimit(boolean z) {
        if (z) {
            setAdjustViewBounds(true);
            setMaxWidth(this.f283645o);
            setMaxHeight(this.f283645o);
            return;
        }
        setMaxHeight(Integer.MAX_VALUE);
        setMaxHeight(Integer.MAX_VALUE);
    }

    public void setMaxSize(int i) {
        this.f283645o = i;
    }

    public void setUpdateEmojiSize(boolean z) {
        this.f283647q = z;
    }

    /* renamed from: y */
    public final void mo135101y(Context context) {
        this.f283645o = context.getResources().getDimensionPixelSize(C0966R.dimen.a4z);
        this.f283646p = context.getResources().getDimensionPixelSize(C0966R.dimen.a4x);
        C76577a.m92145A(context);
        setAdjustViewBounds(true);
        setMaxWidth(this.f283645o);
        setMaxHeight(this.f283645o);
        setMinimumWidth(this.f283646p);
        setMinimumHeight(this.f283646p);
    }

    public MMEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f283647q = false;
        mo135101y(context);
    }
}
