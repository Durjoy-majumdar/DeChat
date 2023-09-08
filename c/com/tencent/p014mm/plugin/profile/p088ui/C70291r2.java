package com.tencent.p014mm.plugin.profile.p088ui;

import android.widget.EditText;
import com.tencent.p014mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import sf0.C77702q0;

/* renamed from: com.tencent.mm.plugin.profile.ui.r2 */
public class C70291r2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f203058d;

    /* renamed from: e */
    public final /* synthetic */ SayHiWithSnsPermissionUI f203059e;

    public C70291r2(SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI, long j) {
        this.f203059e = sayHiWithSnsPermissionUI;
        this.f203058d = j;
    }

    public void run() {
        RemarkTagOperateLogStruct remarkTagOperateLogStruct = new RemarkTagOperateLogStruct();
        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI = this.f203059e;
        if (sayHiWithSnsPermissionUI.f202737X == null) {
            sayHiWithSnsPermissionUI.f202737X = new ArrayList<>();
        }
        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI2 = this.f203059e;
        if (sayHiWithSnsPermissionUI2.f202738X0 == null) {
            sayHiWithSnsPermissionUI2.f202738X0 = new ArrayList();
        }
        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI3 = this.f203059e;
        if (sayHiWithSnsPermissionUI3.f202738X0 == null) {
            sayHiWithSnsPermissionUI3.f202738X0 = new ArrayList();
        }
        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI4 = this.f203059e;
        ArrayList<String> arrayList = sayHiWithSnsPermissionUI4.f202737X;
        remarkTagOperateLogStruct.f194329d = remarkTagOperateLogStruct.mo86045b("friendUsername", sayHiWithSnsPermissionUI4.f202778x, true);
        long j = 0;
        remarkTagOperateLogStruct.f194330e = this.f203059e.f202732U0 ? 1 : 0;
        int i = 0;
        int i2 = 0;
        for (String contains : arrayList) {
            if (this.f203059e.f202740Y0.contains(contains)) {
                i2++;
            }
        }
        remarkTagOperateLogStruct.f194332g = (long) i2;
        for (String contains2 : arrayList) {
            if (this.f203059e.f202742Z0.contains(contains2)) {
                j++;
            }
        }
        remarkTagOperateLogStruct.f194334i = j;
        int i3 = 0;
        for (String contains3 : arrayList) {
            if (this.f203059e.f202744b1.contains(contains3)) {
                i3++;
            }
        }
        remarkTagOperateLogStruct.f194333h = (long) i3;
        int i4 = 0;
        for (String contains4 : arrayList) {
            if (this.f203059e.f202743a1.contains(contains4)) {
                i4++;
            }
        }
        remarkTagOperateLogStruct.f194331f = (long) i4;
        long currentTimeMillis = System.currentTimeMillis();
        SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI5 = this.f203059e;
        remarkTagOperateLogStruct.f194338m = currentTimeMillis - sayHiWithSnsPermissionUI5.f202751f1;
        remarkTagOperateLogStruct.f194339n = (long) sayHiWithSnsPermissionUI5.f202734V0;
        remarkTagOperateLogStruct.f194340o = this.f203058d;
        remarkTagOperateLogStruct.f194335j = (long) sayHiWithSnsPermissionUI5.f202736W0;
        int i5 = 0;
        for (String contains5 : arrayList) {
            if (!this.f203059e.f202738X0.contains(contains5)) {
                i5++;
            }
        }
        for (String contains6 : this.f203059e.f202738X0) {
            if (!arrayList.contains(contains6)) {
                i++;
            }
        }
        remarkTagOperateLogStruct.f194341p = 2;
        EditText editText = this.f203059e.f202754h;
        String str = "";
        String trim = (editText == null || editText.getText() == null || this.f203059e.f202754h.getText().toString() == null) ? str : this.f203059e.f202754h.getText().toString().trim();
        if (trim != null) {
            str = trim;
        }
        if (C77702q0.m93719b(this.f203059e.f202728S0)) {
            SayHiWithSnsPermissionUI sayHiWithSnsPermissionUI6 = this.f203059e;
            if (!sayHiWithSnsPermissionUI6.f202724Q0) {
                sayHiWithSnsPermissionUI6.f202730T0 = 3;
            } else if (!C77702q0.m93719b(sayHiWithSnsPermissionUI6.f202726R0)) {
                if (this.f203059e.f202726R0.equals(str)) {
                    this.f203059e.f202730T0 = 1;
                } else if (Util.isNullOrNil(str)) {
                    this.f203059e.f202730T0 = 3;
                } else {
                    this.f203059e.f202730T0 = 2;
                }
            } else if (str.equals(this.f203059e.f202726R0)) {
                this.f203059e.f202730T0 = 3;
            } else {
                this.f203059e.f202730T0 = 2;
            }
        } else if (this.f203059e.f202728S0.equals(str)) {
            this.f203059e.f202730T0 = 3;
        } else {
            this.f203059e.f202730T0 = 2;
        }
        remarkTagOperateLogStruct.f194342q = (long) this.f203059e.f202730T0;
        remarkTagOperateLogStruct.f194337l = (long) i5;
        remarkTagOperateLogStruct.f194336k = (long) i;
        remarkTagOperateLogStruct.mo86054n();
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI", "22865 setAddedLabelCnt = " + i5 + ",setRemovedLabelCnt = " + i + ",oriLabelCnt = " + this.f203059e.f202736W0 + ",opResult = " + this.f203058d + ",totalLabelCnt = " + this.f203059e.f202734V0 + ",selectNewLabelCnt = " + i4 + ",selectAddLabelCnt = " + i3 + ",addRemarkType = " + this.f203059e.f202730T0 + ",scene= " + 2 + ",newLebalCountBySearch = " + i2 + ",searchAddLabelCnt = " + j);
    }
}
