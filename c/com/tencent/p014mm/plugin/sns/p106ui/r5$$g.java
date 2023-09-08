package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.C96236u5;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$g */
public class r5$$g implements C96236u5.C96238b {

    /* renamed from: a */
    public final /* synthetic */ r5$$p f281072a;

    /* renamed from: b */
    public final /* synthetic */ C96198r5 f281073b;

    public r5$$g(C96198r5 r5Var, r5$$p r5__p) {
        this.f281073b = r5Var;
        this.f281072a = r5__p;
    }

    /* renamed from: a */
    public void mo133866a(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        if (C96198r5.m123298a(this.f281073b)) {
            C96198r5.m123300d(this.f281073b);
            this.f281073b.notifyDataSetChanged();
            r5$$p r5__p = this.f281072a;
            if (r5__p != null) {
                ((SnsUserUI.C95688a) r5__p).mo133110a();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }

    /* renamed from: b */
    public void mo133867b(List<SnsInfo> list, Map<Integer, Integer> map, Map<Integer, Integer> map2, Map<Integer, Integer> map3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
        if (C96198r5.m123298a(this.f281073b)) {
            Log.m105918d("MicroMsg.SnsphotoAdapter", "onFinishFixPos");
            this.f281073b.mo133835E(list, map, map2, map3, i, i2);
            C96198r5 r5Var = this.f281073b;
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            r5Var.getClass();
            SnsMethodCalculate.markStartTimeMs("checkSearchScrollOffsetByLineSep", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            if (r5Var.f281054r && r5Var.f281047h != null && C94897n1.f274989c != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= r5Var.f281047h.size()) {
                        break;
                    }
                    SnsInfo snsInfo = r5Var.f281047h.get(i3);
                    if (snsInfo.field_snsId != C94897n1.f274989c) {
                        i3++;
                    } else if (i3 > 0) {
                        int head = snsInfo.getHead();
                        int head2 = r5Var.f281047h.get(i3 - 1).getHead();
                        if (head == head2) {
                            C94897n1.f274990d += C74942w4.m89784a(r5Var.f281043d, 27);
                        } else {
                            int i4 = head / 10000;
                            if (C96315x6.m123540f() != i4 && i4 != head2 / 10000) {
                                C94897n1.f274990d += (C74942w4.m89784a(r5Var.f281043d, -20) - C74942w4.m89784a(r5Var.f281043d, 10)) - r5Var.f281038H;
                            }
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkSearchScrollOffsetByLineSep", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$2");
    }
}
