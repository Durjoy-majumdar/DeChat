package com.tencent.p014mm.plugin.sns.p106ui;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ft2.C97979c;
import hp3.C87581a;
import ht2.C98524a;
import jr2.C99014h;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$g */
public class SnsTimeLineUI$$g implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ C99014h f278744a;

    /* renamed from: b */
    public final /* synthetic */ String f278745b;

    /* renamed from: c */
    public final /* synthetic */ SnsTimeLineUI f278746c;

    public SnsTimeLineUI$$g(SnsTimeLineUI snsTimeLineUI, C99014h hVar, String str) {
        this.f278746c = snsTimeLineUI;
        this.f278744a = hVar;
        this.f278745b = str;
    }

    public Object call(Object obj) {
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$24");
        Void voidR = (Void) obj;
        SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$24");
        C97979c J7 = SnsTimeLineUI.m122282J7(this.f278746c);
        if (J7 != null) {
            long h = J7.mo137293h(false);
            long a0 = this.f278744a.mo131166a0();
            if (a0 > h || a0 <= C102236a0.m134706B0(J7.mo137295j().mo137875l())) {
                C98524a aVar = (C98524a) J7.mo137295j();
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setHasGetNp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                aVar.f288934z = false;
                SnsMethodCalculate.markEndTimeMs("setHasGetNp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            } else {
                C98524a aVar2 = (C98524a) J7.mo137295j();
                aVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("setHasGetNp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                aVar2.f288934z = true;
                SnsMethodCalculate.markEndTimeMs("setHasGetNp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            }
            J7.mo137295j().mo137881u("");
            J7.mo137295j().mo137878r(this.f278745b);
            J7.mo137295j().mo137877q();
            J7.mo133186F0("");
        }
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$24");
        SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$24");
        return voidR;
    }
}
