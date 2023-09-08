package gv2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsCommentCollapseLayout;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class m$$a implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentCollapseLayout f288028d;

    public /* synthetic */ m$$a(SnsCommentCollapseLayout snsCommentCollapseLayout) {
        this.f288028d = snsCommentCollapseLayout;
    }

    public final boolean onLongClick(View view) {
        SnsCommentCollapseLayout snsCommentCollapseLayout = this.f288028d;
        int i = SnsCommentCollapseLayout.f281539j;
        snsCommentCollapseLayout.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", snsCommentCollapseLayout, array);
        SnsMethodCalculate.markStartTimeMs("lambda$setPressTouchListener$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        if (view.getTag(C0966R.C0970id.f359414kt0) != null) {
            snsCommentCollapseLayout.setTag(C0966R.C0970id.f359414kt0, view.getTag(C0966R.C0970id.f359414kt0));
        }
        boolean performLongClick = snsCommentCollapseLayout.performLongClick();
        SnsMethodCalculate.markEndTimeMs("lambda$setPressTouchListener$0", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout");
        C117292a.m165362h(performLongClick, snsCommentCollapseLayout, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentCollapseLayout", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return performLongClick;
    }
}
