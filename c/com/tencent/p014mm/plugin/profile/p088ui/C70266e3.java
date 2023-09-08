package com.tencent.p014mm.plugin.profile.p088ui;

import android.widget.EditText;
import com.tencent.p014mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import sf0.C77702q0;

/* renamed from: com.tencent.mm.plugin.profile.ui.e3 */
public class C70266e3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f203020d;

    /* renamed from: e */
    public final /* synthetic */ SayHiWithSnsPermissionUI3 f203021e;

    public C70266e3(SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3, long j) {
        this.f203021e = sayHiWithSnsPermissionUI3;
        this.f203020d = j;
    }

    public void run() {
        RemarkTagOperateLogStruct remarkTagOperateLogStruct = new RemarkTagOperateLogStruct();
        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI3 = this.f203021e;
        if (sayHiWithSnsPermissionUI3.f202904Q == null) {
            sayHiWithSnsPermissionUI3.f202904Q = new ArrayList<>();
        }
        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI32 = this.f203021e;
        if (sayHiWithSnsPermissionUI32.f202911T0 == null) {
            sayHiWithSnsPermissionUI32.f202911T0 = new ArrayList();
        }
        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI33 = this.f203021e;
        if (sayHiWithSnsPermissionUI33.f202911T0 == null) {
            sayHiWithSnsPermissionUI33.f202911T0 = new ArrayList();
        }
        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI34 = this.f203021e;
        ArrayList<String> arrayList = sayHiWithSnsPermissionUI34.f202904Q;
        remarkTagOperateLogStruct.f194329d = remarkTagOperateLogStruct.mo86045b("friendUsername", sayHiWithSnsPermissionUI34.f202950u, true);
        long j = 0;
        remarkTagOperateLogStruct.f194330e = this.f203021e.f202905Q0 ? 1 : 0;
        int i = 0;
        int i2 = 0;
        for (String contains : arrayList) {
            if (this.f203021e.f202913U0.contains(contains)) {
                i2++;
            }
        }
        remarkTagOperateLogStruct.f194332g = (long) i2;
        for (String contains2 : arrayList) {
            if (this.f203021e.f202915V0.contains(contains2)) {
                j++;
            }
        }
        remarkTagOperateLogStruct.f194334i = j;
        int i3 = 0;
        for (String contains3 : arrayList) {
            if (this.f203021e.f202919X0.contains(contains3)) {
                i3++;
            }
        }
        remarkTagOperateLogStruct.f194333h = (long) i3;
        int i4 = 0;
        for (String contains4 : arrayList) {
            if (this.f203021e.f202917W0.contains(contains4)) {
                i4++;
            }
        }
        remarkTagOperateLogStruct.f194331f = (long) i4;
        long currentTimeMillis = System.currentTimeMillis();
        SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI35 = this.f203021e;
        remarkTagOperateLogStruct.f194338m = currentTimeMillis - sayHiWithSnsPermissionUI35.f202925b1;
        remarkTagOperateLogStruct.f194339n = (long) sayHiWithSnsPermissionUI35.f202907R0;
        remarkTagOperateLogStruct.f194340o = this.f203020d;
        remarkTagOperateLogStruct.f194335j = (long) sayHiWithSnsPermissionUI35.f202909S0;
        int i5 = 0;
        for (String contains5 : arrayList) {
            if (!this.f203021e.f202911T0.contains(contains5)) {
                i5++;
            }
        }
        for (String contains6 : this.f203021e.f202911T0) {
            if (!arrayList.contains(contains6)) {
                i++;
            }
        }
        remarkTagOperateLogStruct.f194341p = 2;
        EditText editText = this.f203021e.f202935h;
        String str = "";
        String trim = (editText == null || editText.getText() == null || this.f203021e.f202935h.getText().toString() == null) ? str : this.f203021e.f202935h.getText().toString().trim();
        if (trim != null) {
            str = trim;
        }
        if (C77702q0.m93719b(this.f203021e.f202954x0)) {
            SayHiWithSnsPermissionUI3 sayHiWithSnsPermissionUI36 = this.f203021e;
            if (!sayHiWithSnsPermissionUI36.f202922Z) {
                sayHiWithSnsPermissionUI36.f202956y0 = 3;
            } else if (!C77702q0.m93719b(sayHiWithSnsPermissionUI36.f202945p0)) {
                if (this.f203021e.f202945p0.equals(str)) {
                    this.f203021e.f202956y0 = 1;
                } else if (Util.isNullOrNil(str)) {
                    this.f203021e.f202956y0 = 3;
                } else {
                    this.f203021e.f202956y0 = 2;
                }
            } else if (str.equals(this.f203021e.f202945p0)) {
                this.f203021e.f202956y0 = 3;
            } else {
                this.f203021e.f202956y0 = 2;
            }
        } else if (this.f203021e.f202954x0.equals(str)) {
            this.f203021e.f202956y0 = 3;
        } else {
            this.f203021e.f202956y0 = 2;
        }
        remarkTagOperateLogStruct.f194342q = (long) this.f203021e.f202956y0;
        remarkTagOperateLogStruct.f194337l = (long) i5;
        remarkTagOperateLogStruct.f194336k = (long) i;
        remarkTagOperateLogStruct.mo86054n();
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI3", "22865 setAddedLabelCnt = " + i5 + ",setRemovedLabelCnt = " + i + ",oriLabelCnt = " + this.f203021e.f202909S0 + ",opResult = " + this.f203020d + ",totalLabelCnt = " + this.f203021e.f202907R0 + ",selectNewLabelCnt = " + i4 + ",selectAddLabelCnt = " + i3 + ",addRemarkType = " + this.f203021e.f202956y0 + ",scene= " + 2 + ",newLebalCountBySearch = " + i2 + ",searchAddLabelCnt = " + j);
    }
}
