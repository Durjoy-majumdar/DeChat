package wz1;

import com.tencent.p014mm.autogen.mmdata.rpt.SolitaireFormatInputEnterReportStruct;
import com.tencent.p014mm.storage.C72963f4;
import wz1.C78757e;

/* renamed from: wz1.f */
public class C78761f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f230491d;

    /* renamed from: e */
    public final /* synthetic */ C78757e f230492e;

    public C78761f(C78757e eVar, C72963f4 f4Var) {
        this.f230492e = eVar;
        this.f230491d = f4Var;
    }

    public void run() {
        C78757e.C78759b remove = this.f230492e.f230479c.remove(Long.valueOf(this.f230491d.getMsgId()));
        if (remove != null) {
            SolitaireFormatInputEnterReportStruct solitaireFormatInputEnterReportStruct = new SolitaireFormatInputEnterReportStruct();
            solitaireFormatInputEnterReportStruct.f194453i = solitaireFormatInputEnterReportStruct.mo86045b("Identifier", remove.f230487d, true);
            solitaireFormatInputEnterReportStruct.f194448d = solitaireFormatInputEnterReportStruct.mo86045b("ChatName", remove.f230484a, true);
            solitaireFormatInputEnterReportStruct.f194449e = this.f230491d.mo108774y2();
            solitaireFormatInputEnterReportStruct.f194450f = remove.f230485b;
            solitaireFormatInputEnterReportStruct.f194451g = 3;
            solitaireFormatInputEnterReportStruct.f194452h = remove.f230486c;
            solitaireFormatInputEnterReportStruct.mo86054n();
        }
    }
}
