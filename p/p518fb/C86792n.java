package p518fb;

import com.tencent.luggage.game.widget.input.WAGamePanelInputEditText;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82540i0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84983t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import p912nb.C88909b;

/* renamed from: fb.n */
public class C86792n implements C84983t0.C84992k {

    /* renamed from: a */
    public final /* synthetic */ WAGamePanelInputEditText f251923a;

    /* renamed from: b */
    public final /* synthetic */ C81925i2 f251924b;

    /* renamed from: c */
    public final /* synthetic */ C88909b f251925c;

    /* renamed from: d */
    public final /* synthetic */ float f251926d;

    /* renamed from: e */
    public final /* synthetic */ int f251927e;

    /* renamed from: f */
    public final /* synthetic */ C86795q f251928f;

    public C86792n(C86795q qVar, WAGamePanelInputEditText wAGamePanelInputEditText, C81925i2 i2Var, C88909b bVar, float f, int i) {
        this.f251928f = qVar;
        this.f251923a = wAGamePanelInputEditText;
        this.f251924b = i2Var;
        this.f251925c = bVar;
        this.f251926d = f;
        this.f251927e = i;
    }

    /* renamed from: a */
    public void mo117902a(int i) {
        if (2 == i) {
            C86780b bVar = this.f251928f.f251933h;
            String obj = this.f251923a.getEditableText().toString();
            C81925i2 i2Var = this.f251924b;
            bVar.getClass();
            if (i2Var.isRunning()) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("errMsg", "ok");
                hashMap.put("value", obj);
                bVar.mo115165o(hashMap);
                bVar.mo115194p(i2Var);
                bVar.mo115158h();
            }
            C82540i0 i0Var = new C82540i0();
            C81925i2 i2Var2 = this.f251924b;
            C83780d1 l0 = i2Var2.mo114341l0();
            C87412m.m108594g(l0, "page");
            i0Var.mo114873s(0, i2Var2, l0, (Integer) null);
            return;
        }
        int height = this.f251925c.getHeight();
        Log.m105925i("MicroMsg.WAGameJsApiShowKeyboard", "onVisibilityChanged state(%d),inputPanelHeight(%d),density(%f).", Integer.valueOf(i), Integer.valueOf(height), Float.valueOf(this.f251926d));
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("height", Float.valueOf(((float) height) / this.f251926d));
        this.f251924b.mo109647a(this.f251927e, this.f251928f.mo115112m("ok", hashMap2));
        C82540i0 i0Var2 = new C82540i0();
        C81925i2 i2Var3 = this.f251924b;
        C83780d1 l05 = i2Var3.mo114341l0();
        C87412m.m108594g(l05, "page");
        i0Var2.mo114873s(height, i2Var3, l05, (Integer) null);
    }
}
