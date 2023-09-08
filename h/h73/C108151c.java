package h73;

import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.plugin.walletlock.gesture.p1101ui.GestureGuardLogicUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import g73.C107761f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C64437i63;

/* renamed from: h73.c */
public class C108151c implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ l0$$e f323872d;

    /* renamed from: e */
    public final /* synthetic */ GestureGuardLogicUI f323873e;

    public C108151c(GestureGuardLogicUI gestureGuardLogicUI, l0$$e l0__e) {
        this.f323873e = gestureGuardLogicUI;
        this.f323872d = l0__e;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105924i("MicroMsg.GestureGuardLogicUI", String.format("Scene verifyPattern, errType:%d, errCode:%d, errMsg:%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}));
        GestureGuardLogicUI gestureGuardLogicUI = this.f323873e;
        int i3 = GestureGuardLogicUI.f318298y;
        gestureGuardLogicUI.mo153206I7();
        if (i == 0 && i2 == 0) {
            C107761f.m145992i(((C64437i63) cVar.f127056b.f127083a).f183628d);
            GestureGuardLogicUI gestureGuardLogicUI2 = this.f323873e;
            if (gestureGuardLogicUI2.f318301f == 0) {
                int i4 = gestureGuardLogicUI2.f318316x;
                if (i4 == 1) {
                    WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct.f194681d = 8;
                    wCPaySaftyClickReportStruct.f194682e = 2;
                    wCPaySaftyClickReportStruct.mo86054n();
                } else if (i4 == 2) {
                    WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct2 = new WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct2.f194681d = 10;
                    wCPaySaftyClickReportStruct2.f194682e = 2;
                    wCPaySaftyClickReportStruct2.mo86054n();
                }
            } else {
                String stringExtra = gestureGuardLogicUI2.getIntent().getStringExtra("next_action");
                if ("next_action.modify_pattern".equals(stringExtra)) {
                    WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct3 = new WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct3.f194681d = 5;
                    wCPaySaftyClickReportStruct3.f194682e = 2;
                    wCPaySaftyClickReportStruct3.mo86054n();
                } else if ("next_action.switch_on_pattern".equals(stringExtra)) {
                    WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct4 = new WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct4.f194681d = 4;
                    wCPaySaftyClickReportStruct4.f194682e = 2;
                    wCPaySaftyClickReportStruct4.mo86054n();
                } else {
                    WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct5 = new WCPaySaftyClickReportStruct();
                    wCPaySaftyClickReportStruct5.f194681d = 5;
                    wCPaySaftyClickReportStruct5.f194682e = 2;
                    wCPaySaftyClickReportStruct5.mo86054n();
                }
            }
        } else {
            C47350c cVar2 = cVar;
        }
        l0$$e l0__e = this.f323872d;
        if (l0__e != null) {
            return l0__e.mo1488a(i, i2, str, cVar, yVar);
        }
        return 0;
    }
}
