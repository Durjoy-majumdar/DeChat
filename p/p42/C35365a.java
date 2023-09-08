package p42;

import com.tencent.p014mm.plugin.magicbrush.C30187e0;
import com.tencent.p014mm.plugin.magicbrush.C30197h1;
import com.tencent.p014mm.plugin.magicbrush.C30217o0;
import com.tencent.p014mm.plugin.magicbrush.C30223r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import org.json.JSONObject;
import we0.C53156a;

/* renamed from: p42.a */
public final class C35365a extends C30217o0 implements C53156a.C38082b {

    /* renamed from: e */
    public C53156a f94699e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35365a(C30197h1 h1Var) {
        super(h1Var);
        C87412m.m108594g(h1Var, "service");
    }

    /* renamed from: a */
    public void mo12953a(C53156a.C53157a aVar, C53156a.C53157a aVar2) {
        Log.m105924i("MBOnOrientationChangeEventImpl", "onOrientationsChange, lastOrientation:" + aVar + ", newOrientation: " + aVar2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orientation", aVar2);
        C30187e0 e0Var = this.f81653d;
        C30223r0 r0Var = C30223r0.OnOrientationChange;
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "data.toString()");
        e0Var.mo57213PY(r0Var, jSONObject2);
    }

    /* renamed from: b */
    public void mo57232b() {
        if (this.f94699e == null) {
            this.f94699e = new C53156a(MMApplicationContext.getContext(), this);
        }
        C53156a aVar = this.f94699e;
        if (aVar != null) {
            aVar.enable();
        }
    }

    /* renamed from: c */
    public void mo57233c() {
        C53156a aVar = this.f94699e;
        if (aVar != null) {
            aVar.disable();
        }
        this.f94699e = null;
    }
}
