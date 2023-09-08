package tf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;
import qo3.C63304v;
import wx3.C15601d;

/* renamed from: tf0.q0 */
public final class C13886q0 implements C63304v {

    /* renamed from: a */
    public final /* synthetic */ C15601d<Boolean> f39047a;

    public C13886q0(C15601d<? super Boolean> dVar) {
        this.f39047a = dVar;
    }

    /* renamed from: a */
    public final void mo13299a(boolean z, int[] iArr) {
        Log.m105924i("Finder.FinderCommonFeatureService", "#showWeCoinNotEnoughDialog result=" + z + ", text=" + iArr);
        this.f39047a.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
    }
}
