package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import jv2.C99064d;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$n0 */
public class SnsTimeLineUI$$n0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278769d;

    public SnsTimeLineUI$$n0(SnsTimeLineUI snsTimeLineUI) {
        this.f278769d = snsTimeLineUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$58");
        if (!(SnsTimeLineUI.m122284L7(this.f278769d) == null || SnsTimeLineUI.m122284L7(this.f278769d).f276700g == null)) {
            SnsTimeLineUI.m122284L7(this.f278769d).f276700g.mo130970a().mo131326m(true);
        }
        C91998s.m115550d(725);
        int i = ((C99064d) this.f278769d.mo93528H7().mo136933c(C99064d.class)).f290387b;
        Intent intent = new Intent();
        intent.setClass(this.f278769d, SnsMsgUI.class);
        intent.putExtra("sns_msg_comment_list_scene", 1);
        this.f278769d.startActivityForResult(intent, 13);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$58");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI$58", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
