package pu2;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.C96317y0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: pu2.d0 */
public final class C100911d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100954s f295516d;

    public C100911d0(C100954s sVar) {
        this.f295516d = sVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$4");
        C100954s sVar = this.f295516d;
        int i = C100954s.f295624S0;
        SnsMethodCalculate.markStartTimeMs("access$popLikeCommentMenuWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        sVar.getClass();
        SnsMethodCalculate.markStartTimeMs("popLikeCommentMenuWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        StringBuilder sb = new StringBuilder();
        sb.append("start popLikeCommentMenuWindow ");
        sb.append(sVar.getCommentImage() != null);
        sVar.mo140441m("MicroMsg.Improve.TimelineItemClick", sb.toString());
        ImageView commentImage = sVar.getCommentImage();
        if (commentImage != null) {
            commentImage.setTag(sVar.mo140400p());
        }
        if (sVar.getContext() instanceof C96317y0) {
            Context context = sVar.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.ICommentEvent");
            boolean H3 = ((C96317y0) context).mo132949H3(sVar.getCommentImage());
            sVar.mo140441m("MicroMsg.Improve.TimelineItemClick", "popLikeCommentMenuWindow result:" + H3);
        }
        SnsMethodCalculate.markEndTimeMs("popLikeCommentMenuWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        SnsMethodCalculate.markEndTimeMs("access$popLikeCommentMenuWindow", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$4");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/TimelineItemClick$updateClickListener$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
