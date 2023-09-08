package ak1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: ak1.f */
public final class C54066f {

    /* renamed from: a */
    public long f151417a;

    /* renamed from: b */
    public long f151418b;

    /* renamed from: a */
    public final void mo74750a(String str) {
        C87412m.m108594g(str, "adVideoId");
        if (TextUtils.isEmpty(str)) {
            Log.m105924i("FinderAdVideoReporter", "reportLivingVideoExit return for adVideoId:" + str);
            return;
        }
        Log.m105924i("FinderAdVideoReporter", "reportLivingVideoExit return for livingVideoEnter:0");
    }
}
