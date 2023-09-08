package vr2;

import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import p200lx.C46900z;
import qo3.C77407n;

/* renamed from: vr2.l */
public class C102249l implements C77407n.C47880p {

    /* renamed from: a */
    public final /* synthetic */ C102251n f301133a;

    public C102249l(C102251n nVar) {
        this.f301133a = nVar;
    }

    public void onDismiss() {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$2");
        C102251n nVar = this.f301133a;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        C46900z zVar = nVar.f301137c;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        ((ScanCodeSheetItemLogic) zVar).mo67083n();
        this.f301133a.mo141818l();
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$2");
    }
}
