package ju2;

import android.view.View;
import android.widget.PopupWindow;
import com.tencent.p014mm.autogen.events.SnsInputEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gu2.C98214b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ju2.f */
public final class C99048f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C98214b f290353d;

    /* renamed from: e */
    public final /* synthetic */ int f290354e;

    public C99048f(C98214b bVar, int i) {
        this.f290353d = bVar;
        this.f290354e = i;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$2");
        C98214b bVar = this.f290353d;
        int i = this.f290354e;
        SnsMethodCalculate.markStartTimeMs("access$inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        SnsMethodCalculate.markStartTimeMs("inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        PopupWindow popupWindow = C99045e.f290347d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        SnsInputEvent snsInputEvent = new SnsInputEvent();
        SnsInputEvent.C92580a aVar = snsInputEvent.f265158d;
        aVar.f265159a = bVar;
        aVar.f265160b = i;
        snsInputEvent.publish();
        SnsMethodCalculate.markEndTimeMs("inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        SnsMethodCalculate.markEndTimeMs("access$inputFeedComment", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveInteractionUtil$loadContentLayout$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/util/ImproveInteractionUtil$loadContentLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
