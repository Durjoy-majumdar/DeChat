package il1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8479f0;
import kotlin.Result;
import qo3.w$$d;
import wx3.C15601d;

/* renamed from: il1.r */
public final class C9100r implements w$$d {

    /* renamed from: a */
    public final /* synthetic */ C8479f0<C15601d<Boolean>> f28682a;

    public C9100r(C8479f0<C15601d<Boolean>> f0Var) {
        this.f28682a = f0Var;
    }

    public final void onDismiss() {
        Log.m105924i("FinderLiveAnchorCreateNoticeCheckPopupView", "#dialog on dismiss");
        C15601d dVar = (C15601d) this.f28682a.f27484d;
        if (dVar != null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        this.f28682a.f27484d = null;
    }
}
