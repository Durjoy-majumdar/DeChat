package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinishSelectPOIStruct;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.q0 */
public class C115572q0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346630d;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.q0$a */
    public class C115573a implements C78083b.C78084a {

        /* renamed from: a */
        public final /* synthetic */ C115568o f346631a;

        public C115573a(C115572q0 q0Var, C115568o oVar) {
            this.f346631a = oVar;
        }

        public void onLocationAddr(Addr addr) {
            ((C78085c) C86312j.m106911c(C78085c.class)).oe0().mo108055b(this);
            this.f346631a.f346617j.f343965p = addr.f343965p;
        }
    }

    public C115572q0(C115538c0 c0Var) {
        this.f346630d = c0Var;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Log.m105919d("MicroMsg.MMPoiMapUI", "newpoi listview itemClick position %d", Integer.valueOf(i));
        if (i < 0 || i >= this.f346630d.f346550s.getCount()) {
            Log.m105924i("MicroMsg.MMPoiMapUI", "wrong position");
            C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C115568o d = this.f346630d.f346550s.getItem(i);
        if (d.f346620m == 0) {
            this.f346630d.f346553v.setSelected(false);
        } else {
            this.f346630d.f346553v.setSelected(true);
        }
        C115538c0 c0Var = this.f346630d;
        c0Var.f346499E = d.f346611d;
        c0Var.f346500F = d.f346610c;
        c0Var.f346554w.mo175535y1(d.f346622o, d.f346623p);
        if (!Util.isNullOrNil(d.f346622o)) {
            this.f346630d.f346583e.getIController().animateTo(d.f346611d, d.f346610c, 18);
        } else {
            this.f346630d.f346583e.getIController().animateTo(d.f346611d, d.f346610c, 15);
        }
        if (this.f346630d.mo175604k().getBooleanExtra("key_geo_coder_four_level", false)) {
            C115538c0 c0Var2 = this.f346630d;
            C118505d dVar = new C118505d(c0Var2.f346499E, c0Var2.f346500F);
            dVar.f354672d = Util.isNullOrNil(d.f346622o) ^ true ? 1 : 0;
            dVar.f354673e = d.f346623p;
            dVar.f354675g = true;
            ((C78085c) C86312j.m106911c(C78085c.class)).oe0().mo108054a(dVar, new C115573a(this, d));
        }
        C115565n nVar = this.f346630d.f346550s;
        nVar.f346592f = i;
        nVar.notifyDataSetChanged();
        C115538c0 c0Var3 = this.f346630d;
        c0Var3.f346528Z = false;
        ((SoSoMapView) c0Var3.f346583e).announceForAccessibility(c0Var3.f346582d.getString(C0966R.string.gbg));
        FinishSelectPOIStruct finishSelectPOIStruct = this.f346630d.f346556x0;
        finishSelectPOIStruct.f343728g = (long) (i + 1);
        finishSelectPOIStruct.f343727f = (long) 4;
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
