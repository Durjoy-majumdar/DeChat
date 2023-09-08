package l70;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import e42.C86428f;
import fy3.C32224a;
import fy3.C32226l;
import g70.C87164i;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import m70.C88702b;
import org.json.JSONObject;
import rx3.C13598b0;
import zp3.C23564m;

/* renamed from: l70.a */
public final class C88386a<T extends C86428f<View>> extends C88702b<View, T> {

    /* renamed from: l70.a$a */
    public static final class C88387a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88386a<T> f255378d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f255379e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<View, C13598b0> f255380f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C88387a(C88386a<T> aVar, JSONObject jSONObject, C32226l<? super View, C13598b0> lVar) {
            super(0);
            this.f255378d = aVar;
            this.f255379e = jSONObject;
            this.f255380f = lVar;
        }

        public Object invoke() {
            C86428f fVar = (C86428f) this.f255378d.f251227a;
            Activity e0 = fVar != null ? fVar.mo8720e0() : null;
            C87412m.m108591d(e0);
            MagicSclViewContainer magicSclViewContainer = new MagicSclViewContainer(e0, (AttributeSet) null, 0, 6, (C8480h) null);
            int s = this.f255378d.mo123142s(this.f255379e);
            magicSclViewContainer.f157378i = s;
            C87164i iVar = magicSclViewContainer.f157373d;
            if (iVar != null) {
                iVar.f252800p = s;
            }
            String optString = this.f255379e.optString("frameSetName");
            C87412m.m108593f(optString, "data.optString(\"frameSetName\")");
            magicSclViewContainer.f157377h = optString;
            this.f255380f.invoke(magicSclViewContainer);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: e */
    public String mo16e() {
        return "insertFrameSet";
    }

    /* renamed from: w */
    public void mo120879w(JSONObject jSONObject, C32226l<? super View, C13598b0> lVar) {
        C87412m.m108594g(jSONObject, "data");
        C87412m.m108594g(lVar, "callback");
        C23564m.m28136f(new C88387a(this, jSONObject, lVar));
    }
}
