package ll3;

import com.tencent.p014mm.autogen.mmdata.rpt.TopSessionInfoReportStruct;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import eb0.C45629t0;
import eb0.C97625j3;
import java.util.Collection;

/* renamed from: ll3.a */
public final class C76703a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Collection<C72976h2> f224420d;

    /* renamed from: e */
    public final /* synthetic */ long f224421e;

    /* renamed from: f */
    public final /* synthetic */ long f224422f;

    /* renamed from: g */
    public final /* synthetic */ long f224423g;

    public C76703a(Collection<? extends C72976h2> collection, long j, long j2, long j3) {
        this.f224420d = collection;
        this.f224421e = j;
        this.f224422f = j2;
        this.f224423g = j3;
    }

    public final void run() {
        long j;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        for (C72976h2 h2Var : this.f224420d) {
            if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69754Z(h2Var)) {
                int c = C45629t0.m50816c(h2Var.getUsername());
                if (c == 1 || c == 2) {
                    j = 1;
                    j2++;
                } else if (c == 3 || c == 4) {
                    j = 1;
                    j3++;
                } else if (c != 6) {
                    j = 1;
                } else {
                    j = 1;
                    j4++;
                }
                if (h2Var.mo108786G2() > 0 || h2Var.mo108788I2() > 0) {
                    j5 += j;
                }
            } else if (h2Var.mo108786G2() > 0 || h2Var.mo108788I2() > 0) {
                j6++;
            }
        }
        TopSessionInfoReportStruct topSessionInfoReportStruct = new TopSessionInfoReportStruct();
        topSessionInfoReportStruct.f194623d = j2;
        topSessionInfoReportStruct.f194624e = j3;
        topSessionInfoReportStruct.f194625f = j4;
        topSessionInfoReportStruct.f194626g = j5;
        topSessionInfoReportStruct.f194627h = j6;
        topSessionInfoReportStruct.f194628i = this.f224421e;
        topSessionInfoReportStruct.f194629j = this.f224422f;
        topSessionInfoReportStruct.mo86054n();
        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putLong("top_session_info_report", this.f224423g);
    }
}
