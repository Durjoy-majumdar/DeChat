package er1;

import android.util.Base64;
import cl1.C0702z0;
import cl1.C39975j;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58052j1;
import d14.C58087u0;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C87412m;
import o40.C61926c;
import pe3.C89349b;
import te3.C50317lw0;
import te3.C51977xi;

/* renamed from: er1.k */
public final class C45684k {

    /* renamed from: a */
    public static final C45684k f123488a = new C45684k();

    /* renamed from: a */
    public final void mo71180a(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "str");
        Log.m105924i(str, "diskDataLog " + str2);
    }

    /* renamed from: b */
    public final boolean mo71181b(C45795b bVar) {
        Class cls = C39975j.class;
        C87412m.m108594g(bVar, "<this>");
        C32444a aVar = C32444a.f86121a;
        boolean z = false;
        boolean z2 = C32444a.f86063H2.mo60266n().intValue() == 1;
        if (z2 || ((Boolean) ((C58052j1) ((C39975j) bVar.mo71262a(cls)).f107166f).getValue()).booleanValue()) {
            z = true;
        }
        Log.m105924i("Finder.BoxCommon", "svr enable:" + ((Boolean) ((C58052j1) ((C39975j) bVar.mo71262a(cls)).f107166f).getValue()).booleanValue() + ", local enable:" + z2);
        return z;
    }

    /* renamed from: c */
    public final String mo71182c(C51977xi xiVar) {
        String str;
        C87412m.m108594g(xiVar, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("hashCode:");
        sb.append(xiVar.hashCode());
        sb.append(", liveId:");
        sb.append(C61926c.m72691p(xiVar.f144666f));
        sb.append(", boxId:");
        C50317lw0 lw02 = xiVar.f144664d;
        String str2 = null;
        sb.append(lw02 != null ? lw02.f137677e : null);
        sb.append(", lastEnterTimeStamp:");
        sb.append(xiVar.f144668h);
        sb.append(", dataSize:");
        sb.append(xiVar.f144667g.size());
        sb.append(", lastBuffer:");
        C89349b bVar = xiVar.f144665e;
        if (bVar != null) {
            try {
                str = Base64.encodeToString(bVar.mo123703f(), 2);
                C87412m.m108593f(str, "encodeToString(this.toByteArray(), Base64.NO_WRAP)");
            } catch (Throwable unused) {
                Log.m105924i("Finder", "ByteString encode failed.");
                str = "";
            }
            str2 = str;
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo71183d(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "str");
        Log.m105924i(str, "mainFlowLog " + str2);
    }

    /* renamed from: e */
    public final void mo71184e(String str, String str2) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(str2, "str");
        Log.m105924i(str, "memDataLog " + str2);
    }

    /* renamed from: f */
    public final void mo71185f(String str, int i, C45795b bVar) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(bVar, "buContext");
        C32444a aVar = C32444a.f86121a;
        boolean z = false;
        boolean z2 = C32444a.f86063H2.mo60266n().intValue() == 1;
        boolean u = C61926c.m72696u(i, 16);
        Log.m105924i("Finder.BoxCommon", "setBoxEnableByFlag tag:" + str + ", flag:" + i + ", enable:" + u);
        C58087u0<Boolean> u0Var = ((C39975j) bVar.mo71262a(C39975j.class)).f107166f;
        if (z2 || u) {
            z = true;
        }
        ((C58052j1) u0Var).setValue(Boolean.valueOf(z));
        Log.m105924i("Finder.BoxCommon", "[commentHeightChange] setBoxEnableByFlag change");
        ((C0702z0) bVar.mo71262a(C0702z0.class)).f1686w.postValue(null);
    }
}
