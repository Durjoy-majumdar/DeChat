package com.tencent.p014mm.plugin.account.p024ui;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import tc2.C118418g;
import tc2.C77890f;

/* renamed from: com.tencent.mm.plugin.account.ui.MobileInputUI$$i */
public class MobileInputUI$$i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ boolean[] f344718d;

    /* renamed from: e */
    public final /* synthetic */ MobileInputUI f344719e;

    public MobileInputUI$$i(MobileInputUI mobileInputUI, boolean[] zArr) {
        this.f344719e = mobileInputUI;
        this.f344718d = zArr;
    }

    public void onClick(View view) {
        C118418g gVar = C118418g.INSTANCE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/ui/MobileInputUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f344718d;
        if (zArr[0]) {
            zArr[0] = false;
        } else {
            MobileInputUI mobileInputUI = this.f344719e;
            int i = MobileInputUI.f344669V;
            if (mobileInputUI.mo174703L7()) {
                this.f344719e.f344686R = C77890f.m94019a(1);
                gVar.Ud0("ce_reg", "<Reg>", this.f344719e.f344686R);
                gVar.mo175827n9("ce_reg", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                gVar.ec0("ce_reg");
            }
            if (this.f344719e.mo174702K7()) {
                this.f344719e.f344687S = C77890f.m94019a(2);
                gVar.Ud0("ce_login_id", "<Login>", this.f344719e.f344687S);
                gVar.mo175827n9("ce_login_id", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                gVar.ec0("ce_login_id");
            }
        }
        MobileInputUI mobileInputUI2 = this.f344719e;
        int i2 = MobileInputUI.f344669V;
        mobileInputUI2.hideVKB();
        mobileInputUI2.f344689U.mo124429a(mobileInputUI2, new C115181s1(mobileInputUI2));
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
