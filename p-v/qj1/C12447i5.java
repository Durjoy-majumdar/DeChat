package qj1;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.ArrayList;
import qj1.C12322e5;

/* renamed from: qj1.i5 */
public final class C12447i5 implements MMHandler.Callback {

    /* renamed from: d */
    public final /* synthetic */ C12322e5 f35827d;

    public C12447i5(C12322e5 e5Var) {
        this.f35827d = e5Var;
    }

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, LocaleUtil.ITALIAN);
        int i = message.what;
        C12322e5.C12334g gVar = C12322e5.f35497W;
        boolean z = false;
        if (i == C12322e5.f35499Y) {
            Object obj = message.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg> }");
            ArrayList arrayList = (ArrayList) obj;
            C12322e5 e5Var = this.f35827d;
            if (message.arg1 == 1) {
                z = true;
            }
            e5Var.mo12035r1(arrayList, true, z);
        } else if (i == C12322e5.f35500Z) {
            Object obj2 = message.obj;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg> }");
            this.f35827d.mo12035r1((ArrayList) obj2, false, message.arg1 == 1);
        } else if (i == C12322e5.f35501p0) {
            Object obj3 = message.obj;
            C87412m.m108592e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.finder.live.model.IFinderLiveMsg> }");
            this.f35827d.mo12033p1((ArrayList) obj3);
        }
        return true;
    }
}
