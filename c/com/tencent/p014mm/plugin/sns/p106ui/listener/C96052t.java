package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.C96113p5;
import com.tencent.p014mm.plugin.sns.p106ui.SnsSingleTextViewUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.t */
public class C96052t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280462d;

    public C96052t(TimelineClickListener timelineClickListener) {
        this.f280462d = timelineClickListener;
    }

    public void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$28");
        if (view.getTag() instanceof C96113p5) {
            SnsInfo TE = C94866e1.Yx0().mo139807TE(((C96113p5) view.getTag()).f280719a);
            if (TE == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$28");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("sns_text_show", TE.getTimeLine().ContentDesc);
            intent.putExtra("sns_local_id", TE.getLocalid());
            intent.putExtra("sns_content_source", 1);
            intent.setClass(TimelineClickListener.m122988j(this.f280462d), SnsSingleTextViewUI.class);
            Activity j = TimelineClickListener.m122988j(this.f280462d);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity = j;
            str = "(Landroid/view/View;)V";
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            j.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            str = "(Landroid/view/View;)V";
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$28");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$28", "android/view/View$OnClickListener", "onClick", str);
    }
}
