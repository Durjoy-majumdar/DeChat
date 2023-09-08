package com.tencent.p014mm.plugin.profile.p088ui;

import android.widget.EditText;
import com.tencent.p014mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import sf0.C77702q0;

/* renamed from: com.tencent.mm.plugin.profile.ui.w2 */
public class C70299w2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f203069d;

    /* renamed from: e */
    public final /* synthetic */ SayHiWithSnsPermissionUI2 f203070e;

    public C70299w2(SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2, long j) {
        this.f203070e = sayHiWithSnsPermissionUI2;
        this.f203069d = j;
    }

    public void run() {
        RemarkTagOperateLogStruct remarkTagOperateLogStruct = new RemarkTagOperateLogStruct();
        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI2 = this.f203070e;
        if (sayHiWithSnsPermissionUI2.f202814H == null) {
            sayHiWithSnsPermissionUI2.f202814H = new ArrayList<>();
        }
        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI22 = this.f203070e;
        if (sayHiWithSnsPermissionUI22.f202836X == null) {
            sayHiWithSnsPermissionUI22.f202836X = new ArrayList();
        }
        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI23 = this.f203070e;
        if (sayHiWithSnsPermissionUI23.f202836X == null) {
            sayHiWithSnsPermissionUI23.f202836X = new ArrayList();
        }
        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI24 = this.f203070e;
        ArrayList<String> arrayList = sayHiWithSnsPermissionUI24.f202814H;
        remarkTagOperateLogStruct.f194329d = remarkTagOperateLogStruct.mo86045b("friendUsername", sayHiWithSnsPermissionUI24.f202858t, true);
        long j = 0;
        remarkTagOperateLogStruct.f194330e = this.f203070e.f202830U ? 1 : 0;
        int i = 0;
        int i2 = 0;
        for (String contains : arrayList) {
            if (this.f203070e.f202838Y.contains(contains)) {
                i2++;
            }
        }
        remarkTagOperateLogStruct.f194332g = (long) i2;
        for (String contains2 : arrayList) {
            if (this.f203070e.f202840Z.contains(contains2)) {
                j++;
            }
        }
        remarkTagOperateLogStruct.f194334i = j;
        int i3 = 0;
        for (String contains3 : arrayList) {
            if (this.f203070e.f202863x0.contains(contains3)) {
                i3++;
            }
        }
        remarkTagOperateLogStruct.f194333h = (long) i3;
        int i4 = 0;
        for (String contains4 : arrayList) {
            if (this.f203070e.f202854p0.contains(contains4)) {
                i4++;
            }
        }
        remarkTagOperateLogStruct.f194331f = (long) i4;
        long currentTimeMillis = System.currentTimeMillis();
        SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI25 = this.f203070e;
        remarkTagOperateLogStruct.f194338m = currentTimeMillis - sayHiWithSnsPermissionUI25.f202829T0;
        remarkTagOperateLogStruct.f194339n = (long) sayHiWithSnsPermissionUI25.f202832V;
        remarkTagOperateLogStruct.f194340o = this.f203069d;
        remarkTagOperateLogStruct.f194335j = (long) sayHiWithSnsPermissionUI25.f202834W;
        int i5 = 0;
        for (String contains5 : arrayList) {
            if (!this.f203070e.f202836X.contains(contains5)) {
                i5++;
            }
        }
        for (String contains6 : this.f203070e.f202836X) {
            if (!arrayList.contains(contains6)) {
                i++;
            }
        }
        remarkTagOperateLogStruct.f194341p = 2;
        EditText editText = this.f203070e.f202845e;
        String str = "";
        String trim = (editText == null || editText.getText() == null || this.f203070e.f202845e.getText().toString() == null) ? str : this.f203070e.f202845e.getText().toString().trim();
        if (trim != null) {
            str = trim;
        }
        if (C77702q0.m93719b(this.f203070e.f202826S)) {
            SayHiWithSnsPermissionUI2 sayHiWithSnsPermissionUI26 = this.f203070e;
            if (!sayHiWithSnsPermissionUI26.f202822Q) {
                sayHiWithSnsPermissionUI26.f202828T = 3;
            } else if (!C77702q0.m93719b(sayHiWithSnsPermissionUI26.f202824R)) {
                if (this.f203070e.f202824R.equals(str)) {
                    this.f203070e.f202828T = 1;
                } else if (Util.isNullOrNil(str)) {
                    this.f203070e.f202828T = 3;
                } else {
                    this.f203070e.f202828T = 2;
                }
            } else if (str.equals(this.f203070e.f202824R)) {
                this.f203070e.f202828T = 3;
            } else {
                this.f203070e.f202828T = 2;
            }
        } else if (this.f203070e.f202826S.equals(str)) {
            this.f203070e.f202828T = 3;
        } else {
            this.f203070e.f202828T = 2;
        }
        remarkTagOperateLogStruct.f194342q = (long) this.f203070e.f202828T;
        remarkTagOperateLogStruct.f194337l = (long) i5;
        remarkTagOperateLogStruct.f194336k = (long) i;
        remarkTagOperateLogStruct.mo86054n();
        Log.m105924i("MicroMsg.SayHiWithSnsPermissionUI2", "22865 setAddedLabelCnt = " + i5 + ",setRemovedLabelCnt = " + i + ",oriLabelCnt = " + this.f203070e.f202834W + ",opResult = " + this.f203069d + ",totalLabelCnt = " + this.f203070e.f202832V + ",selectNewLabelCnt = " + i4 + ",selectAddLabelCnt = " + i3 + ",addRemarkType = " + this.f203070e.f202828T + ",scene= " + 2 + ",newLebalCountBySearch = " + i2 + ",searchAddLabelCnt = " + j);
    }
}
