package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2HotBarListView */
public class EmojiStoreV2HotBarListView extends ListView {
    public EmojiStoreV2HotBarListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public EmojiStoreV2HotBarListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
