package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LoadMoreScrollView */
public class LoadMoreScrollView extends ScrollView {

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LoadMoreScrollView$a */
    public interface C56854a {
        void onLoadMore();
    }

    public LoadMoreScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        Log.m105926v("MicroMsg.LoadMoreScrollView", i + ", " + i2 + ", " + z + ", " + z2 + ", " + getScrollY());
        super.onOverScrolled(i, i2, z, z2);
    }

    public void setOnLoadMoreListener(C56854a aVar) {
    }

    public LoadMoreScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
