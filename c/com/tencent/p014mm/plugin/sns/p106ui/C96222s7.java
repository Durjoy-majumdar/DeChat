package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import vr2.C102267u;

/* renamed from: com.tencent.mm.plugin.sns.ui.s7 */
public class C96222s7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUserUI f281179d;

    public C96222s7(SnsUserUI snsUserUI) {
        this.f281179d = snsUserUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUserUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$13");
        SnsUserUI snsUserUI = this.f281179d;
        int i = SnsUserUI.f278981R;
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        snsUserUI.getClass();
        SnsMethodCalculate.markStartTimeMs("showSnsDatePicker", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        Log.m105924i("MicroMsg.SnsUserUI", "showSnsDatePicker: ");
        C102267u uVar = snsUserUI.f278989H;
        if (uVar == null || Util.isNullOrNil((List) uVar.f301197a) || Util.isNullOrNil((List) snsUserUI.f278989H.f301198b)) {
            Log.m105928w("MicroMsg.SnsUserUI", "mDateInfo == null or displayYears == null or displayMonths == null, don't do anything");
        } else {
            snsUserUI.f279000f.mo133038p();
            C102267u uVar2 = snsUserUI.f278989H;
            C7045j jVar = new C7045j(snsUserUI, uVar2.f301197a, uVar2.f301198b);
            jVar.mo8104g(View.inflate(snsUserUI.getContext(), C0966R.C0971layout.c57, (ViewGroup) null));
            int indexOf = snsUserUI.f278989H.f301197a.indexOf(String.valueOf(snsUserUI.f278984C));
            int indexOf2 = (indexOf < 0 || indexOf >= snsUserUI.f278989H.f301198b.size() || snsUserUI.f278989H.f301198b.get(indexOf) == null) ? -1 : snsUserUI.f278989H.f301198b.get(indexOf).indexOf(String.valueOf(snsUserUI.f278985D));
            if (indexOf != -1 && indexOf2 != -1) {
                jVar.mo8107j(indexOf, indexOf2);
            } else if (indexOf != -1) {
                jVar.mo8106i(indexOf);
            } else if (indexOf2 != -1) {
                jVar.mo8107j(0, indexOf2);
            }
            jVar.f24869t = new C96229t7(snsUserUI, jVar);
            jVar.mo8109l();
        }
        SnsMethodCalculate.markEndTimeMs("showSnsDatePicker", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        if (SnsUserUI.m122467Q7(this.f281179d) != null) {
            SnsUserUI.m122467Q7(this.f281179d).mo133044v();
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$13");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUserUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
