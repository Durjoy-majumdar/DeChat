package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUserUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.HashMap;
import java.util.Map;
import vr2.C102267u;

/* renamed from: com.tencent.mm.plugin.sns.ui.t7 */
public class C96229t7 implements C7045j.C7056k {

    /* renamed from: a */
    public final /* synthetic */ C7045j f281189a;

    /* renamed from: b */
    public final /* synthetic */ SnsUserUI f281190b;

    public C96229t7(SnsUserUI snsUserUI, C7045j jVar) {
        this.f281190b = snsUserUI;
        this.f281189a = jVar;
    }

    public void onResult(boolean z, Object obj, Object obj2) {
        Object obj3 = obj;
        Object obj4 = obj2;
        SnsMethodCalculate.markStartTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI$14");
        if ((obj3 instanceof String) && (obj4 instanceof String)) {
            SnsUserUI snsUserUI = this.f281190b;
            int i = SnsUserUI.f278981R;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            C102267u uVar = snsUserUI.f278989H;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            if (((HashMap) uVar.f301199c).get(obj3) != null) {
                SnsUserUI snsUserUI2 = this.f281190b;
                SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                C102267u uVar2 = snsUserUI2.f278989H;
                SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                if (((Map) ((HashMap) uVar2.f301199c).get(obj3)).get(obj4) != null) {
                    SnsUserUI snsUserUI3 = this.f281190b;
                    SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    C102267u uVar3 = snsUserUI3.f278989H;
                    SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    snsUserUI3.f278986E = (Long) ((Map) ((HashMap) uVar3.f301199c).get(obj3)).get(obj4);
                    SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    SnsUserUI snsUserUI4 = this.f281190b;
                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    Long l = snsUserUI4.f278986E;
                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    Log.m105925i("MicroMsg.SnsUserUI", "SnsDatePicker select:[%s, %s, %s]", obj3, obj4, l);
                    MMHandler ly02 = C94866e1.ly0();
                    SnsUserUI snsUserUI5 = this.f281190b;
                    SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    Runnable runnable = snsUserUI5.f278991J;
                    SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    ly02.removeCallbacks(runnable);
                    C5431p1.C5432a O7 = SnsUserUI.m122465O7(this.f281190b);
                    ((SnsUserUI.C95694k) SnsUserUI.m122460J7(this.f281190b)).getType();
                    String I7 = SnsUserUI.m122459I7(this.f281190b);
                    boolean L7 = SnsUserUI.m122462L7(this.f281190b);
                    SnsUserUI snsUserUI6 = this.f281190b;
                    SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    Long l2 = snsUserUI6.f278986E;
                    SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
                    O7.mo6415f(2, I7, 0, L7, l2.longValue(), SnsUserUI.m122464N7(this.f281190b));
                    SnsUserUI.m122466P7(this.f281190b, 0);
                    C96198r5 H7 = SnsUserUI.m122458H7(this.f281190b);
                    H7.getClass();
                    SnsMethodCalculate.markStartTimeMs("switchSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    H7.f281036F = true;
                    H7.f281037G = false;
                    C96245v5 v5Var = H7.f281060x;
                    v5Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                    v5Var.f281237h = false;
                    SnsMethodCalculate.markEndTimeMs("needAddSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                    SnsMethodCalculate.markEndTimeMs("switchSearchMode", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                    SnsUserUI.m122467Q7(this.f281190b).mo133028D(true);
                    SnsUserUI.m122461K7(this.f281190b);
                }
            }
        }
        this.f281189a.mo8101d();
        SnsMethodCalculate.markEndTimeMs("onResult", "com.tencent.mm.plugin.sns.ui.SnsUserUI$14");
    }
}
