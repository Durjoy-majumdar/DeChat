package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizEntranceListUI;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.i */
public class C40667i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EnterpriseBizEntranceListUI.C40632f f109257d;

    public C40667i(EnterpriseBizEntranceListUI.C40632f fVar) {
        this.f109257d = fVar;
    }

    public void run() {
        TextView textView = (TextView) EnterpriseBizEntranceListUI.this.findViewById(C0966R.C0970id.ckg);
        if (!(EnterpriseBizEntranceListUI.this.f109136e == null || textView == null)) {
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(EnterpriseBizEntranceListUI.this.f109137f);
            if (z1Var == null || !z1Var.mo62927s3()) {
                EnterpriseBizEntranceListUI.this.f109136e.setVisibility(8);
                textView.setVisibility(0);
            } else if (EnterpriseBizEntranceListUI.this.f109135d.getCount() <= 0) {
                EnterpriseBizEntranceListUI.this.f109136e.setVisibility(8);
                textView.setVisibility(0);
            } else {
                EnterpriseBizEntranceListUI.this.f109136e.setVisibility(0);
                textView.setVisibility(8);
                EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = EnterpriseBizEntranceListUI.this;
                enterpriseBizEntranceListUI.f109136e.setAdapter(enterpriseBizEntranceListUI.f109135d);
                EnterpriseBizEntranceListUI enterpriseBizEntranceListUI2 = EnterpriseBizEntranceListUI.this;
                enterpriseBizEntranceListUI2.f109136e.setOnItemClickListener(enterpriseBizEntranceListUI2.f109138g);
            }
        }
        this.f109257d.notifyDataSetChanged();
    }
}
