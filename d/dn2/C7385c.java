package dn2;

import com.tencent.p014mm.autogen.mmdata.rpt.NewPersionalQRCodeReportStruct;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;
import wc3.C78541w;

/* renamed from: dn2.c */
public final class C7385c extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7373a f25524d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7385c(C7373a aVar) {
        super(1);
        this.f25524d = aVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        int e = this.f25524d.f25506b.mo6182e();
        NewPersionalQRCodeReportStruct newPersionalQRCodeReportStruct = new NewPersionalQRCodeReportStruct();
        newPersionalQRCodeReportStruct.f10019d = (long) 22;
        newPersionalQRCodeReportStruct.f10020e = C31543z5.m39453c();
        newPersionalQRCodeReportStruct.f10021f = (long) e;
        newPersionalQRCodeReportStruct.mo86054n();
        C7373a aVar = this.f25524d;
        ((C78541w) C86312j.m106911c(C78541w.class)).mo108490SX(aVar.f25505a, str, aVar.f25506b.mo6180c(), new C7383b(str, this.f25524d));
        return C13598b0.f38549a;
    }
}
