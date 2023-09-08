package lo2;

import c14.C54624g;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58100z0;

/* renamed from: lo2.r */
public final class C99567r {

    /* renamed from: a */
    public static final C99567r f291863a = new C99567r();

    /* renamed from: b */
    public static final C58085t0<SnsInfo> f291864b;

    /* renamed from: c */
    public static final C58085t0<SnsInfo> f291865c;

    /* renamed from: d */
    public static final C58085t0<SnsInfo> f291866d;

    static {
        C54624g gVar = C54624g.DROP_OLDEST;
        f291864b = C58017a1.m67173b(0, 1, gVar, 1, (Object) null);
        f291865c = C58017a1.m67173b(0, 1, gVar, 1, (Object) null);
        f291866d = C58017a1.m67173b(0, 1, gVar, 1, (Object) null);
    }

    /* renamed from: a */
    public final void mo138937a(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("onAdComment", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        Log.m105924i("AdInteractHelper", "onAdComment() called with: snsInfo = " + snsInfo);
        ((C58100z0) f291864b).mo82832d(snsInfo);
        SnsMethodCalculate.markEndTimeMs("onAdComment", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    /* renamed from: b */
    public final void mo138938b(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("onAdLike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        Log.m105924i("AdInteractHelper", "onAdLike() called with: snsInfo = " + snsInfo);
        ((C58100z0) f291865c).mo82832d(snsInfo);
        SnsMethodCalculate.markEndTimeMs("onAdLike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }

    /* renamed from: c */
    public final void mo138939c(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("onAdUnlike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
        Log.m105924i("AdInteractHelper", "onAdUnlike() called with: snsInfo = " + snsInfo);
        ((C58100z0) f291866d).mo82832d(snsInfo);
        SnsMethodCalculate.markEndTimeMs("onAdUnlike", "com.tencent.mm.plugin.sns.ad.helper.AdInteractHelper");
    }
}
