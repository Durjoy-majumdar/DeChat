package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.FinishSelectPOIStruct;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import y22.C118911c;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.m0 */
public class C115564m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346589d;

    public C115564m0(C115538c0 c0Var) {
        this.f346589d = c0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105919d("MicroMsg.MMPoiMapUI", "click lat: %s, lng: %s", Double.valueOf(this.f346589d.f346501G), Double.valueOf(this.f346589d.f346502H));
        C115538c0 c0Var = this.f346589d;
        if (c0Var.f346501G == -85.0d || c0Var.f346502H == -1000.0d) {
            Log.m105924i("MicroMsg.MMPoiMapUI", "invalid lat lng");
            C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (c0Var.f346504J) {
            C118911c iController = c0Var.f346583e.getIController();
            C115538c0 c0Var2 = this.f346589d;
            iController.animateTo(c0Var2.f346501G, c0Var2.f346502H);
            this.f346589d.f346553v.setSelected(true);
            this.f346589d.mo175583y(C115538c0.C115548i.COLLAPSED);
        } else {
            C118911c iController2 = c0Var.f346583e.getIController();
            C115538c0 c0Var3 = this.f346589d;
            iController2.animateTo(c0Var3.f346501G, c0Var3.f346502H);
            C115538c0 c0Var4 = this.f346589d;
            double d = c0Var4.f346501G;
            c0Var4.f346499E = d;
            double d2 = c0Var4.f346502H;
            c0Var4.f346500F = d2;
            PickPoi pickPoi = c0Var4.f346544n;
            boolean booleanExtra = c0Var4.mo175604k().getBooleanExtra("key_geo_coder_four_level", false);
            CustomIndoorPicker customIndoorPicker = this.f346589d.f346554w;
            pickPoi.mo175541b(d, d2, booleanExtra, customIndoorPicker.f346427H1, customIndoorPicker.f346428I1, customIndoorPicker.f346429J1);
            this.f346589d.f346553v.setSelected(true);
            C115538c0 c0Var5 = this.f346589d;
            c0Var5.f346528Z = false;
            c0Var5.f346550s.f346592f = 0;
            c0Var5.f346545o.setSelection(0);
            C115538c0 c0Var6 = this.f346589d;
            FinishSelectPOIStruct finishSelectPOIStruct = c0Var6.f346556x0;
            finishSelectPOIStruct.f343728g = 0;
            finishSelectPOIStruct.f343727f = (long) 5;
            c0Var6.mo175581w(false);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
