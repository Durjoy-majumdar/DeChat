package q73;

import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Result;
import kr0.C33983a1;
import wx3.C15601d;

/* renamed from: q73.h0 */
public final class C12147h0 implements C33983a1.C33984a {

    /* renamed from: a */
    public final /* synthetic */ String f35252a;

    /* renamed from: b */
    public final /* synthetic */ C15601d<Boolean> f35253b;

    public C12147h0(String str, C15601d<? super Boolean> dVar) {
        this.f35252a = str;
        this.f35253b = dVar;
    }

    /* renamed from: a */
    public final void mo8657a(int i, String str) {
        Log.m105920e("MicroMsg.WebCanvasStorageLogic", "triggerPreDownload(appId:" + this.f35252a + "), onError(errCode:" + i + ", errMsg:" + str + ')');
        C15601d<Boolean> dVar = this.f35253b;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
    }
}
