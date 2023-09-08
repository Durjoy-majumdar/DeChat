package p160gy;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.C19934c;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.lang.ref.WeakReference;
import p166hy.C117128b0;
import p200lx.C99716u;
import ps2.C100891r;
import vr2.C102251n;
import vr2.C102258o;

@C86522b
/* renamed from: gy.i */
public class C98284i extends C86301e implements C117128b0 {

    /* renamed from: gy.i$a */
    public class C98285a implements C102251n.C102257c {

        /* renamed from: a */
        public final /* synthetic */ C117128b0.C98560a f288114a;

        public C98285a(C98284i iVar, C117128b0.C98560a aVar) {
            this.f288114a = aVar;
        }

        /* renamed from: a */
        public void mo131644a(String str, boolean z, String str2, Bundle bundle) {
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.feature.sns.AdQRScanService$1");
            try {
                C117128b0.C98560a aVar = this.f288114a;
                if (aVar != null) {
                    aVar.mo137932a(str, z, str2, bundle);
                }
            } catch (Throwable unused) {
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.feature.sns.AdQRScanService$1");
        }
    }

    /* renamed from: FO */
    public String mo137574FO(String str) {
        SnsMethodCalculate.markStartTimeMs("getAdImgFilePath", "com.tencent.mm.feature.sns.AdQRScanService");
        String str2 = C100891r.m132212g() + C100891r.m132215j("adId", str);
        SnsMethodCalculate.markEndTimeMs("getAdImgFilePath", "com.tencent.mm.feature.sns.AdQRScanService");
        return str2;
    }

    /* renamed from: Lp */
    public void mo137575Lp(Context context, String str, String str2, String str3, C117128b0.C98560a aVar) {
        String str4 = str2;
        SnsMethodCalculate.markStartTimeMs("onClickDirect", "com.tencent.mm.feature.sns.AdQRScanService");
        C102251n nVar = new C102251n(context, str3);
        C98285a aVar2 = new C98285a(this, aVar);
        SnsMethodCalculate.markStartTimeMs("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        if (nVar.f301150p == null) {
            nVar.f301150p = new Bundle();
        }
        nVar.f301150p.putInt("qr_url_type_key", nVar.f301141g);
        WeakReference<Context> weakReference = nVar.f301149o;
        if (weakReference == null) {
            aVar2.mo131644a(str4, false, "contextRef is null", nVar.f301150p);
            nVar.mo141818l();
            Log.m105928w("SnsAdQRHelper", "onClickDirectForSearchJsapi, contextRef is null");
            SnsMethodCalculate.markEndTimeMs("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        } else {
            Context context2 = weakReference.get();
            if (context2 == null) {
                aVar2.mo131644a(str4, false, "context is null", nVar.f301150p);
                nVar.mo141818l();
                Log.m105928w("SnsAdQRHelper", "onClickDirectForSearchJsapi, contextRef get is null");
                SnsMethodCalculate.markEndTimeMs("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
            } else {
                nVar.f301142h = str;
                nVar.f301143i = str4;
                Log.m105924i("SnsAdQRHelper", "onClickDirectForSearchJsapi, filePath is " + nVar.f301142h);
                if (TextUtils.isEmpty(nVar.f301142h)) {
                    aVar2.mo131644a(str4, false, "imgPath is empty", nVar.f301150p);
                    nVar.mo141818l();
                    SnsMethodCalculate.markEndTimeMs("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    ((C19934c) ((C99716u) C86312j.m106911c(C99716u.class)).wa0()).mo27315b(context2, currentTimeMillis, nVar.f301142h, new C102258o(nVar, aVar2, str4));
                    SnsMethodCalculate.markEndTimeMs("onClickDirectForSearchJsapi", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClickDirect", "com.tencent.mm.feature.sns.AdQRScanService");
    }

    public void uo0(String str, int i, String str2, int i2) {
        SnsMethodCalculate.markStartTimeMs("doReportQRFailed", "com.tencent.mm.feature.sns.AdQRScanService");
        C102251n.m134812p(i, (String) null, str2, str, i2);
        SnsMethodCalculate.markEndTimeMs("doReportQRFailed", "com.tencent.mm.feature.sns.AdQRScanService");
    }
}
