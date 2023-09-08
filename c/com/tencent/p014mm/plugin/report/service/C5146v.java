package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.report.service.v */
public final class C5146v<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public static final C5146v<_Ret, _Var> f20536a = new C5146v<>();

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (cVar.f256794b == 0 && cVar.f256793a == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("upload succ. size:");
            C5139t tVar = C5139t.f20522a;
            sb.append(tVar.mo6107d().f132225d.size());
            Log.m105924i("MicroMsg.UserDataOperationReporter", sb.toString());
            tVar.mo6107d().f132225d = new LinkedList<>();
            tVar.mo6108f();
        } else {
            Log.m105920e("MicroMsg.UserDataOperationReporter", "upload err.");
        }
        return C13598b0.f38549a;
    }
}
