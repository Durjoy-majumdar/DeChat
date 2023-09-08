package vr2;

import android.app.Activity;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.p106ui.C96174r;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;

/* renamed from: vr2.z */
public class C102271z extends C96174r {

    /* renamed from: d */
    public final /* synthetic */ C96275w6 f301229d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineBaseAdapter f301230e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102271z(Activity activity, int i, C94851d1 d1Var, C96275w6 w6Var, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        super(activity, i, d1Var);
        this.f301229d = w6Var;
        this.f301230e = snsTimeLineBaseAdapter;
    }

    /* renamed from: a */
    public void mo67369a(View view, Object obj) {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtil$1");
        SnsInfo snsInfo = this.f301229d.f281367a;
        if (snsInfo == null || !snsInfo.isAd()) {
            this.f301230e.f278588v.f280964b = 14;
        } else {
            this.f301230e.f278588v.f280964b = 0;
        }
        this.f301230e.f278588v.mo67369a(view, obj);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtil$1");
    }
}
