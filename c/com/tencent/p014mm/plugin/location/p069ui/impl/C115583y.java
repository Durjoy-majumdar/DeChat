package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.autogen.mmdata.rpt.FinishSelectPOIStruct;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.plugin.location.p069ui.PoiPoint;
import com.tencent.p014mm.plugin.location.p069ui.impl.C115538c0;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.y */
public class C115583y implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ C115538c0 f346641d;

    /* renamed from: com.tencent.mm.plugin.location.ui.impl.y$a */
    public class C115584a implements C78083b.C78084a {

        /* renamed from: a */
        public final /* synthetic */ C115568o f346642a;

        public C115584a(C115583y yVar, C115568o oVar) {
            this.f346642a = oVar;
        }

        public void onLocationAddr(Addr addr) {
            ((C78085c) C86312j.m106911c(C78085c.class)).oe0().mo108055b(this);
            this.f346642a.f346617j.f343965p = addr.f343965p;
        }
    }

    public C115583y(C115538c0 c0Var) {
        this.f346641d = c0Var;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C115538c0 c0Var = this.f346641d;
        if (-1 == c0Var.f346551t.f346592f) {
            c0Var.mo175577s(true);
            this.f346641d.mo175583y(C115538c0.C115548i.COLLAPSED);
        }
        C115565n nVar = this.f346641d.f346551t;
        nVar.f346592f = i;
        nVar.notifyDataSetChanged();
        if (i >= 0 && i < this.f346641d.f346551t.getCount()) {
            C115538c0 c0Var2 = this.f346641d;
            c0Var2.f346528Z = true;
            PoiPoint poiPoint = c0Var2.f346531b1;
            if (poiPoint != null && PoiPoint.C115522d.STAND == poiPoint.f346368B) {
                poiPoint.f346368B = PoiPoint.C115522d.SIT;
                poiPoint.f346380q.reverse();
                poiPoint.f346381r.reverse();
                poiPoint.f346382s.reverse();
            }
            C115568o d = this.f346641d.f346551t.getItem(i);
            double d2 = d.f346611d;
            C115538c0 c0Var3 = this.f346641d;
            if (d2 == c0Var3.f346501G && d.f346610c == c0Var3.f346502H) {
                c0Var3.f346553v.setSelected(true);
            } else {
                c0Var3.f346553v.setSelected(false);
            }
            this.f346641d.f346554w.mo175535y1(d.f346622o, d.f346623p);
            if (!Util.isNullOrNil(d.f346622o)) {
                this.f346641d.f346583e.getIController().animateTo(d.f346611d, d.f346610c, 18);
            } else {
                this.f346641d.f346583e.getIController().animateTo(d.f346611d, d.f346610c, 15);
            }
            if (this.f346641d.mo175604k().getBooleanExtra("key_geo_coder_four_level", false)) {
                C118505d dVar = new C118505d(d.f346611d, d.f346610c);
                dVar.f354672d = Util.isNullOrNil(d.f346622o) ^ true ? 1 : 0;
                dVar.f354673e = d.f346623p;
                dVar.f354675g = true;
                ((C78085c) C86312j.m106911c(C78085c.class)).oe0().mo108054a(dVar, new C115584a(this, d));
            }
            Map<String, PoiPoint> map = this.f346641d.f346532c1;
            PoiPoint poiPoint2 = (PoiPoint) ((HashMap) map).get(d.f346611d + "" + d.f346610c);
            if (poiPoint2 == null) {
                C115538c0 c0Var4 = this.f346641d;
                poiPoint2 = new PoiPoint((Context) c0Var4.f346582d, c0Var4.f346583e);
                poiPoint2.setPosition(i);
                poiPoint2.setOnPointClick(this.f346641d.f346530a1);
                Map<String, PoiPoint> map2 = this.f346641d.f346532c1;
                ((HashMap) map2).put(d.f346611d + "" + d.f346610c, poiPoint2);
                poiPoint2.mo175513b(d.f346611d, d.f346610c, true);
            } else {
                poiPoint2.mo175514c();
            }
            C115538c0 c0Var5 = this.f346641d;
            c0Var5.f346531b1 = poiPoint2;
            FinishSelectPOIStruct finishSelectPOIStruct = c0Var5.f346556x0;
            finishSelectPOIStruct.f343728g = (long) (i + 1);
            finishSelectPOIStruct.f343727f = (long) 1;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$12", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
