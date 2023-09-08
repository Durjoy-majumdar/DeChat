package oo1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import nj3.C76912y0;
import p687sr.C64153e;
import te3.C49098d51;
import te3.C50523nc3;

/* renamed from: oo1.f */
public final class C11654f implements C64153e.C64155b {

    /* renamed from: a */
    public final /* synthetic */ C11625e f34160a;

    /* renamed from: b */
    public final /* synthetic */ C49098d51 f34161b;

    public C11654f(C11625e eVar, C49098d51 d512) {
        this.f34160a = eVar;
        this.f34161b = d512;
    }

    /* renamed from: a */
    public void mo4980a(boolean z) {
        C11625e eVar = this.f34160a;
        boolean z2 = true;
        if (!(eVar.f34104r != null)) {
            boolean z3 = eVar.f34107u;
            C50523nc3 nc32 = this.f34161b.f132128q;
            if (nc32 == null || !nc32.f138532d) {
                z2 = false;
            }
            if (z3) {
                AppCompatActivity appCompatActivity = eVar.f34087a;
                C76912y0.m92773l(appCompatActivity, appCompatActivity.getString(C0966R.string.fq9));
                return;
            }
            String string = z2 ? eVar.f34087a.getString(C0966R.string.mr5) : eVar.f34087a.getString(C0966R.string.dzj);
            C87412m.m108593f(string, "if (isPay) {\n           …toast_tips)\n            }");
            C76912y0.m92773l(eVar.f34087a, string);
        }
    }
}
