package com.tencent.p014mm.accessibility.core.area;

import android.view.View;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/accessibility/core/area/ViewTouchAreaExpander;", "", "Landroid/view/View;", "view", "", "eLeft", "eTop", "eRight", "eBottom", "Lrx3/b0;", "expand", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "plugin-autoaccessibility_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.area.ViewTouchAreaExpander */
public final class ViewTouchAreaExpander {
    public static final int $stable = 0;
    public static final ViewTouchAreaExpander INSTANCE = new ViewTouchAreaExpander();
    public static final String TAG = "MicroMsg.Acc.ViewTouchAreaExpander";

    private ViewTouchAreaExpander() {
    }

    public final void expand(View view, int i, int i2, int i3, int i4) {
        C87412m.m108594g(view, "view");
        long nanoTime = System.nanoTime();
        ExpandTouchDelegate.Companion.expand(view, i, i2, i3, i4);
        Log.m105924i(TAG, "expand: view(" + IdUtil.INSTANCE.getName(view.getId()) + ") cost " + (System.nanoTime() - nanoTime));
    }
}
