package tu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.recycle.TimelineCommentView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32229r;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;
import te3.w64;

/* renamed from: tu2.b */
public final class C101929b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineCommentView f300103d;

    /* renamed from: e */
    public final /* synthetic */ w64 f300104e;

    /* renamed from: f */
    public final /* synthetic */ String f300105f;

    /* renamed from: g */
    public final /* synthetic */ String f300106g;

    public C101929b(TimelineCommentView timelineCommentView, w64 w64, String str, String str2) {
        this.f300103d = timelineCommentView;
        this.f300104e = w64;
        this.f300105f = str;
        this.f300106g = str2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/improve/recycle/TimelineCommentView$loadCommentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$loadCommentLayout$2");
        C32229r<View, w64, String, CharSequence, C13598b0> commentClickListener = this.f300103d.getCommentClickListener();
        if (commentClickListener != null) {
            C87412m.m108593f(view, LocaleUtil.ITALIAN);
            w64 w64 = this.f300104e;
            C87412m.m108593f(w64, "commentInfo");
            String str = this.f300105f;
            C87412m.m108593f(str, "theCommentNickname");
            String str2 = this.f300106g;
            C87412m.m108593f(str2, "theCommentContent");
            commentClickListener.mo162I(view, w64, str, str2);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineCommentView$loadCommentLayout$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/improve/recycle/TimelineCommentView$loadCommentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
