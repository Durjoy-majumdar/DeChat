package com.tencent.kinda.framework.widget.base;

import com.tencent.p014mm.p136ui.base.MMHorizontalScrollView;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
public final class MMKHorizontalScrollView$setContentOffset$1 implements Runnable {
    public final /* synthetic */ int $offsetX;
    public final /* synthetic */ int $offsetY;
    public final /* synthetic */ MMKHorizontalScrollView this$0;

    public MMKHorizontalScrollView$setContentOffset$1(MMKHorizontalScrollView mMKHorizontalScrollView, int i, int i2) {
        this.this$0 = mMKHorizontalScrollView;
        this.$offsetX = i;
        this.$offsetY = i2;
    }

    public final void run() {
        ((MMHorizontalScrollView) this.this$0.view).scrollBy(this.$offsetX, this.$offsetY);
    }
}
