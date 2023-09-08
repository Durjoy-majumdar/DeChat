package com.tencent.p014mm.pluginsdk.p133ui.emoji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.emoji.view.EmojiStatusView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p008bq.C92289q0;

/* renamed from: com.tencent.mm.pluginsdk.ui.emoji.ChattingEmojiView */
public class ChattingEmojiView extends EmojiStatusView {

    /* renamed from: r */
    public int f283640r;

    /* renamed from: s */
    public int f283641s;

    /* renamed from: t */
    public IEmojiInfo f283642t;

    /* renamed from: u */
    public String f283643u;

    public ChattingEmojiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        IEmojiInfo iEmojiInfo;
        super.onMeasure(i, i2);
        if (getStatus() == 1 || (iEmojiInfo = this.f283642t) == null) {
            i3 = getIntrinsicWidth();
            i4 = getIntrinsicHeight();
        } else {
            int width = (int) (((float) iEmojiInfo.getWidth()) * getEmojiDensityScale());
            int height = (int) (((float) this.f283642t.getHeight()) * getEmojiDensityScale());
            if (width <= 0) {
                width = this.f283640r;
            }
            if (height <= 0) {
                height = this.f283640r;
            }
            i3 = Math.max(0, width);
            i4 = Math.max(0, height);
        }
        if (i3 <= 0) {
            i3 = this.f283640r;
        }
        if (i4 <= 0) {
            i4 = this.f283640r;
        }
        int i5 = this.f283641s;
        if (i4 < i5 || i3 < i5) {
            if (i3 < i4) {
                i4 = (int) (((float) i4) * (((float) i5) / ((float) i3)));
                i3 = i5;
            } else if (i4 < i3) {
                i3 = (int) (((float) i3) * (((float) i5) / ((float) i4)));
                i4 = i5;
            } else {
                i3 = i5;
                i4 = i3;
            }
        }
        int i6 = this.f283640r;
        if (i3 > i6 || i4 > i6) {
            if (i3 > i4) {
                i4 = (int) (((float) i4) * (((float) i6) / ((float) i3)));
                i3 = i6;
            } else if (i4 > i3) {
                i3 = (int) (((float) i3) * (((float) i6) / ((float) i4)));
                i4 = i6;
            } else {
                i3 = i6;
                i4 = i3;
            }
        }
        setMeasuredDimension(i3, i4);
        Log.m105919d("MicroMsg.emoji.ChattingEmojiView", "onMeasure width:%d height:%d", Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
    }

    /* renamed from: y */
    public void mo135097y() {
        Class cls = C92289q0.class;
        if (this.f283642t != null) {
            setStatusNotify(0);
            ((C92289q0) C86312j.m106911c(cls)).mo126044cM(this.f283642t, this, this.f283643u);
            return;
        }
        ((C92289q0) C86312j.m106911c(cls)).mo126042CQ(this);
    }

    public ChattingEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f283640r = context.getResources().getDimensionPixelSize(C0966R.dimen.a4z);
        this.f283641s = context.getResources().getDimensionPixelSize(C0966R.dimen.a4x);
        setDefaultImageResource(0);
        setGameUseCover(false);
    }
}
