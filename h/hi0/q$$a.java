package hi0;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81334h;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32226l;
import java.util.Locale;
import ki0.C88153c;
import lp3.C46888b;
import rx3.C13598b0;

public final /* synthetic */ class q$$a implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ C87504q f253505d;

    /* renamed from: e */
    public final /* synthetic */ C88153c f253506e;

    /* renamed from: f */
    public final /* synthetic */ C46888b f253507f;

    public /* synthetic */ q$$a(C87504q qVar, C88153c cVar, C46888b bVar) {
        this.f253505d = qVar;
        this.f253506e = cVar;
        this.f253507f = bVar;
    }

    public final Object invoke(Object obj) {
        int i;
        C87504q qVar = this.f253505d;
        C88153c cVar = this.f253506e;
        C46888b bVar = this.f253507f;
        Boolean bool = (Boolean) obj;
        qVar.getClass();
        if (!C86709a0.m107522a()) {
            String format = String.format(Locale.ENGLISH, "appId[%s] packageKey[%s] packageType[%d] version[%d]", new Object[]{cVar.field_appId, cVar.field_packageKey, Integer.valueOf(cVar.field_packageType), Integer.valueOf(cVar.field_version)});
            qVar.f253504b.mo121961t();
            Log.m105920e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "predownload normal pkg onResult AccountNotReady " + format);
            return C13598b0.f38549a;
        }
        if (bool.booleanValue() && !TextUtils.isEmpty(cVar.field_localRequestKey)) {
            C81334h.f238795a.mo113612c(cVar);
        } else if (!bool.booleanValue() && (((i = cVar.field_retryTimes) <= 0 || cVar.field_retriedCount + 1 > i) && !TextUtils.isEmpty(cVar.field_localRequestKey))) {
            C81334h.f238795a.mo113611b(cVar);
        }
        bVar.resume();
        return C13598b0.f38549a;
    }
}
