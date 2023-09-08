package tr2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverContainerLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: tr2.b */
public final class C52362b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsCoverContainerLayout f146347d;

    public C52362b(SnsCoverContainerLayout snsCoverContainerLayout) {
        this.f146347d = snsCoverContainerLayout;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout$replaceBackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$replaceBackView$1");
        C32224a<C13598b0> coverClickListener = this.f146347d.getCoverClickListener();
        if (coverClickListener != null) {
            coverClickListener.invoke();
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$replaceBackView$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout$replaceBackView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
