package com.tencent.p014mm.p136ui.chatting.view;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.tencent.p014mm.plugin.patmsg.p086ui.AvatarPatImageView;

/* renamed from: com.tencent.mm.ui.chatting.view.AvatarImageView */
public class AvatarImageView extends AvatarPatImageView {
    public AvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setChattingBG(boolean z) {
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayerType(1, (Paint) null);
    }
}
