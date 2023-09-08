package com.tencent.p014mm.p136ui.contact;

import com.tencent.p014mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sf0.C77702q0;

/* renamed from: com.tencent.mm.ui.contact.z1 */
public class C74603z1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f219267d;

    /* renamed from: e */
    public final /* synthetic */ ModRemarkNameUI f219268e;

    public C74603z1(ModRemarkNameUI modRemarkNameUI, long j) {
        this.f219268e = modRemarkNameUI;
        this.f219267d = j;
    }

    public void run() {
        RemarkTagOperateLogStruct remarkTagOperateLogStruct = new RemarkTagOperateLogStruct();
        ModRemarkNameUI modRemarkNameUI = this.f219268e;
        List<String> list = modRemarkNameUI.f218659X;
        remarkTagOperateLogStruct.f194329d = remarkTagOperateLogStruct.mo86045b("friendUsername", modRemarkNameUI.f218666h, true);
        long j = 0;
        remarkTagOperateLogStruct.f194330e = this.f219268e.f218660Y ? 1 : 0;
        ArrayList<String> arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f219268e.f218648Q0.contains((String) it.next())) {
                i2++;
            }
        }
        remarkTagOperateLogStruct.f194332g = (long) i2;
        for (String contains : arrayList) {
            if (this.f219268e.f218650R0.contains(contains)) {
                j++;
            }
        }
        remarkTagOperateLogStruct.f194334i = j;
        int i3 = 0;
        for (String contains2 : arrayList) {
            if (this.f219268e.f218654T0.contains(contains2)) {
                i3++;
            }
        }
        remarkTagOperateLogStruct.f194333h = (long) i3;
        int i4 = 0;
        for (String contains3 : arrayList) {
            if (this.f219268e.f218652S0.contains(contains3)) {
                i4++;
            }
        }
        remarkTagOperateLogStruct.f194331f = (long) i4;
        long currentTimeMillis = System.currentTimeMillis();
        ModRemarkNameUI modRemarkNameUI2 = this.f219268e;
        remarkTagOperateLogStruct.f194338m = currentTimeMillis - modRemarkNameUI2.f218661Z;
        remarkTagOperateLogStruct.f194339n = (long) modRemarkNameUI2.f218672p0;
        remarkTagOperateLogStruct.f194340o = this.f219267d;
        remarkTagOperateLogStruct.f194335j = (long) modRemarkNameUI2.f218681x0;
        int intExtra = modRemarkNameUI2.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra != 0) {
            remarkTagOperateLogStruct.f194343r = 22;
        }
        int i5 = 0;
        for (String contains4 : arrayList) {
            if (!((ArrayList) this.f219268e.f218658W).contains(contains4)) {
                i5++;
            }
        }
        Iterator it4 = ((ArrayList) this.f219268e.f218658W).iterator();
        while (it4.hasNext()) {
            if (!arrayList.contains((String) it4.next())) {
                i++;
            }
        }
        remarkTagOperateLogStruct.f194341p = 3;
        String trim = this.f219268e.f218662d.getText().toString().trim();
        if (trim == null) {
            trim = "";
        }
        if (C77702q0.m93719b(this.f219268e.f218673q)) {
            ModRemarkNameUI modRemarkNameUI3 = this.f219268e;
            if (!modRemarkNameUI3.f218674r) {
                modRemarkNameUI3.f218655U = 3;
            } else if (!C77702q0.m93719b(modRemarkNameUI3.f218670o)) {
                if (this.f219268e.f218670o.equals(trim)) {
                    this.f219268e.f218655U = 1;
                } else if (Util.isNullOrNil(trim)) {
                    this.f219268e.f218655U = 3;
                } else {
                    this.f219268e.f218655U = 2;
                }
            } else if (trim.equals(this.f219268e.f218670o)) {
                this.f219268e.f218655U = 3;
            } else {
                this.f219268e.f218655U = 2;
            }
        } else if (this.f219268e.f218673q.equals(trim)) {
            this.f219268e.f218655U = 3;
        } else {
            this.f219268e.f218655U = 2;
        }
        remarkTagOperateLogStruct.f194342q = (long) this.f219268e.f218655U;
        remarkTagOperateLogStruct.f194337l = (long) i5;
        remarkTagOperateLogStruct.f194336k = (long) i;
        remarkTagOperateLogStruct.mo86054n();
        Log.m105924i("MiroMsg.ModRemarkName", "22865 setAddedLabelCnt = " + i5 + ",setRemovedLabelCnt = " + i + ",source = " + intExtra + ",oriLabelCnt = " + this.f219268e.f218681x0 + ",opResult = " + this.f219267d + ",totalLabelCnt = " + this.f219268e.f218672p0 + ",selectNewLabelCnt = " + i4 + ",addRemarkType = " + this.f219268e.f218655U + ",scene= " + 3 + ",selectAddLabelCnt = " + i3 + ",newLebalCountBySearch = " + i2 + ",searchAddLabelCnt = " + j);
    }
}
