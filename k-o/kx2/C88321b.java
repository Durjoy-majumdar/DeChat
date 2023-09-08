package kx2;

import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e42.C7596h;
import fy3.C32224a;
import g70.C87164i;
import gy3.C87412m;
import gy3.C87413o;
import h70.C87459d;
import o40.C61926c;
import org.json.JSONException;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: kx2.b */
public abstract class C88321b extends C88325e {

    /* renamed from: kx2.b$a */
    public static final class C88322a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MagicSclViewContainer f255311d;

        /* renamed from: e */
        public final /* synthetic */ C88321b f255312e;

        /* renamed from: f */
        public final /* synthetic */ C7596h f255313f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88322a(MagicSclViewContainer magicSclViewContainer, C88321b bVar, C7596h hVar) {
            super(0);
            this.f255311d = magicSclViewContainer;
            this.f255312e = bVar;
            this.f255313f = hVar;
        }

        public Object invoke() {
            if (this.f255311d.getCustomViewContainer() == null) {
                Log.m105928w("MicroMsg.MBBaseOperateCoverViewJsApi", "MagicCardCustomViewContainer null");
                this.f255312e.mo122711s("coverView null");
            } else {
                try {
                    C88321b bVar = this.f255312e;
                    C7596h hVar = this.f255313f;
                    bVar.getClass();
                    C87412m.m108594g(hVar, "data");
                    this.f255312e.mo122710t(this.f255313f, this.f255311d, hVar.getInt("viewId"));
                } catch (JSONException unused) {
                    Log.m105928w("MicroMsg.MBBaseOperateCoverViewJsApi", "invalid viewId");
                    this.f255312e.mo122711s("invalid viewId");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        C87412m.m108594g(hVar, "data");
        MagicSclViewContainer magicSclViewContainer = null;
        String optString = hVar.optString("frameSetId", "");
        if (!Util.isNullOrNil(optString)) {
            C87412m.m108591d(optString);
            C87164i uo = ((C87459d) C86312j.m106911c(C87459d.class)).mo58574uo(optString);
            if (uo != null) {
                magicSclViewContainer = uo.f252796l;
            }
        }
        if (magicSclViewContainer == null) {
            Log.m105928w("MicroMsg.MBBaseOperateCoverViewJsApi", "invoke JsApi failed, rootView is null");
            mo122711s("rootView is null");
            return;
        }
        C61926c.m72668M(new C88322a(magicSclViewContainer, this, hVar));
    }

    /* renamed from: s */
    public final void mo122711s(String str) {
        C87412m.m108594g(str, "errMsg");
        new C7596h();
        if (Util.isNullOrNil(str)) {
            mo120840p().invoke(mo120844i());
        } else {
            mo120840p().invoke(mo120842g(1, str));
        }
    }

    /* renamed from: t */
    public abstract void mo122710t(JSONObject jSONObject, MagicSclViewContainer magicSclViewContainer, int i);
}
