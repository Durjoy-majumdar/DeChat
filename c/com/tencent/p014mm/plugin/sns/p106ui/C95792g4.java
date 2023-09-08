package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.g4 */
public class C95792g4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsCommentFooter f279543d;

    public C95792g4(SnsCommentFooter snsCommentFooter) {
        this.f279543d = snsCommentFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$7");
        this.f279543d.setModeClick(true);
        StringBuilder sb = new StringBuilder();
        sb.append("state onClick");
        SnsCommentFooter snsCommentFooter = this.f279543d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i = snsCommentFooter.f278061t;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        sb.append(i);
        Log.m105924i("MicroMsg.SnsCommentFooter", sb.toString());
        SnsCommentFooter snsCommentFooter2 = this.f279543d;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i2 = snsCommentFooter2.f278061t;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (i2 == 0) {
            SnsCommentFooter.m122049j(this.f279543d, 1);
            Log.m105918d("MicroMsg.SnsCommentFooter", "onClick: switch show smiley panel");
            SnsCommentFooter.m122046g(this.f279543d).mo104256m();
            this.f279543d.mo132697q();
            SnsCommentFooter snsCommentFooter3 = this.f279543d;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter3.mo132682D();
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            this.f279543d.setToSendTextColor(false);
            SnsCommentFooter.m122043d(this.f279543d).setImageResource(C0966R.C0969drawable.f4803nc);
            SnsCommentFooter.m122043d(this.f279543d).setContentDescription(this.f279543d.getContext().getString(C0966R.string.b3l));
            SnsCommentFooter snsCommentFooter4 = this.f279543d;
            SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter4.getClass();
            SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            Log.m105918d("MicroMsg.SnsCommentFooter", "onClick: switch hide smiley panel");
            SnsCommentFooter.m122044e(this.f279543d);
            SnsCommentFooter snsCommentFooter5 = this.f279543d;
            SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter5.getClass();
            SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            SnsCommentFooter.m122046g(this.f279543d).mo104256m();
            this.f279543d.mo132681C();
            this.f279543d.setToSendTextColor(true);
            SnsCommentFooter.m122043d(this.f279543d).setImageResource(C0966R.raw.icons_outlined_emoji);
            SnsCommentFooter.m122043d(this.f279543d).setContentDescription(this.f279543d.getContext().getString(C0966R.string.b3j));
            SnsCommentFooter.m122049j(this.f279543d, 0);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$7");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
