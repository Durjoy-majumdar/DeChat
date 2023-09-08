package wk1;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import ok1.C62042e;
import wk1.C15432i;

/* renamed from: wk1.j */
public final class C15435j {

    /* renamed from: a */
    public C15432i.C15433a.C15434a f41876a;

    /* renamed from: b */
    public C15477s f41877b;

    /* renamed from: c */
    public C15478t f41878c;

    public C15435j() {
        C15432i.C15433a.C15434a aVar = r0;
        C15432i.C15433a.C15434a aVar2 = new C15432i.C15433a.C15434a(0, 0, 0, 0, 0, 0, 0, 0, 0, (CharSequence) null, 0, 0, false, (Drawable) null, 0, 0, 0, false, 262143, (C8480h) null);
        this.f41876a = aVar;
    }

    /* renamed from: a */
    public final C15432i mo14250a(View view) {
        C15432i.C15433a.C15434a aVar = this.f41876a;
        C15440n nVar = C15440n.f41895a;
        float o = ((float) (aVar.f41857a + aVar.f41859c + aVar.f41871o + aVar.f41861e)) + nVar.mo14266o(aVar.f41866j.toString(), (float) this.f41876a.f41868l);
        C15432i.C15433a.C15434a aVar2 = this.f41876a;
        aVar.f41875s = (int) (o + ((float) aVar2.f41860d) + ((float) aVar2.f41858b));
        C15477s sVar = this.f41877b;
        C15478t tVar = this.f41878c;
        if (sVar == null || tVar == null) {
            C15432i iVar = new C15432i(C15440n.m14439b(nVar, this.f41876a.f41875s, 0, 2, (Object) null));
            C15432i.C15433a.C15434a aVar3 = this.f41876a;
            C87412m.m108594g(aVar3, "<set-?>");
            iVar.f41856d = aVar3;
            return iVar;
        }
        C15479u uVar = new C15479u(C15440n.m14439b(nVar, this.f41876a.f41875s, 0, 2, (Object) null));
        uVar.f41997o = view;
        C15432i.C15433a.C15434a aVar4 = this.f41876a;
        C87412m.m108594g(aVar4, "<set-?>");
        uVar.f41856d = aVar4;
        uVar.f41992g = sVar;
        uVar.f41993h = tVar;
        return uVar;
    }

    /* renamed from: b */
    public final C15435j mo14251b(int i, String str, C15482w<Integer> wVar) {
        C87412m.m108594g(str, "textContent");
        C87412m.m108594g(wVar, "config");
        this.f41876a.f41863g = wVar.mo14224i(Integer.valueOf(i));
        this.f41876a.f41864h = wVar.mo14217b(Integer.valueOf(i));
        this.f41876a.f41867k = wVar.mo14216a(Integer.valueOf(i));
        this.f41876a.f41868l = wVar.mo14221f(Integer.valueOf(i));
        this.f41876a.f41869m = wVar.mo14218c(Integer.valueOf(i)) == 1;
        this.f41877b = wVar.mo14225j(i);
        this.f41878c = wVar.mo14220e(i);
        int[] d = wVar.mo14219d(Integer.valueOf(i));
        if (d.length == 2) {
            C15432i.C15433a.C15434a aVar = this.f41876a;
            aVar.f41871o = d[0];
            aVar.f41872p = d[1];
            C62042e eVar = C62042e.f176370a;
            eVar.mo86998D1("FinderLiveLevelImageSpan", "setLevel iconSize:" + d[0] + '-' + d[1]);
        }
        C15432i.C15433a.C15434a aVar2 = this.f41876a;
        aVar2.f41870n = C15432i.f41854e.mo14246a(wVar.mo14223h(Integer.valueOf(i)), (((float) aVar2.f41872p) * 2.0f) / ((float) 30));
        C15432i.C15433a.C15434a aVar3 = this.f41876a;
        aVar3.getClass();
        aVar3.f41866j = str;
        return this;
    }

    /* renamed from: c */
    public final C15435j mo14252c(String str) {
        if (!(str == null || str.length() == 0)) {
            try {
                this.f41876a.f41862f = Color.parseColor(str);
            } catch (Exception e) {
                this.f41876a.f41862f = 0;
                Log.m105920e("FinderLiveLevelImageSpan", e + ",serverColor:" + str);
            }
        }
        return this;
    }
}
