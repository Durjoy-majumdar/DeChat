package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p182kk.C61104a;
import p652pu.C100910b;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import te3.C101789j00;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$e */
public class r5$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96198r5 f281069d;

    public r5$$e(C96198r5 r5Var) {
        this.f281069d = r5Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$11");
        if (view.getTag() instanceof TimeLineObject) {
            TimeLineObject timeLineObject = (TimeLineObject) view.getTag();
            if (!this.f281069d.mo133858v(timeLineObject.f283893Id)) {
                C115669n.INSTANCE.kvStat(10090, "1,0");
                if (!C61104a.m71669y(C96198r5.m123301f(this.f281069d)) && !C61104a.m71665u(C96198r5.m123301f(this.f281069d)) && !C61104a.m71649e(C96198r5.m123301f(this.f281069d))) {
                    C100910b bVar = (C100910b) C86312j.m106911c(C100910b.class);
                    String xx02 = C94866e1.xx0();
                    String str = timeLineObject.f283893Id;
                    C101789j00 j002 = timeLineObject.ContentObj;
                    C101106m Au0 = bVar.Au0(xx02, timeLineObject, 8, C62602o.m73561a(str, j002 != null ? j002.f298439w : null));
                    C96198r5 r5Var = this.f281069d;
                    SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    String str2 = r5Var.f281044e;
                    SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    Au0.f295977y = str2;
                    C101093a.m132488j(Au0);
                }
            } else {
                C115669n.INSTANCE.kvStat(10231, String.valueOf(1));
                C101093a.m132490l();
            }
            this.f281069d.notifyDataSetChanged();
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$11");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
