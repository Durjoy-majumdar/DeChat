package ps2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import j20.C117292a;
import k20.C9556a;
import rx3.C13598b0;

/* renamed from: ps2.s */
public class C100892s implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Intent f295455d;

    /* renamed from: e */
    public final /* synthetic */ Context f295456e;

    public C100892s(Intent intent, Context context) {
        this.f295455d = intent;
        this.f295456e = context;
    }

    public Object invoke(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        String str = (String) obj;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        Log.m105924i("AdLandingPagesParseHelper", "jumpNative() use replaced xml");
        this.f295455d.putExtra("sns_landing_pages_xml", str);
        Context context = this.f295456e;
        Intent intent = this.f295455d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$1", "invoke", "(Ljava/lang/String;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$1", "invoke", "(Ljava/lang/String;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (ADXml.isTwistAdCanvas(str) || ADXml.isShakeAdCanvas(str) || ADXml.isSimpleSharedShakeAd(str)) {
            ((Activity) this.f295456e).overridePendingTransition(0, 0);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        return b0Var;
    }
}
