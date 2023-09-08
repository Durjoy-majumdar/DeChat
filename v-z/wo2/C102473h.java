package wo2;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import java.util.LinkedHashMap;
import java.util.Map;
import op2.C100371a;
import rx3.C13598b0;
import wo2.C102474i;

/* renamed from: wo2.h */
public final class C102473h implements C100371a {

    /* renamed from: a */
    public static final C102473h f301751a = new C102473h();

    /* renamed from: b */
    public final void mo86295b(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
        if (bundle != null) {
            try {
                Parcelable parcelable = bundle.getParcelable("obj");
                if (parcelable != null) {
                    String name = parcelable.getClass().getName();
                    C102474i.C102475a aVar = C102474i.f301752a;
                    SnsMethodCalculate.markStartTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
                    Map<String, C32226l<Parcelable, C13598b0>> map = C102474i.f301753b;
                    SnsMethodCalculate.markEndTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
                    C32226l lVar = (C32226l) ((LinkedHashMap) map).get(name);
                    if (lVar == null) {
                        SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
                        return;
                    }
                    lVar.invoke(parcelable);
                    C102474i.f301752a.mo142082a();
                    Log.m105924i("AdToolsIPCProxy", "clientCall() call success~");
                    SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
                    return;
                }
            } catch (Throwable th) {
                C102474i.f301752a.mo142082a();
                Log.printErrStackTrace("AdToolsIPCProxy", th, "call with error", new Object[0]);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onCallbackFromServer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion$createChannel$builder$1");
    }
}
