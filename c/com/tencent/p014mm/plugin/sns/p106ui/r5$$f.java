package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.C96236u5;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import java.util.Map;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$f */
public class r5$$f implements C96236u5.C96238b {

    /* renamed from: a */
    public final /* synthetic */ r5$$p f281070a;

    /* renamed from: b */
    public final /* synthetic */ C96198r5 f281071b;

    public r5$$f(C96198r5 r5Var, r5$$p r5__p) {
        this.f281071b = r5Var;
        this.f281070a = r5__p;
    }

    /* renamed from: a */
    public void mo133866a(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
        if (!C96198r5.m123298a(this.f281071b)) {
            C96198r5.m123300d(this.f281071b);
            this.f281071b.notifyDataSetChanged();
            r5$$p r5__p = this.f281070a;
            if (r5__p != null) {
                ((SnsUserUI.C95688a) r5__p).mo133110a();
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLoadingFinish", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
    }

    /* renamed from: b */
    public void mo133867b(List<SnsInfo> list, Map<Integer, Integer> map, Map<Integer, Integer> map2, Map<Integer, Integer> map3, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
        if (!C96198r5.m123298a(this.f281071b)) {
            Log.m105918d("MicroMsg.SnsphotoAdapter", "onFinishFixPos");
            this.f281071b.mo133835E(list, map, map2, map3, i, i2);
            C96198r5 r5Var = this.f281071b;
            String p0 = C102236a0.m134763p0(C96198r5.m123299b(r5Var).isEmpty() ? 0 : ((SnsInfo) C96198r5.m123299b(this.f281071b).get(C96198r5.m123299b(this.f281071b).size() - 1)).field_snsId);
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            r5Var.f281058v = p0;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
            if (!C96198r5.m123299b(this.f281071b).isEmpty()) {
                long j = ((SnsInfo) C96198r5.m123299b(this.f281071b).get(C96198r5.m123299b(this.f281071b).size() - 1)).field_snsId;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onFinishFixPos", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$1");
    }
}
