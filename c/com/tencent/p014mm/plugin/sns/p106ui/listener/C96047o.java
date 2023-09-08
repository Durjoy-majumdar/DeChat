package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import as2.C28125b;
import as2.C92086h;
import b32.C0244a;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import k20.C9556a;
import te3.C101804kv2;
import te3.j74;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.o */
public class C96047o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280458d;

    public C96047o(TimelineClickListener timelineClickListener) {
        this.f280458d = timelineClickListener;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
        if (view.getTag() instanceof SnsInfo) {
            SnsInfo snsInfo = (SnsInfo) view.getTag();
            if (snsInfo.getTypeFlag() == 21 && C75592q0.m90789s().equals(snsInfo.getUserName())) {
                SnsMethodCalculate.markStartTimeMs("reportHBDetail", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                String str = snsInfo.getTimeLine().f283893Id;
                ThreadLocal<HashMap<String, Long>> threadLocal = C92086h.f263636a;
                SnsMethodCalculate.markStartTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                C92086h.m115758e(snsInfo, (SnsObject) null);
                SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                C92086h.m115757d(snsInfo);
                System.currentTimeMillis();
                SnsMethodCalculate.markEndTimeMs("reportHBDetail", "com.tencent.mm.plugin.sns.lucky.report.ReportHbReceivePoZhu");
                C28125b.m38099a(24);
            }
            Intent intent = new Intent();
            intent.putExtra("key_sendid", snsInfo.getSnsId());
            intent.putExtra("key_feedid", snsInfo.getLocalid());
            intent.setClassName(TimelineClickListener.m122988j(this.f280458d), "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyMoneyDetailUI");
            Activity j = TimelineClickListener.m122988j(this.f280458d);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(j, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            j.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(j, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            String localid = snsInfo.getLocalid();
            snsInfo.getSnsId();
            SnsMethodCalculate.markStartTimeMs("prepareSnsLuckyDetailArray", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
            SnsInfo SE = C94866e1.Yx0().mo139806SE(C94866e1.Yx0().mo139798DN(localid).field_snsId);
            if (SE != null) {
                TimeLineObject timeLine = SE.getTimeLine();
                if (timeLine != null) {
                    LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
                    if (linkedList.size() > 0) {
                        C101804kv2 kv22 = linkedList.get(0);
                    }
                }
                SnsObject e = C94897n1.m120367e(SE);
                ArrayList arrayList2 = new ArrayList();
                LinkedList<j74> linkedList2 = e.SnsRedEnvelops.f134505e;
                if (linkedList2 != null) {
                    for (int i = 0; i < linkedList2.size(); i++) {
                        j74 j74 = linkedList2.get(i);
                        C0244a.C0245a aVar2 = new C0244a.C0245a();
                        aVar2.f781a = j74.f135912d;
                        aVar2.f782b = j74.f135913e;
                        aVar2.f783c = j74.f135914f;
                        arrayList2.add(aVar2);
                    }
                }
                synchronized (C0244a.class) {
                    C0244a.f780b = localid;
                    C0244a.f779a = arrayList2;
                }
            }
            SnsMethodCalculate.markEndTimeMs("prepareSnsLuckyDetailArray", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$22");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
