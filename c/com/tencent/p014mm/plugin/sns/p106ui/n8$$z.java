package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91997p;
import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import te3.C101789j00;

/* renamed from: com.tencent.mm.plugin.sns.ui.n8$$z */
public class n8$$z implements View.OnClickListener {
    public n8$$z(C96085n8 n8Var) {
    }

    public void onClick(View view) {
        C101789j00 j002;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$3");
        if (!(view == null || view.getTag() == null || !(view.getTag() instanceof C96167q1))) {
            TimeLineObject timeLineObject = ((C96167q1) view.getTag()).f280946a;
            WeakReference<View> weakReference = ((C96167q1) view.getTag()).f280947b;
            if (!(timeLineObject == null || (j002 = timeLineObject.ContentObj) == null || j002.f298433q == null || weakReference == null || weakReference.get() == null)) {
                View view2 = weakReference.get();
                Rect rect = new Rect();
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i = iArr[0];
                rect.set(i, iArr[1], view2.getMeasuredWidth() + i, iArr[1] + view2.getMeasuredHeight());
                C91997p.m115545c(view.getContext(), timeLineObject.ContentObj.f298433q, rect);
            }
            String str = ((C96167q1) view.getTag()).f280948c;
            String str2 = timeLineObject.UserName;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
            C96085n8.m123088G(str2, str, -1);
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
