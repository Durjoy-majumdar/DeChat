package p165hr;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ht1.C46108j1;
import kotlin.Result;
import te3.C50851pn0;
import wx3.C15601d;

/* renamed from: hr.l0 */
public final class C60094l0 implements C46108j1 {

    /* renamed from: a */
    public final /* synthetic */ C15601d<FinderObject> f171472a;

    /* renamed from: b */
    public final /* synthetic */ C60095m0 f171473b;

    /* renamed from: c */
    public final /* synthetic */ String f171474c;

    public C60094l0(C15601d<? super FinderObject> dVar, C60095m0 m0Var, String str) {
        this.f171472a = dVar;
        this.f171473b = m0Var;
        this.f171474c = str;
    }

    /* renamed from: a */
    public void mo71551a(int i, int i2, String str, C50851pn0 pn02) {
        C87412m.m108594g(pn02, "resp");
        if (i == 0 && i2 == 0) {
            C15601d<FinderObject> dVar = this.f171472a;
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(pn02.f139838d));
            return;
        }
        String str2 = this.f171473b.f171475d;
        Log.m105924i(str2, "get last object for " + this.f171474c + " failed");
        this.f171472a.resumeWith(Result.m168114constructorimpl((Object) null));
    }
}
