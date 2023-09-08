package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.View;
import com.tencent.p014mm.p136ui.base.MMHorList;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.x */
public class C2259x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileAffectedUserView f12344d;

    public C2259x(ExdeviceProfileAffectedUserView exdeviceProfileAffectedUserView) {
        this.f12344d = exdeviceProfileAffectedUserView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String s = C75592q0.m90789s();
        if (s != null && s.equals(this.f12344d.f12321d)) {
            MMHorList mMHorList = this.f12344d.f12323f;
            mMHorList.setVisibility(mMHorList.getVisibility() == 0 ? 8 : 0);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileAffectedUserView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
