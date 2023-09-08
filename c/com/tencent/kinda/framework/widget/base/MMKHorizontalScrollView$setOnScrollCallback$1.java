package com.tencent.kinda.framework.widget.base;

import android.view.View;
import com.tencent.kinda.gen.KHorizontalScrollViewOnScrollCallback;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C76872c1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, mo182094d2 = {"com/tencent/kinda/framework/widget/base/MMKHorizontalScrollView$setOnScrollCallback$1", "Lnj3/c1;", "Landroid/view/View;", "v", "", "scrollX", "scrollY", "oldScrollX", "oldScrollY", "Lrx3/b0;", "onScrollChange", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class MMKHorizontalScrollView$setOnScrollCallback$1 implements C76872c1 {
    public final /* synthetic */ KHorizontalScrollViewOnScrollCallback $callback;

    public MMKHorizontalScrollView$setOnScrollCallback$1(KHorizontalScrollViewOnScrollCallback kHorizontalScrollViewOnScrollCallback) {
        this.$callback = kHorizontalScrollViewOnScrollCallback;
    }

    public void onScrollChange(View view, int i, int i2, int i3, int i4) {
        C87412m.m108594g(view, "v");
        KHorizontalScrollViewOnScrollCallback kHorizontalScrollViewOnScrollCallback = this.$callback;
        if (kHorizontalScrollViewOnScrollCallback != null) {
            kHorizontalScrollViewOnScrollCallback.onScroll((float) i, (float) i2);
        }
    }
}
