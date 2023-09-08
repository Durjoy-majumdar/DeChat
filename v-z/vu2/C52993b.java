package vu2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;

/* renamed from: vu2.b */
public final class C52993b {
    /* renamed from: a */
    public static final void m59322a(ViewStub viewStub, View view, ViewGroup.LayoutParams layoutParams) {
        SnsMethodCalculate.markStartTimeMs("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
        C87412m.m108594g(viewStub, "<this>");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(layoutParams, "param");
        ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
        if (viewGroup == null) {
            SnsMethodCalculate.markEndTimeMs("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(viewStub);
        viewGroup.removeViewAt(indexOfChild);
        viewGroup.addView(view, indexOfChild, layoutParams);
        SnsMethodCalculate.markEndTimeMs("replaceView", "com.tencent.mm.plugin.sns.ui.item.improve.view.ViewStubExtensionKt");
    }
}
