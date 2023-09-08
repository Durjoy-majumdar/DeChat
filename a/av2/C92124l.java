package av2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.ArrayList;
import p200lx.C46900z;

/* renamed from: av2.l */
public final class C92124l implements C46900z.C46901a {

    /* renamed from: a */
    public final /* synthetic */ C92126r f263714a;

    /* renamed from: b */
    public final /* synthetic */ View f263715b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList<ImageQBarDataBean> f263716c;

    public C92124l(C92126r rVar, View view, ArrayList<ImageQBarDataBean> arrayList) {
        this.f263714a = rVar;
        this.f263715b = view;
        this.f263716c = arrayList;
    }

    /* renamed from: a */
    public final void mo64788a() {
        SnsMethodCalculate.markStartTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$fetchCodeInfo$2$1");
        if (this.f263714a.mo126101d().mo107563h()) {
            C92126r rVar = this.f263714a;
            rVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            rVar.f263723e = true;
            SnsMethodCalculate.markEndTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            C92121j.m115792a(this.f263714a, this.f263715b, this.f263716c);
            this.f263714a.mo126109l();
        }
        SnsMethodCalculate.markEndTimeMs("onFetchedCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt$fetchCodeInfo$2$1");
    }
}
