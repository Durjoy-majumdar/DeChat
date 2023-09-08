package p518fb;

import android.text.Editable;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84975p1;
import go3.C87283v;

/* renamed from: fb.k */
public class C86789k extends C87283v {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f251912d;

    /* renamed from: e */
    public final /* synthetic */ C86795q f251913e;

    public C86789k(C86795q qVar, C81925i2 i2Var) {
        this.f251913e = qVar;
        this.f251912d = i2Var;
    }

    public void afterTextChanged(Editable editable) {
        if (!C84975p1.m104769e(editable)) {
            this.f251913e.f251932g.mo121217s(editable.toString(), this.f251912d);
        }
    }
}
