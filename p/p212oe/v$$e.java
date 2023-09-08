package p212oe;

import android.os.PowerManager;

/* renamed from: oe.v$$e */
public final /* synthetic */ class v$$e implements PowerManager.OnThermalStatusChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C89205v f257042a;

    public /* synthetic */ v$$e(C89205v vVar) {
        this.f257042a = vVar;
    }

    public final void onThermalStatusChanged(int i) {
        C89205v vVar = this.f257042a;
        vVar.f349668a.f339059f.post(new v$$f(vVar, i));
    }
}
