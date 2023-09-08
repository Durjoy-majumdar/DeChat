package com.tencent.p014mm.plugin.exdevice.p042ui;

import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceProfileUI;
import java.util.ArrayList;
import qo3.C89779i0;
import t71.C48546i;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.z */
public class C41383z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48546i f111413d;

    /* renamed from: e */
    public final /* synthetic */ ExdeviceProfileUI.C41278c f111414e;

    public C41383z(ExdeviceProfileUI.C41278c cVar, C48546i iVar) {
        this.f111414e = cVar;
        this.f111413d = iVar;
    }

    public void run() {
        C89779i0 i0Var = ExdeviceProfileUI.this.f111192z;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        ExdeviceProfileUI exdeviceProfileUI = ExdeviceProfileUI.this;
        ArrayList<String> arrayList = this.f111413d.f129840r;
        exdeviceProfileUI.f111178i = arrayList;
        exdeviceProfileUI.f111180n.setAffectedUserInfo(arrayList);
    }
}
