package f22;

import com.tencent.p014mm.autogen.mmdata.rpt.MultiDeleteContactsReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: f22.i */
public final class C7977i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f26657d;

    /* renamed from: e */
    public final /* synthetic */ String f26658e;

    public C7977i(long j, String str) {
        this.f26657d = j;
        this.f26658e = str;
    }

    public final void run() {
        MultiDeleteContactsReportStruct multiDeleteContactsReportStruct = new MultiDeleteContactsReportStruct();
        multiDeleteContactsReportStruct.f10007d = this.f26657d;
        multiDeleteContactsReportStruct.f10008e = multiDeleteContactsReportStruct.mo86045b("actionInfo", this.f26658e, true);
        multiDeleteContactsReportStruct.mo86054n();
        Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "24832 ,action = " + multiDeleteContactsReportStruct.f10007d + ",actionInfo = " + multiDeleteContactsReportStruct.f10008e);
    }
}
