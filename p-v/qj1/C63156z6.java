package qj1;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import org.json.JSONObject;
import p671qy.C63344h;
import rx3.C13598b0;

/* renamed from: qj1.z6 */
public final class C63156z6 implements C63344h.C63346b {

    /* renamed from: a */
    public final /* synthetic */ C63122y6 f179203a;

    /* renamed from: qj1.z6$a */
    public static final class C63157a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63122y6 f179204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63157a(C63122y6 y6Var) {
            super(0);
            this.f179204d = y6Var;
        }

        public Object invoke() {
            Log.m105924i(this.f179204d.f179122i, "dynamicCardServerLost");
            C58124b.C7172a.m7372a(this.f179204d.f179119f, C58124b.C58125b.FINDER_LIVE_GAME_PLAY_TOGETHER_BUBBLE_ENV_DEAD, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    public C63156z6(C63122y6 y6Var) {
        this.f179203a = y6Var;
    }

    /* renamed from: a */
    public void mo87817a(String str, JSONObject jSONObject) {
        C87412m.m108594g(str, "action");
        C87412m.m108594g(jSONObject, "params");
        String str2 = this.f179203a.f179122i;
        Log.m105924i(str2, "finderLiveCallback action:" + str);
        if (C87412m.m108589b(str, "dynamicCardServerLost")) {
            C61926c.m72668M(new C63157a(this.f179203a));
        }
    }
}
