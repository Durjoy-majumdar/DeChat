package mk1;

import a14.C53916l;
import android.content.Intent;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$g;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;

/* renamed from: mk1.l */
public final class C10927l implements MMFragmentActivity$$g {

    /* renamed from: a */
    public final /* synthetic */ C10906h f32577a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<Boolean> f32578b;

    public C10927l(C10906h hVar, C53916l<? super Boolean> lVar) {
        this.f32577a = hVar;
        this.f32578b = lVar;
    }

    /* renamed from: a */
    public final void mo5702a(int i, Intent intent) {
        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("PRECHECK_RESULT", 0)) : null;
        String str = this.f32577a.f32537d;
        Log.m105924i(str, "precheck result:" + valueOf);
        if (i == -1 && valueOf != null && valueOf.intValue() == 1) {
            C53916l<Boolean> lVar = this.f32578b;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            return;
        }
        C53916l<Boolean> lVar2 = this.f32578b;
        Result.Companion companion2 = Result.Companion;
        lVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
    }
}
