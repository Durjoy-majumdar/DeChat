package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.p136ui.C74785j2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C50175kt;

/* renamed from: com.tencent.mm.ui.r */
public class C45037r implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ CheckCanSubscribeBizUI f122143d;

    public C45037r(CheckCanSubscribeBizUI checkCanSubscribeBizUI) {
        this.f122143d = checkCanSubscribeBizUI;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        C50175kt ktVar = (C50175kt) cVar.f127056b.f127083a;
        CheckCanSubscribeBizUI checkCanSubscribeBizUI = this.f122143d;
        String str2 = ktVar.f137029d;
        checkCanSubscribeBizUI.f121122q = str2;
        if (i == 0 && i2 == 0 && !Util.isNullOrNil(str2) && !Util.isNullOrNil(ktVar.f137030e)) {
            Log.m105924i("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback ok");
            CheckCanSubscribeBizUI checkCanSubscribeBizUI2 = this.f122143d;
            checkCanSubscribeBizUI2.f121113e = ktVar.f137030e;
            checkCanSubscribeBizUI2.f121127v = ktVar.f137031f;
            CheckCanSubscribeBizUI.m49408H7(checkCanSubscribeBizUI2);
            return 0;
        } else if (C74785j2.C6981a.m7247a(this.f122143d, i, i2, str, 7)) {
            Log.m105920e("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback RESULT_CODE_NORMAL_ERROR");
            this.f122143d.setResult(5);
            this.f122143d.finish();
            return 0;
        } else {
            Log.m105920e("MicroMsg.CheckCanSubscribeBizUI", "RunCgi.run callback RESULT_CODE_FORBID");
            this.f122143d.mo69831I7(i, i2, str);
            this.f122143d.setResult(3);
            this.f122143d.finish();
            return 0;
        }
    }
}
