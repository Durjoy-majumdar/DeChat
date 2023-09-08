package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChattingContent */
public class ChattingContent extends FrameLayout {
    public ChattingContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105919d("MicroMsg.ChattingContent", "jacks onLayout change: %B, l:%d, t:%d, r:%d, b:%d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        Log.m105919d("MicroMsg.ChattingContent", "jacks onMeasure  width:%d, height:%d", Integer.valueOf(View.MeasureSpec.getSize(i)), Integer.valueOf(View.MeasureSpec.getSize(i2)));
        super.onMeasure(i, i2);
    }

    public ChattingContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
