package aq1;

import com.tencent.p014mm.autogen.mmdata.rpt.operation_trends_stackStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: aq1.b */
public final class C26818b {
    /* renamed from: a */
    public final void mo53791a(C26817a aVar) {
        C87412m.m108594g(aVar, "reportStruct");
        Log.m105924i("TrendsReporter", "#report " + aVar);
        operation_trends_stackStruct operation_trends_stackstruct = new operation_trends_stackStruct();
        operation_trends_stackstruct.f74736d = aVar.f74585a;
        operation_trends_stackstruct.f74737e = aVar.f74586b;
        operation_trends_stackstruct.f74738f = (long) aVar.f74587c;
        operation_trends_stackstruct.f74739g = operation_trends_stackstruct.mo86045b("sceneName", aVar.f74588d, true);
        operation_trends_stackstruct.f74740h = operation_trends_stackstruct.mo86045b("sceneDesc", aVar.f74589e, true);
        operation_trends_stackstruct.f74741i = operation_trends_stackstruct.mo86045b("operatorType", aVar.f74590f, true);
        operation_trends_stackstruct.f74742j = (long) aVar.f74591g;
        operation_trends_stackstruct.f74743k = aVar.f74592h;
        operation_trends_stackstruct.f74744l = aVar.f74593i;
        operation_trends_stackstruct.f74745m = aVar.f74594j;
        operation_trends_stackstruct.f74746n = aVar.f74595k;
        operation_trends_stackstruct.f74747o = aVar.f74596l;
        operation_trends_stackstruct.f74748p = aVar.f74597m;
        operation_trends_stackstruct.f74749q = aVar.f74598n;
        operation_trends_stackstruct.f74750r = aVar.f74599o;
        operation_trends_stackstruct.f74751s = aVar.f74600p;
        operation_trends_stackstruct.f74752t = aVar.f74601q;
        operation_trends_stackstruct.f74753u = aVar.f74602r;
        operation_trends_stackstruct.f74754v = aVar.f74603s;
        operation_trends_stackstruct.f74755w = aVar.f74604t;
        operation_trends_stackstruct.f74756x = (long) aVar.f74605u;
        operation_trends_stackstruct.f74757y = aVar.f74606v;
        operation_trends_stackstruct.f74758z = aVar.f74607w;
        operation_trends_stackstruct.f74719A = aVar.f74608x;
        operation_trends_stackstruct.f74720B = aVar.f74609y;
        operation_trends_stackstruct.f74721C = aVar.f74610z;
        operation_trends_stackstruct.f74722D = aVar.f74571A;
        operation_trends_stackstruct.f74723E = aVar.f74572B;
        operation_trends_stackstruct.f74724F = aVar.f74573C;
        operation_trends_stackstruct.f74725G = aVar.f74574D;
        operation_trends_stackstruct.f74726H = aVar.f74575E;
        operation_trends_stackstruct.f74727I = (long) aVar.f74576F;
        operation_trends_stackstruct.f74728J = (long) aVar.f74577G;
        operation_trends_stackstruct.f74729K = (long) aVar.f74578H;
        operation_trends_stackstruct.f74730L = operation_trends_stackstruct.mo86045b("stillRunning", aVar.f74579I, true);
        operation_trends_stackstruct.f74731M = (long) aVar.f74580J;
        operation_trends_stackstruct.f74732N = operation_trends_stackstruct.mo86045b("anythingElse", aVar.f74581K, true);
        operation_trends_stackstruct.f74733O = operation_trends_stackstruct.mo86045b("traceHistoriesBeforeEnter", aVar.f74582L, true);
        operation_trends_stackstruct.f74734P = operation_trends_stackstruct.mo86045b("traceHistoriesAfterEnter", aVar.f74583M, true);
        operation_trends_stackstruct.f74735Q = aVar.f74584N;
        operation_trends_stackstruct.mo86054n();
    }
}
