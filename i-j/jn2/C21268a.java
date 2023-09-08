package jn2;

import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReportStruct;

/* renamed from: jn2.a */
public final class C21268a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ShakeActionReportStruct f60080d;

    /* renamed from: e */
    public final /* synthetic */ int f60081e;

    public C21268a(ShakeActionReportStruct shakeActionReportStruct, int i) {
        this.f60080d = shakeActionReportStruct;
        this.f60081e = i;
    }

    public final void run() {
        ShakeActionReportStruct shakeActionReportStruct = this.f60080d;
        if (shakeActionReportStruct == null) {
            shakeActionReportStruct = new ShakeActionReportStruct();
        }
        shakeActionReportStruct.f48563d = this.f60081e;
        shakeActionReportStruct.f48574o = shakeActionReportStruct.mo86045b("SessionID", C21269b.f60082a, true);
        shakeActionReportStruct.f48564e = System.currentTimeMillis();
        shakeActionReportStruct.f48572m = C21269b.f60084c;
        shakeActionReportStruct.f48571l = C21269b.f60083b;
        shakeActionReportStruct.mo86054n();
    }
}
